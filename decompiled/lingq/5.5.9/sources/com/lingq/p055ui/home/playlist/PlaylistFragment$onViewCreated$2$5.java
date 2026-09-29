package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$5", m19206f = "PlaylistFragment.kt", m19207l = {416}, m19208m = "invokeSuspend")
public final class PlaylistFragment$onViewCreated$2$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25535e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistFragment f25536f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$5$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/playlist/PlaylistAdapter$c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$5$1", m19206f = "PlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39101 extends SuspendLambda implements InterfaceC2056p<List<? extends PlaylistAdapter.AbstractC3890c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25537e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistFragment f25538f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39101(PlaylistFragment playlistFragment, InterfaceC9968c<? super C39101> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25538f = playlistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39101 c39101 = new C39101(this.f25538f, interfaceC9968c);
            c39101.f25537e = obj;
            return c39101;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends PlaylistAdapter.AbstractC3890c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39101) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25537e;
            PlaylistAdapter playlistAdapter = this.f25538f.f25462E0;
            if (playlistAdapter != null) {
                playlistAdapter.m4529q(list);
                return C9072e.f47360a;
            }
            C5207g.m11117l("playlistAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistFragment$onViewCreated$2$5(PlaylistFragment playlistFragment, InterfaceC9968c<? super PlaylistFragment$onViewCreated$2$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25536f = playlistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistFragment$onViewCreated$2$5(this.f25536f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistFragment$onViewCreated$2$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25535e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            PlaylistFragment playlistFragment = this.f25536f;
            PlaylistViewModel playlistViewModelM9984r0 = playlistFragment.m9984r0();
            C39101 c39101 = new C39101(playlistFragment, null);
            this.f25535e = 1;
            if (C0062b.m369m0(playlistViewModelM9984r0.f25616j0, c39101, this) == coroutineSingletons) {
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
