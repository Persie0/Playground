package p000;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes2.dex */
public final class g7b extends Binder {

    /* JADX INFO: renamed from: f */
    public final ck6 f40366f;

    public g7b(ck6 ck6Var) {
        this.f40366f = ck6Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m12413a(h7b h7bVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = h7bVar.f41922a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f40366f.f10194b;
        wr9 wr9Var = new wr9();
        firebaseMessagingService.f13731a.execute(new RunnableC3725wk(firebaseMessagingService, intent, wr9Var, 9));
        wr9Var.f67208a.mo5960b(new ExecutorC3014fu(1), new dw6(h7bVar, 23));
    }
}
