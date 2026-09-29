package com.lingq.commons.controllers;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/TextToSpeechTokenUtterance;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$fetchBatch$1$1$1", m19206f = "TtsController.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class TtsControllerImpl$fetchBatch$1$1$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends TextToSpeechTokenUtterance>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Throwable f16588e;

    public TtsControllerImpl$fetchBatch$1$1$1(InterfaceC9968c<? super TtsControllerImpl$fetchBatch$1$1$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends TextToSpeechTokenUtterance>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        TtsControllerImpl$fetchBatch$1$1$1 ttsControllerImpl$fetchBatch$1$1$1 = new TtsControllerImpl$fetchBatch$1$1$1(interfaceC9968c);
        ttsControllerImpl$fetchBatch$1$1$1.f16588e = th2;
        return ttsControllerImpl$fetchBatch$1$1$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        this.f16588e.printStackTrace();
        return C9072e.f47360a;
    }
}
