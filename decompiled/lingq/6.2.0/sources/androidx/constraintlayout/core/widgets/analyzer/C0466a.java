package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p000.nb2;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.a */
/* JADX INFO: loaded from: classes.dex */
public class C0466a implements nb2 {

    /* JADX INFO: renamed from: d */
    public final AbstractC0473h f5335d;

    /* JADX INFO: renamed from: f */
    public int f5337f;

    /* JADX INFO: renamed from: g */
    public int f5338g;

    /* JADX INFO: renamed from: a */
    public AbstractC0473h f5332a = null;

    /* JADX INFO: renamed from: b */
    public boolean f5333b = false;

    /* JADX INFO: renamed from: c */
    public boolean f5334c = false;

    /* JADX INFO: renamed from: e */
    public DependencyNode$Type f5336e = DependencyNode$Type.UNKNOWN;

    /* JADX INFO: renamed from: h */
    public int f5339h = 1;

    /* JADX INFO: renamed from: i */
    public C0467b f5340i = null;

    /* JADX INFO: renamed from: j */
    public boolean f5341j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f5342k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f5343l = new ArrayList();

    public C0466a(AbstractC0473h abstractC0473h) {
        this.f5335d = abstractC0473h;
    }

    @Override // p000.nb2
    /* JADX INFO: renamed from: a */
    public final void mo1911a(nb2 nb2Var) {
        ArrayList<C0466a> arrayList = this.f5343l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0466a) it.next()).f5341j) {
                return;
            }
        }
        this.f5334c = true;
        AbstractC0473h abstractC0473h = this.f5332a;
        if (abstractC0473h != null) {
            abstractC0473h.mo1911a(this);
        }
        if (this.f5333b) {
            this.f5335d.mo1911a(this);
            return;
        }
        C0466a c0466a = null;
        int i = 0;
        for (C0466a c0466a2 : arrayList) {
            if (!(c0466a2 instanceof C0467b)) {
                i++;
                c0466a = c0466a2;
            }
        }
        if (c0466a != null && i == 1 && c0466a.f5341j) {
            C0467b c0467b = this.f5340i;
            if (c0467b != null) {
                if (!c0467b.f5341j) {
                    return;
                } else {
                    this.f5337f = this.f5339h * c0467b.f5338g;
                }
            }
            mo1914d(c0466a.f5338g + this.f5337f);
        }
        AbstractC0473h abstractC0473h2 = this.f5332a;
        if (abstractC0473h2 != null) {
            abstractC0473h2.mo1911a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1912b(AbstractC0473h abstractC0473h) {
        this.f5342k.add(abstractC0473h);
        if (this.f5341j) {
            abstractC0473h.mo1911a(abstractC0473h);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1913c() {
        this.f5343l.clear();
        this.f5342k.clear();
        this.f5341j = false;
        this.f5338g = 0;
        this.f5334c = false;
        this.f5333b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo1914d(int i) {
        if (this.f5341j) {
            return;
        }
        this.f5341j = true;
        this.f5338g = i;
        for (nb2 nb2Var : this.f5342k) {
            nb2Var.mo1911a(nb2Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5335d.f5351b.f65477j0);
        sb.append(":");
        sb.append(this.f5336e);
        sb.append("(");
        sb.append(this.f5341j ? Integer.valueOf(this.f5338g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f5343l.size());
        sb.append(":d=");
        sb.append(this.f5342k.size());
        sb.append(">");
        return sb.toString();
    }
}
