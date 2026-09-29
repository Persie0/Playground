package com.lingq.feature.reader.simplify;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bx0;
import p000.c32;
import p000.c83;
import p000.h05;
import p000.m23;
import p000.q05;
import p000.qj2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$3$1", m4291f = "ReaderSimplifyStateHolder.kt", m4292l = {89, 91}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2518a f30456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Integer f30457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$3$1(C2518a c2518a, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f30456b = c2518a;
        this.f30457c = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$3$1(this.f30456b, this.f30457c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSimplifyStateHolder$simplifyAction$1$lessonTo$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30455a;
        xfa xfaVar = xfa.f68157a;
        Integer num = this.f30457c;
        C2518a c2518a = this.f30456b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            qj2 qj2Var = c2518a.f30494c;
            int iIntValue = num.intValue();
            q05 q05Var = (q05) ((C1295k) qj2Var.f57848a).f16498b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonEntity"}, new h05(iIntValue, q05Var, 9)), 11));
            this.f30455a = 1;
            obj = AbstractC3224d.m15541t(c83VarM15536o, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (((LessonInfo) obj) == null) {
            m23 m23Var = c2518a.f30495d;
            String strMo4589b2 = c2518a.f30499h.mo4589b2();
            int iIntValue2 = num.intValue();
            this.f30455a = 2;
            Object objM7294p = ((C1295k) m23Var.f50448a).m7294p(strMo4589b2, iIntValue2, true, this);
            if (objM7294p != coroutineSingletons) {
                objM7294p = xfaVar;
            }
            if (objM7294p == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
