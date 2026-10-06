package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jbr extends cbr implements IInterface {
    public jbr() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* JADX INFO: renamed from: b */
    public void mo12837b(GoogleSignInAccount googleSignInAccount, Status status) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public void mo12839c(Status status) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public void mo12840d(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) cbs.m3402a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) cbs.m3402a(parcel, Status.CREATOR);
                cbs.m3403b(parcel);
                mo12837b(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                cbs.m3403b(parcel);
                mo12839c(status2);
                break;
            case 103:
                Status status3 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                cbs.m3403b(parcel);
                mo12840d(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
