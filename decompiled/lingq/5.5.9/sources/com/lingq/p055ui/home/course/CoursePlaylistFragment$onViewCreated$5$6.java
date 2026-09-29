package com.lingq.p055ui.home.course;

import ae.C0062b;
import android.content.DialogInterface;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$6", m19206f = "CoursePlaylistFragment.kt", m19207l = {349}, m19208m = "invokeSuspend")
public final class CoursePlaylistFragment$onViewCreated$5$6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23803e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistFragment f23804f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$6$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "lessonId", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$6$1", m19206f = "CoursePlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36491 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f23805e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CoursePlaylistFragment f23806f;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$6$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CoursePlaylistFragment f23807a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f23808b;

            public a(CoursePlaylistFragment coursePlaylistFragment, int i10) {
                this.f23807a = coursePlaylistFragment;
                this.f23808b = i10;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
                CoursePlaylistViewModel coursePlaylistViewModelM9862q0 = this.f23807a.m9862q0();
                coursePlaylistViewModelM9862q0.getClass();
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(coursePlaylistViewModelM9862q0);
                CoursePlaylistViewModel$generateLessonAudio$1 coursePlaylistViewModel$generateLessonAudio$1 = new CoursePlaylistViewModel$generateLessonAudio$1(coursePlaylistViewModelM9862q0, this.f23808b, null);
                C7499b.m14933c0(interfaceC7882zM16767w0, coursePlaylistViewModelM9862q0.f23848j, coursePlaylistViewModelM9862q0.f23847i, "generateLessonAudio", coursePlaylistViewModel$generateLessonAudio$1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36491(CoursePlaylistFragment coursePlaylistFragment, InterfaceC9968c<? super C36491> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23806f = coursePlaylistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36491 c36491 = new C36491(this.f23806f, interfaceC9968c);
            c36491.f23805e = ((Number) obj).intValue();
            return c36491;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36491) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f23805e;
            CoursePlaylistFragment coursePlaylistFragment = this.f23806f;
            C9249b c9249b = new C9249b(coursePlaylistFragment.m3576Y());
            c9249b.f599a.f579f = coursePlaylistFragment.m3600t(R.string.generate_lesson_audio);
            c9249b.m17610c(coursePlaylistFragment.m3600t(R.string.ui_cancel), null);
            c9249b.m17612e(coursePlaylistFragment.m3600t(R.string.ui_yes), new a(coursePlaylistFragment, i10));
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistFragment$onViewCreated$5$6(CoursePlaylistFragment coursePlaylistFragment, InterfaceC9968c<? super CoursePlaylistFragment$onViewCreated$5$6> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23804f = coursePlaylistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistFragment$onViewCreated$5$6(this.f23804f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistFragment$onViewCreated$5$6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23803e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
            CoursePlaylistFragment coursePlaylistFragment = this.f23804f;
            CoursePlaylistViewModel coursePlaylistViewModelM9862q0 = coursePlaylistFragment.m9862q0();
            C36491 c36491 = new C36491(coursePlaylistFragment, null);
            this.f23803e = 1;
            if (C0062b.m369m0(coursePlaylistViewModelM9862q0.f23838a0, c36491, this) == coroutineSingletons) {
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
