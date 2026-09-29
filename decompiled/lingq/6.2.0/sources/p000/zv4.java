package p000;

import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zv4 {

    /* JADX INFO: renamed from: a */
    public final C0144d f72257a;

    /* JADX INFO: renamed from: b */
    public final List f72258b;

    /* JADX INFO: renamed from: c */
    public final uv4 f72259c;

    /* JADX INFO: renamed from: d */
    public final xs4 f72260d;

    /* JADX INFO: renamed from: e */
    public final long f72261e;

    /* JADX INFO: renamed from: f */
    public final boolean f72262f;

    /* JADX INFO: renamed from: g */
    public final cu4 f72263g;

    /* JADX INFO: renamed from: h */
    public final int f72264h;

    /* JADX INFO: renamed from: i */
    public final long f72265i;

    /* JADX INFO: renamed from: j */
    public final int f72266j;

    /* JADX INFO: renamed from: k */
    public final int f72267k;

    /* JADX INFO: renamed from: l */
    public final int f72268l;

    /* JADX INFO: renamed from: m */
    public final un1 f72269m;

    /* JADX INFO: renamed from: n */
    public final boolean f72270n;

    /* JADX INFO: renamed from: o */
    public final List f72271o;

    /* JADX INFO: renamed from: p */
    public final qp3 f72272p;

    /* JADX INFO: renamed from: q */
    public final yv4 f72273q;

    /* JADX INFO: renamed from: r */
    public final C3047gq f72274r;

    /* JADX INFO: renamed from: s */
    public final int f72275s;

    public zv4(C0144d c0144d, List list, uv4 uv4Var, xs4 xs4Var, long j, boolean z, cu4 cu4Var, int i, long j2, int i2, int i3, int i4, un1 un1Var, boolean z2, List list2, qp3 qp3Var) {
        this.f72257a = c0144d;
        this.f72258b = list;
        this.f72259c = uv4Var;
        this.f72260d = xs4Var;
        this.f72261e = j;
        this.f72262f = z;
        this.f72263g = cu4Var;
        this.f72264h = i;
        this.f72265i = j2;
        this.f72266j = i2;
        this.f72267k = i3;
        this.f72268l = i4;
        this.f72269m = un1Var;
        this.f72270n = z2;
        this.f72271o = list2;
        this.f72272p = qp3Var;
        this.f72273q = new yv4(this, z, uv4Var, cu4Var, xs4Var);
        this.f72274r = c0144d.f2602e;
        this.f72275s = xs4Var.f68645b.length;
    }

    /* JADX INFO: renamed from: a */
    public final long m25810a(uv4 uv4Var, int i, int i2) {
        boolean zM4517s = uv4Var.f64401b.f62946b.m4517s(i);
        int i3 = zM4517s ? this.f72275s : 1;
        if (zM4517s) {
            i2 = 0;
        }
        return (((long) i2) << 32) | (((long) (i3 + i2)) & 4294967295L);
    }
}
