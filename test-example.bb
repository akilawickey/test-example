# test-example .bb build file

DESCRIPTION = "test-example code"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"
DEPENDS = ""

# change this URI if you plan to fork the repository or use an alternate repository
SRC_URI = "git://github.com/akilawickey/test-example.git;protocol=git"
# this SRCREV determines the branch or tag to be used
SRCREV = "master"

# this is a revision number that should be updated every time you alter this recipe
PR = "r0" 

# this indicates the folder to run do_compile from.
S="${WORKDIR}/git"

do_compile () {
  make
}

do_install () {
  install -d ${D}${bindir}
  install -m 0755 test-example ${D}${bindir}
}
