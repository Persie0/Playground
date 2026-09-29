package com.lingq.p055ui.token;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.InterfaceC7379f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$removeTokenMeaning$1", m19206f = "TokenViewModel.kt", m19207l = {1191}, m19208m = "invokeSuspend")
final class TokenViewModel$removeTokenMeaning$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31621e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31622f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ TokenMeaning f31623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$removeTokenMeaning$1(TokenViewModel tokenViewModel, TokenMeaning tokenMeaning, InterfaceC9968c<? super TokenViewModel$removeTokenMeaning$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31622f = tokenViewModel;
        this.f31623g = tokenMeaning;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$removeTokenMeaning$1(this.f31622f, this.f31623g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$removeTokenMeaning$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String strMo14774c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31621e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            TokenViewModel tokenViewModel = this.f31622f;
            InterfaceC2008a interfaceC2008a = tokenViewModel.f31443d;
            String strMo498E1 = tokenViewModel.mo498E1();
            InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModel.f31437X.getValue();
            if (interfaceC7379f == null || (strMo14774c = interfaceC7379f.mo14774c()) == null) {
                strMo14774c = "";
            }
            this.f31621e = 1;
            if (interfaceC2008a.mo5955g(strMo498E1, strMo14774c, this.f31623g, this) == coroutineSingletons) {
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
