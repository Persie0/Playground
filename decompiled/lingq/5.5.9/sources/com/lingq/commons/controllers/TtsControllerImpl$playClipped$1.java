package com.lingq.commons.controllers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl", m19206f = "TtsController.kt", m19207l = {410}, m19208m = "playClipped")
final class TtsControllerImpl$playClipped$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f16624d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TtsControllerImpl f16625e;

    /* JADX INFO: renamed from: f */
    public int f16626f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$playClipped$1(TtsControllerImpl ttsControllerImpl, InterfaceC9968c<? super TtsControllerImpl$playClipped$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f16625e = ttsControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f16624d = obj;
        this.f16626f |= Integer.MIN_VALUE;
        return TtsControllerImpl.m9333d(this.f16625e, null, 0.0d, null, 0.0f, this);
    }
}
