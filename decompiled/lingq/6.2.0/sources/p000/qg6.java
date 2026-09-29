package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;

/* JADX INFO: loaded from: classes2.dex */
public final class qg6 extends FrameLayout implements ng6 {

    /* JADX INFO: renamed from: a */
    public final TextView f57759a;

    /* JADX INFO: renamed from: b */
    public boolean f57760b;

    /* JADX INFO: renamed from: c */
    public boolean f57761c;

    /* JADX INFO: renamed from: d */
    public mw5 f57762d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f57763e;

    public qg6(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R$layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f57759a = (TextView) findViewById(R$id.navigation_menu_subheader_label);
    }

    /* JADX INFO: renamed from: a */
    public final void m19949a() {
        mw5 mw5Var = this.f57762d;
        if (mw5Var != null) {
            setVisibility((!mw5Var.isVisible() || (!this.f57760b && this.f57761c)) ? 8 : 0);
        }
    }

    @Override // p000.hx5
    /* JADX INFO: renamed from: c */
    public final void mo643c(mw5 mw5Var) {
        this.f57762d = mw5Var;
        mw5Var.setCheckable(false);
        this.f57759a.setText(mw5Var.f51946e);
        m19949a();
    }

    @Override // p000.hx5
    public mw5 getItemData() {
        return this.f57762d;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // p000.ng6
    public void setExpanded(boolean z) {
        this.f57760b = z;
        m19949a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // p000.ng6
    public void setOnlyShowWhenExpanded(boolean z) {
        this.f57761c = z;
        m19949a();
    }

    public void setTextAppearance(int i) {
        TextView textView = this.f57759a;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.f57763e;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f57763e = colorStateList;
        if (colorStateList != null) {
            this.f57759a.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
    }
}
