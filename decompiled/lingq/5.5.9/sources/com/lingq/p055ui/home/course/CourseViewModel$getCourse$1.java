package com.lingq.p055ui.home.course;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getCourse$1", m19206f = "CourseViewModel.kt", m19207l = {354}, m19208m = "invokeSuspend")
public final class CourseViewModel$getCourse$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24038e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseViewModel f24039f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$getCourse$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lii/a;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getCourse$1$1", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36681 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super C6332a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CourseViewModel f24040e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36681(CourseViewModel courseViewModel, InterfaceC9968c<? super C36681> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24040e = courseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C36681(this.f24040e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super C6332a> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36681) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24040e.f23948d0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$getCourse$1$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lii/a;", "course", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getCourse$1$2", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36692 extends SuspendLambda implements InterfaceC2056p<C6332a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24041e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseViewModel f24042f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36692(CourseViewModel courseViewModel, InterfaceC9968c<? super C36692> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24042f = courseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36692 c36692 = new C36692(this.f24042f, interfaceC9968c);
            c36692.f24041e = obj;
            return c36692;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C6332a c6332a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36692) mo1336a(c6332a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C6332a c6332a = (C6332a) this.f24041e;
            if (c6332a != null) {
                CourseViewModel courseViewModel = this.f24042f;
                courseViewModel.f23948d0.setValue(Resource.Status.SUCCESS);
                courseViewModel.f23938U.setValue(c6332a);
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(courseViewModel);
                StringBuilder sb2 = new StringBuilder("getCourseCounter ");
                int i10 = c6332a.f36595a;
                sb2.append(i10);
                C7499b.m14933c0(interfaceC7882zM16767w0, courseViewModel.f23957i, courseViewModel.f23955h, sb2.toString(), new CourseViewModel$getCourseCounter$1(courseViewModel, c6332a, null));
                C7828f.m15570d(C8573r0.m16767w0(courseViewModel), null, null, new CourseViewModel$fetchCourseCounters$1(courseViewModel, i10, null), 3);
                CourseViewModel.m9890l2(courseViewModel);
                courseViewModel.m9892n2();
                C7828f.m15570d(C8573r0.m16767w0(courseViewModel), null, null, new CourseViewModel$isAddedToContinueStudying$1(courseViewModel, null), 3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$getCourse$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$getCourse$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24039f = courseViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$getCourse$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$getCourse$1(this.f24039f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24038e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CourseViewModel courseViewModel = this.f24039f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C36681(courseViewModel, null), courseViewModel.f23951f.mo6072r(courseViewModel.f23927J.f49749a));
            C36692 c36692 = new C36692(courseViewModel, null);
            this.f24038e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c36692, this) == coroutineSingletons) {
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
