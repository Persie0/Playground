package androidx.glance.session;

import android.content.Context;
import androidx.compose.runtime.C0281i;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.appwidget.C0656d;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3598t4;
import p000.c32;
import p000.pf1;
import p000.rcd;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorkerKt$runSession$3", m4291f = "SessionWorker.kt", m4292l = {201, 205}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorkerKt$runSession$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Throwable f6199a;

    /* JADX INFO: renamed from: b */
    public int f6200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pf1 f6201c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0696d f6202d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f6203e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0281i f6204f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0701i f6205g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorkerKt$runSession$3(pf1 pf1Var, AbstractC0696d abstractC0696d, Context context, C0281i c0281i, C0701i c0701i, Continuation continuation) {
        super(2, continuation);
        this.f6201c = pf1Var;
        this.f6202d = abstractC0696d;
        this.f6203e = context;
        this.f6204f = c0281i;
        this.f6205g = c0701i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionWorkerKt$runSession$3(this.f6201c, this.f6202d, this.f6203e, this.f6204f, this.f6205g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorkerKt$runSession$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r9 == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ?? r9;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6200b;
        xfa xfaVar = xfa.f68157a;
        Context context = this.f6203e;
        AbstractC0696d abstractC0696d = this.f6202d;
        int i2 = 2;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                pf1 pf1Var = this.f6201c;
                C0656d c0656d = (C0656d) abstractC0696d;
                c0656d.getClass();
                pf1Var.m19085A(new C0282a(-650544734, true, new C3598t4(i2, context, c0656d)));
                C0281i c0281i = this.f6204f;
                this.f6200b = 1;
                Object objM1282N = c0281i.m1282N(this);
                this = objM1282N;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.f6199a;
                    AbstractC3193b.m15359b(obj);
                    this = this;
                    vz1.m23637j(r9.f6205g, rcd.m20580a("Error in recomposition coroutine", th));
                    return xfaVar;
                }
                AbstractC3193b.m15359b(obj);
                this = this;
            }
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            this.f6199a = th2;
            this.f6200b = 2;
            abstractC0696d.f6263c.set(true);
            ((C0656d) abstractC0696d).m2226c(context, th2);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (xfaVar != coroutineSingletons) {
                th = th2;
                r9 = this;
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
