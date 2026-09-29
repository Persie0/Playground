package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {485, 494, 501}, m19208m = "updateCardHint")
public final class CardRepositoryImpl$updateCardHint$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19494d;

    /* JADX INFO: renamed from: e */
    public String f19495e;

    /* JADX INFO: renamed from: f */
    public String f19496f;

    /* JADX INFO: renamed from: g */
    public TokenMeaning f19497g;

    /* JADX INFO: renamed from: h */
    public String f19498h;

    /* JADX INFO: renamed from: i */
    public int f19499i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f19500j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ CardRepositoryImpl f19501k;

    /* JADX INFO: renamed from: l */
    public int f19502l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$updateCardHint$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$updateCardHint$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19501k = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19500j = obj;
        this.f19502l |= Integer.MIN_VALUE;
        return this.f19501k.mo5971w(null, null, null, null, this);
    }
}
