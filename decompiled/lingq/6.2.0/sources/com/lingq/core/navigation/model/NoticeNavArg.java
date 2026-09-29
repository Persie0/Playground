package com.lingq.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC3393o1;
import p000.fa4;
import p000.hfb;
import p000.ux5;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeNavArg implements Parcelable {
    public static final Parcelable.Creator<NoticeNavArg> CREATOR = new hfb(22);

    /* JADX INFO: renamed from: a */
    public final int f20291a;

    /* JADX INFO: renamed from: b */
    public final String f20292b;

    /* JADX INFO: renamed from: c */
    public final String f20293c;

    /* JADX INFO: renamed from: d */
    public final String f20294d;

    /* JADX INFO: renamed from: e */
    public final String f20295e;

    public /* synthetic */ NoticeNavArg(int i, String str, String str2, String str3, String str4, int i2, y52 y52Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeNavArg)) {
            return false;
        }
        NoticeNavArg noticeNavArg = (NoticeNavArg) obj;
        return this.f20291a == noticeNavArg.f20291a && fa4.m11650l(this.f20292b, noticeNavArg.f20292b) && fa4.m11650l(this.f20293c, noticeNavArg.f20293c) && fa4.m11650l(this.f20294d, noticeNavArg.f20294d) && fa4.m11650l(this.f20295e, noticeNavArg.f20295e);
    }

    public final int hashCode() {
        return this.f20295e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f20291a) * 31, this.f20292b, 31), this.f20293c, 31), this.f20294d, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20291a, "NoticeNavArg(id=", ", title=", this.f20292b, ", endDate=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20293c, ", startDate=", this.f20294d, ", noticeType=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f20295e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f20291a);
        parcel.writeString(this.f20292b);
        parcel.writeString(this.f20293c);
        parcel.writeString(this.f20294d);
        parcel.writeString(this.f20295e);
    }

    public NoticeNavArg(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f20291a = i;
        this.f20292b = str;
        this.f20293c = str2;
        this.f20294d = str3;
        this.f20295e = str4;
    }

    public NoticeNavArg() {
        this(0, null, null, null, null, 31, null);
    }
}
