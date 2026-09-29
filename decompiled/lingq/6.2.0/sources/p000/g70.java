package p000;

import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.lifecycle.Lifecycle$State;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g70 implements ie3 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f40287a;

    /* JADX INFO: renamed from: b */
    public int f40288b;

    /* JADX INFO: renamed from: c */
    public int f40289c;

    /* JADX INFO: renamed from: d */
    public int f40290d;

    /* JADX INFO: renamed from: e */
    public int f40291e;

    /* JADX INFO: renamed from: f */
    public int f40292f;

    /* JADX INFO: renamed from: g */
    public boolean f40293g;

    /* JADX INFO: renamed from: h */
    public boolean f40294h;

    /* JADX INFO: renamed from: i */
    public String f40295i;

    /* JADX INFO: renamed from: j */
    public int f40296j;

    /* JADX INFO: renamed from: k */
    public CharSequence f40297k;

    /* JADX INFO: renamed from: l */
    public int f40298l;

    /* JADX INFO: renamed from: m */
    public CharSequence f40299m;

    /* JADX INFO: renamed from: n */
    public ArrayList f40300n;

    /* JADX INFO: renamed from: o */
    public ArrayList f40301o;

    /* JADX INFO: renamed from: p */
    public boolean f40302p;

    /* JADX INFO: renamed from: q */
    public ArrayList f40303q;

    /* JADX INFO: renamed from: r */
    public final AbstractC0638f f40304r;

    /* JADX INFO: renamed from: s */
    public boolean f40305s;

    /* JADX INFO: renamed from: t */
    public int f40306t;

    /* JADX INFO: renamed from: u */
    public boolean f40307u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g70(g70 g70Var) {
        this();
        g70Var.f40304r.m2140I();
        hd3 hd3Var = g70Var.f40304r.f5763x;
        if (hd3Var != null) {
            hd3Var.f42210L.getClassLoader();
        }
        for (vf3 vf3Var : g70Var.f40287a) {
            ArrayList arrayList = this.f40287a;
            vf3 vf3Var2 = new vf3();
            vf3Var2.f65304a = vf3Var.f65304a;
            vf3Var2.f65305b = vf3Var.f65305b;
            vf3Var2.f65306c = vf3Var.f65306c;
            vf3Var2.f65307d = vf3Var.f65307d;
            vf3Var2.f65308e = vf3Var.f65308e;
            vf3Var2.f65309f = vf3Var.f65309f;
            vf3Var2.f65310g = vf3Var.f65310g;
            vf3Var2.f65311h = vf3Var.f65311h;
            vf3Var2.f65312i = vf3Var.f65312i;
            arrayList.add(vf3Var2);
        }
        this.f40288b = g70Var.f40288b;
        this.f40289c = g70Var.f40289c;
        this.f40290d = g70Var.f40290d;
        this.f40291e = g70Var.f40291e;
        this.f40292f = g70Var.f40292f;
        this.f40293g = g70Var.f40293g;
        this.f40294h = g70Var.f40294h;
        this.f40295i = g70Var.f40295i;
        this.f40298l = g70Var.f40298l;
        this.f40299m = g70Var.f40299m;
        this.f40296j = g70Var.f40296j;
        this.f40297k = g70Var.f40297k;
        if (g70Var.f40300n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f40300n = arrayList2;
            arrayList2.addAll(g70Var.f40300n);
        }
        if (g70Var.f40301o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f40301o = arrayList3;
            arrayList3.addAll(g70Var.f40301o);
        }
        this.f40302p = g70Var.f40302p;
        this.f40306t = -1;
        this.f40307u = false;
        this.f40304r = g70Var.f40304r;
        this.f40305s = g70Var.f40305s;
        this.f40306t = g70Var.f40306t;
        this.f40307u = g70Var.f40307u;
    }

    @Override // p000.ie3
    /* JADX INFO: renamed from: a */
    public final boolean mo2126a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f40293g) {
            return true;
        }
        this.f40304r.f5743d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m12392b(vf3 vf3Var) {
        this.f40287a.add(vf3Var);
        vf3Var.f65307d = this.f40288b;
        vf3Var.f65308e = this.f40289c;
        vf3Var.f65309f = this.f40290d;
        vf3Var.f65310g = this.f40291e;
    }

    /* JADX INFO: renamed from: c */
    public final void m12393c(String str) {
        if (!this.f40294h) {
            C3386nv.m17633t("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.f40293g = true;
            this.f40295i = str;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12394d(int i) {
        if (this.f40293g) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f40287a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                vf3 vf3Var = (vf3) arrayList.get(i2);
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = vf3Var.f65305b;
                if (abstractComponentCallbacksC0635c != null) {
                    abstractComponentCallbacksC0635c.f5673O += i;
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + vf3Var.f65305b + " to " + vf3Var.f65305b.f5673O);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12395e() {
        ArrayList arrayList = this.f40287a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            vf3 vf3Var = (vf3) arrayList.get(size);
            if (vf3Var.f65306c) {
                if (vf3Var.f65304a == 8) {
                    vf3Var.f65306c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = vf3Var.f65305b.f5679U;
                    vf3Var.f65304a = 2;
                    vf3Var.f65306c = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        vf3 vf3Var2 = (vf3) arrayList.get(i2);
                        if (vf3Var2.f65306c && vf3Var2.f65305b.f5679U == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12396f() {
        m12397g(false, true);
    }

    /* JADX INFO: renamed from: g */
    public final int m12397g(boolean z, boolean z2) {
        if (this.f40305s) {
            C3386nv.m17633t("commit already called");
            return 0;
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new kj5());
            m12399i("  ", printWriter, true);
            printWriter.close();
        }
        this.f40305s = true;
        boolean z3 = this.f40293g;
        AbstractC0638f abstractC0638f = this.f40304r;
        if (z3) {
            this.f40306t = abstractC0638f.f5750k.getAndIncrement();
        } else {
            this.f40306t = -1;
        }
        if (z2) {
            abstractC0638f.m2189x(this, z);
        }
        return this.f40306t;
    }

    /* JADX INFO: renamed from: h */
    public final void m12398h(int i, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, String str, int i2) {
        String str2 = abstractComponentCallbacksC0635c.f5706k0;
        if (str2 != null) {
            rf3 rf3Var = sf3.f60790a;
            sf3.m21333b(new FragmentReuseViolation(abstractComponentCallbacksC0635c, str2));
            sf3.m21332a(abstractComponentCallbacksC0635c).getClass();
            FragmentStrictMode$Flag fragmentStrictMode$Flag = FragmentStrictMode$Flag.PENALTY_LOG;
        }
        Class<?> cls = abstractComponentCallbacksC0635c.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            C3386nv.m17629p("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0635c.f5680V;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC0635c);
                sb.append(": was ");
                C3386nv.m17633t(AbstractC3393o1.m17739n(sb, abstractComponentCallbacksC0635c.f5680V, " now ", str));
                return;
            }
            abstractComponentCallbacksC0635c.f5680V = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0635c + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC0635c.f5678T;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(abstractComponentCallbacksC0635c);
                int i4 = abstractComponentCallbacksC0635c.f5678T;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            abstractComponentCallbacksC0635c.f5678T = i;
            abstractComponentCallbacksC0635c.f5679U = i;
        }
        m12392b(new vf3(i2, abstractComponentCallbacksC0635c));
        abstractComponentCallbacksC0635c.f5674P = this.f40304r;
    }

    /* JADX INFO: renamed from: i */
    public final void m12399i(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f40295i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f40306t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f40305s);
            if (this.f40292f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f40292f));
            }
            if (this.f40288b != 0 || this.f40289c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f40288b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f40289c));
            }
            if (this.f40290d != 0 || this.f40291e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f40290d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f40291e));
            }
            if (this.f40296j != 0 || this.f40297k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f40296j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f40297k);
            }
            if (this.f40298l != 0 || this.f40299m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f40298l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f40299m);
            }
        }
        ArrayList arrayList = this.f40287a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vf3 vf3Var = (vf3) arrayList.get(i);
            switch (vf3Var.f65304a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + vf3Var.f65304a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(vf3Var.f65305b);
            if (z) {
                if (vf3Var.f65307d != 0 || vf3Var.f65308e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(vf3Var.f65307d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(vf3Var.f65308e));
                }
                if (vf3Var.f65309f != 0 || vf3Var.f65310g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(vf3Var.f65309f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(vf3Var.f65310g));
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12400j(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        AbstractC0638f abstractC0638f = abstractComponentCallbacksC0635c.f5674P;
        if (abstractC0638f == null || abstractC0638f == this.f40304r) {
            m12392b(new vf3(3, abstractComponentCallbacksC0635c));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0635c.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: renamed from: k */
    public final void m12401k(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Lifecycle$State lifecycle$State) {
        AbstractC0638f abstractC0638f = abstractComponentCallbacksC0635c.f5674P;
        AbstractC0638f abstractC0638f2 = this.f40304r;
        if (abstractC0638f != abstractC0638f2) {
            v63.m23142t(abstractC0638f2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (lifecycle$State == Lifecycle$State.INITIALIZED && abstractComponentCallbacksC0635c.f5685a > -1) {
            ij6.m13965w("Cannot set maximum Lifecycle to ", lifecycle$State, " after the Fragment has been created");
            return;
        }
        if (lifecycle$State == Lifecycle$State.DESTROYED) {
            ij6.m13965w("Cannot set maximum Lifecycle to ", lifecycle$State, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            return;
        }
        vf3 vf3Var = new vf3();
        vf3Var.f65304a = 10;
        vf3Var.f65305b = abstractComponentCallbacksC0635c;
        vf3Var.f65306c = false;
        vf3Var.f65311h = abstractComponentCallbacksC0635c.f5708l0;
        vf3Var.f65312i = lifecycle$State;
        m12392b(vf3Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m12402l(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        AbstractC0638f abstractC0638f = abstractComponentCallbacksC0635c.f5674P;
        if (abstractC0638f == null || abstractC0638f == this.f40304r) {
            m12392b(new vf3(8, abstractComponentCallbacksC0635c));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0635c.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f40306t >= 0) {
            sb.append(" #");
            sb.append(this.f40306t);
        }
        if (this.f40295i != null) {
            sb.append(" ");
            sb.append(this.f40295i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g70(AbstractC0638f abstractC0638f) {
        this();
        abstractC0638f.m2140I();
        hd3 hd3Var = abstractC0638f.f5763x;
        if (hd3Var != null) {
            hd3Var.f42210L.getClassLoader();
        }
        this.f40306t = -1;
        this.f40307u = false;
        this.f40304r = abstractC0638f;
    }

    public g70() {
        this.f40287a = new ArrayList();
        this.f40294h = true;
        this.f40302p = false;
    }
}
