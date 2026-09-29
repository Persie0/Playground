package p000;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uq9 {

    /* JADX INFO: renamed from: a */
    public int f64229a;

    /* JADX INFO: renamed from: b */
    public int f64230b;

    /* JADX INFO: renamed from: c */
    public int f64231c;

    /* JADX INFO: renamed from: d */
    public Object f64232d;

    public uq9() {
        if (bw8.f9103e == null) {
            bw8.f9103e = new bw8();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m22869a(int i) {
        if (i < this.f64231c) {
            return ((ByteBuffer) this.f64232d).getShort(this.f64230b + i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo21731b(View view);

    /* JADX INFO: renamed from: c */
    public abstract void mo21732c(View view, Object obj);

    /* JADX INFO: renamed from: d */
    public Object m22870d(View view) {
        if (Build.VERSION.SDK_INT >= this.f64230b) {
            return mo21731b(view);
        }
        Object tag = view.getTag(this.f64229a);
        if (((Class) this.f64232d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m22871e(View view, Object obj) {
        C3133j3 c3133j3;
        if (Build.VERSION.SDK_INT >= this.f64230b) {
            mo21732c(view, obj);
            return;
        }
        if (mo21733f(m22870d(view), obj)) {
            WeakHashMap weakHashMap = dta.f36217a;
            View.AccessibilityDelegate accessibilityDelegateM3034a = ata.m3034a(view);
            if (accessibilityDelegateM3034a == null) {
                c3133j3 = null;
            } else {
                c3133j3 = accessibilityDelegateM3034a instanceof C3098i3 ? ((C3098i3) accessibilityDelegateM3034a).f43394a : new C3133j3(accessibilityDelegateM3034a);
            }
            if (c3133j3 == null) {
                c3133j3 = new C3133j3();
            }
            dta.m10640k(view, c3133j3);
            view.setTag(this.f64229a, obj);
            dta.m10636g(view, this.f64231c);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo21733f(Object obj, Object obj2);

    public uq9(int i, Class cls, int i2, int i3) {
        this.f64229a = i;
        this.f64232d = cls;
        this.f64231c = i2;
        this.f64230b = i3;
    }
}
