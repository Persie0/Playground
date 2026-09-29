package p000;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: renamed from: af */
/* JADX INFO: loaded from: classes3.dex */
public final class C0017af implements xl6 {

    /* JADX INFO: renamed from: a */
    public final bg1 f565a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f566b;

    public C0017af(bg1 bg1Var, ArrayList arrayList) {
        this.f565a = bg1Var;
        this.f566b = arrayList;
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: a */
    public final pc3 mo337a() {
        return this.f565a.mo337a();
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: b */
    public final t47 mo338b() {
        ListBuilder listBuilderM23650t = vz1.m23650t();
        listBuilderM23650t.add(this.f565a.mo338b());
        Iterator it = this.f566b.iterator();
        while (it.hasNext()) {
            listBuilderM23650t.add(((mc3) it.next()).mo338b());
        }
        return new t47(EmptyList.f47638a, vz1.m23635i(listBuilderM23650t));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0017af)) {
            return false;
        }
        C0017af c0017af = (C0017af) obj;
        return this.f565a.equals(c0017af.f565a) && this.f566b.equals(c0017af.f566b);
    }

    public final int hashCode() {
        return this.f566b.hashCode() + (this.f565a.f8488a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.f566b + ')';
    }
}
