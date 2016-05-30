require libo3d3xx.inc

DEPENDS = "libo3d3xx-camera"
S = "${WORKDIR}/libo3d3xx-${PV}/modules/framegrabber"

do_fetch[depends] += "libo3d3xx-camera:do_fetch"
FILES_${PN}-dev += "${prefix}/lib/o3d3xx_framegrabber"
