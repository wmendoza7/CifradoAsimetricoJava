**Implementación de Criptosistema de Clave Pública (RSA) en Java usando NetBeans**
**Descripción del proyecto**

Este proyecto demuestra la implementación de un criptosistema de clave pública (RSA) utilizando Java en NetBeans.
El objetivo es mostrar de forma práctica cómo funciona el cifrado y descifrado asimétrico, tal como ocurre en protocolos reales como HTTPS/TLS, donde un cliente cifra un mensaje con la clave pública de un servidor y este lo descifra con su clave privada.

El proyecto aplica los conceptos de:

Criptografía asimétrica

Claves pública / privada

Cifrado RSA

Descifrado RSA

Representación segura de datos en Base64

**¿Qué es un criptosistema de clave pública?**

Es un sistema de cifrado que utiliza dos claves diferentes:

Clave pública → Para cifrar o verificar

Clave privada → Para descifrar o firmar

Su principal ventaja es que permite intercambiar información segura sin haber compartido previamente una clave secreta.

**¿Qué hace este programa?**

Genera un par de claves RSA de 2048 bits.

Muestra el mensaje original.

Cifra el mensaje usando la clave pública.

Muestra el mensaje cifrado en Base64 (formato legible).

Descifra el mensaje usando la clave privada.

Imprime el mensaje descifrado.

Esto reproduce el comportamiento básico del intercambio seguro en HTTPS.

**Requisitos**

NetBeans 12+

JDK 8 o superior (ideal 11 o 17)

No requiere librerías externas (usa solo Java SE)

**Cómo ejecutar el proyecto**

Abrir NetBeans

Crear un Java Application Project

Crear el archivo EjemploRSA.java

Copiar el código anterior

Ejecutar con Run → Run Project
