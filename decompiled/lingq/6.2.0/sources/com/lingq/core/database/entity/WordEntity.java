package com.lingq.core.database.entity;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e5a;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class WordEntity {
    public static final C1359r0 Companion = new C1359r0();

    /* JADX INFO: renamed from: q */
    public static final cs4[] f17488q;

    /* JADX INFO: renamed from: a */
    public final String f17489a;

    /* JADX INFO: renamed from: b */
    public final String f17490b;

    /* JADX INFO: renamed from: c */
    public final int f17491c;

    /* JADX INFO: renamed from: d */
    public final String f17492d;

    /* JADX INFO: renamed from: e */
    public final int f17493e;

    /* JADX INFO: renamed from: f */
    public final boolean f17494f;

    /* JADX INFO: renamed from: g */
    public final List f17495g;

    /* JADX INFO: renamed from: h */
    public final List f17496h;

    /* JADX INFO: renamed from: i */
    public final List f17497i;

    /* JADX INFO: renamed from: j */
    public final List f17498j;

    /* JADX INFO: renamed from: k */
    public final List f17499k;

    /* JADX INFO: renamed from: l */
    public final List f17500l;

    /* JADX INFO: renamed from: m */
    public final List f17501m;

    /* JADX INFO: renamed from: n */
    public final List f17502n;

    /* JADX INFO: renamed from: o */
    public final List f17503o;

    /* JADX INFO: renamed from: p */
    public final int f17504p;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f17488q = new cs4[]{null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(16)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(17)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(18)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(19)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(20)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(21)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(22)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(23)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new e5a(24)), null};
    }

    public /* synthetic */ WordEntity(int i, String str, String str2, int i2, String str3, int i3, boolean z, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, int i4) {
        if (11 != (i & 11)) {
            n3c.m17204b(i, 11, WordEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17489a = str;
        this.f17490b = str2;
        if ((i & 4) == 0) {
            this.f17491c = 0;
        } else {
            this.f17491c = i2;
        }
        this.f17492d = str3;
        if ((i & 16) == 0) {
            this.f17493e = 0;
        } else {
            this.f17493e = i3;
        }
        if ((i & 32) == 0) {
            this.f17494f = false;
        } else {
            this.f17494f = z;
        }
        int i5 = i & 64;
        EmptyList emptyList = EmptyList.f47638a;
        if (i5 == 0) {
            this.f17495g = emptyList;
        } else {
            this.f17495g = list;
        }
        if ((i & 128) == 0) {
            this.f17496h = emptyList;
        } else {
            this.f17496h = list2;
        }
        if ((i & 256) == 0) {
            this.f17497i = emptyList;
        } else {
            this.f17497i = list3;
        }
        if ((i & 512) == 0) {
            this.f17498j = emptyList;
        } else {
            this.f17498j = list4;
        }
        if ((i & 1024) == 0) {
            this.f17499k = emptyList;
        } else {
            this.f17499k = list5;
        }
        if ((i & 2048) == 0) {
            this.f17500l = emptyList;
        } else {
            this.f17500l = list6;
        }
        if ((i & 4096) == 0) {
            this.f17501m = emptyList;
        } else {
            this.f17501m = list7;
        }
        if ((i & 8192) == 0) {
            this.f17502n = emptyList;
        } else {
            this.f17502n = list8;
        }
        if ((i & 16384) == 0) {
            this.f17503o = emptyList;
        } else {
            this.f17503o = list9;
        }
        if ((i & 32768) == 0) {
            this.f17504p = 0;
        } else {
            this.f17504p = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7825a() {
        return this.f17504p;
    }

    /* JADX INFO: renamed from: b */
    public final List m7826b() {
        return this.f17497i;
    }

    /* JADX INFO: renamed from: c */
    public final List m7827c() {
        return this.f17502n;
    }

    /* JADX INFO: renamed from: d */
    public final List m7828d() {
        return this.f17501m;
    }

    /* JADX INFO: renamed from: e */
    public final List m7829e() {
        return this.f17499k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordEntity)) {
            return false;
        }
        WordEntity wordEntity = (WordEntity) obj;
        return fa4.m11650l(this.f17489a, wordEntity.f17489a) && fa4.m11650l(this.f17490b, wordEntity.f17490b) && this.f17491c == wordEntity.f17491c && fa4.m11650l(this.f17492d, wordEntity.f17492d) && this.f17493e == wordEntity.f17493e && this.f17494f == wordEntity.f17494f && fa4.m11650l(this.f17495g, wordEntity.f17495g) && fa4.m11650l(this.f17496h, wordEntity.f17496h) && fa4.m11650l(this.f17497i, wordEntity.f17497i) && fa4.m11650l(this.f17498j, wordEntity.f17498j) && fa4.m11650l(this.f17499k, wordEntity.f17499k) && fa4.m11650l(this.f17500l, wordEntity.f17500l) && fa4.m11650l(this.f17501m, wordEntity.f17501m) && fa4.m11650l(this.f17502n, wordEntity.f17502n) && fa4.m11650l(this.f17503o, wordEntity.f17503o) && this.f17504p == wordEntity.f17504p;
    }

    /* JADX INFO: renamed from: f */
    public final int m7830f() {
        return this.f17491c;
    }

    /* JADX INFO: renamed from: g */
    public final int m7831g() {
        return this.f17493e;
    }

    /* JADX INFO: renamed from: h */
    public final List m7832h() {
        return this.f17503o;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f17491c, ux5.m22980c(this.f17489a.hashCode() * 31, this.f17490b, 31), 31);
        String str = this.f17492d;
        int iM22979b = ux5.m22979b(ux5.m22979b(ux5.m22979b(g9a.m12428e(wq1.m24106b(this.f17493e, (iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f17494f), 31, this.f17495g), 31, this.f17496h), 31, this.f17497i);
        List list = this.f17498j;
        int iHashCode = (iM22979b + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f17499k;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f17500l;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f17501m;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f17502n;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f17503o;
        return Integer.hashCode(this.f17504p) + ((iHashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final List m7833i() {
        return this.f17495g;
    }

    /* JADX INFO: renamed from: j */
    public final List m7834j() {
        return this.f17500l;
    }

    /* JADX INFO: renamed from: k */
    public final List m7835k() {
        return this.f17498j;
    }

    /* JADX INFO: renamed from: l */
    public final String m7836l() {
        return this.f17492d;
    }

    /* JADX INFO: renamed from: m */
    public final List m7837m() {
        return this.f17496h;
    }

    /* JADX INFO: renamed from: n */
    public final String m7838n() {
        return this.f17490b;
    }

    /* JADX INFO: renamed from: o */
    public final String m7839o() {
        return this.f17489a;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7840p() {
        return this.f17494f;
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("WordEntity(termWithLanguage=", this.f17489a, ", term=", this.f17490b, ", id=");
        hn1.m13361k(this.f17491c, ", status=", this.f17492d, ", importance=", sbM23000w);
        hn1.m13368r(sbM23000w, this.f17493e, ", isPhrase=", this.f17494f, ", meanings=");
        hn1.m13372v(sbM23000w, this.f17495g, ", tags=", this.f17496h, ", gTags=");
        hn1.m13372v(sbM23000w, this.f17497i, ", romaji=", this.f17498j, ", hiragana=");
        hn1.m13372v(sbM23000w, this.f17499k, ", pinyin=", this.f17500l, ", hant=");
        hn1.m13372v(sbM23000w, this.f17501m, ", hans=", this.f17502n, ", jyutping=");
        sbM23000w.append(this.f17503o);
        sbM23000w.append(", cardId=");
        sbM23000w.append(this.f17504p);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public WordEntity(int i, int i2, int i3, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f17489a = str;
        this.f17490b = str2;
        this.f17491c = i;
        this.f17492d = str3;
        this.f17493e = i2;
        this.f17494f = z;
        this.f17495g = list;
        this.f17496h = list2;
        this.f17497i = list3;
        this.f17498j = list4;
        this.f17499k = list5;
        this.f17500l = list6;
        this.f17501m = list7;
        this.f17502n = list8;
        this.f17503o = list9;
        this.f17504p = i3;
    }
}
