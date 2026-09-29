package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p097ej.C5417h;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$1", m19206f = "VocabularyParentFilterFragment.kt", m19207l = {54}, m19208m = "invokeSuspend")
public final class VocabularyParentFilterFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26507e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyParentFilterFragment f26508f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/commons/ui/FilterType;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyParentFilterFragment$onViewCreated$2$1$1", m19206f = "VocabularyParentFilterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40691 extends SuspendLambda implements InterfaceC2056p<FilterType, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26509e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyParentFilterFragment f26510f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40691(VocabularyParentFilterFragment vocabularyParentFilterFragment, InterfaceC9968c<? super C40691> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26510f = vocabularyParentFilterFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40691 c40691 = new C40691(this.f26510f, interfaceC9968c);
            c40691.f26509e = obj;
            return c40691;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(FilterType filterType, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40691) mo1336a(filterType, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            FilterType filterType = (FilterType) this.f26509e;
            C5207g.m11111f(filterType, "filterType");
            C5417h c5417h = new C5417h(filterType);
            Fragment fragmentM3615C = this.f26510f.m3594l().m3615C(R.id.nav_host_fragment_vocabulary);
            C5207g.m11109d(fragmentM3615C, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            C4924a.m10447Z(((NavHostFragment) fragmentM3615C).m4035m0(), c5417h);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyParentFilterFragment$onViewCreated$2$1(VocabularyParentFilterFragment vocabularyParentFilterFragment, InterfaceC9968c<? super VocabularyParentFilterFragment$onViewCreated$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26508f = vocabularyParentFilterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyParentFilterFragment$onViewCreated$2$1(this.f26508f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyParentFilterFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26507e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            VocabularyParentFilterFragment vocabularyParentFilterFragment = this.f26508f;
            InterfaceC7137r<FilterType> interfaceC7137rMo10055n1 = ((VocabularyParentFilterViewModel) vocabularyParentFilterFragment.f26499Q0.getValue()).mo10055n1();
            C40691 c40691 = new C40691(vocabularyParentFilterFragment, null);
            this.f26507e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10055n1, c40691, this) == coroutineSingletons) {
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
