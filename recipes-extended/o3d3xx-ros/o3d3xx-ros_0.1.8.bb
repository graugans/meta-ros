DESCRIPTION = "ifm efector O3D3xx ToF Camera ROS Package "
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS = "libo3d3xx \
           boost \
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
SRC_URI[md5sum] = "619c4fc3cc5c81111a743abc0016e270"
SRC_URI[sha256sum] = "9803933766967fb460d71b495e77df5588e49908684d10404e2e66b398395c10"

EXTRA_OECMAKE += "-Dlibo3d3xx_INCLUDE_DIRS:PATH=${STAGING_INCDIR} \
                  -Dlibo3d3xx_LIBRARIES:NAME=o3d3xx \
"

CXXFLAGS += " -std=c++11"
ROS_SPN = "o3d3xx"

inherit catkin