package p000;

import android.os.Looper;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class wb5 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final boolean f66584b;

    /* JADX INFO: renamed from: c */
    public rz2 f66585c;

    /* JADX INFO: renamed from: d */
    public Lifecycle$State f66586d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f66587e;

    /* JADX INFO: renamed from: f */
    public int f66588f;

    /* JADX INFO: renamed from: g */
    public boolean f66589g;

    /* JADX INFO: renamed from: h */
    public boolean f66590h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f66591i;

    /* JADX INFO: renamed from: j */
    public final C3244l f66592j;

    public wb5(ub5 ub5Var, boolean z) {
        super(6);
        this.f66584b = z;
        this.f66585c = new rz2();
        Lifecycle$State lifecycle$State = Lifecycle$State.INITIALIZED;
        this.f66586d = lifecycle$State;
        this.f66591i = new ArrayList();
        this.f66587e = new WeakReference(ub5Var);
        this.f66592j = AbstractC3352my.m17114d(lifecycle$State);
    }

    /* JADX INFO: renamed from: E */
    public final Lifecycle$State m23831E(tb5 tb5Var) {
        HashMap map = this.f66585c.f60071e;
        mk8 mk8Var = map.containsKey(tb5Var) ? ((mk8) map.get(tb5Var)).f51444d : null;
        Lifecycle$State lifecycle$State = mk8Var != null ? ((vb5) mk8Var.f51442b).f65165a : null;
        ArrayList arrayList = this.f66591i;
        Lifecycle$State lifecycle$State2 = arrayList.isEmpty() ? null : (Lifecycle$State) AbstractC3393o1.m17731f(1, arrayList);
        Lifecycle$State lifecycle$State3 = this.f66586d;
        lifecycle$State3.getClass();
        if (lifecycle$State == null || lifecycle$State.compareTo(lifecycle$State3) >= 0) {
            lifecycle$State = lifecycle$State3;
        }
        return (lifecycle$State2 == null || lifecycle$State2.compareTo(lifecycle$State) >= 0) ? lifecycle$State : lifecycle$State2;
    }

    /* JADX INFO: renamed from: F */
    public final void m23832F(String str) {
        if (this.f66584b) {
            C3051gu.m12863O().f41318s.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            gm5.m12751g(wq1.m24118n("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m23833G(Lifecycle$Event lifecycle$Event) {
        lifecycle$Event.getClass();
        m23832F("handleLifecycleEvent");
        m23834H(lifecycle$Event.getTargetState());
    }

    /* JADX INFO: renamed from: H */
    public final void m23834H(Lifecycle$State lifecycle$State) {
        if (this.f66586d == lifecycle$State) {
            return;
        }
        ub5 ub5Var = (ub5) this.f66587e.get();
        Lifecycle$State lifecycle$State2 = this.f66586d;
        lifecycle$State2.getClass();
        lifecycle$State.getClass();
        if (lifecycle$State2 == Lifecycle$State.INITIALIZED && lifecycle$State == Lifecycle$State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle$State.CREATED + "' to be moved to '" + lifecycle$State + "' in component " + ub5Var).toString());
        }
        Lifecycle$State lifecycle$State3 = Lifecycle$State.DESTROYED;
        if (lifecycle$State2 == lifecycle$State3 && lifecycle$State2 != lifecycle$State) {
            throw new IllegalStateException(("State is '" + lifecycle$State3 + "' and cannot be moved to `" + lifecycle$State + "` in component " + ub5Var).toString());
        }
        this.f66586d = lifecycle$State;
        if (this.f66589g || this.f66588f != 0) {
            this.f66590h = true;
            return;
        }
        this.f66589g = true;
        m23836J();
        this.f66589g = false;
        if (this.f66586d == lifecycle$State3) {
            this.f66585c = new rz2();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m23835I(Lifecycle$State lifecycle$State) {
        lifecycle$State.getClass();
        m23832F("setCurrentState");
        m23834H(lifecycle$State);
    }

    /* JADX INFO: renamed from: J */
    public final void m23836J() {
        ub5 ub5Var = (ub5) this.f66587e.get();
        if (ub5Var == null) {
            C3386nv.m17633t("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            rz2 rz2Var = this.f66585c;
            if (rz2Var.f56355d != 0) {
                mk8 mk8Var = rz2Var.f56352a;
                mk8Var.getClass();
                Lifecycle$State lifecycle$State = ((vb5) mk8Var.f51442b).f65165a;
                mk8 mk8Var2 = this.f66585c.f56353b;
                mk8Var2.getClass();
                Lifecycle$State lifecycle$State2 = ((vb5) mk8Var2.f51442b).f65165a;
                if (lifecycle$State == lifecycle$State2 && this.f66586d == lifecycle$State2) {
                    break;
                }
                this.f66590h = false;
                Lifecycle$State lifecycle$State3 = this.f66586d;
                mk8 mk8Var3 = this.f66585c.f56352a;
                mk8Var3.getClass();
                int iCompareTo = lifecycle$State3.compareTo(((vb5) mk8Var3.f51442b).f65165a);
                ArrayList arrayList = this.f66591i;
                if (iCompareTo < 0) {
                    rz2 rz2Var2 = this.f66585c;
                    lk8 lk8Var = new lk8(rz2Var2.f56353b, rz2Var2.f56352a, 1);
                    rz2Var2.f56354c.put(lk8Var, Boolean.FALSE);
                    while (lk8Var.hasNext() && !this.f66590h) {
                        Map.Entry entry = (Map.Entry) lk8Var.next();
                        entry.getClass();
                        tb5 tb5Var = (tb5) entry.getKey();
                        vb5 vb5Var = (vb5) entry.getValue();
                        while (vb5Var.f65165a.compareTo(this.f66586d) > 0 && !this.f66590h && this.f66585c.f60071e.containsKey(tb5Var)) {
                            jb5 jb5Var = Lifecycle$Event.Companion;
                            Lifecycle$State lifecycle$State4 = vb5Var.f65165a;
                            jb5Var.getClass();
                            Lifecycle$Event lifecycle$EventM14371a = jb5.m14371a(lifecycle$State4);
                            if (lifecycle$EventM14371a == null) {
                                v63.m23127A(vb5Var.f65165a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(lifecycle$EventM14371a.getTargetState());
                                vb5Var.m23216a(ub5Var, lifecycle$EventM14371a);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                mk8 mk8Var4 = this.f66585c.f56353b;
                if (!this.f66590h && mk8Var4 != null && this.f66586d.compareTo(((vb5) mk8Var4.f51442b).f65165a) > 0) {
                    rz2 rz2Var3 = this.f66585c;
                    rz2Var3.getClass();
                    nk8 nk8Var = new nk8(rz2Var3);
                    rz2Var3.f56354c.put(nk8Var, Boolean.FALSE);
                    while (nk8Var.hasNext() && !this.f66590h) {
                        Map.Entry entry2 = (Map.Entry) nk8Var.next();
                        tb5 tb5Var2 = (tb5) entry2.getKey();
                        vb5 vb5Var2 = (vb5) entry2.getValue();
                        while (vb5Var2.f65165a.compareTo(this.f66586d) < 0 && !this.f66590h && this.f66585c.f60071e.containsKey(tb5Var2)) {
                            arrayList.add(vb5Var2.f65165a);
                            jb5 jb5Var2 = Lifecycle$Event.Companion;
                            Lifecycle$State lifecycle$State5 = vb5Var2.f65165a;
                            jb5Var2.getClass();
                            Lifecycle$Event lifecycle$EventM14372b = jb5.m14372b(lifecycle$State5);
                            if (lifecycle$EventM14372b == null) {
                                v63.m23127A(vb5Var2.f65165a, "no event up from ");
                                return;
                            } else {
                                vb5Var2.m23216a(ub5Var, lifecycle$EventM14372b);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f66590h = false;
        this.f66592j.m15571i(this.f66586d);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: g */
    public final void mo21323g(tb5 tb5Var) {
        rb5 e72Var;
        ub5 ub5Var;
        tb5Var.getClass();
        m23832F("addObserver");
        Lifecycle$State lifecycle$State = this.f66586d;
        Lifecycle$State lifecycle$State2 = Lifecycle$State.DESTROYED;
        if (lifecycle$State != lifecycle$State2) {
            lifecycle$State2 = Lifecycle$State.INITIALIZED;
        }
        lifecycle$State2.getClass();
        vb5 vb5Var = new vb5();
        HashMap map = cc5.f9882a;
        boolean z = tb5Var instanceof rb5;
        boolean z2 = tb5Var instanceof c72;
        Object obj = null;
        if (z && z2) {
            e72Var = new e72((c72) tb5Var, (rb5) tb5Var);
        } else if (z2) {
            e72Var = new e72((c72) tb5Var, null);
        } else if (z) {
            e72Var = (rb5) tb5Var;
        } else {
            Class<?> cls = tb5Var.getClass();
            int i = 2;
            if (cc5.m4526b(cls) == 2) {
                Object obj2 = cc5.f9883b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    cc5.m4525a((Constructor) list.get(0), tb5Var);
                    throw null;
                }
                int size = list.size();
                kk3[] kk3VarArr = new kk3[size];
                if (size > 0) {
                    cc5.m4525a((Constructor) list.get(0), tb5Var);
                    throw null;
                }
                e72Var = new d28(kk3VarArr, i);
            } else {
                e72Var = new e72(tb5Var);
            }
        }
        vb5Var.f65166b = e72Var;
        vb5Var.f65165a = lifecycle$State2;
        rz2 rz2Var = this.f66585c;
        mk8 mk8VarMo19364d = rz2Var.mo19364d(tb5Var);
        if (mk8VarMo19364d != null) {
            obj = mk8VarMo19364d.f51442b;
        } else {
            HashMap map2 = rz2Var.f60071e;
            mk8 mk8Var = new mk8(tb5Var, vb5Var);
            rz2Var.f56355d++;
            mk8 mk8Var2 = rz2Var.f56353b;
            if (mk8Var2 == null) {
                rz2Var.f56352a = mk8Var;
                rz2Var.f56353b = mk8Var;
            } else {
                mk8Var2.f51443c = mk8Var;
                mk8Var.f51444d = mk8Var2;
                rz2Var.f56353b = mk8Var;
            }
            map2.put(tb5Var, mk8Var);
        }
        if (((vb5) obj) == null && (ub5Var = (ub5) this.f66587e.get()) != null) {
            boolean z3 = this.f66588f != 0 || this.f66589g;
            Lifecycle$State lifecycle$StateM23831E = m23831E(tb5Var);
            this.f66588f++;
            while (vb5Var.f65165a.compareTo(lifecycle$StateM23831E) < 0 && this.f66585c.f60071e.containsKey(tb5Var)) {
                Lifecycle$State lifecycle$State3 = vb5Var.f65165a;
                ArrayList arrayList = this.f66591i;
                arrayList.add(lifecycle$State3);
                jb5 jb5Var = Lifecycle$Event.Companion;
                Lifecycle$State lifecycle$State4 = vb5Var.f65165a;
                jb5Var.getClass();
                Lifecycle$Event lifecycle$EventM14372b = jb5.m14372b(lifecycle$State4);
                if (lifecycle$EventM14372b == null) {
                    v63.m23127A(vb5Var.f65165a, "no event up from ");
                    return;
                } else {
                    vb5Var.m23216a(ub5Var, lifecycle$EventM14372b);
                    arrayList.remove(arrayList.size() - 1);
                    lifecycle$StateM23831E = m23831E(tb5Var);
                }
            }
            if (!z3) {
                m23836J();
            }
            this.f66588f--;
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: q */
    public final Lifecycle$State mo21327q() {
        return this.f66586d;
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: x */
    public final void mo21331x(tb5 tb5Var) {
        tb5Var.getClass();
        m23832F("removeObserver");
        this.f66585c.mo19365f(tb5Var);
    }
}
