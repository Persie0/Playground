package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class yeb extends keb {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f69754g = 0;

    /* JADX INFO: renamed from: h */
    public final Object f69755h;

    public yeb(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f69755h = revocationBoundService;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.keb
    /* JADX INFO: renamed from: F */
    public final boolean mo15162F(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strM25674e;
        int i2 = this.f69754g;
        Object obj = this.f69755h;
        switch (i2) {
            case 0:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i == 1) {
                    m25106G();
                    zi9 zi9VarM25669a = zi9.m25669a(revocationBoundService);
                    GoogleSignInAccount googleSignInAccountM25671b = zi9VarM25669a.m25671b();
                    GoogleSignInOptions googleSignInOptionsM5272r = GoogleSignInOptions.f11595k;
                    if (googleSignInAccountM25671b != null) {
                        String strM25674e2 = zi9VarM25669a.m25674e("defaultGoogleSignInAccount");
                        if (TextUtils.isEmpty(strM25674e2) || (strM25674e = zi9VarM25669a.m25674e(zi9.m25670f("googleSignInOptions", strM25674e2))) == null) {
                            googleSignInOptionsM5272r = null;
                        } else {
                            try {
                                googleSignInOptionsM5272r = GoogleSignInOptions.m5272r(strM25674e);
                            } catch (JSONException unused) {
                                googleSignInOptionsM5272r = null;
                            }
                        }
                    }
                    lda.m16130p(googleSignInOptionsM5272r);
                    xdb xdbVar = new xdb(revocationBoundService, lz6.f50353a, googleSignInOptionsM5272r, new mo3(new ho5(7), Looper.getMainLooper()));
                    Context context = xdbVar.f53045a;
                    vcb vcbVar = xdbVar.f53053i;
                    if (googleSignInAccountM25671b != null) {
                        boolean z = xdbVar.m24467e() == 3;
                        C3299li c3299li = veb.f65285a;
                        if (c3299li.f49690a <= 3) {
                            Log.d((String) c3299li.f49691b, ((String) c3299li.f49692c).concat("Revoking access"));
                        }
                        String strM25674e3 = zi9.m25669a(context).m25674e("refreshToken");
                        veb.m23255a(context);
                        if (!z) {
                            teb tebVar = new teb(vcbVar, 1);
                            vcbVar.f65201a.m17568b(1, tebVar);
                            basePendingResult2 = tebVar;
                        } else if (strM25674e3 == null) {
                            C3299li c3299li2 = jeb.f45491c;
                            Status status = new Status(4, null, null, null);
                            lda.m16124j("Status code must not be SUCCESS", !status.m5282r());
                            gdb gdbVar = new gdb(status);
                            gdbVar.m5286e(status);
                            basePendingResult2 = gdbVar;
                        } else {
                            jeb jebVar = new jeb(strM25674e3);
                            new Thread(jebVar).start();
                            basePendingResult2 = jebVar.f45493b;
                        }
                        basePendingResult2.m5283a(new zdb(basePendingResult2, new wr9(), new mkd()));
                    } else {
                        boolean z2 = xdbVar.m24467e() == 3;
                        C3299li c3299li3 = veb.f65285a;
                        if (c3299li3.f49690a <= 3) {
                            Log.d((String) c3299li3.f49691b, ((String) c3299li3.f49692c).concat("Signing out"));
                        }
                        veb.m23255a(context);
                        if (z2) {
                            pi9 pi9Var = new pi9(vcbVar);
                            pi9Var.m5286e(Status.f11657e);
                            basePendingResult = pi9Var;
                        } else {
                            teb tebVar2 = new teb(vcbVar, 0);
                            vcbVar.f65201a.m17568b(1, tebVar2);
                            basePendingResult = tebVar2;
                        }
                        basePendingResult.m5283a(new zdb(basePendingResult, new wr9(), new mkd()));
                    }
                } else {
                    if (i != 2) {
                        return false;
                    }
                    m25106G();
                    web.m23863P(revocationBoundService).m23876Q();
                }
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                Status status2 = (Status) meb.m16797a(parcel, Status.CREATOR);
                AuthorizationResult authorizationResult = (AuthorizationResult) meb.m16797a(parcel, AuthorizationResult.CREATOR);
                meb.m16799c(parcel);
                wr9 wr9Var = (wr9) obj;
                if (status2.m5282r()) {
                    wr9Var.m24138b(authorizationResult);
                } else {
                    wr9Var.m24137a(lda.m16138x(status2));
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: G */
    public void m25106G() {
        if (lfa.m16160d((RevocationBoundService) this.f69755h, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeb(eeb eebVar, wr9 wr9Var) {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
        this.f69755h = wr9Var;
    }
}
