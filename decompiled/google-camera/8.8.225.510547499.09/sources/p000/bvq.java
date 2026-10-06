package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvq {

    /* JADX INFO: renamed from: a */
    private static final bvl f4550a = new bvp(0);

    /* JADX INFO: renamed from: b */
    private final List f4551b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Set f4552c = new HashSet();

    /* JADX INFO: renamed from: d */
    private final aed f4553d;

    public bvq(aed aedVar) {
        this.f4553d = aedVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bvm, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    private final bvl m3099e(C1058va c1058va) {
        bvl bvlVarMo3080b = c1058va.f47803b.mo3080b(this);
        bzq.m3278r(bvlVarMo3080b);
        return bvlVarMo3080b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized bvl m3100a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1058va c1058va : this.f4551b) {
                if (this.f4552c.contains(c1058va)) {
                    z = true;
                } else if (c1058va.m19484l(cls) && ((Class) c1058va.f47802a).isAssignableFrom(cls2)) {
                    this.f4552c.add(c1058va);
                    arrayList.add(m3099e(c1058va));
                    this.f4552c.remove(c1058va);
                }
            }
            if (arrayList.size() > 1) {
                return new bvo(arrayList, this.f4553d);
            }
            if (arrayList.size() == 1) {
                return (bvl) arrayList.get(0);
            }
            if (!z) {
                throw new bph(cls, cls2);
            }
            return f4550a;
        } catch (Throwable th) {
            this.f4552c.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized List m3101b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1058va c1058va : this.f4551b) {
                if (!this.f4552c.contains(c1058va) && c1058va.m19484l(cls)) {
                    this.f4552c.add(c1058va);
                    arrayList.add(m3099e(c1058va));
                    this.f4552c.remove(c1058va);
                }
            }
        } catch (Throwable th) {
            this.f4552c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized List m3102c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1058va c1058va : this.f4551b) {
            if (!arrayList.contains(c1058va.f47802a) && c1058va.m19484l(cls)) {
                arrayList.add(c1058va.f47802a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3103d(Class cls, Class cls2, bvm bvmVar) {
        C1058va c1058va = new C1058va(cls, cls2, bvmVar);
        List list = this.f4551b;
        list.add(list.size(), c1058va);
    }
}
