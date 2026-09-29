package com.lingq.p055ui.token;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel", m19206f = "TokenViewModel.kt", m19207l = {678}, m19208m = "scriptsForCard")
final class TokenViewModel$scriptsForCard$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TokenViewModel f31624d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f31625e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31626f;

    /* JADX INFO: renamed from: g */
    public int f31627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$scriptsForCard$1(TokenViewModel tokenViewModel, InterfaceC9968c<? super TokenViewModel$scriptsForCard$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f31626f = tokenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f31625e = obj;
        this.f31627g |= Integer.MIN_VALUE;
        return TokenViewModel.m10370n2(this.f31626f, null, this);
    }
}
