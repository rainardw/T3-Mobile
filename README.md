#  Tugas Praktikum 3: Form Identitas Mahasiswa

**Nama:** [KURNIA DWI SURYA]  
**NIM:** [F1D02310013]  
**Mata Kuliah:** Pemrograman Mobile  
**Tanggal:** 21 April 2026  

---

##  Deskripsi Proyek
Aplikasi Android sederhana yang dirancang untuk menampilkan identitas mahasiswa. Aplikasi ini menerapkan konsep dasar UI Android menggunakan XML Layout, widget input standar, validasi form, serta pembaruan tampilan secara dinamis menggunakan Kotlin.

---

## Fitur Utama
- ✅ Kombinasi `LinearLayout` (Vertical & Horizontal) dalam satu hierarki UI
- ✅ Widget Input: `EditText`, `RadioGroup` + `RadioButton`, `CheckBox`, `Button`
- ✅ Validasi Real-time: Cek nama kosong & jenis kelamin wajib dipilih
- ✅ Tampilan Hasil Dinamis: Output muncul langsung di `TextView` tanpa pindah Activity
- ✅ Feedback Error: Menggunakan `EditText.error` (ikon ⚠️) dan `Toast`
-  Tema **Pinky** terintegrasi melalui `colors.xml` & `themes.xml`

---

## 🛠️ Penjelasan Kode & Implementasi

### 📐 1. Layout (`activity_main.xml`)
- **Root Layout:** `LinearLayout` dengan `orientation="vertical"`
- **Layout Bersarang:** 
  - `RadioGroup` menggunakan `orientation="horizontal"` untuk menyusun opsi gender sejajar
  - `LinearLayout` horizontal khusus untuk menata `CheckBox` hobi
- **Pemenuhan Syarat:** Menggunakan minimal 2 jenis layout berbeda sesuai ketentuan tugas
- **Atribut Penting:** Setiap widget diberi `android:id` unik agar dapat diakses dari kode Kotlin

### ⚙️ 2. Logika Kotlin (`MainActivity.kt`)
| Komponen | Fungsionalitas |
|----------|----------------|
| `findViewById<T>()` | Menghubungkan widget XML ke variabel Kotlin |
| `setOnClickListener` | Menangani event klik tombol "Tampilkan" |
| `text.toString().trim()` | Mengambil input nama & menghapus spasi berlebih |
| `if (isEmpty()) { error = "..."; return@setOnClickListener }` | Validasi & penghentian eksekusi jika input tidak valid |
| `checkedRadioButtonId` | Mendeteksi ID radio button yang dipilih (`-1` = belum dipilih) |
| `mutableListOf() + isChecked` | Mengumpulkan hobi yang dicentang ke dalam array |
| `joinToString(", ")` | Mengubah list hobi menjadi string rapi (dipisahkan koma) |
| `buildString { append(...) }` | Menyusun format output secara efisien |
| `tvHasil.text = hasil` | Memperbarui UI secara dinamis |

### 🎨 3. Theming (`colors.xml` & `themes.xml`)
- **`colors.xml`**: Mendefinisikan palet warna pink pastel (`pink_light`, `pink_pastel`, `pink_accent`, `pink_dark`)
- **`themes.xml`**: 
  - Mengoverride `colorPrimary` & `colorSecondary` agar tombol & widget otomatis mengikuti tema
  - `android:statusBarColor` disetel ke `pink_accent` untuk konsistensi visual
  - Menggunakan parent `Theme.MaterialComponents.DayNight.DarkActionBar` untuk kompatibilitas stabil tanpa error `AAPT`

---

## 📸 Screenshot Aplikasi

<table>
  <tr>
    <td><img src="<img width="247" height="559" alt="image" src="https://github.com/user-attachments/assets/9cb1d288-664e-4110-a583-8f3c99560007" />" width="250" alt="Tampilan Form Awal"></td>
    <td><img src="<img width="252" height="560" alt="image" src="https://github.com/user-attachments/assets/a308a139-ec72-47cb-8843-76c904004b35" />" width="250" alt="Hasil Setelah Klik"></td>
    <td><img src="<img width="247" height="559" alt="image" src="https://github.com/user-attachments/assets/099aed64-2f72-4e35-961e-0e3cc4888106" />" width="250" alt="Validasi Error"></td>
    <td><img src="<img width="252" height="561" alt="image" src="https://github.com/user-attachments/assets/32f2c8cc-3082-4cf9-9908-6a2ab253ea68" />
" />" width="250" alt="Validasi Error"></td>
  </tr>
  <tr>
    <td align="center"><b>Form Awal</b></td>
    <td align="center"><b>Hasil Sukses</b></td>
    <td align="center"><b>Validasi Error</b></td>
  </tr>
</table>
---
-made by rann
