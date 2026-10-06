package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlt extends mkv {
    /* JADX INFO: renamed from: ap */
    private static float m16609ap(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    /* JADX INFO: renamed from: aq */
    private static float m16610aq(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    @Override // p000.mkv
    /* JADX INFO: renamed from: g */
    public final void mo16562g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fM16610aq;
        float fM16609ap;
        RectF rectFF = m16542f(tabLayout, view);
        RectF rectFF2 = m16542f(tabLayout, view2);
        if (rectFF.left < rectFF2.left) {
            fM16610aq = m16609ap(f);
            fM16609ap = m16610aq(f);
        } else {
            fM16610aq = m16610aq(f);
            fM16609ap = m16609ap(f);
        }
        drawable.setBounds(mfs.m16341b((int) rectFF.left, (int) rectFF2.left, fM16610aq), drawable.getBounds().top, mfs.m16341b((int) rectFF.right, (int) rectFF2.right, fM16609ap), drawable.getBounds().bottom);
    }
}
