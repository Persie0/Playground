package com.lingq.feature.onboarding.p014v2.pages;

import com.lingq.core.achievements.DailyGoal;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.fa4;
import p000.gm5;
import p000.gt6;
import p000.m0a;
import p000.sy1;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.TimeCommitmentPageKt$TimeCommitmentPage$1$1$1", m4291f = "TimeCommitmentPage.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TimeCommitmentPageKt$TimeCommitmentPage$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f27497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f27498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27499c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f27500d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f27501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeCommitmentPageKt$TimeCommitmentPage$1$1$1(String str, String str2, int i, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f27497a = str;
        this.f27498b = str2;
        this.f27499c = i;
        this.f27500d = t66Var;
        this.f27501e = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimeCommitmentPageKt$TimeCommitmentPage$1$1$1(this.f27497a, this.f27498b, this.f27499c, this.f27500d, this.f27501e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TimeCommitmentPageKt$TimeCommitmentPage$1$1$1 timeCommitmentPageKt$TimeCommitmentPage$1$1$1 = (TimeCommitmentPageKt$TimeCommitmentPage$1$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        timeCommitmentPageKt$TimeCommitmentPage$1$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        Object next;
        Object next2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Iterator it = gt6.f41300a.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            sy1 sy1Var = (sy1) next;
            if (sy1Var.f61579a.contains(this.f27497a) && fa4.m11650l(sy1Var.f61580b.getServerName(), this.f27498b)) {
                break;
            }
        }
        sy1 sy1Var2 = (sy1) next;
        Iterator<E> it2 = DailyGoal.getEntries().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((DailyGoal) next2).getMins() != this.f27499c);
        DailyGoal dailyGoal = (DailyGoal) next2;
        int i = dailyGoal == null ? -1 : m0a.f50405a[dailyGoal.ordinal()];
        if (i != -1) {
            if (i == 1) {
                num = new Integer(sy1Var2 != null ? (int) sy1Var2.f61581c : 1500);
            } else if (i == 2) {
                num = new Integer(sy1Var2 != null ? (int) sy1Var2.f61582d : 3000);
            } else if (i == 3) {
                num = new Integer(sy1Var2 != null ? (int) sy1Var2.f61583e : 6000);
            } else {
                if (i != 4) {
                    gm5.m12750e();
                    return null;
                }
                num = new Integer(sy1Var2 != null ? (int) sy1Var2.f61584f : 9000);
            }
        }
        if (num != null) {
            int iIntValue = num.intValue();
            t66 t66Var = this.f27500d;
            Integer num2 = (Integer) t66Var.getValue();
            this.f27501e.setValue(Boolean.valueOf(iIntValue > (num2 != null ? num2.intValue() : 0)));
            t66Var.setValue(num);
        }
        return xfa.f68157a;
    }
}
