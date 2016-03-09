require libo3d3xx.inc

DEPENDS = "boost glog libxmlrpc"


S = "${WORKDIR}/libo3d3xx-${PV}/modules/camera"
FILES_${PN}-dev += "${prefix}/lib/o3d3xx_camera"

BBCLASSEXTEND += "native"
