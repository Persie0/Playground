package com.lingq.core.data.domain;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3584sr;
import p000.c32;
import p000.co7;
import p000.dr6;
import p000.hpc;
import p000.i18;
import p000.j88;
import p000.or3;
import p000.vi3;
import p000.w41;
import p000.wk9;
import p000.xfa;
import p000.xv5;
import p000.y68;
import p000.z68;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.domain.YouTubeFetcher$getYouTubeData$3", m4291f = "YoutubeSubtitlesFetcher.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class YouTubeFetcher$getYouTubeData$3 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f14415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubeFetcher$getYouTubeData$3(String str, Continuation continuation) {
        super(1, continuation);
        this.f14415a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new YouTubeFetcher$getYouTubeData$3(this.f14415a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((YouTubeFetcher$getYouTubeData$3) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strM16682n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1266a c1266a = C1266a.f14422a;
        String strM24029L = wk9.m24029L("\n            {\n              \"context\": {\n                \"client\": {\n                  \"clientVersion\": \"2.20250528.01.00\",\n                  \"clientName\": \"WEB\"\n                }\n              },\n              \"videoId\": \"" + this.f14415a + "\"\n            }\n        ");
        int i = z68.f70989a;
        xv5 xv5Var = C1266a.f14424c;
        y68 y68VarM13428a = hpc.m13428a(strM24029L, xv5Var);
        w41 w41Var = new w41(13);
        w41Var.m23718L("https://www.youtube.com/youtubei/v1/player?prettyPrint=false");
        w41Var.m23736y("POST", y68VarM13428a);
        String str = xv5Var.f68847a;
        str.getClass();
        ((or3) w41Var.f66367c).m18305j("Content-Type", str);
        ((or3) w41Var.f66367c).m18305j("X-Youtube-Client-Name", "1");
        ((or3) w41Var.f66367c).m18305j("X-Youtube-Client-Version", "2.20250528.01.00");
        ((or3) w41Var.f66367c).m18305j("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36");
        co7 co7Var = new co7(w41Var);
        dr6 dr6Var = C1266a.f14423b;
        dr6Var.getClass();
        j88 j88VarExecute = FirebasePerfOkHttpClient.execute(new i18(dr6Var, co7Var));
        try {
            try {
                if (j88VarExecute.f45200L) {
                    strM16682n = j88VarExecute.f45207g.m16682n();
                    AbstractC3584sr.m21646y(j88VarExecute, null);
                    return strM16682n == null ? "" : strM16682n;
                }
                throw new IOException("POST player → " + j88VarExecute.f45204d);
            } catch (Exception e) {
                e.printStackTrace();
                strM16682n = null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3584sr.m21646y(j88VarExecute, th);
                throw th2;
            }
        }
    }
}
