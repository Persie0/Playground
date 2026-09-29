package com.lingq.p055ui.token;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import li.C7376c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchPopularMeanings$1", m19206f = "TokenViewModel.kt", m19207l = {920}, m19208m = "invokeSuspend")
final class TokenViewModel$fetchPopularMeanings$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31561e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31562f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f31563g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f31564h;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchPopularMeanings$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lli/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchPopularMeanings$1$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48491 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super C7376c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TokenViewModel f31565e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48491(TokenViewModel tokenViewModel, InterfaceC9968c<? super C48491> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31565e = tokenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48491(this.f31565e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super C7376c> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48491) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f31565e.f31450g0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchPopularMeanings$1$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/c;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchPopularMeanings$1$2", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48502 extends SuspendLambda implements InterfaceC2056p<C7376c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31566e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenViewModel f31567f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48502(TokenViewModel tokenViewModel, InterfaceC9968c<? super C48502> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31567f = tokenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48502 c48502 = new C48502(this.f31567f, interfaceC9968c);
            c48502.f31566e = obj;
            return c48502;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7376c c7376c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48502) mo1336a(c7376c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C7376c c7376c = (C7376c) this.f31566e;
            if (c7376c != null) {
                TokenViewModel tokenViewModel = this.f31567f;
                tokenViewModel.f31442c0.setValue(c7376c);
                boolean zIsEmpty = c7376c.f41165a.isEmpty();
                StateFlowImpl stateFlowImpl = tokenViewModel.f31450g0;
                if (zIsEmpty) {
                    stateFlowImpl.setValue(Resource.Status.EMPTY);
                } else {
                    stateFlowImpl.setValue(Resource.Status.SUCCESS);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$fetchPopularMeanings$1(TokenViewModel tokenViewModel, String str, String str2, InterfaceC9968c<? super TokenViewModel$fetchPopularMeanings$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31562f = tokenViewModel;
        this.f31563g = str;
        this.f31564h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$fetchPopularMeanings$1(this.f31562f, this.f31563g, this.f31564h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$fetchPopularMeanings$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31561e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            TokenViewModel tokenViewModel = this.f31562f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C48491(tokenViewModel, null), tokenViewModel.f31447f.mo6166d(tokenViewModel.mo498E1(), this.f31563g, this.f31564h));
            C48502 c48502 = new C48502(tokenViewModel, null);
            this.f31561e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c48502, this) == coroutineSingletons) {
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
