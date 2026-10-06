package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class arx extends asg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2213a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ArrayList f2214b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f2215c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ ArrayList f2216d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ asa f2217e;

    public arx(asa asaVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2217e = asaVar;
        this.f2213a = obj;
        this.f2214b = arrayList;
        this.f2215c = obj2;
        this.f2216d = arrayList2;
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: a */
    public final void mo1893a(asf asfVar) {
        asfVar.m1955y(this);
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: e */
    public final void mo1907e(asf asfVar) {
        Object obj = this.f2213a;
        if (obj != null) {
            this.f2217e.m1916g(obj, this.f2214b, (ArrayList) null);
        }
        Object obj2 = this.f2215c;
        if (obj2 != null) {
            this.f2217e.m1916g(obj2, this.f2216d, (ArrayList) null);
        }
    }
}
