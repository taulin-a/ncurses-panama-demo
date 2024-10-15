#!/bin/bash
jextract --source -t org.taulin.bindings.ncurses -l ncurses -I ./header-files/ncurses.h  ./header-files/ncurses.h --header-class-name NCurses --output ./src/main/java
