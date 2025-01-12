# 电脑操作员手册
你好，欢迎！你来到这里可能是无心之举，或者是想要[组装你的第一台电脑](getting_started.md)，又或者你正在寻找某个特定[方块](block/index.md)或[物品](item/index.md)的资料？

## 概述
[电脑](block/computer.md)提供了多种用途，从娱乐到对其他机器和设备进行大规模的、高度可定制的自动化控制。

一台电脑的核心是它的操作系统（OS）。默认操作系统是一个非常简易的Linux发行版。它仅提供最基本的命令行工具，以及编写和运行Lua程序的功能。

与高级API（HLAPI）设备（比如[红石接口方块](block/redstone_interface.md)）交互时非常适合使用Lua。默认操作系统附带了一些用于支持与这些设备交互的实用程序库，特别是`devices`库。要了解更多关于如何使用Lua与HLAPI设备交互的信息，请参阅手册的[脚本编写](scripting.md)条目。

天平的另一端是本机设备，如[硬盘](item/hard_drive.md)和[网络接口卡](item/network_interface_card.md)。这些设备由原生的Linux驱动程序控制，添加或移除后需要重启系统。然而，你遇到的设大多数备都是HLAPI设备。

## 入门
如果你只是想快速上手操作，只需阅读[入门指南](getting_started.md)。其中有手把手的教程，教你如何组装第一台电脑以及如何开始使用。要了解特定主题的更多信息，请参阅“参考资料”章节中的相关页面。

## 参考资料
本手册包含与电脑及其变体相关的方块和物品的参考信息。

如果你正在寻找某个特定方块或物品的信息，请查看各自的目录：
- [方块列表](block/index.md)
- [物品列表](item/index.md)

如果你对某个特定主题感兴趣，这里是一些常见主题的概述条目：
- [基础知识](basics.md)
- [脚本编写](scripting.md)
- [机器人技术](robotics.md)
- [网络](networking.md)