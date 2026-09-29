package com.lingq.p055ui.home.vocabulary.filter;

import ci.InterfaceC2010c;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p264mi.C7565e;
import p278nh.C7785l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourseLessons$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {331}, m19208m = "invokeSuspend")
final class VocabularyFilterSelectionViewModel$getCourseLessons$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26457e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFilterSelectionViewModel f26458f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourseLessons$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lmi/e;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourseLessons$1$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40591 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends C7565e>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ VocabularyFilterSelectionViewModel f26459e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40591(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel, InterfaceC9968c<? super C40591> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26459e = vocabularyFilterSelectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C40591(this.f26459e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends C7565e>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40591) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26459e.f26424I.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$getCourseLessons$1$a */
    public static final class C4060a implements InterfaceC7117d<List<? extends C7565e>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VocabularyFilterSelectionViewModel f26460a;

        public C4060a(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel) {
            this.f26460a = vocabularyFilterSelectionViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(List<? extends C7565e> list, InterfaceC9968c interfaceC9968c) {
            String str;
            Pair<String, Integer> pair;
            List<? extends C7565e> list2 = list;
            if (!list2.isEmpty()) {
                VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel = this.f26460a;
                vocabularyFilterSelectionViewModel.f26424I.setValue(Boolean.FALSE);
                ArrayList<C7565e> arrayList = new ArrayList();
                arrayList.addAll(list2);
                arrayList.add(0, new C7565e("All", -1));
                vocabularyFilterSelectionViewModel.f26429N.setValue(arrayList);
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                for (C7565e c7565e : arrayList) {
                    String str2 = c7565e.f41690b;
                    String str3 = str2 == null ? "" : str2;
                    VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) vocabularyFilterSelectionViewModel.f26435T.getValue();
                    if (vocabularySearchQuery == null || (pair = vocabularySearchQuery.f22136j) == null || (str = pair.f38012a) == null) {
                        str = "All";
                    }
                    boolean zM11106a = C5207g.m11106a(str2, str);
                    String str4 = c7565e.f41690b;
                    if (str4 == null) {
                        str4 = "key_all";
                    }
                    arrayList2.add(new C7785l(null, str3, zM11106a, str4, 1));
                }
                vocabularyFilterSelectionViewModel.f26426K.setValue(arrayList2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$getCourseLessons$1(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel, InterfaceC9968c<? super VocabularyFilterSelectionViewModel$getCourseLessons$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26458f = vocabularyFilterSelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFilterSelectionViewModel$getCourseLessons$1(this.f26458f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFilterSelectionViewModel$getCourseLessons$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Pair<String, Integer> pair;
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26457e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel = this.f26458f;
            InterfaceC2010c interfaceC2010c = vocabularyFilterSelectionViewModel.f26437e;
            VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) vocabularyFilterSelectionViewModel.f26435T.getValue();
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C40591(vocabularyFilterSelectionViewModel, null), interfaceC2010c.mo5999h((vocabularySearchQuery == null || (pair = vocabularySearchQuery.f22135i) == null || (num = pair.f38013b) == null) ? 0 : num.intValue()));
            C4060a c4060a = new C4060a(vocabularyFilterSelectionViewModel);
            this.f26457e = 1;
            if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo9539a(c4060a, this) == coroutineSingletons) {
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
