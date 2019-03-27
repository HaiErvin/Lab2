# Lab2
通过主页面的三个按钮跳转到其他页面，分别实现线性布局、相对布局、表格布局。
## 主页面
![主页面](https://github.com/HaiErvin/Lab2/blob/master/%E4%B8%BB%E9%A1%B5%E9%9D%A2.PNG?raw=true)
页面跳转代码<br>
Button btn1=(Button)findViewById(R.id.btn_one);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Layout1.class);
                startActivity(intent);
            }
        });
## 线性布局
![线性布局](https://github.com/HaiErvin/Lab2/blob/master/%E7%BA%BF%E6%80%A7%E5%B8%83%E5%B1%80.PNG?raw=true)
## 相对布局
![相对布局](https://github.com/HaiErvin/Lab2/blob/master/%E7%9B%B8%E5%AF%B9%E5%B8%83%E5%B1%80.PNG?raw=true)
## 表格布局
![表格布局](https://github.com/HaiErvin/Lab2/blob/master/%E8%A1%A8%E6%A0%BC%E5%B8%83%E5%B1%80.PNG?raw=true)
