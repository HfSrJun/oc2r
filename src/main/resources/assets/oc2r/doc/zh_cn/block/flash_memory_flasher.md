# 闪存刷写器
![在眼前一闪而过](block:oc2r:flash_memory_flasher)

闪存刷写器可用于向电脑的闪存芯片中刷写自定义的预编译固件。

在Linux系统中，闪存刷写器通常会以`/dev/vdX`设备的形式出现，紧随已安装的硬盘之后。从技术层面上讲，闪存芯片的工作方式与该模组中的软盘或硬盘完全一致，因此你可以用它来存储或共享数据，尽管它们主要用于存储固件。

要刷写设备，你应该使用位于默认Linux发行版`/mnt/builtin/bin`目录中的`flash.sh`脚本。你可以按照以下方式使用它：

- `flash.sh [设备路径] [固件文件路径] (是否使用opensbi，分别填yes或no，如果省略则不会使用opensbi)`

OpenSBI是一个用于RISC-V系统的开源加载器/引导程序，很大程度上降低了内核开发难度。有关构建自定义内核的更深入讨论超出了本文档的范围。
