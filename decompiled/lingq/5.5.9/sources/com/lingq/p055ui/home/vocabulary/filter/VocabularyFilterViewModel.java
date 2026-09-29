package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5182d;
import p225kk.C6715l;
import p260m8.C7499b;
import p278nh.AbstractC7787n;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class VocabularyFilterViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: d */
    public final InterfaceC5182d f26488d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f26489e;

    /* JADX INFO: renamed from: f */
    public final StateFlowImpl f26490f;

    /* JADX INFO: renamed from: g */
    public final C7135p f26491g;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterViewModel$1", m19206f = "VocabularyFilterViewModel.kt", m19207l = {33}, m19208m = "invokeSuspend")
    public static final class C40671 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26492e;

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/vocabulary/VocabularySearchQuery;", "vocabularySearchQuery", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterViewModel$1$1", m19206f = "VocabularyFilterViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends VocabularySearchQuery>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f26494e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ VocabularyFilterViewModel f26495f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VocabularyFilterViewModel vocabularyFilterViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26495f = vocabularyFilterViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26495f, interfaceC9968c);
                anonymousClass1.f26494e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends VocabularySearchQuery> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Map map = (Map) this.f26494e;
                VocabularyFilterViewModel vocabularyFilterViewModel = this.f26495f;
                VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) map.get(vocabularyFilterViewModel.mo498E1());
                if (vocabularySearchQuery != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new AbstractC7787n.m(R.string.card_sort_status));
                    List<? extends CardStatus> list = vocabularySearchQuery.f22134h;
                    ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(C4924a.m10429H((CardStatus) it.next())));
                    }
                    arrayList.add(new AbstractC7787n.g(arrayList2, C9000b.m17252r(Integer.valueOf(R.string.search_status_1), Integer.valueOf(R.string.search_status_2), Integer.valueOf(R.string.search_status_3), Integer.valueOf(R.string.search_status_4), Integer.valueOf(R.string.search_status_known)), vocabularySearchQuery.f22127a, vocabularySearchQuery.f22128b, ViewKeys.StatusRange.ordinal()));
                    arrayList.add(new AbstractC7787n.m(R.string.sort_sort_by));
                    arrayList.add(new AbstractC7787n.h(Integer.valueOf(C4924a.m10432K(vocabularySearchQuery.f22131e)), null, ViewKeys.SortBy.ordinal(), 2));
                    arrayList.add(new AbstractC7787n.m(R.string.card_search_term));
                    arrayList.add(new AbstractC7787n.h(Integer.valueOf(C4924a.m10431J(vocabularySearchQuery.f22129c)), null, ViewKeys.SearchTerm.ordinal(), 2));
                    arrayList.add(new AbstractC7787n.m(R.string.lingq_tags));
                    arrayList.add(new AbstractC7787n.h(null, C6752c.m13430X(vocabularySearchQuery.f22133g, ",", null, null, null, 62), ViewKeys.Tags.ordinal(), 1));
                    arrayList.add(new AbstractC7787n.m(R.string.lingq_course));
                    arrayList.add(new AbstractC7787n.h(null, vocabularySearchQuery.f22135i.f38012a, ViewKeys.Course.ordinal(), 1));
                    arrayList.add(new AbstractC7787n.m(R.string.lingq_lesson));
                    arrayList.add(new AbstractC7787n.h(null, vocabularySearchQuery.f22136j.f38012a, ViewKeys.Lesson.ordinal(), 1));
                    vocabularyFilterViewModel.f26490f.setValue(arrayList);
                }
                return C9072e.f47360a;
            }
        }

        public C40671(InterfaceC9968c<? super C40671> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return VocabularyFilterViewModel.this.new C40671(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40671) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26492e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                VocabularyFilterViewModel vocabularyFilterViewModel = VocabularyFilterViewModel.this;
                InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = vocabularyFilterViewModel.f26488d.mo9685i();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(vocabularyFilterViewModel, null);
                this.f26492e = 1;
                if (C0062b.m369m0(interfaceC7116cMo9685i, anonymousClass1, this) == coroutineSingletons) {
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

    public VocabularyFilterViewModel(InterfaceC5182d interfaceC5182d, InterfaceC0113j interfaceC0113j) {
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        this.f26488d = interfaceC5182d;
        this.f26489e = interfaceC0113j;
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f26490f = stateFlowImplM14379a;
        this.f26491g = C0062b.m353h2(stateFlowImplM14379a, C8573r0.m16767w0(this), C6715l.f37936a, emptyList);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C40671(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f26489e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26489e.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f26489e.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26489e.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f26489e.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26489e.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f26489e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26489e.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f26489e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26489e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f26489e.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f26489e.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f26489e.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f26489e.mo509w0();
    }
}
