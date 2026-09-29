package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {565, 585, 587}, m19208m = "insertCardTag")
public final class CardRepositoryImpl$insertCardTag$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19439d;

    /* JADX INFO: renamed from: e */
    public String f19440e;

    /* JADX INFO: renamed from: f */
    public String f19441f;

    /* JADX INFO: renamed from: g */
    public String f19442g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19443h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CardRepositoryImpl f19444i;

    /* JADX INFO: renamed from: j */
    public int f19445j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$insertCardTag$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$insertCardTag$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19444i = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19443h = obj;
        this.f19445j |= Integer.MIN_VALUE;
        return this.f19444i.mo5967s(null, null, null, this);
    }
}
