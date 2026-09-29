package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.util.CoroutineJobManager;
import java.util.List;
import ki.C6696b;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourses$1", m19206f = "PlaylistViewModel.kt", m19207l = {605}, m19208m = "invokeSuspend")
final class PlaylistViewModel$getPlaylistCourses$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25770e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25771f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25772g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25773h;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourses$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/b;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourses$1$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39441 extends SuspendLambda implements InterfaceC2056p<List<? extends C6696b>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25774e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistViewModel f25775f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39441(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super C39441> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25775f = playlistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39441 c39441 = new C39441(this.f25775f, interfaceC9968c);
            c39441.f25774e = obj;
            return c39441;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6696b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39441) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List<C6696b> list = (List) this.f25774e;
            if (list != null) {
                PlaylistViewModel playlistViewModel = this.f25775f;
                playlistViewModel.f25601b0.setValue(list);
                playlistViewModel.f25600a0.clear();
                if (!list.isEmpty()) {
                    for (C6696b c6696b : list) {
                        int i10 = c6696b.f37853a;
                        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(playlistViewModel);
                        String strM761g = C0166e.m761g("observerPlaylistCourseLessons ", i10);
                        PlaylistViewModel$observerPlaylistCourseLessons$1 playlistViewModel$observerPlaylistCourseLessons$1 = new PlaylistViewModel$observerPlaylistCourseLessons$1(playlistViewModel, i10, null);
                        CoroutineJobManager coroutineJobManager = playlistViewModel.f25617k;
                        CoroutineDispatcher coroutineDispatcher = playlistViewModel.f25613i;
                        C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, strM761g, playlistViewModel$observerPlaylistCourseLessons$1);
                        int i11 = c6696b.f37853a;
                        playlistViewModel.f25602c0.put(Integer.valueOf(i11), C7120g.m14379a(EmptyList.f38032a));
                        C7499b.m14933c0(C8573r0.m16767w0(playlistViewModel), coroutineJobManager, coroutineDispatcher, C0166e.m761g("playlistCourseLessons ", i11), new PlaylistViewModel$getPlaylistCourseLessons$1(playlistViewModel, i11, null));
                        C7499b.m14933c0(C8573r0.m16767w0(playlistViewModel), coroutineJobManager, coroutineDispatcher, C0166e.m761g("updatePlaylistCourses ", i11), new PlaylistViewModel$updateCourseWithLessons$1(playlistViewModel, i11, null));
                    }
                }
                playlistViewModel.f25623o0.setValue(Boolean.valueOf(playlistViewModel.f25629u0.getValue() != Resource.Status.LOADING && list.isEmpty() && ((List) playlistViewModel.f25604d0.getValue()).isEmpty()));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getPlaylistCourses$1(int i10, PlaylistViewModel playlistViewModel, String str, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25771f = playlistViewModel;
        this.f25772g = i10;
        this.f25773h = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$getPlaylistCourses$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$getPlaylistCourses$1(this.f25772g, this.f25771f, this.f25773h, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25770e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistViewModel playlistViewModel = this.f25771f;
            InterfaceC7116c interfaceC7116cMo6117l = playlistViewModel.f25603d.mo6117l(playlistViewModel.mo498E1(), this.f25773h);
            C39441 c39441 = new C39441(playlistViewModel, null);
            this.f25770e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6117l, c39441, this) == coroutineSingletons) {
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
