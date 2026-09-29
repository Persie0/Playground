package com.lingq.feature.challenges.cup;

import com.lingq.core.domain.model.cup.CupTeam;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.ew1;
import p000.hi8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$refresh$5", m4291f = "CupViewModel.kt", m4292l = {197, 198}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$refresh$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1980g f24662b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$refresh$5(C1980g c1980g, Continuation continuation) {
        super(2, continuation);
        this.f24662b = c1980g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupViewModel$refresh$5(this.f24662b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupViewModel$refresh$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r8.m13286w(r5, r7) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24661a;
        C1980g c1980g = this.f24662b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3540rl c3540rl = new C3540rl(c1980g.f24718n, 5);
            this.f24661a = 1;
            obj = AbstractC3224d.m15541t(c3540rl, this);
            if (obj != coroutineSingletons) {
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
        return xfa.f68157a;
        ew1 ew1Var = (ew1) obj;
        CupTeam cupTeam = ew1Var.f37981g;
        if (cupTeam != null && (str = cupTeam.f18994b) != null) {
            String str2 = ew1Var.f37976b ? str : null;
            if (str2 != null) {
                hi8 hi8Var = c1980g.f24710f;
                this.f24661a = 2;
            }
        }
        return xfa.f68157a;
    }
}
