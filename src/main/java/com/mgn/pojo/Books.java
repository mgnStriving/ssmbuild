package com.mgn.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/*这上面这个没用，没导入，放在这里，应该是包的问题
这里不知道为什么么导入setget方法*/
public class Books {
	private int bookID;
	private String bookName;
	private int bookCounts;
	private String detail;


}
