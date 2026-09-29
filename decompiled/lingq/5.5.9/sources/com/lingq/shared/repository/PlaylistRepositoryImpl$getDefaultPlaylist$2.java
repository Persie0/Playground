package com.lingq.shared.repository;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.persistent.dao.PlaylistDao;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl$getDefaultPlaylist$2", m19206f = "PlaylistRepository.kt", m19207l = {473, 473}, m19208m = "invokeSuspend")
final class PlaylistRepositoryImpl$getDefaultPlaylist$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super UserPlaylist>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f20272e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20273f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PlaylistRepositoryImpl f20274g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20275h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$getDefaultPlaylist$2(PlaylistRepositoryImpl playlistRepositoryImpl, String str, InterfaceC9968c<? super PlaylistRepositoryImpl$getDefaultPlaylist$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20274g = playlistRepositoryImpl;
        this.f20275h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        PlaylistRepositoryImpl$getDefaultPlaylist$2 playlistRepositoryImpl$getDefaultPlaylist$2 = new PlaylistRepositoryImpl$getDefaultPlaylist$2(this.f20274g, this.f20275h, interfaceC9968c);
        playlistRepositoryImpl$getDefaultPlaylist$2.f20273f = obj;
        return playlistRepositoryImpl$getDefaultPlaylist$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super UserPlaylist> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistRepositoryImpl$getDefaultPlaylist$2) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20272e;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC7117d = (InterfaceC7117d) this.f20273f;
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        interfaceC7117d = (InterfaceC7117d) this.f20273f;
        PlaylistDao playlistDao = this.f20274g.f20199c;
        this.f20273f = interfaceC7117d;
        this.f20272e = 1;
        obj = playlistDao.mo5228z0(this.f20275h, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.f20273f = null;
        this.f20272e = 2;
        if (interfaceC7117d.mo1339r(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
