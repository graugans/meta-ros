DESCRIPTION = "Drivers and libraries for the ifm efector O3D3xx"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../../LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

SRC_URI = "https://github.com/lovepark/libo3d3xx/archive/v${PV}.tar.gz \
"

SRC_URI[md5sum] = "8d87c5ed12e5a8e894bc8eac8d02d052"
SRC_URI[sha256sum] = "0d98bfed9f4f62310b825e09acb1ff57f7ea54ec632ac910ccf2e0376f3425cf"

inherit cmake

EXTRA_OECMAKE += " -DCMAKE_INSTALL_PREFIX=${prefix} \
                   -DBUILD_TESTS=OFF \
                   -DUBUNTU_VERSION:STRING=14.04 \
"
