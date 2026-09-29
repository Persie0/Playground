package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultVocabularyCard;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {635, 637, 647}, m19208m = "networkUpdateCard")
public final class CardRepositoryImpl$networkUpdateCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19466d;

    /* JADX INFO: renamed from: e */
    public String f19467e;

    /* JADX INFO: renamed from: f */
    public ResultVocabularyCard f19468f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19469g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CardRepositoryImpl f19470h;

    /* JADX INFO: renamed from: i */
    public int f19471i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$networkUpdateCard$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$networkUpdateCard$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19470h = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19469g = obj;
        this.f19471i |= Integer.MIN_VALUE;
        return this.f19470h.mo5968t(null, 0, null, this);
    }
}
