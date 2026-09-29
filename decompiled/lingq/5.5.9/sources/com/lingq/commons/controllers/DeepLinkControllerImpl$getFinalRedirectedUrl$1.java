package com.lingq.commons.controllers;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.DeepLinkControllerImpl$getFinalRedirectedUrl$1", m19206f = "DeepLinkController.kt", m19207l = {}, m19208m = "invokeSuspend")
final class DeepLinkControllerImpl$getFinalRedirectedUrl$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DeepLinkControllerImpl f16522e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f16523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkControllerImpl$getFinalRedirectedUrl$1(DeepLinkControllerImpl deepLinkControllerImpl, String str, InterfaceC9968c<? super DeepLinkControllerImpl$getFinalRedirectedUrl$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16522e = deepLinkControllerImpl;
        this.f16523f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DeepLinkControllerImpl$getFinalRedirectedUrl$1(this.f16522e, this.f16523f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DeepLinkControllerImpl$getFinalRedirectedUrl$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        HttpURLConnection httpURLConnection;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        DeepLinkControllerImpl deepLinkControllerImpl = this.f16522e;
        StateFlowImpl stateFlowImpl = deepLinkControllerImpl.f16514e;
        StateFlowImpl stateFlowImpl2 = deepLinkControllerImpl.f16514e;
        stateFlowImpl.setValue(new Pair(Boolean.TRUE, ""));
        String headerField = "";
        while (true) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.f16523f).openConnection();
                C5207g.m11109d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                boolean z10 = true;
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (300 > responseCode || responseCode >= 400) {
                    z10 = false;
                }
                if (z10 && C7661i.m15250P2(headerField)) {
                    headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        break;
                    }
                    stateFlowImpl2.setValue(new Pair(Boolean.FALSE, ""));
                    deepLinkControllerImpl.mo9317Z(headerField, 0L);
                    httpURLConnection.disconnect();
                    if (httpURLConnection.getResponseCode() == 200) {
                    }
                }
                break;
            } catch (Exception e10) {
                e10.printStackTrace();
                deepLinkControllerImpl.f16516g.mo14371k(AbstractC3274b.k.f16695a);
                stateFlowImpl2.setValue(new Pair(Boolean.FALSE, ""));
            }
        }
        httpURLConnection.disconnect();
        stateFlowImpl2.setValue(new Pair(Boolean.FALSE, ""));
        return C9072e.f47360a;
    }
}
