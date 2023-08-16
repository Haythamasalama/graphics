# Java Graphic 
![github](https://user-images.githubusercontent.com/37311945/162650428-df026403-68ba-48bb-b88a-fc62dc9cb430.jpg)


> Rep For Graphics Example on Java Using Graphic and Graphics2D Class  

## Contents 

- [Install](#install)
- [How To Use](#how-to-use)
- [Line](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Line)
- [Rectangle](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Rectangle)
- [Oval](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Oval)
- [Arc](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Arc)
- [Animations](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Animations)
- [Polygon](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Polygon)
- [Graphics2D](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Graphics2D)
- [Fractals](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Fractals)
- [Helpers](https://github.com/HaythamaSalama/graphic-java/tree/master/src/Helpers)
- [Contributing](#Contributing)
- [License](#License)

## Install

```sh
$ git clone https://github.com/HaythamaSalama/graphic-java
```

## How To Use

* After install the project , the structure folder like this :

![image](https://user-images.githubusercontent.com/37311945/163044109-ecce2293-1e92-4d61-af81-c82e1f5e4f85.png)

* Every class that contains functions that draw something for example  `Arc`  Class that contains `circle` , `example1`

![image](https://user-images.githubusercontent.com/37311945/163045542-72ad07d3-c121-4f89-95cd-bd4d80301231.png)

* If you need to draw a specific function or show the output put the function on `paint` functon to show the output. by default, all functions exist on `paint` but it's committed 
 
 example this is paint method on `Oval` Class  you need to show the output the `example11()` : 
  
  Before : 
  
  ```java
@Override
public void paint(Graphics g) {
    super.paint(g);
//    this.circle(g);
//    this.oval(g);
//    this.example3(g);
//    this.example4(g);
//    this.example5(g);
//    this.example6(g);
//    this.example7(g);
//    this.example8(g);
//    this.example9(g);
//    this.example10(g);
//    this.example11(g);
}
```
  
 After : 
    
```java
@Override
public void paint(Graphics g) {
    super.paint(g);
//    this.circle(g);
//    this.oval(g);
//    this.example3(g);
//    this.example4(g);
//    this.example5(g);
//    this.example6(g);
//    this.example7(g);
//    this.example8(g);
//    this.example9(g);
//    this.example10(g);
   this.example11(g);
}
```

 ## ❤  Sponsor me if you find the work valuable

<a href="https://www.buymeacoffee.com/haythamasalama" target="_blank">
<img src="https://cdn.buymeacoffee.com/buttons/v2/default-violet.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" >
</a>

## Contributing

Pull requests and stars are always welcome.

## License

Copyright © 2022, [Haytham Salama](https://github.com/haythamasalama).
Released under the [MIT License](LICENSE).

***
