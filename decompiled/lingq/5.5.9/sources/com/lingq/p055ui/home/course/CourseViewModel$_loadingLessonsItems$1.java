package com.lingq.p055ui.home.course;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.domain.Resource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/home/library/CollectionsAdapter$a$k;", "Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$_loadingLessonsItems$1", m19206f = "CourseViewModel.kt", m19207l = {167}, m19208m = "invokeSuspend")
final class CourseViewModel$_loadingLessonsItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends CollectionsAdapter.AbstractC3739a.k>>, Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24003e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f24004f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Resource.Status f24005g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CourseViewModel f24006h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$_loadingLessonsItems$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$_loadingLessonsItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f24006h = courseViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends CollectionsAdapter.AbstractC3739a.k>> interfaceC7117d, Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        CourseViewModel$_loadingLessonsItems$1 courseViewModel$_loadingLessonsItems$1 = new CourseViewModel$_loadingLessonsItems$1(this.f24006h, interfaceC9968c);
        courseViewModel$_loadingLessonsItems$1.f24004f = interfaceC7117d;
        courseViewModel$_loadingLessonsItems$1.f24005g = status;
        return courseViewModel$_loadingLessonsItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ?? arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24003e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f24004f;
            if (this.f24005g == Resource.Status.LOADING) {
                this.f24006h.f23937T.setValue(Boolean.FALSE);
                arrayList = new ArrayList(3);
                for (int i11 = 0; i11 < 3; i11++) {
                    arrayList.add(CollectionsAdapter.AbstractC3739a.k.f24502a);
                }
            } else {
                arrayList = EmptyList.f38032a;
            }
            this.f24004f = null;
            this.f24003e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
