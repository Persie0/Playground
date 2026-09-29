package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultLanguage {
    public static final C1704o1 Companion = new C1704o1();

    /* JADX INFO: renamed from: a */
    public final Integer f20863a;

    /* JADX INFO: renamed from: b */
    public final String f20864b;

    /* JADX INFO: renamed from: c */
    public final Boolean f20865c;

    /* JADX INFO: renamed from: d */
    public final String f20866d;

    /* JADX INFO: renamed from: e */
    public final String f20867e;

    /* JADX INFO: renamed from: f */
    public final Integer f20868f;

    /* JADX INFO: renamed from: g */
    public final String f20869g;

    /* JADX INFO: renamed from: h */
    public final String f20870h;

    /* JADX INFO: renamed from: i */
    public final Boolean f20871i;

    public /* synthetic */ ResultLanguage(int i, Integer num, String str, Boolean bool, String str2, String str3, Integer num2, String str4, String str5, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f20863a = null;
        } else {
            this.f20863a = num;
        }
        if ((i & 2) == 0) {
            this.f20864b = "";
        } else {
            this.f20864b = str;
        }
        if ((i & 4) == 0) {
            this.f20865c = null;
        } else {
            this.f20865c = bool;
        }
        if ((i & 8) == 0) {
            this.f20866d = null;
        } else {
            this.f20866d = str2;
        }
        if ((i & 16) == 0) {
            this.f20867e = null;
        } else {
            this.f20867e = str3;
        }
        if ((i & 32) == 0) {
            this.f20868f = null;
        } else {
            this.f20868f = num2;
        }
        if ((i & 64) == 0) {
            this.f20869g = null;
        } else {
            this.f20869g = str4;
        }
        if ((i & 128) == 0) {
            this.f20870h = null;
        } else {
            this.f20870h = str5;
        }
        if ((i & 256) == 0) {
            this.f20871i = null;
        } else {
            this.f20871i = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguage)) {
            return false;
        }
        ResultLanguage resultLanguage = (ResultLanguage) obj;
        return fa4.m11650l(this.f20863a, resultLanguage.f20863a) && fa4.m11650l(this.f20864b, resultLanguage.f20864b) && fa4.m11650l(this.f20865c, resultLanguage.f20865c) && fa4.m11650l(this.f20866d, resultLanguage.f20866d) && fa4.m11650l(this.f20867e, resultLanguage.f20867e) && fa4.m11650l(this.f20868f, resultLanguage.f20868f) && fa4.m11650l(this.f20869g, resultLanguage.f20869g) && fa4.m11650l(this.f20870h, resultLanguage.f20870h) && fa4.m11650l(this.f20871i, resultLanguage.f20871i);
    }

    public final int hashCode() {
        Integer num = this.f20863a;
        int iM22980c = ux5.m22980c((num == null ? 0 : num.hashCode()) * 31, this.f20864b, 31);
        Boolean bool = this.f20865c;
        int iHashCode = (iM22980c + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f20866d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20867e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f20868f;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f20869g;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20870h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.f20871i;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultLanguage(id=");
        sb.append(this.f20863a);
        sb.append(", code=");
        sb.append(this.f20864b);
        sb.append(", supported=");
        sb.append(this.f20865c);
        sb.append(", title=");
        sb.append(this.f20866d);
        sb.append(", lastUsed=");
        hn1.m13371u(sb, this.f20867e, ", knownWords=", this.f20868f, ", dictionaryLocaleActive=");
        AbstractC3393o1.m17725C(sb, this.f20869g, ", grammarResourceSlug=", this.f20870h, ", scheduledForDeletion=");
        sb.append(this.f20871i);
        sb.append(")");
        return sb.toString();
    }
}
