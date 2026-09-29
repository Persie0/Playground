package p000;

import com.lingq.core.domain.model.ContentType;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageProgressUpdate;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.model.settings.CantoneseScript;
import com.lingq.core.domain.model.settings.ChineseScript;
import com.lingq.core.domain.model.settings.ChineseTraditionalScript;
import com.lingq.core.domain.model.settings.JapaneseScript;
import com.lingq.core.domain.model.settings.LatinScript;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySort;
import com.lingq.core.domain.stats.ActivityScore;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class n78 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52445a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f52446b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f52447c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f52448d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int[] f52449e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int[] f52450f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int[] f52451g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int[] f52452h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int[] f52453i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int[] f52454j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int[] f52455k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int[] f52456l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int[] f52457m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int[] f52458n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int[] f52459o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int[] f52460p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int[] f52461q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int[] f52462r;

    static {
        int[] iArr = new int[LanguageProgressUpdate.values().length];
        try {
            iArr[LanguageProgressUpdate.HoursListening.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LanguageProgressUpdate.WordsReading.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LanguageProgressUpdate.WordsWriting.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LanguageProgressUpdate.HoursSpeaking.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[LanguageProgressInterval.values().length];
        try {
            iArr2[LanguageProgressInterval.AllTime.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LanguageProgressInterval.LastYear.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LanguageProgressInterval.LastSixMonths.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[LanguageProgressInterval.LastThreeMonths.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[LanguageProgressInterval.LastMonth.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[LanguageProgressInterval.LastTwoWeeks.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[LanguageProgressInterval.LastWeek.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[LanguageProgressInterval.Yesterday.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[LanguageProgressInterval.Today.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        int[] iArr3 = new int[LanguageProgressPeriod.values().length];
        try {
            iArr3[LanguageProgressPeriod.Last7Days.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[LanguageProgressPeriod.Last14Days.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[LanguageProgressPeriod.Last30Days.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[LanguageProgressPeriod.ThisMonth.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[LanguageProgressPeriod.LastMonth.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[LanguageProgressPeriod.Last3Months.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[LanguageProgressPeriod.Last6Months.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[LanguageProgressPeriod.AllTime.ordinal()] = 8;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[LanguageProgressPeriod.Today.ordinal()] = 9;
        } catch (NoSuchFieldError unused22) {
        }
        f52445a = iArr3;
        int[] iArr4 = new int[LanguageProgressMetric.values().length];
        try {
            iArr4[LanguageProgressMetric.KnownWords.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[LanguageProgressMetric.LingQsCreated.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[LanguageProgressMetric.LearnedLingQs.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[LanguageProgressMetric.ListeningHours.ordinal()] = 4;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[LanguageProgressMetric.WordsOfReading.ordinal()] = 5;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[LanguageProgressMetric.CoinsEarned.ordinal()] = 6;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[LanguageProgressMetric.SpeakingHours.ordinal()] = 7;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[LanguageProgressMetric.WrittenWords.ordinal()] = 8;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[LanguageProgressMetric.StudyTime.ordinal()] = 9;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr4[LanguageProgressMetric.ReadingSpeed.ordinal()] = 10;
        } catch (NoSuchFieldError unused32) {
        }
        f52446b = iArr4;
        int[] iArr5 = new int[ActivityScore.values().length];
        try {
            iArr5[ActivityScore.Attention.ordinal()] = 1;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr5[ActivityScore.Ok.ordinal()] = 2;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr5[ActivityScore.Almost.ordinal()] = 3;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr5[ActivityScore.Great.ordinal()] = 4;
        } catch (NoSuchFieldError unused36) {
        }
        f52447c = iArr5;
        int[] iArr6 = new int[Accent.values().length];
        try {
            iArr6[Accent.Standard.ordinal()] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr6[Accent.Egyptian.ordinal()] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr6[Accent.Levantine.ordinal()] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr6[Accent.Formal.ordinal()] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr6[Accent.Spoken.ordinal()] = 5;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr6[Accent.European.ordinal()] = 6;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr6[Accent.Brazilian.ordinal()] = 7;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr6[Accent.EuropeanSpanish.ordinal()] = 8;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr6[Accent.LatinAmerican.ordinal()] = 9;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr6[Accent.American.ordinal()] = 10;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr6[Accent.British.ordinal()] = 11;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr6[Accent.Canadian.ordinal()] = 12;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr6[Accent.France.ordinal()] = 13;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr6[Accent.CanadianFrench.ordinal()] = 14;
        } catch (NoSuchFieldError unused50) {
        }
        f52448d = iArr6;
        int[] iArr7 = new int[Sort.values().length];
        try {
            iArr7[Sort.Position.ordinal()] = 1;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr7[Sort.Relevance.ordinal()] = 2;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr7[Sort.AtoZ.ordinal()] = 3;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr7[Sort.Complete.ordinal()] = 4;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr7[Sort.Incomplete.ordinal()] = 5;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr7[Sort.Newest.ordinal()] = 6;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr7[Sort.Oldest.ordinal()] = 7;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr7[Sort.Opened.ordinal()] = 8;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr7[Sort.Imported.ordinal()] = 9;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr7[Sort.Liked.ordinal()] = 10;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr7[Sort.RecentlyOpened.ordinal()] = 11;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr7[Sort.NewWordsPercent.ordinal()] = 12;
        } catch (NoSuchFieldError unused62) {
        }
        f52449e = iArr7;
        int[] iArr8 = new int[LearningLevel.values().length];
        try {
            iArr8[LearningLevel.Beginner1.ordinal()] = 1;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr8[LearningLevel.Beginner2.ordinal()] = 2;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr8[LearningLevel.Intermediate1.ordinal()] = 3;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr8[LearningLevel.Intermediate2.ordinal()] = 4;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr8[LearningLevel.Advanced1.ordinal()] = 5;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr8[LearningLevel.Advanced2.ordinal()] = 6;
        } catch (NoSuchFieldError unused68) {
        }
        f52450f = iArr8;
        int[] iArr9 = new int[CoursePlaylistSort.values().length];
        try {
            iArr9[CoursePlaylistSort.All.ordinal()] = 1;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr9[CoursePlaylistSort.Completed.ordinal()] = 2;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr9[CoursePlaylistSort.Opened.ordinal()] = 3;
        } catch (NoSuchFieldError unused71) {
        }
        f52451g = iArr9;
        int[] iArr10 = new int[ContentType.values().length];
        try {
            iArr10[ContentType.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr10[ContentType.Native.ordinal()] = 2;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr10[ContentType.MyImports.ordinal()] = 3;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr10[ContentType.External.ordinal()] = 4;
        } catch (NoSuchFieldError unused75) {
        }
        f52452h = iArr10;
        int[] iArr11 = new int[VocabularySearch.values().length];
        try {
            iArr11[VocabularySearch.StartsWith.ordinal()] = 1;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr11[VocabularySearch.EndsWith.ordinal()] = 2;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr11[VocabularySearch.Contains.ordinal()] = 3;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr11[VocabularySearch.PhraseContaining.ordinal()] = 4;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr11[VocabularySearch.MeaningContaining.ordinal()] = 5;
        } catch (NoSuchFieldError unused80) {
        }
        f52453i = iArr11;
        int[] iArr12 = new int[VocabularySort.values().length];
        try {
            iArr12[VocabularySort.AtoZ.ordinal()] = 1;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr12[VocabularySort.CreationDate.ordinal()] = 2;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr12[VocabularySort.Status.ordinal()] = 3;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr12[VocabularySort.Importance.ordinal()] = 4;
        } catch (NoSuchFieldError unused84) {
        }
        f52454j = iArr12;
        int[] iArr13 = new int[CardStatus.values().length];
        try {
            iArr13[CardStatus.Ignored.ordinal()] = 1;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr13[CardStatus.New.ordinal()] = 2;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr13[CardStatus.Recognized.ordinal()] = 3;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr13[CardStatus.Familiar.ordinal()] = 4;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr13[CardStatus.Learned.ordinal()] = 5;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr13[CardStatus.Known.ordinal()] = 6;
        } catch (NoSuchFieldError unused90) {
        }
        f52455k = iArr13;
        int[] iArr14 = new int[TextHighlightStyle.values().length];
        try {
            iArr14[TextHighlightStyle.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr14[TextHighlightStyle.ForegroundColor.ordinal()] = 2;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr14[TextHighlightStyle.Underlined.ordinal()] = 3;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr14[TextHighlightStyle.Off.ordinal()] = 4;
        } catch (NoSuchFieldError unused94) {
        }
        f52456l = iArr14;
        int[] iArr15 = new int[LqTheme.values().length];
        try {
            iArr15[LqTheme.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr15[LqTheme.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr15[LqTheme.System.ordinal()] = 3;
        } catch (NoSuchFieldError unused97) {
        }
        f52457m = iArr15;
        int[] iArr16 = new int[LatinScript.values().length];
        try {
            iArr16[LatinScript.Latin.ordinal()] = 1;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr16[LatinScript.Off.ordinal()] = 2;
        } catch (NoSuchFieldError unused99) {
        }
        f52458n = iArr16;
        int[] iArr17 = new int[ChineseScript.values().length];
        try {
            iArr17[ChineseScript.Off.ordinal()] = 1;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr17[ChineseScript.Pinyin.ordinal()] = 2;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr17[ChineseScript.Traditional.ordinal()] = 3;
        } catch (NoSuchFieldError unused102) {
        }
        f52459o = iArr17;
        int[] iArr18 = new int[ChineseTraditionalScript.values().length];
        try {
            iArr18[ChineseTraditionalScript.Off.ordinal()] = 1;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr18[ChineseTraditionalScript.Pinyin.ordinal()] = 2;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr18[ChineseTraditionalScript.Simplified.ordinal()] = 3;
        } catch (NoSuchFieldError unused105) {
        }
        f52460p = iArr18;
        int[] iArr19 = new int[JapaneseScript.values().length];
        try {
            iArr19[JapaneseScript.Furigana.ordinal()] = 1;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr19[JapaneseScript.Hiragana.ordinal()] = 2;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr19[JapaneseScript.Off.ordinal()] = 3;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr19[JapaneseScript.Romaji.ordinal()] = 4;
        } catch (NoSuchFieldError unused109) {
        }
        f52461q = iArr19;
        int[] iArr20 = new int[CantoneseScript.values().length];
        try {
            iArr20[CantoneseScript.Jyutping.ordinal()] = 1;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr20[CantoneseScript.Off.ordinal()] = 2;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr20[CantoneseScript.Simplified.ordinal()] = 3;
        } catch (NoSuchFieldError unused112) {
        }
        f52462r = iArr20;
    }
}
