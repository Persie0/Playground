package p000;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class up9 extends t64 {

    /* JADX INFO: renamed from: M */
    public vi3 f64193M;

    /* JADX INFO: renamed from: N */
    public l6b f64194N;

    @Override // p000.o64, p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        View viewM4067t0 = bq1.m4067t0(this);
        WeakHashMap weakHashMap = l6b.f49204w;
        l6b l6bVarM13402x = ho5.m13402x(viewM4067t0);
        l6bVarM13402x.m15909a(viewM4067t0);
        e5b e5bVar = (e5b) this.f64193M.invoke(l6bVarM13402x);
        if (!fa4.m11650l(e5bVar, this.f61912L)) {
            this.f61912L = e5bVar;
            mo4502a1();
        }
        this.f64194N = l6bVarM13402x;
        super.mo36R0();
    }

    @Override // p000.o64, p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        View viewM4067t0 = bq1.m4067t0(this);
        l6b l6bVar = this.f64194N;
        if (l6bVar != null) {
            int i = l6bVar.f49225u - 1;
            l6bVar.f49225u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = dta.f36217a;
                wsa.m24145c(viewM4067t0, null);
                dta.m10642m(viewM4067t0, null);
                viewM4067t0.removeOnAttachStateChangeListener(l6bVar.f49226v);
            }
        }
        super.mo37S0();
    }
}
