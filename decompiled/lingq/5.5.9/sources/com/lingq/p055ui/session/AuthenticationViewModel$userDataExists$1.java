package com.lingq.p055ui.session;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel", m19206f = "AuthenticationViewModel.kt", m19207l = {424, 425, 426, 427}, m19208m = "userDataExists")
final class AuthenticationViewModel$userDataExists$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public AuthenticationViewModel f30677d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f30678e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30679f;

    /* JADX INFO: renamed from: g */
    public int f30680g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$userDataExists$1(AuthenticationViewModel authenticationViewModel, InterfaceC9968c<? super AuthenticationViewModel$userDataExists$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f30679f = authenticationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f30678e = obj;
        this.f30680g |= Integer.MIN_VALUE;
        return AuthenticationViewModel.m10327m2(this.f30679f, this);
    }
}
