package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class neb extends co3 {

    /* JADX INFO: renamed from: A */
    public final oeb f52659A;

    public neb(Context context, Looper looper, co7 co7Var, oeb oebVar, scb scbVar, scb scbVar2) {
        super(context, looper, 68, co7Var, scbVar, scbVar2, 0);
        oebVar = oebVar == null ? oeb.f54252c : oebVar;
        cdb cdbVar = new cdb(5, false);
        cdbVar.f9945b = Boolean.FALSE;
        cdbVar.f9945b = Boolean.valueOf(oebVar.f54253a);
        cdbVar.f9946c = oebVar.f54254b;
        cdbVar.f9946c = ieb.m13815a();
        this.f52659A = new oeb(cdbVar);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final IInterface mo3402b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof peb ? (peb) iInterfaceQueryLocalInterface : new peb(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: h */
    public final Bundle mo3403h() {
        oeb oebVar = this.f52659A;
        oebVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", oebVar.f54253a);
        bundle.putString("log_session_id", oebVar.f54254b);
        return bundle;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 12800000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
