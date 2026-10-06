package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cbe {

    /* JADX INFO: renamed from: a */
    private final Map f4947a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    private final long f4948b;

    /* JADX INFO: renamed from: c */
    private long f4949c;

    public cbe(long j) {
        this.f4948b = j;
    }

    /* JADX INFO: renamed from: a */
    protected int mo3071a(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    protected void mo3073c(Object obj, Object obj2) {
    }

    /* JADX INFO: renamed from: e */
    public final synchronized long m3371e() {
        return this.f4948b;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized Object m3372f(Object obj) {
        kym kymVar = (kym) this.f4947a.get(obj);
        if (kymVar == null) {
            return null;
        }
        return kymVar.f37734b;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Object m3373g(Object obj, Object obj2) {
        int iMo3071a = mo3071a(obj2);
        long j = iMo3071a;
        if (j >= this.f4948b) {
            mo3073c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f4949c += j;
        }
        kym kymVar = (kym) this.f4947a.put(obj, obj2 == null ? null : new kym(obj2, iMo3071a));
        if (kymVar != null) {
            this.f4949c -= (long) kymVar.f37733a;
            if (!kymVar.f37734b.equals(obj2)) {
                mo3073c(obj, kymVar.f37734b);
            }
        }
        m3376j(this.f4948b);
        if (kymVar != null) {
            return kymVar.f37734b;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Object m3374h(Object obj) {
        kym kymVar = (kym) this.f4947a.remove(obj);
        if (kymVar == null) {
            return null;
        }
        this.f4949c -= (long) kymVar.f37733a;
        return kymVar.f37734b;
    }

    /* JADX INFO: renamed from: i */
    public final void m3375i() {
        m3376j(0L);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m3376j(long j) {
        while (this.f4949c > j) {
            Iterator it = this.f4947a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            kym kymVar = (kym) entry.getValue();
            this.f4949c -= (long) kymVar.f37733a;
            Object key = entry.getKey();
            it.remove();
            mo3073c(key, kymVar.f37734b);
        }
    }
}
