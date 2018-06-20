# Generics - Java core

\#Generics

## Generics là gì?

Như đã nói trước đó, **Generics** định dạng một kiểu dữ liệu được **tham số hóa** do đó ta có thể sử dụng một class, 
interface hay method với nhiều kiểu dữ liệu khác nhau. Trước khi sử dụng các class, interface hay method sử dụng generics
thì ta cần khai báo kiểu dữ liệu để sử dụng chúng, việc này giúp code trở nên chặt chẽ hơn, kiểu dữ liệu rõ ràng.

Generics được biểu hiện rõ nhất đó là khi ta sử dụng Collection, từ việc khai báo cho tới việc sử dụng Collection

## Tại sao cần sử dụng Generics

Nhắc về lịch sử một chút, Generics được support bắt đầu từ Java 5, bổ sung tính năng thêm ở Java 7

Vậy thì trước khi Java 5 ra đời, có vấn đề gì đã xảy ra???

Khi ta làm việc với Java 4 và các phiên bản trước đó, class, interface và method chỉ làm việc với một kiểu dữ liệu nhất 
định

Ví dụ: khi ta khai báo một List:

```
List listOfName = new ArrayList(2);
```

`lisstOfName` lưu danh sách tên của các thành viên trong lớp học

```
listOfName.add("Quy");
listOfName.add("Hung");
listOfName.add("Dung");
listOfName.add(new Integer(1));
```

Có gì đó sai sai phải không nào? -\_-

Nếu như dev làm đúng, chỉ add String vào `listOfName` thì chẳng có gì phải bàn, nhưng ... add một kiểu dữ liệu khác String 
vào thì: **Thôi ăn *** rồi!** 

Như vậy không hề có một ràng buộc về kiểu dữ liệu nào cho `listOfName` cả, từ đó, nó có thể gây ra các vấn đề về coding
gây khá nhiều phiền phức

=> vì vậy mà Generics được đưa vào, nó sẽ kiểm tra, phát hiện lỗi sai kiểu dữ liệu ngay tại thời điểm compile giúp dev 
tránh được các lỗi không đáng có





















