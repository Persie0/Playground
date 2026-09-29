package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C2467q;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C2437a();

    /* JADX INFO: renamed from: a */
    public final byte[] f12665a;

    /* JADX INFO: renamed from: b */
    public final String f12666b;

    /* JADX INFO: renamed from: c */
    public final String f12667c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.icy.IcyInfo$a */
    public class C2437a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f12665a = bArrCreateByteArray;
        this.f12666b = parcel.readString();
        this.f12667c = parcel.readString();
    }

    public IcyInfo(String str, String str2, byte[] bArr) {
        this.f12665a = bArr;
        this.f12666b = str;
        this.f12667c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12665a, ((IcyInfo) obj).f12665a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12665a);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: s */
    public final void mo7206s(C2467q.a aVar) {
        String str = this.f12666b;
        if (str != null) {
            aVar.f12947a = str;
        }
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f12666b, this.f12667c, Integer.valueOf(this.f12665a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f12665a);
        parcel.writeString(this.f12666b);
        parcel.writeString(this.f12667c);
    }
}
