package p128g2;

import android.graphics.Rect;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p003a2.C0009a;
import p038c2.AbstractC1659b;
import p038c2.AbstractC1662e;
import p038c2.C1658a;
import p038c2.C1660c;
import p107f2.AbstractC5464c;
import p107f2.AbstractC5465d;
import p107f2.AbstractC5466e;
import p107f2.C5462a;
import p290o6.C7967l0;

/* JADX INFO: renamed from: g2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5676n {

    /* JADX INFO: renamed from: A */
    public C5673k[] f34607A;

    /* JADX INFO: renamed from: b */
    public View f34616b;

    /* JADX INFO: renamed from: c */
    public int f34617c;

    /* JADX INFO: renamed from: j */
    public AbstractC1659b[] f34624j;

    /* JADX INFO: renamed from: k */
    public C1658a f34625k;

    /* JADX INFO: renamed from: o */
    public int[] f34629o;

    /* JADX INFO: renamed from: p */
    public double[] f34630p;

    /* JADX INFO: renamed from: q */
    public double[] f34631q;

    /* JADX INFO: renamed from: r */
    public String[] f34632r;

    /* JADX INFO: renamed from: s */
    public int[] f34633s;

    /* JADX INFO: renamed from: x */
    public HashMap<String, AbstractC5466e> f34638x;

    /* JADX INFO: renamed from: y */
    public HashMap<String, AbstractC5465d> f34639y;

    /* JADX INFO: renamed from: z */
    public HashMap<String, AbstractC5464c> f34640z;

    /* JADX INFO: renamed from: a */
    public final Rect f34615a = new Rect();

    /* JADX INFO: renamed from: d */
    public boolean f34618d = false;

    /* JADX INFO: renamed from: e */
    public int f34619e = -1;

    /* JADX INFO: renamed from: f */
    public final C5679q f34620f = new C5679q();

    /* JADX INFO: renamed from: g */
    public final C5679q f34621g = new C5679q();

    /* JADX INFO: renamed from: h */
    public final C5674l f34622h = new C5674l();

    /* JADX INFO: renamed from: i */
    public final C5674l f34623i = new C5674l();

    /* JADX INFO: renamed from: l */
    public float f34626l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f34627m = 0.0f;

    /* JADX INFO: renamed from: n */
    public float f34628n = 1.0f;

    /* JADX INFO: renamed from: t */
    public final float[] f34634t = new float[4];

    /* JADX INFO: renamed from: u */
    public final ArrayList<C5679q> f34635u = new ArrayList<>();

    /* JADX INFO: renamed from: v */
    public final float[] f34636v = new float[1];

    /* JADX INFO: renamed from: w */
    public final ArrayList<AbstractC5666d> f34637w = new ArrayList<>();

    /* JADX INFO: renamed from: B */
    public int f34608B = -1;

    /* JADX INFO: renamed from: C */
    public int f34609C = -1;

    /* JADX INFO: renamed from: D */
    public View f34610D = null;

    /* JADX INFO: renamed from: E */
    public int f34611E = -1;

    /* JADX INFO: renamed from: F */
    public float f34612F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public Interpolator f34613G = null;

    /* JADX INFO: renamed from: H */
    public boolean f34614H = false;

    public C5676n(View view) {
        this.f34616b = view;
        this.f34617c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0759b) {
            ((ConstraintLayout.C0759b) layoutParams).getClass();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m12039e(int i10, int i11, int i12, Rect rect, Rect rect2) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((rect.height() + i13) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((rect.height() + i15) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = i11 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i16 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    /* JADX INFO: renamed from: a */
    public final float m12040a(float f3, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f34628n;
            if (f12 != 1.0d) {
                float f13 = this.f34627m;
                if (f3 < f13) {
                    f3 = 0.0f;
                }
                if (f3 > f13 && f3 < 1.0d) {
                    f3 = Math.min((f3 - f13) * f12, 1.0f);
                }
            }
        }
        C1660c c1660c = this.f34620f.f34651a;
        Iterator<C5679q> it = this.f34635u.iterator();
        float f14 = Float.NaN;
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C5679q next = it.next();
                C1660c c1660c2 = next.f34651a;
                if (c1660c2 == null) {
                    break;
                }
                float f15 = next.f34653c;
                if (f15 >= f3) {
                    if (!Float.isNaN(f14)) {
                        break;
                    }
                    f14 = next.f34653c;
                } else {
                    c1660c = c1660c2;
                    f10 = f15;
                }
            }
        }
        if (c1660c != null) {
            if (!Float.isNaN(f14)) {
                f11 = f14;
            }
            float f16 = f11 - f10;
            double d10 = (f3 - f10) / f16;
            f3 = (((float) c1660c.mo5384a(d10)) * f16) + f10;
            if (fArr != null) {
                fArr[0] = (float) c1660c.mo5385b(d10);
            }
        }
        return f3;
    }

    /* JADX INFO: renamed from: b */
    public final void m12041b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f34624j[0].mo5371c(d10, dArr);
        this.f34624j[0].mo5373e(d10, dArr2);
        float f3 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f34629o;
        C5679q c5679q = this.f34620f;
        float f10 = c5679q.f34655e;
        float f11 = c5679q.f34656f;
        float f12 = c5679q.f34657g;
        float f13 = c5679q.f34658h;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f17 = (float) dArr[i10];
            float f18 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f10 = f17;
                f3 = f18;
            } else if (i11 == 2) {
                f11 = f17;
                f16 = f18;
            } else if (i11 == 3) {
                f12 = f17;
                f14 = f18;
            } else if (i11 == 4) {
                f13 = f17;
                f15 = f18;
            }
        }
        float f19 = 2.0f;
        float f20 = (f14 / 2.0f) + f3;
        float fSin = (f15 / 2.0f) + f16;
        C5676n c5676n = c5679q.f34646H;
        if (c5676n != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            c5676n.m12041b(d10, fArr3, fArr4);
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            double d11 = f10;
            double d12 = f11;
            float fSin2 = (float) (((Math.sin(d12) * d11) + ((double) f21)) - ((double) (f12 / 2.0f)));
            float fCos = (float) ((((double) f22) - (Math.cos(d12) * d11)) - ((double) (f13 / 2.0f)));
            double d13 = f23;
            double d14 = f3;
            double d15 = f16;
            float fCos2 = (float) ((Math.cos(d12) * d15) + (Math.sin(d12) * d14) + d13);
            fSin = (float) ((Math.sin(d12) * d15) + (((double) f24) - (Math.cos(d12) * d14)));
            f11 = fCos;
            f20 = fCos2;
            f10 = fSin2;
            f19 = 2.0f;
        }
        fArr[0] = (f12 / f19) + f10 + 0.0f;
        fArr[1] = (f13 / f19) + f11 + 0.0f;
        fArr2[0] = f20;
        fArr2[1] = fSin;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0331  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final boolean m12042c(float f3, long j10, View view, C7967l0 c7967l0) {
        AbstractC5466e.d dVar;
        boolean zMo11707e;
        float f10;
        C5676n c5676n;
        boolean z10;
        C5679q c5679q;
        double d10;
        float f11;
        float f12;
        boolean z11;
        float f13;
        float fM12040a = m12040a(f3, null);
        int i10 = this.f34611E;
        float interpolation = 1.0f;
        if (i10 != -1) {
            float f14 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fM12040a / f14)) * f14;
            float f15 = (fM12040a % f14) / f14;
            if (!Float.isNaN(this.f34612F)) {
                f15 = (f15 + this.f34612F) % 1.0f;
            }
            Interpolator interpolator = this.f34613G;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(f15);
            } else if (f15 <= 0.5d) {
                interpolation = 0.0f;
            }
            fM12040a = (interpolation * f14) + fFloor;
        }
        float f16 = fM12040a;
        HashMap<String, AbstractC5465d> map = this.f34639y;
        if (map != null) {
            Iterator<AbstractC5465d> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().mo11705d(view, f16);
            }
        }
        HashMap<String, AbstractC5466e> map2 = this.f34638x;
        if (map2 != null) {
            dVar = null;
            zMo11707e = false;
            for (AbstractC5466e abstractC5466e : map2.values()) {
                if (abstractC5466e instanceof AbstractC5466e.d) {
                    dVar = (AbstractC5466e.d) abstractC5466e;
                } else {
                    zMo11707e |= abstractC5466e.mo11707e(f16, j10, view, c7967l0);
                }
            }
        } else {
            dVar = null;
            zMo11707e = false;
        }
        AbstractC1659b[] abstractC1659bArr = this.f34624j;
        C5679q c5679q2 = this.f34620f;
        if (abstractC1659bArr != null) {
            double d11 = f16;
            abstractC1659bArr[0].mo5371c(d11, this.f34630p);
            this.f34624j[0].mo5373e(d11, this.f34631q);
            C1658a c1658a = this.f34625k;
            if (c1658a != null) {
                double[] dArr = this.f34630p;
                if (dArr.length > 0) {
                    c1658a.mo5371c(d11, dArr);
                    this.f34625k.mo5373e(d11, this.f34631q);
                }
            }
            if (this.f34614H) {
                c5679q = c5679q2;
                d10 = d11;
                c5676n = this;
            } else {
                int[] iArr = this.f34629o;
                double[] dArr2 = this.f34630p;
                double[] dArr3 = this.f34631q;
                boolean z12 = this.f34618d;
                float f17 = c5679q2.f34655e;
                float f18 = c5679q2.f34656f;
                float f19 = c5679q2.f34657g;
                float f20 = c5679q2.f34658h;
                if (iArr.length != 0) {
                    f12 = f18;
                    if (c5679q2.f34649K.length <= iArr[iArr.length - 1]) {
                        int i11 = iArr[iArr.length - 1] + 1;
                        c5679q2.f34649K = new double[i11];
                        c5679q2.f34650L = new double[i11];
                    }
                } else {
                    f12 = f18;
                }
                Arrays.fill(c5679q2.f34649K, Double.NaN);
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    double[] dArr4 = c5679q2.f34649K;
                    int i13 = iArr[i12];
                    dArr4[i13] = dArr2[i12];
                    c5679q2.f34650L[i13] = dArr3[i12];
                }
                float f21 = Float.NaN;
                float f22 = 0.0f;
                int i14 = 0;
                float f23 = f20;
                float f24 = 0.0f;
                float f25 = 0.0f;
                float f26 = f17;
                float f27 = 0.0f;
                float f28 = f19;
                float f29 = f12;
                while (true) {
                    double[] dArr5 = c5679q2.f34649K;
                    z11 = z12;
                    if (i14 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i14])) {
                        f13 = f21;
                    } else {
                        f13 = f21;
                        float f30 = (float) (Double.isNaN(c5679q2.f34649K[i14]) ? 0.0d : c5679q2.f34649K[i14] + 0.0d);
                        float f31 = (float) c5679q2.f34650L[i14];
                        if (i14 == 1) {
                            f21 = f13;
                            f22 = f31;
                            f26 = f30;
                        } else if (i14 == 2) {
                            f27 = f31;
                            f29 = f30;
                        } else if (i14 == 3) {
                            f25 = f31;
                            f28 = f30;
                        } else if (i14 == 4) {
                            f24 = f31;
                            f23 = f30;
                        } else if (i14 == 5) {
                            f21 = f30;
                        }
                        i14++;
                        z12 = z11;
                    }
                    f21 = f13;
                    i14++;
                    z12 = z11;
                }
                float f32 = f21;
                C5676n c5676n2 = c5679q2.f34646H;
                if (c5676n2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    c5676n2.m12041b(d11, fArr, fArr2);
                    float f33 = fArr[0];
                    float f34 = fArr[1];
                    float f35 = fArr2[0];
                    float f36 = fArr2[1];
                    c5679q = c5679q2;
                    double d12 = f33;
                    double d13 = f26;
                    d10 = d11;
                    double d14 = f29;
                    float fSin = (float) (((Math.sin(d14) * d13) + d12) - ((double) (f28 / 2.0f)));
                    float fCos = (float) ((((double) f34) - (Math.cos(d14) * d13)) - ((double) (f23 / 2.0f)));
                    double d15 = f22;
                    double d16 = f27;
                    float fCos2 = (float) ((Math.cos(d14) * d13 * d16) + (Math.sin(d14) * d15) + ((double) f35));
                    float fSin2 = (float) ((Math.sin(d14) * d13 * d16) + (((double) f36) - (Math.cos(d14) * d15)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f32)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f32)));
                    }
                    f26 = fSin;
                    f29 = fCos;
                } else {
                    c5679q = c5679q2;
                    d10 = d11;
                    if (!Float.isNaN(f32)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2((f24 / 2.0f) + f27, (f25 / 2.0f) + f22)) + ((double) f32) + ((double) 0.0f)));
                    }
                }
                if (view instanceof InterfaceC5665c) {
                    ((InterfaceC5665c) view).m12023a();
                } else {
                    float f37 = f26 + 0.5f;
                    int i15 = (int) f37;
                    float f38 = f29 + 0.5f;
                    int i16 = (int) f38;
                    int i17 = (int) (f37 + f28);
                    int i18 = (int) (f38 + f23);
                    int i19 = i17 - i15;
                    int i20 = i18 - i16;
                    if (((i19 == view.getMeasuredWidth() && i20 == view.getMeasuredHeight()) ? false : true) || z11) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    }
                    view.layout(i15, i16, i17, i18);
                }
                c5676n = this;
                c5676n.f34618d = false;
            }
            if (c5676n.f34609C != -1) {
                if (c5676n.f34610D == null) {
                    c5676n.f34610D = ((View) view.getParent()).findViewById(c5676n.f34609C);
                }
                View view2 = c5676n.f34610D;
                if (view2 != null) {
                    float bottom = (c5676n.f34610D.getBottom() + view2.getTop()) / 2.0f;
                    float right = (c5676n.f34610D.getRight() + c5676n.f34610D.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view.setPivotX(left);
                        view.setPivotY(top);
                    }
                }
            }
            HashMap<String, AbstractC5465d> map3 = c5676n.f34639y;
            if (map3 != null) {
                for (AbstractC5465d abstractC5465d : map3.values()) {
                    if (abstractC5465d instanceof AbstractC5465d.d) {
                        double[] dArr6 = c5676n.f34631q;
                        if (dArr6.length > 1) {
                            f11 = f16;
                            view.setRotation(((AbstractC5465d.d) abstractC5465d).m5396a(f11) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        } else {
                            f11 = f16;
                        }
                    } else {
                        f11 = f16;
                    }
                    f16 = f11;
                }
            }
            f10 = f16;
            if (dVar != 0) {
                double[] dArr7 = c5676n.f34631q;
                view.setRotation(dVar.m11706d(f10, j10, view, c7967l0) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z10 = zMo11707e | dVar.f9377h;
            } else {
                z10 = zMo11707e;
            }
            int i21 = 1;
            while (true) {
                AbstractC1659b[] abstractC1659bArr2 = c5676n.f34624j;
                if (i21 >= abstractC1659bArr2.length) {
                    break;
                }
                AbstractC1659b abstractC1659b = abstractC1659bArr2[i21];
                float[] fArr3 = c5676n.f34634t;
                abstractC1659b.mo5372d(d10, fArr3);
                C5462a.m11702b(c5679q.f34647I.get(c5676n.f34632r[i21 - 1]), view, fArr3);
                i21++;
            }
            C5674l c5674l = c5676n.f34622h;
            if (c5674l.f34595b == 0) {
                if (f10 <= 0.0f) {
                    view.setVisibility(c5674l.f34596c);
                } else {
                    C5674l c5674l2 = c5676n.f34623i;
                    if (f10 >= 1.0f) {
                        view.setVisibility(c5674l2.f34596c);
                    } else if (c5674l2.f34596c != c5674l.f34596c) {
                        view.setVisibility(0);
                    }
                }
            }
            if (c5676n.f34607A != null) {
                int i22 = 0;
                while (true) {
                    C5673k[] c5673kArr = c5676n.f34607A;
                    if (i22 >= c5673kArr.length) {
                        break;
                    }
                    c5673kArr[i22].m12033g(view, f10);
                    i22++;
                }
            }
        } else {
            f10 = f16;
            boolean z13 = zMo11707e;
            c5676n = this;
            float f39 = c5679q2.f34655e;
            C5679q c5679q3 = c5676n.f34621g;
            float fM845d = C0204c.m845d(c5679q3.f34655e, f39, f10, f39);
            float f40 = c5679q2.f34656f;
            float fM845d2 = C0204c.m845d(c5679q3.f34656f, f40, f10, f40);
            float f41 = c5679q2.f34657g;
            float f42 = c5679q3.f34657g;
            float fM845d3 = C0204c.m845d(f42, f41, f10, f41);
            float f43 = c5679q2.f34658h;
            float f44 = c5679q3.f34658h;
            float f45 = fM845d + 0.5f;
            int i23 = (int) f45;
            float f46 = fM845d2 + 0.5f;
            int i24 = (int) f46;
            int i25 = (int) (f45 + fM845d3);
            int iM845d = (int) (f46 + C0204c.m845d(f44, f43, f10, f43));
            int i26 = i25 - i23;
            int i27 = iM845d - i24;
            if (f42 != f41 || f44 != f43 || c5676n.f34618d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i26, 1073741824), View.MeasureSpec.makeMeasureSpec(i27, 1073741824));
                c5676n.f34618d = false;
            }
            view.layout(i23, i24, i25, iM845d);
            z10 = z13;
        }
        HashMap<String, AbstractC5464c> map4 = c5676n.f34640z;
        if (map4 != null) {
            for (AbstractC5464c abstractC5464c : map4.values()) {
                if (abstractC5464c instanceof AbstractC5464c.d) {
                    double[] dArr8 = c5676n.f34631q;
                    view.setRotation(((AbstractC5464c.d) abstractC5464c).m5388a(f10) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    abstractC5464c.mo11704d(view, f10);
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m12043d(C5679q c5679q) {
        c5679q.m12049i((int) this.f34616b.getX(), (int) this.f34616b.getY(), this.f34616b.getWidth(), this.f34616b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:254:0x060d  */
    /* JADX INFO: renamed from: f */
    public final void m12044f(int i10, int i11, long j10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Object obj;
        Object obj2;
        Object obj3;
        String str11;
        ArrayList<C5679q> arrayList2;
        ArrayList<AbstractC5666d> arrayList3;
        String str12;
        String str13;
        String str14;
        Object obj4;
        Object obj5;
        Object obj6;
        C5676n c5676n;
        String str15;
        Object obj7;
        String str16;
        Object obj8;
        String str17;
        Object obj9;
        String str18;
        String str19;
        String str20;
        String str21;
        AbstractC5464c abstractC5464c;
        String str22;
        String str23;
        String str24;
        byte b10;
        byte b11;
        byte b12;
        float f3;
        float f10;
        HashMap<String, AbstractC5464c> map;
        String str25;
        String str26;
        String str27;
        String str28;
        byte b13;
        byte b14;
        byte b15;
        AbstractC5464c gVar;
        AbstractC5464c bVar;
        String str29;
        String str30;
        C5679q c5679q;
        String str31;
        double dMo5384a;
        String str32;
        ConstraintAttribute constraintAttribute;
        HashSet<String> hashSet3;
        ArrayList<AbstractC5666d> arrayList4;
        HashMap<String, AbstractC5466e> map2;
        String str33;
        Iterator<String> it;
        String str34;
        Object obj10;
        C5672j c5672j;
        Object obj11;
        Object obj12;
        Object obj13;
        byte b16;
        byte b17;
        byte b18;
        Iterator<String> it2;
        HashMap<String, Integer> map3;
        String str35;
        String str36;
        Object obj14;
        Object obj15;
        Object obj16;
        byte b19;
        byte b20;
        AbstractC5466e gVar2;
        Object obj17;
        AbstractC5466e bVar2;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        String str37;
        String str38;
        String str39;
        String str40;
        Object obj18;
        String str41;
        ArrayList<C5679q> arrayList5;
        Object obj19;
        byte b21;
        byte b22;
        AbstractC5465d iVar;
        Object obj20;
        AbstractC5465d abstractC5465d;
        ConstraintAttribute constraintAttribute3;
        String str42;
        String str43;
        C5676n c5676n2 = this;
        new HashSet();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashSet<String> hashSet8 = new HashSet<>();
        HashMap<String, Integer> map4 = new HashMap<>();
        int i12 = c5676n2.f34608B;
        C5679q c5679q2 = c5676n2.f34620f;
        if (i12 != -1) {
            c5679q2.f34660j = i12;
        }
        C5674l c5674l = c5676n2.f34622h;
        float f11 = c5674l.f34594a;
        C5674l c5674l2 = c5676n2.f34623i;
        String str44 = "alpha";
        if (C5674l.m12035g(f11, c5674l2.f34594a)) {
            hashSet7.add("alpha");
        }
        String str45 = "elevation";
        if (C5674l.m12035g(c5674l.f34597d, c5674l2.f34597d)) {
            hashSet7.add("elevation");
        }
        int i13 = c5674l.f34596c;
        int i14 = c5674l2.f34596c;
        if (i13 != i14 && c5674l.f34595b == 0 && (i13 == 0 || i14 == 0)) {
            hashSet7.add("alpha");
        }
        String str46 = "rotation";
        if (C5674l.m12035g(c5674l.f34598e, c5674l2.f34598e)) {
            hashSet7.add("rotation");
        }
        if (!Float.isNaN(c5674l.f34591J) || !Float.isNaN(c5674l2.f34591J)) {
            hashSet7.add("transitionPathRotate");
        }
        String str47 = "progress";
        if (!Float.isNaN(c5674l.f34592K) || !Float.isNaN(c5674l2.f34592K)) {
            hashSet7.add("progress");
        }
        if (C5674l.m12035g(c5674l.f34599f, c5674l2.f34599f)) {
            hashSet7.add("rotationX");
        }
        if (C5674l.m12035g(c5674l.f34600g, c5674l2.f34600g)) {
            hashSet7.add("rotationY");
        }
        C5679q c5679q3 = c5679q2;
        if (C5674l.m12035g(c5674l.f34603j, c5674l2.f34603j)) {
            hashSet7.add("transformPivotX");
        }
        if (C5674l.m12035g(c5674l.f34604k, c5674l2.f34604k)) {
            hashSet7.add("transformPivotY");
        }
        String str48 = "scaleX";
        if (C5674l.m12035g(c5674l.f34601h, c5674l2.f34601h)) {
            hashSet7.add("scaleX");
        }
        Object obj21 = "rotationX";
        String str49 = "scaleY";
        if (C5674l.m12035g(c5674l.f34602i, c5674l2.f34602i)) {
            hashSet7.add("scaleY");
        }
        Object obj22 = "rotationY";
        if (C5674l.m12035g(c5674l.f34605l, c5674l2.f34605l)) {
            hashSet7.add("translationX");
        }
        Object obj23 = "translationX";
        String str50 = "translationY";
        if (C5674l.m12035g(c5674l.f34589H, c5674l2.f34589H)) {
            hashSet7.add("translationY");
        }
        String str51 = "translationZ";
        if (C5674l.m12035g(c5674l.f34590I, c5674l2.f34590I)) {
            hashSet7.add("translationZ");
        }
        ArrayList<AbstractC5666d> arrayList6 = c5676n2.f34637w;
        ArrayList<C5679q> arrayList7 = c5676n2.f34635u;
        if (arrayList6 != null) {
            ArrayList arrayList8 = null;
            for (AbstractC5666d abstractC5666d : arrayList6) {
                String str52 = str50;
                String str53 = str51;
                if (abstractC5666d instanceof C5670h) {
                    C5670h c5670h = (C5670h) abstractC5666d;
                    str43 = str47;
                    str42 = str48;
                    C5679q c5679q4 = new C5679q(i10, i11, c5670h, c5676n2.f34620f, c5676n2.f34621g);
                    int iBinarySearch = Collections.binarySearch(arrayList7, c5679q4);
                    if (iBinarySearch == 0) {
                        Log.e("MotionController", " KeyPath position \"" + c5679q4.f34654d + "\" outside of range");
                    }
                    arrayList7.add((-iBinarySearch) - 1, c5679q4);
                    int i15 = c5670h.f34550e;
                    if (i15 != -1) {
                        c5676n2.f34619e = i15;
                    }
                } else {
                    str42 = str48;
                    str43 = str47;
                    str49 = str49;
                    if (abstractC5666d instanceof C5668f) {
                        abstractC5666d.mo12027d(hashSet8);
                    } else if (abstractC5666d instanceof C5672j) {
                        abstractC5666d.mo12027d(hashSet6);
                    } else if (abstractC5666d instanceof C5673k) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        ArrayList arrayList9 = arrayList8;
                        arrayList9.add((C5673k) abstractC5666d);
                        arrayList8 = arrayList9;
                    } else {
                        abstractC5666d.mo12029f(map4);
                        abstractC5666d.mo12027d(hashSet7);
                    }
                }
                str51 = str53;
                str50 = str52;
                str49 = str49;
                str47 = str43;
                str48 = str42;
            }
            str = str51;
            str2 = str48;
            str3 = str47;
            str4 = str49;
            str5 = str50;
            arrayList = arrayList8;
        } else {
            str = "translationZ";
            str2 = "scaleX";
            str3 = "progress";
            str4 = "scaleY";
            str5 = "translationY";
            arrayList = null;
        }
        if (arrayList != null) {
            c5676n2.f34607A = (C5673k[]) arrayList.toArray(new C5673k[0]);
        }
        String str54 = "waveOffset";
        String str55 = "CUSTOM,";
        if (hashSet7.isEmpty()) {
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            str6 = str;
            str7 = str4;
            str8 = str3;
            str9 = str2;
            str10 = "waveOffset";
            obj = obj23;
            obj2 = obj22;
            obj3 = obj21;
            str11 = str5;
            arrayList2 = arrayList7;
        } else {
            c5676n2.f34639y = new HashMap<>();
            Iterator<String> it3 = hashSet7.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                if (next.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str56 = next.split(",")[1];
                    for (AbstractC5666d abstractC5666d2 : arrayList6) {
                        HashSet<String> hashSet9 = hashSet8;
                        HashSet<String> hashSet10 = hashSet7;
                        HashMap<String, ConstraintAttribute> map5 = abstractC5666d2.f34500d;
                        if (map5 != null && (constraintAttribute3 = map5.get(str56)) != null) {
                            sparseArray.append(abstractC5666d2.f34497a, constraintAttribute3);
                        }
                        hashSet7 = hashSet10;
                        hashSet8 = hashSet9;
                    }
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    AbstractC5465d.b bVar3 = new AbstractC5465d.b(next, sparseArray);
                    str = str;
                    str38 = str3;
                    str39 = str2;
                    str40 = str54;
                    str41 = str5;
                    arrayList5 = arrayList7;
                    abstractC5465d = bVar3;
                    str37 = str4;
                    obj18 = obj23;
                    obj19 = obj22;
                    obj20 = obj21;
                } else {
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    switch (next.hashCode()) {
                        case -1249320806:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj21 = obj21;
                            obj19 = obj22;
                            b21 = next.equals(obj21) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            Object obj24 = obj22;
                            if (next.equals(obj24)) {
                                obj19 = obj24;
                                obj21 = obj21;
                                b21 = 1;
                            } else {
                                obj19 = obj24;
                                obj21 = obj21;
                            }
                            break;
                        case -1225497657:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            Object obj25 = obj23;
                            if (next.equals(obj25)) {
                                obj18 = obj25;
                                b21 = 2;
                                obj19 = obj22;
                            } else {
                                obj18 = obj25;
                                obj19 = obj22;
                            }
                            break;
                        case -1225497656:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            str41 = str5;
                            if (next.equals(str41)) {
                                arrayList5 = arrayList7;
                                obj18 = obj23;
                                b21 = 3;
                                obj19 = obj22;
                            } else {
                                arrayList5 = arrayList7;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            break;
                        case -1225497655:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            if (next.equals(str)) {
                                str40 = str54;
                                obj18 = obj23;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                                obj19 = obj22;
                                b21 = 4;
                            } else {
                                str40 = str54;
                                obj18 = obj23;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj19 = obj22;
                            }
                            break;
                        case -1001078227:
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            obj18 = obj23;
                            if (next.equals(str38)) {
                                str = str;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                                b21 = 5;
                            } else {
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                            }
                            break;
                        case -908189618:
                            str37 = str4;
                            str39 = str2;
                            if (next.equals(str39)) {
                                obj18 = obj23;
                                str = str;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                                b21 = 6;
                                str38 = str3;
                            } else {
                                obj18 = obj23;
                                str38 = str3;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                            }
                            break;
                        case -908189617:
                            str37 = str4;
                            if (next.equals(str37)) {
                                obj18 = obj23;
                                str = str;
                                str38 = str3;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                                b21 = 7;
                                str39 = str2;
                            } else {
                                obj18 = obj23;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                            }
                            break;
                        case -797520672:
                            if (next.equals("waveVariesBy")) {
                                b22 = 8;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b21 = b22;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case -760884510:
                            if (next.equals("transformPivotX")) {
                                b22 = 9;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b21 = b22;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case -760884509:
                            if (next.equals("transformPivotY")) {
                                b22 = 10;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b21 = b22;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                b22 = 11;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b21 = b22;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                b22 = 12;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b21 = b22;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                b22 = 13;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b21 = b22;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                b22 = 14;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b21 = b22;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case 156108012:
                            if (next.equals(str54)) {
                                b22 = 15;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b21 = b22;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        default:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                    }
                    switch (b21) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            iVar = new AbstractC5465d.i();
                            break;
                        case 1:
                            iVar = new AbstractC5465d.j();
                            break;
                        case 2:
                            iVar = new AbstractC5465d.m();
                            break;
                        case 3:
                            iVar = new AbstractC5465d.n();
                            break;
                        case 4:
                            iVar = new AbstractC5465d.o();
                            break;
                        case 5:
                            iVar = new AbstractC5465d.g();
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            iVar = new AbstractC5465d.k();
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            iVar = new AbstractC5465d.l();
                            break;
                        case 8:
                            iVar = new AbstractC5465d.a();
                            break;
                        case 9:
                            iVar = new AbstractC5465d.e();
                            break;
                        case 10:
                            iVar = new AbstractC5465d.f();
                            break;
                        case 11:
                            iVar = new AbstractC5465d.h();
                            break;
                        case 12:
                            iVar = new AbstractC5465d.c();
                            break;
                        case 13:
                            iVar = new AbstractC5465d.d();
                            break;
                        case 14:
                            iVar = new AbstractC5465d.a();
                            break;
                        case 15:
                            iVar = new AbstractC5465d.a();
                            break;
                        default:
                            iVar = null;
                            break;
                    }
                    obj20 = obj21;
                    abstractC5465d = iVar;
                }
                if (abstractC5465d != null) {
                    abstractC5465d.f9346e = next;
                    c5676n2.f34639y.put(next, abstractC5465d);
                }
                str2 = str39;
                str3 = str38;
                str54 = str40;
                arrayList7 = arrayList5;
                it3 = it3;
                hashSet8 = hashSet5;
                str = str;
                str5 = str41;
                obj21 = obj20;
                obj22 = obj19;
                obj23 = obj18;
                str4 = str37;
                hashSet7 = hashSet4;
            }
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            str6 = str;
            str7 = str4;
            str8 = str3;
            str9 = str2;
            str10 = str54;
            obj = obj23;
            obj2 = obj22;
            obj3 = obj21;
            str11 = str5;
            arrayList2 = arrayList7;
            if (arrayList6 != null) {
                for (AbstractC5666d abstractC5666d3 : arrayList6) {
                    if (abstractC5666d3 instanceof C5667e) {
                        abstractC5666d3.mo12024a(c5676n2.f34639y);
                    }
                }
            }
            c5676n2.f34622h.m12036a(c5676n2.f34639y, 0);
            c5676n2.f34623i.m12036a(c5676n2.f34639y, 100);
            Iterator<String> it4 = c5676n2.f34639y.keySet().iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                int iIntValue = (!map4.containsKey(next2) || (num = map4.get(next2)) == null) ? 0 : num.intValue();
                Iterator<String> it5 = it4;
                AbstractC5465d abstractC5465d2 = c5676n2.f34639y.get(next2);
                if (abstractC5465d2 != null) {
                    abstractC5465d2.mo5398c(iIntValue);
                }
                it4 = it5;
            }
        }
        String str57 = "CUSTOM";
        if (hashSet6.isEmpty()) {
            arrayList3 = arrayList6;
            str12 = "CUSTOM";
            str13 = "CUSTOM,";
            str14 = str11;
            obj4 = obj3;
            obj5 = obj2;
            obj6 = obj;
            String str58 = str9;
            c5676n = c5676n2;
            str15 = str58;
        } else {
            if (c5676n2.f34638x == null) {
                c5676n2.f34638x = new HashMap<>();
            }
            Iterator<String> it6 = hashSet6.iterator();
            while (it6.hasNext()) {
                String next3 = it6.next();
                if (!c5676n2.f34638x.containsKey(next3)) {
                    if (!next3.startsWith(str55)) {
                        it2 = it6;
                        map3 = map4;
                        str35 = str55;
                        switch (next3.hashCode()) {
                            case -1249320806:
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                b19 = next3.equals(obj14) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                str36 = str11;
                                obj15 = obj2;
                                obj16 = obj;
                                if (next3.equals(obj15)) {
                                    b19 = 1;
                                    obj14 = obj3;
                                } else {
                                    obj14 = obj3;
                                }
                                break;
                            case -1225497657:
                                str36 = str11;
                                obj16 = obj;
                                if (next3.equals(obj16)) {
                                    b19 = 2;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                } else {
                                    obj14 = obj3;
                                    obj15 = obj2;
                                }
                                break;
                            case -1225497656:
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                if (next3.equals(str36)) {
                                    obj16 = obj;
                                    b19 = 3;
                                } else {
                                    obj16 = obj;
                                }
                                break;
                            case -1225497655:
                                if (next3.equals(str6)) {
                                    str36 = str11;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    b19 = 4;
                                } else {
                                    str36 = str11;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                }
                                break;
                            case -1001078227:
                                if (next3.equals(str8)) {
                                    b20 = 5;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str59 = str11;
                                    b19 = b20;
                                    str36 = str59;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case -908189618:
                                if (next3.equals(str9)) {
                                    b20 = 6;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str510 = str11;
                                    b19 = b20;
                                    str36 = str510;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case -908189617:
                                if (next3.equals(str7)) {
                                    b20 = 7;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str511 = str11;
                                    b19 = b20;
                                    str36 = str511;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case -40300674:
                                if (next3.equals("rotation")) {
                                    b20 = 8;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str512 = str11;
                                    b19 = b20;
                                    str36 = str512;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case -4379043:
                                if (next3.equals("elevation")) {
                                    b20 = 9;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str513 = str11;
                                    b19 = b20;
                                    str36 = str513;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case 37232917:
                                if (next3.equals("transitionPathRotate")) {
                                    b20 = 10;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str514 = str11;
                                    b19 = b20;
                                    str36 = str514;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case 92909918:
                                if (next3.equals("alpha")) {
                                    b20 = 11;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str515 = str11;
                                    b19 = b20;
                                    str36 = str515;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            default:
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                        }
                        switch (b19) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                gVar2 = new AbstractC5466e.g();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 1:
                                gVar2 = new AbstractC5466e.h();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 2:
                                gVar2 = new AbstractC5466e.k();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 3:
                                gVar2 = new AbstractC5466e.l();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 4:
                                gVar2 = new AbstractC5466e.m();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 5:
                                gVar2 = new AbstractC5466e.e();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                gVar2 = new AbstractC5466e.i();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                gVar2 = new AbstractC5466e.j();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 8:
                                gVar2 = new AbstractC5466e.f();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 9:
                                gVar2 = new AbstractC5466e.c();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 10:
                                gVar2 = new AbstractC5466e.d();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            case 11:
                                gVar2 = new AbstractC5466e.a();
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = gVar2;
                                bVar2.f9378i = j10;
                                break;
                            default:
                                obj17 = obj16;
                                obj3 = obj14;
                                bVar2 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        it2 = it6;
                        String str60 = next3.split(",")[1];
                        for (AbstractC5666d abstractC5666d4 : arrayList6) {
                            String str61 = str55;
                            HashMap<String, Integer> map6 = map4;
                            HashMap<String, ConstraintAttribute> map7 = abstractC5666d4.f34500d;
                            if (map7 != null && (constraintAttribute2 = map7.get(str60)) != null) {
                                sparseArray2.append(abstractC5666d4.f34497a, constraintAttribute2);
                            }
                            map4 = map6;
                            str55 = str61;
                        }
                        map3 = map4;
                        str35 = str55;
                        bVar2 = new AbstractC5466e.b(next3, sparseArray2);
                        str36 = str11;
                        obj15 = obj2;
                        obj17 = obj;
                    }
                    if (bVar2 != null) {
                        bVar2.f9375f = next3;
                        c5676n2.f34638x.put(next3, bVar2);
                    }
                    str9 = str9;
                    obj = obj17;
                    map4 = map3;
                    str11 = str36;
                    obj2 = obj15;
                    it6 = it2;
                    str55 = str35;
                }
            }
            HashMap<String, Integer> map8 = map4;
            str13 = str55;
            str14 = str11;
            Object obj26 = obj2;
            Object obj27 = obj;
            String str62 = str9;
            if (arrayList6 != null) {
                Iterator<AbstractC5666d> it7 = arrayList6.iterator();
                while (it7.hasNext()) {
                    AbstractC5666d next4 = it7.next();
                    if (next4 instanceof C5672j) {
                        C5672j c5672j2 = (C5672j) next4;
                        HashMap<String, AbstractC5466e> map9 = c5676n2.f34638x;
                        c5672j2.getClass();
                        Iterator<String> it8 = map9.keySet().iterator();
                        while (it8.hasNext()) {
                            it7 = it7;
                            String next5 = it8.next();
                            AbstractC5466e abstractC5466e = map9.get(next5);
                            if (abstractC5466e == null) {
                                arrayList4 = arrayList6;
                                map2 = map9;
                                str33 = str57;
                                it = it8;
                                str34 = str62;
                                obj10 = obj3;
                                c5672j = c5672j2;
                                obj11 = obj26;
                                obj12 = obj27;
                            } else if (!next5.startsWith(str57)) {
                                C5672j c5672j3 = c5672j2;
                                arrayList4 = arrayList6;
                                map2 = map9;
                                str33 = str57;
                                it = it8;
                                switch (next5.hashCode()) {
                                    case -1249320806:
                                        str34 = str62;
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        b16 = next5.equals(obj13) ? (byte) 0 : (byte) -1;
                                        break;
                                    case -1249320805:
                                        str34 = str62;
                                        obj12 = obj27;
                                        if (next5.equals(obj26)) {
                                            b17 = 1;
                                            b16 = b17;
                                            obj13 = obj3;
                                        }
                                        obj13 = obj3;
                                        break;
                                    case -1225497657:
                                        str34 = str62;
                                        obj12 = obj27;
                                        if (next5.equals(obj12)) {
                                            b17 = 2;
                                            b16 = b17;
                                            obj13 = obj3;
                                        }
                                        obj13 = obj3;
                                        break;
                                    case -1225497656:
                                        str34 = str62;
                                        if (next5.equals(str14)) {
                                            b18 = 3;
                                            b16 = b18;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                    case -1225497655:
                                        str34 = str62;
                                        if (next5.equals(str6)) {
                                            b18 = 4;
                                            b16 = b18;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                    case -1001078227:
                                        str34 = str62;
                                        if (next5.equals(str8)) {
                                            b18 = 5;
                                            b16 = b18;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                    case -908189618:
                                        str34 = str62;
                                        if (next5.equals(str34)) {
                                            b18 = 6;
                                            b16 = b18;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                    case -908189617:
                                        if (next5.equals(str7)) {
                                            b16 = 7;
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    case -40300674:
                                        if (next5.equals("rotation")) {
                                            str34 = str62;
                                            b18 = 8;
                                            b16 = b18;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    case -4379043:
                                        if (next5.equals("elevation")) {
                                            str34 = str62;
                                            b18 = 9;
                                            b16 = b18;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    case 37232917:
                                        if (next5.equals("transitionPathRotate")) {
                                            str34 = str62;
                                            b18 = 10;
                                            b16 = b18;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    case 92909918:
                                        if (next5.equals("alpha")) {
                                            str34 = str62;
                                            b18 = 11;
                                            b16 = b18;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    default:
                                        str34 = str62;
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                }
                                switch (b16) {
                                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34555i)) {
                                            abstractC5466e.mo5404b(c5672j.f34555i, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 1:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34556j)) {
                                            abstractC5466e.mo5404b(c5672j.f34556j, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 2:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34560n)) {
                                            abstractC5466e.mo5404b(c5672j.f34560n, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 3:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34561o)) {
                                            abstractC5466e.mo5404b(c5672j.f34561o, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 4:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34562p)) {
                                            abstractC5466e.mo5404b(c5672j.f34562p, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 5:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34563q)) {
                                            abstractC5466e.mo5404b(c5672j.f34563q, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34558l)) {
                                            abstractC5466e.mo5404b(c5672j.f34558l, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34559m)) {
                                            abstractC5466e.mo5404b(c5672j.f34559m, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 8:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34554h)) {
                                            abstractC5466e.mo5404b(c5672j.f34554h, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 9:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34553g)) {
                                            abstractC5466e.mo5404b(c5672j.f34553g, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 10:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        if (!Float.isNaN(c5672j.f34557k)) {
                                            abstractC5466e.mo5404b(c5672j.f34557k, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    case 11:
                                        c5672j = c5672j3;
                                        if (Float.isNaN(c5672j.f34552f)) {
                                            obj10 = obj13;
                                            obj11 = obj26;
                                        } else {
                                            obj10 = obj13;
                                            obj11 = obj26;
                                            abstractC5466e.mo5404b(c5672j.f34552f, c5672j.f34565s, c5672j.f34566t, c5672j.f34497a, c5672j.f34564r);
                                        }
                                        break;
                                    default:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        c5672j = c5672j3;
                                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next5 + "\"");
                                        break;
                                }
                            } else {
                                HashMap<String, AbstractC5466e> map10 = map9;
                                ConstraintAttribute constraintAttribute4 = c5672j2.f34500d.get(next5.substring(7));
                                if (constraintAttribute4 != null) {
                                    AbstractC5466e.b bVar4 = (AbstractC5466e.b) abstractC5466e;
                                    Iterator<String> it9 = it8;
                                    int i16 = c5672j2.f34497a;
                                    String str63 = str57;
                                    float f12 = c5672j2.f34565s;
                                    ArrayList<AbstractC5666d> arrayList10 = arrayList6;
                                    int i17 = c5672j2.f34564r;
                                    float f13 = c5672j2.f34566t;
                                    bVar4.f34042l.append(i16, constraintAttribute4);
                                    bVar4.f34043m.append(i16, new float[]{f12, f13});
                                    bVar4.f9371b = Math.max(bVar4.f9371b, i17);
                                    it8 = it9;
                                    map9 = map10;
                                    str57 = str63;
                                    arrayList6 = arrayList10;
                                    c5672j2 = c5672j2;
                                } else {
                                    map9 = map10;
                                }
                            }
                            it8 = it;
                            obj27 = obj12;
                            c5672j2 = c5672j;
                            obj26 = obj11;
                            map9 = map2;
                            str57 = str33;
                            arrayList6 = arrayList4;
                            obj3 = obj10;
                            str62 = str34;
                        }
                    }
                    it7 = it7;
                    obj27 = obj27;
                    obj26 = obj26;
                    str57 = str57;
                    arrayList6 = arrayList6;
                    obj3 = obj3;
                    str62 = str62;
                    c5676n2 = this;
                }
            }
            arrayList3 = arrayList6;
            str12 = str57;
            str15 = str62;
            obj4 = obj3;
            obj6 = obj27;
            obj5 = obj26;
            c5676n = this;
            for (String str64 : c5676n.f34638x.keySet()) {
                HashMap<String, Integer> map11 = map8;
                c5676n.f34638x.get(str64).mo5405c(map11.containsKey(str64) ? map11.get(str64).intValue() : 0);
                map8 = map11;
            }
        }
        int size = arrayList2.size() + 2;
        C5679q[] c5679qArr = new C5679q[size];
        c5679qArr[0] = c5679q3;
        c5679qArr[size - 1] = c5676n.f34621g;
        if (arrayList2.size() > 0 && c5676n.f34619e == -1) {
            c5676n.f34619e = 0;
        }
        Iterator<C5679q> it10 = arrayList2.iterator();
        int i18 = 1;
        while (it10.hasNext()) {
            c5679qArr[i18] = it10.next();
            i18++;
        }
        HashSet hashSet11 = new HashSet();
        Iterator<String> it11 = c5676n.f34621g.f34647I.keySet().iterator();
        while (it11.hasNext()) {
            String next6 = it11.next();
            Object obj28 = obj6;
            Iterator<String> it12 = it11;
            C5679q c5679q5 = c5679q3;
            if (c5679q5.f34647I.containsKey(next6)) {
                c5679q3 = c5679q5;
                hashSet3 = hashSet;
                if (!hashSet3.contains(str13 + next6)) {
                    hashSet11.add(next6);
                }
            } else {
                c5679q3 = c5679q5;
                hashSet3 = hashSet;
            }
            hashSet = hashSet3;
            obj6 = obj28;
            it11 = it12;
        }
        Object obj29 = obj6;
        String[] strArr = (String[]) hashSet11.toArray(new String[0]);
        c5676n.f34632r = strArr;
        c5676n.f34633s = new int[strArr.length];
        int i19 = 0;
        while (true) {
            String[] strArr2 = c5676n.f34632r;
            if (i19 < strArr2.length) {
                String str65 = strArr2[i19];
                c5676n.f34633s[i19] = 0;
                for (int i20 = 0; i20 < size; i20++) {
                    if (c5679qArr[i20].f34647I.containsKey(str65) && (constraintAttribute = c5679qArr[i20].f34647I.get(str65)) != null) {
                        int[] iArr = c5676n.f34633s;
                        iArr[i19] = constraintAttribute.m2860c() + iArr[i19];
                        break;
                    }
                }
                i19++;
            } else {
                boolean z10 = c5679qArr[0].f34660j != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i21 = 1;
                while (i21 < size) {
                    String str66 = str14;
                    C5679q c5679q6 = c5679qArr[i21];
                    String str67 = str6;
                    C5679q c5679q7 = c5679qArr[i21 - 1];
                    String str68 = str15;
                    boolean zM12045f = C5679q.m12045f(c5679q6.f34655e, c5679q7.f34655e);
                    String str69 = str7;
                    boolean zM12045f2 = C5679q.m12045f(c5679q6.f34656f, c5679q7.f34656f);
                    zArr[0] = zArr[0] | C5679q.m12045f(c5679q6.f34654d, c5679q7.f34654d);
                    boolean z11 = zM12045f | zM12045f2 | z10;
                    zArr[1] = zArr[1] | z11;
                    zArr[2] = z11 | zArr[2];
                    zArr[3] = zArr[3] | C5679q.m12045f(c5679q6.f34657g, c5679q7.f34657g);
                    zArr[4] = zArr[4] | C5679q.m12045f(c5679q6.f34658h, c5679q7.f34658h);
                    i21++;
                    str14 = str66;
                    str8 = str8;
                    str6 = str67;
                    str15 = str68;
                    str7 = str69;
                    str46 = str46;
                    str45 = str45;
                }
                String str70 = str15;
                String str71 = str14;
                String str72 = str7;
                String str73 = str8;
                String str74 = str45;
                String str75 = str46;
                String str76 = str6;
                int i22 = 0;
                for (int i23 = 1; i23 < length; i23++) {
                    if (zArr[i23]) {
                        i22++;
                    }
                }
                c5676n.f34629o = new int[i22];
                int iMax = Math.max(2, i22);
                c5676n.f34630p = new double[iMax];
                c5676n.f34631q = new double[iMax];
                int i24 = 0;
                for (int i25 = 1; i25 < length; i25++) {
                    if (zArr[i25]) {
                        c5676n.f34629o[i24] = i25;
                        i24++;
                    }
                }
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, c5676n.f34629o.length);
                double[] dArr2 = new double[size];
                for (int i26 = 0; i26 < size; i26++) {
                    C5679q c5679q8 = c5679qArr[i26];
                    double[] dArr3 = dArr[i26];
                    int[] iArr2 = c5676n.f34629o;
                    float[] fArr = {c5679q8.f34654d, c5679q8.f34655e, c5679q8.f34656f, c5679q8.f34657g, c5679q8.f34658h, c5679q8.f34659i};
                    int i27 = 0;
                    for (int i28 : iArr2) {
                        if (i28 < 6) {
                            dArr3[i27] = fArr[i28];
                            i27++;
                        }
                    }
                    dArr2[i26] = c5679qArr[i26].f34653c;
                }
                int i29 = 0;
                while (true) {
                    int[] iArr3 = c5676n.f34629o;
                    if (i29 < iArr3.length) {
                        if (iArr3[i29] < 6) {
                            String strM23l = C0009a.m23l(new StringBuilder(), C5679q.f34645M[c5676n.f34629o[i29]], " [");
                            for (int i30 = 0; i30 < size; i30++) {
                                StringBuilder sbM771r = C0166e.m771r(strM23l);
                                sbM771r.append(dArr[i30][i29]);
                                strM23l = sbM771r.toString();
                            }
                        }
                        i29++;
                    } else {
                        c5676n.f34624j = new AbstractC1659b[c5676n.f34632r.length + 1];
                        int i31 = 0;
                        while (true) {
                            String[] strArr3 = c5676n.f34632r;
                            if (i31 >= strArr3.length) {
                                String str77 = str44;
                                c5676n.f34624j[0] = AbstractC1659b.m5382a(c5676n.f34619e, dArr2, dArr);
                                if (c5679qArr[0].f34660j != -1) {
                                    int[] iArr4 = new int[size];
                                    double[] dArr4 = new double[size];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
                                    for (int i32 = 0; i32 < size; i32++) {
                                        C5679q c5679q9 = c5679qArr[i32];
                                        iArr4[i32] = c5679q9.f34660j;
                                        dArr4[i32] = c5679q9.f34653c;
                                        double[] dArr6 = dArr5[i32];
                                        dArr6[0] = c5679q9.f34655e;
                                        dArr6[1] = c5679q9.f34656f;
                                    }
                                    c5676n.f34625k = new C1658a(iArr4, dArr4, dArr5);
                                }
                                c5676n.f34640z = new HashMap<>();
                                if (arrayList3 != null) {
                                    Iterator<String> it13 = hashSet2.iterator();
                                    float f14 = Float.NaN;
                                    while (it13.hasNext()) {
                                        String next7 = it13.next();
                                        str12 = str12;
                                        if (!next7.startsWith(str12)) {
                                            switch (next7.hashCode()) {
                                                case -1249320806:
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    obj5 = obj5;
                                                    b13 = next7.equals(obj4) ? (byte) 0 : (byte) -1;
                                                    break;
                                                case -1249320805:
                                                    it13 = it13;
                                                    Object obj30 = obj5;
                                                    obj29 = obj29;
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(obj30)) {
                                                        obj5 = obj30;
                                                        obj4 = obj4;
                                                        b13 = 1;
                                                    } else {
                                                        obj5 = obj30;
                                                        obj4 = obj4;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    obj29 = obj29;
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(obj29)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        b13 = 2;
                                                        obj5 = obj5;
                                                    } else {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -1225497656:
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    if (next7.equals(str25)) {
                                                        obj29 = obj29;
                                                        b13 = 3;
                                                        obj5 = obj5;
                                                    } else {
                                                        obj29 = obj29;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -1225497655:
                                                    str10 = str10;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    if (next7.equals(str76)) {
                                                        str25 = str71;
                                                        b13 = 4;
                                                        obj5 = obj5;
                                                    } else {
                                                        str25 = str71;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -1001078227:
                                                    str10 = str10;
                                                    str73 = str73;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(str73)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        b13 = 5;
                                                        str76 = str76;
                                                        obj5 = obj5;
                                                    }
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str76 = str76;
                                                    obj5 = obj5;
                                                    break;
                                                case -908189618:
                                                    str10 = str10;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(str26)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str76 = str76;
                                                        b13 = 6;
                                                        obj5 = obj5;
                                                        str73 = str73;
                                                    } else {
                                                        str73 = str73;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str76 = str76;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -908189617:
                                                    str10 = str10;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(str27)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        b13 = 7;
                                                        obj5 = obj5;
                                                        str26 = str70;
                                                    } else {
                                                        str26 = str70;
                                                        str73 = str73;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str76 = str76;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -797520672:
                                                    str10 = str10;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals("waveVariesBy")) {
                                                        b14 = 8;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        b13 = b14;
                                                        obj5 = obj5;
                                                        str27 = str72;
                                                    }
                                                    str27 = str72;
                                                    str26 = str70;
                                                    str73 = str73;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str76 = str76;
                                                    obj5 = obj5;
                                                    break;
                                                case -40300674:
                                                    str10 = str10;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(str28)) {
                                                        b14 = 9;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        b13 = b14;
                                                        obj5 = obj5;
                                                        str27 = str72;
                                                    }
                                                    str27 = str72;
                                                    str26 = str70;
                                                    str73 = str73;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str76 = str76;
                                                    obj5 = obj5;
                                                    break;
                                                case -4379043:
                                                    str10 = str10;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    if (next7.equals(str74)) {
                                                        str28 = str75;
                                                        b13 = 10;
                                                        obj5 = obj5;
                                                    } else {
                                                        str28 = str75;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case 37232917:
                                                    str10 = str10;
                                                    str77 = str77;
                                                    if (next7.equals("transitionPathRotate")) {
                                                        b15 = 11;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        str27 = str72;
                                                        str28 = str75;
                                                        b13 = b15;
                                                        obj5 = obj5;
                                                        str74 = str74;
                                                    }
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    obj5 = obj5;
                                                    break;
                                                case 92909918:
                                                    str10 = str10;
                                                    str77 = str77;
                                                    if (next7.equals(str77)) {
                                                        b15 = 12;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        str27 = str72;
                                                        str28 = str75;
                                                        b13 = b15;
                                                        obj5 = obj5;
                                                        str74 = str74;
                                                    }
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    obj5 = obj5;
                                                    break;
                                                case 156108012:
                                                    str10 = str10;
                                                    if (next7.equals(str10)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        str27 = str72;
                                                        str28 = str75;
                                                        str74 = str74;
                                                        b13 = 13;
                                                        obj5 = obj5;
                                                        str77 = str77;
                                                    } else {
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        str27 = str72;
                                                        str28 = str75;
                                                        str74 = str74;
                                                        str77 = str77;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                default:
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    obj5 = obj5;
                                                    break;
                                            }
                                            switch (b13) {
                                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                    gVar = new AbstractC5464c.g();
                                                    AbstractC5464c abstractC5464c2 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c2;
                                                    break;
                                                case 1:
                                                    gVar = new AbstractC5464c.h();
                                                    AbstractC5464c abstractC5464c3 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c3;
                                                    break;
                                                case 2:
                                                    gVar = new AbstractC5464c.k();
                                                    AbstractC5464c abstractC5464c4 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c4;
                                                    break;
                                                case 3:
                                                    gVar = new AbstractC5464c.l();
                                                    AbstractC5464c abstractC5464c5 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c5;
                                                    break;
                                                case 4:
                                                    gVar = new AbstractC5464c.m();
                                                    AbstractC5464c abstractC5464c6 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c6;
                                                    break;
                                                case 5:
                                                    gVar = new AbstractC5464c.e();
                                                    AbstractC5464c abstractC5464c7 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c7;
                                                    break;
                                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    gVar = new AbstractC5464c.i();
                                                    AbstractC5464c abstractC5464c8 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c8;
                                                    break;
                                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    gVar = new AbstractC5464c.j();
                                                    AbstractC5464c abstractC5464c9 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c9;
                                                    break;
                                                case 8:
                                                    gVar = new AbstractC5464c.a();
                                                    AbstractC5464c abstractC5464c10 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c10;
                                                    break;
                                                case 9:
                                                    gVar = new AbstractC5464c.f();
                                                    AbstractC5464c abstractC5464c11 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c11;
                                                    break;
                                                case 10:
                                                    gVar = new AbstractC5464c.c();
                                                    AbstractC5464c abstractC5464c12 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c12;
                                                    break;
                                                case 11:
                                                    gVar = new AbstractC5464c.d();
                                                    AbstractC5464c abstractC5464c13 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c13;
                                                    break;
                                                case 12:
                                                    gVar = new AbstractC5464c.a();
                                                    AbstractC5464c abstractC5464c14 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c14;
                                                    break;
                                                case 13:
                                                    gVar = new AbstractC5464c.a();
                                                    AbstractC5464c abstractC5464c15 = gVar;
                                                    obj4 = obj4;
                                                    bVar = abstractC5464c15;
                                                    break;
                                                default:
                                                    obj4 = obj4;
                                                    bVar = null;
                                                    break;
                                            }
                                        } else {
                                            it13 = it13;
                                            bVar = new AbstractC5464c.b();
                                            obj29 = obj29;
                                            str10 = str10;
                                            str25 = str71;
                                            str73 = str73;
                                            str76 = str76;
                                            str26 = str70;
                                            str27 = str72;
                                            str28 = str75;
                                            str74 = str74;
                                            str77 = str77;
                                            obj5 = obj5;
                                        }
                                        if (bVar == null) {
                                            str75 = str28;
                                            str72 = str27;
                                            str70 = str26;
                                            str71 = str25;
                                            obj29 = obj29;
                                        } else {
                                            Object obj31 = obj29;
                                            String str78 = str25;
                                            if ((bVar.f9313e == 1) && Float.isNaN(f14)) {
                                                float[] fArr2 = new float[2];
                                                float f15 = 1.0f / 99;
                                                float fHypot = 0.0f;
                                                double d10 = 0.0d;
                                                double d11 = 0.0d;
                                                int i33 = 0;
                                                while (i33 < 100) {
                                                    float f16 = i33 * f15;
                                                    String str79 = str27;
                                                    String str80 = str26;
                                                    double d12 = f16;
                                                    C5679q c5679q10 = c5679q3;
                                                    C1660c c1660c = c5679q10.f34651a;
                                                    float f17 = 0.0f;
                                                    float f18 = Float.NaN;
                                                    for (C5679q c5679q11 : arrayList2) {
                                                        C5679q c5679q12 = c5679q10;
                                                        float f19 = f15;
                                                        C1660c c1660c2 = c5679q11.f34651a;
                                                        if (c1660c2 != null) {
                                                            float f20 = c5679q11.f34653c;
                                                            if (f20 < f16) {
                                                                f17 = f20;
                                                                c1660c = c1660c2;
                                                            } else if (Float.isNaN(f18)) {
                                                                f18 = c5679q11.f34653c;
                                                            }
                                                        }
                                                        c5679q10 = c5679q12;
                                                        f15 = f19;
                                                    }
                                                    C5679q c5679q13 = c5679q10;
                                                    float f21 = f15;
                                                    if (c1660c != null) {
                                                        if (Float.isNaN(f18)) {
                                                            f18 = 1.0f;
                                                        }
                                                        float f22 = f18 - f17;
                                                        dMo5384a = (((float) c1660c.mo5384a((f16 - f17) / f22)) * f22) + f17;
                                                    } else {
                                                        dMo5384a = d12;
                                                    }
                                                    c5676n.f34624j[0].mo5371c(dMo5384a, c5676n.f34630p);
                                                    String str81 = str28;
                                                    c5676n.f34620f.m12048g(dMo5384a, c5676n.f34629o, c5676n.f34630p, fArr2, 0);
                                                    if (i33 > 0) {
                                                        fHypot = (float) (Math.hypot(d10 - ((double) fArr2[1]), d11 - ((double) fArr2[0])) + ((double) fHypot));
                                                    }
                                                    i33++;
                                                    d11 = fArr2[0];
                                                    d10 = fArr2[1];
                                                    str28 = str81;
                                                    str26 = str80;
                                                    c5679q3 = c5679q13;
                                                    f15 = f21;
                                                    str27 = str79;
                                                }
                                                str29 = str27;
                                                str30 = str26;
                                                c5679q = c5679q3;
                                                str31 = str28;
                                                f14 = fHypot;
                                            } else {
                                                str29 = str27;
                                                str30 = str26;
                                                c5679q = c5679q3;
                                                str31 = str28;
                                            }
                                            bVar.f9310b = next7;
                                            c5676n.f34640z.put(next7, bVar);
                                            str72 = str29;
                                            str75 = str31;
                                            str70 = str30;
                                            c5679q3 = c5679q;
                                            str71 = str78;
                                            obj29 = obj31;
                                        }
                                    }
                                    String str82 = str10;
                                    String str83 = str12;
                                    String str84 = str73;
                                    String str85 = str76;
                                    String str86 = str70;
                                    String str87 = str72;
                                    String str88 = str75;
                                    String str89 = str74;
                                    String str90 = str77;
                                    Object obj32 = obj29;
                                    Object obj33 = obj5;
                                    String str91 = str71;
                                    Object obj34 = obj32;
                                    Iterator<AbstractC5666d> it14 = arrayList3.iterator();
                                    while (it14.hasNext()) {
                                        AbstractC5666d next8 = it14.next();
                                        if (next8 instanceof C5668f) {
                                            C5668f c5668f = (C5668f) next8;
                                            HashMap<String, AbstractC5464c> map12 = c5676n.f34640z;
                                            c5668f.getClass();
                                            Iterator<String> it15 = map12.keySet().iterator();
                                            while (it15.hasNext()) {
                                                String next9 = it15.next();
                                                if (next9.startsWith(str83)) {
                                                    ConstraintAttribute constraintAttribute5 = c5668f.f34500d.get(next9.substring(7));
                                                    if (constraintAttribute5 != null) {
                                                        if (constraintAttribute5.f5263c == ConstraintAttribute.AttributeType.FLOAT_TYPE && (abstractC5464c = map12.get(next9)) != null) {
                                                            int i34 = c5668f.f34497a;
                                                            int i35 = c5668f.f34518f;
                                                            String str92 = c5668f.f34519g;
                                                            int i36 = c5668f.f34524l;
                                                            abstractC5464c.f9314f.add(new AbstractC1662e.b(c5668f.f34520h, c5668f.f34521i, c5668f.f34522j, constraintAttribute5.m2858a(), i34));
                                                            if (i36 != -1) {
                                                                abstractC5464c.f9313e = i36;
                                                            }
                                                            abstractC5464c.f9311c = i35;
                                                            abstractC5464c.mo5389b(constraintAttribute5);
                                                            abstractC5464c.f9312d = str92;
                                                        }
                                                        obj7 = obj4;
                                                        str16 = str91;
                                                        obj8 = obj33;
                                                        str17 = str85;
                                                        obj9 = obj34;
                                                        str18 = str83;
                                                        str19 = str86;
                                                        str87 = str87;
                                                        str20 = str88;
                                                        str21 = str84;
                                                        it14 = it14;
                                                        c5668f = c5668f;
                                                        obj33 = obj8;
                                                        str83 = str18;
                                                        str84 = str21;
                                                        str86 = str19;
                                                        it15 = it15;
                                                        str82 = str82;
                                                        map12 = map12;
                                                        str87 = str87;
                                                        str88 = str20;
                                                        str89 = str89;
                                                        str90 = str90;
                                                        obj34 = obj9;
                                                        obj4 = obj7;
                                                        str85 = str17;
                                                        str91 = str16;
                                                    }
                                                } else {
                                                    it14 = it14;
                                                    HashMap<String, AbstractC5464c> map13 = map12;
                                                    String str93 = str83;
                                                    it15 = it15;
                                                    switch (next9.hashCode()) {
                                                        case -1249320806:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            b10 = next9.equals(obj7) ? (byte) 0 : (byte) -1;
                                                            break;
                                                        case -1249320805:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            if (next9.equals(obj8)) {
                                                                b10 = 1;
                                                                obj7 = obj4;
                                                            } else {
                                                                obj7 = obj4;
                                                            }
                                                            break;
                                                        case -1225497657:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str16 = str91;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            if (next9.equals(obj9)) {
                                                                b10 = 2;
                                                                obj7 = obj4;
                                                                obj8 = obj33;
                                                            } else {
                                                                obj7 = obj4;
                                                                obj8 = obj33;
                                                            }
                                                            break;
                                                        case -1225497656:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str16 = str91;
                                                            str22 = str85;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            obj7 = obj4;
                                                            obj8 = obj33;
                                                            if (next9.equals(str16)) {
                                                                obj9 = obj34;
                                                                b10 = 3;
                                                            } else {
                                                                obj9 = obj34;
                                                            }
                                                            break;
                                                        case -1225497655:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str22 = str85;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            if (next9.equals(str22)) {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                obj9 = obj34;
                                                                b10 = 4;
                                                            } else {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                obj9 = obj34;
                                                            }
                                                            break;
                                                        case -1001078227:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            if (next9.equals(str23)) {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                b10 = 5;
                                                            } else {
                                                                str22 = str85;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                obj9 = obj34;
                                                            }
                                                            break;
                                                        case -908189618:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str24 = str86;
                                                            if (next9.equals(str24)) {
                                                                b10 = 6;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                            } else {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                            }
                                                            break;
                                                        case -908189617:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            if (next9.equals(str87)) {
                                                                b10 = 7;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                            } else {
                                                                str24 = str86;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                            }
                                                            break;
                                                        case -40300674:
                                                            str20 = str88;
                                                            if (next9.equals(str20)) {
                                                                b11 = 8;
                                                                b10 = b11;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            } else {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                            }
                                                            break;
                                                        case -4379043:
                                                            if (next9.equals(str89)) {
                                                                str20 = str88;
                                                                b11 = 9;
                                                                b10 = b11;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        case 37232917:
                                                            if (next9.equals("transitionPathRotate")) {
                                                                str20 = str88;
                                                                b11 = 10;
                                                                b10 = b11;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        case 92909918:
                                                            if (next9.equals(str90)) {
                                                                str20 = str88;
                                                                b11 = 11;
                                                                b10 = b11;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        case 156108012:
                                                            if (next9.equals(str82)) {
                                                                b12 = 12;
                                                                b11 = b12;
                                                                str20 = str88;
                                                                b10 = b11;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        case 1530034690:
                                                            if (next9.equals("wavePhase")) {
                                                                b12 = 13;
                                                                b11 = b12;
                                                                str20 = str88;
                                                                b10 = b11;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        default:
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                    }
                                                    switch (b10) {
                                                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                            f3 = c5668f.f34529q;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 1:
                                                            f3 = c5668f.f34530r;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 2:
                                                            f3 = c5668f.f34533u;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 3:
                                                            f3 = c5668f.f34534v;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 4:
                                                            f3 = c5668f.f34535w;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 5:
                                                            f3 = c5668f.f34523k;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            f3 = c5668f.f34531s;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                                            f3 = c5668f.f34532t;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 8:
                                                            f3 = c5668f.f34527o;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 9:
                                                            f3 = c5668f.f34526n;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 10:
                                                            f3 = c5668f.f34528p;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 11:
                                                            f3 = c5668f.f34525m;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 12:
                                                            f3 = c5668f.f34521i;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 13:
                                                            f3 = c5668f.f34522j;
                                                            str87 = str87;
                                                            f10 = f3;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        default:
                                                            str18 = str93;
                                                            if (!next9.startsWith(str18)) {
                                                                Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(next9));
                                                            }
                                                            f10 = Float.NaN;
                                                            break;
                                                    }
                                                    if (Float.isNaN(f10)) {
                                                        map = map13;
                                                    } else {
                                                        map = map13;
                                                        AbstractC5464c abstractC5464c16 = map.get(next9);
                                                        if (abstractC5464c16 != null) {
                                                            int i37 = c5668f.f34497a;
                                                            map12 = map;
                                                            int i38 = c5668f.f34518f;
                                                            str19 = str24;
                                                            String str94 = c5668f.f34519g;
                                                            str21 = str23;
                                                            int i39 = c5668f.f34524l;
                                                            str17 = str22;
                                                            abstractC5464c16.f9314f.add(new AbstractC1662e.b(c5668f.f34520h, c5668f.f34521i, c5668f.f34522j, f10, i37));
                                                            if (i39 != -1) {
                                                                abstractC5464c16.f9313e = i39;
                                                            }
                                                            abstractC5464c16.f9311c = i38;
                                                            abstractC5464c16.f9312d = str94;
                                                            it14 = it14;
                                                            c5668f = c5668f;
                                                            obj33 = obj8;
                                                            str83 = str18;
                                                            str84 = str21;
                                                            str86 = str19;
                                                            it15 = it15;
                                                            str82 = str82;
                                                            map12 = map12;
                                                            str87 = str87;
                                                            str88 = str20;
                                                            str89 = str89;
                                                            str90 = str90;
                                                            obj34 = obj9;
                                                            obj4 = obj7;
                                                            str85 = str17;
                                                            str91 = str16;
                                                        }
                                                    }
                                                    map12 = map;
                                                    str86 = str24;
                                                    str84 = str23;
                                                    str85 = str22;
                                                    str91 = str16;
                                                    obj33 = obj8;
                                                    obj4 = obj7;
                                                    str83 = str18;
                                                    it15 = it15;
                                                    str87 = str87;
                                                    str88 = str20;
                                                    it14 = it14;
                                                    obj34 = obj9;
                                                }
                                            }
                                        }
                                        c5676n = this;
                                        it14 = it14;
                                        obj33 = obj33;
                                        str83 = str83;
                                        str84 = str84;
                                        str86 = str86;
                                        str82 = str82;
                                        str87 = str87;
                                        str88 = str88;
                                        str89 = str89;
                                        str90 = str90;
                                        obj34 = obj34;
                                        obj4 = obj4;
                                        str85 = str85;
                                        str91 = str91;
                                    }
                                    Iterator<AbstractC5464c> it16 = c5676n.f34640z.values().iterator();
                                    while (it16.hasNext()) {
                                        it16.next().m5390c();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str95 = strArr3[i31];
                            int i40 = 0;
                            int i41 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i40 < size) {
                                if (c5679qArr[i40].f34647I.containsKey(str95)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[size];
                                        ConstraintAttribute constraintAttribute6 = c5679qArr[i40].f34647I.get(str95);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, constraintAttribute6 == null ? 0 : constraintAttribute6.m2860c());
                                    }
                                    C5679q c5679q14 = c5679qArr[i40];
                                    dArr7[i41] = c5679q14.f34653c;
                                    double[] dArr9 = dArr8[i41];
                                    ConstraintAttribute constraintAttribute7 = c5679q14.f34647I.get(str95);
                                    if (constraintAttribute7 == null) {
                                        str32 = str44;
                                        dArr7 = dArr7;
                                        dArr8 = dArr8;
                                    } else {
                                        if (constraintAttribute7.m2860c() == 1) {
                                            dArr9[0] = constraintAttribute7.m2858a();
                                        } else {
                                            int iM2860c = constraintAttribute7.m2860c();
                                            float[] fArr3 = new float[iM2860c];
                                            constraintAttribute7.m2859b(fArr3);
                                            int i42 = 0;
                                            int i43 = 0;
                                            while (i42 < iM2860c) {
                                                dArr9[i43] = fArr3[i42];
                                                i42++;
                                                i43++;
                                                iM2860c = iM2860c;
                                                str44 = str44;
                                                fArr3 = fArr3;
                                            }
                                        }
                                        str32 = str44;
                                    }
                                    i41++;
                                    dArr7 = dArr7;
                                    dArr8 = dArr8;
                                } else {
                                    str95 = str95;
                                    str32 = str44;
                                }
                                i40++;
                                str95 = str95;
                                str44 = str32;
                            }
                            i31++;
                            c5676n.f34624j[i31] = AbstractC1659b.m5382a(c5676n.f34619e, Arrays.copyOf(dArr7, i41), (double[][]) Arrays.copyOf(dArr8, i41));
                            str44 = str44;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        C5679q c5679q = this.f34620f;
        sb2.append(c5679q.f34655e);
        sb2.append(" y: ");
        sb2.append(c5679q.f34656f);
        sb2.append(" end: x: ");
        C5679q c5679q2 = this.f34621g;
        sb2.append(c5679q2.f34655e);
        sb2.append(" y: ");
        sb2.append(c5679q2.f34656f);
        return sb2.toString();
    }
}
