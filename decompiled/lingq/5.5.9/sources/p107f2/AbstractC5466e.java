package p107f2;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import p038c2.AbstractC1659b;
import p038c2.AbstractC1672o;
import p290o6.C7967l0;

/* JADX INFO: renamed from: f2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5466e extends AbstractC1672o {

    /* JADX INFO: renamed from: f2.e$a */
    public static class a extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setAlpha(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$b */
    public static class b extends AbstractC5466e {

        /* JADX INFO: renamed from: k */
        public final String f34041k;

        /* JADX INFO: renamed from: l */
        public final SparseArray<ConstraintAttribute> f34042l;

        /* JADX INFO: renamed from: m */
        public final SparseArray<float[]> f34043m = new SparseArray<>();

        /* JADX INFO: renamed from: n */
        public float[] f34044n;

        /* JADX INFO: renamed from: o */
        public float[] f34045o;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f34041k = str.split(",")[1];
            this.f34042l = sparseArray;
        }

        @Override // p038c2.AbstractC1672o
        /* JADX INFO: renamed from: b */
        public final void mo5404b(float f3, float f10, float f11, int i10, int i11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // p038c2.AbstractC1672o
        /* JADX INFO: renamed from: c */
        public final void mo5405c(int i10) {
            SparseArray<ConstraintAttribute> sparseArray = this.f34042l;
            int size = sparseArray.size();
            int iM2860c = sparseArray.valueAt(0).m2860c();
            double[] dArr = new double[size];
            int i11 = iM2860c + 2;
            this.f34044n = new float[i11];
            this.f34045o = new float[iM2860c];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseArray.keyAt(i12);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i12);
                float[] fArrValueAt = this.f34043m.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.m2859b(this.f34044n);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f34044n;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iM2860c] = fArrValueAt[0];
                dArr3[iM2860c + 1] = fArrValueAt[1];
            }
            this.f9370a = AbstractC1659b.m5382a(i10, dArr, dArr2);
        }

        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            this.f9370a.mo5372d(f3, this.f34044n);
            float[] fArr = this.f34044n;
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            long j11 = j10 - this.f9378i;
            if (Float.isNaN(this.f9379j)) {
                float fM15808f = c7967l0.m15808f(this.f34041k, view);
                this.f9379j = fM15808f;
                if (Float.isNaN(fM15808f)) {
                    this.f9379j = 0.0f;
                }
            }
            float f12 = (float) ((((j11 * 1.0E-9d) * ((double) f10)) + ((double) this.f9379j)) % 1.0d);
            this.f9379j = f12;
            this.f9378i = j10;
            float fM5403a = m5403a(f12);
            this.f9377h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f34045o;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f9377h;
                float f13 = this.f34044n[i10];
                this.f9377h = z10 | (((double) f13) != 0.0d);
                fArr2[i10] = (f13 * fM5403a) + f11;
                i10++;
            }
            C5462a.m11702b(this.f34042l.valueAt(0), view, this.f34045o);
            if (f10 != 0.0f) {
                this.f9377h = true;
            }
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$c */
    public static class c extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setElevation(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$d */
    public static class d extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$e */
    public static class e extends AbstractC5466e {

        /* JADX INFO: renamed from: k */
        public boolean f34046k = false;

        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m11706d(f3, j10, view, c7967l0));
            } else {
                if (this.f34046k) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f34046k = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(m11706d(f3, j10, view, c7967l0)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    }
                }
            }
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$f */
    public static class f extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setRotation(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$g */
    public static class g extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setRotationX(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$h */
    public static class h extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setRotationY(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$i */
    public static class i extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setScaleX(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$j */
    public static class j extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setScaleY(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$k */
    public static class k extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setTranslationX(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$l */
    public static class l extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setTranslationY(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: f2.e$m */
    public static class m extends AbstractC5466e {
        @Override // p107f2.AbstractC5466e
        /* JADX INFO: renamed from: e */
        public final boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0) {
            view.setTranslationZ(m11706d(f3, j10, view, c7967l0));
            return this.f9377h;
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m11706d(float f3, long j10, View view, C7967l0 c7967l0) {
        float[] fArr = this.f9376g;
        this.f9370a.mo5372d(f3, fArr);
        boolean z10 = true;
        float f10 = fArr[1];
        if (f10 == 0.0f) {
            this.f9377h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f9379j)) {
            float fM15808f = c7967l0.m15808f(this.f9375f, view);
            this.f9379j = fM15808f;
            if (Float.isNaN(fM15808f)) {
                this.f9379j = 0.0f;
            }
        }
        float f11 = (float) (((((j10 - this.f9378i) * 1.0E-9d) * ((double) f10)) + ((double) this.f9379j)) % 1.0d);
        this.f9379j = f11;
        String str = this.f9375f;
        HashMap map = (HashMap) c7967l0.f43382a;
        if (map.containsKey(view)) {
            HashMap map2 = (HashMap) map.get(view);
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = (float[]) map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f11;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f11});
                map.put(view, map2);
            }
        } else {
            HashMap map3 = new HashMap();
            map3.put(str, new float[]{f11});
            map.put(view, map3);
        }
        this.f9378i = j10;
        float f12 = fArr[0];
        float fM5403a = (m5403a(this.f9379j) * f12) + fArr[2];
        if (f12 == 0.0f && f10 == 0.0f) {
            z10 = false;
        }
        this.f9377h = z10;
        return fM5403a;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo11707e(float f3, long j10, View view, C7967l0 c7967l0);
}
