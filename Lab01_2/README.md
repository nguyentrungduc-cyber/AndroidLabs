# Lab 01.2 – Các Layout Cơ Bản

## Mục tiêu
Nắm vững cách sử dụng 5 loại layout cơ bản trong Android:
`FrameLayout` · `LinearLayout` · `TableLayout` · `RelativeLayout` · `ConstraintLayout`

---

## Cấu trúc project

```
app/src/main/
├── java/vn/edu/uit/lab01_2/
│   ├── MainActivity.kt          ← Menu chọn bài
│   ├── lab1a/
│   │   └── Lab1aActivity.kt     ← LinearLayout bằng code (Kotlin)
│   ├── lab1b/
│   │   └── Lab1bActivity.kt     ← LinearLayout XML (layout màu lồng nhau)
│   ├── lab2/
│   │   └── Lab2Activity.kt      ← RelativeLayout – Sign In screen
│   └── lab3/
│       └── Lab3Activity.kt      ← ConstraintLayout – làm lại Lab 2
└── res/
    ├── layout/
    │   ├── activity_lab1b.xml   ← LinearLayout lồng nhau
    │   ├── activity_lab2.xml    ← RelativeLayout Sign In
    │   └── activity_lab3.xml    ← ConstraintLayout Sign In
    └── values/
        ├── colors.xml           ← color0..color7 theo tài liệu
        ├── strings.xml
        ├── dimens.xml
        └── themes.xml
```

## Bài thực hành

| # | Activity | Nội dung |
|---|----------|----------|
| 1a | `Lab1aActivity` | Khởi tạo LinearLayout bằng Kotlin code |
| 1b | `Lab1bActivity` | LinearLayout XML – layout ô màu lồng nhau |
| 2  | `Lab2Activity`  | RelativeLayout – màn hình Sign In |
| 3  | `Lab3Activity`  | ConstraintLayout – làm lại Sign In |

## Ghi chú

- `activity_lab1b.xml` đã giải sẵn phần **bổ sung** (thêm cột cyan/magenta/white theo hình yêu cầu trang 18)
- `Lab2Activity` + `Lab3Activity` dùng **ViewBinding** (`ActivityLab2Binding`, `ActivityLab3Binding`)
- `FrameLayout` và `TableLayout` được giới thiệu trong phần lý thuyết, không có bài thực hành riêng trong tài liệu
