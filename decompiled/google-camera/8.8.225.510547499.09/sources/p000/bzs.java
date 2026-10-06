package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bzs implements Cloneable {

    /* JADX INFO: renamed from: d */
    public int f4832d;

    /* JADX INFO: renamed from: e */
    public Drawable f4833e;

    /* JADX INFO: renamed from: f */
    public int f4834f;

    /* JADX INFO: renamed from: k */
    public boolean f4839k;

    /* JADX INFO: renamed from: p */
    public Resources.Theme f4844p;

    /* JADX INFO: renamed from: q */
    public boolean f4845q;

    /* JADX INFO: renamed from: r */
    public boolean f4846r;

    /* JADX INFO: renamed from: t */
    public boolean f4848t;

    /* JADX INFO: renamed from: u */
    private int f4849u;

    /* JADX INFO: renamed from: v */
    private Drawable f4850v;

    /* JADX INFO: renamed from: w */
    private Drawable f4851w;

    /* JADX INFO: renamed from: x */
    private int f4852x;

    /* JADX INFO: renamed from: y */
    private boolean f4853y;

    /* JADX INFO: renamed from: z */
    private boolean f4854z;

    /* JADX INFO: renamed from: a */
    public float f4829a = 1.0f;

    /* JADX INFO: renamed from: b */
    public bsk f4830b = bsk.f4333c;

    /* JADX INFO: renamed from: c */
    public bpe f4831c = bpe.NORMAL;

    /* JADX INFO: renamed from: g */
    public boolean f4835g = true;

    /* JADX INFO: renamed from: h */
    public int f4836h = -1;

    /* JADX INFO: renamed from: i */
    public int f4837i = -1;

    /* JADX INFO: renamed from: j */
    public bqn f4838j = car.f4925b;

    /* JADX INFO: renamed from: l */
    public boolean f4840l = true;

    /* JADX INFO: renamed from: m */
    public bqr f4841m = new bqr();

    /* JADX INFO: renamed from: n */
    public Map f4842n = new caw();

    /* JADX INFO: renamed from: o */
    public Class f4843o = Object.class;

    /* JADX INFO: renamed from: s */
    public boolean f4847s = true;

    /* JADX INFO: renamed from: a */
    private final bzs m3289a(bwy bwyVar, bqv bqvVar, boolean z) {
        bzs bzsVarM3294D = z ? m3294D(bwyVar, bqvVar) : m3314t(bwyVar, bqvVar);
        bzsVarM3294D.f4847s = true;
        return bzsVarM3294D;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m3290b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: A */
    public final bzs m3291A(Resources.Theme theme) {
        if (this.f4845q) {
            return mo2856i().m3291A(theme);
        }
        this.f4844p = theme;
        if (theme != null) {
            this.f4849u |= 32768;
            return m3319y(byd.f4735a, theme);
        }
        this.f4849u &= -32769;
        return m3318x(byd.f4735a);
    }

    /* JADX INFO: renamed from: B */
    public final bzs m3292B(bqv bqvVar) {
        return m3293C(bqvVar, true);
    }

    /* JADX INFO: renamed from: C */
    final bzs m3293C(bqv bqvVar, boolean z) {
        if (this.f4845q) {
            return mo2856i().m3293C(bqvVar, z);
        }
        bxe bxeVar = new bxe(bqvVar, z);
        m3295E(Bitmap.class, bqvVar, z);
        m3295E(Drawable.class, bxeVar, z);
        m3295E(BitmapDrawable.class, bxeVar, z);
        m3295E(byh.class, new byk(bqvVar), z);
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: D */
    final bzs m3294D(bwy bwyVar, bqv bqvVar) {
        if (this.f4845q) {
            return mo2856i().m3294D(bwyVar, bqvVar);
        }
        m3298H(bwyVar);
        return m3292B(bqvVar);
    }

    /* JADX INFO: renamed from: E */
    final bzs m3295E(Class cls, bqv bqvVar, boolean z) {
        if (this.f4845q) {
            return mo2856i().m3295E(cls, bqvVar, z);
        }
        bzq.m3278r(cls);
        bzq.m3278r(bqvVar);
        this.f4842n.put(cls, bqvVar);
        int i = this.f4849u;
        this.f4840l = true;
        int i2 = i | 67584;
        this.f4849u = i2;
        this.f4847s = false;
        if (z) {
            this.f4849u = i2 | 131072;
            this.f4839k = true;
        }
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m3296F(int i) {
        return m3290b(this.f4849u, i);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m3297G() {
        return cbi.m3393n(this.f4837i, this.f4836h);
    }

    /* JADX INFO: renamed from: H */
    public final void m3298H(bwy bwyVar) {
        bqq bqqVar = bwy.f4673f;
        bzq.m3278r(bwyVar);
        m3319y(bqqVar, bwyVar);
    }

    /* JADX INFO: renamed from: I */
    public final bzs m3299I() {
        if (this.f4845q) {
            return mo2856i().m3299I();
        }
        this.f4832d = C0100R.drawable.quantum_gm_ic_get_app_white_24;
        int i = this.f4849u | 32;
        this.f4850v = null;
        this.f4849u = i & (-17);
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final bzs m3300J() {
        if (this.f4845q) {
            return mo2856i().m3300J();
        }
        this.f4846r = true;
        this.f4849u |= 524288;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final bzs m3301K() {
        if (this.f4845q) {
            return mo2856i().m3301K();
        }
        this.f4834f = C0100R.color.photo_placeholder;
        int i = this.f4849u | 128;
        this.f4833e = null;
        this.f4849u = i & (-65);
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: L */
    public final bzs m3302L() {
        if (this.f4845q) {
            return mo2856i().m3302L();
        }
        this.f4835g = false;
        this.f4849u |= 256;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: M */
    public final bzs m3303M() {
        if (this.f4845q) {
            return mo2856i().m3303M();
        }
        this.f4848t = true;
        this.f4849u |= 1048576;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: N */
    public final void m3304N() {
        this.f4853y = true;
    }

    /* JADX INFO: renamed from: O */
    protected final void m3305O() {
        if (this.f4853y) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof bzs) {
            bzs bzsVar = (bzs) obj;
            if (Float.compare(bzsVar.f4829a, this.f4829a) == 0 && this.f4832d == bzsVar.f4832d) {
                Drawable drawable = bzsVar.f4850v;
                if (cbi.m3389j(null, null) && this.f4834f == bzsVar.f4834f && cbi.m3389j(this.f4833e, bzsVar.f4833e)) {
                    int i = bzsVar.f4852x;
                    Drawable drawable2 = bzsVar.f4851w;
                    if (cbi.m3389j(null, null) && this.f4835g == bzsVar.f4835g && this.f4836h == bzsVar.f4836h && this.f4837i == bzsVar.f4837i && this.f4839k == bzsVar.f4839k && this.f4840l == bzsVar.f4840l) {
                        boolean z = bzsVar.f4854z;
                        if (this.f4846r == bzsVar.f4846r && this.f4830b.equals(bzsVar.f4830b) && this.f4831c == bzsVar.f4831c && this.f4841m.equals(bzsVar.f4841m) && this.f4842n.equals(bzsVar.f4842n) && this.f4843o.equals(bzsVar.f4843o) && cbi.m3389j(this.f4838j, bzsVar.f4838j) && cbi.m3389j(this.f4844p, bzsVar.f4844p)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public bzs mo2855h(bzs bzsVar) {
        if (this.f4845q) {
            return mo2856i().mo2855h(bzsVar);
        }
        int i = bzsVar.f4849u;
        if (m3290b(i, 2)) {
            this.f4829a = bzsVar.f4829a;
        }
        if (m3290b(i, 262144)) {
            boolean z = bzsVar.f4854z;
            this.f4854z = false;
        }
        if (m3290b(i, 1048576)) {
            this.f4848t = bzsVar.f4848t;
        }
        if (m3290b(i, 4)) {
            this.f4830b = bzsVar.f4830b;
        }
        if (m3290b(i, 8)) {
            this.f4831c = bzsVar.f4831c;
        }
        if (m3290b(i, 16)) {
            Drawable drawable = bzsVar.f4850v;
            this.f4850v = null;
            this.f4832d = 0;
            this.f4849u &= -33;
        }
        if (m3290b(bzsVar.f4849u, 32)) {
            this.f4832d = bzsVar.f4832d;
            this.f4850v = null;
            this.f4849u &= -17;
        }
        if (m3290b(bzsVar.f4849u, 64)) {
            this.f4833e = bzsVar.f4833e;
            this.f4834f = 0;
            this.f4849u &= -129;
        }
        if (m3290b(bzsVar.f4849u, 128)) {
            this.f4834f = bzsVar.f4834f;
            this.f4833e = null;
            this.f4849u &= -65;
        }
        int i2 = bzsVar.f4849u;
        if (m3290b(i2, 256)) {
            this.f4835g = bzsVar.f4835g;
        }
        if (m3290b(i2, 512)) {
            this.f4837i = bzsVar.f4837i;
            this.f4836h = bzsVar.f4836h;
        }
        if (m3290b(i2, 1024)) {
            this.f4838j = bzsVar.f4838j;
        }
        if (m3290b(i2, 4096)) {
            this.f4843o = bzsVar.f4843o;
        }
        if (m3290b(i2, 8192)) {
            Drawable drawable2 = bzsVar.f4851w;
            this.f4851w = null;
            this.f4852x = 0;
            this.f4849u &= -16385;
        }
        if (m3290b(bzsVar.f4849u, 16384)) {
            int i3 = bzsVar.f4852x;
            this.f4852x = 0;
            this.f4851w = null;
            this.f4849u &= -8193;
        }
        int i4 = bzsVar.f4849u;
        if (m3290b(i4, 32768)) {
            this.f4844p = bzsVar.f4844p;
        }
        if (m3290b(i4, 65536)) {
            this.f4840l = bzsVar.f4840l;
        }
        if (m3290b(i4, 131072)) {
            this.f4839k = bzsVar.f4839k;
        }
        if (m3290b(i4, 2048)) {
            this.f4842n.putAll(bzsVar.f4842n);
            this.f4847s = bzsVar.f4847s;
        }
        if (m3290b(bzsVar.f4849u, 524288)) {
            this.f4846r = bzsVar.f4846r;
        }
        if (!this.f4840l) {
            this.f4842n.clear();
            int i5 = this.f4849u;
            this.f4839k = false;
            this.f4849u = i5 & (-133121);
            this.f4847s = true;
        }
        this.f4849u |= bzsVar.f4849u;
        this.f4841m.m2928c(bzsVar.f4841m);
        m3305O();
        return this;
    }

    public int hashCode() {
        int iM3382c = cbi.m3382c(this.f4840l ? 1 : 0, cbi.m3382c(this.f4839k ? 1 : 0, cbi.m3382c(this.f4837i, cbi.m3382c(this.f4836h, cbi.m3382c(this.f4835g ? 1 : 0, cbi.m3383d(null, cbi.m3382c(0, cbi.m3383d(this.f4833e, cbi.m3382c(this.f4834f, cbi.m3383d(null, cbi.m3382c(this.f4832d, cbi.m3382c(Float.floatToIntBits(this.f4829a), 17))))))))))));
        boolean z = this.f4846r;
        return cbi.m3383d(this.f4844p, cbi.m3383d(this.f4838j, cbi.m3383d(this.f4843o, cbi.m3383d(this.f4842n, cbi.m3383d(this.f4841m, cbi.m3383d(this.f4831c, cbi.m3383d(this.f4830b, cbi.m3382c(z ? 1 : 0, cbi.m3382c(0, iM3382c)))))))));
    }

    @Override // 
    /* JADX INFO: renamed from: i */
    public bzs mo2856i() {
        try {
            bzs bzsVar = (bzs) super.clone();
            bqr bqrVar = new bqr();
            bzsVar.f4841m = bqrVar;
            bqrVar.m2928c(this.f4841m);
            caw cawVar = new caw();
            bzsVar.f4842n = cawVar;
            cawVar.putAll(this.f4842n);
            bzsVar.f4853y = false;
            bzsVar.f4845q = false;
            return bzsVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final bzs m3307m() {
        return m3294D(bwy.f4670c, new bwn());
    }

    /* JADX INFO: renamed from: n */
    public final bzs m3308n(Class cls) {
        if (this.f4845q) {
            return mo2856i().m3308n(cls);
        }
        bzq.m3278r(cls);
        this.f4843o = cls;
        this.f4849u |= 4096;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final bzs m3309o(bsk bskVar) {
        if (this.f4845q) {
            return mo2856i().m3309o(bskVar);
        }
        bzq.m3278r(bskVar);
        this.f4830b = bskVar;
        this.f4849u |= 4;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final bzs m3310p() {
        if (this.f4845q) {
            return mo2856i().m3310p();
        }
        this.f4842n.clear();
        int i = this.f4849u;
        this.f4839k = false;
        this.f4840l = false;
        this.f4849u = (i & (-133121)) | 65536;
        this.f4847s = true;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final bzs m3311q() {
        return m3289a(bwy.f4668a, new bxg(), true);
    }

    /* JADX INFO: renamed from: r */
    public final bzs m3312r() {
        return m3313s(bwy.f4669b, new bwo());
    }

    /* JADX INFO: renamed from: s */
    public final bzs m3313s(bwy bwyVar, bqv bqvVar) {
        return m3289a(bwyVar, bqvVar, false);
    }

    /* JADX INFO: renamed from: t */
    public final bzs m3314t(bwy bwyVar, bqv bqvVar) {
        if (this.f4845q) {
            return mo2856i().m3314t(bwyVar, bqvVar);
        }
        m3298H(bwyVar);
        return m3293C(bqvVar, false);
    }

    /* JADX INFO: renamed from: u */
    public final bzs m3315u(int i, int i2) {
        if (this.f4845q) {
            return mo2856i().m3315u(i, i2);
        }
        this.f4837i = i;
        this.f4836h = i2;
        this.f4849u |= 512;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final bzs m3316v(Drawable drawable) {
        if (this.f4845q) {
            return mo2856i().m3316v(drawable);
        }
        this.f4833e = drawable;
        int i = this.f4849u | 64;
        this.f4834f = 0;
        this.f4849u = i & (-129);
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final bzs m3317w(bpe bpeVar) {
        if (this.f4845q) {
            return mo2856i().m3317w(bpeVar);
        }
        bzq.m3278r(bpeVar);
        this.f4831c = bpeVar;
        this.f4849u |= 8;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: x */
    final bzs m3318x(bqq bqqVar) {
        if (this.f4845q) {
            return mo2856i().m3318x(bqqVar);
        }
        this.f4841m.f4198b.remove(bqqVar);
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final bzs m3319y(bqq bqqVar, Object obj) {
        if (this.f4845q) {
            return mo2856i().m3319y(bqqVar, obj);
        }
        bzq.m3278r(bqqVar);
        bzq.m3278r(obj);
        this.f4841m.m2929d(bqqVar, obj);
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final bzs m3320z(bqn bqnVar) {
        if (this.f4845q) {
            return mo2856i().m3320z(bqnVar);
        }
        bzq.m3278r(bqnVar);
        this.f4838j = bqnVar;
        this.f4849u |= 1024;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: P */
    public final void m3306P() {
        if (this.f4853y && !this.f4845q) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f4845q = true;
        m3304N();
    }
}
