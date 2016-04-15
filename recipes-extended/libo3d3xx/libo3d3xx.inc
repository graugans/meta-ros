DESCRIPTION = "Drivers and libraries for the ifm efector O3D3xx"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../../LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

SRC_URI = "https://github.com/lovepark/libo3d3xx/archive/v${PV}.tar.gz \
"

SRC_URI[md5sum] = "1064ea48adab5ff97700878a2c03ebe9"
SRC_URI[sha256sum] = "fe0ff52a5fc71c755b1209b42c9a5e46d7f1637ba8fb541aa17731105cc56050"

inherit cmake

EXTRA_OECMAKE += " -DCMAKE_INSTALL_PREFIX=${prefix} \
                   -DBUILD_TESTS=OFF \
"
