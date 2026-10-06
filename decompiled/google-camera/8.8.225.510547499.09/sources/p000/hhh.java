package p000;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import p021j$.time.Duration;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhh extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final Duration f27806a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f27807b;

    /* JADX INFO: renamed from: c */
    public final View f27808c;

    /* JADX INFO: renamed from: d */
    public GradientDrawable f27809d;

    /* JADX INFO: renamed from: e */
    public hhc f27810e;

    /* JADX INFO: renamed from: f */
    public int f27811f;

    /* JADX INFO: renamed from: g */
    public final jfs f27812g;

    /* JADX INFO: renamed from: h */
    private final boolean f27813h;

    /* JADX WARN: Multi-variable type inference failed */
    public hhh(Context context, boolean z) {
        super(context);
        this.f27811f = 1;
        this.f27813h = z;
        this.f27806a = Duration.ofMillis(context.getResources().getInteger(C0100R.integer.social_anim_duration_default));
        this.f27807b = new ArrayList();
        this.f27812g = new jfs((char[]) null, (byte[]) null);
        if (!(context instanceof cdp) || !((cdp) context).mo3499a().mo6184l(dib.f11324be)) {
            this.f27808c = null;
            return;
        }
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0100R.dimen.social_drawer_divider_margin);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(resources.getDimensionPixelSize(C0100R.dimen.social_drawer_divider_width), resources.getDimensionPixelSize(C0100R.dimen.social_drawer_divider_height));
        layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        layoutParams.gravity = 1;
        View view = new View(context);
        this.f27808c = view;
        view.setBackgroundResource(R.color.white);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final int m10290a(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    /* JADX INFO: renamed from: b */
    public final int m10291b() {
        return m10290a(C0100R.dimen.rounded_thumbnail_diameter);
    }

    /* JADX INFO: renamed from: c */
    public final int m10292c() {
        return m10290a(C0100R.dimen.social_share_outcrop_main_item_height) + m10290a(C0100R.dimen.social_share_outcrop_menu_item_height) + m10290a(C0100R.dimen.social_share_menu_bottom_padding) + m10290a(C0100R.dimen.social_share_outcrop_main_item_bottom_margin);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public final Animator m10293d() {
        setAlpha(1.0f);
        m10297h(1);
        if (this.f27813h) {
            jfs jfsVar = this.f27812g;
            jvd.m13538a();
            ?? r1 = jfsVar.f33914a;
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                hhd hhdVar = (hhd) r1.get(i);
                if (hhdVar != null) {
                    hhdVar.mo10288d();
                }
            }
        } else {
            jfs jfsVar2 = this.f27812g;
            jvd.m13538a();
            ?? r2 = jfsVar2.f33914a;
            int size2 = r2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hhd hhdVar2 = (hhd) r2.get(i2);
                if (hhdVar2 != null) {
                    hhdVar2.mo10286b();
                }
            }
        }
        int[] iArr = new int[2];
        iArr[0] = 0;
        iArr[1] = this.f27813h ? m10290a(C0100R.dimen.social_share_outcrop_main_item_height) + (m10290a(C0100R.dimen.rounded_thumbnail_diameter) / 2) : m10292c();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.setDuration(this.f27806a.toMillis());
        valueAnimatorOfInt.addListener(jvh.m13545C(new gyc(this, 12)));
        valueAnimatorOfInt.addListener(jvh.m13544B(new gyc(this, 13)));
        valueAnimatorOfInt.addUpdateListener(new afx(this, 16));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: e */
    public final void m10294e(int i) {
        hhc hhcVar = this.f27810e;
        if (hhcVar != null) {
            removeView(hhcVar);
            addView(this.f27810e, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10295f(boolean z) {
        hhc hhcVar = this.f27810e;
        if (hhcVar != null) {
            hhcVar.setEnabled(z);
        }
        Collection$EL.stream(this.f27807b).forEachOrdered(new hhf(z, 0));
    }

    /* JADX INFO: renamed from: g */
    public final void m10296g(mrm mrmVar) {
        Collection$EL.stream(this.f27807b).forEachOrdered(new gyc(mrmVar, 14));
    }

    /* JADX INFO: renamed from: h */
    public final void m10297h(int i) {
        int iM10290a = m10290a(C0100R.dimen.social_share_menu_radius);
        this.f27811f = i;
        if (i == 1) {
            float f = iM10290a;
            this.f27809d.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        } else {
            float f2 = iM10290a;
            this.f27809d.setCornerRadii(new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        }
    }
}
