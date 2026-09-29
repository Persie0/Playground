package androidx.compose.material3.pulltorefresh;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", m4291f = "PullToRefresh.kt", m4292l = {360, 362}, m4293m = "invokeSuspend", m4294v = 1)
final class PullToRefreshModifierNode$update$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3595a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0259b f3596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$update$1(C0259b c0259b, Continuation continuation) {
        super(2, continuation);
        this.f3596b = c0259b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PullToRefreshModifierNode$update$1(this.f3596b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PullToRefreshModifierNode$update$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r5.m1192d1(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (androidx.compose.material3.pulltorefresh.C0259b.m1191c1(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3595a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0259b c0259b = this.f3596b;
            if (c0259b.f3602L) {
                this.f3595a = 2;
            } else {
                this.f3595a = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
