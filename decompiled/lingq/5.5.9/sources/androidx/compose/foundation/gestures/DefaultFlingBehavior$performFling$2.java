package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p374s.C8899c;
import p374s.C8903e;
import p374s.C8905f;
import p374s.InterfaceC8921n;
import p401u.InterfaceC9356i;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m19206f = "Scrollable.kt", m19207l = {545}, m19208m = "invokeSuspend")
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Float>, Object> {

    /* JADX INFO: renamed from: e */
    public Ref$FloatRef f1980e;

    /* JADX INFO: renamed from: f */
    public int f1981f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f1982g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0413b f1983h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC9356i f1984i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f3, C0413b c0413b, InterfaceC9356i interfaceC9356i, InterfaceC9968c<? super DefaultFlingBehavior$performFling$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1982g = f3;
        this.f1983h = c0413b;
        this.f1984i = interfaceC9356i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DefaultFlingBehavior$performFling$2(this.f1982g, this.f1983h, this.f1984i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Float> interfaceC9968c) {
        return ((DefaultFlingBehavior$performFling$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        float f3;
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1981f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            f3 = this.f1982g;
            if (Math.abs(f3) > 1.0f) {
                final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                ref$FloatRef2.f38124a = f3;
                final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                C8903e c8903e = new C8903e(VectorConvertersKt.f1626a, Float.valueOf(0.0f), new C8905f(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
                final C0413b c0413b = this.f1983h;
                InterfaceC8921n<Float> interfaceC8921n = c0413b.f2286a;
                final InterfaceC9356i interfaceC9356i = this.f1984i;
                InterfaceC2052l<C8899c<Float, C8905f>, C9072e> interfaceC2052l = new InterfaceC2052l<C8899c<Float, C8905f>, C9072e>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C8899c<Float, C8905f> c8899c) {
                        C8899c<Float, C8905f> c8899c2 = c8899c;
                        C5207g.m11111f(c8899c2, "$this$animateDecay");
                        float fFloatValue = c8899c2.m17133a().floatValue();
                        Ref$FloatRef ref$FloatRef4 = ref$FloatRef3;
                        float f10 = fFloatValue - ref$FloatRef4.f38124a;
                        float fMo1442a = interfaceC9356i.mo1442a(f10);
                        ref$FloatRef4.f38124a = c8899c2.m17133a().floatValue();
                        ref$FloatRef2.f38124a = ((Number) c8899c2.f46787a.mo17141b().mo528n(c8899c2.f46792f)).floatValue();
                        if (Math.abs(f10 - fMo1442a) > 0.5f) {
                            c8899c2.f46795i.setValue(Boolean.FALSE);
                            c8899c2.f46790d.mo807E();
                        }
                        c0413b.getClass();
                        return C9072e.f47360a;
                    }
                };
                this.f1980e = ref$FloatRef2;
                this.f1981f = 1;
                if (SuspendAnimationKt.m1356c(c8903e, interfaceC8921n, interfaceC2052l, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$FloatRef = ref$FloatRef2;
            }
            return new Float(f3);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$FloatRef = this.f1980e;
        C7499b.m14977z0(obj);
        f3 = ref$FloatRef.f38124a;
        return new Float(f3);
    }
}
