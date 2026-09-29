package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class vdb extends qcb implements IInterface {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ wr9 f65262g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdb(xdb xdbVar, wr9 wr9Var) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 0);
        this.f65262g = wr9Var;
    }

    @Override // p000.qcb
    /* JADX INFO: renamed from: F */
    public final boolean mo11078F(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zcb.m25556c(parcel);
            ij6.m13946b();
            return false;
        }
        if (i == 2) {
            Status status = (Status) zcb.m25554a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) zcb.m25554a(parcel, ModuleInstallResponse.CREATOR);
            zcb.m25556c(parcel);
            boolean zM5282r = status.m5282r();
            wr9 wr9Var = this.f65262g;
            if (zM5282r) {
                wr9Var.f67208a.m22202q(moduleInstallResponse);
            } else {
                wr9Var.m24139c(lda.m16138x(status));
            }
            return true;
        }
        if (i == 3) {
            zcb.m25556c(parcel);
            ij6.m13946b();
            return false;
        }
        if (i != 4) {
            return false;
        }
        zcb.m25556c(parcel);
        ij6.m13946b();
        return false;
    }
}
