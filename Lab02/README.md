# Lab 02 – ListView & RecyclerView

## Cấu trúc

```
Lab02/
└── app/src/main/
    ├── java/vn/edu/uit/lab02/
    │   ├── MainActivity.kt          ← menu điều hướng
    │   ├── lab1/Lab1Activity.kt     ← ListView mảng định sẵn
    │   ├── lab2/Lab2Activity.kt     ← ArrayList + ListView (thêm/xóa)
    │   ├── lab3/
    │   │   ├── Employee.kt          ← abstract class
    │   │   ├── EmployeeFullTime.kt  ← override tinhLuong() = 500.0
    │   │   ├── EmployeePartTime.kt  ← override tinhLuong() = 150.0
    │   │   └── Lab3Activity.kt
    │   ├── lab4/
    │   │   ├── Employee.kt          ← data class (id, fullName, isManager)
    │   │   ├── EmployeeAdapter.kt   ← CustomAdapter cho ListView
    │   │   └── Lab4Activity.kt
    │   └── lab7/
    │       ├── EmployeeRvAdapter.kt ← RecyclerView.Adapter
    │       └── Lab7Activity.kt
    └── res/
        ├── layout/
        │   ├── activity_lab1.xml
        │   ├── activity_lab2.xml
        │   ├── activity_lab3.xml
        │   ├── activity_lab4.xml
        │   ├── activity_lab7.xml
        │   └── item_employee.xml    ← dùng chung cho Lab4 và Lab7
        └── values/
            ├── strings.xml
            ├── colors.xml
            └── themes.xml
```

## Bài thực hành

| Lab | Nội dung | File chính |
|-----|----------|------------|
| Lab 1 | ListView với mảng dữ liệu định sẵn | `lab1/Lab1Activity.kt` |
| Lab 2 | ArrayList + ListView (thêm/xóa bằng long click) | `lab2/Lab2Activity.kt` |
| Lab 3 | ListView với Object (Employee FullTime/PartTime) | `lab3/` |
| Lab 4 | CustomAdapter cho ListView (Manager/Staff + màu xen kẽ) | `lab4/` |
| Lab 5 | GridView + Spinner *(tự làm)* | – |
| Lab 7 | RecyclerView – làm lại Lab 4 | `lab7/` |

## Lưu ý

- **Lab 4 & Lab 7**: cần thêm file `ic_manager.png` vào thư mục `res/drawable/`  
  (icon người quản lý theo đề bài). Hiện tại dùng placeholder, app sẽ crash nếu thiếu file này.

- **Lab 5** (GridView + Spinner) không có trong repo — cần download 4 ảnh thumbnail  
  và tự xây dựng `DishAdapter`, `ThumbnailAdapter` theo hướng dẫn trong PDF.
