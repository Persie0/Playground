package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1287c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.ao0;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.on0;
import p000.u08;
import p000.un0;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$phrases$2", m4291f = "ReaderViewModel.kt", m4292l = {406}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$phrases$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29009a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f29011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$phrases$2(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f29011c = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$phrases$2 readerViewModel$phrases$2 = new ReaderViewModel$phrases$2(this.f29011c, (Continuation) obj3);
        readerViewModel$phrases$2.f29010b = (e83) obj;
        return readerViewModel$phrases$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f29010b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29009a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2412n c2412n = this.f29011c;
        ao0 ao0Var = c2412n.f29400r;
        int iM9332l3 = c2412n.m9332l3();
        un0 un0Var = ((C1287c) ao0Var).f16453b;
        c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(un0Var.f64101K, true, new String[]{"CardEntity", "LessonsAndCardsJoin"}, new on0(iM9332l3, un0Var, 2)));
        this.f29010b = null;
        this.f29009a = 1;
        AbstractC3224d.m15539r(e83Var);
        Object objCollect = c83VarM15536o.collect(new u08(e83Var, c2412n, 0), this);
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
