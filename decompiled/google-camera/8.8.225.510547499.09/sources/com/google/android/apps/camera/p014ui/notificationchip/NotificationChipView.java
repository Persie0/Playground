package com.google.android.apps.camera.p014ui.notificationchip;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0752js;
import p000.hzj;
import p000.ida;
import p000.ilk;
import p000.jdx;
import p000.jpd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NotificationChipView extends C0752js {

    /* JADX INFO: renamed from: a */
    public final Context f7084a;

    /* JADX INFO: renamed from: b */
    public int f7085b;

    /* JADX INFO: renamed from: c */
    public boolean f7086c;

    /* JADX INFO: renamed from: d */
    public ida f7087d;

    /* JADX INFO: renamed from: e */
    public hzj f7088e;

    /* JADX INFO: renamed from: f */
    public long f7089f;

    /* JADX INFO: renamed from: g */
    public Runnable f7090g;

    /* JADX INFO: renamed from: h */
    public final jdx f7091h;

    /* JADX INFO: renamed from: i */
    private FrameLayout.LayoutParams f7092i;

    public NotificationChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7091h = new jdx();
        this.f7084a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m4402a() {
        removeCallbacks(this.f7090g);
    }

    /* JADX INFO: renamed from: b */
    public final void m4403b() {
        FrameLayout.LayoutParams layoutParams;
        if (getDisplay() == null || this.f7092i == null) {
            return;
        }
        ilk ilkVarM11426b = ilk.m11426b(getDisplay(), this.f7084a);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
        Resources resources = this.f7084a.getResources();
        if (jpd.m13431l(this.f7088e)) {
            layoutParams = new FrameLayout.LayoutParams(this.f7092i);
            layoutParams.topMargin = resources.getDimensionPixelSize(C0100R.dimen.notification_chip_layout_top_margin_tab);
        } else if (ilkVarM11426b == ilk.PORTRAIT) {
            int dimensionPixelSize = resources.getDimensionPixelSize(C0100R.dimen.notification_chip_layout_margin_with_options_menu_closed_icon);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.f7092i);
            layoutParams3.topMargin = dimensionPixelSize;
            layoutParams = layoutParams3;
        } else if (ilkVarM11426b == ilk.REVERSE_LANDSCAPE) {
            layoutParams = new FrameLayout.LayoutParams(this.f7092i);
            layoutParams.bottomMargin = this.f7092i.topMargin;
            layoutParams.gravity = 81;
        } else {
            layoutParams = this.f7092i;
        }
        if (layoutParams2.topMargin == layoutParams.topMargin && layoutParams2.bottomMargin == layoutParams.bottomMargin && layoutParams2.gravity == layoutParams.gravity) {
            return;
        }
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m4404c(int i) {
        postDelayed(this.f7090g, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7092i = (FrameLayout.LayoutParams) getLayoutParams();
    }
}
