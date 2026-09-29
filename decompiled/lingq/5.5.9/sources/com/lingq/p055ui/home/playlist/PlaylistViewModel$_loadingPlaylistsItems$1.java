package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/home/playlist/PlaylistAdapter$c$e;", "Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$_loadingPlaylistsItems$1", m19206f = "PlaylistViewModel.kt", m19207l = {229}, m19208m = "invokeSuspend")
final class PlaylistViewModel$_loadingPlaylistsItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends PlaylistAdapter.AbstractC3890c.e>>, Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25696e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f25697f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Resource.Status f25698g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ PlaylistViewModel f25699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$_loadingPlaylistsItems$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$_loadingPlaylistsItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f25699h = playlistViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends PlaylistAdapter.AbstractC3890c.e>> interfaceC7117d, Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        PlaylistViewModel$_loadingPlaylistsItems$1 playlistViewModel$_loadingPlaylistsItems$1 = new PlaylistViewModel$_loadingPlaylistsItems$1(this.f25699h, interfaceC9968c);
        playlistViewModel$_loadingPlaylistsItems$1.f25697f = interfaceC7117d;
        playlistViewModel$_loadingPlaylistsItems$1.f25698g = status;
        return playlistViewModel$_loadingPlaylistsItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ?? arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25696e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f25697f;
            if (this.f25698g == Resource.Status.LOADING && ((List) this.f25699h.f25612h0.getValue()).isEmpty()) {
                arrayList = new ArrayList(5);
                for (int i11 = 0; i11 < 5; i11++) {
                    arrayList.add(PlaylistAdapter.AbstractC3890c.e.f25415a);
                }
            } else {
                arrayList = EmptyList.f38032a;
            }
            this.f25697f = null;
            this.f25696e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
