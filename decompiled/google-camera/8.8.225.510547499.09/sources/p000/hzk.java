package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.util.Size;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzk {

    /* JADX INFO: renamed from: a */
    private static final nbh f30017a = nbh.m17259h("com/google/android/apps/camera/ui/layout/helper/CameraBoxesHelper");

    /* JADX INFO: renamed from: a */
    public static Size m10913a(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        return new Size(bounds.width() - i, bounds.height() - i2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10914b(ikw ikwVar) {
        return ikwVar.equals(ikw.PHOTO) || ikwVar.equals(ikw.IMAGE_INTENT) || ikwVar.equals(ikw.PORTRAIT) || ikwVar.equals(ikw.LONG_EXPOSURE) || ikwVar.equals(ikw.MOTION_BLUR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m10915c(ikw ikwVar, Context context) {
        if (ikwVar.equals(ikw.VIDEO) || ikwVar.equals(ikw.SLOW_MOTION) || ikwVar.equals(ikw.TIME_LAPSE)) {
            return true;
        }
        if (ikw.MOTION_BLUR.equals(ikwVar) && (context instanceof cdp)) {
            return ((cdp) context).mo3499a().mo6184l(dik.f11608f);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x021c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x021e  */
    /* JADX WARN: Code duplicated, block: B:44:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x025f  */
    /* JADX WARN: Code duplicated, block: B:47:0x027f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0289 A[PHI: r1
      0x0289: PHI (r1v13 int) = (r1v12 int), (r1v19 int) binds: [B:46:0x027d, B:50:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x02b8  */
    /* JADX INFO: renamed from: d */
    public static hzm m10916d(hzo hzoVar, boolean z, Context context, hmy hmyVar, msi msiVar) {
        int iM11431b;
        int i;
        Size size;
        int iM11432c;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iMax;
        int i11;
        boolean z3;
        int iM11431b2;
        int i12;
        int i13;
        boolean z4;
        int i14;
        lku.m15614I(hzoVar.m10947a(), "Invalid Constraints!");
        Size size2 = hzoVar.f30066b;
        lku.m15662p(size2);
        Size size3 = hzoVar.f30068d;
        lku.m15662p(size3);
        ilk ilkVar = hzoVar.f30071g;
        ikw ikwVar = hzoVar.f30072h;
        hzj hzjVar = hzoVar.f30073i;
        boolean z5 = hzoVar.f30070f;
        if (z) {
            int width = size2.getWidth();
            int height = size2.getHeight();
            int iM11431b3 = ill.m11431b(84.0f);
            int iM11431b4 = ill.m11431b(56.0f);
            int iM11431b5 = ill.m11431b(100.0f);
            int iM11431b6 = m10915c(ikwVar, context) ? ill.m11431b(56.0f) : 0;
            int iM11431b7 = height - ill.m11431b(56.0f);
            int i15 = iM11431b7 - iM11431b3;
            int i16 = i15 - iM11431b6;
            int i17 = i16 - iM11431b5;
            kay kayVarM13890c = kay.m13890c(((Activity) context).getWindowManager().getDefaultDisplay());
            kan kanVarM13872i = kan.m13872i(size3);
            if (kayVarM13890c.equals(kay.CLOCKWISE_90) || kayVarM13890c.equals(kay.CLOCKWISE_270)) {
                kanVarM13872i = kanVarM13872i.m13882l();
            }
            Size sizeM10918f = m10918f(size2, kanVarM13872i);
            hzl hzlVarM10940b = hzm.m10940b();
            hzlVarM10940b.m10936q(size2);
            hzlVarM10940b.m10930k(new Rect(0, 0, sizeM10918f.getWidth(), sizeM10918f.getHeight()));
            hzlVarM10940b.m10938s(new Rect(0, i17, width, i16));
            hzlVarM10940b.m10921b(new Rect(0, i15, width, iM11431b7));
            hzlVarM10940b.m10934o(new Rect(0, iM11431b4, width, i15));
            hzlVarM10940b.m10935p(new Rect(0, iM11431b4, width, i15));
            hzlVarM10940b.m10926g(new Rect(0, iM11431b7, width, height));
            hzlVarM10940b.m10923d(new Rect(0, 0, width, height));
            hzlVarM10940b.m10924e(new Rect(0, i15, width, height));
            hzlVarM10940b.m10931l(new Rect(0, 0, 0, 0));
            hzlVarM10940b.m10929j(new Rect(0, 0, 0, 0));
            hzlVarM10940b.m10922c(new Rect(0, 0, 0, 0));
            hzlVarM10940b.m10925f(new Rect(0, i16, width, i15));
            hzlVarM10940b.m10933n(new Rect(0, 0, 0, 0));
            hzlVarM10940b.m10932m(new Rect(0, iM11431b4, width, i15));
            hzlVarM10940b.m10927h(new Rect(0, iM11431b4, width, iM11431b7));
            return hzlVarM10940b.m10920a();
        }
        Size sizeM10919g = m10919g(size2, ilkVar);
        Size sizeM10919g2 = m10919g(size3, ilkVar);
        int width2 = sizeM10919g.getWidth();
        int height2 = sizeM10919g.getHeight();
        WindowInsets windowInsets = (WindowInsets) msiVar.mo6051a();
        Size sizeM10918f2 = m10918f(sizeM10919g, kan.m13872i(sizeM10919g2).m13881h());
        int width3 = (width2 - sizeM10918f2.getWidth()) / 2;
        Rect rect = new Rect(width3, 0, sizeM10918f2.getWidth() + width3, height2);
        Size sizeM10918f3 = m10918f(new Size(rect.width(), rect.height()), kan.f35487b.m13881h());
        int height3 = sizeM10918f3.getHeight();
        int iM11431b8 = ill.m11431b(56.0f);
        int iM11431b9 = ill.m11431b(100.0f);
        int iM11431b10 = ill.m11431b(42.0f);
        int iM11431b11 = ill.m11431b(56.0f);
        int iM11431b12 = ill.m11431b(50.0f);
        int iM11431b13 = m10915c(ikwVar, context) ? ill.m11431b(56.0f) : 0;
        if (z5) {
            iM11431b = ill.m11431b(48.0f);
            i = 165;
        } else if (height2 <= height3) {
            iM11431b = ill.m11431b(48.0f);
            i = 0;
        } else {
            iM11431b = ill.m11431b(56.0f);
            i = 0;
        }
        Size sizeM10918f4 = m10918f(new Size(rect.width(), rect.height()), kan.m13872i(sizeM10919g2));
        int height4 = m10918f(sizeM10918f3, kan.f35486a.m13881h()).getHeight();
        Activity activity = (Activity) context;
        int iM11432c2 = ill.m11432c(activity, windowInsets);
        hmyVar.m10481d(4100);
        if (jpd.m13431l(hzjVar)) {
            size = sizeM10919g;
            int identifier = context.getResources().getIdentifier(IuyLAqNmW.XlCLwy, "integer", "android");
            if (identifier <= 0 || context.getResources().getInteger(identifier) != 2) {
                hmyVar.m10481d(4102);
                i2 = i;
                iM11432c = 0;
                z2 = false;
            } else if ((((height2 - ill.m11432c(activity, windowInsets)) - iM11431b) - ill.m11431b(86.0f)) - height4 < 0) {
                if (z5) {
                    ((nbe) ((nbe) f30017a.m17251b()).mo17276G(4050)).mo17273D("We shall not hide nav bar for Sunfish device: %d, %d, %d, %d, %d", Integer.valueOf(height2), Integer.valueOf(ill.m11432c(activity, windowInsets)), Integer.valueOf(iM11431b), Integer.valueOf(ill.m11431b(86.0f)), Integer.valueOf(height4));
                }
                hmyVar.m10481d(4102);
                i2 = i;
                iM11432c = 0;
                z2 = false;
            } else if (z5) {
                i3 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
                i4 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).left;
                int i18 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).right;
                if (i3 != 0) {
                    z2 = false;
                } else {
                    if (i4 == 0) {
                    }
                    i3 = 0;
                    z2 = false;
                }
                if (i3 <= ill.m11431b(16.0f)) {
                    iM11432c = ill.m11431b(48.0f);
                    i2 = i;
                } else {
                    iM11432c = ill.m11431b(48.0f);
                    i2 = i;
                }
            } else {
                iM11432c = ill.m11432c(activity, windowInsets);
                i2 = i;
                z2 = false;
            }
        } else if ((context instanceof Activity) && activity.isInMultiWindowMode()) {
            size = sizeM10919g;
            hmyVar.m10481d(4102);
            i2 = i;
            iM11432c = 0;
            z2 = false;
        } else {
            size = sizeM10919g;
            if ((((height2 - ill.m11432c(activity, windowInsets)) - iM11431b) - ill.m11431b(86.0f)) - height4 < 0) {
                if (z5) {
                    ((nbe) ((nbe) f30017a.m17251b()).mo17276G(4050)).mo17273D("We shall not hide nav bar for Sunfish device: %d, %d, %d, %d, %d", Integer.valueOf(height2), Integer.valueOf(ill.m11432c(activity, windowInsets)), Integer.valueOf(iM11431b), Integer.valueOf(ill.m11431b(86.0f)), Integer.valueOf(height4));
                }
                hmyVar.m10481d(4102);
                i2 = i;
                iM11432c = 0;
                z2 = false;
            } else if (z5) {
                i3 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
                i4 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).left;
                int i19 = windowInsets.getInsets(WindowInsets.Type.navigationBars()).right;
                if (i3 != 0) {
                    z2 = false;
                } else if (i4 == 0 || i19 != 0) {
                    i3 = 0;
                    z2 = false;
                } else {
                    i3 = 0;
                    z2 = true;
                }
                if (i3 <= ill.m11431b(16.0f) || i3 == 0) {
                    iM11432c = ill.m11431b(48.0f);
                    i2 = i;
                } else {
                    int i20 = (height2 - height3) - iM11431b;
                    int iMin = Math.min(Math.max(i20 - i, 93), ill.m11431b(40.0f));
                    int i21 = i20 - iMin;
                    iM11432c = iMin;
                    i2 = i21;
                }
            } else {
                iM11432c = ill.m11432c(activity, windowInsets);
                i2 = i;
                z2 = false;
            }
        }
        int i22 = height2 - iM11432c;
        int iM11431b14 = i22 - iM11431b;
        int height5 = sizeM10918f4.getHeight();
        int i23 = iM11431b + iM11432c;
        if (z5) {
            int i24 = height3 + iM11432c + iM11431b;
            if (height2 < i24) {
                ((nbe) ((nbe) f30017a.m17251b()).mo17276G(4049)).mo17272C("Window height is shorter than expected: %d, %d, %d, %d", Integer.valueOf(height2), Integer.valueOf(height3), Integer.valueOf(iM11432c), Integer.valueOf(iM11431b));
            }
            if (height2 >= i24 + i2) {
                i11 = iM11431b14 - height3;
                int i25 = ((iM11431b14 - height4) - i11) - iM11431b11;
                int i26 = i25 >= ill.m11431b(112.0f) ? i25 : (i25 + iM11431b11) - iM11431b;
                iM11431b2 = iM11431b14 - i26;
                i7 = iM11431b2 - iM11431b13;
                int i27 = i7 - iM11431b9;
                if (i25 < ill.m11431b(112.0f) || sizeM10919g2.getHeight() * 3 != sizeM10919g2.getWidth() * 4) {
                    i14 = iM11431b2;
                    z4 = true;
                } else {
                    i14 = i7 - iM11431b11;
                    z4 = false;
                }
                int i28 = i14;
                int i29 = i26;
                if (sizeM10919g2.getHeight() * 3 == sizeM10919g2.getWidth() * 4 && i25 < ill.m11431b(112.0f)) {
                    i11 += iM11431b;
                }
                i13 = i28;
                i5 = i29;
                i12 = i27;
                i10 = iM11431b8;
            } else {
                int i30 = i22 - height3;
                int i31 = (iM11431b14 - height4) - i30;
                int iM11431b15 = ill.m11431b(44.0f);
                if (i30 >= i2 || height2 + C0100R.styleable.AppCompatTheme_windowNoTitle < height3 + iM11431b15 + iM11432c2) {
                    i10 = iM11431b8;
                    iM11431b2 = iM11431b14 - i31;
                } else {
                    iM11431b14 += (iM11431b15 - i30) - ill.m11431b(19.0f);
                    i30 = iM11431b15;
                    i10 = i30;
                    iM11431b2 = (iM11431b14 - i31) + ill.m11431b(10.0f);
                }
                i7 = iM11431b2 - iM11431b13;
                i12 = i7 - iM11431b9;
                i13 = iM11431b2;
                z4 = true;
                int i32 = i30;
                i5 = i31;
                i11 = i32;
            }
            int i33 = i12;
            int i34 = i13;
            if (sizeM10919g2.getHeight() * 3 == sizeM10919g2.getWidth() * 4) {
                i23 += i5;
            }
            if (i10 <= i11) {
                i6 = i34;
                z3 = z4;
                iMax = Math.max(0, i11 - ill.m11431b(64.0f));
                i8 = i33;
            } else {
                i8 = i33;
                i6 = i34;
                z3 = z4;
                iMax = i11;
            }
        } else {
            z2 = z2;
            if (height2 <= height3) {
                i5 = iM11431b14 - height4;
                i6 = iM11431b14 - i5;
                i7 = i6 - iM11431b13;
                i8 = i7 - iM11431b9;
                if (sizeM10919g2.getHeight() * 3 == sizeM10919g2.getWidth() * 4) {
                    i23 += i5;
                }
                i10 = iM11431b8;
                iM11431b2 = i6;
                i11 = 0;
                iMax = 0;
                z3 = true;
            } else {
                int i35 = iM11432c + height3 + iM11431b;
                if (height2 < i35) {
                    i11 = i22 - height3;
                    i5 = (iM11431b14 - height4) - i11;
                    i6 = iM11431b14 - i5;
                    i7 = i6 - iM11431b13;
                    i8 = i7 - iM11431b9;
                    if (sizeM10919g2.getHeight() * 3 == sizeM10919g2.getWidth() * 4) {
                        i23 += i5;
                    }
                    i10 = iM11431b8;
                    iMax = i11;
                    iM11431b2 = i6;
                    z3 = true;
                } else {
                    lku.m15669w(height2 >= i35);
                    int i36 = iM11431b14 - height3;
                    i5 = ((i22 - (iM11431b + iM11431b)) - height4) - i36;
                    i6 = iM11431b14 - i5;
                    i7 = i6 - iM11431b13;
                    i8 = i7 - iM11431b9;
                    if (sizeM10919g2.getHeight() * 3 == sizeM10919g2.getWidth() * 4) {
                        i9 = i36 + iM11431b;
                        i23 += i5;
                    } else {
                        i9 = i36;
                    }
                    i10 = iM11431b8;
                    iMax = i36;
                    i11 = i9;
                    z3 = true;
                    iM11431b2 = i6;
                }
            }
        }
        int iMax2 = Math.max(i11, i10 + iMax);
        int i37 = iM11431b13;
        int i38 = i6 - iMax2;
        int i39 = i7;
        int i40 = iM11431b14 - iMax2;
        boolean z6 = sizeM10919g2.getHeight() * 3 == sizeM10919g2.getWidth() * 4;
        if (z6) {
            i23 += iM11431b2 - i6;
        }
        int i41 = i6 - i11;
        int i42 = i6;
        int i43 = (i8 - iMax) + iM11431b10;
        int i44 = i2;
        hzl hzlVarM10940b2 = hzm.m10940b();
        hzlVarM10940b2.m10936q(size);
        int i45 = iMax;
        hzlVarM10940b2.m10938s(m10917e(rect.left, i8, rect.width(), iM11431b9 + iM11431b11));
        hzlVarM10940b2.m10926g(m10917e(rect.left, iM11431b14, rect.width(), iM11431b));
        hzlVarM10940b2.m10921b(m10917e(rect.left, iM11431b2 - iM11431b12, rect.width(), i5 + iM11431b12 + iM11431b12));
        hzlVarM10940b2.m10924e(m10917e(rect.left, true == z6 ? i42 : iM11431b14, rect.width(), i23));
        hzlVarM10940b2.m10935p(m10917e(rect.left, iMax2, rect.width(), i38));
        hzlVarM10940b2.m10930k(m10917e(rect.left, i11, rect.width(), height5));
        hzlVarM10940b2.m10931l(m10917e(rect.left, i11, rect.width(), i41));
        hzlVarM10940b2.m10929j(m10917e(rect.left, i45, rect.width(), i43));
        hzlVarM10940b2.m10934o(m10917e(rect.left, iMax2, rect.width(), i38));
        hzlVarM10940b2.m10923d(m10917e(rect.left, 0, rect.width(), height2));
        hzlVarM10940b2.m10922c(m10917e(rect.left, 0, rect.width(), i44));
        hzlVarM10940b2.m10925f(m10917e(rect.left, i39, rect.width(), i37));
        hzlVarM10940b2.m10928i(z2);
        hzlVarM10940b2.m10937r(z3);
        hzlVarM10940b2.m10933n(new Rect(0, 0, 0, 0));
        hzlVarM10940b2.m10932m(m10917e(rect.left, iMax2, rect.width(), i38));
        hzlVarM10940b2.m10927h(m10917e(rect.left, iMax2, rect.width(), i40));
        hzm hzmVarM10920a = hzlVarM10940b2.m10920a();
        Size size4 = hzmVarM10920a.f30038b;
        ilk ilkVar2 = ilk.PORTRAIT;
        switch (ilkVar) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                break;
            case LANDSCAPE:
            case REVERSE_LANDSCAPE:
                size4 = new Size(size4.getHeight(), size4.getWidth());
                break;
            default:
                throw new IllegalArgumentException("Unexpected UI Orientation: ".concat(String.valueOf(String.valueOf(ilkVar))));
        }
        hzl hzlVarM10940b3 = hzm.m10940b();
        hzlVarM10940b3.m10936q(size4);
        hzlVarM10940b3.m10930k(hzm.m10939a(hzmVarM10920a.f30041e, size4, ilkVar));
        hzlVarM10940b3.m10931l(hzm.m10939a(hzmVarM10920a.f30039c, size4, ilkVar));
        hzlVarM10940b3.m10929j(hzm.m10939a(hzmVarM10920a.f30040d, size4, ilkVar));
        hzlVarM10940b3.m10934o(hzm.m10939a(hzmVarM10920a.f30042f, size4, ilkVar));
        hzlVarM10940b3.m10935p(hzm.m10939a(hzmVarM10920a.f30043g, size4, ilkVar));
        hzlVarM10940b3.m10938s(hzm.m10939a(hzmVarM10920a.f30044h, size4, ilkVar));
        hzlVarM10940b3.m10921b(hzm.m10939a(hzmVarM10920a.f30045i, size4, ilkVar));
        hzlVarM10940b3.m10925f(hzm.m10939a(hzmVarM10920a.f30051o, size4, ilkVar));
        hzlVarM10940b3.m10923d(hzm.m10939a(hzmVarM10920a.f30047k, size4, ilkVar));
        hzlVarM10940b3.m10924e(hzm.m10939a(hzmVarM10920a.f30046j, size4, ilkVar));
        hzlVarM10940b3.m10922c(hzm.m10939a(hzmVarM10920a.f30050n, size4, ilkVar));
        hzlVarM10940b3.m10926g(hzm.m10939a(hzmVarM10920a.f30048l, size4, ilkVar));
        hzlVarM10940b3.m10928i(hzmVarM10920a.f30054r);
        hzlVarM10940b3.m10937r(hzmVarM10920a.f30055s);
        hzlVarM10940b3.m10933n(hzm.m10939a(hzmVarM10920a.f30049m, size4, ilkVar));
        hzlVarM10940b3.m10932m(hzm.m10939a(hzmVarM10920a.f30052p, size4, ilkVar));
        hzlVarM10940b3.m10927h(hzm.m10939a(hzmVarM10920a.f30053q, size4, ilkVar));
        return hzlVarM10940b3.m10920a();
    }

    /* JADX INFO: renamed from: e */
    private static Rect m10917e(int i, int i2, int i3, int i4) {
        return new Rect(i, i2, i3 + i, i4 + i2);
    }

    /* JADX INFO: renamed from: f */
    private static Size m10918f(Size size, kan kanVar) {
        float fMin = Math.min(size.getWidth() / kanVar.f35489d, size.getHeight() / kanVar.f35490e);
        return new Size(Math.round(kanVar.f35489d * fMin), Math.round(fMin * kanVar.f35490e));
    }

    /* JADX INFO: renamed from: g */
    private static Size m10919g(Size size, ilk ilkVar) {
        ilk ilkVar2 = ilk.PORTRAIT;
        switch (ilkVar) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                return size;
            case LANDSCAPE:
            case REVERSE_LANDSCAPE:
                return new Size(size.getHeight(), size.getWidth());
            default:
                throw new RuntimeException("Unknown UI orientation: ".concat(String.valueOf(String.valueOf(ilkVar))));
        }
    }
}
