package com.lingq.core.settings.domain;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LanguageLevels;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.library.C1469k;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.token.LocalTextToSpeechVoice;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.aj7;
import p000.bj7;
import p000.c83;
import p000.cj7;
import p000.cma;
import p000.fa4;
import p000.gm5;
import p000.hm5;
import p000.km7;
import p000.lm4;
import p000.sca;
import p000.si7;
import p000.u91;
import p000.vk9;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.settings.domain.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1863b {

    /* JADX INFO: renamed from: a */
    public final si7 f22920a;

    /* JADX INFO: renamed from: b */
    public final Object f22921b;

    /* JADX INFO: renamed from: c */
    public final Object f22922c;

    public C1863b(si7 si7Var, km7 km7Var, cma cmaVar) {
        si7Var.getClass();
        km7Var.getClass();
        cmaVar.getClass();
        this.f22920a = si7Var;
        this.f22921b = km7Var;
        this.f22922c = cmaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m8618a(String str, ContinuationImpl continuationImpl) throws Throwable {
        InitTtsVoicesUseCase$getWebVoices$1 initTtsVoicesUseCase$getWebVoices$1;
        if (continuationImpl instanceof InitTtsVoicesUseCase$getWebVoices$1) {
            initTtsVoicesUseCase$getWebVoices$1 = (InitTtsVoicesUseCase$getWebVoices$1) continuationImpl;
            int i = initTtsVoicesUseCase$getWebVoices$1.f22761c;
            if ((i & Integer.MIN_VALUE) != 0) {
                initTtsVoicesUseCase$getWebVoices$1.f22761c = i - Integer.MIN_VALUE;
            } else {
                initTtsVoicesUseCase$getWebVoices$1 = new InitTtsVoicesUseCase$getWebVoices$1(this, continuationImpl);
            }
        } else {
            initTtsVoicesUseCase$getWebVoices$1 = new InitTtsVoicesUseCase$getWebVoices$1(this, continuationImpl);
        }
        Object objM7398m = initTtsVoicesUseCase$getWebVoices$1.f22759a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = initTtsVoicesUseCase$getWebVoices$1.f22761c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7398m);
            C1307w c1307w = (C1307w) this.f22921b;
            initTtsVoicesUseCase$getWebVoices$1.f22761c = 1;
            objM7398m = c1307w.m7398m(str);
            if (objM7398m != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM7398m);
                return objM7398m;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM7398m);
        initTtsVoicesUseCase$getWebVoices$1.f22761c = 2;
        Object objM15541t = AbstractC3224d.m15541t((c83) objM7398m, initTtsVoicesUseCase$getWebVoices$1);
        return objM15541t == obj ? obj : objM15541t;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m8619b(String str, ContinuationImpl continuationImpl) throws Throwable {
        InitTtsVoicesUseCase$initLocalVoice$1 initTtsVoicesUseCase$initLocalVoice$1;
        Map map;
        LocalTextToSpeechVoice localTextToSpeechVoice;
        LinkedHashMap linkedHashMapM15372Y;
        if (continuationImpl instanceof InitTtsVoicesUseCase$initLocalVoice$1) {
            initTtsVoicesUseCase$initLocalVoice$1 = (InitTtsVoicesUseCase$initLocalVoice$1) continuationImpl;
            int i = initTtsVoicesUseCase$initLocalVoice$1.f22766e;
            if ((i & Integer.MIN_VALUE) != 0) {
                initTtsVoicesUseCase$initLocalVoice$1.f22766e = i - Integer.MIN_VALUE;
            } else {
                initTtsVoicesUseCase$initLocalVoice$1 = new InitTtsVoicesUseCase$initLocalVoice$1(this, continuationImpl);
            }
        } else {
            initTtsVoicesUseCase$initLocalVoice$1 = new InitTtsVoicesUseCase$initLocalVoice$1(this, continuationImpl);
        }
        Object objM15541t = initTtsVoicesUseCase$initLocalVoice$1.f22764c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = initTtsVoicesUseCase$initLocalVoice$1.f22766e;
        xfa xfaVar = xfa.f68157a;
        si7 si7Var = this.f22920a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1368a) si7Var).f18379U0;
            initTtsVoicesUseCase$initLocalVoice$1.f22762a = str;
            initTtsVoicesUseCase$initLocalVoice$1.f22766e = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, initTtsVoicesUseCase$initLocalVoice$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = initTtsVoicesUseCase$initLocalVoice$1.f22762a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM15541t);
                    return xfaVar;
                }
                if (i2 == 4) {
                    AbstractC3193b.m15359b(objM15541t);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = initTtsVoicesUseCase$initLocalVoice$1.f22763b;
            str = initTtsVoicesUseCase$initLocalVoice$1.f22762a;
            AbstractC3193b.m15359b(objM15541t);
        }
        localTextToSpeechVoice = (LocalTextToSpeechVoice) u91.m22591I0((List) objM15541t);
        if (localTextToSpeechVoice == null) {
            initTtsVoicesUseCase$initLocalVoice$1.f22762a = null;
            initTtsVoicesUseCase$initLocalVoice$1.f22763b = null;
            initTtsVoicesUseCase$initLocalVoice$1.f22766e = 4;
            if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$initLocalVoice$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        linkedHashMapM15372Y = AbstractC3194a.m15372Y(map);
        linkedHashMapM15372Y.put(str, localTextToSpeechVoice);
        initTtsVoicesUseCase$initLocalVoice$1.f22762a = null;
        initTtsVoicesUseCase$initLocalVoice$1.f22763b = null;
        initTtsVoicesUseCase$initLocalVoice$1.f22766e = 3;
        if (((C1368a) si7Var).m7850I(linkedHashMapM15372Y, initTtsVoicesUseCase$initLocalVoice$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
        Map map2 = (Map) objM15541t;
        if (map2.get(str) == null) {
            sca scaVar = (sca) this.f22922c;
            initTtsVoicesUseCase$initLocalVoice$1.f22762a = str;
            initTtsVoicesUseCase$initLocalVoice$1.f22763b = map2;
            initTtsVoicesUseCase$initLocalVoice$1.f22766e = 2;
            Object objMo8492m1 = scaVar.mo8492m1(initTtsVoicesUseCase$initLocalVoice$1);
            if (objMo8492m1 != coroutineSingletons) {
                objM15541t = objMo8492m1;
                map = map2;
                localTextToSpeechVoice = (LocalTextToSpeechVoice) u91.m22591I0((List) objM15541t);
                if (localTextToSpeechVoice == null) {
                    linkedHashMapM15372Y = AbstractC3194a.m15372Y(map);
                    linkedHashMapM15372Y.put(str, localTextToSpeechVoice);
                    initTtsVoicesUseCase$initLocalVoice$1.f22762a = null;
                    initTtsVoicesUseCase$initLocalVoice$1.f22763b = null;
                    initTtsVoicesUseCase$initLocalVoice$1.f22766e = 3;
                    if (((C1368a) si7Var).m7850I(linkedHashMapM15372Y, initTtsVoicesUseCase$initLocalVoice$1) == coroutineSingletons) {
                    }
                } else {
                    initTtsVoicesUseCase$initLocalVoice$1.f22762a = null;
                    initTtsVoicesUseCase$initLocalVoice$1.f22763b = null;
                    initTtsVoicesUseCase$initLocalVoice$1.f22766e = 4;
                    if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$initLocalVoice$1) == coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[PHI: r3 r10 r11
      0x00cd: PHI (r3v9 java.lang.String) = (r3v7 java.lang.String), (r3v10 java.lang.String) binds: [B:41:0x00ca, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r10v7 java.util.Map) = (r10v4 java.util.Map), (r10v11 java.util.Map) binds: [B:41:0x00ca, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r11v15 java.lang.Object) = (r11v14 java.lang.Object), (r11v1 java.lang.Object) binds: [B:41:0x00ca, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public Object m8620c(String str, ContinuationImpl continuationImpl) throws Throwable {
        InitTtsVoicesUseCase$initWebVoice$1 initTtsVoicesUseCase$initWebVoice$1;
        Map map;
        Object objM7390e;
        String str2;
        Map map2;
        cj7 cj7Var;
        String str3;
        TextToSpeechVoice textToSpeechVoice;
        LinkedHashMap linkedHashMapM15372Y;
        int i;
        C1307w c1307w = (C1307w) this.f22921b;
        if (continuationImpl instanceof InitTtsVoicesUseCase$initWebVoice$1) {
            initTtsVoicesUseCase$initWebVoice$1 = (InitTtsVoicesUseCase$initWebVoice$1) continuationImpl;
            int i2 = initTtsVoicesUseCase$initWebVoice$1.f22773g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initTtsVoicesUseCase$initWebVoice$1.f22773g = i2 - Integer.MIN_VALUE;
            } else {
                initTtsVoicesUseCase$initWebVoice$1 = new InitTtsVoicesUseCase$initWebVoice$1(this, continuationImpl);
            }
        } else {
            initTtsVoicesUseCase$initWebVoice$1 = new InitTtsVoicesUseCase$initWebVoice$1(this, continuationImpl);
        }
        Object objM15541t = initTtsVoicesUseCase$initWebVoice$1.f22771e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = initTtsVoicesUseCase$initWebVoice$1.f22773g;
        si7 si7Var = this.f22920a;
        xfa xfaVar = xfa.f68157a;
        switch (i3) {
            case 0:
                AbstractC3193b.m15359b(objM15541t);
                c83 c83Var = ((C1368a) si7Var).f18373R0;
                initTtsVoicesUseCase$initWebVoice$1.f22767a = str;
                initTtsVoicesUseCase$initWebVoice$1.f22773g = 1;
                objM15541t = AbstractC3224d.m15541t(c83Var, initTtsVoicesUseCase$initWebVoice$1);
                if (objM15541t != obj) {
                    map = (Map) objM15541t;
                    if (((String) map.get(str)) == null) {
                        initTtsVoicesUseCase$initWebVoice$1.f22767a = str;
                        initTtsVoicesUseCase$initWebVoice$1.f22768b = map;
                        initTtsVoicesUseCase$initWebVoice$1.f22773g = 2;
                        objM7390e = c1307w.m7390e(str, initTtsVoicesUseCase$initWebVoice$1);
                        if (objM7390e != obj) {
                            str2 = str;
                            map2 = map;
                            objM15541t = objM7390e;
                            cj7Var = (cj7) objM15541t;
                            if (cj7Var instanceof bj7) {
                                str3 = ((bj7) cj7Var).f8612a;
                                if (str3 != null || vk9.m23391n0(str3)) {
                                    initTtsVoicesUseCase$initWebVoice$1.f22767a = str2;
                                    initTtsVoicesUseCase$initWebVoice$1.f22768b = map2;
                                    initTtsVoicesUseCase$initWebVoice$1.f22773g = 4;
                                    objM15541t = c1307w.m7395j(str2, initTtsVoicesUseCase$initWebVoice$1);
                                    if (objM15541t != obj) {
                                        textToSpeechVoice = (TextToSpeechVoice) objM15541t;
                                        if (textToSpeechVoice != null) {
                                            linkedHashMapM15372Y = AbstractC3194a.m15372Y(map2);
                                            linkedHashMapM15372Y.put(str2, textToSpeechVoice.f19570a);
                                            initTtsVoicesUseCase$initWebVoice$1.f22767a = str2;
                                            initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                                            initTtsVoicesUseCase$initWebVoice$1.f22769c = textToSpeechVoice;
                                            initTtsVoicesUseCase$initWebVoice$1.f22770d = 0;
                                            initTtsVoicesUseCase$initWebVoice$1.f22773g = 5;
                                            if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y, initTtsVoicesUseCase$initWebVoice$1) != obj) {
                                                i = 0;
                                                String str4 = textToSpeechVoice.f19570a;
                                                initTtsVoicesUseCase$initWebVoice$1.f22767a = null;
                                                initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                                                initTtsVoicesUseCase$initWebVoice$1.f22769c = null;
                                                initTtsVoicesUseCase$initWebVoice$1.f22770d = i;
                                                initTtsVoicesUseCase$initWebVoice$1.f22773g = 6;
                                                if (m8623f(str2, str4, initTtsVoicesUseCase$initWebVoice$1) == obj) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    LinkedHashMap linkedHashMapM15372Y2 = AbstractC3194a.m15372Y(map2);
                                    linkedHashMapM15372Y2.put(str2, str3);
                                    initTtsVoicesUseCase$initWebVoice$1.f22767a = null;
                                    initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                                    initTtsVoicesUseCase$initWebVoice$1.f22769c = null;
                                    initTtsVoicesUseCase$initWebVoice$1.f22773g = 3;
                                    if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$initWebVoice$1) == obj) {
                                    }
                                }
                            } else if (!fa4.m11650l(cj7Var, aj7.f726a)) {
                                gm5.m12750e();
                                return null;
                            }
                        }
                    }
                }
            case 1:
                str = initTtsVoicesUseCase$initWebVoice$1.f22767a;
                AbstractC3193b.m15359b(objM15541t);
                map = (Map) objM15541t;
                if (((String) map.get(str)) == null) {
                    initTtsVoicesUseCase$initWebVoice$1.f22767a = str;
                    initTtsVoicesUseCase$initWebVoice$1.f22768b = map;
                    initTtsVoicesUseCase$initWebVoice$1.f22773g = 2;
                    objM7390e = c1307w.m7390e(str, initTtsVoicesUseCase$initWebVoice$1);
                    if (objM7390e != obj) {
                        str2 = str;
                        map2 = map;
                        objM15541t = objM7390e;
                        cj7Var = (cj7) objM15541t;
                        if (cj7Var instanceof bj7) {
                            str3 = ((bj7) cj7Var).f8612a;
                            if (str3 != null) {
                            }
                            initTtsVoicesUseCase$initWebVoice$1.f22767a = str2;
                            initTtsVoicesUseCase$initWebVoice$1.f22768b = map2;
                            initTtsVoicesUseCase$initWebVoice$1.f22773g = 4;
                            objM15541t = c1307w.m7395j(str2, initTtsVoicesUseCase$initWebVoice$1);
                            if (objM15541t != obj) {
                                textToSpeechVoice = (TextToSpeechVoice) objM15541t;
                                if (textToSpeechVoice != null) {
                                    linkedHashMapM15372Y = AbstractC3194a.m15372Y(map2);
                                    linkedHashMapM15372Y.put(str2, textToSpeechVoice.f19570a);
                                    initTtsVoicesUseCase$initWebVoice$1.f22767a = str2;
                                    initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                                    initTtsVoicesUseCase$initWebVoice$1.f22769c = textToSpeechVoice;
                                    initTtsVoicesUseCase$initWebVoice$1.f22770d = 0;
                                    initTtsVoicesUseCase$initWebVoice$1.f22773g = 5;
                                    if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y, initTtsVoicesUseCase$initWebVoice$1) != obj) {
                                        i = 0;
                                        String str5 = textToSpeechVoice.f19570a;
                                        initTtsVoicesUseCase$initWebVoice$1.f22767a = null;
                                        initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                                        initTtsVoicesUseCase$initWebVoice$1.f22769c = null;
                                        initTtsVoicesUseCase$initWebVoice$1.f22770d = i;
                                        initTtsVoicesUseCase$initWebVoice$1.f22773g = 6;
                                        if (m8623f(str2, str5, initTtsVoicesUseCase$initWebVoice$1) == obj) {
                                        }
                                    }
                                }
                            }
                        } else if (!fa4.m11650l(cj7Var, aj7.f726a)) {
                            gm5.m12750e();
                            return null;
                        }
                    }
                }
                break;
            case 2:
                map2 = initTtsVoicesUseCase$initWebVoice$1.f22768b;
                str2 = initTtsVoicesUseCase$initWebVoice$1.f22767a;
                AbstractC3193b.m15359b(objM15541t);
                cj7Var = (cj7) objM15541t;
                if (cj7Var instanceof bj7) {
                    str3 = ((bj7) cj7Var).f8612a;
                    if (str3 != null) {
                    }
                    initTtsVoicesUseCase$initWebVoice$1.f22767a = str2;
                    initTtsVoicesUseCase$initWebVoice$1.f22768b = map2;
                    initTtsVoicesUseCase$initWebVoice$1.f22773g = 4;
                    objM15541t = c1307w.m7395j(str2, initTtsVoicesUseCase$initWebVoice$1);
                    if (objM15541t != obj) {
                        textToSpeechVoice = (TextToSpeechVoice) objM15541t;
                        if (textToSpeechVoice != null) {
                            linkedHashMapM15372Y = AbstractC3194a.m15372Y(map2);
                            linkedHashMapM15372Y.put(str2, textToSpeechVoice.f19570a);
                            initTtsVoicesUseCase$initWebVoice$1.f22767a = str2;
                            initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                            initTtsVoicesUseCase$initWebVoice$1.f22769c = textToSpeechVoice;
                            initTtsVoicesUseCase$initWebVoice$1.f22770d = 0;
                            initTtsVoicesUseCase$initWebVoice$1.f22773g = 5;
                            if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y, initTtsVoicesUseCase$initWebVoice$1) != obj) {
                                i = 0;
                                String str6 = textToSpeechVoice.f19570a;
                                initTtsVoicesUseCase$initWebVoice$1.f22767a = null;
                                initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                                initTtsVoicesUseCase$initWebVoice$1.f22769c = null;
                                initTtsVoicesUseCase$initWebVoice$1.f22770d = i;
                                initTtsVoicesUseCase$initWebVoice$1.f22773g = 6;
                                if (m8623f(str2, str6, initTtsVoicesUseCase$initWebVoice$1) == obj) {
                                }
                            }
                        }
                    }
                }
                if (!fa4.m11650l(cj7Var, aj7.f726a)) {
                    gm5.m12750e();
                    return null;
                }
                break;
            case 3:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 4:
                map2 = initTtsVoicesUseCase$initWebVoice$1.f22768b;
                String str7 = initTtsVoicesUseCase$initWebVoice$1.f22767a;
                AbstractC3193b.m15359b(objM15541t);
                str2 = str7;
                textToSpeechVoice = (TextToSpeechVoice) objM15541t;
                if (textToSpeechVoice != null) {
                    linkedHashMapM15372Y = AbstractC3194a.m15372Y(map2);
                    linkedHashMapM15372Y.put(str2, textToSpeechVoice.f19570a);
                    initTtsVoicesUseCase$initWebVoice$1.f22767a = str2;
                    initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                    initTtsVoicesUseCase$initWebVoice$1.f22769c = textToSpeechVoice;
                    initTtsVoicesUseCase$initWebVoice$1.f22770d = 0;
                    initTtsVoicesUseCase$initWebVoice$1.f22773g = 5;
                    if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y, initTtsVoicesUseCase$initWebVoice$1) != obj) {
                        i = 0;
                        String str8 = textToSpeechVoice.f19570a;
                        initTtsVoicesUseCase$initWebVoice$1.f22767a = null;
                        initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                        initTtsVoicesUseCase$initWebVoice$1.f22769c = null;
                        initTtsVoicesUseCase$initWebVoice$1.f22770d = i;
                        initTtsVoicesUseCase$initWebVoice$1.f22773g = 6;
                        if (m8623f(str2, str8, initTtsVoicesUseCase$initWebVoice$1) == obj) {
                        }
                    }
                }
            case 5:
                i = initTtsVoicesUseCase$initWebVoice$1.f22770d;
                textToSpeechVoice = initTtsVoicesUseCase$initWebVoice$1.f22769c;
                str2 = initTtsVoicesUseCase$initWebVoice$1.f22767a;
                AbstractC3193b.m15359b(objM15541t);
                String str9 = textToSpeechVoice.f19570a;
                initTtsVoicesUseCase$initWebVoice$1.f22767a = null;
                initTtsVoicesUseCase$initWebVoice$1.f22768b = null;
                initTtsVoicesUseCase$initWebVoice$1.f22769c = null;
                initTtsVoicesUseCase$initWebVoice$1.f22770d = i;
                initTtsVoicesUseCase$initWebVoice$1.f22773g = 6;
                return m8623f(str2, str9, initTtsVoicesUseCase$initWebVoice$1) == obj ? obj : xfaVar;
            case 6:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01c1 A[LOOP:0: B:51:0x01bb->B:53:0x01c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01eb, code lost:
    
        if (((com.lingq.core.data.repository.C1293i) r0).m7220q(r8, r1, r2) == r3) goto L56;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8621d(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        SetFeedLevelsUseCase$invoke$1 setFeedLevelsUseCase$invoke$1;
        String str2;
        int i3;
        int i4;
        Map map;
        String[] strArr;
        Map map2;
        String str3;
        int i5;
        int i6;
        ArrayList arrayList;
        Iterator it;
        if (continuationImpl instanceof SetFeedLevelsUseCase$invoke$1) {
            setFeedLevelsUseCase$invoke$1 = (SetFeedLevelsUseCase$invoke$1) continuationImpl;
            int i7 = setFeedLevelsUseCase$invoke$1.f22807g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                setFeedLevelsUseCase$invoke$1.f22807g = i7 - Integer.MIN_VALUE;
            } else {
                setFeedLevelsUseCase$invoke$1 = new SetFeedLevelsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            setFeedLevelsUseCase$invoke$1 = new SetFeedLevelsUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = setFeedLevelsUseCase$invoke$1.f22805e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = setFeedLevelsUseCase$invoke$1.f22807g;
        si7 si7Var = this.f22920a;
        if (i8 == 0) {
            AbstractC3193b.m15359b(obj);
            LibrarySearchQuery.Companion.getClass();
            LinkedHashMap linkedHashMapM8095a = C1469k.m8095a(i, i2);
            c83 c83Var = ((C1368a) si7Var).f18407f1;
            str2 = str;
            setFeedLevelsUseCase$invoke$1.f22801a = str2;
            setFeedLevelsUseCase$invoke$1.f22802b = linkedHashMapM8095a;
            i3 = i;
            setFeedLevelsUseCase$invoke$1.f22803c = i3;
            i4 = i2;
            setFeedLevelsUseCase$invoke$1.f22804d = i4;
            setFeedLevelsUseCase$invoke$1.f22807g = 1;
            Object objM15541t = AbstractC3224d.m15541t(c83Var, setFeedLevelsUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
                map = linkedHashMapM8095a;
                obj = objM15541t;
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            int i9 = setFeedLevelsUseCase$invoke$1.f22804d;
            int i10 = setFeedLevelsUseCase$invoke$1.f22803c;
            Map map3 = setFeedLevelsUseCase$invoke$1.f22802b;
            String str4 = setFeedLevelsUseCase$invoke$1.f22801a;
            AbstractC3193b.m15359b(obj);
            i4 = i9;
            map = map3;
            str2 = str4;
            i3 = i10;
        } else if (i8 == 2) {
            i6 = setFeedLevelsUseCase$invoke$1.f22804d;
            i5 = setFeedLevelsUseCase$invoke$1.f22803c;
            map2 = setFeedLevelsUseCase$invoke$1.f22802b;
            str3 = setFeedLevelsUseCase$invoke$1.f22801a;
            AbstractC3193b.m15359b(obj);
            lm4 lm4Var = (lm4) this.f22921b;
            arrayList = new ArrayList(map2.size());
            it = map2.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()));
            }
            setFeedLevelsUseCase$invoke$1.f22801a = null;
            setFeedLevelsUseCase$invoke$1.f22802b = null;
            setFeedLevelsUseCase$invoke$1.f22803c = i5;
            setFeedLevelsUseCase$invoke$1.f22804d = i6;
            setFeedLevelsUseCase$invoke$1.f22807g = 3;
        } else {
            if (i8 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj);
        hm5 hm5Var = (hm5) this.f22922c;
        Bundle bundle = new Bundle();
        Map map4 = (Map) linkedHashMapM15372Y.get(str2);
        if (map4 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map4.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(LqAnalyticsValues$LanguageLevels.valueOf(((LearningLevel) ((Map.Entry) it2.next()).getKey()).name()).getValue());
            }
            strArr = (String[]) arrayList2.toArray(new String[0]);
        } else {
            strArr = null;
        }
        bundle.putStringArray("previous levels", strArr);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (((Boolean) entry2.getValue()).booleanValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it3 = linkedHashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList3.add(LqAnalyticsValues$LanguageLevels.valueOf(((LearningLevel) ((Map.Entry) it3.next()).getKey()).name()).getValue());
        }
        bundle.putStringArray("new levels", (String[]) arrayList3.toArray(new String[0]));
        ((C1240a) hm5Var).m7025f("Level filter changed", bundle);
        linkedHashMapM15372Y.put(str2, map);
        setFeedLevelsUseCase$invoke$1.f22801a = str2;
        setFeedLevelsUseCase$invoke$1.f22802b = map;
        setFeedLevelsUseCase$invoke$1.f22803c = i3;
        setFeedLevelsUseCase$invoke$1.f22804d = i4;
        setFeedLevelsUseCase$invoke$1.f22807g = 2;
        if (((C1368a) si7Var).m7844C(linkedHashMapM15372Y, setFeedLevelsUseCase$invoke$1) != coroutineSingletons) {
            map2 = map;
            str3 = str2;
            i5 = i3;
            i6 = i4;
            lm4 lm4Var2 = (lm4) this.f22921b;
            arrayList = new ArrayList(map2.size());
            it = map2.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()));
            }
            setFeedLevelsUseCase$invoke$1.f22801a = null;
            setFeedLevelsUseCase$invoke$1.f22802b = null;
            setFeedLevelsUseCase$invoke$1.f22803c = i5;
            setFeedLevelsUseCase$invoke$1.f22804d = i6;
            setFeedLevelsUseCase$invoke$1.f22807g = 3;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r7.mo4597w0(r0) == r1) goto L26;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8622e(String str, ContinuationImpl continuationImpl) throws Throwable {
        SetInterfaceLanguageUseCase$invoke$1 setInterfaceLanguageUseCase$invoke$1;
        if (continuationImpl instanceof SetInterfaceLanguageUseCase$invoke$1) {
            setInterfaceLanguageUseCase$invoke$1 = (SetInterfaceLanguageUseCase$invoke$1) continuationImpl;
            int i = setInterfaceLanguageUseCase$invoke$1.f22811d;
            if ((i & Integer.MIN_VALUE) != 0) {
                setInterfaceLanguageUseCase$invoke$1.f22811d = i - Integer.MIN_VALUE;
            } else {
                setInterfaceLanguageUseCase$invoke$1 = new SetInterfaceLanguageUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            setInterfaceLanguageUseCase$invoke$1 = new SetInterfaceLanguageUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = setInterfaceLanguageUseCase$invoke$1.f22809b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = setInterfaceLanguageUseCase$invoke$1.f22811d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            setInterfaceLanguageUseCase$invoke$1.f22808a = str;
            setInterfaceLanguageUseCase$invoke$1.f22811d = 1;
            if (((C1368a) this.f22920a).m7913z(str, setInterfaceLanguageUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = setInterfaceLanguageUseCase$invoke$1.f22808a;
            AbstractC3193b.m15359b(obj);
        } else if (i2 == 2) {
            AbstractC3193b.m15359b(obj);
            cma cmaVar = (cma) this.f22922c;
            setInterfaceLanguageUseCase$invoke$1.f22808a = null;
            setInterfaceLanguageUseCase$invoke$1.f22811d = 3;
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        km7 km7Var = (km7) this.f22921b;
        setInterfaceLanguageUseCase$invoke$1.f22808a = null;
        setInterfaceLanguageUseCase$invoke$1.f22811d = 2;
        if (((C1267a) km7Var).m7060A(str, setInterfaceLanguageUseCase$invoke$1) != coroutineSingletons) {
            cma cmaVar2 = (cma) this.f22922c;
            setInterfaceLanguageUseCase$invoke$1.f22808a = null;
            setInterfaceLanguageUseCase$invoke$1.f22811d = 3;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m8623f(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        InitTtsVoicesUseCase$persistVoiceSelection$1 initTtsVoicesUseCase$persistVoiceSelection$1;
        boolean zBooleanValue;
        Set set;
        LinkedHashSet linkedHashSetM19765B;
        if (continuationImpl instanceof InitTtsVoicesUseCase$persistVoiceSelection$1) {
            initTtsVoicesUseCase$persistVoiceSelection$1 = (InitTtsVoicesUseCase$persistVoiceSelection$1) continuationImpl;
            int i = initTtsVoicesUseCase$persistVoiceSelection$1.f22778e;
            if ((i & Integer.MIN_VALUE) != 0) {
                initTtsVoicesUseCase$persistVoiceSelection$1.f22778e = i - Integer.MIN_VALUE;
            } else {
                initTtsVoicesUseCase$persistVoiceSelection$1 = new InitTtsVoicesUseCase$persistVoiceSelection$1(this, continuationImpl);
            }
        } else {
            initTtsVoicesUseCase$persistVoiceSelection$1 = new InitTtsVoicesUseCase$persistVoiceSelection$1(this, continuationImpl);
        }
        Object objM7404s = initTtsVoicesUseCase$persistVoiceSelection$1.f22776c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = initTtsVoicesUseCase$persistVoiceSelection$1.f22778e;
        xfa xfaVar = xfa.f68157a;
        si7 si7Var = this.f22920a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7404s);
            C1307w c1307w = (C1307w) this.f22921b;
            initTtsVoicesUseCase$persistVoiceSelection$1.f22774a = str;
            initTtsVoicesUseCase$persistVoiceSelection$1.f22778e = 1;
            objM7404s = c1307w.m7404s(str, str2, initTtsVoicesUseCase$persistVoiceSelection$1);
            if (objM7404s != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = initTtsVoicesUseCase$persistVoiceSelection$1.f22774a;
            AbstractC3193b.m15359b(objM7404s);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM7404s);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zBooleanValue = initTtsVoicesUseCase$persistVoiceSelection$1.f22775b;
            str = initTtsVoicesUseCase$persistVoiceSelection$1.f22774a;
            AbstractC3193b.m15359b(objM7404s);
        }
        set = (Set) objM7404s;
        if (zBooleanValue) {
            linkedHashSetM19765B = AbstractC3489q9.m19793w(set, str);
        } else {
            linkedHashSetM19765B = AbstractC3489q9.m19765B(set, str);
        }
        if (!linkedHashSetM19765B.equals(set)) {
            initTtsVoicesUseCase$persistVoiceSelection$1.f22774a = null;
            initTtsVoicesUseCase$persistVoiceSelection$1.f22775b = zBooleanValue;
            initTtsVoicesUseCase$persistVoiceSelection$1.f22778e = 3;
            if (((C1368a) si7Var).m7898p0(linkedHashSetM19765B, initTtsVoicesUseCase$persistVoiceSelection$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        zBooleanValue = ((Boolean) objM7404s).booleanValue();
        c83 c83Var = ((C1368a) si7Var).f18377T0;
        initTtsVoicesUseCase$persistVoiceSelection$1.f22774a = str;
        initTtsVoicesUseCase$persistVoiceSelection$1.f22775b = zBooleanValue;
        initTtsVoicesUseCase$persistVoiceSelection$1.f22778e = 2;
        objM7404s = AbstractC3224d.m15541t(c83Var, initTtsVoicesUseCase$persistVoiceSelection$1);
        if (objM7404s != coroutineSingletons) {
            set = (Set) objM7404s;
            if (zBooleanValue) {
                linkedHashSetM19765B = AbstractC3489q9.m19793w(set, str);
            } else {
                linkedHashSetM19765B = AbstractC3489q9.m19765B(set, str);
            }
            if (!linkedHashSetM19765B.equals(set)) {
                initTtsVoicesUseCase$persistVoiceSelection$1.f22774a = null;
                initTtsVoicesUseCase$persistVoiceSelection$1.f22775b = zBooleanValue;
                initTtsVoicesUseCase$persistVoiceSelection$1.f22778e = 3;
                if (((C1368a) si7Var).m7898p0(linkedHashSetM19765B, initTtsVoicesUseCase$persistVoiceSelection$1) == coroutineSingletons) {
                }
            }
            return xfaVar;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125 A[PHI: r10 r11 r12
      0x0125: PHI (r10v8 java.lang.String) = (r10v6 java.lang.String), (r10v11 java.lang.String) binds: [B:51:0x0121, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r11v8 java.lang.String) = (r11v6 java.lang.String), (r11v9 java.lang.String) binds: [B:51:0x0121, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r12v20 java.lang.Object) = (r12v19 java.lang.Object), (r12v1 java.lang.Object) binds: [B:51:0x0121, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160 A[PHI: r10 r11 r12
      0x0160: PHI (r10v12 com.lingq.core.domain.model.token.TextToSpeechVoice) = 
      (r10v10 com.lingq.core.domain.model.token.TextToSpeechVoice)
      (r10v13 com.lingq.core.domain.model.token.TextToSpeechVoice)
     binds: [B:63:0x015d, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r11v10 java.lang.String) = (r11v8 java.lang.String), (r11v11 java.lang.String) binds: [B:63:0x015d, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r12v28 java.lang.Object) = (r12v27 java.lang.Object), (r12v1 java.lang.Object) binds: [B:63:0x015d, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0181 A[PHI: r10 r11
      0x0181: PHI (r10v14 com.lingq.core.domain.model.token.TextToSpeechVoice) = 
      (r10v12 com.lingq.core.domain.model.token.TextToSpeechVoice)
      (r10v15 com.lingq.core.domain.model.token.TextToSpeechVoice)
     binds: [B:66:0x017e, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r11v12 java.lang.String) = (r11v10 java.lang.String), (r11v13 java.lang.String) binds: [B:66:0x017e, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0196 A[PHI: r10 r11
      0x0196: PHI (r10v16 com.lingq.core.domain.model.token.TextToSpeechVoice) = 
      (r10v14 com.lingq.core.domain.model.token.TextToSpeechVoice)
      (r10v18 com.lingq.core.domain.model.token.TextToSpeechVoice)
     binds: [B:69:0x0193, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0196: PHI (r11v14 java.lang.String) = (r11v12 java.lang.String), (r11v15 java.lang.String) binds: [B:69:0x0193, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m8624g(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        InitTtsVoicesUseCase$selectVoice$1 initTtsVoicesUseCase$selectVoice$1;
        Iterator it;
        Object next;
        LocalTextToSpeechVoice localTextToSpeechVoice;
        String str3;
        String str4;
        Object objM15541t;
        LocalTextToSpeechVoice localTextToSpeechVoice2;
        LinkedHashMap linkedHashMapM15372Y;
        Iterator it2;
        Object next2;
        TextToSpeechVoice textToSpeechVoice;
        LinkedHashMap linkedHashMapM15372Y2;
        String str5;
        if (continuationImpl instanceof InitTtsVoicesUseCase$selectVoice$1) {
            initTtsVoicesUseCase$selectVoice$1 = (InitTtsVoicesUseCase$selectVoice$1) continuationImpl;
            int i = initTtsVoicesUseCase$selectVoice$1.f22785g;
            if ((i & Integer.MIN_VALUE) != 0) {
                initTtsVoicesUseCase$selectVoice$1.f22785g = i - Integer.MIN_VALUE;
            } else {
                initTtsVoicesUseCase$selectVoice$1 = new InitTtsVoicesUseCase$selectVoice$1(this, continuationImpl);
            }
        } else {
            initTtsVoicesUseCase$selectVoice$1 = new InitTtsVoicesUseCase$selectVoice$1(this, continuationImpl);
        }
        Object objMo8492m1 = initTtsVoicesUseCase$selectVoice$1.f22783e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = initTtsVoicesUseCase$selectVoice$1.f22785g;
        xfa xfaVar = xfa.f68157a;
        si7 si7Var = this.f22920a;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(objMo8492m1);
                sca scaVar = (sca) this.f22922c;
                initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                initTtsVoicesUseCase$selectVoice$1.f22780b = str2;
                initTtsVoicesUseCase$selectVoice$1.f22785g = 1;
                objMo8492m1 = scaVar.mo8492m1(initTtsVoicesUseCase$selectVoice$1);
                if (objMo8492m1 != obj) {
                    it = ((List) objMo8492m1).iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        localTextToSpeechVoice = (LocalTextToSpeechVoice) next;
                        if (localTextToSpeechVoice != null) {
                            c83 c83Var = ((C1368a) si7Var).f18379U0;
                            initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = localTextToSpeechVoice;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 2;
                            objM15541t = AbstractC3224d.m15541t(c83Var, initTtsVoicesUseCase$selectVoice$1);
                            if (objM15541t != obj) {
                                objMo8492m1 = objM15541t;
                                localTextToSpeechVoice2 = localTextToSpeechVoice;
                                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                linkedHashMapM15372Y.put(str, localTextToSpeechVoice2);
                                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 3;
                                if (((C1368a) si7Var).m7850I(linkedHashMapM15372Y, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                    initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 4;
                                    if (((C1368a) si7Var).m7906t0(false, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                        return xfaVar;
                                    }
                                }
                            }
                        } else {
                            C1307w c1307w = (C1307w) this.f22921b;
                            initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = str2;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 5;
                            objMo8492m1 = c1307w.m7398m(str);
                            if (objMo8492m1 != obj) {
                                String str6 = str2;
                                str3 = str;
                                str4 = str6;
                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = str4;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 6;
                                objMo8492m1 = AbstractC3224d.m15541t((c83) objMo8492m1, initTtsVoicesUseCase$selectVoice$1);
                                if (objMo8492m1 != obj) {
                                    it2 = ((List) objMo8492m1).iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = it2.next();
                                        } else {
                                            next2 = null;
                                        }
                                        textToSpeechVoice = (TextToSpeechVoice) next2;
                                        if (textToSpeechVoice != null) {
                                            c83 c83Var2 = ((C1368a) si7Var).f18373R0;
                                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                            initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                                            objMo8492m1 = AbstractC3224d.m15541t(c83Var2, initTtsVoicesUseCase$selectVoice$1);
                                            if (objMo8492m1 != obj) {
                                                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                                linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                                initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                                if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                    initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                                    if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                        str5 = textToSpeechVoice.f19570a;
                                                        initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                        initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                                        if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return xfaVar;
                                    } while (!fa4.m11650l(((TextToSpeechVoice) next2).f19571b, str4));
                                    textToSpeechVoice = (TextToSpeechVoice) next2;
                                    if (textToSpeechVoice != null) {
                                        c83 c83Var3 = ((C1368a) si7Var).f18373R0;
                                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                                        objMo8492m1 = AbstractC3224d.m15541t(c83Var3, initTtsVoicesUseCase$selectVoice$1);
                                        if (objMo8492m1 != obj) {
                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                            linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                            initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                            if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                                initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                                if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                    str5 = textToSpeechVoice.f19570a;
                                                    initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                                    if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return xfaVar;
                                }
                            }
                        }
                    } while (!fa4.m11650l(((LocalTextToSpeechVoice) next).f19561a, str2));
                    localTextToSpeechVoice = (LocalTextToSpeechVoice) next;
                    if (localTextToSpeechVoice != null) {
                        c83 c83Var4 = ((C1368a) si7Var).f18379U0;
                        initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = localTextToSpeechVoice;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 2;
                        objM15541t = AbstractC3224d.m15541t(c83Var4, initTtsVoicesUseCase$selectVoice$1);
                        if (objM15541t != obj) {
                            objMo8492m1 = objM15541t;
                            localTextToSpeechVoice2 = localTextToSpeechVoice;
                            linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objMo8492m1);
                            linkedHashMapM15372Y.put(str, localTextToSpeechVoice2);
                            initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 3;
                            if (((C1368a) si7Var).m7850I(linkedHashMapM15372Y, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 4;
                                if (((C1368a) si7Var).m7906t0(false, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                    return xfaVar;
                                }
                            }
                        }
                    } else {
                        C1307w c1307w2 = (C1307w) this.f22921b;
                        initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = str2;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 5;
                        objMo8492m1 = c1307w2.m7398m(str);
                        if (objMo8492m1 != obj) {
                            String str7 = str2;
                            str3 = str;
                            str4 = str7;
                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = str4;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 6;
                            objMo8492m1 = AbstractC3224d.m15541t((c83) objMo8492m1, initTtsVoicesUseCase$selectVoice$1);
                            if (objMo8492m1 != obj) {
                                it2 = ((List) objMo8492m1).iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                    } else {
                                        next2 = null;
                                    }
                                    textToSpeechVoice = (TextToSpeechVoice) next2;
                                    if (textToSpeechVoice != null) {
                                        c83 c83Var5 = ((C1368a) si7Var).f18373R0;
                                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                                        objMo8492m1 = AbstractC3224d.m15541t(c83Var5, initTtsVoicesUseCase$selectVoice$1);
                                        if (objMo8492m1 != obj) {
                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                            linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                            initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                            if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                                initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                                if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                    str5 = textToSpeechVoice.f19570a;
                                                    initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                                    if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return xfaVar;
                                } while (!fa4.m11650l(((TextToSpeechVoice) next2).f19571b, str4));
                                textToSpeechVoice = (TextToSpeechVoice) next2;
                                if (textToSpeechVoice != null) {
                                    c83 c83Var6 = ((C1368a) si7Var).f18373R0;
                                    initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                                    objMo8492m1 = AbstractC3224d.m15541t(c83Var6, initTtsVoicesUseCase$selectVoice$1);
                                    if (objMo8492m1 != obj) {
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                        linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                        if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                            initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                            if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                str5 = textToSpeechVoice.f19570a;
                                                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                                if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return xfaVar;
                            }
                        }
                    }
                }
                return obj;
            case 1:
                str2 = initTtsVoicesUseCase$selectVoice$1.f22780b;
                str = initTtsVoicesUseCase$selectVoice$1.f22779a;
                AbstractC3193b.m15359b(objMo8492m1);
                it = ((List) objMo8492m1).iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    localTextToSpeechVoice = (LocalTextToSpeechVoice) next;
                    if (localTextToSpeechVoice != null) {
                        c83 c83Var7 = ((C1368a) si7Var).f18379U0;
                        initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = localTextToSpeechVoice;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 2;
                        objM15541t = AbstractC3224d.m15541t(c83Var7, initTtsVoicesUseCase$selectVoice$1);
                        if (objM15541t != obj) {
                            objMo8492m1 = objM15541t;
                            localTextToSpeechVoice2 = localTextToSpeechVoice;
                            linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objMo8492m1);
                            linkedHashMapM15372Y.put(str, localTextToSpeechVoice2);
                            initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 3;
                            if (((C1368a) si7Var).m7850I(linkedHashMapM15372Y, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 4;
                                if (((C1368a) si7Var).m7906t0(false, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                    return xfaVar;
                                }
                            }
                        }
                    } else {
                        C1307w c1307w3 = (C1307w) this.f22921b;
                        initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = str2;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 5;
                        objMo8492m1 = c1307w3.m7398m(str);
                        if (objMo8492m1 != obj) {
                            String str8 = str2;
                            str3 = str;
                            str4 = str8;
                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = str4;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 6;
                            objMo8492m1 = AbstractC3224d.m15541t((c83) objMo8492m1, initTtsVoicesUseCase$selectVoice$1);
                            if (objMo8492m1 != obj) {
                                it2 = ((List) objMo8492m1).iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                    } else {
                                        next2 = null;
                                    }
                                    textToSpeechVoice = (TextToSpeechVoice) next2;
                                    if (textToSpeechVoice != null) {
                                        c83 c83Var8 = ((C1368a) si7Var).f18373R0;
                                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                                        objMo8492m1 = AbstractC3224d.m15541t(c83Var8, initTtsVoicesUseCase$selectVoice$1);
                                        if (objMo8492m1 != obj) {
                                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                            linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                            initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                            if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                                initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                                if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                    str5 = textToSpeechVoice.f19570a;
                                                    initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                                    if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return xfaVar;
                                } while (!fa4.m11650l(((TextToSpeechVoice) next2).f19571b, str4));
                                textToSpeechVoice = (TextToSpeechVoice) next2;
                                if (textToSpeechVoice != null) {
                                    c83 c83Var9 = ((C1368a) si7Var).f18373R0;
                                    initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                                    objMo8492m1 = AbstractC3224d.m15541t(c83Var9, initTtsVoicesUseCase$selectVoice$1);
                                    if (objMo8492m1 != obj) {
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                        linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                        if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                            initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                            if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                str5 = textToSpeechVoice.f19570a;
                                                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                                if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return xfaVar;
                            }
                        }
                    }
                    return obj;
                } while (!fa4.m11650l(((LocalTextToSpeechVoice) next).f19561a, str2));
                localTextToSpeechVoice = (LocalTextToSpeechVoice) next;
                if (localTextToSpeechVoice != null) {
                    c83 c83Var10 = ((C1368a) si7Var).f18379U0;
                    initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                    initTtsVoicesUseCase$selectVoice$1.f22781c = localTextToSpeechVoice;
                    initTtsVoicesUseCase$selectVoice$1.f22785g = 2;
                    objM15541t = AbstractC3224d.m15541t(c83Var10, initTtsVoicesUseCase$selectVoice$1);
                    if (objM15541t != obj) {
                        objMo8492m1 = objM15541t;
                        localTextToSpeechVoice2 = localTextToSpeechVoice;
                        linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objMo8492m1);
                        linkedHashMapM15372Y.put(str, localTextToSpeechVoice2);
                        initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 3;
                        if (((C1368a) si7Var).m7850I(linkedHashMapM15372Y, initTtsVoicesUseCase$selectVoice$1) != obj) {
                            initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 4;
                            if (((C1368a) si7Var).m7906t0(false, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                return xfaVar;
                            }
                        }
                    }
                } else {
                    C1307w c1307w4 = (C1307w) this.f22921b;
                    initTtsVoicesUseCase$selectVoice$1.f22779a = str;
                    initTtsVoicesUseCase$selectVoice$1.f22780b = str2;
                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                    initTtsVoicesUseCase$selectVoice$1.f22785g = 5;
                    objMo8492m1 = c1307w4.m7398m(str);
                    if (objMo8492m1 != obj) {
                        String str9 = str2;
                        str3 = str;
                        str4 = str9;
                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = str4;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 6;
                        objMo8492m1 = AbstractC3224d.m15541t((c83) objMo8492m1, initTtsVoicesUseCase$selectVoice$1);
                        if (objMo8492m1 != obj) {
                            it2 = ((List) objMo8492m1).iterator();
                            do {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                } else {
                                    next2 = null;
                                }
                                textToSpeechVoice = (TextToSpeechVoice) next2;
                                if (textToSpeechVoice != null) {
                                    c83 c83Var11 = ((C1368a) si7Var).f18373R0;
                                    initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                                    objMo8492m1 = AbstractC3224d.m15541t(c83Var11, initTtsVoicesUseCase$selectVoice$1);
                                    if (objMo8492m1 != obj) {
                                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                        linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                        if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                            initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                            if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                                str5 = textToSpeechVoice.f19570a;
                                                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                                initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                                if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return xfaVar;
                            } while (!fa4.m11650l(((TextToSpeechVoice) next2).f19571b, str4));
                            textToSpeechVoice = (TextToSpeechVoice) next2;
                            if (textToSpeechVoice != null) {
                                c83 c83Var12 = ((C1368a) si7Var).f18373R0;
                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                                objMo8492m1 = AbstractC3224d.m15541t(c83Var12, initTtsVoicesUseCase$selectVoice$1);
                                if (objMo8492m1 != obj) {
                                    linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                    linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                    initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                    if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                        if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                            str5 = textToSpeechVoice.f19570a;
                                            initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                            initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                            if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                            }
                                        }
                                    }
                                }
                            }
                            return xfaVar;
                        }
                    }
                }
                return obj;
            case 2:
                localTextToSpeechVoice2 = initTtsVoicesUseCase$selectVoice$1.f22781c;
                str = initTtsVoicesUseCase$selectVoice$1.f22779a;
                AbstractC3193b.m15359b(objMo8492m1);
                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objMo8492m1);
                linkedHashMapM15372Y.put(str, localTextToSpeechVoice2);
                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                initTtsVoicesUseCase$selectVoice$1.f22785g = 3;
                if (((C1368a) si7Var).m7850I(linkedHashMapM15372Y, initTtsVoicesUseCase$selectVoice$1) != obj) {
                    initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                    initTtsVoicesUseCase$selectVoice$1.f22785g = 4;
                    if (((C1368a) si7Var).m7906t0(false, initTtsVoicesUseCase$selectVoice$1) != obj) {
                        return xfaVar;
                    }
                }
                return obj;
            case 3:
                AbstractC3193b.m15359b(objMo8492m1);
                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                initTtsVoicesUseCase$selectVoice$1.f22785g = 4;
                if (((C1368a) si7Var).m7906t0(false, initTtsVoicesUseCase$selectVoice$1) != obj) {
                    return obj;
                }
                return xfaVar;
            case 4:
                AbstractC3193b.m15359b(objMo8492m1);
                return xfaVar;
            case 5:
                str4 = initTtsVoicesUseCase$selectVoice$1.f22780b;
                str3 = initTtsVoicesUseCase$selectVoice$1.f22779a;
                AbstractC3193b.m15359b(objMo8492m1);
                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                initTtsVoicesUseCase$selectVoice$1.f22780b = str4;
                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                initTtsVoicesUseCase$selectVoice$1.f22785g = 6;
                objMo8492m1 = AbstractC3224d.m15541t((c83) objMo8492m1, initTtsVoicesUseCase$selectVoice$1);
                if (objMo8492m1 != obj) {
                    it2 = ((List) objMo8492m1).iterator();
                    do {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                        } else {
                            next2 = null;
                        }
                        textToSpeechVoice = (TextToSpeechVoice) next2;
                        if (textToSpeechVoice != null) {
                            c83 c83Var13 = ((C1368a) si7Var).f18373R0;
                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                            objMo8492m1 = AbstractC3224d.m15541t(c83Var13, initTtsVoicesUseCase$selectVoice$1);
                            if (objMo8492m1 != obj) {
                                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                                linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                                if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                    initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                    if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                        str5 = textToSpeechVoice.f19570a;
                                        initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                        initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                        if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                        }
                                    }
                                }
                            }
                        }
                        return xfaVar;
                    } while (!fa4.m11650l(((TextToSpeechVoice) next2).f19571b, str4));
                    textToSpeechVoice = (TextToSpeechVoice) next2;
                    if (textToSpeechVoice != null) {
                        c83 c83Var14 = ((C1368a) si7Var).f18373R0;
                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                        objMo8492m1 = AbstractC3224d.m15541t(c83Var14, initTtsVoicesUseCase$selectVoice$1);
                        if (objMo8492m1 != obj) {
                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                            linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                            if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                    str5 = textToSpeechVoice.f19570a;
                                    initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                    if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                    }
                                }
                            }
                        }
                    }
                    return xfaVar;
                }
                return obj;
            case 6:
                str4 = initTtsVoicesUseCase$selectVoice$1.f22780b;
                str3 = initTtsVoicesUseCase$selectVoice$1.f22779a;
                AbstractC3193b.m15359b(objMo8492m1);
                it2 = ((List) objMo8492m1).iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                    } else {
                        next2 = null;
                    }
                    textToSpeechVoice = (TextToSpeechVoice) next2;
                    if (textToSpeechVoice != null) {
                        c83 c83Var15 = ((C1368a) si7Var).f18373R0;
                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                        objMo8492m1 = AbstractC3224d.m15541t(c83Var15, initTtsVoicesUseCase$selectVoice$1);
                        if (objMo8492m1 != obj) {
                            linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                            linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                            if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                                if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                    str5 = textToSpeechVoice.f19570a;
                                    initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                    initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                    if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                    }
                                }
                            }
                        }
                        return obj;
                    }
                    return xfaVar;
                } while (!fa4.m11650l(((TextToSpeechVoice) next2).f19571b, str4));
                textToSpeechVoice = (TextToSpeechVoice) next2;
                if (textToSpeechVoice != null) {
                    c83 c83Var16 = ((C1368a) si7Var).f18373R0;
                    initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                    initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                    initTtsVoicesUseCase$selectVoice$1.f22785g = 7;
                    objMo8492m1 = AbstractC3224d.m15541t(c83Var16, initTtsVoicesUseCase$selectVoice$1);
                    if (objMo8492m1 != obj) {
                        linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                        linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                        initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                        initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                        if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                            initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                            initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                            initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                            initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                            initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                            if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                                str5 = textToSpeechVoice.f19570a;
                                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                                initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                                initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                                if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                                }
                            }
                        }
                    }
                    return obj;
                }
                return xfaVar;
            case 7:
                textToSpeechVoice = initTtsVoicesUseCase$selectVoice$1.f22782d;
                str3 = initTtsVoicesUseCase$selectVoice$1.f22779a;
                AbstractC3193b.m15359b(objMo8492m1);
                linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objMo8492m1);
                linkedHashMapM15372Y2.put(str3, textToSpeechVoice.f19570a);
                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                initTtsVoicesUseCase$selectVoice$1.f22785g = 8;
                if (((C1368a) si7Var).m7900q0(linkedHashMapM15372Y2, initTtsVoicesUseCase$selectVoice$1) != obj) {
                    initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                    initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                    initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                    if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                        str5 = textToSpeechVoice.f19570a;
                        initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                        initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                        initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                        initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                        initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                        if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                            return xfaVar;
                        }
                    }
                }
                return obj;
            case 8:
                textToSpeechVoice = initTtsVoicesUseCase$selectVoice$1.f22782d;
                str3 = initTtsVoicesUseCase$selectVoice$1.f22779a;
                AbstractC3193b.m15359b(objMo8492m1);
                initTtsVoicesUseCase$selectVoice$1.f22779a = str3;
                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                initTtsVoicesUseCase$selectVoice$1.f22782d = textToSpeechVoice;
                initTtsVoicesUseCase$selectVoice$1.f22785g = 9;
                if (((C1368a) si7Var).m7906t0(true, initTtsVoicesUseCase$selectVoice$1) != obj) {
                    str5 = textToSpeechVoice.f19570a;
                    initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                    initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                    initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                    initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                    initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                    if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                        return xfaVar;
                    }
                }
                return obj;
            case 9:
                textToSpeechVoice = initTtsVoicesUseCase$selectVoice$1.f22782d;
                str3 = initTtsVoicesUseCase$selectVoice$1.f22779a;
                AbstractC3193b.m15359b(objMo8492m1);
                str5 = textToSpeechVoice.f19570a;
                initTtsVoicesUseCase$selectVoice$1.f22779a = null;
                initTtsVoicesUseCase$selectVoice$1.f22780b = null;
                initTtsVoicesUseCase$selectVoice$1.f22781c = null;
                initTtsVoicesUseCase$selectVoice$1.f22782d = null;
                initTtsVoicesUseCase$selectVoice$1.f22785g = 10;
                if (m8623f(str3, str5, initTtsVoicesUseCase$selectVoice$1) == obj) {
                    return obj;
                }
                return xfaVar;
            case 10:
                AbstractC3193b.m15359b(objMo8492m1);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public C1863b(C1307w c1307w, sca scaVar, si7 si7Var) {
        c1307w.getClass();
        scaVar.getClass();
        si7Var.getClass();
        this.f22921b = c1307w;
        this.f22922c = scaVar;
        this.f22920a = si7Var;
    }

    public C1863b(si7 si7Var, lm4 lm4Var, hm5 hm5Var) {
        si7Var.getClass();
        lm4Var.getClass();
        hm5Var.getClass();
        this.f22920a = si7Var;
        this.f22921b = lm4Var;
        this.f22922c = hm5Var;
    }
}
