package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class maq implements mas {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jbc f39738a;

    public maq(jbc jbcVar) {
        this.f39738a = jbcVar;
    }

    @Override // p000.mas
    /* JADX INFO: renamed from: a */
    public final GoogleSignInAccount mo16272a(Context context) {
        return jbq.m12843c(context).m12845a();
    }

    @Override // p000.mas
    /* JADX INFO: renamed from: b */
    public final Object mo16273b(ols olsVar) throws Exception {
        Object objM15634ac = lku.m15634ac(this.f39738a.m12828a(), olsVar);
        return objM15634ac == oma.COROUTINE_SUSPENDED ? objM15634ac : oki.f46196a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.mas
    /* JADX INFO: renamed from: c */
    public final Object mo16274c(ols olsVar) throws Exception {
        map mapVar;
        jrp jrpVar;
        GoogleSignInAccount googleSignInAccountM12845a;
        jee jeeVar;
        if (olsVar instanceof map) {
            mapVar = (map) olsVar;
            int i = mapVar.f39737c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapVar.f39737c = i - Integer.MIN_VALUE;
            } else {
                mapVar = new map(this, olsVar);
            }
        } else {
            mapVar = new map(this, olsVar);
        }
        Object objM15634ac = mapVar.f39735a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (mapVar.f39737c) {
            case 0:
                lkm.m15592s(objM15634ac);
                jbc jbcVar = this.f39738a;
                jec jecVar = jbcVar.f33826i;
                Context context = jbcVar.f33820c;
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) jbcVar.f33822e;
                int iM12829b = jbcVar.m12829b();
                jbo.f33666a.m15892e("silentSignIn()");
                jbo.f33666a.m15892e("getEligibleSavedSignInResult()");
                jib.m13205j(googleSignInOptions);
                GoogleSignInOptions googleSignInOptionsM12846b = jbq.m12843c(context).m12846b();
                if (googleSignInOptionsM12846b == null) {
                    jrpVar = null;
                } else {
                    Account account = googleSignInOptionsM12846b.f7579j;
                    Account account2 = googleSignInOptions.f7579j;
                    if (account == null) {
                        if (account2 != null) {
                            jrpVar = null;
                        }
                    } else if (!account.equals(account2)) {
                        jrpVar = null;
                    }
                    if (!googleSignInOptions.f7581l && ((!googleSignInOptions.f7580k || (googleSignInOptionsM12846b.f7580k && jib.m13209n(googleSignInOptions.f7583n, googleSignInOptionsM12846b.f7583n))) && new HashSet(googleSignInOptionsM12846b.m4638a()).containsAll(new HashSet(googleSignInOptions.m4638a())) && (googleSignInAccountM12845a = jbq.m12843c(context).m12845a()) != null && System.currentTimeMillis() / 1000 < googleSignInAccountM12845a.f7564h - 300)) {
                        jrpVar = new jrp(googleSignInAccountM12845a, Status.f7601a, 1);
                    } else {
                        jrpVar = null;
                    }
                }
                if (jrpVar != null) {
                    jbo.f33666a.m15892e("Eligible saved sign in result found");
                    jeeVar = jeu.m12979b(jrpVar, jecVar);
                } else if (iM12829b == 3) {
                    jeeVar = jeu.m12979b(new jrp((GoogleSignInAccount) null, new Status(4), 1), jecVar);
                } else {
                    jbo.f33666a.m15892e("trySilentSignIn()");
                    jbi jbiVar = new jbi(jecVar, context, googleSignInOptions);
                    jecVar.mo12967b(jbiVar);
                    jeeVar = new jee(jbiVar);
                }
                jpp jppVarM13207l = jib.m13207l(jeeVar, jbc.f33645b);
                mapVar.f39737c = 1;
                objM15634ac = lku.m15634ac(jppVarM13207l, mapVar);
                if (objM15634ac == omaVar) {
                    return omaVar;
                }
                break;
            case 1:
                lkm.m15592s(objM15634ac);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objM15634ac.getClass();
        return objM15634ac;
    }
}
