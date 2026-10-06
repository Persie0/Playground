package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzg extends hzs {

    /* JADX INFO: renamed from: i */
    private final Integer f30010i;

    public hzg(hzp hzpVar, C1190zy c1190zy, Resources resources) {
        super(hzpVar, c1190zy, resources);
        this.f30010i = hzpVar.f30074a.f30069e;
    }

    /* JADX INFO: renamed from: A */
    private final int m10907A() {
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_height);
        return m10908B() ? dimensionPixelSize + this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_left_margin_portrait) : dimensionPixelSize + this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_left_margin);
    }

    /* JADX INFO: renamed from: B */
    private final boolean m10908B() {
        if (this.f30010i == null) {
            return ilk.m11427e(this.f30085f);
        }
        if (ilk.m11427e(this.f30085f)) {
            return this.f30010i.intValue() == 90 || this.f30010i.intValue() == 270;
        }
        return this.f30010i.intValue() == 0 || this.f30010i.intValue() == 180;
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: a */
    public final void mo10890a(View view) {
        int height;
        if (this.f30087h == null) {
            return;
        }
        int dimensionPixelSize = m10908B() ? this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_right_margin_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_right_margin_landscape);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_width);
        int dimensionPixelSize3 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_height);
        int width = this.f30087h.getWidth() - dimensionPixelSize3;
        if (m10908B()) {
            int height2 = (this.f30087h.getHeight() - dimensionPixelSize2) / 3;
            height = height2 + height2 + dimensionPixelSize2;
        } else {
            height = (this.f30087h.getHeight() + dimensionPixelSize2) / 2;
        }
        m10954v(view.getId(), dimensionPixelSize2, dimensionPixelSize3, width - dimensionPixelSize, height);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: b */
    public final void mo10891b(View view) {
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: d */
    public final void mo10893d(View view) {
        if (this.f30087h == null) {
            return;
        }
        int id = view.getId();
        this.f30082c.m19824i(id, this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_switcher_height) + this.f30083d.getDimensionPixelSize(C0100R.dimen.gesture_nav_offset));
        this.f30082c.m19825j(id, 0);
        this.f30082c.m19822g(id, 4, 0, 4);
        m10951s(id, 0, 0, 0);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: e */
    public final void mo10894e(View view) {
        if (this.f30087h == null) {
            return;
        }
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_slider_width);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_slider_height);
        if (hzk.m10915c(this.f30084e, view.getContext())) {
            m10953u(view.getId(), dimensionPixelSize, dimensionPixelSize2, C0100R.id.mode_switcher, this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_slider_mode_switcher_offset));
        }
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: f */
    public final void mo10895f(View view) {
        if (this.f30087h == null) {
            return;
        }
        int id = view.getId();
        this.f30082c.m19824i(id, this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_switcher_height));
        this.f30082c.m19825j(id, 0);
        this.f30082c.m19823h(id, 4, 0, 4, this.f30083d.getDimensionPixelSize(C0100R.dimen.gesture_nav_offset));
        m10951s(id, 0, 0, 0);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: g */
    public final void mo10896g(View view) {
        if (this.f30087h == null) {
            return;
        }
        int id = view.getId();
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_more_modes_width);
        int dimensionPixelSize2 = (this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_switcher_height) / 2) - this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_more_modes_mode_switcher_margin);
        this.f30082c.m19825j(id, dimensionPixelSize);
        this.f30082c.m19824i(id, 0);
        this.f30082c.m19823h(id, 4, C0100R.id.mode_switcher, 3, -dimensionPixelSize2);
        this.f30082c.m19822g(id, 3, C0100R.id.viewfinder_frame, 3);
        m10951s(id, C0100R.id.mode_switcher, 0, 0);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: h */
    public final void mo10897h(View view) {
        if (this.f30087h == null) {
            return;
        }
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_options_container_zoom_offset);
        int dimensionPixelSize2 = m10908B() ? this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_options_container_top_margin_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_options_container_top_margin_landscape);
        int dimensionPixelSize3 = m10908B() ? this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_options_container_bottom_margin_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_options_container_bottom_margin_landscape);
        int iM10907A = m10908B() ? m10907A() + dimensionPixelSize : this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_options_container_right_margin_landscape);
        int id = view.getId();
        this.f30082c.m19823h(id, 6, C0100R.id.zoom_slider_area, 6, dimensionPixelSize);
        this.f30082c.m19823h(id, 7, 0, 7, iM10907A);
        m10958z(id, dimensionPixelSize2, dimensionPixelSize3);
        m10952t(id);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: i */
    public final void mo10898i(View view) {
        mo10904o(view);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: j */
    public final void mo10899j(View view) {
        mo10904o(view);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: k */
    public final void mo10900k(View view) {
        if (this.f30087h == null || this.f30086g == null) {
            return;
        }
        int dimensionPixelSize = m10908B() ? this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_preview_widgets_side_margins_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_preview_widgets_side_margins_landscape);
        int width = this.f30087h.getWidth() - (dimensionPixelSize + dimensionPixelSize);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_preview_widgets_height);
        m10954v(view.getId(), width, dimensionPixelSize2, dimensionPixelSize, m10908B() ? this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_preview_widgets_top_margin_portrait) : (this.f30087h.getHeight() - dimensionPixelSize2) / 2);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: l */
    public final void mo10901l(View view) {
        mo10903n(view);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: m */
    public final void mo10902m(View view) {
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: n */
    public final void mo10903n(View view) {
        Size size;
        Size size2 = this.f30087h;
        if (size2 == null || (size = this.f30086g) == null) {
            return;
        }
        Rect rectMo10909r = mo10909r(size2, size);
        int iM10907A = m10907A();
        int iMax = Math.max(rectMo10909r.left, iM10907A);
        int iMin = Math.min(rectMo10909r.right, this.f30087h.getWidth() - iM10907A);
        int dimensionPixelSize = m10908B() ? this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_uncovered_preview_top_margin_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_uncovered_preview_top_margin_landscape);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_switcher_height);
        m10955w(view.getId(), iMax, this.f30087h.getWidth() - iMin, dimensionPixelSize, hzk.m10915c(this.f30084e, view.getContext()) ? dimensionPixelSize2 + this.f30083d.getDimensionPixelSize(C0100R.dimen.mode_slider_offset) : dimensionPixelSize2);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: o */
    public final void mo10904o(View view) {
        Size size;
        Size size2 = this.f30087h;
        if (size2 == null || (size = this.f30086g) == null) {
            return;
        }
        Rect rectMo10909r = mo10909r(size2, size);
        m10954v(view.getId(), rectMo10909r.width(), rectMo10909r.height(), rectMo10909r.left, rectMo10909r.top);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: p */
    public final void mo10905p(View view) {
        mo10904o(view);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: q */
    public final void mo10906q(View view) {
        int height;
        if (this.f30087h == null) {
            return;
        }
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_width);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_height);
        int dimensionPixelSize3 = dimensionPixelSize2 + (m10908B() ? this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_left_margin_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_left_margin));
        if (m10908B()) {
            int height2 = (this.f30087h.getHeight() - dimensionPixelSize) / 3;
            height = height2 + height2;
        } else {
            height = (this.f30087h.getHeight() - dimensionPixelSize) / 2;
        }
        m10954v(view.getId(), dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, height);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: r */
    public final Rect mo10909r(Size size, Size size2) {
        Rect rectMo10909r = super.mo10909r(size, size2);
        int dimensionPixelSize = (!m10908B() || rectMo10909r.top == 0) ? rectMo10909r.top : rectMo10909r.top + this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_viewfinder_additional_offset);
        return new Rect(rectMo10909r.left, dimensionPixelSize, rectMo10909r.right, rectMo10909r.height() + dimensionPixelSize);
    }
}
