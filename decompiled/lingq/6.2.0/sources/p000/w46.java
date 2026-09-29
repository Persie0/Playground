package p000;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class w46 {

    /* JADX INFO: renamed from: a */
    public final w41 f66376a;

    /* JADX INFO: renamed from: b */
    public final int f66377b;

    /* JADX INFO: renamed from: c */
    public final boolean f66378c;

    /* JADX INFO: renamed from: d */
    public final float f66379d;

    /* JADX INFO: renamed from: e */
    public final float f66380e;

    /* JADX INFO: renamed from: f */
    public final int f66381f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f66382g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f66383h;

    public w46(w41 w41Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iM3800h;
        int i5;
        this.f66376a = w41Var;
        this.f66377b = i;
        if (bk1.m3803k(j) != 0 || bk1.m3802j(j) != 0) {
            j54.m14288a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) w41Var.f66369e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            g37 g37Var = (g37) arrayList2.get(i6);
            C3462pj c3462pj = g37Var.f40120a;
            int iM3801i = bk1.m3801i(j);
            if (bk1.m3796d(j)) {
                i4 = i6;
                iM3800h = bk1.m3800h(j) - ((int) Math.ceil(f));
                if (iM3800h < 0) {
                    iM3800h = 0;
                }
            } else {
                i4 = i6;
                iM3800h = bk1.m3800h(j);
            }
            i3 = 0;
            C3300lj c3300lj = new C3300lj(c3462pj, this.f66377b - i7, i2, dk1.m10424b(0, iM3801i, 0, iM3800h, 5));
            float fM16239b = c3300lj.m16239b() + f;
            pw9 pw9Var = c3300lj.f49728d;
            int i8 = i7 + pw9Var.f56920g;
            arrayList.add(new f37(c3300lj, g37Var.f40121b, g37Var.f40122c, i7, i8, f, fM16239b));
            if (!pw9Var.f56917d) {
                if (i8 == this.f66377b) {
                    i5 = i4;
                    if (i5 != vz1.m23602H((ArrayList) this.f66376a.f66369e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fM16239b;
            }
            z = true;
            i7 = i8;
            f = fM16239b;
            break;
        }
        this.f66380e = f;
        this.f66381f = i7;
        this.f66378c = z;
        this.f66383h = arrayList;
        this.f66379d = bk1.m3801i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            f37 f37Var = (f37) arrayList.get(i9);
            List list = f37Var.f38358a.f49730f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                e28 e28Var = (e28) list.get(i10);
                arrayList4.add(e28Var != null ? f37Var.m11524a(e28Var) : null);
            }
            u91.m22630w0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f66376a.f66366b).size()) {
            int size4 = ((List) this.f66376a.f66366b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = u91.m22603U0(arrayList5, arrayList3);
        }
        this.f66382g = arrayList3;
    }

    /* JADX INFO: renamed from: i */
    public static void m23738i(w46 w46Var, ym0 ym0Var, long j, l39 l39Var, rt9 rt9Var, ml2 ml2Var) {
        ym0Var.mo17016h();
        ArrayList arrayList = w46Var.f66383h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f37 f37Var = (f37) arrayList.get(i);
            f37Var.f38358a.m16243f(ym0Var, j, l39Var, rt9Var, ml2Var);
            ym0Var.mo17023o(0.0f, f37Var.f38358a.m16239b());
        }
        ym0Var.mo17024p();
    }

    /* JADX INFO: renamed from: j */
    public static void m23739j(w46 w46Var, ym0 ym0Var, vi0 vi0Var, float f, l39 l39Var, rt9 rt9Var, ml2 ml2Var) {
        ym0Var.mo17016h();
        ArrayList arrayList = w46Var.f66383h;
        if (arrayList.size() <= 1 || (vi0Var instanceof pd9)) {
            l70.m15952o(w46Var, ym0Var, vi0Var, f, l39Var, rt9Var, ml2Var);
        } else {
            if (!(vi0Var instanceof i39)) {
                gm5.m12750e();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM16239b = 0.0f;
            for (int i = 0; i < size; i++) {
                f37 f37Var = (f37) arrayList.get(i);
                fM16239b += f37Var.f38358a.m16239b();
                fMax = Math.max(fMax, f37Var.f38358a.m16241d());
            }
            Shader shaderMo11320c = ((i39) vi0Var).mo11320c((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM16239b)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo11320c.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C3300lj c3300lj = ((f37) arrayList.get(i2)).f38358a;
                c3300lj.m16244g(ym0Var, new wi0(shaderMo11320c), f, l39Var, rt9Var, ml2Var);
                ym0Var.mo17023o(0.0f, c3300lj.m16239b());
                matrix.setTranslate(0.0f, -c3300lj.m16239b());
                shaderMo11320c.setLocalMatrix(matrix);
            }
        }
        ym0Var.mo17024p();
    }

    /* JADX INFO: renamed from: a */
    public final void m23740a(float[] fArr, long j) {
        m23748k(cx9.m9924f(j));
        m23749l(cx9.m9923e(j));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f47716a = 0;
        ci8.m4740y(this.f66383h, j, new sf0(j, fArr, ref$IntRef, new Ref$FloatRef()));
    }

    /* JADX INFO: renamed from: b */
    public final float m23741b(int i) {
        m23750m(i);
        ArrayList arrayList = this.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4738w(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        return c3300lj.f49728d.m19548e(i - f37Var.f38361d) + f37Var.f38363f;
    }

    /* JADX INFO: renamed from: c */
    public final int m23742c(int i, boolean z) {
        int iM19549f;
        m23750m(i);
        ArrayList arrayList = this.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4738w(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        int i2 = i - f37Var.f38361d;
        pw9 pw9Var = c3300lj.f49728d;
        if (z) {
            Layout layout = pw9Var.f56919f;
            ThreadLocal threadLocal = tw9.f63022a;
            if (layout.getEllipsisCount(i2) <= 0 || pw9Var.f56915b != TextUtils.TruncateAt.END) {
                w41 w41VarM19546c = pw9Var.m19546c();
                Layout layout2 = (Layout) w41VarM19546c.f66365a;
                iM19549f = w41VarM19546c.m23734w(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iM19549f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iM19549f = pw9Var.m19549f(i2);
        }
        return iM19549f + f37Var.f38359b;
    }

    /* JADX INFO: renamed from: d */
    public final int m23743d(int i) {
        int iM4737v;
        int length = ((C3419on) this.f66376a.f66365a).f54604b.length();
        ArrayList arrayList = this.f66383h;
        if (i >= length) {
            iM4737v = vz1.m23602H(arrayList);
        } else {
            iM4737v = i < 0 ? 0 : ci8.m4737v(i, arrayList);
        }
        f37 f37Var = (f37) arrayList.get(iM4737v);
        return f37Var.f38358a.f49728d.m19550g(f37Var.m11527d(i)) + f37Var.f38361d;
    }

    /* JADX INFO: renamed from: e */
    public final int m23744e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4739x(arrayList, f));
        int i = f37Var.f38360c - f37Var.f38359b;
        int i2 = f37Var.f38361d;
        if (i == 0) {
            return i2;
        }
        C3300lj c3300lj = f37Var.f38358a;
        float f2 = f - f37Var.f38363f;
        pw9 pw9Var = c3300lj.f49728d;
        int i3 = (int) f2;
        int i4 = pw9Var.f56920g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = pw9Var.f56919f.getLineForVertical(i3 - pw9Var.f56921h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    /* JADX INFO: renamed from: f */
    public final float m23745f(int i) {
        m23750m(i);
        ArrayList arrayList = this.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4738w(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        return c3300lj.f49728d.m19552i(i - f37Var.f38361d) + f37Var.f38363f;
    }

    /* JADX INFO: renamed from: g */
    public final int m23746g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4739x(arrayList, fIntBitsToFloat));
        int i2 = f37Var.f38360c;
        int i3 = f37Var.f38359b;
        if (i2 - i3 == 0) {
            return i3;
        }
        C3300lj c3300lj = f37Var.f38358a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - f37Var.f38363f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        pw9 pw9Var = c3300lj.f49728d;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        Layout layout = pw9Var.f56919f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - pw9Var.f56921h);
        if (lineForVertical >= pw9Var.f56920g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (pw9Var.m19545b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    /* JADX INFO: renamed from: h */
    public final long m23747h(e28 e28Var, int i, zv9 zv9Var) {
        long jM11525b;
        long j;
        float f = e28Var.f36621b;
        ArrayList arrayList = this.f66383h;
        int iM4739x = ci8.m4739x(arrayList, f);
        float f2 = ((f37) arrayList.get(iM4739x)).f38364g;
        float f3 = e28Var.f36623d;
        if (f2 >= f3 || iM4739x == vz1.m23602H(arrayList)) {
            f37 f37Var = (f37) arrayList.get(iM4739x);
            return f37Var.m11525b(f37Var.f38358a.m16240c(f37Var.m11526c(e28Var), i, zv9Var), true);
        }
        int iM4739x2 = ci8.m4739x(arrayList, f3);
        long jM11525b2 = cx9.f34692b;
        while (true) {
            jM11525b = cx9.f34692b;
            if (!cx9.m9920b(jM11525b2, jM11525b) || iM4739x > iM4739x2) {
                break;
            }
            f37 f37Var2 = (f37) arrayList.get(iM4739x);
            jM11525b2 = f37Var2.m11525b(f37Var2.f38358a.m16240c(f37Var2.m11526c(e28Var), i, zv9Var), true);
            iM4739x++;
        }
        if (cx9.m9920b(jM11525b2, jM11525b)) {
            return jM11525b;
        }
        while (true) {
            j = cx9.f34692b;
            if (!cx9.m9920b(jM11525b, j) || iM4739x > iM4739x2) {
                break;
            }
            f37 f37Var3 = (f37) arrayList.get(iM4739x2);
            jM11525b = f37Var3.m11525b(f37Var3.f38358a.m16240c(f37Var3.m11526c(e28Var), i, zv9Var), true);
            iM4739x2--;
        }
        return cx9.m9920b(jM11525b, j) ? jM11525b2 : eh0.m11127g((int) (jM11525b2 >> 32), (int) (4294967295L & jM11525b));
    }

    /* JADX INFO: renamed from: k */
    public final void m23748k(int i) {
        C3419on c3419on = (C3419on) this.f66376a.f66365a;
        if (i < 0 || i >= c3419on.f54604b.length()) {
            StringBuilder sbM22998u = ux5.m22998u("offset(", i, ") is out of bounds [0, ");
            sbM22998u.append(c3419on.f54604b.length());
            sbM22998u.append(')');
            j54.m14288a(sbM22998u.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m23749l(int i) {
        C3419on c3419on = (C3419on) this.f66376a.f66365a;
        if (i < 0 || i > c3419on.f54604b.length()) {
            StringBuilder sbM22998u = ux5.m22998u("offset(", i, ") is out of bounds [0, ");
            sbM22998u.append(c3419on.f54604b.length());
            sbM22998u.append(']');
            j54.m14288a(sbM22998u.toString());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m23750m(int i) {
        boolean z = false;
        int i2 = this.f66381f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        j54.m14288a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
