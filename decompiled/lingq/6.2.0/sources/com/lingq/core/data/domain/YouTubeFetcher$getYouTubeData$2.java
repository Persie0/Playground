package com.lingq.core.data.domain;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.AbstractC3584sr;
import p000.br5;
import p000.c32;
import p000.co7;
import p000.dr5;
import p000.dr6;
import p000.hpc;
import p000.i18;
import p000.j88;
import p000.vi3;
import p000.w41;
import p000.wk9;
import p000.xfa;
import p000.y68;
import p000.z68;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.domain.YouTubeFetcher$getYouTubeData$2", m4291f = "YoutubeSubtitlesFetcher.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class YouTubeFetcher$getYouTubeData$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f14414a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubeFetcher$getYouTubeData$2(String str, Continuation continuation) {
        super(1, continuation);
        this.f14414a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new YouTubeFetcher$getYouTubeData$2(this.f14414a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((YouTubeFetcher$getYouTubeData$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strM16682n;
        String strM16682n2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1266a c1266a = C1266a.f14422a;
        w41 w41Var = new w41(13);
        StringBuilder sb = new StringBuilder("https://www.youtube.com/watch?v=");
        String str = this.f14414a;
        sb.append(str);
        w41Var.m23718L(sb.toString());
        String str2 = null;
        w41Var.m23736y("GET", null);
        co7 co7Var = new co7(w41Var);
        dr6 dr6Var = C1266a.f14423b;
        dr6Var.getClass();
        j88 j88VarExecute = FirebasePerfOkHttpClient.execute(new i18(dr6Var, co7Var));
        try {
            try {
                if (!j88VarExecute.f45200L) {
                    throw new IOException("POST player → " + j88VarExecute.f45204d);
                }
                strM16682n = j88VarExecute.f45207g.m16682n();
                AbstractC3584sr.m21646y(j88VarExecute, null);
                if (strM16682n != null) {
                    dr5 dr5VarM15424b = new Regex("\"INNERTUBE_API_KEY\":\\s*\"([a-zA-Z0-9_-]+)\"").m15424b(strM16682n);
                    String str3 = dr5VarM15424b != null ? (String) ((br5) dr5VarM15424b.m10610a()).get(1) : null;
                    if (str3 != null) {
                        String strM24029L = wk9.m24029L("\n            {\n              \"context\": {\n                \"client\": {\n                  \"clientVersion\": \"20.10.38\",\n                  \"clientName\": \"ANDROID\"\n                }\n              },\n              \"videoId\": \"" + str + "\"\n            }\n        ");
                        int i = z68.f70989a;
                        y68 y68VarM13428a = hpc.m13428a(strM24029L, C1266a.f14424c);
                        w41 w41Var2 = new w41(13);
                        w41Var2.m23718L("https://www.youtube.com/youtubei/v1/player?key=".concat(str3));
                        w41Var2.m23736y("POST", y68VarM13428a);
                        j88 j88VarExecute2 = FirebasePerfOkHttpClient.execute(new i18(dr6Var, new co7(w41Var2)));
                        try {
                            try {
                                if (!j88VarExecute2.f45200L) {
                                    throw new IOException("POST player → " + j88VarExecute2.f45204d);
                                }
                                strM16682n2 = j88VarExecute2.f45207g.m16682n();
                                AbstractC3584sr.m21646y(j88VarExecute2, null);
                                str2 = strM16682n2;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC3584sr.m21646y(j88VarExecute2, th);
                                    throw th2;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            strM16682n2 = null;
                        }
                    }
                }
                return str2 == null ? "" : str2;
            } catch (Exception e2) {
                e2.printStackTrace();
                strM16682n = null;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3584sr.m21646y(j88VarExecute, th3);
                throw th4;
            }
        }
    }
}
