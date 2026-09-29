package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.datetime.format.C3251b;
import p000.C3386nv;
import p000.au3;
import p000.cg1;
import p000.d33;
import p000.e79;
import p000.ht6;
import p000.nzb;
import p000.pc3;
import p000.t47;
import p000.ta0;
import p000.u91;
import p000.vz1;
import p000.xl6;
import p000.ydd;

/* JADX INFO: renamed from: kotlinx.datetime.internal.format.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3258c implements xl6 {

    /* JADX INFO: renamed from: a */
    public final ta0 f48229a;

    /* JADX INFO: renamed from: b */
    public final Set f48230b;

    public C3258c(ta0 ta0Var) {
        this.f48229a = ta0Var;
        ListBuilder listBuilderM23650t = vz1.m23650t();
        ydd.m25104a(listBuilderM23650t, ta0Var);
        ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = listBuilderM23635i.listIterator(0);
        while (true) {
            au3 au3Var = (au3) listIterator;
            if (!au3Var.hasNext()) {
                break;
            }
            C3251b c3251bMo3723d = ((d33) au3Var.next()).mo10073c().mo3723d();
            if (c3251bMo3723d != null) {
                arrayList.add(c3251bMo3723d);
            }
        }
        Set setM22627s1 = u91.m22627s1(arrayList);
        this.f48230b = setM22627s1;
        if (setM22627s1.isEmpty()) {
            C3386nv.m17626m("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: a */
    public final pc3 mo337a() {
        this.f48229a.f62036a.mo10071a();
        return new cg1();
    }

    @Override // p000.mc3
    /* JADX INFO: renamed from: b */
    public final t47 mo338b() {
        return nzb.m17712a(vz1.m23605K(new t47(vz1.m23604J(new e79(new ht6(this, 26), "sign for " + this.f48230b)), EmptyList.f47638a), this.f48229a.f62036a.mo10072b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3258c) {
            return this.f48229a.equals(((C3258c) obj).f48229a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f48229a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.f48229a + ')';
    }
}
