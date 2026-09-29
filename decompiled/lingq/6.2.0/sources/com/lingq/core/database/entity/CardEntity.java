package com.lingq.core.database.entity;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.t7d;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CardEntity {

    /* JADX INFO: renamed from: C */
    public static final cs4[] f17051C;
    public static final C1324a Companion = new C1324a();

    /* JADX INFO: renamed from: A */
    public final boolean f17052A;

    /* JADX INFO: renamed from: B */
    public final String f17053B;

    /* JADX INFO: renamed from: a */
    public final String f17054a;

    /* JADX INFO: renamed from: b */
    public final String f17055b;

    /* JADX INFO: renamed from: c */
    public final int f17056c;

    /* JADX INFO: renamed from: d */
    public final String f17057d;

    /* JADX INFO: renamed from: e */
    public final String f17058e;

    /* JADX INFO: renamed from: f */
    public final int f17059f;

    /* JADX INFO: renamed from: g */
    public final Integer f17060g;

    /* JADX INFO: renamed from: h */
    public final String f17061h;

    /* JADX INFO: renamed from: i */
    public final String f17062i;

    /* JADX INFO: renamed from: j */
    public final String f17063j;

    /* JADX INFO: renamed from: k */
    public final String f17064k;

    /* JADX INFO: renamed from: l */
    public final int f17065l;

    /* JADX INFO: renamed from: m */
    public final List f17066m;

    /* JADX INFO: renamed from: n */
    public final String f17067n;

    /* JADX INFO: renamed from: o */
    public final List f17068o;

    /* JADX INFO: renamed from: p */
    public final List f17069p;

    /* JADX INFO: renamed from: q */
    public final List f17070q;

    /* JADX INFO: renamed from: r */
    public final String f17071r;

    /* JADX INFO: renamed from: s */
    public final String f17072s;

    /* JADX INFO: renamed from: t */
    public final String f17073t;

    /* JADX INFO: renamed from: u */
    public final String f17074u;

    /* JADX INFO: renamed from: v */
    public final String f17075v;

    /* JADX INFO: renamed from: w */
    public final String f17076w;

    /* JADX INFO: renamed from: x */
    public final String f17077x;

    /* JADX INFO: renamed from: y */
    public final String f17078y;

    /* JADX INFO: renamed from: z */
    public final String f17079z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f17051C = new cs4[]{null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(3)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(4)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(5)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(6)), null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ CardEntity(int i, int i2, int i3, int i4, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, List list2, List list3, List list4, boolean z) {
        if (2011 != (i & 2011)) {
            n3c.m17204b(i, 2011, CardEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17054a = str;
        this.f17055b = str2;
        if ((i & 4) == 0) {
            this.f17056c = 0;
        } else {
            this.f17056c = i2;
        }
        this.f17057d = str3;
        this.f17058e = str4;
        if ((i & 32) == 0) {
            this.f17059f = 0;
        } else {
            this.f17059f = i3;
        }
        this.f17060g = num;
        this.f17061h = str5;
        this.f17062i = str6;
        this.f17063j = str7;
        this.f17064k = str8;
        if ((i & 2048) == 0) {
            this.f17065l = 0;
        } else {
            this.f17065l = i4;
        }
        int i5 = i & 4096;
        EmptyList emptyList = EmptyList.f47638a;
        if (i5 == 0) {
            this.f17066m = emptyList;
        } else {
            this.f17066m = list;
        }
        this.f17067n = (i & 8192) == 0 ? t7d.m21899d(this.f17066m) : str9;
        if ((i & 16384) == 0) {
            this.f17068o = emptyList;
        } else {
            this.f17068o = list2;
        }
        if ((32768 & i) == 0) {
            this.f17069p = emptyList;
        } else {
            this.f17069p = list3;
        }
        if ((65536 & i) == 0) {
            this.f17070q = emptyList;
        } else {
            this.f17070q = list4;
        }
        if ((131072 & i) == 0) {
            this.f17071r = null;
        } else {
            this.f17071r = str10;
        }
        if ((262144 & i) == 0) {
            this.f17072s = null;
        } else {
            this.f17072s = str11;
        }
        if ((524288 & i) == 0) {
            this.f17073t = null;
        } else {
            this.f17073t = str12;
        }
        if ((1048576 & i) == 0) {
            this.f17074u = null;
        } else {
            this.f17074u = str13;
        }
        if ((2097152 & i) == 0) {
            this.f17075v = null;
        } else {
            this.f17075v = str14;
        }
        if ((4194304 & i) == 0) {
            this.f17076w = null;
        } else {
            this.f17076w = str15;
        }
        if ((8388608 & i) == 0) {
            this.f17077x = null;
        } else {
            this.f17077x = str16;
        }
        if ((16777216 & i) == 0) {
            this.f17078y = null;
        } else {
            this.f17078y = str17;
        }
        if ((33554432 & i) == 0) {
            this.f17079z = null;
        } else {
            this.f17079z = str18;
        }
        if ((67108864 & i) == 0) {
            this.f17052A = false;
        } else {
            this.f17052A = z;
        }
        if ((i & 134217728) == 0) {
            this.f17053B = null;
        } else {
            this.f17053B = str19;
        }
    }

    /* JADX INFO: renamed from: a */
    public static CardEntity m7517a(CardEntity cardEntity, String str) {
        String str2 = cardEntity.f17054a;
        String str3 = cardEntity.f17055b;
        int i = cardEntity.f17056c;
        String str4 = cardEntity.f17057d;
        String str5 = cardEntity.f17058e;
        int i2 = cardEntity.f17059f;
        Integer num = cardEntity.f17060g;
        String str6 = cardEntity.f17061h;
        String str7 = cardEntity.f17062i;
        String str8 = cardEntity.f17064k;
        int i3 = cardEntity.f17065l;
        List list = cardEntity.f17066m;
        String str9 = cardEntity.f17067n;
        List list2 = cardEntity.f17068o;
        List list3 = cardEntity.f17069p;
        List list4 = cardEntity.f17070q;
        String str10 = cardEntity.f17071r;
        String str11 = cardEntity.f17072s;
        String str12 = cardEntity.f17073t;
        String str13 = cardEntity.f17074u;
        String str14 = cardEntity.f17075v;
        String str15 = cardEntity.f17076w;
        String str16 = cardEntity.f17077x;
        String str17 = cardEntity.f17078y;
        String str18 = cardEntity.f17079z;
        boolean z = cardEntity.f17052A;
        String str19 = cardEntity.f17053B;
        str2.getClass();
        str3.getClass();
        list.getClass();
        str9.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new CardEntity(i, i2, i3, num, str2, str3, str4, str5, str6, str7, str, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, list, list2, list3, list4, z);
    }

    /* JADX INFO: renamed from: A */
    public final String m7518A() {
        return this.f17057d;
    }

    /* JADX INFO: renamed from: B */
    public final List m7519B() {
        return this.f17070q;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7520C() {
        return this.f17052A;
    }

    /* JADX INFO: renamed from: b */
    public final String m7521b() {
        return this.f17064k;
    }

    /* JADX INFO: renamed from: c */
    public final String m7522c() {
        return this.f17053B;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m7523d() {
        return this.f17060g;
    }

    /* JADX INFO: renamed from: e */
    public final String m7524e() {
        return this.f17058e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CardEntity.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        CardEntity cardEntity = (CardEntity) obj;
        return this.f17059f == cardEntity.f17059f && fa4.m11650l(this.f17060g, cardEntity.f17060g) && fa4.m11650l(this.f17062i, cardEntity.f17062i) && fa4.m11650l(this.f17066m, cardEntity.f17066m) && fa4.m11650l(this.f17068o, cardEntity.f17068o);
    }

    /* JADX INFO: renamed from: f */
    public final String m7525f() {
        return this.f17077x;
    }

    /* JADX INFO: renamed from: g */
    public final String m7526g() {
        return this.f17078y;
    }

    /* JADX INFO: renamed from: h */
    public final List m7527h() {
        return this.f17069p;
    }

    public final int hashCode() {
        int i = this.f17059f * 31;
        Integer num = this.f17060g;
        int iIntValue = (i + (num != null ? num.intValue() : 0)) * 31;
        String str = this.f17062i;
        return this.f17068o.hashCode() + ux5.m22979b((iIntValue + (str != null ? str.hashCode() : 0)) * 31, 31, this.f17066m);
    }

    /* JADX INFO: renamed from: i */
    public final String m7528i() {
        return this.f17075v;
    }

    /* JADX INFO: renamed from: j */
    public final String m7529j() {
        return this.f17074u;
    }

    /* JADX INFO: renamed from: k */
    public final String m7530k() {
        return this.f17071r;
    }

    /* JADX INFO: renamed from: l */
    public final int m7531l() {
        return this.f17056c;
    }

    /* JADX INFO: renamed from: m */
    public final int m7532m() {
        return this.f17065l;
    }

    /* JADX INFO: renamed from: n */
    public final String m7533n() {
        return this.f17076w;
    }

    /* JADX INFO: renamed from: o */
    public final String m7534o() {
        return this.f17061h;
    }

    /* JADX INFO: renamed from: p */
    public final String m7535p() {
        return this.f17079z;
    }

    /* JADX INFO: renamed from: q */
    public final String m7536q() {
        return this.f17067n;
    }

    /* JADX INFO: renamed from: r */
    public final List m7537r() {
        return this.f17066m;
    }

    /* JADX INFO: renamed from: s */
    public final String m7538s() {
        return this.f17063j;
    }

    /* JADX INFO: renamed from: t */
    public final String m7539t() {
        return this.f17073t;
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("CardEntity(term=", this.f17054a, ", termWithLanguage=", this.f17055b, ", id=");
        hn1.m13361k(this.f17056c, ", url=", this.f17057d, ", fragment=", sbM23000w);
        AbstractC3393o1.m17748w(this.f17059f, this.f17058e, ", status=", ", extendedStatus=", sbM23000w);
        sbM23000w.append(this.f17060g);
        sbM23000w.append(", lastReviewedCorrect=");
        sbM23000w.append(this.f17061h);
        sbM23000w.append(", srsDueDate=");
        AbstractC3393o1.m17725C(sbM23000w, this.f17062i, ", notes=", this.f17063j, ", audio=");
        AbstractC3393o1.m17748w(this.f17065l, this.f17064k, ", importance=", ", meanings=", sbM23000w);
        wq1.m24130z(", meaningTerms=", this.f17067n, ", tags=", sbM23000w, this.f17066m);
        hn1.m13372v(sbM23000w, this.f17068o, ", gTags=", this.f17069p, ", words=");
        wq1.m24130z(", hiragana=", this.f17071r, ", romaji=", sbM23000w, this.f17070q);
        AbstractC3393o1.m17725C(sbM23000w, this.f17072s, ", pinyin=", this.f17073t, ", hant=");
        AbstractC3393o1.m17725C(sbM23000w, this.f17074u, ", hans=", this.f17075v, ", jyutping=");
        AbstractC3393o1.m17725C(sbM23000w, this.f17076w, ", furiganaChunk=", this.f17077x, ", furiganaFurigana=");
        AbstractC3393o1.m17725C(sbM23000w, this.f17078y, ", latin=", this.f17079z, ", isPhrase=");
        sbM23000w.append(this.f17052A);
        sbM23000w.append(", creationDate=");
        sbM23000w.append(this.f17053B);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    /* JADX INFO: renamed from: u */
    public final String m7540u() {
        return this.f17072s;
    }

    /* JADX INFO: renamed from: v */
    public final String m7541v() {
        return this.f17062i;
    }

    /* JADX INFO: renamed from: w */
    public final int m7542w() {
        return this.f17059f;
    }

    /* JADX INFO: renamed from: x */
    public final List m7543x() {
        return this.f17068o;
    }

    /* JADX INFO: renamed from: y */
    public final String m7544y() {
        return this.f17054a;
    }

    /* JADX INFO: renamed from: z */
    public final String m7545z() {
        return this.f17055b;
    }

    public CardEntity(int i, int i2, int i3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List list, List list2, List list3, List list4, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str9.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f17054a = str;
        this.f17055b = str2;
        this.f17056c = i;
        this.f17057d = str3;
        this.f17058e = str4;
        this.f17059f = i2;
        this.f17060g = num;
        this.f17061h = str5;
        this.f17062i = str6;
        this.f17063j = str7;
        this.f17064k = str8;
        this.f17065l = i3;
        this.f17066m = list;
        this.f17067n = str9;
        this.f17068o = list2;
        this.f17069p = list3;
        this.f17070q = list4;
        this.f17071r = str10;
        this.f17072s = str11;
        this.f17073t = str12;
        this.f17074u = str13;
        this.f17075v = str14;
        this.f17076w = str15;
        this.f17077x = str16;
        this.f17078y = str17;
        this.f17079z = str18;
        this.f17052A = z;
        this.f17053B = str19;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardEntity(String str, String str2, int i, String str3, String str4, int i2, Integer num, String str5, String str6, String str7, String str8, int i3, List list, List list2, List list3, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, String str18, int i4) {
        String strM21899d = t7d.m21899d(list);
        int i5 = i4 & 32768;
        EmptyList emptyList = EmptyList.f47638a;
        this(i, i2, i3, num, str, str2, str3, str4, str5, str6, str7, str8, strM21899d, (i4 & 131072) != 0 ? null : str9, (i4 & 262144) != 0 ? null : str10, (i4 & 524288) != 0 ? null : str11, (i4 & 1048576) != 0 ? null : str12, (i4 & 2097152) != 0 ? null : str13, (i4 & 4194304) != 0 ? null : str14, (i4 & 8388608) != 0 ? null : str15, (i4 & 16777216) != 0 ? null : str16, (i4 & 33554432) != 0 ? null : str17, (i4 & 134217728) != 0 ? null : str18, list, list2, i5 != 0 ? emptyList : list3, emptyList, z);
    }
}
