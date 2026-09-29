package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class teb extends g90 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f62206k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public teb(vcb vcbVar, int i) {
        super(lz6.f50353a, vcbVar);
        this.f62206k = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ q88 mo4601b(Status status) {
        int i = this.f62206k;
        return status;
    }

    @Override // p000.g90
    /* JADX INFO: renamed from: g */
    public final void mo4602g(co3 co3Var) {
        switch (this.f62206k) {
            case 0:
                qeb qebVar = (qeb) co3Var;
                xeb xebVar = (xeb) qebVar.m11611l();
                seb sebVar = new seb(this, 0);
                GoogleSignInOptions googleSignInOptions = qebVar.f57663A;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(xebVar.f51090h);
                int i = meb.f51223a;
                parcelObtain.writeStrongBinder(sebVar);
                meb.m16798b(parcelObtain, googleSignInOptions);
                xebVar.m16770G(parcelObtain, 102);
                break;
            default:
                qeb qebVar2 = (qeb) co3Var;
                xeb xebVar2 = (xeb) qebVar2.m11611l();
                seb sebVar2 = new seb(this, 1);
                GoogleSignInOptions googleSignInOptions2 = qebVar2.f57663A;
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(xebVar2.f51090h);
                int i2 = meb.f51223a;
                parcelObtain2.writeStrongBinder(sebVar2);
                meb.m16798b(parcelObtain2, googleSignInOptions2);
                xebVar2.m16770G(parcelObtain2, 103);
                break;
        }
    }
}
