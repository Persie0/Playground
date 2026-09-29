package androidx.compose.material3;

import androidx.compose.animation.core.C0369a;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p036c0.C1651g;
import p260m8.C7499b;
import p374s.C8905f;
import p375s0.C8941c;
import p423v.C9606d;
import p423v.C9608f;
import p423v.C9615m;
import p423v.InterfaceC9610h;
import p464wl.InterfaceC9968c;
import p470x1.C10017e;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.material3.ButtonElevation$animateElevation$3", m19206f = "Button.kt", m19207l = {864}, m19208m = "invokeSuspend")
final class ButtonElevation$animateElevation$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2663e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0369a<C10017e, C8905f> f2664f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0462a f2665g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f2666h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC9610h f2667i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$3(C0369a<C10017e, C8905f> c0369a, C0462a c0462a, float f3, InterfaceC9610h interfaceC9610h, InterfaceC9968c<? super ButtonElevation$animateElevation$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2664f = c0369a;
        this.f2665g = c0462a;
        this.f2666h = f3;
        this.f2667i = interfaceC9610h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ButtonElevation$animateElevation$3(this.f2664f, this.f2665g, this.f2666h, this.f2667i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ButtonElevation$animateElevation$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC9610h c9606d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2663e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0369a<C10017e, C8905f> c0369a = this.f2664f;
            float f3 = ((C10017e) c0369a.f1657e.getValue()).f50966a;
            C0462a c0462a = this.f2665g;
            if (C10017e.m18618a(f3, c0462a.f2860b)) {
                c9606d = new C9615m(C8941c.f46888b);
            } else if (C10017e.m18618a(f3, c0462a.f2862d)) {
                c9606d = new C9608f();
            } else {
                c9606d = C10017e.m18618a(f3, c0462a.f2861c) ? new C9606d() : null;
            }
            this.f2663e = 1;
            if (C1651g.m5369a(c0369a, this.f2666h, c9606d, this.f2667i, this) == coroutineSingletons) {
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
