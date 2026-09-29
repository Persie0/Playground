package com.lingq.feature.onboarding.p014v2;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum OnboardingYesNoQuestion {
    FirstTime("first time"),
    KnowAFewWords("know a few words"),
    TriedReadingListening("tried reading or listening"),
    UnderstandSimpleConversations("understand simple conversations"),
    ConversationsFamiliarTopics("conversations on familiar topics"),
    UnderstandArticlesMainIdea("understand articles main idea"),
    FollowNativeSpeakers("follow native speakers"),
    ShowsSlangAccentsChallenge("shows/slang/accents challenge"),
    UnderstandComplexArticles("understand complex articles");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String slug;

    OnboardingYesNoQuestion(String str) {
        this.slug = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getSlug() {
        return this.slug;
    }
}
