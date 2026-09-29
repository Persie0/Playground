package com.lingq.core.player.tts;

import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.uca;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$localSpeak$didStart$1$1", m4291f = "TtsController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$localSpeak$didStart$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextToSpeech f22072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f22073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Voice f22074c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f22075d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1819c f22076e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f22077f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f22078g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$localSpeak$didStart$1$1(TextToSpeech textToSpeech, String str, Voice voice, float f, C1819c c1819c, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f22072a = textToSpeech;
        this.f22073b = str;
        this.f22074c = voice;
        this.f22075d = f;
        this.f22076e = c1819c;
        this.f22077f = str2;
        this.f22078g = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$localSpeak$didStart$1$1(this.f22072a, this.f22073b, this.f22074c, this.f22075d, this.f22076e, this.f22077f, this.f22078g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$localSpeak$didStart$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Locale localeForLanguageTag = Locale.forLanguageTag(this.f22073b);
        TextToSpeech textToSpeech = this.f22072a;
        textToSpeech.setLanguage(localeForLanguageTag);
        Voice defaultVoice = this.f22074c;
        if (defaultVoice == null) {
            defaultVoice = textToSpeech.getDefaultVoice();
        }
        textToSpeech.setVoice(defaultVoice);
        textToSpeech.setSpeechRate(this.f22075d);
        boolean z = this.f22078g;
        C1819c c1819c = this.f22076e;
        String str = this.f22077f;
        textToSpeech.setOnUtteranceProgressListener(new uca(c1819c, str, z));
        c1819c.f22181s = true;
        return Boolean.valueOf(textToSpeech.speak(str, 0, null, str) == 0);
    }
}
