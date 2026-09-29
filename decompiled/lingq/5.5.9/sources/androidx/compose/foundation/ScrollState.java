package androidx.compose.foundation;

import ae.C0062b;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.saveable.SaverKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p081e0.C5310f1;
import p252m0.C7452c;
import p252m0.InterfaceC7453d;
import p338qd.C8573r0;
import p401u.InterfaceC9356i;
import p401u.InterfaceC9357j;
import p423v.C9613k;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollState implements InterfaceC9357j {

    /* JADX INFO: renamed from: i */
    public static final C7452c f1924i = SaverKt.m1859a(new InterfaceC2056p<InterfaceC7453d, ScrollState, Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Integer mo1337m0(InterfaceC7453d interfaceC7453d, ScrollState scrollState) {
            ScrollState scrollState2 = scrollState;
            C5207g.m11111f(interfaceC7453d, "$this$Saver");
            C5207g.m11111f(scrollState2, "it");
            return Integer.valueOf(scrollState2.m1421g());
        }
    }, new InterfaceC2052l<Integer, ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final ScrollState mo528n(Integer num) {
            return new ScrollState(num.intValue());
        }
    });

    /* JADX INFO: renamed from: a */
    public final ParcelableSnapshotMutableState f1925a;

    /* JADX INFO: renamed from: b */
    public final ParcelableSnapshotMutableState f1926b;

    /* JADX INFO: renamed from: c */
    public final C9613k f1927c;

    /* JADX INFO: renamed from: d */
    public final ParcelableSnapshotMutableState f1928d;

    /* JADX INFO: renamed from: e */
    public float f1929e;

    /* JADX INFO: renamed from: f */
    public final DefaultScrollableState f1930f;

    /* JADX INFO: renamed from: g */
    public final DerivedSnapshotState f1931g;

    /* JADX INFO: renamed from: h */
    public final DerivedSnapshotState f1932h;

    public ScrollState(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        C5310f1 c5310f1 = C5310f1.f33583a;
        this.f1925a = C8573r0.m16682K0(numValueOf, c5310f1);
        this.f1926b = C8573r0.m16682K0(0, c5310f1);
        this.f1927c = new C9613k();
        this.f1928d = C8573r0.m16682K0(Integer.MAX_VALUE, c5310f1);
        this.f1930f = new DefaultScrollableState(new InterfaceC2052l<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Float mo528n(Float f3) {
                float fFloatValue = f3.floatValue();
                ScrollState scrollState = this.f1937b;
                float fM1421g = scrollState.m1421g() + fFloatValue + scrollState.f1929e;
                float fM357j0 = C0062b.m357j0(fM1421g, 0.0f, ((Number) scrollState.f1928d.getValue()).intValue());
                boolean z10 = !(fM1421g == fM357j0);
                float fM1421g2 = fM357j0 - scrollState.m1421g();
                int iM16710Y0 = C8573r0.m16710Y0(fM1421g2);
                scrollState.f1925a.setValue(Integer.valueOf(scrollState.m1421g() + iM16710Y0));
                scrollState.f1929e = fM1421g2 - iM16710Y0;
                if (z10) {
                    fFloatValue = fM1421g2;
                }
                return Float.valueOf(fFloatValue);
            }
        });
        this.f1931g = C8573r0.m16713a0(new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Boolean mo807E() {
                ScrollState scrollState = this.f1936b;
                return Boolean.valueOf(scrollState.m1421g() < ((Number) scrollState.f1928d.getValue()).intValue());
            }
        });
        this.f1932h = C8573r0.m16713a0(new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Boolean mo807E() {
                return Boolean.valueOf(this.f1935b.m1421g() > 0);
            }
        });
    }

    @Override // p401u.InterfaceC9357j
    /* JADX INFO: renamed from: a */
    public final boolean mo1416a() {
        return this.f1930f.mo1416a();
    }

    @Override // p401u.InterfaceC9357j
    /* JADX INFO: renamed from: b */
    public final Object mo1417b(MutatePriority mutatePriority, InterfaceC2056p<? super InterfaceC9356i, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo1417b = this.f1930f.mo1417b(mutatePriority, interfaceC2056p, interfaceC9968c);
        return objMo1417b == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1417b : C9072e.f47360a;
    }

    @Override // p401u.InterfaceC9357j
    /* JADX INFO: renamed from: c */
    public final boolean mo1418c() {
        return ((Boolean) this.f1932h.getValue()).booleanValue();
    }

    @Override // p401u.InterfaceC9357j
    /* JADX INFO: renamed from: e */
    public final boolean mo1419e() {
        return ((Boolean) this.f1931g.getValue()).booleanValue();
    }

    @Override // p401u.InterfaceC9357j
    /* JADX INFO: renamed from: f */
    public final float mo1420f(float f3) {
        return this.f1930f.mo1420f(f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final int m1421g() {
        return ((Number) this.f1925a.getValue()).intValue();
    }
}
