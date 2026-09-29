package com.lingq.p055ui.session;

import ci.InterfaceC2012e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.AuthenticationViewModel$updateLanguageIntensity$1", m19206f = "AuthenticationViewModel.kt", m19207l = {432}, m19208m = "invokeSuspend")
public final class AuthenticationViewModel$updateLanguageIntensity$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30669e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AuthenticationViewModel f30670f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30671g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f30672h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationViewModel$updateLanguageIntensity$1(AuthenticationViewModel authenticationViewModel, String str, String str2, InterfaceC9968c<? super AuthenticationViewModel$updateLanguageIntensity$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30670f = authenticationViewModel;
        this.f30671g = str;
        this.f30672h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new AuthenticationViewModel$updateLanguageIntensity$1(this.f30670f, this.f30671g, this.f30672h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AuthenticationViewModel$updateLanguageIntensity$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30669e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC2012e interfaceC2012e = this.f30670f.f30551e;
            this.f30669e = 1;
            if (interfaceC2012e.mo6031q(this.f30671g, this.f30672h, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
