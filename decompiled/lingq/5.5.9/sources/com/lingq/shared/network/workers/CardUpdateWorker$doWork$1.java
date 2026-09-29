package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.CardUpdateWorker", m19206f = "CardUpdateWorker.kt", m19207l = {38, 43, 47}, m19208m = "doWork")
public final class CardUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardUpdateWorker f19180d;

    /* JADX INFO: renamed from: e */
    public String f19181e;

    /* JADX INFO: renamed from: f */
    public String f19182f;

    /* JADX INFO: renamed from: g */
    public int f19183g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19184h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CardUpdateWorker f19185i;

    /* JADX INFO: renamed from: j */
    public int f19186j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardUpdateWorker$doWork$1(CardUpdateWorker cardUpdateWorker, InterfaceC9968c<? super CardUpdateWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19185i = cardUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19184h = obj;
        this.f19186j |= Integer.MIN_VALUE;
        return this.f19185i.mo4698g(this);
    }
}
