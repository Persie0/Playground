package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mlu extends mkv {
    @Override // p000.mkv
    /* JADX INFO: renamed from: g */
    public final void mo16562g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFF = m16542f(tabLayout, view);
        float fM16340a = f < 0.5f ? mfs.m16340a(1.0f, 0.0f, 0.0f, 0.5f, f) : mfs.m16340a(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFF.left, drawable.getBounds().top, (int) rectFF.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fM16340a * 255.0f));
    }
}
