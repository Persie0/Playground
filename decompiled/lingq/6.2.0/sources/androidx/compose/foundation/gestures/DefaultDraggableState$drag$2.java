package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b62;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", m4291f = "Draggable.kt", m4292l = {1150}, m4293m = "invokeSuspend", m4294v = 1)
final class DefaultDraggableState$drag$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0099g f1855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutatePriority f1856c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f1857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDraggableState$drag$2(C0099g c0099g, MutatePriority mutatePriority, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f1855b = c0099g;
        this.f1856c = mutatePriority;
        this.f1857d = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultDraggableState$drag$2(this.f1855b, this.f1856c, this.f1857d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultDraggableState$drag$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1854a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0099g c0099g = this.f1855b;
            C0145m c0145m = c0099g.f2257c;
            b62 b62Var = c0099g.f2256b;
            this.f1854a = 1;
            if (c0145m.m1027c(b62Var, this.f1856c, this.f1857d, this) == coroutineSingletons) {
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
