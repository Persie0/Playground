package com.lingq.util;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Patterns;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.bumptech.glide.C2089k;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.lingq.commons.p053ui.UserImportSourceType;
import com.lingq.shared.storage.C3398a;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.lingq.shared.storage.Theme;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.ContentType;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import com.lingq.shared.uimodel.FeedTopic;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.MilestoneLevel;
import com.lingq.shared.uimodel.MilestoneType;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.shared.uimodel.language.LanguageProgressUpdate;
import com.lingq.shared.uimodel.language.UserLanguageProgressChartEntry;
import com.lingq.shared.uimodel.library.Accent;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.uimodel.vocabulary.VocabularySearch;
import com.lingq.shared.uimodel.vocabulary.VocabularySort;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.sequences.C7073a;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7138s;
import mo.C7661i;
import mo.InterfaceC7656d;
import no.InterfaceC7875v0;
import org.joda.time.MutableDateTime;
import p007a6.C0032k;
import p007a6.C0042u;
import p040c4.InterfaceC1687l;
import p096ei.C5408a;
import p130g4.C5694a;
import p130g4.C5695b;
import p130g4.C5696c;
import p171i6.C6202g;
import p225kk.C6708e;
import p225kk.C6709f;
import p225kk.C6710g;
import p225kk.C6711h;
import p225kk.C6712i;
import p225kk.C6713j;
import p225kk.C6716m;
import p249lo.C7423p;
import p254m2.C7472a;
import p258m6.C7485e;
import p278nh.C7776c;
import p278nh.C7779f;
import p286o2.C7906f;
import p301oh.C8046e;
import p326q.C8446b;
import p356r5.C8733c;
import p356r5.InterfaceC8738h;
import p385sf.C9000b;
import p473x4.InterfaceC10075a;
import p538zj.C10510c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.util.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4924a {

    /* JADX INFO: renamed from: com.lingq.util.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32086a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f32087b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f32088c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f32089d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f32090e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f32091f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f32092g;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int[] f32093h;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ int[] f32094i;

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ int[] f32095j;

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f32096k;

        /* JADX INFO: renamed from: l */
        public static final /* synthetic */ int[] f32097l;

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ int[] f32098m;

        /* JADX INFO: renamed from: n */
        public static final /* synthetic */ int[] f32099n;

        /* JADX INFO: renamed from: o */
        public static final /* synthetic */ int[] f32100o;

        /* JADX INFO: renamed from: p */
        public static final /* synthetic */ int[] f32101p;

        /* JADX INFO: renamed from: q */
        public static final /* synthetic */ int[] f32102q;

        static {
            int[] iArr = new int[ImageSize.values().length];
            try {
                iArr[ImageSize.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageSize.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageSize.Original.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32086a = iArr;
            int[] iArr2 = new int[LearningLevel.values().length];
            try {
                iArr2[LearningLevel.Beginner1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LearningLevel.Beginner2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LearningLevel.Intermediate1.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LearningLevel.Intermediate2.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LearningLevel.Advanced1.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LearningLevel.Advanced2.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f32087b = iArr2;
            int[] iArr3 = new int[MilestoneType.values().length];
            try {
                iArr3[MilestoneType.KnownWords.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[MilestoneType.Level.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[MilestoneType.DailyGoal.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[MilestoneType.DailyDoubleGoal.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            f32088c = iArr3;
            int[] iArr4 = new int[MilestoneLevel.values().length];
            try {
                iArr4[MilestoneLevel.Beginner1.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[MilestoneLevel.Beginner2.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[MilestoneLevel.Intermediate1.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[MilestoneLevel.Intermediate2.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[MilestoneLevel.Advanced1.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[MilestoneLevel.Advanced2.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            f32089d = iArr4;
            int[] iArr5 = new int[LanguageProgressGoal.values().length];
            try {
                iArr5[LanguageProgressGoal.HoursListening.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[LanguageProgressGoal.WordsReading.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[LanguageProgressGoal.WordsWriting.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[LanguageProgressGoal.HoursSpeaking.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[LanguageProgressGoal.LingQs.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[LanguageProgressGoal.WordsKnown.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[LanguageProgressGoal.LingQsLearned.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            f32090e = iArr5;
            int[] iArr6 = new int[LanguageProgressUpdate.values().length];
            try {
                iArr6[LanguageProgressUpdate.HoursListening.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[LanguageProgressUpdate.WordsReading.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[LanguageProgressUpdate.WordsWriting.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[LanguageProgressUpdate.HoursSpeaking.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            int[] iArr7 = new int[LanguageProgressSort.values().length];
            try {
                iArr7[LanguageProgressSort.AllTime.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[LanguageProgressSort.LastYear.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[LanguageProgressSort.LastSixMonths.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[LanguageProgressSort.LastThreeMonths.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[LanguageProgressSort.LastMonth.ordinal()] = 5;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[LanguageProgressSort.LastTwoWeeks.ordinal()] = 6;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr7[LanguageProgressSort.LastWeek.ordinal()] = 7;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr7[LanguageProgressSort.Yesterday.ordinal()] = 8;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr7[LanguageProgressSort.Today.ordinal()] = 9;
            } catch (NoSuchFieldError unused39) {
            }
            f32091f = iArr7;
            int[] iArr8 = new int[LanguageProgressPeriod.values().length];
            try {
                iArr8[LanguageProgressPeriod.Last7Days.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[LanguageProgressPeriod.Last14Days.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr8[LanguageProgressPeriod.Last30Days.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr8[LanguageProgressPeriod.ThisMonth.ordinal()] = 4;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr8[LanguageProgressPeriod.LastMonth.ordinal()] = 5;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr8[LanguageProgressPeriod.Last3Months.ordinal()] = 6;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr8[LanguageProgressPeriod.Last6Months.ordinal()] = 7;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr8[LanguageProgressPeriod.AllTime.ordinal()] = 8;
            } catch (NoSuchFieldError unused47) {
            }
            f32092g = iArr8;
            int[] iArr9 = new int[LanguageProgressMetric.values().length];
            try {
                iArr9[LanguageProgressMetric.KnownWords.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr9[LanguageProgressMetric.LingQsCreated.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr9[LanguageProgressMetric.LearnedLingQs.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr9[LanguageProgressMetric.ListeningHours.ordinal()] = 4;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr9[LanguageProgressMetric.WordsOfReading.ordinal()] = 5;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr9[LanguageProgressMetric.CoinsEarned.ordinal()] = 6;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr9[LanguageProgressMetric.SpeakingHours.ordinal()] = 7;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr9[LanguageProgressMetric.WrittenWords.ordinal()] = 8;
            } catch (NoSuchFieldError unused55) {
            }
            f32093h = iArr9;
            int[] iArr10 = new int[Accent.values().length];
            try {
                iArr10[Accent.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr10[Accent.Egyptian.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr10[Accent.Levantine.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr10[Accent.Formal.ordinal()] = 4;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr10[Accent.Spoken.ordinal()] = 5;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr10[Accent.European.ordinal()] = 6;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr10[Accent.Brazilian.ordinal()] = 7;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr10[Accent.EuropeanSpanish.ordinal()] = 8;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr10[Accent.LatinAmerican.ordinal()] = 9;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr10[Accent.American.ordinal()] = 10;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr10[Accent.British.ordinal()] = 11;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr10[Accent.Canadian.ordinal()] = 12;
            } catch (NoSuchFieldError unused67) {
            }
            f32094i = iArr10;
            int[] iArr11 = new int[Sort.values().length];
            try {
                iArr11[Sort.Position.ordinal()] = 1;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr11[Sort.Relevance.ordinal()] = 2;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr11[Sort.AtoZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr11[Sort.Complete.ordinal()] = 4;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr11[Sort.Incomplete.ordinal()] = 5;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr11[Sort.Newest.ordinal()] = 6;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr11[Sort.Oldest.ordinal()] = 7;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr11[Sort.Opened.ordinal()] = 8;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr11[Sort.Imported.ordinal()] = 9;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr11[Sort.Liked.ordinal()] = 10;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr11[Sort.RecentlyOpened.ordinal()] = 11;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr11[Sort.NewWordsPercent.ordinal()] = 12;
            } catch (NoSuchFieldError unused79) {
            }
            f32095j = iArr11;
            int[] iArr12 = new int[CoursePlaylistSort.values().length];
            try {
                iArr12[CoursePlaylistSort.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr12[CoursePlaylistSort.Completed.ordinal()] = 2;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr12[CoursePlaylistSort.Opened.ordinal()] = 3;
            } catch (NoSuchFieldError unused82) {
            }
            int[] iArr13 = new int[ContentType.values().length];
            try {
                iArr13[ContentType.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr13[ContentType.Native.ordinal()] = 2;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr13[ContentType.MyImports.ordinal()] = 3;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr13[ContentType.External.ordinal()] = 4;
            } catch (NoSuchFieldError unused86) {
            }
            f32096k = iArr13;
            int[] iArr14 = new int[VocabularySearch.values().length];
            try {
                iArr14[VocabularySearch.StartsWith.ordinal()] = 1;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr14[VocabularySearch.EndsWith.ordinal()] = 2;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr14[VocabularySearch.Contains.ordinal()] = 3;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr14[VocabularySearch.PhraseContaining.ordinal()] = 4;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr14[VocabularySearch.MeaningContaining.ordinal()] = 5;
            } catch (NoSuchFieldError unused91) {
            }
            f32097l = iArr14;
            int[] iArr15 = new int[VocabularySort.values().length];
            try {
                iArr15[VocabularySort.AtoZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr15[VocabularySort.CreationDate.ordinal()] = 2;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr15[VocabularySort.Status.ordinal()] = 3;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr15[VocabularySort.Importance.ordinal()] = 4;
            } catch (NoSuchFieldError unused95) {
            }
            f32098m = iArr15;
            int[] iArr16 = new int[CardStatus.values().length];
            try {
                iArr16[CardStatus.Ignored.ordinal()] = 1;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr16[CardStatus.New.ordinal()] = 2;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr16[CardStatus.Recognized.ordinal()] = 3;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr16[CardStatus.Familiar.ordinal()] = 4;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr16[CardStatus.Learned.ordinal()] = 5;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr16[CardStatus.Known.ordinal()] = 6;
            } catch (NoSuchFieldError unused101) {
            }
            f32099n = iArr16;
            int[] iArr17 = new int[LessonHighlightStyle.values().length];
            try {
                iArr17[LessonHighlightStyle.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr17[LessonHighlightStyle.ForegroundColor.ordinal()] = 2;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr17[LessonHighlightStyle.Underlined.ordinal()] = 3;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr17[LessonHighlightStyle.Off.ordinal()] = 4;
            } catch (NoSuchFieldError unused105) {
            }
            f32100o = iArr17;
            int[] iArr18 = new int[Theme.values().length];
            try {
                iArr18[Theme.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr18[Theme.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr18[Theme.System.ordinal()] = 3;
            } catch (NoSuchFieldError unused108) {
            }
            f32101p = iArr18;
            int[] iArr19 = new int[UserImportSourceType.values().length];
            try {
                iArr19[UserImportSourceType.URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr19[UserImportSourceType.Text.ordinal()] = 2;
            } catch (NoSuchFieldError unused110) {
            }
            f32102q = iArr19;
        }
    }

    /* JADX INFO: renamed from: com.lingq.util.a$b */
    public static final class b extends AppBarLayout.Behavior.AbstractC2937a {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.AbstractC2936b
        /* JADX INFO: renamed from: a */
        public final void mo8564a(AppBarLayout appBarLayout) {
        }
    }

    /* JADX INFO: renamed from: A */
    public static final void m10422A(View view) {
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B */
    public static final String m10423B(String str, String str2, ImageSize imageSize) {
        C5207g.m11111f(imageSize, "size");
        if (str != null) {
            str2 = str;
        } else if (str2 == null) {
            str = "";
            str2 = str;
        }
        int i10 = a.f32086a[imageSize.ordinal()];
        if (i10 == 1) {
            return C7661i.m15254T2(str2, "/media/", "/images/480x270/");
        }
        if (i10 == 2) {
            return C7661i.m15254T2(str2, "/media/", "/images/1280x720/");
        }
        if (i10 == 3) {
            return str2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m10424C(LessonFont lessonFont, Context context) {
        C5207g.m11111f(lessonFont, "<this>");
        C5207g.m11111f(context, "context");
        return new File(new File(C0166e.m765k(context.getFilesDir().toString(), "/fonts/")) + "/" + C3398a.m9698a(lessonFont)).exists();
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m10425D(String str) {
        C5207g.m11111f(str, "<this>");
        return Patterns.WEB_URL.matcher(str).matches() && URLUtil.isValidUrl(str);
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m10426E(String str) {
        return str != null && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m10427F(View view) {
        return view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m10428G(double d10) {
        return d10 - ((double) ((int) d10)) == 0.0d;
    }

    /* JADX INFO: renamed from: H */
    public static final int m10429H(CardStatus cardStatus) {
        C5207g.m11111f(cardStatus, "<this>");
        switch (a.f32099n[cardStatus.ordinal()]) {
            case 1:
                return R.string.card_ignore_this_word;
            case 2:
                return R.string.card_status_new;
            case 3:
                return R.string.card_status_recognized;
            case 4:
                return R.string.card_status_familiar;
            case 5:
                return R.string.card_status_learned;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return R.string.card_status_known;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: I */
    public static final int m10430I(ContentType contentType) {
        C5207g.m11111f(contentType, "<this>");
        int i10 = a.f32096k[contentType.ordinal()];
        if (i10 == 1) {
            return R.string.ui_none;
        }
        if (i10 == 2) {
            return R.string.content_type_internal;
        }
        if (i10 == 3) {
            return R.string.content_type_my_imports;
        }
        if (i10 == 4) {
            return R.string.content_type_external;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: J */
    public static final int m10431J(VocabularySearch vocabularySearch) {
        C5207g.m11111f(vocabularySearch, "<this>");
        int i10 = a.f32097l[vocabularySearch.ordinal()];
        if (i10 == 1) {
            return R.string.card_starts_with;
        }
        if (i10 == 2) {
            return R.string.card_ends_with;
        }
        if (i10 == 3) {
            return R.string.card_contains;
        }
        if (i10 == 4) {
            return R.string.card_phrase_contains;
        }
        if (i10 == 5) {
            return R.string.card_meaning_containing;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: K */
    public static final int m10432K(VocabularySort vocabularySort) {
        C5207g.m11111f(vocabularySort, "<this>");
        int i10 = a.f32098m[vocabularySort.ordinal()];
        if (i10 == 1) {
            return R.string.card_sort_alpha;
        }
        if (i10 == 2) {
            return R.string.card_sort_created;
        }
        if (i10 == 3) {
            return R.string.card_sort_status;
        }
        if (i10 == 4) {
            return R.string.card_sort_importance;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L */
    public static final int m10433L(LanguageProgressGoal languageProgressGoal) {
        C5207g.m11111f(languageProgressGoal, "<this>");
        switch (a.f32090e[languageProgressGoal.ordinal()]) {
            case 1:
                return R.string.stats_listening_hours;
            case 2:
                return R.string.stats_reading_words;
            case 3:
                return R.string.stats_writing_words;
            case 4:
                return R.string.stats_speaking_hours;
            case 5:
                return R.string.lingq_lingqs;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return R.string.stats_known_words;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return R.string.stats_lingqs_learned;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: M */
    public static final String m10434M(LearningLevel learningLevel, Context context) {
        C5207g.m11111f(learningLevel, "<this>");
        switch (a.f32087b[learningLevel.ordinal()]) {
            case 1:
                return C0166e.m765k(context.getString(R.string.levels_beginner), " 1");
            case 2:
                return C0166e.m765k(context.getString(R.string.levels_beginner), " 2");
            case 3:
                return C0166e.m765k(context.getString(R.string.levels_intermediate), " 1");
            case 4:
                return C0166e.m765k(context.getString(R.string.levels_intermediate), " 2");
            case 5:
                return C0166e.m765k(context.getString(R.string.levels_advanced), " 1");
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return C0166e.m765k(context.getString(R.string.levels_advanced), " 2");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static final String m10435N(LearningLevel learningLevel, Context context) {
        C5207g.m11111f(learningLevel, "<this>");
        switch (a.f32087b[learningLevel.ordinal()]) {
            case 1:
                return C0166e.m765k(context.getString(R.string.levels_beginner_short), " 1");
            case 2:
                return C0166e.m765k(context.getString(R.string.levels_beginner_short), " 2");
            case 3:
                return C0166e.m765k(context.getString(R.string.levels_intermediate_short), " 1");
            case 4:
                return C0166e.m765k(context.getString(R.string.levels_intermediate_short), " 2");
            case 5:
                return C0166e.m765k(context.getString(R.string.levels_advanced_short), " 1");
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return C0166e.m765k(context.getString(R.string.levels_advanced_short), " 2");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m10436O(ImageView imageView, Object obj, float f3, Drawable drawable, int i10) {
        if ((i10 & 2) != 0) {
            f3 = 0.0f;
        }
        int i11 = (i10 & 4) != 0 ? R.color.grey_light : 0;
        if ((i10 & 8) != 0) {
            drawable = null;
        }
        C5207g.m11111f(imageView, "<this>");
        C2089k c2089kM12723m = ComponentCallbacks2C2080b.m6238e(imageView.getContext()).m6254c().m6247G(obj).m12723m(drawable);
        if (C6202g.f36094V == null) {
            C6202g c6202gM12716c = new C6202g().m12716c();
            if (c6202gM12716c.f36067O && !c6202gM12716c.f36069Q) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            c6202gM12716c.f36069Q = true;
            c6202gM12716c.f36067O = true;
            C6202g.f36094V = c6202gM12716c;
        }
        C2089k c2089kM6242A = c2089kM12723m.m6242A(C6202g.f36094V);
        c2089kM6242A.m6246F(new C6708e(imageView, f3, i11), null, c2089kM6242A, C7485e.f41368a);
    }

    /* JADX INFO: renamed from: P */
    public static final void m10437P(ShapeableImageView shapeableImageView, Object obj, InterfaceC2052l interfaceC2052l) {
        C2089k c2089kM12721j = ComponentCallbacks2C2080b.m6238e(shapeableImageView.getContext()).m6254c().m6247G(obj).m12721j(Integer.MIN_VALUE, Integer.MIN_VALUE);
        c2089kM12721j.m6246F(new C6709f(shapeableImageView, interfaceC2052l), null, c2089kM12721j, C7485e.f41368a);
    }

    /* JADX INFO: renamed from: Q */
    public static void m10438Q(ImageView imageView, Object obj, float f3, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i12 & 4) != 0) {
            i10 = -1;
        }
        if ((i12 & 8) != 0) {
            i11 = 8;
        }
        C2089k<Bitmap> c2089kM6247G = ComponentCallbacks2C2080b.m6238e(imageView.getContext()).m6254c().m6247G(obj);
        List<Integer> list = C6716m.f37937a;
        InterfaceC8738h[] interfaceC8738hArr = {new C0032k(), new C0042u((int) C6716m.m13316a(i11))};
        c2089kM6247G.getClass();
        C2089k c2089kM12733x = c2089kM6247G.m12733x(new C8733c(interfaceC8738hArr), true);
        c2089kM12733x.m6246F(new C6710g(imageView, f3, i10), null, c2089kM12733x, C7485e.f41368a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX INFO: renamed from: R */
    public static final String m10439R(Context context, String str) {
        String strValueOf;
        C5207g.m11111f(context, "context");
        C5207g.m11111f(str, "code");
        String displayName = new Locale(str).getDisplayName(Locale.getDefault());
        int iHashCode = str.hashCode();
        if (iHashCode != 3331) {
            if (iHashCode != 3886) {
                if (iHashCode != 3735957) {
                    if (iHashCode != 115814250) {
                        if (iHashCode == 115814786 && str.equals("zh-tw")) {
                            displayName = context.getString(R.string.zh_t);
                        }
                    } else if (!str.equals("zh-cn")) {
                    }
                } else if (str.equals("zh-t")) {
                    displayName = context.getString(R.string.zh_t);
                }
            } else if (str.equals("zh")) {
            }
            displayName = context.getString(R.string.f32133zh);
        } else if (str.equals("hk")) {
            displayName = context.getString(R.string.f32131hk);
        }
        C5207g.m11110e(displayName, "title");
        if (displayName.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char cCharAt = displayName.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                Locale locale = Locale.getDefault();
                C5207g.m11110e(locale, "getDefault()");
                strValueOf = C5206f.m11025u1(cCharAt, locale);
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb2.append((Object) strValueOf);
            String strSubstring = displayName.substring(1);
            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring);
            displayName = sb2.toString();
        }
        return displayName;
    }

    /* JADX INFO: renamed from: S */
    public static void m10440S(View view, float f3, float f10, long j10, InterfaceC2041a interfaceC2041a, int i10) {
        if ((i10 & 16) != 0) {
            interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: com.lingq.util.ExtensionsKt$moveTo$1
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final /* bridge */ /* synthetic */ C9072e mo807E() {
                    return C9072e.f47360a;
                }
            };
        }
        C5207g.m11111f(interfaceC2041a, "onAnimationFinished");
        view.animate().translationXBy(f3).translationYBy(f10).setDuration(j10).setStartDelay(0L).setListener(new C6711h(interfaceC2041a)).start();
    }

    /* JADX INFO: renamed from: T */
    public static void m10441T(C10510c c10510c, float f3, float f10) {
        ExtensionsKt$moveToPosition$1 extensionsKt$moveToPosition$1 = new InterfaceC2041a<C9072e>() { // from class: com.lingq.util.ExtensionsKt$moveToPosition$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                return C9072e.f47360a;
            }
        };
        C5207g.m11111f(extensionsKt$moveToPosition$1, "onAnimationFinished");
        c10510c.animate().x(f3).y(f10).setDuration(0L).setStartDelay(0L).setListener(new C6712i(extensionsKt$moveToPosition$1)).start();
    }

    /* JADX INFO: renamed from: U */
    public static final void m10442U(View view) {
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: V */
    public static final void m10443V(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i10;
            layoutParams.height = i11;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: W */
    public static final void m10444W(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i10;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: X */
    public static final void m10445X(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i10;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final FragmentManager m10446Y(Fragment fragment) {
        C5207g.m11111f(fragment, "<this>");
        if (fragment.m3604y()) {
            return fragment.m3594l();
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m10447Z(NavController navController, InterfaceC1687l interfaceC1687l) {
        C5207g.m11111f(navController, "<this>");
        NavDestination navDestinationM3986g = navController.m3986g();
        if (navDestinationM3986g != null && navDestinationM3986g.m4016i(interfaceC1687l.mo483e()) != null) {
            navController.m3992m(interfaceC1687l.mo483e(), interfaceC1687l.mo482d(), null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C7138s m10448a() {
        return C0062b.m368m(0, 1, BufferOverflow.DROP_OLDEST);
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m10449a0(AppCompatSpinner appCompatSpinner, String str) {
        SpinnerAdapter adapter = appCompatSpinner.getAdapter();
        C5207g.m11109d(adapter, "null cannot be cast to non-null type android.widget.ArrayAdapter<*>");
        ArrayAdapter arrayAdapter = (ArrayAdapter) adapter;
        int count = arrayAdapter.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            String str2 = (String) arrayAdapter.getItem(i10);
            if (str2 != null && C5207g.m11106a(str2, str)) {
                appCompatSpinner.setSelection(i10);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    /* JADX INFO: renamed from: b */
    public static final void m10450b(InterfaceC7875v0 interfaceC7875v0) {
        boolean z10;
        if (interfaceC7875v0 != null) {
            z10 = true;
            if (!interfaceC7875v0.mo15547b()) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            interfaceC7875v0.mo15618a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public static final void m10451b0(View view, Bitmap bitmap) {
        int iM13333r;
        int i10;
        char c10;
        float fAbs;
        char c11;
        float fAbs2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(C5695b.f34688a);
        arrayList.add(C5696c.f34698e);
        arrayList.add(C5696c.f34699f);
        arrayList.add(C5696c.f34700g);
        arrayList.add(C5696c.f34701h);
        arrayList.add(C5696c.f34702i);
        arrayList.add(C5696c.f34703j);
        int height = bitmap.getHeight() * bitmap.getWidth();
        double dSqrt = height > 12544 ? Math.sqrt(((double) 12544) / ((double) height)) : -1.0d;
        int i11 = 0;
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        C5694a c5694a = new C5694a(iArr, 16, arrayList2.isEmpty() ? null : (C5695b.b[]) arrayList2.toArray(new C5695b.b[arrayList2.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        ArrayList arrayList3 = c5694a.f34675c;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        C8446b c8446b = new C8446b();
        int size = arrayList3.size();
        int i12 = Integer.MIN_VALUE;
        C5695b.c cVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            C5695b.c cVar2 = (C5695b.c) arrayList3.get(i13);
            int i14 = cVar2.f34693e;
            if (i14 > i12) {
                cVar = cVar2;
                i12 = i14;
            }
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (true) {
            char c12 = 2;
            char c13 = 1;
            if (i15 >= size2) {
                break;
            }
            C5696c c5696c = (C5696c) arrayList.get(i15);
            float[] fArr = c5696c.f34706c;
            int length = fArr.length;
            float f3 = 0.0f;
            for (int i16 = i11; i16 < length; i16++) {
                float f10 = fArr[i16];
                if (f10 > 0.0f) {
                    f3 += f10;
                }
            }
            if (f3 != 0.0f) {
                int length2 = fArr.length;
                for (int i17 = i11; i17 < length2; i17++) {
                    float f11 = fArr[i17];
                    if (f11 > 0.0f) {
                        fArr[i17] = f11 / f3;
                    }
                }
            }
            int size3 = arrayList3.size();
            int i18 = i11;
            float f12 = 0.0f;
            C5695b.c cVar3 = null;
            while (i18 < size3) {
                C5695b.c cVar4 = (C5695b.c) arrayList3.get(i18);
                float[] fArrM12061b = cVar4.m12061b();
                float f13 = fArrM12061b[c13];
                float[] fArr2 = c5696c.f34704a;
                float f14 = fArr2[i11];
                float[] fArr3 = c5696c.f34705b;
                if (f13 < f14 || f13 > fArr2[c12]) {
                    i10 = i11;
                } else {
                    float f15 = fArrM12061b[c12];
                    if (f15 < fArr3[i11] || f15 > fArr3[c12] || sparseBooleanArray.get(cVar4.f34692d)) {
                        i10 = i11;
                    } else {
                        i10 = 1;
                    }
                }
                if (i10 != 0) {
                    float[] fArrM12061b2 = cVar4.m12061b();
                    int i19 = cVar != null ? cVar.f34693e : 1;
                    float[] fArr4 = c5696c.f34706c;
                    float f16 = fArr4[0];
                    if (f16 > 0.0f) {
                        c10 = 1;
                        fAbs = (1.0f - Math.abs(fArrM12061b2[1] - fArr2[1])) * f16;
                    } else {
                        c10 = 1;
                        fAbs = 0.0f;
                    }
                    float f17 = fArr4[c10];
                    if (f17 > 0.0f) {
                        c11 = 2;
                        fAbs2 = (1.0f - Math.abs(fArrM12061b2[2] - fArr3[c10])) * f17;
                    } else {
                        c11 = 2;
                        fAbs2 = 0.0f;
                    }
                    float f18 = fArr4[c11];
                    float f19 = fAbs + fAbs2 + (f18 > 0.0f ? f18 * (cVar4.f34693e / i19) : 0.0f);
                    if (cVar3 == null || f19 > f12) {
                        cVar3 = cVar4;
                        f12 = f19;
                    }
                } else {
                    arrayList3 = arrayList3;
                }
                i18++;
                arrayList3 = arrayList3;
                i11 = 0;
                c12 = 2;
                c13 = 1;
            }
            ArrayList arrayList4 = arrayList3;
            if (cVar3 != null && c5696c.f34707d) {
                sparseBooleanArray.append(cVar3.f34692d, true);
            }
            c8446b.put(c5696c, cVar3);
            i15++;
            arrayList3 = arrayList4;
            i11 = 0;
        }
        sparseBooleanArray.clear();
        if (cVar != null) {
            iM13333r = cVar.f34692d;
        } else {
            C5695b.c cVar5 = (C5695b.c) c8446b.getOrDefault(C5696c.f34699f, null);
            if (cVar5 != null) {
                iM13333r = cVar5.f34692d;
            } else {
                List<Integer> list = C6716m.f37937a;
                Context context = view.getContext();
                C5207g.m11110e(context, "context");
                iM13333r = C6716m.m13333r(R.attr.backgroundCardColor, context);
            }
        }
        List<Integer> list2 = C6716m.f37937a;
        Context context2 = view.getContext();
        C5207g.m11110e(context2, "context");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{iM13333r, C6716m.m13333r(R.attr.backgroundSectionColor, context2)});
        gradientDrawable.setGradientType(1);
        gradientDrawable.setGradientRadius(900.0f);
        gradientDrawable.setCornerRadius(0.0f);
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: c */
    public static final String m10452c(List list, String str) {
        boolean z10;
        String strValueOf;
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list, "tags");
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (C7661i.m15249O2((String) it.next(), "Substantiv")) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (z10) {
            if (str.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char cCharAt = str.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.GERMAN;
                    C5207g.m11110e(locale, "GERMAN");
                    strValueOf = C5206f.m11025u1(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb2.append((Object) strValueOf);
                String strSubstring = str.substring(1);
                C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                str = sb2.toString();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m10453c0(TextView textView, String str, String str2, int i10, InterfaceC2041a interfaceC2041a, int i11) {
        int i12 = 0;
        boolean z10 = (i11 & 8) != 0;
        if ((i11 & 16) != 0) {
            interfaceC2041a = null;
        }
        C5207g.m11111f(str2, "underlinedText");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iM14285e3 = C7076b.m14285e3(str, str2, 0, false, 6);
        int length = str2.length() + iM14285e3;
        if (iM14285e3 == -1) {
            length = str.length();
        } else {
            i12 = iM14285e3;
        }
        spannableStringBuilder.setSpan(new C6713j(interfaceC2041a), i12, length, 33);
        if (z10) {
            spannableStringBuilder.setSpan(new StyleSpan(1), i12, length, 33);
        }
        List<Integer> list = C6716m.f37937a;
        Context context = textView.getContext();
        C5207g.m11110e(context, "context");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C6716m.m13333r(i10, context)), i12, length, 33);
        if (interfaceC2041a != null) {
            textView.setMovementMethod(C7776c.f42711a);
        }
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: d */
    public static final String m10454d(String str) {
        C5207g.m11111f(str, "<this>");
        Regex regex = new Regex("\\p{Punct}");
        String string = C7076b.m14277B3(str).toString();
        boolean z10 = true;
        if (!(string.length() > 0)) {
            return string;
        }
        C5207g.m11111f(string, "<this>");
        if (string.length() != 0) {
            z10 = false;
        }
        if (z10) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (!regex.m14271b(String.valueOf(string.charAt(0)))) {
            return string;
        }
        C5207g.m11111f(string, "input");
        String strReplaceFirst = regex.f39972a.matcher(string).replaceFirst("");
        C5207g.m11110e(strReplaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return strReplaceFirst;
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m10455d0(View view, int i10) {
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) view.getBackground().getConstantState();
        if (drawableContainerState != null) {
            Drawable drawable = drawableContainerState.getChildren()[0];
            C5207g.m11109d(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawable).setColor(i10);
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    /* JADX INFO: renamed from: e */
    public static final String m10456e() {
        try {
            String str = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            C5207g.m11110e(str, "{\n        val calendar =…rmat(calendar.time)\n    }");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m10457e0(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final ArrayList m10458f(String str) {
        C5207g.m11111f(str, "language");
        MutableDateTime mutableDateTime = new MutableDateTime();
        Locale localeForLanguageTag = Locale.forLanguageTag(C7661i.m15254T2(str, "_", "-"));
        new MutableDateTime.Property(mutableDateTime, mutableDateTime.mo12598n().mo12549h()).m16040e(-6);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 7; i10++) {
            String strM16087a = new MutableDateTime.Property(mutableDateTime, mutableDateTime.mo12598n().mo12549h()).m16087a(localeForLanguageTag);
            C5207g.m11110e(strM16087a, "dt.dayOfWeek().getAsShortText(locale)");
            arrayList.add(strM16087a);
            new MutableDateTime.Property(mutableDateTime, mutableDateTime.mo12598n().mo12549h()).m16040e(1);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public static final int m10459f0(LessonHighlightStyle lessonHighlightStyle) {
        C5207g.m11111f(lessonHighlightStyle, "<this>");
        int i10 = a.f32100o[lessonHighlightStyle.ordinal()];
        if (i10 == 1) {
            return R.string.settings_highlight_default;
        }
        if (i10 == 2) {
            return R.string.settings_highlight_foreground;
        }
        if (i10 == 3) {
            return R.string.settings_highlight_underlined;
        }
        if (i10 == 4) {
            return R.string.settings_asian_no_transliteration;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m10460g(Context context) {
        return !context.getResources().getBoolean(R.bool.is_phone);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g0 */
    public static final int m10461g0(Theme theme) {
        C5207g.m11111f(theme, "<this>");
        int i10 = a.f32101p[theme.ordinal()];
        if (i10 == 1) {
            return R.string.settings_light_theme;
        }
        if (i10 == 2) {
            return R.string.settings_dark_theme;
        }
        if (i10 == 3) {
            return R.string.settings_system_theme;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m10462h(Context context) {
        return !context.getResources().getBoolean(R.bool.is_phone) && context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m10463h0(Accent accent, String str) {
        C5207g.m11111f(accent, "<this>");
        C5207g.m11111f(str, "language");
        if (C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Arabic))) {
            int i10 = a.f32094i[accent.ordinal()];
            if (i10 == 1) {
                return R.string.feed_topics_standard_arabic;
            }
            if (i10 == 2) {
                return R.string.feed_topics_egyptian_arabic;
            }
            if (i10 != 3) {
                return -1;
            }
            return R.string.feed_topics_levantine_arabic;
        }
        if (C5207g.m11106a(str, C5408a.m11570c(LanguageLearnBeta.Farsi))) {
            int i11 = a.f32094i[accent.ordinal()];
            if (i11 == 4) {
                return R.string.feed_topics_formal_persian;
            }
            if (i11 != 5) {
                return -1;
            }
            return R.string.feed_topics_spoken_persian;
        }
        if (C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Portuguese))) {
            int i12 = a.f32094i[accent.ordinal()];
            if (i12 == 6) {
                return R.string.feed_topics_european_portuguese;
            }
            if (i12 != 7) {
                return -1;
            }
            return R.string.feed_topics_brazilian_portuguese;
        }
        if (C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Spanish))) {
            int i13 = a.f32094i[accent.ordinal()];
            if (i13 == 8) {
                return R.string.feed_topics_european_spanish;
            }
            if (i13 != 9) {
                return -1;
            }
            return R.string.feed_topics_latin_american_spanish;
        }
        if (!C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.English))) {
            return -1;
        }
        switch (a.f32094i[accent.ordinal()]) {
            case 10:
                return R.string.feed_topics_english_american;
            case 11:
                return R.string.feed_topics_english_british;
            case 12:
                return R.string.feed_topics_english_canadian;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m10464i(AppBarLayout appBarLayout) {
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        C5207g.m11109d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.C0771f c0771f = (CoordinatorLayout.C0771f) layoutParams;
        if (c0771f.f5550a == null) {
            c0771f.m2954b(new AppBarLayout.Behavior());
            CoordinatorLayout.AbstractC0768c abstractC0768c = c0771f.f5550a;
            C5207g.m11109d(abstractC0768c, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
            ((AppBarLayout.Behavior) abstractC0768c).f14691o = new b();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final int m10465i0(Sort sort) {
        C5207g.m11111f(sort, "<this>");
        switch (a.f32095j[sort.ordinal()]) {
            case 1:
                return R.string.sort_original;
            case 2:
                return R.string.sort_relevance;
            case 3:
                return R.string.card_sort_alpha;
            case 4:
                return R.string.sort_completed;
            case 5:
                return R.string.sort_not_completed;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return R.string.sort_newest;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return R.string.sort_oldest;
            case 8:
            case 11:
                return R.string.sort_opened;
            case 9:
                return R.string.sort_shared;
            case 10:
                return R.string.sort_likes;
            case 12:
                return R.string.sort_new_words_percentage;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final File m10466j(LessonFont lessonFont, Context context) {
        C5207g.m11111f(lessonFont, "<this>");
        C5207g.m11111f(context, "context");
        String str = new File(C0166e.m765k(context.getFilesDir().toString(), "/fonts/")) + "/" + C3398a.m9698a(lessonFont);
        if (m10424C(lessonFont, context)) {
            return new File(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public static final String m10467j0(FeedTopic feedTopic, Context context) {
        C5207g.m11111f(feedTopic, "<this>");
        if (context == null) {
            return "";
        }
        int identifier = context.getResources().getIdentifier(C0141b.m613i(new Object[]{C5408a.m11574g(feedTopic)}, 1, Locale.getDefault(), "feed_topics_%s", "format(locale, format, *args)"), "string", context.getPackageName());
        List<Integer> list = C6716m.f37937a;
        String string = context.getString(identifier);
        C5207g.m11110e(string, "context.getString(resId)");
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static final C7423p m10468k(String str, String str2) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str2, "searchText");
        return C7073a.m14261V2(Regex.m14270a(new Regex(C0141b.m611g("\\b", str2, "\\b")), str), new InterfaceC2052l<InterfaceC7656d, Integer>() { // from class: com.lingq.util.ExtensionsKt$findExactMatchWithIndex$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Integer mo528n(InterfaceC7656d interfaceC7656d) {
                InterfaceC7656d interfaceC7656d2 = interfaceC7656d;
                C5207g.m11111f(interfaceC7656d2, "it");
                return Integer.valueOf(interfaceC7656d2.mo14268a().f37163a);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final String m10469k0(MilestoneLevel milestoneLevel, Context context) {
        switch (a.f32089d[milestoneLevel.ordinal()]) {
            case 1:
                return C0166e.m765k(context.getString(R.string.levels_beginner), " 1");
            case 2:
                return C0166e.m765k(context.getString(R.string.levels_beginner), " 2");
            case 3:
                return C0166e.m765k(context.getString(R.string.levels_intermediate), " 1");
            case 4:
                return C0166e.m765k(context.getString(R.string.levels_intermediate), " 2");
            case 5:
                return C0166e.m765k(context.getString(R.string.levels_advanced), " 1");
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return C0166e.m765k(context.getString(R.string.levels_advanced), " 2");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final int m10470l(LessonFont lessonFont) {
        C5207g.m11111f(lessonFont, "<this>");
        boolean zM11106a = C5207g.m11106a(lessonFont, LessonFont.Rubik.INSTANCE);
        int i10 = R.font.font_rubik;
        if (zM11106a || C5207g.m11106a(lessonFont, LessonFont.RubikBold.INSTANCE) || C5207g.m11106a(lessonFont, LessonFont.System.INSTANCE)) {
            return R.font.font_rubik;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.Adys.INSTANCE)) {
            return R.font.font_adys;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.NewYork.INSTANCE)) {
            return R.font.font_newyork;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.Spectral.INSTANCE)) {
            return R.font.font_spectral;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.Lora.INSTANCE)) {
            return R.font.font_lora;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.Poppins.INSTANCE)) {
            return R.font.font_poppins;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.Inter.INSTANCE)) {
            return R.font.font_inter;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.Bodoni.INSTANCE)) {
            return R.font.font_bodoni;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.OpenSans.INSTANCE)) {
            return R.font.font_open_sans;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.NotoSansJapanese.INSTANCE)) {
            return R.font.font_noto_sans_jp;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.NotoSansArabic.INSTANCE)) {
            return R.font.font_noto_sans_arabic;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.NotoSansSimplifiedChinese.INSTANCE)) {
            return R.font.font_noto_sans_zh;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.NotoSansCantonese.INSTANCE)) {
            return R.font.font_noto_sans_hk;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.NotoSansChineseTraditional.INSTANCE)) {
            return R.font.font_noto_sans_zht;
        }
        if (C5207g.m11106a(lessonFont, LessonFont.NotoSansKorea.INSTANCE)) {
            i10 = R.font.font_noto_sans_kr;
        }
        return i10;
    }

    /* JADX INFO: renamed from: l0 */
    public static final String m10471l0(double d10, int i10) {
        if (d10 >= 1.0E9d) {
            return C0166e.m770q(new Object[]{Double.valueOf(d10 / ((double) 1000000000))}, 1, C0166e.m762h("%.", i10, "f M+"), "format(format, *args)");
        }
        if (d10 >= 1000000.0d) {
            return C0166e.m770q(new Object[]{Double.valueOf(d10 / ((double) 1000000))}, 1, C0166e.m762h("%.", i10, "f M"), "format(format, *args)");
        }
        if (m10428G(d10)) {
            return String.valueOf((int) d10);
        }
        return C0166e.m770q(new Object[]{Double.valueOf(d10)}, 1, C0166e.m762h("%.", i10, "f"), "format(format, *args)");
    }

    /* JADX INFO: renamed from: m */
    public static String m10472m(int i10, String str, String str2) {
        String str3 = (i10 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ss" : null;
        if ((i10 & 2) != 0) {
            str2 = "MMM dd, yyyy";
        }
        C5207g.m11111f(str3, "fromFormat");
        C5207g.m11111f(str2, "toFormat");
        try {
            Date date = new SimpleDateFormat(str3).parse(str);
            if (date != null) {
                String str4 = new SimpleDateFormat(str2).format(date);
                C5207g.m11110e(str4, "{\n        val convertedD…rmat(convertedDate)\n    }");
                return str4;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: m0 */
    public static final C7779f m10473m0(int i10, List list, boolean z10) {
        C5207g.m11111f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C9000b.m17257w();
                throw null;
            }
            UserLanguageProgressChartEntry userLanguageProgressChartEntry = (UserLanguageProgressChartEntry) obj;
            arrayList.add(new C8046e(userLanguageProgressChartEntry.f21774c, i11, (float) (z10 ? userLanguageProgressChartEntry.f21776e : userLanguageProgressChartEntry.f21775d)));
            i11 = i12;
        }
        return new C7779f(0, i10, arrayList, "");
    }

    /* JADX INFO: renamed from: n */
    public static final List<Integer> m10474n(Context context) {
        Object obj = C7472a.f41322a;
        return C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_8)));
    }

    /* JADX INFO: renamed from: n0 */
    public static final Typeface m10475n0(LessonFont lessonFont, Context context) {
        Typeface typefaceCreate;
        C5207g.m11111f(lessonFont, "<this>");
        C5207g.m11111f(context, "context");
        File fileM10466j = m10466j(lessonFont, context);
        try {
            if (C3398a.m9699b(lessonFont) || fileM10466j == null) {
                Typeface typefaceM15674a = C7906f.m15674a(m10470l(lessonFont), context);
                if (C5207g.m11106a(lessonFont, LessonFont.System.INSTANCE)) {
                    typefaceCreate = Typeface.DEFAULT;
                } else {
                    typefaceCreate = C5207g.m11106a(lessonFont, LessonFont.RubikBold.INSTANCE) ? Typeface.create(typefaceM15674a, 1) : typefaceM15674a;
                }
            } else {
                typefaceCreate = C5207g.m11106a(lessonFont, LessonFont.NotoSerifCantoneseBold.INSTANCE) ? new Typeface.Builder(fileM10466j).setFontVariationSettings("'wght' 700").build() : Typeface.createFromFile(fileM10466j);
            }
            return typefaceCreate;
        } catch (Exception unused) {
            return C7906f.m15674a(m10470l(LessonFont.Rubik.INSTANCE), context);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final List<Integer> m10476o(Context context) {
        Object obj = C7472a.f41322a;
        return C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_8)));
    }

    /* JADX INFO: renamed from: o0 */
    public static final <T extends InterfaceC10075a> FragmentViewBindingDelegate<T> m10477o0(Fragment fragment, InterfaceC2052l<? super View, ? extends T> interfaceC2052l) {
        C5207g.m11111f(fragment, "<this>");
        C5207g.m11111f(interfaceC2052l, "viewBindingFactory");
        return new FragmentViewBindingDelegate<>(fragment, interfaceC2052l);
    }

    /* JADX INFO: renamed from: p */
    public static final List<Integer> m10478p(Context context) {
        Object obj = C7472a.f41322a;
        return C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_8)));
    }

    /* JADX INFO: renamed from: q */
    public static final List<Integer> m10479q(Context context) {
        Object obj = C7472a.f41322a;
        return C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_8)));
    }

    /* JADX INFO: renamed from: r */
    public static final List<Integer> m10480r(Context context) {
        Object obj = C7472a.f41322a;
        return C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_8)));
    }

    /* JADX INFO: renamed from: s */
    public static final List<Integer> m10481s(Context context) {
        Object obj = C7472a.f41322a;
        return C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_8)));
    }

    /* JADX INFO: renamed from: t */
    public static final List<Integer> m10482t(Context context) {
        Object obj = C7472a.f41322a;
        return C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_8)));
    }

    /* JADX INFO: renamed from: u */
    public static final List<Integer> m10483u(Context context) {
        Object obj = C7472a.f41322a;
        return C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_8)));
    }

    /* JADX INFO: renamed from: v */
    public static final String m10484v(long j10) {
        if (j10 < 1000) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j10);
            return sb2.toString();
        }
        double d10 = j10;
        int iLog = (int) (Math.log(d10) / Math.log(1000.0d));
        DecimalFormat decimalFormat = j10 > 1000000 ? new DecimalFormat("#.##") : new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return C0166e.m770q(new Object[]{decimalFormat.format(d10 / Math.pow(1000.0d, iLog)), Character.valueOf("kMBT".charAt(iLog - 1))}, 2, "%s%c", "format(format, *args)");
    }

    /* JADX INFO: renamed from: w */
    public static final String m10485w(UserMilestone userMilestone) {
        String str = userMilestone.f21627b;
        if (!C7076b.m14278X2(str, "daily", false)) {
            List listM14299s3 = C7076b.m14299s3(str, new String[]{"."}, 0, 6);
            if (listM14299s3.size() == 2) {
                return "ic_" + C6752c.m13423Q(listM14299s3) + "_" + C6752c.m13432Z(listM14299s3);
            }
        }
        return "ic_milestone_daily_goal";
    }

    /* JADX INFO: renamed from: x */
    public static final ArrayList m10486x(Matcher matcher) {
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int iGroupCount = matcher.groupCount();
            int i10 = 1;
            if (1 <= iGroupCount) {
                while (true) {
                    String strGroup = matcher.group(i10);
                    if (strGroup != null) {
                        arrayList.add(strGroup);
                    }
                    if (i10 != iGroupCount) {
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static final MilestoneType m10487y(UserMilestone userMilestone) {
        String str = userMilestone.f21627b;
        if (C7076b.m14278X2(str, "known_words", false)) {
            return MilestoneType.KnownWords;
        }
        if (C7076b.m14278X2(str, "level", false)) {
            return MilestoneType.Level;
        }
        if (C7076b.m14278X2(str, "daily", false) && C7076b.m14278X2(str, "onfire", false)) {
            return MilestoneType.DailyDoubleGoal;
        }
        return C7076b.m14278X2(str, "daily", false) ? MilestoneType.DailyGoal : MilestoneType.DailyGoal;
    }

    /* JADX INFO: renamed from: z */
    public static final String m10488z(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long millis = j10 - TimeUnit.DAYS.toMillis(timeUnit.toDays(j10));
        long hours = timeUnit.toHours(millis);
        long millis2 = millis - TimeUnit.HOURS.toMillis(hours);
        long minutes = timeUnit.toMinutes(millis2);
        long seconds = timeUnit.toSeconds(millis2 - TimeUnit.MINUTES.toMillis(minutes));
        String str = hours == 1 ? "Hour" : "Hours";
        String str2 = minutes == 1 ? "Minute" : "Minutes";
        String str3 = seconds == 1 ? "Second" : "Seconds";
        if (hours == 0 && minutes == 0) {
            return C0166e.m770q(new Object[]{Integer.valueOf((int) seconds)}, 1, "%d ".concat(str3), "format(format, *args)");
        }
        if (hours == 0 && minutes > 0) {
            return C0166e.m770q(new Object[]{Integer.valueOf((int) minutes), Integer.valueOf((int) seconds)}, 2, "%d " + str2 + ", %d " + str3, "format(format, *args)");
        }
        if (hours > 0 && minutes == 0) {
            return C0166e.m770q(new Object[]{Integer.valueOf((int) hours)}, 1, "%d ".concat(str), "format(format, *args)");
        }
        if (hours <= 0 || minutes <= 0) {
            return "";
        }
        return C0166e.m770q(new Object[]{Integer.valueOf((int) hours), Integer.valueOf((int) minutes)}, 2, "%d " + str + ", %d " + str2, "format(format, *args)");
    }
}
