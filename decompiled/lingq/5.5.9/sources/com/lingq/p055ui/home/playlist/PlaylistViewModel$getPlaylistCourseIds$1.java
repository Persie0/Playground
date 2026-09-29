package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourseIds$1", m19206f = "PlaylistViewModel.kt", m19207l = {631}, m19208m = "invokeSuspend")
final class PlaylistViewModel$getPlaylistCourseIds$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25759e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25760f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f25761g;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourseIds$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourseIds$1$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39421 extends SuspendLambda implements InterfaceC2056p<List<? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25762e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistViewModel f25763f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39421(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super C39421> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25763f = playlistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39421 c39421 = new C39421(this.f25763f, interfaceC9968c);
            c39421.f25762e = obj;
            return c39421;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39421) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25762e;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    PlaylistViewModel playlistViewModel = this.f25763f;
                    playlistViewModel.getClass();
                    C7499b.m14933c0(C8573r0.m16767w0(playlistViewModel), playlistViewModel.f25617k, playlistViewModel.f25613i, C0166e.m761g("updateCourse ", iIntValue), new PlaylistViewModel$updateCourse$1(playlistViewModel, iIntValue, null));
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getPlaylistCourseIds$1(PlaylistViewModel playlistViewModel, String str, InterfaceC9968c<? super PlaylistViewModel$getPlaylistCourseIds$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25760f = playlistViewModel;
        this.f25761g = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$getPlaylistCourseIds$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$getPlaylistCourseIds$1(this.f25760f, this.f25761g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25759e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistViewModel playlistViewModel = this.f25760f;
            InterfaceC7116c<List<Integer>> interfaceC7116cMo6123r = playlistViewModel.f25603d.mo6123r(this.f25761g);
            C39421 c39421 = new C39421(playlistViewModel, null);
            this.f25759e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6123r, c39421, this) == coroutineSingletons) {
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
