package com.lingq.p055ui.home.course;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import p003a2.C0009a;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getCourseWithLessons$1", m19206f = "CourseViewModel.kt", m19207l = {301}, m19208m = "invokeSuspend")
final class CourseViewModel$getCourseWithLessons$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24048e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseViewModel f24049f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$getCourseWithLessons$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lii/a;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getCourseWithLessons$1$1", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36711 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends C6332a>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CourseViewModel f24050e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36711(CourseViewModel courseViewModel, InterfaceC9968c<? super C36711> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24050e = courseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C36711(this.f24050e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends C6332a>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36711) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24050e.f23946c0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$getCourseWithLessons$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lii/a;", "lessons", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getCourseWithLessons$1$2", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36722 extends SuspendLambda implements InterfaceC2056p<List<? extends C6332a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24051e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseViewModel f24052f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36722(CourseViewModel courseViewModel, InterfaceC9968c<? super C36722> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24052f = courseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36722 c36722 = new C36722(this.f24052f, interfaceC9968c);
            c36722.f24051e = obj;
            return c36722;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6332a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36722) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f24051e;
            CourseViewModel courseViewModel = this.f24052f;
            courseViewModel.f23945b0.setValue(list);
            if (!list.isEmpty()) {
                courseViewModel.f23946c0.setValue(Resource.Status.SUCCESS);
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((C6332a) it.next()).f36595a, arrayList);
                }
                C7828f.m15570d(C8573r0.m16767w0(courseViewModel), null, null, new CourseViewModel$getLessonCounters$1(courseViewModel, arrayList, null), 3);
                C7828f.m15570d(C8573r0.m16767w0(courseViewModel), courseViewModel.f23955h, null, new CourseViewModel$fetchLessonCounters$1(courseViewModel, arrayList, null), 2);
                C7828f.m15570d(C8573r0.m16767w0(courseViewModel), null, null, new CourseViewModel$getLessonDownloads$1(courseViewModel, null), 3);
                C7828f.m15570d(C8573r0.m16767w0(courseViewModel), null, null, new CourseViewModel$getLessonDataDownloads$1(courseViewModel, null), 3);
                C7828f.m15570d(C8573r0.m16767w0(courseViewModel), null, null, new CourseViewModel$isDownloaded$1(courseViewModel, null), 3);
                C7828f.m15570d(C8573r0.m16767w0(courseViewModel), null, null, new CourseViewModel$isDownloading$1(courseViewModel, null), 3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$getCourseWithLessons$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$getCourseWithLessons$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24049f = courseViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$getCourseWithLessons$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$getCourseWithLessons$1(this.f24049f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24048e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CourseViewModel courseViewModel = this.f24049f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C36711(courseViewModel, null), courseViewModel.f23951f.mo6069o(courseViewModel.f23927J.f49749a));
            C36722 c36722 = new C36722(courseViewModel, null);
            this.f24048e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c36722, this) == coroutineSingletons) {
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
