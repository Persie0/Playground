package p363rc;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: renamed from: rc.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8768d {

    /* JADX INFO: renamed from: rc.d$a */
    public static class a implements TypeEvaluator<d> {

        /* JADX INFO: renamed from: b */
        public static final a f46481b = new a();

        /* JADX INFO: renamed from: a */
        public final d f46482a = new d();

        @Override // android.animation.TypeEvaluator
        public final d evaluate(float f3, d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float f10 = dVar3.f46485a;
            float f11 = 1.0f - f3;
            float f12 = (dVar4.f46485a * f3) + (f10 * f11);
            float f13 = dVar3.f46486b;
            float f14 = (dVar4.f46486b * f3) + (f13 * f11);
            float f15 = dVar3.f46487c;
            float f16 = (f3 * dVar4.f46487c) + (f11 * f15);
            d dVar5 = this.f46482a;
            dVar5.f46485a = f12;
            dVar5.f46486b = f14;
            dVar5.f46487c = f16;
            return dVar5;
        }
    }

    /* JADX INFO: renamed from: rc.d$b */
    public static class b extends Property<InterfaceC8768d, d> {

        /* JADX INFO: renamed from: a */
        public static final b f46483a = new b();

        public b() {
            super(d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final d get(InterfaceC8768d interfaceC8768d) {
            return interfaceC8768d.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(InterfaceC8768d interfaceC8768d, d dVar) {
            interfaceC8768d.setRevealInfo(dVar);
        }
    }

    /* JADX INFO: renamed from: rc.d$c */
    public static class c extends Property<InterfaceC8768d, Integer> {

        /* JADX INFO: renamed from: a */
        public static final c f46484a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(InterfaceC8768d interfaceC8768d) {
            return Integer.valueOf(interfaceC8768d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(InterfaceC8768d interfaceC8768d, Integer num) {
            interfaceC8768d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: renamed from: rc.d$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public float f46485a;

        /* JADX INFO: renamed from: b */
        public float f46486b;

        /* JADX INFO: renamed from: c */
        public float f46487c;

        public d() {
        }

        public d(float f3, float f10, float f11) {
            this.f46485a = f3;
            this.f46486b = f10;
            this.f46487c = f11;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo17016a();

    /* JADX INFO: renamed from: b */
    void mo17017b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(d dVar);
}
