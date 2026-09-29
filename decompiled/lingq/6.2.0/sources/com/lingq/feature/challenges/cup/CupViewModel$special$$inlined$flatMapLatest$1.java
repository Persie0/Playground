package com.lingq.feature.challenges.cup;

import com.lingq.core.data.repository.C1291g;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.dm3;
import p000.e83;
import p000.i83;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$special$$inlined$flatMapLatest$1", m4291f = "CupViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class CupViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24663a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24664b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24665c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dm3 f24666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, dm3 dm3Var) {
        super(3, continuation);
        this.f24666d = dm3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CupViewModel$special$$inlined$flatMapLatest$1 cupViewModel$special$$inlined$flatMapLatest$1 = new CupViewModel$special$$inlined$flatMapLatest$1((Continuation) obj3, this.f24666d);
        cupViewModel$special$$inlined$flatMapLatest$1.f24664b = (e83) obj;
        cupViewModel$special$$inlined$flatMapLatest$1.f24665c = obj2;
        return cupViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f24664b;
        Object obj2 = this.f24665c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24663a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = (String) obj2;
            c83 i83Var = str == null ? new i83(null, 1) : ((C1291g) this.f24666d.f35822a).m7194g(str);
            this.f24664b = null;
            this.f24665c = null;
            this.f24663a = 1;
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
