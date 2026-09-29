package p083e2;

import androidx.constraintlayout.core.widgets.analyzer.C0733b;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* JADX INFO: renamed from: e2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5361i {

    /* JADX INFO: renamed from: a */
    public final WidgetRun f33682a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<WidgetRun> f33683b = new ArrayList<>();

    public C5361i(WidgetRun widgetRun) {
        this.f33682a = null;
        this.f33682a = widgetRun;
    }

    /* JADX INFO: renamed from: a */
    public static long m11499a(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f4919d;
        if (widgetRun instanceof C0733b) {
            return j10;
        }
        ArrayList arrayList = dependencyNode.f4926k;
        int size = arrayList.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5356d interfaceC5356d = (InterfaceC5356d) arrayList.get(i10);
            if (interfaceC5356d instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) interfaceC5356d;
                if (dependencyNode2.f4919d != widgetRun) {
                    jMin = Math.min(jMin, m11499a(dependencyNode2, ((long) dependencyNode2.f4921f) + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.f4936i) {
            return jMin;
        }
        long jMo2755j = widgetRun.mo2755j();
        DependencyNode dependencyNode3 = widgetRun.f4935h;
        long j11 = j10 - jMo2755j;
        return Math.min(Math.min(jMin, m11499a(dependencyNode3, j11)), j11 - ((long) dependencyNode3.f4921f));
    }

    /* JADX INFO: renamed from: b */
    public static long m11500b(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f4919d;
        if (widgetRun instanceof C0733b) {
            return j10;
        }
        ArrayList arrayList = dependencyNode.f4926k;
        int size = arrayList.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5356d interfaceC5356d = (InterfaceC5356d) arrayList.get(i10);
            if (interfaceC5356d instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) interfaceC5356d;
                if (dependencyNode2.f4919d != widgetRun) {
                    jMax = Math.max(jMax, m11500b(dependencyNode2, ((long) dependencyNode2.f4921f) + j10));
                }
            }
        }
        if (dependencyNode == widgetRun.f4935h) {
            long jMo2755j = widgetRun.mo2755j();
            DependencyNode dependencyNode3 = widgetRun.f4936i;
            long j11 = j10 + jMo2755j;
            jMax = Math.max(Math.max(jMax, m11500b(dependencyNode3, j11)), j11 - ((long) dependencyNode3.f4921f));
        }
        return jMax;
    }
}
