package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.m78;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatHistory {
    public static final C1679k0 Companion = new C1679k0();

    /* JADX INFO: renamed from: i */
    public static final cs4[] f20706i = {null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new m78(23))};

    /* JADX INFO: renamed from: a */
    public final int f20707a;

    /* JADX INFO: renamed from: b */
    public final String f20708b;

    /* JADX INFO: renamed from: c */
    public final String f20709c;

    /* JADX INFO: renamed from: d */
    public final String f20710d;

    /* JADX INFO: renamed from: e */
    public final String f20711e;

    /* JADX INFO: renamed from: f */
    public final String f20712f;

    /* JADX INFO: renamed from: g */
    public final String f20713g;

    /* JADX INFO: renamed from: h */
    public final List f20714h;

    public /* synthetic */ ResultChatHistory(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.f20707a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20708b = null;
        } else {
            this.f20708b = str;
        }
        if ((i & 4) == 0) {
            this.f20709c = null;
        } else {
            this.f20709c = str2;
        }
        if ((i & 8) == 0) {
            this.f20710d = "";
        } else {
            this.f20710d = str3;
        }
        if ((i & 16) == 0) {
            this.f20711e = "";
        } else {
            this.f20711e = str4;
        }
        if ((i & 32) == 0) {
            this.f20712f = "";
        } else {
            this.f20712f = str5;
        }
        if ((i & 64) == 0) {
            this.f20713g = "";
        } else {
            this.f20713g = str6;
        }
        if ((i & 128) == 0) {
            this.f20714h = EmptyList.f47638a;
        } else {
            this.f20714h = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8338a() {
        return this.f20711e;
    }

    /* JADX INFO: renamed from: b */
    public final List m8339b() {
        return this.f20714h;
    }

    /* JADX INFO: renamed from: c */
    public final int m8340c() {
        return this.f20707a;
    }

    /* JADX INFO: renamed from: d */
    public final String m8341d() {
        return this.f20710d;
    }

    /* JADX INFO: renamed from: e */
    public final String m8342e() {
        return this.f20708b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatHistory)) {
            return false;
        }
        ResultChatHistory resultChatHistory = (ResultChatHistory) obj;
        return this.f20707a == resultChatHistory.f20707a && fa4.m11650l(this.f20708b, resultChatHistory.f20708b) && fa4.m11650l(this.f20709c, resultChatHistory.f20709c) && fa4.m11650l(this.f20710d, resultChatHistory.f20710d) && fa4.m11650l(this.f20711e, resultChatHistory.f20711e) && fa4.m11650l(this.f20712f, resultChatHistory.f20712f) && fa4.m11650l(this.f20713g, resultChatHistory.f20713g) && fa4.m11650l(this.f20714h, resultChatHistory.f20714h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20707a) * 31;
        String str = this.f20708b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20709c;
        return this.f20714h.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, this.f20710d, 31), this.f20711e, 31), this.f20712f, 31), this.f20713g, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20707a, "ResultChatHistory(id=", ", title=", this.f20708b, ", image=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20709c, ", targetLanguage=", this.f20710d, ", dictionaryLanguage=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20711e, ", startedAt=", this.f20712f, ", updatedAt=");
        sbM22995r.append(this.f20713g);
        sbM22995r.append(", history=");
        sbM22995r.append(this.f20714h);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
