package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8379x;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$1$3$1", m19206f = "PlaylistFragment.kt", m19207l = {122}, m19208m = "invokeSuspend")
public final class PlaylistFragment$onViewCreated$1$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25475e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistFragment f25476f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C8379x f25477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistFragment$onViewCreated$1$3$1(PlaylistFragment playlistFragment, C8379x c8379x, InterfaceC9968c<? super PlaylistFragment$onViewCreated$1$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25476f = playlistFragment;
        this.f25477g = c8379x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistFragment$onViewCreated$1$3$1(this.f25476f, this.f25477g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistFragment$onViewCreated$1$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25475e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            PlaylistFragment playlistFragment = this.f25476f;
            PlaylistViewModel playlistViewModelM9984r0 = playlistFragment.m9984r0();
            UserPlaylist userPlaylist = (UserPlaylist) playlistViewModelM9984r0.f25620l0.getValue();
            if (userPlaylist != null) {
                playlistViewModelM9984r0.m9999t2(userPlaylist.f22077a, userPlaylist.f22080d);
            }
            playlistFragment.m9984r0().m9994o2();
            this.f25475e = 1;
            if (C7828f.m15567a(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        final C8379x c8379x = this.f25477g;
        c8379x.f45455h.post(new Runnable() { // from class: bj.n
            @Override // java.lang.Runnable
            public final void run() {
                c8379x.f45455h.setRefreshing(false);
            }
        });
        return C9072e.f47360a;
    }
}
