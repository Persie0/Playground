package p000;

import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.settings.R$string;
import com.lingq.core.settings.ViewKeys;
import com.lingq.core.settings.review.C1880a;
import com.lingq.core.settings.review.ReviewSettingsViewModel$observeSettings$$inlined$map$1$2$1;
import com.lingq.core.settings.review.ReviewSettingsViewModel$observeSettings$$inlined$map$2$2$1;
import com.lingq.core.settings.review.ReviewSettingsViewModel$observeSettings$$inlined$map$3$2$1;
import com.lingq.core.settings.review.ReviewSettingsViewModel$observeSettings$$inlined$map$4$2$1;
import com.lingq.core.settings.review.ReviewSettingsViewModel$observeSettings$$inlined$map$5$2$1;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class ag8 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f606b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1880a f607c;

    public /* synthetic */ ag8(e83 e83Var, C1880a c1880a, int i) {
        this.f605a = i;
        this.f606b = e83Var;
        this.f607c = c1880a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0292  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0254  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ReviewSettingsViewModel$observeSettings$$inlined$map$1$2$1 reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1;
        ReviewSettingsViewModel$observeSettings$$inlined$map$2$2$1 reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1;
        ReviewSettingsViewModel$observeSettings$$inlined$map$3$2$1 reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1;
        ReviewSettingsViewModel$observeSettings$$inlined$map$4$2$1 reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1;
        ViewKeys viewKeys;
        String str;
        ReviewSettingsViewModel$observeSettings$$inlined$map$5$2$1 reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1;
        int i = this.f605a;
        xfa xfaVar = xfa.f68157a;
        C1880a c1880a = this.f607c;
        e83 e83Var = this.f606b;
        switch (i) {
            case 0:
                if (continuation instanceof ReviewSettingsViewModel$observeSettings$$inlined$map$1$2$1) {
                    reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1 = (ReviewSettingsViewModel$observeSettings$$inlined$map$1$2$1) continuation;
                    int i2 = reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1.f23142b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1.f23142b = i2 - Integer.MIN_VALUE;
                    } else {
                        reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$1$2$1(this, continuation);
                }
                Object obj2 = reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1.f23141a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1.f23142b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                C3173k6 c3173k6 = (C3173k6) obj;
                c1880a.f23187k.m15571i(c3173k6);
                ListBuilder listBuilderM23650t = vz1.m23650t();
                listBuilderM23650t.add(new e29(R$string.settings_cards_per_session, null, ViewKeys.CardsPerSession, String.valueOf(c3173k6.f46740a), null, 104));
                q19 q19Var = q19.f57132a;
                listBuilderM23650t.add(q19Var);
                listBuilderM23650t.add(new o19(R$string.activities_text_activities));
                boolean z = c3173k6.f46749j;
                if (z) {
                    listBuilderM23650t.add(new a29(R$string.settings_flashcards, ViewKeys.Flashcards, c3173k6.f46741b));
                    listBuilderM23650t.add(q19Var);
                    listBuilderM23650t.add(new a29(R$string.settings_reverse_flashcards, ViewKeys.ReverseFlashcards, c3173k6.f46742c));
                }
                listBuilderM23650t.add(q19Var);
                listBuilderM23650t.add(new a29(R$string.settings_cloze_test, ViewKeys.Cloze, c3173k6.f46743d));
                listBuilderM23650t.add(q19Var);
                listBuilderM23650t.add(new a29(R$string.settings_multiple_choice, ViewKeys.MultipleChoice, c3173k6.f46744e));
                if (z) {
                    listBuilderM23650t.add(q19Var);
                    listBuilderM23650t.add(new a29(R$string.settings_dictation, ViewKeys.Dictation, c3173k6.f46745f));
                }
                listBuilderM23650t.add(new o19(com.lingq.core.p012ui.R$string.lesson_review_study_sentence));
                listBuilderM23650t.add(new z19(R$string.review_settings_matching, null, c3173k6.f46748i, ViewKeys.Matching, true));
                listBuilderM23650t.add(q19Var);
                listBuilderM23650t.add(new z19(R$string.review_settings_unscramble, null, c3173k6.f46746g, ViewKeys.Unscramble, true));
                if (z) {
                    listBuilderM23650t.add(q19Var);
                    listBuilderM23650t.add(new a29(R$string.review_settings_speaking, ViewKeys.Speaking, c3173k6.f46747h));
                }
                ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
                reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1.f23142b = 1;
                return e83Var.emit(listBuilderM23635i, reviewSettingsViewModel$observeSettings$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof ReviewSettingsViewModel$observeSettings$$inlined$map$2$2$1) {
                    reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1 = (ReviewSettingsViewModel$observeSettings$$inlined$map$2$2$1) continuation;
                    int i4 = reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1.f23145b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1.f23145b = i4 - Integer.MIN_VALUE;
                    } else {
                        reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$2$2$1(this, continuation);
                }
                Object obj3 = reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1.f23144a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1.f23145b;
                if (i5 == 0) {
                    AbstractC3193b.m15359b(obj3);
                    ListBuilder listBuilderM8659V2 = C1880a.m8659V2(c1880a, (do0) obj, false);
                    reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1.f23145b = 1;
                    return e83Var.emit(listBuilderM8659V2, reviewSettingsViewModel$observeSettings$$inlined$map$2$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
                }
                if (i5 == 1) {
                    AbstractC3193b.m15359b(obj3);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (continuation instanceof ReviewSettingsViewModel$observeSettings$$inlined$map$3$2$1) {
                    reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1 = (ReviewSettingsViewModel$observeSettings$$inlined$map$3$2$1) continuation;
                    int i6 = reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1.f23148b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1.f23148b = i6 - Integer.MIN_VALUE;
                    } else {
                        reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$3$2$1(this, continuation);
                    }
                } else {
                    reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$3$2$1(this, continuation);
                }
                Object obj4 = reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1.f23147a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1.f23148b;
                if (i7 == 0) {
                    AbstractC3193b.m15359b(obj4);
                    ListBuilder listBuilderM8659V3 = C1880a.m8659V2(c1880a, (do0) obj, true);
                    reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1.f23148b = 1;
                    return e83Var.emit(listBuilderM8659V3, reviewSettingsViewModel$observeSettings$$inlined$map$3$2$1) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
                }
                if (i7 == 1) {
                    AbstractC3193b.m15359b(obj4);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (continuation instanceof ReviewSettingsViewModel$observeSettings$$inlined$map$4$2$1) {
                    reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1 = (ReviewSettingsViewModel$observeSettings$$inlined$map$4$2$1) continuation;
                    int i8 = reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1.f23151b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1.f23151b = i8 - Integer.MIN_VALUE;
                    } else {
                        reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$4$2$1(this, continuation);
                    }
                } else {
                    reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$4$2$1(this, continuation);
                }
                Object obj5 = reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1.f23150a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1.f23151b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC3193b.m15359b(obj5);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj5);
                C3562s6 c3562s6 = (C3562s6) obj;
                cma cmaVar = c1880a.f23178b;
                ViewKeys viewKeys2 = c1880a.f23185i;
                ReviewSettingsKeys reviewSettingsKeysM13627a = i19.m13627a(viewKeys2);
                ListBuilder listBuilderM23650t2 = vz1.m23650t();
                listBuilderM23650t2.add(new o19(R$string.settings_text_options));
                int i10 = R$string.settings_shuffle_cards;
                Map map = c3562s6.f60397c;
                Map map2 = c3562s6.f60396b;
                Boolean bool = (Boolean) map.get(reviewSettingsKeysM13627a.name());
                listBuilderM23650t2.add(new z19(i10, null, bool != null ? bool.booleanValue() : false, ViewKeys.ShuffleCards, false));
                int i11 = R$string.settings_autoplay_tts;
                Boolean bool2 = (Boolean) c3562s6.f60395a.get(reviewSettingsKeysM13627a.name());
                listBuilderM23650t2.add(new z19(i11, null, bool2 != null ? bool2.booleanValue() : true, ViewKeys.AutoplayTTS, false));
                String str2 = "Off";
                if (viewKeys2 == ViewKeys.MultipleChoice && AbstractC3184kh.m15231z(cmaVar.mo4589b2())) {
                    listBuilderM23650t2.add(new o19(R$string.settings_text_flashcards_front));
                    int i12 = R$string.settings_transliteration_style;
                    ViewKeys viewKeys3 = ViewKeys.MultipleChoiceFrontTransliteration;
                    String string = (String) map2.get("MultipleChoiceFrontTransliteration");
                    if (string != null) {
                        if (string.length() > 0) {
                            StringBuilder sb = new StringBuilder();
                            String strValueOf = String.valueOf(string.charAt(0));
                            strValueOf.getClass();
                            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            sb.append((Object) upperCase);
                            sb.append(string.substring(1));
                            string = sb.toString();
                        }
                        str = string;
                    } else {
                        str = "Off";
                    }
                    listBuilderM23650t2.add(new e29(i12, null, viewKeys3, str, null, 104));
                }
                listBuilderM23650t2.add(new o19(com.lingq.core.p012ui.R$string.ui_back));
                int i13 = R$string.settings_flashcards_status_bar;
                Boolean bool3 = (Boolean) c3562s6.f60398d.get(reviewSettingsKeysM13627a.name());
                listBuilderM23650t2.add(new z19(i13, null, bool3 != null ? bool3.booleanValue() : false, ViewKeys.BackStatusBar, false));
                if (AbstractC3184kh.m15231z(cmaVar.mo4589b2())) {
                    int i14 = zf8.f71494a[viewKeys2.ordinal()];
                    if (i14 == 4) {
                        viewKeys = ViewKeys.ClozeBackTransliteration;
                    } else if (i14 != 5) {
                        viewKeys = i14 != 6 ? ViewKeys.ClozeBackTransliteration : ViewKeys.DictationChoiceBackTransliteration;
                    } else {
                        viewKeys = ViewKeys.MultipleChoiceBackTransliteration;
                    }
                    ViewKeys viewKeys4 = viewKeys;
                    int i15 = R$string.settings_transliteration_style;
                    String string2 = (String) map2.get(i19.m13627a(viewKeys4).name());
                    if (string2 != null) {
                        if (string2.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            String strValueOf2 = String.valueOf(string2.charAt(0));
                            strValueOf2.getClass();
                            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                            upperCase2.getClass();
                            sb2.append((Object) upperCase2);
                            sb2.append(string2.substring(1));
                            string2 = sb2.toString();
                        }
                        str2 = string2;
                    }
                    listBuilderM23650t2.add(new e29(i15, null, viewKeys4, str2, null, 104));
                }
                ListBuilder listBuilderM23635i2 = vz1.m23635i(listBuilderM23650t2);
                reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1.f23151b = 1;
                return e83Var.emit(listBuilderM23635i2, reviewSettingsViewModel$observeSettings$$inlined$map$4$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
            default:
                if (continuation instanceof ReviewSettingsViewModel$observeSettings$$inlined$map$5$2$1) {
                    reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1 = (ReviewSettingsViewModel$observeSettings$$inlined$map$5$2$1) continuation;
                    int i16 = reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1.f23154b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1.f23154b = i16 - Integer.MIN_VALUE;
                    } else {
                        reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$5$2$1(this, continuation);
                    }
                } else {
                    reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1 = new ReviewSettingsViewModel$observeSettings$$inlined$map$5$2$1(this, continuation);
                }
                Object obj6 = reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1.f23153a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1.f23154b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                ListBuilder listBuilderM23650t3 = vz1.m23650t();
                listBuilderM23650t3.add(new o19(R$string.settings_text_options));
                int i18 = R$string.settings_autoplay_tts;
                Boolean bool4 = (Boolean) ((ue9) obj).f63813a.get(i19.m13627a(c1880a.f23185i).name());
                listBuilderM23650t3.add(new z19(i18, null, bool4 != null ? bool4.booleanValue() : true, ViewKeys.AutoplayTTS, false));
                ListBuilder listBuilderM23635i3 = vz1.m23635i(listBuilderM23650t3);
                reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1.f23154b = 1;
                return e83Var.emit(listBuilderM23635i3, reviewSettingsViewModel$observeSettings$$inlined$map$5$2$1) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
        }
    }
}
