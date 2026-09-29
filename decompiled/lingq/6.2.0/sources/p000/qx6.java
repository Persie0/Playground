package p000;

import com.lingq.core.achievements.DailyGoal;
import com.lingq.feature.onboarding.p014v2.OnboardingPage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qx6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58336a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f58337b;

    static {
        int[] iArr = new int[OnboardingPage.values().length];
        try {
            iArr[OnboardingPage.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OnboardingPage.LANGUAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OnboardingPage.DICTIONARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OnboardingPage.AGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OnboardingPage.NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OnboardingPage.NICE_TO_MEET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OnboardingPage.MOTIVATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[OnboardingPage.LIFE_EVENT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[OnboardingPage.WHERE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[OnboardingPage.GOAL_CONFIRM.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[OnboardingPage.LEVEL.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[OnboardingPage.LEVEL_INTRO_BEGINNER.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[OnboardingPage.LEVEL_INTRO_INTERMEDIATE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[OnboardingPage.LEVEL_INTRO_ADVANCED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[OnboardingPage.BEGINNER_FIRST_TIME.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[OnboardingPage.BEGINNER_KNOW_A_FEW_WORDS.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[OnboardingPage.BEGINNER_TRIED_READING_LISTENING.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[OnboardingPage.INTERMEDIATE_SIMPLE_CONVERSATIONS.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[OnboardingPage.INTERMEDIATE_FAMILIAR_TOPICS.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[OnboardingPage.INTERMEDIATE_ARTICLES_MAIN_IDEA.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[OnboardingPage.ADVANCED_FOLLOW_NATIVE.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[OnboardingPage.ADVANCED_SHOWS_SLANG.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[OnboardingPage.ADVANCED_COMPLEX_ARTICLES.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[OnboardingPage.SPEAKING.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[OnboardingPage.LEVEL_OUTRO.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[OnboardingPage.METHOD_INTRO.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[OnboardingPage.SKILLS.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[OnboardingPage.GOALS_LINE.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[OnboardingPage.TOPICS.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[OnboardingPage.ACCENT.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[OnboardingPage.METHOD.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[OnboardingPage.FAMILIARITY.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[OnboardingPage.TIME_COMMITMENT.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[OnboardingPage.ACHIEVE_GOALS.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[OnboardingPage.COMMITMENT.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[OnboardingPage.SECTION35_1.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[OnboardingPage.SECTION35_2.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[OnboardingPage.SECTION35_3.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[OnboardingPage.SECTION35_4.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[OnboardingPage.MINI_LESSON_INTRO.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[OnboardingPage.MINI_LESSON_LESSON_INTRO.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[OnboardingPage.MINI_LESSON_READ_LISTEN.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[OnboardingPage.MINI_LESSON_TAP_WORD.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[OnboardingPage.MINI_LESSON_FIRST_LINGQ.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[OnboardingPage.MINI_LESSON_KEEP_ENCOUNTERING.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[OnboardingPage.MINI_LESSON_LYNX_AI.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[OnboardingPage.SIGN_UP.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[OnboardingPage.PERSONALIZING.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[OnboardingPage.PAYWALL_CONFIDENCE.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[OnboardingPage.PAYWALL_CONFIDENCE_LONG.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        f58336a = iArr;
        int[] iArr2 = new int[DailyGoal.values().length];
        try {
            iArr2[DailyGoal.Casual.ordinal()] = 1;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[DailyGoal.Steady.ordinal()] = 2;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[DailyGoal.Intense.ordinal()] = 3;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[DailyGoal.Insane.ordinal()] = 4;
        } catch (NoSuchFieldError unused54) {
        }
        f58337b = iArr2;
    }
}
