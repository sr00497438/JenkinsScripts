package org.jenkins;
def call(name) {
    // you can call any valid step functions from your code, just like you can from Pipeline scripts
name = "Shuchi"
    echo "Hello world, ${name}"
}
