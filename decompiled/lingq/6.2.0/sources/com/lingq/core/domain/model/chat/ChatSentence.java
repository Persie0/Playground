package com.lingq.core.domain.model.chat;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatSentence {
    public static final C1407h Companion = new C1407h();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f18946j;

    /* JADX INFO: renamed from: a */
    public final List f18947a;

    /* JADX INFO: renamed from: b */
    public final String f18948b;

    /* JADX INFO: renamed from: c */
    public final String f18949c;

    /* JADX INFO: renamed from: d */
    public final int f18950d;

    /* JADX INFO: renamed from: e */
    public final int f18951e;

    /* JADX INFO: renamed from: f */
    public final List f18952f;

    /* JADX INFO: renamed from: g */
    public final boolean f18953g;

    /* JADX INFO: renamed from: h */
    public final String f18954h;

    /* JADX INFO: renamed from: i */
    public final String f18955i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f18946j = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(22)), null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(23)), null, null, null};
    }

    public /* synthetic */ ChatSentence(int i, int i2, int i3, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        if (14 != (i & 14)) {
            n3c.m17204b(i, 14, ChatSentence$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        int i4 = i & 1;
        EmptyList emptyList = EmptyList.f47638a;
        if (i4 == 0) {
            this.f18947a = emptyList;
        } else {
            this.f18947a = list;
        }
        this.f18948b = str;
        this.f18949c = str2;
        this.f18950d = i2;
        if ((i & 16) == 0) {
            this.f18951e = 0;
        } else {
            this.f18951e = i3;
        }
        if ((i & 32) == 0) {
            this.f18952f = emptyList;
        } else {
            this.f18952f = list2;
        }
        if ((i & 64) == 0) {
            this.f18953g = false;
        } else {
            this.f18953g = z;
        }
        if ((i & 128) == 0) {
            this.f18954h = null;
        } else {
            this.f18954h = str3;
        }
        if ((i & 256) == 0) {
            this.f18955i = null;
        } else {
            this.f18955i = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatSentence)) {
            return false;
        }
        ChatSentence chatSentence = (ChatSentence) obj;
        return fa4.m11650l(this.f18947a, chatSentence.f18947a) && fa4.m11650l(this.f18948b, chatSentence.f18948b) && fa4.m11650l(this.f18949c, chatSentence.f18949c) && this.f18950d == chatSentence.f18950d && this.f18951e == chatSentence.f18951e && fa4.m11650l(this.f18952f, chatSentence.f18952f) && this.f18953g == chatSentence.f18953g && fa4.m11650l(this.f18954h, chatSentence.f18954h) && fa4.m11650l(this.f18955i, chatSentence.f18955i);
    }

    public final int hashCode() {
        int iHashCode = this.f18947a.hashCode() * 31;
        String str = this.f18948b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18949c;
        int iM24106b = wq1.m24106b(this.f18951e, wq1.m24106b(this.f18950d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        List list = this.f18952f;
        int iM12428e = g9a.m12428e((iM24106b + (list == null ? 0 : list.hashCode())) * 31, 31, this.f18953g);
        String str3 = this.f18954h;
        int iHashCode3 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18955i;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatSentence(tokens=");
        sb.append(this.f18947a);
        sb.append(", text=");
        sb.append(this.f18948b);
        sb.append(", normalizedText=");
        AbstractC3393o1.m17748w(this.f18950d, this.f18949c, ", index=", ", messageIndex=", sb);
        sb.append(this.f18951e);
        sb.append(", timestamp=");
        sb.append(this.f18952f);
        sb.append(", startParagraph=");
        hn1.m13367q(", url=", this.f18954h, ", opentag=", sb, this.f18953g);
        return AbstractC3393o1.m17738m(sb, this.f18955i, ")");
    }

    public ChatSentence(List list, String str, String str2, int i, int i2, ArrayList arrayList, boolean z, String str3, String str4) {
        list.getClass();
        this.f18947a = list;
        this.f18948b = str;
        this.f18949c = str2;
        this.f18950d = i;
        this.f18951e = i2;
        this.f18952f = arrayList;
        this.f18953g = z;
        this.f18954h = str3;
        this.f18955i = str4;
    }
}
