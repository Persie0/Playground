package com.lingq.p055ui.token;

import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import gi.C5803a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchLanguageTags$1", m19206f = "TokenViewModel.kt", m19207l = {963}, m19208m = "invokeSuspend")
public final class TokenViewModel$fetchLanguageTags$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31554e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31555f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f31556g;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchLanguageTags$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lgi/a;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchLanguageTags$1$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48471 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super C5803a>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f31557e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenViewModel f31558f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48471(TokenViewModel tokenViewModel, InterfaceC9968c<? super C48471> interfaceC9968c) {
            super(3, interfaceC9968c);
            this.f31558f = tokenViewModel;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super C5803a> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C48471 c48471 = new C48471(this.f31558f, interfaceC9968c);
            c48471.f31557e = th2;
            return c48471.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Throwable th2 = this.f31557e;
            th2.printStackTrace();
            if (th2 instanceof HttpException) {
                this.f31558f.f31471w0.mo14371k(th2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchLanguageTags$1$a */
    public static final class C4848a implements InterfaceC7117d<C5803a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TokenViewModel f31559a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f31560b;

        public C4848a(TokenViewModel tokenViewModel, String str) {
            this.f31559a = tokenViewModel;
            this.f31560b = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(C5803a c5803a, InterfaceC9968c interfaceC9968c) {
            C5803a c5803a2 = c5803a;
            if (c5803a2 != null) {
                List<String> list = c5803a2.f35072b;
                boolean zIsEmpty = list.isEmpty();
                TokenViewModel tokenViewModel = this.f31559a;
                if (zIsEmpty) {
                    tokenViewModel.f31458k0.setValue(Resource.Status.LOADING);
                }
                StateFlowImpl stateFlowImpl = tokenViewModel.f31444d0;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (C7661i.m15256V2((String) obj, this.f31560b, false)) {
                        arrayList.add(obj);
                    }
                }
                stateFlowImpl.setValue(arrayList);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$fetchLanguageTags$1(TokenViewModel tokenViewModel, String str, InterfaceC9968c<? super TokenViewModel$fetchLanguageTags$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31555f = tokenViewModel;
        this.f31556g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$fetchLanguageTags$1(this.f31555f, this.f31556g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$fetchLanguageTags$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31554e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            TokenViewModel tokenViewModel = this.f31555f;
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(tokenViewModel.f31453i.mo6021g(tokenViewModel.mo498E1()), new C48471(tokenViewModel, null));
            C4848a c4848a = new C4848a(tokenViewModel, this.f31556g);
            this.f31554e = 1;
            if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.mo9539a(c4848a, this) == coroutineSingletons) {
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
