package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$1", m19206f = "VocabularyFragment.kt", m19207l = {238}, m19208m = "invokeSuspend")
public final class VocabularyFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26162e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFragment f26163f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/vocabulary/VocabularyAdapter$a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$1$1", m19206f = "VocabularyFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40071 extends SuspendLambda implements InterfaceC2056p<List<? extends VocabularyAdapter.AbstractC3987a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26164e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyFragment f26165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40071(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super C40071> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26165f = vocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40071 c40071 = new C40071(this.f26165f, interfaceC9968c);
            c40071.f26164e = obj;
            return c40071;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends VocabularyAdapter.AbstractC3987a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40071) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f26164e;
            VocabularyAdapter vocabularyAdapter = this.f26165f.f26137D0;
            if (vocabularyAdapter != null) {
                vocabularyAdapter.m4529q(list);
                return C9072e.f47360a;
            }
            C5207g.m11117l("vocabularyAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFragment$onViewCreated$3$1(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super VocabularyFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26163f = vocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFragment$onViewCreated$3$1(this.f26163f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26162e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyFragment vocabularyFragment = this.f26163f;
            VocabularyViewModel vocabularyViewModelM10022q0 = vocabularyFragment.m10022q0();
            C40071 c40071 = new C40071(vocabularyFragment, null);
            this.f26162e = 1;
            if (C0062b.m369m0(vocabularyViewModelM10022q0.f26252h0, c40071, this) == coroutineSingletons) {
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
