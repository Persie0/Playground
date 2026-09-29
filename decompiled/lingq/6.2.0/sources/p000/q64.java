package p000;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q64 extends m80 implements Runnable, gr6, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c */
    public final l6b f57318c;

    /* JADX INFO: renamed from: d */
    public boolean f57319d;

    /* JADX INFO: renamed from: e */
    public boolean f57320e;

    /* JADX INFO: renamed from: f */
    public f6b f57321f;

    public q64(l6b l6bVar) {
        super(!l6bVar.f49224t ? 1 : 0);
        this.f57318c = l6bVar;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: g */
    public final void mo14068g(m5b m5bVar) {
        this.f57319d = false;
        this.f57320e = false;
        f6b f6bVar = this.f57321f;
        if (m5bVar.f50624a.mo14857b() > 0 && f6bVar != null) {
            c6b c6bVar = f6bVar.f38536a;
            l6b l6bVar = this.f57318c;
            l6bVar.f49223s.m4004f(nda.m17384h(c6bVar.mo136i(8)));
            l6bVar.f49222r.m4004f(nda.m17384h(c6bVar.mo136i(8)));
            l6b.m15908b(l6bVar, f6bVar);
        }
        this.f57321f = null;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: h */
    public final void mo14069h(m5b m5bVar) {
        this.f57319d = true;
        this.f57320e = true;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: i */
    public final f6b mo14070i(f6b f6bVar, List list) {
        l6b l6bVar = this.f57318c;
        l6b.m15908b(l6bVar, f6bVar);
        return l6bVar.f49224t ? f6b.f38535b : f6bVar;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: j */
    public final p33 mo14071j(m5b m5bVar, p33 p33Var) {
        this.f57319d = false;
        return p33Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f57319d) {
            this.f57319d = false;
            this.f57320e = false;
            f6b f6bVar = this.f57321f;
            if (f6bVar != null) {
                l6b l6bVar = this.f57318c;
                l6bVar.f49223s.m4004f(nda.m17384h(f6bVar.f38536a.mo136i(8)));
                l6b.m15908b(l6bVar, f6bVar);
                this.f57321f = null;
            }
        }
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public final f6b mo1889s(View view, f6b f6bVar) {
        this.f57321f = f6bVar;
        l6b l6bVar = this.f57318c;
        boa boaVar = l6bVar.f49222r;
        c6b c6bVar = f6bVar.f38536a;
        boaVar.m4004f(nda.m17384h(c6bVar.mo136i(8)));
        if (this.f57319d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f57320e) {
            l6bVar.f49223s.m4004f(nda.m17384h(c6bVar.mo136i(8)));
            l6b.m15908b(l6bVar, f6bVar);
        }
        return l6bVar.f49224t ? f6b.f38535b : f6bVar;
    }
}
