package p000;

import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import kotlinx.datetime.internal.format.C3257b;
import kotlinx.datetime.internal.format.C3258c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ydd {
    /* JADX INFO: renamed from: a */
    public static final void m25104a(ListBuilder listBuilder, mc3 mc3Var) {
        if (mc3Var instanceof ta0) {
            listBuilder.add(((ta0) mc3Var).f62036a);
            return;
        }
        if (mc3Var instanceof bg1) {
            Iterator it = ((bg1) mc3Var).f8488a.iterator();
            while (it.hasNext()) {
                m25104a(listBuilder, (xl6) it.next());
            }
            return;
        }
        if (mc3Var instanceof yi1) {
            return;
        }
        if (mc3Var instanceof C3258c) {
            m25104a(listBuilder, ((C3258c) mc3Var).f48229a);
            return;
        }
        if (!(mc3Var instanceof C0017af)) {
            if (mc3Var instanceof C3257b) {
                m25104a(listBuilder, ((C3257b) mc3Var).f48227b);
                return;
            } else {
                gm5.m12750e();
                return;
            }
        }
        C0017af c0017af = (C0017af) mc3Var;
        m25104a(listBuilder, c0017af.f565a);
        Iterator it2 = c0017af.f566b.iterator();
        while (it2.hasNext()) {
            m25104a(listBuilder, (mc3) it2.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m25105b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }
}
