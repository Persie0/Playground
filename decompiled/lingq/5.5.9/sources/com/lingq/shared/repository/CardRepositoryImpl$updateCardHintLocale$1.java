package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {514, 521, 527}, m19208m = "updateCardHintLocale")
public final class CardRepositoryImpl$updateCardHintLocale$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19503d;

    /* JADX INFO: renamed from: e */
    public String f19504e;

    /* JADX INFO: renamed from: f */
    public String f19505f;

    /* JADX INFO: renamed from: g */
    public TokenMeaning f19506g;

    /* JADX INFO: renamed from: h */
    public String f19507h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f19508i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CardRepositoryImpl f19509j;

    /* JADX INFO: renamed from: k */
    public int f19510k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$updateCardHintLocale$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$updateCardHintLocale$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19509j = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19508i = obj;
        this.f19510k |= Integer.MIN_VALUE;
        return this.f19509j.mo5963o(null, null, null, null, this);
    }
}
