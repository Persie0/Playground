package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p260m8.C7499b;
import p374s.InterfaceC8901d;
import p401u.InterfaceC9356i;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lu/i;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m19206f = "ScrollExtensions.kt", m19207l = {41}, m19208m = "invokeSuspend")
final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC9356i, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2159e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2160f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f2161g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC8901d<Float> f2162h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Ref$FloatRef f2163i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f3, InterfaceC8901d<Float> interfaceC8901d, Ref$FloatRef ref$FloatRef, InterfaceC9968c<? super ScrollExtensionsKt$animateScrollBy$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2161g = f3;
        this.f2162h = interfaceC8901d;
        this.f2163i = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.f2161g, this.f2162h, this.f2163i, interfaceC9968c);
        scrollExtensionsKt$animateScrollBy$2.f2160f = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC9356i interfaceC9356i, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ScrollExtensionsKt$animateScrollBy$2) mo1336a(interfaceC9356i, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2159e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            final InterfaceC9356i interfaceC9356i = (InterfaceC9356i) this.f2160f;
            final Ref$FloatRef ref$FloatRef = this.f2163i;
            InterfaceC2056p<Float, Float, C9072e> interfaceC2056p = new InterfaceC2056p<Float, Float, C9072e>() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(Float f3, Float f10) {
                    float fFloatValue = f3.floatValue();
                    f10.floatValue();
                    Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                    float f11 = ref$FloatRef2.f38124a;
                    ref$FloatRef2.f38124a = interfaceC9356i.mo1442a(fFloatValue - f11) + f11;
                    return C9072e.f47360a;
                }
            };
            this.f2159e = 1;
            if (SuspendAnimationKt.m1355b(this.f2161g, this.f2162h, interfaceC2056p, this) == coroutineSingletons) {
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
