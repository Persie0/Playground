package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import p000.AbstractC3021g0;
import p000.au3;
import p000.bg1;
import p000.cg1;
import p000.d33;
import p000.di1;
import p000.fy4;
import p000.ig1;
import p000.jca;
import p000.ki7;
import p000.mfa;
import p000.nz6;
import p000.nzb;
import p000.pc3;
import p000.t47;
import p000.u91;
import p000.ub1;
import p000.v63;
import p000.v91;
import p000.vn7;
import p000.vz1;
import p000.xl6;
import p000.ydd;
import p000.yi1;

/* JADX INFO: renamed from: kotlinx.datetime.internal.format.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3257b implements xl6 {

    /* JADX INFO: renamed from: a */
    public final String f48226a;

    /* JADX INFO: renamed from: b */
    public final bg1 f48227b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f48228c;

    public C3257b(String str, bg1 bg1Var) {
        this.f48226a = str;
        this.f48227b = bg1Var;
        ListBuilder listBuilderM23650t = vz1.m23650t();
        ydd.m25104a(listBuilderM23650t, bg1Var);
        ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
        ArrayList arrayList = new ArrayList(v91.m23189q0(listBuilderM23635i, 10));
        ListIterator listIterator = listBuilderM23635i.listIterator(0);
        while (true) {
            au3 au3Var = (au3) listIterator;
            if (!au3Var.hasNext()) {
                break;
            } else {
                arrayList.add(((d33) au3Var.next()).mo10073c());
            }
        }
        List<AbstractC3021g0> listM22622n1 = u91.m22622n1(u91.m22626r1(arrayList));
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM22622n1, 10));
        for (AbstractC3021g0 abstractC3021g0 : listM22622n1) {
            abstractC3021g0.getClass();
            Object objMo3721b = abstractC3021g0.mo3721b();
            if (objMo3721b == null) {
                v63.m23135m("The field '", abstractC3021g0.mo3722c(), "' does not define a default value");
                throw null;
            }
            arrayList2.add(new nz6(abstractC3021g0.mo3720a(), objMo3721b));
        }
        this.f48228c = arrayList2;
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: a */
    public final pc3 mo337a() {
        pc3 pc3VarMo337a = this.f48227b.mo337a();
        ArrayList<nz6> arrayList = this.f48228c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (nz6 nz6Var : arrayList) {
            arrayList2.add(new ub1(nz6Var.f53450b, new C3255x66a7504a(1, nz6Var.f53449a, vn7.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0)));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        jca jcaVar = jca.f45420a;
        Object di1Var = zIsEmpty ? jcaVar : arrayList2.size() == 1 ? (ki7) u91.m22611c1(arrayList2) : new di1(arrayList2);
        return di1Var instanceof jca ? new cg1() : new ig1(vz1.m23605K(new Pair(new OptionalFormatStructure$formatter$1(1, di1Var, ki7.class, "test", "test(Ljava/lang/Object;)Z", 0), new cg1()), new Pair(new OptionalFormatStructure$formatter$2(1, jcaVar, jca.class, "test", "test(Ljava/lang/Object;)Z", 0), pc3VarMo337a)));
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: b */
    public final t47 mo338b() {
        t47 t47VarMo338b = this.f48227b.mo338b();
        t47 t47VarMo338b2 = new yi1(this.f48226a).mo338b();
        boolean zIsEmpty = this.f48228c.isEmpty();
        EmptyList emptyList = EmptyList.f47638a;
        return new t47(emptyList, vz1.m23605K(t47VarMo338b, nzb.m17712a(vz1.m23605K(t47VarMo338b2, new t47(zIsEmpty ? emptyList : vz1.m23604J(new mfa(new fy4(this, 27))), emptyList)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3257b)) {
            return false;
        }
        C3257b c3257b = (C3257b) obj;
        return this.f48226a.equals(c3257b.f48226a) && this.f48227b.equals(c3257b.f48227b);
    }

    public final int hashCode() {
        return this.f48227b.f8488a.hashCode() + (this.f48226a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.f48226a + ", " + this.f48227b + ')';
    }
}
