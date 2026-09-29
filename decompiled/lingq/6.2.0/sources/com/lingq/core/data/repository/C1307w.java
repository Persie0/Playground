package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import com.lingq.core.network.api.result.ResultFreeAiTts;
import com.lingq.core.network.api.result.ResultPreferredTtsVoice;
import com.lingq.core.network.api.result.ResultPreferredTtsVoices;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.C2960ed;
import p000.C3386nv;
import p000.aj7;
import p000.bj7;
import p000.c83;
import p000.cda;
import p000.cj7;
import p000.fa4;
import p000.gm5;
import p000.h0a;
import p000.i93;
import p000.kk8;
import p000.km7;
import p000.r3a;
import p000.rm5;
import p000.si7;
import p000.sm5;
import p000.u91;
import p000.ux5;
import p000.vca;
import p000.vk9;
import p000.vz1;
import p000.xca;
import p000.xfa;
import p000.zca;

/* JADX INFO: renamed from: com.lingq.core.data.repository.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1307w {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16563a;

    /* JADX INFO: renamed from: b */
    public final zca f16564b;

    /* JADX INFO: renamed from: c */
    public final cda f16565c;

    /* JADX INFO: renamed from: d */
    public final si7 f16566d;

    /* JADX INFO: renamed from: e */
    public final km7 f16567e;

    public C1307w(LingQDatabase lingQDatabase, zca zcaVar, cda cdaVar, si7 si7Var, km7 km7Var) {
        lingQDatabase.getClass();
        zcaVar.getClass();
        cdaVar.getClass();
        si7Var.getClass();
        km7Var.getClass();
        this.f16563a = lingQDatabase;
        this.f16564b = zcaVar;
        this.f16565c = cdaVar;
        this.f16566d = si7Var;
        this.f16567e = km7Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d4 -> B:35:0x00d7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m7386a(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1307w.m7386a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7387b(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$downgradedNameFor$1 ttsRepositoryImpl$downgradedNameFor$1;
        if (continuationImpl instanceof TtsRepositoryImpl$downgradedNameFor$1) {
            ttsRepositoryImpl$downgradedNameFor$1 = (TtsRepositoryImpl$downgradedNameFor$1) continuationImpl;
            int i = ttsRepositoryImpl$downgradedNameFor$1.f16211e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$downgradedNameFor$1.f16211e = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$downgradedNameFor$1 = new TtsRepositoryImpl$downgradedNameFor$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$downgradedNameFor$1 = new TtsRepositoryImpl$downgradedNameFor$1(this, continuationImpl);
        }
        Object objM7403r = ttsRepositoryImpl$downgradedNameFor$1.f16209c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$downgradedNameFor$1.f16211e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7403r);
            ttsRepositoryImpl$downgradedNameFor$1.f16207a = str;
            ttsRepositoryImpl$downgradedNameFor$1.f16208b = str3;
            ttsRepositoryImpl$downgradedNameFor$1.f16211e = 1;
            objM7403r = m7403r(str, str2, true, ttsRepositoryImpl$downgradedNameFor$1);
            if (objM7403r != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str3 = ttsRepositoryImpl$downgradedNameFor$1.f16208b;
            str = ttsRepositoryImpl$downgradedNameFor$1.f16207a;
            AbstractC3193b.m15359b(objM7403r);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7403r);
        }
        TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) objM7403r;
        if (textToSpeechVoice != null) {
            return textToSpeechVoice.m8121a();
        }
        return null;
        TextToSpeechVoice textToSpeechVoice2 = (TextToSpeechVoice) objM7403r;
        if (textToSpeechVoice2 != null && ((textToSpeechVoice2.m8125e() && (fa4.m11650l(str3, "premium") || fa4.m11650l(str3, "free"))) || (textToSpeechVoice2.m8126f() && fa4.m11650l(str3, "free")))) {
            ttsRepositoryImpl$downgradedNameFor$1.f16207a = null;
            ttsRepositoryImpl$downgradedNameFor$1.f16208b = null;
            ttsRepositoryImpl$downgradedNameFor$1.f16211e = 2;
            objM7403r = m7395j(str, ttsRepositoryImpl$downgradedNameFor$1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7388c(String str, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$ensureSupportedVoicesFetched$1 ttsRepositoryImpl$ensureSupportedVoicesFetched$1;
        Object failure;
        if (continuationImpl instanceof TtsRepositoryImpl$ensureSupportedVoicesFetched$1) {
            ttsRepositoryImpl$ensureSupportedVoicesFetched$1 = (TtsRepositoryImpl$ensureSupportedVoicesFetched$1) continuationImpl;
            int i = ttsRepositoryImpl$ensureSupportedVoicesFetched$1.f16215d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$ensureSupportedVoicesFetched$1.f16215d = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$ensureSupportedVoicesFetched$1 = new TtsRepositoryImpl$ensureSupportedVoicesFetched$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$ensureSupportedVoicesFetched$1 = new TtsRepositoryImpl$ensureSupportedVoicesFetched$1(this, continuationImpl);
        }
        Object obj = ttsRepositoryImpl$ensureSupportedVoicesFetched$1.f16213b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$ensureSupportedVoicesFetched$1.f16215d;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                ttsRepositoryImpl$ensureSupportedVoicesFetched$1.f16212a = str;
                ttsRepositoryImpl$ensureSupportedVoicesFetched$1.f16215d = 1;
                if (m7407v(str, ttsRepositoryImpl$ensureSupportedVoicesFetched$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ttsRepositoryImpl$ensureSupportedVoicesFetched$1.f16212a;
                AbstractC3193b.m15359b(obj);
            }
            failure = xfaVar;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable thM15355a = Result.m15355a(failure);
        if (thM15355a != null) {
            if (thM15355a instanceof CancellationException) {
                throw thM15355a;
            }
            rm5 rm5Var = sm5.Companion;
            String str2 = "TTS ensureSupportedVoicesFetched: language=" + str + " failed - " + thM15355a.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str2, new Object[0]);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        if (((xfa) failure) != null) {
            return xfaVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m7389d(String str, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$fetchAiVoiceSample$1 ttsRepositoryImpl$fetchAiVoiceSample$1;
        if (continuationImpl instanceof TtsRepositoryImpl$fetchAiVoiceSample$1) {
            ttsRepositoryImpl$fetchAiVoiceSample$1 = (TtsRepositoryImpl$fetchAiVoiceSample$1) continuationImpl;
            int i = ttsRepositoryImpl$fetchAiVoiceSample$1.f16218c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$fetchAiVoiceSample$1.f16218c = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$fetchAiVoiceSample$1 = new TtsRepositoryImpl$fetchAiVoiceSample$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$fetchAiVoiceSample$1 = new TtsRepositoryImpl$fetchAiVoiceSample$1(this, continuationImpl);
        }
        Object objM4553f = ttsRepositoryImpl$fetchAiVoiceSample$1.f16216a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$fetchAiVoiceSample$1.f16218c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM4553f);
                cda cdaVar = this.f16565c;
                ttsRepositoryImpl$fetchAiVoiceSample$1.f16218c = 1;
                objM4553f = cdaVar.m4553f(str, ttsRepositoryImpl$fetchAiVoiceSample$1);
                if (objM4553f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM4553f);
            }
            ResultFreeAiTts resultFreeAiTts = (ResultFreeAiTts) objM4553f;
            String strM8359a = resultFreeAiTts.m8359a();
            if (strM8359a == null) {
                return null;
            }
            String strM8360b = resultFreeAiTts.m8360b();
            String str2 = "";
            if (strM8360b == null) {
                strM8360b = "";
            }
            String strM8361c = resultFreeAiTts.m8361c();
            if (strM8361c != null) {
                str2 = strM8361c;
            }
            return new C2960ed(strM8359a, strM8360b, str2);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rm5 rm5Var = sm5.Companion;
            String str3 = "fetchAiVoiceSample failed: " + e2.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str3, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m7390e(String str, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$fetchPreferredVoiceName$1 ttsRepositoryImpl$fetchPreferredVoiceName$1;
        Object next;
        String strM8385b;
        if (continuationImpl instanceof TtsRepositoryImpl$fetchPreferredVoiceName$1) {
            ttsRepositoryImpl$fetchPreferredVoiceName$1 = (TtsRepositoryImpl$fetchPreferredVoiceName$1) continuationImpl;
            int i = ttsRepositoryImpl$fetchPreferredVoiceName$1.f16222d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$fetchPreferredVoiceName$1.f16222d = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$fetchPreferredVoiceName$1 = new TtsRepositoryImpl$fetchPreferredVoiceName$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$fetchPreferredVoiceName$1 = new TtsRepositoryImpl$fetchPreferredVoiceName$1(this, continuationImpl);
        }
        Object objM4552e = ttsRepositoryImpl$fetchPreferredVoiceName$1.f16220b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$fetchPreferredVoiceName$1.f16222d;
        String str2 = null;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM4552e);
                cda cdaVar = this.f16565c;
                ttsRepositoryImpl$fetchPreferredVoiceName$1.f16219a = str;
                ttsRepositoryImpl$fetchPreferredVoiceName$1.f16222d = 1;
                objM4552e = cdaVar.m4552e(str, ttsRepositoryImpl$fetchPreferredVoiceName$1);
                if (objM4552e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ttsRepositoryImpl$fetchPreferredVoiceName$1.f16219a;
                AbstractC3193b.m15359b(objM4552e);
            }
            ResultPreferredTtsVoices resultPreferredTtsVoices = (ResultPreferredTtsVoices) objM4552e;
            Iterator it = resultPreferredTtsVoices.m8386a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String strM8384a = ((ResultPreferredTtsVoice) next).m8384a();
                if (strM8384a != null && vk9.m23380c0(strM8384a, "tts-voices/all/", false)) {
                    break;
                }
            }
            ResultPreferredTtsVoice resultPreferredTtsVoice = (ResultPreferredTtsVoice) next;
            if (resultPreferredTtsVoice == null) {
                resultPreferredTtsVoice = (ResultPreferredTtsVoice) u91.m22591I0(resultPreferredTtsVoices.m8386a());
            }
            if (resultPreferredTtsVoice != null && (strM8385b = resultPreferredTtsVoice.m8385b()) != null && !vk9.m23391n0(strM8385b)) {
                str2 = strM8385b;
            }
            return new bj7(str2);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rm5 rm5Var = sm5.Companion;
            String str3 = "TTS fetchPreferredVoiceName: language=" + str + " failed - " + e2.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str3, new Object[0]);
            return aj7.f726a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022d  */
    /* JADX WARN: Code duplicated, block: B:105:0x023d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0258  */
    /* JADX WARN: Code duplicated, block: B:110:0x025a  */
    /* JADX WARN: Code duplicated, block: B:113:0x026a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[LOOP:1: B:103:0x0237->B:125:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[LOOP:2: B:111:0x0264->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #0 {all -> 0x0074, blocks: (B:18:0x0070, B:36:0x00cd, B:33:0x00ba), top: B:118:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd A[Catch: all -> 0x0074, PHI: r2 r6 r12
      0x00cd: PHI (r2v28 ??) = (r2v39 ??), (r2v40 ??) binds: [B:34:0x00c9, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r6v15 ??) = (r6v27 ??), (r6v28 ??) binds: [B:34:0x00c9, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r12v25 ??) = (r12v38 ??), (r12v39 ??) binds: [B:34:0x00c9, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:18:0x0070, B:36:0x00cd, B:33:0x00ba), top: B:118:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f A[PHI: r2 r6 r12 r13
      0x011f: PHI (r2v3 ??) = (r2v37 ??), (r2v38 ??) binds: [B:48:0x011d, B:32:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r6v2 ??) = (r6v25 ??), (r6v26 ??) binds: [B:48:0x011d, B:32:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r12v3 ??) = (r12v36 ??), (r12v37 ??) binds: [B:48:0x011d, B:32:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r13v10 com.lingq.core.domain.model.token.TextToSpeechVoice) = 
      (r13v13 com.lingq.core.domain.model.token.TextToSpeechVoice)
      (r13v44 com.lingq.core.domain.model.token.TextToSpeechVoice)
     binds: [B:48:0x011d, B:32:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x017c  */
    /* JADX WARN: Code duplicated, block: B:69:0x018b  */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01db A[DONT_INVERT, PHI: r7 r12 r13
      0x01db: PHI (r7v14 ??) = (r7v10 ??), (r7v15 ??) binds: [B:75:0x0199, B:84:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r12v16 com.lingq.core.domain.model.token.TextToSpeechVoice) = 
      (r12v10 com.lingq.core.domain.model.token.TextToSpeechVoice)
      (r12v19 com.lingq.core.domain.model.token.TextToSpeechVoice)
     binds: [B:75:0x0199, B:84:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x01db: PHI (r13v35 com.lingq.core.domain.model.token.TextToSpeechVoice) = 
      (r13v20 com.lingq.core.domain.model.token.TextToSpeechVoice)
      (r13v36 com.lingq.core.domain.model.token.TextToSpeechVoice)
     binds: [B:75:0x0199, B:84:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0206  */
    /* JADX WARN: Code duplicated, block: B:96:0x0216  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        if (r13 == r1) goto L82;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00e0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.lingq.core.data.repository.w] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7391f(String str, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$fetchPriorityVoice$1 ttsRepositoryImpl$fetchPriorityVoice$1;
        Object failure;
        ?? r12;
        ?? r2;
        Throwable thM15355a;
        TextToSpeechVoice textToSpeechVoice;
        ?? r13;
        ?? r6;
        ?? r3;
        Object objM15541t;
        ?? r4;
        TextToSpeechVoice textToSpeechVoice2;
        ?? r7;
        ?? r8;
        ?? r14;
        ?? r9;
        ?? r5;
        String str2;
        String str3;
        TextToSpeechVoice textToSpeechVoice3;
        Object objM7403r;
        TextToSpeechVoice textToSpeechVoice4;
        String str4;
        ?? r10;
        ?? r11;
        ?? r15;
        ?? r16;
        String strM8121a;
        ?? r17;
        String strM8121a2;
        TextToSpeechVoice textToSpeechVoice5;
        TextToSpeechVoice textToSpeechVoice6;
        ?? r0;
        Iterator it;
        Object next;
        TextToSpeechAppVoice textToSpeechAppVoice;
        ?? r18;
        String str5;
        Ref$BooleanRef ref$BooleanRef;
        Object objM7395j;
        ?? r19;
        Ref$BooleanRef ref$BooleanRef2;
        String str6;
        ?? r20;
        if (continuationImpl instanceof TtsRepositoryImpl$fetchPriorityVoice$1) {
            ttsRepositoryImpl$fetchPriorityVoice$1 = (TtsRepositoryImpl$fetchPriorityVoice$1) continuationImpl;
            int i = ttsRepositoryImpl$fetchPriorityVoice$1.f16232j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$fetchPriorityVoice$1 = new TtsRepositoryImpl$fetchPriorityVoice$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$fetchPriorityVoice$1 = new TtsRepositoryImpl$fetchPriorityVoice$1(this, continuationImpl);
        }
        Object objM7395j2 = ttsRepositoryImpl$fetchPriorityVoice$1.f16230h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r21 = ttsRepositoryImpl$fetchPriorityVoice$1.f16232j;
        Object obj = null;
        try {
            switch (r21) {
                case 0:
                    AbstractC3193b.m15359b(objM7395j2);
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = str;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 1;
                    objM7395j2 = ((C1267a) this.f16567e).m7072M(ttsRepositoryImpl$fetchPriorityVoice$1);
                    r18 = str;
                    if (objM7395j2 != coroutineSingletons) {
                        str5 = (String) objM7395j2;
                        ref$BooleanRef = new Ref$BooleanRef();
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r18;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = str5;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = ref$BooleanRef;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 2;
                        objM7395j = m7395j(r18, ttsRepositoryImpl$fetchPriorityVoice$1);
                        if (objM7395j != coroutineSingletons) {
                            r19 = r18;
                            ref$BooleanRef2 = ref$BooleanRef;
                            str6 = str5;
                            objM7395j2 = objM7395j;
                            textToSpeechVoice = (TextToSpeechVoice) objM7395j2;
                            r3 = str6;
                            r6 = r19;
                            r13 = ref$BooleanRef2;
                            if (textToSpeechVoice == null) {
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r19;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = str6;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = ref$BooleanRef2;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 3;
                                if (m7407v(r19, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                    r21 = str6;
                                    r20 = r19;
                                    str = ref$BooleanRef2;
                                    failure = xfa.f68157a;
                                    r2 = r21;
                                    r12 = str;
                                    thM15355a = Result.m15355a(failure);
                                    if (thM15355a != null) {
                                        if (!(thM15355a instanceof CancellationException)) {
                                            throw thM15355a;
                                        }
                                        rm5 rm5Var = sm5.Companion;
                                        String str7 = "TTS fetchPriorityVoice: Failed to fetch voices for language=" + r20 + ": " + thM15355a.getMessage();
                                        rm5Var.getClass();
                                        h0a.f41641a.mo11431b(str7, new Object[0]);
                                    }
                                    r12.f47713a = true;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r20;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r2;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = r12;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 4;
                                    objM7395j2 = m7395j(r20, ttsRepositoryImpl$fetchPriorityVoice$1);
                                    r5 = r2;
                                    r9 = r20;
                                    r14 = r12;
                                } else {
                                    r21 = str6;
                                    r20 = r19;
                                    str = ref$BooleanRef2;
                                }
                            } else {
                                c83 c83Var = ((C1368a) this.f16566d).f18373R0;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r6;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r3;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = r13;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 5;
                                objM15541t = AbstractC3224d.m15541t(c83Var, ttsRepositoryImpl$fetchPriorityVoice$1);
                                if (objM15541t != coroutineSingletons) {
                                    ?? r110 = r3;
                                    r4 = r13;
                                    textToSpeechVoice2 = textToSpeechVoice;
                                    objM7395j2 = objM15541t;
                                    r7 = r6;
                                    r8 = r110;
                                    str2 = (String) ((Map) objM7395j2).get(r7);
                                    if (str2 == null) {
                                        str3 = str2;
                                        textToSpeechVoice3 = null;
                                        if (textToSpeechVoice3 != null) {
                                            r16 = r8;
                                            r15 = r7;
                                            textToSpeechVoice2 = textToSpeechVoice3.m8125e() ? null : null;
                                            if (textToSpeechVoice2 != null) {
                                                strM8121a = textToSpeechVoice2.m8121a();
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                                if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                    r17 = r15;
                                                    strM8121a2 = textToSpeechVoice2.m8121a();
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                                    if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                        textToSpeechVoice5 = textToSpeechVoice2;
                                                        textToSpeechVoice6 = textToSpeechVoice3;
                                                        r0 = r17;
                                                        textToSpeechVoice3 = textToSpeechVoice6;
                                                        r15 = r0;
                                                        textToSpeechVoice2 = textToSpeechVoice5;
                                                        if (textToSpeechVoice2 == null) {
                                                            textToSpeechVoice2 = textToSpeechVoice3;
                                                        }
                                                    }
                                                }
                                            } else if (textToSpeechVoice2 == null) {
                                                textToSpeechVoice2 = textToSpeechVoice3;
                                            }
                                        } else if (str3 != null) {
                                            rm5 rm5Var2 = sm5.Companion;
                                            String strM22991n = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                                            rm5Var2.getClass();
                                            h0a.f41641a.mo11431b(strM22991n, new Object[0]);
                                        }
                                        if (textToSpeechVoice2 == null) {
                                            return null;
                                        }
                                        if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                                            for (Object obj2 : textToSpeechVoice2.m8124d()) {
                                                if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                    obj = obj2;
                                                    return (TextToSpeechAppVoice) obj;
                                                }
                                            }
                                            return (TextToSpeechAppVoice) obj;
                                        }
                                        it = textToSpeechVoice2.m8124d().iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                            if (textToSpeechAppVoice == null) {
                                                return textToSpeechAppVoice;
                                            }
                                            for (Object obj3 : textToSpeechVoice2.m8124d()) {
                                                if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                    obj = obj3;
                                                    return (TextToSpeechAppVoice) obj;
                                                }
                                            }
                                            return (TextToSpeechAppVoice) obj;
                                        } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                        if (textToSpeechAppVoice == null) {
                                            return textToSpeechAppVoice;
                                        }
                                        while (r11.hasNext()) {
                                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                obj = obj3;
                                                return (TextToSpeechAppVoice) obj;
                                            }
                                        }
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                    boolean z = !r4.f47713a;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r7;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r8;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice2;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = str2;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 6;
                                    objM7403r = m7403r(r7, str2, z, ttsRepositoryImpl$fetchPriorityVoice$1);
                                    if (objM7403r != coroutineSingletons) {
                                        textToSpeechVoice4 = textToSpeechVoice2;
                                        str4 = str2;
                                        objM7395j2 = objM7403r;
                                        r10 = r8;
                                        r11 = r7;
                                        textToSpeechVoice3 = (TextToSpeechVoice) objM7395j2;
                                        TextToSpeechVoice textToSpeechVoice7 = textToSpeechVoice4;
                                        str3 = str4;
                                        textToSpeechVoice2 = textToSpeechVoice7;
                                        r15 = r11;
                                        r16 = r10;
                                        if (textToSpeechVoice3 != null) {
                                            r16 = r8;
                                            r15 = r7;
                                            if ((textToSpeechVoice3.m8125e() || (!fa4.m11650l(r16, "premium") && !fa4.m11650l(r16, "free"))) && (!textToSpeechVoice3.m8126f() || !fa4.m11650l(r16, "free"))) {
                                            }
                                            if (textToSpeechVoice2 != null) {
                                                strM8121a = textToSpeechVoice2.m8121a();
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                                if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                    r17 = r15;
                                                    strM8121a2 = textToSpeechVoice2.m8121a();
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                                    if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                        textToSpeechVoice5 = textToSpeechVoice2;
                                                        textToSpeechVoice6 = textToSpeechVoice3;
                                                        r0 = r17;
                                                        textToSpeechVoice3 = textToSpeechVoice6;
                                                        r15 = r0;
                                                        textToSpeechVoice2 = textToSpeechVoice5;
                                                        if (textToSpeechVoice2 == null) {
                                                            textToSpeechVoice2 = textToSpeechVoice3;
                                                        }
                                                    }
                                                }
                                            } else if (textToSpeechVoice2 == null) {
                                                textToSpeechVoice2 = textToSpeechVoice3;
                                            }
                                        } else if (str3 != null) {
                                            rm5 rm5Var3 = sm5.Companion;
                                            String strM22991n2 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                                            rm5Var3.getClass();
                                            h0a.f41641a.mo11431b(strM22991n2, new Object[0]);
                                        }
                                        if (textToSpeechVoice2 == null) {
                                            return null;
                                        }
                                        if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                                            while (r11.hasNext()) {
                                                if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                    obj = obj2;
                                                    return (TextToSpeechAppVoice) obj;
                                                }
                                            }
                                            return (TextToSpeechAppVoice) obj;
                                        }
                                        it = textToSpeechVoice2.m8124d().iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                            if (textToSpeechAppVoice == null) {
                                                return textToSpeechAppVoice;
                                            }
                                            while (r11.hasNext()) {
                                                if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                    obj = obj3;
                                                    return (TextToSpeechAppVoice) obj;
                                                }
                                            }
                                            return (TextToSpeechAppVoice) obj;
                                        } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                        if (textToSpeechAppVoice == null) {
                                            return textToSpeechAppVoice;
                                        }
                                        while (r11.hasNext()) {
                                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                obj = obj3;
                                                return (TextToSpeechAppVoice) obj;
                                            }
                                        }
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return coroutineSingletons;
                case 1:
                    String str8 = ttsRepositoryImpl$fetchPriorityVoice$1.f16223a;
                    AbstractC3193b.m15359b(objM7395j2);
                    r18 = str8;
                    str5 = (String) objM7395j2;
                    ref$BooleanRef = new Ref$BooleanRef();
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r18;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = str5;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = ref$BooleanRef;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 2;
                    objM7395j = m7395j(r18, ttsRepositoryImpl$fetchPriorityVoice$1);
                    if (objM7395j != coroutineSingletons) {
                        r19 = r18;
                        ref$BooleanRef2 = ref$BooleanRef;
                        str6 = str5;
                        objM7395j2 = objM7395j;
                        textToSpeechVoice = (TextToSpeechVoice) objM7395j2;
                        r3 = str6;
                        r6 = r19;
                        r13 = ref$BooleanRef2;
                        if (textToSpeechVoice == null) {
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r19;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = str6;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = ref$BooleanRef2;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 3;
                            if (m7407v(r19, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                r21 = str6;
                                r20 = r19;
                                str = ref$BooleanRef2;
                                failure = xfa.f68157a;
                                r2 = r21;
                                r12 = str;
                                thM15355a = Result.m15355a(failure);
                                if (thM15355a != null) {
                                    if (!(thM15355a instanceof CancellationException)) {
                                        throw thM15355a;
                                    }
                                    rm5 rm5Var4 = sm5.Companion;
                                    String str9 = "TTS fetchPriorityVoice: Failed to fetch voices for language=" + r20 + ": " + thM15355a.getMessage();
                                    rm5Var4.getClass();
                                    h0a.f41641a.mo11431b(str9, new Object[0]);
                                }
                                r12.f47713a = true;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r20;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r2;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = r12;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 4;
                                objM7395j2 = m7395j(r20, ttsRepositoryImpl$fetchPriorityVoice$1);
                                r5 = r2;
                                r9 = r20;
                                r14 = r12;
                            } else {
                                r21 = str6;
                                r20 = r19;
                                str = ref$BooleanRef2;
                            }
                        } else {
                            c83 c83Var2 = ((C1368a) this.f16566d).f18373R0;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r6;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r3;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = r13;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 5;
                            objM15541t = AbstractC3224d.m15541t(c83Var2, ttsRepositoryImpl$fetchPriorityVoice$1);
                            if (objM15541t != coroutineSingletons) {
                                ?? r111 = r3;
                                r4 = r13;
                                textToSpeechVoice2 = textToSpeechVoice;
                                objM7395j2 = objM15541t;
                                r7 = r6;
                                r8 = r111;
                                str2 = (String) ((Map) objM7395j2).get(r7);
                                if (str2 == null) {
                                    str3 = str2;
                                    textToSpeechVoice3 = null;
                                    if (textToSpeechVoice3 != null) {
                                        r16 = r8;
                                        r15 = r7;
                                        if (textToSpeechVoice3.m8125e()) {
                                        }
                                        if (textToSpeechVoice2 != null) {
                                            strM8121a = textToSpeechVoice2.m8121a();
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                            if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                r17 = r15;
                                                strM8121a2 = textToSpeechVoice2.m8121a();
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                                if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                    textToSpeechVoice5 = textToSpeechVoice2;
                                                    textToSpeechVoice6 = textToSpeechVoice3;
                                                    r0 = r17;
                                                    textToSpeechVoice3 = textToSpeechVoice6;
                                                    r15 = r0;
                                                    textToSpeechVoice2 = textToSpeechVoice5;
                                                    if (textToSpeechVoice2 == null) {
                                                        textToSpeechVoice2 = textToSpeechVoice3;
                                                    }
                                                }
                                            }
                                        } else if (textToSpeechVoice2 == null) {
                                            textToSpeechVoice2 = textToSpeechVoice3;
                                        }
                                    } else if (str3 != null) {
                                        rm5 rm5Var5 = sm5.Companion;
                                        String strM22991n3 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                                        rm5Var5.getClass();
                                        h0a.f41641a.mo11431b(strM22991n3, new Object[0]);
                                    }
                                    if (textToSpeechVoice2 == null) {
                                        return null;
                                    }
                                    if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                                        while (r11.hasNext()) {
                                            if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                obj = obj2;
                                                return (TextToSpeechAppVoice) obj;
                                            }
                                        }
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                    it = textToSpeechVoice2.m8124d().iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                        if (textToSpeechAppVoice == null) {
                                            return textToSpeechAppVoice;
                                        }
                                        while (r11.hasNext()) {
                                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                obj = obj3;
                                                return (TextToSpeechAppVoice) obj;
                                            }
                                        }
                                        return (TextToSpeechAppVoice) obj;
                                    } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                                    textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                    if (textToSpeechAppVoice == null) {
                                        return textToSpeechAppVoice;
                                    }
                                    while (r11.hasNext()) {
                                        if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                            obj = obj3;
                                            return (TextToSpeechAppVoice) obj;
                                        }
                                    }
                                    return (TextToSpeechAppVoice) obj;
                                }
                                boolean z2 = !r4.f47713a;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r7;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r8;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice2;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = str2;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 6;
                                objM7403r = m7403r(r7, str2, z2, ttsRepositoryImpl$fetchPriorityVoice$1);
                                if (objM7403r != coroutineSingletons) {
                                    textToSpeechVoice4 = textToSpeechVoice2;
                                    str4 = str2;
                                    objM7395j2 = objM7403r;
                                    r10 = r8;
                                    r11 = r7;
                                    textToSpeechVoice3 = (TextToSpeechVoice) objM7395j2;
                                    TextToSpeechVoice textToSpeechVoice8 = textToSpeechVoice4;
                                    str3 = str4;
                                    textToSpeechVoice2 = textToSpeechVoice8;
                                    r15 = r11;
                                    r16 = r10;
                                    if (textToSpeechVoice3 != null) {
                                        r16 = r8;
                                        r15 = r7;
                                        if (textToSpeechVoice3.m8125e()) {
                                        }
                                        if (textToSpeechVoice2 != null) {
                                            strM8121a = textToSpeechVoice2.m8121a();
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                            if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                r17 = r15;
                                                strM8121a2 = textToSpeechVoice2.m8121a();
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                                if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                    textToSpeechVoice5 = textToSpeechVoice2;
                                                    textToSpeechVoice6 = textToSpeechVoice3;
                                                    r0 = r17;
                                                    textToSpeechVoice3 = textToSpeechVoice6;
                                                    r15 = r0;
                                                    textToSpeechVoice2 = textToSpeechVoice5;
                                                    if (textToSpeechVoice2 == null) {
                                                        textToSpeechVoice2 = textToSpeechVoice3;
                                                    }
                                                }
                                            }
                                        } else if (textToSpeechVoice2 == null) {
                                            textToSpeechVoice2 = textToSpeechVoice3;
                                        }
                                    } else if (str3 != null) {
                                        rm5 rm5Var6 = sm5.Companion;
                                        String strM22991n4 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                                        rm5Var6.getClass();
                                        h0a.f41641a.mo11431b(strM22991n4, new Object[0]);
                                    }
                                    if (textToSpeechVoice2 == null) {
                                        return null;
                                    }
                                    if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                                        while (r11.hasNext()) {
                                            if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                obj = obj2;
                                                return (TextToSpeechAppVoice) obj;
                                            }
                                        }
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                    it = textToSpeechVoice2.m8124d().iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                        if (textToSpeechAppVoice == null) {
                                            return textToSpeechAppVoice;
                                        }
                                        while (r11.hasNext()) {
                                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                                obj = obj3;
                                                return (TextToSpeechAppVoice) obj;
                                            }
                                        }
                                        return (TextToSpeechAppVoice) obj;
                                    } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                                    textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                    if (textToSpeechAppVoice == null) {
                                        return textToSpeechAppVoice;
                                    }
                                    while (r11.hasNext()) {
                                        if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                            obj = obj3;
                                            return (TextToSpeechAppVoice) obj;
                                        }
                                    }
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                        }
                        break;
                    }
                    return coroutineSingletons;
                case 2:
                    Ref$BooleanRef ref$BooleanRef3 = ttsRepositoryImpl$fetchPriorityVoice$1.f16225c;
                    String str10 = ttsRepositoryImpl$fetchPriorityVoice$1.f16224b;
                    String str11 = ttsRepositoryImpl$fetchPriorityVoice$1.f16223a;
                    AbstractC3193b.m15359b(objM7395j2);
                    str6 = str10;
                    r19 = str11;
                    ref$BooleanRef2 = ref$BooleanRef3;
                    textToSpeechVoice = (TextToSpeechVoice) objM7395j2;
                    r3 = str6;
                    r6 = r19;
                    r13 = ref$BooleanRef2;
                    if (textToSpeechVoice == null) {
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r19;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = str6;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = ref$BooleanRef2;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 3;
                        if (m7407v(r19, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                            r21 = str6;
                            r20 = r19;
                            str = ref$BooleanRef2;
                            failure = xfa.f68157a;
                            r2 = r21;
                            r12 = str;
                            thM15355a = Result.m15355a(failure);
                            if (thM15355a != null) {
                                if (!(thM15355a instanceof CancellationException)) {
                                    throw thM15355a;
                                }
                                rm5 rm5Var7 = sm5.Companion;
                                String str12 = "TTS fetchPriorityVoice: Failed to fetch voices for language=" + r20 + ": " + thM15355a.getMessage();
                                rm5Var7.getClass();
                                h0a.f41641a.mo11431b(str12, new Object[0]);
                            }
                            r12.f47713a = true;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r20;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r2;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = r12;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 4;
                            objM7395j2 = m7395j(r20, ttsRepositoryImpl$fetchPriorityVoice$1);
                            r5 = r2;
                            r9 = r20;
                            r14 = r12;
                        } else {
                            r21 = str6;
                            r20 = r19;
                            str = ref$BooleanRef2;
                        }
                        break;
                    } else {
                        c83 c83Var3 = ((C1368a) this.f16566d).f18373R0;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r6;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r3;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = r13;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 5;
                        objM15541t = AbstractC3224d.m15541t(c83Var3, ttsRepositoryImpl$fetchPriorityVoice$1);
                        if (objM15541t != coroutineSingletons) {
                            ?? r112 = r3;
                            r4 = r13;
                            textToSpeechVoice2 = textToSpeechVoice;
                            objM7395j2 = objM15541t;
                            r7 = r6;
                            r8 = r112;
                            str2 = (String) ((Map) objM7395j2).get(r7);
                            if (str2 == null) {
                                str3 = str2;
                                textToSpeechVoice3 = null;
                                if (textToSpeechVoice3 != null) {
                                    r16 = r8;
                                    r15 = r7;
                                    if (textToSpeechVoice3.m8125e()) {
                                    }
                                    if (textToSpeechVoice2 != null) {
                                        strM8121a = textToSpeechVoice2.m8121a();
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                        if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                            r17 = r15;
                                            strM8121a2 = textToSpeechVoice2.m8121a();
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                            if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                textToSpeechVoice5 = textToSpeechVoice2;
                                                textToSpeechVoice6 = textToSpeechVoice3;
                                                r0 = r17;
                                                textToSpeechVoice3 = textToSpeechVoice6;
                                                r15 = r0;
                                                textToSpeechVoice2 = textToSpeechVoice5;
                                                if (textToSpeechVoice2 == null) {
                                                    textToSpeechVoice2 = textToSpeechVoice3;
                                                }
                                            }
                                        }
                                    } else if (textToSpeechVoice2 == null) {
                                        textToSpeechVoice2 = textToSpeechVoice3;
                                    }
                                } else if (str3 != null) {
                                    rm5 rm5Var8 = sm5.Companion;
                                    String strM22991n5 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                                    rm5Var8.getClass();
                                    h0a.f41641a.mo11431b(strM22991n5, new Object[0]);
                                }
                                if (textToSpeechVoice2 == null) {
                                    return null;
                                }
                                if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                                    while (r11.hasNext()) {
                                        if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                            obj = obj2;
                                            return (TextToSpeechAppVoice) obj;
                                        }
                                    }
                                    return (TextToSpeechAppVoice) obj;
                                }
                                it = textToSpeechVoice2.m8124d().iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                    if (textToSpeechAppVoice == null) {
                                        return textToSpeechAppVoice;
                                    }
                                    while (r11.hasNext()) {
                                        if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                            obj = obj3;
                                            return (TextToSpeechAppVoice) obj;
                                        }
                                    }
                                    return (TextToSpeechAppVoice) obj;
                                } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                                textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                if (textToSpeechAppVoice == null) {
                                    return textToSpeechAppVoice;
                                }
                                while (r11.hasNext()) {
                                    if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                        obj = obj3;
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                }
                                return (TextToSpeechAppVoice) obj;
                            }
                            boolean z3 = !r4.f47713a;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r7;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r8;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice2;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = str2;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = null;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 6;
                            objM7403r = m7403r(r7, str2, z3, ttsRepositoryImpl$fetchPriorityVoice$1);
                            if (objM7403r != coroutineSingletons) {
                                textToSpeechVoice4 = textToSpeechVoice2;
                                str4 = str2;
                                objM7395j2 = objM7403r;
                                r10 = r8;
                                r11 = r7;
                                textToSpeechVoice3 = (TextToSpeechVoice) objM7395j2;
                                TextToSpeechVoice textToSpeechVoice9 = textToSpeechVoice4;
                                str3 = str4;
                                textToSpeechVoice2 = textToSpeechVoice9;
                                r15 = r11;
                                r16 = r10;
                                if (textToSpeechVoice3 != null) {
                                    r16 = r8;
                                    r15 = r7;
                                    if (textToSpeechVoice3.m8125e()) {
                                    }
                                    if (textToSpeechVoice2 != null) {
                                        strM8121a = textToSpeechVoice2.m8121a();
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                        if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                            r17 = r15;
                                            strM8121a2 = textToSpeechVoice2.m8121a();
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                            if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                                textToSpeechVoice5 = textToSpeechVoice2;
                                                textToSpeechVoice6 = textToSpeechVoice3;
                                                r0 = r17;
                                                textToSpeechVoice3 = textToSpeechVoice6;
                                                r15 = r0;
                                                textToSpeechVoice2 = textToSpeechVoice5;
                                                if (textToSpeechVoice2 == null) {
                                                    textToSpeechVoice2 = textToSpeechVoice3;
                                                }
                                            }
                                        }
                                    } else if (textToSpeechVoice2 == null) {
                                        textToSpeechVoice2 = textToSpeechVoice3;
                                    }
                                } else if (str3 != null) {
                                    rm5 rm5Var9 = sm5.Companion;
                                    String strM22991n6 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                                    rm5Var9.getClass();
                                    h0a.f41641a.mo11431b(strM22991n6, new Object[0]);
                                }
                                if (textToSpeechVoice2 == null) {
                                    return null;
                                }
                                if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                                    while (r11.hasNext()) {
                                        if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                            obj = obj2;
                                            return (TextToSpeechAppVoice) obj;
                                        }
                                    }
                                    return (TextToSpeechAppVoice) obj;
                                }
                                it = textToSpeechVoice2.m8124d().iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                    if (textToSpeechAppVoice == null) {
                                        return textToSpeechAppVoice;
                                    }
                                    while (r11.hasNext()) {
                                        if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                            obj = obj3;
                                            return (TextToSpeechAppVoice) obj;
                                        }
                                    }
                                    return (TextToSpeechAppVoice) obj;
                                } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                                textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                if (textToSpeechAppVoice == null) {
                                    return textToSpeechAppVoice;
                                }
                                while (r11.hasNext()) {
                                    if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                        obj = obj3;
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                }
                                return (TextToSpeechAppVoice) obj;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 3:
                    Ref$BooleanRef ref$BooleanRef4 = ttsRepositoryImpl$fetchPriorityVoice$1.f16225c;
                    String str13 = ttsRepositoryImpl$fetchPriorityVoice$1.f16224b;
                    String str14 = ttsRepositoryImpl$fetchPriorityVoice$1.f16223a;
                    AbstractC3193b.m15359b(objM7395j2);
                    r21 = str13;
                    r20 = str14;
                    str = ref$BooleanRef4;
                    r21 = str6;
                    r20 = r19;
                    str = ref$BooleanRef2;
                    failure = xfa.f68157a;
                    r2 = r21;
                    r12 = str;
                    thM15355a = Result.m15355a(failure);
                    if (thM15355a != null) {
                        if (!(thM15355a instanceof CancellationException)) {
                            throw thM15355a;
                        }
                        rm5 rm5Var10 = sm5.Companion;
                        String str15 = "TTS fetchPriorityVoice: Failed to fetch voices for language=" + r20 + ": " + thM15355a.getMessage();
                        rm5Var10.getClass();
                        h0a.f41641a.mo11431b(str15, new Object[0]);
                    }
                    r12.f47713a = true;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r20;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r2;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = r12;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 4;
                    objM7395j2 = m7395j(r20, ttsRepositoryImpl$fetchPriorityVoice$1);
                    r5 = r2;
                    r9 = r20;
                    r14 = r12;
                    break;
                case 4:
                    Ref$BooleanRef ref$BooleanRef5 = ttsRepositoryImpl$fetchPriorityVoice$1.f16225c;
                    String str16 = ttsRepositoryImpl$fetchPriorityVoice$1.f16224b;
                    String str17 = ttsRepositoryImpl$fetchPriorityVoice$1.f16223a;
                    AbstractC3193b.m15359b(objM7395j2);
                    r5 = str16;
                    r9 = str17;
                    r14 = ref$BooleanRef5;
                    textToSpeechVoice = (TextToSpeechVoice) objM7395j2;
                    r3 = r5;
                    r6 = r9;
                    r13 = r14;
                    c83 c83Var4 = ((C1368a) this.f16566d).f18373R0;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r6;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r3;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = r13;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 5;
                    objM15541t = AbstractC3224d.m15541t(c83Var4, ttsRepositoryImpl$fetchPriorityVoice$1);
                    if (objM15541t != coroutineSingletons) {
                        ?? r113 = r3;
                        r4 = r13;
                        textToSpeechVoice2 = textToSpeechVoice;
                        objM7395j2 = objM15541t;
                        r7 = r6;
                        r8 = r113;
                        str2 = (String) ((Map) objM7395j2).get(r7);
                        if (str2 == null) {
                            str3 = str2;
                            textToSpeechVoice3 = null;
                            if (textToSpeechVoice3 != null) {
                                r16 = r8;
                                r15 = r7;
                                if (textToSpeechVoice3.m8125e()) {
                                }
                                if (textToSpeechVoice2 != null) {
                                    strM8121a = textToSpeechVoice2.m8121a();
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                    if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                        r17 = r15;
                                        strM8121a2 = textToSpeechVoice2.m8121a();
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                        if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                            textToSpeechVoice5 = textToSpeechVoice2;
                                            textToSpeechVoice6 = textToSpeechVoice3;
                                            r0 = r17;
                                            textToSpeechVoice3 = textToSpeechVoice6;
                                            r15 = r0;
                                            textToSpeechVoice2 = textToSpeechVoice5;
                                            if (textToSpeechVoice2 == null) {
                                                textToSpeechVoice2 = textToSpeechVoice3;
                                            }
                                        }
                                    }
                                } else if (textToSpeechVoice2 == null) {
                                    textToSpeechVoice2 = textToSpeechVoice3;
                                }
                            } else if (str3 != null) {
                                rm5 rm5Var11 = sm5.Companion;
                                String strM22991n7 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                                rm5Var11.getClass();
                                h0a.f41641a.mo11431b(strM22991n7, new Object[0]);
                            }
                            if (textToSpeechVoice2 == null) {
                                return null;
                            }
                            if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                                while (r11.hasNext()) {
                                    if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                        obj = obj2;
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                }
                                return (TextToSpeechAppVoice) obj;
                            }
                            it = textToSpeechVoice2.m8124d().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                if (textToSpeechAppVoice == null) {
                                    return textToSpeechAppVoice;
                                }
                                while (r11.hasNext()) {
                                    if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                        obj = obj3;
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                }
                                return (TextToSpeechAppVoice) obj;
                            } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                            textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                            if (textToSpeechAppVoice == null) {
                                return textToSpeechAppVoice;
                            }
                            while (r11.hasNext()) {
                                if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                    obj = obj3;
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                            return (TextToSpeechAppVoice) obj;
                        }
                        boolean z4 = !r4.f47713a;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r7;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r8;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice2;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = str2;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = null;
                        ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 6;
                        objM7403r = m7403r(r7, str2, z4, ttsRepositoryImpl$fetchPriorityVoice$1);
                        if (objM7403r != coroutineSingletons) {
                            textToSpeechVoice4 = textToSpeechVoice2;
                            str4 = str2;
                            objM7395j2 = objM7403r;
                            r10 = r8;
                            r11 = r7;
                            textToSpeechVoice3 = (TextToSpeechVoice) objM7395j2;
                            TextToSpeechVoice textToSpeechVoice10 = textToSpeechVoice4;
                            str3 = str4;
                            textToSpeechVoice2 = textToSpeechVoice10;
                            r15 = r11;
                            r16 = r10;
                            if (textToSpeechVoice3 != null) {
                                r16 = r8;
                                r15 = r7;
                                if (textToSpeechVoice3.m8125e()) {
                                }
                                if (textToSpeechVoice2 != null) {
                                    strM8121a = textToSpeechVoice2.m8121a();
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                    if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                        r17 = r15;
                                        strM8121a2 = textToSpeechVoice2.m8121a();
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                        ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                        if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                            textToSpeechVoice5 = textToSpeechVoice2;
                                            textToSpeechVoice6 = textToSpeechVoice3;
                                            r0 = r17;
                                            textToSpeechVoice3 = textToSpeechVoice6;
                                            r15 = r0;
                                            textToSpeechVoice2 = textToSpeechVoice5;
                                            if (textToSpeechVoice2 == null) {
                                                textToSpeechVoice2 = textToSpeechVoice3;
                                            }
                                        }
                                    }
                                } else if (textToSpeechVoice2 == null) {
                                    textToSpeechVoice2 = textToSpeechVoice3;
                                }
                            } else if (str3 != null) {
                                rm5 rm5Var12 = sm5.Companion;
                                String strM22991n8 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                                rm5Var12.getClass();
                                h0a.f41641a.mo11431b(strM22991n8, new Object[0]);
                            }
                            if (textToSpeechVoice2 == null) {
                                return null;
                            }
                            if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                                while (r11.hasNext()) {
                                    if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                        obj = obj2;
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                }
                                return (TextToSpeechAppVoice) obj;
                            }
                            it = textToSpeechVoice2.m8124d().iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                                if (textToSpeechAppVoice == null) {
                                    return textToSpeechAppVoice;
                                }
                                while (r11.hasNext()) {
                                    if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                        obj = obj3;
                                        return (TextToSpeechAppVoice) obj;
                                    }
                                }
                                return (TextToSpeechAppVoice) obj;
                            } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                            textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                            if (textToSpeechAppVoice == null) {
                                return textToSpeechAppVoice;
                            }
                            while (r11.hasNext()) {
                                if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                    obj = obj3;
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                            return (TextToSpeechAppVoice) obj;
                        }
                    }
                    return coroutineSingletons;
                case 5:
                    textToSpeechVoice2 = ttsRepositoryImpl$fetchPriorityVoice$1.f16226d;
                    Ref$BooleanRef ref$BooleanRef6 = ttsRepositoryImpl$fetchPriorityVoice$1.f16225c;
                    String str18 = ttsRepositoryImpl$fetchPriorityVoice$1.f16224b;
                    String str19 = ttsRepositoryImpl$fetchPriorityVoice$1.f16223a;
                    AbstractC3193b.m15359b(objM7395j2);
                    r4 = ref$BooleanRef6;
                    r8 = str18;
                    r7 = str19;
                    str2 = (String) ((Map) objM7395j2).get(r7);
                    if (str2 == null) {
                        str3 = str2;
                        textToSpeechVoice3 = null;
                        if (textToSpeechVoice3 != null) {
                            r16 = r8;
                            r15 = r7;
                            if (textToSpeechVoice3.m8125e()) {
                            }
                            if (textToSpeechVoice2 != null) {
                                strM8121a = textToSpeechVoice2.m8121a();
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                    r17 = r15;
                                    strM8121a2 = textToSpeechVoice2.m8121a();
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                    if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                        textToSpeechVoice5 = textToSpeechVoice2;
                                        textToSpeechVoice6 = textToSpeechVoice3;
                                        r0 = r17;
                                        textToSpeechVoice3 = textToSpeechVoice6;
                                        r15 = r0;
                                        textToSpeechVoice2 = textToSpeechVoice5;
                                        if (textToSpeechVoice2 == null) {
                                            textToSpeechVoice2 = textToSpeechVoice3;
                                        }
                                    }
                                }
                            } else if (textToSpeechVoice2 == null) {
                                textToSpeechVoice2 = textToSpeechVoice3;
                            }
                        } else if (str3 != null) {
                            rm5 rm5Var13 = sm5.Companion;
                            String strM22991n9 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                            rm5Var13.getClass();
                            h0a.f41641a.mo11431b(strM22991n9, new Object[0]);
                        }
                        if (textToSpeechVoice2 == null) {
                            return null;
                        }
                        if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                            while (r11.hasNext()) {
                                if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                    obj = obj2;
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                            return (TextToSpeechAppVoice) obj;
                        }
                        it = textToSpeechVoice2.m8124d().iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                            if (textToSpeechAppVoice == null) {
                                return textToSpeechAppVoice;
                            }
                            while (r11.hasNext()) {
                                if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                    obj = obj3;
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                            return (TextToSpeechAppVoice) obj;
                        } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                        if (textToSpeechAppVoice == null) {
                            return textToSpeechAppVoice;
                        }
                        while (r11.hasNext()) {
                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                obj = obj3;
                                return (TextToSpeechAppVoice) obj;
                            }
                        }
                        return (TextToSpeechAppVoice) obj;
                    }
                    boolean z5 = !r4.f47713a;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r7;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = r8;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = textToSpeechVoice2;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = str2;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = null;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 6;
                    objM7403r = m7403r(r7, str2, z5, ttsRepositoryImpl$fetchPriorityVoice$1);
                    if (objM7403r != coroutineSingletons) {
                        textToSpeechVoice4 = textToSpeechVoice2;
                        str4 = str2;
                        objM7395j2 = objM7403r;
                        r10 = r8;
                        r11 = r7;
                        textToSpeechVoice3 = (TextToSpeechVoice) objM7395j2;
                        TextToSpeechVoice textToSpeechVoice11 = textToSpeechVoice4;
                        str3 = str4;
                        textToSpeechVoice2 = textToSpeechVoice11;
                        r15 = r11;
                        r16 = r10;
                        if (textToSpeechVoice3 != null) {
                            r16 = r8;
                            r15 = r7;
                            if (textToSpeechVoice3.m8125e()) {
                            }
                            if (textToSpeechVoice2 != null) {
                                strM8121a = textToSpeechVoice2.m8121a();
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                                if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                    r17 = r15;
                                    strM8121a2 = textToSpeechVoice2.m8121a();
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                    if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                        textToSpeechVoice5 = textToSpeechVoice2;
                                        textToSpeechVoice6 = textToSpeechVoice3;
                                        r0 = r17;
                                        textToSpeechVoice3 = textToSpeechVoice6;
                                        r15 = r0;
                                        textToSpeechVoice2 = textToSpeechVoice5;
                                        if (textToSpeechVoice2 == null) {
                                            textToSpeechVoice2 = textToSpeechVoice3;
                                        }
                                    }
                                }
                            } else if (textToSpeechVoice2 == null) {
                                textToSpeechVoice2 = textToSpeechVoice3;
                            }
                        } else if (str3 != null) {
                            rm5 rm5Var14 = sm5.Companion;
                            String strM22991n10 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                            rm5Var14.getClass();
                            h0a.f41641a.mo11431b(strM22991n10, new Object[0]);
                        }
                        if (textToSpeechVoice2 == null) {
                            return null;
                        }
                        if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                            while (r11.hasNext()) {
                                if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                    obj = obj2;
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                            return (TextToSpeechAppVoice) obj;
                        }
                        it = textToSpeechVoice2.m8124d().iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                            if (textToSpeechAppVoice == null) {
                                return textToSpeechAppVoice;
                            }
                            while (r11.hasNext()) {
                                if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                    obj = obj3;
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                            return (TextToSpeechAppVoice) obj;
                        } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                        if (textToSpeechAppVoice == null) {
                            return textToSpeechAppVoice;
                        }
                        while (r11.hasNext()) {
                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                obj = obj3;
                                return (TextToSpeechAppVoice) obj;
                            }
                        }
                        return (TextToSpeechAppVoice) obj;
                    }
                    return coroutineSingletons;
                case 6:
                    str4 = ttsRepositoryImpl$fetchPriorityVoice$1.f16227e;
                    textToSpeechVoice4 = ttsRepositoryImpl$fetchPriorityVoice$1.f16226d;
                    String str20 = ttsRepositoryImpl$fetchPriorityVoice$1.f16224b;
                    String str21 = ttsRepositoryImpl$fetchPriorityVoice$1.f16223a;
                    AbstractC3193b.m15359b(objM7395j2);
                    r10 = str20;
                    r11 = str21;
                    textToSpeechVoice3 = (TextToSpeechVoice) objM7395j2;
                    TextToSpeechVoice textToSpeechVoice12 = textToSpeechVoice4;
                    str3 = str4;
                    textToSpeechVoice2 = textToSpeechVoice12;
                    r15 = r11;
                    r16 = r10;
                    if (textToSpeechVoice3 != null) {
                        r16 = r8;
                        r15 = r7;
                        if (textToSpeechVoice3.m8125e()) {
                        }
                        if (textToSpeechVoice2 != null) {
                            strM8121a = textToSpeechVoice2.m8121a();
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r15;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                            ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 7;
                            if (m7406u(r15, strM8121a, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                r17 = r15;
                                strM8121a2 = textToSpeechVoice2.m8121a();
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                                ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                                if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                                    textToSpeechVoice5 = textToSpeechVoice2;
                                    textToSpeechVoice6 = textToSpeechVoice3;
                                    r0 = r17;
                                    textToSpeechVoice3 = textToSpeechVoice6;
                                    r15 = r0;
                                    textToSpeechVoice2 = textToSpeechVoice5;
                                    if (textToSpeechVoice2 == null) {
                                        textToSpeechVoice2 = textToSpeechVoice3;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (textToSpeechVoice2 == null) {
                            textToSpeechVoice2 = textToSpeechVoice3;
                        }
                    } else if (str3 != null) {
                        rm5 rm5Var15 = sm5.Companion;
                        String strM22991n11 = ux5.m22991n("TTS fetchPriorityVoice: saved voice '", str3, "' unresolved for language=", r15, ", using default for this playback");
                        rm5Var15.getClass();
                        h0a.f41641a.mo11431b(strM22991n11, new Object[0]);
                    }
                    if (textToSpeechVoice2 == null) {
                        return null;
                    }
                    if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                        while (r11.hasNext()) {
                            if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                obj = obj2;
                                return (TextToSpeechAppVoice) obj;
                            }
                        }
                        return (TextToSpeechAppVoice) obj;
                    }
                    it = textToSpeechVoice2.m8124d().iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                        if (textToSpeechAppVoice == null) {
                            return textToSpeechAppVoice;
                        }
                        while (r11.hasNext()) {
                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                obj = obj3;
                                return (TextToSpeechAppVoice) obj;
                            }
                        }
                        return (TextToSpeechAppVoice) obj;
                    } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                    textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                    if (textToSpeechAppVoice == null) {
                        return textToSpeechAppVoice;
                    }
                    while (r11.hasNext()) {
                        if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                            obj = obj3;
                            return (TextToSpeechAppVoice) obj;
                        }
                    }
                    return (TextToSpeechAppVoice) obj;
                case 7:
                    textToSpeechVoice2 = ttsRepositoryImpl$fetchPriorityVoice$1.f16229g;
                    TextToSpeechVoice textToSpeechVoice13 = ttsRepositoryImpl$fetchPriorityVoice$1.f16228f;
                    String str22 = ttsRepositoryImpl$fetchPriorityVoice$1.f16223a;
                    AbstractC3193b.m15359b(objM7395j2);
                    textToSpeechVoice3 = textToSpeechVoice13;
                    r17 = str22;
                    strM8121a2 = textToSpeechVoice2.m8121a();
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16223a = r17;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16224b = null;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16225c = null;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16226d = null;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16227e = null;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16228f = textToSpeechVoice3;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16229g = textToSpeechVoice2;
                    ttsRepositoryImpl$fetchPriorityVoice$1.f16232j = 8;
                    if (m7401p(r17, strM8121a2, ttsRepositoryImpl$fetchPriorityVoice$1) != coroutineSingletons) {
                        textToSpeechVoice5 = textToSpeechVoice2;
                        textToSpeechVoice6 = textToSpeechVoice3;
                        r0 = r17;
                        textToSpeechVoice3 = textToSpeechVoice6;
                        r15 = r0;
                        textToSpeechVoice2 = textToSpeechVoice5;
                        if (textToSpeechVoice2 == null) {
                            textToSpeechVoice2 = textToSpeechVoice3;
                        }
                        if (textToSpeechVoice2 == null) {
                            return null;
                        }
                        if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                            while (r11.hasNext()) {
                                if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                    obj = obj2;
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                            return (TextToSpeechAppVoice) obj;
                        }
                        it = textToSpeechVoice2.m8124d().iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                            if (textToSpeechAppVoice == null) {
                                return textToSpeechAppVoice;
                            }
                            while (r11.hasNext()) {
                                if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                    obj = obj3;
                                    return (TextToSpeechAppVoice) obj;
                                }
                            }
                            return (TextToSpeechAppVoice) obj;
                        } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                        if (textToSpeechAppVoice == null) {
                            return textToSpeechAppVoice;
                        }
                        while (r11.hasNext()) {
                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                obj = obj3;
                                return (TextToSpeechAppVoice) obj;
                            }
                        }
                        return (TextToSpeechAppVoice) obj;
                    }
                    return coroutineSingletons;
                case 8:
                    textToSpeechVoice5 = ttsRepositoryImpl$fetchPriorityVoice$1.f16229g;
                    textToSpeechVoice6 = ttsRepositoryImpl$fetchPriorityVoice$1.f16228f;
                    String str23 = ttsRepositoryImpl$fetchPriorityVoice$1.f16223a;
                    AbstractC3193b.m15359b(objM7395j2);
                    r0 = str23;
                    textToSpeechVoice3 = textToSpeechVoice6;
                    r15 = r0;
                    textToSpeechVoice2 = textToSpeechVoice5;
                    if (textToSpeechVoice2 == null) {
                        textToSpeechVoice2 = textToSpeechVoice3;
                    }
                    if (textToSpeechVoice2 == null) {
                        return null;
                    }
                    if (!fa4.m11650l(r15, LanguageLearn.Thai.getCode())) {
                        while (r11.hasNext()) {
                            if (fa4.m11650l(((TextToSpeechAppVoice) obj2).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                obj = obj2;
                                return (TextToSpeechAppVoice) obj;
                            }
                        }
                        return (TextToSpeechAppVoice) obj;
                    }
                    it = textToSpeechVoice2.m8124d().iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                        if (textToSpeechAppVoice == null) {
                            return textToSpeechAppVoice;
                        }
                        while (r11.hasNext()) {
                            if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                                obj = obj3;
                                return (TextToSpeechAppVoice) obj;
                            }
                        }
                        return (TextToSpeechAppVoice) obj;
                    } while (!fa4.m11650l(((TextToSpeechAppVoice) next).f19564b, "msspeak"));
                    textToSpeechAppVoice = (TextToSpeechAppVoice) next;
                    if (textToSpeechAppVoice == null) {
                        return textToSpeechAppVoice;
                    }
                    while (r11.hasNext()) {
                        if (fa4.m11650l(((TextToSpeechAppVoice) obj3).f19564b, u91.m22591I0(textToSpeechVoice2.m8122b()))) {
                            obj = obj3;
                            return (TextToSpeechAppVoice) obj;
                        }
                    }
                    return (TextToSpeechAppVoice) obj;
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            r2 = r21;
            r12 = str;
        }
    }

    /* JADX INFO: renamed from: g */
    public final kk8 m7392g(String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice) {
        return new kk8(new TtsRepositoryImpl$fetchUtterance$2(str, str2, textToSpeechAppVoice, this, null));
    }

    /* JADX INFO: renamed from: h */
    public final kk8 m7393h(String str, Set set, TextToSpeechAppVoice textToSpeechAppVoice) {
        return new kk8(new TtsRepositoryImpl$fetchUtterances$2(str, this, set, textToSpeechAppVoice, null));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r14 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r14 == r1) goto L40;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a7 -> B:31:0x00aa). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7394i(Map map, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$flushDirtyVoiceLanguages$1 ttsRepositoryImpl$flushDirtyVoiceLanguages$1;
        Set setM22626r1;
        Iterator it;
        Map map2;
        Set set;
        Set set2;
        String str;
        if (continuationImpl instanceof TtsRepositoryImpl$flushDirtyVoiceLanguages$1) {
            ttsRepositoryImpl$flushDirtyVoiceLanguages$1 = (TtsRepositoryImpl$flushDirtyVoiceLanguages$1) continuationImpl;
            int i = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16259h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16259h = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$flushDirtyVoiceLanguages$1 = new TtsRepositoryImpl$flushDirtyVoiceLanguages$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$flushDirtyVoiceLanguages$1 = new TtsRepositoryImpl$flushDirtyVoiceLanguages$1(this, continuationImpl);
        }
        Object objM15541t = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16257f;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16259h;
        si7 si7Var = this.f16566d;
        if (i2 != 0) {
            if (i2 == 1) {
                map = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16252a;
                AbstractC3193b.m15359b(objM15541t);
            } else {
                if (i2 == 2) {
                    str = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16256e;
                    Iterator it2 = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16255d;
                    Set set3 = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16254c;
                    set = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16253b;
                    map2 = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16252a;
                    AbstractC3193b.m15359b(objM15541t);
                    it = it2;
                    setM22626r1 = set3;
                    TtsRepositoryImpl$DirtyResult ttsRepositoryImpl$DirtyResult = (TtsRepositoryImpl$DirtyResult) objM15541t;
                    if (ttsRepositoryImpl$DirtyResult == TtsRepositoryImpl$DirtyResult.Cleared || ttsRepositoryImpl$DirtyResult == TtsRepositoryImpl$DirtyResult.Published) {
                        setM22626r1.remove(str);
                    }
                    if (it.hasNext()) {
                        if (!fa4.m11650l(setM22626r1, set)) {
                            ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16252a = null;
                            ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16253b = null;
                            ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16254c = setM22626r1;
                            ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16255d = null;
                            ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16256e = null;
                            ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16259h = 3;
                            if (((C1368a) si7Var).m7898p0(setM22626r1, ttsRepositoryImpl$flushDirtyVoiceLanguages$1) != obj) {
                                set2 = setM22626r1;
                            }
                        }
                        return Boolean.valueOf(setM22626r1.isEmpty());
                    }
                    str = (String) it.next();
                    ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16252a = map2;
                    ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16253b = set;
                    ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16254c = setM22626r1;
                    ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16255d = it;
                    ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16256e = str;
                    ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16259h = 2;
                    objM15541t = m7402q(str, map2, ttsRepositoryImpl$flushDirtyVoiceLanguages$1);
                    return obj;
                }
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set2 = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16254c;
                Set set4 = ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16253b;
                AbstractC3193b.m15359b(objM15541t);
            }
            setM22626r1 = set2;
            return Boolean.valueOf(setM22626r1.isEmpty());
        }
        AbstractC3193b.m15359b(objM15541t);
        c83 c83Var = ((C1368a) si7Var).f18377T0;
        ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16252a = map;
        ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16259h = 1;
        objM15541t = AbstractC3224d.m15541t(c83Var, ttsRepositoryImpl$flushDirtyVoiceLanguages$1);
        Set set5 = (Set) objM15541t;
        if (set5.isEmpty()) {
            return Boolean.TRUE;
        }
        setM22626r1 = u91.m22626r1(set5);
        it = set5.iterator();
        map2 = map;
        set = set5;
        if (it.hasNext()) {
            if (!fa4.m11650l(setM22626r1, set)) {
                ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16252a = null;
                ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16253b = null;
                ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16254c = setM22626r1;
                ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16255d = null;
                ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16256e = null;
                ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16259h = 3;
                if (((C1368a) si7Var).m7898p0(setM22626r1, ttsRepositoryImpl$flushDirtyVoiceLanguages$1) != obj) {
                    set2 = setM22626r1;
                    setM22626r1 = set2;
                }
            }
            return Boolean.valueOf(setM22626r1.isEmpty());
        }
        str = (String) it.next();
        ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16252a = map2;
        ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16253b = set;
        ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16254c = setM22626r1;
        ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16255d = it;
        ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16256e = str;
        ttsRepositoryImpl$flushDirtyVoiceLanguages$1.f16259h = 2;
        objM15541t = m7402q(str, map2, ttsRepositoryImpl$flushDirtyVoiceLanguages$1);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cb -> B:46:0x00ce). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7395j(String str, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$getDefaultVoiceForLanguage$1 ttsRepositoryImpl$getDefaultVoiceForLanguage$1;
        List listM23605K;
        String str2;
        Iterator it;
        boolean zHasNext;
        zca zcaVar;
        if (continuationImpl instanceof TtsRepositoryImpl$getDefaultVoiceForLanguage$1) {
            ttsRepositoryImpl$getDefaultVoiceForLanguage$1 = (TtsRepositoryImpl$getDefaultVoiceForLanguage$1) continuationImpl;
            int i = ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16264e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16264e = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$getDefaultVoiceForLanguage$1 = new TtsRepositoryImpl$getDefaultVoiceForLanguage$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$getDefaultVoiceForLanguage$1 = new TtsRepositoryImpl$getDefaultVoiceForLanguage$1(this, continuationImpl);
        }
        Object objM7072M = ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16262c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16264e;
        if (i2 != 0) {
            if (i2 == 1) {
                str = ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16260a;
                AbstractC3193b.m15359b(objM7072M);
            } else {
                if (i2 == 2) {
                    it = ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16261b;
                    str2 = ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16260a;
                    AbstractC3193b.m15359b(objM7072M);
                    TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) objM7072M;
                    if (textToSpeechVoice != null) {
                        return textToSpeechVoice;
                    }
                    zHasNext = it.hasNext();
                    zcaVar = this.f16564b;
                    if (zHasNext) {
                        String str3 = (String) it.next();
                        ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16260a = str2;
                        ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16261b = it;
                        ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16264e = 2;
                        objM7072M = AbstractC0758a.m2861d(new vca(str2, str3, zcaVar, 0), zcaVar.f71369K, ttsRepositoryImpl$getDefaultVoiceForLanguage$1, true, true);
                    } else {
                        ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16260a = null;
                        ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16261b = null;
                        ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16264e = 3;
                        objM7072M = AbstractC0758a.m2861d(new r3a(7, str2, zcaVar), zcaVar.f71369K, ttsRepositoryImpl$getDefaultVoiceForLanguage$1, true, true);
                    }
                    return coroutineSingletons;
                }
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM7072M);
            }
            for (Object obj : (Iterable) objM7072M) {
                TextToSpeechVoice textToSpeechVoice2 = (TextToSpeechVoice) obj;
                if (textToSpeechVoice2.m8123c().contains("free") || !textToSpeechVoice2.m8126f()) {
                    return obj;
                }
            }
            return null;
        }
        AbstractC3193b.m15359b(objM7072M);
        ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16260a = str;
        ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16264e = 1;
        objM7072M = ((C1267a) this.f16567e).m7072M(ttsRepositoryImpl$getDefaultVoiceForLanguage$1);
        String str4 = (String) objM7072M;
        int iHashCode = str4.hashCode();
        if (iHashCode != -318452137) {
            if (iHashCode != 3112) {
                if (iHashCode == 3151468 && str4.equals("free")) {
                    listM23605K = vz1.m23604J("free");
                } else {
                    listM23605K = vz1.m23605K(str4, "free");
                }
            } else if (str4.equals("ai")) {
                listM23605K = vz1.m23605K("ai", "premium", "free");
            } else {
                listM23605K = vz1.m23605K(str4, "free");
            }
        } else if (str4.equals("premium")) {
            listM23605K = vz1.m23605K("premium", "free");
        } else {
            listM23605K = vz1.m23605K(str4, "free");
        }
        str2 = str;
        it = listM23605K.iterator();
        zHasNext = it.hasNext();
        zcaVar = this.f16564b;
        if (zHasNext) {
            String str5 = (String) it.next();
            ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16260a = str2;
            ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16261b = it;
            ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16264e = 2;
            objM7072M = AbstractC0758a.m2861d(new vca(str2, str5, zcaVar, 0), zcaVar.f71369K, ttsRepositoryImpl$getDefaultVoiceForLanguage$1, true, true);
        } else {
            ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16260a = null;
            ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16261b = null;
            ttsRepositoryImpl$getDefaultVoiceForLanguage$1.f16264e = 3;
            objM7072M = AbstractC0758a.m2861d(new r3a(7, str2, zcaVar), zcaVar.f71369K, ttsRepositoryImpl$getDefaultVoiceForLanguage$1, true, true);
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: k */
    public final i93 m7396k(String str) {
        str.getClass();
        zca zcaVar = this.f16564b;
        zcaVar.getClass();
        return AbstractC3584sr.m21590A(zcaVar.f71369K, true, new String[]{"TtsVoiceEntity", "LanguageAndTtsVoicesJoin"}, new xca(str, 0));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c A[PHI: r2 r11
      0x004c: PHI (r2v5 java.util.Map) = (r2v3 java.util.Map), (r2v11 java.util.Map) binds: [B:31:0x008c, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r11v14 java.lang.Object) = (r11v13 java.lang.Object), (r11v1 java.lang.Object) binds: [B:31:0x008c, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083 A[PHI: r2
      0x0083: PHI (r2v3 java.util.Map) = (r2v2 java.util.Map), (r2v2 java.util.Map), (r2v4 java.util.Map) binds: [B:26:0x0071, B:28:0x007f, B:20:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m7397l(ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$migrateLocalVoicesToApi$1 ttsRepositoryImpl$migrateLocalVoicesToApi$1;
        Map map;
        Map map2;
        boolean zBooleanValue;
        Object objM15541t;
        boolean z;
        boolean zBooleanValue2;
        Object objM7399n;
        boolean z2;
        if (continuationImpl instanceof TtsRepositoryImpl$migrateLocalVoicesToApi$1) {
            ttsRepositoryImpl$migrateLocalVoicesToApi$1 = (TtsRepositoryImpl$migrateLocalVoicesToApi$1) continuationImpl;
            int i = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$migrateLocalVoicesToApi$1 = new TtsRepositoryImpl$migrateLocalVoicesToApi$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$migrateLocalVoicesToApi$1 = new TtsRepositoryImpl$migrateLocalVoicesToApi$1(this, continuationImpl);
        }
        Object objM15541t2 = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16268d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f;
        xfa xfaVar = xfa.f68157a;
        si7 si7Var = this.f16566d;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(objM15541t2);
                c83 c83Var = ((C1368a) si7Var).f18373R0;
                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 1;
                objM15541t2 = AbstractC3224d.m15541t(c83Var, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                if (objM15541t2 != obj) {
                    map = (Map) objM15541t2;
                    if (map.isEmpty()) {
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 3;
                        objM15541t2 = m7394i(map, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                        if (objM15541t2 != obj) {
                            map2 = map;
                            zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                            c83 c83Var2 = ((C1368a) si7Var).f18375S0;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map2;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = zBooleanValue;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 4;
                            objM15541t = AbstractC3224d.m15541t(c83Var2, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                            if (objM15541t != obj) {
                                z = zBooleanValue;
                                objM15541t2 = objM15541t;
                                zBooleanValue2 = ((Boolean) objM15541t2).booleanValue();
                                if (!zBooleanValue2) {
                                    if (map2.isEmpty()) {
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 5;
                                        if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                        }
                                    } else {
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 6;
                                        objM7399n = m7399n(map2, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                                        if (objM7399n != obj) {
                                            objM15541t2 = objM7399n;
                                            z2 = zBooleanValue2;
                                            if (((Boolean) objM15541t2).booleanValue()) {
                                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = z2;
                                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 7;
                                                if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return xfaVar;
                            }
                        }
                    } else {
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 2;
                        if (((C1368a) si7Var).m7900q0(map, ttsRepositoryImpl$migrateLocalVoicesToApi$1) != obj) {
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 3;
                            objM15541t2 = m7394i(map, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                            if (objM15541t2 != obj) {
                                map2 = map;
                                zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                                c83 c83Var3 = ((C1368a) si7Var).f18375S0;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map2;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = zBooleanValue;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 4;
                                objM15541t = AbstractC3224d.m15541t(c83Var3, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                                if (objM15541t != obj) {
                                    z = zBooleanValue;
                                    objM15541t2 = objM15541t;
                                    zBooleanValue2 = ((Boolean) objM15541t2).booleanValue();
                                    if (!zBooleanValue2) {
                                        if (map2.isEmpty()) {
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 5;
                                            if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                            }
                                        } else {
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 6;
                                            objM7399n = m7399n(map2, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                                            if (objM7399n != obj) {
                                                objM15541t2 = objM7399n;
                                                z2 = zBooleanValue2;
                                                if (((Boolean) objM15541t2).booleanValue() && z) {
                                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = z2;
                                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 7;
                                                    if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
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
                }
                return obj;
            case 1:
                AbstractC3193b.m15359b(objM15541t2);
                map = (Map) objM15541t2;
                if (map.isEmpty()) {
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map;
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 2;
                    if (((C1368a) si7Var).m7900q0(map, ttsRepositoryImpl$migrateLocalVoicesToApi$1) != obj) {
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 3;
                        objM15541t2 = m7394i(map, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                        if (objM15541t2 != obj) {
                            map2 = map;
                            zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                            c83 c83Var4 = ((C1368a) si7Var).f18375S0;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map2;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = zBooleanValue;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 4;
                            objM15541t = AbstractC3224d.m15541t(c83Var4, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                            if (objM15541t != obj) {
                                z = zBooleanValue;
                                objM15541t2 = objM15541t;
                                zBooleanValue2 = ((Boolean) objM15541t2).booleanValue();
                                if (!zBooleanValue2) {
                                    if (map2.isEmpty()) {
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 5;
                                        if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                        }
                                    } else {
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 6;
                                        objM7399n = m7399n(map2, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                                        if (objM7399n != obj) {
                                            objM15541t2 = objM7399n;
                                            z2 = zBooleanValue2;
                                            if (((Boolean) objM15541t2).booleanValue()) {
                                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = z2;
                                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 7;
                                                if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return xfaVar;
                            }
                        }
                    }
                } else {
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map;
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 3;
                    objM15541t2 = m7394i(map, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                    if (objM15541t2 != obj) {
                        map2 = map;
                        zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                        c83 c83Var5 = ((C1368a) si7Var).f18375S0;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map2;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = zBooleanValue;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 4;
                        objM15541t = AbstractC3224d.m15541t(c83Var5, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                        if (objM15541t != obj) {
                            z = zBooleanValue;
                            objM15541t2 = objM15541t;
                            zBooleanValue2 = ((Boolean) objM15541t2).booleanValue();
                            if (!zBooleanValue2) {
                                if (map2.isEmpty()) {
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 5;
                                    if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                    }
                                } else {
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 6;
                                    objM7399n = m7399n(map2, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                                    if (objM7399n != obj) {
                                        objM15541t2 = objM7399n;
                                        z2 = zBooleanValue2;
                                        if (((Boolean) objM15541t2).booleanValue()) {
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = z2;
                                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 7;
                                            if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
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
                map = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a;
                AbstractC3193b.m15359b(objM15541t2);
                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map;
                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 3;
                objM15541t2 = m7394i(map, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                if (objM15541t2 != obj) {
                    map2 = map;
                    zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                    c83 c83Var6 = ((C1368a) si7Var).f18375S0;
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map2;
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = zBooleanValue;
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 4;
                    objM15541t = AbstractC3224d.m15541t(c83Var6, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                    if (objM15541t != obj) {
                        z = zBooleanValue;
                        objM15541t2 = objM15541t;
                        zBooleanValue2 = ((Boolean) objM15541t2).booleanValue();
                        if (!zBooleanValue2) {
                            if (map2.isEmpty()) {
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 5;
                                if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                }
                            } else {
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 6;
                                objM7399n = m7399n(map2, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                                if (objM7399n != obj) {
                                    objM15541t2 = objM7399n;
                                    z2 = zBooleanValue2;
                                    if (((Boolean) objM15541t2).booleanValue()) {
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = z2;
                                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 7;
                                        if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                        }
                                    }
                                }
                            }
                        }
                        return xfaVar;
                    }
                }
                return obj;
            case 3:
                map = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a;
                AbstractC3193b.m15359b(objM15541t2);
                map2 = map;
                zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                c83 c83Var7 = ((C1368a) si7Var).f18375S0;
                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = map2;
                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = zBooleanValue;
                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 4;
                objM15541t = AbstractC3224d.m15541t(c83Var7, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                if (objM15541t != obj) {
                    z = zBooleanValue;
                    objM15541t2 = objM15541t;
                    zBooleanValue2 = ((Boolean) objM15541t2).booleanValue();
                    if (!zBooleanValue2) {
                        if (map2.isEmpty()) {
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 5;
                            if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                            }
                        } else {
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                            ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 6;
                            objM7399n = m7399n(map2, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                            if (objM7399n != obj) {
                                objM15541t2 = objM7399n;
                                z2 = zBooleanValue2;
                                if (((Boolean) objM15541t2).booleanValue()) {
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = z2;
                                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 7;
                                    if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                    }
                                }
                            }
                        }
                    }
                    return xfaVar;
                }
                return obj;
            case 4:
                z = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b;
                map2 = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a;
                AbstractC3193b.m15359b(objM15541t2);
                zBooleanValue2 = ((Boolean) objM15541t2).booleanValue();
                if (!zBooleanValue2) {
                    if (map2.isEmpty()) {
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 5;
                        if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                        }
                    } else {
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = zBooleanValue2;
                        ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 6;
                        objM7399n = m7399n(map2, ttsRepositoryImpl$migrateLocalVoicesToApi$1);
                        if (objM7399n != obj) {
                            objM15541t2 = objM7399n;
                            z2 = zBooleanValue2;
                            if (((Boolean) objM15541t2).booleanValue()) {
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = z2;
                                ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 7;
                                if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                                }
                            }
                        }
                    }
                    return obj;
                }
                return xfaVar;
            case 5:
                AbstractC3193b.m15359b(objM15541t2);
                return xfaVar;
            case 6:
                z2 = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c;
                z = ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b;
                AbstractC3193b.m15359b(objM15541t2);
                if (((Boolean) objM15541t2).booleanValue()) {
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16265a = null;
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16266b = z;
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16267c = z2;
                    ttsRepositoryImpl$migrateLocalVoicesToApi$1.f16270f = 7;
                    if (((C1368a) si7Var).m7902r0(true, ttsRepositoryImpl$migrateLocalVoicesToApi$1) == obj) {
                        return obj;
                    }
                }
                return xfaVar;
            case 7:
                AbstractC3193b.m15359b(objM15541t2);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final kk8 m7398m(String str) {
        return new kk8(new TtsRepositoryImpl$observableTtsVoices$2(this, str, null));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:20:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: n */
    public final java.lang.Object m7399n(java.util.Map r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.lingq.core.data.repository.TtsRepositoryImpl$publishMissingVoicesToApi$1
            if (r0 == 0) goto L13
            r0 = r8
            com.lingq.core.data.repository.TtsRepositoryImpl$publishMissingVoicesToApi$1 r0 = (com.lingq.core.data.repository.TtsRepositoryImpl$publishMissingVoicesToApi$1) r0
            int r1 = r0.f16283e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16283e = r1
            goto L18
        L13:
            com.lingq.core.data.repository.TtsRepositoryImpl$publishMissingVoicesToApi$1 r0 = new com.lingq.core.data.repository.TtsRepositoryImpl$publishMissingVoicesToApi$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f16281c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f16283e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2c
            int r7 = r0.f16280b
            java.util.Iterator r2 = r0.f16279a
            kotlin.AbstractC3193b.m15359b(r8)
            goto L65
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r6)
            r6 = 0
            return r6
        L33:
            kotlin.AbstractC3193b.m15359b(r8)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
            r7 = r4
        L40:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r2.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r5 = r8.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r0.f16279a = r2
            r0.f16280b = r7
            r0.f16283e = r4
            java.lang.Enum r8 = r6.m7400o(r5, r8, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            com.lingq.core.data.repository.TtsRepositoryImpl$PublishOutcome r8 = (com.lingq.core.data.repository.TtsRepositoryImpl$PublishOutcome) r8
            com.lingq.core.data.repository.TtsRepositoryImpl$PublishOutcome r5 = com.lingq.core.data.repository.TtsRepositoryImpl$PublishOutcome.Failed
            if (r8 != r5) goto L40
            r7 = r3
            goto L40
        L6d:
            if (r7 == 0) goto L70
            r3 = r4
        L70:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1307w.m7399n(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        if (r11 == r1) goto L47;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m7400o(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$publishVoiceIfApiEmpty$1 ttsRepositoryImpl$publishVoiceIfApiEmpty$1;
        String str3;
        String str4;
        if (continuationImpl instanceof TtsRepositoryImpl$publishVoiceIfApiEmpty$1) {
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1 = (TtsRepositoryImpl$publishVoiceIfApiEmpty$1) continuationImpl;
            int i = ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16288e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16288e = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$publishVoiceIfApiEmpty$1 = new TtsRepositoryImpl$publishVoiceIfApiEmpty$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1 = new TtsRepositoryImpl$publishVoiceIfApiEmpty$1(this, continuationImpl);
        }
        Object objM7390e = ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16286c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16288e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7390e);
            if (vk9.m23391n0(str2)) {
                return TtsRepositoryImpl$PublishOutcome.Ok;
            }
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16284a = str;
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16285b = str2;
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16288e = 1;
            objM7390e = m7390e(str, ttsRepositoryImpl$publishVoiceIfApiEmpty$1);
            if (objM7390e != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str2 = ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16285b;
            str = ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16284a;
            AbstractC3193b.m15359b(objM7390e);
        } else if (i2 == 2) {
            str4 = ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16285b;
            str3 = ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16284a;
            AbstractC3193b.m15359b(objM7390e);
            if (objM7390e == null) {
                rm5 rm5Var = sm5.Companion;
                String strM22991n = ux5.m22991n("TTS migrate: dropping language=", str3, " voice=", str4, " — not in supported-voices");
                rm5Var.getClass();
                h0a.f41641a.mo11431b(strM22991n, new Object[0]);
                return TtsRepositoryImpl$PublishOutcome.Ok;
            }
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16284a = null;
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16285b = null;
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16288e = 3;
            objM7390e = m7404s(str3, str4, ttsRepositoryImpl$publishVoiceIfApiEmpty$1);
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7390e);
        }
        return ((Boolean) objM7390e).booleanValue() ? TtsRepositoryImpl$PublishOutcome.Ok : TtsRepositoryImpl$PublishOutcome.Failed;
        cj7 cj7Var = (cj7) objM7390e;
        if (cj7Var instanceof aj7) {
            return TtsRepositoryImpl$PublishOutcome.Failed;
        }
        if (!(cj7Var instanceof bj7)) {
            gm5.m12750e();
            return null;
        }
        String strM3786a = ((bj7) cj7Var).m3786a();
        if (strM3786a != null && !vk9.m23391n0(strM3786a)) {
            return TtsRepositoryImpl$PublishOutcome.Ok;
        }
        ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16284a = str;
        ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16285b = str2;
        ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16288e = 2;
        objM7390e = m7403r(str, str2, true, ttsRepositoryImpl$publishVoiceIfApiEmpty$1);
        if (objM7390e != coroutineSingletons) {
            String str5 = str2;
            str3 = str;
            str4 = str5;
            if (objM7390e == null) {
                rm5 rm5Var2 = sm5.Companion;
                String strM22991n2 = ux5.m22991n("TTS migrate: dropping language=", str3, " voice=", str4, " — not in supported-voices");
                rm5Var2.getClass();
                h0a.f41641a.mo11431b(strM22991n2, new Object[0]);
                return TtsRepositoryImpl$PublishOutcome.Ok;
            }
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16284a = null;
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16285b = null;
            ttsRepositoryImpl$publishVoiceIfApiEmpty$1.f16288e = 3;
            objM7390e = m7404s(str3, str4, ttsRepositoryImpl$publishVoiceIfApiEmpty$1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m7401p(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$publishVoiceName$1 ttsRepositoryImpl$publishVoiceName$1;
        boolean zBooleanValue;
        Set set;
        LinkedHashSet linkedHashSetM19765B;
        if (continuationImpl instanceof TtsRepositoryImpl$publishVoiceName$1) {
            ttsRepositoryImpl$publishVoiceName$1 = (TtsRepositoryImpl$publishVoiceName$1) continuationImpl;
            int i = ttsRepositoryImpl$publishVoiceName$1.f16293e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$publishVoiceName$1.f16293e = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$publishVoiceName$1 = new TtsRepositoryImpl$publishVoiceName$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$publishVoiceName$1 = new TtsRepositoryImpl$publishVoiceName$1(this, continuationImpl);
        }
        Object objM7404s = ttsRepositoryImpl$publishVoiceName$1.f16291c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$publishVoiceName$1.f16293e;
        xfa xfaVar = xfa.f68157a;
        si7 si7Var = this.f16566d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7404s);
            ttsRepositoryImpl$publishVoiceName$1.f16289a = str;
            ttsRepositoryImpl$publishVoiceName$1.f16293e = 1;
            objM7404s = m7404s(str, str2, ttsRepositoryImpl$publishVoiceName$1);
            if (objM7404s != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = ttsRepositoryImpl$publishVoiceName$1.f16289a;
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
            zBooleanValue = ttsRepositoryImpl$publishVoiceName$1.f16290b;
            str = ttsRepositoryImpl$publishVoiceName$1.f16289a;
            AbstractC3193b.m15359b(objM7404s);
        }
        set = (Set) objM7404s;
        if (zBooleanValue) {
            linkedHashSetM19765B = AbstractC3489q9.m19793w(set, str);
        } else {
            linkedHashSetM19765B = AbstractC3489q9.m19765B(set, str);
        }
        if (!linkedHashSetM19765B.equals(set)) {
            ttsRepositoryImpl$publishVoiceName$1.f16289a = null;
            ttsRepositoryImpl$publishVoiceName$1.f16290b = zBooleanValue;
            ttsRepositoryImpl$publishVoiceName$1.f16293e = 3;
            if (((C1368a) si7Var).m7898p0(linkedHashSetM19765B, ttsRepositoryImpl$publishVoiceName$1) == obj) {
                return obj;
            }
        }
        return xfaVar;
        zBooleanValue = ((Boolean) objM7404s).booleanValue();
        c83 c83Var = ((C1368a) si7Var).f18377T0;
        ttsRepositoryImpl$publishVoiceName$1.f16289a = str;
        ttsRepositoryImpl$publishVoiceName$1.f16290b = zBooleanValue;
        ttsRepositoryImpl$publishVoiceName$1.f16293e = 2;
        objM7404s = AbstractC3224d.m15541t(c83Var, ttsRepositoryImpl$publishVoiceName$1);
        if (objM7404s != obj) {
            set = (Set) objM7404s;
            if (zBooleanValue) {
                linkedHashSetM19765B = AbstractC3489q9.m19793w(set, str);
            } else {
                linkedHashSetM19765B = AbstractC3489q9.m19765B(set, str);
            }
            if (!linkedHashSetM19765B.equals(set)) {
                ttsRepositoryImpl$publishVoiceName$1.f16289a = null;
                ttsRepositoryImpl$publishVoiceName$1.f16290b = zBooleanValue;
                ttsRepositoryImpl$publishVoiceName$1.f16293e = 3;
                if (((C1368a) si7Var).m7898p0(linkedHashSetM19765B, ttsRepositoryImpl$publishVoiceName$1) == obj) {
                }
            }
            return xfaVar;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m7402q(String str, Map map, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$resolveDirtyLanguage$1 ttsRepositoryImpl$resolveDirtyLanguage$1;
        String str2;
        if (continuationImpl instanceof TtsRepositoryImpl$resolveDirtyLanguage$1) {
            ttsRepositoryImpl$resolveDirtyLanguage$1 = (TtsRepositoryImpl$resolveDirtyLanguage$1) continuationImpl;
            int i = ttsRepositoryImpl$resolveDirtyLanguage$1.f16298e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$resolveDirtyLanguage$1.f16298e = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$resolveDirtyLanguage$1 = new TtsRepositoryImpl$resolveDirtyLanguage$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$resolveDirtyLanguage$1 = new TtsRepositoryImpl$resolveDirtyLanguage$1(this, continuationImpl);
        }
        Object objM7403r = ttsRepositoryImpl$resolveDirtyLanguage$1.f16296c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$resolveDirtyLanguage$1.f16298e;
        if (i2 != 0) {
            if (i2 == 1) {
                String str3 = ttsRepositoryImpl$resolveDirtyLanguage$1.f16295b;
                String str4 = ttsRepositoryImpl$resolveDirtyLanguage$1.f16294a;
                AbstractC3193b.m15359b(objM7403r);
                str2 = str3;
                str = str4;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM7403r);
            }
            return ((Boolean) objM7403r).booleanValue() ? TtsRepositoryImpl$DirtyResult.Published : TtsRepositoryImpl$DirtyResult.Pending;
        }
        AbstractC3193b.m15359b(objM7403r);
        str2 = (String) map.get(str);
        if (str2 == null || vk9.m23391n0(str2)) {
            return TtsRepositoryImpl$DirtyResult.Cleared;
        }
        ttsRepositoryImpl$resolveDirtyLanguage$1.f16294a = str;
        ttsRepositoryImpl$resolveDirtyLanguage$1.f16295b = str2;
        ttsRepositoryImpl$resolveDirtyLanguage$1.f16298e = 1;
        objM7403r = m7403r(str, str2, true, ttsRepositoryImpl$resolveDirtyLanguage$1);
        if (objM7403r != coroutineSingletons) {
        }
        return coroutineSingletons;
        if (objM7403r == null) {
            rm5 rm5Var = sm5.Companion;
            String strM22991n = ux5.m22991n("TTS migrate: dropping dirty language=", str, " voice=", str2, " — not in supported-voices");
            rm5Var.getClass();
            h0a.f41641a.mo11431b(strM22991n, new Object[0]);
            return TtsRepositoryImpl$DirtyResult.Cleared;
        }
        ttsRepositoryImpl$resolveDirtyLanguage$1.f16294a = null;
        ttsRepositoryImpl$resolveDirtyLanguage$1.f16295b = null;
        ttsRepositoryImpl$resolveDirtyLanguage$1.f16298e = 2;
        objM7403r = m7404s(str, str2, ttsRepositoryImpl$resolveDirtyLanguage$1);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x009b, please report this as an issue */
    /* JADX INFO: renamed from: r */
    public final Object m7403r(String str, String str2, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$resolveVoiceByName$1 ttsRepositoryImpl$resolveVoiceByName$1;
        Throwable th;
        boolean z2;
        String str3;
        String str4;
        Object failure;
        Throwable thM15355a;
        Object objM2861d;
        if (continuationImpl instanceof TtsRepositoryImpl$resolveVoiceByName$1) {
            ttsRepositoryImpl$resolveVoiceByName$1 = (TtsRepositoryImpl$resolveVoiceByName$1) continuationImpl;
            int i = ttsRepositoryImpl$resolveVoiceByName$1.f16304f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$resolveVoiceByName$1.f16304f = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$resolveVoiceByName$1 = new TtsRepositoryImpl$resolveVoiceByName$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$resolveVoiceByName$1 = new TtsRepositoryImpl$resolveVoiceByName$1(this, continuationImpl);
        }
        Object objM2861d2 = ttsRepositoryImpl$resolveVoiceByName$1.f16302d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$resolveVoiceByName$1.f16304f;
        zca zcaVar = this.f16564b;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2861d2);
            ttsRepositoryImpl$resolveVoiceByName$1.f16299a = str;
            ttsRepositoryImpl$resolveVoiceByName$1.f16300b = str2;
            ttsRepositoryImpl$resolveVoiceByName$1.f16301c = z;
            ttsRepositoryImpl$resolveVoiceByName$1.f16304f = 1;
            objM2861d2 = AbstractC0758a.m2861d(new vca(str, str2, zcaVar, i3), zcaVar.f71369K, ttsRepositoryImpl$resolveVoiceByName$1, true, true);
            if (objM2861d2 != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM2861d2);
                    return objM2861d2;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = ttsRepositoryImpl$resolveVoiceByName$1.f16301c;
            str4 = ttsRepositoryImpl$resolveVoiceByName$1.f16300b;
            str3 = ttsRepositoryImpl$resolveVoiceByName$1.f16299a;
            try {
                AbstractC3193b.m15359b(objM2861d2);
                failure = xfa.f68157a;
            } catch (Throwable th2) {
                th = th2;
                failure = new Result.Failure(th);
            }
            thM15355a = Result.m15355a(failure);
            if (thM15355a != null) {
                if (!(thM15355a instanceof CancellationException)) {
                    throw thM15355a;
                }
                rm5 rm5Var = sm5.Companion;
                String str5 = "TTS resolveVoiceByName refresh: language=" + str3 + " failed - " + thM15355a.getMessage();
                rm5Var.getClass();
                h0a.f41641a.mo11431b(str5, new Object[0]);
            }
            ttsRepositoryImpl$resolveVoiceByName$1.f16299a = null;
            ttsRepositoryImpl$resolveVoiceByName$1.f16300b = null;
            ttsRepositoryImpl$resolveVoiceByName$1.f16301c = z2;
            ttsRepositoryImpl$resolveVoiceByName$1.f16304f = 3;
            objM2861d = AbstractC0758a.m2861d(new vca(str3, str4, zcaVar, i3), zcaVar.f71369K, ttsRepositoryImpl$resolveVoiceByName$1, true, true);
            if (objM2861d != obj) {
                return obj;
            }
            return objM2861d;
        }
        z = ttsRepositoryImpl$resolveVoiceByName$1.f16301c;
        str2 = ttsRepositoryImpl$resolveVoiceByName$1.f16300b;
        str = ttsRepositoryImpl$resolveVoiceByName$1.f16299a;
        AbstractC3193b.m15359b(objM2861d2);
        TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) objM2861d2;
        if (textToSpeechVoice != null) {
            return textToSpeechVoice;
        }
        if (!z) {
            return null;
        }
        try {
            ttsRepositoryImpl$resolveVoiceByName$1.f16299a = str;
            ttsRepositoryImpl$resolveVoiceByName$1.f16300b = str2;
            ttsRepositoryImpl$resolveVoiceByName$1.f16301c = z;
            ttsRepositoryImpl$resolveVoiceByName$1.f16304f = 2;
            if (m7407v(str, ttsRepositoryImpl$resolveVoiceByName$1) != obj) {
                String str6 = str2;
                str3 = str;
                str4 = str6;
                z2 = z;
                failure = xfa.f68157a;
                thM15355a = Result.m15355a(failure);
                if (thM15355a != null) {
                    if (!(thM15355a instanceof CancellationException)) {
                        throw thM15355a;
                    }
                    rm5 rm5Var2 = sm5.Companion;
                    String str7 = "TTS resolveVoiceByName refresh: language=" + str3 + " failed - " + thM15355a.getMessage();
                    rm5Var2.getClass();
                    h0a.f41641a.mo11431b(str7, new Object[0]);
                }
                ttsRepositoryImpl$resolveVoiceByName$1.f16299a = null;
                ttsRepositoryImpl$resolveVoiceByName$1.f16300b = null;
                ttsRepositoryImpl$resolveVoiceByName$1.f16301c = z2;
                ttsRepositoryImpl$resolveVoiceByName$1.f16304f = 3;
                objM2861d = AbstractC0758a.m2861d(new vca(str3, str4, zcaVar, i3), zcaVar.f71369K, ttsRepositoryImpl$resolveVoiceByName$1, true, true);
                if (objM2861d != obj) {
                    return objM2861d;
                }
            }
        } catch (Throwable th3) {
            boolean z3 = z;
            th = th3;
            z2 = z3;
            String str8 = str2;
            str3 = str;
            str4 = str8;
            failure = new Result.Failure(th);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX INFO: renamed from: s */
    public final Object m7404s(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$setPreferredVoiceName$1 ttsRepositoryImpl$setPreferredVoiceName$1;
        Exception exc;
        if (continuationImpl instanceof TtsRepositoryImpl$setPreferredVoiceName$1) {
            ttsRepositoryImpl$setPreferredVoiceName$1 = (TtsRepositoryImpl$setPreferredVoiceName$1) continuationImpl;
            int i = ttsRepositoryImpl$setPreferredVoiceName$1.f16309e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$setPreferredVoiceName$1.f16309e = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$setPreferredVoiceName$1 = new TtsRepositoryImpl$setPreferredVoiceName$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$setPreferredVoiceName$1 = new TtsRepositoryImpl$setPreferredVoiceName$1(this, continuationImpl);
        }
        TtsRepositoryImpl$setPreferredVoiceName$1 ttsRepositoryImpl$setPreferredVoiceName$2 = ttsRepositoryImpl$setPreferredVoiceName$1;
        Object obj = ttsRepositoryImpl$setPreferredVoiceName$2.f16307c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$setPreferredVoiceName$2.f16309e;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                try {
                    cda cdaVar = this.f16565c;
                    ttsRepositoryImpl$setPreferredVoiceName$2.f16305a = str;
                    ttsRepositoryImpl$setPreferredVoiceName$2.f16306b = str2;
                    ttsRepositoryImpl$setPreferredVoiceName$2.f16309e = 1;
                    try {
                        if (cdaVar.m4551d(str, "all", str2, true, ttsRepositoryImpl$setPreferredVoiceName$2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Exception e) {
                        exc = e;
                        str = str;
                        str2 = str2;
                        rm5 rm5Var = sm5.Companion;
                        String message = exc.getMessage();
                        StringBuilder sbM23000w = ux5.m23000w("TTS setPreferredVoiceName: language=", str, " voice=", str2, " failed - ");
                        sbM23000w.append(message);
                        String string = sbM23000w.toString();
                        rm5Var.getClass();
                        z = false;
                        h0a.f41641a.mo11431b(string, new Object[0]);
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    rm5 rm5Var2 = sm5.Companion;
                    String message2 = exc.getMessage();
                    StringBuilder sbM23000w2 = ux5.m23000w("TTS setPreferredVoiceName: language=", str, " voice=", str2, " failed - ");
                    sbM23000w2.append(message2);
                    String string2 = sbM23000w2.toString();
                    rm5Var2.getClass();
                    z = false;
                    h0a.f41641a.mo11431b(string2, new Object[0]);
                    return Boolean.valueOf(z);
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = ttsRepositoryImpl$setPreferredVoiceName$2.f16306b;
                str = ttsRepositoryImpl$setPreferredVoiceName$2.f16305a;
                try {
                    AbstractC3193b.m15359b(obj);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    rm5 rm5Var3 = sm5.Companion;
                    String message3 = exc.getMessage();
                    StringBuilder sbM23000w3 = ux5.m23000w("TTS setPreferredVoiceName: language=", str, " voice=", str2, " failed - ");
                    sbM23000w3.append(message3);
                    String string3 = sbM23000w3.toString();
                    rm5Var3.getClass();
                    z = false;
                    h0a.f41641a.mo11431b(string3, new Object[0]);
                }
            }
            return Boolean.valueOf(z);
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ac -> B:30:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: t */
    public final java.lang.Object m7405t(kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1307w.m7405t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m7406u(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$updateLocalVoiceName$1 ttsRepositoryImpl$updateLocalVoiceName$1;
        if (continuationImpl instanceof TtsRepositoryImpl$updateLocalVoiceName$1) {
            ttsRepositoryImpl$updateLocalVoiceName$1 = (TtsRepositoryImpl$updateLocalVoiceName$1) continuationImpl;
            int i = ttsRepositoryImpl$updateLocalVoiceName$1.f16322e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$updateLocalVoiceName$1.f16322e = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$updateLocalVoiceName$1 = new TtsRepositoryImpl$updateLocalVoiceName$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$updateLocalVoiceName$1 = new TtsRepositoryImpl$updateLocalVoiceName$1(this, continuationImpl);
        }
        Object objM15541t = ttsRepositoryImpl$updateLocalVoiceName$1.f16320c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$updateLocalVoiceName$1.f16322e;
        xfa xfaVar = xfa.f68157a;
        si7 si7Var = this.f16566d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1368a) si7Var).f18373R0;
            ttsRepositoryImpl$updateLocalVoiceName$1.f16318a = str;
            ttsRepositoryImpl$updateLocalVoiceName$1.f16319b = str2;
            ttsRepositoryImpl$updateLocalVoiceName$1.f16322e = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, ttsRepositoryImpl$updateLocalVoiceName$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = ttsRepositoryImpl$updateLocalVoiceName$1.f16319b;
        str = ttsRepositoryImpl$updateLocalVoiceName$1.f16318a;
        AbstractC3193b.m15359b(objM15541t);
        Map map = (Map) objM15541t;
        if (!fa4.m11650l(map.get(str), str2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(str, str2);
            ttsRepositoryImpl$updateLocalVoiceName$1.f16318a = null;
            ttsRepositoryImpl$updateLocalVoiceName$1.f16319b = null;
            ttsRepositoryImpl$updateLocalVoiceName$1.f16322e = 2;
            if (((C1368a) si7Var).m7900q0(linkedHashMap, ttsRepositoryImpl$updateLocalVoiceName$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (androidx.room.AbstractC0747e.m2849b(r6.f16563a, r2, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7407v(String str, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$updateTtsVoices$1 ttsRepositoryImpl$updateTtsVoices$1;
        if (continuationImpl instanceof TtsRepositoryImpl$updateTtsVoices$1) {
            ttsRepositoryImpl$updateTtsVoices$1 = (TtsRepositoryImpl$updateTtsVoices$1) continuationImpl;
            int i = ttsRepositoryImpl$updateTtsVoices$1.f16326d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$updateTtsVoices$1.f16326d = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$updateTtsVoices$1 = new TtsRepositoryImpl$updateTtsVoices$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$updateTtsVoices$1 = new TtsRepositoryImpl$updateTtsVoices$1(this, continuationImpl);
        }
        Object objM4548a = ttsRepositoryImpl$updateTtsVoices$1.f16324b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$updateTtsVoices$1.f16326d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM4548a);
            ttsRepositoryImpl$updateTtsVoices$1.f16323a = str;
            ttsRepositoryImpl$updateTtsVoices$1.f16326d = 1;
            objM4548a = this.f16565c.m4548a(str, "all", ttsRepositoryImpl$updateTtsVoices$1);
            if (objM4548a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = ttsRepositoryImpl$updateTtsVoices$1.f16323a;
            AbstractC3193b.m15359b(objM4548a);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM4548a);
        }
        return xfa.f68157a;
        TtsRepositoryImpl$updateTtsVoices$2 ttsRepositoryImpl$updateTtsVoices$2 = new TtsRepositoryImpl$updateTtsVoices$2(this, (List) objM4548a, str, null);
        ttsRepositoryImpl$updateTtsVoices$1.f16323a = null;
        ttsRepositoryImpl$updateTtsVoices$1.f16326d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088 A[PHI: r10 r11
      0x0088: PHI (r10v5 java.lang.String) = (r10v1 java.lang.String), (r10v6 java.lang.String) binds: [B:25:0x005b, B:38:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r11v10 com.lingq.core.domain.model.token.TextToSpeechVoice) = 
      (r11v4 com.lingq.core.domain.model.token.TextToSpeechVoice)
      (r11v11 com.lingq.core.domain.model.token.TextToSpeechVoice)
     binds: [B:25:0x005b, B:38:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m7408w(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        TtsRepositoryImpl$upgradeVoiceForLanguage$1 ttsRepositoryImpl$upgradeVoiceForLanguage$1;
        TextToSpeechVoice textToSpeechVoice;
        String str3;
        String str4;
        String str5;
        String strM8121a;
        if (continuationImpl instanceof TtsRepositoryImpl$upgradeVoiceForLanguage$1) {
            ttsRepositoryImpl$upgradeVoiceForLanguage$1 = (TtsRepositoryImpl$upgradeVoiceForLanguage$1) continuationImpl;
            int i = ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16335e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16335e = i - Integer.MIN_VALUE;
            } else {
                ttsRepositoryImpl$upgradeVoiceForLanguage$1 = new TtsRepositoryImpl$upgradeVoiceForLanguage$1(this, continuationImpl);
            }
        } else {
            ttsRepositoryImpl$upgradeVoiceForLanguage$1 = new TtsRepositoryImpl$upgradeVoiceForLanguage$1(this, continuationImpl);
        }
        Object objM7395j = ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16333c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16335e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7395j);
            if (str2 != null) {
                ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16331a = str;
                ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16332b = str2;
                ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16335e = 1;
                objM7395j = m7395j(str, ttsRepositoryImpl$upgradeVoiceForLanguage$1);
                if (objM7395j != obj) {
                }
                return obj;
            }
            return null;
        }
        if (i2 == 1) {
            str2 = ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16332b;
            str = ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16331a;
            AbstractC3193b.m15359b(objM7395j);
        } else {
            if (i2 == 2) {
                str4 = ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16332b;
                str3 = ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16331a;
                AbstractC3193b.m15359b(objM7395j);
                if (((xfa) objM7395j) != null) {
                    ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16331a = null;
                    ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16332b = str4;
                    ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16335e = 3;
                    objM7395j = m7395j(str3, ttsRepositoryImpl$upgradeVoiceForLanguage$1);
                    if (objM7395j != obj) {
                        str5 = str4;
                    }
                    return obj;
                }
                str2 = str4;
                textToSpeechVoice = null;
                if (textToSpeechVoice != null) {
                    strM8121a = textToSpeechVoice.m8121a();
                    if (!fa4.m11650l(strM8121a, str2)) {
                        return strM8121a;
                    }
                }
                return null;
            }
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16332b;
            AbstractC3193b.m15359b(objM7395j);
        }
        textToSpeechVoice = (TextToSpeechVoice) objM7395j;
        str2 = str5;
        if (textToSpeechVoice != null) {
            strM8121a = textToSpeechVoice.m8121a();
            if (!fa4.m11650l(strM8121a, str2)) {
                return strM8121a;
            }
        }
        return null;
        textToSpeechVoice = (TextToSpeechVoice) objM7395j;
        if (textToSpeechVoice == null) {
            ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16331a = str;
            ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16332b = str2;
            ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16335e = 2;
            objM7395j = m7388c(str, ttsRepositoryImpl$upgradeVoiceForLanguage$1);
            if (objM7395j != obj) {
                String str6 = str2;
                str3 = str;
                str4 = str6;
                if (((xfa) objM7395j) != null) {
                    ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16331a = null;
                    ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16332b = str4;
                    ttsRepositoryImpl$upgradeVoiceForLanguage$1.f16335e = 3;
                    objM7395j = m7395j(str3, ttsRepositoryImpl$upgradeVoiceForLanguage$1);
                    if (objM7395j != obj) {
                        str5 = str4;
                        textToSpeechVoice = (TextToSpeechVoice) objM7395j;
                        str2 = str5;
                    }
                } else {
                    str2 = str4;
                    textToSpeechVoice = null;
                }
                if (textToSpeechVoice != null) {
                    strM8121a = textToSpeechVoice.m8121a();
                    if (!fa4.m11650l(strM8121a, str2)) {
                        return strM8121a;
                    }
                }
            }
            return obj;
        }
        strM8121a = textToSpeechVoice.m8121a();
        if (!fa4.m11650l(strM8121a, str2)) {
            return strM8121a;
        }
        return null;
    }
}
