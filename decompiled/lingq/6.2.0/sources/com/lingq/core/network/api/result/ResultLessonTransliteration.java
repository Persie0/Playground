package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.z88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonTransliteration {
    public static final C1663h2 Companion = new C1663h2();

    /* JADX INFO: renamed from: a */
    public final String f21193a;

    /* JADX INFO: renamed from: b */
    public final String f21194b;

    /* JADX INFO: renamed from: c */
    public final String f21195c;

    /* JADX INFO: renamed from: d */
    public final String f21196d;

    /* JADX INFO: renamed from: e */
    public final String f21197e;

    /* JADX INFO: renamed from: f */
    public final String f21198f;

    /* JADX INFO: renamed from: g */
    public final z88 f21199g;

    /* JADX INFO: renamed from: h */
    public final String f21200h;

    public /* synthetic */ ResultLessonTransliteration(int i, String str, String str2, String str3, String str4, String str5, String str6, z88 z88Var, String str7) {
        if ((i & 1) == 0) {
            this.f21193a = null;
        } else {
            this.f21193a = str;
        }
        if ((i & 2) == 0) {
            this.f21194b = null;
        } else {
            this.f21194b = str2;
        }
        if ((i & 4) == 0) {
            this.f21195c = null;
        } else {
            this.f21195c = str3;
        }
        if ((i & 8) == 0) {
            this.f21196d = null;
        } else {
            this.f21196d = str4;
        }
        if ((i & 16) == 0) {
            this.f21197e = null;
        } else {
            this.f21197e = str5;
        }
        if ((i & 32) == 0) {
            this.f21198f = null;
        } else {
            this.f21198f = str6;
        }
        if ((i & 64) == 0) {
            this.f21199g = null;
        } else {
            this.f21199g = z88Var;
        }
        if ((i & 128) == 0) {
            this.f21200h = null;
        } else {
            this.f21200h = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonTransliteration)) {
            return false;
        }
        ResultLessonTransliteration resultLessonTransliteration = (ResultLessonTransliteration) obj;
        return fa4.m11650l(this.f21193a, resultLessonTransliteration.f21193a) && fa4.m11650l(this.f21194b, resultLessonTransliteration.f21194b) && fa4.m11650l(this.f21195c, resultLessonTransliteration.f21195c) && fa4.m11650l(this.f21196d, resultLessonTransliteration.f21196d) && fa4.m11650l(this.f21197e, resultLessonTransliteration.f21197e) && fa4.m11650l(this.f21198f, resultLessonTransliteration.f21198f) && fa4.m11650l(this.f21199g, resultLessonTransliteration.f21199g) && fa4.m11650l(this.f21200h, resultLessonTransliteration.f21200h);
    }

    public final int hashCode() {
        String str = this.f21193a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21194b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21195c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21196d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21197e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21198f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        z88 z88Var = this.f21199g;
        int iHashCode7 = (iHashCode6 + (z88Var == null ? 0 : z88Var.hashCode())) * 31;
        String str7 = this.f21200h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultLessonTransliteration(hiragana=", this.f21193a, ", romaji=", this.f21194b, ", pinyin=");
        AbstractC3393o1.m17725C(sbM23000w, this.f21195c, ", hant=", this.f21196d, ", hans=");
        AbstractC3393o1.m17725C(sbM23000w, this.f21197e, ", jyutping=", this.f21198f, ", furigana=");
        sbM23000w.append(this.f21199g);
        sbM23000w.append(", latin=");
        sbM23000w.append(this.f21200h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
