package com.lingq.p055ui.token;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel", m19206f = "TokenViewModel.kt", m19207l = {719}, m19208m = "createAltScriptForPhrase")
final class TokenViewModel$createAltScriptForPhrase$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TokenViewModel f31522d;

    /* JADX INFO: renamed from: e */
    public Collection f31523e;

    /* JADX INFO: renamed from: f */
    public Iterator f31524f;

    /* JADX INFO: renamed from: g */
    public Collection f31525g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f31526h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TokenViewModel f31527i;

    /* JADX INFO: renamed from: j */
    public int f31528j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$createAltScriptForPhrase$1(TokenViewModel tokenViewModel, InterfaceC9968c<? super TokenViewModel$createAltScriptForPhrase$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f31527i = tokenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f31526h = obj;
        this.f31528j |= Integer.MIN_VALUE;
        return TokenViewModel.m10368l2(this.f31527i, null, this);
    }
}
