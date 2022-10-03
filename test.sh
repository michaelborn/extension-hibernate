#!/bin/sh

# @cite https://docs.lucee.org/guides/working-with-source/building-and-testing-extensions.html

#if %errorlevel% neq 0 exit /b %errorlevel%
export testLabels=orm
export testFilter=orm

BASE_DIR="$(dirname "$PWD")"
LUCEE_DIR="$BASE_DIR/lucee"
LUCEE_RUNNER="$BASE_DIR/script-runner"

ant \
    -buildfile "$LUCEE_RUNNER/build.xml" \
    -DluceeVersion="5.3.10.32-SNAPSHOT" \
    -Dwebroot="$LUCEE_DIR/test" \
    -Dexecute="/bootstrap-tests.cfm" \
    -DextensionDir="$PWD\dist"