package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ng9 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f52710a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f52711b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public int f52712c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f52713d = 0;

    /* JADX INFO: renamed from: e */
    public final int f52714e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f52715f;

    public ng9(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f52715f = staggeredGridLayoutManager;
        this.f52714e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m17412a() {
        View view = (View) AbstractC3393o1.m17731f(1, this.f52710a);
        mg9 mg9Var = (mg9) view.getLayoutParams();
        this.f52712c = this.f52715f.f6695r.mo16446d(view);
        mg9Var.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m17413b() {
        this.f52710a.clear();
        this.f52711b = Integer.MIN_VALUE;
        this.f52712c = Integer.MIN_VALUE;
        this.f52713d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m17414c() {
        boolean z = this.f52715f.f6700w;
        ArrayList arrayList = this.f52710a;
        return z ? m17416e(arrayList.size() - 1, -1) : m17416e(0, arrayList.size());
    }

    /* JADX INFO: renamed from: d */
    public final int m17415d() {
        boolean z = this.f52715f.f6700w;
        ArrayList arrayList = this.f52710a;
        return z ? m17416e(0, arrayList.size()) : m17416e(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public final int m17416e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f52715f;
        int iMo16455m = staggeredGridLayoutManager.f6695r.mo16455m();
        int iMo16451i = staggeredGridLayoutManager.f6695r.mo16451i();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f52710a.get(i);
            int iMo16449g = staggeredGridLayoutManager.f6695r.mo16449g(view);
            int iMo16446d = staggeredGridLayoutManager.f6695r.mo16446d(view);
            boolean z = iMo16449g <= iMo16451i;
            boolean z2 = iMo16446d >= iMo16455m;
            if (z && z2 && (iMo16449g < iMo16455m || iMo16446d > iMo16451i)) {
                return y28.m24878K(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m17417f(int i) {
        int i2 = this.f52712c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f52710a.size() == 0) {
            return i;
        }
        m17412a();
        return this.f52712c;
    }

    /* JADX INFO: renamed from: g */
    public final View m17418g(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f52715f;
        View view = null;
        ArrayList arrayList = this.f52710a;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f6700w && y28.m24878K(view2) >= i) || ((!staggeredGridLayoutManager.f6700w && y28.m24878K(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.f6700w && y28.m24878K(view3) <= i) || ((!staggeredGridLayoutManager.f6700w && y28.m24878K(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final int m17419h(int i) {
        int i2 = this.f52711b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f52710a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        mg9 mg9Var = (mg9) view.getLayoutParams();
        this.f52711b = this.f52715f.f6695r.mo16449g(view);
        mg9Var.getClass();
        return this.f52711b;
    }
}
