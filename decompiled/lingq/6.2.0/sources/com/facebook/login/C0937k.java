package com.facebook.login;

import p000.fa4;

/* JADX INFO: renamed from: com.facebook.login.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0937k {
    /* JADX INFO: renamed from: a */
    public final C0939m m5254a() {
        if (C0939m.f11519h == null) {
            synchronized (this) {
                C0939m.f11519h = new C0939m();
            }
        }
        C0939m c0939m = C0939m.f11519h;
        if (c0939m != null) {
            return c0939m;
        }
        fa4.m11636J("instance");
        throw null;
    }
}
