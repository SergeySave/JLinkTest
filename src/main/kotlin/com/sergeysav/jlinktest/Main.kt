package com.sergeysav.jlinktest

import mu.KotlinLogging

val logger = KotlinLogging.logger { }

fun main() {
    logger.error { "Test" }
}