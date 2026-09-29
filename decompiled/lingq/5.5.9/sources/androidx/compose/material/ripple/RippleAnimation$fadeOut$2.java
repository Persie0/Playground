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
@InterfaceC10224c(m19205c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", m19206f = "RippleAnimation.kt", m19207l = {}, m19208m = "invokeSuspend")
final class RippleAnimation$fadeOut$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super InterfaceC7875v0>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2614e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RippleAnimation f2615f;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", m19206f = "RippleAnimation.kt", m19207l = {112}, m19208m = "invokeSuspend")
    public static final class C04521 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f2616e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RippleAnimation f2617f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04521(RippleAnimation rippleAnimation, InterfaceC9968c<? super C04521> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f2617f = rippleAnimation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C04521(this.f2617f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04521) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f2616e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C0369a<Float, C8905f> c0369a = this.f2617f.f2596g;
                Float f3 = new Float(0.0f);
                C8904e0 c8904e0M16734k1 = C8573r0.m16734k1(150, 0, C8927q.f46849c, 2);
                this.f2616e = 1;
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
    public RippleAnimation$fadeOut$2(RippleAnimation rippleAnimation, InterfaceC9968c<? super RippleAnimation$fadeOut$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2615f = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        RippleAnimation$fadeOut$2 rippleAnimation$fadeOut$2 = new RippleAnimation$fadeOut$2(this.f2615f, interfaceC9968c);
        rippleAnimation$fadeOut$2.f2614e = obj;
        return rippleAnimation$fadeOut$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super InterfaceC7875v0> interfaceC9968c) {
        return ((RippleAnimation$fadeOut$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return C7828f.m15570d((InterfaceC7882z) this.f2614e, null, null, new C04521(this.f2615f, null), 3);
    }
}
