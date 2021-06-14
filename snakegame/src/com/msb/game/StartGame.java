package com.msb.game;

import javax.swing.*;
import java.awt.*;

public class StartGame {
//    main方法 是程序的入口
    public static void main(String[] args) {
//        创建一个窗体
        JFrame jf = new JFrame();
//        给窗体设置标题
        jf.setTitle("贪吃蛇游戏");
//        设置窗体弹出的坐标 对应窗体的宽和高
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        jf.setBounds((width-800)/2,(height-800)/2,800,800);
//        设置窗体大小不可调节
        jf.setResizable(false);
//        关闭窗口的同时，程序关闭
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        创建面板
        GamePanel gp = new GamePanel();
//        将面板放入窗体中
        jf.add(gp);
//        显示窗体
        jf.setVisible(true);
    }
}
