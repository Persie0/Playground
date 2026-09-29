package com.lingq.p055ui.home.course;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.PlayerContentController;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import no.C7828f;
import no.C7848l1;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$resetAndSetupTracks$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {231}, m19208m = "invokeSuspend")
public final class CoursePlaylistViewModel$resetAndSetupTracks$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public CoursePlaylistViewModel f23911e;

    /* JADX INFO: renamed from: f */
    public Iterator f23912f;

    /* JADX INFO: renamed from: g */
    public int f23913g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<PlayerContentController.PlayerContentItem> f23914h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CoursePlaylistViewModel f23915i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistViewModel$resetAndSetupTracks$1(CoursePlaylistViewModel coursePlaylistViewModel, List list, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23914h = list;
        this.f23915i = coursePlaylistViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistViewModel$resetAndSetupTracks$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistViewModel$resetAndSetupTracks$1(this.f23915i, this.f23914h, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Iterator it;
        CoursePlaylistViewModel coursePlaylistViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23913g;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            it = this.f23914h.iterator();
            coursePlaylistViewModel = this.f23915i;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f23912f;
            coursePlaylistViewModel = this.f23911e;
            C7499b.m14977z0(obj);
        }
        while (it.hasNext()) {
            PlayerContentController.PlayerContentItem playerContentItem = (PlayerContentController.PlayerContentItem) it.next();
            if ((!C7661i.m15250P2(playerContentItem.f17601b)) && !coursePlaylistViewModel.m9887o2(playerContentItem.f17600a)) {
                C7848l1 c7848l1M15570d = C7828f.m15570d(C8573r0.m16767w0(coursePlaylistViewModel), null, null, new CoursePlaylistViewModel$resetAndSetupTracks$1$1$1(coursePlaylistViewModel, playerContentItem, null), 3);
                this.f23911e = coursePlaylistViewModel;
                this.f23912f = it;
                this.f23913g = 1;
                if (c7848l1M15570d.mo15615E(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
    }
}
