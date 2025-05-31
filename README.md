# Kalkulator Pabrik Cetakan Donat Rumahan

Program ini merupakan **aplikasi kalkulator produksi** yang dibuat untuk memenuhi kebutuhan sebuah **pabrik cetakan donat rumahan**. Pabrik tersebut memproduksi dua jenis cetakan donat:
- **Donat dengan lubang** (berbentuk torus)
- **Donat tanpa lubang** (berbentuk bola)

Aplikasi ini menghitung:
- Volume cetakan
- Luas permukaan
- Massa (gram)
- Konversi ke kilogram
- Biaya kirim dalam bentuk rupiah

## 🛠 Struktur Program

Program ini dirancang dengan arsitektur berorientasi objek dan modular, menggunakan `package` berikut:

### 1. `uap.bases`
- **`Shape.java`**: Abstract class sebagai induk bentuk 3D. Menyediakan struktur dasar dan metode `printInfo()`.

### 2. `uap.models`
- **`Torus.java`**: Representasi dari cetakan donat berlubang. Menghitung volume dan luas permukaan torus.
- **`Sphere.java`**: Representasi dari cetakan donat tanpa lubang. Menghitung volume dan luas permukaan bola.

### 3. `uap.interfaces`
Berisi kumpulan interface untuk mendukung desain modular dan memisahkan tanggung jawab:
- `PIRequired`: Mendefinisikan konstanta π (22/7)
- `ThreeDimensional`: Interface untuk bentuk 3D (volume dan permukaan)
- `MassCalculable`: Menghitung massa
- `MassConverter`: Konversi gram ke kilogram
- `ShippingCostCalculator`: Perhitungan biaya kirim

### 4. `uap.mains`
- **`KalkulatorPabrik.java`**: Program utama yang menangani input/output. Menampilkan antarmuka pengguna dan hasil perhitungan.

---

## 💻 Fitur-Fitur Utama
- Input nama dan NIM pengguna
- Perhitungan berbasis input radius torus & bola
- Menggunakan konstanta π = 22/7 dan massa jenis 8 gr/cm³
- Output diformat rapi dengan label yang jelas
- Pembulatan biaya kirim ke atas dan dikalikan Rp2000/kg
- Modular dan dapat dikembangkan lebih lanjut

---

## 🚀 Penutup
Dengan program ini, pabrik dapat menghitung kebutuhan produksi secara efisien dan akurat. Struktur OOP juga memudahkan pengembangan fitur di masa depan seperti integrasi database, GUI, atau fitur cetak laporan.

