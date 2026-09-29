package p222kd;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C3080a;
import com.google.android.material.tabs.TabLayout;
import p177ic.C6308a;

/* JADX INFO: renamed from: kd.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6661b extends C3080a {
    @Override // com.google.android.material.tabs.C3080a
    /* JADX INFO: renamed from: b */
    public final void mo8880b(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        if (f3 >= 0.5f) {
            view = view2;
        }
        RectF rectFM8879a = C3080a.m8879a(tabLayout, view);
        float fM12936a = f3 < 0.5f ? C6308a.m12936a(1.0f, 0.0f, 0.0f, 0.5f, f3) : C6308a.m12936a(0.0f, 1.0f, 0.5f, 1.0f, f3);
        drawable.setBounds((int) rectFM8879a.left, drawable.getBounds().top, (int) rectFM8879a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fM12936a * 255.0f));
    }
}
