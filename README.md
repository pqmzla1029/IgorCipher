# IgorCipher
Works currently for 5 alphabets.
Scaling for multiples of 5 and then general purpose.
It is a codependency of Substitution,Block and transposition ciphers .
The ciphers are integrated to form a chain of dependecies like a blockchain but not the same mechanism.

Steps
An input in masked using a automatically generated key.
Then a Block operation is applied on the input using a predefined (compliant with matrix methods) private key
An inverse key is generated which is sent to the reviever as is.
Then the processed text is passed through a Transposition Mechanism which utilizes a derivative the key originally generated to shuffle the rows
The CT thus obtained will be transfered for decryption.
The Key may be transfered with MD5 or SHA Hashing or using RSA.(Both keys appended)
Thus a total of 1 CT and 2 keys will be transmitted.
The 2 keys(If appended need to be slpit)are obtained on the recievers end.
On the Recievers end the Transposition cipher will be run dependent on the key in order to obtain a string .
This string will be passed on to the Block cipher which will perform matrix multiplication with the key to get the next string.
This String shall be passed throught the substitution cipher in order to attain the original Message.
