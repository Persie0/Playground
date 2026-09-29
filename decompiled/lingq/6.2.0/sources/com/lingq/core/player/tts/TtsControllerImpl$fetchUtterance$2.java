package com.lingq.core.player.tts;

import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.cma;
import p000.f0a;
import p000.h0a;
import p000.rm5;
import p000.sm5;
import p000.ux5;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$fetchUtterance$2", m4291f = "TtsController.kt", m4292l = {401, 415}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$fetchUtterance$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f22048a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Throwable f22049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextToSpeechAppVoice f22050c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1819c f22051d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f22052e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f22053f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f22054g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$fetchUtterance$2(TextToSpeechAppVoice textToSpeechAppVoice, C1819c c1819c, String str, float f, boolean z, Continuation continuation) {
        super(3, continuation);
        this.f22050c = textToSpeechAppVoice;
        this.f22051d = c1819c;
        this.f22052e = str;
        this.f22053f = f;
        this.f22054g = z;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f = this.f22053f;
        boolean z = this.f22054g;
        TtsControllerImpl$fetchUtterance$2 ttsControllerImpl$fetchUtterance$2 = new TtsControllerImpl$fetchUtterance$2(this.f22050c, this.f22051d, this.f22052e, f, z, (Continuation) obj3);
        ttsControllerImpl$fetchUtterance$2.f22049b = (Throwable) obj2;
        return ttsControllerImpl$fetchUtterance$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r13.m7407v(r1, r12) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        if (r0.m8489j(r12.f22052e, r12.f22053f, r12.f22054g, r12) == r3) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1819c c1819c = this.f22051d;
        cma cmaVar = c1819c.f22170h;
        Throwable th = this.f22049b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22048a;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            rm5 rm5Var = sm5.Companion;
            String strConcat = "TTS fetchUtterance error: ".concat(message);
            rm5Var.getClass();
            f0a f0aVar = h0a.f41641a;
            f0aVar.mo11431b(strConcat, new Object[0]);
            if (vk9.m23380c0(message, "wrong tts voice", true) || vk9.m23380c0(message, "invalid voice", true)) {
                TextToSpeechAppVoice textToSpeechAppVoice = this.f22050c;
                f0aVar.mo11431b(ux5.m22991n("TTS fetchUtterance: Wrong/invalid voice error for voice=", textToSpeechAppVoice.f19563a, ", appName=", textToSpeechAppVoice.f19564b, ". Refreshing voices and falling back to local TTS."), new Object[0]);
                C1307w c1307w = c1819c.f22167e;
                String strMo4589b2 = cmaVar.mo4589b2();
                this.f22049b = null;
                this.f22048a = 1;
            } else {
                if (vk9.m23380c0(message, "not found", true)) {
                    f0aVar.mo11431b("TTS fetchUtterance: Voice not found for language=" + cmaVar + ".activeLanguage()", new Object[0]);
                } else {
                    f0aVar.mo11431b("TTS fetchUtterance: Generic error - ".concat(message), new Object[0]);
                }
                c1819c.m8491l();
                this.f22049b = null;
                this.f22048a = 2;
            }
            return coroutineSingletons;
        } catch (Exception e) {
            rm5 rm5Var2 = sm5.Companion;
            String str = "TTS fetchUtterance: Failed to refresh voices: " + e.getMessage();
            rm5Var2.getClass();
            h0a.f41641a.mo11431b(str, new Object[0]);
        }
        c1819c.m8491l();
        this.f22049b = null;
        this.f22048a = 2;
    }
}
