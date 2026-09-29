package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class wbc extends f90 {
    /* JADX WARN: Illegal instructions before constructor call */
    public wbc(Context context, Looper looper, c90 c90Var, d90 d90Var) {
        obd obdVarM17903a = obd.m17903a(context);
        po3 po3Var = po3.f56584b;
        lda.m16130p(c90Var);
        lda.m16130p(d90Var);
        super(context, looper, obdVarM17903a, po3Var, 93, c90Var, d90Var, null);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IInterface mo3402b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof q9c ? (q9c) iInterfaceQueryLocalInterface : new f9c(iBinder);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 12451000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.measurement.START";
    }
}
