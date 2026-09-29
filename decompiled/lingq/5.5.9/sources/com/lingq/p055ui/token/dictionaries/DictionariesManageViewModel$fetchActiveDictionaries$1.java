package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchActiveDictionaries$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {BuildConfig.SDK_TRUNCATE_LENGTH}, m19208m = "invokeSuspend")
final class DictionariesManageViewModel$fetchActiveDictionaries$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31829e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DictionariesManageViewModel f31830f;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchActiveDictionaries$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchActiveDictionaries$1$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48851 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends UserDictionaryData>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ DictionariesManageViewModel f31831e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48851(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super C48851> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31831e = dictionariesManageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48851(this.f31831e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends UserDictionaryData>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48851) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f31831e.f31801I.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchActiveDictionaries$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchActiveDictionaries$1$2", m19206f = "DictionariesManageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48862 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryData>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31832e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DictionariesManageViewModel f31833f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48862(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super C48862> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31833f = dictionariesManageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48862 c48862 = new C48862(this.f31833f, interfaceC9968c);
            c48862.f31832e = obj;
            return c48862;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserDictionaryData> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48862) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f31832e;
            DictionariesManageViewModel dictionariesManageViewModel = this.f31833f;
            dictionariesManageViewModel.f31812l.setValue(list);
            boolean z10 = !list.isEmpty();
            StateFlowImpl stateFlowImpl = dictionariesManageViewModel.f31801I;
            if (z10) {
                stateFlowImpl.setValue(Boolean.FALSE);
            }
            if (list.isEmpty()) {
                stateFlowImpl.setValue(Boolean.TRUE);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageViewModel$fetchActiveDictionaries$1(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super DictionariesManageViewModel$fetchActiveDictionaries$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f31830f = dictionariesManageViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionariesManageViewModel$fetchActiveDictionaries$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new DictionariesManageViewModel$fetchActiveDictionaries$1(this.f31830f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31829e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DictionariesManageViewModel dictionariesManageViewModel = this.f31830f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C48851(dictionariesManageViewModel, null), dictionariesManageViewModel.f31805e.mo6006f(dictionariesManageViewModel.mo498E1()));
            C48862 c48862 = new C48862(dictionariesManageViewModel, null);
            this.f31829e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c48862, this) == coroutineSingletons) {
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
