package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: dl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0133dl {

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacksC0077bw f11915a;

    /* JADX INFO: renamed from: e */
    public int f11919e;

    /* JADX INFO: renamed from: f */
    public int f11920f;

    /* JADX INFO: renamed from: g */
    private final List f11921g = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final HashSet f11916b = new HashSet();

    /* JADX INFO: renamed from: c */
    public boolean f11917c = false;

    /* JADX INFO: renamed from: d */
    public boolean f11918d = false;

    public C0133dl(int i, int i2, ComponentCallbacksC0077bw componentCallbacksC0077bw, exz exzVar, byte[] bArr) {
        this.f11919e = i;
        this.f11920f = i2;
        this.f11915a = componentCallbacksC0077bw;
        exzVar.m8036a(new ary(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public void mo6274a() {
        if (this.f11918d) {
            return;
        }
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: ");
            sb.append(this);
            sb.append(" has called complete.");
        }
        this.f11918d = true;
        Iterator it = this.f11921g.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo6275b() {
    }

    /* JADX INFO: renamed from: c */
    final void m6324c(Runnable runnable) {
        this.f11921g.add(runnable);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [adj, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m6325d() {
        if (this.f11917c) {
            return;
        }
        this.f11917c = true;
        if (this.f11916b.isEmpty()) {
            mo6274a();
            return;
        }
        ArrayList arrayList = new ArrayList(this.f11916b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            exz exzVar = (exz) arrayList.get(i);
            synchronized (exzVar) {
                if (!exzVar.f20931a) {
                    exzVar.f20931a = true;
                    exzVar.f20932b = true;
                    ?? r6 = exzVar.f20933c;
                    if (r6 != 0) {
                        try {
                            r6.mo291a();
                        } catch (Throwable th) {
                            synchronized (exzVar) {
                                exzVar.f20932b = false;
                                exzVar.notifyAll();
                                throw th;
                            }
                        }
                    }
                    synchronized (exzVar) {
                        exzVar.f20932b = false;
                        exzVar.notifyAll();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    final void m6326e(int i, int i2) {
        switch (i2 - 1) {
            case 1:
                if (this.f11919e == 1) {
                    if (C0111cq.m5275S(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.f11915a);
                        sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sb.append((Object) C0137dp.m6525v(this.f11920f));
                        sb.append(" to ADDING.");
                    }
                    this.f11919e = 2;
                    this.f11920f = 2;
                }
                break;
            case 2:
                if (C0111cq.m5275S(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.f11915a);
                    sb2.append(" mFinalState = ");
                    sb2.append((Object) C0137dp.m6521r(this.f11919e));
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append((Object) C0137dp.m6525v(this.f11920f));
                    sb2.append(" to REMOVING.");
                }
                this.f11919e = 1;
                this.f11920f = 3;
                break;
            default:
                if (this.f11919e != 1) {
                    if (C0111cq.m5275S(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: For fragment ");
                        sb3.append(this.f11915a);
                        sb3.append(" mFinalState = ");
                        sb3.append((Object) C0137dp.m6521r(this.f11919e));
                        sb3.append(" -> ");
                        sb3.append((Object) C0137dp.m6521r(i));
                        sb3.append(". ");
                    }
                    this.f11919e = i;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6327f(exz exzVar) {
        mo6275b();
        this.f11916b.add(exzVar);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + ((Object) C0137dp.m6521r(this.f11919e)) + "} {mLifecycleImpact = " + ((Object) C0137dp.m6525v(this.f11920f)) + "} {mFragment = " + this.f11915a + "}";
    }
}
