package androidx.compose.foundation;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.lj7;
import p000.mj7;
import p000.un1;
import p000.v56;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", m4291f = "Clickable.kt", m4292l = {2061, 2066, 2067}, m4293m = "invokeSuspend", m4294v = 1)
final class AbstractClickableNode$handlePressInteractionRelease$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public mj7 f1608a;

    /* JADX INFO: renamed from: b */
    public int f1609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cd4 f1610c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f1611d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ v56 f1612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$1(cd4 cd4Var, long j, v56 v56Var, Continuation continuation) {
        super(2, continuation);
        this.f1610c = cd4Var;
        this.f1611d = j;
        this.f1612e = v56Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AbstractClickableNode$handlePressInteractionRelease$1$1(this.f1610c, this.f1611d, this.f1612e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractClickableNode$handlePressInteractionRelease$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r2.m23125a(r1, r8) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        mj7 mj7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1609b;
        v56 v56Var = this.f1612e;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f1609b = 1;
            if (this.f1610c.mo4539q(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else if (i == 2) {
            mj7Var = this.f1608a;
            AbstractC3193b.m15359b(obj);
            this.f1608a = null;
            this.f1609b = 3;
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        lj7 lj7Var = new lj7(this.f1611d);
        mj7Var = new mj7(lj7Var);
        this.f1608a = mj7Var;
        this.f1609b = 2;
        if (v56Var.m23125a(lj7Var, this) != coroutineSingletons) {
            this.f1608a = null;
            this.f1609b = 3;
        }
        return coroutineSingletons;
    }
}
