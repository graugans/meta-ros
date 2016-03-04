DESCRIPTION = "Drivers and libraries for the ifm efector O3D3xx"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://../../LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

SRC_URI = "https://github.com/lovepark/libo3d3xx/archive/v${PV}.tar.gz \
"

SRC_URI[md5sum] = "8cbc66fb21046cf9c3d6f97ed9f72385"
SRC_URI[sha256sum] = "6cb3b0dafa5427ed1bd126c632c937acce4e969e2e02db014705590a1c794a8f"

inherit cmake

EXTRA_OECMAKE += " -DCMAKE_INSTALL_PREFIX=${prefix} \
                   -DBUILD_TESTS=OFF \
"
