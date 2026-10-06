package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class jnx extends jij {
    public static final Parcelable.Creator CREATOR = new jny(0);

    /* JADX INFO: renamed from: a */
    public final int f34428a;

    /* JADX INFO: renamed from: b */
    public final jnw f34429b;

    /* JADX INFO: renamed from: c */
    public final PendingIntent f34430c;

    /* JADX INFO: renamed from: d */
    public final String f34431d;

    /* JADX INFO: renamed from: e */
    private final jnc f34432e;

    /* JADX INFO: renamed from: f */
    private final jnj f34433f;

    /* JADX INFO: renamed from: g */
    private final jmz f34434g;

    public jnx(int i, jnw jnwVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        jnc jnaVar;
        jmz jmzVar;
        this.f34428a = i;
        this.f34429b = jnwVar;
        jnj jnhVar = null;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            jnaVar = iInterfaceQueryLocalInterface instanceof jnc ? (jnc) iInterfaceQueryLocalInterface : new jna(iBinder);
        } else {
            jnaVar = null;
        }
        this.f34432e = jnaVar;
        this.f34430c = pendingIntent;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            jmzVar = iInterfaceQueryLocalInterface2 instanceof jmz ? (jmz) iInterfaceQueryLocalInterface2 : new jmz(iBinder2);
        } else {
            jmzVar = null;
        }
        this.f34434g = jmzVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            jnhVar = iInterfaceQueryLocalInterface3 instanceof jnj ? (jnj) iInterfaceQueryLocalInterface3 : new jnh(iBinder3);
        }
        this.f34433f = jnhVar;
        this.f34431d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34428a);
        jiy.m13295v(parcel, 2, this.f34429b, i);
        jnc jncVar = this.f34432e;
        jiy.m13292s(parcel, 3, jncVar == null ? null : jncVar.asBinder());
        jiy.m13295v(parcel, 4, this.f34430c, i);
        jmz jmzVar = this.f34434g;
        jiy.m13292s(parcel, 5, jmzVar == null ? null : jmzVar.f4962a);
        jnj jnjVar = this.f34433f;
        jiy.m13292s(parcel, 6, jnjVar != null ? jnjVar.asBinder() : null);
        jiy.m13296w(parcel, 8, this.f34431d);
        jiy.m13283j(parcel, iM13281h);
    }
}
