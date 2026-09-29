package com.lingq.core.data.domain;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3584sr;
import p000.c32;
import p000.pb1;
import p000.vi3;
import p000.xfa;
import p000.yu0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.domain.YouTubeFetcher$getYouTubeData$4", m4291f = "YoutubeSubtitlesFetcher.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class YouTubeFetcher$getYouTubeData$4 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f14416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubeFetcher$getYouTubeData$4(String str, Continuation continuation) {
        super(1, continuation);
        this.f14416a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new YouTubeFetcher$getYouTubeData$4(this.f14416a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((YouTubeFetcher$getYouTubeData$4) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        try {
            URL url = new URL(this.f14416a);
            Charset charset = yu0.f70463a;
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                inputStreamOpenStream.getClass();
                byte[] bArrM19026N = pb1.m19026N(inputStreamOpenStream);
                inputStreamOpenStream.close();
                return new String(bArrM19026N, charset);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(inputStreamOpenStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
