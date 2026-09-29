package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class x60 {

    /* JADX INFO: renamed from: a */
    public Object f67808a;

    /* JADX INFO: renamed from: b */
    public final Object f67809b;

    public x60(int i) {
        this.f67809b = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.f67809b).add(new bm2());
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m24291b(int i, int i2, int i3) {
        return AbstractC3584sr.m21644w((i - i2) / i3, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo278a();

    /* JADX INFO: renamed from: c */
    public abstract void mo279c();

    /* JADX INFO: renamed from: d */
    public boolean m24292d() {
        return ((w60) this.f67808a).f48365b && ((v60) this.f67809b).f8610b;
    }

    /* JADX INFO: renamed from: e */
    public void mo631e() {
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo632f();

    /* JADX INFO: renamed from: g */
    public void mo633g(u60 u60Var) {
    }

    /* JADX INFO: renamed from: h */
    public void mo634h() {
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo280i(w90 w90Var);

    /* JADX INFO: renamed from: j */
    public abstract void mo281j();

    /* JADX INFO: renamed from: k */
    public abstract void mo282k();

    /* JADX INFO: renamed from: l */
    public abstract void mo283l();

    public x60() {
        this.f67808a = new LinkedHashSet();
        this.f67809b = new LinkedHashMap();
    }

    public x60(omd omdVar) {
        this.f67808a = new w60(this, 0);
        this.f67809b = new v60(this, omdVar);
    }
}
