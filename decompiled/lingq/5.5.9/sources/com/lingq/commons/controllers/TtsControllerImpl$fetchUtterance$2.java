package com.lingq.commons.controllers;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import com.lingq.util.C4924a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/uimodel/TextToSpeechTokenUtterance;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$fetchUtterance$2", m19206f = "TtsController.kt", m19207l = {314}, m19208m = "invokeSuspend")
final class TtsControllerImpl$fetchUtterance$2 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Resource<? extends TextToSpeechTokenUtterance>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f16597e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Throwable f16598f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TtsControllerImpl f16599g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f16600h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f16601i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$fetchUtterance$2(TtsControllerImpl ttsControllerImpl, String str, String str2, InterfaceC9968c<? super TtsControllerImpl$fetchUtterance$2> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f16599g = ttsControllerImpl;
        this.f16600h = str;
        this.f16601i = str2;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Resource<? extends TextToSpeechTokenUtterance>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        TtsControllerImpl$fetchUtterance$2 ttsControllerImpl$fetchUtterance$2 = new TtsControllerImpl$fetchUtterance$2(this.f16599g, this.f16600h, this.f16601i, interfaceC9968c);
        ttsControllerImpl$fetchUtterance$2.f16598f = th2;
        return ttsControllerImpl$fetchUtterance$2.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Throwable th2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f16597e;
        TtsControllerImpl ttsControllerImpl = this.f16599g;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            Throwable th3 = this.f16598f;
            this.f16598f = th3;
            this.f16597e = 1;
            if (ttsControllerImpl.m9341g(this.f16600h, this.f16601i, 1.0f, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            th2 = th3;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = this.f16598f;
            C7499b.m14977z0(obj);
        }
        C4924a.m10450b(ttsControllerImpl.f16565H);
        th2.printStackTrace();
        return C9072e.f47360a;
    }
}
