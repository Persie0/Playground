package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class FastSearchResult {
    public static final C1660h Companion = new C1660h();

    /* JADX INFO: renamed from: a */
    public final int f20524a;

    /* JADX INFO: renamed from: b */
    public final String f20525b;

    /* JADX INFO: renamed from: c */
    public final String f20526c;

    /* JADX INFO: renamed from: d */
    public final String f20527d;

    /* JADX INFO: renamed from: e */
    public final Boolean f20528e;

    /* JADX INFO: renamed from: f */
    public final String f20529f;

    /* JADX INFO: renamed from: g */
    public final ResultLessonMediaSource f20530g;

    /* JADX INFO: renamed from: h */
    public final String f20531h;

    /* JADX INFO: renamed from: i */
    public final Integer f20532i;

    public /* synthetic */ FastSearchResult(int i, int i2, String str, String str2, String str3, Boolean bool, String str4, ResultLessonMediaSource resultLessonMediaSource, String str5, Integer num) {
        this.f20524a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20525b = "";
        } else {
            this.f20525b = str;
        }
        if ((i & 4) == 0) {
            this.f20526c = "";
        } else {
            this.f20526c = str2;
        }
        if ((i & 8) == 0) {
            this.f20527d = "";
        } else {
            this.f20527d = str3;
        }
        if ((i & 16) == 0) {
            this.f20528e = null;
        } else {
            this.f20528e = bool;
        }
        if ((i & 32) == 0) {
            this.f20529f = null;
        } else {
            this.f20529f = str4;
        }
        if ((i & 64) == 0) {
            this.f20530g = null;
        } else {
            this.f20530g = resultLessonMediaSource;
        }
        if ((i & 128) == 0) {
            this.f20531h = null;
        } else {
            this.f20531h = str5;
        }
        if ((i & 256) == 0) {
            this.f20532i = null;
        } else {
            this.f20532i = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastSearchResult)) {
            return false;
        }
        FastSearchResult fastSearchResult = (FastSearchResult) obj;
        return this.f20524a == fastSearchResult.f20524a && fa4.m11650l(this.f20525b, fastSearchResult.f20525b) && fa4.m11650l(this.f20526c, fastSearchResult.f20526c) && fa4.m11650l(this.f20527d, fastSearchResult.f20527d) && fa4.m11650l(this.f20528e, fastSearchResult.f20528e) && fa4.m11650l(this.f20529f, fastSearchResult.f20529f) && fa4.m11650l(this.f20530g, fastSearchResult.f20530g) && fa4.m11650l(this.f20531h, fastSearchResult.f20531h) && fa4.m11650l(this.f20532i, fastSearchResult.f20532i);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f20524a) * 31, this.f20525b, 31), this.f20526c, 31), this.f20527d, 31);
        Boolean bool = this.f20528e;
        int iHashCode = (iM22980c + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f20529f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ResultLessonMediaSource resultLessonMediaSource = this.f20530g;
        int iHashCode3 = (iHashCode2 + (resultLessonMediaSource == null ? 0 : resultLessonMediaSource.hashCode())) * 31;
        String str2 = this.f20531h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20532i;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20524a, "FastSearchResult(id=", ", title=", this.f20525b, ", type=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20526c, ", imageUrl=", this.f20527d, ", isTaken=");
        sbM22995r.append(this.f20528e);
        sbM22995r.append(", status=");
        sbM22995r.append(this.f20529f);
        sbM22995r.append(", source=");
        sbM22995r.append(this.f20530g);
        sbM22995r.append(", audioUrl=");
        sbM22995r.append(this.f20531h);
        sbM22995r.append(", duration=");
        sbM22995r.append(this.f20532i);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
