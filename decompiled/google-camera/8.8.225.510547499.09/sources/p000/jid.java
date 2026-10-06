package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jid extends jij {
    public static final Parcelable.Creator CREATOR = new jie(0);

    /* JADX INFO: renamed from: a */
    final int f34113a;

    /* JADX INFO: renamed from: b */
    final IBinder f34114b;

    /* JADX INFO: renamed from: c */
    public final jcu f34115c;

    /* JADX INFO: renamed from: d */
    public final boolean f34116d;

    /* JADX INFO: renamed from: e */
    public final boolean f34117e;

    public jid(int i, IBinder iBinder, jcu jcuVar, boolean z, boolean z2) {
        this.f34113a = i;
        this.f34114b = iBinder;
        this.f34115c = jcuVar;
        this.f34116d = z;
        this.f34117e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final jhp m13222a() {
        IBinder iBinder = this.f34114b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof jhp ? (jhp) iInterfaceQueryLocalInterface : new jhp(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jid)) {
            return false;
        }
        jid jidVar = (jid) obj;
        return this.f34115c.equals(jidVar.f34115c) && jib.m13209n(m13222a(), jidVar.m13222a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34113a);
        jiy.m13292s(parcel, 2, this.f34114b);
        jiy.m13295v(parcel, 3, this.f34115c, i);
        jiy.m13284k(parcel, 4, this.f34116d);
        jiy.m13284k(parcel, 5, this.f34117e);
        jiy.m13283j(parcel, iM13281h);
    }
}
