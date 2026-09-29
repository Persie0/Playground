package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C2439a();

    /* JADX INFO: renamed from: b */
    public final byte[] f12672b;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$a */
    public class C2439a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public final BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame[] newArray(int i10) {
            return new BinaryFrame[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        super(string);
        this.f12672b = parcel.createByteArray();
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f12672b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BinaryFrame.class == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            return this.f12691a.equals(binaryFrame.f12691a) && Arrays.equals(this.f12672b, binaryFrame.f12672b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12672b) + C0166e.m758d(this.f12691a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12691a);
        parcel.writeByteArray(this.f12672b);
    }
}
