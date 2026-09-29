package com.lingq.core.network.api.requests;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.m78;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestTranslationSentence {
    public static final C1563c1 Companion = new C1563c1();

    /* JADX INFO: renamed from: h */
    public static final cs4[] f20468h;

    /* JADX INFO: renamed from: a */
    public final int f20469a;

    /* JADX INFO: renamed from: b */
    public final List f20470b;

    /* JADX INFO: renamed from: c */
    public final String f20471c;

    /* JADX INFO: renamed from: d */
    public final List f20472d;

    /* JADX INFO: renamed from: e */
    public final List f20473e;

    /* JADX INFO: renamed from: f */
    public final boolean f20474f;

    /* JADX INFO: renamed from: g */
    public final String f20475g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20468h = new cs4[]{null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(7)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(8)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(9)), null, null};
    }

    public /* synthetic */ RequestTranslationSentence(int i, int i2, List list, String str, List list2, List list3, boolean z, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, RequestTranslationSentence$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20469a = i2;
        this.f20470b = list;
        if ((i & 4) == 0) {
            this.f20471c = "";
        } else {
            this.f20471c = str;
        }
        if ((i & 8) == 0) {
            this.f20472d = null;
        } else {
            this.f20472d = list2;
        }
        if ((i & 16) == 0) {
            this.f20473e = null;
        } else {
            this.f20473e = list3;
        }
        if ((i & 32) == 0) {
            this.f20474f = true;
        } else {
            this.f20474f = z;
        }
        if ((i & 64) == 0) {
            this.f20475g = "update";
        } else {
            this.f20475g = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTranslationSentence)) {
            return false;
        }
        RequestTranslationSentence requestTranslationSentence = (RequestTranslationSentence) obj;
        return this.f20469a == requestTranslationSentence.f20469a && fa4.m11650l(this.f20470b, requestTranslationSentence.f20470b) && fa4.m11650l(this.f20471c, requestTranslationSentence.f20471c) && fa4.m11650l(this.f20472d, requestTranslationSentence.f20472d) && fa4.m11650l(this.f20473e, requestTranslationSentence.f20473e) && this.f20474f == requestTranslationSentence.f20474f && fa4.m11650l(this.f20475g, requestTranslationSentence.f20475g);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22979b(Integer.hashCode(this.f20469a) * 31, 31, this.f20470b), this.f20471c, 31);
        List list = this.f20472d;
        int iHashCode = (iM22980c + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f20473e;
        return this.f20475g.hashCode() + g9a.m12428e((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.f20474f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestTranslationSentence(index=");
        sb.append(this.f20469a);
        sb.append(", timestamp=");
        sb.append(this.f20470b);
        sb.append(", text=");
        hn1.m13366p(this.f20471c, ", translations=", ", notes=", sb, this.f20472d);
        sb.append(this.f20473e);
        sb.append(", lone=");
        sb.append(this.f20474f);
        sb.append(", action=");
        return AbstractC3393o1.m17738m(sb, this.f20475g, ")");
    }

    public RequestTranslationSentence(int i, List list, String str, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        this.f20469a = i;
        this.f20470b = list;
        this.f20471c = str;
        this.f20472d = arrayList;
        this.f20473e = arrayList2;
        this.f20474f = true;
        this.f20475g = "update";
    }
}
