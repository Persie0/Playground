package com.lingq.core.domain.model.language;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LanguageToLearn {
    public static final C1432l Companion = new C1432l();

    /* JADX INFO: renamed from: a */
    public final String f19113a;

    /* JADX INFO: renamed from: b */
    public final boolean f19114b;

    /* JADX INFO: renamed from: c */
    public final String f19115c;

    /* JADX INFO: renamed from: d */
    public final int f19116d;

    /* JADX INFO: renamed from: e */
    public final int f19117e;

    /* JADX INFO: renamed from: f */
    public final String f19118f;

    /* JADX INFO: renamed from: g */
    public final String f19119g;

    /* JADX INFO: renamed from: h */
    public final boolean f19120h;

    public /* synthetic */ LanguageToLearn(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, LanguageToLearn$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19113a = str;
        if ((i & 2) == 0) {
            this.f19114b = true;
        } else {
            this.f19114b = z;
        }
        if ((i & 4) == 0) {
            this.f19115c = "";
        } else {
            this.f19115c = str2;
        }
        if ((i & 8) == 0) {
            this.f19116d = 0;
        } else {
            this.f19116d = i2;
        }
        if ((i & 16) == 0) {
            this.f19117e = 0;
        } else {
            this.f19117e = i3;
        }
        if ((i & 32) == 0) {
            this.f19118f = "";
        } else {
            this.f19118f = str3;
        }
        if ((i & 64) == 0) {
            this.f19119g = "";
        } else {
            this.f19119g = str4;
        }
        if ((i & 128) == 0) {
            this.f19120h = false;
        } else {
            this.f19120h = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageToLearn)) {
            return false;
        }
        LanguageToLearn languageToLearn = (LanguageToLearn) obj;
        return fa4.m11650l(this.f19113a, languageToLearn.f19113a) && this.f19114b == languageToLearn.f19114b && fa4.m11650l(this.f19115c, languageToLearn.f19115c) && this.f19116d == languageToLearn.f19116d && this.f19117e == languageToLearn.f19117e && fa4.m11650l(this.f19118f, languageToLearn.f19118f) && fa4.m11650l(this.f19119g, languageToLearn.f19119g) && this.f19120h == languageToLearn.f19120h;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f19117e, wq1.m24106b(this.f19116d, ux5.m22980c(g9a.m12428e(this.f19113a.hashCode() * 31, 31, this.f19114b), this.f19115c, 31), 31), 31);
        String str = this.f19118f;
        int iHashCode = (iM24106b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19119g;
        return Boolean.hashCode(this.f19120h) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageToLearn(code=");
        sb.append(this.f19113a);
        sb.append(", supported=");
        sb.append(this.f19114b);
        sb.append(", title=");
        AbstractC3393o1.m17748w(this.f19116d, this.f19115c, ", knownWords=", ", id=", sb);
        hn1.m13361k(this.f19117e, ", dictionaryLocaleActive=", this.f19118f, ", lastUsed=", sb);
        sb.append(this.f19119g);
        sb.append(", scheduledForDeletion=");
        sb.append(this.f19120h);
        sb.append(")");
        return sb.toString();
    }

    public LanguageToLearn(String str, boolean z, String str2, int i, int i2, String str3, String str4, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f19113a = str;
        this.f19114b = z;
        this.f19115c = str2;
        this.f19116d = i;
        this.f19117e = i2;
        this.f19118f = str3;
        this.f19119g = str4;
        this.f19120h = z2;
    }

    public /* synthetic */ LanguageToLearn(String str, boolean z, String str2, int i, String str3, String str4, boolean z2, int i2) {
        this(str, (i2 & 2) != 0 ? true : z, str2, (i2 & 8) != 0 ? 0 : i, 0, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? false : z2);
    }
}
