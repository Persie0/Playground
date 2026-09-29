package com.lingq.p055ui.lesson.tutorial;

import androidx.fragment.app.C0980t0;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$onViewCreated$3", m19206f = "LessonFirstLingQCongratsFragment.kt", m19207l = {82}, m19208m = "invokeSuspend")
public final class LessonFirstLingQCongratsFragment$onViewCreated$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29193e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFirstLingQCongratsFragment f29194f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$onViewCreated$3$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonFirstLingQCongratsFragment$onViewCreated$3$1", m19206f = "LessonFirstLingQCongratsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44591 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LessonFirstLingQCongratsFragment f29195e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44591(LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment, InterfaceC9968c<? super C44591> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29195e = lessonFirstLingQCongratsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C44591(this.f29195e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44591) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFirstLingQCongratsFragment.f29187S0;
            ((LessonFirstLingQCongratsViewModel) this.f29195e.f29189R0.getValue()).mo9731b0(false);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFirstLingQCongratsFragment$onViewCreated$3(LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment, InterfaceC9968c<? super LessonFirstLingQCongratsFragment$onViewCreated$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29194f = lessonFirstLingQCongratsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFirstLingQCongratsFragment$onViewCreated$3(this.f29194f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFirstLingQCongratsFragment$onViewCreated$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29193e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment = this.f29194f;
            C0980t0 c0980t0M3601v = lessonFirstLingQCongratsFragment.m3601v();
            Lifecycle.State state = Lifecycle.State.CREATED;
            C44591 c44591 = new C44591(lessonFirstLingQCongratsFragment, null);
            this.f29193e = 1;
            if (RepeatOnLifecycleKt.m3905a(c0980t0M3601v, state, c44591, this) == coroutineSingletons) {
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
