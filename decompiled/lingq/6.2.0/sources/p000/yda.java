package p000;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p002ui.graphics.vector.C0313a;
import androidx.compose.p002ui.graphics.vector.C0314b;
import androidx.compose.p002ui.graphics.vector.C0315c;
import androidx.compose.p002ui.graphics.vector.C0316d;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yda {
    /* JADX INFO: renamed from: a */
    public static final void m25094a(C0313a c0313a, roa roaVar) {
        List list = roaVar.f59665j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            toa toaVar = (toa) list.get(i);
            if (toaVar instanceof uoa) {
                C0314b c0314b = new C0314b();
                uoa uoaVar = (uoa) toaVar;
                c0314b.f4029d = uoaVar.f64143b;
                c0314b.f4039n = true;
                c0314b.m18175c();
                c0314b.f4044s.m19993j(uoaVar.f64144c);
                c0314b.m18175c();
                c0314b.m18175c();
                c0314b.f4027b = uoaVar.f64145d;
                c0314b.m18175c();
                c0314b.f4028c = uoaVar.f64146e;
                c0314b.m18175c();
                c0314b.f4032g = uoaVar.f64147f;
                c0314b.m18175c();
                c0314b.f4030e = uoaVar.f64148g;
                c0314b.m18175c();
                c0314b.f4031f = uoaVar.f64149h;
                c0314b.f4040o = true;
                c0314b.m18175c();
                c0314b.f4033h = uoaVar.f64150i;
                c0314b.f4040o = true;
                c0314b.m18175c();
                c0314b.f4034i = uoaVar.f64151j;
                c0314b.f4040o = true;
                c0314b.m18175c();
                c0314b.f4035j = uoaVar.f64152k;
                c0314b.f4040o = true;
                c0314b.m18175c();
                c0314b.f4036k = uoaVar.f64153l;
                c0314b.f4041p = true;
                c0314b.m18175c();
                c0314b.f4037l = uoaVar.f64140H;
                c0314b.f4041p = true;
                c0314b.m18175c();
                c0314b.f4038m = uoaVar.f64141I;
                c0314b.f4041p = true;
                c0314b.m18175c();
                c0313a.m1438e(i, c0314b);
            } else if (toaVar instanceof roa) {
                C0313a c0313a2 = new C0313a();
                roa roaVar2 = (roa) toaVar;
                c0313a2.f4018k = roaVar2.f59656a;
                c0313a2.m18175c();
                c0313a2.f4019l = roaVar2.f59657b;
                c0313a2.f4026s = true;
                c0313a2.m18175c();
                c0313a2.f4022o = roaVar2.f59660e;
                c0313a2.f4026s = true;
                c0313a2.m18175c();
                c0313a2.f4023p = roaVar2.f59661f;
                c0313a2.f4026s = true;
                c0313a2.m18175c();
                c0313a2.f4024q = roaVar2.f59662g;
                c0313a2.f4026s = true;
                c0313a2.m18175c();
                c0313a2.f4025r = roaVar2.f59663h;
                c0313a2.f4026s = true;
                c0313a2.m18175c();
                c0313a2.f4020m = roaVar2.f59658c;
                c0313a2.f4026s = true;
                c0313a2.m18175c();
                c0313a2.f4021n = roaVar2.f59659d;
                c0313a2.f4026s = true;
                c0313a2.m18175c();
                c0313a2.f4013f = roaVar2.f59664i;
                c0313a2.f4014g = true;
                c0313a2.m18175c();
                m25094a(c0313a2, roaVar2);
                c0313a.m1438e(i, c0313a2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m25095b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC3584sr.m21645x(configuration.fontWeightAdjustment + typeface.getWeight(), 1, DescriptorProtos.Edition.EDITION_2023_VALUE), typeface.isItalic());
    }

    /* JADX INFO: renamed from: c */
    public static final C0316d m25096c(p04 p04Var, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
        boolean zM22118f = tj3Var.m22118f((((long) Float.floatToRawIntBits(fb2Var.mo594a())) & 4294967295L) | (((long) Float.floatToRawIntBits(p04Var.f55367j)) << 32));
        Object objM22097O = tj3Var.m22097O();
        if (zM22118f || objM22097O == we1.f66679a) {
            C0313a c0313a = new C0313a();
            m25094a(c0313a, p04Var.f55363f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fb2Var.mo912g0(p04Var.f55359b))) << 32) | (((long) Float.floatToRawIntBits(fb2Var.mo912g0(p04Var.f55360c))) & 4294967295L);
            float fIntBitsToFloat = p04Var.f55361d;
            float fIntBitsToFloat2 = p04Var.f55362e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            C0316d c0316d = new C0316d(c0313a);
            String str = p04Var.f55358a;
            long j = p04Var.f55364g;
            qd0 qd0Var = j != 16 ? new qd0(p04Var.f55365h, j) : null;
            boolean z = p04Var.f55366i;
            ((xc9) c0316d.f4059e).setValue(new x89(jFloatToRawIntBits));
            ((xc9) c0316d.f4060f).setValue(Boolean.valueOf(z));
            C0315c c0315c = c0316d.f4061g;
            ((xc9) c0315c.f4052g).setValue(qd0Var);
            ((xc9) c0315c.f4054i).setValue(new x89(jFloatToRawIntBits2));
            c0315c.f4048c = str;
            tj3Var.m22131l0(c0316d);
            objM22097O = c0316d;
        }
        return (C0316d) objM22097O;
    }

    /* JADX INFO: renamed from: d */
    public static void m25097d(int i, int i2) {
        String strM4633h;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM4633h = cfd.m4633h("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C3386nv.m17626m(ux5.m22988k(i2, "negative size: "));
                    return;
                }
                strM4633h = cfd.m4633h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM4633h);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m25098e(int i, int i2, int i3) {
        String strM25099f;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM25099f = m25099f(i, "start index", i3);
            } else {
                strM25099f = (i2 < 0 || i2 > i3) ? m25099f(i2, "end index", i3) : cfd.m4633h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM25099f);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m25099f(int i, String str, int i2) {
        if (i < 0) {
            return cfd.m4633h("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return cfd.m4633h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C3386nv.m17626m(ux5.m22988k(i2, "negative size: "));
        return null;
    }
}
