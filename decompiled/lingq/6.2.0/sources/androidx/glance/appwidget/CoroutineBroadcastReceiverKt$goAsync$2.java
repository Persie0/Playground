package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.vl1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$2", m4291f = "CoroutineBroadcastReceiver.kt", m4292l = {54}, m4293m = "invokeSuspend", m4294v = 1)
final class CoroutineBroadcastReceiverKt$goAsync$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5841a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vl1 f5842b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BroadcastReceiver.PendingResult f5843c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f5844d;

    /* JADX INFO: renamed from: androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$2$1 */
    @c32(m4290c = "androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$2$1", m4291f = "CoroutineBroadcastReceiver.kt", m4292l = {54}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06451 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f5845a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f5846b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zi3 f5847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06451(zi3 zi3Var, Continuation continuation) {
            super(2, continuation);
            this.f5847c = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C06451 c06451 = new C06451(this.f5847c, continuation);
            c06451.f5846b = obj;
            return c06451;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06451) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f5845a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                un1 un1Var = (un1) this.f5846b;
                this.f5845a = 1;
                if (this.f5847c.invoke(un1Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineBroadcastReceiverKt$goAsync$2(vl1 vl1Var, BroadcastReceiver.PendingResult pendingResult, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f5842b = vl1Var;
        this.f5843c = pendingResult;
        this.f5844d = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutineBroadcastReceiverKt$goAsync$2(this.f5842b, this.f5843c, this.f5844d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutineBroadcastReceiverKt$goAsync$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5841a;
        BroadcastReceiver.PendingResult pendingResult = this.f5843c;
        vl1 vl1Var = this.f5842b;
        try {
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    C06451 c06451 = new C06451(this.f5844d, null);
                    this.f5841a = 1;
                    if (vz1.m23649s(c06451, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
            } catch (Throwable th) {
                try {
                    if (!(th instanceof CancellationException) || th.getCause() != null) {
                        lda.m16121g(Log.e("GlanceAppWidget", "BroadcastReceiver execution failed", th));
                    }
                } catch (Throwable th2) {
                    vz1.m23637j(vl1Var, null);
                    throw th2;
                }
            }
            vz1.m23637j(vl1Var, null);
            try {
                pendingResult.finish();
            } catch (IllegalStateException e) {
                Log.e("GlanceAppWidget", "Error thrown when trying to finish broadcast", e);
            }
            return xfa.f68157a;
        } catch (Throwable th3) {
            try {
                pendingResult.finish();
            } catch (IllegalStateException e2) {
                Log.e("GlanceAppWidget", "Error thrown when trying to finish broadcast", e2);
            }
            throw th3;
        }
    }
}
