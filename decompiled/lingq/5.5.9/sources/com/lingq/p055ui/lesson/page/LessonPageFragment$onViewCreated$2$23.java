package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$23", m19206f = "LessonPageFragment.kt", m19207l = {838}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$23 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28455e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28456f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$23$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "playbackSpeed", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$23$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43591 extends SuspendLambda implements InterfaceC2056p<Float, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ float f28457e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28458f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43591(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43591> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28458f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43591 c43591 = new C43591(this.f28458f, interfaceC9968c);
            c43591.f28457e = ((Number) obj).floatValue();
            return c43591;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Float f3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43591) mo1336a(Float.valueOf(f3.floatValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            float f3 = this.f28457e;
            LessonPageFragment lessonPageFragment = this.f28458f;
            if (f3 < 1.0f) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                lessonPageFragment.m10191r0().f44780d.setImageResource(R.drawable.ic_playback_slow);
            } else {
                LessonPageFragment.C4337a c4337a2 = LessonPageFragment.f28335M0;
                lessonPageFragment.m10191r0().f44780d.setImageResource(R.drawable.ic_playback_fast);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$23(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$23> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28456f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$23(this.f28456f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$23) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28455e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28456f;
            LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
            C43591 c43591 = new C43591(lessonPageFragment, null);
            this.f28455e = 1;
            if (C0062b.m369m0(lessonPageViewModelM10193t0.f28551e0, c43591, this) == coroutineSingletons) {
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
