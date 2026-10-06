package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsc {

    /* JADX INFO: renamed from: a */
    public final List f4276a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f4277b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public bpc f4278c;

    /* JADX INFO: renamed from: d */
    public Object f4279d;

    /* JADX INFO: renamed from: e */
    public int f4280e;

    /* JADX INFO: renamed from: f */
    public int f4281f;

    /* JADX INFO: renamed from: g */
    public Class f4282g;

    /* JADX INFO: renamed from: h */
    public bqr f4283h;

    /* JADX INFO: renamed from: i */
    public Map f4284i;

    /* JADX INFO: renamed from: j */
    public Class f4285j;

    /* JADX INFO: renamed from: k */
    public boolean f4286k;

    /* JADX INFO: renamed from: l */
    public boolean f4287l;

    /* JADX INFO: renamed from: m */
    public bqn f4288m;

    /* JADX INFO: renamed from: n */
    public bpe f4289n;

    /* JADX INFO: renamed from: o */
    public bsk f4290o;

    /* JADX INFO: renamed from: p */
    public boolean f4291p;

    /* JADX INFO: renamed from: q */
    public boolean f4292q;

    /* JADX INFO: renamed from: r */
    public bsm f4293r;

    /* JADX INFO: renamed from: a */
    final bqv m2970a(Class cls) {
        bqv bqvVar = (bqv) this.f4284i.get(cls);
        if (bqvVar == null) {
            for (Map.Entry entry : this.f4284i.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    bqvVar = (bqv) entry.getValue();
                    break;
                }
            }
        }
        if (bqvVar != null) {
            return bqvVar;
        }
        if (!this.f4284i.isEmpty() || !this.f4291p) {
            return bwg.f4650b;
        }
        throw new IllegalArgumentException("Missing transformation for " + String.valueOf(cls) + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX INFO: renamed from: b */
    final bsx m2971b(Class cls) {
        bsx bsxVar;
        bpk bpkVarM2831a = this.f4278c.m2831a();
        Class cls2 = this.f4282g;
        Class cls3 = this.f4285j;
        bzr bzrVar = bpkVarM2831a.f4055a;
        cbg cbgVar = (cbg) bzrVar.f4828c.getAndSet(null);
        if (cbgVar == null) {
            cbgVar = new cbg();
        }
        cbgVar.m3379a(cls, cls2, cls3);
        synchronized (bzrVar.f4827b) {
            bsxVar = (bsx) bzrVar.f4827b.get(cbgVar);
        }
        bzrVar.f4828c.set(cbgVar);
        bzr bzrVar2 = bpkVarM2831a.f4055a;
        if (bzr.f4826a.equals(bsxVar)) {
            return null;
        }
        if (bsxVar != null) {
            return bsxVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : bpkVarM2831a.f4060f.m6705t(cls, cls2)) {
            for (Class cls5 : bpkVarM2831a.f4059e.m2620n(cls4, cls3)) {
                arrayList.add(new bsg(cls, cls4, cls5, bpkVarM2831a.f4060f.m6704s(cls, cls4), bpkVarM2831a.f4059e.m2619m(cls4, cls5), bpkVarM2831a.f4056b));
            }
        }
        bsx bsxVar2 = arrayList.isEmpty() ? null : new bsx(cls, cls2, cls3, arrayList, bpkVarM2831a.f4056b);
        bzr bzrVar3 = bpkVarM2831a.f4055a;
        synchronized (bzrVar3.f4827b) {
            bzrVar3.f4827b.put(new cbg(cls, cls2, cls3), bsxVar2 != null ? bsxVar2 : bzr.f4826a);
        }
        return bsxVar2;
    }

    /* JADX INFO: renamed from: c */
    final btg m2972c() {
        return this.f4278c.f4041b;
    }

    /* JADX INFO: renamed from: d */
    final btx m2973d() {
        return this.f4293r.m2999a();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    final List m2974e() {
        int i;
        if (!this.f4287l) {
            this.f4287l = true;
            this.f4277b.clear();
            List listM2975f = m2975f();
            int size = listM2975f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1058va c1058va = (C1058va) listM2975f.get(i2);
                if (this.f4277b.contains(c1058va.f47803b)) {
                    i = 0;
                } else {
                    this.f4277b.add(c1058va.f47803b);
                    i = 0;
                }
                while (i < c1058va.f47804c.size()) {
                    if (!this.f4277b.contains(c1058va.f47804c.get(i))) {
                        this.f4277b.add((bqn) c1058va.f47804c.get(i));
                    }
                    i++;
                }
            }
        }
        return this.f4277b;
    }

    /* JADX INFO: renamed from: f */
    final List m2975f() {
        if (!this.f4286k) {
            this.f4286k = true;
            this.f4276a.clear();
            List listM2835c = this.f4278c.m2831a().m2835c(this.f4279d);
            int size = listM2835c.size();
            for (int i = 0; i < size; i++) {
                C1058va c1058vaMo3084b = ((bvl) listM2835c.get(i)).mo3084b(this.f4279d, this.f4280e, this.f4281f, this.f4283h);
                if (c1058vaMo3084b != null) {
                    this.f4276a.add(c1058vaMo3084b);
                }
            }
        }
        return this.f4276a;
    }

    /* JADX INFO: renamed from: g */
    final List m2976g(File file) {
        return this.f4278c.m2831a().m2835c(file);
    }

    /* JADX INFO: renamed from: h */
    final boolean m2977h(Class cls) {
        return m2971b(cls) != null;
    }
}
