package androidx.compose.material.ripple;

import androidx.compose.animation.core.C0369a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.C7864r;
import p260m8.C7499b;
import p338qd.C8573r0;
import p374s.C8905f;
import p375s0.C8941c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class RippleAnimation {

    /* JADX INFO: renamed from: a */
    public C8941c f2590a;

    /* JADX INFO: renamed from: b */
    public final float f2591b;

    /* JADX INFO: renamed from: c */
    public final boolean f2592c;

    /* JADX INFO: renamed from: d */
    public Float f2593d;

    /* JADX INFO: renamed from: e */
    public Float f2594e;

    /* JADX INFO: renamed from: f */
    public C8941c f2595f;

    /* JADX INFO: renamed from: g */
    public final C0369a<Float, C8905f> f2596g = C8573r0.m16735l();

    /* JADX INFO: renamed from: h */
    public final C0369a<Float, C8905f> f2597h = C8573r0.m16735l();

    /* JADX INFO: renamed from: i */
    public final C0369a<Float, C8905f> f2598i = C8573r0.m16735l();

    /* JADX INFO: renamed from: j */
    public final C7864r f2599j = new C7864r(null);

    /* JADX INFO: renamed from: k */
    public final ParcelableSnapshotMutableState f2600k;

    /* JADX INFO: renamed from: l */
    public final ParcelableSnapshotMutableState f2601l;

    public RippleAnimation(C8941c c8941c, float f3, boolean z10) {
        this.f2590a = c8941c;
        this.f2591b = f3;
        this.f2592c = z10;
        Boolean bool = Boolean.FALSE;
        this.f2600k = C8573r0.m16684L0(bool);
        this.f2601l = C8573r0.m16684L0(bool);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: a */
    public final Object m1550a(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        RippleAnimation$animate$1 rippleAnimation$animate$1;
        RippleAnimation rippleAnimation;
        Object objM14963s;
        if (interfaceC9968c instanceof RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (RippleAnimation$animate$1) interfaceC9968c;
            int i10 = rippleAnimation$animate$1.f2605g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.f2605g = i10 - Integer.MIN_VALUE;
            } else {
                rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, interfaceC9968c);
            }
        } else {
            rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, interfaceC9968c);
        }
        Object obj = rippleAnimation$animate$1.f2603e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = rippleAnimation$animate$1.f2605g;
        if (i11 != 0) {
            if (i11 == 1) {
                rippleAnimation = rippleAnimation$animate$1.f2602d;
                C7499b.m14977z0(obj);
            } else if (i11 == 2) {
                rippleAnimation = rippleAnimation$animate$1.f2602d;
                C7499b.m14977z0(obj);
                rippleAnimation$animate$1.f2602d = null;
                rippleAnimation$animate$1.f2605g = 3;
                rippleAnimation.getClass();
                objM14963s = C7499b.m14963s(new RippleAnimation$fadeOut$2(rippleAnimation, null), rippleAnimation$animate$1);
                if (objM14963s != obj2) {
                    objM14963s = C9072e.f47360a;
                }
                if (objM14963s == obj2) {
                    return obj2;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        rippleAnimation$animate$1.f2602d = this;
        rippleAnimation$animate$1.f2605g = 1;
        Object objM14963s2 = C7499b.m14963s(new RippleAnimation$fadeIn$2(this, null), rippleAnimation$animate$1);
        if (objM14963s2 != obj2) {
            objM14963s2 = C9072e.f47360a;
        }
        if (objM14963s2 == obj2) {
            return obj2;
        }
        rippleAnimation = this;
        rippleAnimation.f2600k.setValue(Boolean.TRUE);
        rippleAnimation$animate$1.f2602d = rippleAnimation;
        rippleAnimation$animate$1.f2605g = 2;
        if (rippleAnimation.f2599j.m15612j0(rippleAnimation$animate$1) == obj2) {
            return obj2;
        }
        rippleAnimation$animate$1.f2602d = null;
        rippleAnimation$animate$1.f2605g = 3;
        rippleAnimation.getClass();
        objM14963s = C7499b.m14963s(new RippleAnimation$fadeOut$2(rippleAnimation, null), rippleAnimation$animate$1);
        if (objM14963s != obj2) {
            objM14963s = C9072e.f47360a;
        }
        if (objM14963s == obj2) {
            return obj2;
        }
        return C9072e.f47360a;
    }
}
