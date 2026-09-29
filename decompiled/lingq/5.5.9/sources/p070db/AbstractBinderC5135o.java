package p070db;

import ae.C0062b;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import gb.C5742f;
import p046cb.C1759a;
import p136gc.C5752h;
import p152hb.C6020w0;
import p176ib.C6252a0;
import p176ib.C6272i;
import p220kb.C6653a;
import p398tb.BinderC9243b;

/* JADX INFO: renamed from: db.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC5135o extends BinderC9243b {
    public AbstractBinderC5135o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // p398tb.BinderC9243b
    /* JADX INFO: renamed from: h */
    public final boolean mo10916h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        BasePendingResult c5131k;
        if (i10 == 1) {
            BinderC5139s binderC5139s = (BinderC5139s) this;
            binderC5139s.m10917j();
            Context context = binderC5139s.f33119a;
            C5121a c5121aM10901a = C5121a.m10901a(context);
            GoogleSignInAccount googleSignInAccountM10903b = c5121aM10901a.m10903b();
            GoogleSignInOptions googleSignInOptionsM10904c = GoogleSignInOptions.f13818l;
            if (googleSignInAccountM10903b != null) {
                googleSignInOptionsM10904c = c5121aM10901a.m10904c();
            }
            C6272i.m12915i(googleSignInOptionsM10904c);
            C1759a c1759a = new C1759a(context, googleSignInOptionsM10904c);
            if (googleSignInAccountM10903b != null) {
                boolean z10 = c1759a.m5488c() == 3;
                C5133m.f33116a.m13287a("Revoking access", new Object[0]);
                Context context2 = c1759a.f13887a;
                String strM10906e = C5121a.m10901a(context2).m10906e("refreshToken");
                C5133m.m10913c(context2);
                if (!z10) {
                    C6020w0 c6020w0 = c1759a.f13894h;
                    c5131k = new C5131k(c6020w0);
                    c6020w0.m12471j(c5131k);
                } else if (strM10906e == null) {
                    C6653a c6653a = RunnableC5124d.f33108c;
                    Status status = new Status(null, 4);
                    C6272i.m12907a("Status code must not be SUCCESS", !status.m7534q());
                    c5131k = new C5742f(status);
                    c5131k.m7567f(status);
                } else {
                    RunnableC5124d runnableC5124d = new RunnableC5124d(strM10906e);
                    new Thread(runnableC5124d).start();
                    c5131k = runnableC5124d.f33110b;
                }
                c5131k.m7562a(new C6252a0(c5131k, new C5752h(), new C0062b()));
            } else {
                c1759a.m5487b();
            }
        } else {
            if (i10 != 2) {
                return false;
            }
            BinderC5139s binderC5139s2 = (BinderC5139s) this;
            binderC5139s2.m10917j();
            C5134n.m10914a(binderC5139s2.f33119a).m10915b();
        }
        return true;
    }
}
