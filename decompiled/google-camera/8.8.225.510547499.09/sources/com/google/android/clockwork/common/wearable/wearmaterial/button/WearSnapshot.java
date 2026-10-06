package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WearSnapshot {

    /* JADX INFO: renamed from: b */
    private static final Rect f7455b = new Rect();

    /* JADX INFO: renamed from: a */
    public final BitmapDrawable f7456a;

    /* JADX INFO: renamed from: c */
    private final View f7457c;

    public WearSnapshot(BitmapDrawable bitmapDrawable, View view) {
        this.f7457c = view;
        this.f7456a = bitmapDrawable;
    }

    /* JADX INFO: renamed from: a */
    public final ViewOverlay m4600a() {
        return ((View) this.f7457c.getParent()).getOverlay();
    }

    /* JADX INFO: renamed from: b */
    public final void m4601b() {
        m4600a().remove(this.f7456a);
    }

    public int getAlpha() {
        return this.f7456a.getAlpha();
    }

    public void setAlpha(int i) {
        this.f7456a.setAlpha(i);
        Rect rect = f7455b;
        this.f7457c.getHitRect(rect);
        int i2 = rect.top;
        int iWidth = rect.left;
        int i3 = rect.right;
        this.f7456a.copyBounds(rect);
        if (this.f7457c.getLayoutDirection() == 1) {
            iWidth = i3 - rect.width();
        }
        rect.offsetTo(iWidth, i2);
        this.f7456a.setBounds(rect);
    }
}
