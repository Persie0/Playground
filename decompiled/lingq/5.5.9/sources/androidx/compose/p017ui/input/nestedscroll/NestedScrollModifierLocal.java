package androidx.compose.p017ui.input.nestedscroll;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2041a;
import dm.C5207g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.InterfaceC7882z;
import p037c1.InterfaceC1657a;
import p142h1.C5877h;
import p142h1.InterfaceC5873d;
import p142h1.InterfaceC5875f;
import p142h1.InterfaceC5876g;
import p260m8.C7499b;
import p338qd.C8573r0;
import p375s0.C8941c;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollModifierLocal implements InterfaceC5873d, InterfaceC5875f<NestedScrollModifierLocal>, InterfaceC1657a {

    /* JADX INFO: renamed from: a */
    public final NestedScrollDispatcher f3590a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1657a f3591b;

    /* JADX INFO: renamed from: c */
    public final ParcelableSnapshotMutableState f3592c;

    public NestedScrollModifierLocal(InterfaceC1657a interfaceC1657a, NestedScrollDispatcher nestedScrollDispatcher) {
        C5207g.m11111f(interfaceC1657a, "connection");
        this.f3590a = nestedScrollDispatcher;
        this.f3591b = interfaceC1657a;
        nestedScrollDispatcher.f3578a = new InterfaceC2041a<InterfaceC7882z>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC7882z mo807E() {
                return NestedScrollModifierLocal.this.m2018k();
            }
        };
        this.f3592c = C8573r0.m16684L0(null);
    }

    @Override // p142h1.InterfaceC5873d
    /* JADX INFO: renamed from: X */
    public final void mo1428X(InterfaceC5876g interfaceC5876g) {
        C5207g.m11111f(interfaceC5876g, "scope");
        this.f3592c.setValue((NestedScrollModifierLocal) interfaceC5876g.mo2083c(NestedScrollModifierLocalKt.f3605a));
        this.f3590a.f3580c = m2019l();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p037c1.InterfaceC1657a
    /* JADX INFO: renamed from: c */
    public final Object mo1476c(long j10, long j11, InterfaceC9968c<? super C10025m> interfaceC9968c) throws Throwable {
        NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$1;
        long j12;
        long j13;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        long j14;
        long j15;
        long j16;
        if (interfaceC9968c instanceof NestedScrollModifierLocal$onPostFling$1) {
            nestedScrollModifierLocal$onPostFling$1 = (NestedScrollModifierLocal$onPostFling$1) interfaceC9968c;
            int i10 = nestedScrollModifierLocal$onPostFling$1.f3599i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPostFling$1.f3599i = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, interfaceC9968c);
            }
        } else {
            nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, interfaceC9968c);
        }
        Object objMo1476c = nestedScrollModifierLocal$onPostFling$1.f3597g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = nestedScrollModifierLocal$onPostFling$1.f3599i;
        if (i11 != 0) {
            if (i11 == 1) {
                long j17 = nestedScrollModifierLocal$onPostFling$1.f3596f;
                long j18 = nestedScrollModifierLocal$onPostFling$1.f3595e;
                nestedScrollModifierLocal = nestedScrollModifierLocal$onPostFling$1.f3594d;
                C7499b.m14977z0(objMo1476c);
                j13 = j17;
                j12 = j18;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j16 = nestedScrollModifierLocal$onPostFling$1.f3595e;
                C7499b.m14977z0(objMo1476c);
            }
            j14 = ((C10025m) objMo1476c).f50987a;
            j15 = j16;
            return new C10025m(C10025m.m18639e(j15, j14));
        }
        C7499b.m14977z0(objMo1476c);
        InterfaceC1657a interfaceC1657a = this.f3591b;
        nestedScrollModifierLocal$onPostFling$1.f3594d = this;
        j12 = j10;
        nestedScrollModifierLocal$onPostFling$1.f3595e = j12;
        j13 = j11;
        nestedScrollModifierLocal$onPostFling$1.f3596f = j13;
        nestedScrollModifierLocal$onPostFling$1.f3599i = 1;
        objMo1476c = interfaceC1657a.mo1476c(j10, j11, nestedScrollModifierLocal$onPostFling$1);
        if (objMo1476c == coroutineSingletons) {
            return coroutineSingletons;
        }
        nestedScrollModifierLocal = this;
        long j19 = ((C10025m) objMo1476c).f50987a;
        NestedScrollModifierLocal nestedScrollModifierLocalM2019l = nestedScrollModifierLocal.m2019l();
        if (nestedScrollModifierLocalM2019l != null) {
            long jM18639e = C10025m.m18639e(j12, j19);
            long jM18638d = C10025m.m18638d(j13, j19);
            nestedScrollModifierLocal$onPostFling$1.f3594d = null;
            nestedScrollModifierLocal$onPostFling$1.f3595e = j19;
            nestedScrollModifierLocal$onPostFling$1.f3599i = 2;
            objMo1476c = nestedScrollModifierLocalM2019l.mo1476c(jM18639e, jM18638d, nestedScrollModifierLocal$onPostFling$1);
            if (objMo1476c == coroutineSingletons) {
                return coroutineSingletons;
            }
            j16 = j19;
            j14 = ((C10025m) objMo1476c).f50987a;
            j15 = j16;
        } else {
            j14 = C10025m.f50985b;
            j15 = j19;
        }
        return new C10025m(C10025m.m18639e(j15, j14));
    }

    @Override // p037c1.InterfaceC1657a
    /* JADX INFO: renamed from: d */
    public final long mo1477d(int i10, long j10) {
        long jMo1477d;
        NestedScrollModifierLocal nestedScrollModifierLocalM2019l = m2019l();
        if (nestedScrollModifierLocalM2019l != null) {
            jMo1477d = nestedScrollModifierLocalM2019l.mo1477d(i10, j10);
        } else {
            int i11 = C8941c.f46891e;
            jMo1477d = C8941c.f46888b;
        }
        return C8941c.m17167f(jMo1477d, this.f3591b.mo1477d(i10, C8941c.m17166e(j10, jMo1477d)));
    }

    @Override // p142h1.InterfaceC5875f
    public final C5877h<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.f3605a;
    }

    @Override // p142h1.InterfaceC5875f
    public final NestedScrollModifierLocal getValue() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p037c1.InterfaceC1657a
    /* JADX INFO: renamed from: h */
    public final Object mo2017h(long j10, InterfaceC9968c<? super C10025m> interfaceC9968c) throws Throwable {
        NestedScrollModifierLocal$onPreFling$1 nestedScrollModifierLocal$onPreFling$1;
        long j11;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        long j12;
        if (interfaceC9968c instanceof NestedScrollModifierLocal$onPreFling$1) {
            nestedScrollModifierLocal$onPreFling$1 = (NestedScrollModifierLocal$onPreFling$1) interfaceC9968c;
            int i10 = nestedScrollModifierLocal$onPreFling$1.f3604h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPreFling$1.f3604h = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling$1(this, interfaceC9968c);
            }
        } else {
            nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling$1(this, interfaceC9968c);
        }
        Object objMo2017h = nestedScrollModifierLocal$onPreFling$1.f3602f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = nestedScrollModifierLocal$onPreFling$1.f3604h;
        if (i11 != 0) {
            if (i11 == 1) {
                j10 = nestedScrollModifierLocal$onPreFling$1.f3601e;
                nestedScrollModifierLocal = nestedScrollModifierLocal$onPreFling$1.f3600d;
                C7499b.m14977z0(objMo2017h);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = nestedScrollModifierLocal$onPreFling$1.f3601e;
                C7499b.m14977z0(objMo2017h);
            }
            return new C10025m(C10025m.m18639e(j12, ((C10025m) objMo2017h).f50987a));
        }
        C7499b.m14977z0(objMo2017h);
        NestedScrollModifierLocal nestedScrollModifierLocalM2019l = m2019l();
        if (nestedScrollModifierLocalM2019l != null) {
            nestedScrollModifierLocal$onPreFling$1.f3600d = this;
            nestedScrollModifierLocal$onPreFling$1.f3601e = j10;
            nestedScrollModifierLocal$onPreFling$1.f3604h = 1;
            objMo2017h = nestedScrollModifierLocalM2019l.mo2017h(j10, nestedScrollModifierLocal$onPreFling$1);
            if (objMo2017h == coroutineSingletons) {
                return coroutineSingletons;
            }
            nestedScrollModifierLocal = this;
        } else {
            j11 = C10025m.f50985b;
            nestedScrollModifierLocal = this;
        }
        InterfaceC1657a interfaceC1657a = nestedScrollModifierLocal.f3591b;
        long jM18638d = C10025m.m18638d(j10, j11);
        nestedScrollModifierLocal$onPreFling$1.f3600d = null;
        nestedScrollModifierLocal$onPreFling$1.f3601e = j11;
        nestedScrollModifierLocal$onPreFling$1.f3604h = 2;
        objMo2017h = interfaceC1657a.mo2017h(jM18638d, nestedScrollModifierLocal$onPreFling$1);
        if (objMo2017h == coroutineSingletons) {
            return coroutineSingletons;
        }
        j12 = j11;
        return new C10025m(C10025m.m18639e(j12, ((C10025m) objMo2017h).f50987a));
        j11 = ((C10025m) objMo2017h).f50987a;
        InterfaceC1657a interfaceC1657a2 = nestedScrollModifierLocal.f3591b;
        long jM18638d2 = C10025m.m18638d(j10, j11);
        nestedScrollModifierLocal$onPreFling$1.f3600d = null;
        nestedScrollModifierLocal$onPreFling$1.f3601e = j11;
        nestedScrollModifierLocal$onPreFling$1.f3604h = 2;
        objMo2017h = interfaceC1657a2.mo2017h(jM18638d2, nestedScrollModifierLocal$onPreFling$1);
        if (objMo2017h == coroutineSingletons) {
            return coroutineSingletons;
        }
        j12 = j11;
        return new C10025m(C10025m.m18639e(j12, ((C10025m) objMo2017h).f50987a));
    }

    @Override // p037c1.InterfaceC1657a
    /* JADX INFO: renamed from: i */
    public final long mo1478i(int i10, long j10, long j11) {
        long jMo1478i;
        long jMo1478i2 = this.f3591b.mo1478i(i10, j10, j11);
        NestedScrollModifierLocal nestedScrollModifierLocalM2019l = m2019l();
        if (nestedScrollModifierLocalM2019l != null) {
            jMo1478i = nestedScrollModifierLocalM2019l.mo1478i(i10, C8941c.m17167f(j10, jMo1478i2), C8941c.m17166e(j11, jMo1478i2));
        } else {
            int i11 = C8941c.f46891e;
            jMo1478i = C8941c.f46888b;
        }
        return C8941c.m17167f(jMo1478i2, jMo1478i);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final InterfaceC7882z m2018k() {
        InterfaceC7882z interfaceC7882zM2018k;
        NestedScrollModifierLocal nestedScrollModifierLocalM2019l = m2019l();
        if ((nestedScrollModifierLocalM2019l == null || (interfaceC7882zM2018k = nestedScrollModifierLocalM2019l.m2018k()) == null) && (interfaceC7882zM2018k = this.f3590a.f3579b) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return interfaceC7882zM2018k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final NestedScrollModifierLocal m2019l() {
        return (NestedScrollModifierLocal) this.f3592c.getValue();
    }
}
