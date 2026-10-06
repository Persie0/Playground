package p000;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class hsw {

    /* JADX INFO: renamed from: f */
    public final hst f29465f;

    /* JADX INFO: renamed from: g */
    protected final Context f29466g;

    /* JADX INFO: renamed from: h */
    public hsv f29467h;

    protected hsw(Context context, hst hstVar) {
        this.f29466g = context;
        this.f29465f = hstVar;
    }

    /* JADX INFO: renamed from: c */
    protected final View m10720c() {
        return View.inflate(this.f29466g, C0100R.layout.submode_bottom_sheet, null);
    }

    /* JADX INFO: renamed from: d */
    protected final ViewPager2 m10721d(View view, List list, int i, mly mlyVar, mmf mmfVar) {
        Context context = this.f29466g;
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(C0100R.id.viewpager2);
        hsv hsvVar = new hsv(list, i);
        viewPager2.getClass();
        AbstractC0806ls abstractC0806ls = viewPager2.f1670e.f1123m;
        ath athVar = viewPager2.f1675j;
        if (abstractC0806ls != null) {
            abstractC0806ls.m15927i(((auq) athVar).f2431b);
        }
        if (abstractC0806ls != null) {
            abstractC0806ls.m15927i(viewPager2.f1674i);
        }
        viewPager2.f1670e.mo1226Y(hsvVar);
        viewPager2.f1667b = 0;
        viewPager2.m1560c();
        auq auqVar = (auq) viewPager2.f1675j;
        auqVar.m2045f();
        hsvVar.m15926h(auqVar.f2431b);
        hsvVar.m15926h(viewPager2.f1674i);
        this.f29467h = hsvVar;
        for (int i2 = 0; i2 < viewPager2.getChildCount(); i2++) {
            View childAt = viewPager2.getChildAt(i2);
            if (childAt instanceof RecyclerView) {
                ((RecyclerView) childAt).setNestedScrollingEnabled(false);
                break;
            }
        }
        if (i > 1) {
            viewPager2.f1672g = false;
            ((auq) viewPager2.f1675j).m2045f();
        }
        TabLayout tabLayout = (TabLayout) view.findViewById(C0100R.id.tablayout);
        tabLayout.getClass();
        ((GradientDrawable) tabLayout.getBackground()).setTint(kxk.m15009b(C0100R.dimen.gm3_sys_elevation_level2, context));
        if (mlyVar != null) {
            tabLayout.m4860e(mlyVar);
        }
        mmi mmiVar = new mmi(tabLayout, viewPager2, mmfVar);
        if (mmiVar.f41037d) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        mmiVar.f41036c = mmiVar.f41035b.m1559b();
        if (mmiVar.f41036c == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        mmiVar.f41037d = true;
        mmiVar.f41038e = new mmg(mmiVar.f41034a);
        ViewPager2 viewPager3 = mmiVar.f41035b;
        viewPager3.f1666a.m2029d(mmiVar.f41038e);
        mmiVar.f41039f = new mmh(mmiVar.f41035b, 0);
        mmiVar.f41034a.m4860e(mmiVar.f41039f);
        mmiVar.f41040g = new mme(mmiVar);
        mmiVar.f41036c.m15926h(mmiVar.f41040g);
        mmiVar.m16623a();
        mmiVar.f41034a.m4867l(mmiVar.f41035b.f1667b);
        if (list.size() < 2) {
            tabLayout.setVisibility(8);
        }
        return viewPager2;
    }

    /* JADX INFO: renamed from: e */
    public final void m10722e(int i, View view, AmbientMode.AmbientController ambientController) {
        this.f29465f.m10715n(i, -1, view, new csq(this, 4), ambientController);
    }
}
