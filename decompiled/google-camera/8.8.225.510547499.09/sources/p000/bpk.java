package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bpk {

    /* JADX INFO: renamed from: b */
    public final aed f4056b;

    /* JADX INFO: renamed from: c */
    public final bko f4057c;

    /* JADX INFO: renamed from: d */
    public final bko f4058d;

    /* JADX INFO: renamed from: e */
    public final bko f4059e;

    /* JADX INFO: renamed from: f */
    public final dsx f4060f;

    /* JADX INFO: renamed from: h */
    public final dsx f4062h;

    /* JADX INFO: renamed from: i */
    private final brf f4063i;

    /* JADX INFO: renamed from: j */
    private final bko f4064j;

    /* JADX INFO: renamed from: g */
    public final dsx f4061g = new dsx((byte[]) null, (byte[]) null);

    /* JADX INFO: renamed from: a */
    public final bzr f4055a = new bzr();

    public bpk() {
        aed aedVarM3395a = cbp.m3395a(new aef(20), new bud(2), new cbk());
        this.f4056b = aedVarM3395a;
        this.f4062h = new dsx(aedVarM3395a);
        this.f4058d = new bko((char[]) null, (char[]) null);
        this.f4060f = new dsx((byte[]) null);
        this.f4057c = new bko((byte[]) null, (char[]) null);
        this.f4063i = new brf();
        this.f4059e = new bko((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.f4064j = new bko((byte[]) null, (byte[]) null, (char[]) null);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f4060f.m6707v(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final brc m2833a(Object obj) {
        return this.f4063i.m2951a(obj);
    }

    /* JADX INFO: renamed from: b */
    public final List m2834b() {
        List listM2615i = this.f4064j.m2615i();
        if (listM2615i.isEmpty()) {
            throw new bpg();
        }
        return listM2615i;
    }

    /* JADX INFO: renamed from: c */
    public final List m2835c(Object obj) {
        List listM6679C = this.f4062h.m6679C(obj.getClass());
        if (listM6679C.isEmpty()) {
            throw new bph(obj);
        }
        int size = listM6679C.size();
        List listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            bvl bvlVar = (bvl) listM6679C.get(i);
            if (bvlVar.mo3083a(obj)) {
                if (z) {
                    listEmptyList = new ArrayList(size - i);
                }
                listEmptyList.add(bvlVar);
                z = false;
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new bph(obj, listM6679C);
        }
        return listEmptyList;
    }

    /* JADX INFO: renamed from: d */
    public final void m2836d(Class cls, bqf bqfVar) {
        this.f4058d.m2618l(cls, bqfVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m2837e(Class cls, bqu bquVar) {
        this.f4057c.m2614h(cls, bquVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m2838f(Class cls, Class cls2, bqt bqtVar) {
        m2840h("legacy_append", cls, cls2, bqtVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m2839g(Class cls, Class cls2, bvm bvmVar) {
        this.f4062h.m6680D(cls, cls2, bvmVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m2840h(String str, Class cls, Class cls2, bqt bqtVar) {
        this.f4060f.m6706u(str, bqtVar, cls, cls2);
    }

    /* JADX INFO: renamed from: i */
    public final void m2841i(bqh bqhVar) {
        this.f4064j.m2616j(bqhVar);
    }

    /* JADX INFO: renamed from: j */
    public final void m2842j(brb brbVar) {
        this.f4063i.m2952b(brbVar);
    }

    /* JADX INFO: renamed from: k */
    public final void m2843k(Class cls, Class cls2, bys bysVar) {
        this.f4059e.m2621o(cls, cls2, bysVar);
    }
}
