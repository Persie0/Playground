package com.google.android.apps.camera.legacy.lightcycle.p012ui;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.bbt;
import p000.evu;
import p000.eyo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PhotoSphereMessageOverlay extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f6810a;

    /* JADX INFO: renamed from: b */
    public boolean f6811b;

    /* JADX INFO: renamed from: c */
    private final int[] f6812c;

    public PhotoSphereMessageOverlay(Context context) {
        super(context);
        this.f6810a = false;
        this.f6811b = true;
        this.f6812c = new int[]{C0100R.id.short_info_message, C0100R.id.long_message_overlay, C0100R.id.rotate_device_icon};
    }

    /* JADX INFO: renamed from: a */
    public final void m4201a() {
        post(new evu(this, 4));
    }

    /* JADX INFO: renamed from: b */
    public final void m4202b(int i) {
        int[] iArr = this.f6812c;
        int length = iArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            ((FrameLayout.LayoutParams) findViewById(iArr[i2]).getLayoutParams()).gravity = (i == 180 ? 80 : 48) | 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4203c(int i) {
        post(new bbt(this, i, 18));
    }

    /* JADX INFO: renamed from: d */
    public final void m4204d(boolean z, int i) {
        post(new eyo(this, z, i, 0));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View viewFindViewById = findViewById(C0100R.id.short_info_message);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        int dimension = (int) getResources().getDimension(C0100R.dimen.photosphere_overlay_message_short_layout_width);
        int dimension2 = (int) getResources().getDimension(C0100R.dimen.photosphere_overlay_message_short_layout_height);
        int dimension3 = (int) getResources().getDimension(C0100R.dimen.photosphere_overlay_message_short_layout_marginTop);
        layoutParams.width = dimension;
        layoutParams.height = dimension2;
        layoutParams.setMargins(0, dimension3, 0, 0);
        viewFindViewById.requestLayout();
    }

    public PhotoSphereMessageOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6810a = false;
        this.f6811b = true;
        this.f6812c = new int[]{C0100R.id.short_info_message, C0100R.id.long_message_overlay, C0100R.id.rotate_device_icon};
    }
}
