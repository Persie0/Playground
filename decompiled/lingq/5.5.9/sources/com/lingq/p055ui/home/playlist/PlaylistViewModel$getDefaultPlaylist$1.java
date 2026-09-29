package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import ci.InterfaceC2019l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getDefaultPlaylist$1", m19206f = "PlaylistViewModel.kt", m19207l = {735, 735}, m19208m = "invokeSuspend")
final class PlaylistViewModel$getDefaultPlaylist$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25734e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25735f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getDefaultPlaylist$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "userPlaylist", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getDefaultPlaylist$1$1", m19206f = "PlaylistViewModel.kt", m19207l = {737}, m19208m = "invokeSuspend")
    public static final class C39381 extends SuspendLambda implements InterfaceC2056p<UserPlaylist, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25736e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f25737f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ PlaylistViewModel f25738g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39381(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super C39381> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25738g = playlistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39381 c39381 = new C39381(this.f25738g, interfaceC9968c);
            c39381.f25737f = obj;
            return c39381;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserPlaylist userPlaylist, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39381) mo1336a(userPlaylist, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25736e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                UserPlaylist userPlaylist = (UserPlaylist) this.f25737f;
                if (userPlaylist != null) {
                    PlaylistViewModel playlistViewModel = this.f25738g;
                    CoroutineDispatcher coroutineDispatcher = playlistViewModel.f25615j;
                    PlaylistViewModel$getDefaultPlaylist$1$1$1$1 playlistViewModel$getDefaultPlaylist$1$1$1$1 = new PlaylistViewModel$getDefaultPlaylist$1$1$1$1(playlistViewModel, userPlaylist, null);
                    this.f25736e = 1;
                    if (C7828f.m15574h(this, coroutineDispatcher, playlistViewModel$getDefaultPlaylist$1$1$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getDefaultPlaylist$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$getDefaultPlaylist$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25735f = playlistViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$getDefaultPlaylist$1(this.f25735f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$getDefaultPlaylist$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25734e;
        PlaylistViewModel playlistViewModel = this.f25735f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        InterfaceC2019l interfaceC2019l = playlistViewModel.f25603d;
        String strMo498E1 = playlistViewModel.mo498E1();
        this.f25734e = 1;
        obj = interfaceC2019l.mo6096B(strMo498E1);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C39381 c39381 = new C39381(playlistViewModel, null);
        this.f25734e = 2;
        return C0062b.m369m0((InterfaceC7116c) obj, c39381, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
