package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import java.util.List;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistLessons$1", m19206f = "PlaylistViewModel.kt", m19207l = {570}, m19208m = "invokeSuspend")
final class PlaylistViewModel$getPlaylistLessons$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25776e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25777f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25778g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25779h;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistLessons$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/c;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistLessons$1$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39451 extends SuspendLambda implements InterfaceC2056p<List<? extends C6697c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25780e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistViewModel f25781f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39451(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super C39451> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25781f = playlistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39451 c39451 = new C39451(this.f25781f, interfaceC9968c);
            c39451.f25780e = obj;
            return c39451;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6697c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39451) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Resource.Status status;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25780e;
            PlaylistViewModel playlistViewModel = this.f25781f;
            if (list != null) {
                playlistViewModel.f25604d0.setValue(list);
                playlistViewModel.f25608f0.mo14371k(C9072e.f47360a);
            }
            StateFlowImpl stateFlowImpl = playlistViewModel.f25629u0;
            if (list == null) {
                status = Resource.Status.LOADING;
            } else {
                status = list.isEmpty() ? Resource.Status.EMPTY : Resource.Status.SUCCESS;
            }
            stateFlowImpl.setValue(status);
            boolean z10 = false;
            if (playlistViewModel.f25629u0.getValue() != Resource.Status.LOADING) {
                if ((list != null && list.isEmpty()) && ((List) playlistViewModel.f25601b0.getValue()).isEmpty()) {
                    z10 = true;
                }
            }
            playlistViewModel.f25623o0.setValue(Boolean.valueOf(z10));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getPlaylistLessons$1(int i10, PlaylistViewModel playlistViewModel, String str, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25777f = playlistViewModel;
        this.f25778g = i10;
        this.f25779h = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$getPlaylistLessons$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$getPlaylistLessons$1(this.f25778g, this.f25777f, this.f25779h, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25776e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistViewModel playlistViewModel = this.f25777f;
            InterfaceC7116c interfaceC7116cMo6114i = playlistViewModel.f25603d.mo6114i(playlistViewModel.mo498E1(), this.f25779h);
            C39451 c39451 = new C39451(playlistViewModel, null);
            this.f25776e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6114i, c39451, this) == coroutineSingletons) {
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
