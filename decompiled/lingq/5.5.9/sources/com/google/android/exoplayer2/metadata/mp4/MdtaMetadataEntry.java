package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C2449a();

    /* JADX INFO: renamed from: a */
    public final String f12706a;

    /* JADX INFO: renamed from: b */
    public final byte[] f12707b;

    /* JADX INFO: renamed from: c */
    public final int f12708c;

    /* JADX INFO: renamed from: d */
    public final int f12709d;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry$a */
    public class C2449a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12706a = string;
        this.f12707b = parcel.createByteArray();
        this.f12708c = parcel.readInt();
        this.f12709d = parcel.readInt();
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.f12706a = str;
        this.f12707b = bArr;
        this.f12708c = i10;
        this.f12709d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            return this.f12706a.equals(mdtaMetadataEntry.f12706a) && Arrays.equals(this.f12707b, mdtaMetadataEntry.f12707b) && this.f12708c == mdtaMetadataEntry.f12708c && this.f12709d == mdtaMetadataEntry.f12709d;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f12707b) + C0166e.m758d(this.f12706a, 527, 31)) * 31) + this.f12708c) * 31) + this.f12709d;
    }

    public final String toString() {
        return "mdta: key=" + this.f12706a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12706a);
        parcel.writeByteArray(this.f12707b);
        parcel.writeInt(this.f12708c);
        parcel.writeInt(this.f12709d);
    }
}
