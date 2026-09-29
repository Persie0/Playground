package com.lingq.p055ui.session;

import ae.C0062b;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Profile;", "profile", "", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "<anonymous parameter 1>", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.UserSessionViewModelDelegateImpl$userActiveLanguage$1", m19206f = "UserSessionViewModelDelegate.kt", m19207l = {107}, m19208m = "invokeSuspend")
final class UserSessionViewModelDelegateImpl$userActiveLanguage$1 extends SuspendLambda implements InterfaceC2057q<Profile, List<? extends UserLanguage>, InterfaceC9968c<? super UserLanguage>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30832e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Profile f30833f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ UserSessionViewModelDelegateImpl f30834g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSessionViewModelDelegateImpl$userActiveLanguage$1(UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl, InterfaceC9968c<? super UserSessionViewModelDelegateImpl$userActiveLanguage$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f30834g = userSessionViewModelDelegateImpl;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Profile profile, List<? extends UserLanguage> list, InterfaceC9968c<? super UserLanguage> interfaceC9968c) {
        UserSessionViewModelDelegateImpl$userActiveLanguage$1 userSessionViewModelDelegateImpl$userActiveLanguage$1 = new UserSessionViewModelDelegateImpl$userActiveLanguage$1(this.f30834g, interfaceC9968c);
        userSessionViewModelDelegateImpl$userActiveLanguage$1.f30833f = profile;
        return userSessionViewModelDelegateImpl$userActiveLanguage$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30832e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            Profile profile = this.f30833f;
            UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl = this.f30834g;
            InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0(userSessionViewModelDelegateImpl.f30792b.mo6036v(profile.f17795o), userSessionViewModelDelegateImpl.f30795e);
            this.f30832e = 1;
            obj = FlowKt__ReduceKt.m14362c(interfaceC7116cM307S0, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return obj;
    }
}
