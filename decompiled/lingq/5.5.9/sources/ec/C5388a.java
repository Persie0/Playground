package ec;

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
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.internal.InterfaceC2556b;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import p070db.C5121a;
import p071dc.InterfaceC5147f;
import p176ib.AbstractC6251a;
import p176ib.AbstractC6257c;
import p176ib.C6254b;
import p176ib.C6272i;
import p412ub.BinderC9513b;
import p412ub.C9514c;

/* JADX INFO: renamed from: ec.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5388a extends AbstractC6257c<C5393f> implements InterfaceC5147f {

    /* JADX INFO: renamed from: b0 */
    public final boolean f33808b0;

    /* JADX INFO: renamed from: c0 */
    public final C6254b f33809c0;

    /* JADX INFO: renamed from: d0 */
    public final Bundle f33810d0;

    /* JADX INFO: renamed from: e0 */
    public final Integer f33811e0;

    public C5388a(Context context, Looper looper, C6254b c6254b, Bundle bundle, AbstractC2544c.a aVar, AbstractC2544c.b bVar) {
        super(context, looper, 44, c6254b, aVar, bVar);
        this.f33808b0 = true;
        this.f33809c0 = c6254b;
        this.f33810d0 = bundle;
        this.f33811e0 = c6254b.f36446h;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: A */
    public final Bundle mo11557A() {
        C6254b c6254b = this.f33809c0;
        boolean zEquals = this.f36423h.getPackageName().equals(c6254b.f36443e);
        Bundle bundle = this.f33810d0;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c6254b.f36443e);
        }
        return bundle;
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: D */
    public final String mo5606D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: E */
    public final String mo5607E() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p071dc.InterfaceC5147f
    /* JADX INFO: renamed from: l */
    public final void mo10918l() {
        try {
            C5393f c5393f = (C5393f) m12871C();
            Integer num = this.f33811e0;
            C6272i.m12915i(num);
            int iIntValue = num.intValue();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c5393f.f49017b);
            parcelObtain.writeInt(iIntValue);
            c5393f.m17978h(parcelObtain, 7);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: m */
    public final int mo5608m() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p071dc.InterfaceC5147f
    /* JADX INFO: renamed from: o */
    public final void mo10919o(InterfaceC2556b interfaceC2556b, boolean z10) {
        try {
            C5393f c5393f = (C5393f) m12871C();
            Integer num = this.f33811e0;
            C6272i.m12915i(num);
            int iIntValue = num.intValue();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c5393f.f49017b);
            int i10 = C9514c.f49018a;
            parcelObtain.writeStrongBinder(interfaceC2556b.asBinder());
            parcelObtain.writeInt(iIntValue);
            parcelObtain.writeInt(z10 ? 1 : 0);
            c5393f.m17978h(parcelObtain, 9);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // p176ib.AbstractC6251a, com.google.android.gms.common.api.C2542a.e
    /* JADX INFO: renamed from: s */
    public final boolean mo7553s() {
        return this.f33808b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p071dc.InterfaceC5147f
    /* JADX INFO: renamed from: t */
    public final void mo10920t(InterfaceC5392e interfaceC5392e) {
        if (interfaceC5392e == 0) {
            throw new NullPointerException("Expecting a valid ISignInCallbacks");
        }
        try {
            Account account = this.f33809c0.f36439a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountM10903b = "<<default account>>".equals(account.name) ? C5121a.m10901a(this.f36423h).m10903b() : null;
            Integer num = this.f33811e0;
            C6272i.m12915i(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountM10903b);
            C5393f c5393f = (C5393f) m12871C();
            zai zaiVar = new zai(1, zatVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c5393f.f49017b);
            int i10 = C9514c.f49018a;
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder((BinderC9513b) interfaceC5392e);
            c5393f.m17978h(parcelObtain, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC5392e.mo11558M(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // p071dc.InterfaceC5147f
    /* JADX INFO: renamed from: u */
    public final void mo10921u() {
        m12876b(new AbstractC6251a.d());
    }

    @Override // p176ib.AbstractC6251a
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ IInterface mo5609w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C5393f ? (C5393f) iInterfaceQueryLocalInterface : new C5393f(iBinder);
    }
}
