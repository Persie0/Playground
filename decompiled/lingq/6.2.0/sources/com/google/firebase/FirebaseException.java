package com.google.firebase;

import p000.lda;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        lda.m16128n(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th) {
        super(str, th);
        lda.m16128n(str, "Detail message must not be empty");
    }
}
