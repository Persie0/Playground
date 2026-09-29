package com.lingq.p055ui.home.course;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayingFrom;
import dm.C5207g;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$9", m19206f = "CourseFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class CourseFragment$onViewCreated$5$9 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CourseFragment f23750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseFragment$onViewCreated$5$9(CourseFragment courseFragment, InterfaceC9968c<? super CourseFragment$onViewCreated$5$9> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23750e = courseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseFragment$onViewCreated$5$9(this.f23750e, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseFragment$onViewCreated$5$9) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        CourseFragment courseFragment = this.f23750e;
        PlayerController playerController = courseFragment.f23677G0;
        if (playerController == null) {
            C5207g.m11117l("playerController");
            throw null;
        }
        if (playerController.m9414o0() == PlayingFrom.Lesson) {
            PlayerController playerController2 = courseFragment.f23677G0;
            if (playerController2 == null) {
                C5207g.m11117l("playerController");
                throw null;
            }
            playerController2.pause();
        }
        return C9072e.f47360a;
    }
}
