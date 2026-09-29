package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.glance.AbstractC0640a;
import androidx.glance.layout.AbstractC0686a;
import androidx.glance.text.AbstractC0704a;
import com.lingq.feature.widget.R$drawable;
import com.lingq.feature.widget.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dk9 {

    /* JADX INFO: renamed from: a */
    public static final a63 f35748a = new a63(d32.m10037f(4294926397L));

    /* JADX INFO: renamed from: b */
    public static final a63 f35749b = new a63(d32.m10037f(4285442337L));

    /* JADX INFO: renamed from: c */
    public static final a63 f35750c = new a63(d32.m10037f(4292204764L));

    /* JADX INFO: renamed from: d */
    public static final a63 f35751d = new a63(d32.m10037f(4290558385L));

    /* JADX INFO: renamed from: e */
    public static final a63 f35752e = new a63(aa1.f406e);

    /* JADX INFO: renamed from: a */
    public static final void m10442a(final on3 on3Var, final float f, ye1 ye1Var, final int i, final int i2) {
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(439440009);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (tj3Var.m22120g(on3Var) ? 4 : 2) | i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= tj3Var.m22114d(f) ? 32 : 16;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                on3Var = mn3.f51554a;
            }
            if (i5 != 0) {
                f = 48.0f;
            }
            AbstractC0686a.m2485a(ci8.m4706S(on3Var, f), C3532re.f59146f, ci8.m4703P(334251371, new fn5(3, f), tj3Var), tj3Var, 384, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ck9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    dk9.m10442a(on3Var, f, (ye1) obj, iM19383z, i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10443b(on3 on3Var, ek9 ek9Var, float f, ye1 ye1Var, int i) {
        on3 on3Var2;
        ek9Var.getClass();
        boolean z = ek9Var.f37397f;
        int i2 = ek9Var.f37394c;
        int i3 = ek9Var.f37393b;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(281505294);
        int i4 = i | 6 | (tj3Var.m22120g(ek9Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= tj3Var.m22114d(f) ? 256 : 128;
        }
        if (tj3Var.m22099R(i4 & 1, (i4 & 147) != 146)) {
            float f2 = f / 2.0f;
            C3532re c3532re = C3532re.f59146f;
            on3Var2 = mn3.f51554a;
            if (i3 < i2 && !ek9Var.f37396e && !z && !vk9.m23391n0(ek9Var.f37395d)) {
                tj3Var.m22111b0(-1746555033);
                AbstractC0686a.m2485a(ci8.m4706S(on3Var2, f), c3532re, ci8.m4703P(-312738440, new fn5(4, f2), tj3Var), tj3Var, 384, 0);
                tj3Var.m22139q(false);
            } else if (z) {
                tj3Var.m22111b0(-1745825634);
                AbstractC0640a.m2210a(new C0850ck(R$drawable.ic_fire_no_star), vz1.m23620a0(tj3Var, R$string.widget_future), ci8.m4706S(on3Var2, f), 0, new ea1(new j1a(f35751d)), tj3Var, 32768, 8);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1745471552);
                float f3 = i3;
                float f4 = i2;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(96, 96, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(8.0f);
                paint.setStrokeCap(Paint.Cap.ROUND);
                RectF rectF = new RectF(4.0f, 4.0f, 92.0f, 92.0f);
                paint.setColor(872415231);
                canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
                if (f3 > 0.0f && f4 > 0.0f) {
                    paint.setColor(f3 >= f4 ? -9524959 : -40899);
                    canvas.drawArc(rectF, 270.0f, l70.m15944g(f3 / f4, 0.0f, 1.0f) * 360.0f, false, paint);
                }
                AbstractC0686a.m2485a(ci8.m4706S(on3Var2, f), c3532re, ci8.m4703P(1455994959, new C2925de(bitmapCreateBitmap, f2, ek9Var), tj3Var), tj3Var, 384, 0);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
            on3Var2 = on3Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new z08(on3Var2, ek9Var, f, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m10444c(final fk9 fk9Var, final on3 on3Var, long j, long j2, ye1 ye1Var, final int i, final int i2) {
        long j3;
        int i3;
        long j4;
        int i4;
        boolean z;
        final long j5;
        final long j6;
        x18 x18VarM22143u;
        final long jM10018P;
        final long jM10018P2;
        fk9Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1016242192);
        int i5 = (tj3Var.m22124i(fk9Var) ? 4 : 2) | i | (tj3Var.m22120g(on3Var) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                j3 = j;
                i5 |= tj3Var.m22118f(j3) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                if ((i & 3072) == 0) {
                    j4 = j2;
                    if (tj3Var.m22118f(j4)) {
                        i4 = 2048;
                    } else {
                        i4 = 1024;
                    }
                    i5 |= i4;
                }
                if ((i5 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i5 & 1, z)) {
                    if (i6 != 0) {
                        jM10018P = d32.m10018P(16);
                    } else {
                        jM10018P = j3;
                    }
                    if (i3 != 0) {
                        jM10018P2 = d32.m10018P(14);
                    } else {
                        jM10018P2 = j4;
                    }
                    final Context context = (Context) tj3Var.m22128k(yf1.f69763b);
                    AbstractC0686a.m2486b(wfb.m23929x(on3Var, 4.0f, 2), 0, 0, ci8.m4703P(507426054, new aj3() { // from class: yj9
                        @Override // p000.aj3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            ye1 ye1Var2 = (ye1) obj2;
                            ((Integer) obj3).getClass();
                            ((cb1) obj).getClass();
                            fk9 fk9Var2 = fk9Var;
                            AbstractC0704a.m2506a(fk9Var2.f39227a, null, new ux9(dk9.f35752e, new zx9(jM10018P), new ac3(700), 120), 1, ye1Var2, 3072, 2);
                            mn3 mn3Var = mn3.f51554a;
                            AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 4.0f), ye1Var2, 0);
                            long j7 = jM10018P2;
                            Context context2 = context;
                            AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(1695604842, new bk9(fk9Var2, j7, context2, 0), ye1Var2), ye1Var2, 3072, 3);
                            AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 2.0f), ye1Var2, 0);
                            AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(1051663201, new bk9(fk9Var2, j7, context2, 1), ye1Var2), ye1Var2, 3072, 3);
                            return xfa.f68157a;
                        }
                    }, tj3Var), tj3Var, 3072, 6);
                    j5 = jM10018P;
                    j6 = jM10018P2;
                } else {
                    tj3Var.m22102U();
                    j5 = j3;
                    j6 = j4;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: zj9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            dk9.m10444c(fk9Var, on3Var, j5, j6, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i5 |= 3072;
            j4 = j2;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i5 & 1, z)) {
                if (i6 != 0) {
                    jM10018P = d32.m10018P(16);
                } else {
                    jM10018P = j3;
                }
                if (i3 != 0) {
                    jM10018P2 = d32.m10018P(14);
                } else {
                    jM10018P2 = j4;
                }
                final Context context2 = (Context) tj3Var.m22128k(yf1.f69763b);
                AbstractC0686a.m2486b(wfb.m23929x(on3Var, 4.0f, 2), 0, 0, ci8.m4703P(507426054, new aj3() { // from class: yj9
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ye1 ye1Var2 = (ye1) obj2;
                        ((Integer) obj3).getClass();
                        ((cb1) obj).getClass();
                        fk9 fk9Var2 = fk9Var;
                        AbstractC0704a.m2506a(fk9Var2.f39227a, null, new ux9(dk9.f35752e, new zx9(jM10018P), new ac3(700), 120), 1, ye1Var2, 3072, 2);
                        mn3 mn3Var = mn3.f51554a;
                        AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 4.0f), ye1Var2, 0);
                        long j7 = jM10018P2;
                        Context context3 = context2;
                        AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(1695604842, new bk9(fk9Var2, j7, context3, 0), ye1Var2), ye1Var2, 3072, 3);
                        AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 2.0f), ye1Var2, 0);
                        AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(1051663201, new bk9(fk9Var2, j7, context3, 1), ye1Var2), ye1Var2, 3072, 3);
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 3072, 6);
                j5 = jM10018P;
                j6 = jM10018P2;
            } else {
                tj3Var.m22102U();
                j5 = j3;
                j6 = j4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: zj9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dk9.m10444c(fk9Var, on3Var, j5, j6, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 384;
        j3 = j;
        i3 = i2 & 8;
        if (i3 != 0) {
            if ((i & 3072) == 0) {
                j4 = j2;
                if (tj3Var.m22118f(j4)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 |= i4;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i5 & 1, z)) {
                if (i6 != 0) {
                    jM10018P = d32.m10018P(16);
                } else {
                    jM10018P = j3;
                }
                if (i3 != 0) {
                    jM10018P2 = d32.m10018P(14);
                } else {
                    jM10018P2 = j4;
                }
                final Context context3 = (Context) tj3Var.m22128k(yf1.f69763b);
                AbstractC0686a.m2486b(wfb.m23929x(on3Var, 4.0f, 2), 0, 0, ci8.m4703P(507426054, new aj3() { // from class: yj9
                    @Override // p000.aj3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ye1 ye1Var2 = (ye1) obj2;
                        ((Integer) obj3).getClass();
                        ((cb1) obj).getClass();
                        fk9 fk9Var2 = fk9Var;
                        AbstractC0704a.m2506a(fk9Var2.f39227a, null, new ux9(dk9.f35752e, new zx9(jM10018P), new ac3(700), 120), 1, ye1Var2, 3072, 2);
                        mn3 mn3Var = mn3.f51554a;
                        AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 4.0f), ye1Var2, 0);
                        long j7 = jM10018P2;
                        Context context4 = context3;
                        AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(1695604842, new bk9(fk9Var2, j7, context4, 0), ye1Var2), ye1Var2, 3072, 3);
                        AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 2.0f), ye1Var2, 0);
                        AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(1051663201, new bk9(fk9Var2, j7, context4, 1), ye1Var2), ye1Var2, 3072, 3);
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 3072, 6);
                j5 = jM10018P;
                j6 = jM10018P2;
            } else {
                tj3Var.m22102U();
                j5 = j3;
                j6 = j4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: zj9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dk9.m10444c(fk9Var, on3Var, j5, j6, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 3072;
        j4 = j2;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i5 & 1, z)) {
            if (i6 != 0) {
                jM10018P = d32.m10018P(16);
            } else {
                jM10018P = j3;
            }
            if (i3 != 0) {
                jM10018P2 = d32.m10018P(14);
            } else {
                jM10018P2 = j4;
            }
            final Context context4 = (Context) tj3Var.m22128k(yf1.f69763b);
            AbstractC0686a.m2486b(wfb.m23929x(on3Var, 4.0f, 2), 0, 0, ci8.m4703P(507426054, new aj3() { // from class: yj9
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    ((Integer) obj3).getClass();
                    ((cb1) obj).getClass();
                    fk9 fk9Var2 = fk9Var;
                    AbstractC0704a.m2506a(fk9Var2.f39227a, null, new ux9(dk9.f35752e, new zx9(jM10018P), new ac3(700), 120), 1, ye1Var2, 3072, 2);
                    mn3 mn3Var = mn3.f51554a;
                    AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 4.0f), ye1Var2, 0);
                    long j7 = jM10018P2;
                    Context context5 = context4;
                    AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(1695604842, new bk9(fk9Var2, j7, context5, 0), ye1Var2), ye1Var2, 3072, 3);
                    AbstractC0686a.m2488d(ci8.m4694G(mn3Var, 2.0f), ye1Var2, 0);
                    AbstractC0686a.m2487c(null, 0, 1, ci8.m4703P(1051663201, new bk9(fk9Var2, j7, context5, 1), ye1Var2), ye1Var2, 3072, 3);
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 3072, 6);
            j5 = jM10018P;
            j6 = jM10018P2;
        } else {
            tj3Var.m22102U();
            j5 = j3;
            j6 = j4;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: zj9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dk9.m10444c(fk9Var, on3Var, j5, j6, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m10445d(final List list, on3 on3Var, float f, long j, ye1 ye1Var, final int i, final int i2) {
        final on3 on3Var2;
        int i3;
        float f2;
        int i4;
        long j2;
        boolean z;
        final float f3;
        final long j3;
        x18 x18VarM22143u;
        on3 on3Var3;
        float f4;
        long jM10018P;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2136235277);
        int i5 = (tj3Var.m22124i(list) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            on3Var2 = on3Var;
        } else {
            on3Var2 = on3Var;
            i3 = i5 | (tj3Var.m22120g(on3Var2) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (tj3Var.m22114d(f2) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                j2 = j;
                i4 |= tj3Var.m22118f(j2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i4 & 1, z)) {
                if (i6 != 0) {
                    on3Var3 = mn3.f51554a;
                } else {
                    on3Var3 = on3Var2;
                }
                if (i7 != 0) {
                    f4 = 32.0f;
                } else {
                    f4 = f2;
                }
                if (i8 != 0) {
                    jM10018P = d32.m10018P(10);
                } else {
                    jM10018P = j2;
                }
                AbstractC0686a.m2487c(ci8.m4735t(on3Var3), 1, 0, ci8.m4703P(-1674669481, new xj9(list, f4, jM10018P, 0), tj3Var), tj3Var, 3072, 4);
                on3Var2 = on3Var3;
                f3 = f4;
                j3 = jM10018P;
            } else {
                tj3Var.m22102U();
                f3 = f2;
                j3 = j2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: ak9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dk9.m10445d(list, on3Var2, f3, j3, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 3072;
        j2 = j;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i4 & 1, z)) {
            if (i6 != 0) {
                on3Var3 = mn3.f51554a;
            } else {
                on3Var3 = on3Var2;
            }
            if (i7 != 0) {
                f4 = 32.0f;
            } else {
                f4 = f2;
            }
            if (i8 != 0) {
                jM10018P = d32.m10018P(10);
            } else {
                jM10018P = j2;
            }
            AbstractC0686a.m2487c(ci8.m4735t(on3Var3), 1, 0, ci8.m4703P(-1674669481, new xj9(list, f4, jM10018P, 0), tj3Var), tj3Var, 3072, 4);
            on3Var2 = on3Var3;
            f3 = f4;
            j3 = jM10018P;
        } else {
            tj3Var.m22102U();
            f3 = f2;
            j3 = j2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ak9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dk9.m10445d(list, on3Var2, f3, j3, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }
}
