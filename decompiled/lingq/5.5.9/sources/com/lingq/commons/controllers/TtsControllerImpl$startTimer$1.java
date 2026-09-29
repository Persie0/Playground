package com.lingq.commons.controllers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl", m19206f = "TtsController.kt", m19207l = {467}, m19208m = "startTimer")
final class TtsControllerImpl$startTimer$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TtsControllerImpl f16663d;

    /* JADX INFO: renamed from: e */
    public String f16664e;

    /* JADX INFO: renamed from: f */
    public String f16665f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f16666g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TtsControllerImpl f16667h;

    /* JADX INFO: renamed from: i */
    public int f16668i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$startTimer$1(TtsControllerImpl ttsControllerImpl, InterfaceC9968c<? super TtsControllerImpl$startTimer$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f16667h = ttsControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f16666g = obj;
        this.f16668i |= Integer.MIN_VALUE;
        return TtsControllerImpl.m9334e(this.f16667h, null, null, this);
    }
}
