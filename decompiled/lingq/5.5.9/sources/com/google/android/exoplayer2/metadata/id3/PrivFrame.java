package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C2446a();

    /* JADX INFO: renamed from: b */
    public final String f12700b;

    /* JADX INFO: renamed from: c */
    public final byte[] f12701c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$a */
    public class C2446a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12700b = string;
        this.f12701c = parcel.createByteArray();
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f12700b = str;
        this.f12701c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return C10134c0.m19034a(this.f12700b, privFrame.f12700b) && Arrays.equals(this.f12701c, privFrame.f12701c);
    }

    public final int hashCode() {
        String str = this.f12700b;
        return Arrays.hashCode(this.f12701c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12691a + ": owner=" + this.f12700b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12700b);
        parcel.writeByteArray(this.f12701c);
    }
}
