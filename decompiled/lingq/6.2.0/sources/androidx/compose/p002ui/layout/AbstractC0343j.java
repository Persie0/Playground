package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.unit.LayoutDirection;
import p000.f84;
import p000.fb2;
import p000.kv3;
import p000.l36;
import p000.l87;
import p000.m87;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.layout.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0343j implements fb2 {

    /* JADX INFO: renamed from: a */
    public boolean f4216a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m1518b(AbstractC0343j abstractC0343j, l87 l87Var) {
        abstractC0343j.getClass();
        if (l87Var instanceof l36) {
            ((l36) l87Var).mo1619H(abstractC0343j.f4216a);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m1520i(AbstractC0343j abstractC0343j, l87 l87Var, long j) {
        abstractC0343j.getClass();
        m1518b(abstractC0343j, l87Var);
        l87Var.mo1544i0(f84.m11595d(j, l87Var.f49305e), 0.0f, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m1521j(AbstractC0343j abstractC0343j, l87 l87Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC0343j.mo1528d() == LayoutDirection.Ltr || abstractC0343j.mo1529e() == 0) {
            m1518b(abstractC0343j, l87Var);
            l87Var.mo1544i0(f84.m11595d(j, l87Var.f49305e), 0.0f, null);
        } else {
            int iMo1529e = (abstractC0343j.mo1529e() - l87Var.f49301a) - ((int) (j >> 32));
            m1518b(abstractC0343j, l87Var);
            l87Var.mo1544i0(f84.m11595d((((long) iMo1529e) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), l87Var.f49305e), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m1522l(AbstractC0343j abstractC0343j, l87 l87Var, int i, int i2, vi3 vi3Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = m87.f50758b;
            vi3Var = PlaceableKt$DefaultLayerBlock$1.f4161b;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC0343j.mo1528d() == LayoutDirection.Ltr || abstractC0343j.mo1529e() == 0) {
            m1518b(abstractC0343j, l87Var);
            l87Var.mo1544i0(f84.m11595d(j, l87Var.f49305e), 0.0f, vi3Var);
        } else {
            m1518b(abstractC0343j, l87Var);
            l87Var.mo1544i0(f84.m11595d((((long) ((abstractC0343j.mo1529e() - l87Var.f49301a) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), l87Var.f49305e), 0.0f, vi3Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m1523m(AbstractC0343j abstractC0343j, l87 l87Var, long j) {
        int i = m87.f50758b;
        LayoutDirection layoutDirectionMo1528d = abstractC0343j.mo1528d();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.f4161b;
        if (layoutDirectionMo1528d == layoutDirection || abstractC0343j.mo1529e() == 0) {
            m1518b(abstractC0343j, l87Var);
            l87Var.mo1544i0(f84.m11595d(j, l87Var.f49305e), 0.0f, placeableKt$DefaultLayerBlock$1);
        } else {
            int iMo1529e = (abstractC0343j.mo1529e() - l87Var.f49301a) - ((int) (j >> 32));
            m1518b(abstractC0343j, l87Var);
            l87Var.mo1544i0(f84.m11595d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iMo1529e) << 32), l87Var.f49305e), 0.0f, placeableKt$DefaultLayerBlock$1);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m1524n(AbstractC0343j abstractC0343j, l87 l87Var, long j, C0312a c0312a) {
        if (abstractC0343j.mo1528d() == LayoutDirection.Ltr || abstractC0343j.mo1529e() == 0) {
            m1518b(abstractC0343j, l87Var);
            l87Var.mo1545j0(f84.m11595d(j, l87Var.f49305e), 0.0f, c0312a);
        } else {
            int iMo1529e = (abstractC0343j.mo1529e() - l87Var.f49301a) - ((int) (j >> 32));
            m1518b(abstractC0343j, l87Var);
            l87Var.mo1545j0(f84.m11595d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iMo1529e) << 32), l87Var.f49305e), 0.0f, c0312a);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m1525p(AbstractC0343j abstractC0343j, l87 l87Var, int i, int i2, vi3 vi3Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = m87.f50758b;
            vi3Var = PlaceableKt$DefaultLayerBlock$1.f4161b;
        }
        abstractC0343j.getClass();
        m1518b(abstractC0343j, l87Var);
        l87Var.mo1544i0(f84.m11595d((((long) i2) & 4294967295L) | (((long) i) << 32), l87Var.f49305e), 0.0f, vi3Var);
    }

    /* JADX INFO: renamed from: q */
    public static void m1526q(AbstractC0343j abstractC0343j, l87 l87Var, long j) {
        int i = m87.f50758b;
        abstractC0343j.getClass();
        m1518b(abstractC0343j, l87Var);
        l87Var.mo1544i0(f84.m11595d(j, l87Var.f49305e), 0.0f, PlaceableKt$DefaultLayerBlock$1.f4161b);
    }

    /* JADX INFO: renamed from: c */
    public float mo1527c(kv3 kv3Var) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: d */
    public abstract LayoutDirection mo1528d();

    /* JADX INFO: renamed from: e */
    public abstract int mo1529e();

    /* JADX INFO: renamed from: f */
    public final void m1530f(l87 l87Var, int i, int i2, float f) {
        m1518b(this, l87Var);
        l87Var.mo1544i0(f84.m11595d((((long) i2) & 4294967295L) | (((long) i) << 32), l87Var.f49305e), f, null);
    }
}
