package androidx.compose.material3;

import androidx.compose.animation.core.C0369a;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p374s.C8905f;
import p464wl.InterfaceC9968c;
import p470x1.C10017e;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.material3.ButtonElevation$animateElevation$2", m19206f = "Button.kt", m19207l = {855}, m19208m = "invokeSuspend")
final class ButtonElevation$animateElevation$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2660e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0369a<C10017e, C8905f> f2661f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f2662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2(C0369a<C10017e, C8905f> c0369a, float f3, InterfaceC9968c<? super ButtonElevation$animateElevation$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2661f = c0369a;
        this.f2662g = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ButtonElevation$animateElevation$2(this.f2661f, this.f2662g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ButtonElevation$animateElevation$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2660e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C10017e c10017e = new C10017e(this.f2662g);
            this.f2660e = 1;
            if (this.f2661f.m1384d(c10017e, this) == coroutineSingletons) {
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
