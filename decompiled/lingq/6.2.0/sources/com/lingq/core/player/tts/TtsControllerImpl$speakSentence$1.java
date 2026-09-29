package com.lingq.core.player.tts;

import android.content.Context;
import android.net.Uri;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.mb1;
import p000.ob1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$speakSentence$1", m4291f = "TtsController.kt", m4292l = {450}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$speakSentence$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22130a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1819c f22131b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f22132c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ double f22133d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Double f22134e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f22135f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f22136g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$speakSentence$1(C1819c c1819c, int i, double d, Double d2, float f, String str, Continuation continuation) {
        super(2, continuation);
        this.f22131b = c1819c;
        this.f22132c = i;
        this.f22133d = d;
        this.f22134e = d2;
        this.f22135f = f;
        this.f22136g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$speakSentence$1(this.f22131b, this.f22132c, this.f22133d, this.f22134e, this.f22135f, this.f22136g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$speakSentence$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22130a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            mb1 mb1Var = ob1.Companion;
            C1819c c1819c = this.f22131b;
            Context context = c1819c.f22163a;
            mb1Var.getClass();
            Uri uri = Uri.parse(mb1.m16743c(context).toString() + "/" + this.f22132c + ".mp3");
            uri.getClass();
            this.f22130a = 1;
            if (C1819c.m8480f(c1819c, uri, this.f22133d, this.f22134e, this.f22132c, this.f22135f, this.f22136g, this) == coroutineSingletons) {
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
