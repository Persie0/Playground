package p000;

import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.analytics.data.modules.ReaderMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class z15 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f70747a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f70748b;

    static {
        int[] iArr = new int[ReaderMode.values().length];
        try {
            iArr[ReaderMode.Page.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReaderMode.Sentence.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReaderMode.Karaoke.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReaderMode.Video.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f70747a = iArr;
        int[] iArr2 = new int[LessonEngagedDataType.values().length];
        try {
            iArr2[LessonEngagedDataType.AudioDuration.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LessonEngagedDataType.BlueWordsClicked.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LessonEngagedDataType.CoinsEarned.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[LessonEngagedDataType.KnownWordsAdded.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[LessonEngagedDataType.KnownWordsClicked.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[LessonEngagedDataType.LingqsClicked.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[LessonEngagedDataType.NthLingqsCreated.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[LessonEngagedDataType.LingqsCreated.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[LessonEngagedDataType.TimeSpentListening.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[LessonEngagedDataType.TimesListened.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[LessonEngagedDataType.TimesRead.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[LessonEngagedDataType.WordCount.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[LessonEngagedDataType.WordsIgnored.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[LessonEngagedDataType.WordsRead.ordinal()] = 14;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[LessonEngagedDataType.MeaningsCwtUsed.ordinal()] = 15;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[LessonEngagedDataType.MeaningsPopularUsed.ordinal()] = 16;
        } catch (NoSuchFieldError unused20) {
        }
        f70748b = iArr2;
    }
}
