package androidx.glance.session;

import android.content.Context;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lz3;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2", m4291f = "IdleEventBroadcastReceiver.kt", m4292l = {81}, m4293m = "invokeSuspend", m4294v = 1)
final class IdleEventBroadcastReceiverKt$observeIdleEvents$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6121a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f6123c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f6124d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f6125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdleEventBroadcastReceiverKt$observeIdleEvents$2(Context context, vi3 vi3Var, vi3 vi3Var2, Continuation continuation) {
        super(2, continuation);
        this.f6123c = context;
        this.f6124d = vi3Var;
        this.f6125e = vi3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IdleEventBroadcastReceiverKt$observeIdleEvents$2 idleEventBroadcastReceiverKt$observeIdleEvents$2 = new IdleEventBroadcastReceiverKt$observeIdleEvents$2(this.f6123c, this.f6124d, this.f6125e, continuation);
        idleEventBroadcastReceiverKt$observeIdleEvents$2.f6122b = obj;
        return idleEventBroadcastReceiverKt$observeIdleEvents$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((IdleEventBroadcastReceiverKt$observeIdleEvents$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        lz3 lz3Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6121a;
        Context context = this.f6123c;
        if (i != 0) {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lz3Var = (lz3) this.f6122b;
            try {
                AbstractC3193b.m15359b(obj);
                context.unregisterReceiver(lz3Var);
                return obj;
            } catch (Throwable th) {
                th = th;
                context.unregisterReceiver(lz3Var);
                throw th;
            }
        }
        AbstractC3193b.m15359b(obj);
        lz3 lz3Var2 = new lz3(new C0694b((un1) this.f6122b, this.f6125e));
        context.registerReceiver(lz3Var2, lz3.f50333c);
        try {
            lz3Var2.m16575a(context);
            vi3 vi3Var = this.f6124d;
            this.f6122b = lz3Var2;
            this.f6121a = 1;
            try {
                obj = ((SessionWorker$doWork$result$1.C06902) vi3Var).invoke(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lz3Var = lz3Var2;
                context.unregisterReceiver(lz3Var);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lz3Var = lz3Var2;
                context.unregisterReceiver(lz3Var);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
