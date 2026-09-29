package com.lingq.core.achievements;

import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.oo4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.RepairStreakViewModel$repairStreak$1", m4291f = "RepairStreakViewModel.kt", m4292l = {75, 80}, m4293m = "invokeSuspend", m4294v = 2)
final class RepairStreakViewModel$repairStreak$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1236c f14224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakViewModel$repairStreak$1(C1236c c1236c, Continuation continuation) {
        super(2, continuation);
        this.f14224b = c1236c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepairStreakViewModel$repairStreak$1(this.f14224b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepairStreakViewModel$repairStreak$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1236c c1236c = this.f14224b;
        C3211a c3211a = c1236c.f14232h;
        C3244l c3244l = c1236c.f14234j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14223a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (!c1236c.f14228d.m17895i()) {
                Boolean bool = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                c3211a.mo4677k("Please connect to the internet");
                return xfaVar;
            }
            Boolean bool2 = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool2);
            oo4 oo4Var = c1236c.f14227c;
            String strMo4589b2 = c1236c.f14226b.mo4589b2();
            Integer num = (Integer) c1236c.f14230f.getValue();
            int iIntValue = num != null ? num.intValue() : 1;
            this.f14223a = 1;
            obj = ((C1294j) oo4Var).m7240n(iIntValue, strMo4589b2, this);
            if (obj != coroutineSingletons) {
            }
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
        String str = (String) obj;
        if (str == null) {
            C3211a c3211a2 = c1236c.f14238n;
            this.f14223a = 2;
            return c3211a2.mo4678m(xfaVar, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
        Boolean bool3 = Boolean.FALSE;
        c3244l.getClass();
        c3244l.m15572j(null, bool3);
        c3211a.mo4677k(str);
        return xfaVar;
    }
}
