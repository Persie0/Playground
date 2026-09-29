package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class j73 extends lj4 {
    @Override // p000.m90
    /* JADX INFO: renamed from: g */
    public final Object mo3293g(kj4 kj4Var, float f) {
        return Float.valueOf(m14317n(kj4Var, f));
    }

    /* JADX INFO: renamed from: m */
    public final float m14316m() {
        return m14317n(m16688b(), m16690d());
    }

    /* JADX INFO: renamed from: n */
    public final float m14317n(kj4 kj4Var, float f) {
        float f2;
        Object obj = kj4Var.f47378b;
        Object obj2 = kj4Var.f47378b;
        if (obj == null || kj4Var.f47379c == null) {
            C3386nv.m17633t("Missing values for keyframe.");
            return 0.0f;
        }
        p33 p33Var = this.f50800e;
        if (p33Var != null) {
            f2 = f;
            Float f3 = (Float) p33Var.m18870N(kj4Var.f47383g, kj4Var.f47384h.floatValue(), (Float) obj2, (Float) kj4Var.f47379c, f2, m16691e(), this.f50799d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        if (kj4Var.f47385i == -3987645.8f) {
            kj4Var.f47385i = ((Float) obj2).floatValue();
        }
        float f4 = kj4Var.f47385i;
        if (kj4Var.f47386j == -3987645.8f) {
            kj4Var.f47386j = ((Float) kj4Var.f47379c).floatValue();
        }
        return f06.m11425f(f4, kj4Var.f47386j, f2);
    }
}
