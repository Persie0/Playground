package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class seb extends keb implements IInterface {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f60771g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ teb f60772h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seb(teb tebVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f60771g = i;
        this.f60772h = tebVar;
    }

    @Override // p000.keb
    /* JADX INFO: renamed from: F */
    public final boolean mo15162F(int i, Parcel parcel, Parcel parcel2) {
        teb tebVar = this.f60772h;
        int i2 = this.f60771g;
        switch (i) {
            case 101:
                meb.m16799c(parcel);
                ij6.m13946b();
                return false;
            case 102:
                Status status = (Status) meb.m16797a(parcel, Status.CREATOR);
                meb.m16799c(parcel);
                switch (i2) {
                    case 0:
                        tebVar.m5286e(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status status2 = (Status) meb.m16797a(parcel, Status.CREATOR);
                meb.m16799c(parcel);
                switch (i2) {
                    case 1:
                        tebVar.m5286e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
