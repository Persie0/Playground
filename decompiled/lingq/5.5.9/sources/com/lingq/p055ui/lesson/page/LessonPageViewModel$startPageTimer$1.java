package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import jm.C6526i;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$startPageTimer$1", m19206f = "LessonPageViewModel.kt", m19207l = {1037}, m19208m = "invokeSuspend")
final class LessonPageViewModel$startPageTimer$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28698e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageViewModel f28699f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$startPageTimer$1$a */
    public static final class C4384a implements InterfaceC7117d<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonPageViewModel f28700a;

        public C4384a(LessonPageViewModel lessonPageViewModel) {
            this.f28700a = lessonPageViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(Integer num, InterfaceC9968c interfaceC9968c) {
            this.f28700a.f28573t0.setValue(new Integer(num.intValue()));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$startPageTimer$1(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super LessonPageViewModel$startPageTimer$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28699f = lessonPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$startPageTimer$1(this.f28699f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$startPageTimer$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28698e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageViewModel lessonPageViewModel = this.f28699f;
            FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new LessonPageViewModel$startPageTimer$1$timer$1(null), new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(C6752c.m13413G(new C6526i(((Number) lessonPageViewModel.f28573t0.getValue()).intValue() + 1, Integer.MAX_VALUE)))), new LessonPageViewModel$startPageTimer$1$timer$2(lessonPageViewModel, null));
            C4384a c4384a = new C4384a(lessonPageViewModel);
            this.f28698e = 1;
            if (flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.mo9539a(c4384a, this) == coroutineSingletons) {
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
