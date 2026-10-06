package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhg extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(19);

    /* JADX INFO: renamed from: a */
    public static final Scope[] f34040a = new Scope[0];

    /* JADX INFO: renamed from: b */
    public static final jcw[] f34041b = new jcw[0];

    /* JADX INFO: renamed from: c */
    public final int f34042c;

    /* JADX INFO: renamed from: d */
    public final int f34043d;

    /* JADX INFO: renamed from: e */
    public final int f34044e;

    /* JADX INFO: renamed from: f */
    public String f34045f;

    /* JADX INFO: renamed from: g */
    public IBinder f34046g;

    /* JADX INFO: renamed from: h */
    public Scope[] f34047h;

    /* JADX INFO: renamed from: i */
    public Bundle f34048i;

    /* JADX INFO: renamed from: j */
    public Account f34049j;

    /* JADX INFO: renamed from: k */
    public jcw[] f34050k;

    /* JADX INFO: renamed from: l */
    public jcw[] f34051l;

    /* JADX INFO: renamed from: m */
    public boolean f34052m;

    /* JADX INFO: renamed from: n */
    public int f34053n;

    /* JADX INFO: renamed from: o */
    public boolean f34054o;

    /* JADX INFO: renamed from: p */
    public String f34055p;

    public jhg(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, jcw[] jcwVarArr, jcw[] jcwVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? f34040a : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        jcwVarArr = jcwVarArr == null ? f34041b : jcwVarArr;
        jcwVarArr2 = jcwVarArr2 == null ? f34041b : jcwVarArr2;
        this.f34042c = i;
        this.f34043d = i2;
        this.f34044e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f34045f = "com.google.android.gms";
        } else {
            this.f34045f = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                jhp jhpVar = iInterfaceQueryLocalInterface instanceof jhp ? (jhp) iInterfaceQueryLocalInterface : new jhp(iBinder);
                if (jhpVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Parcel parcelM3399y = jhpVar.m3399y(2, jhpVar.m3398a());
                            Account account3 = (Account) cbs.m3402a(parcelM3399y, Account.CREATOR);
                            parcelM3399y.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException e) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f34049j = account2;
        } else {
            this.f34046g = iBinder;
            this.f34049j = account;
        }
        this.f34047h = scopeArr;
        this.f34048i = bundle;
        this.f34050k = jcwVarArr;
        this.f34051l = jcwVarArr2;
        this.f34052m = z;
        this.f34053n = i4;
        this.f34054o = z2;
        this.f34055p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jbt.m12849a(this, parcel, i);
    }
}
