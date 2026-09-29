package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {252}, m19208m = "insertCard")
public final class CardRepositoryImpl$insertCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19417d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CardRepositoryImpl f19418e;

    /* JADX INFO: renamed from: f */
    public int f19419f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$insertCard$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$insertCard$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19418e = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19417d = obj;
        this.f19419f |= Integer.MIN_VALUE;
        return this.f19418e.mo5969u(0, null, null, null, 0, null, null, this);
    }
}
