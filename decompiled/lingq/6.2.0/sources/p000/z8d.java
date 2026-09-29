package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class z8d extends mcb {
    public z8d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 3);
    }

    /* JADX INFO: renamed from: Q */
    public final by3 m25498Q(lp6 lp6Var, String str, int i) {
        Parcel parcelM16773J = m16773J();
        zrb.m25757b(parcelM16773J, lp6Var);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(i);
        Parcel parcelM16771H = m16771H(parcelM16773J, 2);
        by3 by3VarM16421H = lp6.m16421H(parcelM16771H.readStrongBinder());
        parcelM16771H.recycle();
        return by3VarM16421H;
    }

    /* JADX INFO: renamed from: R */
    public final int m25499R(lp6 lp6Var, String str, boolean z) {
        Parcel parcelM16773J = m16773J();
        zrb.m25757b(parcelM16773J, lp6Var);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(z ? 1 : 0);
        Parcel parcelM16771H = m16771H(parcelM16773J, 3);
        int i = parcelM16771H.readInt();
        parcelM16771H.recycle();
        return i;
    }

    /* JADX INFO: renamed from: S */
    public final by3 m25500S(lp6 lp6Var, String str, int i) {
        Parcel parcelM16773J = m16773J();
        zrb.m25757b(parcelM16773J, lp6Var);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(i);
        Parcel parcelM16771H = m16771H(parcelM16773J, 4);
        by3 by3VarM16421H = lp6.m16421H(parcelM16771H.readStrongBinder());
        parcelM16771H.recycle();
        return by3VarM16421H;
    }

    /* JADX INFO: renamed from: T */
    public final int m25501T(lp6 lp6Var, String str, boolean z) {
        Parcel parcelM16773J = m16773J();
        zrb.m25757b(parcelM16773J, lp6Var);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(z ? 1 : 0);
        Parcel parcelM16771H = m16771H(parcelM16773J, 5);
        int i = parcelM16771H.readInt();
        parcelM16771H.recycle();
        return i;
    }

    /* JADX INFO: renamed from: U */
    public final int m25502U() {
        Parcel parcelM16771H = m16771H(m16773J(), 6);
        int i = parcelM16771H.readInt();
        parcelM16771H.recycle();
        return i;
    }

    /* JADX INFO: renamed from: V */
    public final by3 m25503V(lp6 lp6Var, String str, boolean z, long j) {
        Parcel parcelM16773J = m16773J();
        zrb.m25757b(parcelM16773J, lp6Var);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(z ? 1 : 0);
        parcelM16773J.writeLong(j);
        Parcel parcelM16771H = m16771H(parcelM16773J, 7);
        by3 by3VarM16421H = lp6.m16421H(parcelM16771H.readStrongBinder());
        parcelM16771H.recycle();
        return by3VarM16421H;
    }

    /* JADX INFO: renamed from: W */
    public final by3 m25504W(lp6 lp6Var, String str, int i, lp6 lp6Var2) {
        Parcel parcelM16773J = m16773J();
        zrb.m25757b(parcelM16773J, lp6Var);
        parcelM16773J.writeString(str);
        parcelM16773J.writeInt(i);
        zrb.m25757b(parcelM16773J, lp6Var2);
        Parcel parcelM16771H = m16771H(parcelM16773J, 8);
        by3 by3VarM16421H = lp6.m16421H(parcelM16771H.readStrongBinder());
        parcelM16771H.recycle();
        return by3VarM16421H;
    }
}
