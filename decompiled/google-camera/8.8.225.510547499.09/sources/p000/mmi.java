package p000;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmi {

    /* JADX INFO: renamed from: a */
    public final TabLayout f41034a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f41035b;

    /* JADX INFO: renamed from: c */
    public AbstractC0806ls f41036c;

    /* JADX INFO: renamed from: d */
    public boolean f41037d;

    /* JADX INFO: renamed from: e */
    public mmg f41038e;

    /* JADX INFO: renamed from: f */
    public mly f41039f;

    /* JADX INFO: renamed from: g */
    public C0158ej f41040g;

    /* JADX INFO: renamed from: h */
    private final mmf f41041h;

    public mmi(TabLayout tabLayout, ViewPager2 viewPager2, mmf mmfVar) {
        this.f41034a = tabLayout;
        this.f41035b = viewPager2;
        this.f41041h = mmfVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m16623a() {
        this.f41034a.m4862g();
        AbstractC0806ls abstractC0806ls = this.f41036c;
        if (abstractC0806ls != null) {
            int iMo1762a = abstractC0806ls.mo1762a();
            for (int i = 0; i < iMo1762a; i++) {
                mmb mmbVarM4859d = this.f41034a.m4859d();
                this.f41041h.mo7607a(mmbVarM4859d, i);
                this.f41034a.m4861f(mmbVarM4859d, false);
            }
            if (iMo1762a > 0) {
                int iMin = Math.min(this.f41035b.f1667b, this.f41034a.m4857b() - 1);
                TabLayout tabLayout = this.f41034a;
                if (iMin != tabLayout.m4856a()) {
                    tabLayout.m4863h(tabLayout.m4858c(iMin));
                }
            }
        }
    }
}
