package vn.edu.uit.lab02.lab7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vn.edu.uit.lab02.R
import vn.edu.uit.lab02.lab4.Employee

class EmployeeRvAdapter(
    private val employees: List<Employee>
) : RecyclerView.Adapter<EmployeeRvAdapter.ViewHolder>() {

    // ViewHolder: tái sử dụng view, tránh findViewById nhiều lần
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvFullName: TextView    = view.findViewById(R.id.item_employee_tv_fullname)
        val tvPosition: TextView    = view.findViewById(R.id.item_employee_tv_position)
        val ivManager: ImageView    = view.findViewById(R.id.item_employee_iv_manager)
        val llParent: LinearLayout  = view.findViewById(R.id.item_employee_ll_parent)
    }

    // onCreateViewHolder: inflate layout khi chưa có view để tái sử dụng
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_employee, parent, false)
        return ViewHolder(view)
    }

    // onBindViewHolder: gán dữ liệu vào view tại vị trí position
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val employee = employees[position]

        holder.tvFullName.text = employee.fullName

        if (employee.isManager) {
            holder.ivManager.visibility  = View.VISIBLE
            holder.tvPosition.visibility = View.GONE
        } else {
            holder.ivManager.visibility  = View.GONE
            holder.tvPosition.visibility = View.VISIBLE
            holder.tvPosition.setText(R.string.staff)
        }

        holder.llParent.setBackgroundResource(
            if (position % 2 == 0) R.color.white else R.color.light_blue
        )
    }

    override fun getItemCount(): Int = employees.size
}
