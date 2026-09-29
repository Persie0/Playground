package com.lingq.p055ui.home.course;

import ci.InterfaceC2014g;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.library.Sort;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p181ii.C6332a;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$fetchCourseWithLessons$1", m19206f = "CourseViewModel.kt", m19207l = {323}, m19208m = "invokeSuspend")
public final class CourseViewModel$fetchCourseWithLessons$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24033e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseViewModel f24034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$fetchCourseWithLessons$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$fetchCourseWithLessons$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24034f = courseViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$fetchCourseWithLessons$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$fetchCourseWithLessons$1(this.f24034f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List<String> listM17252r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24033e;
        CourseViewModel courseViewModel = this.f24034f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2014g interfaceC2014g = courseViewModel.f23951f;
                StateFlowImpl stateFlowImpl = courseViewModel.f23938U;
                String strMo498E1 = courseViewModel.mo498E1();
                int i11 = courseViewModel.f23927J.f49749a;
                Sort sort = (Sort) courseViewModel.f23939V.getValue();
                C6332a c6332a = (C6332a) stateFlowImpl.getValue();
                if (!C5207g.m11106a(c6332a != null ? c6332a.f36601g : null, "private")) {
                    C6332a c6332a2 = (C6332a) stateFlowImpl.getValue();
                    listM17252r = C5207g.m11106a(c6332a2 != null ? c6332a2.f36601g : null, "shared") ? EmptyList.f38032a : C9000b.m17252r("netflix", "youtube");
                }
                this.f24033e = 1;
                obj = interfaceC2014g.mo6071q(strMo498E1, i11, sort, listM17252r, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            if (((Number) obj).intValue() == 0) {
                courseViewModel.f23946c0.setValue(Resource.Status.SUCCESS);
                if (((List) courseViewModel.f23945b0.getValue()).isEmpty()) {
                    courseViewModel.f23937T.setValue(Boolean.TRUE);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
