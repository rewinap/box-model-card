let hasil ='';
for (let i = 0; i < 5; i++) {
    for (let j = 0; j <= i; j++) {
        hasil += '* ';
    }
    hasil += '\n';
}

console.log(hasil)
// function segitiga() {
//     let hasil ='';
//     for (let i = 0; i < 5; i++) {
//         for (let j = 0; j <= i; j++) {
//             hasil += '* ';
//         }
//         hasil += '\n';
//     }
//     return hasil;
// }

// console.log(segitiga());