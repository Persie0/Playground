package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: cv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0116cv {

    /* JADX INFO: renamed from: a */
    public final ArrayList f9743a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final HashMap f9744b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f9745c = new HashMap();

    /* JADX INFO: renamed from: d */
    public C0113cs f9746d;

    /* JADX INFO: renamed from: a */
    public final Bundle m5545a(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f9745c.put(str, bundle) : (Bundle) this.f9745c.remove(str);
    }

    /* JADX INFO: renamed from: b */
    public final ComponentCallbacksC0077bw m5546b(String str) {
        jew jewVar = (jew) this.f9744b.get(str);
        if (jewVar != null) {
            return (ComponentCallbacksC0077bw) jewVar.f33848c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    final ComponentCallbacksC0077bw m5547c(String str) {
        for (jew jewVar : this.f9744b.values()) {
            if (jewVar != null) {
                Object objM5547c = jewVar.f33848c;
                ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) objM5547c;
                if (!str.equals(componentCallbacksC0077bw.f4609k)) {
                    objM5547c = componentCallbacksC0077bw.f4573A.f8781a.m5547c(str);
                }
                if (objM5547c != null) {
                    return (ComponentCallbacksC0077bw) objM5547c;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final List m5548d() {
        ArrayList arrayList = new ArrayList();
        for (jew jewVar : this.f9744b.values()) {
            if (jewVar != null) {
                arrayList.add(jewVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    final List m5549e() {
        ArrayList arrayList = new ArrayList();
        for (jew jewVar : this.f9744b.values()) {
            if (jewVar != null) {
                arrayList.add(jewVar.f33848c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    final List m5550f() {
        ArrayList arrayList;
        if (this.f9743a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f9743a) {
            arrayList = new ArrayList(this.f9743a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    final void m5551g(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (this.f9743a.contains(componentCallbacksC0077bw)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment already added: ");
            sb.append(componentCallbacksC0077bw);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(componentCallbacksC0077bw)));
        }
        synchronized (this.f9743a) {
            this.f9743a.add(componentCallbacksC0077bw);
        }
        componentCallbacksC0077bw.f4615q = true;
    }

    /* JADX INFO: renamed from: h */
    final void m5552h() {
        this.f9744b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: i */
    final void m5553i(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        synchronized (this.f9743a) {
            this.f9743a.remove(componentCallbacksC0077bw);
        }
        componentCallbacksC0077bw.f4615q = false;
    }

    /* JADX INFO: renamed from: j */
    final boolean m5554j(String str) {
        return this.f9744b.get(str) != null;
    }

    /* JADX INFO: renamed from: k */
    public final jew m5555k(String str) {
        return (jew) this.f9744b.get(str);
    }

    /* JADX INFO: renamed from: l */
    final void m5556l(jew jewVar) {
        Object obj = jewVar.f33848c;
        ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) obj;
        if (m5554j(componentCallbacksC0077bw.f4609k)) {
            return;
        }
        this.f9744b.put(componentCallbacksC0077bw.f4609k, jewVar);
        if (componentCallbacksC0077bw.f4581I) {
            if (componentCallbacksC0077bw.f4580H) {
                this.f9746d.m5446a(componentCallbacksC0077bw);
            } else {
                this.f9746d.m5449e(componentCallbacksC0077bw);
            }
            componentCallbacksC0077bw.f4581I = false;
        }
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(obj);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5557m(jew jewVar) {
        Object obj = jewVar.f33848c;
        ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) obj;
        if (componentCallbacksC0077bw.f4580H) {
            this.f9746d.m5449e(componentCallbacksC0077bw);
        }
        if (((jew) this.f9744b.put(componentCallbacksC0077bw.f4609k, null)) != null && C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(obj);
        }
    }
}
