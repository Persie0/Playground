package com.lingq.p055ui.info;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$isLessonDownloaded$1", m19206f = "LessonInfoViewModel.kt", m19207l = {180, 182}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$isLessonDownloaded$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27009e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f27010f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoViewModel$isLessonDownloaded$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$isLessonDownloaded$1$1", m19206f = "LessonInfoViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41561 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Boolean>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LessonInfoViewModel f27011e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41561(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super C41561> interfaceC9968c) {
            super(3, interfaceC9968c);
            this.f27011e = lessonInfoViewModel;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super Boolean> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return new C41561(this.f27011e, interfaceC9968c).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f27011e.f26933U.setValue(Boolean.FALSE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoViewModel$isLessonDownloaded$1$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$isLessonDownloaded$1$2", m19206f = "LessonInfoViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41572 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f27012e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoViewModel f27013f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41572(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super C41572> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27013f = lessonInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41572 c41572 = new C41572(this.f27013f, interfaceC9968c);
            c41572.f27012e = ((Boolean) obj).booleanValue();
            return c41572;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41572) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f27013f.f26933U.setValue(Boolean.valueOf(this.f27012e));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$isLessonDownloaded$1(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super LessonInfoViewModel$isLessonDownloaded$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f27010f = lessonInfoViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$isLessonDownloaded$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$isLessonDownloaded$1(this.f27010f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27009e;
        LessonInfoViewModel lessonInfoViewModel = this.f27010f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a = lessonInfoViewModel.f26942d;
        int i11 = lessonInfoViewModel.f26921I.f35086a;
        this.f27009e = 1;
        obj = interfaceC3324a.mo9502X(i11);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((InterfaceC7116c) obj, new C41561(lessonInfoViewModel, null));
        C41572 c41572 = new C41572(lessonInfoViewModel, null);
        this.f27009e = 2;
        return C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, c41572, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
