package com.google.mlkit.common;

import p000.lda;

/* JADX INFO: loaded from: classes2.dex */
public class MlKitException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f13906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, Exception exc) {
        super(str, exc);
        lda.m16128n(str, "Provided message must not be empty.");
        this.f13906a = 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i) {
        super(str);
        lda.m16128n(str, "Provided message must not be empty.");
        this.f13906a = i;
    }
}
