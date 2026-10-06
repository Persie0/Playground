package p000;

import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jox extends cbr implements IInterface {
    public jox() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* JADX INFO: renamed from: c */
    public void mo13129c(jpc jpcVar) {
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                cbs.m3403b(parcel);
                break;
            case 4:
                cbs.m3403b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                cbs.m3403b(parcel);
                break;
            case 7:
                cbs.m3403b(parcel);
                break;
            case 8:
                jpc jpcVar = (jpc) cbs.m3402a(parcel, jpc.CREATOR);
                cbs.m3403b(parcel);
                mo13129c(jpcVar);
                break;
            case 9:
                cbs.m3403b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
