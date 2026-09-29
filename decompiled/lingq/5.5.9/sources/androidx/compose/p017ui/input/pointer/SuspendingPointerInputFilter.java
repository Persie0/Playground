package androidx.compose.p017ui.input.pointer;

import androidx.compose.p017ui.platform.InterfaceC0647n1;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import no.C7828f;
import no.C7843k;
import no.C7848l1;
import no.C7856o0;
import no.InterfaceC7840j;
import no.InterfaceC7882z;
import p060d1.AbstractC5033t;
import p060d1.C5024k;
import p060d1.C5028o;
import p060d1.InterfaceC5016c;
import p060d1.InterfaceC5034u;
import p060d1.InterfaceC5035v;
import p105f0.C5458f;
import p260m8.C7499b;
import p338qd.C8573r0;
import p338qd.C8584v;
import p349qo.C8656b;
import p375s0.C8941c;
import p375s0.C8944f;
import p464wl.C9970e;
import p464wl.InterfaceC9968c;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendingPointerInputFilter extends AbstractC5033t implements InterfaceC5034u, InterfaceC5035v, InterfaceC10015c {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0647n1 f3607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC10015c f3608c;

    /* JADX INFO: renamed from: d */
    public C5024k f3609d;

    /* JADX INFO: renamed from: e */
    public final C5458f<PointerEventHandlerCoroutine<?>> f3610e;

    /* JADX INFO: renamed from: f */
    public final C5458f<PointerEventHandlerCoroutine<?>> f3611f;

    /* JADX INFO: renamed from: g */
    public C5024k f3612g;

    /* JADX INFO: renamed from: h */
    public long f3613h;

    /* JADX INFO: renamed from: i */
    public InterfaceC7882z f3614i;

    public final class PointerEventHandlerCoroutine<R> implements InterfaceC5016c, InterfaceC10015c, InterfaceC9968c<R> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<R> f3615a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SuspendingPointerInputFilter f3616b;

        /* JADX INFO: renamed from: c */
        public InterfaceC7840j<? super C5024k> f3617c;

        /* JADX INFO: renamed from: d */
        public PointerEventPass f3618d = PointerEventPass.Main;

        /* JADX INFO: renamed from: e */
        public final EmptyCoroutineContext f3619e = EmptyCoroutineContext.f38093a;

        public PointerEventHandlerCoroutine(C7843k c7843k) {
            this.f3615a = c7843k;
            this.f3616b = SuspendingPointerInputFilter.this;
        }

        @Override // p470x1.InterfaceC10015c
        /* JADX INFO: renamed from: A0 */
        public final float mo1459A0(long j10) {
            return this.f3616b.mo1459A0(j10);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [no.v0] */
        /* JADX WARN: Type inference failed for: r11v4, types: [no.v0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p060d1.InterfaceC5016c
        /* JADX INFO: renamed from: F */
        public final <T> Object mo2025F(long j10, InterfaceC2056p<? super InterfaceC5016c, ? super InterfaceC9968c<? super T>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super T> interfaceC9968c) throws Throwable {
            C0515xffebe5e8 c0515xffebe5e8;
            InterfaceC7840j<? super C5024k> interfaceC7840j;
            if (interfaceC9968c instanceof C0515xffebe5e8) {
                c0515xffebe5e8 = (C0515xffebe5e8) interfaceC9968c;
                int i10 = c0515xffebe5e8.f3624g;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0515xffebe5e8.f3624g = i10 - Integer.MIN_VALUE;
                } else {
                    c0515xffebe5e8 = new C0515xffebe5e8(this, interfaceC9968c);
                }
            } else {
                c0515xffebe5e8 = new C0515xffebe5e8(this, interfaceC9968c);
            }
            Object objMo1337m0 = c0515xffebe5e8.f3622e;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = c0515xffebe5e8.f3624g;
            try {
                if (i11 == 0) {
                    C7499b.m14977z0(objMo1337m0);
                    if (j10 <= 0 && (interfaceC7840j = this.f3617c) != null) {
                        interfaceC7840j.mo2031y(C7499b.m14967u(new PointerEventTimeoutCancellationException(j10)));
                    }
                    C7848l1 c7848l1M15570d = C7828f.m15570d(SuspendingPointerInputFilter.this.f3614i, null, null, new C0516xbd8dd741(j10, this, null), 3);
                    c0515xffebe5e8.f3621d = c7848l1M15570d;
                    c0515xffebe5e8.f3624g = 1;
                    objMo1337m0 = interfaceC2056p.mo1337m0(this, c0515xffebe5e8);
                    j10 = c7848l1M15570d;
                    if (objMo1337m0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7848l1 c7848l1 = c0515xffebe5e8.f3621d;
                    C7499b.m14977z0(objMo1337m0);
                    j10 = c7848l1;
                }
                j10.mo15618a(null);
                return objMo1337m0;
            } catch (Throwable th2) {
                j10.mo15618a(null);
                throw th2;
            }
        }

        @Override // p060d1.InterfaceC5016c
        /* JADX INFO: renamed from: H */
        public final Object mo2026H(PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
            C7843k c7843k = new C7843k(1, C8656b.m16874A(baseContinuationImpl));
            c7843k.m15594r();
            this.f3618d = pointerEventPass;
            this.f3617c = c7843k;
            Object objM15593p = c7843k.m15593p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return objM15593p;
        }

        @Override // p060d1.InterfaceC5016c
        /* JADX INFO: renamed from: I */
        public final C5024k mo2027I() {
            return SuspendingPointerInputFilter.this.f3609d;
        }

        @Override // p470x1.InterfaceC10015c
        /* JADX INFO: renamed from: W */
        public final float mo1460W(int i10) {
            return this.f3616b.mo1460W(i10);
        }

        @Override // p060d1.InterfaceC5016c
        /* JADX INFO: renamed from: c */
        public final long mo2028c() {
            return SuspendingPointerInputFilter.this.f3613h;
        }

        @Override // p470x1.InterfaceC10015c
        /* JADX INFO: renamed from: c0 */
        public final float mo1462c0() {
            return this.f3616b.mo1462c0();
        }

        @Override // p464wl.InterfaceC9968c
        /* JADX INFO: renamed from: e */
        public final CoroutineContext mo2029e() {
            return this.f3619e;
        }

        @Override // p470x1.InterfaceC10015c
        public final float getDensity() {
            return this.f3616b.getDensity();
        }

        @Override // p060d1.InterfaceC5016c
        public final InterfaceC0647n1 getViewConfiguration() {
            return SuspendingPointerInputFilter.this.f3607b;
        }

        @Override // p470x1.InterfaceC10015c
        /* JADX INFO: renamed from: i0 */
        public final float mo1463i0(float f3) {
            return this.f3616b.mo1463i0(f3);
        }

        @Override // p060d1.InterfaceC5016c
        /* JADX INFO: renamed from: n0 */
        public final long mo2030n0() {
            SuspendingPointerInputFilter suspendingPointerInputFilter = SuspendingPointerInputFilter.this;
            long jMo1466z0 = suspendingPointerInputFilter.mo1466z0(suspendingPointerInputFilter.f3607b.mo2138b());
            long jM10717c = suspendingPointerInputFilter.m10717c();
            return C8584v.m16788m(Math.max(0.0f, C8944f.m17177d(jMo1466z0) - ((int) (jM10717c >> 32))) / 2.0f, Math.max(0.0f, C8944f.m17175b(jMo1466z0) - C10022j.m18628b(jM10717c)) / 2.0f);
        }

        @Override // p470x1.InterfaceC10015c
        /* JADX INFO: renamed from: s0 */
        public final int mo1464s0(float f3) {
            return this.f3616b.mo1464s0(f3);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p464wl.InterfaceC9968c
        /* JADX INFO: renamed from: y */
        public final void mo2031y(Object obj) {
            SuspendingPointerInputFilter suspendingPointerInputFilter = SuspendingPointerInputFilter.this;
            synchronized (suspendingPointerInputFilter.f3610e) {
                suspendingPointerInputFilter.f3610e.m11696m(this);
                C9072e c9072e = C9072e.f47360a;
            }
            this.f3615a.mo2031y(obj);
        }

        @Override // p470x1.InterfaceC10015c
        /* JADX INFO: renamed from: z0 */
        public final long mo1466z0(long j10) {
            return this.f3616b.mo1466z0(j10);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$a */
    public /* synthetic */ class C0517a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3628a;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3628a = iArr;
        }
    }

    public SuspendingPointerInputFilter(InterfaceC0647n1 interfaceC0647n1, InterfaceC10015c interfaceC10015c) {
        C5207g.m11111f(interfaceC0647n1, "viewConfiguration");
        C5207g.m11111f(interfaceC10015c, "density");
        this.f3607b = interfaceC0647n1;
        this.f3608c = interfaceC10015c;
        this.f3609d = SuspendingPointerInputFilterKt.f3630a;
        this.f3610e = new C5458f<>(new PointerEventHandlerCoroutine[16]);
        this.f3611f = new C5458f<>(new PointerEventHandlerCoroutine[16]);
        this.f3613h = 0L;
        this.f3614i = C7856o0.f42953a;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: A0 */
    public final float mo1459A0(long j10) {
        return this.f3608c.mo1459A0(j10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p060d1.InterfaceC5035v
    /* JADX INFO: renamed from: D0 */
    public final <R> Object mo2020D0(InterfaceC2056p<? super InterfaceC5016c, ? super InterfaceC9968c<? super R>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super R> interfaceC9968c) {
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(c7843k);
        synchronized (this.f3610e) {
            try {
                this.f3610e.m11687b(pointerEventHandlerCoroutine);
                new C9970e(CoroutineSingletons.COROUTINE_SUSPENDED, C8656b.m16874A(C8656b.m16908p(interfaceC2056p, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine))).mo2031y(C9072e.f47360a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th3) {
                Throwable th4 = th3;
                SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                InterfaceC7840j<? super C5024k> interfaceC7840j = pointerEventHandlerCoroutine2.f3617c;
                if (interfaceC7840j != null) {
                    interfaceC7840j.mo15583t0(th4);
                }
                pointerEventHandlerCoroutine2.f3617c = null;
                return C9072e.f47360a;
            }
        });
        return c7843k.m15593p();
    }

    /* JADX INFO: renamed from: E */
    public final void m2021E(C5024k c5024k, PointerEventPass pointerEventPass, long j10) {
        C5207g.m11111f(pointerEventPass, "pass");
        this.f3613h = j10;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f3609d = c5024k;
        }
        m2023h(c5024k, pointerEventPass);
        List<C5028o> list = c5024k.f32832a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!C8573r0.m16677I(list.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (!(!z10)) {
            c5024k = null;
        }
        this.f3612g = c5024k;
    }

    @Override // p060d1.InterfaceC5034u
    /* JADX INFO: renamed from: V */
    public final SuspendingPointerInputFilter mo2022V() {
        return this;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: W */
    public final float mo1460W(int i10) {
        return this.f3608c.mo1460W(i10);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f3608c.mo1462c0();
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f3608c.getDensity();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: h */
    public final void m2023h(C5024k c5024k, PointerEventPass pointerEventPass) {
        InterfaceC7840j<? super C5024k> interfaceC7840j;
        C5458f<PointerEventHandlerCoroutine<?>> c5458f;
        int i10;
        InterfaceC7840j<? super C5024k> interfaceC7840j2;
        synchronized (this.f3610e) {
            C5458f<PointerEventHandlerCoroutine<?>> c5458f2 = this.f3611f;
            c5458f2.m11688e(c5458f2.f34019c, this.f3610e);
        }
        try {
            int i11 = C0517a.f3628a[pointerEventPass.ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3 && (i10 = (c5458f = this.f3611f).f34019c) > 0) {
                    int i12 = i10 - 1;
                    PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = c5458f.f34017a;
                    do {
                        PointerEventHandlerCoroutine<?> pointerEventHandlerCoroutine = pointerEventHandlerCoroutineArr[i12];
                        pointerEventHandlerCoroutine.getClass();
                        if (pointerEventPass == pointerEventHandlerCoroutine.f3618d && (interfaceC7840j2 = pointerEventHandlerCoroutine.f3617c) != null) {
                            pointerEventHandlerCoroutine.f3617c = null;
                            interfaceC7840j2.mo2031y(c5024k);
                        }
                        i12--;
                    } while (i12 >= 0);
                }
                this.f3611f.m11691h();
            }
            C5458f<PointerEventHandlerCoroutine<?>> c5458f3 = this.f3611f;
            int i13 = c5458f3.f34019c;
            if (i13 > 0) {
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = c5458f3.f34017a;
                int i14 = 0;
                do {
                    PointerEventHandlerCoroutine<?> pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutineArr2[i14];
                    pointerEventHandlerCoroutine2.getClass();
                    if (pointerEventPass == pointerEventHandlerCoroutine2.f3618d && (interfaceC7840j = pointerEventHandlerCoroutine2.f3617c) != null) {
                        pointerEventHandlerCoroutine2.f3617c = null;
                        interfaceC7840j.mo2031y(c5024k);
                    }
                    i14++;
                } while (i14 < i13);
            }
            this.f3611f.m11691h();
        } catch (Throwable th2) {
            this.f3611f.m11691h();
            throw th2;
        }
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: i0 */
    public final float mo1463i0(float f3) {
        return this.f3608c.mo1463i0(f3);
    }

    /* JADX INFO: renamed from: n */
    public final void m2024n() {
        boolean z10;
        C5024k c5024k = this.f3612g;
        if (c5024k == null) {
            return;
        }
        List<C5028o> list = c5024k.f32832a;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            z10 = true;
            if (i11 >= size) {
                break;
            }
            if (!(true ^ list.get(i11).f32838d)) {
                z10 = false;
                break;
            }
            i11++;
        }
        if (z10) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        while (i10 < size2) {
            C5028o c5028o = list.get(i10);
            long j10 = c5028o.f32835a;
            long j11 = c5028o.f32837c;
            long j12 = c5028o.f32836b;
            Float f3 = c5028o.f32844j;
            float fFloatValue = f3 != null ? f3.floatValue() : 0.0f;
            long j13 = c5028o.f32837c;
            long j14 = c5028o.f32836b;
            boolean z11 = c5028o.f32838d;
            arrayList.add(new C5028o(j10, j12, j11, false, fFloatValue, j14, j13, z11, z11, 1, C8941c.f46888b));
            i10++;
            list = list;
        }
        C5024k c5024k2 = new C5024k(arrayList);
        this.f3609d = c5024k2;
        m2023h(c5024k2, PointerEventPass.Initial);
        m2023h(c5024k2, PointerEventPass.Main);
        m2023h(c5024k2, PointerEventPass.Final);
        this.f3612g = null;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: s0 */
    public final int mo1464s0(float f3) {
        return this.f3608c.mo1464s0(f3);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: z0 */
    public final long mo1466z0(long j10) {
        return this.f3608c.mo1466z0(j10);
    }
}
