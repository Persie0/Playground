package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MenuItem;
import java.util.List;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3284l3 {

    /* JADX INFO: renamed from: a */
    public Object f48950a;

    /* JADX INFO: renamed from: b */
    public Object f48951b;

    public AbstractC3284l3(String str, Rect rect, List list, String str2) {
        this.f48950a = str;
        new Rect(rect);
        Point[] pointArr = new Point[list.size()];
        for (int i = 0; i < list.size(); i++) {
            pointArr[i] = new Point((Point) list.get(i));
        }
        this.f48951b = str2;
    }

    /* JADX INFO: renamed from: c */
    public void m15758c() {
        C3693vp c3693vp = (C3693vp) this.f48950a;
        if (c3693vp != null) {
            try {
                ((LayoutInflaterFactory2C3804yp) this.f48951b).f70215k.unregisterReceiver(c3693vp);
            } catch (IllegalArgumentException unused) {
            }
            this.f48950a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract IntentFilter mo15759d();

    /* JADX INFO: renamed from: e */
    public abstract int[] mo15760e(int i);

    /* JADX INFO: renamed from: f */
    public MenuItem m15761f(MenuItem menuItem) {
        if (!(menuItem instanceof vn9)) {
            return menuItem;
        }
        vn9 vn9Var = (vn9) menuItem;
        if (((l79) this.f48951b) == null) {
            this.f48951b = new l79(0);
        }
        MenuItem menuItem2 = (MenuItem) ((l79) this.f48951b).get(vn9Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        qw5 qw5Var = new qw5((Context) this.f48950a, vn9Var);
        ((l79) this.f48951b).put(vn9Var, qw5Var);
        return qw5Var;
    }

    /* JADX INFO: renamed from: g */
    public int[] m15762g(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.f48951b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public String m15763h() {
        String str = (String) this.f48950a;
        if (str != null) {
            return str;
        }
        fa4.m11636J("text");
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public void mo15764i(String str) {
        this.f48950a = str;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo15765j();

    /* JADX INFO: renamed from: k */
    public abstract int[] mo15766k(int i);

    /* JADX INFO: renamed from: l */
    public void m15767l() {
        m15758c();
        IntentFilter intentFilterMo15759d = mo15759d();
        if (intentFilterMo15759d.countActions() == 0) {
            return;
        }
        if (((C3693vp) this.f48950a) == null) {
            this.f48950a = new C3693vp(this, 0);
        }
        ((LayoutInflaterFactory2C3804yp) this.f48951b).f70215k.registerReceiver((C3693vp) this.f48950a, intentFilterMo15759d);
    }

    public AbstractC3284l3(Context context) {
        this.f48950a = context;
    }

    public AbstractC3284l3() {
        this.f48951b = new int[2];
    }

    public AbstractC3284l3(LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp) {
        this.f48951b = layoutInflaterFactory2C3804yp;
    }
}
