package com.lingq.core.network.api.requests;

import p000.ey8;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestBookmarkLesson {
    public static final C1564d Companion = new C1564d();

    /* JADX INFO: renamed from: a */
    public final String f20318a;

    /* JADX INFO: renamed from: b */
    public final int f20319b;

    /* JADX INFO: renamed from: c */
    public final String f20320c;

    /* JADX INFO: renamed from: d */
    public final Integer f20321d;

    /* JADX INFO: renamed from: e */
    public final Double f20322e;

    public /* synthetic */ RequestBookmarkLesson(int i, String str, int i2, String str2, Integer num, Double d) {
        this.f20318a = (i & 1) == 0 ? "Android" : str;
        if ((i & 2) == 0) {
            this.f20319b = 0;
        } else {
            this.f20319b = i2;
        }
        if ((i & 4) == 0) {
            this.f20320c = null;
        } else {
            this.f20320c = str2;
        }
        if ((i & 8) == 0) {
            this.f20321d = null;
        } else {
            this.f20321d = num;
        }
        if ((i & 16) == 0) {
            this.f20322e = null;
        } else {
            this.f20322e = d;
        }
    }

    public RequestBookmarkLesson(int i, String str, Integer num, Double d) {
        this.f20318a = "Android";
        this.f20319b = i;
        this.f20320c = str;
        this.f20321d = num;
        this.f20322e = d;
    }
}
