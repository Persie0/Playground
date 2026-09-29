package com.lingq.p055ui.token;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel", m19206f = "TokenViewModel.kt", m19207l = {630}, m19208m = "scriptsForWord")
final class TokenViewModel$scriptsForWord$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TokenViewModel f31628d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f31629e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31630f;

    /* JADX INFO: renamed from: g */
    public int f31631g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$scriptsForWord$1(TokenViewModel tokenViewModel, InterfaceC9968c<? super TokenViewModel$scriptsForWord$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f31630f = tokenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f31629e = obj;
        this.f31631g |= Integer.MIN_VALUE;
        return TokenViewModel.m10371o2(this.f31630f, null, this);
    }
}
