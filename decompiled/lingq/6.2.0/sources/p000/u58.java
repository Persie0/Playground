package p000;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class u58 {

    /* JADX INFO: renamed from: a */
    public final byte[] f63448a;

    /* JADX INFO: renamed from: b */
    public final String f63449b;

    /* JADX INFO: renamed from: c */
    public final long f63450c;

    public u58(Parcel parcel) {
        parcel.getClass();
        byte[] bArr = new byte[parcel.readInt()];
        this.f63448a = bArr;
        parcel.readByteArray(bArr);
        String string = parcel.readString();
        string.getClass();
        this.f63449b = string;
        this.f63450c = parcel.readLong();
    }
}
