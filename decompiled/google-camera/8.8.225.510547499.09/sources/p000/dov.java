package p000;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dov extends ImageView {

    /* JADX INFO: renamed from: a */
    public final AccessibilityManager f12162a;

    /* JADX INFO: renamed from: b */
    public final int f12163b;

    /* JADX INFO: renamed from: c */
    public final int f12164c;

    /* JADX INFO: renamed from: d */
    public float f12165d;

    /* JADX INFO: renamed from: e */
    public float f12166e;

    /* JADX INFO: renamed from: f */
    public float f12167f;

    public dov(Context context) {
        super(context);
        this.f12162a = (AccessibilityManager) context.getSystemService("accessibility");
        this.f12163b = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_icon_size);
        this.f12164c = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_knob_size);
    }

    /* JADX INFO: renamed from: a */
    public final void m6464a(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.f12165d = f;
            return;
        }
        throw new IllegalArgumentException("Illegal fraction: " + f);
    }
}
