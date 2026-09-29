package androidx.compose.material.ripple;

import androidx.compose.animation.core.C0369a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p374s.C8904e0;
import p374s.C8905f;
import p374s.C8927q;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lno/v0;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", m19206f = "RippleAnimation.kt", m19207l = {}, m19208m = "invokeSuspend")
final class RippleAnimation$fadeIn$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super InterfaceC7875v0>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2606e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RippleAnimation f2607f;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", m19206f = "RippleAnimation.kt", m19207l = {89}, m19208m = "invokeSuspend")
    public static final class C04491 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f2608e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RippleAnimation f2609f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04491(RippleAnimation rippleAnimation, InterfaceC9968c<? super C04491> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f2609f = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C04491(this.f2609f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04491) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2608e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C0369a<Float, C8905f> c0369a = this.f2609f.f2596g;
                Float f3 = new Float(1.0f);
                C8904e0 c8904e0M16734k1 = C8573r0.m16734k1(75, 0, C8927q.f46849c, 2);
                this.f2608e = 1;
                if (C0369a.m1382b(c0369a, f3, c8904e0M16734k1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", m19206f = "RippleAnimation.kt", m19207l = {95}, m19208m = "invokeSuspend")
    public static final class C04502 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f2610e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RippleAnimation f2611f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04502(RippleAnimation rippleAnimation, InterfaceC9968c<? super C04502> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f2611f = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C04502(this.f2611f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04502) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2610e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C0369a<Float, C8905f> c0369a = this.f2611f.f2597h;
                Float f3 = new Float(1.0f);
                C8904e0 c8904e0M16734k1 = C8573r0.m16734k1(225, 0, C8927q.f46847a, 2);
                this.f2610e = 1;
                if (C0369a.m1382b(c0369a, f3, c8904e0M16734k1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", m19206f = "RippleAnimation.kt", m19207l = {101}, m19208m = "invokeSuspend")
    public static final class C04513 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f2612e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RippleAnimation f2613f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04513(RippleAnimation rippleAnimation, InterfaceC9968c<? super C04513> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f2613f = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C04513(this.f2613f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04513) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2612e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C0369a<Float, C8905f> c0369a = this.f2613f.f2598i;
                Float f3 = new Float(1.0f);
                C8904e0 c8904e0M16734k1 = C8573r0.m16734k1(225, 0, C8927q.f46849c, 2);
                this.f2612e = 1;
                if (C0369a.m1382b(c0369a, f3, c8904e0M16734k1, this) == coroutineSingletons) {
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
    public RippleAnimation$fadeIn$2(RippleAnimation rippleAnimation, InterfaceC9968c<? super RippleAnimation$fadeIn$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2607f = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        RippleAnimation$fadeIn$2 rippleAnimation$fadeIn$2 = new RippleAnimation$fadeIn$2(this.f2607f, interfaceC9968c);
        rippleAnimation$fadeIn$2.f2606e = obj;
        return rippleAnimation$fadeIn$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super InterfaceC7875v0> interfaceC9968c) {
        return ((RippleAnimation$fadeIn$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f2606e;
        RippleAnimation rippleAnimation = this.f2607f;
        C7828f.m15570d(interfaceC7882z, null, null, new C04491(rippleAnimation, null), 3);
        C7828f.m15570d(interfaceC7882z, null, null, new C04502(rippleAnimation, null), 3);
        return C7828f.m15570d(interfaceC7882z, null, null, new C04513(rippleAnimation, null), 3);
    }
}
