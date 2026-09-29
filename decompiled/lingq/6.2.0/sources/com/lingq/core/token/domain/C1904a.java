package com.lingq.core.token.domain;

import android.content.SharedPreferences;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1293i;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.database.entity.LanguageCardsTagsEntity;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.token.TokenPopupData;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.C3509qs;
import p000.ao0;
import p000.c83;
import p000.fa4;
import p000.kk8;
import p000.kp4;
import p000.lm4;
import p000.ml4;
import p000.ol4;
import p000.s7b;
import p000.si7;
import p000.u91;
import p000.ul4;
import p000.vk9;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.token.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1904a {

    /* JADX INFO: renamed from: a */
    public final Object f23855a;

    /* JADX INFO: renamed from: b */
    public final Object f23856b;

    public C1904a(ao0 ao0Var, lm4 lm4Var) {
        ao0Var.getClass();
        lm4Var.getClass();
        this.f23855a = ao0Var;
        this.f23856b = lm4Var;
    }

    /* JADX INFO: renamed from: a */
    public kk8 m8710a(String str, TokenPopupData tokenPopupData) {
        str.getClass();
        tokenPopupData.getClass();
        return new kk8(new GetTokenDetailsUseCase$invoke$1(this, str, tokenPopupData, null));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x019d  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: b */
    public Object m8711b(String str, int i, Integer num, String str2, String str3, int i2, int i3, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ExplainTokenUseCase$invoke$1 explainTokenUseCase$invoke$1;
        String str4;
        int i4;
        int i5;
        boolean z2;
        Integer num2;
        int i6;
        String str5;
        String str6;
        String explainName;
        int size;
        ExplainTokenUseCase$invoke$1 explainTokenUseCase$invoke$2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        String str7;
        String str8;
        String str9;
        ao0 ao0Var = (ao0) this.f23855a;
        if (continuationImpl instanceof ExplainTokenUseCase$invoke$1) {
            explainTokenUseCase$invoke$1 = (ExplainTokenUseCase$invoke$1) continuationImpl;
            int i10 = explainTokenUseCase$invoke$1.f23741J;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                explainTokenUseCase$invoke$1.f23741J = i10 - Integer.MIN_VALUE;
            } else {
                explainTokenUseCase$invoke$1 = new ExplainTokenUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            explainTokenUseCase$invoke$1 = new ExplainTokenUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7114d = explainTokenUseCase$invoke$1.f23739H;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = explainTokenUseCase$invoke$1.f23741J;
        if (i11 == 0) {
            AbstractC3193b.m15359b(objM7114d);
            c83 c83Var = ((C1368a) ((si7) this.f23856b)).f18407f1;
            explainTokenUseCase$invoke$1.f23742a = str;
            explainTokenUseCase$invoke$1.f23743b = num;
            explainTokenUseCase$invoke$1.f23744c = str2;
            str4 = str3;
            explainTokenUseCase$invoke$1.f23745d = str4;
            i4 = i;
            explainTokenUseCase$invoke$1.f23747f = i4;
            i5 = i2;
            explainTokenUseCase$invoke$1.f23748g = i5;
            explainTokenUseCase$invoke$1.f23749h = i3;
            explainTokenUseCase$invoke$1.f23753l = z;
            explainTokenUseCase$invoke$1.f23741J = 1;
            Object objM15541t = AbstractC3224d.m15541t(c83Var, explainTokenUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
                objM7114d = objM15541t;
                z2 = z;
                num2 = num;
                i6 = i3;
                str5 = str2;
                str6 = str;
            }
            return coroutineSingletons;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                i8 = explainTokenUseCase$invoke$1.f23752k;
                i6 = explainTokenUseCase$invoke$1.f23751j;
                size = explainTokenUseCase$invoke$1.f23750i;
                boolean z4 = explainTokenUseCase$invoke$1.f23753l;
                i9 = explainTokenUseCase$invoke$1.f23749h;
                i7 = explainTokenUseCase$invoke$1.f23748g;
                i4 = explainTokenUseCase$invoke$1.f23747f;
                str7 = explainTokenUseCase$invoke$1.f23744c;
                str8 = explainTokenUseCase$invoke$1.f23742a;
                AbstractC3193b.m15359b(objM7114d);
                explainTokenUseCase$invoke$2 = explainTokenUseCase$invoke$1;
                z3 = z4;
                str9 = (String) objM7114d;
                if (str9 != null) {
                    explainTokenUseCase$invoke$2.f23742a = null;
                    explainTokenUseCase$invoke$2.f23743b = null;
                    explainTokenUseCase$invoke$2.f23744c = null;
                    explainTokenUseCase$invoke$2.f23745d = null;
                    explainTokenUseCase$invoke$2.f23746e = str9;
                    explainTokenUseCase$invoke$2.f23747f = i4;
                    explainTokenUseCase$invoke$2.f23748g = i7;
                    explainTokenUseCase$invoke$2.f23749h = i9;
                    explainTokenUseCase$invoke$2.f23753l = z3;
                    explainTokenUseCase$invoke$2.f23750i = size;
                    explainTokenUseCase$invoke$2.f23751j = i6;
                    explainTokenUseCase$invoke$2.f23752k = i8;
                    explainTokenUseCase$invoke$2.f23741J = 4;
                    if (((C1287c) ao0Var).m7132v(str8, str7, str9, explainTokenUseCase$invoke$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return str9;
            }
            if (i11 != 3) {
                if (i11 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str10 = explainTokenUseCase$invoke$1.f23746e;
                AbstractC3193b.m15359b(objM7114d);
                return str10;
            }
            i8 = explainTokenUseCase$invoke$1.f23752k;
            i6 = explainTokenUseCase$invoke$1.f23751j;
            size = explainTokenUseCase$invoke$1.f23750i;
            boolean z5 = explainTokenUseCase$invoke$1.f23753l;
            i9 = explainTokenUseCase$invoke$1.f23749h;
            i7 = explainTokenUseCase$invoke$1.f23748g;
            i4 = explainTokenUseCase$invoke$1.f23747f;
            str7 = explainTokenUseCase$invoke$1.f23744c;
            str8 = explainTokenUseCase$invoke$1.f23742a;
            AbstractC3193b.m15359b(objM7114d);
            explainTokenUseCase$invoke$2 = explainTokenUseCase$invoke$1;
            z3 = z5;
            str9 = (String) objM7114d;
            if (str9 != null && !vk9.m23391n0(str9)) {
                explainTokenUseCase$invoke$2.f23742a = null;
                explainTokenUseCase$invoke$2.f23743b = null;
                explainTokenUseCase$invoke$2.f23744c = null;
                explainTokenUseCase$invoke$2.f23745d = null;
                explainTokenUseCase$invoke$2.f23746e = str9;
                explainTokenUseCase$invoke$2.f23747f = i4;
                explainTokenUseCase$invoke$2.f23748g = i7;
                explainTokenUseCase$invoke$2.f23749h = i9;
                explainTokenUseCase$invoke$2.f23753l = z3;
                explainTokenUseCase$invoke$2.f23750i = size;
                explainTokenUseCase$invoke$2.f23751j = i6;
                explainTokenUseCase$invoke$2.f23752k = i8;
                explainTokenUseCase$invoke$2.f23741J = 4;
                if (((C1287c) ao0Var).m7132v(str8, str7, str9, explainTokenUseCase$invoke$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return str9;
        }
        z2 = explainTokenUseCase$invoke$1.f23753l;
        i6 = explainTokenUseCase$invoke$1.f23749h;
        int i12 = explainTokenUseCase$invoke$1.f23748g;
        i4 = explainTokenUseCase$invoke$1.f23747f;
        String str11 = explainTokenUseCase$invoke$1.f23745d;
        str5 = explainTokenUseCase$invoke$1.f23744c;
        num2 = explainTokenUseCase$invoke$1.f23743b;
        str6 = explainTokenUseCase$invoke$1.f23742a;
        AbstractC3193b.m15359b(objM7114d);
        i5 = i12;
        str4 = str11;
        Map map = (Map) ((Map) objM7114d).get(str6);
        LearningLevel learningLevel = map != null ? (LearningLevel) AbstractC3184kh.m15221o(map).f47623a : null;
        if (learningLevel == null || (explainName = learningLevel.getExplainName()) == null) {
            explainName = LearningLevel.Beginner1.getExplainName();
        }
        if (z2) {
            size = new Regex("\\s+").m15429h(vk9.m23376L0(str4).toString()).size();
            if (size < 1) {
                size = 1;
            }
        } else {
            size = 1;
        }
        int i13 = (i6 + size) - 1;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            explainTokenUseCase$invoke$1.f23742a = str6;
            explainTokenUseCase$invoke$1.f23743b = null;
            explainTokenUseCase$invoke$1.f23744c = str5;
            explainTokenUseCase$invoke$1.f23745d = null;
            explainTokenUseCase$invoke$1.f23747f = i4;
            explainTokenUseCase$invoke$1.f23748g = i5;
            explainTokenUseCase$invoke$1.f23749h = i6;
            explainTokenUseCase$invoke$1.f23753l = z2;
            explainTokenUseCase$invoke$1.f23750i = size;
            explainTokenUseCase$invoke$1.f23751j = i6;
            explainTokenUseCase$invoke$1.f23752k = i13;
            explainTokenUseCase$invoke$1.f23741J = 2;
            ExplainTokenUseCase$invoke$1 explainTokenUseCase$invoke$3 = explainTokenUseCase$invoke$1;
            int i14 = i5;
            objM7114d = ((C1287c) ao0Var).m7115e(str6, i4, iIntValue, i14, i6, i13, explainName, explainTokenUseCase$invoke$3);
            i7 = i14;
            explainTokenUseCase$invoke$2 = explainTokenUseCase$invoke$3;
            if (objM7114d != coroutineSingletons) {
                z3 = z2;
                i8 = i13;
                i9 = i6;
                str7 = str5;
                str8 = str6;
                str9 = (String) objM7114d;
                if (str9 != null) {
                    explainTokenUseCase$invoke$2.f23742a = null;
                    explainTokenUseCase$invoke$2.f23743b = null;
                    explainTokenUseCase$invoke$2.f23744c = null;
                    explainTokenUseCase$invoke$2.f23745d = null;
                    explainTokenUseCase$invoke$2.f23746e = str9;
                    explainTokenUseCase$invoke$2.f23747f = i4;
                    explainTokenUseCase$invoke$2.f23748g = i7;
                    explainTokenUseCase$invoke$2.f23749h = i9;
                    explainTokenUseCase$invoke$2.f23753l = z3;
                    explainTokenUseCase$invoke$2.f23750i = size;
                    explainTokenUseCase$invoke$2.f23751j = i6;
                    explainTokenUseCase$invoke$2.f23752k = i8;
                    explainTokenUseCase$invoke$2.f23741J = 4;
                    if (((C1287c) ao0Var).m7132v(str8, str7, str9, explainTokenUseCase$invoke$2) == coroutineSingletons) {
                    }
                }
                return str9;
            }
        } else {
            explainTokenUseCase$invoke$2 = explainTokenUseCase$invoke$1;
            i7 = i5;
            explainTokenUseCase$invoke$2.f23742a = str6;
            explainTokenUseCase$invoke$2.f23743b = null;
            explainTokenUseCase$invoke$2.f23744c = str5;
            explainTokenUseCase$invoke$2.f23745d = null;
            explainTokenUseCase$invoke$2.f23747f = i4;
            explainTokenUseCase$invoke$2.f23748g = i7;
            explainTokenUseCase$invoke$2.f23749h = i6;
            explainTokenUseCase$invoke$2.f23753l = z2;
            explainTokenUseCase$invoke$2.f23750i = size;
            explainTokenUseCase$invoke$2.f23751j = i6;
            explainTokenUseCase$invoke$2.f23752k = i13;
            explainTokenUseCase$invoke$2.f23741J = 3;
            objM7114d = ((C1287c) ao0Var).m7114d(i4, i7, i6, i13, str6, explainName, explainTokenUseCase$invoke$2);
            if (objM7114d != coroutineSingletons) {
                z3 = z2;
                i8 = i13;
                i9 = i6;
                str7 = str5;
                str8 = str6;
                str9 = (String) objM7114d;
                if (str9 != null) {
                    explainTokenUseCase$invoke$2.f23742a = null;
                    explainTokenUseCase$invoke$2.f23743b = null;
                    explainTokenUseCase$invoke$2.f23744c = null;
                    explainTokenUseCase$invoke$2.f23745d = null;
                    explainTokenUseCase$invoke$2.f23746e = str9;
                    explainTokenUseCase$invoke$2.f23747f = i4;
                    explainTokenUseCase$invoke$2.f23748g = i7;
                    explainTokenUseCase$invoke$2.f23749h = i9;
                    explainTokenUseCase$invoke$2.f23753l = z3;
                    explainTokenUseCase$invoke$2.f23750i = size;
                    explainTokenUseCase$invoke$2.f23751j = i6;
                    explainTokenUseCase$invoke$2.f23752k = i8;
                    explainTokenUseCase$invoke$2.f23741J = 4;
                    if (((C1287c) ao0Var).m7132v(str8, str7, str9, explainTokenUseCase$invoke$2) == coroutineSingletons) {
                    }
                }
                return str9;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: c */
    public Object m8712c(String str, String str2, String str3, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        UpdateUserTagUseCase$invoke$1 updateUserTagUseCase$invoke$1;
        boolean z2;
        String str4;
        String str5;
        kp4 kp4Var;
        List list;
        Object objM2861d;
        String str6 = str;
        String str7 = str3;
        lm4 lm4Var = (lm4) this.f23856b;
        if (continuationImpl instanceof UpdateUserTagUseCase$invoke$1) {
            updateUserTagUseCase$invoke$1 = (UpdateUserTagUseCase$invoke$1) continuationImpl;
            int i = updateUserTagUseCase$invoke$1.f23850f;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateUserTagUseCase$invoke$1.f23850f = i - Integer.MIN_VALUE;
            } else {
                updateUserTagUseCase$invoke$1 = new UpdateUserTagUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateUserTagUseCase$invoke$1 = new UpdateUserTagUseCase$invoke$1(this, continuationImpl);
        }
        Object objM2861d2 = updateUserTagUseCase$invoke$1.f23848d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateUserTagUseCase$invoke$1.f23850f;
        xfa xfaVar = xfa.f68157a;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2861d2);
            ao0 ao0Var = (ao0) this.f23855a;
            if (z) {
                updateUserTagUseCase$invoke$1.f23845a = str6;
                updateUserTagUseCase$invoke$1.f23846b = str7;
                updateUserTagUseCase$invoke$1.f23847c = z;
                updateUserTagUseCase$invoke$1.f23850f = 1;
                if (((C1287c) ao0Var).m7119i(str6, str2, str7, updateUserTagUseCase$invoke$1) != coroutineSingletons) {
                    z2 = z;
                }
            } else {
                updateUserTagUseCase$invoke$1.f23845a = null;
                updateUserTagUseCase$invoke$1.f23846b = null;
                updateUserTagUseCase$invoke$1.f23847c = z;
                updateUserTagUseCase$invoke$1.f23850f = 4;
                if (((C1287c) ao0Var).m7125o(str6, str2, str7, updateUserTagUseCase$invoke$1) != coroutineSingletons) {
                    return xfaVar;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z2 = updateUserTagUseCase$invoke$1.f23847c;
            String str8 = updateUserTagUseCase$invoke$1.f23846b;
            String str9 = updateUserTagUseCase$invoke$1.f23845a;
            AbstractC3193b.m15359b(objM2861d2);
            str7 = str8;
            str6 = str9;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM2861d2);
                    return xfaVar;
                }
                if (i2 == 4) {
                    AbstractC3193b.m15359b(objM2861d2);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = updateUserTagUseCase$invoke$1.f23847c;
            str5 = updateUserTagUseCase$invoke$1.f23846b;
            str4 = updateUserTagUseCase$invoke$1.f23845a;
            AbstractC3193b.m15359b(objM2861d2);
        }
        kp4Var = (kp4) objM2861d2;
        if (kp4Var != null) {
            list = kp4Var.f48282b;
            if (!list.contains(str5)) {
                List listM22622n1 = u91.m22622n1(AbstractC3489q9.m19765B(u91.m22626r1(list), str5));
                updateUserTagUseCase$invoke$1.f23845a = null;
                updateUserTagUseCase$invoke$1.f23846b = null;
                updateUserTagUseCase$invoke$1.f23847c = z2;
                updateUserTagUseCase$invoke$1.f23850f = 3;
                ul4 ul4Var = ((C1293i) lm4Var).f16489b;
                LanguageCardsTagsEntity languageCardsTagsEntity = new LanguageCardsTagsEntity(str4, listM22622n1);
                objM2861d = AbstractC0758a.m2861d(new ml4(ul4Var, languageCardsTagsEntity, i3), ul4Var.f64042K, updateUserTagUseCase$invoke$1, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return xfaVar;
        updateUserTagUseCase$invoke$1.f23845a = str6;
        updateUserTagUseCase$invoke$1.f23846b = str7;
        updateUserTagUseCase$invoke$1.f23847c = z2;
        updateUserTagUseCase$invoke$1.f23850f = 2;
        ul4 ul4Var2 = ((C1293i) lm4Var).f16489b;
        objM2861d2 = AbstractC0758a.m2861d(new ol4(str6, ul4Var2, 0), ul4Var2.f64042K, updateUserTagUseCase$invoke$1, true, false);
        if (objM2861d2 != coroutineSingletons) {
            str4 = str6;
            str5 = str7;
            kp4Var = (kp4) objM2861d2;
            if (kp4Var != null) {
                list = kp4Var.f48282b;
                if (!list.contains(str5)) {
                    List listM22622n2 = u91.m22622n1(AbstractC3489q9.m19765B(u91.m22626r1(list), str5));
                    updateUserTagUseCase$invoke$1.f23845a = null;
                    updateUserTagUseCase$invoke$1.f23846b = null;
                    updateUserTagUseCase$invoke$1.f23847c = z2;
                    updateUserTagUseCase$invoke$1.f23850f = 3;
                    ul4 ul4Var3 = ((C1293i) lm4Var).f16489b;
                    LanguageCardsTagsEntity languageCardsTagsEntity2 = new LanguageCardsTagsEntity(str4, listM22622n2);
                    objM2861d = AbstractC0758a.m2861d(new ml4(ul4Var3, languageCardsTagsEntity2, i3), ul4Var3.f64042K, updateUserTagUseCase$invoke$1, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d == coroutineSingletons) {
                    }
                }
            }
            return xfaVar;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    public Serializable m8713d(int i, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        UpdateWordStatusUseCase$invoke$1 updateWordStatusUseCase$invoke$1;
        String str4;
        if (continuationImpl instanceof UpdateWordStatusUseCase$invoke$1) {
            updateWordStatusUseCase$invoke$1 = (UpdateWordStatusUseCase$invoke$1) continuationImpl;
            int i2 = updateWordStatusUseCase$invoke$1.f23854d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateWordStatusUseCase$invoke$1.f23854d = i2 - Integer.MIN_VALUE;
            } else {
                updateWordStatusUseCase$invoke$1 = new UpdateWordStatusUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateWordStatusUseCase$invoke$1 = new UpdateWordStatusUseCase$invoke$1(this, continuationImpl);
        }
        UpdateWordStatusUseCase$invoke$1 updateWordStatusUseCase$invoke$2 = updateWordStatusUseCase$invoke$1;
        Object obj = updateWordStatusUseCase$invoke$2.f23852b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = updateWordStatusUseCase$invoke$2.f23854d;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                s7b s7bVar = (s7b) this.f23855a;
                updateWordStatusUseCase$invoke$2.f23851a = str3;
                updateWordStatusUseCase$invoke$2.f23854d = 1;
                if (((C1310z) s7bVar).m7429h(i, str, str2, str3, "", updateWordStatusUseCase$invoke$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str4 = str3;
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = updateWordStatusUseCase$invoke$2.f23851a;
                AbstractC3193b.m15359b(obj);
            }
            if (fa4.m11650l(str4, WordStatus.Known.getValue())) {
                C3509qs c3509qs = (C3509qs) this.f23856b;
                int i4 = c3509qs.f58118b.getInt("tutorial_known_words", 0) + 1;
                SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
                editorEdit.getClass();
                editorEdit.putInt("tutorial_known_words", i4);
                editorEdit.apply();
            }
            return Boolean.TRUE;
        } catch (Exception e) {
            return new Result.Failure(e);
        }
    }

    public C1904a(s7b s7bVar, C3509qs c3509qs) {
        s7bVar.getClass();
        c3509qs.getClass();
        this.f23855a = s7bVar;
        this.f23856b = c3509qs;
    }

    public C1904a(ao0 ao0Var, si7 si7Var) {
        ao0Var.getClass();
        si7Var.getClass();
        this.f23855a = ao0Var;
        this.f23856b = si7Var;
    }

    public C1904a(ao0 ao0Var, s7b s7bVar) {
        ao0Var.getClass();
        s7bVar.getClass();
        this.f23855a = ao0Var;
        this.f23856b = s7bVar;
    }
}
