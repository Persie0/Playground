package com.lingq.p055ui.tooltips;

import android.content.Context;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bj\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, m13365d2 = {"Lcom/lingq/ui/tooltips/TooltipStep;", "", "", "lingqs", "", "requiresLingQs", "", "completed", "requires", "shouldDisable", "isDisabled", "Landroid/content/Context;", "context", "", "test", "Lcom/lingq/ui/tooltips/TooltipStep$a;", "info", "alternativeMessage", "<init>", "(Ljava/lang/String;I)V", "HighlightType", "a", "Start", "ChooseFirstLesson", "TapBlueWord", "TapTranslation", "FirstLingQ", "TapSecondBlueWord", "DoYouKnowThisWord", "TapThirdBlueWord", "UpdateStatusHighlight", "UpdateStatus", "LingQSwipeUpHighlight", "LingQExpanded", "SentenceModeHighlight", "SentenceMode", "SentenceModeAudio", "ReviewMenuHighlight", "ReviewMenu", "PlayAudioHighlight", "PlayAudio", "MoveToKnown", "SwipePageHighlight", "CheckDictionary", "RelatedPhrase", "VisitAcademy", "ImportLesson", "Complete", "Finished", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum TooltipStep {
    Start,
    ChooseFirstLesson,
    TapBlueWord,
    TapTranslation,
    FirstLingQ,
    TapSecondBlueWord,
    DoYouKnowThisWord,
    TapThirdBlueWord,
    UpdateStatusHighlight,
    UpdateStatus,
    LingQSwipeUpHighlight,
    LingQExpanded,
    SentenceModeHighlight,
    SentenceMode,
    SentenceModeAudio,
    ReviewMenuHighlight,
    ReviewMenu,
    PlayAudioHighlight,
    PlayAudio,
    MoveToKnown,
    SwipePageHighlight,
    CheckDictionary,
    RelatedPhrase,
    VisitAcademy,
    ImportLesson,
    Complete,
    Finished;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m13365d2 = {"Lcom/lingq/ui/tooltips/TooltipStep$HighlightType;", "", "(Ljava/lang/String;I)V", "Indicator", "Focus", "Hand", "HandCentered", "HandSwipe", "HandSwipeTopDown", "Incentive", "Nothing", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum HighlightType {
        Indicator,
        Focus,
        Hand,
        HandCentered,
        HandSwipe,
        HandSwipeTopDown,
        Incentive,
        Nothing
    }

    /* JADX INFO: renamed from: com.lingq.ui.tooltips.TooltipStep$a */
    public static final class C4909a {

        /* JADX INFO: renamed from: a */
        public final String f31928a;

        /* JADX INFO: renamed from: b */
        public final List<String> f31929b;

        /* JADX INFO: renamed from: c */
        public final boolean f31930c;

        /* JADX INFO: renamed from: d */
        public final HighlightType f31931d;

        public C4909a() {
            this(null, null, false, null, 15);
        }

        public C4909a(String str, ArrayList arrayList, boolean z10, HighlightType highlightType, int i10) {
            str = (i10 & 1) != 0 ? "" : str;
            arrayList = (i10 & 2) != 0 ? new ArrayList() : arrayList;
            z10 = (i10 & 4) != 0 ? false : z10;
            highlightType = (i10 & 8) != 0 ? HighlightType.Nothing : highlightType;
            C5207g.m11111f(str, "text");
            C5207g.m11111f(arrayList, "bold");
            C5207g.m11111f(highlightType, "highlightType");
            this.f31928a = str;
            this.f31929b = arrayList;
            this.f31930c = z10;
            this.f31931d = highlightType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4909a)) {
                return false;
            }
            C4909a c4909a = (C4909a) obj;
            return C5207g.m11106a(this.f31928a, c4909a.f31928a) && C5207g.m11106a(this.f31929b, c4909a.f31929b) && this.f31930c == c4909a.f31930c && this.f31931d == c4909a.f31931d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public final int hashCode() {
            int iM848g = C0204c.m848g(this.f31929b, this.f31928a.hashCode() * 31, 31);
            boolean z10 = this.f31930c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return this.f31931d.hashCode() + ((iM848g + r10) * 31);
        }

        public final String toString() {
            return "TooltipInfo(text=" + this.f31928a + ", bold=" + this.f31929b + ", isHighlightOnly=" + this.f31930c + ", highlightType=" + this.f31931d + ")";
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.tooltips.TooltipStep$b */
    public /* synthetic */ class C4910b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31932a;

        static {
            int[] iArr = new int[TooltipStep.values().length];
            try {
                iArr[TooltipStep.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipStep.ChooseFirstLesson.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TooltipStep.TapBlueWord.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TooltipStep.TapTranslation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TooltipStep.FirstLingQ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TooltipStep.TapSecondBlueWord.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TooltipStep.TapThirdBlueWord.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TooltipStep.PlayAudioHighlight.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TooltipStep.PlayAudio.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TooltipStep.SentenceModeHighlight.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TooltipStep.SentenceMode.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TooltipStep.SentenceModeAudio.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TooltipStep.ReviewMenuHighlight.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TooltipStep.ReviewMenu.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TooltipStep.MoveToKnown.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TooltipStep.SwipePageHighlight.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TooltipStep.UpdateStatusHighlight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TooltipStep.UpdateStatus.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TooltipStep.DoYouKnowThisWord.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TooltipStep.LingQSwipeUpHighlight.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TooltipStep.LingQExpanded.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TooltipStep.CheckDictionary.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TooltipStep.RelatedPhrase.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TooltipStep.VisitAcademy.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TooltipStep.ImportLesson.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TooltipStep.Complete.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TooltipStep.Finished.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            f31932a = iArr;
        }
    }

    public static /* synthetic */ C4909a info$default(TooltipStep tooltipStep, Context context, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            str = "";
        }
        return tooltipStep.info(context, i10, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r6 >= 10) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r6 >= 6) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r6 >= 4) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        if (r6 >= 2) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r6 <= 1) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r6 >= 17) goto L4;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean requiresLingQs(int lingqs) {
        switch (C4910b.f31932a[ordinal()]) {
            case 5:
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 8:
                if (lingqs >= 14) {
                    break;
                }
                return false;
            case 10:
                if (lingqs >= 3) {
                    break;
                }
                return false;
            case 12:
                break;
            case 13:
                if (lingqs >= 8) {
                    break;
                }
                return false;
            case 16:
                break;
            case 17:
                if (lingqs >= 12) {
                    break;
                }
                return false;
            case 20:
                if (lingqs >= 7) {
                    break;
                }
                return false;
            case 22:
                if (lingqs >= 15) {
                    break;
                }
                return false;
            case 23:
                break;
        }
        return true;
    }

    public final String alternativeMessage(Context context) {
        C5207g.m11111f(context, "context");
        if (C4910b.f31932a[ordinal()] != 2) {
            return "";
        }
        String string = context.getString(R.string.tooltips_library_start_exit_tutorial);
        C5207g.m11110e(string, "{\n                contex…t_tutorial)\n            }");
        return string;
    }

    public final C4909a info(Context context, int lingqs, String test) {
        C4909a c4909a;
        C4909a c4909a2;
        C5207g.m11111f(context, "context");
        C5207g.m11111f(test, "test");
        switch (C4910b.f31932a[ordinal()]) {
            case 1:
                return new C4909a("Start", null, false, null, 14);
            case 2:
                String string = context.getString(R.string.tooltips_start_with_this_lesson);
                C5207g.m11110e(string, "context.getString(R.stri…s_start_with_this_lesson)");
                c4909a = new C4909a(string, null, false, HighlightType.Focus, 6);
                return c4909a;
            case 3:
                String string2 = context.getString(R.string.tooltips_tap_to_see_meaning);
                C5207g.m11110e(string2, "context.getString(R.stri…ltips_tap_to_see_meaning)");
                c4909a = new C4909a(string2, null, false, HighlightType.Hand, 6);
                return c4909a;
            case 4:
                String string3 = context.getString(R.string.tooltips_tap_to_make_lingq);
                C5207g.m11110e(string3, "context.getString(R.stri…oltips_tap_to_make_lingq)");
                c4909a = new C4909a(string3, null, false, HighlightType.Hand, 6);
                return c4909a;
            case 5:
                String string4 = context.getString(R.string.tooltips_lingq_created);
                C5207g.m11110e(string4, "context.getString(R.string.tooltips_lingq_created)");
                c4909a = new C4909a(string4, null, false, HighlightType.Incentive, 6);
                return c4909a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                String string5 = context.getString(R.string.tooltips_word_more);
                C5207g.m11110e(string5, "context.getString(R.string.tooltips_word_more)");
                c4909a2 = new C4909a(string5, null, false, HighlightType.Hand, 6);
                return c4909a2;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                String string6 = context.getString(R.string.tooltips_lingq_created_more);
                C5207g.m11110e(string6, "context.getString(R.stri…ltips_lingq_created_more)");
                c4909a2 = new C4909a(string6, null, false, HighlightType.Hand, 6);
                return c4909a2;
            case 8:
                return new C4909a(null, null, true, HighlightType.Indicator, 3);
            case 9:
                String string7 = context.getString(R.string.tooltips_play_audio_listen);
                C5207g.m11110e(string7, "context.getString(R.stri…oltips_play_audio_listen)");
                c4909a = new C4909a(string7, null, false, HighlightType.Indicator, 6);
                return c4909a;
            case 10:
                String string8 = lingqs < 2 ? context.getString(R.string.tooltips_sentence) : "";
                C5207g.m11110e(string8, "if (lingqs < 2) {\n      …     \"\"\n                }");
                c4909a = new C4909a(string8, null, false, HighlightType.Incentive, 6);
                return c4909a;
            case 11:
                String string9 = context.getString(R.string.tooltips_sentence_page);
                C5207g.m11110e(string9, "context.getString(R.string.tooltips_sentence_page)");
                c4909a = new C4909a(string9, null, false, HighlightType.HandSwipe, 6);
                return c4909a;
            case 12:
                String string10 = context.getString(R.string.tooltips_sentence_listen);
                C5207g.m11110e(string10, "context.getString(R.stri…tooltips_sentence_listen)");
                c4909a = new C4909a(string10, null, false, HighlightType.Incentive, 6);
                return c4909a;
            case 13:
                return new C4909a(null, null, true, HighlightType.Indicator, 3);
            case 14:
                String string11 = context.getString(R.string.tooltips_review_menu);
                C5207g.m11110e(string11, "context.getString(R.string.tooltips_review_menu)");
                c4909a = new C4909a(string11, null, false, HighlightType.Incentive, 6);
                return c4909a;
            case 15:
                String string12 = context.getString(R.string.tooltips_blue_words_turn_white);
                C5207g.m11110e(string12, "context.getString(R.stri…ps_blue_words_turn_white)");
                String string13 = context.getString(R.string.tooltips_blue_words_turn_white_substring_blue_words_turn_white);
                C5207g.m11110e(string13, "context.getString(R.stri…ng_blue_words_turn_white)");
                c4909a2 = new C4909a(string12, C9000b.m17237c(string13), false, null, 12);
                return c4909a2;
            case 16:
                return new C4909a(null, null, true, HighlightType.HandSwipe, 3);
            case 17:
                return new C4909a(null, null, true, HighlightType.Incentive, 3);
            case 18:
                String string14 = context.getString(R.string.tooltips_status_update);
                C5207g.m11110e(string14, "context.getString(R.string.tooltips_status_update)");
                c4909a = new C4909a(string14, null, false, null, 14);
                return c4909a;
            case 19:
                String string15 = context.getString(R.string.tooltips_known_word);
                C5207g.m11110e(string15, "context.getString(R.string.tooltips_known_word)");
                c4909a2 = new C4909a(string15, null, false, HighlightType.Incentive, 6);
                return c4909a2;
            case 20:
                return new C4909a(null, null, true, HighlightType.HandSwipeTopDown, 3);
            case 21:
                String string16 = context.getString(R.string.tooltips_popup_expanded);
                C5207g.m11110e(string16, "context.getString(R.stri….tooltips_popup_expanded)");
                c4909a = new C4909a(string16, null, false, null, 14);
                return c4909a;
            case 22:
                String string17 = context.getString(R.string.tooltips_check_dictionary);
                C5207g.m11110e(string17, "context.getString(R.stri…ooltips_check_dictionary)");
                String string18 = context.getString(R.string.tooltips_check_dictionary_substring_check_a_dictionary);
                C5207g.m11110e(string18, "context.getString(R.stri…tring_check_a_dictionary)");
                c4909a = new C4909a(string17, C9000b.m17237c(string18), false, null, 12);
                return c4909a;
            case 23:
                String string19 = context.getString(R.string.tooltips_gray_shading);
                C5207g.m11110e(string19, "context.getString(R.string.tooltips_gray_shading)");
                String string20 = context.getString(R.string.tooltips_gray_shading_substring_tap_again);
                C5207g.m11110e(string20, "context.getString(R.stri…ding_substring_tap_again)");
                String string21 = context.getString(R.string.tooltips_gray_shading_substring_phrases);
                C5207g.m11110e(string21, "context.getString(R.stri…hading_substring_phrases)");
                c4909a = new C4909a(string19, C9000b.m17237c(string20, string21), false, null, 12);
                return c4909a;
            case 24:
                String string22 = context.getString(R.string.tooltips_visit_academy);
                C5207g.m11110e(string22, "context.getString(R.string.tooltips_visit_academy)");
                c4909a = new C4909a(string22, null, false, null, 14);
                return c4909a;
            case 25:
                String string23 = context.getString(R.string.lingq_import_lesson);
                C5207g.m11110e(string23, "context.getString(R.string.lingq_import_lesson)");
                c4909a = new C4909a(string23, null, false, null, 14);
                return c4909a;
            case 26:
                String string24 = context.getString(R.string.tooltips_complete);
                C5207g.m11110e(string24, "context.getString(R.string.tooltips_complete)");
                c4909a = new C4909a(string24, null, false, null, 14);
                return c4909a;
            case 27:
                return new C4909a("Finished", null, false, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isDisabled(boolean shouldDisable) {
        switch (C4910b.f31932a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 11:
            case 15:
            case 16:
            case 17:
            case 19:
            case 26:
            case 27:
                return false;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 18:
            case 20:
            case 21:
                return shouldDisable;
            case 22:
            case 23:
            case 24:
            case 25:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final boolean requires(Set<? extends TooltipStep> completed, int lingqs) {
        C5207g.m11111f(completed, "completed");
        switch (C4910b.f31932a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 9:
            case 11:
            case 14:
            case 15:
            case 18:
            case 21:
            case 4:
                return completed.contains(TapBlueWord);
            case 5:
                if (!completed.contains(TapTranslation) || !requiresLingQs(lingqs)) {
                    return false;
                }
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return completed.contains(FirstLingQ) || requiresLingQs(lingqs);
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!completed.contains(TapSecondBlueWord) || !requiresLingQs(lingqs)) {
                    return false;
                }
            case 8:
                return requiresLingQs(lingqs);
            case 10:
                return requiresLingQs(lingqs);
            case 12:
                if (!completed.contains(TapThirdBlueWord) || !requiresLingQs(lingqs)) {
                    return false;
                }
            case 13:
                return requiresLingQs(lingqs);
            case 16:
                if (!completed.contains(TapThirdBlueWord) || !requiresLingQs(lingqs)) {
                    return false;
                }
            case 17:
                if (!completed.contains(FirstLingQ)) {
                    if (!completed.contains(TapThirdBlueWord) || !requiresLingQs(lingqs)) {
                        return false;
                    }
                }
            case 19:
                return completed.contains(TapSecondBlueWord);
            case 20:
                if (!completed.contains(UpdateStatusHighlight) || !requiresLingQs(lingqs)) {
                    return false;
                }
            case 22:
                if (!completed.contains(MoveToKnown) || !requiresLingQs(lingqs)) {
                    return false;
                }
            case 23:
                if (!completed.contains(MoveToKnown) || !requiresLingQs(lingqs)) {
                    return false;
                }
            case 24:
                return completed.contains(ChooseFirstLesson);
            case 25:
                return completed.contains(VisitAcademy);
            case 26:
                return completed.containsAll(C9000b.m17252r(ChooseFirstLesson, TapBlueWord, TapTranslation, FirstLingQ, TapSecondBlueWord, TapThirdBlueWord, PlayAudio, SentenceMode, ReviewMenu, MoveToKnown, UpdateStatus, LingQExpanded));
            case 27:
                return completed.contains(Finished);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
