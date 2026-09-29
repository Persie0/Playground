package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.CardDeleteWorker", m19206f = "CardDeleteWorker.kt", m19207l = {34, 38}, m19208m = "doWork")
public final class CardDeleteWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardDeleteWorker f19164d;

    /* JADX INFO: renamed from: e */
    public String f19165e;

    /* JADX INFO: renamed from: f */
    public int f19166f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19167g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CardDeleteWorker f19168h;

    /* JADX INFO: renamed from: i */
    public int f19169i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDeleteWorker$doWork$1(CardDeleteWorker cardDeleteWorker, InterfaceC9968c<? super CardDeleteWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19168h = cardDeleteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19167g = obj;
        this.f19169i |= Integer.MIN_VALUE;
        return this.f19168h.mo4698g(this);
    }
}
