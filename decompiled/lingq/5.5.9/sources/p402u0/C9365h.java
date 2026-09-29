package p402u0;

import dm.C5207g;
import java.util.Arrays;
import p338qd.C8584v;
import p385sf.C9000b;

/* JADX INFO: renamed from: u0.h */
/* JADX INFO: loaded from: classes.dex */
public class C9365h {

    /* JADX INFO: renamed from: e */
    public static final C9364g f48126e;

    /* JADX INFO: renamed from: f */
    public static final C9365h f48127f;

    /* JADX INFO: renamed from: g */
    public static final C9365h f48128g;

    /* JADX INFO: renamed from: a */
    public final AbstractC9360c f48129a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9360c f48130b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9360c f48131c;

    /* JADX INFO: renamed from: d */
    public final float[] f48132d;

    /* JADX INFO: renamed from: u0.h$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: u0.h$b */
    public static final class b extends C9365h {

        /* JADX INFO: renamed from: h */
        public final C9374q f48133h;

        /* JADX INFO: renamed from: i */
        public final C9374q f48134i;

        /* JADX INFO: renamed from: j */
        public final float[] f48135j;

        public b(C9374q c9374q, C9374q c9374q2, int i10) {
            float[] fArrM17735e;
            super(c9374q2, c9374q, c9374q2, null);
            this.f48133h = c9374q;
            this.f48134i = c9374q2;
            C9376s c9376s = c9374q2.f48149d;
            C9376s c9376s2 = c9374q.f48149d;
            boolean zM17733c = C9361d.m17733c(c9376s2, c9376s);
            float[] fArrM17735e2 = c9374q.f48154i;
            float[] fArrM17734d = c9374q2.f48155j;
            if (zM17733c) {
                fArrM17735e = C9361d.m17735e(fArrM17734d, fArrM17735e2);
            } else {
                float[] fArrM17746a = c9376s2.m17746a();
                C9376s c9376s3 = c9374q2.f48149d;
                float[] fArrM17746a2 = c9376s3.m17746a();
                C9376s c9376s4 = C9000b.f47198c;
                boolean zM17733c2 = C9361d.m17733c(c9376s2, c9376s4);
                float[] fArr = C9000b.f47201f;
                float[] fArr2 = AbstractC9358a.f48094b.f48095a;
                if (!zM17733c2) {
                    float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                    C5207g.m11110e(fArrCopyOf, "copyOf(this, size)");
                    fArrM17735e2 = C9361d.m17735e(C9361d.m17732b(fArr2, fArrM17746a, fArrCopyOf), fArrM17735e2);
                }
                if (!C9361d.m17733c(c9376s3, c9376s4)) {
                    float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                    C5207g.m11110e(fArrCopyOf2, "copyOf(this, size)");
                    fArrM17734d = C9361d.m17734d(C9361d.m17735e(C9361d.m17732b(fArr2, fArrM17746a2, fArrCopyOf2), c9374q2.f48154i));
                }
                fArrM17735e = C9361d.m17735e(fArrM17734d, i10 == 3 ? C9361d.m17736f(new float[]{fArrM17746a[0] / fArrM17746a2[0], fArrM17746a[1] / fArrM17746a2[1], fArrM17746a[2] / fArrM17746a2[2]}, fArrM17735e2) : fArrM17735e2);
            }
            this.f48135j = fArrM17735e;
        }

        @Override // p402u0.C9365h
        /* JADX INFO: renamed from: a */
        public final long mo17741a(float f3, float f10, float f11, float f12) {
            C9374q c9374q = this.f48133h;
            float fMo11741j = (float) c9374q.f48159n.mo11741j(f3);
            double d10 = f10;
            C9370m c9370m = c9374q.f48159n;
            float fMo11741j2 = (float) c9370m.mo11741j(d10);
            float fMo11741j3 = (float) c9370m.mo11741j(f11);
            float[] fArr = this.f48135j;
            float fM17738h = C9361d.m17738h(fMo11741j, fMo11741j2, fMo11741j3, fArr);
            float fM17739i = C9361d.m17739i(fMo11741j, fMo11741j2, fMo11741j3, fArr);
            float fM17740j = C9361d.m17740j(fMo11741j, fMo11741j2, fMo11741j3, fArr);
            C9374q c9374q2 = this.f48134i;
            float fMo11741j4 = (float) c9374q2.f48157l.mo11741j(fM17738h);
            C9369l c9369l = c9374q2.f48157l;
            return C8584v.m16782g(fMo11741j4, (float) c9369l.mo11741j(fM17739i), (float) c9369l.mo11741j(fM17740j), f12, c9374q2);
        }
    }

    static {
        new a();
        C9374q c9374q = C9363f.f48107c;
        C5207g.m11111f(c9374q, "source");
        f48126e = new C9364g(c9374q);
        C9368k c9368k = C9363f.f48124t;
        f48127f = new C9365h(c9374q, c9368k, 0);
        f48128g = new C9365h(c9368k, c9374q, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9365h(AbstractC9360c abstractC9360c, AbstractC9360c abstractC9360c2, int i10) {
        float[] fArr;
        long j10 = abstractC9360c.f48102b;
        long j11 = C9359b.f48096a;
        AbstractC9360c abstractC9360cM17731a = C9359b.m17721a(j10, j11) ? C9361d.m17731a(abstractC9360c) : abstractC9360c;
        AbstractC9360c abstractC9360cM17731a2 = C9359b.m17721a(abstractC9360c2.f48102b, j11) ? C9361d.m17731a(abstractC9360c2) : abstractC9360c2;
        if (i10 == 3) {
            boolean zM17721a = C9359b.m17721a(abstractC9360c.f48102b, j11);
            boolean zM17721a2 = C9359b.m17721a(abstractC9360c2.f48102b, j11);
            if ((!zM17721a || !zM17721a2) && (zM17721a || zM17721a2)) {
                abstractC9360c = zM17721a ? abstractC9360c : abstractC9360c2;
                float[] fArrM17746a = C9000b.f47201f;
                C9376s c9376s = ((C9374q) abstractC9360c).f48149d;
                float[] fArrM17746a2 = zM17721a ? c9376s.m17746a() : fArrM17746a;
                fArrM17746a = zM17721a2 ? c9376s.m17746a() : fArrM17746a;
                fArr = new float[]{fArrM17746a2[0] / fArrM17746a[0], fArrM17746a2[1] / fArrM17746a[1], fArrM17746a2[2] / fArrM17746a[2]};
            }
            this(abstractC9360c2, abstractC9360cM17731a, abstractC9360cM17731a2, fArr);
        }
        fArr = null;
        this(abstractC9360c2, abstractC9360cM17731a, abstractC9360cM17731a2, fArr);
    }

    public C9365h(AbstractC9360c abstractC9360c, AbstractC9360c abstractC9360c2, AbstractC9360c abstractC9360c3, float[] fArr) {
        this.f48129a = abstractC9360c;
        this.f48130b = abstractC9360c2;
        this.f48131c = abstractC9360c3;
        this.f48132d = fArr;
    }

    /* JADX INFO: renamed from: a */
    public long mo17741a(float f3, float f10, float f11, float f12) {
        AbstractC9360c abstractC9360c = this.f48130b;
        long jMo17727e = abstractC9360c.mo17727e(f3, f10, f11);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo17727e >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo17727e & 4294967295L));
        float fMo17729g = abstractC9360c.mo17729g(f3, f10, f11);
        float[] fArr = this.f48132d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo17729g *= fArr[2];
        }
        float f13 = fIntBitsToFloat2;
        float f14 = fIntBitsToFloat;
        return this.f48131c.mo17730h(f14, f13, fMo17729g, f12, this.f48129a);
    }
}
