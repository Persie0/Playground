package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import ci.InterfaceC2010c;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7133n;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourseLessons$1", m19206f = "PlaylistViewModel.kt", m19207l = {652}, m19208m = "invokeSuspend")
final class PlaylistViewModel$getPlaylistCourseLessons$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25764e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25765f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25766g;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourseLessons$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/c;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getPlaylistCourseLessons$1$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39431 extends SuspendLambda implements InterfaceC2056p<List<? extends C6697c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25767e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistViewModel f25768f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f25769g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39431(PlaylistViewModel playlistViewModel, int i10, InterfaceC9968c<? super C39431> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25768f = playlistViewModel;
            this.f25769g = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39431 c39431 = new C39431(this.f25768f, this.f25769g, interfaceC9968c);
            c39431.f25767e = obj;
            return c39431;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6697c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39431) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7133n interfaceC7133n;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25767e;
            if ((!list.isEmpty()) && (interfaceC7133n = (InterfaceC7133n) this.f25768f.f25602c0.get(new Integer(this.f25769g))) != null) {
                interfaceC7133n.setValue(list);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getPlaylistCourseLessons$1(PlaylistViewModel playlistViewModel, int i10, InterfaceC9968c<? super PlaylistViewModel$getPlaylistCourseLessons$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25765f = playlistViewModel;
        this.f25766g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$getPlaylistCourseLessons$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$getPlaylistCourseLessons$1(this.f25765f, this.f25766g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25764e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistViewModel playlistViewModel = this.f25765f;
            InterfaceC2010c interfaceC2010c = playlistViewModel.f25607f;
            int i11 = this.f25766g;
            InterfaceC7116c<List<C6697c>> interfaceC7116cMo5997f = interfaceC2010c.mo5997f(i11);
            C39431 c39431 = new C39431(playlistViewModel, i11, null);
            this.f25764e = 1;
            if (C0062b.m369m0(interfaceC7116cMo5997f, c39431, this) == coroutineSingletons) {
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
