package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jtb extends cbr implements jtc {
    public jtb() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        jsx jsxVar;
        switch (i) {
            case 1:
                DataHolder dataHolder = (DataHolder) cbs.m3402a(parcel, DataHolder.CREATOR);
                cbs.m3403b(parcel);
                mo13482c(dataHolder);
                return true;
            case 2:
                jtk jtkVar = (jtk) cbs.m3402a(parcel, jtk.CREATOR);
                cbs.m3403b(parcel);
                mo13483d(jtkVar);
                return true;
            case 3:
                cbs.m3403b(parcel);
                mo13490k();
                return true;
            case 4:
                cbs.m3403b(parcel);
                mo13491l();
                return true;
            case 5:
                parcel.createTypedArrayList(jtn.CREATOR);
                cbs.m3403b(parcel);
                mo13487h();
                return true;
            case 6:
                cbs.m3403b(parcel);
                mo13489j();
                return true;
            case 7:
                jrs jrsVar = (jrs) cbs.m3402a(parcel, jrs.CREATOR);
                cbs.m3403b(parcel);
                mo13481b(jrsVar);
                return true;
            case 8:
                cbs.m3403b(parcel);
                mo13486g();
                return true;
            case 9:
                cbs.m3403b(parcel);
                mo13488i();
                return true;
            case 10:
            case 11:
            case 12:
            default:
                return false;
            case 13:
                jtk jtkVar2 = (jtk) cbs.m3402a(parcel, jtk.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    jsxVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    jsxVar = iInterfaceQueryLocalInterface instanceof jsx ? (jsx) iInterfaceQueryLocalInterface : new jsx(strongBinder);
                }
                cbs.m3403b(parcel);
                mo13485f(jtkVar2, jsxVar);
                return true;
            case 14:
                cbs.m3403b(parcel);
                return true;
            case 15:
                cbs.m3403b(parcel);
                return true;
            case 16:
                jtm jtmVar = (jtm) cbs.m3402a(parcel, jtm.CREATOR);
                cbs.m3403b(parcel);
                mo13484e(jtmVar);
                return true;
            case 17:
                cbs.m3403b(parcel);
                return true;
        }
    }
}
