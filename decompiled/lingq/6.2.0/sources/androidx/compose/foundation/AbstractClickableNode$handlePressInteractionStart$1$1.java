package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.lj7;
import p000.p31;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", m4291f = "Clickable.kt", m4292l = {2007, 2008}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$handlePressInteractionStart$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1616a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f1617b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lj7 f1618c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0075a f1619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionStart$1$1(v56 v56Var, lj7 lj7Var, AbstractC0075a abstractC0075a, Continuation continuation) {
        super(2, continuation);
        this.f1617b = v56Var;
        this.f1618c = lj7Var;
        this.f1619d = abstractC0075a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$handlePressInteractionStart$1$1(this.f1617b, this.f1618c, this.f1619d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteractionStart$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r7.f1617b.m23125a(r2, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1616a;
        lj7 lj7Var = this.f1618c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            long j = p31.f55510a;
            this.f1616a = 1;
            if (AbstractC3208a.m15437d(j, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f1619d.f1733b0 = lj7Var;
        return xfa.f68157a;
        this.f1616a = 2;
    }
}
