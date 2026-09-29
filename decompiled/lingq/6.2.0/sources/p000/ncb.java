package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class ncb extends pk9 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int f52611A;

    public /* synthetic */ ncb(int i) {
        this.f52611A = i;
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: c */
    public co3 mo17372c(Context context, Looper looper, co7 co7Var, Object obj, qo3 qo3Var, ro3 ro3Var) {
        switch (this.f52611A) {
            case 0:
                co7Var.getClass();
                Integer num = (Integer) co7Var.f10364g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new b79(context, looper, co7Var, bundle, qo3Var, ro3Var);
            case 1:
                throw g9a.m12430g(obj);
            case 2:
            case 3:
            case 5:
            default:
                return super.mo17372c(context, looper, co7Var, obj, qo3Var, ro3Var);
            case 4:
                return new neb(context, looper, co7Var, (oeb) obj, (scb) qo3Var, (scb) ro3Var);
            case 6:
                return new qeb(context, looper, co7Var, (GoogleSignInOptions) obj, (scb) qo3Var, (scb) ro3Var);
            case 7:
                return new gnc(context, looper, 40, co7Var, qo3Var, ro3Var, 0);
        }
    }

    @Override // p000.pk9
    /* JADX INFO: renamed from: d */
    public co3 mo17373d(Context context, Looper looper, co7 co7Var, Object obj, scb scbVar, scb scbVar2) {
        switch (this.f52611A) {
            case 2:
                return new ceb(context, looper, 308, co7Var, scbVar, scbVar2, 0);
            case 3:
                return new pcb(context, looper, 449, co7Var, scbVar, scbVar2, 0);
            case 4:
            case 6:
            case 7:
            default:
                return super.mo17373d(context, looper, co7Var, obj, scbVar, scbVar2);
            case 5:
                return new heb(context, looper, co7Var, scbVar, scbVar2);
            case 8:
                return new tvc(context, looper, 362, co7Var, scbVar, scbVar2, 0);
        }
    }
}
