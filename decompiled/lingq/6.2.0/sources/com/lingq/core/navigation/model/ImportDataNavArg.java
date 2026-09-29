package com.lingq.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C3670v2;
import p000.fa4;
import p000.ux5;
import p000.wq1;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class ImportDataNavArg implements Parcelable {
    public static final Parcelable.Creator<ImportDataNavArg> CREATOR = new C3670v2(3);

    /* JADX INFO: renamed from: a */
    public final String f20273a;

    /* JADX INFO: renamed from: b */
    public final String f20274b;

    /* JADX INFO: renamed from: c */
    public final String f20275c;

    /* JADX INFO: renamed from: d */
    public final String f20276d;

    public /* synthetic */ ImportDataNavArg(String str, String str2, String str3, String str4, int i, y52 y52Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportDataNavArg)) {
            return false;
        }
        ImportDataNavArg importDataNavArg = (ImportDataNavArg) obj;
        return fa4.m11650l(this.f20273a, importDataNavArg.f20273a) && fa4.m11650l(this.f20274b, importDataNavArg.f20274b) && fa4.m11650l(this.f20275c, importDataNavArg.f20275c) && fa4.m11650l(this.f20276d, importDataNavArg.f20276d);
    }

    public final int hashCode() {
        String str = this.f20273a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20274b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20275c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20276d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m23000w("ImportDataNavArg(title=", this.f20273a, ", url=", this.f20274b, ", imageUri="), this.f20275c, ", fileUri=", this.f20276d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f20273a);
        parcel.writeString(this.f20274b);
        parcel.writeString(this.f20275c);
        parcel.writeString(this.f20276d);
    }

    public ImportDataNavArg(String str, String str2, String str3, String str4) {
        this.f20273a = str;
        this.f20274b = str2;
        this.f20275c = str3;
        this.f20276d = str4;
    }

    public ImportDataNavArg() {
        this(null, null, null, null, 15, null);
    }
}
