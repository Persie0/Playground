package com.lingq.feature.reader.playback;

import com.lingq.feature.reader.playback.domain.C2467b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$playSentenceTts$2", m4291f = "PlayerStateHolder.kt", m4292l = {466}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$playSentenceTts$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2465a f29735b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29736c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f29737d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f29738e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f29739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$playSentenceTts$2(C2465a c2465a, int i, String str, float f, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f29735b = c2465a;
        this.f29736c = i;
        this.f29737d = str;
        this.f29738e = f;
        this.f29739f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerStateHolder$playSentenceTts$2(this.f29735b, this.f29736c, this.f29737d, this.f29738e, this.f29739f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerStateHolder$playSentenceTts$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29734a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2465a c2465a = this.f29735b;
            C2467b c2467b = c2465a.f29773g;
            int i2 = c2465a.f29786t;
            this.f29734a = 1;
            if (c2467b.m9369a(i2, this.f29736c, this.f29737d, this.f29738e, this.f29739f, this) == coroutineSingletons) {
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
