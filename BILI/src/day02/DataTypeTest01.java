package day02;

/*
  关于java中的数据类型
    1.数据类型的作用是什么？
      程序当中有很多数据，每一个数据都是有相关类型的，不同的数据类型占用的空间大小不同
      数据类型的作用是指导JVM在运行程序的时候给改数据分配多大的内存空间。
    2.java中的数据类型包括两种：
      基本数据类型
      引用数据类型
        -类
        -接口
        -数组
    3.关于基本数据类型
      * 基本数据类型包括四大类八小种
        第一类：整数型
          byte short int long
        第二类：浮点型
          float double
        第三类：布尔型
          boolean
        第四类：字符型
          char
    4.字符串"abc"不属于基本数据类型，属于“引用数据类型”，字符属于基本数据类型：
      字符串使用“abc”
      字符使用'a'
    5. 八种基本数据类型各自占用空间大小是多少？
      基本数据类型             占用空间大小【单位：字节】
      --------------------------------
      byte                      1
      short                     2
      int                       4
      long                      8
      float                     4
      double                    8
      boolean                   1
      char                      2
    6.计算机在任何情况下都只能识别二进制。（01）
    【现代的计算机底层采用交流电的方式，接通和断开就两种状态。计算机只识别1或者0，其他不认识】
    7.什么是二进制？
      数据的一种表示形式。十进制表示满十进一原则，二进制表示满二进一原则。
    8.字节（byte）
      1 Byte = 8 bit 【1个字节 = 8个比特位 = 8个二进制位】
      1 KB = 1024Byte
    9.整数型当中的byte类型，占用一个字节，所以byte类型的数据占用8个比特位。那么byte类型的取值范围是什么？
      * 关于java中的数字类型，数字都是有正负之分的，所以在数字的二进制当中有一个二进制被称为“符号位”，
        并且这个“符号位”在所有二进制位的最左边。0便是正数，1表示负数
        byte类型最大值：01111111 2的7次方-1，结果是127
        【
          00000000 00000000 00000000 10000000（二进制）
            减去1结果是：
          00000000 00000000 00000000 01111111（二进制）
        】
        byte类型的最小值：-128【具体的怎么用二进制表示，这个和原码、反码、补码有关】
        byte类型的取值范围：【-128 ~ 127】 表示256个不同的数字
     10.二进制和十进制的相互转换
     11.计算机只认识二进制，那么计算机是怎么表示现实世界当中的文字的呢？
      * 八种基本数据类型当中，byte，short，int，long，float，double，boolean这其中数据类型在计算机当中表示的时候比较容易。
        因为底层都是数字，十进制的数字和二进制之间存在一种固定的转换规则。
      * 但是八种基本数据类型当中char类型表示的是现实世界中的文字，文字和计算机二进制之间“默认”情况下是不存在转换关系的。
      * 为了让计算机可以表示现实世界当中的文字。我们需要进行人为的干涉，需要人负责提前制定好“文字”和“二进制”之间的对照关系。这种转换关系被称为：字符编码
      * 计算机最初只支持英文，最先出现的字符编码是：ASCII码
       'a' --> 97
       'A' --> 65

       'a' --> (按照ASCII解码) --> 01100001
       01100001 --> (按照ASCII编码) --> 'a'

       编码和解码的时候采用一套字典/对照表，不会出现乱码
       当解码和编码的时候采用的不是同一套对照表，会出现编码问题

 */
public class DataTypeTest01 {
}