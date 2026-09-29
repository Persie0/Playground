package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R$layout;

/* JADX INFO: loaded from: classes2.dex */
public final class gg6 extends FrameLayout implements ng6 {

    /* JADX INFO: renamed from: a */
    public boolean f40771a;

    /* JADX INFO: renamed from: b */
    public boolean f40772b;

    /* JADX INFO: renamed from: c */
    public boolean f40773c;

    public gg6(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R$layout.m3_navigation_menu_divider, (ViewGroup) this, true);
        m12586a();
    }

    /* JADX INFO: renamed from: a */
    public final void m12586a() {
        setVisibility((!this.f40773c || (!this.f40771a && this.f40772b)) ? 8 : 0);
    }

    @Override // p000.hx5
    /* JADX INFO: renamed from: c */
    public final void mo643c(mw5 mw5Var) {
        m12586a();
    }

    @Override // p000.hx5
    public mw5 getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setDividersEnabled(boolean z) {
        this.f40773c = z;
        m12586a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // p000.ng6
    public void setExpanded(boolean z) {
        this.f40771a = z;
        m12586a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // p000.ng6
    public void setOnlyShowWhenExpanded(boolean z) {
        this.f40772b = z;
        m12586a();
    }

    public void setTitle(CharSequence charSequence) {
    }
}
