package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DemoApplication.class, args);
        // 设定Excel文件所在路径
        String ExcelFileName = "E:\\IDEA project\\demo\\src\\main\\java\\com\\example\\demo\\test.xlsx";
        //读取Excel文件内容
        List<ExcelDataVO> readResult = ExcelReader.readExcel(ExcelFileName);

        for(int i=0;i<readResult.size();i++){
            System.out.println(readResult.get(i).getId() +
                    "," + readResult.get(i).getName() +
                    "," + readResult.get(i).getV6_id() +
                    "," + readResult.get(i).getV6_website() +
                    "," + readResult.get(i).getV4_id() +
                    "," + readResult.get(i).getV4_website() +
                    "," + readResult.get(i).getVlan());
        }
    }

}
