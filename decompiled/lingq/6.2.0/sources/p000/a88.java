package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$drawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a88 {

    /* JADX INFO: renamed from: g */
    public static a88 f356g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f358a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f359b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f360c;

    /* JADX INFO: renamed from: d */
    public boolean f361d;

    /* JADX INFO: renamed from: e */
    public co7 f362e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f355f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final z78 f357h = new z78(6);

    /* JADX INFO: renamed from: c */
    public static synchronized a88 m172c() {
        try {
            if (f356g == null) {
                f356g = new a88();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f356g;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized PorterDuffColorFilter m173f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        z78 z78Var = f357h;
        z78Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) z78Var.m238d(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final void m174a(Context context, int i, ColorStateList colorStateList) {
        if (this.f358a == null) {
            this.f358a = new WeakHashMap();
        }
        pe9 pe9Var = (pe9) this.f358a.get(context);
        if (pe9Var == null) {
            pe9Var = new pe9(0);
            this.f358a.put(context, pe9Var);
        }
        int i2 = pe9Var.f56016d;
        if (i2 != 0 && i <= pe9Var.f56014b[i2 - 1]) {
            pe9Var.m19080d(i, colorStateList);
            return;
        }
        if (pe9Var.f56013a && i2 >= pe9Var.f56014b.length) {
            AbstractC3122is.m14091e(pe9Var);
        }
        int i3 = pe9Var.f56016d;
        if (i3 >= pe9Var.f56014b.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            pe9Var.f56014b = Arrays.copyOf(pe9Var.f56014b, i7);
            pe9Var.f56015c = Arrays.copyOf(pe9Var.f56015c, i7);
        }
        pe9Var.f56014b[i3] = i;
        pe9Var.f56015c[i3] = colorStateList;
        pe9Var.f56016d = i3 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX INFO: renamed from: b */
    public final Drawable m175b(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableM4923p;
        if (this.f360c == null) {
            this.f360c = new TypedValue();
        }
        TypedValue typedValue = this.f360c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            tk5 tk5Var = (tk5) this.f359b.get(context);
            obj = null;
            if (tk5Var != null && (weakReference = (WeakReference) tk5Var.m22176b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    tk5Var.m22181g(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f362e == null) {
            layerDrawableM4923p = null;
        } else if (i == R$drawable.abc_cab_background_top_material) {
            layerDrawableM4923p = new LayerDrawable(new Drawable[]{m176d(context, R$drawable.abc_cab_background_internal_bg), m176d(context, R$drawable.abc_cab_background_top_mtrl_alpha)});
        } else if (i == R$drawable.abc_ratingbar_material) {
            layerDrawableM4923p = co7.m4923p(this, context, R$dimen.abc_star_big);
        } else if (i == R$drawable.abc_ratingbar_indicator_material) {
            layerDrawableM4923p = co7.m4923p(this, context, R$dimen.abc_star_medium);
        } else if (i == R$drawable.abc_ratingbar_small_material) {
            layerDrawableM4923p = co7.m4923p(this, context, R$dimen.abc_star_small);
        } else {
            layerDrawableM4923p = null;
        }
        if (layerDrawableM4923p == null) {
            return layerDrawableM4923p;
        }
        layerDrawableM4923p.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM4923p.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableM4923p;
                }
                tk5 tk5Var2 = (tk5) this.f359b.get(context);
                if (tk5Var2 == null) {
                    tk5Var2 = new tk5(obj);
                    this.f359b.put(context, tk5Var2);
                }
                tk5Var2.m22180f(new WeakReference(constantState2), j);
                return layerDrawableM4923p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m176d(Context context, int i) {
        return m177e(context, i, false);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m177e(Context context, int i, boolean z) {
        Drawable drawableM175b;
        try {
            if (!this.f361d) {
                this.f361d = true;
                Drawable drawableM176d = m176d(context, androidx.appcompat.resources.R$drawable.abc_vector_test);
                if (drawableM176d == null || (!(drawableM176d instanceof poa) && !"android.graphics.drawable.VectorDrawable".equals(drawableM176d.getClass().getName()))) {
                    this.f361d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM175b = m175b(context, i);
            if (drawableM175b == null) {
                drawableM175b = context.getDrawable(i);
            }
            if (drawableM175b != null) {
                drawableM175b = m179h(context, i, z, drawableM175b);
            }
            if (drawableM175b != null) {
                wl2.m24046a(drawableM175b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM175b;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized ColorStateList m178g(Context context, int i) {
        ColorStateList colorStateList;
        pe9 pe9Var;
        WeakHashMap weakHashMap = this.f358a;
        ColorStateList colorStateListM4937q = null;
        colorStateList = (weakHashMap == null || (pe9Var = (pe9) weakHashMap.get(context)) == null) ? null : (ColorStateList) pe9Var.m19078b(i);
        if (colorStateList == null) {
            co7 co7Var = this.f362e;
            if (co7Var != null) {
                colorStateListM4937q = co7Var.m4937q(context, i);
            }
            if (colorStateListM4937q != null) {
                m174a(context, i, colorStateListM4937q);
            }
            colorStateList = colorStateListM4937q;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX INFO: renamed from: h */
    public final Drawable m179h(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        boolean z2;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListM178g = m178g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM178g != null) {
            Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListM178g);
            if (this.f362e != null && i == R$drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f362e != null) {
            if (i == R$drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iM18844c = oz9.m18844c(context, R$attr.colorControlNormal);
                PorterDuff.Mode mode2 = C2893cq.f34364b;
                co7.m4925u(drawableFindDrawableByLayerId, iM18844c, mode2);
                co7.m4925u(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), oz9.m18844c(context, R$attr.colorControlNormal), mode2);
                co7.m4925u(layerDrawable.findDrawableByLayerId(R.id.progress), oz9.m18844c(context, R$attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R$drawable.abc_ratingbar_material || i == R$drawable.abc_ratingbar_indicator_material || i == R$drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iM18843b = oz9.m18843b(context, R$attr.colorControlNormal);
                PorterDuff.Mode mode3 = C2893cq.f34364b;
                co7.m4925u(drawableFindDrawableByLayerId2, iM18843b, mode3);
                co7.m4925u(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), oz9.m18844c(context, R$attr.colorControlActivated), mode3);
                co7.m4925u(layerDrawable2.findDrawableByLayerId(R.id.progress), oz9.m18844c(context, R$attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        co7 co7Var = this.f362e;
        boolean z3 = false;
        if (co7Var != null) {
            PorterDuff.Mode mode4 = C2893cq.f34364b;
            if (co7.m4919i((int[]) co7Var.f10359b, i)) {
                i2 = R$attr.colorControlNormal;
            } else if (co7.m4919i((int[]) co7Var.f10361d, i)) {
                i2 = R$attr.colorControlActivated;
            } else {
                if (co7.m4919i((int[]) co7Var.f10362e, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i == R$drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                        z2 = true;
                    } else {
                        if (i != R$drawable.abc_dialog_material_background) {
                            i2 = 0;
                            z2 = false;
                        }
                        iRound = -1;
                    }
                    if (z2) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C2893cq.m9844c(oz9.m18844c(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z3 = true;
                    }
                }
                i2 = 16842801;
            }
            z2 = true;
            iRound = -1;
            if (z2) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C2893cq.m9844c(oz9.m18844c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
