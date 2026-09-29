package p107f2;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p038c2.AbstractC1662e;

/* JADX INFO: renamed from: f2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5464c extends AbstractC1662e {

    /* JADX INFO: renamed from: f2.c$a */
    public static class a extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setAlpha(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$b */
    public static class b extends AbstractC5464c {

        /* JADX INFO: renamed from: g */
        public final float[] f34035g = new float[1];

        /* JADX INFO: renamed from: h */
        public ConstraintAttribute f34036h;

        @Override // p038c2.AbstractC1662e
        /* JADX INFO: renamed from: b */
        public final void mo5389b(ConstraintAttribute constraintAttribute) {
            this.f34036h = constraintAttribute;
        }

        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            float fM5388a = m5388a(f3);
            float[] fArr = this.f34035g;
            fArr[0] = fM5388a;
            C5462a.m11702b(this.f34036h, view, fArr);
        }
    }

    /* JADX INFO: renamed from: f2.c$c */
    public static class c extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setElevation(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$d */
    public static class d extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
        }
    }

    /* JADX INFO: renamed from: f2.c$e */
    public static class e extends AbstractC5464c {

        /* JADX INFO: renamed from: g */
        public boolean f34037g = false;

        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m5388a(f3));
                return;
            }
            if (this.f34037g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f34037g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m5388a(f3)));
                } catch (IllegalAccessException e10) {
                    Log.e("ViewOscillator", "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e("ViewOscillator", "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f2.c$f */
    public static class f extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setRotation(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$g */
    public static class g extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setRotationX(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$h */
    public static class h extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setRotationY(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$i */
    public static class i extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setScaleX(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$j */
    public static class j extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setScaleY(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$k */
    public static class k extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setTranslationX(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$l */
    public static class l extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setTranslationY(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: f2.c$m */
    public static class m extends AbstractC5464c {
        @Override // p107f2.AbstractC5464c
        /* JADX INFO: renamed from: d */
        public final void mo11704d(View view, float f3) {
            view.setTranslationZ(m5388a(f3));
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo11704d(View view, float f3);
}
