package com.lingq.p055ui.token;

import ae.C0062b;
import ci.InterfaceC2023p;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.token.TokenTranslations;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchTokenTranslation$1", m19206f = "TokenViewModel.kt", m19207l = {990}, m19208m = "invokeSuspend")
final class TokenViewModel$fetchTokenTranslation$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31582e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31583f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f31584g;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchTokenTranslation$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/token/TokenTranslations;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchTokenTranslation$1$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48521 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super TokenTranslations>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TokenViewModel f31585e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48521(TokenViewModel tokenViewModel, InterfaceC9968c<? super C48521> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31585e = tokenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48521(this.f31585e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super TokenTranslations> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48521) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f31585e.f31461m0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchTokenTranslation$1$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenTranslations;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchTokenTranslation$1$2", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48532 extends SuspendLambda implements InterfaceC2056p<TokenTranslations, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31586e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenViewModel f31587f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f31588g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48532(TokenViewModel tokenViewModel, String str, InterfaceC9968c<? super C48532> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31587f = tokenViewModel;
            this.f31588g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48532 c48532 = new C48532(this.f31587f, this.f31588g, interfaceC9968c);
            c48532.f31586e = obj;
            return c48532;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(TokenTranslations tokenTranslations, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48532) mo1336a(tokenTranslations, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            TokenTranslations tokenTranslations = (TokenTranslations) this.f31586e;
            TokenViewModel tokenViewModel = this.f31587f;
            if (tokenTranslations != null) {
                tokenViewModel.f31422P0.setValue(tokenTranslations);
                Resource.Status status = Resource.Status.SUCCESS;
                tokenViewModel.f31450g0.setValue(status);
                tokenViewModel.f31461m0.setValue(status);
            } else {
                tokenViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(tokenViewModel), null, null, new TokenViewModel$updateTokenTranslation$1(tokenViewModel, this.f31588g, null), 3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$fetchTokenTranslation$1(TokenViewModel tokenViewModel, String str, InterfaceC9968c<? super TokenViewModel$fetchTokenTranslation$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31583f = tokenViewModel;
        this.f31584g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$fetchTokenTranslation$1(this.f31583f, this.f31584g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$fetchTokenTranslation$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31582e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            TokenViewModel tokenViewModel = this.f31583f;
            InterfaceC2023p interfaceC2023p = tokenViewModel.f31447f;
            String strMo498E1 = tokenViewModel.mo498E1();
            String strMo507p1 = tokenViewModel.mo507p1();
            String str = this.f31584g;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C48521(tokenViewModel, null), interfaceC2023p.mo6168f(strMo498E1, strMo507p1, str));
            C48532 c48532 = new C48532(tokenViewModel, str, null);
            this.f31582e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c48532, this) == coroutineSingletons) {
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
