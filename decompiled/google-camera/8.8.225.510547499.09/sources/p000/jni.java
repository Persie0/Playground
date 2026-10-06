package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jni extends cbr implements jnj {
    public jni() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                jng jngVar = (jng) cbs.m3402a(parcel, jng.CREATOR);
                cbs.m3403b(parcel);
                mo13386e(jngVar);
                return true;
            case 2:
                mo13387f();
                return true;
            default:
                return false;
        }
    }
}
