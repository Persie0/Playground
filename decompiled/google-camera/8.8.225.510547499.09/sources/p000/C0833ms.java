package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.google.android.apps.camera.bottombar.C0100R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ms */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0833ms {

    /* JADX INFO: renamed from: b */
    private static C0833ms f41494b;

    /* JADX INFO: renamed from: c */
    private WeakHashMap f41496c;

    /* JADX INFO: renamed from: d */
    private final WeakHashMap f41497d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e */
    private TypedValue f41498e;

    /* JADX INFO: renamed from: f */
    private boolean f41499f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0832mr f41500g;

    /* JADX INFO: renamed from: a */
    private static final PorterDuff.Mode f41493a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    private static final C1116xe f41495h = new C1116xe(6);

    /* JADX INFO: renamed from: b */
    public static synchronized PorterDuffColorFilter m16836b(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1116xe c1116xe = f41495h;
        porterDuffColorFilter = (PorterDuffColorFilter) c1116xe.m19553a(Integer.valueOf(C1116xe.m19550c(i, mode)));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized C0833ms m16837e() {
        if (f41494b == null) {
            f41494b = new C0833ms();
        }
        return f41494b;
    }

    /* JADX INFO: renamed from: h */
    static void m16838h(Drawable drawable, C0850ni c0850ni, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        Rect rect = C0768kh.f36003a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            PorterDuffColorFilter porterDuffColorFilterM16836b = null;
            if (c0850ni.f42636d) {
                colorStateList = c0850ni.f42633a;
            } else {
                if (!c0850ni.f42635c) {
                    drawable.clearColorFilter();
                    return;
                }
                colorStateList = null;
            }
            PorterDuff.Mode mode = c0850ni.f42635c ? c0850ni.f42634b : f41493a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilterM16836b = m16836b(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilterM16836b);
        }
    }

    /* JADX INFO: renamed from: i */
    private final synchronized Drawable m16839i(Context context, long j) {
        C1114xc c1114xc = (C1114xc) this.f41497d.get(context);
        if (c1114xc == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1114xc.m19546d(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM19569b = C1120xi.m19569b(c1114xc.f47990b, c1114xc.f47992d, j);
            if (iM19569b >= 0) {
                Object[] objArr = c1114xc.f47991c;
                Object obj = objArr[iM19569b];
                Object obj2 = C1115xd.f47993a;
                if (obj != obj2) {
                    objArr[iM19569b] = obj2;
                    c1114xc.f47989a = true;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    private final synchronized void m16840j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1114xc c1114xc = (C1114xc) this.f41497d.get(context);
            if (c1114xc == null) {
                c1114xc = new C1114xc();
                this.f41497d.put(context, c1114xc);
            }
            c1114xc.m19549g(j, new WeakReference(constantState));
        }
    }

    /* JADX INFO: renamed from: a */
    final synchronized ColorStateList m16841a(Context context, int i) {
        int iM17433b;
        C1118xg c1118xg;
        WeakHashMap weakHashMap = this.f41496c;
        ColorStateList colorStateListM171c = null;
        ColorStateList colorStateList = (weakHashMap == null || (c1118xg = (C1118xg) weakHashMap.get(context)) == null) ? null : (ColorStateList) C1119xh.m19566a(c1118xg, i);
        if (colorStateList == null) {
            InterfaceC0832mr interfaceC0832mr = this.f41500g;
            if (interfaceC0832mr != null) {
                if (i == C0100R.drawable.abc_edit_text_material) {
                    colorStateListM171c = abx.m171c(context, C0100R.color.abc_tint_edittext);
                } else if (i == C0100R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateListM171c = abx.m171c(context, C0100R.color.abc_tint_switch_track);
                } else if (i == C0100R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList colorStateListM17434c = C0847nf.m17434c(context, C0100R.attr.colorSwitchThumbNormal);
                    if (colorStateListM17434c == null || !colorStateListM17434c.isStateful()) {
                        iArr[0] = C0847nf.f42161a;
                        iArr2[0] = C0847nf.m17432a(context, C0100R.attr.colorSwitchThumbNormal);
                        iArr[1] = C0847nf.f42164d;
                        iArr2[1] = C0847nf.m17433b(context, C0100R.attr.colorControlActivated);
                        iArr[2] = C0847nf.f42165e;
                        iArr2[2] = C0847nf.m17433b(context, C0100R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = C0847nf.f42161a;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListM17434c.getColorForState(iArr3, 0);
                        iArr[1] = C0847nf.f42164d;
                        iArr2[1] = C0847nf.m17433b(context, C0100R.attr.colorControlActivated);
                        iArr[2] = C0847nf.f42165e;
                        iArr2[2] = colorStateListM17434c.getDefaultColor();
                    }
                    colorStateListM171c = new ColorStateList(iArr, iArr2);
                } else {
                    if (i == C0100R.drawable.abc_btn_default_mtrl_shape) {
                        iM17433b = C0847nf.m17433b(context, C0100R.attr.colorButtonNormal);
                    } else if (i == C0100R.drawable.abc_btn_borderless_material) {
                        colorStateListM171c = C0270in.m11503b(context, 0);
                    } else if (i == C0100R.drawable.abc_btn_colored_material) {
                        iM17433b = C0847nf.m17433b(context, C0100R.attr.colorAccent);
                    } else if (i == C0100R.drawable.abc_spinner_mtrl_am_alpha || i == C0100R.drawable.abc_spinner_textfield_background_material) {
                        colorStateListM171c = abx.m171c(context, C0100R.color.abc_tint_spinner);
                    } else if (C0270in.m11502a(((C0270in) interfaceC0832mr).f31571b, i)) {
                        colorStateListM171c = C0847nf.m17434c(context, C0100R.attr.colorControlNormal);
                    } else if (C0270in.m11502a(((C0270in) interfaceC0832mr).f31574e, i)) {
                        colorStateListM171c = abx.m171c(context, C0100R.color.abc_tint_default);
                    } else if (C0270in.m11502a(((C0270in) interfaceC0832mr).f31575f, i)) {
                        colorStateListM171c = abx.m171c(context, C0100R.color.abc_tint_btn_checkable);
                    } else if (i == C0100R.drawable.abc_seekbar_thumb_material) {
                        colorStateListM171c = abx.m171c(context, C0100R.color.abc_tint_seek_thumb);
                        i = C0100R.drawable.abc_seekbar_thumb_material;
                    }
                    colorStateListM171c = C0270in.m11503b(context, iM17433b);
                }
            }
            if (colorStateListM171c != null) {
                if (this.f41496c == null) {
                    this.f41496c = new WeakHashMap();
                }
                C1118xg c1118xg2 = (C1118xg) this.f41496c.get(context);
                if (c1118xg2 == null) {
                    c1118xg2 = new C1118xg();
                    this.f41496c.put(context, c1118xg2);
                }
                int i2 = c1118xg2.f48008d;
                if (i2 == 0 || i > c1118xg2.f48006b[i2 - 1]) {
                    if (c1118xg2.f48005a && i2 >= c1118xg2.f48006b.length) {
                        C1119xh.m19567b(c1118xg2);
                    }
                    int i3 = c1118xg2.f48008d;
                    int[] iArr4 = c1118xg2.f48006b;
                    if (i3 >= iArr4.length) {
                        int iM19571d = C1120xi.m19571d(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(iArr4, iM19571d);
                        iArrCopyOf.getClass();
                        c1118xg2.f48006b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(c1118xg2.f48007c, iM19571d);
                        objArrCopyOf.getClass();
                        c1118xg2.f48007c = objArrCopyOf;
                    }
                    c1118xg2.f48006b[i3] = i;
                    c1118xg2.f48007c[i3] = colorStateListM171c;
                    c1118xg2.f48008d = i3 + 1;
                } else {
                    c1118xg2.m19565d(i, colorStateListM171c);
                }
                return colorStateListM171c;
            }
            colorStateList = colorStateListM171c;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m16842c(Context context, int i) {
        return m16843d(context, i, false);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m16844f(Context context) {
        C1114xc c1114xc = (C1114xc) this.f41497d.get(context);
        if (c1114xc != null) {
            c1114xc.m19548f();
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m16845g(InterfaceC0832mr interfaceC0832mr) {
        this.f41500g = interfaceC0832mr;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x014f A[Catch: all -> 0x01ce, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:46:0x00d4, B:86:0x01bf, B:44:0x00d0, B:49:0x00dc, B:53:0x00f3, B:54:0x011a, B:58:0x0125, B:60:0x014f, B:77:0x01a1, B:79:0x01b4, B:63:0x0163, B:66:0x0171, B:68:0x017e, B:71:0x0186, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:89:0x01c4, B:90:0x01cd), top: B:96:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163 A[Catch: all -> 0x01ce, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:46:0x00d4, B:86:0x01bf, B:44:0x00d0, B:49:0x00dc, B:53:0x00f3, B:54:0x011a, B:58:0x0125, B:60:0x014f, B:77:0x01a1, B:79:0x01b4, B:63:0x0163, B:66:0x0171, B:68:0x017e, B:71:0x0186, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:89:0x01c4, B:90:0x01cd), top: B:96:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x016e A[PHI: r5 r6
      0x016e: PHI (r5v3 android.graphics.PorterDuff$Mode) = (r5v1 android.graphics.PorterDuff$Mode), (r5v2 android.graphics.PorterDuff$Mode) binds: [B:64:0x016c, B:68:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r6v11 int) = (r6v7 int), (r6v8 int) binds: [B:64:0x016c, B:68:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0171 A[Catch: all -> 0x01ce, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:46:0x00d4, B:86:0x01bf, B:44:0x00d0, B:49:0x00dc, B:53:0x00f3, B:54:0x011a, B:58:0x0125, B:60:0x014f, B:77:0x01a1, B:79:0x01b4, B:63:0x0163, B:66:0x0171, B:68:0x017e, B:71:0x0186, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:89:0x01c4, B:90:0x01cd), top: B:96:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x017e A[Catch: all -> 0x01ce, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:46:0x00d4, B:86:0x01bf, B:44:0x00d0, B:49:0x00dc, B:53:0x00f3, B:54:0x011a, B:58:0x0125, B:60:0x014f, B:77:0x01a1, B:79:0x01b4, B:63:0x0163, B:66:0x0171, B:68:0x017e, B:71:0x0186, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:89:0x01c4, B:90:0x01cd), top: B:96:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186 A[Catch: all -> 0x01ce, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:46:0x00d4, B:86:0x01bf, B:44:0x00d0, B:49:0x00dc, B:53:0x00f3, B:54:0x011a, B:58:0x0125, B:60:0x014f, B:77:0x01a1, B:79:0x01b4, B:63:0x0163, B:66:0x0171, B:68:0x017e, B:71:0x0186, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:89:0x01c4, B:90:0x01cd), top: B:96:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:75:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1 A[Catch: all -> 0x01ce, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:46:0x00d4, B:86:0x01bf, B:44:0x00d0, B:49:0x00dc, B:53:0x00f3, B:54:0x011a, B:58:0x0125, B:60:0x014f, B:77:0x01a1, B:79:0x01b4, B:63:0x0163, B:66:0x0171, B:68:0x017e, B:71:0x0186, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:89:0x01c4, B:90:0x01cd), top: B:96:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4 A[Catch: all -> 0x01ce, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:35:0x00b1, B:37:0x00b7, B:39:0x00bd, B:46:0x00d4, B:86:0x01bf, B:44:0x00d0, B:49:0x00dc, B:53:0x00f3, B:54:0x011a, B:58:0x0125, B:60:0x014f, B:77:0x01a1, B:79:0x01b4, B:63:0x0163, B:66:0x0171, B:68:0x017e, B:71:0x0186, B:19:0x005c, B:33:0x00a7, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:89:0x01c4, B:90:0x01cd), top: B:96:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX INFO: renamed from: d */
    final synchronized Drawable m16843d(Context context, int i, boolean z) {
        Drawable drawable;
        PorterDuff.Mode mode;
        boolean zM11502a;
        int iRound;
        Drawable drawableMutate;
        Drawable drawableFindDrawableByLayerId;
        int iM17433b;
        PorterDuff.Mode mode2;
        int i2 = i;
        synchronized (this) {
            boolean z2 = false;
            if (!this.f41499f) {
                this.f41499f = true;
                Drawable drawableM16842c = m16842c(context, C0100R.drawable.abc_vector_test);
                if (drawableM16842c == null || (!(drawableM16842c instanceof atr) && !"android.graphics.drawable.VectorDrawable".equals(drawableM16842c.getClass().getName()))) {
                    this.f41499f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if (this.f41498e == null) {
                this.f41498e = new TypedValue();
            }
            TypedValue typedValue = this.f41498e;
            context.getResources().getValue(i2, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            Drawable drawableM16839i = m16839i(context, j);
            drawable = null;
            mode = null;
            PorterDuff.Mode mode3 = null;
            if (drawableM16839i == null) {
                if (this.f41500g == null) {
                    drawableM16839i = null;
                } else if (i2 == C0100R.drawable.abc_cab_background_top_material) {
                    drawableM16839i = new LayerDrawable(new Drawable[]{m16842c(context, C0100R.drawable.abc_cab_background_internal_bg), m16842c(context, C0100R.drawable.abc_cab_background_top_mtrl_alpha)});
                } else if (i2 == C0100R.drawable.abc_ratingbar_material) {
                    drawableM16839i = C0270in.m11504c(this, context, C0100R.dimen.abc_star_big);
                } else if (i2 == C0100R.drawable.abc_ratingbar_indicator_material) {
                    drawableM16839i = C0270in.m11504c(this, context, C0100R.dimen.abc_star_medium);
                } else if (i2 == C0100R.drawable.abc_ratingbar_small_material) {
                    drawableM16839i = C0270in.m11504c(this, context, C0100R.dimen.abc_star_small);
                    i2 = C0100R.drawable.abc_ratingbar_small_material;
                } else {
                    drawableM16839i = null;
                }
                if (drawableM16839i != null) {
                    drawableM16839i.setChangingConfigurations(typedValue.changingConfigurations);
                    m16840j(context, j, drawableM16839i);
                }
            }
            if (drawableM16839i == null) {
                drawableM16839i = abt.m154a(context, i2);
            }
            if (drawableM16839i == null) {
                drawable = drawableM16839i;
            } else {
                ColorStateList colorStateListM16841a = m16841a(context, i2);
                if (colorStateListM16841a != null) {
                    Rect rect = C0768kh.f36003a;
                    Drawable drawableMutate2 = drawableM16839i.mutate();
                    acv.m238g(drawableMutate2, colorStateListM16841a);
                    if (this.f41500g != null && i2 == C0100R.drawable.abc_switch_thumb_material) {
                        mode3 = PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode3 != null) {
                        acv.m239h(drawableMutate2, mode3);
                    }
                    drawable = drawableMutate2;
                } else {
                    InterfaceC0832mr interfaceC0832mr = this.f41500g;
                    int i3 = C0100R.attr.colorControlActivated;
                    if (interfaceC0832mr != null) {
                        if (i2 == C0100R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawableM16839i;
                            C0270in.m11505d(layerDrawable.findDrawableByLayerId(R.id.background), C0847nf.m17433b(context, C0100R.attr.colorControlNormal), C0271io.f31622a);
                            C0270in.m11505d(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0847nf.m17433b(context, C0100R.attr.colorControlNormal), C0271io.f31622a);
                            drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                            iM17433b = C0847nf.m17433b(context, C0100R.attr.colorControlActivated);
                            mode2 = C0271io.f31622a;
                        } else if (i2 == C0100R.drawable.abc_ratingbar_material || i2 == C0100R.drawable.abc_ratingbar_indicator_material || i2 == C0100R.drawable.abc_ratingbar_small_material) {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawableM16839i;
                            C0270in.m11505d(layerDrawable2.findDrawableByLayerId(R.id.background), C0847nf.m17432a(context, C0100R.attr.colorControlNormal), C0271io.f31622a);
                            C0270in.m11505d(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), C0847nf.m17433b(context, C0100R.attr.colorControlActivated), C0271io.f31622a);
                            drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                            iM17433b = C0847nf.m17433b(context, C0100R.attr.colorControlActivated);
                            mode2 = C0271io.f31622a;
                        } else if (interfaceC0832mr != null) {
                            mode = C0271io.f31622a;
                            if (C0270in.m11502a(((C0270in) interfaceC0832mr).f31570a, i2)) {
                                iRound = -1;
                                z2 = true;
                                i3 = C0100R.attr.colorControlNormal;
                            } else if (C0270in.m11502a(((C0270in) interfaceC0832mr).f31572c, i2)) {
                                iRound = -1;
                                z2 = true;
                            } else {
                                zM11502a = C0270in.m11502a(((C0270in) interfaceC0832mr).f31573d, i2);
                                i3 = R.attr.colorBackground;
                                if (zM11502a) {
                                    mode = PorterDuff.Mode.MULTIPLY;
                                    iRound = -1;
                                    z2 = true;
                                } else if (i2 == C0100R.drawable.abc_list_divider_mtrl_alpha) {
                                    iRound = Math.round(40.8f);
                                    z2 = true;
                                    i3 = R.attr.colorForeground;
                                } else if (i2 == C0100R.drawable.abc_dialog_material_background) {
                                    iRound = -1;
                                    z2 = true;
                                } else {
                                    iRound = -1;
                                    i3 = 0;
                                }
                            }
                            if (z2) {
                                Rect rect2 = C0768kh.f36003a;
                                drawableMutate = drawableM16839i.mutate();
                                drawableMutate.setColorFilter(C0271io.m11551b(C0847nf.m17433b(context, i3), mode));
                                if (iRound != -1) {
                                    drawableMutate.setAlpha(iRound);
                                }
                            } else if (z) {
                            }
                            drawable = drawableM16839i;
                        } else if (z) {
                            drawable = drawableM16839i;
                        }
                        C0270in.m11505d(drawableFindDrawableByLayerId, iM17433b, mode2);
                        drawable = drawableM16839i;
                    } else if (interfaceC0832mr != null) {
                        mode = C0271io.f31622a;
                        if (C0270in.m11502a(((C0270in) interfaceC0832mr).f31570a, i2)) {
                            iRound = -1;
                            z2 = true;
                            i3 = C0100R.attr.colorControlNormal;
                        } else if (C0270in.m11502a(((C0270in) interfaceC0832mr).f31572c, i2)) {
                            iRound = -1;
                            z2 = true;
                        } else {
                            zM11502a = C0270in.m11502a(((C0270in) interfaceC0832mr).f31573d, i2);
                            i3 = R.attr.colorBackground;
                            if (zM11502a) {
                                mode = PorterDuff.Mode.MULTIPLY;
                                iRound = -1;
                                z2 = true;
                            } else if (i2 == C0100R.drawable.abc_list_divider_mtrl_alpha) {
                                iRound = Math.round(40.8f);
                                z2 = true;
                                i3 = R.attr.colorForeground;
                            } else if (i2 == C0100R.drawable.abc_dialog_material_background) {
                                iRound = -1;
                                z2 = true;
                            } else {
                                iRound = -1;
                                i3 = 0;
                            }
                        }
                        if (z2) {
                            Rect rect3 = C0768kh.f36003a;
                            drawableMutate = drawableM16839i.mutate();
                            drawableMutate.setColorFilter(C0271io.m11551b(C0847nf.m17433b(context, i3), mode));
                            if (iRound != -1) {
                                drawableMutate.setAlpha(iRound);
                            }
                        } else if (z) {
                        }
                        drawable = drawableM16839i;
                    } else if (z) {
                        drawable = drawableM16839i;
                    }
                }
            }
            if (drawable != null) {
                C0768kh.m14232c(drawable);
            }
        }
        return drawable;
    }
}
