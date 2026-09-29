package com.lingq.core.database.entity;

import java.util.ArrayList;
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
public final class ChatHistoryEntity {
    public static final C1330d Companion = new C1330d();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f17092j = {null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new C3072he(17))};

    /* JADX INFO: renamed from: a */
    public final int f17093a;

    /* JADX INFO: renamed from: b */
    public final String f17094b;

    /* JADX INFO: renamed from: c */
    public final String f17095c;

    /* JADX INFO: renamed from: d */
    public final double f17096d;

    /* JADX INFO: renamed from: e */
    public final String f17097e;

    /* JADX INFO: renamed from: f */
    public final String f17098f;

    /* JADX INFO: renamed from: g */
    public final String f17099g;

    /* JADX INFO: renamed from: h */
    public final String f17100h;

    /* JADX INFO: renamed from: i */
    public final List f17101i;

    public /* synthetic */ ChatHistoryEntity(int i, int i2, String str, String str2, double d, String str3, String str4, String str5, String str6, List list) {
        if (511 != (i & 511)) {
            n3c.m17204b(i, 511, ChatHistoryEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17093a = i2;
        this.f17094b = str;
        this.f17095c = str2;
        this.f17096d = d;
        this.f17097e = str3;
        this.f17098f = str4;
        this.f17099g = str5;
        this.f17100h = str6;
        this.f17101i = list;
    }

    /* JADX INFO: renamed from: a */
    public static ChatHistoryEntity m7558a(ChatHistoryEntity chatHistoryEntity, String str, String str2, String str3, String str4, ArrayList arrayList, int i) {
        int i2 = chatHistoryEntity.f17093a;
        if ((i & 2) != 0) {
            str = chatHistoryEntity.f17094b;
        }
        String str5 = str;
        String str6 = chatHistoryEntity.f17095c;
        double d = chatHistoryEntity.f17096d;
        if ((i & 16) != 0) {
            str2 = chatHistoryEntity.f17097e;
        }
        String str7 = str2;
        if ((i & 32) != 0) {
            str3 = chatHistoryEntity.f17098f;
        }
        String str8 = str3;
        String str9 = (i & 64) != 0 ? chatHistoryEntity.f17099g : str4;
        String str10 = chatHistoryEntity.f17100h;
        List list = (i & 256) != 0 ? chatHistoryEntity.f17101i : arrayList;
        chatHistoryEntity.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        list.getClass();
        return new ChatHistoryEntity(i2, str5, str6, d, str7, str8, str9, str10, list);
    }

    /* JADX INFO: renamed from: b */
    public final double m7559b() {
        return this.f17096d;
    }

    /* JADX INFO: renamed from: c */
    public final String m7560c() {
        return this.f17098f;
    }

    /* JADX INFO: renamed from: d */
    public final List m7561d() {
        return this.f17101i;
    }

    /* JADX INFO: renamed from: e */
    public final int m7562e() {
        return this.f17093a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatHistoryEntity)) {
            return false;
        }
        ChatHistoryEntity chatHistoryEntity = (ChatHistoryEntity) obj;
        return this.f17093a == chatHistoryEntity.f17093a && fa4.m11650l(this.f17094b, chatHistoryEntity.f17094b) && fa4.m11650l(this.f17095c, chatHistoryEntity.f17095c) && Double.compare(this.f17096d, chatHistoryEntity.f17096d) == 0 && fa4.m11650l(this.f17097e, chatHistoryEntity.f17097e) && fa4.m11650l(this.f17098f, chatHistoryEntity.f17098f) && fa4.m11650l(this.f17099g, chatHistoryEntity.f17099g) && fa4.m11650l(this.f17100h, chatHistoryEntity.f17100h) && fa4.m11650l(this.f17101i, chatHistoryEntity.f17101i);
    }

    /* JADX INFO: renamed from: f */
    public final String m7563f() {
        return this.f17095c;
    }

    /* JADX INFO: renamed from: g */
    public final String m7564g() {
        return this.f17099g;
    }

    /* JADX INFO: renamed from: h */
    public final String m7565h() {
        return this.f17097e;
    }

    public final int hashCode() {
        return this.f17101i.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(g9a.m12424a(this.f17096d, ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f17093a) * 31, this.f17094b, 31), this.f17095c, 31), 31), this.f17097e, 31), this.f17098f, 31), this.f17099g, 31), this.f17100h, 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m7566i() {
        return this.f17094b;
    }

    /* JADX INFO: renamed from: j */
    public final String m7567j() {
        return this.f17100h;
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f17093a, "ChatHistoryEntity(id=", ", title=", this.f17094b, ", image=");
        sbM22995r.append(this.f17095c);
        sbM22995r.append(", coins=");
        sbM22995r.append(this.f17096d);
        AbstractC3393o1.m17725C(sbM22995r, ", targetLanguage=", this.f17097e, ", dictionaryLanguage=", this.f17098f);
        AbstractC3393o1.m17725C(sbM22995r, ", startedAt=", this.f17099g, ", updatedAt=", this.f17100h);
        sbM22995r.append(", history=");
        sbM22995r.append(this.f17101i);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public ChatHistoryEntity(int i, String str, String str2, double d, String str3, String str4, String str5, String str6, List list) {
        ux5.m22975B(str, str2, str3, str4, str5);
        str6.getClass();
        list.getClass();
        this.f17093a = i;
        this.f17094b = str;
        this.f17095c = str2;
        this.f17096d = d;
        this.f17097e = str3;
        this.f17098f = str4;
        this.f17099g = str5;
        this.f17100h = str6;
        this.f17101i = list;
    }
}
