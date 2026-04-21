<img width="337" height="761" alt="image" src="https://github.com/user-attachments/assets/f3ef5f8b-68c2-4b40-9a41-43a9fe2f1761" />#  Tugas Praktikum 3: Form Identitas Mahasiswa

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

## 📸 Screenshot Aplikasi

<table>
  <tr>
    <td align="center"><b>📝 Form Awal</b></td>
    <td align="center"><b>✅ Hasil Sukses</b></td>
    <td align="center"><b>⚠️ Validasi Error</b></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/d66b7516-2671-4754-9204-faa83c31ea4d" width="200" alt="Form Identitas Mahasiswa - Tampilan Awal"/></td>
    <td><img src="https://github.com/user-attachments/assets/bbf38720-4d9f-4dfd-9b90-f17db655f244" width="200" alt="Hasil Input Berhasil Ditampilkan"/></td>
    <td><img src="https://github.com/user-attachments/assets/e948389c-80d8-4223-bb39-f6953af4d72a" width="200" alt="Validasi Error - Nama Kosong"/></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/96f36f3b-a9d8-45ae-87bc-8be02b56948a" width="200" alt="Hasil dengan Multiple Hobi"/></td>
    <td><img src="https://github.com/user-attachments/assets/be7e1345-48e8-4761-8580-6f89c667dab5" width="200" alt="Validasi Error - Gender Belum Dipilih"/></td>
    <td align="center" valign="middle"><i>danLainlainea</i></td>
  </tr>
</table>

---
-made by rann
