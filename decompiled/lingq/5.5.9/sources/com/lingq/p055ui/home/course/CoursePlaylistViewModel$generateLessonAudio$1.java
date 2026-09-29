package com.lingq.p055ui.home.course;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.player.PlayerContentController;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.download.DownloadItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$generateLessonAudio$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {406, 409}, m19208m = "invokeSuspend")
final class CoursePlaylistViewModel$generateLessonAudio$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23884e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistViewModel f23885f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistViewModel$generateLessonAudio$1(CoursePlaylistViewModel coursePlaylistViewModel, int i10, InterfaceC9968c<? super CoursePlaylistViewModel$generateLessonAudio$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23885f = coursePlaylistViewModel;
        this.f23886g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistViewModel$generateLessonAudio$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistViewModel$generateLessonAudio$1(this.f23885f, this.f23886g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23884e;
        CoursePlaylistViewModel coursePlaylistViewModel = this.f23885f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = coursePlaylistViewModel.mo508t1();
        this.f23884e = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo508t1, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileAccount profileAccount = (ProfileAccount) obj;
        if (coursePlaylistViewModel.mo502f0() || profileAccount.f17811k < 5) {
            Iterator it = ((Iterable) coursePlaylistViewModel.f23831T.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((PlayerContentController.PlayerContentItem) next).f17600a == this.f23886g));
            PlayerContentController.PlayerContentItem playerContentItem = (PlayerContentController.PlayerContentItem) next;
            if (playerContentItem != null) {
                DownloadItem downloadItem = new DownloadItem(playerContentItem.f17608i, playerContentItem.f17600a, playerContentItem.f17601b, playerContentItem.f17606g);
                this.f23884e = 2;
                if (coursePlaylistViewModel.mo9422x0(downloadItem, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            coursePlaylistViewModel.mo9771A(UpgradeReason.GENERATE_TTS);
        }
        return C9072e.f47360a;
    }
}
