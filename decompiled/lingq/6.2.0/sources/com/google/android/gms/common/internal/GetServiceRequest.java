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
import p000.AbstractBinderC3447p4;
import p000.cjd;
import p000.lx3;
import p000.qmb;
import p000.zrb;

/* JADX INFO: loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new qmb(22);

    /* JADX INFO: renamed from: J */
    public static final Scope[] f11696J = new Scope[0];

    /* JADX INFO: renamed from: K */
    public static final Feature[] f11697K = new Feature[0];

    /* JADX INFO: renamed from: H */
    public boolean f11698H;

    /* JADX INFO: renamed from: I */
    public final String f11699I;

    /* JADX INFO: renamed from: a */
    public final int f11700a;

    /* JADX INFO: renamed from: b */
    public final int f11701b;

    /* JADX INFO: renamed from: c */
    public final int f11702c;

    /* JADX INFO: renamed from: d */
    public String f11703d;

    /* JADX INFO: renamed from: e */
    public IBinder f11704e;

    /* JADX INFO: renamed from: f */
    public Scope[] f11705f;

    /* JADX INFO: renamed from: g */
    public Bundle f11706g;

    /* JADX INFO: renamed from: h */
    public Account f11707h;

    /* JADX INFO: renamed from: i */
    public Feature[] f11708i;

    /* JADX INFO: renamed from: j */
    public Feature[] f11709j;

    /* JADX INFO: renamed from: k */
    public final boolean f11710k;

    /* JADX INFO: renamed from: l */
    public final int f11711l;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f11696J : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f11697K;
        Feature[] featureArr4 = featureArr == null ? featureArr3 : featureArr;
        featureArr3 = featureArr2 != null ? featureArr2 : featureArr3;
        this.f11700a = i;
        this.f11701b = i2;
        this.f11702c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f11703d = "com.google.android.gms";
        } else {
            this.f11703d = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = AbstractBinderC3447p4.f55539g;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface cjdVar = iInterfaceQueryLocalInterface instanceof lx3 ? (lx3) iInterfaceQueryLocalInterface : new cjd(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        cjd cjdVar2 = (cjd) cjdVar;
                        Parcel parcelM16771H = cjdVar2.m16771H(cjdVar2.m16773J(), 2);
                        Account account3 = (Account) zrb.m25756a(parcelM16771H, Account.CREATOR);
                        parcelM16771H.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.f11704e = iBinder;
            account2 = account;
        }
        this.f11707h = account2;
        this.f11705f = scopeArr2;
        this.f11706g = bundle2;
        this.f11708i = featureArr4;
        this.f11709j = featureArr3;
        this.f11710k = z;
        this.f11711l = i4;
        this.f11698H = z2;
        this.f11699I = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qmb.m20035a(this, parcel, i);
    }
}
