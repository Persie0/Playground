package com.lingq.p055ui.session;

import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultRegistrationValidation;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$validateFields$1", m19206f = "AuthenticationViewModel.kt", m19207l = {320, 321}, m19208m = "invokeSuspend")
final class AuthenticationViewModel$validateFields$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30681e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30682f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30683g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f30684h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$validateFields$1(AuthenticationViewModel authenticationViewModel, String str, String str2, InterfaceC9968c<? super AuthenticationViewModel$validateFields$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30682f = authenticationViewModel;
        this.f30683g = str;
        this.f30684h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$validateFields$1(this.f30682f, this.f30683g, this.f30684h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$validateFields$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ResultRegistrationValidation resultRegistrationValidation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30681e;
        AuthenticationViewModel authenticationViewModel = this.f30682f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            resultRegistrationValidation = (ResultRegistrationValidation) obj;
            if (resultRegistrationValidation != null) {
                authenticationViewModel.f30543U.mo14371k(resultRegistrationValidation);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        this.f30681e = 1;
        if (C7828f.m15567a(500L, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        InterfaceC2020m interfaceC2020m = authenticationViewModel.f30550d;
        this.f30681e = 2;
        obj = interfaceC2020m.mo6149r(this.f30683g, this.f30684h, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        resultRegistrationValidation = (ResultRegistrationValidation) obj;
        if (resultRegistrationValidation != null) {
            authenticationViewModel.f30543U.mo14371k(resultRegistrationValidation);
        }
        return C9072e.f47360a;
    }
}
