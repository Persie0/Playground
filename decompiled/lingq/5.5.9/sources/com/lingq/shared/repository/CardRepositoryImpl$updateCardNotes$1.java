package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {553, 557, 559}, m19208m = "updateCardNotes")
public final class CardRepositoryImpl$updateCardNotes$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19511d;

    /* JADX INFO: renamed from: e */
    public String f19512e;

    /* JADX INFO: renamed from: f */
    public String f19513f;

    /* JADX INFO: renamed from: g */
    public String f19514g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19515h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CardRepositoryImpl f19516i;

    /* JADX INFO: renamed from: j */
    public int f19517j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$updateCardNotes$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$updateCardNotes$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19516i = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19515h = obj;
        this.f19517j |= Integer.MIN_VALUE;
        return this.f19516i.mo5953e(null, null, null, this);
    }
}
