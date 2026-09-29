package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.domain.model.token.C1487c;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import com.lingq.core.network.api.result.AbstractC1737t4;
import com.lingq.core.network.api.result.ResultTtsUtterance;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.C3386nv;
import p000.c32;
import p000.cda;
import p000.e83;
import p000.ql4;
import p000.r3a;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.zca;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl$fetchUtterance$2", m4291f = "TtsRepositoryImpl.kt", m4292l = {423, 425, 427, 434, 436, 436}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsRepositoryImpl$fetchUtterance$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Locale f16233a;

    /* JADX INFO: renamed from: b */
    public String f16234b;

    /* JADX INFO: renamed from: c */
    public e83 f16235c;

    /* JADX INFO: renamed from: d */
    public int f16236d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16237e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f16238f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f16239g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TextToSpeechAppVoice f16240h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1307w f16241i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchUtterance$2(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice, C1307w c1307w, Continuation continuation) {
        super(2, continuation);
        this.f16238f = str;
        this.f16239g = str2;
        this.f16240h = textToSpeechAppVoice;
        this.f16241i = c1307w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TtsRepositoryImpl$fetchUtterance$2 ttsRepositoryImpl$fetchUtterance$2 = new TtsRepositoryImpl$fetchUtterance$2(this.f16238f, this.f16239g, this.f16240h, this.f16241i, continuation);
        ttsRepositoryImpl$fetchUtterance$2.f16237e = obj;
        return ttsRepositoryImpl$fetchUtterance$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsRepositoryImpl$fetchUtterance$2) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0126 A[PHI: r0 r8 r12
      0x0126: PHI (r0v17 java.lang.Object) = (r0v15 java.lang.Object), (r0v19 java.lang.Object) binds: [B:39:0x0123, B:6:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r8v2 e83) = (r8v1 e83), (r8v3 e83) binds: [B:39:0x0123, B:6:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r12v8 ??) = (r12v10 ??), (r12v9 ??) binds: [B:39:0x0123, B:6:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0138 A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.lang.String, java.util.Locale] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [e83, java.lang.Object, java.lang.String, java.util.Locale] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM2861d;
        Locale locale;
        String str;
        TextToSpeechTokenUtterance textToSpeechTokenUtterance;
        int size;
        String str2;
        String str3;
        Locale locale2;
        Object objM4549b;
        Locale locale3;
        Object objM2861d2;
        String str4;
        ?? r12;
        Object objM2861d3;
        ?? r13;
        C1307w c1307w = this.f16241i;
        zca zcaVar = c1307w.f16564b;
        e83 e83Var = (e83) this.f16237e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16236d;
        int i2 = 29;
        xfa xfaVar = xfa.f68157a;
        String str5 = this.f16239g;
        TextToSpeechAppVoice textToSpeechAppVoice = this.f16240h;
        String str6 = this.f16238f;
        switch (i) {
            case 0:
                AbstractC3193b.m15359b(obj);
                Locale localeForLanguageTag = Locale.forLanguageTag(str6);
                C1487c c1487c = TextToSpeechTokenUtterance.Companion;
                localeForLanguageTag.getClass();
                String str7 = textToSpeechAppVoice.f19564b;
                String str8 = textToSpeechAppVoice.f19563a;
                c1487c.getClass();
                String strM8136a = C1487c.m8136a(localeForLanguageTag, str6, str5, str7, str8);
                this.f16237e = e83Var;
                this.f16233a = localeForLanguageTag;
                this.f16234b = strM8136a;
                this.f16236d = 1;
                objM2861d = AbstractC0758a.m2861d(new ql4(strM8136a, i2), zcaVar.f71369K, this, true, false);
                if (objM2861d != coroutineSingletons) {
                    locale = localeForLanguageTag;
                    str = strM8136a;
                    textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objM2861d;
                    if (textToSpeechTokenUtterance != null) {
                        this.f16237e = null;
                        this.f16233a = null;
                        this.f16234b = null;
                        this.f16236d = 2;
                        if (e83Var.emit(textToSpeechTokenUtterance, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    } else {
                        cda cdaVar = c1307w.f16565c;
                        String str9 = textToSpeechAppVoice.f19564b;
                        String str10 = textToSpeechAppVoice.f19563a;
                        size = new Regex("\\s+").m15429h(vk9.m23376L0(str5).toString()).size();
                        if (size <= 1) {
                            str2 = "word";
                        } else if (size <= 4) {
                            str2 = "phrase";
                        } else {
                            str2 = "sentence";
                        }
                        this.f16237e = e83Var;
                        this.f16233a = locale;
                        this.f16234b = str;
                        this.f16236d = 3;
                        str3 = str;
                        locale2 = null;
                        objM4549b = cdaVar.m4549b(this.f16238f, str5, str9, str10, str2, this);
                        if (objM4549b != coroutineSingletons) {
                            locale3 = locale;
                            locale3.getClass();
                            List listM23604J = vz1.m23604J(AbstractC1737t4.m8407a((ResultTtsUtterance) objM4549b, locale3, str5, str6));
                            this.f16237e = e83Var;
                            this.f16233a = locale2;
                            this.f16234b = str3;
                            this.f16236d = 4;
                            objM2861d2 = AbstractC0758a.m2861d(new r3a(8, zcaVar, listM23604J), zcaVar.f71369K, this, false, true);
                            if (objM2861d2 != coroutineSingletons) {
                                objM2861d2 = xfaVar;
                            }
                            if (objM2861d2 != coroutineSingletons) {
                                str4 = str3;
                                r12 = locale2;
                                this.f16237e = r12;
                                this.f16233a = r12;
                                this.f16234b = r12;
                                this.f16235c = e83Var;
                                this.f16236d = 5;
                                objM2861d3 = AbstractC0758a.m2861d(new ql4(str4, 29), zcaVar.f71369K, this, true, false);
                                r13 = r12;
                                if (objM2861d3 != coroutineSingletons) {
                                    this.f16237e = r13;
                                    this.f16233a = r13;
                                    this.f16234b = r13;
                                    this.f16235c = r13;
                                    this.f16236d = 6;
                                    if (e83Var.emit(objM2861d3, this) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                str = this.f16234b;
                Locale locale4 = this.f16233a;
                AbstractC3193b.m15359b(obj);
                locale = locale4;
                objM2861d = obj;
                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objM2861d;
                if (textToSpeechTokenUtterance != null) {
                    this.f16237e = null;
                    this.f16233a = null;
                    this.f16234b = null;
                    this.f16236d = 2;
                    if (e83Var.emit(textToSpeechTokenUtterance, this) == coroutineSingletons) {
                        return xfaVar;
                    }
                } else {
                    cda cdaVar2 = c1307w.f16565c;
                    String str11 = textToSpeechAppVoice.f19564b;
                    String str12 = textToSpeechAppVoice.f19563a;
                    size = new Regex("\\s+").m15429h(vk9.m23376L0(str5).toString()).size();
                    if (size <= 1) {
                        str2 = "word";
                    } else if (size <= 4) {
                        str2 = "phrase";
                    } else {
                        str2 = "sentence";
                    }
                    this.f16237e = e83Var;
                    this.f16233a = locale;
                    this.f16234b = str;
                    this.f16236d = 3;
                    str3 = str;
                    locale2 = null;
                    objM4549b = cdaVar2.m4549b(this.f16238f, str5, str11, str12, str2, this);
                    if (objM4549b != coroutineSingletons) {
                        locale3 = locale;
                        locale3.getClass();
                        List listM23604J2 = vz1.m23604J(AbstractC1737t4.m8407a((ResultTtsUtterance) objM4549b, locale3, str5, str6));
                        this.f16237e = e83Var;
                        this.f16233a = locale2;
                        this.f16234b = str3;
                        this.f16236d = 4;
                        objM2861d2 = AbstractC0758a.m2861d(new r3a(8, zcaVar, listM23604J2), zcaVar.f71369K, this, false, true);
                        if (objM2861d2 != coroutineSingletons) {
                            objM2861d2 = xfaVar;
                        }
                        if (objM2861d2 != coroutineSingletons) {
                            str4 = str3;
                            r12 = locale2;
                            this.f16237e = r12;
                            this.f16233a = r12;
                            this.f16234b = r12;
                            this.f16235c = e83Var;
                            this.f16236d = 5;
                            objM2861d3 = AbstractC0758a.m2861d(new ql4(str4, 29), zcaVar.f71369K, this, true, false);
                            r13 = r12;
                            if (objM2861d3 != coroutineSingletons) {
                                this.f16237e = r13;
                                this.f16233a = r13;
                                this.f16234b = r13;
                                this.f16235c = r13;
                                this.f16236d = 6;
                                if (e83Var.emit(objM2861d3, this) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
            case 6:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 3:
                String str13 = this.f16234b;
                locale3 = this.f16233a;
                AbstractC3193b.m15359b(obj);
                str3 = str13;
                locale2 = null;
                objM4549b = obj;
                locale3.getClass();
                List listM23604J3 = vz1.m23604J(AbstractC1737t4.m8407a((ResultTtsUtterance) objM4549b, locale3, str5, str6));
                this.f16237e = e83Var;
                this.f16233a = locale2;
                this.f16234b = str3;
                this.f16236d = 4;
                objM2861d2 = AbstractC0758a.m2861d(new r3a(8, zcaVar, listM23604J3), zcaVar.f71369K, this, false, true);
                if (objM2861d2 != coroutineSingletons) {
                    objM2861d2 = xfaVar;
                }
                if (objM2861d2 != coroutineSingletons) {
                    str4 = str3;
                    r12 = locale2;
                    this.f16237e = r12;
                    this.f16233a = r12;
                    this.f16234b = r12;
                    this.f16235c = e83Var;
                    this.f16236d = 5;
                    objM2861d3 = AbstractC0758a.m2861d(new ql4(str4, 29), zcaVar.f71369K, this, true, false);
                    r13 = r12;
                    if (objM2861d3 != coroutineSingletons) {
                        this.f16237e = r13;
                        this.f16233a = r13;
                        this.f16234b = r13;
                        this.f16235c = r13;
                        this.f16236d = 6;
                        if (e83Var.emit(objM2861d3, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                str4 = this.f16234b;
                AbstractC3193b.m15359b(obj);
                r12 = 0;
                this.f16237e = r12;
                this.f16233a = r12;
                this.f16234b = r12;
                this.f16235c = e83Var;
                this.f16236d = 5;
                objM2861d3 = AbstractC0758a.m2861d(new ql4(str4, 29), zcaVar.f71369K, this, true, false);
                r13 = r12;
                if (objM2861d3 != coroutineSingletons) {
                    this.f16237e = r13;
                    this.f16233a = r13;
                    this.f16234b = r13;
                    this.f16235c = r13;
                    this.f16236d = 6;
                    if (e83Var.emit(objM2861d3, this) == coroutineSingletons) {
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 5:
                e83Var = this.f16235c;
                AbstractC3193b.m15359b(obj);
                objM2861d3 = obj;
                r13 = 0;
                this.f16237e = r13;
                this.f16233a = r13;
                this.f16234b = r13;
                this.f16235c = r13;
                this.f16236d = 6;
                if (e83Var.emit(objM2861d3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
