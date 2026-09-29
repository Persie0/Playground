package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.CardReviewWorker", m19206f = "CardReviewWorker.kt", m19207l = {27}, m19208m = "doWork")
public final class CardReviewWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19173d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CardReviewWorker f19174e;

    /* JADX INFO: renamed from: f */
    public int f19175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReviewWorker$doWork$1(CardReviewWorker cardReviewWorker, InterfaceC9968c<? super CardReviewWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19174e = cardReviewWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19173d = obj;
        this.f19175f |= Integer.MIN_VALUE;
        return this.f19174e.mo4698g(this);
    }
}
