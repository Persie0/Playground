package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.requests.RequestDataCard;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {743}, m19208m = "dispatchCardUpdateWorker")
public final class CardRepositoryImpl$dispatchCardUpdateWorker$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19409d;

    /* JADX INFO: renamed from: e */
    public String f19410e;

    /* JADX INFO: renamed from: f */
    public String f19411f;

    /* JADX INFO: renamed from: g */
    public Ref$IntRef f19412g;

    /* JADX INFO: renamed from: h */
    public RequestDataCard f19413h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f19414i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CardRepositoryImpl f19415j;

    /* JADX INFO: renamed from: k */
    public int f19416k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$dispatchCardUpdateWorker$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$dispatchCardUpdateWorker$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19415j = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19414i = obj;
        this.f19416k |= Integer.MIN_VALUE;
        return this.f19415j.m9475y(null, null, this);
    }
}
