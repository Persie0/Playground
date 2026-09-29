package com.lingq.feature.onboarding.topics;

import com.lingq.core.domain.model.FeedTopic;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.ai6;
import p000.c18;
import p000.lda;
import p000.m7a;
import p000.w7a;
import p000.wta;
import p000.xi9;

/* JADX INFO: loaded from: classes3.dex */
public final class OnboardingTopicsViewModel extends wta {

    /* JADX INFO: renamed from: b */
    public final C3244l f27285b;

    /* JADX INFO: renamed from: c */
    public final c18 f27286c;

    public OnboardingTopicsViewModel() {
        Object value;
        ArrayList arrayList;
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        do {
            value = c3244lM17114d.getValue();
            FeedTopic[] feedTopicArrValues = FeedTopic.values();
            arrayList = new ArrayList(feedTopicArrValues.length);
            for (FeedTopic feedTopic : feedTopicArrValues) {
                arrayList.add(new m7a(feedTopic, false));
            }
        } while (!c3244lM17114d.m15570h(value, arrayList));
        this.f27285b = c3244lM17114d;
        this.f27286c = AbstractC3224d.m15520B(AbstractC3224d.m15546y(c3244lM17114d, new OnboardingTopicsViewModel$uiState$1(2, null)), lda.m16103C(this), xi9.f68262a, new w7a((7 & 1) == 0 ? null : emptyList, false, ai6.f698e));
    }
}
