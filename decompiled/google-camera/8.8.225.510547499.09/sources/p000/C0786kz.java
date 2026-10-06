package p000;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: kz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0786kz {

    /* JADX INFO: renamed from: b */
    public int f37753b;

    /* JADX INFO: renamed from: c */
    public int f37754c;

    /* JADX INFO: renamed from: d */
    public int f37755d;

    /* JADX INFO: renamed from: e */
    public int f37756e;

    /* JADX INFO: renamed from: f */
    public int f37757f;

    /* JADX INFO: renamed from: g */
    public int f37758g;

    /* JADX INFO: renamed from: k */
    public int f37762k;

    /* JADX INFO: renamed from: m */
    public boolean f37764m;

    /* JADX INFO: renamed from: a */
    public boolean f37752a = true;

    /* JADX INFO: renamed from: h */
    public int f37759h = 0;

    /* JADX INFO: renamed from: i */
    public int f37760i = 0;

    /* JADX INFO: renamed from: j */
    public boolean f37761j = false;

    /* JADX INFO: renamed from: l */
    public List f37763l = null;

    /* JADX INFO: renamed from: a */
    public final View m15080a(C0818md c0818md) {
        List list = this.f37763l;
        if (list == null) {
            View viewM16313b = c0818md.m16313b(this.f37755d);
            this.f37755d += this.f37756e;
            return viewM16313b;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((C0829mo) this.f37763l.get(i)).f41155a;
            C0813lz c0813lz = (C0813lz) view.getLayoutParams();
            if (!c0813lz.m16220c() && this.f37755d == c0813lz.m16218a()) {
                m15082c(view);
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m15081b() {
        m15082c(null);
    }

    /* JADX INFO: renamed from: c */
    public final void m15082c(View view) {
        int iM16218a;
        int size = this.f37763l.size();
        int i = Integer.MAX_VALUE;
        View view2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((C0829mo) this.f37763l.get(i2)).f41155a;
            C0813lz c0813lz = (C0813lz) view3.getLayoutParams();
            if (view3 != view && !c0813lz.m16220c() && (iM16218a = (c0813lz.m16218a() - this.f37755d) * this.f37756e) >= 0 && iM16218a < i) {
                if (iM16218a == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i = iM16218a;
                }
            }
        }
        if (view2 == null) {
            this.f37755d = -1;
        } else {
            this.f37755d = ((C0813lz) view2.getLayoutParams()).m16218a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15083d(C0826ml c0826ml) {
        int i = this.f37755d;
        return i >= 0 && i < c0826ml.m16585a();
    }
}
