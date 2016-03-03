require libo3d3xx.inc

DEPENDS = "boost glog libxmlrpc"


S = "${WORKDIR}/libo3d3xx-${PV}/modules/camera"

EXTRA_OECMAKE += " -DCMAKE_INSTALL_PREFIX=${prefix} \
                   -DBUILD_TESTS=OFF \
                   -DBUILD_EXE_VIEWER=OFF \
"

FILES_${PN}-dev += "${prefix}/lib/o3d3xx_camera"
