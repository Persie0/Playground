package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Target {
    public static final C1634c5 Companion = new C1634c5();

    /* JADX INFO: renamed from: a */
    public final Double f21740a;

    /* JADX INFO: renamed from: b */
    public final Double f21741b;

    /* JADX INFO: renamed from: c */
    public final Double f21742c;

    /* JADX INFO: renamed from: d */
    public final String f21743d;

    public /* synthetic */ Target(int i, Double d, Double d2, Double d3, String str) {
        if ((i & 1) == 0) {
            this.f21740a = null;
        } else {
            this.f21740a = d;
        }
        if ((i & 2) == 0) {
            this.f21741b = null;
        } else {
            this.f21741b = d2;
        }
        if ((i & 4) == 0) {
            this.f21742c = null;
        } else {
            this.f21742c = d3;
        }
        if ((i & 8) == 0) {
            this.f21743d = null;
        } else {
            this.f21743d = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8404a() {
        return this.f21743d;
    }

    /* JADX INFO: renamed from: b */
    public final Double m8405b() {
        return this.f21741b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Target)) {
            return false;
        }
        Target target = (Target) obj;
        return fa4.m11650l(this.f21740a, target.f21740a) && fa4.m11650l(this.f21741b, target.f21741b) && fa4.m11650l(this.f21742c, target.f21742c) && fa4.m11650l(this.f21743d, target.f21743d);
    }

    public final int hashCode() {
        Double d = this.f21740a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f21741b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f21742c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.f21743d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Target(progress=" + this.f21740a + ", goal=" + this.f21741b + ", actual=" + this.f21742c + ", code=" + this.f21743d + ")";
    }

    public Target() {
        this.f21740a = null;
        this.f21741b = null;
        this.f21742c = null;
        this.f21743d = null;
    }
}
