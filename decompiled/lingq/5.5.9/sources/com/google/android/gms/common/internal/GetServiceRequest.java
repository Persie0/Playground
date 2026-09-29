package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6301w0;

/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C6301w0();

    /* JADX INFO: renamed from: J */
    public static final Scope[] f13937J = new Scope[0];

    /* JADX INFO: renamed from: K */
    public static final Feature[] f13938K = new Feature[0];

    /* JADX INFO: renamed from: H */
    public boolean f13939H;

    /* JADX INFO: renamed from: I */
    public final String f13940I;

    /* JADX INFO: renamed from: a */
    public final int f13941a;

    /* JADX INFO: renamed from: b */
    public final int f13942b;

    /* JADX INFO: renamed from: c */
    public final int f13943c;

    /* JADX INFO: renamed from: d */
    public String f13944d;

    /* JADX INFO: renamed from: e */
    public IBinder f13945e;

    /* JADX INFO: renamed from: f */
    public Scope[] f13946f;

    /* JADX INFO: renamed from: g */
    public Bundle f13947g;

    /* JADX INFO: renamed from: h */
    public Account f13948h;

    /* JADX INFO: renamed from: i */
    public Feature[] f13949i;

    /* JADX INFO: renamed from: j */
    public Feature[] f13950j;

    /* JADX INFO: renamed from: k */
    public final boolean f13951k;

    /* JADX INFO: renamed from: l */
    public final int f13952l;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f13937J : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f13938K;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f13941a = i10;
        this.f13942b = i11;
        this.f13943c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f13944d = "com.google.android.gms";
        } else {
            this.f13944d = str;
        }
        if (i10 < 2) {
            Account accountMo7596c = null;
            if (iBinder != null) {
                int i14 = InterfaceC2556b.a.f13970a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC2556b c2557c = iInterfaceQueryLocalInterface instanceof InterfaceC2556b ? (InterfaceC2556b) iInterfaceQueryLocalInterface : new C2557c(iBinder);
                int i15 = BinderC2555a.f13969b;
                if (c2557c != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            accountMo7596c = c2557c.mo7596c();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th2) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th2;
                    }
                }
            }
            this.f13948h = accountMo7596c;
        } else {
            this.f13945e = iBinder;
            this.f13948h = account;
        }
        this.f13946f = scopeArr;
        this.f13947g = bundle;
        this.f13949i = featureArr;
        this.f13950j = featureArr2;
        this.f13951k = z10;
        this.f13952l = i13;
        this.f13939H = z11;
        this.f13940I = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C6301w0.m12931a(this, parcel, i10);
    }
}
