package com.lingq.core.player.tts;

import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.h0a;
import p000.l83;
import p000.rm5;
import p000.sm5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$fetchBatch$1", m4291f = "TtsController.kt", m4292l = {209, 216, 221}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$fetchBatch$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1819c f22038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f22039c;

    /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$fetchBatch$1$1 */
    @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$fetchBatch$1$1", m4291f = "TtsController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18131 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Throwable f22040a;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C18131 c18131 = new C18131(3, (Continuation) obj3);
            c18131.f22040a = (Throwable) obj2;
            xfa xfaVar = xfa.f68157a;
            c18131.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th = this.f22040a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            rm5 rm5Var = sm5.Companion;
            String str = "TTS fetchBatch error: " + th.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str, new Object[0]);
            th.printStackTrace();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$fetchBatch$1(C1819c c1819c, Set set, Continuation continuation) {
        super(2, continuation);
        this.f22038b = c1819c;
        this.f22039c = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$fetchBatch$1(this.f22038b, this.f22039c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$fetchBatch$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00cd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7391f;
        Object objM7393h;
        l83 l83Var;
        C1817a c1817a;
        C1819c c1819c = this.f22038b;
        C1307w c1307w = c1819c.f22167e;
        cma cmaVar = c1819c.f22170h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22037a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f22037a = 1;
            objM7391f = c1307w.m7391f(strMo4589b2, this);
            if (objM7391f != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM7391f = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7393h = obj;
        }
        l83Var = new l83((c83) objM7393h, new C18131(3, null), 1);
        c1817a = new C1817a(c1819c);
        this.f22037a = 3;
        if (l83Var.collect(c1817a, this) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
        TextToSpeechAppVoice textToSpeechAppVoice = (TextToSpeechAppVoice) objM7391f;
        if (textToSpeechAppVoice == null) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11431b("TTS fetchBatch: No voice found for language=" + cmaVar + ".activeLanguage()", new Object[0]);
            return xfaVar;
        }
        rm5 rm5Var = sm5.Companion;
        String str = textToSpeechAppVoice.f19563a;
        String str2 = textToSpeechAppVoice.f19564b;
        Set set = this.f22039c;
        String str3 = "TTS fetchBatch: language=" + cmaVar + ".activeLanguage(), voice=" + str + ", appName=" + str2 + ", textCount=" + set.size();
        rm5Var.getClass();
        h0a.f41641a.mo11430a(str3, new Object[0]);
        String strMo4589b3 = cmaVar.mo4589b2();
        this.f22037a = 2;
        objM7393h = c1307w.m7393h(strMo4589b3, set, textToSpeechAppVoice);
        if (objM7393h != coroutineSingletons) {
            l83Var = new l83((c83) objM7393h, new C18131(3, null), 1);
            c1817a = new C1817a(c1819c);
            this.f22037a = 3;
            if (l83Var.collect(c1817a, this) != coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }
}
