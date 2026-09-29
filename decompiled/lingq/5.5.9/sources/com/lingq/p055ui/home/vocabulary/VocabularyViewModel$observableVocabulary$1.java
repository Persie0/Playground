package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import ci.InterfaceC2025r;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p264mi.C7563c;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$observableVocabulary$1", m19206f = "VocabularyViewModel.kt", m19207l = {220, 228}, m19208m = "invokeSuspend")
public final class VocabularyViewModel$observableVocabulary$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26297e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyViewModel f26298f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$observableVocabulary$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lmi/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$observableVocabulary$1$1", m19206f = "VocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40231 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends C7563c>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VocabularyViewModel f26299e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40231(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super C40231> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26299e = vocabularyViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C40231(this.f26299e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends C7563c>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40231) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26299e.f26229P.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$observableVocabulary$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lmi/c;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$observableVocabulary$1$2", m19206f = "VocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40242 extends SuspendLambda implements InterfaceC2056p<List<? extends C7563c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26300e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyViewModel f26301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40242(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super C40242> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26301f = vocabularyViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40242 c40242 = new C40242(this.f26301f, interfaceC9968c);
            c40242.f26300e = obj;
            return c40242;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7563c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40242) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Resource.Status status;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f26300e;
            VocabularyViewModel vocabularyViewModel = this.f26301f;
            StateFlowImpl stateFlowImpl = vocabularyViewModel.f26229P;
            boolean zIsEmpty = list.isEmpty();
            StateFlowImpl stateFlowImpl2 = vocabularyViewModel.f26228O;
            if (zIsEmpty && ((Boolean) stateFlowImpl2.getValue()).booleanValue()) {
                status = Resource.Status.LOADING;
            } else {
                status = (!list.isEmpty() || ((Boolean) stateFlowImpl2.getValue()).booleanValue()) ? Resource.Status.SUCCESS : Resource.Status.EMPTY;
            }
            stateFlowImpl.setValue(status);
            vocabularyViewModel.f26227N.setValue(list);
            C7499b.m14935d0(C8573r0.m16767w0(vocabularyViewModel), vocabularyViewModel.f26247f, "vocabPages", new VocabularyViewModel$getTotalPages$1(vocabularyViewModel, null));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$observableVocabulary$1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super VocabularyViewModel$observableVocabulary$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26298f = vocabularyViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyViewModel$observableVocabulary$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyViewModel$observableVocabulary$1(this.f26298f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26297e;
        VocabularyViewModel vocabularyViewModel = this.f26298f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2025r interfaceC2025r = vocabularyViewModel.f26245e;
        String strMo498E1 = vocabularyViewModel.mo498E1();
        StateFlowImpl stateFlowImpl = vocabularyViewModel.f26223J;
        boolean z10 = stateFlowImpl.getValue() == VocabularyAdapter.SelectedContent.SrsDue;
        boolean z11 = stateFlowImpl.getValue() == VocabularyAdapter.SelectedContent.Phrases;
        int iIntValue = ((Number) vocabularyViewModel.f26232S.getValue()).intValue();
        String str = (String) vocabularyViewModel.f26224K.getValue();
        this.f26297e = 1;
        obj = interfaceC2025r.mo6182d(strMo498E1, iIntValue, (96 & 4) != 0 ? "" : str, (96 & 8) != 0 ? false : z10, (96 & 16) != 0 ? false : z11, null, (96 & 64) != 0 ? -1 : 0, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C40231(vocabularyViewModel, null), (InterfaceC7116c) obj), vocabularyViewModel.f26253i);
        C40242 c40242 = new C40242(vocabularyViewModel, null);
        this.f26297e = 2;
        if (C0062b.m369m0(interfaceC7116cM307S0, c40242, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
