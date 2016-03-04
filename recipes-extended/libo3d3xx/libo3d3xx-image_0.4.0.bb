require libo3d3xx.inc
DEPENDS = "libo3d3xx-framegrabber opencv pcl"
S = "${WORKDIR}/libo3d3xx-${PV}/modules/image"

do_fetch[depends] += "libo3d3xx-camera:do_fetch"

EXTRA_OECMAKE += " -DBUILD_EXE_VIEWER=OFF \
"

FILES_${PN}-dev += "${prefix}/lib/o3d3xx_image"
