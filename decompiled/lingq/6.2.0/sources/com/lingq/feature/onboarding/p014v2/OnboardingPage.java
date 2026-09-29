package com.lingq.feature.onboarding.p014v2;

import com.lingq.core.domain.model.LearningLevel;
import kotlin.enums.AbstractC3201a;
import p000.gm5;
import p000.ru6;
import p000.su6;
import p000.y52;
import p000.ys2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WHERE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class OnboardingPage {
    private static final /* synthetic */ ys2 $ENTRIES;
    private static final /* synthetic */ OnboardingPage[] $VALUES;
    public static final OnboardingPage ACCENT;
    public static final OnboardingPage ACHIEVE_GOALS;
    public static final OnboardingPage ADVANCED_COMPLEX_ARTICLES;
    public static final OnboardingPage ADVANCED_FOLLOW_NATIVE;
    public static final OnboardingPage ADVANCED_SHOWS_SLANG;
    public static final OnboardingPage BEGINNER_FIRST_TIME;
    public static final OnboardingPage BEGINNER_KNOW_A_FEW_WORDS;
    public static final OnboardingPage BEGINNER_TRIED_READING_LISTENING;
    public static final OnboardingPage COMMITMENT;
    public static final ru6 Companion;
    public static final OnboardingPage FAMILIARITY;
    public static final OnboardingPage GOALS_LINE;
    public static final OnboardingPage INTERMEDIATE_ARTICLES_MAIN_IDEA;
    public static final OnboardingPage INTERMEDIATE_FAMILIAR_TOPICS;
    public static final OnboardingPage INTERMEDIATE_SIMPLE_CONVERSATIONS;
    public static final OnboardingPage LEVEL_INTRO_ADVANCED;
    public static final OnboardingPage LEVEL_INTRO_BEGINNER;
    public static final OnboardingPage LEVEL_INTRO_INTERMEDIATE;
    public static final OnboardingPage LEVEL_OUTRO;
    public static final OnboardingPage METHOD;
    public static final OnboardingPage METHOD_INTRO;
    public static final OnboardingPage MINI_LESSON_FIRST_LINGQ;
    public static final OnboardingPage MINI_LESSON_INTRO;
    public static final OnboardingPage MINI_LESSON_KEEP_ENCOUNTERING;
    public static final OnboardingPage MINI_LESSON_LESSON_INTRO;
    public static final OnboardingPage MINI_LESSON_LYNX_AI;
    public static final OnboardingPage MINI_LESSON_READ_LISTEN;
    public static final OnboardingPage MINI_LESSON_TAP_WORD;
    public static final OnboardingPage PAYWALL_CONFIDENCE;
    public static final OnboardingPage PAYWALL_CONFIDENCE_LONG;
    public static final OnboardingPage PERSONALIZING;
    public static final OnboardingPage SECTION35_1;
    public static final OnboardingPage SECTION35_2;
    public static final OnboardingPage SECTION35_3;
    public static final OnboardingPage SECTION35_4;
    public static final OnboardingPage SIGN_UP;
    public static final OnboardingPage SKILLS;
    public static final OnboardingPage SPEAKING;
    public static final OnboardingPage TIME_COMMITMENT;
    public static final OnboardingPage TOPICS;
    public static final OnboardingPage WHERE;
    private final int index;
    private final LevelBranch levelBranch;
    private final boolean praktikaLongOnly;
    public static final OnboardingPage START = new OnboardingPage("START", 0, 0, false, null, 6, null);
    public static final OnboardingPage LANGUAGE = new OnboardingPage("LANGUAGE", 1, 1, false, null, 6, null);
    public static final OnboardingPage DICTIONARY = new OnboardingPage("DICTIONARY", 2, 2, false, null, 6, null);
    public static final OnboardingPage AGE = new OnboardingPage("AGE", 3, 3, true, null, 4, null);
    public static final OnboardingPage NAME = new OnboardingPage("NAME", 4, 4, true, null, 4, null);
    public static final OnboardingPage NICE_TO_MEET = new OnboardingPage("NICE_TO_MEET", 5, 5, true, null, 4, null);
    public static final OnboardingPage MOTIVATION = new OnboardingPage("MOTIVATION", 6, 6, false, null, 6, null);
    public static final OnboardingPage LIFE_EVENT = new OnboardingPage("LIFE_EVENT", 7, 7, true, null, 4, null);
    public static final OnboardingPage GOAL_CONFIRM = new OnboardingPage("GOAL_CONFIRM", 9, 9, false, null, 6, null);
    public static final OnboardingPage LEVEL = new OnboardingPage("LEVEL", 10, 10, false, null, 6, null);

    private static final /* synthetic */ OnboardingPage[] $values() {
        return new OnboardingPage[]{START, LANGUAGE, DICTIONARY, AGE, NAME, NICE_TO_MEET, MOTIVATION, LIFE_EVENT, WHERE, GOAL_CONFIRM, LEVEL, LEVEL_INTRO_BEGINNER, BEGINNER_FIRST_TIME, BEGINNER_KNOW_A_FEW_WORDS, BEGINNER_TRIED_READING_LISTENING, LEVEL_INTRO_INTERMEDIATE, INTERMEDIATE_SIMPLE_CONVERSATIONS, INTERMEDIATE_FAMILIAR_TOPICS, INTERMEDIATE_ARTICLES_MAIN_IDEA, LEVEL_INTRO_ADVANCED, ADVANCED_FOLLOW_NATIVE, ADVANCED_SHOWS_SLANG, ADVANCED_COMPLEX_ARTICLES, SPEAKING, LEVEL_OUTRO, METHOD_INTRO, SKILLS, GOALS_LINE, TOPICS, ACCENT, METHOD, FAMILIARITY, TIME_COMMITMENT, ACHIEVE_GOALS, COMMITMENT, SECTION35_1, SECTION35_2, SECTION35_3, SECTION35_4, MINI_LESSON_INTRO, MINI_LESSON_LESSON_INTRO, MINI_LESSON_READ_LISTEN, MINI_LESSON_TAP_WORD, MINI_LESSON_FIRST_LINGQ, MINI_LESSON_KEEP_ENCOUNTERING, MINI_LESSON_LYNX_AI, SIGN_UP, PERSONALIZING, PAYWALL_CONFIDENCE, PAYWALL_CONFIDENCE_LONG};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        y52 y52Var = null;
        WHERE = new OnboardingPage("WHERE", 8, 8, true, null, 4, y52Var);
        LevelBranch levelBranch = LevelBranch.Beginner;
        LEVEL_INTRO_BEGINNER = new OnboardingPage("LEVEL_INTRO_BEGINNER", 11, 11, true, levelBranch);
        BEGINNER_FIRST_TIME = new OnboardingPage("BEGINNER_FIRST_TIME", 12, 12, true, levelBranch);
        BEGINNER_KNOW_A_FEW_WORDS = new OnboardingPage("BEGINNER_KNOW_A_FEW_WORDS", 13, 13, true, levelBranch);
        BEGINNER_TRIED_READING_LISTENING = new OnboardingPage("BEGINNER_TRIED_READING_LISTENING", 14, 14, true, levelBranch);
        LevelBranch levelBranch2 = LevelBranch.Intermediate;
        LEVEL_INTRO_INTERMEDIATE = new OnboardingPage("LEVEL_INTRO_INTERMEDIATE", 15, 15, true, levelBranch2);
        INTERMEDIATE_SIMPLE_CONVERSATIONS = new OnboardingPage("INTERMEDIATE_SIMPLE_CONVERSATIONS", 16, 16, true, levelBranch2);
        INTERMEDIATE_FAMILIAR_TOPICS = new OnboardingPage("INTERMEDIATE_FAMILIAR_TOPICS", 17, 17, true, levelBranch2);
        INTERMEDIATE_ARTICLES_MAIN_IDEA = new OnboardingPage("INTERMEDIATE_ARTICLES_MAIN_IDEA", 18, 18, true, levelBranch2);
        LevelBranch levelBranch3 = LevelBranch.Advanced;
        LEVEL_INTRO_ADVANCED = new OnboardingPage("LEVEL_INTRO_ADVANCED", 19, 19, true, levelBranch3);
        ADVANCED_FOLLOW_NATIVE = new OnboardingPage("ADVANCED_FOLLOW_NATIVE", 20, 20, true, levelBranch3);
        ADVANCED_SHOWS_SLANG = new OnboardingPage("ADVANCED_SHOWS_SLANG", 21, 21, true, levelBranch3);
        ADVANCED_COMPLEX_ARTICLES = new OnboardingPage("ADVANCED_COMPLEX_ARTICLES", 22, 22, true, levelBranch3);
        SPEAKING = new OnboardingPage("SPEAKING", 23, 23, false, null, 6, null);
        LEVEL_OUTRO = new OnboardingPage("LEVEL_OUTRO", 24, 24, true, null, 4, null);
        METHOD_INTRO = new OnboardingPage("METHOD_INTRO", 25, 25, true, null, 4, null);
        SKILLS = new OnboardingPage("SKILLS", 26, 26, false, null, 6, null);
        GOALS_LINE = new OnboardingPage("GOALS_LINE", 27, 27, false, null, 6, null);
        TOPICS = new OnboardingPage("TOPICS", 28, 28, false, null, 6, 0 == true ? 1 : 0);
        ACCENT = new OnboardingPage("ACCENT", 29, 29, false, null, 6, null);
        METHOD = new OnboardingPage("METHOD", 30, 30, false, null, 6, y52Var);
        FAMILIARITY = new OnboardingPage("FAMILIARITY", 31, 31, true, null, 4, null);
        TIME_COMMITMENT = new OnboardingPage("TIME_COMMITMENT", 32, 32, false, null, 6, null);
        ACHIEVE_GOALS = new OnboardingPage("ACHIEVE_GOALS", 33, 33, false, null, 6, null);
        COMMITMENT = new OnboardingPage("COMMITMENT", 34, 34, true, null, 4, null);
        SECTION35_1 = new OnboardingPage("SECTION35_1", 35, 35, true, null, 4, null);
        SECTION35_2 = new OnboardingPage("SECTION35_2", 36, 36, true, null, 4, null);
        SECTION35_3 = new OnboardingPage("SECTION35_3", 37, 37, true, null, 4, 0 == true ? 1 : 0);
        SECTION35_4 = new OnboardingPage("SECTION35_4", 38, 38, true, null, 4, null);
        MINI_LESSON_INTRO = new OnboardingPage("MINI_LESSON_INTRO", 39, 39, true, null, 4, y52Var);
        MINI_LESSON_LESSON_INTRO = new OnboardingPage("MINI_LESSON_LESSON_INTRO", 40, 40, true, null, 4, null);
        MINI_LESSON_READ_LISTEN = new OnboardingPage("MINI_LESSON_READ_LISTEN", 41, 41, true, null, 4, null);
        MINI_LESSON_TAP_WORD = new OnboardingPage("MINI_LESSON_TAP_WORD", 42, 42, true, null, 4, null);
        MINI_LESSON_FIRST_LINGQ = new OnboardingPage("MINI_LESSON_FIRST_LINGQ", 43, 43, true, null, 4, null);
        MINI_LESSON_KEEP_ENCOUNTERING = new OnboardingPage("MINI_LESSON_KEEP_ENCOUNTERING", 44, 44, true, null, 4, null);
        MINI_LESSON_LYNX_AI = new OnboardingPage("MINI_LESSON_LYNX_AI", 45, 45, true, null, 4, null);
        SIGN_UP = new OnboardingPage("SIGN_UP", 46, 46, false, null, 6, 0 == true ? 1 : 0);
        PERSONALIZING = new OnboardingPage("PERSONALIZING", 47, 47, false, null, 6, null);
        PAYWALL_CONFIDENCE = new OnboardingPage("PAYWALL_CONFIDENCE", 48, 48, false, null, 6, y52Var);
        PAYWALL_CONFIDENCE_LONG = new OnboardingPage("PAYWALL_CONFIDENCE_LONG", 49, 51, true, null, 4, null);
        OnboardingPage[] onboardingPageArr$values = $values();
        $VALUES = onboardingPageArr$values;
        $ENTRIES = AbstractC3201a.m15404a(onboardingPageArr$values);
        Companion = new ru6();
    }

    public /* synthetic */ OnboardingPage(String str, int i, int i2, boolean z, LevelBranch levelBranch, int i3, y52 y52Var) {
        this(str, i, i2, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? LevelBranch.Any : levelBranch);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static OnboardingPage valueOf(String str) {
        return (OnboardingPage) Enum.valueOf(OnboardingPage.class, str);
    }

    public static OnboardingPage[] values() {
        return (OnboardingPage[]) $VALUES.clone();
    }

    public final int getIndex() {
        return this.index;
    }

    public final LevelBranch getLevelBranch() {
        return this.levelBranch;
    }

    public final boolean getPraktikaLongOnly() {
        return this.praktikaLongOnly;
    }

    public final boolean matchesLevel(String str) {
        str.getClass();
        int i = su6.f61444a[this.levelBranch.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return str.equals(LearningLevel.Beginner1.getServerName());
        }
        if (i == 3) {
            return str.equals(LearningLevel.Intermediate1.getServerName());
        }
        if (i == 4) {
            return str.equals(LearningLevel.Advanced1.getServerName());
        }
        gm5.m12750e();
        return false;
    }

    private OnboardingPage(String str, int i, int i2, boolean z, LevelBranch levelBranch) {
        super(str, i);
        this.index = i2;
        this.praktikaLongOnly = z;
        this.levelBranch = levelBranch;
    }
}
