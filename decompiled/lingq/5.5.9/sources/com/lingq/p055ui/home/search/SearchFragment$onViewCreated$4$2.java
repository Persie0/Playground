package com.lingq.p055ui.home.search;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p048cj.C2030d;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchFragment$onViewCreated$4$2", m19206f = "SearchFragment.kt", m19207l = {198}, m19208m = "invokeSuspend")
public final class SearchFragment$onViewCreated$4$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25981e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SearchFragment f25982f;

    /* JADX INFO: renamed from: com.lingq.ui.home.search.SearchFragment$onViewCreated$4$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/search/b;", "navigation", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchFragment$onViewCreated$4$2$1", m19206f = "SearchFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39711 extends SuspendLambda implements InterfaceC2056p<AbstractC3986b, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25983e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SearchFragment f25984f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39711(SearchFragment searchFragment, InterfaceC9968c<? super C39711> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25984f = searchFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39711 c39711 = new C39711(this.f25984f, interfaceC9968c);
            c39711.f25983e = obj;
            return c39711;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC3986b abstractC3986b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39711) mo1336a(abstractC3986b, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC3986b abstractC3986b = (AbstractC3986b) this.f25983e;
            boolean z10 = abstractC3986b instanceof AbstractC3986b.c;
            SearchFragment searchFragment = this.f25984f;
            if (z10) {
                String value = LibraryShelfType.Search.getValue();
                LibraryContentType libraryContentType = LibraryContentType.Lessons;
                String value2 = libraryContentType.getValue();
                Boolean bool = Boolean.TRUE;
                LibraryShelf libraryShelf = new LibraryShelf(false, C9000b.m17252r(new LibraryTab(null, value2, "Lessons", bool, new Integer(-1), "/search/lessons", 1, null), new LibraryTab(null, LibraryContentType.Courses.getValue(), "Courses", Boolean.FALSE, new Integer(-1), "/search/courses", 1, null)), value, 0, null, 0, 57, null);
                LibraryTab libraryTab = new LibraryTab(null, libraryContentType.getValue(), "Lessons", bool, new Integer(-1), "/search/lessons", 1, null);
                String strM3600t = searchFragment.m3600t(R.string.search_search);
                String str = ((AbstractC3986b.c) abstractC3986b).f26073a;
                C5207g.m11110e(strM3600t, "getString(R.string.search_search)");
                C5207g.m11111f(str, "query");
                C4924a.m10447Z(C8573r0.m16725g0(searchFragment), new C2030d(libraryShelf, strM3600t, libraryTab, str));
            } else if (abstractC3986b instanceof AbstractC3986b.b) {
                String value3 = LibraryShelfType.Search.getValue();
                String value4 = LibraryContentType.Lessons.getValue();
                Boolean bool2 = Boolean.TRUE;
                LibraryContentType libraryContentType2 = LibraryContentType.Courses;
                LibraryShelf libraryShelf2 = new LibraryShelf(false, C9000b.m17252r(new LibraryTab(null, value4, "Lessons", bool2, new Integer(-1), "/search/lessons", 1, null), new LibraryTab(null, libraryContentType2.getValue(), "Courses", Boolean.FALSE, new Integer(-1), "/search/courses", 1, null)), value3, 0, null, 0, 57, null);
                LibraryTab libraryTab2 = new LibraryTab(null, libraryContentType2.getValue(), "Courses", bool2, new Integer(-1), "/search/courses", 1, null);
                String strM3600t2 = searchFragment.m3600t(R.string.search_search);
                String str2 = ((AbstractC3986b.b) abstractC3986b).f26072a;
                C5207g.m11110e(strM3600t2, "getString(R.string.search_search)");
                C5207g.m11111f(str2, "query");
                C4924a.m10447Z(C8573r0.m16725g0(searchFragment), new C2030d(libraryShelf2, strM3600t2, libraryTab2, str2));
            } else if (abstractC3986b instanceof AbstractC3986b.a) {
                String value5 = LibraryShelfType.Search.getValue();
                LibraryContentType libraryContentType3 = LibraryContentType.Lessons;
                String value6 = libraryContentType3.getValue();
                Boolean bool3 = Boolean.TRUE;
                LibraryShelf libraryShelf3 = new LibraryShelf(false, C9000b.m17252r(new LibraryTab(null, value6, "Lessons", bool3, new Integer(-1), "/search/lessons", 1, null), new LibraryTab(null, LibraryContentType.Courses.getValue(), "Courses", Boolean.FALSE, new Integer(-1), "/search/courses", 1, null)), value5, 0, null, 0, 57, null);
                LibraryTab libraryTab3 = new LibraryTab(null, libraryContentType3.getValue(), "Lessons", bool3, new Integer(-1), "/search/lessons", 1, null);
                String strM3600t3 = searchFragment.m3600t(R.string.search_search);
                String str3 = ((AbstractC3986b.a) abstractC3986b).f26071a;
                C5207g.m11110e(strM3600t3, "getString(R.string.search_search)");
                C5207g.m11111f(str3, "query");
                C4924a.m10447Z(C8573r0.m16725g0(searchFragment), new C2030d(libraryShelf3, strM3600t3, libraryTab3, str3));
            } else if (abstractC3986b instanceof AbstractC3986b.d) {
                AbstractC3986b.d dVar = (AbstractC3986b.d) abstractC3986b;
                LibraryShelf libraryShelf4 = dVar.f26075b;
                LibraryTab libraryTab4 = (LibraryTab) C6752c.m13423Q(libraryShelf4.f22049b);
                String strM3600t4 = searchFragment.m3600t(R.string.search_search);
                String str4 = dVar.f26074a;
                C5207g.m11110e(strM3600t4, "getString(R.string.search_search)");
                C5207g.m11111f(libraryShelf4, "shelf");
                C5207g.m11111f(str4, "query");
                C4924a.m10447Z(C8573r0.m16725g0(searchFragment), new C2030d(libraryShelf4, strM3600t4, libraryTab4, str4));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$onViewCreated$4$2(SearchFragment searchFragment, InterfaceC9968c<? super SearchFragment$onViewCreated$4$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25982f = searchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SearchFragment$onViewCreated$4$2(this.f25982f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SearchFragment$onViewCreated$4$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25981e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = SearchFragment.f25954E0;
            SearchFragment searchFragment = this.f25982f;
            SearchViewModel searchViewModelM10012p0 = searchFragment.m10012p0();
            C39711 c39711 = new C39711(searchFragment, null);
            this.f25981e = 1;
            if (C0062b.m369m0(searchViewModelM10012p0.f26003Q, c39711, this) == coroutineSingletons) {
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
