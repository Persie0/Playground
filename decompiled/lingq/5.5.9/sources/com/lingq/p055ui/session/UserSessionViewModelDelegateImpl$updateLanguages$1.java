package com.lingq.p055ui.session;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.session.UserSessionViewModelDelegateImpl", m19206f = "UserSessionViewModelDelegate.kt", m19207l = {95, 96}, m19208m = "updateLanguages")
public final class UserSessionViewModelDelegateImpl$updateLanguages$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public UserSessionViewModelDelegateImpl f30824d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f30825e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserSessionViewModelDelegateImpl f30826f;

    /* JADX INFO: renamed from: g */
    public int f30827g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$updateLanguages$1(UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl, InterfaceC9968c<? super UserSessionViewModelDelegateImpl$updateLanguages$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f30826f = userSessionViewModelDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f30825e = obj;
        this.f30827g |= Integer.MIN_VALUE;
        return this.f30826f.mo497B0(this);
    }
}
