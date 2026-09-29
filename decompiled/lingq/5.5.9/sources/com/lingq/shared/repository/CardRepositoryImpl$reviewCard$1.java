package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {654, 656}, m19208m = "reviewCard")
final class CardRepositoryImpl$reviewCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19487d;

    /* JADX INFO: renamed from: e */
    public String f19488e;

    /* JADX INFO: renamed from: f */
    public String f19489f;

    /* JADX INFO: renamed from: g */
    public int f19490g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19491h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CardRepositoryImpl f19492i;

    /* JADX INFO: renamed from: j */
    public int f19493j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$reviewCard$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$reviewCard$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19492i = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19491h = obj;
        this.f19493j |= Integer.MIN_VALUE;
        return this.f19492i.mo5958j(0, null, null, this);
    }
}
