package com.lingq.p055ui.info;

import ae.C0062b;
import androidx.view.C1038i0;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import kh.C6678e;
import kh.C6683j;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$7", m19206f = "LessonInfoFragment.kt", m19207l = {219}, m19208m = "invokeSuspend")
public final class LessonInfoFragment$onViewCreated$7$7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26891e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoFragment f26892f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$7$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/info/d;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$7$1", m19206f = "LessonInfoFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41441 extends SuspendLambda implements InterfaceC2056p<AbstractC4161d, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26893e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoFragment f26894f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41441(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super C41441> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26894f = lessonInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41441 c41441 = new C41441(this.f26894f, interfaceC9968c);
            c41441.f26893e = obj;
            return c41441;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC4161d abstractC4161d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41441) mo1336a(abstractC4161d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC4161d abstractC4161d = (AbstractC4161d) this.f26893e;
            boolean z10 = abstractC4161d instanceof AbstractC4161d.b;
            String str3 = "";
            LessonInfoFragment lessonInfoFragment = this.f26894f;
            if (z10) {
                LessonInfo lessonInfo = ((AbstractC4161d.b) abstractC4161d).f27049a;
                if (C8573r0.m16725g0(lessonInfoFragment).m3988i().f6834h == R.id.nav_graph_home) {
                    LessonMediaSource lessonMediaSource = lessonInfo.f21960K;
                    C1038i0 c1038i0 = lessonInfoFragment.f26840R0;
                    int i10 = lessonInfo.f21964a;
                    if (lessonMediaSource == null || !C5207g.m11106a(lessonInfo.f21969f, "external")) {
                        HomeViewModel homeViewModel = (HomeViewModel) c1038i0.getValue();
                        String str4 = lessonInfo.f21972i;
                        homeViewModel.m9776l2(i10, lessonInfo.f21971h, str4 != null ? str4 : "", LessonPath.LessonInfo.f22161a);
                    } else {
                        HomeViewModel homeViewModel2 = (HomeViewModel) c1038i0.getValue();
                        LessonMediaSource lessonMediaSource2 = lessonInfo.f21960K;
                        if (lessonMediaSource2 == null || (str = lessonMediaSource2.f22000b) == null) {
                            str = "";
                        }
                        if (lessonMediaSource2 != null && (str2 = lessonMediaSource2.f22001c) != null) {
                            str3 = str2;
                        }
                        homeViewModel2.m9777m2(i10, LessonPath.LessonInfo.f22161a, str, str3);
                    }
                } else {
                    int i11 = lessonInfo.f21964a;
                    String str5 = lessonInfo.f21972i;
                    C4924a.m10447Z(C8573r0.m16725g0(lessonInfoFragment), C0062b.m279J(i11, lessonInfo.f21971h, str5 != null ? str5 : "", LessonPath.LessonInfo.f22161a, 24));
                }
            } else if (abstractC4161d instanceof AbstractC4161d.c) {
                AbstractC4161d.c cVar = (AbstractC4161d.c) abstractC4161d;
                LessonInfo lessonInfo2 = cVar.f27050a;
                int i12 = lessonInfo2.f21964a;
                String str6 = lessonInfo2.f21958I;
                C4924a.m10447Z(C8573r0.m16725g0(lessonInfoFragment), C8573r0.m16663B(i12, str6 != null ? str6 : "", false, cVar.f27051b, 4));
            } else if (abstractC4161d instanceof AbstractC4161d.a) {
                C4924a.m10447Z(C8573r0.m16725g0(lessonInfoFragment), new C6678e(((AbstractC4161d.a) abstractC4161d).f27048a, LessonPath.LessonInfo.f22161a));
            } else if (abstractC4161d instanceof AbstractC4161d.d) {
                String value = LibraryShelfType.SourceSearch.getValue();
                LibraryContentType libraryContentType = LibraryContentType.Lessons;
                String value2 = libraryContentType.getValue();
                Boolean bool = Boolean.TRUE;
                LibraryShelf libraryShelf = new LibraryShelf(false, C9000b.m17252r(new LibraryTab(null, value2, "Lessons", bool, new Integer(-1), "/search/lessons", 1, null), new LibraryTab(null, LibraryContentType.Courses.getValue(), "Courses", Boolean.FALSE, new Integer(-1), "/search/courses", 1, null)), value, 0, null, 0, 57, null);
                LibraryTab libraryTab = new LibraryTab(null, libraryContentType.getValue(), "Lessons", bool, new Integer(-1), "/search/lessons", 1, null);
                String strM3600t = lessonInfoFragment.m3600t(R.string.search_search);
                String str7 = ((AbstractC4161d.d) abstractC4161d).f27052a;
                C5207g.m11110e(strM3600t, "getString(R.string.search_search)");
                C5207g.m11111f(str7, "query");
                C4924a.m10447Z(C8573r0.m16725g0(lessonInfoFragment), new C6683j(libraryShelf, strM3600t, libraryTab, str7));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoFragment$onViewCreated$7$7(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super LessonInfoFragment$onViewCreated$7$7> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26892f = lessonInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoFragment$onViewCreated$7$7(this.f26892f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoFragment$onViewCreated$7$7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26891e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
            LessonInfoFragment lessonInfoFragment = this.f26892f;
            LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment.m10099x0();
            C41441 c41441 = new C41441(lessonInfoFragment, null);
            this.f26891e = 1;
            if (C0062b.m369m0(lessonInfoViewModelM10099x0.f26935W, c41441, this) == coroutineSingletons) {
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
