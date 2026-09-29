package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {538, 546, 548}, m19208m = "removeCardHint")
public final class CardRepositoryImpl$removeCardHint$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19472d;

    /* JADX INFO: renamed from: e */
    public String f19473e;

    /* JADX INFO: renamed from: f */
    public String f19474f;

    /* JADX INFO: renamed from: g */
    public TokenMeaning f19475g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19476h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CardRepositoryImpl f19477i;

    /* JADX INFO: renamed from: j */
    public int f19478j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$removeCardHint$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$removeCardHint$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19477i = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19476h = obj;
        this.f19478j |= Integer.MIN_VALUE;
        return this.f19477i.mo5955g(null, null, null, this);
    }
}
