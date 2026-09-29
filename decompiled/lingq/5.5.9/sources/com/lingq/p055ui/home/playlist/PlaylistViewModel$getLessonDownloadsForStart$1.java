package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getLessonDownloadsForStart$1", m19206f = "PlaylistViewModel.kt", m19207l = {758}, m19208m = "invokeSuspend")
public final class PlaylistViewModel$getLessonDownloadsForStart$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public StateFlowImpl f25752e;

    /* JADX INFO: renamed from: f */
    public int f25753f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PlaylistViewModel f25754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getLessonDownloadsForStart$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$getLessonDownloadsForStart$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25754g = playlistViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$getLessonDownloadsForStart$1(this.f25754g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$getLessonDownloadsForStart$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        StateFlowImpl stateFlowImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25753f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistViewModel playlistViewModel = this.f25754g;
            StateFlowImpl stateFlowImpl2 = playlistViewModel.f25593T;
            String strMo498E1 = playlistViewModel.mo498E1();
            this.f25752e = stateFlowImpl2;
            this.f25753f = 1;
            obj = playlistViewModel.f25603d.mo6107b(strMo498E1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            stateFlowImpl = stateFlowImpl2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateFlowImpl = this.f25752e;
            C7499b.m14977z0(obj);
        }
        stateFlowImpl.setValue(obj);
        return C9072e.f47360a;
    }
}
