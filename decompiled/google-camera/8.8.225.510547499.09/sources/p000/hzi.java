package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzi extends hzs {
    public hzi(hzp hzpVar, C1190zy c1190zy, Resources resources) {
        super(hzpVar, c1190zy, resources);
    }

    /* JADX INFO: renamed from: A */
    private final int m10911A() {
        return ilk.m11427e(this.f30085f) ? this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_mode_switcher_height_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_mode_switcher_height_landscape);
    }

    /* JADX INFO: renamed from: B */
    private final int m10912B() {
        return this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_height) + this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_left_margin);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: a */
    public final void mo10890a(View view) {
        if (this.f30087h == null) {
            return;
        }
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_width);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_height);
        if (!ilk.m11427e(this.f30085f)) {
            m10953u(view.getId(), dimensionPixelSize, dimensionPixelSize2, C0100R.id.mode_switcher, this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_bottom_bar_mode_switcher_offset));
        } else {
            int height = this.f30087h.getHeight() + dimensionPixelSize;
            m10954v(view.getId(), dimensionPixelSize, dimensionPixelSize2, (this.f30087h.getWidth() - dimensionPixelSize2) - this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_bottom_bar_right_margin_portrait), height / 2);
        }
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
        this.f30082c.m19824i(id, m10911A() + this.f30083d.getDimensionPixelSize(C0100R.dimen.gesture_nav_offset));
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
            if (ilk.m11427e(this.f30085f)) {
                m10953u(view.getId(), dimensionPixelSize, dimensionPixelSize2, C0100R.id.mode_switcher, this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_mode_slider_mode_switcher_offset));
            } else {
                m10953u(view.getId(), dimensionPixelSize, dimensionPixelSize2, C0100R.id.bottom_bar, this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_mode_slider_bottom_bar_offset));
            }
        }
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: f */
    public final void mo10895f(View view) {
        if (this.f30087h == null) {
            return;
        }
        int id = view.getId();
        this.f30082c.m19824i(id, m10911A());
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
        int iM10911A = (m10911A() / 2) - this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_more_modes_mode_switcher_margin);
        this.f30082c.m19825j(id, dimensionPixelSize);
        this.f30082c.m19824i(id, 0);
        this.f30082c.m19823h(id, 4, C0100R.id.mode_switcher, 3, -iM10911A);
        this.f30082c.m19822g(id, 3, C0100R.id.viewfinder_frame, 3);
        m10951s(id, C0100R.id.mode_switcher, 0, 0);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: h */
    public final void mo10897h(View view) {
        if (this.f30087h == null) {
            return;
        }
        int id = view.getId();
        int dimensionPixelSize = ilk.m11427e(this.f30085f) ? this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_options_container_top_margin_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_options_container_top_margin_landscape);
        if (!ilk.m11427e(this.f30085f)) {
            int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_options_container_left_margin_landscape);
            int dimensionPixelSize3 = this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_options_container_bottom_offset);
            this.f30082c.m19823h(id, 3, 0, 3, dimensionPixelSize);
            this.f30082c.m19823h(id, 4, C0100R.id.zoom_slider_area, 3, dimensionPixelSize3);
            m10951s(id, 0, dimensionPixelSize2, dimensionPixelSize2);
            m10952t(id);
            return;
        }
        int i = true != hzk.m10915c(this.f30084e, view.getContext()) ? C0100R.id.mode_switcher : C0100R.id.mode_slider_ui;
        int dimensionPixelSize4 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_options_container_zoom_offset);
        int iM10912B = m10912B() + dimensionPixelSize4;
        this.f30082c.m19823h(id, 3, 0, 3, dimensionPixelSize);
        this.f30082c.m19822g(id, 4, i, 3);
        this.f30082c.m19823h(id, 6, C0100R.id.zoom_slider_area, 6, dimensionPixelSize4);
        this.f30082c.m19823h(id, 7, 0, 7, iM10912B);
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
        int dimensionPixelSize = ilk.m11427e(this.f30085f) ? this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_preview_widgets_left_margin_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_preview_widgets_side_margins_landscape);
        int dimensionPixelSize2 = ilk.m11427e(this.f30085f) ? this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_preview_widgets_right_margin_portrait) : dimensionPixelSize;
        int dimensionPixelSize3 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_preview_widgets_height);
        int id = view.getId();
        this.f30082c.m19824i(id, dimensionPixelSize3);
        m10951s(id, 0, dimensionPixelSize, dimensionPixelSize2);
        this.f30082c.m19822g(id, 3, 0, 3);
        this.f30082c.m19822g(id, 4, 0, 4);
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
        int iM10912B = m10912B();
        int iMax = ilk.m11427e(this.f30085f) ? Math.max(rectMo10909r.left, iM10912B) : rectMo10909r.left;
        int iMin = ilk.m11427e(this.f30085f) ? Math.min(rectMo10909r.right, this.f30087h.getWidth() - iM10912B) : rectMo10909r.right;
        int dimensionPixelSize = ilk.m11427e(this.f30085f) ? this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_uncovered_preview_top_margin_portrait) : this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_uncovered_preview_top_margin_landscape);
        int iM10911A = m10911A() + this.f30083d.getDimensionPixelSize(C0100R.dimen.gesture_nav_offset);
        if (!ilk.m11427e(this.f30085f)) {
            iM10911A += this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_bottom_bar_mode_switcher_offset) + this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_height) + this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_zoom_ui_bottom_bar_offset) + this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_height);
        }
        m10955w(view.getId(), iMax, this.f30087h.getWidth() - iMin, dimensionPixelSize, hzk.m10915c(this.f30084e, view.getContext()) ? iM10911A + this.f30083d.getDimensionPixelSize(C0100R.dimen.mode_slider_offset) : iM10911A);
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
        if (this.f30087h == null) {
            return;
        }
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_width);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_height);
        if (ilk.m11427e(this.f30085f)) {
            m10954v(view.getId(), dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2 + this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_zoom_ui_left_margin), (this.f30087h.getHeight() - dimensionPixelSize) / 2);
        } else {
            int dimensionPixelSize3 = this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_zoom_ui_bottom_bar_offset);
            m10953u(view.getId(), dimensionPixelSize, dimensionPixelSize2, C0100R.id.bottom_bar, hzk.m10915c(this.f30084e, view.getContext()) ? dimensionPixelSize3 + this.f30083d.getDimensionPixelSize(C0100R.dimen.mode_slider_offset) : dimensionPixelSize3);
        }
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: r */
    public final Rect mo10909r(Size size, Size size2) {
        Rect rectMo10909r = super.mo10909r(size, size2);
        if (size != null) {
            if (!ilk.m11427e(this.f30085f) && rectMo10909r.height() < size.getHeight()) {
                int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_viewfinder_top_margin_portrait);
                int i = rectMo10909r.top;
                rectMo10909r.top = dimensionPixelSize;
                rectMo10909r.bottom += dimensionPixelSize - i;
            } else if (ilk.m11427e(this.f30085f) && rectMo10909r.width() < size.getWidth() && rectMo10909r.width() >= size.getWidth() / 2) {
                int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_viewfinder_left_margin_landscape);
                int i2 = rectMo10909r.left;
                rectMo10909r.left = dimensionPixelSize2;
                rectMo10909r.right += dimensionPixelSize2 - i2;
            }
        }
        return rectMo10909r;
    }
}
