package com.lingq.p055ui.home.vocabulary.filter;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import gi.C5803a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$getLanguageTags$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {358}, m19208m = "invokeSuspend")
final class VocabularyFilterSelectionViewModel$getLanguageTags$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26465e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFilterSelectionViewModel f26466f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$getLanguageTags$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lgi/a;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$getLanguageTags$1$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40631 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super C5803a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VocabularyFilterSelectionViewModel f26467e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40631(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel, InterfaceC9968c<? super C40631> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26467e = vocabularyFilterSelectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C40631(this.f26467e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super C5803a> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40631) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26467e.f26424I.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$getLanguageTags$1$a */
    public static final class C4064a implements InterfaceC7117d<C5803a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VocabularyFilterSelectionViewModel f26468a;

        public C4064a(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel) {
            this.f26468a = vocabularyFilterSelectionViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(C5803a c5803a, InterfaceC9968c interfaceC9968c) {
            List list;
            C5803a c5803a2 = c5803a;
            if (c5803a2 != null) {
                List<String> list2 = c5803a2.f35072b;
                if (!list2.isEmpty()) {
                    VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel = this.f26468a;
                    vocabularyFilterSelectionViewModel.f26424I.setValue(Boolean.FALSE);
                    vocabularyFilterSelectionViewModel.f26430O.setValue(list2);
                    VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) vocabularyFilterSelectionViewModel.f26435T.getValue();
                    if (vocabularySearchQuery == null || (list = vocabularySearchQuery.f22133g) == null) {
                        list = EmptyList.f38032a;
                    }
                    vocabularyFilterSelectionViewModel.f26431P.setValue(list);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$getLanguageTags$1(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel, InterfaceC9968c<? super VocabularyFilterSelectionViewModel$getLanguageTags$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26466f = vocabularyFilterSelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFilterSelectionViewModel$getLanguageTags$1(this.f26466f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFilterSelectionViewModel$getLanguageTags$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26465e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel = this.f26466f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C40631(vocabularyFilterSelectionViewModel, null), vocabularyFilterSelectionViewModel.f26439g.mo6021g(vocabularyFilterSelectionViewModel.mo498E1()));
            C4064a c4064a = new C4064a(vocabularyFilterSelectionViewModel);
            this.f26465e = 1;
            if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo9539a(c4064a, this) == coroutineSingletons) {
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
