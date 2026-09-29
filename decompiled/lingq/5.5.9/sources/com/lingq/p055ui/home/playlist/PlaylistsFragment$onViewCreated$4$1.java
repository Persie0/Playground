package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$4$1", m19206f = "PlaylistsFragment.kt", m19207l = {183}, m19208m = "invokeSuspend")
public final class PlaylistsFragment$onViewCreated$4$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25878e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistsFragment f25879f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$4$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "playlists", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$4$1$1", m19206f = "PlaylistsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39561 extends SuspendLambda implements InterfaceC2056p<List<? extends UserPlaylist>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25880e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistsFragment f25881f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39561(PlaylistsFragment playlistsFragment, InterfaceC9968c<? super C39561> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25881f = playlistsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39561 c39561 = new C39561(this.f25881f, interfaceC9968c);
            c39561.f25880e = obj;
            return c39561;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserPlaylist> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39561) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25880e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new PlaylistsAdapter.AbstractC3951c.b((UserPlaylist) it.next()));
            }
            arrayList.addAll(arrayList2);
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistsFragment.f25858U0;
            PlaylistsFragment playlistsFragment = this.f25881f;
            if (!playlistsFragment.m10004v0().f9090d) {
                arrayList.add(PlaylistsAdapter.AbstractC3951c.a.f25856a);
            }
            PlaylistsAdapter playlistsAdapter = playlistsFragment.f25862T0;
            if (playlistsAdapter != null) {
                playlistsAdapter.m4529q(arrayList);
                return C9072e.f47360a;
            }
            C5207g.m11117l("playlistsAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsFragment$onViewCreated$4$1(PlaylistsFragment playlistsFragment, InterfaceC9968c<? super PlaylistsFragment$onViewCreated$4$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25879f = playlistsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistsFragment$onViewCreated$4$1(this.f25879f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistsFragment$onViewCreated$4$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25878e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistsFragment playlistsFragment = this.f25879f;
            PlaylistsViewModel playlistsViewModelM10003u0 = PlaylistsFragment.m10003u0(playlistsFragment);
            C39561 c39561 = new C39561(playlistsFragment, null);
            this.f25878e = 1;
            if (C0062b.m369m0(playlistsViewModelM10003u0.f25901l, c39561, this) == coroutineSingletons) {
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
