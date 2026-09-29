package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.g70;
import p000.ie3;
import p000.vf3;
import p000.wq1;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0637e implements ie3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5720a;

    /* JADX INFO: renamed from: b */
    public final String f5721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0638f f5722c;

    public /* synthetic */ C0637e(AbstractC0638f abstractC0638f, String str, int i) {
        this.f5720a = i;
        this.f5722c = abstractC0638f;
        this.f5721b = str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    @Override // p000.ie3
    /* JADX INFO: renamed from: a */
    public final boolean mo2126a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        int i;
        int i2;
        int i3 = this.f5720a;
        String str = this.f5721b;
        AbstractC0638f abstractC0638f = this.f5722c;
        Throwable th = null;
        boolean z = false;
        switch (i3) {
            case 0:
                BackStackState backStackState = (BackStackState) abstractC0638f.f5751l.remove(str);
                if (backStackState != null) {
                    HashMap map = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        g70 g70Var = (g70) it.next();
                        if (g70Var.f40307u) {
                            Iterator it2 = g70Var.f40287a.iterator();
                            while (it2.hasNext()) {
                                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((vf3) it2.next()).f65305b;
                                if (abstractComponentCallbacksC0635c != null) {
                                    map.put(abstractComponentCallbacksC0635c.f5693e, abstractComponentCallbacksC0635c);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = backStackState.f5612a;
                    HashMap map2 = new HashMap(arrayList3.size());
                    for (String str2 : arrayList3) {
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = (AbstractComponentCallbacksC0635c) map.get(str2);
                        if (abstractComponentCallbacksC0635c2 != null) {
                            map2.put(abstractComponentCallbacksC0635c2.f5693e, abstractComponentCallbacksC0635c2);
                        } else {
                            Bundle bundleM17686N = abstractC0638f.f5742c.m17686N(str2, null);
                            if (bundleM17686N != null) {
                                ClassLoader classLoader = abstractC0638f.f5763x.f42210L.getClassLoader();
                                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2064a = ((FragmentState) bundleM17686N.getParcelable("state")).m2064a(abstractC0638f.m2140I());
                                abstractComponentCallbacksC0635cM2064a.f5687b = bundleM17686N;
                                if (bundleM17686N.getBundle("savedInstanceState") == null) {
                                    abstractComponentCallbacksC0635cM2064a.f5687b.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = bundleM17686N.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                abstractComponentCallbacksC0635cM2064a.m2095W(bundle);
                                map2.put(abstractComponentCallbacksC0635cM2064a.f5693e, abstractComponentCallbacksC0635cM2064a);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (BackStackRecordState backStackRecordState : backStackState.f5613b) {
                        ArrayList arrayList5 = backStackRecordState.f5601b;
                        g70 g70Var2 = new g70(abstractC0638f);
                        backStackRecordState.m2062a(g70Var2);
                        for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                            String str3 = (String) arrayList5.get(i4);
                            if (str3 != null) {
                                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = (AbstractComponentCallbacksC0635c) map2.get(str3);
                                if (abstractComponentCallbacksC0635c3 != null) {
                                    ((vf3) g70Var2.f40287a.get(i4)).f65305b = abstractComponentCallbacksC0635c3;
                                } else {
                                    C3386nv.m17633t(wq1.m24125u(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f5605f, " failed due to missing saved state for Fragment (", str3, ")"));
                                }
                            }
                        }
                        arrayList4.add(g70Var2);
                    }
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        ((g70) it3.next()).mo2126a(arrayList, arrayList2);
                        z = true;
                    }
                }
                return z;
            default:
                int iM2135C = abstractC0638f.m2135C(str, -1, true);
                if (iM2135C < 0) {
                    return false;
                }
                for (int i5 = iM2135C; i5 < abstractC0638f.f5743d.size(); i5++) {
                    g70 g70Var3 = (g70) abstractC0638f.f5743d.get(i5);
                    if (!g70Var3.f40302p) {
                        abstractC0638f.m2174k0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + g70Var3 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                int i6 = iM2135C;
                while (i6 < abstractC0638f.f5743d.size()) {
                    g70 g70Var4 = (g70) abstractC0638f.f5743d.get(i6);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    for (vf3 vf3Var : g70Var4.f40287a) {
                        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c4 = vf3Var.f65305b;
                        if (abstractComponentCallbacksC0635c4 != null) {
                            Throwable th2 = th;
                            if (vf3Var.f65306c) {
                                int i7 = vf3Var.f65304a;
                                i = i6;
                                if (i7 == 1 || i7 == 2 || i7 == 8) {
                                }
                                i2 = vf3Var.f65304a;
                                if (i2 != 1 || i2 == 2) {
                                    hashSet3.add(abstractComponentCallbacksC0635c4);
                                }
                                th = th2;
                                i6 = i;
                            } else {
                                i = i6;
                            }
                            hashSet.add(abstractComponentCallbacksC0635c4);
                            hashSet2.add(abstractComponentCallbacksC0635c4);
                            i2 = vf3Var.f65304a;
                            if (i2 != 1) {
                                hashSet3.add(abstractComponentCallbacksC0635c4);
                            } else {
                                hashSet3.add(abstractComponentCallbacksC0635c4);
                            }
                            th = th2;
                            i6 = i;
                        }
                    }
                    Throwable th3 = th;
                    int i8 = i6;
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder sbM17742q = AbstractC3393o1.m17742q("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        sbM17742q.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        sbM17742q.append(" in ");
                        sbM17742q.append(g70Var4);
                        sbM17742q.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        abstractC0638f.m2174k0(new IllegalArgumentException(sbM17742q.toString()));
                        throw th3;
                    }
                    i6 = i8 + 1;
                    th = th3;
                }
                Throwable th4 = th;
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c5 = (AbstractComponentCallbacksC0635c) arrayDeque.removeFirst();
                    if (abstractComponentCallbacksC0635c5.f5683Y) {
                        StringBuilder sbM17742q2 = AbstractC3393o1.m17742q("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        sbM17742q2.append(hashSet.contains(abstractComponentCallbacksC0635c5) ? "direct reference to retained " : "retained child ");
                        sbM17742q2.append("fragment ");
                        sbM17742q2.append(abstractComponentCallbacksC0635c5);
                        abstractC0638f.m2174k0(new IllegalArgumentException(sbM17742q2.toString()));
                        throw th4;
                    }
                    for (AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c6 : abstractComponentCallbacksC0635c5.f5676R.f5742c.m17705y()) {
                        if (abstractComponentCallbacksC0635c6 != null) {
                            arrayDeque.addLast(abstractComponentCallbacksC0635c6);
                        }
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((AbstractComponentCallbacksC0635c) it4.next()).f5693e);
                }
                ArrayList arrayList7 = new ArrayList(abstractC0638f.f5743d.size() - iM2135C);
                int i9 = iM2135C;
                while (i9 < abstractC0638f.f5743d.size()) {
                    arrayList7.add(th4);
                    i9++;
                    th4 = null;
                }
                BackStackState backStackState2 = new BackStackState(arrayList6, arrayList7);
                for (int size = abstractC0638f.f5743d.size() - 1; size >= iM2135C; size--) {
                    g70 g70Var5 = (g70) abstractC0638f.f5743d.remove(size);
                    g70 g70Var6 = new g70(g70Var5);
                    g70Var6.m12395e();
                    arrayList7.set(size - iM2135C, new BackStackRecordState(g70Var6));
                    g70Var5.f40307u = true;
                    arrayList.add(g70Var5);
                    arrayList2.add(Boolean.TRUE);
                }
                abstractC0638f.f5751l.put(str, backStackState2);
                return true;
        }
    }
}
