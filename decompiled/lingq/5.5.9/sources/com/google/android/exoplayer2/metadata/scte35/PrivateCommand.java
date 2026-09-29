package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C2454a();

    /* JADX INFO: renamed from: a */
    public final long f12721a;

    /* JADX INFO: renamed from: b */
    public final long f12722b;

    /* JADX INFO: renamed from: c */
    public final byte[] f12723c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$a */
    public class C2454a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f12721a = j11;
        this.f12722b = j10;
        this.f12723c = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f12721a = parcel.readLong();
        this.f12722b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i10 = C10134c0.f51354a;
        this.f12723c = bArrCreateByteArray;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12721a);
        parcel.writeLong(this.f12722b);
        parcel.writeByteArray(this.f12723c);
    }
}
