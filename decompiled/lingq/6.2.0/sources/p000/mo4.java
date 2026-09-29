package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class mo4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f51633a;

    static {
        int[] iArr = new int[LanguageProgressMetric.values().length];
        try {
            iArr[LanguageProgressMetric.ListeningHours.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LanguageProgressMetric.WordsOfReading.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LanguageProgressMetric.WrittenWords.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LanguageProgressMetric.SpeakingHours.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LanguageProgressMetric.KnownWords.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LanguageProgressMetric.LingQsCreated.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[LanguageProgressMetric.LearnedLingQs.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[LanguageProgressMetric.CoinsEarned.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[LanguageProgressMetric.StudyTime.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[LanguageProgressMetric.ReadingSpeed.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f51633a = iArr;
    }
}
