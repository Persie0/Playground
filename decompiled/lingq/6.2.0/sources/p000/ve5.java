package p000;

import com.google.protobuf.C1184e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ve5 extends ze5 {

    /* JADX INFO: renamed from: c */
    public static final Class f65272c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // p000.ze5
    /* JADX INFO: renamed from: a */
    public final void mo23245a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zga.f71556c.m23938i(obj, j);
        if (list instanceof jw4) {
            objUnmodifiableList = ((jw4) list).getUnmodifiableView();
        } else {
            if (f65272c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof ck7) && (list instanceof m94)) {
                AbstractC3319m1 abstractC3319m1 = (AbstractC3319m1) ((m94) list);
                boolean z = abstractC3319m1.f50407a;
                if (z && z) {
                    abstractC3319m1.f50407a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zga.m25615o(obj, j, objUnmodifiableList);
    }

    @Override // p000.ze5
    /* JADX INFO: renamed from: b */
    public final void mo23246b(Object obj, Object obj2, long j) {
        List list;
        List list2;
        List listMutableCopyWithCapacity;
        wga wgaVar = zga.f71556c;
        List list3 = (List) wgaVar.m23938i(obj2, j);
        int size = list3.size();
        List list4 = (List) wgaVar.m23938i(obj, j);
        if (list4.isEmpty()) {
            if (list4 instanceof jw4) {
                listMutableCopyWithCapacity = new C1184e(size);
            } else {
                listMutableCopyWithCapacity = ((list4 instanceof ck7) && (list4 instanceof m94)) ? ((m94) list4).mutableCopyWithCapacity(size) : new ArrayList(size);
            }
            zga.m25615o(obj, j, listMutableCopyWithCapacity);
            list2 = listMutableCopyWithCapacity;
        } else {
            if (f65272c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                zga.m25615o(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof ega) {
                ega egaVar = (ega) list4;
                C1184e c1184e = new C1184e(egaVar.size() + size);
                c1184e.addAll(egaVar);
                zga.m25615o(obj, j, c1184e);
                list = c1184e;
            } else if ((list4 instanceof ck7) && (list4 instanceof m94)) {
                m94 m94Var = (m94) list4;
                if (!((AbstractC3319m1) m94Var).f50407a) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    m94 m94VarMutableCopyWithCapacity = m94Var.mutableCopyWithCapacity(list4.size() + size);
                    zga.m25615o(obj, j, m94VarMutableCopyWithCapacity);
                    list2 = m94VarMutableCopyWithCapacity;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        zga.m25615o(obj, j, list3);
    }
}
