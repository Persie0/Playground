package com.lingq.p055ui.home.course;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.domain.Resource;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/ui/home/library/CollectionsAdapter$a$d;", "Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$_loadingCourseItem$1", m19206f = "CourseViewModel.kt", m19207l = {179}, m19208m = "invokeSuspend")
final class CourseViewModel$_loadingCourseItem$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super CollectionsAdapter.AbstractC3739a.d>, Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23999e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f24000f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Resource.Status f24001g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CourseViewModel f24002h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$_loadingCourseItem$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$_loadingCourseItem$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f24002h = courseViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super CollectionsAdapter.AbstractC3739a.d> interfaceC7117d, Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        CourseViewModel$_loadingCourseItem$1 courseViewModel$_loadingCourseItem$1 = new CourseViewModel$_loadingCourseItem$1(this.f24002h, interfaceC9968c);
        courseViewModel$_loadingCourseItem$1.f24000f = interfaceC7117d;
        courseViewModel$_loadingCourseItem$1.f24001g = status;
        return courseViewModel$_loadingCourseItem$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CollectionsAdapter.AbstractC3739a.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23999e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f24000f;
            Resource.Status status = this.f24001g;
            Resource.Status status2 = Resource.Status.LOADING;
            if (status == status2) {
                CourseViewModel courseViewModel = this.f24002h;
                courseViewModel.f23937T.setValue(Boolean.FALSE);
                courseViewModel.f23946c0.setValue(status2);
                dVar = CollectionsAdapter.AbstractC3739a.d.f24487a;
            } else {
                dVar = null;
            }
            this.f24000f = null;
            this.f23999e = 1;
            if (interfaceC7117d.mo1339r(dVar, this) == coroutineSingletons) {
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
