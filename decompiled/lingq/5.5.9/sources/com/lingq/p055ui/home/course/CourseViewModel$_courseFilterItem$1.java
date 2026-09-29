package com.lingq.p055ui.home.course;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.uimodel.library.Sort;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/ui/home/library/CollectionsAdapter$a$b;", "Lcom/lingq/shared/uimodel/library/Sort;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$_courseFilterItem$1", m19206f = "CourseViewModel.kt", m19207l = {BuildConfig.SDK_TRUNCATE_LENGTH}, m19208m = "invokeSuspend")
final class CourseViewModel$_courseFilterItem$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super CollectionsAdapter.AbstractC3739a.b>, Sort, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23983e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f23984f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Sort f23985g;

    public CourseViewModel$_courseFilterItem$1(InterfaceC9968c<? super CourseViewModel$_courseFilterItem$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super CollectionsAdapter.AbstractC3739a.b> interfaceC7117d, Sort sort, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        CourseViewModel$_courseFilterItem$1 courseViewModel$_courseFilterItem$1 = new CourseViewModel$_courseFilterItem$1(interfaceC9968c);
        courseViewModel$_courseFilterItem$1.f23984f = interfaceC7117d;
        courseViewModel$_courseFilterItem$1.f23985g = sort;
        return courseViewModel$_courseFilterItem$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23983e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f23984f;
            CollectionsAdapter.AbstractC3739a.b bVar = new CollectionsAdapter.AbstractC3739a.b(this.f23985g);
            this.f23984f = null;
            this.f23983e = 1;
            if (interfaceC7117d.mo1339r(bVar, this) == coroutineSingletons) {
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
