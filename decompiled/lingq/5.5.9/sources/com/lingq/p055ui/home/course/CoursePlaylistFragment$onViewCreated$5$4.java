package com.lingq.p055ui.home.course;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$4", m19206f = "CoursePlaylistFragment.kt", m19207l = {335}, m19208m = "invokeSuspend")
public final class CoursePlaylistFragment$onViewCreated$5$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23795e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistFragment f23796f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$4$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/playlist/PlaylistAdapter$c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$4$1", m19206f = "CoursePlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36471 extends SuspendLambda implements InterfaceC2056p<List<? extends PlaylistAdapter.AbstractC3890c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23797e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CoursePlaylistFragment f23798f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36471(CoursePlaylistFragment coursePlaylistFragment, InterfaceC9968c<? super C36471> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23798f = coursePlaylistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36471 c36471 = new C36471(this.f23798f, interfaceC9968c);
            c36471.f23797e = obj;
            return c36471;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends PlaylistAdapter.AbstractC3890c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36471) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f23797e;
            PlaylistAdapter playlistAdapter = this.f23798f.f23766E0;
            if (playlistAdapter != null) {
                playlistAdapter.m4529q(list);
                return C9072e.f47360a;
            }
            C5207g.m11117l("playlistAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistFragment$onViewCreated$5$4(CoursePlaylistFragment coursePlaylistFragment, InterfaceC9968c<? super CoursePlaylistFragment$onViewCreated$5$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23796f = coursePlaylistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistFragment$onViewCreated$5$4(this.f23796f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistFragment$onViewCreated$5$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23795e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
            CoursePlaylistFragment coursePlaylistFragment = this.f23796f;
            CoursePlaylistViewModel coursePlaylistViewModelM9862q0 = coursePlaylistFragment.m9862q0();
            C36471 c36471 = new C36471(coursePlaylistFragment, null);
            this.f23795e = 1;
            if (C0062b.m369m0(coursePlaylistViewModelM9862q0.f23836Y, c36471, this) == coroutineSingletons) {
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
