package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joc extends jij {
    public static final Parcelable.Creator CREATOR = new jny(4);

    /* JADX INFO: renamed from: a */
    public final byte[] f34448a;

    public joc(byte[] bArr) {
        this.f34448a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13290q(parcel, 2, this.f34448a);
        jiy.m13283j(parcel, iM13281h);
    }
}
