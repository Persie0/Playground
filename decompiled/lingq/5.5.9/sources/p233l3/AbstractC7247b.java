package p233l3;

import android.view.View;
import bd.C1365i;
import java.util.ArrayList;
import p233l3.AbstractC7247b;

/* JADX INFO: renamed from: l3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7247b<T extends AbstractC7247b<T>> implements C7246a.b {

    /* JADX INFO: renamed from: l */
    public static final b f40700l = new b();

    /* JADX INFO: renamed from: m */
    public static final c f40701m = new c();

    /* JADX INFO: renamed from: n */
    public static final d f40702n = new d();

    /* JADX INFO: renamed from: o */
    public static final e f40703o = new e();

    /* JADX INFO: renamed from: p */
    public static final f f40704p = new f();

    /* JADX INFO: renamed from: q */
    public static final a f40705q = new a();

    /* JADX INFO: renamed from: a */
    public float f40706a;

    /* JADX INFO: renamed from: b */
    public float f40707b;

    /* JADX INFO: renamed from: c */
    public boolean f40708c;

    /* JADX INFO: renamed from: d */
    public final Object f40709d;

    /* JADX INFO: renamed from: e */
    public final AbstractC7248c f40710e;

    /* JADX INFO: renamed from: f */
    public boolean f40711f;

    /* JADX INFO: renamed from: g */
    public final float f40712g;

    /* JADX INFO: renamed from: h */
    public long f40713h;

    /* JADX INFO: renamed from: i */
    public final float f40714i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<h> f40715j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<i> f40716k;

    /* JADX INFO: renamed from: l3.b$a */
    public static class a extends j {
        public a() {
            super("alpha");
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: d */
        public final float mo4953d(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: f */
        public final void mo4954f(float f3, Object obj) {
            ((View) obj).setAlpha(f3);
        }
    }

    /* JADX INFO: renamed from: l3.b$b */
    public static class b extends j {
        public b() {
            super("scaleX");
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: d */
        public final float mo4953d(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: f */
        public final void mo4954f(float f3, Object obj) {
            ((View) obj).setScaleX(f3);
        }
    }

    /* JADX INFO: renamed from: l3.b$c */
    public static class c extends j {
        public c() {
            super("scaleY");
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: d */
        public final float mo4953d(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: f */
        public final void mo4954f(float f3, Object obj) {
            ((View) obj).setScaleY(f3);
        }
    }

    /* JADX INFO: renamed from: l3.b$d */
    public static class d extends j {
        public d() {
            super("rotation");
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: d */
        public final float mo4953d(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: f */
        public final void mo4954f(float f3, Object obj) {
            ((View) obj).setRotation(f3);
        }
    }

    /* JADX INFO: renamed from: l3.b$e */
    public static class e extends j {
        public e() {
            super("rotationX");
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: d */
        public final float mo4953d(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: f */
        public final void mo4954f(float f3, Object obj) {
            ((View) obj).setRotationX(f3);
        }
    }

    /* JADX INFO: renamed from: l3.b$f */
    public static class f extends j {
        public f() {
            super("rotationY");
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: d */
        public final float mo4953d(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: f */
        public final void mo4954f(float f3, Object obj) {
            ((View) obj).setRotationY(f3);
        }
    }

    /* JADX INFO: renamed from: l3.b$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public float f40717a;

        /* JADX INFO: renamed from: b */
        public float f40718b;
    }

    /* JADX INFO: renamed from: l3.b$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void m14592a();
    }

    /* JADX INFO: renamed from: l3.b$i */
    public interface i {
        /* JADX INFO: renamed from: a */
        void m14593a();
    }

    /* JADX INFO: renamed from: l3.b$j */
    public static abstract class j extends AbstractC7248c {
        public j(String str) {
            super(str);
        }
    }

    public AbstractC7247b(Object obj) {
        C1365i.a aVar = C1365i.f8238L;
        this.f40706a = 0.0f;
        this.f40707b = Float.MAX_VALUE;
        this.f40708c = false;
        this.f40711f = false;
        this.f40712g = -3.4028235E38f;
        this.f40713h = 0L;
        this.f40715j = new ArrayList<>();
        this.f40716k = new ArrayList<>();
        this.f40709d = obj;
        this.f40710e = aVar;
        if (aVar == f40702n || aVar == f40703o || aVar == f40704p) {
            this.f40714i = 0.1f;
            return;
        }
        if (aVar == f40705q) {
            this.f40714i = 0.00390625f;
        } else if (aVar == f40700l || aVar == f40701m) {
            this.f40714i = 0.00390625f;
        } else {
            this.f40714i = 1.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:33:0x0114  */
    /* JADX WARN: Code duplicated, block: B:37:0x0126  */
    /* JADX WARN: Code duplicated, block: B:39:0x012c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0140  */
    /* JADX WARN: Code duplicated, block: B:48:0x0138 A[EDGE_INSN: B:48:0x0138->B:41:0x0138 BREAK  A[LOOP:0: B:35:0x011e->B:40:0x0135], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x014a A[EDGE_INSN: B:51:0x014a->B:47:0x014a BREAK  A[LOOP:1: B:42:0x013c->B:53:0x013c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x013c A[SYNTHETIC] */
    @Override // p233l3.C7246a.b
    /* JADX INFO: renamed from: a */
    public final boolean mo14590a(long j10) {
        boolean z10;
        ThreadLocal<C7246a> threadLocal;
        C7246a c7246a;
        ArrayList<C7246a.b> arrayList;
        int iIndexOf;
        ArrayList<h> arrayList2;
        int size;
        long j11 = this.f40713h;
        int i10 = 0;
        if (j11 == 0) {
            this.f40713h = j10;
            m14591b(this.f40707b);
            return false;
        }
        long j12 = j10 - j11;
        this.f40713h = j10;
        C7249d c7249d = (C7249d) this;
        if (!c7249d.f40722t) {
            if (c7249d.f40721s != Float.MAX_VALUE) {
                C7250e c7250e = c7249d.f40720r;
                double d10 = c7250e.f40731i;
                long j13 = j12 / 2;
                g gVarM14598a = c7250e.m14598a(c7249d.f40707b, c7249d.f40706a, j13);
                C7250e c7250e2 = c7249d.f40720r;
                c7250e2.f40731i = c7249d.f40721s;
                c7249d.f40721s = Float.MAX_VALUE;
                g gVarM14598a2 = c7250e2.m14598a(gVarM14598a.f40717a, gVarM14598a.f40718b, j13);
                c7249d.f40707b = gVarM14598a2.f40717a;
                c7249d.f40706a = gVarM14598a2.f40718b;
            } else {
                g gVarM14598a3 = c7249d.f40720r.m14598a(c7249d.f40707b, c7249d.f40706a, j12);
                c7249d.f40707b = gVarM14598a3.f40717a;
                c7249d.f40706a = gVarM14598a3.f40718b;
            }
            float fMax = Math.max(c7249d.f40707b, c7249d.f40712g);
            c7249d.f40707b = fMax;
            float fMin = Math.min(fMax, Float.MAX_VALUE);
            c7249d.f40707b = fMin;
            float f3 = c7249d.f40706a;
            C7250e c7250e3 = c7249d.f40720r;
            c7250e3.getClass();
            if (((double) Math.abs(f3)) < c7250e3.f40727e && ((double) Math.abs(fMin - ((float) c7250e3.f40731i))) < c7250e3.f40726d) {
                c7249d.f40707b = (float) c7249d.f40720r.f40731i;
                c7249d.f40706a = 0.0f;
            } else {
                z10 = false;
            }
            float fMin2 = Math.min(this.f40707b, Float.MAX_VALUE);
            this.f40707b = fMin2;
            float fMax2 = Math.max(fMin2, this.f40712g);
            this.f40707b = fMax2;
            m14591b(fMax2);
            if (z10) {
                this.f40711f = false;
                threadLocal = C7246a.f40689f;
                if (threadLocal.get() == null) {
                    threadLocal.set(new C7246a());
                }
                c7246a = threadLocal.get();
                c7246a.f40690a.remove(this);
                arrayList = c7246a.f40691b;
                iIndexOf = arrayList.indexOf(this);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, null);
                    c7246a.f40694e = true;
                }
                this.f40713h = 0L;
                this.f40708c = false;
                while (true) {
                    arrayList2 = this.f40715j;
                    if (i10 < arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i10) != null) {
                        arrayList2.get(i10).m14592a();
                    }
                    i10++;
                }
                size = arrayList2.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        break;
                    }
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
            }
            return z10;
        }
        float f10 = c7249d.f40721s;
        if (f10 != Float.MAX_VALUE) {
            c7249d.f40720r.f40731i = f10;
            c7249d.f40721s = Float.MAX_VALUE;
        }
        c7249d.f40707b = (float) c7249d.f40720r.f40731i;
        c7249d.f40706a = 0.0f;
        c7249d.f40722t = false;
        z10 = true;
        float fMin3 = Math.min(this.f40707b, Float.MAX_VALUE);
        this.f40707b = fMin3;
        float fMax3 = Math.max(fMin3, this.f40712g);
        this.f40707b = fMax3;
        m14591b(fMax3);
        if (z10) {
            this.f40711f = false;
            threadLocal = C7246a.f40689f;
            if (threadLocal.get() == null) {
                threadLocal.set(new C7246a());
            }
            c7246a = threadLocal.get();
            c7246a.f40690a.remove(this);
            arrayList = c7246a.f40691b;
            iIndexOf = arrayList.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList.set(iIndexOf, null);
                c7246a.f40694e = true;
            }
            this.f40713h = 0L;
            this.f40708c = false;
            while (true) {
                arrayList2 = this.f40715j;
                if (i10 < arrayList2.size()) {
                    break;
                    break;
                }
                if (arrayList2.get(i10) != null) {
                    arrayList2.get(i10).m14592a();
                }
                i10++;
            }
            size = arrayList2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    break;
                    break;
                }
                if (arrayList2.get(size) == null) {
                    arrayList2.remove(size);
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public final void m14591b(float f3) {
        ArrayList<i> arrayList;
        this.f40710e.mo4954f(f3, this.f40709d);
        int i10 = 0;
        while (true) {
            arrayList = this.f40716k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                arrayList.get(i10).m14593a();
            }
            i10++;
        }
        int size = arrayList.size();
        while (true) {
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
    }
}
