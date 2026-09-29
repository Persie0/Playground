package com.lingq.p055ui.token;

import ci.InterfaceC2023p;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.token.TokenType;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$updateRelatedPhrases$1", m19206f = "TokenViewModel.kt", m19207l = {899}, m19208m = "invokeSuspend")
final class TokenViewModel$updateRelatedPhrases$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31692e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31693f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f31694g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f31695h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TokenType f31696i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f31697j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f31698k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$updateRelatedPhrases$1(TokenViewModel tokenViewModel, String str, String str2, TokenType tokenType, String str3, int i10, InterfaceC9968c<? super TokenViewModel$updateRelatedPhrases$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31693f = tokenViewModel;
        this.f31694g = str;
        this.f31695h = str2;
        this.f31696i = tokenType;
        this.f31697j = str3;
        this.f31698k = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$updateRelatedPhrases$1(this.f31693f, this.f31694g, this.f31695h, this.f31696i, this.f31697j, this.f31698k, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$updateRelatedPhrases$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31692e;
        TokenViewModel tokenViewModel = this.f31693f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2023p interfaceC2023p = tokenViewModel.f31447f;
                String str = this.f31694g;
                String str2 = this.f31695h;
                String str3 = this.f31697j;
                int i11 = this.f31698k;
                this.f31692e = 1;
                if (interfaceC2023p.mo6164b(str, str2, str3, i11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e10) {
            if (e10 instanceof HttpException) {
                tokenViewModel.f31471w0.mo14371k(e10);
            }
            if (tokenViewModel.f31454i0.getValue() == Resource.Status.LOADING) {
                Resource.Status status = Resource.Status.ERROR;
                StateFlowImpl stateFlowImpl = tokenViewModel.f31454i0;
                stateFlowImpl.setValue(status);
                stateFlowImpl.setValue(Resource.Status.EMPTY);
            }
        }
        return C9072e.f47360a;
    }
}
