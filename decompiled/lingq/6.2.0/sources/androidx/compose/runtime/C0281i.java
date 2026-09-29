package androidx.compose.runtime;

import android.util.Log;
import androidx.collection.AbstractC0042e;
import androidx.compose.runtime.collection.C0275a;
import androidx.compose.runtime.internal.AtomicInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3006fm;
import p000.C3386nv;
import p000.a45;
import p000.b34;
import p000.bl2;
import p000.cd4;
import p000.cf1;
import p000.dl6;
import p000.g56;
import p000.iy5;
import p000.j69;
import p000.jc9;
import p000.jf1;
import p000.kc9;
import p000.kf1;
import p000.kn1;
import p000.kv4;
import p000.n66;
import p000.nc9;
import p000.nj0;
import p000.o66;
import p000.pf1;
import p000.pm8;
import p000.qm0;
import p000.rcd;
import p000.s66;
import p000.sd4;
import p000.si0;
import p000.sm0;
import p000.sq5;
import p000.tj3;
import p000.tm0;
import p000.u91;
import p000.ui3;
import p000.ui5;
import p000.v77;
import p000.w41;
import p000.wfb;
import p000.x18;
import p000.x66;
import p000.xfa;
import p000.y18;
import p000.y36;
import p000.z18;
import p000.z36;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.runtime.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0281i extends kf1 {

    /* JADX INFO: renamed from: B */
    public static final C3244l f3751B = AbstractC3352my.m17114d(v77.f64977d);

    /* JADX INFO: renamed from: C */
    public static final AtomicReference f3752C = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public final iy5 f3753A;

    /* JADX INFO: renamed from: a */
    public long f3754a;

    /* JADX INFO: renamed from: b */
    public final si0 f3755b;

    /* JADX INFO: renamed from: c */
    public final sq5 f3756c;

    /* JADX INFO: renamed from: d */
    public final Object f3757d;

    /* JADX INFO: renamed from: e */
    public cd4 f3758e;

    /* JADX INFO: renamed from: f */
    public Throwable f3759f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3760g;

    /* JADX INFO: renamed from: h */
    public List f3761h;

    /* JADX INFO: renamed from: i */
    public o66 f3762i;

    /* JADX INFO: renamed from: j */
    public final x66 f3763j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f3764k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f3765l;

    /* JADX INFO: renamed from: m */
    public final n66 f3766m;

    /* JADX INFO: renamed from: n */
    public final bl2 f3767n;

    /* JADX INFO: renamed from: o */
    public final n66 f3768o;

    /* JADX INFO: renamed from: p */
    public final n66 f3769p;

    /* JADX INFO: renamed from: q */
    public ArrayList f3770q;

    /* JADX INFO: renamed from: r */
    public o66 f3771r;

    /* JADX INFO: renamed from: s */
    public sm0 f3772s;

    /* JADX INFO: renamed from: t */
    public boolean f3773t;

    /* JADX INFO: renamed from: u */
    public final C3244l f3774u;

    /* JADX INFO: renamed from: v */
    public boolean f3775v;

    /* JADX INFO: renamed from: w */
    public final C3244l f3776w;

    /* JADX INFO: renamed from: x */
    public final sq5 f3777x;

    /* JADX INFO: renamed from: y */
    public final sd4 f3778y;

    /* JADX INFO: renamed from: z */
    public final kn1 f3779z;

    public C0281i(kn1 kn1Var) {
        si0 si0Var = new si0(new y18(this, 0));
        this.f3755b = si0Var;
        this.f3756c = new sq5(new y18(this, 1));
        this.f3757d = new Object();
        this.f3760g = new ArrayList();
        this.f3762i = new o66();
        this.f3763j = new x66(new pf1[16]);
        this.f3764k = new ArrayList();
        this.f3765l = new ArrayList();
        this.f3766m = new n66();
        this.f3767n = new bl2(27);
        this.f3768o = new n66();
        this.f3769p = new n66();
        this.f3774u = AbstractC3352my.m17114d(null);
        this.f3776w = AbstractC3352my.m17114d(Recomposer$State.Inactive);
        this.f3777x = new sq5(13);
        sd4 sd4Var = new sd4((cd4) kn1Var.get(nj0.f52795N));
        sd4Var.mo4540r(new kv4(this, 19));
        this.f3778y = sd4Var;
        this.f3779z = kn1Var.plus(si0Var).plus(sd4Var);
        this.f3753A = new iy5(15);
    }

    /* JADX INFO: renamed from: H */
    public static final void m1268H(ArrayList arrayList, C0281i c0281i, pf1 pf1Var) {
        arrayList.clear();
        synchronized (c0281i.f3757d) {
            Iterator it = c0281i.f3765l.iterator();
            if (it.hasNext()) {
                ((z36) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1269w(s66 s66Var) {
        try {
            if (s66Var.mo3587w() instanceof kc9) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            s66Var.mo3162c();
        } catch (Throwable th) {
            s66Var.mo3162c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m1270A() {
        return this.f3763j.f67832c != 0 || m1285z() || m1271B() || this.f3766m.m17258j();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m1271B() {
        return !this.f3775v && (((AtomicInt) ((w41) this.f3756c.f61249c).f66367c).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m1272C() {
        boolean z;
        synchronized (this.f3757d) {
            z = this.f3762i.m725c() || this.f3763j.f67832c != 0 || m1285z() || m1271B();
        }
        return z;
    }

    /* JADX INFO: renamed from: D */
    public final Object m1273D(SuspendLambda suspendLambda) throws Throwable {
        Object objM15540s = AbstractC3224d.m15540s(this.f3776w, new Recomposer$join$2(2, null), suspendLambda);
        return objM15540s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15540s : xfa.f68157a;
    }

    /* JADX INFO: renamed from: E */
    public final List m1274E() {
        List list = this.f3761h;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f3760g;
        List arrayList2 = arrayList.isEmpty() ? EmptyList.f47638a : new ArrayList(arrayList);
        this.f3761h = arrayList2;
        return arrayList2;
    }

    /* JADX INFO: renamed from: F */
    public final void m1275F() {
        qm0 qm0VarM1284y;
        synchronized (this.f3757d) {
            qm0VarM1284y = m1284y();
            if (((Recomposer$State) this.f3776w.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                throw rcd.m20580a("Recomposer shutdown; frame clock awaiter will never resume", this.f3759f);
            }
        }
        if (qm0VarM1284y != null) {
            ((sm0) qm0VarM1284y).resumeWith(xfa.f68157a);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1276G(pf1 pf1Var) {
        synchronized (this.f3757d) {
            ArrayList arrayList = this.f3765l;
            if (arrayList.size() > 0) {
                ((z36) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final List m1277I(List list, o66 o66Var) {
        s66 s66VarMo3579C;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((z36) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            pf1 pf1Var = (pf1) entry.getKey();
            List list2 = (List) entry.getValue();
            if (pf1Var.f56036Q.f62371F) {
                cf1.m4605a("Check failed");
            }
            kv4 kv4Var = new kv4(pf1Var, 18);
            ui5 ui5Var = new ui5(11, pf1Var, o66Var);
            jc9 jc9VarM17358j = nc9.m17358j();
            s66 s66Var = jc9VarM17358j instanceof s66 ? (s66) jc9VarM17358j : null;
            if (s66Var == null || (s66VarMo3579C = s66Var.mo3579C(kv4Var, ui5Var)) == null) {
                C3386nv.m17633t("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                jc9 jc9VarM14393j = s66VarMo3579C.m14393j();
                try {
                    synchronized (this.f3757d) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                z36 z36Var = (z36) list2.get(i2);
                                n66 n66Var = this.f3766m;
                                z36Var.getClass();
                                Object objM12364a = g56.m12364a(n66Var);
                                arrayList.add(new Pair(z36Var, objM12364a));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.f47624b == null) {
                                    bl2 bl2Var = this.f3767n;
                                    ((z36) pair.f47623a).getClass();
                                    if (((n66) bl2Var.f8655a).m17250b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            Pair pair2 = (Pair) arrayList.get(i4);
                                            if (pair2.f47624b == null) {
                                                bl2 bl2Var2 = this.f3767n;
                                                ((z36) pair2.f47623a).getClass();
                                                n66 n66Var2 = (n66) bl2Var2.f8655a;
                                                if (n66Var2.m17257i()) {
                                                    ((n66) bl2Var2.f8656b).m17249a();
                                                }
                                            }
                                            arrayList3.add(pair2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((Pair) arrayList.get(i5)).f47624b != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((Pair) arrayList.get(i6)).f47624b == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        Pair pair3 = (Pair) arrayList.get(i7);
                                        if (pair3.f47624b == null) {
                                        }
                                    }
                                    synchronized (this.f3757d) {
                                        u91.m22630w0(arrayList4, this.f3765l);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((Pair) obj2).f47624b != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    pf1Var.m19102r(arrayList);
                    jc9.m14390q(jc9VarM14393j);
                    m1269w(s66VarMo3579C);
                } catch (Throwable th2) {
                    jc9.m14390q(jc9VarM14393j);
                    throw th2;
                }
            } catch (Throwable th3) {
                m1269w(s66VarMo3579C);
                throw th3;
            }
        }
        return u91.m22622n1(map.keySet());
    }

    /* JADX INFO: renamed from: J */
    public final pf1 m1278J(pf1 pf1Var, o66 o66Var) {
        s66 s66VarMo3579C;
        if (pf1Var.f56036Q.f62371F || pf1Var.f56037R == 3) {
            return null;
        }
        o66 o66Var2 = this.f3771r;
        if (o66Var2 == null || !o66Var2.m723a(pf1Var)) {
            kv4 kv4Var = new kv4(pf1Var, 18);
            ui5 ui5Var = new ui5(11, pf1Var, o66Var);
            jc9 jc9VarM17358j = nc9.m17358j();
            s66 s66Var = jc9VarM17358j instanceof s66 ? (s66) jc9VarM17358j : null;
            if (s66Var == null || (s66VarMo3579C = s66Var.mo3579C(kv4Var, ui5Var)) == null) {
                C3386nv.m17633t("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    jc9 jc9VarM14393j = s66VarMo3579C.m14393j();
                    if (o66Var != null) {
                        try {
                            if (o66Var.m725c()) {
                                C3006fm c3006fm = new C3006fm(27, o66Var, pf1Var);
                                tj3 tj3Var = pf1Var.f56036Q;
                                if (tj3Var.f62371F) {
                                    cf1.m4605a("Preparing a composition while composing is not supported");
                                }
                                tj3Var.f62371F = true;
                                try {
                                    c3006fm.mo0a();
                                    tj3Var.f62371F = false;
                                } catch (Throwable th) {
                                    tj3Var.f62371F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            jc9.m14390q(jc9VarM14393j);
                            throw th2;
                        }
                    }
                    boolean zM19107w = pf1Var.m19107w();
                    jc9.m14390q(jc9VarM14393j);
                    m1269w(s66VarMo3579C);
                    if (zM19107w) {
                        return pf1Var;
                    }
                } catch (Throwable th3) {
                    m1269w(s66VarMo3579C);
                    throw th3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m1279K(Throwable th, pf1 pf1Var) throws Throwable {
        if (!((Boolean) f3752C.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.f3757d) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                z18 z18Var = (z18) this.f3774u.getValue();
                if (z18Var != null) {
                    throw z18Var.f70752a;
                }
                C3244l c3244l = this.f3774u;
                z18 z18Var2 = new z18(th);
                c3244l.getClass();
                c3244l.m15572j(null, z18Var2);
            }
            throw th;
        }
        synchronized (this.f3757d) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f3764k.clear();
                this.f3763j.m24310h();
                this.f3762i = new o66();
                this.f3765l.clear();
                this.f3766m.m17249a();
                this.f3768o.m17249a();
                C3244l c3244l2 = this.f3774u;
                z18 z18Var3 = new z18(th);
                c3244l2.getClass();
                c3244l2.m15572j(null, z18Var3);
                if (pf1Var != null) {
                    m1281M(pf1Var);
                }
                if (m1284y() != null) {
                    cf1.m4605a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m1280L() {
        boolean zM1270A;
        synchronized (this.f3757d) {
            if (this.f3762i.m724b()) {
                return m1270A();
            }
            List listM1274E = m1274E();
            C0275a c0275a = new C0275a(this.f3762i);
            this.f3762i = new o66();
            try {
                int size = listM1274E.size();
                for (int i = 0; i < size; i++) {
                    ((pf1) listM1274E.get(i)).m19108x(c0275a);
                    if (((Recomposer$State) this.f3776w.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f3757d) {
                    if (m1284y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM1270A = m1270A();
                }
                return zM1270A;
            } catch (Throwable th) {
                synchronized (this.f3757d) {
                    o66 o66Var = this.f3762i;
                    o66Var.getClass();
                    Iterator<E> it = c0275a.iterator();
                    while (it.hasNext()) {
                        o66Var.m17818k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1281M(pf1 pf1Var) {
        ArrayList arrayList = this.f3770q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f3770q = arrayList;
        }
        if (!arrayList.contains(pf1Var)) {
            arrayList.add(pf1Var);
        }
        if (this.f3760g.remove(pf1Var)) {
            this.f3761h = null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final Object m1282N(SuspendLambda suspendLambda) throws Throwable {
        Object objM23905G = wfb.m23905G(new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), b34.m3250q(suspendLambda.getContext()), null), this.f3755b, suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        xfa xfaVar = xfa.f68157a;
        if (objM23905G != coroutineSingletons) {
            objM23905G = xfaVar;
        }
        return objM23905G == coroutineSingletons ? objM23905G : xfaVar;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: a */
    public final void mo1222a(pf1 pf1Var, zi3 zi3Var) throws Throwable {
        Recomposer$State recomposer$State;
        boolean zContains;
        s66 s66VarMo3579C;
        boolean z = pf1Var.f56036Q.f62371F;
        synchronized (this.f3757d) {
            Recomposer$State recomposer$State2 = (Recomposer$State) this.f3776w.getValue();
            recomposer$State = Recomposer$State.ShuttingDown;
            zContains = recomposer$State2.compareTo(recomposer$State) > 0 ? true ^ m1274E().contains(pf1Var) : true;
        }
        try {
            kv4 kv4Var = new kv4(pf1Var, 18);
            ui5 ui5Var = new ui5(11, pf1Var, null);
            jc9 jc9VarM17358j = nc9.m17358j();
            s66 s66Var = jc9VarM17358j instanceof s66 ? (s66) jc9VarM17358j : null;
            if (s66Var == null || (s66VarMo3579C = s66Var.mo3579C(kv4Var, ui5Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                jc9 jc9VarM14393j = s66VarMo3579C.m14393j();
                try {
                    pf1Var.m19095k(zi3Var);
                    jc9.m14390q(jc9VarM14393j);
                    m1269w(s66VarMo3579C);
                    synchronized (this.f3757d) {
                        if (((Recomposer$State) this.f3776w.getValue()).compareTo(recomposer$State) > 0 && !m1274E().contains(pf1Var)) {
                            this.f3760g.add(pf1Var);
                            this.f3761h = null;
                        }
                    }
                    if (!z) {
                        nc9.m17358j().mo3168m();
                    }
                    try {
                        m1276G(pf1Var);
                        try {
                            pf1Var.m19089e();
                            pf1Var.m19091g();
                            if (z) {
                                return;
                            }
                            nc9.m17358j().mo3168m();
                        } catch (Throwable th) {
                            m1279K(th, null);
                        }
                    } catch (Throwable th2) {
                        m1279K(th2, pf1Var);
                    }
                } catch (Throwable th3) {
                    jc9.m14390q(jc9VarM14393j);
                    throw th3;
                }
            } catch (Throwable th4) {
                m1269w(s66VarMo3579C);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.f3757d) {
                }
            }
            m1279K(th5, pf1Var);
        }
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: b */
    public final AbstractC0042e mo1223b(pf1 pf1Var, j69 j69Var, zi3 zi3Var) {
        sq5 sq5Var = this.f3777x;
        try {
            j69 j69Var2 = pf1Var.f56030K;
            pf1Var.f56030K = j69Var;
            try {
                mo1222a(pf1Var, zi3Var);
                o66 o66Var = (o66) sq5Var.m21566g();
                if (o66Var == null) {
                    o66Var = pm8.f56484a;
                    o66Var.getClass();
                }
                pf1Var.f56030K = j69Var2;
                sq5Var.m21552A(null);
                return o66Var;
            } catch (Throwable th) {
                pf1Var.f56030K = j69Var2;
                throw th;
            }
        } catch (Throwable th2) {
            sq5Var.m21552A(null);
            throw th2;
        }
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: d */
    public final boolean mo1225d() {
        return ((Boolean) f3752C.get()).booleanValue();
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: e */
    public final boolean mo1226e() {
        return false;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: f */
    public final boolean mo1227f() {
        return false;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: g */
    public final long mo1228g() {
        return 1000L;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: h */
    public final jf1 mo1229h() {
        return null;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: j */
    public final kn1 mo1231j() {
        return this.f3779z;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: k */
    public final boolean mo1232k() {
        return false;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: l */
    public final void mo1233l(pf1 pf1Var) {
        qm0 qm0VarM1284y;
        synchronized (this.f3757d) {
            if (this.f3763j.m24311i(pf1Var)) {
                qm0VarM1284y = null;
            } else {
                this.f3763j.m24305c(pf1Var);
                qm0VarM1284y = m1284y();
            }
        }
        if (qm0VarM1284y != null) {
            ((sm0) qm0VarM1284y).resumeWith(xfa.f68157a);
        }
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: m */
    public final y36 mo1234m(z36 z36Var) {
        y36 y36Var;
        synchronized (this.f3757d) {
            y36Var = (y36) this.f3768o.m17259k(z36Var);
        }
        return y36Var;
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: n */
    public final AbstractC0042e mo1235n(pf1 pf1Var, j69 j69Var, AbstractC0042e abstractC0042e) {
        sq5 sq5Var = this.f3777x;
        try {
            m1280L();
            pf1Var.m19108x(new C0275a(abstractC0042e));
            j69 j69Var2 = pf1Var.f56030K;
            pf1Var.f56030K = j69Var;
            try {
                pf1 pf1VarM1278J = m1278J(pf1Var, null);
                if (pf1VarM1278J != null) {
                    m1276G(pf1Var);
                    pf1VarM1278J.m19089e();
                    pf1VarM1278J.m19091g();
                }
                o66 o66Var = (o66) sq5Var.m21566g();
                if (o66Var == null) {
                    o66Var = pm8.f56484a;
                    o66Var.getClass();
                }
                pf1Var.f56030K = j69Var2;
                sq5Var.m21552A(null);
                return o66Var;
            } catch (Throwable th) {
                pf1Var.f56030K = j69Var2;
                throw th;
            }
        } catch (Throwable th2) {
            sq5Var.m21552A(null);
            throw th2;
        }
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: o */
    public final void mo1236o(Set set) {
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: q */
    public final void mo1238q(x18 x18Var) {
        sq5 sq5Var = this.f3777x;
        o66 o66Var = (o66) sq5Var.m21566g();
        if (o66Var == null) {
            o66 o66Var2 = pm8.f56484a;
            o66Var = new o66();
            sq5Var.m21552A(o66Var);
        }
        o66Var.m17811d(x18Var);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: r */
    public final void mo1239r(pf1 pf1Var) {
        synchronized (this.f3757d) {
            try {
                o66 o66Var = this.f3771r;
                if (o66Var == null) {
                    o66 o66Var2 = pm8.f56484a;
                    o66Var = new o66();
                    this.f3771r = o66Var;
                }
                o66Var.m17811d(pf1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: s */
    public final tm0 mo1240s(ui3 ui3Var) {
        sq5 sq5Var = this.f3756c;
        w41 w41Var = (w41) sq5Var.f61249c;
        dl6 dl6Var = new dl6();
        dl6Var.f35789a = ui3Var;
        return w41Var.m23723j(dl6Var, (a45) sq5Var.f61250d);
    }

    @Override // p000.kf1
    /* JADX INFO: renamed from: v */
    public final void mo1243v(pf1 pf1Var) {
        synchronized (this.f3757d) {
            if (this.f3760g.remove(pf1Var)) {
                this.f3761h = null;
            }
            this.f3763j.m24313k(pf1Var);
            this.f3764k.remove(pf1Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1283x() {
        synchronized (this.f3757d) {
            if (((Recomposer$State) this.f3776w.getValue()).compareTo(Recomposer$State.Idle) >= 0) {
                this.f3776w.m15571i(Recomposer$State.ShuttingDown);
            }
        }
        this.f3778y.mo4537a(null);
    }

    /* JADX INFO: renamed from: y */
    public final qm0 m1284y() {
        Recomposer$State recomposer$State;
        C3244l c3244l = this.f3776w;
        int iCompareTo = ((Recomposer$State) c3244l.getValue()).compareTo(Recomposer$State.ShuttingDown);
        C3244l c3244l2 = this.f3774u;
        ArrayList arrayList = this.f3765l;
        ArrayList arrayList2 = this.f3764k;
        x66 x66Var = this.f3763j;
        if (iCompareTo > 0) {
            if (c3244l2.getValue() != null) {
                recomposer$State = Recomposer$State.Inactive;
            } else if (this.f3758e == null) {
                this.f3762i = new o66();
                x66Var.m24310h();
                recomposer$State = (m1285z() || m1271B()) ? Recomposer$State.InactivePendingWork : Recomposer$State.Inactive;
            } else {
                recomposer$State = (x66Var.f67832c != 0 || this.f3762i.m725c() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m1285z() || m1271B() || this.f3766m.m17258j()) ? Recomposer$State.PendingWork : Recomposer$State.Idle;
            }
            c3244l.m15571i(recomposer$State);
            if (recomposer$State != Recomposer$State.PendingWork) {
                return null;
            }
            sm0 sm0Var = this.f3772s;
            this.f3772s = null;
            return sm0Var;
        }
        List listM1274E = m1274E();
        int size = listM1274E.size();
        for (int i = 0; i < size; i++) {
        }
        this.f3760g.clear();
        this.f3761h = EmptyList.f47638a;
        this.f3762i = new o66();
        x66Var.m24310h();
        arrayList2.clear();
        arrayList.clear();
        this.f3770q = null;
        sm0 sm0Var2 = this.f3772s;
        if (sm0Var2 != null) {
            sm0Var2.mo10141l(null);
        }
        this.f3772s = null;
        c3244l2.m15571i(null);
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1285z() {
        return !this.f3775v && (((AtomicInt) this.f3755b.f60886b.f66367c).get() & 134217727) > 0;
    }
}
