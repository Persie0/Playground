package com.google.firebase;

import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        C6272i.m12913g("Detail message must not be empty", str);
    }
}
