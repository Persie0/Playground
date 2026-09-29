package p000;

import com.google.android.gms.internal.clearcut.AbstractC0954g;
import com.google.android.gms.internal.clearcut.zzcb;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f1c {

    /* JADX INFO: renamed from: A */
    public Object f38254A;

    /* JADX INFO: renamed from: a */
    public final mj5 f38255a;

    /* JADX INFO: renamed from: b */
    public final Object[] f38256b;

    /* JADX INFO: renamed from: c */
    public final Class f38257c;

    /* JADX INFO: renamed from: d */
    public final int f38258d;

    /* JADX INFO: renamed from: e */
    public final int f38259e;

    /* JADX INFO: renamed from: f */
    public final int f38260f;

    /* JADX INFO: renamed from: g */
    public final int f38261g;

    /* JADX INFO: renamed from: h */
    public final int f38262h;

    /* JADX INFO: renamed from: i */
    public final int f38263i;

    /* JADX INFO: renamed from: j */
    public final int f38264j;

    /* JADX INFO: renamed from: k */
    public final int f38265k;

    /* JADX INFO: renamed from: l */
    public final int f38266l;

    /* JADX INFO: renamed from: m */
    public final int[] f38267m;

    /* JADX INFO: renamed from: n */
    public int f38268n;

    /* JADX INFO: renamed from: o */
    public int f38269o;

    /* JADX INFO: renamed from: p */
    public int f38270p = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: q */
    public int f38271q = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: r */
    public int f38272r = 0;

    /* JADX INFO: renamed from: s */
    public int f38273s;

    /* JADX INFO: renamed from: t */
    public int f38274t;

    /* JADX INFO: renamed from: u */
    public int f38275u;

    /* JADX INFO: renamed from: v */
    public int f38276v;

    /* JADX INFO: renamed from: w */
    public int f38277w;

    /* JADX INFO: renamed from: x */
    public Field f38278x;

    /* JADX INFO: renamed from: y */
    public Object f38279y;

    /* JADX INFO: renamed from: z */
    public Object f38280z;

    public f1c(Class cls, String str, Object[] objArr) {
        this.f38257c = cls;
        mj5 mj5Var = new mj5(str);
        this.f38255a = mj5Var;
        this.f38256b = objArr;
        this.f38258d = mj5Var.m16857a();
        int iM16857a = mj5Var.m16857a();
        this.f38259e = iM16857a;
        if (iM16857a == 0) {
            this.f38260f = 0;
            this.f38261g = 0;
            this.f38262h = 0;
            this.f38263i = 0;
            this.f38265k = 0;
            this.f38264j = 0;
            this.f38266l = 0;
            this.f38267m = null;
            return;
        }
        int iM16857a2 = mj5Var.m16857a();
        this.f38260f = iM16857a2;
        int iM16857a3 = mj5Var.m16857a();
        this.f38261g = mj5Var.m16857a();
        this.f38262h = mj5Var.m16857a();
        this.f38265k = mj5Var.m16857a();
        this.f38264j = mj5Var.m16857a();
        this.f38263i = mj5Var.m16857a();
        this.f38266l = mj5Var.m16857a();
        int iM16857a4 = mj5Var.m16857a();
        this.f38267m = iM16857a4 != 0 ? new int[iM16857a4] : null;
        this.f38268n = (iM16857a2 << 1) + iM16857a3;
    }

    /* JADX INFO: renamed from: b */
    public static Field m11501b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            ho2.m13385e(AbstractC3393o1.m17738m(sb, " not found. Known fields are ", string));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11502a() {
        mj5 mj5Var = this.f38255a;
        if (mj5Var.f51398b >= mj5Var.f51397a.length()) {
            return false;
        }
        this.f38273s = mj5Var.m16857a();
        int iM16857a = mj5Var.m16857a();
        this.f38274t = iM16857a;
        int i = iM16857a & 255;
        this.f38275u = i;
        int i2 = this.f38273s;
        if (i2 < this.f38270p) {
            this.f38270p = i2;
        }
        if (i2 > this.f38271q) {
            this.f38271q = i2;
        }
        zzcb zzcbVar = zzcb.zziw;
        if (i != zzcbVar.m5345id() && this.f38275u >= zzcb.zzhq.m5345id()) {
            zzcb.zziv.m5345id();
        }
        int i3 = this.f38272r + 1;
        this.f38272r = i3;
        int i4 = this.f38270p;
        int i5 = this.f38273s;
        Class cls = AbstractC0954g.f11797a;
        if (i5 >= 40) {
            long j = i3;
            int i6 = (((((long) i5) - ((long) i4)) + 10) > (((j + 3) * 3) + (2 * j) + 3) ? 1 : (((((long) i5) - ((long) i4)) + 10) == (((j + 3) * 3) + (2 * j) + 3) ? 0 : -1));
        }
        if ((this.f38274t & 1024) != 0) {
            int i7 = this.f38269o;
            this.f38269o = i7 + 1;
            this.f38267m[i7] = i5;
        }
        this.f38279y = null;
        this.f38280z = null;
        this.f38254A = null;
        int i8 = this.f38275u;
        int iM5345id = zzcbVar.m5345id();
        int i9 = this.f38258d;
        if (i8 > iM5345id) {
            this.f38276v = mj5Var.m16857a();
            if (this.f38275u == zzcb.zzhh.m5345id() + 51 || this.f38275u == zzcb.zzhp.m5345id() + 51) {
                this.f38279y = m11503c();
                return true;
            }
            if (this.f38275u == zzcb.zzhk.m5345id() + 51 && (i9 & 1) == 1) {
                this.f38280z = m11503c();
            }
            return true;
        }
        this.f38278x = m11501b(this.f38257c, (String) m11503c());
        if ((i9 & 1) == 1 && this.f38275u <= zzcb.zzhp.m5345id()) {
            this.f38277w = mj5Var.m16857a();
        }
        if (this.f38275u == zzcb.zzhh.m5345id() || this.f38275u == zzcb.zzhp.m5345id()) {
            this.f38279y = this.f38278x.getType();
            return true;
        }
        if (this.f38275u == zzcb.zzhz.m5345id() || this.f38275u == zzcb.zziv.m5345id()) {
            this.f38279y = m11503c();
            return true;
        }
        if (this.f38275u == zzcb.zzhk.m5345id() || this.f38275u == zzcb.zzic.m5345id() || this.f38275u == zzcb.zziq.m5345id()) {
            if ((i9 & 1) == 1) {
                this.f38280z = m11503c();
            }
            return true;
        }
        if (this.f38275u == zzcbVar.m5345id()) {
            this.f38254A = m11503c();
            if ((this.f38274t & 2048) != 0) {
                this.f38280z = m11503c();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final Object m11503c() {
        int i = this.f38268n;
        this.f38268n = i + 1;
        return this.f38256b[i];
    }
}
