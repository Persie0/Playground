package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TtsRepositoryImpl", m19206f = "TtsRepository.kt", m19207l = {97, 104, 107}, m19208m = "fetchPriorityVoice")
public final class TtsRepositoryImpl$fetchPriorityVoice$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f20568d;

    /* JADX INFO: renamed from: e */
    public String f20569e;

    /* JADX INFO: renamed from: f */
    public LinkedHashMap f20570f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20571g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TtsRepositoryImpl f20572h;

    /* JADX INFO: renamed from: i */
    public int f20573i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchPriorityVoice$1(TtsRepositoryImpl ttsRepositoryImpl, InterfaceC9968c<? super TtsRepositoryImpl$fetchPriorityVoice$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20572h = ttsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20571g = obj;
        this.f20573i |= Integer.MIN_VALUE;
        return this.f20572h.mo6176g(null, this);
    }
}
