package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class ws4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67244a;

    /* JADX INFO: renamed from: b */
    public final sc9 f67245b;

    /* JADX INFO: renamed from: c */
    public final sc9 f67246c;

    /* JADX INFO: renamed from: d */
    public boolean f67247d;

    /* JADX INFO: renamed from: e */
    public Object f67248e;

    /* JADX INFO: renamed from: f */
    public final eu4 f67249f;

    public ws4(int i, int i2, int i3) {
        this.f67244a = i3;
        switch (i3) {
            case 1:
                this.f67245b = AbstractC0278f.m1257g(i);
                this.f67246c = AbstractC0278f.m1257g(i2);
                this.f67249f = new eu4(i, 30, 100);
                break;
            default:
                this.f67245b = AbstractC0278f.m1257g(i);
                this.f67246c = AbstractC0278f.m1257g(i2);
                this.f67249f = new eu4(i, 90, 200);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m24141a(int i, int i2) {
        int i3 = this.f67244a;
        sc9 sc9Var = this.f67246c;
        eu4 eu4Var = this.f67249f;
        sc9 sc9Var2 = this.f67245b;
        switch (i3) {
            case 0:
                if (i < 0.0f) {
                    l54.m15814a("Index should be non-negative");
                }
                sc9Var2.m21223i(i);
                eu4Var.m11342c(i);
                sc9Var.m21223i(i2);
                break;
            default:
                if (i < 0.0f) {
                    l54.m15814a("Index should be non-negative (" + i + ')');
                }
                sc9Var2.m21223i(i);
                eu4Var.m11342c(i);
                sc9Var.m21223i(i2);
                break;
        }
    }
}
