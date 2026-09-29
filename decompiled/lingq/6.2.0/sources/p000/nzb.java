package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nzb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f53481a = new C0282a(-1047473638, false, new sd1(26));

    /* JADX INFO: renamed from: a */
    public static final t47 m17712a(List list) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        EmptyList emptyList = EmptyList.f47638a;
        ref$ObjectRef.f47718a = new t47(emptyList, emptyList);
        ArrayList arrayList = new ArrayList();
        Iterator it = new u98(list).iterator();
        while (true) {
            ListIterator listIterator = ((s98) it).f60562b;
            if (!listIterator.hasPrevious()) {
                m17713b(arrayList, ref$ObjectRef);
                return (t47) ref$ObjectRef.f47718a;
            }
            t47 t47Var = (t47) listIterator.previous();
            if (t47Var.f61859b.isEmpty()) {
                arrayList.add(t47Var.f61858a);
            } else {
                m17713b(arrayList, ref$ObjectRef);
                ref$ObjectRef.f47718a = m17715d(t47Var, (t47) ref$ObjectRef.f47718a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m17713b(ArrayList arrayList, Ref$ObjectRef ref$ObjectRef) {
        if (arrayList.isEmpty()) {
            return;
        }
        ListBuilder listBuilderM23650t = vz1.m23650t();
        Iterator it = new t98(arrayList).iterator();
        while (true) {
            ListIterator listIterator = ((s98) it).f60562b;
            if (!listIterator.hasPrevious()) {
                ref$ObjectRef.f47718a = m17715d(new t47(vz1.m23635i(listBuilderM23650t), EmptyList.f47638a), (t47) ref$ObjectRef.f47718a);
                arrayList.clear();
                return;
            }
            listBuilderM23650t.addAll((List) listIterator.previous());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final t47 m17714c(List list, ArrayList arrayList, ArrayList arrayList2, t47 t47Var) {
        List list2 = t47Var.f61858a;
        s47 s47Var = (s47) u91.m22591I0(list2);
        ListBuilder listBuilderM23650t = vz1.m23650t();
        listBuilderM23650t.addAll(list);
        if (arrayList == null) {
            listBuilderM23650t.addAll(list2);
        } else if (s47Var instanceof zo6) {
            listBuilderM23650t.add(new zo6(u91.m22603U0(((zo6) s47Var).f71848a, arrayList)));
            int i = 1;
            int size = list2.size() - 1;
            if (1 <= size) {
                while (true) {
                    listBuilderM23650t.add(list2.get(i));
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            listBuilderM23650t.add(new zo6(arrayList));
            listBuilderM23650t.addAll(list2);
        }
        listBuilderM23650t.addAll(arrayList2);
        return new t47(vz1.m23635i(listBuilderM23650t), t47Var.f61859b);
    }

    /* JADX INFO: renamed from: d */
    public static final t47 m17715d(t47 t47Var, t47 t47Var2) {
        List listM23604J;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListM22624p1 = null;
        for (s47 s47Var : t47Var.f61858a) {
            if (s47Var instanceof zo6) {
                if (arrayListM22624p1 != null) {
                    arrayListM22624p1.addAll(((zo6) s47Var).f71848a);
                } else {
                    arrayListM22624p1 = u91.m22624p1(((zo6) s47Var).f71848a);
                }
            } else if (s47Var instanceof mfa) {
                arrayList2.add(s47Var);
            } else {
                if (arrayListM22624p1 != null) {
                    arrayList.add(new zo6(arrayListM22624p1));
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    arrayListM22624p1 = null;
                }
                arrayList.add(s47Var);
            }
        }
        List list = t47Var.f61859b;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t47 t47VarM17715d = m17715d((t47) it.next(), t47Var2);
            if (t47VarM17715d.f61858a.isEmpty()) {
                List listM23604J2 = t47VarM17715d.f61859b;
                if (listM23604J2.isEmpty()) {
                    listM23604J2 = vz1.m23604J(t47VarM17715d);
                }
                listM23604J = listM23604J2;
            } else {
                listM23604J = vz1.m23604J(t47VarM17715d);
            }
            u91.m22630w0(listM23604J, arrayList3);
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        List list2 = arrayList3;
        if (zIsEmpty) {
            if (!t47Var2.f61858a.isEmpty()) {
                return m17714c(arrayList, arrayListM22624p1, arrayList2, t47Var2);
            }
            list2 = t47Var2.f61859b;
        }
        List list3 = list2;
        if (arrayListM22624p1 != null || arrayList.isEmpty()) {
            List list4 = list3;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    if (u91.m22591I0(((t47) it2.next()).f61858a) instanceof zo6) {
                        ArrayList arrayList4 = new ArrayList(v91.m23189q0(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(m17714c(EmptyList.f47638a, arrayListM22624p1, arrayList2, (t47) it3.next()));
                        }
                        return new t47(arrayList, arrayList4);
                    }
                }
            }
        }
        if (arrayListM22624p1 != null) {
            arrayList.add(new zo6(arrayListM22624p1));
        }
        arrayList.addAll(arrayList2);
        return new t47(arrayList, list3);
    }
}
