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
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel", m19206f = "TokenViewModel.kt", m19207l = {746}, m19208m = "createTransliterationForPhrase")
final class TokenViewModel$createTransliterationForPhrase$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public TokenViewModel f31529d;

    /* JADX INFO: renamed from: e */
    public Collection f31530e;

    /* JADX INFO: renamed from: f */
    public Iterator f31531f;

    /* JADX INFO: renamed from: g */
    public Collection f31532g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f31533h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TokenViewModel f31534i;

    /* JADX INFO: renamed from: j */
    public int f31535j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$createTransliterationForPhrase$1(TokenViewModel tokenViewModel, InterfaceC9968c<? super TokenViewModel$createTransliterationForPhrase$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f31534i = tokenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f31533h = obj;
        this.f31535j |= Integer.MIN_VALUE;
        return TokenViewModel.m10369m2(this.f31534i, null, this);
    }
}
