package androidx.compose.material.ripple;

import androidx.compose.animation.core.C0369a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p021b0.C1286k;
import p260m8.C7499b;
import p374s.C8905f;
import p374s.InterfaceC8901d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", m19206f = "Ripple.kt", m19207l = {290}, m19208m = "invokeSuspend")
final class StateLayer$handleInteraction$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2622e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1286k f2623f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f2624g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC8901d<Float> f2625h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayer$handleInteraction$1(C1286k c1286k, float f3, InterfaceC8901d<Float> interfaceC8901d, InterfaceC9968c<? super StateLayer$handleInteraction$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2623f = c1286k;
        this.f2624g = f3;
        this.f2625h = interfaceC8901d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new StateLayer$handleInteraction$1(this.f2623f, this.f2624g, this.f2625h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StateLayer$handleInteraction$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2622e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0369a<Float, C8905f> c0369a = this.f2623f.f7980c;
            Float f3 = new Float(this.f2624g);
            this.f2622e = 1;
            if (C0369a.m1382b(c0369a, f3, this.f2625h, this) == coroutineSingletons) {
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
