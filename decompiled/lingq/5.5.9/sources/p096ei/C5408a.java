package p096ei;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.ExportType;
import com.lingq.shared.uimodel.FeedTopic;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C7076b;
import p385sf.C9000b;

/* JADX INFO: renamed from: ei.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5408a {

    /* JADX INFO: renamed from: a */
    public static final List<LanguageLearn> f33824a = C9000b.m17252r(LanguageLearn.English, LanguageLearn.German, LanguageLearn.Japanese, LanguageLearn.Russian, LanguageLearn.French, LanguageLearn.Swedish, LanguageLearn.Spanish, LanguageLearn.Italian, LanguageLearn.Portuguese, LanguageLearn.Mandarin, LanguageLearn.Korean, LanguageLearn.Polish, LanguageLearn.Dutch);

    /* JADX INFO: renamed from: ei.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33825a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f33826b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f33827c;

        static {
            int[] iArr = new int[LanguageLearn.values().length];
            try {
                iArr[LanguageLearn.English.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LanguageLearn.French.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LanguageLearn.German.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LanguageLearn.Italian.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LanguageLearn.Japanese.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LanguageLearn.Korean.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LanguageLearn.Mandarin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LanguageLearn.Portuguese.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LanguageLearn.Swedish.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LanguageLearn.Spanish.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LanguageLearn.Russian.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LanguageLearn.Polish.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LanguageLearn.Dutch.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LanguageLearn.Greek.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LanguageLearn.Ukrainian.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LanguageLearn.Arabic.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LanguageLearn.Belarusian.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LanguageLearn.Esperanto.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LanguageLearn.Latin.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            f33825a = iArr;
            int[] iArr2 = new int[LanguageLearnBeta.values().length];
            try {
                iArr2[LanguageLearnBeta.Turkish.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[LanguageLearnBeta.Farsi.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[LanguageLearnBeta.Malay.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[LanguageLearnBeta.Danish.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[LanguageLearnBeta.Slovak.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[LanguageLearnBeta.Czech.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[LanguageLearnBeta.Finnish.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[LanguageLearnBeta.Hebrew.ordinal()] = 8;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[LanguageLearnBeta.Norwegian.ordinal()] = 9;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[LanguageLearnBeta.Romanian.ordinal()] = 10;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[LanguageLearnBeta.Bulgarian.ordinal()] = 11;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[LanguageLearnBeta.ChineseTraditional.ordinal()] = 12;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[LanguageLearnBeta.Croatian.ordinal()] = 13;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[LanguageLearnBeta.Serbian.ordinal()] = 14;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[LanguageLearnBeta.Indonesian.ordinal()] = 15;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[LanguageLearnBeta.Cantonese.ordinal()] = 16;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[LanguageLearnBeta.Gujarati.ordinal()] = 17;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[LanguageLearnBeta.Catalan.ordinal()] = 18;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[LanguageLearnBeta.Hungarian.ordinal()] = 19;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[LanguageLearnBeta.Icelandic.ordinal()] = 20;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[LanguageLearnBeta.Armenian.ordinal()] = 21;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[LanguageLearnBeta.Tagalog.ordinal()] = 22;
            } catch (NoSuchFieldError unused41) {
            }
            f33826b = iArr2;
            int[] iArr3 = new int[FeedTopic.values().length];
            try {
                iArr3[FeedTopic.Books.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[FeedTopic.Podcasts.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[FeedTopic.News.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            int[] iArr4 = new int[ExportType.values().length];
            try {
                iArr4[ExportType.CSV.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr4[ExportType.Anki.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            f33827c = iArr4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m11568a(int i10, Integer num) {
        if (i10 == CardStatus.Learned.getValue() && num != null) {
            if (num.intValue() == CardExtendedStatus.Known.getValue()) {
                i10 = CardStatus.Known.getValue();
            }
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final String m11569b(LanguageLearn languageLearn) {
        C5207g.m11111f(languageLearn, "<this>");
        switch (a.f33825a[languageLearn.ordinal()]) {
            case 1:
                return "en";
            case 2:
                return "fr";
            case 3:
                return "de";
            case 4:
                return "it";
            case 5:
                return "ja";
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return "ko";
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return "zh";
            case 8:
                return "pt";
            case 9:
                return "sv";
            case 10:
                return "es";
            case 11:
                return "ru";
            case 12:
                return "pl";
            case 13:
                return "nl";
            case 14:
                return "el";
            case 15:
                return "uk";
            case 16:
                return "ar";
            case 17:
                return "be";
            case 18:
                return "eo";
            case 19:
                return "la";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m11570c(LanguageLearnBeta languageLearnBeta) {
        C5207g.m11111f(languageLearnBeta, "<this>");
        switch (a.f33826b[languageLearnBeta.ordinal()]) {
            case 1:
                return "tr";
            case 2:
                return "fa";
            case 3:
                return "ms";
            case 4:
                return "da";
            case 5:
                return "sk";
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return "cs";
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return "fi";
            case 8:
                return "he";
            case 9:
                return "no";
            case 10:
                return "ro";
            case 11:
                return "bg";
            case 12:
                return "zh-t";
            case 13:
                return "hrv";
            case 14:
                return "srp";
            case 15:
                return "id";
            case 16:
                return "hk";
            case 17:
                return "gu";
            case 18:
                return "ca";
            case 19:
                return "hu";
            case 20:
                return "is";
            case 21:
                return "hy";
            case 22:
                return "tl";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m11571d(String str) {
        C5207g.m11111f(str, "<this>");
        return C5207g.m11106a(str, m11569b(LanguageLearn.Japanese)) || C5207g.m11106a(str, m11569b(LanguageLearn.Mandarin)) || C5207g.m11106a(str, m11570c(LanguageLearnBeta.ChineseTraditional)) || C5207g.m11106a(str, m11570c(LanguageLearnBeta.Cantonese));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m11572e(String str) {
        C5207g.m11111f(str, "<this>");
        if (!C5207g.m11106a(str, m11569b(LanguageLearn.Arabic)) && !C5207g.m11106a(str, m11570c(LanguageLearnBeta.Hebrew))) {
            if (!C5207g.m11106a(str, m11570c(LanguageLearnBeta.Farsi))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m11573f(String str) {
        C5207g.m11111f(str, "term");
        return C7076b.m14278X2(str, " ", false) || C7076b.m14278X2(str, "-", false);
    }

    /* JADX INFO: renamed from: g */
    public static final String m11574g(FeedTopic feedTopic) {
        C5207g.m11111f(feedTopic, "<this>");
        String lowerCase = feedTopic.name().toLowerCase(Locale.ROOT);
        C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (feedTopic == FeedTopic.SelfHelp) {
            return "self_help";
        }
        return feedTopic == FeedTopic.Songs ? "song" : lowerCase;
    }
}
