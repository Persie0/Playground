package com.lingq.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC3393o1;
import p000.C3670v2;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class TokenMeaningNavArg implements Parcelable {
    public static final Parcelable.Creator<TokenMeaningNavArg> CREATOR = new C3670v2(9);

    /* JADX INFO: renamed from: a */
    public final int f20296a;

    /* JADX INFO: renamed from: b */
    public final String f20297b;

    /* JADX INFO: renamed from: c */
    public final String f20298c;

    /* JADX INFO: renamed from: d */
    public final int f20299d;

    /* JADX INFO: renamed from: e */
    public final int f20300e;

    /* JADX INFO: renamed from: f */
    public final boolean f20301f;

    /* JADX INFO: renamed from: g */
    public final String f20302g;

    /* JADX INFO: renamed from: h */
    public final Integer f20303h;

    /* JADX INFO: renamed from: i */
    public final boolean f20304i;

    /* JADX INFO: renamed from: j */
    public final int f20305j;

    public /* synthetic */ TokenMeaningNavArg(int i, String str, String str2, int i2, int i3, boolean z, String str3, Integer num, boolean z2, int i4, int i5, y52 y52Var) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? false : z, (i5 & 64) != 0 ? null : str3, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? false : z2, (i5 & 512) != 0 ? 0 : i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenMeaningNavArg)) {
            return false;
        }
        TokenMeaningNavArg tokenMeaningNavArg = (TokenMeaningNavArg) obj;
        return this.f20296a == tokenMeaningNavArg.f20296a && fa4.m11650l(this.f20297b, tokenMeaningNavArg.f20297b) && fa4.m11650l(this.f20298c, tokenMeaningNavArg.f20298c) && this.f20299d == tokenMeaningNavArg.f20299d && this.f20300e == tokenMeaningNavArg.f20300e && this.f20301f == tokenMeaningNavArg.f20301f && fa4.m11650l(this.f20302g, tokenMeaningNavArg.f20302g) && fa4.m11650l(this.f20303h, tokenMeaningNavArg.f20303h) && this.f20304i == tokenMeaningNavArg.f20304i && this.f20305j == tokenMeaningNavArg.f20305j;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20296a) * 31;
        String str = this.f20297b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20298c;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f20300e, wq1.m24106b(this.f20299d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.f20301f);
        String str3 = this.f20302g;
        int iHashCode3 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f20303h;
        return Integer.hashCode(this.f20305j) + g9a.m12428e((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f20304i);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20296a, "TokenMeaningNavArg(id=", ", locale=", this.f20297b, ", text=");
        AbstractC3393o1.m17748w(this.f20299d, this.f20298c, ", termId=", ", popularity=", sbM22995r);
        hn1.m13368r(sbM22995r, this.f20300e, ", flagged=", this.f20301f, ", detectedLocale=");
        hn1.m13371u(sbM22995r, this.f20302g, ", creatorId=", this.f20303h, ", isGoogleTranslate=");
        sbM22995r.append(this.f20304i);
        sbM22995r.append(", wordId=");
        sbM22995r.append(this.f20305j);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.getClass();
        parcel.writeInt(this.f20296a);
        parcel.writeString(this.f20297b);
        parcel.writeString(this.f20298c);
        parcel.writeInt(this.f20299d);
        parcel.writeInt(this.f20300e);
        parcel.writeInt(this.f20301f ? 1 : 0);
        parcel.writeString(this.f20302g);
        Integer num = this.f20303h;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.f20304i ? 1 : 0);
        parcel.writeInt(this.f20305j);
    }

    public TokenMeaningNavArg(int i, String str, String str2, int i2, int i3, boolean z, String str3, Integer num, boolean z2, int i4) {
        this.f20296a = i;
        this.f20297b = str;
        this.f20298c = str2;
        this.f20299d = i2;
        this.f20300e = i3;
        this.f20301f = z;
        this.f20302g = str3;
        this.f20303h = num;
        this.f20304i = z2;
        this.f20305j = i4;
    }

    public TokenMeaningNavArg() {
        this(0, null, null, 0, 0, false, null, null, false, 0, 1023, null);
    }
}
