package p000;

import android.R;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.provider.MediaStore;
import android.speech.tts.Voice;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.widget.Toast;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.material3.C0232g0;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.vector.C0316d;
import androidx.compose.p002ui.layout.AbstractC0337d;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.platform.AbstractC0406r;
import androidx.compose.p002ui.res.ResourceResolutionException;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.core.view.AbstractC0479a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.facebook.appevents.C0920a;
import com.facebook.appevents.PersistedEvents;
import com.google.android.gms.common.Feature;
import com.google.android.material.R$attr;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.domain.model.ContentType;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageContextNotification;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.lesson.LessonFurigana;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.library.Accent;
import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.model.settings.JapaneseScript;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySort;
import com.lingq.core.domain.stats.ActivityScore;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.onboarding.AbstractC2174a;
import com.lingq.feature.onboarding.auth.login.C2177b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import okio.ByteString;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.lda;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: or */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3423or {

    /* JADX INFO: renamed from: a */
    public static final Continuation[] f54763a = new Continuation[0];

    /* JADX INFO: renamed from: b */
    public static final int[] f54764b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final long[] f54765c = new long[0];

    /* JADX INFO: renamed from: d */
    public static final Object[] f54766d = new Object[0];

    /* JADX INFO: renamed from: e */
    public static final boolean[] f54767e = new boolean[3];

    /* JADX INFO: renamed from: f */
    public static final lb9 f54768f = new lb9();

    /* JADX INFO: renamed from: g */
    public static final mb9 f54769g = new mb9();

    /* JADX INFO: renamed from: h */
    public static final Feature f54770h;

    /* JADX INFO: renamed from: i */
    public static final Feature f54771i;

    /* JADX INFO: renamed from: j */
    public static final Feature f54772j;

    /* JADX INFO: renamed from: k */
    public static final Feature[] f54773k;

    /* JADX INFO: renamed from: l */
    public static p04 f54774l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f54775m = 0;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f54776n = 0;

    /* JADX INFO: renamed from: o */
    public static String f54777o;

    /* JADX INFO: renamed from: p */
    public static Boolean f54778p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f54779q = 0;

    static {
        Feature feature = new Feature(-1, 1L, "commit_to_configuration_v2_api", true);
        f54770h = feature;
        Feature feature2 = new Feature(-1, 1L, "get_serving_version_api", true);
        Feature feature3 = new Feature(-1, 1L, "get_experiment_tokens_api", true);
        Feature feature4 = new Feature(-1, 2L, "register_flag_update_listener_api", true);
        f54771i = feature4;
        Feature feature5 = new Feature(-1, 1L, "sync_after_api", true);
        Feature feature6 = new Feature(-1, 1L, "sync_after_for_application_api", true);
        Feature feature7 = new Feature(-1, 1L, "set_app_wide_properties_api", true);
        Feature feature8 = new Feature(-1, 1L, "set_runtime_properties_api", true);
        Feature feature9 = new Feature(-1, 1L, "get_storage_info_api", true);
        f54772j = feature9;
        f54773k = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }

    /* JADX INFO: renamed from: A */
    public static final String m18216A(LibraryTab libraryTab) {
        Object next;
        libraryTab.getClass();
        String str = libraryTab.f19506f;
        if (vk9.m23380c0(str, "isPersonal", false)) {
            Iterator it = vk9.m23365A0(str, new String[]{"&"}, 0, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!vk9.m23380c0((String) next, "isPersonal", false));
            String str2 = (String) next;
            if (str2 != null) {
                return (String) u91.m22597O0(vk9.m23365A0(str2, new String[]{"="}, 0, 6));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m18217B(ye1 ye1Var) {
        return (((Configuration) ((tj3) ye1Var).m22128k(AbstractC0394f.f4760a)).uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: C */
    public static String m18218C(ex3 ex3Var) {
        ex3Var.getClass();
        ByteString byteString = ByteString.f54513d;
        return iy5.m14193h(ex3Var.f38032i).mo18077c("MD5").mo18079e();
    }

    /* JADX INFO: renamed from: D */
    public static final String m18219D(LibraryShelf libraryShelf) {
        Object next;
        libraryShelf.getClass();
        Iterator it = libraryShelf.f19495c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((LibraryTab) next).f19504d);
        LibraryTab libraryTabM18268n = (LibraryTab) next;
        if (libraryTabM18268n == null) {
            libraryTabM18268n = m18268n(libraryShelf);
        }
        return m18220E(libraryShelf, libraryTabM18268n);
    }

    /* JADX INFO: renamed from: E */
    public static final String m18220E(LibraryShelf libraryShelf, LibraryTab libraryTab) {
        libraryShelf.getClass();
        libraryTab.getClass();
        String str = libraryShelf.f19496d;
        String str2 = libraryTab.f19502b;
        int i = libraryTab.f19503c;
        String strM18252f = m18252f(libraryTab);
        String strM18216A = m18216A(libraryTab);
        String strM18286z = m18286z(libraryTab);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_type=");
        sb.append(str2);
        sb.append("_level=");
        sb.append(i);
        AbstractC3393o1.m17725C(sb, "accent=", strM18252f, "isPersonal=", strM18216A);
        return AbstractC3393o1.m17738m(sb, "isPending=", strM18286z);
    }

    /* JADX INFO: renamed from: F */
    public static final int m18221F(ContentType contentType) {
        contentType.getClass();
        int i = n78.f52452h[contentType.ordinal()];
        if (i == 1) {
            return R$string.ui_none;
        }
        if (i == 2) {
            return R$string.content_type_internal;
        }
        if (i == 3) {
            return R$string.content_type_my_imports;
        }
        if (i == 4) {
            return R$string.content_type_external;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public static final int m18222G(CoursePlaylistSort coursePlaylistSort) {
        coursePlaylistSort.getClass();
        int i = n78.f52451g[coursePlaylistSort.ordinal()];
        if (i == 1) {
            return R$string.search_all;
        }
        if (i == 2) {
            return R$string.sort_completed;
        }
        if (i == 3) {
            return R$string.sort_opened;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: H */
    public static final int m18223H(LanguageProgressMetric languageProgressMetric) {
        languageProgressMetric.getClass();
        switch (n78.f52446b[languageProgressMetric.ordinal()]) {
            case 1:
                return R$string.stats_known_words;
            case 2:
                return R$string.complete_lingqs_created;
            case 3:
                return R$string.stats_learned_lingqs;
            case 4:
                return R$string.stats_hours_listening;
            case 5:
                return R$string.stats_reading_words;
            case 6:
                return R$string.stats_coins_earned;
            case 7:
                return R$string.stats_hours_speaking;
            case 8:
                return R$string.stats_written_words;
            case 9:
                return R$string.stats_study_time;
            case 10:
                return R$string.stats_reading_speed;
            default:
                gm5.m12750e();
                return 0;
        }
    }

    /* JADX INFO: renamed from: I */
    public static final int m18224I(LanguageProgressPeriod languageProgressPeriod) {
        languageProgressPeriod.getClass();
        switch (n78.f52445a[languageProgressPeriod.ordinal()]) {
            case 1:
                return R$string.periods_last_seven_days;
            case 2:
                return R$string.periods_last_14_days;
            case 3:
                return R$string.periods_last_30_days;
            case 4:
                return R$string.periods_this_month;
            case 5:
                return R$string.periods_last_month;
            case 6:
                return R$string.periods_last_three_months;
            case 7:
                return R$string.periods_last_six_months;
            case 8:
                return R$string.periods_all_time;
            case 9:
                return R$string.periods_today;
            default:
                gm5.m12750e();
                return 0;
        }
    }

    /* JADX INFO: renamed from: J */
    public static final int m18225J(CardStatus cardStatus) {
        cardStatus.getClass();
        switch (n78.f52455k[cardStatus.ordinal()]) {
            case 1:
                return R$string.card_ignore_this_word;
            case 2:
                return R$string.card_status_new;
            case 3:
                return R$string.card_status_recognized;
            case 4:
                return R$string.card_status_familiar;
            case 5:
                return R$string.card_status_learned;
            case 6:
                return R$string.card_status_known;
            default:
                gm5.m12750e();
                return 0;
        }
    }

    /* JADX INFO: renamed from: K */
    public static final int m18226K(VocabularySearch vocabularySearch) {
        vocabularySearch.getClass();
        int i = n78.f52453i[vocabularySearch.ordinal()];
        if (i == 1) {
            return R$string.card_starts_with;
        }
        if (i == 2) {
            return R$string.card_ends_with;
        }
        if (i == 3) {
            return R$string.card_contains;
        }
        if (i == 4) {
            return R$string.card_phrase_contains;
        }
        if (i == 5) {
            return R$string.card_meaning_containing;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: L */
    public static final int m18227L(VocabularySort vocabularySort) {
        vocabularySort.getClass();
        int i = n78.f52454j[vocabularySort.ordinal()];
        if (i == 1) {
            return R$string.card_sort_alpha;
        }
        if (i == 2) {
            return R$string.card_sort_created;
        }
        if (i == 3) {
            return R$string.card_sort_status;
        }
        if (i == 4) {
            return R$string.card_sort_importance;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public static final int m18228M(ActivityScore activityScore) {
        activityScore.getClass();
        int i = n78.f52447c[activityScore.ordinal()];
        if (i == 1) {
            return R$string.stats_attention;
        }
        if (i == 2) {
            return R$string.stats_ok;
        }
        if (i == 3) {
            return R$string.stats_almost;
        }
        if (i == 4) {
            return R$string.stats_great;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public static final String m18229N(wy5 wy5Var, Context context) {
        String str;
        String string;
        wy5Var.getClass();
        context.getClass();
        dr5 dr5VarM15426e = new Regex("(?:beginner|intermediate|advanced)([1-9]\\d*)").m15426e(wy5Var.m24217b());
        if (dr5VarM15426e == null || (str = (String) ((br5) dr5VarM15426e.m10610a()).get(1)) == null) {
            return wy5Var.m24218c();
        }
        if (cl9.m4842Y(wy5Var.m24217b(), "beginner", false)) {
            string = context.getString(R$string.levels_beginner);
        } else if (cl9.m4842Y(wy5Var.m24217b(), "intermediate", false)) {
            string = context.getString(R$string.levels_intermediate);
        } else {
            if (!cl9.m4842Y(wy5Var.m24217b(), "advanced", false)) {
                return wy5Var.m24218c();
            }
            string = context.getString(R$string.levels_advanced);
        }
        string.getClass();
        return string + " " + str;
    }

    /* JADX INFO: renamed from: O */
    public static final String m18230O(LearningLevel learningLevel, Context context) {
        learningLevel.getClass();
        context.getClass();
        switch (n78.f52450f[learningLevel.ordinal()]) {
            case 1:
                return ux5.m22990m(context.getString(R$string.levels_beginner), " 1");
            case 2:
                return ux5.m22990m(context.getString(R$string.levels_beginner), " 2");
            case 3:
                return ux5.m22990m(context.getString(R$string.levels_intermediate), " 1");
            case 4:
                return ux5.m22990m(context.getString(R$string.levels_intermediate), " 2");
            case 5:
                return ux5.m22990m(context.getString(R$string.levels_advanced), " 1");
            case 6:
                return ux5.m22990m(context.getString(R$string.levels_advanced), " 2");
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX INFO: renamed from: P */
    public static final String m18231P(LearningLevel learningLevel, Context context) {
        learningLevel.getClass();
        context.getClass();
        switch (n78.f52450f[learningLevel.ordinal()]) {
            case 1:
                return ux5.m22990m(context.getString(R$string.levels_beginner_short), " 1");
            case 2:
                return ux5.m22990m(context.getString(R$string.levels_beginner_short), " 2");
            case 3:
                return ux5.m22990m(context.getString(R$string.levels_intermediate_short), " 1");
            case 4:
                return ux5.m22990m(context.getString(R$string.levels_intermediate_short), " 2");
            case 5:
                return ux5.m22990m(context.getString(R$string.levels_advanced_short), " 1");
            case 6:
                return ux5.m22990m(context.getString(R$string.levels_advanced_short), " 2");
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final float m18232Q(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX INFO: renamed from: R */
    public static final int m18233R(int i, float f, int i2) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX INFO: renamed from: S */
    public static final it5 m18234S(oj8 oj8Var, int i, int i2, int i3, int i4, int i5, jt5 jt5Var, List list, l87[] l87VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        boolean z;
        int iMax;
        int i11;
        int i12;
        int i13;
        int i14;
        List list2 = list;
        long j = i5;
        int i15 = i7 - i6;
        int[] iArr2 = new int[i15];
        int i16 = i6;
        int iMax2 = 0;
        int i17 = 0;
        boolean z2 = false;
        int i18 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i16 < i7) {
            ct5 ct5Var = (ct5) list2.get(i16);
            long j2 = j;
            pj8 pj8VarM15225s = AbstractC3184kh.m15225s(ct5Var);
            float fM15227v = AbstractC3184kh.m15227v(pj8VarM15225s);
            if (z2) {
                z2 = true;
            } else {
                d32 d32Var = pj8VarM15225s != null ? pj8VarM15225s.f56323c : null;
                if (d32Var != null ? d32Var instanceof rr1 : false) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (fM15227v > 0.0f) {
                f2 += fM15227v;
                i17++;
                i12 = i16;
            } else {
                int i19 = i3 - i18;
                l87 l87VarMo1514r = l87VarArr[i16];
                if (l87VarMo1514r == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i12 = i16;
                        i13 = i17;
                        i14 = Integer.MAX_VALUE;
                    } else {
                        i12 = i16;
                        i13 = i17;
                        i14 = i19 < 0 ? 0 : i19;
                    }
                    l87VarMo1514r = ct5Var.mo1514r(oj8Var.mo3551g(0, i14, i4, false));
                } else {
                    i12 = i16;
                    i13 = i17;
                }
                int iMo3554j = oj8Var.mo3554j(l87VarMo1514r);
                int iMo3553i = oj8Var.mo3553i(l87VarMo1514r);
                iArr2[i12 - i6] = iMo3554j;
                int i20 = i19 - iMo3554j;
                if (i20 < 0) {
                    i20 = 0;
                }
                iMin = Math.min(i5, i20);
                i18 += iMo3554j + iMin;
                iMax2 = Math.max(iMax2, iMo3553i);
                l87VarArr[i12] = l87VarMo1514r;
                i17 = i13;
            }
            i16 = i12 + 1;
            j = j2;
        }
        long j3 = j;
        int i21 = i17;
        boolean z3 = true;
        if (i21 == 0) {
            i18 -= iMin;
            i9 = 0;
        } else {
            long j4 = ((long) (i21 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i18)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            int i22 = i6;
            while (i22 < i7) {
                jRound -= (long) Math.round(AbstractC3184kh.m15227v(AbstractC3184kh.m15225s((ct5) list2.get(i22))) * f3);
                i22++;
                j4 = j4;
            }
            long j5 = j4;
            int i23 = i6;
            int i24 = 0;
            while (i23 < i7) {
                if (l87VarArr[i23] == null) {
                    ct5 ct5Var2 = (ct5) list2.get(i23);
                    pj8 pj8VarM15225s2 = AbstractC3184kh.m15225s(ct5Var2);
                    float fM15227v2 = AbstractC3184kh.m15227v(pj8VarM15225s2);
                    if (fM15227v2 <= 0.0f) {
                        g54.m12363b("All weights <= 0 should have placeables");
                    }
                    i10 = i23;
                    int iSignum = Long.signum(jRound);
                    f = f3;
                    jRound -= (long) iSignum;
                    int iMax3 = Math.max(0, Math.round(f * fM15227v2) + iSignum);
                    z = z3;
                    l87 l87VarMo1514r2 = ct5Var2.mo1514r(oj8Var.mo3551g((!(pj8VarM15225s2 != null ? pj8VarM15225s2.f56322b : z3) || iMax3 == Integer.MAX_VALUE) ? 0 : iMax3, iMax3, i4, z));
                    int iMo3554j2 = oj8Var.mo3554j(l87VarMo1514r2);
                    int iMo3553i2 = oj8Var.mo3553i(l87VarMo1514r2);
                    iArr2[i10 - i6] = iMo3554j2;
                    i24 += iMo3554j2;
                    int iMax4 = Math.max(iMax2, iMo3553i2);
                    l87VarArr[i10] = l87VarMo1514r2;
                    iMax2 = iMax4;
                } else {
                    i10 = i23;
                    f = f3;
                    z = z3;
                }
                list2 = list;
                z3 = z;
                i23 = i10 + 1;
                f3 = f;
            }
            i9 = (int) (((long) i24) + j5);
            int i25 = i3 - i18;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
        }
        if (z2) {
            int iMax5 = 0;
            iMax = 0;
            for (int i26 = i6; i26 < i7; i26++) {
                l87 l87Var = l87VarArr[i26];
                l87Var.getClass();
                Object objMo1509A = l87Var.mo1509A();
                pj8 pj8Var = objMo1509A instanceof pj8 ? (pj8) objMo1509A : null;
                d32 d32Var2 = pj8Var != null ? pj8Var.f56323c : null;
                Integer numMo10068E = d32Var2 != null ? d32Var2.mo10068E(l87Var) : null;
                if (numMo10068E != null) {
                    int iIntValue = numMo10068E.intValue();
                    int iMo3553i3 = oj8Var.mo3553i(l87Var);
                    iMax5 = Math.max(iMax5, iIntValue != Integer.MIN_VALUE ? numMo10068E.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iMo3553i3;
                    }
                    iMax = Math.max(iMax, iMo3553i3 - iIntValue);
                }
            }
            i11 = iMax5;
        } else {
            iMax = 0;
            i11 = 0;
        }
        int i27 = i18 + i9;
        int iMax6 = Math.max(i27 < 0 ? 0 : i27, i);
        int iMax7 = Math.max(iMax2, Math.max(i2, iMax + i11));
        int[] iArr3 = new int[i15];
        oj8Var.mo3550f(iMax6, iArr2, iArr3, jt5Var);
        return oj8Var.mo3552h(l87VarArr, jt5Var, i11, iArr3, iMax6, iMax7, iArr, i8, i6, i7);
    }

    /* JADX INFO: renamed from: T */
    public static final String m18235T(Voice voice, Context context, String str, int i) {
        String string;
        Object next;
        String str2;
        String str3;
        str.getClass();
        Set<String> features = voice.getFeatures();
        features.getClass();
        Iterator<T> it = features.iterator();
        do {
            string = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str3 = (String) next;
            str3.getClass();
        } while (!vk9.m23380c0(str3, "gender", false));
        String str4 = (String) next;
        if (str4 != null && (str2 = (String) u91.m22597O0(vk9.m23365A0(str4, new String[]{"="}, 0, 6))) != null) {
            if (str2.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(str2.charAt(0));
                strValueOf.getClass();
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb.append((Object) upperCase);
                sb.append(str2.substring(1));
                string = sb.toString();
            } else {
                string = str2;
            }
        }
        if (string == null) {
            String string2 = context.getString(R$string.local_tts_voice);
            string2.getClass();
            return String.format(string2, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(context, str), Integer.valueOf(i)}, 2));
        }
        String string3 = context.getString(R$string.local_tts_gender_voice);
        string3.getClass();
        return String.format(string3, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(context, str), string, Integer.valueOf(i)}, 3));
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0350  */
    /* JADX WARN: Code duplicated, block: B:143:0x03dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x03df  */
    /* JADX WARN: Code duplicated, block: B:145:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x0402 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x0404  */
    /* JADX WARN: Code duplicated, block: B:155:0x040c  */
    /* JADX WARN: Code duplicated, block: B:158:0x041c  */
    /* JADX WARN: Code duplicated, block: B:159:0x041f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0425  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f  */
    /* JADX INFO: renamed from: U */
    public static final y27 m18236U(int i, ye1 ye1Var, int i2) {
        TypedValue typedValue;
        int i3;
        long jM10035e;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C3047gq c3047gqM17379c;
        int iM17380d;
        Shader shader;
        vi0 pd9Var;
        Shader shader2;
        vi0 pd9Var2;
        vi0 vi0Var;
        int i9;
        tj3 tj3Var = (tj3) ye1Var;
        Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
        Resources resources = (Resources) tj3Var.m22128k(AbstractC0394f.f4762c);
        y78 y78Var = (y78) tj3Var.m22128k(AbstractC0394f.f4764e);
        synchronized (y78Var) {
            typedValue = (TypedValue) y78Var.f69418a.m10152b(i);
            i3 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                t56 t56Var = y78Var.f69418a;
                int iM21845d = t56Var.m21845d(i);
                Object[] objArr = t56Var.f35145c;
                Object obj = objArr[iM21845d];
                t56Var.f35144b[iM21845d] = i;
                objArr[iM21845d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !vk9.m23383f0(charSequence, ".xml")) {
            tj3Var.m22111b0(-1771643000);
            boolean zM22120g = tj3Var.m22120g(context.getTheme()) | tj3Var.m22120g(charSequence) | ((((i2 & 14) ^ 6) > 4 && tj3Var.m22116e(i)) || (i2 & 6) == 4);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    objM22097O = new C3185ki(((BitmapDrawable) drawable).getBitmap());
                    tj3Var.m22131l0(objM22097O);
                } catch (Exception e) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            C3185ki c3185ki = (C3185ki) objM22097O;
            hd0 hd0Var = new hd0(c3185ki, (((long) c3185ki.f47311a.getHeight()) & 4294967295L) | (((long) c3185ki.f47311a.getWidth()) << 32));
            tj3Var.m22139q(false);
            return hd0Var;
        }
        tj3Var.m22111b0(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i10 = typedValue.changingConfigurations;
        s04 s04Var = (s04) tj3Var.m22128k(AbstractC0394f.f4763d);
        r04 r04Var = new r04(theme, i);
        WeakReference weakReference = (WeakReference) s04Var.f60130a.get(r04Var);
        q04 q04Var = weakReference != null ? (q04) weakReference.get() : null;
        if (q04Var == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!fa4.m11650l(xml.getName(), "vector")) {
                C3386nv.m17626m("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            C3079hl c3079hl = new C3079hl(xml);
            TypedArray typedArrayM17383g = nda.m17383g(resources, theme, attributeSetAsAttributeSet, AbstractC3695vr.f65806a);
            c3079hl.m13323b(typedArrayM17383g.getChangingConfigurations());
            boolean z = !nda.m17382f(xml, "autoMirrored") ? false : typedArrayM17383g.getBoolean(5, false);
            c3079hl.m13323b(typedArrayM17383g.getChangingConfigurations());
            float fM13322a = c3079hl.m13322a(typedArrayM17383g, "viewportWidth", 7, 0.0f);
            float fM13322a2 = c3079hl.m13322a(typedArrayM17383g, "viewportHeight", 8, 0.0f);
            if (fM13322a <= 0.0f) {
                throw new XmlPullParserException(typedArrayM17383g.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fM13322a2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayM17383g.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayM17383g.getDimension(3, 0.0f);
            c3079hl.m13323b(typedArrayM17383g.getChangingConfigurations());
            float dimension2 = typedArrayM17383g.getDimension(2, 0.0f);
            c3079hl.m13323b(typedArrayM17383g.getChangingConfigurations());
            if (typedArrayM17383g.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayM17383g.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jM10035e = aa1.f412k;
                } else {
                    ColorStateList colorStateListM17378b = nda.m17378b(typedArrayM17383g, xml, theme);
                    c3079hl.m13323b(typedArrayM17383g.getChangingConfigurations());
                    jM10035e = colorStateListM17378b != null ? d32.m10035e(colorStateListM17378b.getDefaultColor()) : aa1.f412k;
                }
            } else {
                jM10035e = aa1.f412k;
            }
            long j = jM10035e;
            int i11 = typedArrayM17383g.getInt(6, -1);
            c3079hl.m13323b(typedArrayM17383g.getChangingConfigurations());
            if (i11 == -1) {
                i4 = 5;
            } else if (i11 == 3) {
                i4 = 3;
            } else if (i11 == 5) {
                i4 = 5;
            } else if (i11 != 9) {
                switch (i11) {
                    case 14:
                        i4 = 13;
                        break;
                    case 15:
                        i4 = 14;
                        break;
                    case 16:
                        i4 = 12;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
            } else {
                i4 = 9;
            }
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayM17383g.recycle();
            o04 o04Var = new o04(null, f, f2, fM13322a, fM13322a2, j, i4, z, 1);
            int i12 = 0;
            for (int i13 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i13); i13 = 3) {
                List listM17837a = EmptyList.f47638a;
                XmlPullParser xmlPullParser = c3079hl.f42557a;
                int i14 = i3;
                C3400o8 c3400o8 = c3079hl.f42559c;
                XmlResourceParser xmlResourceParser = xml;
                int eventType = xmlPullParser.getEventType();
                int i15 = i10;
                if (eventType != 2) {
                    if (eventType != i13) {
                        i5 = i12;
                        i6 = i14;
                    } else {
                        if ("group".equals(xmlPullParser.getName())) {
                            int i16 = i12 + 1;
                            int i17 = 0;
                            while (i17 < i16) {
                                ArrayList arrayList = o04Var.f53518i;
                                if (o04Var.f53520k) {
                                    i54.m13663b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                n04 n04Var = (n04) arrayList.remove(arrayList.size() - 1);
                                ((n04) AbstractC3393o1.m17731f(i14, arrayList)).f52118j.add(new roa(n04Var.f52109a, n04Var.f52110b, n04Var.f52111c, n04Var.f52112d, n04Var.f52113e, n04Var.f52114f, n04Var.f52115g, n04Var.f52116h, n04Var.f52117i, n04Var.f52118j));
                                i17++;
                                i14 = 1;
                            }
                            i6 = 1;
                            i12 = 0;
                        }
                        i5 = i12;
                        i6 = 1;
                    }
                    i12 = i5;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i5 = i12;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    TypedArray typedArrayM17383g2 = nda.m17383g(resources, theme, attributeSetAsAttributeSet, AbstractC3695vr.f65807b);
                                    c3079hl.m13323b(typedArrayM17383g2.getChangingConfigurations());
                                    float fM13322a3 = c3079hl.m13322a(typedArrayM17383g2, "rotation", 5, 0.0f);
                                    float f3 = typedArrayM17383g2.getFloat(1, 0.0f);
                                    c3079hl.m13323b(typedArrayM17383g2.getChangingConfigurations());
                                    float f4 = typedArrayM17383g2.getFloat(2, 0.0f);
                                    c3079hl.m13323b(typedArrayM17383g2.getChangingConfigurations());
                                    float fM13322a4 = c3079hl.m13322a(typedArrayM17383g2, "scaleX", 3, 1.0f);
                                    float fM13322a5 = c3079hl.m13322a(typedArrayM17383g2, "scaleY", 4, 1.0f);
                                    float fM13322a6 = c3079hl.m13322a(typedArrayM17383g2, "translateX", 6, 0.0f);
                                    float fM13322a7 = c3079hl.m13322a(typedArrayM17383g2, "translateY", 7, 0.0f);
                                    String string = typedArrayM17383g2.getString(0);
                                    c3079hl.m13323b(typedArrayM17383g2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayM17383g2.recycle();
                                    int i18 = soa.f61116a;
                                    if (o04Var.f53520k) {
                                        i54.m13663b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    o04Var.f53518i.add(new n04(str, fM13322a3, f3, f4, fM13322a4, fM13322a5, fM13322a6, fM13322a7, listM17837a, 512));
                                    i12 = i5;
                                    i6 = 1;
                                }
                            } else if (name.equals("path")) {
                                TypedArray typedArrayM17383g3 = nda.m17383g(resources, theme, attributeSetAsAttributeSet, AbstractC3695vr.f65808c);
                                c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    C3386nv.m17626m("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayM17383g3.getString(0);
                                c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayM17383g3.getString(2);
                                c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i19 = soa.f61116a;
                                } else {
                                    listM17837a = C3400o8.m17837a(c3400o8, string3);
                                }
                                List list = listM17837a;
                                C3047gq c3047gqM17379c2 = nda.m17379c(typedArrayM17383g3, c3079hl.f42557a, theme, "fillColor", 1);
                                c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                float fM13322a8 = c3079hl.m13322a(typedArrayM17383g3, "fillAlpha", 12, 1.0f);
                                int iM17380d2 = nda.m17380d(typedArrayM17383g3, c3079hl.f42557a, "strokeLineCap", 8, -1);
                                c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                if (iM17380d2 == 0) {
                                    i7 = 0;
                                } else if (iM17380d2 == 1) {
                                    i7 = 1;
                                } else if (iM17380d2 != 2) {
                                    i7 = 0;
                                } else {
                                    i7 = 2;
                                }
                                int iM17380d3 = nda.m17380d(typedArrayM17383g3, c3079hl.f42557a, "strokeLineJoin", 9, -1);
                                c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                if (iM17380d3 != 0) {
                                    if (iM17380d3 == 1) {
                                        i8 = 1;
                                    } else if (iM17380d3 == 2) {
                                        i8 = 2;
                                    }
                                    float fM13322a9 = c3079hl.m13322a(typedArrayM17383g3, "strokeMiterLimit", 10, 4.0f);
                                    c3047gqM17379c = nda.m17379c(typedArrayM17383g3, c3079hl.f42557a, theme, "strokeColor", 3);
                                    c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                    float fM13322a10 = c3079hl.m13322a(typedArrayM17383g3, "strokeAlpha", 11, 1.0f);
                                    float fM13322a11 = c3079hl.m13322a(typedArrayM17383g3, "strokeWidth", 4, 1.0f);
                                    float fM13322a12 = c3079hl.m13322a(typedArrayM17383g3, "trimPathEnd", 6, 1.0f);
                                    float fM13322a13 = c3079hl.m13322a(typedArrayM17383g3, "trimPathOffset", 7, 0.0f);
                                    float fM13322a14 = c3079hl.m13322a(typedArrayM17383g3, "trimPathStart", 5, 0.0f);
                                    iM17380d = nda.m17380d(typedArrayM17383g3, c3079hl.f42557a, "fillType", 13, 0);
                                    c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                    typedArrayM17383g3.recycle();
                                    shader = (Shader) c3047gqM17379c2.f41172c;
                                    if (shader == null && c3047gqM17379c2.f41171b == 0) {
                                        pd9Var = null;
                                    } else if (shader != null) {
                                        pd9Var = new wi0(shader);
                                    } else {
                                        pd9Var = new pd9(d32.m10035e(c3047gqM17379c2.f41171b));
                                    }
                                    shader2 = (Shader) c3047gqM17379c.f41172c;
                                    if (shader2 != null && c3047gqM17379c.f41171b == 0) {
                                        vi0Var = null;
                                    } else {
                                        if (shader2 != null) {
                                            pd9Var2 = new wi0(shader2);
                                        } else {
                                            pd9Var2 = new pd9(d32.m10035e(c3047gqM17379c.f41171b));
                                        }
                                        vi0Var = pd9Var2;
                                    }
                                    if (iM17380d == 0) {
                                        i9 = 0;
                                    } else {
                                        i9 = 1;
                                    }
                                    if (o04Var.f53520k) {
                                        i54.m13663b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((n04) AbstractC3393o1.m17731f(1, o04Var.f53518i)).f52118j.add(new uoa(str2, list, i9, pd9Var, fM13322a8, vi0Var, fM13322a10, fM13322a11, i7, i8, fM13322a9, fM13322a14, fM13322a12, fM13322a13));
                                    i12 = i5;
                                    i6 = 1;
                                }
                                i8 = 0;
                                float fM13322a15 = c3079hl.m13322a(typedArrayM17383g3, "strokeMiterLimit", 10, 4.0f);
                                c3047gqM17379c = nda.m17379c(typedArrayM17383g3, c3079hl.f42557a, theme, "strokeColor", 3);
                                c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                float fM13322a16 = c3079hl.m13322a(typedArrayM17383g3, "strokeAlpha", 11, 1.0f);
                                float fM13322a17 = c3079hl.m13322a(typedArrayM17383g3, "strokeWidth", 4, 1.0f);
                                float fM13322a18 = c3079hl.m13322a(typedArrayM17383g3, "trimPathEnd", 6, 1.0f);
                                float fM13322a19 = c3079hl.m13322a(typedArrayM17383g3, "trimPathOffset", 7, 0.0f);
                                float fM13322a110 = c3079hl.m13322a(typedArrayM17383g3, "trimPathStart", 5, 0.0f);
                                iM17380d = nda.m17380d(typedArrayM17383g3, c3079hl.f42557a, "fillType", 13, 0);
                                c3079hl.m13323b(typedArrayM17383g3.getChangingConfigurations());
                                typedArrayM17383g3.recycle();
                                shader = (Shader) c3047gqM17379c2.f41172c;
                                if (shader == null) {
                                    pd9Var = null;
                                } else if (shader != null) {
                                    pd9Var = new wi0(shader);
                                } else {
                                    pd9Var = new pd9(d32.m10035e(c3047gqM17379c2.f41171b));
                                }
                                shader2 = (Shader) c3047gqM17379c.f41172c;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        pd9Var2 = new wi0(shader2);
                                    } else {
                                        pd9Var2 = new pd9(d32.m10035e(c3047gqM17379c.f41171b));
                                    }
                                    vi0Var = pd9Var2;
                                } else {
                                    vi0Var = null;
                                }
                                if (iM17380d == 0) {
                                    i9 = 0;
                                } else {
                                    i9 = 1;
                                }
                                if (o04Var.f53520k) {
                                    i54.m13663b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((n04) AbstractC3393o1.m17731f(1, o04Var.f53518i)).f52118j.add(new uoa(str2, list, i9, pd9Var, fM13322a8, vi0Var, fM13322a16, fM13322a17, i7, i8, fM13322a15, fM13322a110, fM13322a18, fM13322a19));
                                i12 = i5;
                                i6 = 1;
                            }
                        } else {
                            i5 = i12;
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayM17383g4 = nda.m17383g(resources, theme, attributeSetAsAttributeSet, AbstractC3695vr.f65809d);
                                c3079hl.m13323b(typedArrayM17383g4.getChangingConfigurations());
                                String string4 = typedArrayM17383g4.getString(0);
                                c3079hl.m13323b(typedArrayM17383g4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i6 = 1;
                                String string5 = typedArrayM17383g4.getString(1);
                                c3079hl.m13323b(typedArrayM17383g4.getChangingConfigurations());
                                if (string5 == null) {
                                    int i20 = soa.f61116a;
                                } else {
                                    listM17837a = C3400o8.m17837a(c3400o8, string5);
                                }
                                List list2 = listM17837a;
                                typedArrayM17383g4.recycle();
                                if (o04Var.f53520k) {
                                    i54.m13663b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                o04Var.f53518i.add(new n04(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i12 = i5 + 1;
                            } else {
                                i6 = 1;
                                i12 = i5;
                            }
                        }
                    } else {
                        i5 = i12;
                    }
                    i6 = 1;
                    i12 = i5;
                }
                xmlResourceParser.next();
                i3 = i6;
                xml = xmlResourceParser;
                i10 = i15;
            }
            q04Var = new q04(o04Var.m17721b(), i10 | c3079hl.f42558b);
            s04Var.f60130a.put(r04Var, new WeakReference(q04Var));
        }
        C0316d c0316dM25096c = yda.m25096c(q04Var.f57069a, tj3Var);
        tj3Var.m22139q(false);
        return c0316dM25096c;
    }

    /* JADX INFO: renamed from: V */
    public static final synchronized PersistedEvents m18237V() {
        PersistedEvents persistedEvents;
        ClassNotFoundException e;
        IOException e2;
        String str;
        Context contextM21766a = sy2.m21766a();
        PersistedEvents persistedEvents2 = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = contextM21766a.openFileInput("AppEventsLogger.persistedevents");
                fileInputStreamOpenFileInput.getClass();
                C0920a c0920a = new C0920a(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    Object object = c0920a.readObject();
                    object.getClass();
                    persistedEvents = (PersistedEvents) object;
                    try {
                        c0920a.close();
                        try {
                            contextM21766a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e3) {
                            e = e3;
                            str = "or";
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    } catch (FileNotFoundException unused) {
                        persistedEvents2 = persistedEvents;
                        try {
                            contextM21766a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e4) {
                            Log.w("or", "Got unexpected exception when removing events file: ", e4);
                        }
                        persistedEvents = persistedEvents2;
                    } catch (IOException e5) {
                        e2 = e5;
                        Log.w("or", "Got unexpected exception while reading events: ", e2);
                        try {
                            contextM21766a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e6) {
                            e = e6;
                            str = "or";
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    } catch (ClassNotFoundException e7) {
                        e = e7;
                        Log.w("or", "Got unexpected exception while reading events: ", e);
                        try {
                            contextM21766a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e8) {
                            e = e8;
                            str = "or";
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3584sr.m21646y(c0920a, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    contextM21766a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e9) {
                    Log.w("or", "Got unexpected exception when removing events file: ", e9);
                }
                throw th3;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e10) {
            persistedEvents = null;
            e2 = e10;
        } catch (ClassNotFoundException e11) {
            persistedEvents = null;
            e = e11;
        }
        if (persistedEvents == null) {
            persistedEvents = new PersistedEvents();
        }
        return persistedEvents;
    }

    /* JADX INFO: renamed from: W */
    public static int m18238W(e18 e18Var) throws IOException {
        try {
            aj0 aj0Var = e18Var.f36575b;
            e18Var.mo475b0(1L);
            long j = 0;
            while (true) {
                long j2 = j + 1;
                if (!e18Var.mo464P(j2)) {
                    break;
                }
                byte bM494q = aj0Var.m494q(j);
                if ((bM494q >= 48 && bM494q <= 57) || (j == 0 && bM494q == 45)) {
                    j = j2;
                }
                if (j != 0) {
                    break;
                }
                ci8.m4727l(16);
                String string = Integer.toString(bM494q, 16);
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jM466R = aj0Var.m466R();
            String strMo457D = e18Var.mo457D(Long.MAX_VALUE);
            if (jM466R >= 0 && jM466R <= 2147483647L && strMo457D.length() <= 0) {
                return (int) jM466R;
            }
            throw new IOException("expected an int but was \"" + jM466R + strMo457D + '\"');
        } catch (NumberFormatException e) {
            v63.m23133k(e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: X */
    public static final e16 m18239X(e16 e16Var, IntrinsicSize intrinsicSize) {
        return e16Var.mo3161g(new y94(intrinsicSize, false, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: Y */
    public static final void m18240Y(PersistedEvents persistedEvents) {
        Context contextM21766a = sy2.m21766a();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextM21766a.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(persistedEvents);
                objectOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            Log.w("or", "Got unexpected exception while persisting events: ", e);
            try {
                contextM21766a.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m18241Z(Context context, View view, Bitmap bitmap, String str, vi3 vi3Var, int i) {
        OutputStream outputStreamOpenOutputStream;
        Bitmap bitmapCreateBitmap = null;
        if ((i & 1) != 0) {
            view = null;
        }
        if ((i & 2) != 0) {
            bitmap = null;
        }
        context.getClass();
        if (view != null) {
            view.setBackgroundColor(jfa.m14431n(context, R$attr.colorSurface));
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("relative_path", "DCIM/LingQ");
            Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            } else {
                uriInsert = null;
                outputStreamOpenOutputStream = null;
            }
            if (bitmap != null) {
                bitmapCreateBitmap = bitmap;
            } else if (view != null) {
                bitmapCreateBitmap = Bitmap.createBitmap(AbstractC0479a.m1999a(view));
            }
            if (outputStreamOpenOutputStream != null) {
                if (bitmapCreateBitmap != null) {
                    try {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3584sr.m21646y(outputStreamOpenOutputStream, th);
                            throw th2;
                        }
                    }
                }
                if (view != null) {
                    view.setBackgroundColor(0);
                }
                outputStreamOpenOutputStream.close();
            }
            if (uriInsert != null) {
                vi3Var.invoke(uriInsert);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, "Couldn't share stats", 0).show();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m18242a(e16 e16Var, InterfaceC3624tu interfaceC3624tu, InterfaceC3735wu interfaceC3735wu, int i, f93 f93Var, C0282a c0282a, ye1 ye1Var, int i2) {
        int i3;
        int i4;
        fc0 fc0Var = nj0.f52817l;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1956591841);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22120g(interfaceC3624tu) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22120g(interfaceC3735wu) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var.m22120g(fc0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= tj3Var.m22116e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= tj3Var.m22116e(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= tj3Var.m22120g(f93Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= tj3Var.m22124i(c0282a) ? 8388608 : 4194304;
        }
        int i5 = i3;
        if (tj3Var.m22099R(i5 & 1, (i5 & 4793491) != 4793490)) {
            int i6 = i5 & 3670016;
            boolean z = i6 == 1048576;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new c93(f93Var.f38667a);
                tj3Var.m22131l0(objM22097O);
            }
            c93 c93Var = (c93) objM22097O;
            int i7 = i5 >> 3;
            boolean zM22120g = ((((i7 & 14) ^ 6) > 4 && tj3Var.m22120g(interfaceC3624tu)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && tj3Var.m22120g(interfaceC3735wu)) || (i7 & 48) == 32) | ((((i7 & 896) ^ 384) > 256 && tj3Var.m22120g(fc0Var)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && tj3Var.m22116e(i)) || (i7 & 3072) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && tj3Var.m22116e(Integer.MAX_VALUE)) || (i7 & 24576) == 16384) | tj3Var.m22120g(c93Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                i4 = i6;
                e93 e93Var = new e93(interfaceC3624tu, interfaceC3735wu, interfaceC3624tu.mo9967a(), new tr1(fc0Var), interfaceC3735wu.m24157a(), i, c93Var);
                tj3Var.m22131l0(e93Var);
                objM22097O2 = e93Var;
            } else {
                i4 = i6;
            }
            e93 e93Var2 = (e93) objM22097O2;
            boolean z2 = (i4 == 1048576) | ((i5 & 29360128) == 8388608) | ((i5 & 458752) == 131072);
            Object objM22097O3 = tj3Var.m22097O();
            Object obj = objM22097O3;
            if (z2 || objM22097O3 == p84Var) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C0282a(-1192950673, true, new zn0(c0282a, 1)));
                f93Var.getClass();
                int i8 = a93.f378a[f93Var.f38667a.ordinal()];
                tj3Var.m22131l0(arrayList);
                obj = arrayList;
            }
            C0282a c0282aM1488c = AbstractC0337d.m1488c((List) obj);
            boolean zM22120g2 = tj3Var.m22120g(e93Var2);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O4 == p84Var) {
                objM22097O4 = new q46(e93Var2);
                tj3Var.m22131l0(objM22097O4);
            }
            ht5 ht5Var = (ht5) objM22097O4;
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5Var);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            wq1.m24128x(0, c0282aM1488c, tj3Var, true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new z83(e16Var, interfaceC3624tu, interfaceC3735wu, i, f93Var, c0282a, i2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final String m18243a0(LibraryShelf libraryShelf, LibraryTab libraryTab, String str) {
        libraryShelf.getClass();
        str.getClass();
        String str2 = libraryShelf.f19496d;
        if (fa4.m11650l(str2, LibraryShelfType.MyLessons.getValue())) {
            if (fa4.m11650l(libraryTab != null ? m18216A(libraryTab) : null, "true")) {
                return bq1.m4048X(str2 + "_my_imports_", str);
            }
        }
        return bq1.m4048X(str2, str);
    }

    /* JADX INFO: renamed from: b */
    public static final void m18244b(e16 e16Var, InterfaceC3624tu interfaceC3624tu, InterfaceC3735wu interfaceC3735wu, fc0 fc0Var, int i, int i2, final C0282a c0282a, ye1 ye1Var, final int i3, final int i4) {
        int i5;
        int i6;
        final e16 e16Var2;
        final InterfaceC3624tu interfaceC3624tu2;
        final InterfaceC3735wu interfaceC3735wu2;
        final fc0 fc0Var2;
        final int i7;
        final int i8;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1303174015);
        int i9 = i4 & 1;
        if (i9 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i10 = i4 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= tj3Var.m22120g(interfaceC3624tu) ? 32 : 16;
        }
        int i11 = i4 & 4;
        if (i11 != 0) {
            i6 = i5 | 384;
        } else {
            i6 = i5 | (tj3Var.m22120g(interfaceC3735wu) ? 256 : 128);
        }
        int i12 = i6 | 3072;
        int i13 = i4 & 16;
        if (i13 != 0) {
            i12 = i6 | 27648;
        } else if ((i3 & 24576) == 0) {
            i12 |= tj3Var.m22116e(i) ? 16384 : 8192;
        }
        int i14 = i12 | 196608;
        if (tj3Var.m22099R(i14 & 1, (599187 & i14) != 599186)) {
            if (i9 != 0) {
                e16Var = b16.f7762a;
            }
            e16 e16Var3 = e16Var;
            if (i10 != 0) {
                interfaceC3624tu = eh0.f37236b;
            }
            if (i11 != 0) {
                interfaceC3735wu = eh0.f37238d;
            }
            InterfaceC3735wu interfaceC3735wu3 = interfaceC3735wu;
            fc0 fc0Var3 = nj0.f52817l;
            int i15 = i13 != 0 ? Integer.MAX_VALUE : i;
            InterfaceC3624tu interfaceC3624tu3 = interfaceC3624tu;
            m18242a(e16Var3, interfaceC3624tu3, interfaceC3735wu3, i15, f93.f38666b, c0282a, tj3Var, (i14 & 57344) | (i14 & 14) | 1572864 | (i14 & 112) | (i14 & 896) | 3072 | 12779520);
            fc0Var2 = fc0Var3;
            i7 = i15;
            i8 = Integer.MAX_VALUE;
            interfaceC3735wu2 = interfaceC3735wu3;
            interfaceC3624tu2 = interfaceC3624tu3;
            e16Var2 = e16Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            interfaceC3624tu2 = interfaceC3624tu;
            interfaceC3735wu2 = interfaceC3735wu;
            fc0Var2 = fc0Var;
            i7 = i;
            i8 = i2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: y83
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC3423or.m18244b(e16Var2, interfaceC3624tu2, interfaceC3735wu2, fc0Var2, i7, i8, c0282a, (ye1) obj, pk9.m19383z(i3 | 1), i4);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final KSerializer m18245b0(w41 w41Var, Type type) {
        w41Var.getClass();
        type.getClass();
        KSerializer kSerializerM21623e0 = AbstractC3584sr.m21623e0(w41Var, type, true);
        if (kSerializerM21623e0 != null) {
            return kSerializerM21623e0;
        }
        Class clsM21617b0 = AbstractC3584sr.m21617b0(type);
        clsM21617b0.getClass();
        throw new SerializationException(eh0.m11108E(y38.m24933a(clsM21617b0)));
    }

    /* JADX INFO: renamed from: c */
    public static final void m18246c(int i, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var) {
        int i2;
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(905587209);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i4 = 0;
        boolean z = true;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new xa0(15, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC3369ne.m17396d((ui3) objM22097O, null, new ge2(i3, z, z), ci8.m4703P(1399402767, new ju6(ui3Var, vi3Var, i4), tj3Var), tj3Var, 3456, 2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(ui3Var, i, 22, vi3Var);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m18247c0(Context context, Bitmap bitmap, String str) {
        context.getClass();
        m18241Z(context, null, bitmap, "Goal Met " + ((Object) DateFormat.format("MM-dd-yyyy hh:mm:ss", new Date())), new sx7(6, context, str), 1);
    }

    /* JADX INFO: renamed from: d */
    public static final void m18248d(C2177b c2177b, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, ye1 ye1Var, int i) {
        final C2177b c2177b2;
        int i2;
        ui3Var.getClass();
        ui3Var2.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1685831712);
        int i3 = i | 2 | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var2) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024);
        int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2177b2 = (C2177b) pfa.m19114d(y38.m24933a(C2177b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2177b2 = c2177b;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2177b2.f27068l, tj3Var);
            ym5 ym5Var = ((bk5) t66VarM2513c.getValue()).f8638d;
            ym5Var.getClass();
            if (ym5Var instanceof xm5) {
                vi3Var.invoke(fi6.f39146a);
            }
            bk5 bk5Var = (bk5) t66VarM2513c.getValue();
            int i5 = i2 & 7168;
            boolean z = i5 == 2048;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new oa5(vi3Var, i4);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var3 = (ui3) objM22097O;
            boolean zM22124i = tj3Var.m22124i(c2177b2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new C3186kj(c2177b2, 14);
                tj3Var.m22131l0(objM22097O2);
            }
            zi3 zi3Var = (zi3) objM22097O2;
            boolean z2 = (i2 & 896) == 256;
            Object objM22097O3 = tj3Var.m22097O();
            if (z2 || objM22097O3 == p84Var) {
                objM22097O3 = new k92(13, ui3Var2);
                tj3Var.m22131l0(objM22097O3);
            }
            ui3 ui3Var4 = (ui3) objM22097O3;
            boolean z3 = (i2 & 112) == 32;
            Object objM22097O4 = tj3Var.m22097O();
            if (z3 || objM22097O4 == p84Var) {
                objM22097O4 = new k92(17, ui3Var);
                tj3Var.m22131l0(objM22097O4);
            }
            ui3 ui3Var5 = (ui3) objM22097O4;
            boolean zM22124i2 = tj3Var.m22124i(c2177b2);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O5 == p84Var) {
                objM22097O5 = new vi3() { // from class: com.lingq.feature.onboarding.auth.login.a
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        C2177b c2177b3 = c2177b2;
                        wfb.m23926u(lda.m16103C(c2177b3), null, null, new OnboardingLoginViewModel$recoverPassword$1(c2177b3, str, null), 3);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O5);
            }
            vi3 vi3Var2 = (vi3) objM22097O5;
            boolean z4 = i5 == 2048;
            Object objM22097O6 = tj3Var.m22097O();
            if (z4 || objM22097O6 == p84Var) {
                objM22097O6 = new oa5(vi3Var, 4);
                tj3Var.m22131l0(objM22097O6);
            }
            ui3 ui3Var6 = (ui3) objM22097O6;
            boolean zM22120g = (i5 == 2048) | tj3Var.m22120g(t66VarM2513c);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22120g || objM22097O7 == p84Var) {
                objM22097O7 = new C3006fm(25, vi3Var, t66VarM2513c);
                tj3Var.m22131l0(objM22097O7);
            }
            ui3 ui3Var7 = (ui3) objM22097O7;
            boolean zM22124i3 = tj3Var.m22124i(c2177b2);
            Object objM22097O8 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O8 == p84Var) {
                objM22097O8 = new C3757xf(c2177b2, 26);
                tj3Var.m22131l0(objM22097O8);
            }
            ui3 ui3Var8 = (ui3) objM22097O8;
            boolean z5 = i5 == 2048;
            Object objM22097O9 = tj3Var.m22097O();
            if (z5 || objM22097O9 == p84Var) {
                objM22097O9 = new kl3(vi3Var, 3);
                tj3Var.m22131l0(objM22097O9);
            }
            m18250e(bk5Var, ui3Var3, zi3Var, ui3Var4, ui3Var5, vi3Var2, ui3Var6, ui3Var7, ui3Var8, (vi3) objM22097O9, tj3Var, 0, 0);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
            c2177b2 = c2177b;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new au4(c2177b2, ui3Var, ui3Var2, vi3Var, i);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m18249d0(Context context, Uri uri, String str, String str2) {
        context.getClass();
        uri.getClass();
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", uri);
            if (!vk9.m23391n0(str2)) {
                intent.putExtra("android.intent.extra.TEXT", str2);
            }
            context.startActivity(Intent.createChooser(intent, str));
        } catch (Exception unused) {
            Toast.makeText(context, "Sharing failed", 0).show();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m18250e(final bk5 bk5Var, ui3 ui3Var, zi3 zi3Var, ui3 ui3Var2, ui3 ui3Var3, vi3 vi3Var, ui3 ui3Var4, ui3 ui3Var5, ui3 ui3Var6, vi3 vi3Var2, ye1 ye1Var, final int i, final int i2) {
        ui3 ui3Var7;
        int i3;
        zi3 zi3Var2;
        int i4;
        ui3 ui3Var8;
        int i5;
        ui3 ui3Var9;
        int i6;
        vi3 vi3Var3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final ui3 ui3Var10;
        final vi3 vi3Var4;
        final ui3 ui3Var11;
        final zi3 zi3Var3;
        final ui3 ui3Var12;
        final ui3 ui3Var13;
        final vi3 vi3Var5;
        final ui3 ui3Var14;
        final ui3 ui3Var15;
        zi3 zi3Var4;
        ui3 ui3Var16;
        ui3 ui3Var17;
        vi3 vi3Var6;
        ui3 ui3Var18;
        ui3 ui3Var19;
        ui3 ui3Var20;
        vi3 vi3Var7;
        int i12;
        ui3 ui3Var21;
        C0232g0 c0232g0;
        int i13;
        boolean z;
        String strM23620a0;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-829939846);
        int i14 = i | (tj3Var.m22124i(bk5Var) ? 4 : 2);
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 = i14 | 48;
            ui3Var7 = ui3Var;
        } else {
            ui3Var7 = ui3Var;
            i3 = i14 | (tj3Var.m22124i(ui3Var7) ? 32 : 16);
        }
        int i16 = i2 & 4;
        if (i16 != 0) {
            i4 = i3 | 384;
            zi3Var2 = zi3Var;
        } else {
            zi3Var2 = zi3Var;
            i4 = i3 | (tj3Var.m22124i(zi3Var2) ? 256 : 128);
        }
        int i17 = i2 & 8;
        if (i17 != 0) {
            i5 = i4 | 3072;
            ui3Var8 = ui3Var2;
        } else {
            ui3Var8 = ui3Var2;
            i5 = i4 | (tj3Var.m22124i(ui3Var8) ? 2048 : 1024);
        }
        int i18 = i2 & 16;
        if (i18 != 0) {
            i6 = i5 | 24576;
            ui3Var9 = ui3Var3;
        } else {
            ui3Var9 = ui3Var3;
            i6 = i5 | (tj3Var.m22124i(ui3Var9) ? 16384 : 8192);
        }
        int i19 = i2 & 32;
        if (i19 != 0) {
            i7 = i6 | 196608;
            vi3Var3 = vi3Var;
        } else {
            vi3Var3 = vi3Var;
            i7 = i6 | (tj3Var.m22124i(vi3Var3) ? 131072 : 65536);
        }
        int i20 = i2 & 64;
        if (i20 != 0) {
            i8 = i7 | 1572864;
        } else {
            i8 = i7 | (tj3Var.m22124i(ui3Var4) ? 1048576 : 524288);
        }
        int i21 = i8;
        int i22 = i2 & 128;
        if (i22 != 0) {
            i9 = i21 | 12582912;
        } else {
            i9 = i21 | (tj3Var.m22124i(ui3Var5) ? 8388608 : 4194304);
        }
        int i23 = i2 & 256;
        if (i23 != 0) {
            i10 = i9 | 100663296;
        } else {
            i10 = i9 | (tj3Var.m22124i(ui3Var6) ? 67108864 : 33554432);
        }
        int i24 = i2 & 512;
        if (i24 != 0) {
            i11 = i10 | 805306368;
        } else {
            i11 = i10 | (tj3Var.m22124i(vi3Var2) ? 536870912 : 268435456);
        }
        if (tj3Var.m22099R(i11 & 1, (i11 & 306783379) != 306783378)) {
            int i25 = 7;
            p84 p84Var = we1.f66679a;
            if (i15 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new C3288l7(i25);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var7 = (ui3) objM22097O;
            }
            if (i16 != 0) {
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new ln1(14);
                    tj3Var.m22131l0(objM22097O2);
                }
                zi3Var4 = (zi3) objM22097O2;
            } else {
                zi3Var4 = zi3Var2;
            }
            if (i17 != 0) {
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new C3288l7(i25);
                    tj3Var.m22131l0(objM22097O3);
                }
                ui3Var16 = (ui3) objM22097O3;
            } else {
                ui3Var16 = ui3Var8;
            }
            if (i18 != 0) {
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new C3288l7(i25);
                    tj3Var.m22131l0(objM22097O4);
                }
                ui3Var17 = (ui3) objM22097O4;
            } else {
                ui3Var17 = ui3Var9;
            }
            if (i19 != 0) {
                Object objM22097O5 = tj3Var.m22097O();
                if (objM22097O5 == p84Var) {
                    objM22097O5 = new vp6(2);
                    tj3Var.m22131l0(objM22097O5);
                }
                vi3Var6 = (vi3) objM22097O5;
            } else {
                vi3Var6 = vi3Var3;
            }
            if (i20 != 0) {
                Object objM22097O6 = tj3Var.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new C3288l7(i25);
                    tj3Var.m22131l0(objM22097O6);
                }
                ui3Var18 = (ui3) objM22097O6;
            } else {
                ui3Var18 = ui3Var4;
            }
            if (i22 != 0) {
                Object objM22097O7 = tj3Var.m22097O();
                if (objM22097O7 == p84Var) {
                    objM22097O7 = new C3288l7(i25);
                    tj3Var.m22131l0(objM22097O7);
                }
                ui3Var19 = (ui3) objM22097O7;
            } else {
                ui3Var19 = ui3Var5;
            }
            if (i23 != 0) {
                Object objM22097O8 = tj3Var.m22097O();
                if (objM22097O8 == p84Var) {
                    objM22097O8 = new C3288l7(i25);
                    tj3Var.m22131l0(objM22097O8);
                }
                ui3Var20 = (ui3) objM22097O8;
            } else {
                ui3Var20 = ui3Var6;
            }
            if (i24 != 0) {
                Object objM22097O9 = tj3Var.m22097O();
                if (objM22097O9 == p84Var) {
                    objM22097O9 = new vp6(3);
                    tj3Var.m22131l0(objM22097O9);
                }
                vi3Var7 = (vi3) objM22097O9;
            } else {
                vi3Var7 = vi3Var2;
            }
            final ld9 ld9Var = (ld9) tj3Var.m22128k(AbstractC0402n.f4826r);
            Object objM22097O10 = tj3Var.m22097O();
            if (objM22097O10 == p84Var) {
                objM22097O10 = new C0232g0();
                tj3Var.m22131l0(objM22097O10);
            }
            C0232g0 c0232g1 = (C0232g0) objM22097O10;
            Object objM22097O11 = tj3Var.m22097O();
            if (objM22097O11 == p84Var) {
                objM22097O11 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O11);
            }
            final t66 t66Var = (t66) objM22097O11;
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                i12 = 6;
                tj3Var.m22111b0(1389437791);
                Object objM22097O12 = tj3Var.m22097O();
                if (objM22097O12 == p84Var) {
                    objM22097O12 = new kb0(10, t66Var);
                    tj3Var.m22131l0(objM22097O12);
                }
                m18246c(((i11 >> 12) & 112) | 6, tj3Var, (ui3) objM22097O12, vi3Var6);
                tj3Var.m22139q(false);
            } else {
                zi3Var4 = zi3Var4;
                i12 = 6;
                tj3Var.m22111b0(1389538696);
                tj3Var.m22139q(false);
            }
            ym5 ym5Var = bk5Var.f8637c;
            int i26 = bk5Var.f8636b;
            ym5Var.getClass();
            if (ym5Var instanceof um5) {
                tj3Var.m22111b0(1389638981);
                yj5 yj5Var = (yj5) pk9.m19372j(bk5Var.f8637c, new vj5());
                if (yj5Var instanceof vj5) {
                    tj3Var.m22111b0(1389785983);
                    ym5 ym5Var2 = bk5Var.f8637c;
                    ui3Var21 = ui3Var16;
                    String strM24118n = wq1.m24118n("", vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.welcome_email_support), " support@lingq.com");
                    String strM23620a1 = vz1.m23620a0(tj3Var, R$string.ui_ok);
                    SnackbarDuration snackbarDuration = SnackbarDuration.Indefinite;
                    int i27 = i11 & 234881024;
                    boolean z2 = i27 == 67108864;
                    Object objM22097O13 = tj3Var.m22097O();
                    if (z2 || objM22097O13 == p84Var) {
                        objM22097O13 = new k92(i12, ui3Var20);
                        tj3Var.m22131l0(objM22097O13);
                    }
                    ui3 ui3Var22 = (ui3) objM22097O13;
                    boolean z3 = i27 == 67108864;
                    Object objM22097O14 = tj3Var.m22097O();
                    if (z3 || objM22097O14 == p84Var) {
                        objM22097O14 = new k92(7, ui3Var20);
                        tj3Var.m22131l0(objM22097O14);
                    }
                    AbstractC2174a.m9104a(c0232g1, ym5Var2, strM24118n, strM23620a1, snackbarDuration, ui3Var22, (ui3) objM22097O14, tj3Var, 24582);
                    c0232g0 = c0232g1;
                    z = false;
                    tj3Var.m22139q(false);
                } else {
                    c0232g0 = c0232g1;
                    ui3Var21 = ui3Var16;
                    if (yj5Var instanceof xj5) {
                        tj3Var.m22111b0(1390446748);
                        if (mu6.f51857a[((xj5) yj5Var).m24571a().ordinal()] == 1) {
                            tj3Var.m22111b0(1291782382);
                            strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.welcome_login_offline_error);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1291784971);
                            strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.feature.onboarding.R$string.welcome_error_logging_in);
                            tj3Var.m22139q(false);
                        }
                        ym5 ym5Var3 = bk5Var.f8637c;
                        String strM23620a2 = vz1.m23620a0(tj3Var, R$string.ui_ok);
                        SnackbarDuration snackbarDuration2 = SnackbarDuration.Indefinite;
                        int i28 = i11 & 234881024;
                        String str = strM23620a0;
                        boolean z4 = i28 == 67108864;
                        Object objM22097O15 = tj3Var.m22097O();
                        if (z4 || objM22097O15 == p84Var) {
                            objM22097O15 = new k92(8, ui3Var20);
                            tj3Var.m22131l0(objM22097O15);
                        }
                        ui3 ui3Var23 = (ui3) objM22097O15;
                        boolean z5 = i28 == 67108864;
                        Object objM22097O16 = tj3Var.m22097O();
                        if (z5 || objM22097O16 == p84Var) {
                            objM22097O16 = new k92(9, ui3Var20);
                            tj3Var.m22131l0(objM22097O16);
                        }
                        AbstractC2174a.m9104a(c0232g0, ym5Var3, str, strM23620a2, snackbarDuration2, ui3Var23, (ui3) objM22097O16, tj3Var, 24582);
                        c0232g0 = c0232g0;
                        z = false;
                        tj3Var.m22139q(false);
                    } else {
                        z = false;
                        tj3Var.m22111b0(1391250082);
                        tj3Var.m22139q(false);
                    }
                }
                tj3Var.m22139q(z);
            } else {
                ui3Var21 = ui3Var16;
                c0232g0 = c0232g1;
                tj3Var.m22111b0(1391333224);
                tj3Var.m22139q(false);
            }
            if (i26 != 0) {
                tj3Var.m22111b0(1391398696);
                Integer numValueOf = Integer.valueOf(i26);
                String strM23620a3 = vz1.m23620a0(tj3Var, i26);
                String strM23620a4 = vz1.m23620a0(tj3Var, R$string.ui_ok);
                SnackbarDuration snackbarDuration3 = SnackbarDuration.Indefinite;
                int i29 = i11 & 234881024;
                boolean z6 = i29 == 67108864;
                Object objM22097O17 = tj3Var.m22097O();
                if (z6 || objM22097O17 == p84Var) {
                    objM22097O17 = new k92(10, ui3Var20);
                    tj3Var.m22131l0(objM22097O17);
                }
                ui3 ui3Var24 = (ui3) objM22097O17;
                boolean z7 = i29 == 67108864;
                Object objM22097O18 = tj3Var.m22097O();
                if (z7 || objM22097O18 == p84Var) {
                    objM22097O18 = new k92(11, ui3Var20);
                    tj3Var.m22131l0(objM22097O18);
                }
                AbstractC2174a.m9104a(c0232g0, numValueOf, strM23620a3, strM23620a4, snackbarDuration3, ui3Var24, (ui3) objM22097O18, tj3Var, 24582);
                c0232g0 = c0232g0;
                i13 = 0;
                tj3Var.m22139q(false);
            } else {
                i13 = 0;
                tj3Var.m22111b0(1391859976);
                tj3Var.m22139q(false);
            }
            final ui3 ui3Var25 = ui3Var17;
            final ui3 ui3Var26 = ui3Var18;
            final ui3 ui3Var27 = ui3Var19;
            final vi3 vi3Var8 = vi3Var7;
            final zi3 zi3Var5 = zi3Var4;
            final ui3 ui3Var28 = ui3Var21;
            b34.m3232b(null, ci8.m4703P(-1849905858, new C3348mu(2, ui3Var7), tj3Var), null, ci8.m4703P(1094651328, new gu6(c0232g0, i13), tj3Var), null, 0, 0L, 0L, null, ci8.m4703P(-1369017143, new aj3() { // from class: hu6
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z8;
                    t17 t17Var = (t17) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t17Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                    }
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM21606S = AbstractC3584sr.m21606S(l70.m15962y(b16Var), t17Var);
                        gc0 gc0Var = nj0.f52808c;
                        ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21606S);
                        se1.f60731q.getClass();
                        ui3 ui3Var29 = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var29);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var6 = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var6, ht5VarM19966d);
                        zi3 zi3Var7 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        zi3 zi3Var8 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var8, numValueOf2);
                        vi3 vi3Var9 = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var9);
                        zi3 zi3Var9 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var9, e16VarM1322c);
                        e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                        C3587su c3587su = eh0.f37238d;
                        ec0 ec0Var = nj0.f52791J;
                        bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var2, 0);
                        int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m2 = tj3Var2.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4411d);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var29);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var6, bb1VarM230a);
                        oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var8, tj3Var2, vi3Var9);
                        oha.m18001g(tj3Var2, zi3Var9, e16VarM1322c2);
                        e16 e16VarM21610W = AbstractC3584sr.m21610W(c99.m4411d(b16Var, 1.0f), ge9.m12515a(tj3Var2).f38960i, ge9.m12515a(tj3Var2).f38963l, ge9.m12515a(tj3Var2).f38960i, ge9.m12515a(tj3Var2).f38963l);
                        bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var2, 0);
                        int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m3 = tj3Var2.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM21610W);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var29);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var6, bb1VarM230a2);
                        oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var8, tj3Var2, vi3Var9);
                        oha.m18001g(tj3Var2, zi3Var9, e16VarM1322c3);
                        bk5 bk5Var2 = bk5Var;
                        boolean zM22120g = tj3Var2.m22120g(bk5Var2.f8639e);
                        Object objM22097O19 = tj3Var2.m22097O();
                        p84 p84Var2 = we1.f66679a;
                        if (zM22120g || objM22097O19 == p84Var2) {
                            String str2 = bk5Var2.f8639e;
                            int length = str2.length();
                            objM22097O19 = AbstractC0278f.m1260j(new vv9(str2, 4, eh0.m11127g(length, length)));
                            tj3Var2.m22131l0(objM22097O19);
                        }
                        t66 t66Var2 = (t66) objM22097O19;
                        Object objM22097O20 = tj3Var2.m22097O();
                        if (objM22097O20 == p84Var2) {
                            objM22097O20 = AbstractC0278f.m1260j(new vv9((String) null, 7, 0L));
                            tj3Var2.m22131l0(objM22097O20);
                        }
                        t66 t66Var3 = (t66) objM22097O20;
                        Object objM22097O21 = tj3Var2.m22097O();
                        if (objM22097O21 == p84Var2) {
                            objM22097O21 = AbstractC0278f.m1260j(Boolean.FALSE);
                            tj3Var2.m22131l0(objM22097O21);
                        }
                        t66 t66Var4 = (t66) objM22097O21;
                        vv9 vv9Var = (vv9) t66Var2.getValue();
                        e16 e16VarM23624c0 = vz1.m23624c0(c99.m4412e(b16Var, 1.0f), "username_field");
                        boolean zM22120g2 = tj3Var2.m22120g(t66Var2);
                        Object objM22097O22 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O22 == p84Var2) {
                            objM22097O22 = new gb0(3, t66Var2);
                            tj3Var2.m22131l0(objM22097O22);
                        }
                        bna.m3940b(vv9Var, (vi3) objM22097O22, e16VarM23624c0, false, null, thb.f62307c, null, null, null, null, null, true, 0, 0, null, null, tj3Var2, 1573248, 12582912, 8257464);
                        thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38952a));
                        vv9 vv9Var2 = (vv9) t66Var3.getValue();
                        e16 e16VarM23624c1 = vz1.m23624c0(c99.m4412e(b16Var, 1.0f), "password_field");
                        hj4 hj4Var = new hj4(7, 0, null, 123);
                        boolean zM22120g3 = tj3Var2.m22120g(t66Var2);
                        zi3 zi3Var10 = zi3Var5;
                        boolean zM22120g4 = zM22120g3 | tj3Var2.m22120g(zi3Var10);
                        Object objM22097O23 = tj3Var2.m22097O();
                        if (zM22120g4 || objM22097O23 == p84Var2) {
                            objM22097O23 = new bb0(zi3Var10, t66Var2, t66Var3, 11);
                            tj3Var2.m22131l0(objM22097O23);
                        }
                        gj4 gj4Var = new gj4((vi3) objM22097O23, null, 62);
                        kwa c57Var = ((Boolean) t66Var4.getValue()).booleanValue() ? g9c.f40432f : new c57();
                        Object objM22097O24 = tj3Var2.m22097O();
                        if (objM22097O24 == p84Var2) {
                            objM22097O24 = new gb0(4, t66Var3);
                            tj3Var2.m22131l0(objM22097O24);
                        }
                        bna.m3940b(vv9Var2, (vi3) objM22097O24, e16VarM23624c1, false, null, thb.f62308d, null, ci8.m4703P(-1262243863, new C3186kj(t66Var4, 15), tj3Var2), c57Var, hj4Var, gj4Var, true, 0, 0, null, null, tj3Var2, 806879664, 12779520, 8142264);
                        e16 e16VarM23624c2 = vz1.m23624c0(ux5.m22984g(b16Var, ge9.m12515a(tj3Var2).f38956e, tj3Var2, b16Var, 1.0f), "login:button");
                        boolean z9 = ((vv9) t66Var2.getValue()).f65990a.f54604b.length() > 0 && ((vv9) t66Var3.getValue()).f65990a.f54604b.length() > 0;
                        ld9 ld9Var2 = ld9Var;
                        boolean zM22120g5 = tj3Var2.m22120g(ld9Var2) | tj3Var2.m22120g(zi3Var10) | tj3Var2.m22120g(t66Var2);
                        Object objM22097O25 = tj3Var2.m22097O();
                        if (zM22120g5 || objM22097O25 == p84Var2) {
                            objM22097O25 = new m44(ld9Var2, zi3Var10, t66Var2, t66Var3);
                            tj3Var2.m22131l0(objM22097O25);
                        }
                        ss5.m21710f(e16VarM23624c2, null, null, z9, (ui3) objM22097O25, thb.f62309e, tj3Var2, 196614, 6);
                        thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38955d));
                        ec0 ec0Var2 = nj0.f52792K;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(new gv3(ec0Var2), ge9.m12515a(tj3Var2).f38952a);
                        Object objM22097O26 = tj3Var2.m22097O();
                        if (objM22097O26 == p84Var2) {
                            objM22097O26 = new kb0(11, t66Var);
                            tj3Var2.m22131l0(objM22097O26);
                        }
                        lw9.m16554b(vz1.m23620a0(tj3Var2, com.lingq.feature.onboarding.R$string.welcome_forgot_password), AbstractC0080f.m815b(null, false, (ui3) objM22097O26, e16VarM21607T, 15), aa1.m198b(0.6f, p58.m18900f(tj3Var2).f55848d), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71410n, tj3Var2, 0, 0, 131064);
                        e16 e16VarM21607T2 = AbstractC3584sr.m21607T(new gv3(ec0Var2), ge9.m12515a(tj3Var2).f38952a);
                        ui3 ui3Var30 = ui3Var26;
                        boolean zM22120g6 = tj3Var2.m22120g(ui3Var30);
                        Object objM22097O27 = tj3Var2.m22097O();
                        if (zM22120g6 || objM22097O27 == p84Var2) {
                            objM22097O27 = new k92(14, ui3Var30);
                            tj3Var2.m22131l0(objM22097O27);
                        }
                        e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O27, e16VarM21607T2, 15);
                        String strM23620a5 = vz1.m23620a0(tj3Var2, com.lingq.feature.onboarding.R$string.login_long_password);
                        long jM4209b = cx2.m9917a(tj3Var2).m4209b();
                        vx9 vx9Var = p58.m18902j(tj3Var2).f71409m;
                        rt9 rt9Var = rt9.f59802c;
                        lw9.m16554b(strM23620a5, e16VarM815b, jM4209b, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, vx9.m23584b(vx9Var, 0L, 0L, null, null, null, 0L, rt9Var, null, 0, 0L, null, 16773119), tj3Var2, 0, 0, 130040);
                        e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var2).f38963l, tj3Var2, b16Var, 1.0f);
                        ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                        int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m4 = tj3Var2.m22132m();
                        e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarM22984g);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var29);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var6, ht5VarM19966d2);
                        oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m4);
                        AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var8, tj3Var2, vi3Var9);
                        oha.m18001g(tj3Var2, zi3Var9, e16VarM1322c4);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        gc0 gc0Var2 = nj0.f52812g;
                        ci0 ci0Var = ci0.f10109a;
                        pb1.m19031a(1.0f, 48, 4, 0L, tj3Var2, ci0Var.mo3727a(e16VarM4412e, gc0Var2));
                        String strM23620a6 = vz1.m23620a0(tj3Var2, R$string.onboarding_social_or);
                        long j = p58.m18900f(tj3Var2).f55858i;
                        e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, gc0Var2);
                        long j2 = p58.m18900f(tj3Var2).f55868n;
                        mv3 mv3Var = ss5.f61356d;
                        lw9.m16554b(strM23620a6, AbstractC3584sr.m21609V(d32.m10007D(e16VarMo3727a, j2, mv3Var), ge9.m12515a(tj3Var2).f38952a, 0.0f, 2), j, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71407k, tj3Var2, 0, 0, 130040);
                        tj3Var2.m22139q(true);
                        e16 e16VarM22984g2 = ux5.m22984g(b16Var, ge9.m12515a(tj3Var2).f38952a, tj3Var2, b16Var, 1.0f);
                        bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var2, tj3Var2, 48);
                        int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m5 = tj3Var2.m22132m();
                        e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, e16VarM22984g2);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var29);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var6, bb1VarM230a3);
                        oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m5);
                        AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var8, tj3Var2, vi3Var9);
                        oha.m18001g(tj3Var2, zi3Var9, e16VarM1322c5);
                        e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                        int i30 = com.lingq.feature.onboarding.R$string.onboarding_social_google;
                        int i31 = com.lingq.feature.onboarding.R$string.onboarding_social_facebook;
                        ui3 ui3Var31 = ui3Var28;
                        boolean zM22120g7 = tj3Var2.m22120g(ui3Var31);
                        Object objM22097O28 = tj3Var2.m22097O();
                        if (zM22120g7 || objM22097O28 == p84Var2) {
                            objM22097O28 = new k92(15, ui3Var31);
                            tj3Var2.m22131l0(objM22097O28);
                        }
                        ui3 ui3Var32 = (ui3) objM22097O28;
                        ui3 ui3Var33 = ui3Var25;
                        boolean zM22120g8 = tj3Var2.m22120g(ui3Var33);
                        Object objM22097O29 = tj3Var2.m22097O();
                        if (zM22120g8 || objM22097O29 == p84Var2) {
                            objM22097O29 = new k92(16, ui3Var33);
                            tj3Var2.m22131l0(objM22097O29);
                        }
                        AbstractC3352my.m17116e(e16VarM4412e2, i30, i31, ui3Var32, (ui3) objM22097O29, tj3Var2, 6);
                        tj3Var2.m22139q(true);
                        e16 e16VarMo3161g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var2).f38962k, tj3Var2, b16Var, 1.0f).mo3161g(new gv3(ec0Var2));
                        vi3 vi3Var10 = vi3Var8;
                        boolean zM22120g9 = tj3Var2.m22120g(vi3Var10);
                        Object objM22097O30 = tj3Var2.m22097O();
                        if (zM22120g9 || objM22097O30 == p84Var2) {
                            objM22097O30 = new oa5(vi3Var10, 3);
                            tj3Var2.m22131l0(objM22097O30);
                        }
                        ui3 ui3Var34 = (ui3) objM22097O30;
                        boolean zM22120g10 = tj3Var2.m22120g(vi3Var10);
                        Object objM22097O31 = tj3Var2.m22097O();
                        if (zM22120g10 || objM22097O31 == p84Var2) {
                            objM22097O31 = new oa5(vi3Var10, 2);
                            tj3Var2.m22131l0(objM22097O31);
                        }
                        te1.m21989c(e16VarMo3161g, ui3Var34, (ui3) objM22097O31, tj3Var2, 0);
                        tj3Var2.m22139q(true);
                        tj3Var2.m22139q(true);
                        e16 e16VarM21609V = AbstractC3584sr.m21609V(ci0Var.mo3727a(d32.m10007D(c99.m4412e(b16Var, 1.0f), p58.m18900f(tj3Var2).f55864l, mv3Var), nj0.f52815j), 0.0f, ge9.m12515a(tj3Var2).f38952a, 1);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37240f, nj0.f52817l, tj3Var2, 6);
                        int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m6 = tj3Var2.m22132m();
                        e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var29);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var6, sj8VarM20003a);
                        oha.m18001g(tj3Var2, zi3Var7, l77VarM22132m6);
                        AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var8, tj3Var2, vi3Var9);
                        oha.m18001g(tj3Var2, zi3Var9, e16VarM1322c6);
                        lw9.m16554b(ux5.m22990m(vz1.m23620a0(tj3Var2, com.lingq.feature.onboarding.R$string.welcome_first_visit), " "), null, 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var2).f71409m, 0L, 0L, bc3.f8321g, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var2, 0, 0, 130046);
                        String strM23620a7 = vz1.m23620a0(tj3Var2, com.lingq.feature.onboarding.R$string.welcome_sign_up_button);
                        vx9 vx9VarM23584b = vx9.m23584b(p58.m18902j(tj3Var2).f71409m, 0L, 0L, null, null, null, 0L, rt9Var, null, 0, 0L, null, 16773119);
                        ui3 ui3Var35 = ui3Var27;
                        boolean zM22120g11 = tj3Var2.m22120g(ui3Var35);
                        Object objM22097O32 = tj3Var2.m22097O();
                        if (zM22120g11 || objM22097O32 == p84Var2) {
                            objM22097O32 = new k92(12, ui3Var35);
                            tj3Var2.m22131l0(objM22097O32);
                        }
                        lw9.m16554b(strM23620a7, AbstractC0080f.m815b(null, false, (ui3) objM22097O32, b16Var, 15), 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, vx9VarM23584b, tj3Var2, 0, 0, 130044);
                        tj3 tj3Var3 = tj3Var2;
                        tj3Var3.m22139q(true);
                        if (bk5Var2.f8635a) {
                            tj3Var3.m22111b0(221414460);
                            e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), aa1.m198b(0.5f, p58.m18900f(tj3Var3).f55868n), mv3Var);
                            ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                            int iHashCode7 = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m7 = tj3Var3.m22132m();
                            e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var3, e16VarM10007D);
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var29);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, zi3Var6, ht5VarM19966d3);
                            oha.m18001g(tj3Var3, zi3Var7, l77VarM22132m7);
                            AbstractC3393o1.m17747v(iHashCode7, tj3Var3, zi3Var8, tj3Var3, vi3Var9);
                            oha.m18001g(tj3Var3, zi3Var9, e16VarM1322c7);
                            dn7.m10492a(ci0Var.mo3727a(b16Var, gc0Var2), p58.m18900f(tj3Var3).f55860j, 0.0f, 0L, 0, 0.0f, tj3Var3, 0, 60);
                            tj3Var3 = tj3Var3;
                            z8 = true;
                            tj3Var3.m22139q(true);
                            tj3Var3.m22139q(false);
                        } else {
                            z8 = true;
                            tj3Var3.m22111b0(221847871);
                            tj3Var3.m22139q(false);
                        }
                        tj3Var3.m22139q(z8);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 805309488, 501);
            vi3 vi3Var9 = vi3Var6;
            ui3Var15 = ui3Var20;
            zi3Var3 = zi3Var5;
            vi3Var5 = vi3Var9;
            ui3Var12 = ui3Var28;
            ui3Var14 = ui3Var18;
            vi3Var4 = vi3Var8;
            ui3Var11 = ui3Var7;
            ui3Var13 = ui3Var17;
            ui3Var10 = ui3Var19;
        } else {
            tj3Var.m22102U();
            ui3Var10 = ui3Var5;
            vi3Var4 = vi3Var2;
            ui3Var11 = ui3Var7;
            zi3Var3 = zi3Var2;
            ui3Var12 = ui3Var8;
            ui3Var13 = ui3Var9;
            vi3Var5 = vi3Var3;
            ui3Var14 = ui3Var4;
            ui3Var15 = ui3Var6;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(ui3Var11, zi3Var3, ui3Var12, ui3Var13, vi3Var5, ui3Var14, ui3Var10, ui3Var15, vi3Var4, i, i2) { // from class: iu6

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ui3 f44574b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ zi3 f44575c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ui3 f44576d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ui3 f44577e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ vi3 f44578f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ ui3 f44579g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ui3 f44580h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ ui3 f44581i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ vi3 f44582j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ int f44583k;

                {
                    this.f44583k = i2;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC3423or.m18250e(this.f44573a, this.f44574b, this.f44575c, this.f44576d, this.f44577e, this.f44578f, this.f44579g, this.f44580h, this.f44581i, this.f44582j, (ye1) obj, iM19383z, this.f44583k);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final boolean m18251e0(String str) {
        str.getClass();
        return !AbstractC3489q9.m19788r(LanguageLearn.Arabic.getCode(), LanguageLearn.Belarusian.getCode(), LanguageLearn.Bulgarian.getCode(), LanguageLearn.Catalan.getCode(), LanguageLearn.Croatian.getCode(), LanguageLearn.Czech.getCode(), LanguageLearn.Danish.getCode(), LanguageLearn.Esperanto.getCode(), LanguageLearn.Finnish.getCode(), LanguageLearn.Hebrew.getCode(), LanguageLearn.Hungarian.getCode(), LanguageLearn.Indonesian.getCode(), LanguageLearn.Latin.getCode(), LanguageLearn.Malay.getCode(), LanguageLearn.Norwegian.getCode(), LanguageLearn.Farsi.getCode(), LanguageLearn.Serbian.getCode(), LanguageLearn.Slovak.getCode(), LanguageLearn.Turkish.getCode(), LanguageLearn.Greek.getCode(), LanguageLearn.Gujarati.getCode(), LanguageLearn.Afrikaans.getCode(), LanguageLearn.Georgian.getCode(), LanguageLearn.Slovenian.getCode(), LanguageLearn.Macedonian.getCode(), LanguageLearn.Hindi.getCode(), LanguageLearn.Punjabi.getCode(), LanguageLearn.Urdu.getCode()).contains(str);
    }

    /* JADX INFO: renamed from: f */
    public static final String m18252f(LibraryTab libraryTab) {
        Object next;
        libraryTab.getClass();
        String str = libraryTab.f19506f;
        if (vk9.m23380c0(str, "accent", false)) {
            Iterator it = vk9.m23365A0(str, new String[]{"&"}, 0, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!vk9.m23380c0((String) next, "accent", false));
            String str2 = (String) next;
            if (str2 != null) {
                return (String) u91.m22597O0(vk9.m23365A0(str2, new String[]{"="}, 0, 6));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public static final int m18253f0(Accent accent, String str) {
        accent.getClass();
        str.getClass();
        if (str.equals(LanguageLearn.Arabic.getCode())) {
            int i = n78.f52448d[accent.ordinal()];
            if (i == 1) {
                return R$string.feed_topics_standard_arabic;
            }
            if (i == 2) {
                return R$string.feed_topics_egyptian_arabic;
            }
            if (i != 3) {
                return -1;
            }
            return R$string.feed_topics_levantine_arabic;
        }
        if (str.equals(LanguageLearn.Farsi.getCode())) {
            int i2 = n78.f52448d[accent.ordinal()];
            if (i2 == 4) {
                return R$string.feed_topics_formal_persian;
            }
            if (i2 != 5) {
                return -1;
            }
            return R$string.feed_topics_spoken_persian;
        }
        if (str.equals(LanguageLearn.Portuguese.getCode())) {
            int i3 = n78.f52448d[accent.ordinal()];
            if (i3 == 6) {
                return R$string.feed_topics_european_portuguese;
            }
            if (i3 != 7) {
                return -1;
            }
            return R$string.feed_topics_brazilian_portuguese;
        }
        if (str.equals(LanguageLearn.Spanish.getCode())) {
            int i4 = n78.f52448d[accent.ordinal()];
            if (i4 == 8) {
                return R$string.feed_topics_european_spanish;
            }
            if (i4 != 9) {
                return -1;
            }
            return R$string.feed_topics_latin_american_spanish;
        }
        if (str.equals(LanguageLearn.English.getCode())) {
            switch (n78.f52448d[accent.ordinal()]) {
                case 10:
                    return R$string.feed_topics_english_american;
                case 11:
                    return R$string.feed_topics_english_british;
                case 12:
                    return R$string.feed_topics_english_canadian;
                default:
                    return -1;
            }
        }
        if (!str.equals(LanguageLearn.French.getCode())) {
            return -1;
        }
        int i5 = n78.f52448d[accent.ordinal()];
        if (i5 == 13) {
            return R$string.feed_topics_french_france;
        }
        if (i5 != 14) {
            return -1;
        }
        return R$string.feed_topics_french_canadian;
    }

    /* JADX INFO: renamed from: g */
    public static final int m18254g(int i, x66 x66Var) {
        int i2 = x66Var.f67832c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = x66Var.f67830a;
            int i5 = ((x94) objArr[i4]).f67972a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((x94) objArr[i3]).f67972a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: g0 */
    public static final int m18255g0(Sort sort) {
        sort.getClass();
        switch (n78.f52449e[sort.ordinal()]) {
            case 1:
                return R$string.sort_original;
            case 2:
                return R$string.sort_relevance;
            case 3:
                return R$string.card_sort_alpha;
            case 4:
                return R$string.sort_completed;
            case 5:
                return R$string.sort_not_completed;
            case 6:
                return R$string.sort_newest;
            case 7:
                return R$string.sort_oldest;
            case 8:
                return R$string.sort_opened;
            case 9:
                return R$string.sort_last_imported;
            case 10:
                return R$string.sort_likes;
            case 11:
                return R$string.sort_opened;
            case 12:
                return R$string.sort_new_words_percentage;
            default:
                gm5.m12750e();
                return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final e28 m18256h(AbstractC0343j abstractC0343j, int i, n9a n9aVar, rw9 rw9Var, boolean z, int i2) {
        e28 e28VarM20956c = rw9Var != null ? rw9Var.m20956c(n9aVar.f52523b.mo13411t(i)) : e28.f36619e;
        float f = e28VarM20956c.f36620a;
        int iMo916w0 = abstractC0343j.mo916w0(2.0f);
        return new e28(z ? (i2 - f) - iMo916w0 : f, e28VarM20956c.f36621b, z ? i2 - f : iMo916w0 + f, e28VarM20956c.f36623d);
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m18257h0(JapaneseScript japaneseScript) {
        japaneseScript.getClass();
        int i = n78.f52461q[japaneseScript.ordinal()];
        if (i == 1) {
            return R$string.settings_asian_furigana;
        }
        if (i == 2) {
            return R$string.settings_asian_hiragana;
        }
        if (i == 3) {
            return R$string.settings_asian_no_transliteration;
        }
        if (i == 4) {
            return R$string.settings_asian_romaji;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static final void m18258i(C0797b4 c0797b4, C0423c c0423c) {
        kv8 kv8Var = c0423c.f4974d;
        uh8 uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5019z);
        if (AbstractC3584sr.m21637o(c0423c)) {
            if (uh8Var != null && uh8Var.f63934a == 8) {
                return;
            }
            C3024g3 c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4969y);
            if (c3024g3 != null) {
                c0797b4.m3272b(new C3671v3(R.id.accessibilityActionPageUp, c3024g3.f40090a));
            }
            C3024g3 c3024g4 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
            if (c3024g4 != null) {
                c0797b4.m3272b(new C3671v3(R.id.accessibilityActionPageDown, c3024g4.f40090a));
            }
            C3024g3 c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4970z);
            if (c3024g5 != null) {
                c0797b4.m3272b(new C3671v3(R.id.accessibilityActionPageLeft, c3024g5.f40090a));
            }
            C3024g3 c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4943B);
            if (c3024g6 != null) {
                c0797b4.m3272b(new C3671v3(R.id.accessibilityActionPageRight, c3024g6.f40090a));
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final int m18259i0(LqTheme lqTheme) {
        lqTheme.getClass();
        int i = n78.f52457m[lqTheme.ordinal()];
        if (i == 1) {
            return R$string.settings_light_theme;
        }
        if (i == 2) {
            return R$string.settings_dark_theme;
        }
        if (i == 3) {
            return R$string.settings_system_theme;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static final int m18260j(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m18261j0(TextHighlightStyle textHighlightStyle) {
        textHighlightStyle.getClass();
        int i = n78.f52456l[textHighlightStyle.ordinal()];
        if (i == 1) {
            return R$string.settings_highlight_default;
        }
        if (i == 2) {
            return R$string.settings_highlight_foreground;
        }
        if (i == 3) {
            return R$string.settings_highlight_underlined;
        }
        if (i == 4) {
            return R$string.settings_asian_no_transliteration;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static final int m18262k(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX INFO: renamed from: k0 */
    public static final s31 m18263k0(C3419on c3419on) {
        List list = c3419on.f54605c;
        EmptyList emptyList = EmptyList.f47638a;
        List list2 = list == null ? emptyList : list;
        CharSequence charSequence = c3419on.f54604b;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            h32 h32Var = new h32();
            h32Var.f41744a = Parcel.obtain();
            if (list == null) {
                list = emptyList;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                C3378nn c3378nn = (C3378nn) list.get(i);
                he9 he9Var = (he9) c3378nn.f52979a;
                int i2 = c3378nn.f52980b;
                int i3 = c3378nn.f52981c;
                h32Var.f41744a.recycle();
                h32Var.f41744a = Parcel.obtain();
                xv9 xv9Var = he9Var.f42264a;
                long j = he9Var.f42275l;
                long j2 = he9Var.f42271h;
                int i4 = i;
                long j3 = he9Var.f42265b;
                List list3 = list;
                int i5 = size;
                long jMo24173a = xv9Var.mo24173a();
                long j4 = aa1.f412k;
                if (!aa1.m199c(jMo24173a, j4)) {
                    h32Var.m13019c((byte) 1);
                    h32Var.f41744a.writeLong(he9Var.f42264a.mo24173a());
                }
                long j5 = zx9.f72359c;
                byte b = 2;
                if (!zx9.m25846a(j3, j5)) {
                    h32Var.m13019c((byte) 2);
                    h32Var.m13021e(j3);
                }
                bc3 bc3Var = he9Var.f42266c;
                if (bc3Var != null) {
                    h32Var.m13019c((byte) 3);
                    h32Var.f41744a.writeInt(bc3Var.f8327a);
                }
                wb3 wb3Var = he9Var.f42267d;
                if (wb3Var != null) {
                    int i6 = wb3Var.f66583a;
                    h32Var.m13019c((byte) 4);
                    h32Var.m13019c((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                xb3 xb3Var = he9Var.f42268e;
                if (xb3Var != null) {
                    int i7 = xb3Var.f68021a;
                    h32Var.m13019c((byte) 5);
                    if (i7 == 0) {
                        b = 0;
                    } else if (i7 == 65535) {
                        b = 1;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    h32Var.m13019c(b);
                }
                String str = he9Var.f42270g;
                if (str != null) {
                    h32Var.m13019c((byte) 6);
                    h32Var.f41744a.writeString(str);
                }
                if (!zx9.m25846a(j2, j5)) {
                    h32Var.m13019c((byte) 7);
                    h32Var.m13021e(j2);
                }
                oa0 oa0Var = he9Var.f42272i;
                if (oa0Var != null) {
                    float f = oa0Var.f54096a;
                    h32Var.m13019c((byte) 8);
                    h32Var.m13020d(f);
                }
                yv9 yv9Var = he9Var.f42273j;
                if (yv9Var != null) {
                    h32Var.m13019c((byte) 9);
                    h32Var.m13020d(yv9Var.f70560a);
                    h32Var.m13020d(yv9Var.f70561b);
                }
                if (!aa1.m199c(j, j4)) {
                    h32Var.m13019c((byte) 10);
                    h32Var.f41744a.writeLong(j);
                }
                rt9 rt9Var = he9Var.f42276m;
                if (rt9Var != null) {
                    h32Var.m13019c((byte) 11);
                    h32Var.f41744a.writeInt(rt9Var.f59804a);
                }
                l39 l39Var = he9Var.f42277n;
                if (l39Var != null) {
                    h32Var.m13019c((byte) 12);
                    h32Var.f41744a.writeLong(l39Var.f48993a);
                    long j6 = l39Var.f48994b;
                    h32Var.m13020d(Float.intBitsToFloat((int) (j6 >> 32)));
                    h32Var.m13020d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    h32Var.m13020d(l39Var.f48995c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(h32Var.f41744a.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i5;
            }
            charSequence = spannableString;
        }
        return new s31(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX INFO: renamed from: l */
    public static void m18264l(wj1 wj1Var, gd5 gd5Var, vj1 vj1Var) {
        vj1Var.f65486o = -1;
        bj1 bj1Var = vj1Var.f65444M;
        bj1 bj1Var2 = vj1Var.f65443L;
        bj1 bj1Var3 = vj1Var.f65441J;
        bj1 bj1Var4 = vj1Var.f65442K;
        bj1 bj1Var5 = vj1Var.f65440I;
        vj1Var.f65488p = -1;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = wj1Var.f65451T[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
        if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 && vj1Var.f65451T[0] == ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
            int i = bj1Var5.f8583g;
            int iM23326r = wj1Var.m23326r() - bj1Var4.f8583g;
            bj1Var5.f8585i = gd5Var.m12495k(bj1Var5);
            bj1Var4.f8585i = gd5Var.m12495k(bj1Var4);
            gd5Var.m12488d(bj1Var5.f8585i, i);
            gd5Var.m12488d(bj1Var4.f8585i, iM23326r);
            vj1Var.f65486o = 2;
            vj1Var.f65457Z = i;
            int i2 = iM23326r - i;
            vj1Var.f65453V = i2;
            int i3 = vj1Var.f65463c0;
            if (i2 < i3) {
                vj1Var.f65453V = i3;
            }
        }
        if (wj1Var.f65451T[1] == constraintWidget$DimensionBehaviour2 || vj1Var.f65451T[1] != ConstraintWidget$DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i4 = bj1Var3.f8583g;
        int iM23322l = wj1Var.m23322l() - bj1Var2.f8583g;
        bj1Var3.f8585i = gd5Var.m12495k(bj1Var3);
        bj1Var2.f8585i = gd5Var.m12495k(bj1Var2);
        gd5Var.m12488d(bj1Var3.f8585i, i4);
        gd5Var.m12488d(bj1Var2.f8585i, iM23322l);
        if (vj1Var.f65461b0 > 0 || vj1Var.f65473h0 == 8) {
            rd9 rd9VarM12495k = gd5Var.m12495k(bj1Var);
            bj1Var.f8585i = rd9VarM12495k;
            gd5Var.m12488d(rd9VarM12495k, vj1Var.f65461b0 + i4);
        }
        vj1Var.f65488p = 2;
        vj1Var.f65459a0 = i4;
        int i5 = iM23322l - i4;
        vj1Var.f65454W = i5;
        int i6 = vj1Var.f65465d0;
        if (i5 < i6) {
            vj1Var.f65454W = i6;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final Language m18265l0(LanguageContextEntity languageContextEntity) {
        String str;
        String str2;
        languageContextEntity.getClass();
        String str3 = languageContextEntity.f17149a;
        int i = languageContextEntity.f17150b;
        String str4 = languageContextEntity.f17151c;
        List list = languageContextEntity.f17160l;
        Boolean bool = languageContextEntity.f17161m;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        String str5 = languageContextEntity.f17162n;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = languageContextEntity.f17163o;
        Integer num = languageContextEntity.f17164p;
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z = zBooleanValue;
        String str7 = str5;
        String str8 = languageContextEntity.f17165q;
        int i2 = iIntValue;
        String str9 = languageContextEntity.f17157i;
        Integer num2 = languageContextEntity.f17158j;
        int i3 = languageContextEntity.f17159k;
        int i4 = languageContextEntity.f17152d;
        LanguageContextNotification languageContextNotification = languageContextEntity.f17154f;
        String str10 = (languageContextNotification == null || (str2 = languageContextNotification.f19044a) == null) ? "" : str2;
        LanguageContextNotification languageContextNotification2 = languageContextEntity.f17155g;
        if (languageContextNotification2 == null || (str = languageContextNotification2.f19044a) == null) {
            str = "";
        }
        return new Language(str3, i, str4, list, z, str7, str6, i2, str8, str9, num2, i3, i4, str10, str, languageContextEntity.f17166r, languageContextEntity.f17153e, languageContextEntity.f17167s);
    }

    /* JADX INFO: renamed from: m */
    public static byte[] m18266m(String str) {
        if (str.length() % 2 != 0) {
            C3386nv.m17626m("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                C3386nv.m17626m("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: m0 */
    public static final LessonInfo m18267m0(u85 u85Var) {
        u85Var.getClass();
        int i = u85Var.f63562a;
        String str = u85Var.f63564c;
        if (str == null) {
            str = "";
        }
        String str2 = u85Var.f63565d;
        String str3 = str;
        String str4 = u85Var.f63571j;
        String str5 = u85Var.f63551M;
        String str6 = u85Var.f63545G;
        Integer num = u85Var.f63539A;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = u85Var.f63540B;
        return new LessonInfo(i, str3, str2, str4, str5, str6, iIntValue, num2 != null ? num2.intValue() : 0, u85Var.f63541C, Boolean.valueOf(u85Var.f63554P), u85Var.f63587z, u85Var.f63582u, u85Var.f63586y, u85Var.f63572k, u85Var.f63573l, u85Var.f63574m, u85Var.f63575n, u85Var.f63576o, u85Var.f63577p, u85Var.f63578q, u85Var.f63579r, u85Var.f63580s, u85Var.f63544F, u85Var.f63549K, u85Var.f63567f, u85Var.f63581t, u85Var.f63568g, u85Var.f63569h, u85Var.f63570i, u85Var.f63585x, u85Var.f63556R, u85Var.f63557S, u85Var.f63548J);
    }

    /* JADX INFO: renamed from: n */
    public static final LibraryTab m18268n(LibraryShelf libraryShelf) {
        Object next;
        libraryShelf.getClass();
        List list = libraryShelf.f19495c;
        Object objM22589G0 = u91.m22589G0(list);
        Object obj = null;
        if (fa4.m11650l(libraryShelf.f19496d, LibraryShelfType.LanguageYoutubers.getValue())) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fa4.m11650l(((LibraryTab) next).f19502b, LibraryContentType.Courses.getValue()));
            LibraryTab libraryTab = (LibraryTab) next;
            if (libraryTab != null) {
                objM22589G0 = libraryTab;
            }
        }
        for (Object obj2 : list) {
            if (((LibraryTab) obj2).f19504d) {
                obj = obj2;
                break;
            }
        }
        LibraryTab libraryTab2 = (LibraryTab) obj;
        return libraryTab2 == null ? (LibraryTab) objM22589G0 : libraryTab2;
    }

    /* JADX INFO: renamed from: n0 */
    public static final LessonInfo m18269n0(LessonEntity lessonEntity) {
        lessonEntity.getClass();
        int iM7711r = lessonEntity.m7711r();
        String strM7710q0 = lessonEntity.m7710q0();
        if (strM7710q0 == null) {
            strM7710q0 = "";
        }
        return new LessonInfo(iM7711r, strM7710q0, lessonEntity.m7699l(), lessonEntity.m7713s(), lessonEntity.m7685e(), lessonEntity.m7706o0(), lessonEntity.m7703n(), lessonEntity.m7695j(), lessonEntity.m7697k(), lessonEntity.m7669R(), lessonEntity.m7661J(), Boolean.valueOf(lessonEntity.m7646B0()), lessonEntity.m7649D(), lessonEntity.m7651E(), Integer.valueOf(lessonEntity.m7728z0()), Integer.valueOf(lessonEntity.m7720v0()), lessonEntity.m7684d0(), lessonEntity.m7657H(), lessonEntity.m7691h(), Boolean.valueOf(lessonEntity.m7656G0()), lessonEntity.m7709q(), Integer.valueOf(lessonEntity.m7655G()), lessonEntity.m7675X(), lessonEntity.m7677Z(), lessonEntity.m7674W(), lessonEntity.m7664M(), lessonEntity.m7676Y(), lessonEntity.m7686e0(), lessonEntity.m7690g0(), lessonEntity.m7688f0(), lessonEntity.m7692h0(), Boolean.valueOf(lessonEntity.m7658H0()), lessonEntity.m7708p0(), lessonEntity.m7723x(), lessonEntity.m7722w0(), lessonEntity.m7645B(), lessonEntity.m7702m0(), lessonEntity.m7700l0(), lessonEntity.m7704n0(), lessonEntity.m7670S(), lessonEntity.m7665N(), lessonEntity.m7724x0(), lessonEntity.m7650D0(), lessonEntity.m7698k0(), lessonEntity.m7696j0(), lessonEntity.m7660I0());
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m18270o(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: o0 */
    public static final u45 m18271o0(u85 u85Var) {
        u85Var.getClass();
        int i = u85Var.f63562a;
        String str = u85Var.f63564c;
        if (str == null) {
            str = "";
        }
        return new u45(i, 128, str, u85Var.f63571j, u85Var.f63541C, u85Var.f63556R, u85Var.f63551M, u85Var.f63570i);
    }

    /* JADX INFO: renamed from: p */
    public static String m18272p(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p0 */
    public static final LibraryItem m18273p0(u85 u85Var) {
        u85Var.getClass();
        return new LibraryItem(u85Var.f63562a, u85Var.f63563b, u85Var.f63567f, Integer.valueOf(u85Var.f63566e), u85Var.f63564c, u85Var.f63565d, u85Var.f63545G, u85Var.f63571j, u85Var.f63539A, null, null, Integer.valueOf(u85Var.f63587z), u85Var.f63540B, u85Var.f63541C, Double.valueOf(u85Var.f63553O), Double.valueOf(u85Var.f63552N), Boolean.valueOf(u85Var.f63554P), u85Var.f63568g, u85Var.f63569h, u85Var.f63570i, Integer.valueOf(u85Var.f63582u), Integer.valueOf(u85Var.f63586y), null, null, null, Boolean.valueOf(u85Var.f63555Q), u85Var.f63581t, null, null, null, null, null, u85Var.f63572k, u85Var.f63573l, u85Var.f63574m, u85Var.f63575n, u85Var.f63576o, u85Var.f63577p, u85Var.f63578q, u85Var.f63579r, u85Var.f63580s, u85Var.f63561W, u85Var.f63542D, u85Var.f63547I, u85Var.f63548J, Integer.valueOf(u85Var.f63583v), Boolean.valueOf(u85Var.f63543E), u85Var.f63544F, u85Var.f63585x, u85Var.f63556R, u85Var.f63551M, u85Var.f63557S, u85Var.f63558T, u85Var.f63559U, -104856064, 16384);
    }

    /* JADX INFO: renamed from: q */
    public static final float m18274q(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: q0 */
    public static final v0b m18275q0(CardEntity cardEntity) {
        LessonTransliteration lessonTransliteration;
        cardEntity.getClass();
        int iM7531l = cardEntity.m7531l();
        String strM7544y = cardEntity.m7544y();
        int iM7542w = cardEntity.m7542w();
        boolean zM7520C = cardEntity.m7520C();
        List listM7537r = cardEntity.m7537r();
        if (cardEntity.m7530k() == null && cardEntity.m7540u() == null && cardEntity.m7539t() == null && cardEntity.m7529j() == null && cardEntity.m7528i() == null && cardEntity.m7533n() == null && cardEntity.m7525f() == null && cardEntity.m7535p() == null) {
            lessonTransliteration = null;
        } else {
            lessonTransliteration = new LessonTransliteration(cardEntity.m7530k(), cardEntity.m7540u(), cardEntity.m7539t(), cardEntity.m7529j(), cardEntity.m7528i(), cardEntity.m7533n(), (cardEntity.m7525f() == null && cardEntity.m7526g() == null) ? null : new LessonFurigana(cardEntity.m7525f(), cardEntity.m7526g()), cardEntity.m7535p());
        }
        return new v0b(iM7531l, strM7544y, iM7542w, zM7520C, listM7537r, lessonTransliteration, cardEntity.m7541v(), cardEntity.m7543x(), cardEntity.m7527h());
    }

    /* JADX INFO: renamed from: r */
    public static long m18276r(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    dk1.m10434l(i6);
                    C3386nv.m17631r();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return dk1.m10423a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: r0 */
    public static Set m18277r0(qr3 qr3Var) {
        int size = qr3Var.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(qr3Var.m20122f(i))) {
                String strM20124h = qr3Var.m20124h(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = vk9.m23366B0(strM20124h, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(vk9.m23376L0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? EmptySet.f47640a : treeSet;
    }

    /* JADX INFO: renamed from: s */
    public static long m18278s(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    dk1.m10434l(i6);
                    C3386nv.m17631r();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return dk1.m10423a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: s0 */
    public static final e16 m18279s0(e16 e16Var, IntrinsicSize intrinsicSize) {
        return e16Var.mo3161g(new ca4(intrinsicSize, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: t */
    public static final List m18280t(String str) {
        str.getClass();
        if (str.equals(LanguageLearn.Arabic.getCode())) {
            return vz1.m23605K(Accent.Standard, Accent.Egyptian, Accent.Levantine);
        }
        if (str.equals(LanguageLearn.Farsi.getCode())) {
            return vz1.m23605K(Accent.Formal, Accent.Spoken);
        }
        if (str.equals(LanguageLearn.Portuguese.getCode())) {
            return vz1.m23605K(Accent.European, Accent.Brazilian);
        }
        if (str.equals(LanguageLearn.Spanish.getCode())) {
            return vz1.m23605K(Accent.EuropeanSpanish, Accent.LatinAmerican);
        }
        if (str.equals(LanguageLearn.English.getCode())) {
            return vz1.m23605K(Accent.American, Accent.British);
        }
        return str.equals(LanguageLearn.French.getCode()) ? vz1.m23605K(Accent.France, Accent.CanadianFrench) : EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: u */
    public static final p04 m18281u() {
        p04 p04Var = f54774l;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(20.0f, 11.0f);
        f57Var.m11549d(7.83f);
        f57Var.m11552g(5.59f, -5.59f);
        f57Var.m11551f(12.0f, 4.0f);
        f57Var.m11552g(-8.0f, 8.0f);
        f57Var.m11552g(8.0f, 8.0f);
        f57Var.m11552g(1.41f, -1.41f);
        f57Var.m11551f(7.83f, 13.0f);
        f57Var.m11549d(20.0f);
        f57Var.m11557l(-2.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f54774l = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: v */
    public static final int m18282v(Context context, String str) {
        context.getClass();
        str.getClass();
        int identifier = context.getResources().getIdentifier(AbstractC3352my.m17091J(str), "drawable", context.getPackageName());
        return identifier != 0 ? identifier : R$drawable.ic_none;
    }

    /* JADX INFO: renamed from: w */
    public static String m18283w(Class cls) {
        LinkedHashMap linkedHashMap = lj6.f49741b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            jj6 jj6Var = (jj6) cls.getAnnotation(jj6.class);
            strValue = jj6Var != null ? jj6Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                C3386nv.m17624j("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m18284x(String str) {
        str.getClass();
        return AbstractC3489q9.m19788r(LanguageLearn.Arabic.getCode(), LanguageLearn.Farsi.getCode(), LanguageLearn.Portuguese.getCode(), LanguageLearn.Spanish.getCode(), LanguageLearn.English.getCode(), LanguageLearn.French.getCode()).contains(str);
    }

    /* JADX INFO: renamed from: y */
    public static final e16 m18285y(e16 e16Var, IntrinsicSize intrinsicSize) {
        return e16Var.mo3161g(new y94(intrinsicSize, true, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: z */
    public static final String m18286z(LibraryTab libraryTab) {
        Object next;
        libraryTab.getClass();
        String str = libraryTab.f19506f;
        if (vk9.m23380c0(str, "isPending", false)) {
            Iterator it = vk9.m23365A0(str, new String[]{"&"}, 0, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!vk9.m23380c0((String) next, "isPending", false));
            String str2 = (String) next;
            if (str2 != null) {
                return (String) u91.m22597O0(vk9.m23365A0(str2, new String[]{"="}, 0, 6));
            }
        }
        return null;
    }
}
