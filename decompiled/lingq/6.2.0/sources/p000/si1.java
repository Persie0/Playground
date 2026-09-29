package p000;

import androidx.compose.p002ui.graphics.colorspace.C0308a;

/* JADX INFO: loaded from: classes.dex */
public abstract class si1 {

    /* JADX INFO: renamed from: a */
    public static final t56 f60887a;

    static {
        C0308a c0308a = va1.f65100e;
        int i = c0308a.f60576c;
        pi1 pi1Var = new pi1(c0308a, c0308a, 1);
        int i2 = c0308a.f60576c;
        fr6 fr6Var = va1.f65119x;
        int i3 = (fr6Var.f60576c << 6) | i2;
        ri1 ri1Var = new ri1(c0308a, fr6Var, 0);
        int i4 = (i2 << 6) | fr6Var.f60576c;
        ri1 ri1Var2 = new ri1(fr6Var, c0308a, 0);
        t56 t56Var = e84.f36837a;
        t56 t56Var2 = new t56();
        t56Var2.m21850i(i | (i << 6), pi1Var);
        t56Var2.m21850i(i3, ri1Var);
        t56Var2.m21850i(i4, ri1Var2);
        f60887a = t56Var2;
    }
}
