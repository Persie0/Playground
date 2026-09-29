package com.lingq.core.domain.model.chat;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatMessage {
    private static final C1402c Companion = new C1402c();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f18919j = {null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new C3072he(18)), null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final int f18920a;

    /* JADX INFO: renamed from: b */
    public final String f18921b;

    /* JADX INFO: renamed from: c */
    public final String f18922c;

    /* JADX INFO: renamed from: d */
    public final String f18923d;

    /* JADX INFO: renamed from: e */
    public final List f18924e;

    /* JADX INFO: renamed from: f */
    public final String f18925f;

    /* JADX INFO: renamed from: g */
    public final String f18926g;

    /* JADX INFO: renamed from: h */
    public final String f18927h;

    /* JADX INFO: renamed from: i */
    public final boolean f18928i;

    public /* synthetic */ ChatMessage(int i, int i2, String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, ChatMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18920a = i2;
        this.f18921b = str;
        this.f18922c = str2;
        this.f18923d = str3;
        if ((i & 16) == 0) {
            this.f18924e = EmptyList.f47638a;
        } else {
            this.f18924e = list;
        }
        if ((i & 32) == 0) {
            this.f18925f = "";
        } else {
            this.f18925f = str4;
        }
        if ((i & 64) == 0) {
            this.f18926g = "";
        } else {
            this.f18926g = str5;
        }
        if ((i & 128) == 0) {
            this.f18927h = "";
        } else {
            this.f18927h = str6;
        }
        if ((i & 256) == 0) {
            this.f18928i = false;
        } else {
            this.f18928i = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8013a() {
        return this.f18920a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8014b() {
        return fa4.m11650l(this.f18921b, "tutor");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) obj;
        return this.f18920a == chatMessage.f18920a && fa4.m11650l(this.f18921b, chatMessage.f18921b) && fa4.m11650l(this.f18922c, chatMessage.f18922c) && fa4.m11650l(this.f18923d, chatMessage.f18923d) && fa4.m11650l(this.f18924e, chatMessage.f18924e) && fa4.m11650l(this.f18925f, chatMessage.f18925f) && fa4.m11650l(this.f18926g, chatMessage.f18926g) && fa4.m11650l(this.f18927h, chatMessage.f18927h) && this.f18928i == chatMessage.f18928i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18928i) + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22979b(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f18920a) * 31, this.f18921b, 31), this.f18922c, 31), this.f18923d, 31), 31, this.f18924e), this.f18925f, 31), this.f18926g, 31), this.f18927h, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f18920a, "ChatMessage(index=", ", role=", this.f18921b, ", name=");
        AbstractC3393o1.m17725C(sbM22995r, this.f18922c, ", message=", this.f18923d, ", phrases=");
        wq1.m24130z(", translation=", this.f18925f, ", notes=", sbM22995r, this.f18924e);
        AbstractC3393o1.m17725C(sbM22995r, this.f18926g, ", correction=", this.f18927h, ", includedInImport=");
        return AbstractC3393o1.m17740o(sbM22995r, this.f18928i, ")");
    }

    public ChatMessage(int i, String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f18920a = i;
        this.f18921b = str;
        this.f18922c = str2;
        this.f18923d = str3;
        this.f18924e = list;
        this.f18925f = str4;
        this.f18926g = str5;
        this.f18927h = str6;
        this.f18928i = z;
    }

    public /* synthetic */ ChatMessage(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? EmptyList.f47638a : list, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, false);
    }
}
