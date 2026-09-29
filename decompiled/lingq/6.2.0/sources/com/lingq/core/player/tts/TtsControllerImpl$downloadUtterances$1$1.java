package com.lingq.core.player.tts;

import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import com.lingq.core.download.downloader.C1550a;
import java.io.File;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$downloadUtterances$1$1", m4291f = "TtsController.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$downloadUtterances$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1819c f22034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextToSpeechTokenUtterance f22035c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ File f22036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$downloadUtterances$1$1(C1819c c1819c, TextToSpeechTokenUtterance textToSpeechTokenUtterance, File file, Continuation continuation) {
        super(2, continuation);
        this.f22034b = c1819c;
        this.f22035c = textToSpeechTokenUtterance;
        this.f22036d = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$downloadUtterances$1$1(this.f22034b, this.f22035c, this.f22036d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$downloadUtterances$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22033a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1550a c1550a = this.f22034b.f22171i;
            String str = this.f22035c.f19567c;
            this.f22033a = 1;
            if (C1550a.m8238b(c1550a, str, this.f22036d, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
