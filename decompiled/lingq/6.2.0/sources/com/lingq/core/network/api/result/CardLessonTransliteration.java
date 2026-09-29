package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CardLessonTransliteration {
    public static final C1635d Companion = new C1635d();

    /* JADX INFO: renamed from: i */
    public static final cs4[] f20507i;

    /* JADX INFO: renamed from: a */
    public final List f20508a;

    /* JADX INFO: renamed from: b */
    public final List f20509b;

    /* JADX INFO: renamed from: c */
    public final List f20510c;

    /* JADX INFO: renamed from: d */
    public final List f20511d;

    /* JADX INFO: renamed from: e */
    public final List f20512e;

    /* JADX INFO: renamed from: f */
    public final List f20513f;

    /* JADX INFO: renamed from: g */
    public final List f20514g;

    /* JADX INFO: renamed from: h */
    public final List f20515h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20507i = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(7)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(8)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(9)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(10)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(11)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(12)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(13)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new C3072he(14))};
    }

    public /* synthetic */ CardLessonTransliteration(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.f47638a;
        if (i2 == 0) {
            this.f20508a = emptyList;
        } else {
            this.f20508a = list;
        }
        if ((i & 2) == 0) {
            this.f20509b = emptyList;
        } else {
            this.f20509b = list2;
        }
        if ((i & 4) == 0) {
            this.f20510c = emptyList;
        } else {
            this.f20510c = list3;
        }
        if ((i & 8) == 0) {
            this.f20511d = emptyList;
        } else {
            this.f20511d = list4;
        }
        if ((i & 16) == 0) {
            this.f20512e = emptyList;
        } else {
            this.f20512e = list5;
        }
        if ((i & 32) == 0) {
            this.f20513f = emptyList;
        } else {
            this.f20513f = list6;
        }
        if ((i & 64) == 0) {
            this.f20514g = emptyList;
        } else {
            this.f20514g = list7;
        }
        if ((i & 128) == 0) {
            this.f20515h = emptyList;
        } else {
            this.f20515h = list8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardLessonTransliteration)) {
            return false;
        }
        CardLessonTransliteration cardLessonTransliteration = (CardLessonTransliteration) obj;
        return fa4.m11650l(this.f20508a, cardLessonTransliteration.f20508a) && fa4.m11650l(this.f20509b, cardLessonTransliteration.f20509b) && fa4.m11650l(this.f20510c, cardLessonTransliteration.f20510c) && fa4.m11650l(this.f20511d, cardLessonTransliteration.f20511d) && fa4.m11650l(this.f20512e, cardLessonTransliteration.f20512e) && fa4.m11650l(this.f20513f, cardLessonTransliteration.f20513f) && fa4.m11650l(this.f20514g, cardLessonTransliteration.f20514g) && fa4.m11650l(this.f20515h, cardLessonTransliteration.f20515h);
    }

    public final int hashCode() {
        List list = this.f20508a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f20509b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f20510c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f20511d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f20512e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f20513f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.f20514g;
        int iHashCode7 = (iHashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List list8 = this.f20515h;
        return iHashCode7 + (list8 != null ? list8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardLessonTransliteration(romaji=");
        sb.append(this.f20508a);
        sb.append(", hiragana=");
        sb.append(this.f20509b);
        sb.append(", pinyin=");
        hn1.m13372v(sb, this.f20510c, ", hant=", this.f20511d, ", hans=");
        hn1.m13372v(sb, this.f20512e, ", jyutping=", this.f20513f, ", furigana=");
        sb.append(this.f20514g);
        sb.append(", latin=");
        sb.append(this.f20515h);
        sb.append(")");
        return sb.toString();
    }
}
