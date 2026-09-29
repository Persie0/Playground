package com.lingq.feature.reader.milestones.domain;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.milestones.GoalMetType;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import com.lingq.core.domain.model.user.ProfileSettings;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.cz5;
import p000.go3;
import p000.h24;
import p000.hm5;
import p000.km7;
import p000.qn6;
import p000.si7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.milestones.domain.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2271c {

    /* JADX INFO: renamed from: a */
    public final si7 f28201a;

    /* JADX INFO: renamed from: b */
    public final km7 f28202b;

    /* JADX INFO: renamed from: c */
    public final qn6 f28203c;

    /* JADX INFO: renamed from: d */
    public final cz5 f28204d;

    /* JADX INFO: renamed from: e */
    public final hm5 f28205e;

    public C2271c(si7 si7Var, km7 km7Var, qn6 qn6Var, cz5 cz5Var, hm5 hm5Var) {
        si7Var.getClass();
        km7Var.getClass();
        qn6Var.getClass();
        cz5Var.getClass();
        hm5Var.getClass();
        this.f28201a = si7Var;
        this.f28202b = km7Var;
        this.f28203c = qn6Var;
        this.f28204d = cz5Var;
        this.f28205e = hm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m9282a(int i, ContinuationImpl continuationImpl) throws Throwable {
        UpdateStreakChallengeUseCase$invoke$1 updateStreakChallengeUseCase$invoke$1;
        int i2;
        int i3;
        if (continuationImpl instanceof UpdateStreakChallengeUseCase$invoke$1) {
            updateStreakChallengeUseCase$invoke$1 = (UpdateStreakChallengeUseCase$invoke$1) continuationImpl;
            int i4 = updateStreakChallengeUseCase$invoke$1.f28191d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                updateStreakChallengeUseCase$invoke$1.f28191d = i4 - Integer.MIN_VALUE;
            } else {
                updateStreakChallengeUseCase$invoke$1 = new UpdateStreakChallengeUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateStreakChallengeUseCase$invoke$1 = new UpdateStreakChallengeUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = updateStreakChallengeUseCase$invoke$1.f28189b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = updateStreakChallengeUseCase$invoke$1.f28191d;
        xfa xfaVar = xfa.f68157a;
        if (i5 == 0) {
            AbstractC3193b.m15359b(obj);
            i2 = i;
            updateStreakChallengeUseCase$invoke$1.f28188a = i2;
            updateStreakChallengeUseCase$invoke$1.f28191d = 1;
            if (((C1368a) this.f28201a).m7912y(true, updateStreakChallengeUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            int i6 = updateStreakChallengeUseCase$invoke$1.f28188a;
            AbstractC3193b.m15359b(obj);
            i2 = i6;
        } else {
            if (i5 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = updateStreakChallengeUseCase$invoke$1.f28188a;
            AbstractC3193b.m15359b(obj);
        }
        if (i3 > 0) {
            this.f28203c.mo7013g1(new h24(InAppNotificationType.StreakChallenge, null, new Integer(i3), 14));
        }
        Bundle bundle = new Bundle();
        bundle.putInt("streak challenge selected", i3);
        ((C1240a) this.f28205e).m7025f("streak challenge popup clicked", bundle);
        this.f28204d.mo7016z1(new go3(GoalMetType.StreakChallenge, new Integer(0)));
        return xfaVar;
        ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Integer(i2), null, null, null, null, null, null, -1, -1, 16775167);
        updateStreakChallengeUseCase$invoke$1.f28188a = i2;
        updateStreakChallengeUseCase$invoke$1.f28191d = 2;
        ((C1267a) this.f28202b).m7061B(profileSettings);
        if (xfaVar != coroutineSingletons) {
            i3 = i2;
            if (i3 > 0) {
                this.f28203c.mo7013g1(new h24(InAppNotificationType.StreakChallenge, null, new Integer(i3), 14));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("streak challenge selected", i3);
            ((C1240a) this.f28205e).m7025f("streak challenge popup clicked", bundle2);
            this.f28204d.mo7016z1(new go3(GoalMetType.StreakChallenge, new Integer(0)));
            return xfaVar;
        }
        return coroutineSingletons;
    }
}
