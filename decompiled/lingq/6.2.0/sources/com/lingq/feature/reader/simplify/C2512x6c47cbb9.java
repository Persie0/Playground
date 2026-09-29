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
import p000.c32;
import p000.c83;
import p000.e83;
import p000.mv0;
import p000.q05;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$lambda$0$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$lambda$0$$inlined$flatMapLatest$1", m4291f = "ReaderSimplifyStateHolder.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2512x6c47cbb9 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30467a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30468b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30469c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2518a f30470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2512x6c47cbb9(C2518a c2518a, Continuation continuation) {
        super(3, continuation);
        this.f30470d = c2518a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2512x6c47cbb9 c2512x6c47cbb9 = new C2512x6c47cbb9(this.f30470d, (Continuation) obj3);
        c2512x6c47cbb9.f30468b = (e83) obj;
        c2512x6c47cbb9.f30469c = obj2;
        return c2512x6c47cbb9.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30468b;
        Object obj2 = this.f30469c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30467a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((q05) ((C1295k) this.f30470d.f30492a.f45229a).f16498b).f57071K, true, new String[]{"LessonsSimplifiedJoin"}, new mv0(((Number) obj2).intValue(), 7)));
            this.f30468b = null;
            this.f30469c = null;
            this.f30467a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15536o, this) == coroutineSingletons) {
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
