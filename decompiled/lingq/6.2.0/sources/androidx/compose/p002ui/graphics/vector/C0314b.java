package androidx.compose.p002ui.graphics.vector;

import android.graphics.Path;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3122is;
import p000.AbstractC3650uj;
import p000.C3500qj;
import p000.C3576sj;
import p000.cs4;
import p000.el9;
import p000.fa4;
import p000.ona;
import p000.soa;
import p000.vi0;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0314b extends ona {

    /* JADX INFO: renamed from: b */
    public vi0 f4027b;

    /* JADX INFO: renamed from: c */
    public float f4028c = 1.0f;

    /* JADX INFO: renamed from: d */
    public List f4029d;

    /* JADX INFO: renamed from: e */
    public float f4030e;

    /* JADX INFO: renamed from: f */
    public float f4031f;

    /* JADX INFO: renamed from: g */
    public vi0 f4032g;

    /* JADX INFO: renamed from: h */
    public int f4033h;

    /* JADX INFO: renamed from: i */
    public int f4034i;

    /* JADX INFO: renamed from: j */
    public float f4035j;

    /* JADX INFO: renamed from: k */
    public float f4036k;

    /* JADX INFO: renamed from: l */
    public float f4037l;

    /* JADX INFO: renamed from: m */
    public float f4038m;

    /* JADX INFO: renamed from: n */
    public boolean f4039n;

    /* JADX INFO: renamed from: o */
    public boolean f4040o;

    /* JADX INFO: renamed from: p */
    public boolean f4041p;

    /* JADX INFO: renamed from: q */
    public el9 f4042q;

    /* JADX INFO: renamed from: r */
    public final C3500qj f4043r;

    /* JADX INFO: renamed from: s */
    public C3500qj f4044s;

    /* JADX INFO: renamed from: t */
    public C3500qj f4045t;

    /* JADX INFO: renamed from: u */
    public final cs4 f4046u;

    public C0314b() {
        int i = soa.f61116a;
        this.f4029d = EmptyList.f47638a;
        this.f4030e = 1.0f;
        this.f4033h = 0;
        this.f4034i = 0;
        this.f4035j = 4.0f;
        this.f4037l = 1.0f;
        this.f4039n = true;
        this.f4040o = true;
        C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
        this.f4043r = c3500qjM22757a;
        this.f4044s = c3500qjM22757a;
        this.f4046u = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, PathComponent$pathMeasure$2.f4004b);
    }

    @Override // p000.ona
    /* JADX INFO: renamed from: a */
    public final void mo1435a(InterfaceC0310a interfaceC0310a) {
        el9 el9Var;
        if (this.f4039n) {
            AbstractC3122is.m14086E(this.f4029d, this.f4043r);
            m1441e();
        } else if (this.f4041p) {
            m1441e();
        }
        this.f4039n = false;
        this.f4041p = false;
        vi0 vi0Var = this.f4027b;
        if (vi0Var != null) {
            InterfaceC0310a.m1413G0(interfaceC0310a, this.f4044s, vi0Var, this.f4028c, null, null, 56);
        }
        vi0 vi0Var2 = this.f4032g;
        if (vi0Var2 != null) {
            el9 el9Var2 = this.f4042q;
            if (this.f4040o || el9Var2 == null) {
                el9 el9Var3 = new el9(this.f4031f, this.f4035j, this.f4033h, this.f4034i, 16);
                this.f4042q = el9Var3;
                this.f4040o = false;
                el9Var = el9Var3;
            } else {
                el9Var = el9Var2;
            }
            InterfaceC0310a.m1413G0(interfaceC0310a, this.f4044s, vi0Var2, this.f4030e, el9Var, null, 48);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1441e() {
        float f = this.f4036k;
        C3500qj c3500qj = this.f4043r;
        if (f == 0.0f && this.f4037l == 1.0f) {
            this.f4044s = c3500qj;
            return;
        }
        if (fa4.m11650l(this.f4044s, c3500qj)) {
            this.f4044s = AbstractC3650uj.m22757a();
        } else {
            int i = this.f4044s.f57839a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f4044s.m19992i();
            this.f4044s.m19993j(i);
        }
        cs4 cs4Var = this.f4046u;
        ((C3576sj) cs4Var.getValue()).f60911a.setPath(c3500qj != null ? c3500qj.f57839a : null, false);
        float length = ((C3576sj) cs4Var.getValue()).f60911a.getLength();
        float f2 = this.f4036k;
        float f3 = this.f4038m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.f4037l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((C3576sj) cs4Var.getValue()).m21398a(f4, f5, this.f4044s);
            return;
        }
        C3500qj c3500qjM22757a = this.f4045t;
        if (c3500qjM22757a == null) {
            c3500qjM22757a = AbstractC3650uj.m22757a();
            this.f4045t = c3500qjM22757a;
        }
        c3500qjM22757a.m19991h();
        ((C3576sj) cs4Var.getValue()).m21398a(f4, length, c3500qjM22757a);
        C3500qj.m19984a(this.f4044s, c3500qjM22757a);
        c3500qjM22757a.m19991h();
        ((C3576sj) cs4Var.getValue()).m21398a(0.0f, f5, c3500qjM22757a);
        C3500qj.m19984a(this.f4044s, c3500qjM22757a);
    }

    public final String toString() {
        return this.f4043r.toString();
    }
}
