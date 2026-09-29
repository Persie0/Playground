package com.lingq.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C3670v2;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryTabNavArg implements Parcelable {
    public static final Parcelable.Creator<LibraryTabNavArg> CREATOR = new C3670v2(5);

    /* JADX INFO: renamed from: a */
    public final String f20285a;

    /* JADX INFO: renamed from: b */
    public final String f20286b;

    /* JADX INFO: renamed from: c */
    public final int f20287c;

    /* JADX INFO: renamed from: d */
    public final boolean f20288d;

    /* JADX INFO: renamed from: e */
    public final int f20289e;

    /* JADX INFO: renamed from: f */
    public final String f20290f;

    public /* synthetic */ LibraryTabNavArg(String str, String str2, int i, boolean z, int i2, String str3, int i3, y52 y52Var) {
        this((i3 & 1) != 0 ? "Lessons" : str, str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryTabNavArg)) {
            return false;
        }
        LibraryTabNavArg libraryTabNavArg = (LibraryTabNavArg) obj;
        return fa4.m11650l(this.f20285a, libraryTabNavArg.f20285a) && fa4.m11650l(this.f20286b, libraryTabNavArg.f20286b) && this.f20287c == libraryTabNavArg.f20287c && this.f20288d == libraryTabNavArg.f20288d && this.f20289e == libraryTabNavArg.f20289e && fa4.m11650l(this.f20290f, libraryTabNavArg.f20290f);
    }

    public final int hashCode() {
        return this.f20290f.hashCode() + wq1.m24106b(this.f20289e, g9a.m12428e(wq1.m24106b(this.f20287c, ux5.m22980c(this.f20285a.hashCode() * 31, this.f20286b, 31), 31), 31, this.f20288d), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LibraryTabNavArg(title=", this.f20285a, ", display=", this.f20286b, ", level=");
        hn1.m13368r(sbM23000w, this.f20287c, ", selected=", this.f20288d, ", index=");
        sbM23000w.append(this.f20289e);
        sbM23000w.append(", apiUrl=");
        sbM23000w.append(this.f20290f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f20285a);
        parcel.writeString(this.f20286b);
        parcel.writeInt(this.f20287c);
        parcel.writeInt(this.f20288d ? 1 : 0);
        parcel.writeInt(this.f20289e);
        parcel.writeString(this.f20290f);
    }

    public LibraryTabNavArg(String str, String str2, int i, boolean z, int i2, String str3) {
        ux5.m22974A(str, str2, str3);
        this.f20285a = str;
        this.f20286b = str2;
        this.f20287c = i;
        this.f20288d = z;
        this.f20289e = i2;
        this.f20290f = str3;
    }
}
