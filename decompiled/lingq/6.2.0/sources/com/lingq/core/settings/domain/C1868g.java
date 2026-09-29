package com.lingq.core.settings.domain;

import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.domain.model.user.ProfileSettingType;
import com.lingq.core.settings.ViewKeys;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.c83;
import p000.i19;
import p000.ig8;
import p000.xfa;
import p000.yz8;
import p000.zz8;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1868g {
    public static final yz8 Companion = new yz8();

    /* JADX INFO: renamed from: c */
    public static final Set f22941c = AbstractC3550rv.m20855w0(new ViewKeys[]{ViewKeys.FlashcardsFrontTransliteration, ViewKeys.ReverseFlashcardsFrontTransliteration, ViewKeys.MultipleChoiceFrontTransliteration});

    /* JADX INFO: renamed from: a */
    public final ig8 f22942a;

    /* JADX INFO: renamed from: b */
    public final C1862a f22943b;

    public C1868g(ig8 ig8Var, C1862a c1862a) {
        ig8Var.getClass();
        this.f22942a = ig8Var;
        this.f22943b = c1862a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0237  */
    /* JADX WARN: Code duplicated, block: B:103:0x023a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0246  */
    /* JADX WARN: Code duplicated, block: B:106:0x0249  */
    /* JADX WARN: Code duplicated, block: B:108:0x0255  */
    /* JADX WARN: Code duplicated, block: B:109:0x0258  */
    /* JADX WARN: Code duplicated, block: B:111:0x0264  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:114:0x0273  */
    /* JADX WARN: Code duplicated, block: B:118:0x0281  */
    /* JADX WARN: Code duplicated, block: B:119:0x0284  */
    /* JADX WARN: Code duplicated, block: B:120:0x0287  */
    /* JADX WARN: Code duplicated, block: B:121:0x028a  */
    /* JADX WARN: Code duplicated, block: B:122:0x028d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:51:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:66:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0190  */
    /* JADX WARN: Code duplicated, block: B:72:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x020a  */
    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0219  */
    /* JADX WARN: Code duplicated, block: B:97:0x021c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029f, code lost:
    
        if (r10.f22943b.m8616b(r13, r14, r0) == r1) goto L125;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8631a(ViewKeys viewKeys, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        SetReviewTransliterationStyleUseCase$invoke$1 setReviewTransliterationStyleUseCase$invoke$1;
        ViewKeys viewKeys2;
        ReviewSettingsKeys reviewSettingsKeys;
        String str3;
        ViewKeys viewKeys3;
        ProfileSettingType profileSettingType;
        Locale locale;
        String lowerCase;
        LanguageLearn languageLearn;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        if (continuationImpl instanceof SetReviewTransliterationStyleUseCase$invoke$1) {
            setReviewTransliterationStyleUseCase$invoke$1 = (SetReviewTransliterationStyleUseCase$invoke$1) continuationImpl;
            int i = setReviewTransliterationStyleUseCase$invoke$1.f22829g;
            if ((i & Integer.MIN_VALUE) != 0) {
                setReviewTransliterationStyleUseCase$invoke$1.f22829g = i - Integer.MIN_VALUE;
            } else {
                setReviewTransliterationStyleUseCase$invoke$1 = new SetReviewTransliterationStyleUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            setReviewTransliterationStyleUseCase$invoke$1 = new SetReviewTransliterationStyleUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = setReviewTransliterationStyleUseCase$invoke$1.f22827e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setReviewTransliterationStyleUseCase$invoke$1.f22829g;
        ig8 ig8Var = this.f22942a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            ReviewSettingsKeys reviewSettingsKeysM13627a = i19.m13627a(viewKeys);
            c83 c83Var = ((C1370c) ig8Var).f18513Y;
            setReviewTransliterationStyleUseCase$invoke$1.f22823a = viewKeys;
            setReviewTransliterationStyleUseCase$invoke$1.f22824b = str;
            setReviewTransliterationStyleUseCase$invoke$1.f22825c = str2;
            setReviewTransliterationStyleUseCase$invoke$1.f22826d = reviewSettingsKeysM13627a;
            setReviewTransliterationStyleUseCase$invoke$1.f22829g = 1;
            Object objM15541t = AbstractC3224d.m15541t(c83Var, setReviewTransliterationStyleUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
                viewKeys2 = viewKeys;
                reviewSettingsKeys = reviewSettingsKeysM13627a;
                obj = objM15541t;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            reviewSettingsKeys = setReviewTransliterationStyleUseCase$invoke$1.f22826d;
            str2 = setReviewTransliterationStyleUseCase$invoke$1.f22825c;
            str = setReviewTransliterationStyleUseCase$invoke$1.f22824b;
            viewKeys2 = setReviewTransliterationStyleUseCase$invoke$1.f22823a;
            AbstractC3193b.m15359b(obj);
        } else if (i2 == 2) {
            str3 = setReviewTransliterationStyleUseCase$invoke$1.f22825c;
            str = setReviewTransliterationStyleUseCase$invoke$1.f22824b;
            viewKeys3 = setReviewTransliterationStyleUseCase$invoke$1.f22823a;
            AbstractC3193b.m15359b(obj);
            profileSettingType = new ProfileSettingType();
            locale = Locale.ROOT;
            lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            str3.getClass();
            languageLearn = LanguageLearn.Mandarin;
            if (str3.equals(languageLearn.getCode())) {
                lowerCase4 = lowerCase.toLowerCase(locale);
                lowerCase4.getClass();
                if (lowerCase4.equals("traditional")) {
                    lowerCase = "hant";
                } else if (str3.equals(LanguageLearn.ChineseTraditional.getCode())) {
                    lowerCase3 = lowerCase.toLowerCase(locale);
                    lowerCase3.getClass();
                    if (lowerCase3.equals("simplified")) {
                        lowerCase = "hans";
                    } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                        lowerCase2 = lowerCase.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (lowerCase2.equals("simplified")) {
                            lowerCase = "hans";
                        }
                    }
                } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                    lowerCase2 = lowerCase.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (lowerCase2.equals("simplified")) {
                        lowerCase = "hans";
                    }
                }
            } else if (str3.equals(LanguageLearn.ChineseTraditional.getCode())) {
                lowerCase3 = lowerCase.toLowerCase(locale);
                lowerCase3.getClass();
                if (lowerCase3.equals("simplified")) {
                    lowerCase = "hans";
                } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                    lowerCase2 = lowerCase.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (lowerCase2.equals("simplified")) {
                        lowerCase = "hans";
                    }
                }
            } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                lowerCase2 = lowerCase.toLowerCase(locale);
                lowerCase2.getClass();
                if (lowerCase2.equals("simplified")) {
                    lowerCase = "hans";
                }
            }
            if (f22941c.contains(viewKeys3)) {
                if (str3.equals(LanguageLearn.Korean.getCode())) {
                    profileSettingType.f19739w = lowerCase;
                } else if (str3.equals(LanguageLearn.Japanese.getCode())) {
                    profileSettingType.f19736t = lowerCase;
                } else if (str3.equals(languageLearn.getCode())) {
                    profileSettingType.f19737u = lowerCase;
                } else if (str3.equals(LanguageLearn.Russian.getCode())) {
                    profileSettingType.f19738v = lowerCase;
                } else if (str3.equals(LanguageLearn.Ukrainian.getCode())) {
                    profileSettingType.f19740x = lowerCase;
                } else if (str3.equals(LanguageLearn.Greek.getCode())) {
                    profileSettingType.f19741y = lowerCase;
                } else if (str3.equals(LanguageLearn.Serbian.getCode())) {
                    profileSettingType.f19742z = lowerCase;
                } else if (str3.equals(LanguageLearn.Armenian.getCode())) {
                    profileSettingType.f19702C = lowerCase;
                } else if (str3.equals(LanguageLearn.Bulgarian.getCode())) {
                    profileSettingType.f19701B = lowerCase;
                } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                    profileSettingType.f19702C = lowerCase;
                } else if (str3.equals(LanguageLearn.ChineseTraditional.getCode())) {
                    profileSettingType.f19703D = lowerCase;
                } else if (str3.equals(LanguageLearn.Thai.getCode())) {
                    profileSettingType.f19704E = lowerCase;
                }
            } else if (str3.equals(LanguageLearn.Korean.getCode())) {
                profileSettingType.f19708I = lowerCase;
            } else if (str3.equals(LanguageLearn.Japanese.getCode())) {
                profileSettingType.f19705F = lowerCase;
            } else if (str3.equals(languageLearn.getCode())) {
                profileSettingType.f19706G = lowerCase;
            } else if (str3.equals(LanguageLearn.Russian.getCode())) {
                profileSettingType.f19707H = lowerCase;
            } else if (str3.equals(LanguageLearn.Ukrainian.getCode())) {
                profileSettingType.f19709J = lowerCase;
            } else if (str3.equals(LanguageLearn.Greek.getCode())) {
                profileSettingType.f19710K = lowerCase;
            } else if (str3.equals(LanguageLearn.Serbian.getCode())) {
                profileSettingType.f19711L = lowerCase;
            } else if (str3.equals(LanguageLearn.Armenian.getCode())) {
                profileSettingType.f19714O = lowerCase;
            } else if (str3.equals(LanguageLearn.Bulgarian.getCode())) {
                profileSettingType.f19713N = lowerCase;
            } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                profileSettingType.f19714O = lowerCase;
            } else if (str3.equals(LanguageLearn.ChineseTraditional.getCode())) {
                profileSettingType.f19715P = lowerCase;
            } else if (str3.equals(LanguageLearn.Thai.getCode())) {
                profileSettingType.f19716Q = lowerCase;
            }
            switch (zz8.f72432a[viewKeys3.ordinal()]) {
                case 1:
                case 2:
                    viewKeys3 = ViewKeys.Flashcards;
                    break;
                case 3:
                case 4:
                    viewKeys3 = ViewKeys.ReverseFlashcards;
                    break;
                case 5:
                    viewKeys3 = ViewKeys.Cloze;
                    break;
                case 6:
                case 7:
                    viewKeys3 = ViewKeys.MultipleChoice;
                    break;
                case 8:
                    viewKeys3 = ViewKeys.Dictation;
                    break;
            }
            setReviewTransliterationStyleUseCase$invoke$1.f22823a = null;
            setReviewTransliterationStyleUseCase$invoke$1.f22824b = null;
            setReviewTransliterationStyleUseCase$invoke$1.f22825c = null;
            setReviewTransliterationStyleUseCase$invoke$1.f22826d = null;
            setReviewTransliterationStyleUseCase$invoke$1.f22829g = 3;
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj);
        linkedHashMapM15372Y.put(reviewSettingsKeys.name(), str);
        setReviewTransliterationStyleUseCase$invoke$1.f22823a = viewKeys2;
        setReviewTransliterationStyleUseCase$invoke$1.f22824b = str;
        setReviewTransliterationStyleUseCase$invoke$1.f22825c = str2;
        setReviewTransliterationStyleUseCase$invoke$1.f22826d = null;
        setReviewTransliterationStyleUseCase$invoke$1.f22829g = 2;
        if (((C1370c) ig8Var).m7934I(linkedHashMapM15372Y, setReviewTransliterationStyleUseCase$invoke$1) != coroutineSingletons) {
            str3 = str2;
            viewKeys3 = viewKeys2;
            profileSettingType = new ProfileSettingType();
            locale = Locale.ROOT;
            lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            str3.getClass();
            languageLearn = LanguageLearn.Mandarin;
            if (str3.equals(languageLearn.getCode())) {
                lowerCase4 = lowerCase.toLowerCase(locale);
                lowerCase4.getClass();
                if (lowerCase4.equals("traditional")) {
                    lowerCase = "hant";
                } else if (str3.equals(LanguageLearn.ChineseTraditional.getCode())) {
                    lowerCase3 = lowerCase.toLowerCase(locale);
                    lowerCase3.getClass();
                    if (lowerCase3.equals("simplified")) {
                        lowerCase = "hans";
                    } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                        lowerCase2 = lowerCase.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (lowerCase2.equals("simplified")) {
                            lowerCase = "hans";
                        }
                    }
                } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                    lowerCase2 = lowerCase.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (lowerCase2.equals("simplified")) {
                        lowerCase = "hans";
                    }
                }
            } else if (str3.equals(LanguageLearn.ChineseTraditional.getCode())) {
                lowerCase3 = lowerCase.toLowerCase(locale);
                lowerCase3.getClass();
                if (lowerCase3.equals("simplified")) {
                    lowerCase = "hans";
                } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                    lowerCase2 = lowerCase.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (lowerCase2.equals("simplified")) {
                        lowerCase = "hans";
                    }
                }
            } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                lowerCase2 = lowerCase.toLowerCase(locale);
                lowerCase2.getClass();
                if (lowerCase2.equals("simplified")) {
                    lowerCase = "hans";
                }
            }
            if (f22941c.contains(viewKeys3)) {
                if (str3.equals(LanguageLearn.Korean.getCode())) {
                    profileSettingType.f19739w = lowerCase;
                } else if (str3.equals(LanguageLearn.Japanese.getCode())) {
                    profileSettingType.f19736t = lowerCase;
                } else if (str3.equals(languageLearn.getCode())) {
                    profileSettingType.f19737u = lowerCase;
                } else if (str3.equals(LanguageLearn.Russian.getCode())) {
                    profileSettingType.f19738v = lowerCase;
                } else if (str3.equals(LanguageLearn.Ukrainian.getCode())) {
                    profileSettingType.f19740x = lowerCase;
                } else if (str3.equals(LanguageLearn.Greek.getCode())) {
                    profileSettingType.f19741y = lowerCase;
                } else if (str3.equals(LanguageLearn.Serbian.getCode())) {
                    profileSettingType.f19742z = lowerCase;
                } else if (str3.equals(LanguageLearn.Armenian.getCode())) {
                    profileSettingType.f19702C = lowerCase;
                } else if (str3.equals(LanguageLearn.Bulgarian.getCode())) {
                    profileSettingType.f19701B = lowerCase;
                } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                    profileSettingType.f19702C = lowerCase;
                } else if (str3.equals(LanguageLearn.ChineseTraditional.getCode())) {
                    profileSettingType.f19703D = lowerCase;
                } else if (str3.equals(LanguageLearn.Thai.getCode())) {
                    profileSettingType.f19704E = lowerCase;
                }
            } else if (str3.equals(LanguageLearn.Korean.getCode())) {
                profileSettingType.f19708I = lowerCase;
            } else if (str3.equals(LanguageLearn.Japanese.getCode())) {
                profileSettingType.f19705F = lowerCase;
            } else if (str3.equals(languageLearn.getCode())) {
                profileSettingType.f19706G = lowerCase;
            } else if (str3.equals(LanguageLearn.Russian.getCode())) {
                profileSettingType.f19707H = lowerCase;
            } else if (str3.equals(LanguageLearn.Ukrainian.getCode())) {
                profileSettingType.f19709J = lowerCase;
            } else if (str3.equals(LanguageLearn.Greek.getCode())) {
                profileSettingType.f19710K = lowerCase;
            } else if (str3.equals(LanguageLearn.Serbian.getCode())) {
                profileSettingType.f19711L = lowerCase;
            } else if (str3.equals(LanguageLearn.Armenian.getCode())) {
                profileSettingType.f19714O = lowerCase;
            } else if (str3.equals(LanguageLearn.Bulgarian.getCode())) {
                profileSettingType.f19713N = lowerCase;
            } else if (str3.equals(LanguageLearn.Cantonese.getCode())) {
                profileSettingType.f19714O = lowerCase;
            } else if (str3.equals(LanguageLearn.ChineseTraditional.getCode())) {
                profileSettingType.f19715P = lowerCase;
            } else if (str3.equals(LanguageLearn.Thai.getCode())) {
                profileSettingType.f19716Q = lowerCase;
            }
            switch (zz8.f72432a[viewKeys3.ordinal()]) {
                case 1:
                case 2:
                    viewKeys3 = ViewKeys.Flashcards;
                    break;
                case 3:
                case 4:
                    viewKeys3 = ViewKeys.ReverseFlashcards;
                    break;
                case 5:
                    viewKeys3 = ViewKeys.Cloze;
                    break;
                case 6:
                case 7:
                    viewKeys3 = ViewKeys.MultipleChoice;
                    break;
                case 8:
                    viewKeys3 = ViewKeys.Dictation;
                    break;
            }
            setReviewTransliterationStyleUseCase$invoke$1.f22823a = null;
            setReviewTransliterationStyleUseCase$invoke$1.f22824b = null;
            setReviewTransliterationStyleUseCase$invoke$1.f22825c = null;
            setReviewTransliterationStyleUseCase$invoke$1.f22826d = null;
            setReviewTransliterationStyleUseCase$invoke$1.f22829g = 3;
        }
        return coroutineSingletons;
    }
}
