package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes2.dex */
public final class b79 extends co3 {

    /* JADX INFO: renamed from: A */
    public final boolean f8061A;

    /* JADX INFO: renamed from: B */
    public final co7 f8062B;

    /* JADX INFO: renamed from: C */
    public final Bundle f8063C;

    /* JADX INFO: renamed from: D */
    public final Integer f8064D;

    public b79(Context context, Looper looper, co7 co7Var, Bundle bundle, qo3 qo3Var, ro3 ro3Var) {
        super(context, looper, 44, co7Var, qo3Var, ro3Var, 0);
        this.f8061A = true;
        this.f8062B = co7Var;
        this.f8063C = bundle;
        this.f8064D = (Integer) co7Var.f10364g;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final IInterface mo3402b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof ldb ? (ldb) iInterfaceQueryLocalInterface : new ldb(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: h */
    public final Bundle mo3403h() {
        co7 co7Var = this.f8062B;
        boolean zEquals = this.f38642c.getPackageName().equals((String) co7Var.f10359b);
        Bundle bundle = this.f8063C;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) co7Var.f10359b);
        }
        return bundle;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 12451000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: r */
    public final boolean mo3407r() {
        return this.f8061A;
    }

    /* JADX INFO: renamed from: v */
    public final void m3408v(edb edbVar) {
        int i = 12;
        try {
            this.f8062B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountM25671b = "<<default account>>".equals(account.name) ? zi9.m25669a(this.f38642c).m25671b() : null;
            Integer num = this.f8064D;
            lda.m16130p(num);
            zaw zawVar = new zaw(2, account, num.intValue(), googleSignInAccountM25671b);
            ldb ldbVar = (ldb) m11611l();
            zai zaiVar = new zai(1, zawVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(ldbVar.f51090h);
            zcb.m25555b(parcelObtain, zaiVar);
            parcelObtain.writeStrongBinder(edbVar);
            ldbVar.m16769F(parcelObtain, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                edbVar.f37089h.post(new gvb(edbVar, new zak(1, new ConnectionResult(8, null, null), null), false, i));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3409w() {
        this.f38649j = new ck6(this);
        m11616u(2, null);
    }
}
