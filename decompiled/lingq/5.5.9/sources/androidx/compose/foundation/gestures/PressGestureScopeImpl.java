package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.sync.MutexImpl;
import p260m8.C7499b;
import p401u.InterfaceC9354g;
import p464wl.InterfaceC9968c;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class PressGestureScopeImpl implements InterfaceC9354g, InterfaceC10015c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC10015c f2138a;

    /* JADX INFO: renamed from: b */
    public boolean f2139b;

    /* JADX INFO: renamed from: c */
    public boolean f2140c;

    /* JADX INFO: renamed from: d */
    public final MutexImpl f2141d = new MutexImpl(false);

    public PressGestureScopeImpl(InterfaceC10015c interfaceC10015c) {
        this.f2138a = interfaceC10015c;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: A0 */
    public final float mo1459A0(long j10) {
        return this.f2138a.mo1459A0(j10);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: W */
    public final float mo1460W(int i10) {
        return this.f2138a.mo1460W(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m1461a(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (interfaceC9968c instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) interfaceC9968c;
            int i10 = pressGestureScopeImpl$reset$1.f2145g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.f2145g = i10 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, interfaceC9968c);
            }
        } else {
            pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, interfaceC9968c);
        }
        Object obj = pressGestureScopeImpl$reset$1.f2143e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = pressGestureScopeImpl$reset$1.f2145g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            pressGestureScopeImpl$reset$1.f2142d = this;
            pressGestureScopeImpl$reset$1.f2145g = 1;
            if (this.f2141d.mo14510a(null, pressGestureScopeImpl$reset$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            pressGestureScopeImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pressGestureScopeImpl = pressGestureScopeImpl$reset$1.f2142d;
            C7499b.m14977z0(obj);
        }
        pressGestureScopeImpl.f2139b = false;
        pressGestureScopeImpl.f2140c = false;
        return C9072e.f47360a;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f2138a.mo1462c0();
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f2138a.getDensity();
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: i0 */
    public final float mo1463i0(float f3) {
        return this.f2138a.mo1463i0(f3);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: s0 */
    public final int mo1464s0(float f3) {
        return this.f2138a.mo1464s0(f3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p401u.InterfaceC9354g
    /* JADX INFO: renamed from: x0 */
    public final Object mo1465x0(InterfaceC9968c<? super Boolean> interfaceC9968c) throws Throwable {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (interfaceC9968c instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) interfaceC9968c;
            int i10 = pressGestureScopeImpl$tryAwaitRelease$1.f2149g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.f2149g = i10 - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, interfaceC9968c);
            }
        } else {
            pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, interfaceC9968c);
        }
        Object obj = pressGestureScopeImpl$tryAwaitRelease$1.f2147e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = pressGestureScopeImpl$tryAwaitRelease$1.f2149g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            if (this.f2139b || this.f2140c) {
                pressGestureScopeImpl = this;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1.f2146d = this;
                pressGestureScopeImpl$tryAwaitRelease$1.f2149g = 1;
                if (this.f2141d.mo14510a(null, pressGestureScopeImpl$tryAwaitRelease$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                pressGestureScopeImpl = this;
            }
            return Boolean.valueOf(pressGestureScopeImpl.f2139b);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pressGestureScopeImpl = pressGestureScopeImpl$tryAwaitRelease$1.f2146d;
        C7499b.m14977z0(obj);
        pressGestureScopeImpl.f2141d.mo14511b(null);
        return Boolean.valueOf(pressGestureScopeImpl.f2139b);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: z0 */
    public final long mo1466z0(long j10) {
        return this.f2138a.mo1466z0(j10);
    }
}
