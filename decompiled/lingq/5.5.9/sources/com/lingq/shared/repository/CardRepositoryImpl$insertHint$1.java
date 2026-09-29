package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl", m19206f = "CardRepository.kt", m19207l = {440, 449, 467, 469}, m19208m = "insertHint")
public final class CardRepositoryImpl$insertHint$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CardRepositoryImpl f19446d;

    /* JADX INFO: renamed from: e */
    public String f19447e;

    /* JADX INFO: renamed from: f */
    public String f19448f;

    /* JADX INFO: renamed from: g */
    public TokenMeaning f19449g;

    /* JADX INFO: renamed from: h */
    public Object f19450h;

    /* JADX INFO: renamed from: i */
    public ArrayList f19451i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f19452j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ CardRepositoryImpl f19453k;

    /* JADX INFO: renamed from: l */
    public int f19454l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$insertHint$1(CardRepositoryImpl cardRepositoryImpl, InterfaceC9968c<? super CardRepositoryImpl$insertHint$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19453k = cardRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19452j = obj;
        this.f19454l |= Integer.MIN_VALUE;
        return this.f19453k.mo5970v(null, null, null, this);
    }
}
