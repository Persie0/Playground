package p000;

import android.os.Parcel;
import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jme extends cbr implements jmf {
    public jme() {
        super(zuAgeeF.hOyyGethqSTdWiZ);
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo13354d();
                parcel2.writeNoException();
                int i2 = cbs.f4964a;
                parcel2.writeInt(0);
                return true;
            case 2:
                parcel.readString();
                cbs.m3403b(parcel);
                jjc jjcVarB = mo13352b();
                parcel2.writeNoException();
                cbs.m3405d(parcel2, jjcVarB);
                return true;
            case 3:
                parcel2.writeNoException();
                int i3 = cbs.f4964a;
                parcel2.writeInt(1);
                return true;
            case 4:
                parcel2.writeNoException();
                int i4 = cbs.f4964a;
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel2.writeNoException();
                int i5 = cbs.f4964a;
                parcel2.writeInt(0);
                return true;
            case 6:
                cbs.m3406e(parcel);
                cbs.m3403b(parcel);
                mo13353c();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
