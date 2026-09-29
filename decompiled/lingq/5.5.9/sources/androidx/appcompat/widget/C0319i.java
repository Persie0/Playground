package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.linguist.R;
import p254m2.C7472a;
import p312p2.C8169a;

/* JADX INFO: renamed from: androidx.appcompat.widget.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0319i {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f1217b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0319i f1218c;

    /* JADX INFO: renamed from: a */
    public C0339r0 f1219a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.i$a */
    public class a implements C0339r0.b {

        /* JADX INFO: renamed from: a */
        public final int[] f1220a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: b */
        public final int[] f1221b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c */
        public final int[] f1222c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: d */
        public final int[] f1223d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: e */
        public final int[] f1224e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f */
        public final int[] f1225f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        /* JADX INFO: renamed from: a */
        public static boolean m1206a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static ColorStateList m1207b(int i10, Context context) {
            int iM1281c = C0349w0.m1281c(R.attr.colorControlHighlight, context);
            return new ColorStateList(new int[][]{C0349w0.f1367b, C0349w0.f1369d, C0349w0.f1368c, C0349w0.f1371f}, new int[]{C0349w0.m1280b(R.attr.colorButtonNormal, context), C8169a.m16215g(iM1281c, i10), C8169a.m16215g(iM1281c, i10), i10});
        }

        /* JADX INFO: renamed from: c */
        public static LayerDrawable m1208c(C0339r0 c0339r0, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableM1261e = c0339r0.m1261e(context, R.drawable.abc_star_black_48dp);
            Drawable drawableM1261e2 = c0339r0.m1261e(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableM1261e instanceof BitmapDrawable) && drawableM1261e.getIntrinsicWidth() == dimensionPixelSize && drawableM1261e.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM1261e;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM1261e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM1261e.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM1261e2 instanceof BitmapDrawable) && drawableM1261e2.getIntrinsicWidth() == dimensionPixelSize && drawableM1261e2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM1261e2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM1261e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM1261e2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: e */
        public static void m1209e(Drawable drawable, int i10, PorterDuff.Mode mode) {
            int[] iArr = C0311f0.f1174a;
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C0319i.f1217b;
            }
            drawableMutate.setColorFilter(C0319i.m1202c(i10, mode));
        }

        /* JADX INFO: renamed from: d */
        public final ColorStateList m1210d(int i10, Context context) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return C7472a.m14842b(R.color.abc_tint_edittext, context);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return C7472a.m14842b(R.color.abc_tint_switch_track, context);
            }
            if (i10 != R.drawable.abc_switch_thumb_material) {
                if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                    return m1207b(C0349w0.m1281c(R.attr.colorButtonNormal, context), context);
                }
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return m1207b(0, context);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return m1207b(C0349w0.m1281c(R.attr.colorAccent, context), context);
                }
                if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                    return C7472a.m14842b(R.color.abc_tint_spinner, context);
                }
                if (m1206a(this.f1221b, i10)) {
                    return C0349w0.m1282d(R.attr.colorControlNormal, context);
                }
                if (m1206a(this.f1224e, i10)) {
                    return C7472a.m14842b(R.color.abc_tint_default, context);
                }
                if (m1206a(this.f1225f, i10)) {
                    return C7472a.m14842b(R.color.abc_tint_btn_checkable, context);
                }
                if (i10 == R.drawable.abc_seekbar_thumb_material) {
                    return C7472a.m14842b(R.color.abc_tint_seek_thumb, context);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListM1282d = C0349w0.m1282d(R.attr.colorSwitchThumbNormal, context);
            if (colorStateListM1282d == null || !colorStateListM1282d.isStateful()) {
                iArr[0] = C0349w0.f1367b;
                iArr2[0] = C0349w0.m1280b(R.attr.colorSwitchThumbNormal, context);
                iArr[1] = C0349w0.f1370e;
                iArr2[1] = C0349w0.m1281c(R.attr.colorControlActivated, context);
                iArr[2] = C0349w0.f1371f;
                iArr2[2] = C0349w0.m1281c(R.attr.colorSwitchThumbNormal, context);
            } else {
                int[] iArr3 = C0349w0.f1367b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM1282d.getColorForState(iArr3, 0);
                iArr[1] = C0349w0.f1370e;
                iArr2[1] = C0349w0.m1281c(R.attr.colorControlActivated, context);
                iArr[2] = C0349w0.f1371f;
                iArr2[2] = colorStateListM1282d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0319i m1201a() {
        try {
            if (f1218c == null) {
                m1203d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1218c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m1202c(int i10, PorterDuff.Mode mode) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return C0339r0.m1257g(i10, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m1203d() {
        try {
            if (f1218c == null) {
                C0319i c0319i = new C0319i();
                f1218c = c0319i;
                c0319i.f1219a = C0339r0.m1256c();
                C0339r0 c0339r0 = f1218c.f1219a;
                a aVar = new a();
                synchronized (c0339r0) {
                    try {
                        c0339r0.f1327e = aVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1204e(Drawable drawable, C0355z0 c0355z0, int[] iArr) {
        PorterDuff.Mode mode = C0339r0.f1320f;
        int[] state = drawable.getState();
        int[] iArr2 = C0311f0.f1174a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = c0355z0.f1410d;
        if (!z10 && !c0355z0.f1409c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM1257g = null;
        ColorStateList colorStateList = z10 ? c0355z0.f1407a : null;
        PorterDuff.Mode mode2 = c0355z0.f1409c ? c0355z0.f1408b : C0339r0.f1320f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM1257g = C0339r0.m1257g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM1257g);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m1205b(Context context, int i10) {
        return this.f1219a.m1261e(context, i10);
    }
}
