package com.lingq.p055ui.home.course;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryItemType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p181ii.C6332a;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getCourseCounter$1", m19206f = "CourseViewModel.kt", m19207l = {389}, m19208m = "invokeSuspend")
final class CourseViewModel$getCourseCounter$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24043e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseViewModel f24044f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6332a f24045g;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$getCourseCounter$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getCourseCounter$1$1", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36701 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24046e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseViewModel f24047f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36701(CourseViewModel courseViewModel, InterfaceC9968c<? super C36701> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24047f = courseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36701 c36701 = new C36701(this.f24047f, interfaceC9968c);
            c36701.f24046e = obj;
            return c36701;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36701) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LibraryItemCounter libraryItemCounter = (LibraryItemCounter) C6752c.m13425S((List) this.f24046e);
            if (libraryItemCounter != null) {
                this.f24047f.f23936S.setValue(libraryItemCounter);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$getCourseCounter$1(CourseViewModel courseViewModel, C6332a c6332a, InterfaceC9968c<? super CourseViewModel$getCourseCounter$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24044f = courseViewModel;
        this.f24045g = c6332a;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$getCourseCounter$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$getCourseCounter$1(this.f24044f, this.f24045g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24043e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CourseViewModel courseViewModel = this.f24044f;
            InterfaceC7116c<List<LibraryItemCounter>> interfaceC7116cMo6075u = courseViewModel.f23951f.mo6075u(C9000b.m17251q(new Pair(new Integer(this.f24045g.f36595a), LibraryItemType.Collection.getValue())));
            C36701 c36701 = new C36701(courseViewModel, null);
            this.f24043e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6075u, c36701, this) == coroutineSingletons) {
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
