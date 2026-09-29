package p406u4;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9433r0 {

    /* JADX INFO: renamed from: a */
    public static final C9441v0 f48403a;

    /* JADX INFO: renamed from: b */
    public static final a f48404b;

    /* JADX INFO: renamed from: c */
    public static final b f48405c;

    /* JADX INFO: renamed from: u4.r0$a */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(C9433r0.f48403a.mo17833E(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f3) {
            C9433r0.m17831b(view, f3.floatValue());
        }
    }

    /* JADX INFO: renamed from: u4.r0$b */
    public class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            return C10029b0.f.m18694a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.f.m18696c(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f48403a = new C9443w0();
        } else {
            f48403a = new C9441v0();
        }
        f48404b = new a();
        f48405c = new b();
    }

    /* JADX INFO: renamed from: a */
    public static void m17830a(View view, int i10, int i11, int i12, int i13) {
        f48403a.mo17839J(view, i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: b */
    public static void m17831b(View view, float f3) {
        f48403a.mo17834F(view, f3);
    }

    /* JADX INFO: renamed from: c */
    public static void m17832c(View view, int i10) {
        f48403a.mo16802B(view, i10);
    }
}
