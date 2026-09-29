package com.lingq.p055ui.home.course;

import ae.C0062b;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p537zi.C10507q;
import sl.C9072e;
import vi.C9735j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$2", m19206f = "CourseFragment.kt", m19207l = {381}, m19208m = "invokeSuspend")
public final class CourseFragment$onViewCreated$5$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23705e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseFragment f23706f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f23707g;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/course/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$2$1", m19206f = "CourseFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36331 extends SuspendLambda implements InterfaceC2056p<AbstractC3689c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23708e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseFragment f23709f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ View f23710g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36331(View view, CourseFragment courseFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23709f = courseFragment;
            this.f23710g = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36331 c36331 = new C36331(this.f23710g, this.f23709f, interfaceC9968c);
            c36331.f23708e = obj;
            return c36331;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC3689c abstractC3689c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36331) mo1336a(abstractC3689c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            final AbstractC3689c abstractC3689c = (AbstractC3689c) this.f23708e;
            boolean z10 = abstractC3689c instanceof AbstractC3689c.a;
            final CourseFragment courseFragment = this.f23709f;
            if (z10) {
                AbstractC3689c.a aVar = (AbstractC3689c.a) abstractC3689c;
                C4924a.m10447Z(C8573r0.m16725g0(courseFragment), C8573r0.m16663B(aVar.f24160b, aVar.f24161c, true, false, 8));
            } else if (abstractC3689c instanceof AbstractC3689c.c) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
                C7828f.m15570d(C8573r0.m16767w0(courseViewModelM9858q0), courseViewModelM9858q0.f23955h, null, new CourseViewModel$updateSave$1(courseViewModelM9858q0, null), 2);
            } else if (abstractC3689c instanceof AbstractC3689c.b) {
                AbstractC3689c.b bVar = (AbstractC3689c.b) abstractC3689c;
                boolean z11 = bVar.f24165d;
                boolean z12 = bVar.f24166e;
                boolean z13 = bVar.f24167f;
                View viewFindViewById = this.f23710g.findViewById(R.id.item_menu);
                C5207g.m11110e(viewFindViewById, "view.findViewById(R.id.item_menu)");
                new C9735j(z11, z12, z13, viewFindViewById, new InterfaceC2052l<CourseOverviewMenuItem, C9072e>() { // from class: com.lingq.ui.home.course.CourseFragment.onViewCreated.5.2.1.1

                    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$2$1$1$a */
                    public /* synthetic */ class a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f23713a;

                        static {
                            int[] iArr = new int[CourseOverviewMenuItem.values().length];
                            try {
                                iArr[CourseOverviewMenuItem.AddToPlaylist.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[CourseOverviewMenuItem.Like.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[CourseOverviewMenuItem.SaveAllLessons.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[CourseOverviewMenuItem.RemoveAllLessons.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[CourseOverviewMenuItem.PlayCourseAudio.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[CourseOverviewMenuItem.Report.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            f23713a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(CourseOverviewMenuItem courseOverviewMenuItem) {
                        CourseOverviewMenuItem courseOverviewMenuItem2 = courseOverviewMenuItem;
                        C5207g.m11111f(courseOverviewMenuItem2, "courseMenuItem");
                        int i10 = a.f23713a[courseOverviewMenuItem2.ordinal()];
                        final AbstractC3689c abstractC3689c2 = abstractC3689c;
                        String str = "";
                        final CourseFragment courseFragment2 = courseFragment;
                        switch (i10) {
                            case 1:
                                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CourseFragment.f23670H0;
                                CourseViewModel courseViewModelM9858q1 = courseFragment2.m9858q0();
                                C6332a c6332a = (C6332a) courseViewModelM9858q1.f23938U.getValue();
                                if (c6332a != null) {
                                    String str2 = c6332a.f36597c;
                                    if (str2 != null) {
                                        str = str2;
                                    }
                                    courseViewModelM9858q1.m9896r2(new AbstractC3689c.a(str, c6332a.f36595a, courseViewModelM9858q1.m9894p2()));
                                }
                                break;
                            case 2:
                                InterfaceC6727j<Object>[] interfaceC6727jArr3 = CourseFragment.f23670H0;
                                courseFragment2.m9858q0().m9899u2();
                                break;
                            case 3:
                                InterfaceC6727j<Object>[] interfaceC6727jArr4 = CourseFragment.f23670H0;
                                CourseViewModel courseViewModelM9858q2 = courseFragment2.m9858q0();
                                C7828f.m15570d(C8573r0.m16767w0(courseViewModelM9858q2), courseViewModelM9858q2.f23955h, null, new CourseViewModel$updateAllLessonsSave$1(courseViewModelM9858q2, true, null), 2);
                                break;
                            case 4:
                                InterfaceC6727j<Object>[] interfaceC6727jArr5 = CourseFragment.f23670H0;
                                CourseViewModel courseViewModelM9858q3 = courseFragment2.m9858q0();
                                C7828f.m15570d(C8573r0.m16767w0(courseViewModelM9858q3), courseViewModelM9858q3.f23955h, null, new CourseViewModel$updateAllLessonsSave$1(courseViewModelM9858q3, false, null), 2);
                                break;
                            case 5:
                                AbstractC3689c.b bVar2 = (AbstractC3689c.b) abstractC3689c2;
                                int i11 = bVar2.f24163b;
                                String str3 = bVar2.f24164c;
                                if (str3 == null) {
                                    str3 = "Course Playlist";
                                }
                                NavController navControllerM16725g0 = C8573r0.m16725g0(courseFragment2);
                                NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                                if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToCoursePlaylist) != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("courseId", i11);
                                    bundle.putString("courseTitle", str3);
                                    navControllerM16725g0.m3992m(R.id.actionToCoursePlaylist, bundle, null);
                                }
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                Context contextM3578a0 = courseFragment2.m3578a0();
                                String str4 = ((AbstractC3689c.b) abstractC3689c2).f24164c;
                                new C10507q(contextM3578a0, str4 != null ? str4 : "", new InterfaceC2056p<String, String, C9072e>() { // from class: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$2$1$1$reportMenu$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(String str5, String str6) {
                                        String str7 = str5;
                                        C5207g.m11111f(str7, "scope");
                                        InterfaceC6727j<Object>[] interfaceC6727jArr6 = CourseFragment.f23670H0;
                                        CourseFragment courseFragment3 = courseFragment2;
                                        courseFragment3.m9858q0().mo9834n(courseFragment3.m9858q0().mo498E1(), ((AbstractC3689c.b) abstractC3689c2).f24163b, str7, str6);
                                        return C9072e.f47360a;
                                    }
                                }).m19482a();
                                break;
                        }
                        return C9072e.f47360a;
                    }
                });
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseFragment$onViewCreated$5$2(View view, CourseFragment courseFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23706f = courseFragment;
        this.f23707g = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseFragment$onViewCreated$5$2(this.f23707g, this.f23706f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseFragment$onViewCreated$5$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23705e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
            CourseFragment courseFragment = this.f23706f;
            CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
            C36331 c36331 = new C36331(this.f23707g, courseFragment, null);
            this.f23705e = 1;
            if (C0062b.m369m0(courseViewModelM9858q0.f23952f0, c36331, this) == coroutineSingletons) {
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
