package org.sopt.seminar2.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    //hello와 hello2를 둘다 쓰면 에러남
    @GetMapping("")
    public String hello() {
        return "hello world!";
    }

//    @RequestMapping(method = RequestMethod.GET, value = "")
//    public String hello2() {
//        return "Nice to Meet You!";
//    }

    //슬래시 생략은 처음만 가능하다.
    //hello2는 /1로 들어갈 수 있다. (첫 / 생략)
    @GetMapping("1")
    public String hello2() {
        return "hello world!!";
    }

    @GetMapping("/get1")
    public String get1() {
        return "1";
    }

    @GetMapping("/get1/PSY")
    public String get2() {
        return "PSY";
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable(value = "name") final String name) {
        return name;
    }

    @GetMapping("/part")
    public String getPart(@RequestParam(value = "part", defaultValue = "SOPT") final String part) {
        return part;
    }

    @GetMapping("/info")
    public String getPart2(@RequestParam(value = "name") final String name,
                           @RequestParam(value = "type", defaultValue = "YB") final String type) {
        return name + "이고 " + type + "입니다.";
    }

    @GetMapping("/num")
    public int number(@RequestParam(value = "num") final int[] num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}
