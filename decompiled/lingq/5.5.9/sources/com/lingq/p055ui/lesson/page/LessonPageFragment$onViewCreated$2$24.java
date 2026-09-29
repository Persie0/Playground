package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.widget.ImageButton;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.util.C4924a;
import dm.C5207g;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$24", m19206f = "LessonPageFragment.kt", m19207l = {848}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$24 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28459e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28460f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$24$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "hidePlaybackSpeed", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$24$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43601 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28461e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28462f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43601(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43601> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28462f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43601 c43601 = new C43601(this.f28462f, interfaceC9968c);
            c43601.f28461e = obj;
            return c43601;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43601) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Boolean bool = (Boolean) this.f28461e;
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28462f;
            if (lessonPageFragment.m10192s0().m10151x2()) {
                if (C5207g.m11106a(bool, Boolean.TRUE)) {
                    ImageButton imageButton = lessonPageFragment.m10191r0().f44780d;
                    C5207g.m11110e(imageButton, "binding.ivPlaybackSpeed");
                    C4924a.m10442U(imageButton);
                } else {
                    ImageButton imageButton2 = lessonPageFragment.m10191r0().f44780d;
                    C5207g.m11110e(imageButton2, "binding.ivPlaybackSpeed");
                    C4924a.m10457e0(imageButton2);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$24(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$24> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28460f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$24(this.f28460f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$24) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28459e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28460f;
            LessonViewModel lessonViewModelM10192s0 = lessonPageFragment.m10192s0();
            C43601 c43601 = new C43601(lessonPageFragment, null);
            this.f28459e = 1;
            if (C0062b.m369m0(lessonViewModelM10192s0.f27458a2, c43601, this) == coroutineSingletons) {
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
