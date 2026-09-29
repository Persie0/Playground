package com.lingq.core.settings.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.user.ProfileSettingType;
import com.lingq.core.settings.ViewKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.c83;
import p000.g9a;
import p000.hm5;
import p000.i19;
import p000.ig8;
import p000.lha;
import p000.mha;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C1872k {
    public static final lha Companion = new lha();

    /* JADX INFO: renamed from: d */
    public static final Map f22958d = AbstractC3194a.m15365R(new Pair(ViewKeys.FlashcardsFrontTerm, "Front Term"), new Pair(ViewKeys.FlashcardsFrontPhrase, "Front Source Text"), new Pair(ViewKeys.FlashcardsFrontTranslation, "Front Translation"), new Pair(ViewKeys.FlashcardsFrontStatusBar, "Front Status Bar"), new Pair(ViewKeys.FlashcardsBackTerm, "Back Term"), new Pair(ViewKeys.FlashcardsBackPhrase, "Back Source Text"), new Pair(ViewKeys.FlashcardsBackTranslation, "Back Translation"), new Pair(ViewKeys.FlashcardsBackStatusBar, "Back Status Bar"), new Pair(ViewKeys.ReverseFlashcardsFrontTerm, "Front Term"), new Pair(ViewKeys.ReverseFlashcardsFrontPhrase, "Front Source Text"), new Pair(ViewKeys.ReverseFlashcardsFrontTranslation, "Front Translation"), new Pair(ViewKeys.ReverseFlashcardsFrontStatusBar, "Front Status Bar"), new Pair(ViewKeys.ReverseFlashcardsBackTerm, "Back Term"), new Pair(ViewKeys.ReverseFlashcardsBackPhrase, "Back Source Text"), new Pair(ViewKeys.ReverseFlashcardsBackTranslation, "Back Translation"), new Pair(ViewKeys.ReverseFlashcardsBackStatusBar, "Back Status Bar"), new Pair(ViewKeys.ShuffleCards, "Shuffle"), new Pair(ViewKeys.AutoplayTTS, "Auto Text-to-Speech"));

    /* JADX INFO: renamed from: a */
    public final ig8 f22959a;

    /* JADX INFO: renamed from: b */
    public final C1862a f22960b;

    /* JADX INFO: renamed from: c */
    public final hm5 f22961c;

    public C1872k(ig8 ig8Var, C1862a c1862a, hm5 hm5Var) {
        ig8Var.getClass();
        hm5Var.getClass();
        this.f22959a = ig8Var;
        this.f22960b = c1862a;
        this.f22961c = hm5Var;
    }

    /* JADX INFO: renamed from: b */
    public static Object m8640b(Map map, ViewKeys viewKeys, boolean z, zi3 zi3Var, Continuation continuation) {
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y(map);
        linkedHashMapM15372Y.put(i19.m13627a(viewKeys).name(), Boolean.valueOf(z));
        Object objInvoke = zi3Var.invoke(linkedHashMapM15372Y, continuation);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m8641a(ViewKeys viewKeys, ViewKeys viewKeys2, ContinuationImpl continuationImpl, boolean z) throws Throwable {
        UpdateReviewSettingUseCase$invoke$1 updateReviewSettingUseCase$invoke$1;
        String str;
        String str2;
        String strM17735j;
        if (continuationImpl instanceof UpdateReviewSettingUseCase$invoke$1) {
            updateReviewSettingUseCase$invoke$1 = (UpdateReviewSettingUseCase$invoke$1) continuationImpl;
            int i = updateReviewSettingUseCase$invoke$1.f22901f;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateReviewSettingUseCase$invoke$1.f22901f = i - Integer.MIN_VALUE;
            } else {
                updateReviewSettingUseCase$invoke$1 = new UpdateReviewSettingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateReviewSettingUseCase$invoke$1 = new UpdateReviewSettingUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = updateReviewSettingUseCase$invoke$1.f22899d;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateReviewSettingUseCase$invoke$1.f22901f;
        Object obj3 = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            switch (mha.f51336a[viewKeys.ordinal()]) {
                case 26:
                    str = "Flashcard";
                    str2 = (String) f22958d.get(viewKeys2);
                    if (str2 != null) {
                        strM17735j = null;
                    } else {
                        strM17735j = AbstractC3393o1.m17735j(str, " ", str2);
                    }
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    str = "Reverse Flashcard";
                    str2 = (String) f22958d.get(viewKeys2);
                    if (str2 != null) {
                        strM17735j = null;
                    } else {
                        strM17735j = AbstractC3393o1.m17735j(str, " ", str2);
                    }
                    break;
                case 28:
                    str = "Cloze Test";
                    str2 = (String) f22958d.get(viewKeys2);
                    if (str2 != null) {
                        strM17735j = null;
                    } else {
                        strM17735j = AbstractC3393o1.m17735j(str, " ", str2);
                    }
                    break;
                case 29:
                    str = "Multiple Choice";
                    str2 = (String) f22958d.get(viewKeys2);
                    if (str2 != null) {
                        strM17735j = null;
                    } else {
                        strM17735j = AbstractC3393o1.m17735j(str, " ", str2);
                    }
                    break;
                case 30:
                    str = "Dictation";
                    str2 = (String) f22958d.get(viewKeys2);
                    if (str2 != null) {
                        strM17735j = null;
                    } else {
                        strM17735j = AbstractC3393o1.m17735j(str, " ", str2);
                    }
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    str = "Speaking";
                    str2 = (String) f22958d.get(viewKeys2);
                    if (str2 != null) {
                        strM17735j = null;
                    } else {
                        strM17735j = AbstractC3393o1.m17735j(str, " ", str2);
                    }
                    break;
                default:
                    strM17735j = null;
                    break;
            }
            if (strM17735j != null) {
                ((C1240a) this.f22961c).m7025f("Review setting changed", g9a.m12429f("setting changed", strM17735j));
            }
            updateReviewSettingUseCase$invoke$1.f22896a = viewKeys;
            updateReviewSettingUseCase$invoke$1.f22897b = viewKeys2;
            updateReviewSettingUseCase$invoke$1.f22898c = z;
            updateReviewSettingUseCase$invoke$1.f22901f = 1;
            if (m8642c(viewKeys2, viewKeys, updateReviewSettingUseCase$invoke$1, z) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return obj3;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = updateReviewSettingUseCase$invoke$1.f22898c;
        viewKeys2 = updateReviewSettingUseCase$invoke$1.f22897b;
        viewKeys = updateReviewSettingUseCase$invoke$1.f22896a;
        AbstractC3193b.m15359b(obj);
        updateReviewSettingUseCase$invoke$1.f22896a = null;
        updateReviewSettingUseCase$invoke$1.f22897b = null;
        updateReviewSettingUseCase$invoke$1.f22898c = z;
        updateReviewSettingUseCase$invoke$1.f22901f = 2;
        ProfileSettingType profileSettingType = new ProfileSettingType();
        String str3 = z ? "on" : "off";
        switch (mha.f51336a[viewKeys2.ordinal()]) {
            case 1:
            case 12:
                profileSettingType.f19726j = str3;
                break;
            case 2:
            case 13:
                profileSettingType.f19723g = str3;
                break;
            case 3:
            case 14:
                profileSettingType.f19724h = str3;
                break;
            case 4:
            case 15:
                profileSettingType.f19722f = str3;
                break;
            case 5:
            case 16:
                profileSettingType.f19727k = str3;
                break;
            case 6:
            case 17:
                profileSettingType.f19732p = str3;
                break;
            case 7:
            case 18:
                profileSettingType.f19731o = str3;
                break;
            case 8:
            case 19:
                profileSettingType.f19733q = str3;
                break;
            case 9:
            case 20:
                profileSettingType.f19729m = str3;
                break;
            case 10:
            case 21:
                profileSettingType.f19734r = str3;
                break;
            case 11:
            case 22:
                profileSettingType.f19735s = str3;
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                profileSettingType.f19718b = str3;
                break;
            case 24:
                profileSettingType.f19720d = str3;
                break;
            case 25:
                profileSettingType.f19729m = str3;
                break;
        }
        Object objM8616b = this.f22960b.m8616b(viewKeys, profileSettingType, updateReviewSettingUseCase$invoke$1);
        if (objM8616b != obj2) {
            objM8616b = obj3;
        }
        return objM8616b == obj2 ? obj2 : obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:154:0x02d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x02d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m8642c(ViewKeys viewKeys, ViewKeys viewKeys2, ContinuationImpl continuationImpl, boolean z) throws Throwable {
        UpdateReviewSettingUseCase$updateStore$1 updateReviewSettingUseCase$updateStore$1;
        C1872k c1872k;
        C1872k c1872k2;
        C1872k c1872k3;
        UpdateReviewSettingUseCase$updateStore$2 updateReviewSettingUseCase$updateStore$2;
        UpdateReviewSettingUseCase$updateStore$3 updateReviewSettingUseCase$updateStore$3;
        UpdateReviewSettingUseCase$updateStore$4 updateReviewSettingUseCase$updateStore$4;
        if (continuationImpl instanceof UpdateReviewSettingUseCase$updateStore$1) {
            updateReviewSettingUseCase$updateStore$1 = (UpdateReviewSettingUseCase$updateStore$1) continuationImpl;
            int i = updateReviewSettingUseCase$updateStore$1.f22907f;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateReviewSettingUseCase$updateStore$1.f22907f = i - Integer.MIN_VALUE;
            } else {
                updateReviewSettingUseCase$updateStore$1 = new UpdateReviewSettingUseCase$updateStore$1(this, continuationImpl);
            }
        } else {
            updateReviewSettingUseCase$updateStore$1 = new UpdateReviewSettingUseCase$updateStore$1(this, continuationImpl);
        }
        Object objM15541t = updateReviewSettingUseCase$updateStore$1.f22905d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateReviewSettingUseCase$updateStore$1.f22907f;
        xfa xfaVar = xfa.f68157a;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(objM15541t);
                int i3 = mha.f51336a[viewKeys.ordinal()];
                ig8 ig8Var = this.f22959a;
                switch (i3) {
                    case 1:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 1;
                        if (((C1370c) ig8Var).m7950p(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 2:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 2;
                        if (((C1370c) ig8Var).m7947m(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 3:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 3;
                        if (((C1370c) ig8Var).m7951q(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 4:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 4;
                        if (((C1370c) ig8Var).m7948n(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 5:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 5;
                        if (((C1370c) ig8Var).m7949o(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 6:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 6;
                        if (((C1370c) ig8Var).m7945k(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 7:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 7;
                        if (((C1370c) ig8Var).m7942h(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 8:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 8;
                        if (((C1370c) ig8Var).m7946l(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 9:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 9;
                        if (((C1370c) ig8Var).m7943i(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 10:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 10;
                        if (((C1370c) ig8Var).m7944j(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 11:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 11;
                        if (((C1370c) ig8Var).m7941g(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 12:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 12;
                        if (((C1370c) ig8Var).m7927B(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 13:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 13;
                        if (((C1370c) ig8Var).m7959y(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 14:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 14;
                        if (((C1370c) ig8Var).m7928C(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 15:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 15;
                        if (((C1370c) ig8Var).m7960z(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 16:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 16;
                        if (((C1370c) ig8Var).m7926A(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 17:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 17;
                        if (((C1370c) ig8Var).m7957w(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 18:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 18;
                        if (((C1370c) ig8Var).m7954t(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 19:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 19;
                        if (((C1370c) ig8Var).m7958x(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 20:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 20;
                        if (((C1370c) ig8Var).m7955u(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 21:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 21;
                        if (((C1370c) ig8Var).m7956v(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case 22:
                        updateReviewSettingUseCase$updateStore$1.f22902a = null;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 22;
                        if (((C1370c) ig8Var).m7953s(z, updateReviewSettingUseCase$updateStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return xfaVar;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        c83 c83Var = ((C1370c) ig8Var).f18500L;
                        updateReviewSettingUseCase$updateStore$1.f22902a = viewKeys2;
                        updateReviewSettingUseCase$updateStore$1.f22903b = this;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 23;
                        objM15541t = AbstractC3224d.m15541t(c83Var, updateReviewSettingUseCase$updateStore$1);
                        if (objM15541t != coroutineSingletons) {
                            c1872k = this;
                            updateReviewSettingUseCase$updateStore$2 = new UpdateReviewSettingUseCase$updateStore$2(this, null);
                            updateReviewSettingUseCase$updateStore$1.f22902a = null;
                            updateReviewSettingUseCase$updateStore$1.f22903b = null;
                            updateReviewSettingUseCase$updateStore$1.f22904c = z;
                            updateReviewSettingUseCase$updateStore$1.f22907f = 24;
                            c1872k.getClass();
                            if (m8640b((Map) objM15541t, viewKeys2, z, updateReviewSettingUseCase$updateStore$2, updateReviewSettingUseCase$updateStore$1) != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 24:
                        c83 c83Var2 = ((C1370c) ig8Var).f18552s0;
                        updateReviewSettingUseCase$updateStore$1.f22902a = viewKeys2;
                        updateReviewSettingUseCase$updateStore$1.f22903b = this;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 25;
                        objM15541t = AbstractC3224d.m15541t(c83Var2, updateReviewSettingUseCase$updateStore$1);
                        if (objM15541t != coroutineSingletons) {
                            c1872k2 = this;
                            updateReviewSettingUseCase$updateStore$3 = new UpdateReviewSettingUseCase$updateStore$3(this, null);
                            updateReviewSettingUseCase$updateStore$1.f22902a = null;
                            updateReviewSettingUseCase$updateStore$1.f22903b = null;
                            updateReviewSettingUseCase$updateStore$1.f22904c = z;
                            updateReviewSettingUseCase$updateStore$1.f22907f = 26;
                            c1872k2.getClass();
                            if (m8640b((Map) objM15541t, viewKeys2, z, updateReviewSettingUseCase$updateStore$3, updateReviewSettingUseCase$updateStore$1) != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    case 25:
                        c83 c83Var3 = ((C1370c) ig8Var).f18554t0;
                        updateReviewSettingUseCase$updateStore$1.f22902a = viewKeys2;
                        updateReviewSettingUseCase$updateStore$1.f22903b = this;
                        updateReviewSettingUseCase$updateStore$1.f22904c = z;
                        updateReviewSettingUseCase$updateStore$1.f22907f = 27;
                        objM15541t = AbstractC3224d.m15541t(c83Var3, updateReviewSettingUseCase$updateStore$1);
                        if (objM15541t != coroutineSingletons) {
                            c1872k3 = this;
                            updateReviewSettingUseCase$updateStore$4 = new UpdateReviewSettingUseCase$updateStore$4(this, null);
                            updateReviewSettingUseCase$updateStore$1.f22902a = null;
                            updateReviewSettingUseCase$updateStore$1.f22903b = null;
                            updateReviewSettingUseCase$updateStore$1.f22904c = z;
                            updateReviewSettingUseCase$updateStore$1.f22907f = 28;
                            c1872k3.getClass();
                            if (m8640b((Map) objM15541t, viewKeys2, z, updateReviewSettingUseCase$updateStore$4, updateReviewSettingUseCase$updateStore$1) != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                        return coroutineSingletons;
                    default:
                        return xfaVar;
                }
            case 1:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 2:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 3:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 4:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 5:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 6:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 7:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 8:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 9:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 10:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 11:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 12:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 13:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 14:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 15:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 16:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 17:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 18:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 19:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 20:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 21:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 22:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                z = updateReviewSettingUseCase$updateStore$1.f22904c;
                c1872k = updateReviewSettingUseCase$updateStore$1.f22903b;
                viewKeys2 = updateReviewSettingUseCase$updateStore$1.f22902a;
                AbstractC3193b.m15359b(objM15541t);
                updateReviewSettingUseCase$updateStore$2 = new UpdateReviewSettingUseCase$updateStore$2(this, null);
                updateReviewSettingUseCase$updateStore$1.f22902a = null;
                updateReviewSettingUseCase$updateStore$1.f22903b = null;
                updateReviewSettingUseCase$updateStore$1.f22904c = z;
                updateReviewSettingUseCase$updateStore$1.f22907f = 24;
                c1872k.getClass();
                if (m8640b((Map) objM15541t, viewKeys2, z, updateReviewSettingUseCase$updateStore$2, updateReviewSettingUseCase$updateStore$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 24:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 25:
                z = updateReviewSettingUseCase$updateStore$1.f22904c;
                c1872k2 = updateReviewSettingUseCase$updateStore$1.f22903b;
                viewKeys2 = updateReviewSettingUseCase$updateStore$1.f22902a;
                AbstractC3193b.m15359b(objM15541t);
                updateReviewSettingUseCase$updateStore$3 = new UpdateReviewSettingUseCase$updateStore$3(this, null);
                updateReviewSettingUseCase$updateStore$1.f22902a = null;
                updateReviewSettingUseCase$updateStore$1.f22903b = null;
                updateReviewSettingUseCase$updateStore$1.f22904c = z;
                updateReviewSettingUseCase$updateStore$1.f22907f = 26;
                c1872k2.getClass();
                if (m8640b((Map) objM15541t, viewKeys2, z, updateReviewSettingUseCase$updateStore$3, updateReviewSettingUseCase$updateStore$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 26:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                z = updateReviewSettingUseCase$updateStore$1.f22904c;
                c1872k3 = updateReviewSettingUseCase$updateStore$1.f22903b;
                viewKeys2 = updateReviewSettingUseCase$updateStore$1.f22902a;
                AbstractC3193b.m15359b(objM15541t);
                updateReviewSettingUseCase$updateStore$4 = new UpdateReviewSettingUseCase$updateStore$4(this, null);
                updateReviewSettingUseCase$updateStore$1.f22902a = null;
                updateReviewSettingUseCase$updateStore$1.f22903b = null;
                updateReviewSettingUseCase$updateStore$1.f22904c = z;
                updateReviewSettingUseCase$updateStore$1.f22907f = 28;
                c1872k3.getClass();
                if (m8640b((Map) objM15541t, viewKeys2, z, updateReviewSettingUseCase$updateStore$4, updateReviewSettingUseCase$updateStore$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 28:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
