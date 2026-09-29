package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.m78;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatMessage {
    public static final C1697n0 Companion = new C1697n0();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f20723j;

    /* JADX INFO: renamed from: a */
    public final int f20724a;

    /* JADX INFO: renamed from: b */
    public final String f20725b;

    /* JADX INFO: renamed from: c */
    public final String f20726c;

    /* JADX INFO: renamed from: d */
    public final String f20727d;

    /* JADX INFO: renamed from: e */
    public final List f20728e;

    /* JADX INFO: renamed from: f */
    public final String f20729f;

    /* JADX INFO: renamed from: g */
    public final String f20730g;

    /* JADX INFO: renamed from: h */
    public final String f20731h;

    /* JADX INFO: renamed from: i */
    public final List f20732i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20723j = new cs4[]{null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(25)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(26))};
    }

    public /* synthetic */ ResultChatMessage(int i, int i2, String str, String str2, String str3, List list, String str4, String str5, String str6, List list2) {
        this.f20724a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20725b = "";
        } else {
            this.f20725b = str;
        }
        if ((i & 4) == 0) {
            this.f20726c = "";
        } else {
            this.f20726c = str2;
        }
        if ((i & 8) == 0) {
            this.f20727d = "";
        } else {
            this.f20727d = str3;
        }
        int i3 = i & 16;
        EmptyList emptyList = EmptyList.f47638a;
        if (i3 == 0) {
            this.f20728e = emptyList;
        } else {
            this.f20728e = list;
        }
        if ((i & 32) == 0) {
            this.f20729f = null;
        } else {
            this.f20729f = str4;
        }
        if ((i & 64) == 0) {
            this.f20730g = null;
        } else {
            this.f20730g = str5;
        }
        if ((i & 128) == 0) {
            this.f20731h = null;
        } else {
            this.f20731h = str6;
        }
        if ((i & 256) == 0) {
            this.f20732i = emptyList;
        } else {
            this.f20732i = list2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8345a() {
        return this.f20724a;
    }

    /* JADX INFO: renamed from: b */
    public final List m8346b() {
        return this.f20732i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatMessage)) {
            return false;
        }
        ResultChatMessage resultChatMessage = (ResultChatMessage) obj;
        return this.f20724a == resultChatMessage.f20724a && fa4.m11650l(this.f20725b, resultChatMessage.f20725b) && fa4.m11650l(this.f20726c, resultChatMessage.f20726c) && fa4.m11650l(this.f20727d, resultChatMessage.f20727d) && fa4.m11650l(this.f20728e, resultChatMessage.f20728e) && fa4.m11650l(this.f20729f, resultChatMessage.f20729f) && fa4.m11650l(this.f20730g, resultChatMessage.f20730g) && fa4.m11650l(this.f20731h, resultChatMessage.f20731h) && fa4.m11650l(this.f20732i, resultChatMessage.f20732i);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f20724a) * 31, this.f20725b, 31), this.f20726c, 31), this.f20727d, 31), 31, this.f20728e);
        String str = this.f20729f;
        int iHashCode = (iM22979b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20730g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20731h;
        return this.f20732i.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20724a, "ResultChatMessage(index=", ", role=", this.f20725b, ", name=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20726c, ", message=", this.f20727d, ", phrases=");
        wq1.m24130z(", translation=", this.f20729f, ", notes=", sbM22995r, this.f20728e);
        AbstractC3393o1.m17725C(sbM22995r, this.f20730g, ", correction=", this.f20731h, ", paragraphs=");
        return hn1.m13356f(sbM22995r, this.f20732i, ")");
    }

    public ResultChatMessage(int i, String str, int i2) {
        String str2 = (i2 & 32) != 0 ? null : "";
        str.getClass();
        this.f20724a = i;
        this.f20725b = "user";
        this.f20726c = "user";
        this.f20727d = str;
        EmptyList emptyList = EmptyList.f47638a;
        this.f20728e = emptyList;
        this.f20729f = str2;
        this.f20730g = null;
        this.f20731h = null;
        this.f20732i = emptyList;
    }
}
