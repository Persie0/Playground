package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class reb extends co3 {

    /* JADX INFO: renamed from: A */
    public final Bundle f59167A;

    public reb(Context context, Looper looper, co7 co7Var, scb scbVar, scb scbVar2) {
        super(context, looper, 219, co7Var, scbVar, scbVar2, 0);
        this.f59167A = g9a.m12429f("session_id", null);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IInterface mo3402b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return iInterfaceQueryLocalInterface instanceof ueb ? (ueb) iInterfaceQueryLocalInterface : new ueb(iBinder);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: f */
    public final Feature[] mo3671f() {
        return iyc.f44790c;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: h */
    public final Bundle mo3403h() {
        return this.f59167A;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 17895000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
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
