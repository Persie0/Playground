package com.lingq.core.domain.model.chat;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatHistory {
    public static final C1400a Companion = new C1400a();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f18905j = {null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new C3072he(16))};

    /* JADX INFO: renamed from: a */
    public final int f18906a;

    /* JADX INFO: renamed from: b */
    public final String f18907b;

    /* JADX INFO: renamed from: c */
    public final String f18908c;

    /* JADX INFO: renamed from: d */
    public final double f18909d;

    /* JADX INFO: renamed from: e */
    public final String f18910e;

    /* JADX INFO: renamed from: f */
    public final String f18911f;

    /* JADX INFO: renamed from: g */
    public final String f18912g;

    /* JADX INFO: renamed from: h */
    public final String f18913h;

    /* JADX INFO: renamed from: i */
    public final List f18914i;

    public /* synthetic */ ChatHistory(int i, int i2, String str, String str2, double d, String str3, String str4, String str5, String str6, List list) {
        if (511 != (i & 511)) {
            n3c.m17204b(i, 511, ChatHistory$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18906a = i2;
        this.f18907b = str;
        this.f18908c = str2;
        this.f18909d = d;
        this.f18910e = str3;
        this.f18911f = str4;
        this.f18912g = str5;
        this.f18913h = str6;
        this.f18914i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatHistory)) {
            return false;
        }
        ChatHistory chatHistory = (ChatHistory) obj;
        return this.f18906a == chatHistory.f18906a && fa4.m11650l(this.f18907b, chatHistory.f18907b) && fa4.m11650l(this.f18908c, chatHistory.f18908c) && Double.compare(this.f18909d, chatHistory.f18909d) == 0 && fa4.m11650l(this.f18910e, chatHistory.f18910e) && fa4.m11650l(this.f18911f, chatHistory.f18911f) && fa4.m11650l(this.f18912g, chatHistory.f18912g) && fa4.m11650l(this.f18913h, chatHistory.f18913h) && fa4.m11650l(this.f18914i, chatHistory.f18914i);
    }

    public final int hashCode() {
        return this.f18914i.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(g9a.m12424a(this.f18909d, ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f18906a) * 31, this.f18907b, 31), this.f18908c, 31), 31), this.f18910e, 31), this.f18911f, 31), this.f18912g, 31), this.f18913h, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f18906a, "ChatHistory(id=", ", title=", this.f18907b, ", image=");
        sbM22995r.append(this.f18908c);
        sbM22995r.append(", coins=");
        sbM22995r.append(this.f18909d);
        AbstractC3393o1.m17725C(sbM22995r, ", targetLanguage=", this.f18910e, ", dictionaryLanguage=", this.f18911f);
        AbstractC3393o1.m17725C(sbM22995r, ", startedAt=", this.f18912g, ", updatedAt=", this.f18913h);
        sbM22995r.append(", history=");
        sbM22995r.append(this.f18914i);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public ChatHistory(int i, String str, String str2, double d, String str3, String str4, String str5, String str6, List list) {
        ux5.m22975B(str, str2, str3, str4, str5);
        str6.getClass();
        list.getClass();
        this.f18906a = i;
        this.f18907b = str;
        this.f18908c = str2;
        this.f18909d = d;
        this.f18910e = str3;
        this.f18911f = str4;
        this.f18912g = str5;
        this.f18913h = str6;
        this.f18914i = list;
    }
}
