package com.lingq.feature.challenges.cup;

import com.lingq.core.domain.model.cup.CupTeamEntry;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.ew1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$1", m4291f = "CupViewModel.kt", m4292l = {146}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1980g f24642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$1(C1980g c1980g, Continuation continuation) {
        super(2, continuation);
        this.f24642b = c1980g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupViewModel$1(this.f24642b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24641a;
        C1980g c1980g = this.f24642b;
        boolean z = true;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3540rl c3540rl = new C3540rl(c1980g.f24718n, 5);
            this.f24641a = 1;
            obj = AbstractC3224d.m15541t(c3540rl, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ew1 ew1Var = (ew1) obj;
        List list = ew1Var.f37984j;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
            } while (!((CupTeamEntry) it.next()).f18998c);
        } else {
            z = false;
            break;
        }
        if (!ew1Var.f37980f && ew1Var.f37975a && !ew1Var.f37976b && z) {
            c1980g.m8844X2();
        }
        return xfa.f68157a;
    }
}
