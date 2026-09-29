package com.lingq.core.token;

import android.os.Parcel;
import android.os.Parcelable;
import p000.fa4;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenFragmentData implements Parcelable {
    public static final Parcelable.Creator<TokenFragmentData> CREATOR = new y3a(1);

    /* JADX INFO: renamed from: a */
    public final String f23315a;

    /* JADX INFO: renamed from: b */
    public final int f23316b;

    public TokenFragmentData(String str, int i) {
        str.getClass();
        this.f23315a = str;
        this.f23316b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenFragmentData)) {
            return false;
        }
        TokenFragmentData tokenFragmentData = (TokenFragmentData) obj;
        return fa4.m11650l(this.f23315a, tokenFragmentData.f23315a) && this.f23316b == tokenFragmentData.f23316b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23316b) + (this.f23315a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenFragmentData(fragment=" + this.f23315a + ", start=" + this.f23316b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f23315a);
        parcel.writeInt(this.f23316b);
    }

    public /* synthetic */ TokenFragmentData() {
        this("", -1);
    }
}
