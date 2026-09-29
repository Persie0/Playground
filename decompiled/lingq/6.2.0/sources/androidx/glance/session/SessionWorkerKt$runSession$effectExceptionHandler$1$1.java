package androidx.glance.session;

import android.content.Context;
import androidx.glance.appwidget.C0656d;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.rcd;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorkerKt$runSession$effectExceptionHandler$1$1", m4291f = "SessionWorker.kt", m4292l = {ModuleDescriptor.MODULE_VERSION}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorkerKt$runSession$effectExceptionHandler$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0696d f6230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f6231c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Throwable f6232d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0701i f6233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorkerKt$runSession$effectExceptionHandler$1$1(AbstractC0696d abstractC0696d, Context context, Throwable th, C0701i c0701i, Continuation continuation) {
        super(2, continuation);
        this.f6230b = abstractC0696d;
        this.f6231c = context;
        this.f6232d = th;
        this.f6233e = c0701i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionWorkerKt$runSession$effectExceptionHandler$1$1(this.f6230b, this.f6231c, this.f6232d, this.f6233e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorkerKt$runSession$effectExceptionHandler$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6229a;
        xfa xfaVar = xfa.f68157a;
        Throwable th = this.f6232d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6229a = 1;
            AbstractC0696d abstractC0696d = this.f6230b;
            abstractC0696d.f6263c.set(true);
            ((C0656d) abstractC0696d).m2226c(this.f6231c, th);
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        vz1.m23637j(this.f6233e, rcd.m20580a("Error in composition effect coroutine", th));
        return xfaVar;
    }
}
