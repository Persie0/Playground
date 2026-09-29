package com.lingq.core.analytics.data;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum LqAnalyticsValues$OnboardingSurveyQuestion {
    Motivation("motivation"),
    SkillsDesired("skills desired"),
    Confidence("confidence"),
    LearningStyle("learning style"),
    Age("age"),
    Name("name"),
    LifeEvent("life event"),
    Where("where"),
    FirstTime("first time"),
    KnowAFewWords("know a few words"),
    TriedReadingListening("tried reading or listening"),
    UnderstandSimpleConversations("understand simple conversations"),
    ConversationsFamiliarTopics("conversations on familiar topics"),
    UnderstandArticlesMainIdea("understand articles main idea"),
    FollowNativeSpeakers("follow native speakers"),
    ShowsSlangAccentsChallenge("shows/slang/accents challenge"),
    UnderstandComplexArticles("understand complex articles"),
    Familiarity("familiarity");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LqAnalyticsValues$OnboardingSurveyQuestion(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
