package p083e2;

import androidx.activity.result.C0204c;
import androidx.constraintlayout.core.widgets.C0738d;
import androidx.constraintlayout.core.widgets.C0740f;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C0732a;
import androidx.constraintlayout.core.widgets.analyzer.C0733b;
import androidx.constraintlayout.core.widgets.analyzer.C0734c;
import androidx.constraintlayout.core.widgets.analyzer.C0735d;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p061d2.C5039b;

/* JADX INFO: renamed from: e2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5357e {

    /* JADX INFO: renamed from: a */
    public final C0738d f33673a;

    /* JADX INFO: renamed from: d */
    public final C0738d f33676d;

    /* JADX INFO: renamed from: f */
    public C5354b.b f33678f;

    /* JADX INFO: renamed from: g */
    public final C5354b.a f33679g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<C5361i> f33680h;

    /* JADX INFO: renamed from: b */
    public boolean f33674b = true;

    /* JADX INFO: renamed from: c */
    public boolean f33675c = true;

    /* JADX INFO: renamed from: e */
    public final ArrayList<WidgetRun> f33677e = new ArrayList<>();

    public C5357e(C0738d c0738d) {
        new ArrayList();
        this.f33678f = null;
        this.f33679g = new C5354b.a();
        this.f33680h = new ArrayList<>();
        this.f33673a = c0738d;
        this.f33676d = c0738d;
    }

    /* JADX INFO: renamed from: a */
    public final void m11482a(DependencyNode dependencyNode, int i10, int i11, ArrayList arrayList, C5361i c5361i) {
        WidgetRun widgetRun = dependencyNode.f4919d;
        if (widgetRun.f4930c == null) {
            C0738d c0738d = this.f33673a;
            if (widgetRun != c0738d.f4868d) {
                if (widgetRun == c0738d.f4870e) {
                    return;
                }
                if (c5361i == null) {
                    c5361i = new C5361i(widgetRun);
                    arrayList.add(c5361i);
                }
                widgetRun.f4930c = c5361i;
                c5361i.f33683b.add(widgetRun);
                DependencyNode dependencyNode2 = widgetRun.f4935h;
                Iterator it = dependencyNode2.f4926k.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        InterfaceC5356d interfaceC5356d = (InterfaceC5356d) it.next();
                        if (interfaceC5356d instanceof DependencyNode) {
                            m11482a((DependencyNode) interfaceC5356d, i10, 0, arrayList, c5361i);
                        }
                    }
                }
                DependencyNode dependencyNode3 = widgetRun.f4936i;
                Iterator it2 = dependencyNode3.f4926k.iterator();
                loop2: while (true) {
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop2;
                        }
                        InterfaceC5356d interfaceC5356d2 = (InterfaceC5356d) it2.next();
                        if (interfaceC5356d2 instanceof DependencyNode) {
                            m11482a((DependencyNode) interfaceC5356d2, i10, 1, arrayList, c5361i);
                        }
                    }
                }
                if (i10 == 1 && (widgetRun instanceof C0735d)) {
                    Iterator it3 = ((C0735d) widgetRun).f4942k.f4926k.iterator();
                    loop4: while (true) {
                        while (true) {
                            if (!it3.hasNext()) {
                                break loop4;
                            }
                            InterfaceC5356d interfaceC5356d3 = (InterfaceC5356d) it3.next();
                            if (interfaceC5356d3 instanceof DependencyNode) {
                                m11482a((DependencyNode) interfaceC5356d3, i10, 2, arrayList, c5361i);
                            }
                        }
                    }
                }
                Iterator it4 = dependencyNode2.f4927l.iterator();
                while (it4.hasNext()) {
                    m11482a((DependencyNode) it4.next(), i10, 0, arrayList, c5361i);
                }
                Iterator it5 = dependencyNode3.f4927l.iterator();
                while (it5.hasNext()) {
                    m11482a((DependencyNode) it5.next(), i10, 1, arrayList, c5361i);
                }
                if (i10 == 1 && (widgetRun instanceof C0735d)) {
                    Iterator it6 = ((C0735d) widgetRun).f4942k.f4927l.iterator();
                    while (it6.hasNext()) {
                        m11482a((DependencyNode) it6.next(), i10, 2, arrayList, c5361i);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x028c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ac  */
    /* JADX INFO: renamed from: b */
    public final void m11483b(C0738d c0738d) {
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        for (ConstraintWidget constraintWidget : c0738d.f32872w0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4857V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
            if (constraintWidget.f4881j0 == 8) {
                constraintWidget.f4862a = true;
            } else {
                float f3 = constraintWidget.f4907x;
                if (f3 < 1.0f && dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f4898s = 2;
                }
                float f10 = constraintWidget.f4836A;
                if (f10 < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f4900t = 2;
                }
                if (constraintWidget.f4861Z > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour6 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f4898s = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour6 && (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f4900t = 3;
                    } else if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour5 == dimensionBehaviour6) {
                        if (constraintWidget.f4898s == 0) {
                            constraintWidget.f4898s = 3;
                        }
                        if (constraintWidget.f4900t == 0) {
                            constraintWidget.f4900t = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                ConstraintAnchor constraintAnchor = constraintWidget.f4848M;
                ConstraintAnchor constraintAnchor2 = constraintWidget.f4846K;
                if (dimensionBehaviour4 == dimensionBehaviour7 && constraintWidget.f4898s == 1 && (constraintAnchor2.f4831f == null || constraintAnchor.f4831f == null)) {
                    dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintAnchor constraintAnchor3 = constraintWidget.f4849N;
                ConstraintAnchor constraintAnchor4 = constraintWidget.f4847L;
                if (dimensionBehaviour5 == dimensionBehaviour7 && constraintWidget.f4900t == 1 && (constraintAnchor4.f4831f == null || constraintAnchor3.f4831f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviour5;
                C0734c c0734c = constraintWidget.f4868d;
                c0734c.f4931d = dimensionBehaviour4;
                int i11 = constraintWidget.f4898s;
                c0734c.f4928a = i11;
                C0735d c0735d = constraintWidget.f4870e;
                c0735d.f4931d = dimensionBehaviour8;
                int i12 = constraintWidget.f4900t;
                c0735d.f4928a = i12;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour4 == dimensionBehaviour9 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int iM2735u = constraintWidget.m2735u();
                    if (dimensionBehaviour4 == dimensionBehaviour9) {
                        iM2735u = (c0738d.m2735u() - constraintAnchor2.f4832g) - constraintAnchor.f4832g;
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int iM2731o = constraintWidget.m2731o();
                    if (dimensionBehaviour8 == dimensionBehaviour9) {
                        int iM2731o2 = (c0738d.m2731o() - constraintAnchor4.f4832g) - constraintAnchor3.f4832g;
                        dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
                        i10 = iM2731o2;
                    } else {
                        i10 = iM2731o;
                    }
                    m11487f(constraintWidget, dimensionBehaviour4, iM2735u, dimensionBehaviour8, i10);
                    constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                    constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                    constraintWidget.f4862a = true;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = constraintWidget.f4854S;
                    if (dimensionBehaviour4 != dimensionBehaviour7 || (dimensionBehaviour8 != (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour8 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour = dimensionBehaviour8;
                        if (dimensionBehaviour != dimensionBehaviour7 && (dimensionBehaviour4 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                            if (i12 == 3) {
                                if (dimensionBehaviour4 == dimensionBehaviour2) {
                                    m11487f(constraintWidget, dimensionBehaviour2, 0, dimensionBehaviour2, 0);
                                }
                                int iM2735u2 = constraintWidget.m2735u();
                                float f11 = constraintWidget.f4861Z;
                                if (constraintWidget.f4863a0 == -1) {
                                    f11 = 1.0f / f11;
                                }
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.FIXED;
                                m11487f(constraintWidget, dimensionBehaviour10, iM2735u2, dimensionBehaviour10, (int) ((iM2735u2 * f11) + 0.5f));
                                constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                                constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                                constraintWidget.f4862a = true;
                            } else if (i12 == 1) {
                                m11487f(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour2, 0);
                                constraintWidget.f4870e.f4932e.f4939m = constraintWidget.m2731o();
                            } else if (i12 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = c0738d.f4857V[1];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour11 == dimensionBehaviour12 || dimensionBehaviour11 == dimensionBehaviour9) {
                                    m11487f(constraintWidget, dimensionBehaviour4, constraintWidget.m2735u(), dimensionBehaviour12, (int) ((f10 * c0738d.m2731o()) + 0.5f));
                                    constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                                    constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                                    constraintWidget.f4862a = true;
                                }
                            } else if (constraintAnchorArr[2].f4831f == null || constraintAnchorArr[3].f4831f == null) {
                                m11487f(constraintWidget, dimensionBehaviour2, 0, dimensionBehaviour, 0);
                                constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                                constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                                constraintWidget.f4862a = true;
                            }
                        }
                        if (dimensionBehaviour4 != dimensionBehaviour7 && dimensionBehaviour == dimensionBehaviour7) {
                            if (i11 == 1 || i12 == 1) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                m11487f(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour13, 0);
                                constraintWidget.f4868d.f4932e.f4939m = constraintWidget.m2735u();
                                constraintWidget.f4870e.f4932e.f4939m = constraintWidget.m2731o();
                            } else if (i12 == 2 && i11 == 2) {
                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = c0738d.f4857V;
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr2[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour14 == dimensionBehaviour15 && dimensionBehaviourArr2[1] == dimensionBehaviour15) {
                                    m11487f(constraintWidget, dimensionBehaviour15, (int) ((f3 * c0738d.m2735u()) + 0.5f), dimensionBehaviour15, (int) ((f10 * c0738d.m2731o()) + 0.5f));
                                    constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                                    constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                                    constraintWidget.f4862a = true;
                                }
                            }
                        }
                    } else if (i11 == 3) {
                        if (dimensionBehaviour8 == dimensionBehaviour3) {
                            m11487f(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                        }
                        int iM2731o3 = constraintWidget.m2731o();
                        int i13 = (int) ((iM2731o3 * constraintWidget.f4861Z) + 0.5f);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                        m11487f(constraintWidget, dimensionBehaviour16, i13, dimensionBehaviour16, iM2731o3);
                        constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                        constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                        constraintWidget.f4862a = true;
                    } else if (i11 == 1) {
                        m11487f(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour8, 0);
                        constraintWidget.f4868d.f4932e.f4939m = constraintWidget.m2735u();
                    } else {
                        dimensionBehaviour = dimensionBehaviour8;
                        if (i11 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = c0738d.f4857V[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour17 == dimensionBehaviour18 || dimensionBehaviour17 == dimensionBehaviour9) {
                                m11487f(constraintWidget, dimensionBehaviour18, (int) ((f3 * c0738d.m2735u()) + 0.5f), dimensionBehaviour, constraintWidget.m2731o());
                                constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                                constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                                constraintWidget.f4862a = true;
                            } else {
                                if (dimensionBehaviour != dimensionBehaviour7) {
                                }
                                if (dimensionBehaviour4 != dimensionBehaviour7) {
                                }
                            }
                        } else if (constraintAnchorArr[0].f4831f == null || constraintAnchorArr[1].f4831f == null) {
                            m11487f(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour, 0);
                            constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                            constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                            constraintWidget.f4862a = true;
                        } else {
                            if (dimensionBehaviour != dimensionBehaviour7) {
                            }
                            if (dimensionBehaviour4 != dimensionBehaviour7) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11484c() {
        ArrayList<WidgetRun> arrayList = this.f33677e;
        arrayList.clear();
        C0738d c0738d = this.f33676d;
        c0738d.f4868d.mo2753f();
        c0738d.f4870e.mo2753f();
        arrayList.add(c0738d.f4868d);
        arrayList.add(c0738d.f4870e);
        Iterator<ConstraintWidget> it = c0738d.f32872w0.iterator();
        HashSet hashSet = null;
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ConstraintWidget next = it.next();
                if (next instanceof C0740f) {
                    arrayList.add(new C5360h(next));
                } else {
                    if (next.m2703B()) {
                        if (next.f4864b == null) {
                            next.f4864b = new C5355c(0, next);
                        }
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(next.f4864b);
                    } else {
                        arrayList.add(next.f4868d);
                    }
                    if (next.m2704C()) {
                        if (next.f4866c == null) {
                            next.f4866c = new C5355c(1, next);
                        }
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(next.f4866c);
                    } else {
                        arrayList.add(next.f4870e);
                    }
                    if (next instanceof C5039b) {
                        arrayList.add(new C0733b(next));
                    }
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo2753f();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f4929b != c0738d) {
                widgetRun.mo2751d();
            }
        }
        ArrayList<C5361i> arrayList2 = this.f33680h;
        arrayList2.clear();
        C0738d c0738d2 = this.f33673a;
        m11486e(c0738d2.f4868d, 0, arrayList2);
        m11486e(c0738d2.f4870e, 1, arrayList2);
        this.f33674b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m11485d(C0738d c0738d, int i10) {
        long jMo2755j;
        ArrayList<C5361i> arrayList;
        int i11;
        long jMax;
        float f3;
        long j10;
        ArrayList<C5361i> arrayList2 = this.f33680h;
        int size = arrayList2.size();
        int i12 = 0;
        long jMax2 = 0;
        while (i12 < size) {
            WidgetRun widgetRun = arrayList2.get(i12).f33682a;
            if (!(widgetRun instanceof C5355c) ? !(i10 != 0 ? (widgetRun instanceof C0735d) : (widgetRun instanceof C0734c)) : ((C5355c) widgetRun).f4933f != i10) {
                DependencyNode dependencyNode = (i10 == 0 ? c0738d.f4868d : c0738d.f4870e).f4935h;
                DependencyNode dependencyNode2 = (i10 == 0 ? c0738d.f4868d : c0738d.f4870e).f4936i;
                boolean zContains = widgetRun.f4935h.f4927l.contains(dependencyNode);
                DependencyNode dependencyNode3 = widgetRun.f4936i;
                boolean zContains2 = dependencyNode3.f4927l.contains(dependencyNode2);
                long jMo2755j2 = widgetRun.mo2755j();
                DependencyNode dependencyNode4 = widgetRun.f4935h;
                if (zContains && zContains2) {
                    long jM11500b = C5361i.m11500b(dependencyNode4, 0L);
                    long jM11499a = C5361i.m11499a(dependencyNode3, 0L);
                    long j11 = jM11500b - jMo2755j2;
                    int i13 = dependencyNode3.f4921f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j11 >= (-i13)) {
                        j11 += (long) i13;
                    }
                    long j12 = j11;
                    long j13 = (-jM11499a) - jMo2755j2;
                    long j14 = dependencyNode4.f4921f;
                    long j15 = j13 - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    ConstraintWidget constraintWidget = widgetRun.f4929b;
                    if (i10 == 0) {
                        f3 = constraintWidget.f4875g0;
                    } else if (i10 == 1) {
                        f3 = constraintWidget.f4877h0;
                    } else {
                        constraintWidget.getClass();
                        f3 = -1.0f;
                    }
                    if (f3 > 0.0f) {
                        j10 = (long) ((j12 / (1.0f - f3)) + (j15 / f3));
                    } else {
                        j10 = 0;
                    }
                    float f10 = j10;
                    jMo2755j = (((long) dependencyNode4.f4921f) + ((((long) ((f10 * f3) + 0.5f)) + jMo2755j2) + ((long) C0204c.m845d(1.0f, f3, f10, 0.5f)))) - ((long) dependencyNode3.f4921f);
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    if (zContains) {
                        jMax = Math.max(C5361i.m11500b(dependencyNode4, dependencyNode4.f4921f), ((long) dependencyNode4.f4921f) + jMo2755j2);
                    } else if (zContains2) {
                        jMax = Math.max(-C5361i.m11499a(dependencyNode3, dependencyNode3.f4921f), ((long) (-dependencyNode3.f4921f)) + jMo2755j2);
                    } else {
                        jMo2755j = (widgetRun.mo2755j() + ((long) dependencyNode4.f4921f)) - ((long) dependencyNode3.f4921f);
                    }
                    jMo2755j = jMax;
                }
            } else {
                jMo2755j = 0;
                arrayList = arrayList2;
                i11 = size;
            }
            jMax2 = Math.max(jMax2, jMo2755j);
            i12++;
            arrayList2 = arrayList;
            size = i11;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: e */
    public final void m11486e(WidgetRun widgetRun, int i10, ArrayList<C5361i> arrayList) {
        DependencyNode dependencyNode;
        Iterator it = widgetRun.f4935h.f4926k.iterator();
        loop0: while (true) {
            while (true) {
                boolean zHasNext = it.hasNext();
                dependencyNode = widgetRun.f4936i;
                if (!zHasNext) {
                    break loop0;
                }
                InterfaceC5356d interfaceC5356d = (InterfaceC5356d) it.next();
                if (interfaceC5356d instanceof DependencyNode) {
                    m11482a((DependencyNode) interfaceC5356d, i10, 0, arrayList, null);
                } else if (interfaceC5356d instanceof WidgetRun) {
                    m11482a(((WidgetRun) interfaceC5356d).f4935h, i10, 0, arrayList, null);
                }
            }
        }
        Iterator it2 = dependencyNode.f4926k.iterator();
        loop2: while (true) {
            while (true) {
                if (!it2.hasNext()) {
                    break loop2;
                }
                InterfaceC5356d interfaceC5356d2 = (InterfaceC5356d) it2.next();
                if (interfaceC5356d2 instanceof DependencyNode) {
                    m11482a((DependencyNode) interfaceC5356d2, i10, 1, arrayList, null);
                } else if (interfaceC5356d2 instanceof WidgetRun) {
                    m11482a(((WidgetRun) interfaceC5356d2).f4936i, i10, 1, arrayList, null);
                }
            }
        }
        if (i10 == 1) {
            while (true) {
                for (InterfaceC5356d interfaceC5356d3 : ((C0735d) widgetRun).f4942k.f4926k) {
                    if (interfaceC5356d3 instanceof DependencyNode) {
                        m11482a((DependencyNode) interfaceC5356d3, i10, 2, arrayList, null);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11487f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        C5354b.a aVar = this.f33679g;
        aVar.f33661a = dimensionBehaviour;
        aVar.f33662b = dimensionBehaviour2;
        aVar.f33663c = i10;
        aVar.f33664d = i11;
        ((ConstraintLayout.C0760c) this.f33678f).m2873b(constraintWidget, aVar);
        constraintWidget.m2717R(aVar.f33665e);
        constraintWidget.m2714O(aVar.f33666f);
        constraintWidget.f4841F = aVar.f33668h;
        int i12 = aVar.f33667g;
        constraintWidget.f4869d0 = i12;
        constraintWidget.f4841F = i12 > 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m11488g() {
        C5353a c5353a;
        for (ConstraintWidget constraintWidget : this.f33673a.f32872w0) {
            if (!constraintWidget.f4862a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4857V;
                boolean z10 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i10 = constraintWidget.f4898s;
                int i11 = constraintWidget.f4900t;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z11 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i10 == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                C0732a c0732a = constraintWidget.f4868d.f4932e;
                boolean z12 = c0732a.f4925j;
                C0732a c0732a2 = constraintWidget.f4870e.f4932e;
                boolean z13 = c0732a2.f4925j;
                if (z12 && z13) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    m11487f(constraintWidget, dimensionBehaviour4, c0732a.f4922g, dimensionBehaviour4, c0732a2.f4922g);
                    constraintWidget.f4862a = true;
                } else if (z12 && z10) {
                    m11487f(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, c0732a.f4922g, dimensionBehaviour3, c0732a2.f4922g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f4870e.f4932e.f4939m = constraintWidget.m2731o();
                    } else {
                        constraintWidget.f4870e.f4932e.mo2746d(constraintWidget.m2731o());
                        constraintWidget.f4862a = true;
                    }
                } else if (z13 && z11) {
                    m11487f(constraintWidget, dimensionBehaviour3, c0732a.f4922g, ConstraintWidget.DimensionBehaviour.FIXED, c0732a2.f4922g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f4868d.f4932e.f4939m = constraintWidget.m2735u();
                    } else {
                        constraintWidget.f4868d.f4932e.mo2746d(constraintWidget.m2735u());
                        constraintWidget.f4862a = true;
                    }
                }
                if (constraintWidget.f4862a && (c5353a = constraintWidget.f4870e.f4943l) != null) {
                    c5353a.mo2746d(constraintWidget.f4869d0);
                }
            }
        }
    }
}
