package com.zhoushucheng.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.zhoushucheng.gulimall.product.entity.BrandEntity;
import com.zhoushucheng.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.function.Consumer;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Resource
    OSS ossClient;

    /**
     * 1、引入oss-starter
     * 2、配置key，endpoint相关信息即可
     * 3、使用OSSClient 进行相关操作
     */
    @Test
    public void testUpload() throws FileNotFoundException {
//        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
//        String endpoint = "oss-cn-shenzhen.aliyuncs.com";
//// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tRm9q3F3VpBpMp4QcM8";
//        String accessKeySecret = "z5Dk9m7wo8c3YN32iqUoh4ukziyz0Q";
//
//// 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        InputStream inputStream = new FileInputStream("D:\\File\\important files\\Java\\尚硅谷\\大型电商--谷粒商城\\1.分布式基础（全栈开发篇）\\资料源码\\pics\\0d40c24b264aa511.jpg");
// 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
        ossClient.putObject("gulimall-zsc", "0d40c24b264aa511.png", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传完成...");
    }

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为666");
        brandService.updateById(brandEntity);
        System.out.println("保存成功-------------");

//        BrandEntity brandEntity = new BrandEntity();
//
//        brandEntity.setName("红米");
//        brandEntity.setDescript("红米");
//        brandEntity.setBrandId(10L);
//        brandService.save(brandEntity);
//
//        System.out.println("保存成功......");
    }

    @Test
    public void test2(){
        //语法格式二：Lambda需要一个参数
        Consumer<String> con = (x) -> System.out.println(x);
        //Consumer<String> con = x -> System.out.println(x);
        con.accept("我大尚硅谷威武！");
    }
}
