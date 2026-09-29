package com.lingq.feature.reader.simplify;

import com.lingq.core.data.repository.C1295k;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.bx0;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.h05;
import p000.i83;
import p000.q05;
import p000.qj2;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$lambda$0$$inlined$flatMapLatest$3 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$lambda$0$$inlined$flatMapLatest$3", m4291f = "ReaderSimplifyStateHolder.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2514x6c47cbbb extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30475a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30476b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30477c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2518a f30478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2514x6c47cbbb(C2518a c2518a, Continuation continuation) {
        super(3, continuation);
        this.f30478d = c2518a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2514x6c47cbbb c2514x6c47cbbb = new C2514x6c47cbbb(this.f30478d, (Continuation) obj3);
        c2514x6c47cbbb.f30476b = (e83) obj;
        c2514x6c47cbbb.f30477c = obj2;
        return c2514x6c47cbbb.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 i83Var;
        e83 e83Var = this.f30476b;
        Object obj2 = this.f30477c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30475a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Integer num = (Integer) obj2;
            if (num != null) {
                C2518a c2518a = this.f30478d;
                wfb.m23926u(c2518a.f30501j, null, null, new ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$3$1(c2518a, num, null), 3);
                qj2 qj2Var = c2518a.f30494c;
                int iIntValue = num.intValue();
                q05 q05Var = (q05) ((C1295k) qj2Var.f57848a).f16498b;
                i83Var = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonEntity"}, new h05(iIntValue, q05Var, 9)), 11));
            } else {
                i83Var = new i83(null, 1);
            }
            this.f30476b = null;
            this.f30477c = null;
            this.f30475a = 1;
            if (AbstractC3224d.m15537p(e83Var, i83Var, this) == coroutineSingletons) {
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
