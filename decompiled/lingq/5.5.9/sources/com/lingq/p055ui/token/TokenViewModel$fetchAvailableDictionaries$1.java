package com.lingq.p055ui.token;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchAvailableDictionaries$1", m19206f = "TokenViewModel.kt", m19207l = {806}, m19208m = "invokeSuspend")
final class TokenViewModel$fetchAvailableDictionaries$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31544e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31545f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchAvailableDictionaries$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchAvailableDictionaries$1$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48431 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends UserDictionaryData>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TokenViewModel f31546e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48431(TokenViewModel tokenViewModel, InterfaceC9968c<? super C48431> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31546e = tokenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48431(this.f31546e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends UserDictionaryData>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48431) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f31546e.f31470v0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchAvailableDictionaries$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchAvailableDictionaries$1$2", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48442 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryData>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31547e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenViewModel f31548f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48442(TokenViewModel tokenViewModel, InterfaceC9968c<? super C48442> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31548f = tokenViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48442 c48442 = new C48442(this.f31548f, interfaceC9968c);
            c48442.f31547e = obj;
            return c48442;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserDictionaryData> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48442) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f31547e;
            TokenViewModel tokenViewModel = this.f31548f;
            tokenViewModel.f31469u0.setValue(list);
            boolean z10 = !list.isEmpty();
            StateFlowImpl stateFlowImpl = tokenViewModel.f31470v0;
            if (z10) {
                stateFlowImpl.setValue(Resource.Status.SUCCESS);
            }
            if (list.isEmpty()) {
                stateFlowImpl.setValue(Resource.Status.LOADING);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$fetchAvailableDictionaries$1(TokenViewModel tokenViewModel, InterfaceC9968c<? super TokenViewModel$fetchAvailableDictionaries$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31545f = tokenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$fetchAvailableDictionaries$1(this.f31545f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$fetchAvailableDictionaries$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31544e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            TokenViewModel tokenViewModel = this.f31545f;
            InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C48431(tokenViewModel, null), tokenViewModel.f31449g.mo6001a(tokenViewModel.mo498E1())), tokenViewModel.f31407I);
            C48442 c48442 = new C48442(tokenViewModel, null);
            this.f31544e = 1;
            if (C0062b.m369m0(interfaceC7116cM307S0, c48442, this) == coroutineSingletons) {
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
