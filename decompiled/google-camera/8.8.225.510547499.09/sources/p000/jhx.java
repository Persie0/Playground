package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhx extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(20);

    /* JADX INFO: renamed from: a */
    public final int f34096a;

    /* JADX INFO: renamed from: b */
    public final int f34097b;

    /* JADX INFO: renamed from: c */
    public final int f34098c;

    /* JADX INFO: renamed from: d */
    public final long f34099d;

    /* JADX INFO: renamed from: e */
    public final long f34100e;

    /* JADX INFO: renamed from: f */
    public final String f34101f;

    /* JADX INFO: renamed from: g */
    public final String f34102g;

    /* JADX INFO: renamed from: h */
    public final int f34103h;

    /* JADX INFO: renamed from: i */
    public final int f34104i;

    public jhx(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f34096a = i;
        this.f34097b = i2;
        this.f34098c = i3;
        this.f34099d = j;
        this.f34100e = j2;
        this.f34101f = str;
        this.f34102g = str2;
        this.f34103h = i4;
        this.f34104i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34096a);
        jiy.m13287n(parcel, 2, this.f34097b);
        jiy.m13287n(parcel, 3, this.f34098c);
        jiy.m13288o(parcel, 4, this.f34099d);
        jiy.m13288o(parcel, 5, this.f34100e);
        jiy.m13296w(parcel, 6, this.f34101f);
        jiy.m13296w(parcel, 7, this.f34102g);
        jiy.m13287n(parcel, 8, this.f34103h);
        jiy.m13287n(parcel, 9, this.f34104i);
        jiy.m13283j(parcel, iM13281h);
    }
}
