package p070db;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Set;
import p046cb.C1760b;
import p152hb.C5961d;
import p220kb.C6653a;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: db.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5133m {

    /* JADX INFO: renamed from: a */
    public static final C6653a f33116a = new C6653a("GoogleSignInCommon", new String[0]);

    /* JADX INFO: renamed from: a */
    public static Intent m10911a(Context context, GoogleSignInOptions googleSignInOptions) {
        f33116a.m13287a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static C1760b m10912b(Intent intent) {
        if (intent == null) {
            return new C1760b(null, Status.f13875h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C1760b(googleSignInAccount, Status.f13873f);
        }
        if (status == null) {
            status = Status.f13875h;
        }
        return new C1760b(null, status);
    }

    /* JADX INFO: renamed from: c */
    public static void m10913c(Context context) {
        C5134n.m10914a(context).m10915b();
        Set<AbstractC2544c> set = AbstractC2544c.f13900a;
        synchronized (set) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator<AbstractC2544c> it = set.iterator();
        while (it.hasNext()) {
            it.next().mo7559g();
        }
        synchronized (C5961d.f35437M) {
            C5961d c5961d = C5961d.f35438N;
            if (c5961d != null) {
                c5961d.f35450i.incrementAndGet();
                HandlerC9517f handlerC9517f = c5961d.f35440I;
                handlerC9517f.sendMessageAtFrontOfQueue(handlerC9517f.obtainMessage(10));
            }
        }
    }
}
