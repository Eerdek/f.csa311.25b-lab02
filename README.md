# Lab02 — Shapes + Renderer (Polymorphism)

## 1. Зорилго
Энэ лабораторийн ажлын хүрээнд `Shape` интерфэйс ашиглан дүрсүүдийн (Circle, Rectangle, Square) талбайг нэг стандарт API-гаар бодож, `Renderer` классаар хэвлэх байдлаар OOP-ийн **polymorphism** болон **abstraction** ойлголтыг хэрэгжүүлэв.

## 2. Хийсэн ажлууд
- Maven төслийн бүтцийг ашиглан Java эх кодыг `src/main/java` дотор зохион байгуулсан.
- `Shape` интерфэйс үүсгэж, бүх дүрсүүд нэг ижил `getArea()` method-оор талбай боддог болгосон.
- `Circle`, `Rectangle`, `Square` классуудыг `Shape`-ийг `implements` хийлгэж, тус бүрийн `getArea()`-г бодитоор хэрэгжүүлсэн.
- `Renderer` классыг `Rectangle`-д хатуу хамааралтай байсныг засч, `Shape` төрлийн объект авч ажилладаг болгож өөрчилсөн.
- Дүрсний нэрийг илүү ойлгомжтой хэвлэхийн тулд `Shape` интерфэйс дээр `getName()` method нэмсэн.
- `Main` класс дээр нэг дүрс үүсгээд (`Shape shape = new Circle(2)` гэх мэт) `Renderer`-ээр хэвлэн ажиллуулсан.

## 3. Гол санаа (OOP)
Энэ лабораторид `Renderer` нь тодорхой нэг `Rectangle`-г биш, харин **Shape интерфэйсийг** мэддэгээр зохион байгуулагдсан.  
Ингэснээр `Renderer`-ийг өөрчлөхгүйгээр шинэ дүрс (жишээ нь `Triangle`) нэмж болох ба зөвхөн `Shape`-ийг хэрэгжүүлээд л системд ажиллана.

## 4. Төслийн бүтэц
java/
├─ pom.xml
└─ src/main/java/edu/cmu/cs/cs214/lab02/
├─ Main.java
├─ Renderer.java
└─ shapes/
├─ Shape.java
├─ Circle.java
├─ Rectangle.java
└─ Square.java


## 5. Сая хийсэн өөрчлөлтийн товч (Changelog)
- `Renderer` классыг `Rectangle`-оос салгаж `Shape` ашигладаг болгосон (polymorphism).
- `Shape` интерфэйс дээр `getArea()` method-ийг тодорхойлсон.
- Нэмэлтээр `getName()` method нэмж, хэвлэх үед дүрсний нэрийг зөв гаргадаг болгосон.
- `Circle`, `Square`, `Rectangle` классуудыг `implements Shape` болгож нэг стандарт API-д оруулсан.
- `Main` дээр `Shape` төрлөөр объект үүсгэж, `Renderer`-ээр хэвлэдэг болгосон.

## 6. Build хийх
`pom.xml` байрласан `java/` хавтас дотор ажиллуулна:

```powershell
mvn clean package

7. Ажиллуулах (Run)

7.1 Maven exec plugin ашиглах
mvn exec:java "-Dexec.mainClass=edu.cmu.cs.cs214.lab02.Main"
7.2 Classpath-аар шууд ажиллуулах
Эхлээд compile хийсэн байх шаардлагатай (mvn clean package).

java -cp target\classes edu.cmu.cs.cs214.lab02.Main
8. Жишээ үр дүн (Sample Output)
Жишээ нь Main дээр new Circle(2) гэж өгсөн үед:

Circle printed
Its area is 12.566370614359172
9. Ашигласан хэрэгсэл, орчин
OS: Windows 11

JDK: Java 21

Build Tool: Apache Maven

IDE: Visual Studio Code


Хэрвээ хүсвэл би энэ README-г чинь бүр “даалгавараар үнэлэгдэх” маягаар:
- **зорилго → хэрэгжилт → дүгнэлт**
- **кодын тайлбар** (Renderer яагаад Shape авдаг вэ)
- **screenshot section** (mvn output, VS Code structure)

гээд илүү академик болгож ч бас өгч чадна.
