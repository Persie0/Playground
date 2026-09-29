package p070db;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p398tb.BinderC9243b;
import p398tb.C9245d;

/* JADX INFO: renamed from: db.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5136p extends BinderC9243b implements InterfaceC5137q {
    public AbstractBinderC5136p() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p398tb.BinderC9243b
    /* JADX INFO: renamed from: h */
    public final boolean mo10916h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i10) {
            case 101:
                C9245d.m17608b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) C9245d.m17607a(parcel, Status.CREATOR);
                C9245d.m17608b(parcel);
                mo10909u0(status);
                break;
            case 103:
                Status status2 = (Status) C9245d.m17607a(parcel, Status.CREATOR);
                C9245d.m17608b(parcel);
                mo10908i0(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
