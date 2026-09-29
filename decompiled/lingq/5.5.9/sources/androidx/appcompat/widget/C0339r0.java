package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p254m2.C7472a;
import p326q.C8449e;
import p326q.C8450f;
import p326q.C8453i;
import p329q2.C8488a;

/* JADX INFO: renamed from: androidx.appcompat.widget.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0339r0 {

    /* JADX INFO: renamed from: g */
    public static C0339r0 f1321g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Context, C8453i<ColorStateList>> f1323a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap<Context, C8449e<WeakReference<Drawable.ConstantState>>> f1324b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f1325c;

    /* JADX INFO: renamed from: d */
    public boolean f1326d;

    /* JADX INFO: renamed from: e */
    public b f1327e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f1320f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final a f1322h = new a();

    /* JADX INFO: renamed from: androidx.appcompat.widget.r0$a */
    public static class a extends C8450f<Integer, PorterDuffColorFilter> {
        public a() {
            super(6);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.r0$b */
    public interface b {
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C0339r0 m1256c() {
        if (f1321g == null) {
            f1321g = new C0339r0();
        }
        return f1321g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static synchronized PorterDuffColorFilter m1257g(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM16516b;
        try {
            a aVar = f1322h;
            aVar.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilterM16516b = aVar.m16516b(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilterM16516b == null) {
                porterDuffColorFilterM16516b = new PorterDuffColorFilter(i10, mode);
                aVar.getClass();
                aVar.m16517c(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilterM16516b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return porterDuffColorFilterM16516b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m1258a(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C8449e<WeakReference<Drawable.ConstantState>> c8449e = this.f1324b.get(context);
            if (c8449e == null) {
                c8449e = new C8449e<>();
                this.f1324b.put(context, c8449e);
            }
            c8449e.m16512g(j10, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX INFO: renamed from: b */
    public final Drawable m1259b(int i10, Context context) {
        LayerDrawable layerDrawableM1208c;
        if (this.f1325c == null) {
            this.f1325c = new TypedValue();
        }
        TypedValue typedValue = this.f1325c;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM1260d = m1260d(context, j10);
        if (drawableM1260d != null) {
            return drawableM1260d;
        }
        if (this.f1327e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableM1208c = new LayerDrawable(new Drawable[]{m1261e(context, R.drawable.abc_cab_background_internal_bg), m1261e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableM1208c = C0319i.a.m1208c(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM1208c = C0319i.a.m1208c(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM1208c = C0319i.a.m1208c(this, context, R.dimen.abc_star_small);
            }
            if (layerDrawableM1208c != null) {
                layerDrawableM1208c.setChangingConfigurations(typedValue.changingConfigurations);
                m1258a(context, j10, layerDrawableM1208c);
            }
            return layerDrawableM1208c;
        }
        layerDrawableM1208c = null;
        if (layerDrawableM1208c != null) {
            layerDrawableM1208c.setChangingConfigurations(typedValue.changingConfigurations);
            m1258a(context, j10, layerDrawableM1208c);
        }
        return layerDrawableM1208c;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m1260d(Context context, long j10) {
        try {
            C8449e<WeakReference<Drawable.ConstantState>> c8449e = this.f1324b.get(context);
            if (c8449e == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) c8449e.m16510e(j10, null);
            if (weakReference != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                c8449e.m16513h(j10);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m1261e(Context context, int i10) {
        return m1262f(context, i10, false);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x0001, B:17:0x0038, B:19:0x003e, B:22:0x004a, B:24:0x0052, B:32:0x006d, B:29:0x0067, B:37:0x007a, B:41:0x0096, B:48:0x00d1, B:52:0x00fe, B:58:0x010a, B:6:0x000c, B:8:0x0019, B:10:0x001e, B:62:0x0111, B:63:0x011d), top: B:66:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (((r11 instanceof p428v4.C9644g) || "android.graphics.drawable.VectorDrawable".equals(r11.getClass().getName())) != false) goto L17;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable m1262f(Context context, int i10, boolean z10) {
        Drawable drawableM1259b;
        try {
            boolean z11 = false;
            if (!this.f1326d) {
                this.f1326d = true;
                Drawable drawableM1261e = m1261e(context, R.drawable.abc_vector_test);
                if (drawableM1261e != null) {
                }
                this.f1326d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
            drawableM1259b = m1259b(i10, context);
            if (drawableM1259b == null) {
                Object obj = C7472a.f41322a;
                drawableM1259b = C7472a.c.m14849b(context, i10);
            }
            if (drawableM1259b != null) {
                ColorStateList colorStateListM1263h = m1263h(i10, context);
                PorterDuff.Mode mode = null;
                if (colorStateListM1263h != null) {
                    int[] iArr = C0311f0.f1174a;
                    Drawable drawableMutate = drawableM1259b.mutate();
                    C8488a.b.m16570h(drawableMutate, colorStateListM1263h);
                    if (this.f1327e != null && i10 == R.drawable.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode != null) {
                        C8488a.b.m16571i(drawableMutate, mode);
                    }
                    drawableM1259b = drawableMutate;
                } else if (this.f1327e != null) {
                    if (i10 == R.drawable.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawableM1259b;
                        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                        int iM1281c = C0349w0.m1281c(R.attr.colorControlNormal, context);
                        PorterDuff.Mode mode2 = C0319i.f1217b;
                        C0319i.a.m1209e(drawableFindDrawableByLayerId, iM1281c, mode2);
                        C0319i.a.m1209e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), C0349w0.m1281c(R.attr.colorControlNormal, context), mode2);
                        C0319i.a.m1209e(layerDrawable.findDrawableByLayerId(android.R.id.progress), C0349w0.m1281c(R.attr.colorControlActivated, context), mode2);
                    } else if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                        LayerDrawable layerDrawable2 = (LayerDrawable) drawableM1259b;
                        Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                        int iM1280b = C0349w0.m1280b(R.attr.colorControlNormal, context);
                        PorterDuff.Mode mode3 = C0319i.f1217b;
                        C0319i.a.m1209e(drawableFindDrawableByLayerId2, iM1280b, mode3);
                        C0319i.a.m1209e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), C0349w0.m1281c(R.attr.colorControlActivated, context), mode3);
                        C0319i.a.m1209e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), C0349w0.m1281c(R.attr.colorControlActivated, context), mode3);
                    } else if (z11) {
                        if (!m1264i(context, i10, drawableM1259b)) {
                            drawableM1259b = null;
                        }
                    }
                    z11 = true;
                    if (z11) {
                        if (!m1264i(context, i10, drawableM1259b)) {
                            drawableM1259b = null;
                        }
                    }
                } else if (!m1264i(context, i10, drawableM1259b) && z10) {
                    drawableM1259b = null;
                }
            }
            if (drawableM1259b != null) {
                C0311f0.m1186a(drawableM1259b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableM1259b;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized ColorStateList m1263h(int i10, Context context) {
        ColorStateList colorStateList;
        C8453i<ColorStateList> c8453i;
        try {
            WeakHashMap<Context, C8453i<ColorStateList>> weakHashMap = this.f1323a;
            ColorStateList colorStateListM1210d = null;
            colorStateList = (weakHashMap == null || (c8453i = weakHashMap.get(context)) == null) ? null : (ColorStateList) c8453i.m16535f(i10, null);
            if (colorStateList == null) {
                b bVar = this.f1327e;
                if (bVar != null) {
                    colorStateListM1210d = ((C0319i.a) bVar).m1210d(i10, context);
                }
                if (colorStateListM1210d != null) {
                    if (this.f1323a == null) {
                        this.f1323a = new WeakHashMap<>();
                    }
                    C8453i<ColorStateList> c8453i2 = this.f1323a.get(context);
                    if (c8453i2 == null) {
                        c8453i2 = new C8453i<>();
                        this.f1323a.put(context, c8453i2);
                    }
                    c8453i2.m16531b(i10, colorStateListM1210d);
                }
                colorStateList = colorStateListM1210d;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX INFO: renamed from: i */
    public final boolean m1264i(Context context, int i10, Drawable drawable) {
        boolean z10;
        int i11;
        PorterDuff.Mode mode;
        int i12;
        int iRound;
        int i13;
        boolean z11;
        Drawable drawableMutate;
        b bVar = this.f1327e;
        boolean z12 = false;
        if (bVar != null) {
            C0319i.a aVar = (C0319i.a) bVar;
            PorterDuff.Mode mode2 = C0319i.f1217b;
            if (C0319i.a.m1206a(aVar.f1220a, i10)) {
                i13 = R.attr.colorControlNormal;
            } else if (C0319i.a.m1206a(aVar.f1222c, i10)) {
                i13 = R.attr.colorControlActivated;
            } else {
                if (C0319i.a.m1206a(aVar.f1223d, i10)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                        mode = mode2;
                        i12 = 16842800;
                        iRound = Math.round(40.8f);
                        z10 = true;
                    } else {
                        if (i10 != R.drawable.abc_dialog_material_background) {
                            z10 = false;
                            i11 = 0;
                        }
                        mode = mode2;
                        i12 = i11;
                        iRound = -1;
                    }
                    if (z10) {
                        int[] iArr = C0311f0.f1174a;
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C0319i.m1202c(C0349w0.m1281c(i12, context), mode));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z12 = true;
                    }
                }
                i13 = android.R.attr.colorBackground;
            }
            i11 = i13;
            z10 = true;
            mode = mode2;
            i12 = i11;
            iRound = -1;
            if (z10) {
                int[] iArr2 = C0311f0.f1174a;
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C0319i.m1202c(C0349w0.m1281c(i12, context), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z12 = true;
            }
        }
        return z12;
    }
}
