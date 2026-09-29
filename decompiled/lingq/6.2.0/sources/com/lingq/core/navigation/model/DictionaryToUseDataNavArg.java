package com.lingq.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C3670v2;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
public final class DictionaryToUseDataNavArg implements Parcelable {
    public static final Parcelable.Creator<DictionaryToUseDataNavArg> CREATOR = new C3670v2(1);

    /* JADX INFO: renamed from: a */
    public final String f20269a;

    /* JADX INFO: renamed from: b */
    public final String f20270b;

    /* JADX INFO: renamed from: c */
    public final String f20271c;

    /* JADX INFO: renamed from: d */
    public final String f20272d;

    public DictionaryToUseDataNavArg(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f20269a = str;
        this.f20270b = str2;
        this.f20271c = str3;
        this.f20272d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryToUseDataNavArg)) {
            return false;
        }
        DictionaryToUseDataNavArg dictionaryToUseDataNavArg = (DictionaryToUseDataNavArg) obj;
        return this.f20269a.equals(dictionaryToUseDataNavArg.f20269a) && this.f20270b.equals(dictionaryToUseDataNavArg.f20270b) && this.f20271c.equals(dictionaryToUseDataNavArg.f20271c) && this.f20272d.equals(dictionaryToUseDataNavArg.f20272d);
    }

    public final int hashCode() {
        return this.f20272d.hashCode() + ux5.m22980c(ux5.m22980c(this.f20269a.hashCode() * 31, this.f20270b, 31), this.f20271c, 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m23000w("DictionaryToUseDataNavArg(term=", this.f20269a, ", urlToSend=", this.f20270b, ", dictionaryTitle="), this.f20271c, ", languageTo=", this.f20272d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f20269a);
        parcel.writeString(this.f20270b);
        parcel.writeString(this.f20271c);
        parcel.writeString(this.f20272d);
    }
}
