package com.lingq.feature.reader.milestones.domain;

import com.lingq.core.data.repository.C1298n;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.milestones.Milestone;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.cma;
import p000.cz5;
import p000.go3;
import p000.xfa;
import p000.xy5;

/* JADX INFO: renamed from: com.lingq.feature.reader.milestones.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2269a {

    /* JADX INFO: renamed from: a */
    public final xy5 f28192a;

    /* JADX INFO: renamed from: b */
    public final cz5 f28193b;

    /* JADX INFO: renamed from: c */
    public final cma f28194c;

    public C2269a(xy5 xy5Var, cz5 cz5Var, cma cmaVar) {
        xy5Var.getClass();
        cz5Var.getClass();
        cmaVar.getClass();
        this.f28192a = xy5Var;
        this.f28193b = cz5Var;
        this.f28194c = cmaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9280a(go3 go3Var, ContinuationImpl continuationImpl) throws Throwable {
        DismissGoalNotificationUseCase$invoke$1 dismissGoalNotificationUseCase$invoke$1;
        String str;
        if (continuationImpl instanceof DismissGoalNotificationUseCase$invoke$1) {
            dismissGoalNotificationUseCase$invoke$1 = (DismissGoalNotificationUseCase$invoke$1) continuationImpl;
            int i = dismissGoalNotificationUseCase$invoke$1.f28179d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dismissGoalNotificationUseCase$invoke$1.f28179d = i - Integer.MIN_VALUE;
            } else {
                dismissGoalNotificationUseCase$invoke$1 = new DismissGoalNotificationUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            dismissGoalNotificationUseCase$invoke$1 = new DismissGoalNotificationUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = dismissGoalNotificationUseCase$invoke$1.f28177b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dismissGoalNotificationUseCase$invoke$1.f28179d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b2 = this.f28194c.mo4589b2();
            Object obj2 = go3Var.f41067b;
            if (obj2 instanceof DailyGoalMet) {
                str = ((DailyGoalMet) obj2).f19519f;
            } else {
                str = obj2 instanceof Milestone ? ((Milestone) obj2).f19533b : "";
            }
            if (str.length() > 0) {
                dismissGoalNotificationUseCase$invoke$1.f28176a = go3Var;
                dismissGoalNotificationUseCase$invoke$1.f28179d = 1;
                if (((C1298n) this.f28192a).m7330a(strMo4589b2, str, "", dismissGoalNotificationUseCase$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            go3Var = dismissGoalNotificationUseCase$invoke$1.f28176a;
            AbstractC3193b.m15359b(obj);
        }
        this.f28193b.mo7016z1(go3Var);
        return xfa.f68157a;
    }
}
