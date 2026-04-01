Pertanyaan Praktikum 1
1. menukar posisi dua elemen yang tidak sesuai urutan agar data menjadi terurut secara ascending dalam proses Bubble Sort.
2. int min = i;
            for(int j=i+1; j<jumData; j++) {
                if(data[j]<data[min]) {
                    min=j;
                }
            }
3. untuk memastikan proses pergeseran elemen ke kanan terus dilakukan selama elemen sebelumnya lebih besar dari nilai yang akan disisipkan, sehingga posisi yang tepat untuk temp dapat ditemukan dalam proses Insertion Sort.
4. untuk membandingkan dan menggeser elemen dalam array, kemudian menyisipkan elemen ke posisi yang sesuai agar data menjadi terurut.

Pertanyaan Praktikum 2
1. a. karena dalam Bubble Sort hanya diperlukan n-1 iterasi untuk memastikan seluruh data terurut, sehingga iterasi terakhir tidak perlu dilakukan.
   b. untuk membatasi perbandingan hanya pada bagian array yang belum terurut, karena setiap iterasi Bubble Sort akan menempatkan satu elemen pada posisi akhirnya.
   c. Perulangan i terjadi sebanyak 49 kali. Tahap Bubble Sort yang ditempuh = 49 tahap
2. modifikasi

Pertanyaan 5.3.7
berfungsi untuk mencari indeks mahasiswa dengan nilai IPK paling kecil (minimum) pada bagian array yang belum terurut dalam algoritma Selection Sort.
