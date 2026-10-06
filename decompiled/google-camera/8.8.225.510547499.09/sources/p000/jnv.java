package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnv extends jij {
    public static final Parcelable.Creator CREATOR = new jie(20);

    /* JADX INFO: renamed from: a */
    public final int f34422a;

    /* JADX INFO: renamed from: b */
    public final IBinder f34423b;

    /* JADX INFO: renamed from: c */
    public final IBinder f34424c;

    /* JADX INFO: renamed from: d */
    public final PendingIntent f34425d;

    /* JADX INFO: renamed from: e */
    public final String f34426e;

    public jnv(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f34422a = i;
        this.f34423b = iBinder;
        this.f34424c = iBinder2;
        this.f34425d = pendingIntent;
        this.f34426e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, jnc] */
    /* JADX INFO: renamed from: a */
    public static jnv m13395a(IInterface iInterface, jnc jncVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new jnv(1, iInterface, jncVar, null, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34422a);
        jiy.m13292s(parcel, 2, this.f34423b);
        jiy.m13292s(parcel, 3, this.f34424c);
        jiy.m13295v(parcel, 4, this.f34425d, i);
        jiy.m13296w(parcel, 6, this.f34426e);
        jiy.m13283j(parcel, iM13281h);
    }
}
