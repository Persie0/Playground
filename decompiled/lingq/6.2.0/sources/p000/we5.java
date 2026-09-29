package p000;

import com.google.crypto.tink.shaded.protobuf.C1135j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class we5 extends af5 {

    /* JADX INFO: renamed from: c */
    public static final Class f66722c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m23856d(long j, Object obj, int i) {
        List listMutableCopyWithCapacity;
        List list = (List) yga.f69826c.m23276i(obj, j);
        if (list.isEmpty()) {
            if (list instanceof iw4) {
                listMutableCopyWithCapacity = new C1135j(i);
            } else {
                listMutableCopyWithCapacity = ((list instanceof bk7) && (list instanceof l94)) ? ((l94) list).mutableCopyWithCapacity(i) : new ArrayList(i);
            }
            yga.m25140p(obj, j, listMutableCopyWithCapacity);
            return listMutableCopyWithCapacity;
        }
        if (f66722c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            yga.m25140p(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof fga) {
            fga fgaVar = (fga) list;
            C1135j c1135j = new C1135j(fgaVar.size() + i);
            c1135j.addAll(fgaVar);
            yga.m25140p(obj, j, c1135j);
            return c1135j;
        }
        if ((list instanceof bk7) && (list instanceof l94)) {
            l94 l94Var = (l94) list;
            if (!((AbstractC3282l1) l94Var).f48878a) {
                l94 l94VarMutableCopyWithCapacity = l94Var.mutableCopyWithCapacity(list.size() + i);
                yga.m25140p(obj, j, l94VarMutableCopyWithCapacity);
                return l94VarMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: a */
    public final void mo340a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) yga.f69826c.m23276i(obj, j);
        if (list instanceof iw4) {
            objUnmodifiableList = ((iw4) list).getUnmodifiableView();
        } else {
            if (f66722c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof bk7) && (list instanceof l94)) {
                AbstractC3282l1 abstractC3282l1 = (AbstractC3282l1) ((l94) list);
                if (abstractC3282l1.f48878a) {
                    abstractC3282l1.f48878a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        yga.m25140p(obj, j, objUnmodifiableList);
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: b */
    public final void mo341b(Object obj, Object obj2, long j) {
        List list = (List) yga.f69826c.m23276i(obj2, j);
        List listM23856d = m23856d(j, obj, list.size());
        int size = listM23856d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM23856d.addAll(list);
        }
        if (size > 0) {
            list = listM23856d;
        }
        yga.m25140p(obj, j, list);
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: c */
    public final List mo342c(Object obj, long j) {
        return m23856d(j, obj, 10);
    }
}
