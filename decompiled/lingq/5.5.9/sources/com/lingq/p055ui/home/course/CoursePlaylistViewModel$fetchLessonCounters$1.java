package com.lingq.p055ui.home.course;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$fetchLessonCounters$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {347}, m19208m = "invokeSuspend")
final class CoursePlaylistViewModel$fetchLessonCounters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23881e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistViewModel f23882f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<Integer> f23883g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistViewModel$fetchLessonCounters$1(CoursePlaylistViewModel coursePlaylistViewModel, List<Integer> list, InterfaceC9968c<? super CoursePlaylistViewModel$fetchLessonCounters$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23882f = coursePlaylistViewModel;
        this.f23883g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistViewModel$fetchLessonCounters$1(this.f23882f, this.f23883g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistViewModel$fetchLessonCounters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23881e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = this.f23882f;
                InterfaceC2014g interfaceC2014g = coursePlaylistViewModel.f23843e;
                String strMo498E1 = coursePlaylistViewModel.mo498E1();
                List<Integer> list = this.f23883g;
                this.f23881e = 1;
                if (interfaceC2014g.mo6061g(strMo498E1, list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
