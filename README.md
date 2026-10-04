# 📱 Android Labs – Phát Triển Ứng Dụng Trên Thiết Bị Di Động

Repo chứa toàn bộ bài thực hành môn **Phát Triển Ứng Dụng Trên Thiết Bị Di Động**.  
Ngôn ngữ: **Kotlin** | Min SDK: **24** | Target SDK: **34**

---

## 📁 Cấu trúc repo

```
AndroidLabs/
└── Lab01_2/                              ← Các layout cơ bản
    ├── gradlew / gradlew.bat              ← Gradle wrapper (Gradle 8.7)
    ├── gradle/wrapper/
    ├── build.gradle.kts / settings.gradle.kts
    └── app/src/main/
        ├── AndroidManifest.xml
        ├── java/vn/edu/uit/lab01_2/
        │   ├── MainActivity.kt            ← Menu chọn bài
        │   ├── lab1a/Lab1aActivity.kt     ← LinearLayout bằng Kotlin code
        │   ├── lab1b/Lab1bActivity.kt     ← LinearLayout XML (ô màu lồng nhau)
        │   ├── lab2/Lab2Activity.kt       ← RelativeLayout – Sign In
        │   └── lab3/Lab3Activity.kt       ← ConstraintLayout – làm lại Sign In
        └── res/
            ├── layout/                    ← activity_lab1b / lab2 / lab3.xml
            ├── values/                    ← colors, strings, dimens, themes
            ├── drawable/                  ← nền + foreground launcher icon
            └── mipmap-*/                  ← launcher icon các mật độ màn hình
```

---

## 🗂️ Danh sách Lab

| Lab | Chủ đề | Trạng thái |
|-----|--------|------------|
| Lab01_2 | Các layout cơ bản | ✅ Hoàn thành |

### Chi tiết Lab01_2

| # | Activity | Nội dung |
|---|----------|----------|
| 1a | `Lab1aActivity` | Khởi tạo LinearLayout bằng Kotlin code |
| 1b | `Lab1bActivity` | LinearLayout XML – layout ô màu lồng nhau |
| 2  | `Lab2Activity`  | RelativeLayout – màn hình Sign In |
| 3  | `Lab3Activity`  | ConstraintLayout – làm lại Sign In |

---

## ⚙️ Yêu cầu

- Android Studio Hedgehog (2023.1.1) trở lên
- JDK 17+
- Kotlin 1.9+
- **Gradle JDK: 17 hoặc 21** (Settings → Build Tools → Gradle → Gradle JDK). JDK 25 không chạy được với Gradle 8.7

## 🚀 Cách chạy

1. Mở Android Studio
2. **File → Open** → chọn thư mục của lab cần chạy (vd: `Lab01_2/`)
3. Đợi Gradle sync xong → **Run**
