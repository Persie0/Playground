package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$4$1", m19206f = "VocabularyFilterSelectionFragment.kt", m19207l = {75}, m19208m = "invokeSuspend")
public final class VocabularyFilterSelectionFragment$onViewCreated$4$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26395e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFilterSelectionFragment f26396f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ VocabularyFilterSelectionAdapter f26397g;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$4$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterSelectionAdapter$a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$4$1$1", m19206f = "VocabularyFilterSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40431 extends SuspendLambda implements InterfaceC2056p<List<? extends VocabularyFilterSelectionAdapter.AbstractC4037a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26398e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyFilterSelectionAdapter f26399f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40431(VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter, InterfaceC9968c<? super C40431> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26399f = vocabularyFilterSelectionAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40431 c40431 = new C40431(this.f26399f, interfaceC9968c);
            c40431.f26398e = obj;
            return c40431;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends VocabularyFilterSelectionAdapter.AbstractC4037a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40431) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26399f.m4529q((List) this.f26398e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionFragment$onViewCreated$4$1(VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter, VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26396f = vocabularyFilterSelectionFragment;
        this.f26397g = vocabularyFilterSelectionAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFilterSelectionFragment$onViewCreated$4$1(this.f26397g, this.f26396f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFilterSelectionFragment$onViewCreated$4$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26395e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFilterSelectionFragment.f26380D0;
            VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModelM10071o0 = this.f26396f.m10071o0();
            C40431 c40431 = new C40431(this.f26397g, null);
            this.f26395e = 1;
            if (C0062b.m369m0(vocabularyFilterSelectionViewModelM10071o0.f26427L, c40431, this) == coroutineSingletons) {
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
