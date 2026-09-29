package androidx.compose.material.ripple;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p423v.C9615m;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", m19206f = "CommonRipple.kt", m19207l = {87}, m19208m = "invokeSuspend")
public final class CommonRippleIndicationInstance$addRipple$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2580e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RippleAnimation f2581f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CommonRippleIndicationInstance f2582g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C9615m f2583h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance$addRipple$2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, C9615m c9615m, InterfaceC9968c<? super CommonRippleIndicationInstance$addRipple$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2581f = rippleAnimation;
        this.f2582g = commonRippleIndicationInstance;
        this.f2583h = c9615m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CommonRippleIndicationInstance$addRipple$2(this.f2581f, this.f2582g, this.f2583h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CommonRippleIndicationInstance$addRipple$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2580e;
        C9615m c9615m = this.f2583h;
        CommonRippleIndicationInstance commonRippleIndicationInstance = this.f2582g;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                RippleAnimation rippleAnimation = this.f2581f;
                this.f2580e = 1;
                if (rippleAnimation.m1550a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            commonRippleIndicationInstance.f2579f.remove(c9615m);
            return C9072e.f47360a;
        } catch (Throwable th2) {
            commonRippleIndicationInstance.f2579f.remove(c9615m);
            throw th2;
        }
    }
}
