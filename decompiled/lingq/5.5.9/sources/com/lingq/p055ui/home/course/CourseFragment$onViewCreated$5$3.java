package com.lingq.p055ui.home.course;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import androidx.view.C1038i0;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import kh.C6682i;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$3", m19206f = "CourseFragment.kt", m19207l = {450}, m19208m = "invokeSuspend")
public final class CourseFragment$onViewCreated$5$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23716e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseFragment f23717f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/course/b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$3$1", m19206f = "CourseFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36341 extends SuspendLambda implements InterfaceC2056p<AbstractC3688b, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23718e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseFragment f23719f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36341(CourseFragment courseFragment, InterfaceC9968c<? super C36341> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23719f = courseFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36341 c36341 = new C36341(this.f23719f, interfaceC9968c);
            c36341.f23718e = obj;
            return c36341;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC3688b abstractC3688b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36341) mo1336a(abstractC3688b, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC3688b abstractC3688b = (AbstractC3688b) this.f23718e;
            boolean z10 = abstractC3688b instanceof AbstractC3688b.c;
            String str3 = "";
            CourseFragment courseFragment = this.f23719f;
            if (z10) {
                C6332a c6332aMo9901a = abstractC3688b.mo9901a();
                AbstractC3688b.c cVar = (AbstractC3688b.c) abstractC3688b;
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                courseFragment.getClass();
                LessonMediaSource lessonMediaSource = c6332aMo9901a.f36612r;
                C1038i0 c1038i0 = courseFragment.f23673C0;
                int i10 = c6332aMo9901a.f36595a;
                if (lessonMediaSource != null && C5207g.m11106a(c6332aMo9901a.f36601g, "external")) {
                    HomeViewModel homeViewModel = (HomeViewModel) c1038i0.getValue();
                    LessonMediaSource lessonMediaSource2 = c6332aMo9901a.f36612r;
                    if (lessonMediaSource2 == null || (str = lessonMediaSource2.f22000b) == null) {
                        str = "";
                    }
                    if (lessonMediaSource2 != null && (str2 = lessonMediaSource2.f22001c) != null) {
                        str3 = str2;
                    }
                    LessonPath lessonPath = courseFragment.m9856o0().f49750b;
                    if (lessonPath == null) {
                        lessonPath = LessonPath.Unknown.f22167a;
                    }
                    homeViewModel.m9777m2(i10, lessonPath, str, str3);
                } else if (C5207g.m11106a(c6332aMo9901a.f36589P, Boolean.TRUE) || cVar.f24153d) {
                    int i11 = C8573r0.m16725g0(courseFragment).m3988i().f6834h;
                    String str4 = c6332aMo9901a.f36608n;
                    Integer num = c6332aMo9901a.f36607m;
                    if (i11 == R.id.nav_graph_home) {
                        HomeViewModel homeViewModel2 = (HomeViewModel) c1038i0.getValue();
                        int iIntValue = num != null ? num.intValue() : 0;
                        str3 = str4 != null ? str4 : "";
                        LessonPath lessonPath2 = courseFragment.m9856o0().f49750b;
                        if (lessonPath2 == null) {
                            lessonPath2 = LessonPath.Unknown.f22167a;
                        }
                        homeViewModel2.m9776l2(i10, iIntValue, str3, lessonPath2);
                    } else {
                        C4924a.m10447Z(C8573r0.m16725g0(courseFragment), C0062b.m279J(i10, num != null ? num.intValue() : 0, str4 != null ? str4 : "", courseFragment.m9856o0().f49750b, 24));
                    }
                } else {
                    int i12 = c6332aMo9901a.f36595a;
                    String str5 = c6332aMo9901a.f36599e;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = c6332aMo9901a.f36602h;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = c6332aMo9901a.f36581H;
                    String str10 = str9 == null ? "" : str9;
                    String str11 = c6332aMo9901a.f36600f;
                    String str12 = str11 == null ? "" : str11;
                    LessonInfoParent lessonInfoParent = LessonInfoParent.Course;
                    C5207g.m11111f(lessonInfoParent, "from");
                    C4924a.m10447Z(C8573r0.m16725g0(courseFragment), new C6682i(i12, str6, str8, str10, str12, lessonInfoParent));
                }
            } else if (abstractC3688b instanceof AbstractC3688b.a) {
                int i13 = abstractC3688b.mo9901a().f36595a;
                String str13 = abstractC3688b.mo9901a().f36597c;
                C4924a.m10447Z(C8573r0.m16725g0(courseFragment), C8573r0.m16663B(i13, str13 != null ? str13 : "", false, false, 8));
            } else if (abstractC3688b instanceof AbstractC3688b.d) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CourseFragment.f23670H0;
                CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
                int i14 = abstractC3688b.mo9901a().f36595a;
                C7499b.m14933c0(C8573r0.m16767w0(courseViewModelM9858q0), courseViewModelM9858q0.f23957i, courseViewModelM9858q0.f23955h, C0166e.m761g("updateSave ", i14), new CourseViewModel$updateSave$2(courseViewModelM9858q0, i14, ((AbstractC3688b.d) abstractC3688b).f24157d, null));
            } else if (abstractC3688b instanceof AbstractC3688b.b) {
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = CourseFragment.f23670H0;
                CourseViewModel courseViewModelM9858q1 = courseFragment.m9858q0();
                int i15 = abstractC3688b.mo9901a().f36595a;
                C7499b.m14933c0(C8573r0.m16767w0(courseViewModelM9858q1), courseViewModelM9858q1.f23957i, courseViewModelM9858q1.f23955h, C0166e.m761g("downloadLesson ", i15), new CourseViewModel$downloadLesson$1(courseViewModelM9858q1, i15, null));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseFragment$onViewCreated$5$3(CourseFragment courseFragment, InterfaceC9968c<? super CourseFragment$onViewCreated$5$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23717f = courseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseFragment$onViewCreated$5$3(this.f23717f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseFragment$onViewCreated$5$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23716e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
            CourseFragment courseFragment = this.f23717f;
            CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
            C36341 c36341 = new C36341(courseFragment, null);
            this.f23716e = 1;
            if (C0062b.m369m0(courseViewModelM9858q0.f23956h0, c36341, this) == coroutineSingletons) {
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
