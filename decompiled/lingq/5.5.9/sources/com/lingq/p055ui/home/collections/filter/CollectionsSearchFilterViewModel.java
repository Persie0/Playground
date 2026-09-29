package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.ContentType;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.Accent;
import com.lingq.shared.uimodel.library.CollectionsFilterUser;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
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
import p096ei.C5408a;
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
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CollectionsSearchFilterViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: d */
    public final InterfaceC5182d f23617d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f23618e;

    /* JADX INFO: renamed from: f */
    public final StateFlowImpl f23619f;

    /* JADX INFO: renamed from: g */
    public final C7135p f23620g;

    /* JADX INFO: renamed from: h */
    public final String f23621h;

    /* JADX INFO: renamed from: i */
    public final boolean f23622i;

    /* JADX INFO: renamed from: j */
    public final StateFlowImpl f23623j;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterViewModel$1", m19206f = "CollectionsSearchFilterViewModel.kt", m19207l = {43}, m19208m = "invokeSuspend")
    public static final class C36141 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23624e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/library/LibrarySearchQuery;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterViewModel$1$1", m19206f = "CollectionsSearchFilterViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends LibrarySearchQuery>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f23626e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CollectionsSearchFilterViewModel f23627f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsSearchFilterViewModel collectionsSearchFilterViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23627f = collectionsSearchFilterViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23627f, interfaceC9968c);
                anonymousClass1.f23626e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends LibrarySearchQuery> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                ContentType contentType;
                ArrayList arrayList;
                List<Accent> list;
                CollectionsFilterUser collectionsFilterUser;
                CollectionsFilterUser collectionsFilterUser2;
                CollectionsFilterUser collectionsFilterUser3;
                List<String> list2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Map map = (Map) this.f23626e;
                CollectionsSearchFilterViewModel collectionsSearchFilterViewModel = this.f23627f;
                collectionsSearchFilterViewModel.f23623j.setValue(map);
                StateFlowImpl stateFlowImpl = collectionsSearchFilterViewModel.f23623j;
                Map map2 = (Map) stateFlowImpl.getValue();
                String str = collectionsSearchFilterViewModel.f23621h;
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) map2.get(str);
                Pair<LearningLevel, LearningLevel> pairM9704a = librarySearchQuery != null ? librarySearchQuery.m9704a() : new Pair<>(LearningLevel.Beginner1, LearningLevel.Advanced2);
                ArrayList arrayList2 = new ArrayList();
                int iOrdinal = 0;
                boolean z10 = true;
                arrayList2.add(new AbstractC7787n.g(EmptyList.f38032a, C9000b.m17252r(Integer.valueOf(R.string.levels_beginner), Integer.valueOf(R.string.levels_intermediate), Integer.valueOf(R.string.levels_advanced)), pairM9704a.f38012a.ordinal(), pairM9704a.f38013b.ordinal(), ViewKeys.Levels.ordinal()));
                arrayList2.add(new AbstractC7787n.m(R.string.lingq_tags));
                LibrarySearchQuery librarySearchQuery2 = (LibrarySearchQuery) ((Map) stateFlowImpl.getValue()).get(str);
                arrayList2.add(new AbstractC7787n.e((librarySearchQuery2 == null || (list2 = librarySearchQuery2.f22031h) == null) ? "" : C6752c.m13430X(list2, ",", null, null, null, 62), Integer.valueOf(R.string.search_add_tags), null, ViewKeys.LessonTags.ordinal(), 4));
                arrayList2.add(new AbstractC7787n.m(R.string.search_provider_shared_by));
                LibrarySearchQuery librarySearchQuery3 = (LibrarySearchQuery) ((Map) stateFlowImpl.getValue()).get(str);
                String str2 = (librarySearchQuery3 == null || (collectionsFilterUser3 = librarySearchQuery3.f22034k) == null) ? null : collectionsFilterUser3.f21933b;
                LibrarySearchQuery librarySearchQuery4 = (LibrarySearchQuery) ((Map) stateFlowImpl.getValue()).get(str);
                String str3 = (librarySearchQuery4 == null || (collectionsFilterUser2 = librarySearchQuery4.f22034k) == null) ? null : collectionsFilterUser2.f21934c;
                LibrarySearchQuery librarySearchQuery5 = (LibrarySearchQuery) ((Map) stateFlowImpl.getValue()).get(str);
                arrayList2.add(new AbstractC7787n.i(str2, ViewKeys.ProviderSharedBy.ordinal(), str3, (librarySearchQuery5 == null || (collectionsFilterUser = librarySearchQuery5.f22034k) == null) ? null : collectionsFilterUser.f21935d));
                String strMo498E1 = collectionsSearchFilterViewModel.mo498E1();
                C5207g.m11111f(strMo498E1, "language");
                if (C7499b.m14921S(C5408a.m11569b(LanguageLearn.Arabic), C5408a.m11570c(LanguageLearnBeta.Farsi), C5408a.m11569b(LanguageLearn.Portuguese), C5408a.m11569b(LanguageLearn.Spanish), C5408a.m11569b(LanguageLearn.English)).contains(strMo498E1) && collectionsSearchFilterViewModel.f23622i) {
                    arrayList2.add(new AbstractC7787n.m(R.string.accent));
                    LibrarySearchQuery librarySearchQuery6 = (LibrarySearchQuery) ((Map) stateFlowImpl.getValue()).get(str);
                    if (librarySearchQuery6 == null || (list = librarySearchQuery6.f22035l) == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(Integer.valueOf(C4924a.m10463h0((Accent) it.next(), collectionsSearchFilterViewModel.mo498E1())));
                        }
                        arrayList = arrayList3;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z10 = false;
                    }
                    arrayList2.add(new AbstractC7787n.e(z10 ? "None" : null, null, arrayList, ViewKeys.Accent.ordinal(), 2));
                }
                arrayList2.add(new AbstractC7787n.m(R.string.search_content_type));
                ContentType[] contentTypeArrValues = ContentType.values();
                ArrayList arrayList4 = new ArrayList(contentTypeArrValues.length);
                for (ContentType contentType2 : contentTypeArrValues) {
                    arrayList4.add(Integer.valueOf(C4924a.m10430I(contentType2)));
                }
                LibrarySearchQuery librarySearchQuery7 = (LibrarySearchQuery) ((Map) stateFlowImpl.getValue()).get(str);
                if (librarySearchQuery7 != null && (contentType = librarySearchQuery7.f22032i) != null) {
                    iOrdinal = contentType.ordinal();
                }
                arrayList2.add(new AbstractC7787n.f(iOrdinal, ViewKeys.ContentTypes.ordinal(), arrayList4));
                collectionsSearchFilterViewModel.f23619f.setValue(arrayList2);
                return C9072e.f47360a;
            }
        }

        public C36141(InterfaceC9968c<? super C36141> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsSearchFilterViewModel.this.new C36141(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36141) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23624e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsSearchFilterViewModel collectionsSearchFilterViewModel = CollectionsSearchFilterViewModel.this;
                InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = collectionsSearchFilterViewModel.f23617d.mo9688l();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsSearchFilterViewModel, null);
                this.f23624e = 1;
                if (C0062b.m369m0(interfaceC7116cMo9688l, anonymousClass1, this) == coroutineSingletons) {
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

    public CollectionsSearchFilterViewModel(InterfaceC5182d interfaceC5182d, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f23617d = interfaceC5182d;
        this.f23618e = interfaceC0113j;
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f23619f = stateFlowImplM14379a;
        this.f23620g = C0062b.m353h2(stateFlowImplM14379a, C8573r0.m16767w0(this), C6715l.f37936a, emptyList);
        String str = (String) c1024c0.m3929b("collectionType");
        this.f23621h = str == null ? "" : str;
        Boolean bool = (Boolean) c1024c0.m3929b("canShowAccent");
        this.f23622i = bool != null ? bool.booleanValue() : true;
        this.f23623j = C7120g.m14379a(C6753d.m13459L0());
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36141(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f23618e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23618e.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f23618e.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23618e.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f23618e.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23618e.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f23618e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23618e.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f23618e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23618e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f23618e.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f23618e.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f23618e.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f23618e.mo509w0();
    }
}
