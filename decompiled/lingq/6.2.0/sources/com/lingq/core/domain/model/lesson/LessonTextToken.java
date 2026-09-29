package com.lingq.core.domain.model.lesson;

import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC3194a;
import p000.b25;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonTextToken {
    public static final C1450o Companion = new C1450o();

    /* JADX INFO: renamed from: o */
    public static final cs4[] f19276o = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b25(9))};

    /* JADX INFO: renamed from: a */
    public final String f19277a;

    /* JADX INFO: renamed from: b */
    public final String f19278b;

    /* JADX INFO: renamed from: c */
    public final boolean f19279c;

    /* JADX INFO: renamed from: d */
    public final String f19280d;

    /* JADX INFO: renamed from: e */
    public final String f19281e;

    /* JADX INFO: renamed from: f */
    public final LessonTransliteration f19282f;

    /* JADX INFO: renamed from: g */
    public final int f19283g;

    /* JADX INFO: renamed from: h */
    public final int f19284h;

    /* JADX INFO: renamed from: i */
    public final boolean f19285i;

    /* JADX INFO: renamed from: j */
    public final String f19286j;

    /* JADX INFO: renamed from: k */
    public final boolean f19287k;

    /* JADX INFO: renamed from: l */
    public final boolean f19288l;

    /* JADX INFO: renamed from: m */
    public final int f19289m;

    /* JADX INFO: renamed from: n */
    public final Map f19290n;

    public /* synthetic */ LessonTextToken(int i, String str, String str2, boolean z, String str3, String str4, LessonTransliteration lessonTransliteration, int i2, int i3, boolean z2, String str5, boolean z3, boolean z4, int i4, Map map) {
        if ((i & 1) == 0) {
            this.f19277a = null;
        } else {
            this.f19277a = str;
        }
        if ((i & 2) == 0) {
            this.f19278b = null;
        } else {
            this.f19278b = str2;
        }
        if ((i & 4) == 0) {
            this.f19279c = false;
        } else {
            this.f19279c = z;
        }
        if ((i & 8) == 0) {
            this.f19280d = null;
        } else {
            this.f19280d = str3;
        }
        if ((i & 16) == 0) {
            this.f19281e = null;
        } else {
            this.f19281e = str4;
        }
        if ((i & 32) == 0) {
            this.f19282f = null;
        } else {
            this.f19282f = lessonTransliteration;
        }
        if ((i & 64) == 0) {
            this.f19283g = 0;
        } else {
            this.f19283g = i2;
        }
        if ((i & 128) == 0) {
            this.f19284h = 0;
        } else {
            this.f19284h = i3;
        }
        if ((i & 256) == 0) {
            this.f19285i = false;
        } else {
            this.f19285i = z2;
        }
        if ((i & 512) == 0) {
            this.f19286j = null;
        } else {
            this.f19286j = str5;
        }
        if ((i & 1024) == 0) {
            this.f19287k = false;
        } else {
            this.f19287k = z3;
        }
        if ((i & 2048) == 0) {
            this.f19288l = false;
        } else {
            this.f19288l = z4;
        }
        if ((i & 4096) == 0) {
            this.f19289m = 0;
        } else {
            this.f19289m = i4;
        }
        this.f19290n = (i & 8192) == 0 ? AbstractC3194a.m15360M() : map;
    }

    /* JADX INFO: renamed from: a */
    public static LessonTextToken m8065a(LessonTextToken lessonTextToken, Map map) {
        String str = lessonTextToken.f19277a;
        String str2 = lessonTextToken.f19278b;
        boolean z = lessonTextToken.f19279c;
        String str3 = lessonTextToken.f19280d;
        String str4 = lessonTextToken.f19281e;
        LessonTransliteration lessonTransliteration = lessonTextToken.f19282f;
        int i = lessonTextToken.f19283g;
        int i2 = lessonTextToken.f19284h;
        boolean z2 = lessonTextToken.f19285i;
        String str5 = lessonTextToken.f19286j;
        boolean z3 = lessonTextToken.f19287k;
        boolean z4 = lessonTextToken.f19288l;
        int i3 = lessonTextToken.f19289m;
        map.getClass();
        return new LessonTextToken(str, str2, z, str3, str4, lessonTransliteration, i, i2, z2, str5, z3, z4, i3, map);
    }

    /* JADX INFO: renamed from: b */
    public final int m8066b() {
        return this.f19283g;
    }

    /* JADX INFO: renamed from: c */
    public final Map m8067c() {
        return this.f19290n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonTextToken)) {
            return false;
        }
        LessonTextToken lessonTextToken = (LessonTextToken) obj;
        return fa4.m11650l(this.f19277a, lessonTextToken.f19277a) && fa4.m11650l(this.f19278b, lessonTextToken.f19278b) && this.f19279c == lessonTextToken.f19279c && fa4.m11650l(this.f19280d, lessonTextToken.f19280d) && fa4.m11650l(this.f19281e, lessonTextToken.f19281e) && fa4.m11650l(this.f19282f, lessonTextToken.f19282f) && this.f19283g == lessonTextToken.f19283g && this.f19284h == lessonTextToken.f19284h && this.f19285i == lessonTextToken.f19285i && fa4.m11650l(this.f19286j, lessonTextToken.f19286j) && this.f19287k == lessonTextToken.f19287k && this.f19288l == lessonTextToken.f19288l && this.f19289m == lessonTextToken.f19289m && fa4.m11650l(this.f19290n, lessonTextToken.f19290n);
    }

    public final int hashCode() {
        String str = this.f19277a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19278b;
        int iM12428e = g9a.m12428e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f19279c);
        String str3 = this.f19280d;
        int iHashCode2 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19281e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LessonTransliteration lessonTransliteration = this.f19282f;
        int iM12428e2 = g9a.m12428e(wq1.m24106b(this.f19284h, wq1.m24106b(this.f19283g, (iHashCode3 + (lessonTransliteration == null ? 0 : lessonTransliteration.hashCode())) * 31, 31), 31), 31, this.f19285i);
        String str5 = this.f19286j;
        return this.f19290n.hashCode() + wq1.m24106b(this.f19289m, g9a.m12428e(g9a.m12428e((iM12428e2 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f19287k), 31, this.f19288l), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LessonTextToken(punct=", this.f19277a, ", whitespace=", this.f19278b, ", isNumber=");
        hn1.m13367q(", opentag=", this.f19280d, ", closetag=", sbM23000w, this.f19279c);
        sbM23000w.append(this.f19281e);
        sbM23000w.append(", transliteration=");
        sbM23000w.append(this.f19282f);
        sbM23000w.append(", index=");
        hn1.m13360j(this.f19283g, this.f19284h, ", indexInSentence=", ", isIgnored=", sbM23000w);
        hn1.m13367q(", text=", this.f19286j, ", isUnknown=", sbM23000w, this.f19285i);
        wq1.m24101A(sbM23000w, this.f19287k, ", isKnown=", this.f19288l, ", wordId=");
        sbM23000w.append(this.f19289m);
        sbM23000w.append(", translation=");
        sbM23000w.append(this.f19290n);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public LessonTextToken(String str, String str2, boolean z, String str3, String str4, LessonTransliteration lessonTransliteration, int i, int i2, boolean z2, String str5, boolean z3, boolean z4, int i3, Map map) {
        map.getClass();
        this.f19277a = str;
        this.f19278b = str2;
        this.f19279c = z;
        this.f19280d = str3;
        this.f19281e = str4;
        this.f19282f = lessonTransliteration;
        this.f19283g = i;
        this.f19284h = i2;
        this.f19285i = z2;
        this.f19286j = str5;
        this.f19287k = z3;
        this.f19288l = z4;
        this.f19289m = i3;
        this.f19290n = map;
    }
}
