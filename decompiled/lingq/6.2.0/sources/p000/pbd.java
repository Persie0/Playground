package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class pbd extends mcb {
    public pbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 3);
    }

    /* JADX INFO: renamed from: Q */
    public final by3 m19058Q(lp6 lp6Var, String str, int i, lp6 lp6Var2) {
        Parcel parcelM16773J = m16773J();
        zrb.m25757b(parcelM16773J, lp6Var);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(i);
        zrb.m25757b(parcelM16773J, lp6Var2);
        Parcel parcelM16771H = m16771H(parcelM16773J, 2);
        by3 by3VarM16421H = lp6.m16421H(parcelM16771H.readStrongBinder());
        parcelM16771H.recycle();
        return by3VarM16421H;
    }

    /* JADX INFO: renamed from: R */
    public final by3 m19059R(lp6 lp6Var, String str, int i, lp6 lp6Var2) {
        Parcel parcelM16773J = m16773J();
        zrb.m25757b(parcelM16773J, lp6Var);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(i);
        zrb.m25757b(parcelM16773J, lp6Var2);
        Parcel parcelM16771H = m16771H(parcelM16773J, 3);
        by3 by3VarM16421H = lp6.m16421H(parcelM16771H.readStrongBinder());
        parcelM16771H.recycle();
        return by3VarM16421H;
    }
}
