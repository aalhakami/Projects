# DFIR CASES
### CASE 01: Skimming device
Evidence Item: 1_Skimmer_mSD 

![image](https://user-images.githubusercontent.com/99384019/229348961-116bf320-c4da-40a8-99c0-f1a8422358d4.png)


On April 9th, 2021, at 16:25, a “Skimming” device was discovered on the ATM of the Swiss Post location in Avenue Piccard, 1015 Lausanne, Switzerland. 

The device was discovered when it malfunctioned and detached as a customer withdrew his credit card (CC) from the machine. According to security cameras, it was possible to establish that the device was placed shortly before at 16:20. 

The digital forensic unit of the police collected the device and created a physical image of a micro-SD card found inside.  The image is provided for download here: 

Filename: 1_Skimmer_mSD.zip <br>
SHA2-256: 1c5ad394daa49573f4088a31fb7f6a3f537dbcd092fdfd5abc8b572ebedbc262 <br>
We suspect that data from the CC are recorded in the files present on the memory card. 

For reference, the CC number of the client is also provided: <br>
CC Number: 4334 2250 2436 4939

### CASE 02: Samsung smartphone
Evidence Item: 3_Smartphone_Samsung_S10 

Based on information obtained from the forensic analysis of the previous evidence, it was possible to identify an individual of interest who was arrested in Geneva on of April 20th, 2021 at 18:30 while trying to board a plane using a ticket bought with a stolen CC. 

Geneva Airport Police seized his phone and extracted a Full Filesystem copy on April 21st, 2021, which is available here. 

Preliminary analysis of the smartphone highlighted encoded SMS exchanges which might be of particular interest. 

Filename: 3_Samsung GSM_SM-G973F_DS Galaxy S10.zip <br>
SHA2-256: 54877505f1b4eb26c4cb6b43fd6338424660c207e678b773044a4a79d6e374b7


REFERENCE:https://dfrws.org/dfrws-2021-challenge/
