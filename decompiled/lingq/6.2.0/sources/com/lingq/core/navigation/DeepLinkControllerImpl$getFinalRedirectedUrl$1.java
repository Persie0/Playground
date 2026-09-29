package com.lingq.core.navigation;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.fa4;
import p000.un1;
import p000.ve6;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.navigation.DeepLinkControllerImpl$getFinalRedirectedUrl$1", m4291f = "DeepLinkController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DeepLinkControllerImpl$getFinalRedirectedUrl$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1552a f20249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f20250b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkControllerImpl$getFinalRedirectedUrl$1(C1552a c1552a, String str, Continuation continuation) {
        super(2, continuation);
        this.f20249a = c1552a;
        this.f20250b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeepLinkControllerImpl$getFinalRedirectedUrl$1(this.f20249a, this.f20250b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DeepLinkControllerImpl$getFinalRedirectedUrl$1 deepLinkControllerImpl$getFinalRedirectedUrl$1 = (DeepLinkControllerImpl$getFinalRedirectedUrl$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        deepLinkControllerImpl$getFinalRedirectedUrl$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HttpURLConnection httpURLConnection;
        String str = this.f20250b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1552a c1552a = this.f20249a;
        C3244l c3244l = c1552a.f20263g;
        Pair pair = new Pair(Boolean.TRUE, "");
        c3244l.getClass();
        c3244l.m15572j(null, pair);
        String headerField = "";
        do {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                uRLConnection.getClass();
                httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (300 > responseCode || responseCode >= 400 || !vk9.m23391n0(headerField) || (headerField = httpURLConnection.getHeaderField("Location")) == null) {
                    break;
                    break;
                    break;
                    break;
                }
                Pair pair2 = new Pair(Boolean.FALSE, "");
                c3244l.getClass();
                c3244l.m15572j(null, pair2);
                c1552a.mo8247e0(headerField, 0L);
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
                C3244l c3244l2 = c1552a.f20265i;
                c3244l2.getClass();
                c3244l2.m15572j(null, ve6.f65273a);
                Pair pair3 = new Pair(Boolean.FALSE, "");
                c3244l.getClass();
                c3244l.m15572j(null, pair3);
            }
        } while (httpURLConnection.getResponseCode() != 200);
        if (!fa4.m11650l(httpURLConnection.getURL().toString(), str)) {
            String string = httpURLConnection.getURL().toString();
            string.getClass();
            c1552a.mo8247e0(string, 0L);
        }
        httpURLConnection.disconnect();
        Pair pair4 = new Pair(Boolean.FALSE, "");
        c3244l.getClass();
        c3244l.m15572j(null, pair4);
        return xfa.f68157a;
    }
}
