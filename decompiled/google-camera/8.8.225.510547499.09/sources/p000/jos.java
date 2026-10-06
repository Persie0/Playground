package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jos extends jeu {
    @Override // p000.jeu
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ jdu mo12827a(Context context, Looper looper, jgz jgzVar, Object obj, jea jeaVar, jeb jebVar) {
        jov jovVar = jgzVar.f34020g;
        Integer num = jgzVar.f34021h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", jgzVar.f34014a);
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
        return new jpa(context, looper, jgzVar, bundle, jeaVar, jebVar);
    }
}
