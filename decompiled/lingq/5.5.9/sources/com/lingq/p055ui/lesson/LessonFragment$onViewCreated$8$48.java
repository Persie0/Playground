package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.widget.RelativeLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p304ok.InterfaceC8066b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import pk.InterfaceC8402c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$48", m19206f = "LessonFragment.kt", m19207l = {1446}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$48 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27272e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27273f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$48$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/lesson/e;", "action", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$48$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42131 extends SuspendLambda implements InterfaceC2056p<AbstractC4272e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27274e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27275f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$48$1$a */
        public static final class a implements InterfaceC8402c {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC4272e f27276a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonFragment f27277b;

            public a(AbstractC4272e abstractC4272e, LessonFragment lessonFragment) {
                this.f27276a = abstractC4272e;
                this.f27277b = lessonFragment;
            }

            @Override // pk.InterfaceC8402c
            /* JADX INFO: renamed from: a */
            public final void mo5247a(InterfaceC8066b interfaceC8066b) {
                C5207g.m11111f(interfaceC8066b, "youTubePlayer");
                AbstractC4272e.a aVar = (AbstractC4272e.a) this.f27276a;
                interfaceC8066b.mo15932c((float) aVar.f27867a);
                interfaceC8066b.play();
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                LessonViewModel lessonViewModelM10109q0 = this.f27277b.m10109q0();
                double d10 = aVar.f27867a;
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$playingVideoAndThenStop$1(aVar.f27868b, d10, lessonViewModelM10109q0, null), 3);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$48$1$b */
        public static final class b implements InterfaceC8402c {
            @Override // pk.InterfaceC8402c
            /* JADX INFO: renamed from: a */
            public final void mo5247a(InterfaceC8066b interfaceC8066b) {
                C5207g.m11111f(interfaceC8066b, "youTubePlayer");
                interfaceC8066b.pause();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42131(LessonFragment lessonFragment, InterfaceC9968c<? super C42131> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27275f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42131 c42131 = new C42131(this.f27275f, interfaceC9968c);
            c42131.f27274e = obj;
            return c42131;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC4272e abstractC4272e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42131) mo1336a(abstractC4272e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC4272e abstractC4272e = (AbstractC4272e) this.f27274e;
            boolean z10 = abstractC4272e instanceof AbstractC4272e.a;
            LessonFragment lessonFragment = this.f27275f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                RelativeLayout relativeLayout = lessonFragment.m10107o0().f44715z;
                C5207g.m11110e(relativeLayout, "binding.viewYoutubePlayer");
                C4924a.m10457e0(relativeLayout);
                YouTubePlayerView youTubePlayerView = lessonFragment.m10107o0().f44689A;
                C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                C4924a.m10457e0(youTubePlayerView);
                lessonFragment.m10107o0().f44689A.m10491a(new a(abstractC4272e, lessonFragment));
            } else if (abstractC4272e instanceof AbstractC4272e.b) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                lessonFragment.m10107o0().f44689A.m10491a(new b());
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$48(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$48> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27273f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$48(this.f27273f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$48) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27272e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27273f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C42131 c42131 = new C42131(lessonFragment, null);
            this.f27272e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27397G0, c42131, this) == coroutineSingletons) {
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
