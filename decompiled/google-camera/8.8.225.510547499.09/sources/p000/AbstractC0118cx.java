package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: cx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0118cx {

    /* JADX INFO: renamed from: e */
    int f9927e;

    /* JADX INFO: renamed from: f */
    int f9928f;

    /* JADX INFO: renamed from: g */
    int f9929g;

    /* JADX INFO: renamed from: h */
    int f9930h;

    /* JADX INFO: renamed from: i */
    int f9931i;

    /* JADX INFO: renamed from: j */
    public boolean f9932j;

    /* JADX INFO: renamed from: l */
    public String f9934l;

    /* JADX INFO: renamed from: m */
    int f9935m;

    /* JADX INFO: renamed from: n */
    CharSequence f9936n;

    /* JADX INFO: renamed from: o */
    int f9937o;

    /* JADX INFO: renamed from: p */
    CharSequence f9938p;

    /* JADX INFO: renamed from: q */
    ArrayList f9939q;

    /* JADX INFO: renamed from: r */
    ArrayList f9940r;

    /* JADX INFO: renamed from: d */
    final ArrayList f9926d = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f9933k = true;

    /* JADX INFO: renamed from: s */
    boolean f9941s = false;

    /* JADX INFO: renamed from: b */
    public abstract void mo2015b();

    /* JADX INFO: renamed from: c */
    public abstract void mo2016c();

    /* JADX INFO: renamed from: d */
    public void mo2017d(int i, ComponentCallbacksC0077bw componentCallbacksC0077bw, String str, int i2) {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo2021h();

    /* JADX INFO: renamed from: i */
    public abstract void mo2022i();

    /* JADX INFO: renamed from: k */
    public void mo2024k(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        throw null;
    }

    /* JADX INFO: renamed from: l */
    final void m5696l(C0117cw c0117cw) {
        this.f9926d.add(c0117cw);
        c0117cw.f9852d = this.f9927e;
        c0117cw.f9853e = this.f9928f;
        c0117cw.f9854f = this.f9929g;
        c0117cw.f9855g = this.f9930h;
    }

    /* JADX INFO: renamed from: m */
    public final void m5697m(int i, ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        mo2017d(i, componentCallbacksC0077bw, null, 1);
    }

    /* JADX INFO: renamed from: n */
    public final void m5698n(int i, ComponentCallbacksC0077bw componentCallbacksC0077bw, String str) {
        mo2017d(i, componentCallbacksC0077bw, str, 1);
    }

    /* JADX INFO: renamed from: o */
    public final void m5699o(ComponentCallbacksC0077bw componentCallbacksC0077bw, String str) {
        mo2017d(0, componentCallbacksC0077bw, str, 1);
    }

    /* JADX INFO: renamed from: p */
    public final void m5700p() {
        if (this.f9932j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f9933k = false;
    }

    /* JADX INFO: renamed from: q */
    public final void m5701q() {
        this.f9941s = true;
    }

    /* JADX INFO: renamed from: r */
    public final void m5702r(int i, ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo2017d(i, componentCallbacksC0077bw, null, 2);
    }
}
