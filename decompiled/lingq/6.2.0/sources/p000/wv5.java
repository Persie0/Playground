package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wv5 {

    /* JADX INFO: renamed from: a */
    public boolean f67353a;

    /* JADX INFO: renamed from: b */
    public final Object f67354b;

    /* JADX INFO: renamed from: c */
    public final Object f67355c;

    /* JADX INFO: renamed from: d */
    public final Object f67356d;

    /* JADX INFO: renamed from: e */
    public final Object f67357e;

    /* JADX INFO: renamed from: f */
    public final Object f67358f;

    /* JADX INFO: renamed from: g */
    public final Object f67359g;

    /* JADX INFO: renamed from: h */
    public final Object f67360h;

    /* JADX INFO: renamed from: i */
    public final Object f67361i;

    /* JADX INFO: renamed from: j */
    public final Object f67362j;

    /* JADX INFO: renamed from: k */
    public Object f67363k;

    /* JADX INFO: renamed from: l */
    public Object f67364l;

    public wv5() {
        this.f67354b = new l49[4];
        this.f67355c = new Matrix[4];
        this.f67356d = new Matrix[4];
        this.f67357e = new PointF();
        this.f67358f = new Path();
        this.f67359g = new Path();
        this.f67360h = new l49();
        this.f67361i = new float[2];
        this.f67362j = new float[2];
        this.f67363k = new Path();
        this.f67364l = new Path();
        this.f67353a = true;
        for (int i = 0; i < 4; i++) {
            ((l49[]) this.f67354b)[i] = new l49();
            ((Matrix[]) this.f67355c)[i] = new Matrix();
            ((Matrix[]) this.f67356d)[i] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: e */
    public static wv5 m24163e() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? s39.f60243a : new wv5();
    }

    /* JADX INFO: renamed from: a */
    public z0a m24164a(int i, List list, l69 l69Var) {
        ArrayList arrayList = (ArrayList) this.f67355c;
        if (!list.isEmpty()) {
            this.f67363k = l69Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                vv5 vv5Var = (vv5) list.get(i2 - i);
                if (i2 > 0) {
                    vv5 vv5Var2 = (vv5) arrayList.get(i2 - 1);
                    vv5Var.m23559c(vv5Var2.f65982a.m20116z().mo17288o() + vv5Var2.f65985d);
                } else {
                    vv5Var.m23559c(0);
                }
                int iMo17288o = vv5Var.f65982a.m20116z().mo17288o();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((vv5) arrayList.get(i3)).f65985d += iMo17288o;
                }
                arrayList.add(i2, vv5Var);
                ((HashMap) this.f67357e).put(vv5Var.f65983b, vv5Var);
                if (this.f67353a) {
                    m24170h(vv5Var);
                    if (((IdentityHashMap) this.f67356d).isEmpty()) {
                        ((HashSet) this.f67360h).add(vv5Var);
                    } else {
                        uv5 uv5Var = (uv5) ((HashMap) this.f67358f).get(vv5Var);
                        if (uv5Var != null) {
                            uv5Var.f64403a.m19799d(uv5Var.f64404b);
                        }
                    }
                }
            }
        }
        return m24166c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public void m24165b(r39 r39Var, float[] fArr, float f, RectF rectF, or3 or3Var, Path path) {
        char c;
        int i;
        to2 to2Var;
        Path path2;
        or3 or3Var2;
        char c2;
        fn1 x21Var;
        i9d i9dVar;
        or3 or3Var3 = or3Var;
        Path path3 = path;
        Matrix[] matrixArr = (Matrix[]) this.f67356d;
        float[] fArr2 = (float[]) this.f67361i;
        l49[] l49VarArr = (l49[]) this.f67354b;
        Matrix[] matrixArr2 = (Matrix[]) this.f67355c;
        path3.rewind();
        Path path4 = (Path) this.f67358f;
        path4.rewind();
        Path path5 = (Path) this.f67359g;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            c = 0;
            int i3 = 1;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f67357e;
            if (fArr != null) {
                x21Var = new x21(fArr[i2]);
                i3 = 1;
            } else if (i2 == 1) {
                x21Var = r39Var.f58568g;
            } else if (i2 != 2) {
                x21Var = i2 != 3 ? r39Var.f58567f : r39Var.f58566e;
            } else {
                x21Var = r39Var.f58569h;
            }
            if (i2 == i3) {
                i9dVar = r39Var.f58564c;
            } else if (i2 != 2) {
                i9dVar = i2 != 3 ? r39Var.f58563b : r39Var.f58562a;
            } else {
                i9dVar = r39Var.f58565d;
            }
            Matrix[] matrixArr3 = matrixArr;
            l49 l49Var = l49VarArr[i2];
            i9dVar.getClass();
            i9dVar.mo13750e(l49Var, f, x21Var.mo11947a(rectF));
            int i4 = i2 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            l49 l49Var2 = l49VarArr[i2];
            fArr2[0] = l49Var2.f49049c;
            fArr2[1] = l49Var2.f49050d;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i2].preRotate(f2);
            i2 = i4;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c3 = 1;
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            l49 l49Var3 = l49VarArr[i5];
            fArr2[c] = l49Var3.f49047a;
            fArr2[c3] = l49Var3.f49048b;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path3.moveTo(fArr2[c], fArr2[c3]);
            } else {
                path3.lineTo(fArr2[c], fArr2[c3]);
            }
            l49VarArr[i5].m15798b(matrixArr2[i5], path3);
            if (or3Var3 != null) {
                l49 l49Var4 = l49VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                fs5 fs5Var = (fs5) or3Var3.f54782a;
                BitSet bitSet = fs5Var.f39581e;
                l49Var4.getClass();
                bitSet.set(i5, (boolean) c);
                k49[] k49VarArr = fs5Var.f39579c;
                l49Var4.m15797a(l49Var4.f49052f);
                k49VarArr[i5] = new e49(new ArrayList(l49Var4.f49054h), new Matrix(matrix));
            }
            Path path6 = (Path) this.f67363k;
            l49 l49Var5 = (l49) this.f67360h;
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            l49 l49Var6 = l49VarArr[i5];
            l49[] l49VarArr2 = l49VarArr;
            fArr2[0] = l49Var6.f49049c;
            fArr2[1] = l49Var6.f49050d;
            matrixArr2[i5].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.f67362j;
            l49 l49Var7 = l49VarArr2[i7];
            Matrix[] matrixArr5 = matrixArr2;
            fArr3[0] = l49Var7.f49047a;
            fArr3[1] = l49Var7.f49048b;
            matrixArr5[i7].mapPoints(fArr3);
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            l49 l49Var8 = l49VarArr2[i5];
            fArr2[0] = l49Var8.f49049c;
            fArr2[1] = l49Var8.f49050d;
            matrixArr5[i5].mapPoints(fArr2);
            float fAbs = (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            l49Var5.m15800d(0.0f, 0.0f, 270.0f, 0.0f);
            if (i5 == 1) {
                to2Var = r39Var.f58572k;
            } else if (i5 != 2) {
                to2Var = i5 != 3 ? r39Var.f58571j : r39Var.f58570i;
            } else {
                to2Var = r39Var.f58573l;
            }
            to2Var.mo13433i(fMax, fAbs, f, l49Var5);
            path6.reset();
            l49Var5.m15798b(matrixArr4[i5], path6);
            if (this.f67353a && (to2Var.mo14075f() || m24169g(path6, i5) || m24169g(path6, i7))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr2[0] = l49Var5.f49047a;
                c3 = 1;
                fArr2[1] = l49Var5.f49048b;
                matrixArr4[i5].mapPoints(fArr2);
                path4.moveTo(fArr2[0], fArr2[1]);
                l49Var5.m15798b(matrixArr4[i5], path4);
                path2 = path;
            } else {
                c3 = 1;
                path2 = path;
                l49Var5.m15798b(matrixArr4[i5], path2);
            }
            if (or3Var != null) {
                Matrix matrix2 = matrixArr4[i5];
                or3Var2 = or3Var;
                fs5 fs5Var2 = (fs5) or3Var2.f54782a;
                c2 = 0;
                fs5Var2.f39581e.set(i5 + 4, false);
                k49[] k49VarArr2 = fs5Var2.f39580d;
                l49Var5.m15797a(l49Var5.f49052f);
                k49VarArr2[i5] = new e49(new ArrayList(l49Var5.f49054h), new Matrix(matrix2));
            } else {
                or3Var2 = or3Var;
                c2 = 0;
            }
            path3 = path2;
            or3Var3 = or3Var2;
            i5 = i6;
            c = c2;
            l49VarArr = l49VarArr2;
            matrixArr2 = matrixArr5;
        }
        Path path7 = path3;
        path7.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: c */
    public z0a m24166c() {
        ArrayList arrayList = (ArrayList) this.f67355c;
        if (arrayList.isEmpty()) {
            return z0a.f70734a;
        }
        int iMo17288o = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            vv5 vv5Var = (vv5) arrayList.get(i);
            vv5Var.f65985d = iMo17288o;
            iMo17288o += vv5Var.f65982a.m20116z().mo17288o();
        }
        return new ve7(arrayList, (l69) this.f67363k);
    }

    /* JADX INFO: renamed from: d */
    public void m24167d() {
        Iterator it = ((HashSet) this.f67360h).iterator();
        while (it.hasNext()) {
            vv5 vv5Var = (vv5) it.next();
            if (vv5Var.f65984c.isEmpty()) {
                uv5 uv5Var = (uv5) ((HashMap) this.f67358f).get(vv5Var);
                if (uv5Var != null) {
                    uv5Var.f64403a.m19799d(uv5Var.f64404b);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m24168f(vv5 vv5Var) {
        if (vv5Var.f65986e && vv5Var.f65984c.isEmpty()) {
            uv5 uv5Var = (uv5) ((HashMap) this.f67358f).remove(vv5Var);
            uv5Var.getClass();
            tv5 tv5Var = uv5Var.f64405c;
            q90 q90Var = uv5Var.f64403a;
            q90Var.m19803p(uv5Var.f64404b);
            q90Var.m19805s(tv5Var);
            q90Var.m19804r(tv5Var);
            ((HashSet) this.f67360h).remove(vv5Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m24169g(Path path, int i) {
        Path path2 = (Path) this.f67364l;
        path2.reset();
        ((l49[]) this.f67354b)[i].m15798b(((Matrix[]) this.f67355c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX INFO: renamed from: h */
    public void m24170h(vv5 vv5Var) {
        qq5 qq5Var = vv5Var.f65982a;
        ef1 ef1Var = new ef1(this, 1);
        tv5 tv5Var = new tv5(this, vv5Var);
        ((HashMap) this.f67358f).put(vv5Var, new uv5(qq5Var, ef1Var, tv5Var));
        String str = uma.f64080a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        qq5Var.m19798b(new Handler(looperMyLooper, null), tv5Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        qq5Var.m19797a(new Handler(looperMyLooper2, null), tv5Var);
        qq5Var.m19801l(ef1Var, (u52) this.f67364l, (xb7) this.f67354b);
    }

    /* JADX INFO: renamed from: i */
    public void m24171i(xu5 xu5Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f67356d;
        vv5 vv5Var = (vv5) identityHashMap.remove(xu5Var);
        vv5Var.getClass();
        vv5Var.f65982a.mo16940o(xu5Var);
        vv5Var.f65984c.remove(((nq5) xu5Var).f53129a);
        if (!identityHashMap.isEmpty()) {
            m24167d();
        }
        m24168f(vv5Var);
    }

    /* JADX INFO: renamed from: j */
    public void m24172j(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f67355c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            vv5 vv5Var = (vv5) arrayList.remove(i3);
            ((HashMap) this.f67357e).remove(vv5Var.f65983b);
            int i4 = -vv5Var.f65982a.m20116z().mo17288o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((vv5) arrayList.get(i5)).f65985d += i4;
            }
            vv5Var.f65986e = true;
            if (this.f67353a) {
                m24168f(vv5Var);
            }
        }
    }

    public wv5(rw2 rw2Var, l52 l52Var, qp9 qp9Var, xb7 xb7Var) {
        this.f67354b = xb7Var;
        this.f67359g = rw2Var;
        this.f67363k = new l69();
        this.f67356d = new IdentityHashMap();
        this.f67357e = new HashMap();
        this.f67355c = new ArrayList();
        this.f67361i = l52Var;
        this.f67362j = qp9Var;
        this.f67358f = new HashMap();
        this.f67360h = new HashSet();
    }
}
