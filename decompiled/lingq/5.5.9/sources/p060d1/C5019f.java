package p060d1;

import android.support.v4.media.session.C0166e;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p171i6.InterfaceC6199d;
import p258m6.C7492l;

/* JADX INFO: renamed from: d1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5019f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32812a;

    /* JADX INFO: renamed from: b */
    public boolean f32813b;

    /* JADX INFO: renamed from: c */
    public final Object f32814c;

    /* JADX INFO: renamed from: d */
    public final Object f32815d;

    public C5019f() {
        this.f32812a = 1;
        this.f32814c = Collections.newSetFromMap(new WeakHashMap());
        this.f32815d = new HashSet();
    }

    public C5019f(LinkedHashMap linkedHashMap, C5030q c5030q) {
        this.f32812a = 0;
        this.f32814c = linkedHashMap;
        this.f32815d = c5030q;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10699a(InterfaceC6199d interfaceC6199d) {
        boolean z10 = true;
        if (interfaceC6199d == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f32814c).remove(interfaceC6199d);
        if (!((Set) this.f32815d).remove(interfaceC6199d)) {
            if (!zRemove) {
                z10 = false;
            }
        }
        if (z10) {
            interfaceC6199d.clear();
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10700b(long j10) {
        C5031r c5031r;
        List<C5031r> list = ((C5030q) this.f32815d).f32851a;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c5031r = null;
                break;
            }
            c5031r = list.get(i10);
            if (C5027n.m10711a(c5031r.f32853a, j10)) {
                break;
            }
            i10++;
        }
        C5031r c5031r2 = c5031r;
        return c5031r2 != null ? c5031r2.f32860h : false;
    }

    /* JADX INFO: renamed from: c */
    public final void m10701c() {
        for (InterfaceC6199d interfaceC6199d : C7492l.m14883d((Set) this.f32814c)) {
            if (!interfaceC6199d.mo6397k() && !interfaceC6199d.mo6395i()) {
                interfaceC6199d.clear();
                if (this.f32813b) {
                    ((Set) this.f32815d).add(interfaceC6199d);
                } else {
                    interfaceC6199d.mo6396j();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10702d() {
        this.f32813b = false;
        while (true) {
            for (InterfaceC6199d interfaceC6199d : C7492l.m14883d((Set) this.f32814c)) {
                if (!interfaceC6199d.mo6397k() && !interfaceC6199d.isRunning()) {
                    interfaceC6199d.mo6396j();
                }
            }
            ((Set) this.f32815d).clear();
            return;
        }
    }

    public final String toString() {
        switch (this.f32812a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(super.toString());
                sb2.append("{numRequests=");
                sb2.append(((Set) this.f32814c).size());
                sb2.append(", isPaused=");
                return C0166e.m769p(sb2, this.f32813b, "}");
            default:
                return super.toString();
        }
    }
}
