package com.lingq.p055ui.home.course;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/ui/home/library/CollectionsAdapter$a$c;", "Lcom/lingq/ui/home/library/CollectionsAdapter$c;", "info", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$_courseHeaderItem$1", m19206f = "CourseViewModel.kt", m19207l = {117}, m19208m = "invokeSuspend")
final class CourseViewModel$_courseHeaderItem$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super CollectionsAdapter.AbstractC3739a.c>, CollectionsAdapter.C3741c, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23986e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f23987f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ CollectionsAdapter.C3741c f23988g;

    public CourseViewModel$_courseHeaderItem$1(InterfaceC9968c<? super CourseViewModel$_courseHeaderItem$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super CollectionsAdapter.AbstractC3739a.c> interfaceC7117d, CollectionsAdapter.C3741c c3741c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        CourseViewModel$_courseHeaderItem$1 courseViewModel$_courseHeaderItem$1 = new CourseViewModel$_courseHeaderItem$1(interfaceC9968c);
        courseViewModel$_courseHeaderItem$1.f23987f = interfaceC7117d;
        courseViewModel$_courseHeaderItem$1.f23988g = c3741c;
        return courseViewModel$_courseHeaderItem$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23986e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f23987f;
            CollectionsAdapter.C3741c c3741c = this.f23988g;
            CollectionsAdapter.AbstractC3739a.c cVar = new CollectionsAdapter.AbstractC3739a.c(c3741c.f24522a, c3741c.f24523b);
            this.f23987f = null;
            this.f23986e = 1;
            if (interfaceC7117d.mo1339r(cVar, this) == coroutineSingletons) {
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
