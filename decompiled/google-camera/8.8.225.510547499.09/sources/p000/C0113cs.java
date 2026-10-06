package p000;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: cs */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0113cs extends alr {

    /* JADX INFO: renamed from: a */
    public static final alt f9205a = new amg(1);

    /* JADX INFO: renamed from: e */
    public final boolean f9209e;

    /* JADX INFO: renamed from: b */
    public final HashMap f9206b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f9207c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f9208d = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f9210f = false;

    /* JADX INFO: renamed from: g */
    public boolean f9211g = false;

    public C0113cs(boolean z) {
        this.f9209e = z;
    }

    /* JADX INFO: renamed from: a */
    final void m5446a(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (this.f9211g || this.f9206b.containsKey(componentCallbacksC0077bw.f4609k)) {
            return;
        }
        this.f9206b.put(componentCallbacksC0077bw.f4609k, componentCallbacksC0077bw);
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(componentCallbacksC0077bw);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5447b(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (C0111cq.m5275S(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(componentCallbacksC0077bw);
        }
        m5448c(componentCallbacksC0077bw.f4609k);
    }

    /* JADX INFO: renamed from: c */
    public final void m5448c(String str) {
        C0113cs c0113cs = (C0113cs) this.f9207c.get(str);
        if (c0113cs != null) {
            c0113cs.mo923d();
            this.f9207c.remove(str);
        }
        bkn bknVar = (bkn) this.f9208d.get(str);
        if (bknVar != null) {
            bknVar.m2591l();
            this.f9208d.remove(str);
        }
    }

    @Override // p000.alr
    /* JADX INFO: renamed from: d */
    public final void mo923d() {
        if (C0111cq.m5275S(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f9210f = true;
    }

    /* JADX INFO: renamed from: e */
    final void m5449e(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (this.f9211g || this.f9206b.remove(componentCallbacksC0077bw.f4609k) == null || !C0111cq.m5275S(2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Updating retained Fragments: Removed ");
        sb.append(componentCallbacksC0077bw);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0113cs c0113cs = (C0113cs) obj;
        return this.f9206b.equals(c0113cs.f9206b) && this.f9207c.equals(c0113cs.f9207c) && this.f9208d.equals(c0113cs.f9208d);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5450f(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (this.f9206b.containsKey(componentCallbacksC0077bw.f4609k) && this.f9209e) {
            return this.f9210f;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f9206b.hashCode() * 31) + this.f9207c.hashCode()) * 31) + this.f9208d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f9206b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f9207c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f9208d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
