package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TtsRepositoryImpl", m19206f = "TtsRepository.kt", m19207l = {68, 69}, m19208m = "updateTtsVoices")
public final class TtsRepositoryImpl$updateTtsVoices$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TtsRepositoryImpl f20608d;

    /* JADX INFO: renamed from: e */
    public String f20609e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20610f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TtsRepositoryImpl f20611g;

    /* JADX INFO: renamed from: h */
    public int f20612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$updateTtsVoices$1(TtsRepositoryImpl ttsRepositoryImpl, InterfaceC9968c<? super TtsRepositoryImpl$updateTtsVoices$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20611g = ttsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20610f = obj;
        this.f20612h |= Integer.MIN_VALUE;
        return this.f20611g.mo6173d(null, this);
    }
}
