package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TtsRepositoryImpl", m19206f = "TtsRepository.kt", m19207l = {194, 197, 203, 205}, m19208m = "fetchUtterancesForSentence")
public final class TtsRepositoryImpl$fetchUtterancesForSentence$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TtsRepositoryImpl f20590d;

    /* JADX INFO: renamed from: e */
    public String f20591e;

    /* JADX INFO: renamed from: f */
    public Serializable f20592f;

    /* JADX INFO: renamed from: g */
    public Object f20593g;

    /* JADX INFO: renamed from: h */
    public Locale f20594h;

    /* JADX INFO: renamed from: i */
    public String f20595i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f20596j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ TtsRepositoryImpl f20597k;

    /* JADX INFO: renamed from: l */
    public int f20598l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchUtterancesForSentence$1(TtsRepositoryImpl ttsRepositoryImpl, InterfaceC9968c<? super TtsRepositoryImpl$fetchUtterancesForSentence$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20597k = ttsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20596j = obj;
        this.f20598l |= Integer.MIN_VALUE;
        return this.f20597k.mo6175f(null, null, null, this);
    }
}
