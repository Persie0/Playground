package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.PlayerContentController;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import ki.C6697c;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7133n;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$3", m19206f = "PlaylistFragment.kt", m19207l = {383}, m19208m = "invokeSuspend")
public final class PlaylistFragment$onViewCreated$2$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25526e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistFragment f25527f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$3$1", m19206f = "PlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39081 extends SuspendLambda implements InterfaceC2056p<Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25528e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistFragment f25529f;

        /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$3$1$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ PlaylistFragment f25530a;

            public a(PlaylistFragment playlistFragment) {
                this.f25530a = playlistFragment;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PlaylistFragment playlistFragment = this.f25530a;
                if (playlistFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                    RecyclerView recyclerView = playlistFragment.m9981o0().f45454g;
                    C5207g.m11110e(recyclerView, "binding.rvPlaylist");
                    int height = playlistFragment.m9981o0().f45459l.getHeight();
                    List<Integer> list = C6716m.f37937a;
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), height + ((int) C6716m.m13316a(8)));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39081(PlaylistFragment playlistFragment, InterfaceC9968c<? super C39081> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25529f = playlistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39081 c39081 = new C39081(this.f25529f, interfaceC9968c);
            c39081.f25528e = obj;
            return c39081;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39081) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            int i10;
            Object next;
            C6697c c6697c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f25528e;
            PlayerContentController.PlayerContentItem playerContentItem = (PlayerContentController.PlayerContentItem) triple.f38021a;
            boolean zBooleanValue = ((Boolean) triple.f38022b).booleanValue();
            int iIntValue = ((Number) triple.f38023c).intValue();
            if (playerContentItem != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                PlaylistFragment playlistFragment = this.f25529f;
                PlaylistPlayerView playlistPlayerView = playlistFragment.m9981o0().f45459l;
                Iterator it = ((Iterable) playlistFragment.m9984r0().f25604d0.getValue()).iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    i10 = playerContentItem.f17600a;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    c6697c = (C6697c) next;
                } while (!(c6697c != null && c6697c.f37856a == i10));
                playlistPlayerView.m9986b((C6697c) next, zBooleanValue, iIntValue);
                PlaylistAdapter playlistAdapter = playlistFragment.f25462E0;
                if (playlistAdapter == null) {
                    C5207g.m11117l("playlistAdapter");
                    throw null;
                }
                playlistAdapter.f25400g = i10;
                playlistFragment.m9981o0().f45459l.post(new a(playlistFragment));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistFragment$onViewCreated$2$3(PlaylistFragment playlistFragment, InterfaceC9968c<? super PlaylistFragment$onViewCreated$2$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25527f = playlistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistFragment$onViewCreated$2$3(this.f25527f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistFragment$onViewCreated$2$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25526e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            PlaylistFragment playlistFragment = this.f25527f;
            InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> interfaceC7133nMo9425z0 = playlistFragment.m9984r0().mo9425z0();
            C39081 c39081 = new C39081(playlistFragment, null);
            this.f25526e = 1;
            if (C0062b.m369m0(interfaceC7133nMo9425z0, c39081, this) == coroutineSingletons) {
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
