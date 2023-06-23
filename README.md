# [FinalProject-MSIB-UmaMusumeDB](https://github.com/pesekcuy/FinalProject-MSIB-UmaMusumeDB/)

Nama: Adi Nugroho
Kelas Alpha

Repositori ini adalah tempat menyimpan file-file untuk tugas akhir program MSIB "Java & Python for Data Science" yang diprakarsai oleh TIA Academy pada semester genap 2022/2023.

Adapun konten dari repositori ini adalah:
- Dataset berupa tiga (3) file `*.csv`
- Dataset berupa file `UmaMusume.xls` yang berisi gabungan dari ketiga file \*.csv di atas
- Hasil dump dari MySQL berupa file `UmaMusumeDB.sql`
- Folder project Maven yaitu `MerdekaFinalProjectUmaMusumeDBAdmin` dan `MerdekaFinalProjectUmaMusumeDBUser`. Ini adalah project untuk menampilkan dataset yang ada.
- File Jupyter Notebook yaitu `UmaMusumeDB.ipynb`. Ini adalah source code untuk mengolah data dengan Exploratory Data Analysis dan Machine Learning.

File-file di atas dibuat dengan asumsi sebagai berikut, jika berbeda maka sesuaikan dengan lingkungan tempat Anda menjalankan kode/database di atas:
- Server database berada di <localhost:3306>
- Username database adalah `root`
- Password database adalah `p353kcuy`
- Nama database/schema adalah `umamusume`

Sebagai petunjuk apa yang bisa Anda lakukan dengan repositori ini, ikuti langkah-langkah berikut:
1. Clone repositori ini.
2. Buat schema di MySQL dengan nama mengikuti asumsi (rekomendasi) dan tetapkan sebagai default schema.
3. Restore SQL dump yang ada di repositori ini.
4. Sesuaikan port, username, password, dan nama schema yang ada di `MerdekaFinalProjectUmaMusumeDBAdmin/src/main/resources/application.properties` dan `MerdekaFinalProjectUmaMusumeDBUser/src/main/resources/application.properties` dengan kredensial (dan jika berbeda, nama schema/database) yang Anda miliki.
5. Untuk project Maven, dapat dijalankan melalui Intellij IDEA.
    1. Setelah menjalankannya, buka <localhost:8080> untuk project `MerdekaFinalProjectUmaMusumeDBUser`, atau <localhost:8081> untuk project `MerdekaFinalProjectUmaMusumeDBAdmin`.
    2. Register dengan nama, email, dan password Anda, setelah itu login.
    3. Untuk mengakses daftar Uma Musume, pilih `Uma Pages` pada bilah navigasi.
    4. Fitur yang bisa diakses berbeda antara project `MerdekaFinalProjectUmaMusumeDBAdmin` dan `MerdekaFinalProjectUmaMusumeDBUser`.
6. File `UmaMusumeDB.ipynb` dibuka dengan Jupyter Notebook. Sesuaikan port, username, password, dan nama schema yang ada di dalamnya sebelum menjalankannya.
