package com.lingq.core.token.edit;

import android.os.Parcel;
import android.os.Parcelable;
import p000.fa4;
import p000.ux5;
import p000.y3a;
import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenEditData implements Parcelable {
    public static final Parcelable.Creator<TokenEditData> CREATOR = new y3a(0);

    /* JADX INFO: renamed from: a */
    public final TokenEditType f23913a;

    /* JADX INFO: renamed from: b */
    public final String f23914b;

    /* JADX INFO: renamed from: c */
    public final Object f23915c;

    public TokenEditData(TokenEditType tokenEditType, String str, Object obj) {
        tokenEditType.getClass();
        str.getClass();
        this.f23913a = tokenEditType;
        this.f23914b = str;
        this.f23915c = obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenEditData)) {
            return false;
        }
        TokenEditData tokenEditData = (TokenEditData) obj;
        return this.f23913a == tokenEditData.f23913a && fa4.m11650l(this.f23914b, tokenEditData.f23914b) && fa4.m11650l(this.f23915c, tokenEditData.f23915c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f23913a.hashCode() * 31, this.f23914b, 31);
        Object obj = this.f23915c;
        return iM22980c + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "TokenEditData(type=" + this.f23913a + ", text=" + this.f23914b + ", data=" + this.f23915c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f23913a.name());
        parcel.writeString(this.f23914b);
        parcel.writeValue(this.f23915c);
    }

    public /* synthetic */ TokenEditData(TokenEditType tokenEditType, String str, Object obj, int i, y52 y52Var) {
        this(tokenEditType, str, (i & 4) != 0 ? null : obj);
    }
}
