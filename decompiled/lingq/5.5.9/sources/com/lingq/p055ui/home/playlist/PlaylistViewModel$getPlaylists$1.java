package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylists$1", m19206f = "PlaylistViewModel.kt", m19207l = {517}, m19208m = "invokeSuspend")
final class PlaylistViewModel$getPlaylists$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25782e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25783f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylists$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylists$1$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39461 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends UserPlaylist>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ PlaylistViewModel f25784e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39461(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super C39461> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25784e = playlistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C39461(this.f25784e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends UserPlaylist>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39461) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f25784e.f25629u0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylists$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylists$1$2", m19206f = "PlaylistViewModel.kt", m19207l = {521, 524, 526, 531}, m19208m = "invokeSuspend")
    public static final class C39472 extends SuspendLambda implements InterfaceC2056p<List<? extends UserPlaylist>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public List f25785e;

        /* JADX INFO: renamed from: f */
        public int f25786f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f25787g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ PlaylistViewModel f25788h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39472(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super C39472> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25788h = playlistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39472 c39472 = new C39472(this.f25788h, interfaceC9968c);
            c39472.f25787g = obj;
            return c39472;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserPlaylist> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39472) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:58:0x0108  */
        /* JADX WARN: Code duplicated, block: B:63:0x00f8 A[SYNTHETIC] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            List list;
            PlaylistViewModel playlistViewModel;
            String str;
            StateFlowImpl stateFlowImpl;
            Iterator it;
            Object next;
            UserPlaylist userPlaylist;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25786f;
            boolean z10 = true;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                list = (List) this.f25787g;
                if (list != null) {
                    boolean z11 = !list.isEmpty();
                    playlistViewModel = this.f25788h;
                    if (z11) {
                        InterfaceC7116c<Map<String, String>> interfaceC7116cMo9690n = playlistViewModel.f25581H.mo9690n();
                        this.f25787g = playlistViewModel;
                        this.f25785e = list;
                        this.f25786f = 1;
                        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9690n, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = (String) ((Map) obj).get(playlistViewModel.mo498E1());
                        stateFlowImpl = playlistViewModel.f25620l0;
                        if (stateFlowImpl.getValue() == null) {
                            if (str != null) {
                                z10 = false;
                            }
                            if (z10) {
                                userPlaylist = (UserPlaylist) C6752c.m13423Q(list);
                                this.f25787g = null;
                                this.f25785e = null;
                                this.f25786f = 2;
                                if (PlaylistViewModel.m9991l2(playlistViewModel, userPlaylist, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!C5207g.m11106a(((UserPlaylist) next).f22077a, str));
                                this.f25787g = null;
                                this.f25785e = null;
                                this.f25786f = 3;
                                if (PlaylistViewModel.m9991l2(playlistViewModel, (UserPlaylist) next, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (str != null) {
                                z10 = false;
                            }
                            if (z10) {
                                userPlaylist = (UserPlaylist) C6752c.m13423Q(list);
                                this.f25787g = null;
                                this.f25785e = null;
                                this.f25786f = 2;
                                if (PlaylistViewModel.m9991l2(playlistViewModel, userPlaylist, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!C5207g.m11106a(((UserPlaylist) next).f22077a, str));
                                this.f25787g = null;
                                this.f25785e = null;
                                this.f25786f = 3;
                                if (PlaylistViewModel.m9991l2(playlistViewModel, (UserPlaylist) next, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    } else {
                        playlistViewModel.getClass();
                        C7499b.m14933c0(C8573r0.m16767w0(playlistViewModel), playlistViewModel.f25617k, playlistViewModel.f25613i, "updatePlaylists", new PlaylistViewModel$updatePlaylists$1(playlistViewModel, null));
                    }
                }
            } else if (i10 == 1) {
                list = this.f25785e;
                playlistViewModel = (PlaylistViewModel) this.f25787g;
                C7499b.m14977z0(obj);
                str = (String) ((Map) obj).get(playlistViewModel.mo498E1());
                stateFlowImpl = playlistViewModel.f25620l0;
                if (stateFlowImpl.getValue() == null && str != null) {
                    UserPlaylist userPlaylist2 = (UserPlaylist) stateFlowImpl.getValue();
                    if (C5207g.m11106a(userPlaylist2 != null ? userPlaylist2.f22078b : null, playlistViewModel.mo498E1())) {
                        UserPlaylist userPlaylist3 = (UserPlaylist) stateFlowImpl.getValue();
                        this.f25787g = null;
                        this.f25785e = null;
                        this.f25786f = 4;
                        if (PlaylistViewModel.m9991l2(playlistViewModel, userPlaylist3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                if (str != null && !C7661i.m15250P2(str)) {
                    z10 = false;
                }
                if (z10) {
                    userPlaylist = (UserPlaylist) C6752c.m13423Q(list);
                    this.f25787g = null;
                    this.f25785e = null;
                    this.f25786f = 2;
                    if (PlaylistViewModel.m9991l2(playlistViewModel, userPlaylist, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!C5207g.m11106a(((UserPlaylist) next).f22077a, str));
                    this.f25787g = null;
                    this.f25785e = null;
                    this.f25786f = 3;
                    if (PlaylistViewModel.m9991l2(playlistViewModel, (UserPlaylist) next, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 2 && i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getPlaylists$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$getPlaylists$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25783f = playlistViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$getPlaylists$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$getPlaylists$1(this.f25783f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25782e;
        PlaylistViewModel playlistViewModel = this.f25783f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C39461(playlistViewModel, null), playlistViewModel.f25603d.mo6100F(playlistViewModel.mo498E1()));
            C39472 c39472 = new C39472(playlistViewModel, null);
            this.f25782e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c39472, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        C9072e c9072e = C9072e.f47360a;
        playlistViewModel.f25620l0.getClass();
        return C9072e.f47360a;
    }
}
