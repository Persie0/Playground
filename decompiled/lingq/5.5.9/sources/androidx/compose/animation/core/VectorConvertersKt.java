package androidx.compose.animation.core;

import cm.InterfaceC2052l;
import dm.C5207g;
import p260m8.C7499b;
import p338qd.C8573r0;
import p338qd.C8584v;
import p374s.C8905f;
import p374s.C8907g;
import p374s.C8908g0;
import p374s.C8909h;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8944f;
import p385sf.C9000b;
import p470x1.C10017e;
import p470x1.C10018f;
import p470x1.C10020h;
import p470x1.C10022j;

/* JADX INFO: loaded from: classes.dex */
public final class VectorConvertersKt {

    /* JADX INFO: renamed from: a */
    public static final C8908g0 f1626a = m1380a(new InterfaceC2052l<Float, C8905f>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8905f mo528n(Float f3) {
            return new C8905f(f3.floatValue());
        }
    }, new InterfaceC2052l<C8905f, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final Float mo528n(C8905f c8905f) {
            C8905f c8905f2 = c8905f;
            C5207g.m11111f(c8905f2, "it");
            return Float.valueOf(c8905f2.f46807a);
        }
    });

    /* JADX INFO: renamed from: b */
    public static final C8908g0 f1627b = m1380a(new InterfaceC2052l<Integer, C8905f>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8905f mo528n(Integer num) {
            return new C8905f(num.intValue());
        }
    }, new InterfaceC2052l<C8905f, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final Integer mo528n(C8905f c8905f) {
            C8905f c8905f2 = c8905f;
            C5207g.m11111f(c8905f2, "it");
            return Integer.valueOf((int) c8905f2.f46807a);
        }
    });

    /* JADX INFO: renamed from: c */
    public static final C8908g0 f1628c = m1380a(new InterfaceC2052l<C10017e, C8905f>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8905f mo528n(C10017e c10017e) {
            return new C8905f(c10017e.f50966a);
        }
    }, new InterfaceC2052l<C8905f, C10017e>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C10017e mo528n(C8905f c8905f) {
            C8905f c8905f2 = c8905f;
            C5207g.m11111f(c8905f2, "it");
            return new C10017e(c8905f2.f46807a);
        }
    });

    /* JADX INFO: renamed from: d */
    public static final C8908g0 f1629d = m1380a(new InterfaceC2052l<C10018f, C8907g>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8907g mo528n(C10018f c10018f) {
            long j10 = c10018f.f50969a;
            return new C8907g(C10018f.m18620a(j10), C10018f.m18621b(j10));
        }
    }, new InterfaceC2052l<C8907g, C10018f>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C10018f mo528n(C8907g c8907g) {
            C8907g c8907g2 = c8907g;
            C5207g.m11111f(c8907g2, "it");
            return new C10018f(C8584v.m16786k(c8907g2.f46809a, c8907g2.f46810b));
        }
    });

    /* JADX INFO: renamed from: e */
    public static final C8908g0 f1630e = m1380a(new InterfaceC2052l<C8944f, C8907g>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8907g mo528n(C8944f c8944f) {
            long j10 = c8944f.f46909a;
            return new C8907g(C8944f.m17177d(j10), C8944f.m17175b(j10));
        }
    }, new InterfaceC2052l<C8907g, C8944f>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8944f mo528n(C8907g c8907g) {
            C8907g c8907g2 = c8907g;
            C5207g.m11111f(c8907g2, "it");
            return new C8944f(C8584v.m16788m(c8907g2.f46809a, c8907g2.f46810b));
        }
    });

    /* JADX INFO: renamed from: f */
    public static final C8908g0 f1631f = m1380a(new InterfaceC2052l<C8941c, C8907g>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8907g mo528n(C8941c c8941c) {
            long j10 = c8941c.f46892a;
            return new C8907g(C8941c.m17164c(j10), C8941c.m17165d(j10));
        }
    }, new InterfaceC2052l<C8907g, C8941c>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8941c mo528n(C8907g c8907g) {
            C8907g c8907g2 = c8907g;
            C5207g.m11111f(c8907g2, "it");
            return new C8941c(C7499b.m14932c(c8907g2.f46809a, c8907g2.f46810b));
        }
    });

    /* JADX INFO: renamed from: g */
    public static final C8908g0 f1632g = m1380a(new InterfaceC2052l<C10020h, C8907g>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8907g mo528n(C10020h c10020h) {
            long j10 = c10020h.f50975a;
            return new C8907g((int) (j10 >> 32), C10020h.m18625a(j10));
        }
    }, new InterfaceC2052l<C8907g, C10020h>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C10020h mo528n(C8907g c8907g) {
            C8907g c8907g2 = c8907g;
            C5207g.m11111f(c8907g2, "it");
            return new C10020h(C8573r0.m16752r(C8573r0.m16710Y0(c8907g2.f46809a), C8573r0.m16710Y0(c8907g2.f46810b)));
        }
    });

    /* JADX INFO: renamed from: h */
    public static final C8908g0 f1633h = m1380a(new InterfaceC2052l<C10022j, C8907g>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8907g mo528n(C10022j c10022j) {
            long j10 = c10022j.f50980a;
            return new C8907g((int) (j10 >> 32), C10022j.m18628b(j10));
        }
    }, new InterfaceC2052l<C8907g, C10022j>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C10022j mo528n(C8907g c8907g) {
            C8907g c8907g2 = c8907g;
            C5207g.m11111f(c8907g2, "it");
            return new C10022j(C9000b.m17236a(C8573r0.m16710Y0(c8907g2.f46809a), C8573r0.m16710Y0(c8907g2.f46810b)));
        }
    });

    /* JADX INFO: renamed from: i */
    public static final C8908g0 f1634i = m1380a(new InterfaceC2052l<C8942d, C8909h>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8909h mo528n(C8942d c8942d) {
            C8942d c8942d2 = c8942d;
            C5207g.m11111f(c8942d2, "it");
            return new C8909h(c8942d2.f46894a, c8942d2.f46895b, c8942d2.f46896c, c8942d2.f46897d);
        }
    }, new InterfaceC2052l<C8909h, C8942d>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C8942d mo528n(C8909h c8909h) {
            C8909h c8909h2 = c8909h;
            C5207g.m11111f(c8909h2, "it");
            return new C8942d(c8909h2.f46814a, c8909h2.f46815b, c8909h2.f46816c, c8909h2.f46817d);
        }
    });

    /* JADX INFO: renamed from: a */
    public static final C8908g0 m1380a(InterfaceC2052l interfaceC2052l, InterfaceC2052l interfaceC2052l2) {
        C5207g.m11111f(interfaceC2052l, "convertToVector");
        C5207g.m11111f(interfaceC2052l2, "convertFromVector");
        return new C8908g0(interfaceC2052l, interfaceC2052l2);
    }
}
