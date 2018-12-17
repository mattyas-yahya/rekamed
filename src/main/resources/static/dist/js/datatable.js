//$(document).ready( function () {
//var table = $('#employeesTable').DataTable({
//"sAjaxSource": "/employees",
//"sAjaxDataProp": "",
//"order": [[ 0, "asc" ]],
//"aoColumns": [
//{ "mData": "id"},
//{ "mData": "name" },
//{ "mData": "lastName" },
//{ "mData": "email" },
//{ "mData": "phone" },
//{ "mData": "active" }
//]
//});
//});

$(document).ready( function ()
{
var table = $('#tabelcok').DataTable({
"sAjaxSource": "/pasienAll",
"scrollY":"200px",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_pasien"},
{ "mData": "nok" },
{ "mData": "nama" },
{ "mData": "alamat" },
{ "mData": "tgl_lhr" },
{ "mData": "umur"},
{ "mData": "telp" },
{ "mData": "kecamatan" },
{ "mData": "n_ortu" },
{ "mData": "alamat_ortu"},
{ "mData": "pekerjaan"},
{ "mData": "agama"},
{ "mData": "stat_nikah"},
{ "mData": "jekel" }
]
});
});


$(document).ready( function ()
{
var tablex = $('#tabelrj').DataTable({
"sAjaxSource": "/rawat_jalan_All",
"scrollY":"200px",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_rawat_jalan"},    
{ "mData": "id_pasien.id_pasien"},
{ "mData": "nok" },
{ "mData": "nama" },
{ "mData": "alamat" },
{ "mData": "tgl_berobat" },
{ "mData": "klinik" },
{ "mData": "checked" },
{ "mData": "bayar"},
{ "mData": "id_dokter.id_dokter"},
{ "mData": "nama_dokter"},
{ "mData": "id_diagnosa.id_diagnosa"},
{ "mData": "nama_penyakit"},
{ "mData": "riwayat_penyakit"},
{ "mData": "anamnesia"},
{ "mData": "terapi"}
]
});
});



$(document).ready( function ()
{
var table = $('#tabelmod').DataTable({
"sAjaxSource": "/pasienAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_pasien"},
{ "mData": "nok" },
{ "mData": "nama" },
{ "mData": "alamat" },
{ "mData": "tgl_lhr" },
{ "mData": "umur"},
{ "mData": "telp" },
{ "mData": "kecamatan" },
{ "mData": "n_ortu" },
{ "mData": "alamat_ortu"},
{ "mData": "pekerjaan"},
{ "mData": "agama"},
{ "mData": "stat_nikah"},
{ "mData": "jekel" }
]
});
});


$(document).ready( function ()
{
var table = $('#tabeldok').DataTable({
"sAjaxSource": "/dokterAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_dokter"},
{ "mData": "kode" },
{ "mData": "nama" },
{ "mData": "bidang" }
]
});
});

//modal dokter
$(document).ready( function ()
{
var table = $('#tabelmodok').DataTable({
"sAjaxSource": "/dokterAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_dokter"},
{ "mData": "kode" },
{ "mData": "nama" },
{ "mData": "bidang" }
]
});
});


//tabel diagnosa
$(document).ready( function ()
{
var table = $('#tabeldiag').DataTable({
"sAjaxSource": "/diagnosaAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_diagnosa"},
{ "mData": "referensi" },
{ "mData": "nama_penyakit" }
]
});
});

//tabel modal diagnosa
$(document).ready( function ()
{
var tablex = $('#tabdiag').DataTable({
"sAjaxSource": "/diagnosaAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_diagnosa"},
{ "mData": "referensi" },
{ "mData": "nama_penyakit" }
]
});
});

//tabel obat
$(document).ready( function ()
{
var tablex = $('#tabelobat').DataTable({
"sAjaxSource": "/obatAll",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_obat"},
{ "mData": "referensi" },
{ "mData": "nama_obat" },
{ "mData": "id_rawat_jalan.id_rawat_jalan"},
{ "mData": "no_ktp" },
{ "mData": "nama_pasien" }
]
});
});


//tabel modal rawat jalan
$(document).ready( function ()
{
var tablex = $('#tabelmodarkon').DataTable({
"sAjaxSource": "/rawat_jalan_All",
"scrollY":"200px",
"scrollX": "200px",
"sAjaxDataProp": "",
"order": [[ 0, "asc" ]],
"aoColumns": [
{ "mData": "id_rawat_jalan"},    
{ "mData": "id_pasien.id_pasien"},
{ "mData": "nok" },
{ "mData": "nama" },
{ "mData": "alamat" },
{ "mData": "tgl_berobat" },
{ "mData": "klinik" },
{ "mData": "checked" },
{ "mData": "bayar"},
{ "mData": "id_dokter.id_dokter"},
{ "mData": "nama_dokter"},
{ "mData": "id_diagnosa.id_diagnosa"},
{ "mData": "nama_penyakit"},
{ "mData": "riwayat_penyakit"},
{ "mData": "anamnesia"},
{ "mData": "terapi"}
]
});
});
////tabel 
//$(document).ready( function ()
//{
//var table = $('#xx').valueOf()({
//"sAjaxSource": "/diagnosaAll",
//"sAjaxDataProp": "",
//"order": [[ 0, "asc" ]],
//"aoColumns": [
//{ "mData": "id_diagnosa"}
//]
//});
//});

