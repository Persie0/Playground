package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class heb extends co3 {

    /* JADX INFO: renamed from: A */
    public final Bundle f42281A;

    public heb(Context context, Looper looper, co7 co7Var, scb scbVar, scb scbVar2) {
        super(context, looper, 212, co7Var, scbVar, scbVar2, 0);
        this.f42281A = new Bundle();
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final IInterface mo3402b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof zeb ? (zeb) iInterfaceQueryLocalInterface : new zeb(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 1);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: f */
    public final Feature[] mo3671f() {
        return iyc.f44790c;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: h */
    public final Bundle mo3403h() {
        return this.f42281A;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 17895000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: o */
    public final boolean mo3672o() {
        return true;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: s */
    public final boolean mo11614s() {
        return true;
    }
}
