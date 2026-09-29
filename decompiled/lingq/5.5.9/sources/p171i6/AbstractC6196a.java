package p171i6;

import ae.C0062b;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.kochava.tracker.BuildConfig;
import p007a6.AbstractC0029h;
import p007a6.C0034m;
import p007a6.C0036o;
import p042c6.C1733e;
import p087e6.C5374c;
import p087e6.C5376e;
import p171i6.AbstractC6196a;
import p236l6.C7282c;
import p258m6.C7482b;
import p258m6.C7492l;
import p356r5.C8734d;
import p356r5.C8735e;
import p356r5.InterfaceC8732b;
import p356r5.InterfaceC8738h;
import p392t5.AbstractC9200f;

/* JADX INFO: renamed from: i6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6196a<T extends AbstractC6196a<T>> implements Cloneable {

    /* JADX INFO: renamed from: H */
    public boolean f36060H;

    /* JADX INFO: renamed from: J */
    public Drawable f36062J;

    /* JADX INFO: renamed from: K */
    public int f36063K;

    /* JADX INFO: renamed from: O */
    public boolean f36067O;

    /* JADX INFO: renamed from: P */
    public Resources.Theme f36068P;

    /* JADX INFO: renamed from: Q */
    public boolean f36069Q;

    /* JADX INFO: renamed from: R */
    public boolean f36070R;

    /* JADX INFO: renamed from: S */
    public boolean f36071S;

    /* JADX INFO: renamed from: U */
    public boolean f36073U;

    /* JADX INFO: renamed from: a */
    public int f36074a;

    /* JADX INFO: renamed from: e */
    public Drawable f36078e;

    /* JADX INFO: renamed from: f */
    public int f36079f;

    /* JADX INFO: renamed from: g */
    public Drawable f36080g;

    /* JADX INFO: renamed from: h */
    public int f36081h;

    /* JADX INFO: renamed from: b */
    public float f36075b = 1.0f;

    /* JADX INFO: renamed from: c */
    public AbstractC9200f f36076c = AbstractC9200f.f47750c;

    /* JADX INFO: renamed from: d */
    public Priority f36077d = Priority.NORMAL;

    /* JADX INFO: renamed from: i */
    public boolean f36082i = true;

    /* JADX INFO: renamed from: j */
    public int f36083j = -1;

    /* JADX INFO: renamed from: k */
    public int f36084k = -1;

    /* JADX INFO: renamed from: l */
    public InterfaceC8732b f36085l = C7282c.f40796b;

    /* JADX INFO: renamed from: I */
    public boolean f36061I = true;

    /* JADX INFO: renamed from: L */
    public C8735e f36064L = new C8735e();

    /* JADX INFO: renamed from: M */
    public C7482b f36065M = new C7482b();

    /* JADX INFO: renamed from: N */
    public Class<?> f36066N = Object.class;

    /* JADX INFO: renamed from: T */
    public boolean f36072T = true;

    /* JADX INFO: renamed from: h */
    public static boolean m12715h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX INFO: renamed from: b */
    public T mo6249b(AbstractC6196a<?> abstractC6196a) {
        if (this.f36069Q) {
            return (T) clone().mo6249b(abstractC6196a);
        }
        if (m12715h(abstractC6196a.f36074a, 2)) {
            this.f36075b = abstractC6196a.f36075b;
        }
        if (m12715h(abstractC6196a.f36074a, 262144)) {
            this.f36070R = abstractC6196a.f36070R;
        }
        if (m12715h(abstractC6196a.f36074a, 1048576)) {
            this.f36073U = abstractC6196a.f36073U;
        }
        if (m12715h(abstractC6196a.f36074a, 4)) {
            this.f36076c = abstractC6196a.f36076c;
        }
        if (m12715h(abstractC6196a.f36074a, 8)) {
            this.f36077d = abstractC6196a.f36077d;
        }
        if (m12715h(abstractC6196a.f36074a, 16)) {
            this.f36078e = abstractC6196a.f36078e;
            this.f36079f = 0;
            this.f36074a &= -33;
        }
        if (m12715h(abstractC6196a.f36074a, 32)) {
            this.f36079f = abstractC6196a.f36079f;
            this.f36078e = null;
            this.f36074a &= -17;
        }
        if (m12715h(abstractC6196a.f36074a, 64)) {
            this.f36080g = abstractC6196a.f36080g;
            this.f36081h = 0;
            this.f36074a &= -129;
        }
        if (m12715h(abstractC6196a.f36074a, BuildConfig.SDK_TRUNCATE_LENGTH)) {
            this.f36081h = abstractC6196a.f36081h;
            this.f36080g = null;
            this.f36074a &= -65;
        }
        if (m12715h(abstractC6196a.f36074a, 256)) {
            this.f36082i = abstractC6196a.f36082i;
        }
        if (m12715h(abstractC6196a.f36074a, 512)) {
            this.f36084k = abstractC6196a.f36084k;
            this.f36083j = abstractC6196a.f36083j;
        }
        if (m12715h(abstractC6196a.f36074a, 1024)) {
            this.f36085l = abstractC6196a.f36085l;
        }
        if (m12715h(abstractC6196a.f36074a, 4096)) {
            this.f36066N = abstractC6196a.f36066N;
        }
        if (m12715h(abstractC6196a.f36074a, 8192)) {
            this.f36062J = abstractC6196a.f36062J;
            this.f36063K = 0;
            this.f36074a &= -16385;
        }
        if (m12715h(abstractC6196a.f36074a, 16384)) {
            this.f36063K = abstractC6196a.f36063K;
            this.f36062J = null;
            this.f36074a &= -8193;
        }
        if (m12715h(abstractC6196a.f36074a, 32768)) {
            this.f36068P = abstractC6196a.f36068P;
        }
        if (m12715h(abstractC6196a.f36074a, 65536)) {
            this.f36061I = abstractC6196a.f36061I;
        }
        if (m12715h(abstractC6196a.f36074a, 131072)) {
            this.f36060H = abstractC6196a.f36060H;
        }
        if (m12715h(abstractC6196a.f36074a, 2048)) {
            this.f36065M.putAll(abstractC6196a.f36065M);
            this.f36072T = abstractC6196a.f36072T;
        }
        if (m12715h(abstractC6196a.f36074a, 524288)) {
            this.f36071S = abstractC6196a.f36071S;
        }
        if (!this.f36061I) {
            this.f36065M.clear();
            int i10 = this.f36074a & (-2049);
            this.f36060H = false;
            this.f36074a = i10 & (-131073);
            this.f36072T = true;
        }
        this.f36074a |= abstractC6196a.f36074a;
        this.f36064L.f46331b.mo14868i(abstractC6196a.f36064L.f46331b);
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final T m12716c() {
        return (T) m12731v(DownsampleStrategy.f10803b, new C0034m());
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            C8735e c8735e = new C8735e();
            t10.f36064L = c8735e;
            c8735e.f46331b.mo14868i(this.f36064L.f46331b);
            C7482b c7482b = new C7482b();
            t10.f36065M = c7482b;
            c7482b.putAll(this.f36065M);
            t10.f36067O = false;
            t10.f36069Q = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public final T m12717e(Class<?> cls) {
        if (this.f36069Q) {
            return (T) clone().m12717e(cls);
        }
        this.f36066N = cls;
        this.f36074a |= 4096;
        m12726p();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC6196a) {
            AbstractC6196a abstractC6196a = (AbstractC6196a) obj;
            if (Float.compare(abstractC6196a.f36075b, this.f36075b) == 0 && this.f36079f == abstractC6196a.f36079f && C7492l.m14881b(this.f36078e, abstractC6196a.f36078e) && this.f36081h == abstractC6196a.f36081h && C7492l.m14881b(this.f36080g, abstractC6196a.f36080g) && this.f36063K == abstractC6196a.f36063K && C7492l.m14881b(this.f36062J, abstractC6196a.f36062J) && this.f36082i == abstractC6196a.f36082i && this.f36083j == abstractC6196a.f36083j && this.f36084k == abstractC6196a.f36084k && this.f36060H == abstractC6196a.f36060H && this.f36061I == abstractC6196a.f36061I && this.f36070R == abstractC6196a.f36070R && this.f36071S == abstractC6196a.f36071S && this.f36076c.equals(abstractC6196a.f36076c) && this.f36077d == abstractC6196a.f36077d && this.f36064L.equals(abstractC6196a.f36064L) && this.f36065M.equals(abstractC6196a.f36065M) && this.f36066N.equals(abstractC6196a.f36066N) && C7492l.m14881b(this.f36085l, abstractC6196a.f36085l) && C7492l.m14881b(this.f36068P, abstractC6196a.f36068P)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final T m12718f(AbstractC9200f abstractC9200f) {
        if (this.f36069Q) {
            return (T) clone().m12718f(abstractC9200f);
        }
        C0062b.m345f0(abstractC9200f);
        this.f36076c = abstractC9200f;
        this.f36074a |= 4;
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final T m12719g(int i10) {
        if (this.f36069Q) {
            return (T) clone().m12719g(i10);
        }
        this.f36079f = i10;
        int i11 = this.f36074a | 32;
        this.f36078e = null;
        this.f36074a = i11 & (-17);
        m12726p();
        return this;
    }

    public int hashCode() {
        float f3 = this.f36075b;
        char[] cArr = C7492l.f41383a;
        return C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14886g(C7492l.m14886g(C7492l.m14886g(C7492l.m14886g((((C7492l.m14886g(C7492l.m14885f((C7492l.m14885f((C7492l.m14885f(((Float.floatToIntBits(f3) + 527) * 31) + this.f36079f, this.f36078e) * 31) + this.f36081h, this.f36080g) * 31) + this.f36063K, this.f36062J), this.f36082i) * 31) + this.f36083j) * 31) + this.f36084k, this.f36060H), this.f36061I), this.f36070R), this.f36071S), this.f36076c), this.f36077d), this.f36064L), this.f36065M), this.f36066N), this.f36085l), this.f36068P);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC6196a m12720i(DownsampleStrategy downsampleStrategy, AbstractC0029h abstractC0029h) {
        if (this.f36069Q) {
            return clone().m12720i(downsampleStrategy, abstractC0029h);
        }
        C8734d c8734d = DownsampleStrategy.f10807f;
        C0062b.m345f0(downsampleStrategy);
        m12727r(c8734d, downsampleStrategy);
        return m12733x(abstractC0029h, false);
    }

    /* JADX INFO: renamed from: j */
    public final T m12721j(int i10, int i11) {
        if (this.f36069Q) {
            return (T) clone().m12721j(i10, i11);
        }
        this.f36084k = i10;
        this.f36083j = i11;
        this.f36074a |= 512;
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final T m12722k(int i10) {
        if (this.f36069Q) {
            return (T) clone().m12722k(i10);
        }
        this.f36081h = i10;
        int i11 = this.f36074a | BuildConfig.SDK_TRUNCATE_LENGTH;
        this.f36080g = null;
        this.f36074a = i11 & (-65);
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final T m12723m(Drawable drawable) {
        if (this.f36069Q) {
            return (T) clone().m12723m(drawable);
        }
        this.f36080g = drawable;
        int i10 = this.f36074a | 64;
        this.f36081h = 0;
        this.f36074a = i10 & (-129);
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final T m12724n(Priority priority) {
        if (this.f36069Q) {
            return (T) clone().m12724n(priority);
        }
        C0062b.m345f0(priority);
        this.f36077d = priority;
        this.f36074a |= 8;
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final T m12725o(C8734d<?> c8734d) {
        if (this.f36069Q) {
            return (T) clone().m12725o(c8734d);
        }
        this.f36064L.f46331b.remove(c8734d);
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final void m12726p() {
        if (this.f36067O) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: r */
    public final <Y> T m12727r(C8734d<Y> c8734d, Y y10) {
        if (this.f36069Q) {
            return (T) clone().m12727r(c8734d, y10);
        }
        C0062b.m345f0(c8734d);
        C0062b.m345f0(y10);
        this.f36064L.f46331b.put(c8734d, y10);
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final T m12728s(InterfaceC8732b interfaceC8732b) {
        if (this.f36069Q) {
            return (T) clone().m12728s(interfaceC8732b);
        }
        this.f36085l = interfaceC8732b;
        this.f36074a |= 1024;
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC6196a m12729t() {
        if (this.f36069Q) {
            return clone().m12729t();
        }
        this.f36082i = false;
        this.f36074a |= 256;
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final T m12730u(Resources.Theme theme) {
        if (this.f36069Q) {
            return (T) clone().m12730u(theme);
        }
        this.f36068P = theme;
        if (theme != null) {
            this.f36074a |= 32768;
            return (T) m12727r(C1733e.f9578b, theme);
        }
        this.f36074a &= -32769;
        return (T) m12725o(C1733e.f9578b);
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC6196a m12731v(DownsampleStrategy.C2129c c2129c, C0034m c0034m) {
        if (this.f36069Q) {
            return clone().m12731v(c2129c, c0034m);
        }
        C8734d c8734d = DownsampleStrategy.f10807f;
        C0062b.m345f0(c2129c);
        m12727r(c8734d, c2129c);
        return m12733x(c0034m, true);
    }

    /* JADX INFO: renamed from: w */
    public final <Y> T m12732w(Class<Y> cls, InterfaceC8738h<Y> interfaceC8738h, boolean z10) {
        if (this.f36069Q) {
            return (T) clone().m12732w(cls, interfaceC8738h, z10);
        }
        C0062b.m345f0(interfaceC8738h);
        this.f36065M.put(cls, interfaceC8738h);
        int i10 = this.f36074a | 2048;
        this.f36061I = true;
        int i11 = i10 | 65536;
        this.f36074a = i11;
        this.f36072T = false;
        if (z10) {
            this.f36074a = i11 | 131072;
            this.f36060H = true;
        }
        m12726p();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final T m12733x(InterfaceC8738h<Bitmap> interfaceC8738h, boolean z10) {
        if (this.f36069Q) {
            return (T) clone().m12733x(interfaceC8738h, z10);
        }
        C0036o c0036o = new C0036o(interfaceC8738h, z10);
        m12732w(Bitmap.class, interfaceC8738h, z10);
        m12732w(Drawable.class, c0036o, z10);
        m12732w(BitmapDrawable.class, c0036o, z10);
        m12732w(C5374c.class, new C5376e(interfaceC8738h), z10);
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC6196a m12734y() {
        if (this.f36069Q) {
            return clone().m12734y();
        }
        this.f36073U = true;
        this.f36074a |= 1048576;
        m12726p();
        return this;
    }
}
