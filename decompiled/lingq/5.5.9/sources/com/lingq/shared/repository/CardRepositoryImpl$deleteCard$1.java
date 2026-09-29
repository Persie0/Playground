package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p367rh.C8787a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {410, 413, 417, 422}, m19208m = "deleteCard")
final class CardRepositoryImpl$deleteCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19400d;

    /* JADX INFO: renamed from: e */
    public String f19401e;

    /* JADX INFO: renamed from: f */
    public String f19402f;

    /* JADX INFO: renamed from: g */
    public C8787a f19403g;

    /* JADX INFO: renamed from: h */
    public int f19404h;

    /* JADX INFO: renamed from: i */
    public int f19405i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f19406j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ CardRepositoryImpl f19407k;

    /* JADX INFO: renamed from: l */
    public int f19408l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$deleteCard$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$deleteCard$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19407k = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19406j = obj;
        this.f19408l |= Integer.MIN_VALUE;
        return this.f19407k.mo5950b(0, null, null, this);
    }
}
