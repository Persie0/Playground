package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C2445a();

    /* JADX INFO: renamed from: b */
    public final int f12695b;

    /* JADX INFO: renamed from: c */
    public final int f12696c;

    /* JADX INFO: renamed from: d */
    public final int f12697d;

    /* JADX INFO: renamed from: e */
    public final int[] f12698e;

    /* JADX INFO: renamed from: f */
    public final int[] f12699f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.MlltFrame$a */
    public class C2445a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public final MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame[] newArray(int i10) {
            return new MlltFrame[i10];
        }
    }

    public MlltFrame(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12695b = i10;
        this.f12696c = i11;
        this.f12697d = i12;
        this.f12698e = iArr;
        this.f12699f = iArr2;
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f12695b = parcel.readInt();
        this.f12696c = parcel.readInt();
        this.f12697d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = C10134c0.f51354a;
        this.f12698e = iArrCreateIntArray;
        this.f12699f = parcel.createIntArray();
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MlltFrame.class == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            return this.f12695b == mlltFrame.f12695b && this.f12696c == mlltFrame.f12696c && this.f12697d == mlltFrame.f12697d && Arrays.equals(this.f12698e, mlltFrame.f12698e) && Arrays.equals(this.f12699f, mlltFrame.f12699f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12699f) + ((Arrays.hashCode(this.f12698e) + ((((((527 + this.f12695b) * 31) + this.f12696c) * 31) + this.f12697d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12695b);
        parcel.writeInt(this.f12696c);
        parcel.writeInt(this.f12697d);
        parcel.writeIntArray(this.f12698e);
        parcel.writeIntArray(this.f12699f);
    }
}
