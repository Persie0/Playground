package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class beb extends co3 {

    /* JADX INFO: renamed from: A */
    public final cs9 f8445A;

    public beb(Context context, Looper looper, co7 co7Var, cs9 cs9Var, scb scbVar, scb scbVar2) {
        super(context, looper, 270, co7Var, scbVar, scbVar2, 0);
        this.f8445A = cs9Var;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IInterface mo3402b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof tdb ? (tdb) iInterfaceQueryLocalInterface : new tdb(iBinder);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: f */
    public final Feature[] mo3671f() {
        return omd.f54601f;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: h */
    public final Bundle mo3403h() {
        cs9 cs9Var = this.f8445A;
        cs9Var.getClass();
        Bundle bundle = new Bundle();
        String str = cs9Var.f34497a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 203400000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: o */
    public final boolean mo3672o() {
        return true;
    }
}
