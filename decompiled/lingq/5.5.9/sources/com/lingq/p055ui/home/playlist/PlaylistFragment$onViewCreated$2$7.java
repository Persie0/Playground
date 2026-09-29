package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.AbstractC3298c;
import com.lingq.player.C3296a;
import com.lingq.player.PlayerContentController;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7133n;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$7", m19206f = "PlaylistFragment.kt", m19207l = {438}, m19208m = "invokeSuspend")
public final class PlaylistFragment$onViewCreated$2$7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25543e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistFragment f25544f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$7$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/player/a;", "updateViewsState", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$7$1", m19206f = "PlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39121 extends SuspendLambda implements InterfaceC2056p<C3296a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25545e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistFragment f25546f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39121(PlaylistFragment playlistFragment, InterfaceC9968c<? super C39121> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25546f = playlistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39121 c39121 = new C39121(this.f25546f, interfaceC9968c);
            c39121.f25545e = obj;
            return c39121;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C3296a c3296a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39121) mo1336a(c3296a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C3296a c3296a = (C3296a) this.f25545e;
            boolean z10 = c3296a.f17739a.f17758b instanceof AbstractC3298c.b;
            PlaylistFragment playlistFragment = this.f25546f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                PlaylistViewModel playlistViewModelM9984r0 = playlistFragment.m9984r0();
                int i10 = 0;
                PlayerContentController.PlayerContentItem playerContentItem = c3296a.f17746h;
                if (playlistViewModelM9984r0.m9995p2(playerContentItem != null ? playerContentItem.f17600a : 0)) {
                    playlistFragment.m9983q0().pause();
                    PlaylistViewModel playlistViewModelM9984r1 = playlistFragment.m9984r0();
                    if (playerContentItem != null) {
                        i10 = playerContentItem.f17600a;
                    }
                    playlistViewModelM9984r1.m9998s2(i10);
                }
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr2 = PlaylistFragment.f25457H0;
            PlaylistViewModel playlistViewModelM9984r2 = playlistFragment.m9984r0();
            C7828f.m15570d(C8573r0.m16767w0(playlistViewModelM9984r2), null, null, new PlaylistViewModel$changePlayingState$1(playlistViewModelM9984r2, c3296a.f17739a.f17758b instanceof AbstractC3298c.b, null), 3);
            PlaylistViewModel playlistViewModelM9984r3 = playlistFragment.m9984r0();
            C7828f.m15570d(C8573r0.m16767w0(playlistViewModelM9984r3), null, null, new PlaylistViewModel$changeShuffleState$1(playlistViewModelM9984r3, c3296a.f17740b, null), 3);
            playlistFragment.m9981o0().f45459l.m9987c(c3296a);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistFragment$onViewCreated$2$7(PlaylistFragment playlistFragment, InterfaceC9968c<? super PlaylistFragment$onViewCreated$2$7> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25544f = playlistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistFragment$onViewCreated$2$7(this.f25544f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistFragment$onViewCreated$2$7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25543e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            PlaylistFragment playlistFragment = this.f25544f;
            InterfaceC7133n<C3296a> interfaceC7133nMo9399J0 = playlistFragment.m9984r0().mo9399J0();
            C39121 c39121 = new C39121(playlistFragment, null);
            this.f25543e = 1;
            if (C0062b.m369m0(interfaceC7133nMo9399J0, c39121, this) == coroutineSingletons) {
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
