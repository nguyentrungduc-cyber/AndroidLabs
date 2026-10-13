package vn.edu.uit.lab02.lab4

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import vn.edu.uit.lab02.R

class EmployeeAdapter(
    private val context: Activity,
    layoutId: Int,
    private val employees: List<Employee>
) : ArrayAdapter<Employee>(context, layoutId, employees) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Tái sử dụng view nếu có (View Recycling)
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_employee, parent, false)

        val employee = employees[position]

        val tvFullName = view.findViewById<TextView>(R.id.item_employee_tv_fullname)
        val tvPosition = view.findViewById<TextView>(R.id.item_employee_tv_position)
        val ivManager  = view.findViewById<ImageView>(R.id.item_employee_iv_manager)
        val llParent   = view.findViewById<LinearLayout>(R.id.item_employee_ll_parent)

        // Set tên nhân viên
        tvFullName.text = employee.fullName.ifEmpty { "" }

        // Manager → hiện icon | Staff → hiện chữ "Staff"
        if (employee.isManager) {
            ivManager.visibility  = View.VISIBLE
            tvPosition.visibility = View.GONE
        } else {
            ivManager.visibility  = View.GONE
            tvPosition.visibility = View.VISIBLE
            tvPosition.text       = context.getString(R.string.staff)
        }

        // Màu nền xen kẽ giữa các dòng
        llParent.setBackgroundResource(
            if (position % 2 == 0) R.color.white else R.color.light_blue
        )

        return view
    }
}
