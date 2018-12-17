//reverse function 

//klik untuk pasien////
(

function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabelcok');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');
var f7 = document.getElementById('g');
var f8 = document.getElementById('h');
var f9 = document.getElementById('i');
var f10 = document.getElementById('j');
var f11 = document.getElementById('k');
var f12 = document.getElementById('l');
var f13 = document.getElementById('m');
var f14 = document.getElementById('n');

f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;
f7.value = cells[6].innerHTML;
f8.value = cells[7].innerHTML;
f9.value = cells[8].innerHTML;
f10.value = cells[9].innerHTML;
f11.value = cells[10].innerHTML;
f12.value = cells[11].innerHTML;
f13.value = cells[12].innerHTML;
f14.value = cells[13].innerHTML;

//var field = document.getElementById('e');
//  var ciao = field.value.reverse();


$("#id_pasien").val(document.getElementById('a').value);
$("#nok").val(document.getElementById('b').value);
$("#nama").val(document.getElementById ('c').value);
$("#alamat").val(document.getElementById ('d').value);
//$("#tgl_lhr").val(document.getElementById ('e').value);
$("#tgl_lhr").val(document.getElementById ('e').value);
$("#umur").val(document.getElementById ('f').value);
$("#telp").val(document.getElementById ('g').value);
$("#kecamatan").val(document.getElementById ('h').value);
$("#n_ortu").val(document.getElementById ('i').value);
$("#alamat_ortu").val(document.getElementById ('j').value);
$("#pekerjaan").val(document.getElementById ('k').value);
$("#agama").val(document.getElementById ('l').value);
$("#stat_nikah").val(document.getElementById ('m').value);
$("#jekel").val(document.getElementById ('n').value);
};
}
})
();



(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabelmod');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');
var f7 = document.getElementById('g');
var f8 = document.getElementById('h');
var f9 = document.getElementById('i');
var f10 = document.getElementById('j');
var f11 = document.getElementById('k');
var f12 = document.getElementById('l');
var f13 = document.getElementById('m');
var f14 = document.getElementById('n');

f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;
f7.value = cells[6].innerHTML;
f8.value = cells[7].innerHTML;
f9.value = cells[8].innerHTML;
f10.value = cells[9].innerHTML;
f11.value = cells[10].innerHTML;
f12.value = cells[11].innerHTML;
f13.value = cells[12].innerHTML;
f14.value = cells[13].innerHTML;
$("#id_pasien").val(document.getElementById('a').value);
$("#nok").val(document.getElementById('b').value);
$("#nama").val(document.getElementById ('c').value);
$("#alamat").val(document.getElementById ('d').value);
$("#tgl_lhr").val(document.getElementById ('e').value);
$("#umur").val(document.getElementById ('f').value);
$("#telp").val(document.getElementById ('g').value);
$("#kecamatan").val(document.getElementById ('h').value);
$("#n_ortu").val(document.getElementById ('i').value);
$("#alamat_ortu").val(document.getElementById ('j').value);
$("#agama").val(document.getElementById ('l').value);
$("#stat_nikah").val(document.getElementById ('m').value);
$("#jekel").val(document.getElementById ('n').value);

};
}
})
();



//klik untuk rawat jalan//////
(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabelrj');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');
var f7 = document.getElementById('g');
var f8 = document.getElementById('h');
var f9 = document.getElementById('i');
var f10 = document.getElementById('j');
var f11 = document.getElementById('k');
var f12 = document.getElementById('l');
var f13 = document.getElementById('m');
var f14 = document.getElementById('n');
f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;
f7.value = cells[6].innerHTML;
f8.value = cells[7].innerHTML;
f9.value = cells[8].innerHTML;
f10.value = cells[9].innerHTML;
f11.value = cells[10].innerHTML;
f12.value = cells[11].innerHTML;
f13.value = cells[12].innerHTML;
f14.value = cells[13].innerHTML;

$("#id_rawat_jalan").val(document.getElementById('a').value);
$("#id_pasien").val(document.getElementById('b').value);
$("#nok").val(document.getElementById ('c').value);
$("#nama").val(document.getElementById ('d').value);
$("#alamat").val(document.getElementById ('e').value);
$("#tgl_berobat").val(document.getElementById ('f').value);
$("#Klinik").val(document.getElementById ('g').value);
$("#check").val(document.getElementById ('h').value);
$("#bayar").val(document.getElementById ('i').value);
$("#dokter").val(document.getElementById ('j').value);
$("#riwayat_penyakit").val(document.getElementById ('k').value);
$("#anamnesia").val(document.getElementById ('l').value);
$("#diagnosa").val(document.getElementById ('m').value);
$("#terapi").val(document.getElementById ('n').value);
};
}
})
();


//klik untuk dokter
(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabeldok');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
$("#id_dokter").val(document.getElementById('a').value);
$("#Kode").val(document.getElementById('b').value);
$("#nama").val(document.getElementById ('c').value);
$("#Bidang").val(document.getElementById ('d').value);
};
}
})
();

//klik untuk modal dokter (rwat jalan)
(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabelmodok');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('b');
f1.value = cells[1].innerHTML;
var f2 = document.getElementById('c');
f2.value = cells[2].innerHTML;
$("#dokter").val(document.getElementById('b').value);
$("#nama_dokter").val(document.getElementById('c').value);
};
}
})
();



//klik untuk jadwal////
(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('modok');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
$("#id_dokter").val(document.getElementById('a').value);
$("#nama").val(document.getElementById('c').value);
};
}
})
();

//klik untuk modal diagnosa (rwat jalan)
(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabdiag');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
$("#id_diagnosa").val(document.getElementById('a').value);
$("#nama_penyakit").val(document.getElementById('c').value);
};
}
})
();

//klik untuk tbl obat
(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabelobat');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');
f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;
$("#id_obat").val(document.getElementById('a').value);
$("#referensi").val(document.getElementById('b').value);
$("#nama_obat").val(document.getElementById('c').value);
$("#id_rawat_jalan").val(document.getElementById('d').value);
$("#nama_pasien").val(document.getElementById('e').value);
$("#no_ktp").val(document.getElementById('f').value);
};
}
})
();

//klik untuk tbl obat
(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabeldiag');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');

f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;

$("#id_diagnosa").val(document.getElementById('a').value);
$("#referensi").val(document.getElementById('b').value);
$("#nama_penyakit").val(document.getElementById('c').value);
};
}
})
();

//klik untuk modal tbl rawat jalan
(function() 
{
if (window.addEventListener)
{
window.addEventListener('load', run, false);
} 
else if (window.attachEvent)
{
window.attachEvent('onload', run);
}
function run() 
{
var t = document.getElementById('tabelmodarkon');
t.onclick = function (event) {
event = event || window.event; //IE8
var target = event.target || event.srcElement;
while (target && target.nodeName !== 'TR') { // find TR
target = target.parentElement;
}
var cells = target.cells; //cell collection - https://developer.mozilla.org/en-US/docs/Web/API/HTMLTableRowElement
if (!cells.length || target.parentNode.nodeName === 'THEAD') {
return;
}
var f1 = document.getElementById('a');
var f2 = document.getElementById('b');
var f3 = document.getElementById('c');
var f4 = document.getElementById('d');
var f5 = document.getElementById('e');
var f6 = document.getElementById('f');

f1.value = cells[0].innerHTML;
f2.value = cells[1].innerHTML;
f3.value = cells[2].innerHTML;
f4.value = cells[3].innerHTML;
f5.value = cells[4].innerHTML;
f6.value = cells[5].innerHTML;

$("#id_rawat_jalan").val(document.getElementById('a').value);
$("#nama_pasien").val(document.getElementById('d').value);
$("#no_ktp").val(document.getElementById('c').value);
};
}
})
();