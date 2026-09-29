package com.lingq.p055ui.home.course;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$getLessonDownloadsForStart$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {303}, m19208m = "invokeSuspend")
public final class CoursePlaylistViewModel$getLessonDownloadsForStart$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public StateFlowImpl f23902e;

    /* JADX INFO: renamed from: f */
    public int f23903f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CoursePlaylistViewModel f23904g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23905h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistViewModel$getLessonDownloadsForStart$1(CoursePlaylistViewModel coursePlaylistViewModel, String str, InterfaceC9968c<? super CoursePlaylistViewModel$getLessonDownloadsForStart$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23904g = coursePlaylistViewModel;
        this.f23905h = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistViewModel$getLessonDownloadsForStart$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistViewModel$getLessonDownloadsForStart$1(this.f23904g, this.f23905h, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        StateFlowImpl stateFlowImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23903f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CoursePlaylistViewModel coursePlaylistViewModel = this.f23904g;
            StateFlowImpl stateFlowImpl2 = coursePlaylistViewModel.f23825N;
            this.f23902e = stateFlowImpl2;
            this.f23903f = 1;
            obj = coursePlaylistViewModel.f23841d.mo6107b(this.f23905h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            stateFlowImpl = stateFlowImpl2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateFlowImpl = this.f23902e;
            C7499b.m14977z0(obj);
        }
        stateFlowImpl.setValue(obj);
        return C9072e.f47360a;
    }
}
