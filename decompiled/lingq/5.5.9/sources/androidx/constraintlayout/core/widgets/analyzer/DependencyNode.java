package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p083e2.InterfaceC5356d;

/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements InterfaceC5356d {

    /* JADX INFO: renamed from: d */
    public final WidgetRun f4919d;

    /* JADX INFO: renamed from: f */
    public int f4921f;

    /* JADX INFO: renamed from: g */
    public int f4922g;

    /* JADX INFO: renamed from: a */
    public WidgetRun f4916a = null;

    /* JADX INFO: renamed from: b */
    public boolean f4917b = false;

    /* JADX INFO: renamed from: c */
    public boolean f4918c = false;

    /* JADX INFO: renamed from: e */
    public Type f4920e = Type.UNKNOWN;

    /* JADX INFO: renamed from: h */
    public int f4923h = 1;

    /* JADX INFO: renamed from: i */
    public C0732a f4924i = null;

    /* JADX INFO: renamed from: j */
    public boolean f4925j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f4926k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f4927l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f4919d = widgetRun;
    }

    @Override // p083e2.InterfaceC5356d
    /* JADX INFO: renamed from: a */
    public final void mo2743a(InterfaceC5356d interfaceC5356d) {
        ArrayList<DependencyNode> arrayList = this.f4927l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f4925j) {
                return;
            }
        }
        this.f4918c = true;
        WidgetRun widgetRun = this.f4916a;
        if (widgetRun != null) {
            widgetRun.mo2743a(this);
        }
        if (this.f4917b) {
            this.f4919d.mo2743a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i10 = 0;
        for (DependencyNode dependencyNode2 : arrayList) {
            if (!(dependencyNode2 instanceof C0732a)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.f4925j) {
            C0732a c0732a = this.f4924i;
            if (c0732a != null) {
                if (!c0732a.f4925j) {
                    return;
                } else {
                    this.f4921f = this.f4923h * c0732a.f4922g;
                }
            }
            mo2746d(dependencyNode.f4922g + this.f4921f);
        }
        WidgetRun widgetRun2 = this.f4916a;
        if (widgetRun2 != null) {
            widgetRun2.mo2743a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2744b(InterfaceC5356d interfaceC5356d) {
        this.f4926k.add(interfaceC5356d);
        if (this.f4925j) {
            interfaceC5356d.mo2743a(interfaceC5356d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2745c() {
        this.f4927l.clear();
        this.f4926k.clear();
        this.f4925j = false;
        this.f4922g = 0;
        this.f4918c = false;
        this.f4917b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo2746d(int i10) {
        if (this.f4925j) {
            return;
        }
        this.f4925j = true;
        this.f4922g = i10;
        for (InterfaceC5356d interfaceC5356d : this.f4926k) {
            interfaceC5356d.mo2743a(interfaceC5356d);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4919d.f4929b.f4885l0);
        sb2.append(":");
        sb2.append(this.f4920e);
        sb2.append("(");
        sb2.append(this.f4925j ? Integer.valueOf(this.f4922g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f4927l.size());
        sb2.append(":d=");
        sb2.append(this.f4926k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
