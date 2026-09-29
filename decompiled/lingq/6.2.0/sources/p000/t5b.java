package p000;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class t5b {

    /* JADX INFO: renamed from: a */
    public final f6b f61891a;

    /* JADX INFO: renamed from: b */
    public l64[] f61892b;

    /* JADX INFO: renamed from: c */
    public final Rect[][] f61893c;

    /* JADX INFO: renamed from: d */
    public final Rect[][] f61894d;

    public t5b(f6b f6bVar) {
        this.f61893c = new Rect[10][];
        this.f61894d = new Rect[10][];
        this.f61891a = f6bVar;
        mo20416c(f6bVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m21851a() {
        l64[] l64VarArr = this.f61892b;
        if (l64VarArr != null) {
            l64 l64VarMo136i = l64VarArr[0];
            l64 l64VarMo136i2 = l64VarArr[1];
            f6b f6bVar = this.f61891a;
            if (l64VarMo136i2 == null) {
                l64VarMo136i2 = f6bVar.f38536a.mo136i(2);
            }
            if (l64VarMo136i == null) {
                l64VarMo136i = f6bVar.f38536a.mo136i(1);
            }
            mo17241h(l64.m15828a(l64VarMo136i, l64VarMo136i2));
            l64 l64Var = this.f61892b[qba.m19850b(16)];
            if (l64Var != null) {
                mo17240g(l64Var);
            }
            l64 l64Var2 = this.f61892b[qba.m19850b(32)];
            if (l64Var2 != null) {
                mo17238e(l64Var2);
            }
            l64 l64Var3 = this.f61892b[qba.m19850b(64)];
            if (l64Var3 != null) {
                mo17242i(l64Var3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract f6b mo17237b();

    /* JADX INFO: renamed from: c */
    public void mo20416c(f6b f6bVar) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo3378f = f6bVar.f38536a.mo3378f(i);
            int iM19850b = qba.m19850b(i);
            this.f61893c[iM19850b] = (Rect[]) listMo3378f.toArray(new Rect[listMo3378f.size()]);
            if (i != 8) {
                List<Rect> listMo3379g = f6bVar.f38536a.mo3379g(i);
                this.f61894d[iM19850b] = (Rect[]) listMo3379g.toArray(new Rect[listMo3379g.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo17808d(int i, l64 l64Var) {
        if (this.f61892b == null) {
            this.f61892b = new l64[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f61892b[qba.m19850b(i2)] = l64Var;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo17238e(l64 l64Var);

    /* JADX INFO: renamed from: f */
    public abstract void mo17239f(l64 l64Var);

    /* JADX INFO: renamed from: g */
    public abstract void mo17240g(l64 l64Var);

    /* JADX INFO: renamed from: h */
    public abstract void mo17241h(l64 l64Var);

    /* JADX INFO: renamed from: i */
    public abstract void mo17242i(l64 l64Var);

    public t5b() {
        this(new f6b((f6b) null));
    }
}
