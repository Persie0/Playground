package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new C2432a();

    /* JADX INFO: renamed from: a */
    public final int f12639a;

    /* JADX INFO: renamed from: b */
    public final String f12640b;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable$a */
    public class C2432a implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        public final AppInfoTable createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return new AppInfoTable(string, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AppInfoTable[] newArray(int i10) {
            return new AppInfoTable[i10];
        }
    }

    public AppInfoTable(String str, int i10) {
        this.f12639a = i10;
        this.f12640b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f12639a);
        sb2.append(",url=");
        return C0009a.m23l(sb2, this.f12640b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12640b);
        parcel.writeInt(this.f12639a);
    }
}
