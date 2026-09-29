package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1", m19206f = "LessonPageFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C4340xacde109d extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28352e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f28353f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f28354g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonPageFragment f28355h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f28356i;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$1$1", m19206f = "LessonPageFragment.kt", m19207l = {1790}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28357e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f28358f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LessonPageFragment f28359g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f28360h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, LessonPageFragment lessonPageFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28359g = lessonPageFragment;
            this.f28360h = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28360h, this.f28359g, interfaceC9968c);
            anonymousClass1.f28358f = obj;
            return anonymousClass1;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28357e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                LessonPageFragment lessonPageFragment = this.f28359g;
                LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
                LessonPageFragment$onViewCreated$3$1 lessonPageFragment$onViewCreated$3$1 = new LessonPageFragment$onViewCreated$3$1(this.f28360h, lessonPageFragment, null);
                this.f28357e = 1;
                if (C0062b.m369m0(lessonPageViewModelM10193t0.f28541W, lessonPageFragment$onViewCreated$3$1, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4340xacde109d(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, LessonPageFragment lessonPageFragment, int i10) {
        super(2, interfaceC9968c);
        this.f28353f = fragment;
        this.f28354g = state;
        this.f28355h = lessonPageFragment;
        this.f28356i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C4340xacde109d(this.f28353f, this.f28354g, interfaceC9968c, this.f28355h, this.f28356i);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C4340xacde109d) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28352e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f28353f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28356i, this.f28355h, null);
            this.f28352e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f28354g, anonymousClass1, this) == coroutineSingletons) {
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
