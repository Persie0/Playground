package p000;

import com.lingq.p020ui.MainActivity;

/* JADX INFO: renamed from: x7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3749x7 implements mk3 {

    /* JADX INFO: renamed from: a */
    public final MainActivity f67846a;

    /* JADX INFO: renamed from: b */
    public final MainActivity f67847b;

    /* JADX INFO: renamed from: c */
    public volatile ey1 f67848c;

    /* JADX INFO: renamed from: d */
    public final Object f67849d = new Object();

    public C3749x7(MainActivity mainActivity) {
        this.f67846a = mainActivity;
        this.f67847b = mainActivity;
    }

    /* JADX INFO: renamed from: a */
    public static m58 m24324a(MainActivity mainActivity, MainActivity mainActivity2) {
        return new m58(mainActivity.mo2116r(), new C3601t7(mainActivity2, 0), mainActivity.mo2103e());
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f67848c == null) {
            synchronized (this.f67849d) {
                try {
                    if (this.f67848c == null) {
                        this.f67848c = ((C3675v7) m24324a(this.f67846a, this.f67847b).m16643g(y38.m24933a(C3675v7.class))).f64955b;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f67848c;
    }
}
