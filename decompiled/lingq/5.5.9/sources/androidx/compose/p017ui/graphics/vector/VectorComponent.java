package androidx.compose.p017ui.graphics.vector;

import android.graphics.Canvas;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import p338qd.C8573r0;
import p375s0.C8944f;
import p385sf.C9000b;
import p387t0.C9139d;
import p387t0.C9141e;
import p387t0.C9143f;
import p387t0.C9145g;
import p387t0.C9155l;
import p387t0.C9169u;
import p387t0.C9170v;
import p387t0.InterfaceC9165q;
import p402u0.C9363f;
import p402u0.C9374q;
import p424v0.C9617a;
import p424v0.InterfaceC9621e;
import p469x0.AbstractC10005f;
import p469x0.C10000a;
import p469x0.C10001b;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class VectorComponent extends AbstractC10005f {

    /* JADX INFO: renamed from: b */
    public final C10001b f3470b;

    /* JADX INFO: renamed from: c */
    public boolean f3471c;

    /* JADX INFO: renamed from: d */
    public final C10000a f3472d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2041a<C9072e> f3473e;

    /* JADX INFO: renamed from: f */
    public final ParcelableSnapshotMutableState f3474f;

    /* JADX INFO: renamed from: g */
    public float f3475g;

    /* JADX INFO: renamed from: h */
    public float f3476h;

    /* JADX INFO: renamed from: i */
    public long f3477i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2052l<InterfaceC9621e, C9072e> f3478j;

    public VectorComponent() {
        C10001b c10001b = new C10001b();
        c10001b.f50827k = 0.0f;
        c10001b.f50833q = true;
        c10001b.m18593c();
        c10001b.f50828l = 0.0f;
        c10001b.f50833q = true;
        c10001b.m18593c();
        c10001b.mo18584d(new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$root$1$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                VectorComponent vectorComponent = this.f3481b;
                vectorComponent.f3471c = true;
                vectorComponent.f3473e.mo807E();
                return C9072e.f47360a;
            }
        });
        this.f3470b = c10001b;
        this.f3471c = true;
        this.f3472d = new C10000a();
        this.f3473e = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final /* bridge */ /* synthetic */ C9072e mo807E() {
                return C9072e.f47360a;
            }
        };
        this.f3474f = C8573r0.m16684L0(null);
        this.f3477i = C8944f.f46907c;
        this.f3478j = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // p469x0.AbstractC10005f
    /* JADX INFO: renamed from: a */
    public final void mo2002a(InterfaceC9621e interfaceC9621e) {
        C5207g.m11111f(interfaceC9621e, "<this>");
        m2004e(interfaceC9621e, 1.0f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m2004e(InterfaceC9621e interfaceC9621e, float f3, C9170v c9170v) {
        boolean z10;
        C5207g.m11111f(interfaceC9621e, "<this>");
        C9170v c9170v2 = c9170v != null ? c9170v : (C9170v) this.f3474f.getValue();
        boolean z11 = this.f3471c;
        C10000a c10000a = this.f3472d;
        if (z11 || !C8944f.m17174a(this.f3477i, interfaceC9621e.mo12674d())) {
            float fM17177d = C8944f.m17177d(interfaceC9621e.mo12674d()) / this.f3475g;
            C10001b c10001b = this.f3470b;
            c10001b.f50829m = fM17177d;
            c10001b.f50833q = true;
            c10001b.m18593c();
            c10001b.f50830n = C8944f.m17175b(interfaceC9621e.mo12674d()) / this.f3476h;
            c10001b.f50833q = true;
            c10001b.m18593c();
            long jM17236a = C9000b.m17236a((int) Math.ceil(C8944f.m17177d(interfaceC9621e.mo12674d())), (int) Math.ceil(C8944f.m17175b(interfaceC9621e.mo12674d())));
            LayoutDirection layoutDirection = interfaceC9621e.getLayoutDirection();
            InterfaceC2052l<InterfaceC9621e, C9072e> interfaceC2052l = this.f3478j;
            c10000a.getClass();
            C5207g.m11111f(layoutDirection, "layoutDirection");
            C5207g.m11111f(interfaceC2052l, "block");
            c10000a.f50815c = interfaceC9621e;
            C9143f c9143f = c10000a.f50813a;
            C9139d c9139d = c10000a.f50814b;
            if (c9143f == null || c9139d == null || ((int) (jM17236a >> 32)) > c9143f.mo17438b() || C10022j.m18628b(jM17236a) > c9143f.mo17437a()) {
                int iM18628b = C10022j.m18628b(jM17236a);
                C9374q c9374q = C9363f.f48107c;
                C5207g.m11111f(c9374q, "colorSpace");
                C9145g.m17439a(0);
                C9143f c9143f2 = new C9143f(C9155l.m17475c((int) (jM17236a >> 32), iM18628b, 0, true, c9374q));
                Canvas canvas = C9141e.f47648a;
                C9139d c9139d2 = new C9139d();
                c9139d2.f47644a = new Canvas(c9143f2.f47649a);
                c10000a.f50813a = c9143f2;
                c10000a.f50814b = c9139d2;
                c9139d = c9139d2;
                c9143f = c9143f2;
            }
            c10000a.f50816d = jM17236a;
            long jM17259y = C9000b.m17259y(jM17236a);
            C9617a c9617a = c10000a.f50817e;
            C9617a.a aVar = c9617a.f49284a;
            InterfaceC10015c interfaceC10015c = aVar.f49288a;
            LayoutDirection layoutDirection2 = aVar.f49289b;
            InterfaceC9165q interfaceC9165q = aVar.f49290c;
            long j10 = aVar.f49291d;
            aVar.f49288a = interfaceC9621e;
            aVar.f49289b = layoutDirection;
            aVar.f49290c = c9139d;
            aVar.f49291d = jM17259y;
            c9139d.mo17420d();
            InterfaceC9621e.m18090U(c9617a, C9169u.f47699b, 0L, 62);
            ((VectorComponent$drawVectorBlock$1) interfaceC2052l).mo528n(c9617a);
            c9139d.mo17428o();
            C9617a.a aVar2 = c9617a.f49284a;
            aVar2.getClass();
            C5207g.m11111f(interfaceC10015c, "<set-?>");
            aVar2.f49288a = interfaceC10015c;
            C5207g.m11111f(layoutDirection2, "<set-?>");
            aVar2.f49289b = layoutDirection2;
            C5207g.m11111f(interfaceC9165q, "<set-?>");
            aVar2.f49290c = interfaceC9165q;
            aVar2.f49291d = j10;
            c9143f.f47649a.prepareToDraw();
            z10 = false;
            this.f3471c = false;
            this.f3477i = interfaceC9621e.mo12674d();
        } else {
            z10 = false;
        }
        c10000a.getClass();
        C9143f c9143f3 = c10000a.f50813a;
        if (c9143f3 != null) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        InterfaceC9621e.m18093f0(interfaceC9621e, c9143f3, 0L, c10000a.f50816d, 0L, 0L, f3, null, c9170v2, 0, 0, 858);
    }

    public final String toString() {
        String str = "Params: \tname: " + this.f3470b.f50825i + "\n\tviewportWidth: " + this.f3475g + "\n\tviewportHeight: " + this.f3476h + "\n";
        C5207g.m11110e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
