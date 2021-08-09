package com.itheima.xml.test01;

import com.itheima.xml.domain.Student;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestXml01 {
    public static void main(String[] args) throws DocumentException {
//        SAXReader reader = new SAXReader();
//        Document document = reader.read(url);
//        return document;
        //获取一个解析器对象
        SAXReader reader = new SAXReader();
        //获取一个document文档对象
        Document document = reader.read(new File("基础加强Module01\\xml\\第一个xml.xml"));
        //获取一个根标签
        Element rootElement = document.getRootElement();
//        System.out.println(rootElement);
        //获取所有的子标签集合
//        List elements = rootElement.elements();
////        for (Object element : elements) {
////            System.out.println(element);
////        }
//        int size = elements.size();
//        System.out.println(size);
        //可以根据标签名称获取所有的改标签数组
        List<Element> elements = rootElement.elements("student");
//        System.out.println(elements);
        ArrayList<Student> students = new ArrayList<>();
        //遍历标签数组
        for (Element element : elements) {
            //获取ID的属性
            Attribute attribute = element.attribute("id");
            //获取ID的值
            String id = attribute.getValue();
            //获取标签name的属性
            Element name = element.element("name");
            //获取标签name的值
            String nameText = name.getText();
            Element age = element.element("age");
            String ageText = age.getText();
//            System.out.println(id+" "+nameText+" "+ageText);
            Student student = new Student(Integer.parseInt(id), nameText, Integer.parseInt(ageText));
            students.add(student);
        }
        for (Student student : students) {
            System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());
        }
        int i = Integer.parseInt("001");
        System.out.println(i);
    }
}
