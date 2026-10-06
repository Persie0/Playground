package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtw extends jij {
    public static final Parcelable.Creator CREATOR = new jtt(4);

    /* JADX INFO: renamed from: a */
    public final int f34801a;

    /* JADX INFO: renamed from: b */
    public final int f34802b;

    /* JADX INFO: renamed from: c */
    public final byte[] f34803c;

    public jtw(int i, int i2, byte[] bArr) {
        this.f34801a = i;
        this.f34802b = i2;
        this.f34803c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34801a);
        jiy.m13287n(parcel, 2, this.f34802b);
        jiy.m13290q(parcel, 3, this.f34803c);
        jiy.m13283j(parcel, iM13281h);
    }
}
