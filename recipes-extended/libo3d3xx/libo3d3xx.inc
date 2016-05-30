DESCRIPTION = "Drivers and libraries for the ifm efector O3D3xx"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../../LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

SRC_URI = "https://github.com/lovepark/libo3d3xx/archive/v${PV}.tar.gz \
"

SRC_URI[md5sum] = "7edf28e43853600446a14918ef52d7e4"
SRC_URI[sha256sum] = "13c6479bd15e8bc69d54bb6aae95f6ce52246bd8a76806f6fcb473c345ca59cc"

inherit cmake

EXTRA_OECMAKE += " -DCMAKE_INSTALL_PREFIX=${prefix} \
                   -DBUILD_TESTS=OFF \
                   -DUBUNTU_VERSION:STRING=14.04 \
"
