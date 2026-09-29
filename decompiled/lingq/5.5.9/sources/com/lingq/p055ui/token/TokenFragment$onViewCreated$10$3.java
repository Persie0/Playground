package com.lingq.p055ui.token;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$11;
import com.lingq.shared.uimodel.token.TokenType;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p076di.InterfaceC5179a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$3", m19206f = "TokenFragment.kt", m19207l = {561}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31327e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31328f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/token/TokenData;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$3$1", m19206f = "TokenFragment.kt", m19207l = {570}, m19208m = "invokeSuspend")
    public static final class C48201 extends SuspendLambda implements InterfaceC2056p<TokenData, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31329e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f31330f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ TokenFragment f31331g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48201(TokenFragment tokenFragment, InterfaceC9968c<? super C48201> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31331g = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48201 c48201 = new C48201(this.f31331g, interfaceC9968c);
            c48201.f31330f = obj;
            return c48201;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(TokenData tokenData, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48201) mo1336a(tokenData, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31329e;
            TokenFragment tokenFragment = this.f31331g;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                TokenData tokenData = (TokenData) this.f31330f;
                if (tokenData.f31176b == TokenType.NewWordOrPhraseType) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                    tokenFragment.m10363o0().m10376A2(tokenData);
                    tokenFragment.f31204B0 = tokenData.f31177c;
                    tokenFragment.f31203A0 = tokenData.f31178d;
                } else {
                    InterfaceC5179a interfaceC5179a = tokenFragment.f31217O0;
                    if (interfaceC5179a == null) {
                        C5207g.m11117l("preferenceStore");
                        throw null;
                    }
                    PreferenceStoreImpl$special$$inlined$map$11 preferenceStoreImpl$special$$inlined$map$11Mo9603r = interfaceC5179a.mo9603r();
                    this.f31329e = 1;
                    obj = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$11Mo9603r, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            if (((Boolean) obj).booleanValue()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                if (tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Lesson || tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.LessonExpanded) {
                    TokenViewModel.m10373q2(tokenFragment.m10363o0(), false);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$3(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31328f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$3(this.f31328f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31327e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31328f;
            InterfaceC7137r<TokenData> interfaceC7137rMo10035U1 = tokenFragment.m10363o0().mo10035U1();
            C48201 c48201 = new C48201(tokenFragment, null);
            this.f31327e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10035U1, c48201, this) == coroutineSingletons) {
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
