package com.google.crypto.tink.shaded.protobuf;

import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
class Utf8$UnpairedSurrogateException extends IllegalArgumentException {
    public Utf8$UnpairedSurrogateException(int i, int i2) {
        super(wq1.m24115k("Unpaired surrogate at index ", i, i2, " of "));
    }
}
