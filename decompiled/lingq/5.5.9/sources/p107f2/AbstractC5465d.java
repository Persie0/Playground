package p107f2;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p038c2.AbstractC1659b;
import p038c2.AbstractC1667j;

/* JADX INFO: renamed from: f2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5465d extends AbstractC1667j {

    /* JADX INFO: renamed from: f2.d$a */
    public static class a extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setAlpha(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$b */
    public static class b extends AbstractC5465d {

        /* JADX INFO: renamed from: f */
        public final SparseArray<ConstraintAttribute> f34038f;

        /* JADX INFO: renamed from: g */
        public float[] f34039g;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(",")[1];
            this.f34038f = sparseArray;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p038c2.AbstractC1667j
        /* JADX INFO: renamed from: b */
        public final void mo5397b(int i10, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // p038c2.AbstractC1667j
        /* JADX INFO: renamed from: c */
        public final void mo5398c(int i10) {
            SparseArray<ConstraintAttribute> sparseArray = this.f34038f;
            int size = sparseArray.size();
            int iM2860c = sparseArray.valueAt(0).m2860c();
            double[] dArr = new double[size];
            this.f34039g = new float[iM2860c];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM2860c);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.m2859b(this.f34039g);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f34039g;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f9342a = AbstractC1659b.m5382a(i10, dArr, dArr2);
        }

        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            this.f9342a.mo5372d(f3, this.f34039g);
            C5462a.m11702b(this.f34038f.valueAt(0), view, this.f34039g);
        }
    }

    /* JADX INFO: renamed from: f2.d$c */
    public static class c extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setElevation(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$d */
    public static class d extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
        }
    }

    /* JADX INFO: renamed from: f2.d$e */
    public static class e extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setPivotX(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$f */
    public static class f extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setPivotY(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$g */
    public static class g extends AbstractC5465d {

        /* JADX INFO: renamed from: f */
        public boolean f34040f = false;

        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m5396a(f3));
                return;
            }
            if (this.f34040f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f34040f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m5396a(f3)));
                } catch (IllegalAccessException e10) {
                    Log.e("ViewSpline", "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e("ViewSpline", "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f2.d$h */
    public static class h extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setRotation(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$i */
    public static class i extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setRotationX(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$j */
    public static class j extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setRotationY(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$k */
    public static class k extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setScaleX(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$l */
    public static class l extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setScaleY(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$m */
    public static class m extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setTranslationX(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$n */
    public static class n extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setTranslationY(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.d$o */
    public static class o extends AbstractC5465d {
        @Override // p107f2.AbstractC5465d
        /* JADX INFO: renamed from: d */
        public final void mo11705d(View view, float f3) {
            view.setTranslationZ(m5396a(f3));
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo11705d(View view, float f3);
}
