package com.lingq.p055ui.home.course;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "Lki/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$showPlayer$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {125}, m19208m = "invokeSuspend")
final class CoursePlaylistViewModel$showPlayer$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Boolean>, List<? extends C6697c>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23922e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f23923f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f23924g;

    public CoursePlaylistViewModel$showPlayer$1(InterfaceC9968c<? super CoursePlaylistViewModel$showPlayer$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Boolean> interfaceC7117d, List<? extends C6697c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        CoursePlaylistViewModel$showPlayer$1 coursePlaylistViewModel$showPlayer$1 = new CoursePlaylistViewModel$showPlayer$1(interfaceC9968c);
        coursePlaylistViewModel$showPlayer$1.f23923f = interfaceC7117d;
        coursePlaylistViewModel$showPlayer$1.f23924g = list;
        return coursePlaylistViewModel$showPlayer$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23922e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f23923f;
            Boolean boolValueOf = Boolean.valueOf(!this.f23924g.isEmpty());
            this.f23923f = null;
            this.f23922e = 1;
            if (interfaceC7117d.mo1339r(boolValueOf, this) == coroutineSingletons) {
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
