package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdi extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(9);

    /* JADX INFO: renamed from: a */
    public final String f33784a;

    /* JADX INFO: renamed from: b */
    public final boolean f33785b;

    /* JADX INFO: renamed from: c */
    public final boolean f33786c;

    /* JADX INFO: renamed from: d */
    public final boolean f33787d;

    /* JADX INFO: renamed from: e */
    public final boolean f33788e;

    /* JADX INFO: renamed from: f */
    private final Context f33789f;

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, jjc] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f33784a);
        jiy.m13284k(parcel, 2, this.f33785b);
        jiy.m13284k(parcel, 3, this.f33786c);
        jiy.m13292s(parcel, 4, jjb.m13304b(this.f33789f));
        jiy.m13284k(parcel, 5, this.f33787d);
        jiy.m13284k(parcel, 6, this.f33788e);
        jiy.m13283j(parcel, iM13281h);
    }

    public jdi(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        jjc jjaVar;
        this.f33784a = str;
        this.f33785b = z;
        this.f33786c = z2;
        if (iBinder == null) {
            jjaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            jjaVar = iInterfaceQueryLocalInterface instanceof jjc ? (jjc) iInterfaceQueryLocalInterface : new jja(iBinder);
        }
        this.f33789f = (Context) jjb.m13305c(jjaVar);
        this.f33787d = z3;
        this.f33788e = z4;
    }
}
