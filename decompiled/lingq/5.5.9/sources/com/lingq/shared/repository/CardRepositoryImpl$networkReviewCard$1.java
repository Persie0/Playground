package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {662, 664, 667}, m19208m = "networkReviewCard")
final class CardRepositoryImpl$networkReviewCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19460d;

    /* JADX INFO: renamed from: e */
    public String f19461e;

    /* JADX INFO: renamed from: f */
    public String f19462f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19463g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CardRepositoryImpl f19464h;

    /* JADX INFO: renamed from: i */
    public int f19465i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$networkReviewCard$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$networkReviewCard$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19464h = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19463g = obj;
        this.f19465i |= Integer.MIN_VALUE;
        return this.f19464h.mo5960l(0, null, null, this);
    }
}
