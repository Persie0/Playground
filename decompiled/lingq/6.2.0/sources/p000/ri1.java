package p000;

import androidx.compose.p002ui.graphics.colorspace.C0308a;

/* JADX INFO: loaded from: classes.dex */
public class ri1 {

    /* JADX INFO: renamed from: a */
    public final sa1 f59344a;

    /* JADX INFO: renamed from: b */
    public final sa1 f59345b;

    /* JADX INFO: renamed from: c */
    public final sa1 f59346c;

    /* JADX INFO: renamed from: d */
    public final float[] f59347d;

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Illegal instructions before constructor call */
    public ri1(sa1 sa1Var, sa1 sa1Var2, int i) {
        float[] fArr;
        sa1 sa1VarM24347d = b34.m3243i(sa1Var.f60575b, 12884901888L) ? x74.m24347d(sa1Var) : sa1Var;
        sa1 sa1VarM24347d2 = b34.m3243i(sa1Var2.f60575b, 12884901888L) ? x74.m24347d(sa1Var2) : sa1Var2;
        float[] fArrM13658a = AbstractC3184kh.f47269k;
        if (i == 3) {
            boolean zM3243i = b34.m3243i(sa1Var.f60575b, 12884901888L);
            boolean zM3243i2 = b34.m3243i(sa1Var2.f60575b, 12884901888L);
            if (!(zM3243i && zM3243i2) && (zM3243i || zM3243i2)) {
                i4b i4bVar = ((C0308a) (zM3243i ? sa1Var : sa1Var2)).f3941d;
                float[] fArrM13658a2 = zM3243i ? i4bVar.m13658a() : fArrM13658a;
                fArrM13658a = zM3243i2 ? i4bVar.m13658a() : fArrM13658a;
                fArr = new float[]{fArrM13658a2[0] / fArrM13658a[0], fArrM13658a2[1] / fArrM13658a[1], fArrM13658a2[2] / fArrM13658a[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(sa1Var2, sa1VarM24347d, sa1VarM24347d2, fArr);
    }

    /* JADX INFO: renamed from: a */
    public long mo19178a(long j) {
        float fM204h = aa1.m204h(j);
        float fM203g = aa1.m203g(j);
        float fM201e = aa1.m201e(j);
        float fM200d = aa1.m200d(j);
        sa1 sa1Var = this.f59345b;
        long jMo1403d = sa1Var.mo1403d(fM204h, fM203g, fM201e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo1403d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo1403d & 4294967295L));
        float fMo1404e = sa1Var.mo1404e(fM204h, fM203g, fM201e);
        float[] fArr = this.f59347d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo1404e *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f59346c.mo1405f(f, f2, fMo1404e, fM200d, this.f59344a);
    }

    public ri1(sa1 sa1Var, sa1 sa1Var2, sa1 sa1Var3, float[] fArr) {
        this.f59344a = sa1Var;
        this.f59345b = sa1Var2;
        this.f59346c = sa1Var3;
        this.f59347d = fArr;
    }
}
