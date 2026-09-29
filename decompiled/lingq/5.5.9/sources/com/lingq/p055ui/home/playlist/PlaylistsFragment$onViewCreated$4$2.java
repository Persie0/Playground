package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.shared.domain.Resource;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8384y;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$4$2", m19206f = "PlaylistsFragment.kt", m19207l = {199}, m19208m = "invokeSuspend")
public final class PlaylistsFragment$onViewCreated$4$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25882e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistsFragment f25883f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$4$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsFragment$onViewCreated$4$2$1", m19206f = "PlaylistsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39571 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25884e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistsFragment f25885f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39571(PlaylistsFragment playlistsFragment, InterfaceC9968c<? super C39571> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25885f = playlistsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39571 c39571 = new C39571(this.f25885f, interfaceC9968c);
            c39571.f25884e = obj;
            return c39571;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39571) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource.Status status = (Resource.Status) this.f25884e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistsFragment.f25858U0;
            PlaylistsFragment playlistsFragment = this.f25885f;
            playlistsFragment.getClass();
            int i10 = 0;
            CircularProgressIndicator circularProgressIndicator = ((C8384y) playlistsFragment.f25859Q0.m10489a(playlistsFragment, PlaylistsFragment.f25858U0[0])).f45471b;
            C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
            if (!(status == Resource.Status.LOADING)) {
                i10 = 4;
            }
            circularProgressIndicator.setVisibility(i10);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsFragment$onViewCreated$4$2(PlaylistsFragment playlistsFragment, InterfaceC9968c<? super PlaylistsFragment$onViewCreated$4$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25883f = playlistsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistsFragment$onViewCreated$4$2(this.f25883f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistsFragment$onViewCreated$4$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25882e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistsFragment playlistsFragment = this.f25883f;
            PlaylistsViewModel playlistsViewModelM10003u0 = PlaylistsFragment.m10003u0(playlistsFragment);
            C39571 c39571 = new C39571(playlistsFragment, null);
            this.f25882e = 1;
            if (C0062b.m369m0(playlistsViewModelM10003u0.f25899j, c39571, this) == coroutineSingletons) {
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
