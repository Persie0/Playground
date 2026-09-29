package com.lingq.p055ui.session;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.session.UserSessionViewModelDelegateImpl", m19206f = "UserSessionViewModelDelegate.kt", m19207l = {136, 137, 138, 139}, m19208m = "updateActiveLanguage")
public final class UserSessionViewModelDelegateImpl$updateActiveLanguage$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public UserSessionViewModelDelegateImpl f30818d;

    /* JADX INFO: renamed from: e */
    public String f30819e;

    /* JADX INFO: renamed from: f */
    public LanguageToLearn f30820f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f30821g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ UserSessionViewModelDelegateImpl f30822h;

    /* JADX INFO: renamed from: i */
    public int f30823i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$updateActiveLanguage$1(UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl, InterfaceC9968c<? super UserSessionViewModelDelegateImpl$updateActiveLanguage$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f30822h = userSessionViewModelDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f30821g = obj;
        this.f30823i |= Integer.MIN_VALUE;
        return this.f30822h.mo501d(null, this);
    }
}
