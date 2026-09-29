package p222kd;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C3080a;
import com.google.android.material.tabs.TabLayout;
import p177ic.C6308a;

/* JADX INFO: renamed from: kd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6660a extends C3080a {
    @Override // com.google.android.material.tabs.C3080a
    /* JADX INFO: renamed from: b */
    public final void mo8880b(TabLayout tabLayout, View view, View view2, float f3, Drawable drawable) {
        float fCos;
        float fCos2;
        RectF rectFM8879a = C3080a.m8879a(tabLayout, view);
        RectF rectFM8879a2 = C3080a.m8879a(tabLayout, view2);
        if (rectFM8879a.left < rectFM8879a2.left) {
            double d10 = (((double) f3) * 3.141592653589793d) / 2.0d;
            fCos2 = (float) (1.0d - Math.cos(d10));
            fCos = (float) Math.sin(d10);
        } else {
            double d11 = (((double) f3) * 3.141592653589793d) / 2.0d;
            float fSin = (float) Math.sin(d11);
            fCos = (float) (1.0d - Math.cos(d11));
            fCos2 = fSin;
        }
        drawable.setBounds(C6308a.m12937b(fCos2, (int) rectFM8879a.left, (int) rectFM8879a2.left), drawable.getBounds().top, C6308a.m12937b(fCos, (int) rectFM8879a.right, (int) rectFM8879a2.right), drawable.getBounds().bottom);
    }
}
