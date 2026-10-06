package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtk extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(15);

    /* JADX INFO: renamed from: a */
    public final int f34777a;

    /* JADX INFO: renamed from: b */
    public final String f34778b;

    /* JADX INFO: renamed from: c */
    public final byte[] f34779c;

    /* JADX INFO: renamed from: d */
    public final String f34780d;

    public jtk(int i, String str, byte[] bArr, String str2) {
        this.f34777a = i;
        this.f34778b = str;
        this.f34779c = bArr;
        this.f34780d = str2;
    }

    public final String toString() {
        int i = this.f34777a;
        String str = this.f34778b;
        byte[] bArr = this.f34779c;
        return "MessageEventParcelable[" + i + "," + str + ", size=" + (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34777a);
        jiy.m13296w(parcel, 3, this.f34778b);
        jiy.m13290q(parcel, 4, this.f34779c);
        jiy.m13296w(parcel, 5, this.f34780d);
        jiy.m13283j(parcel, iM13281h);
    }
}
