package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashMap;
import java.util.List;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7133n;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$observerPlaylistCourseLessons$1", m19206f = "PlaylistViewModel.kt", m19207l = {666}, m19208m = "invokeSuspend")
final class PlaylistViewModel$observerPlaylistCourseLessons$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25792e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25793f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25794g;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$observerPlaylistCourseLessons$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/c;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$observerPlaylistCourseLessons$1$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39481 extends SuspendLambda implements InterfaceC2056p<List<? extends C6697c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25795e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistViewModel f25796f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f25797g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39481(PlaylistViewModel playlistViewModel, int i10, InterfaceC9968c<? super C39481> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25796f = playlistViewModel;
            this.f25797g = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39481 c39481 = new C39481(this.f25796f, this.f25797g, interfaceC9968c);
            c39481.f25795e = obj;
            return c39481;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6697c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39481) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25795e;
            PlaylistViewModel playlistViewModel = this.f25796f;
            playlistViewModel.f25600a0.put(new Integer(this.f25797g), C6752c.m13421O(list));
            C7138s c7138s = playlistViewModel.f25608f0;
            C9072e c9072e = C9072e.f47360a;
            c7138s.mo14371k(c9072e);
            if (!((Boolean) playlistViewModel.f25625q0.getValue()).booleanValue()) {
                playlistViewModel.f25614i0.setValue(PlaylistViewModel.m9992m2(playlistViewModel));
            }
            return c9072e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$observerPlaylistCourseLessons$1(PlaylistViewModel playlistViewModel, int i10, InterfaceC9968c<? super PlaylistViewModel$observerPlaylistCourseLessons$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25793f = playlistViewModel;
        this.f25794g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$observerPlaylistCourseLessons$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$observerPlaylistCourseLessons$1(this.f25793f, this.f25794g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25792e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistViewModel playlistViewModel = this.f25793f;
            LinkedHashMap linkedHashMap = playlistViewModel.f25602c0;
            int i11 = this.f25794g;
            InterfaceC7133n interfaceC7133n = (InterfaceC7133n) linkedHashMap.get(new Integer(i11));
            if (interfaceC7133n != null) {
                C39481 c39481 = new C39481(playlistViewModel, i11, null);
                this.f25792e = 1;
                if (C0062b.m369m0(interfaceC7133n, c39481, this) == coroutineSingletons) {
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
