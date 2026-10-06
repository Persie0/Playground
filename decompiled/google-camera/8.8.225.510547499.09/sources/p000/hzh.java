package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzh extends hzs {
    public hzh(hzp hzpVar, C1190zy c1190zy, Resources resources) {
        super(hzpVar, c1190zy, resources);
    }

    /* JADX INFO: renamed from: A */
    private final Size m10910A() {
        return this.f30087h == null ? new Size(0, 0) : new Size(this.f30087h.getWidth(), this.f30087h.getHeight() / 2);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: a */
    public final void mo10890a(View view) {
        if (this.f30087h == null) {
            return;
        }
        m10953u(view.getId(), this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_width), this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_bottom_bar_height), C0100R.id.mode_switcher, this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_bottom_bar_mode_switcher_offset));
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: b */
    public final void mo10891b(View view) {
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: d */
    public final void mo10893d(View view) {
        mo10895f(view);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: e */
    public final void mo10894e(View view) {
        if (this.f30087h == null) {
            return;
        }
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_slider_width);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_mode_slider_height);
        int dimensionPixelSize3 = this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_mode_slider_bottom_bar_offset);
        if (hzk.m10915c(this.f30084e, view.getContext())) {
            m10953u(view.getId(), dimensionPixelSize, dimensionPixelSize2, C0100R.id.bottom_bar, dimensionPixelSize3);
        }
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: f */
    public final void mo10895f(View view) {
        if (this.f30087h == null) {
            return;
        }
        int id = view.getId();
        this.f30082c.m19824i(id, this.f30083d.getDimensionPixelSize(C0100R.dimen.jarvis_mode_switcher_height));
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
        int dimensionPixelSize2 = (this.f30083d.getDimensionPixelSize(C0100R.dimen.jarvis_mode_switcher_height) / 2) - this.f30083d.getDimensionPixelSize(C0100R.dimen.tab_more_modes_mode_switcher_margin);
        this.f30082c.m19825j(id, dimensionPixelSize);
        this.f30082c.m19824i(id, 0);
        this.f30082c.m19823h(id, 4, C0100R.id.mode_switcher, 3, -dimensionPixelSize2);
        this.f30082c.m19823h(id, 3, 0, 3, m10910A().getHeight());
        m10951s(id, C0100R.id.mode_switcher, 0, 0);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: h */
    public final void mo10897h(View view) {
        if (this.f30087h == null) {
            return;
        }
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.jarvis_options_container_left_margin);
        int dimensionPixelSize2 = this.f30083d.getDimensionPixelSize(C0100R.dimen.jarvis_options_container_top_margin);
        m10955w(view.getId(), dimensionPixelSize, dimensionPixelSize, m10910A().getHeight() + dimensionPixelSize2, dimensionPixelSize2);
        view.bringToFront();
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
        Size sizeM10910A = m10910A();
        int dimensionPixelSize = this.f30083d.getDimensionPixelSize(C0100R.dimen.jarvis_preview_widgets_side_margins);
        m10954v(view.getId(), sizeM10910A.getWidth() - (dimensionPixelSize + dimensionPixelSize), sizeM10910A.getHeight(), dimensionPixelSize, sizeM10910A.getHeight());
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: l */
    public final void mo10901l(View view) {
        mo10904o(view);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: m */
    public final void mo10902m(View view) {
        if (this.f30087h == null) {
            return;
        }
        m10953u(view.getId(), this.f30083d.getDimensionPixelSize(C0100R.dimen.timer_widget_width), this.f30083d.getDimensionPixelSize(C0100R.dimen.timer_widget_height), C0100R.id.zoom_slider_area, this.f30083d.getDimensionPixelSize(C0100R.dimen.timer_widget_zoom_ui_offset));
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: n */
    public final void mo10903n(View view) {
        mo10904o(view);
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
        int dimensionPixelSize3 = this.f30083d.getDimensionPixelSize(C0100R.dimen.unfolded_zoom_ui_bottom_bar_offset);
        m10953u(view.getId(), dimensionPixelSize, dimensionPixelSize2, C0100R.id.bottom_bar, hzk.m10915c(this.f30084e, view.getContext()) ? dimensionPixelSize3 + this.f30083d.getDimensionPixelSize(C0100R.dimen.mode_slider_offset) : dimensionPixelSize3);
    }

    @Override // p000.hzs
    /* JADX INFO: renamed from: r */
    public final Rect mo10909r(Size size, Size size2) {
        return (size == null || size2 == null) ? new Rect(0, 0, 0, 0) : super.mo10909r(m10910A(), size2);
    }
}
