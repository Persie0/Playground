package com.lingq.feature.onboarding.level;

import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.onboarding.R$drawable;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.ai6;
import p000.bi6;
import p000.c18;
import p000.cx6;
import p000.lda;
import p000.ob1;
import p000.r75;
import p000.vz1;
import p000.w75;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.level.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2210b extends wta {

    /* JADX INFO: renamed from: b */
    public final ob1 f27262b;

    /* JADX INFO: renamed from: c */
    public final C3244l f27263c;

    /* JADX INFO: renamed from: d */
    public final c18 f27264d;

    public C2210b(ob1 ob1Var) {
        Object value;
        Object obj;
        ob1Var.getClass();
        this.f27262b = ob1Var;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        do {
            value = c3244lM17114d.getValue();
        } while (!c3244lM17114d.m15570h(value, vz1.m23605K(new r75(LearningLevel.Beginner1.getServerName(), R$string.levels_beginner, R$drawable.ic_onboarding_level_1), new r75(LearningLevel.Intermediate1.getServerName(), R$string.levels_intermediate, R$drawable.ic_onboarding_level_3), new r75(LearningLevel.Advanced1.getServerName(), R$string.levels_advanced, R$drawable.ic_onboarding_level_5))));
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f27263c = c3244lM17114d2;
        boolean zEquals = cx6.f34682a.equals(this.f27262b.m17893g());
        bi6 bi6Var = bi6.f8564a;
        if (zEquals) {
            obj = ai6.f695b;
        } else {
            cx6.f34687f = null;
            obj = bi6Var;
        }
        this.f27264d = AbstractC3224d.m15520B(AbstractC3224d.m15532k(c3244lM17114d, c3244lM17114d2, AbstractC3352my.m17114d(obj), new OnboardingLevelViewModel$levelSelectionUiState$1(4, null)), lda.m16103C(this), xi9.f68262a, new w75((7 & 1) == 0 ? null : emptyList, null, bi6Var));
    }
}
