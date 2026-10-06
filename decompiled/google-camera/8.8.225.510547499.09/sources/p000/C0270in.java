package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: in */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0270in implements InterfaceC0832mr {

    /* JADX INFO: renamed from: a */
    public final int[] f31570a = {C0100R.drawable.abc_textfield_search_default_mtrl_alpha, C0100R.drawable.abc_textfield_default_mtrl_alpha, C0100R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* JADX INFO: renamed from: b */
    public final int[] f31571b = {C0100R.drawable.abc_ic_commit_search_api_mtrl_alpha, C0100R.drawable.abc_seekbar_tick_mark_material, C0100R.drawable.abc_ic_menu_share_mtrl_alpha, C0100R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C0100R.drawable.abc_ic_menu_cut_mtrl_alpha, C0100R.drawable.abc_ic_menu_selectall_mtrl_alpha, C0100R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* JADX INFO: renamed from: c */
    public final int[] f31572c = {C0100R.drawable.abc_textfield_activated_mtrl_alpha, C0100R.drawable.abc_textfield_search_activated_mtrl_alpha, C0100R.drawable.abc_cab_background_top_mtrl_alpha, C0100R.drawable.abc_text_cursor_material, C0100R.drawable.abc_text_select_handle_left_mtrl, C0100R.drawable.abc_text_select_handle_middle_mtrl, C0100R.drawable.abc_text_select_handle_right_mtrl};

    /* JADX INFO: renamed from: d */
    public final int[] f31573d = {C0100R.drawable.abc_popup_background_mtrl_mult, C0100R.drawable.abc_cab_background_internal_bg, C0100R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* JADX INFO: renamed from: e */
    public final int[] f31574e = {C0100R.drawable.abc_tab_indicator_material, C0100R.drawable.abc_textfield_search_material};

    /* JADX INFO: renamed from: f */
    public final int[] f31575f = {C0100R.drawable.abc_btn_check_material, C0100R.drawable.abc_btn_radio_material, C0100R.drawable.abc_btn_check_material_anim, C0100R.drawable.abc_btn_radio_material_anim};

    /* JADX INFO: renamed from: a */
    public static final boolean m11502a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final ColorStateList m11503b(Context context, int i) {
        int iM17433b = C0847nf.m17433b(context, C0100R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{C0847nf.f42161a, C0847nf.f42163c, C0847nf.f42162b, C0847nf.f42165e}, new int[]{C0847nf.m17432a(context, C0100R.attr.colorButtonNormal), acp.m211c(iM17433b, i), acp.m211c(iM17433b, i), i});
    }

    /* JADX INFO: renamed from: c */
    public static final LayerDrawable m11504c(C0833ms c0833ms, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM16842c = c0833ms.m16842c(context, C0100R.drawable.abc_star_black_48dp);
        Drawable drawableM16842c2 = c0833ms.m16842c(context, C0100R.drawable.abc_star_half_black_48dp);
        if ((drawableM16842c instanceof BitmapDrawable) && drawableM16842c.getIntrinsicWidth() == dimensionPixelSize && drawableM16842c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM16842c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM16842c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM16842c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM16842c2 instanceof BitmapDrawable) && drawableM16842c2.getIntrinsicWidth() == dimensionPixelSize && drawableM16842c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM16842c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM16842c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM16842c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: d */
    public static final void m11505d(Drawable drawable, int i, PorterDuff.Mode mode) {
        Rect rect = C0768kh.f36003a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0271io.f31622a;
        }
        drawableMutate.setColorFilter(C0271io.m11551b(i, mode));
    }
}
