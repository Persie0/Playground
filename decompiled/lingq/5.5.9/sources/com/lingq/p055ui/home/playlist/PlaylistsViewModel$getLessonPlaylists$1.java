package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsViewModel$getLessonPlaylists$1", m19206f = "PlaylistsViewModel.kt", m19207l = {69}, m19208m = "invokeSuspend")
final class PlaylistsViewModel$getLessonPlaylists$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25919e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistsViewModel f25920f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsViewModel$getLessonPlaylists$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsViewModel$getLessonPlaylists$1$1", m19206f = "PlaylistsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39581 extends SuspendLambda implements InterfaceC2056p<List<? extends UserPlaylist>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25921e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistsViewModel f25922f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39581(PlaylistsViewModel playlistsViewModel, InterfaceC9968c<? super C39581> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25922f = playlistsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39581 c39581 = new C39581(this.f25922f, interfaceC9968c);
            c39581.f25921e = obj;
            return c39581;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserPlaylist> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39581) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f25922f.f25900k.setValue((List) this.f25921e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsViewModel$getLessonPlaylists$1(PlaylistsViewModel playlistsViewModel, InterfaceC9968c<? super PlaylistsViewModel$getLessonPlaylists$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25920f = playlistsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistsViewModel$getLessonPlaylists$1(this.f25920f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistsViewModel$getLessonPlaylists$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25919e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistsViewModel playlistsViewModel = this.f25920f;
            InterfaceC7116c<List<UserPlaylist>> interfaceC7116cMo6111f = playlistsViewModel.f25893d.mo6111f(playlistsViewModel.mo498E1(), playlistsViewModel.f25897h.f9087a);
            C39581 c39581 = new C39581(playlistsViewModel, null);
            this.f25919e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6111f, c39581, this) == coroutineSingletons) {
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
