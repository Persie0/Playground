package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgd extends jox implements jea, jeb {

    /* JADX INFO: renamed from: h */
    private static final jeu f33944h = jot.f34493a;

    /* JADX INFO: renamed from: a */
    public final Context f33945a;

    /* JADX INFO: renamed from: b */
    public final Handler f33946b;

    /* JADX INFO: renamed from: c */
    public final Set f33947c;

    /* JADX INFO: renamed from: d */
    public final jgz f33948d;

    /* JADX INFO: renamed from: e */
    public jou f33949e;

    /* JADX INFO: renamed from: f */
    public jfl f33950f;

    /* JADX INFO: renamed from: g */
    public final jeu f33951g;

    public jgd(Context context, Handler handler, jgz jgzVar) {
        jeu jeuVar = f33944h;
        this.f33945a = context;
        this.f33946b = handler;
        this.f33948d = jgzVar;
        this.f33947c = jgzVar.f34015b;
        this.f33951g = jeuVar;
    }

    @Override // p000.jfe
    /* JADX INFO: renamed from: a */
    public final void mo13014a(int i) {
        this.f33949e.mo12942j();
    }

    @Override // p000.jfe
    /* JADX INFO: renamed from: b */
    public final void mo13015b() {
        Object obj = this.f33949e;
        try {
            Account account = ((jpa) obj).f34521a.f34014a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountM12851a = "<<default account>>".equals(account.name) ? jbv.m12850c(((jgw) obj).f33986c).m12851a() : null;
            Integer num = ((jpa) obj).f34522t;
            jib.m13205j(num);
            jic jicVar = new jic(2, account, num.intValue(), googleSignInAccountM12851a);
            joy joyVar = (joy) ((jgw) obj).m13169u();
            jpb jpbVar = new jpb(1, jicVar);
            Parcel parcelM3398a = joyVar.m3398a();
            cbs.m3404c(parcelM3398a, jpbVar);
            cbs.m3405d(parcelM3398a, this);
            joyVar.m3400z(12, parcelM3398a);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                mo13129c(new jpc(1, new jcu(8, null), null));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // p000.jox
    /* JADX INFO: renamed from: c */
    public final void mo13129c(jpc jpcVar) {
        this.f33946b.post(new ipe(this, jpcVar, 15));
    }

    @Override // p000.jga
    /* JADX INFO: renamed from: i */
    public final void mo13030i(jcu jcuVar) {
        this.f33950f.m13038b(jcuVar);
    }
}
