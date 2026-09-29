package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yv4 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final boolean f70547b;

    /* JADX INFO: renamed from: c */
    public final uv4 f70548c;

    /* JADX INFO: renamed from: d */
    public final cu4 f70549d;

    /* JADX INFO: renamed from: e */
    public final xs4 f70550e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zv4 f70551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv4(zv4 zv4Var, boolean z, uv4 uv4Var, cu4 cu4Var, xs4 xs4Var) {
        super(5);
        this.f70551f = zv4Var;
        this.f70547b = z;
        this.f70548c = uv4Var;
        this.f70549d = cu4Var;
        this.f70550e = xs4Var;
    }

    /* JADX INFO: renamed from: E */
    public final fw4 m25358E(int i, long j) {
        int i2;
        long jM10430h;
        uv4 uv4Var = this.f70548c;
        Object objMo15747c = uv4Var.mo15747c(i);
        Object objM996c = uv4Var.f64401b.m996c(i);
        xs4 xs4Var = this.f70550e;
        int[] iArr = xs4Var.f68645b;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = xs4Var.f68644a;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.f70547b) {
            if (i2 < 0) {
                k54.m14852a("width must be >= 0");
            }
            jM10430h = dk1.m10430h(i2, i2, 0, Integer.MAX_VALUE);
        } else {
            if (i2 < 0) {
                k54.m14852a("height must be >= 0");
            }
            jM10430h = dk1.m10430h(0, Integer.MAX_VALUE, i2, i2);
        }
        long j2 = jM10430h;
        List listM21328r = m21328r(this.f70549d, i, j2);
        zv4 zv4Var = this.f70551f;
        return new fw4(i, objMo15747c, listM21328r, zv4Var.f72262f, zv4Var.f72268l, i4, i5, zv4Var.f72266j, zv4Var.f72267k, objM996c, zv4Var.f72257a.f2617t, j2);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: p */
    public final du4 mo12211p(int i, int i2, int i3, long j) {
        uv4 uv4Var = this.f70548c;
        Object objMo15747c = uv4Var.mo15747c(i);
        Object objM996c = uv4Var.f64401b.m996c(i);
        List listM21328r = m21328r(this.f70549d, i, j);
        zv4 zv4Var = this.f70551f;
        return new fw4(i, objMo15747c, listM21328r, zv4Var.f72262f, zv4Var.f72268l, i2, i3, zv4Var.f72266j, zv4Var.f72267k, objM996c, zv4Var.f72257a.f2617t, j);
    }
}
