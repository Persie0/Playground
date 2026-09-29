package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonTransliteration {
    public static final C1452q Companion = new C1452q();

    /* JADX INFO: renamed from: a */
    public final String f19299a;

    /* JADX INFO: renamed from: b */
    public final String f19300b;

    /* JADX INFO: renamed from: c */
    public final String f19301c;

    /* JADX INFO: renamed from: d */
    public final String f19302d;

    /* JADX INFO: renamed from: e */
    public final String f19303e;

    /* JADX INFO: renamed from: f */
    public final String f19304f;

    /* JADX INFO: renamed from: g */
    public final LessonFurigana f19305g;

    /* JADX INFO: renamed from: h */
    public final String f19306h;

    public /* synthetic */ LessonTransliteration(int i, String str, String str2, String str3, String str4, String str5, String str6, LessonFurigana lessonFurigana, String str7) {
        if ((i & 1) == 0) {
            this.f19299a = null;
        } else {
            this.f19299a = str;
        }
        if ((i & 2) == 0) {
            this.f19300b = null;
        } else {
            this.f19300b = str2;
        }
        if ((i & 4) == 0) {
            this.f19301c = null;
        } else {
            this.f19301c = str3;
        }
        if ((i & 8) == 0) {
            this.f19302d = null;
        } else {
            this.f19302d = str4;
        }
        if ((i & 16) == 0) {
            this.f19303e = null;
        } else {
            this.f19303e = str5;
        }
        if ((i & 32) == 0) {
            this.f19304f = null;
        } else {
            this.f19304f = str6;
        }
        if ((i & 64) == 0) {
            this.f19305g = null;
        } else {
            this.f19305g = lessonFurigana;
        }
        if ((i & 128) == 0) {
            this.f19306h = null;
        } else {
            this.f19306h = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonTransliteration)) {
            return false;
        }
        LessonTransliteration lessonTransliteration = (LessonTransliteration) obj;
        return fa4.m11650l(this.f19299a, lessonTransliteration.f19299a) && fa4.m11650l(this.f19300b, lessonTransliteration.f19300b) && fa4.m11650l(this.f19301c, lessonTransliteration.f19301c) && fa4.m11650l(this.f19302d, lessonTransliteration.f19302d) && fa4.m11650l(this.f19303e, lessonTransliteration.f19303e) && fa4.m11650l(this.f19304f, lessonTransliteration.f19304f) && fa4.m11650l(this.f19305g, lessonTransliteration.f19305g) && fa4.m11650l(this.f19306h, lessonTransliteration.f19306h);
    }

    public final int hashCode() {
        String str = this.f19299a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19300b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19301c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19302d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19303e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19304f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LessonFurigana lessonFurigana = this.f19305g;
        int iHashCode7 = (iHashCode6 + (lessonFurigana == null ? 0 : lessonFurigana.hashCode())) * 31;
        String str7 = this.f19306h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LessonTransliteration(hiragana=", this.f19299a, ", romaji=", this.f19300b, ", pinyin=");
        AbstractC3393o1.m17725C(sbM23000w, this.f19301c, ", hant=", this.f19302d, ", hans=");
        AbstractC3393o1.m17725C(sbM23000w, this.f19303e, ", jyutping=", this.f19304f, ", furigana=");
        sbM23000w.append(this.f19305g);
        sbM23000w.append(", latin=");
        sbM23000w.append(this.f19306h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public LessonTransliteration(String str, String str2, String str3, String str4, String str5, String str6, LessonFurigana lessonFurigana, String str7) {
        this.f19299a = str;
        this.f19300b = str2;
        this.f19301c = str3;
        this.f19302d = str4;
        this.f19303e = str5;
        this.f19304f = str6;
        this.f19305g = lessonFurigana;
        this.f19306h = str7;
    }
}
