package p000;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.material.R$attr;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ir5 {

    /* JADX INFO: renamed from: a */
    public final PathInterpolator f44454a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b */
    public final View f44455b;

    /* JADX INFO: renamed from: c */
    public final int f44456c;

    /* JADX INFO: renamed from: d */
    public final int f44457d;

    /* JADX INFO: renamed from: e */
    public final int f44458e;

    /* JADX INFO: renamed from: f */
    public u60 f44459f;

    public ir5(View view) {
        this.f44455b = view;
        Context context = view.getContext();
        this.f44456c = r46.m20364G(context, R$attr.motionDurationMedium2, 300);
        this.f44457d = r46.m20364G(context, R$attr.motionDurationShort3, 150);
        this.f44458e = r46.m20364G(context, R$attr.motionDurationShort2, 100);
    }
}
