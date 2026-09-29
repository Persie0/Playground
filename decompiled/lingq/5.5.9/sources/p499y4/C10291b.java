package p499y4;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import p471x2.C10029b0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;

/* JADX INFO: renamed from: y4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10291b implements InterfaceC10060r {

    /* JADX INFO: renamed from: a */
    public final Rect f51779a = new Rect();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPager f51780b;

    public C10291b(ViewPager viewPager) {
        this.f51780b = viewPager;
    }

    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        C10063s0 c10063s0M18653i = C10029b0.m18653i(view, c10063s0);
        if (c10063s0M18653i.f51077a.mo18896m()) {
            return c10063s0M18653i;
        }
        int iM18866c = c10063s0M18653i.m18866c();
        Rect rect = this.f51779a;
        rect.left = iM18866c;
        rect.top = c10063s0M18653i.m18868e();
        rect.right = c10063s0M18653i.m18867d();
        rect.bottom = c10063s0M18653i.m18865b();
        ViewPager viewPager = this.f51780b;
        int childCount = viewPager.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C10063s0 c10063s0M18646b = C10029b0.m18646b(viewPager.getChildAt(i10), c10063s0M18653i);
            rect.left = Math.min(c10063s0M18646b.m18866c(), rect.left);
            rect.top = Math.min(c10063s0M18646b.m18868e(), rect.top);
            rect.right = Math.min(c10063s0M18646b.m18867d(), rect.right);
            rect.bottom = Math.min(c10063s0M18646b.m18865b(), rect.bottom);
        }
        return c10063s0M18653i.m18869g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
