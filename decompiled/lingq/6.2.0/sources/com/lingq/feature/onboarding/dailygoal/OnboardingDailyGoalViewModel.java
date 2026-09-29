package com.lingq.feature.onboarding.dailygoal;

import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.domain.model.LearningLevel;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.lda;
import p000.wta;
import p000.xi9;
import p000.zy1;

/* JADX INFO: loaded from: classes3.dex */
public final class OnboardingDailyGoalViewModel extends wta {

    /* JADX INFO: renamed from: b */
    public final C3244l f27189b;

    /* JADX INFO: renamed from: c */
    public final c18 f27190c;

    public OnboardingDailyGoalViewModel() {
        C3244l c3244lM17114d = AbstractC3352my.m17114d(DailyGoal.getEntries());
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f27189b = c3244lM17114d2;
        this.f27190c = AbstractC3224d.m15520B(new C3228h(c3244lM17114d, c3244lM17114d2, new OnboardingDailyGoalViewModel$uiState$1(3, null)), lda.m16103C(this), xi9.f68262a, new zy1("en", (15 & 2) != 0 ? LearningLevel.Beginner1 : null, (15 & 4) != 0 ? EmptyList.f47638a : null, null));
    }
}
