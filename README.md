# OpenWechat

一个简单的打开微信的方式

1.将文本内容放到系统剪贴板里

  ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
  String shareContent = "我们要怀有一种健康而活泼的心情，善待自己的生命！";
  cm.setText(shareContent);
  
2.打开微信去粘贴

  startActivity(App.getInstance().getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
        
        
![memory usage](Screenshot_2017-03-30-1.png)
![memory usage](Screenshot_2017-03-30-2.png)
![memory usage](Screenshot_2017-03-30-3.png)
![memory usage](Screenshot_2017-03-30-4.png)
![memory usage](Screenshot_2017-03-30-5.png)
