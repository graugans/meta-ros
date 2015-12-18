DESCRIPTION = "Drivers and libraries for the ifm efector O3D3xx"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS = "boost glog libxmlrpc opencv pcl"

SRC_URI = "https://github.com/lovepark/libo3d3xx/archive/v0.2.0.tar.gz \
           file://0001-fix-cmake_install_prefix.patch\
"

SRC_URI[md5sum] = "70c40e22d2b46fed4c3d0ac6653390d2"
SRC_URI[sha256sum] = "43d40f6b3684dfb2a5ab99b87a2978089cb168c49e03543c40851f8b28ca3ed8"

inherit cmake

EXTRA_OECMAKE += " -DBUILD_TESTS=OFF \
                   -DBUILD_EXE_VIEWER=OFF \
"


do_install_append() {
	rm -rf ${D}${prefix}/etc
}

FILES_${PN} += "${prefix}/lib/o3d3xx"