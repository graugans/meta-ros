DESCRIPTION = "ifm efector O3D3xx ToF Camera ROS Package "
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS = "libo3d3xx-image \
           image-transport \
           pcl-ros \
           cv-bridge \
           roscpp \
           sensor-msgs \
           std-msgs \
           tf \
           message-generation \
"

SRC_URI = "https://github.com/lovepark/o3d3xx-ros/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "34b8b3129b11b74bf80010e69aa3a7ef"
SRC_URI[sha256sum] = "c1f320bec0e60907542d55c050a6bae7c04c7edbad919fde54170c7ccb745106"

EXTRA_OECMAKE += "-Dlibo3d3xx_INCLUDE_DIRS:PATH=${STAGING_INCDIR} \
                  -Dlibo3d3xx_LIBRARIES:NAME=o3d3xx \
"

CXXFLAGS += " -std=c++11"

S = "${WORKDIR}/${PN}-ros-${PV}"

inherit catkin

