package com.facebook.login;

import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public enum CodeChallengeMethod {
    S256("S256"),
    PLAIN("plain");

    /* synthetic */ CodeChallengeMethod(String str, int i, y52 y52Var) {
        this((i & 1) != 0 ? "S256" : str);
    }

    CodeChallengeMethod(String str) {
    }
}
