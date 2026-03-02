package com.example.a17_assement.ViewModel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a17_assement.Model.Data
import com.example.a17_assement.databinding.ActivityAddScreenBinding
import com.example.a17_assement.databinding.ItemListBinding

class EmployeeAdapter(
    private var list: List<Data>,
    private val onEdit: (Data) -> Unit,
    private val onDelete: (Data) -> Unit,
    private val onItem: (Data) -> Unit
) : RecyclerView.Adapter<EmployeeAdapter.viewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): viewHolder {

        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return viewHolder(binding)

    }

    override fun onBindViewHolder(
        holder: viewHolder,
        position: Int
    ) {
        val data = list[position]
        holder.binding.tvEmployeeName.text = data.name
        holder.binding.tvPosition.text = data.position
        holder.binding.tvSalary.text = data.salary.toString()

        holder.binding.ivEdit.setOnClickListener {
            onEdit(data)
        }
        holder.binding.ivDelete.setOnClickListener {
            onDelete(data)
        }
        holder.binding.root.setOnClickListener {
            onItem(data)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class viewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)
}