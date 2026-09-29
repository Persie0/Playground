package com.lingq.commons.controllers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl", m19206f = "TtsController.kt", m19207l = {309, 317}, m19208m = "fetchUtterance")
final class TtsControllerImpl$fetchUtterance$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TtsControllerImpl f16590d;

    /* JADX INFO: renamed from: e */
    public String f16591e;

    /* JADX INFO: renamed from: f */
    public String f16592f;

    /* JADX INFO: renamed from: g */
    public float f16593g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f16594h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TtsControllerImpl f16595i;

    /* JADX INFO: renamed from: j */
    public int f16596j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$fetchUtterance$1(TtsControllerImpl ttsControllerImpl, InterfaceC9968c<? super TtsControllerImpl$fetchUtterance$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f16595i = ttsControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f16594h = obj;
        this.f16596j |= Integer.MIN_VALUE;
        return TtsControllerImpl.m9331a(this.f16595i, null, null, null, 0.0f, this);
    }
}
