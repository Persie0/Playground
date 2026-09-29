package com.lingq.core.network.api.result;

import p000.ey8;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultActivityLevel {
    public static final C1714q Companion = new C1714q();

    /* JADX INFO: renamed from: a */
    public final int f20602a;

    /* JADX INFO: renamed from: b */
    public final int f20603b;

    public /* synthetic */ ResultActivityLevel(int i, int i2, int i3) {
        if ((i & 1) == 0) {
            this.f20602a = 0;
        } else {
            this.f20602a = i2;
        }
        if ((i & 2) == 0) {
            this.f20603b = 0;
        } else {
            this.f20603b = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultActivityLevel)) {
            return false;
        }
        ResultActivityLevel resultActivityLevel = (ResultActivityLevel) obj;
        return this.f20602a == resultActivityLevel.f20602a && this.f20603b == resultActivityLevel.f20603b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20603b) + (Integer.hashCode(this.f20602a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f20602a, this.f20603b, "ResultActivityLevel(id=", ", score=", ")");
    }
}
