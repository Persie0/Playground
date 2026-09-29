package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C2465a();

    /* JADX INFO: renamed from: a */
    public final int f12761a;

    /* JADX INFO: renamed from: b */
    public final int f12762b;

    /* JADX INFO: renamed from: c */
    public final int f12763c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.StreamKey$a */
    public class C2465a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(Parcel parcel) {
        this.f12761a = parcel.readInt();
        this.f12762b = parcel.readInt();
        this.f12763c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i10 = this.f12761a - streamKey2.f12761a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f12762b - streamKey2.f12762b;
        return i11 == 0 ? this.f12763c - streamKey2.f12763c : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f12761a == streamKey.f12761a && this.f12762b == streamKey.f12762b && this.f12763c == streamKey.f12763c;
    }

    public final int hashCode() {
        return (((this.f12761a * 31) + this.f12762b) * 31) + this.f12763c;
    }

    public final String toString() {
        return this.f12761a + "." + this.f12762b + "." + this.f12763c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12761a);
        parcel.writeInt(this.f12762b);
        parcel.writeInt(this.f12763c);
    }
}
