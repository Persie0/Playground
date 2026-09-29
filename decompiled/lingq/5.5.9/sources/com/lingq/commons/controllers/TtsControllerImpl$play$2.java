package com.lingq.commons.controllers;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.source.C2497n;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$play$2", m19206f = "TtsController.kt", m19207l = {}, m19208m = "invokeSuspend")
final class TtsControllerImpl$play$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TtsControllerImpl f16619e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f16620f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2466p f16621g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f16622h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2497n f16623i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$play$2(TtsControllerImpl ttsControllerImpl, float f3, C2466p c2466p, boolean z10, C2497n c2497n, InterfaceC9968c<? super TtsControllerImpl$play$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16619e = ttsControllerImpl;
        this.f16620f = f3;
        this.f16621g = c2466p;
        this.f16622h = z10;
        this.f16623i = c2497n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TtsControllerImpl$play$2(this.f16619e, this.f16620f, this.f16621g, this.f16622h, this.f16623i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsControllerImpl$play$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        TtsControllerImpl ttsControllerImpl = this.f16619e;
        ttsControllerImpl.f16576g.setPlaybackParameters(new C2505u(this.f16620f, 1.0f));
        C2413j c2413j = ttsControllerImpl.f16576g;
        if (C5207g.m11106a(c2413j.getCurrentMediaItem(), this.f16621g) && c2413j.isPlaying() && this.f16622h) {
            c2413j.stop();
            c2413j.clearMediaItems();
            c2413j.prepare();
        } else {
            c2413j.stop();
            c2413j.clearMediaItems();
            c2413j.setMediaSource(this.f16623i);
            c2413j.prepare();
            c2413j.setPlayWhenReady(true);
        }
        return C9072e.f47360a;
    }
}
