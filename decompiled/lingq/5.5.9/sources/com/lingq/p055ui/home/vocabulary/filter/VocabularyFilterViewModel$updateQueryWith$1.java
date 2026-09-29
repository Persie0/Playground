package com.lingq.p055ui.home.vocabulary.filter;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterViewModel$updateQueryWith$1", m19206f = "VocabularyFilterViewModel.kt", m19207l = {109, 115}, m19208m = "invokeSuspend")
final class VocabularyFilterViewModel$updateQueryWith$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26496e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFilterViewModel f26497f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Pair<?, ?> f26498g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterViewModel$updateQueryWith$1(VocabularyFilterViewModel vocabularyFilterViewModel, Pair<?, ?> pair, InterfaceC9968c<? super VocabularyFilterViewModel$updateQueryWith$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26497f = vocabularyFilterViewModel;
        this.f26498g = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFilterViewModel$updateQueryWith$1(this.f26497f, this.f26498g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFilterViewModel$updateQueryWith$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26496e;
        VocabularyFilterViewModel vocabularyFilterViewModel = this.f26497f;
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
        InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = vocabularyFilterViewModel.f26488d.mo9685i();
        this.f26496e = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) linkedHashMapM13467T0.get(vocabularyFilterViewModel.mo498E1());
        if (vocabularySearchQuery != null) {
            Pair<?, ?> pair = this.f26498g;
            A a10 = pair.f38012a;
            C5207g.m11109d(a10, "null cannot be cast to non-null type kotlin.Int");
            vocabularySearchQuery.f22127a = ((Integer) a10).intValue();
            B b10 = pair.f38013b;
            C5207g.m11109d(b10, "null cannot be cast to non-null type kotlin.Int");
            vocabularySearchQuery.f22128b = ((Integer) b10).intValue();
        }
        this.f26496e = 2;
        if (vocabularyFilterViewModel.f26488d.mo9694r(linkedHashMapM13467T0, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
