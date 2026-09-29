package com.lingq.p055ui.home.course;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.C3296a;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7133n;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$5", m19206f = "CoursePlaylistFragment.kt", m19207l = {341}, m19208m = "invokeSuspend")
public final class CoursePlaylistFragment$onViewCreated$5$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23799e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistFragment f23800f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/player/a;", "updateViewsState", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$5$1", m19206f = "CoursePlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36481 extends SuspendLambda implements InterfaceC2056p<C3296a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23801e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CoursePlaylistFragment f23802f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36481(CoursePlaylistFragment coursePlaylistFragment, InterfaceC9968c<? super C36481> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23802f = coursePlaylistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36481 c36481 = new C36481(this.f23802f, interfaceC9968c);
            c36481.f23801e = obj;
            return c36481;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C3296a c3296a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36481) mo1336a(c3296a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C3296a c3296a = (C3296a) this.f23801e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
            this.f23802f.m9860o0().f44946g.m9987c(c3296a);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistFragment$onViewCreated$5$5(CoursePlaylistFragment coursePlaylistFragment, InterfaceC9968c<? super CoursePlaylistFragment$onViewCreated$5$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23800f = coursePlaylistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistFragment$onViewCreated$5$5(this.f23800f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistFragment$onViewCreated$5$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23799e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
            CoursePlaylistFragment coursePlaylistFragment = this.f23800f;
            InterfaceC7133n<C3296a> interfaceC7133nMo9399J0 = coursePlaylistFragment.m9862q0().mo9399J0();
            C36481 c36481 = new C36481(coursePlaylistFragment, null);
            this.f23799e = 1;
            if (C0062b.m369m0(interfaceC7133nMo9399J0, c36481, this) == coroutineSingletons) {
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
