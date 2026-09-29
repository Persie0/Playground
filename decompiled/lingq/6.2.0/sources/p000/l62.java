package p000;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l62 implements zc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rp7 f49110b;

    public /* synthetic */ l62(rp7 rp7Var, int i) {
        this.f49109a = i;
        this.f49110b = rp7Var;
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public final Object mo3790l(co7 co7Var) {
        int i = this.f49109a;
        rp7 rp7Var = this.f49110b;
        switch (i) {
            case 0:
                return new n62((Context) co7Var.mo4926a(Context.class), ((q43) co7Var.mo4926a(q43.class)).m19646d(), co7Var.mo4927b(rp7.m20740a(tr3.class)), co7Var.mo4928c(n92.class), (Executor) co7Var.mo4932g(rp7Var));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(rp7Var, co7Var);
            case 2:
                return FirebasePerfRegistrar.lambda$getComponents$0(rp7Var, co7Var);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(rp7Var, co7Var);
        }
    }
}
