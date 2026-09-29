package p000;

import com.google.android.gms.internal.vision.C1035t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class crc extends sqc {

    /* JADX INFO: renamed from: c */
    public static final Class f34436c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // p000.sqc
    /* JADX INFO: renamed from: a */
    public final void mo9866a(Object obj, long j, Object obj2) {
        List list;
        List list2;
        List listMo5748a;
        List list3 = (List) f0d.m11445l(obj2, j);
        int size = list3.size();
        List list4 = (List) f0d.m11445l(obj, j);
        if (list4.isEmpty()) {
            if (list4 instanceof yqc) {
                listMo5748a = new C1035t(size);
            } else {
                listMo5748a = ((list4 instanceof hvc) && (list4 instanceof mpc)) ? ((mpc) list4).mo5748a(size) : new ArrayList(size);
            }
            f0d.m11437d(obj, j, listMo5748a);
            list2 = listMo5748a;
        } else {
            if (f34436c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                f0d.m11437d(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof uzc) {
                uzc uzcVar = (uzc) list4;
                C1035t c1035t = new C1035t(uzcVar.f64633a.size() + size);
                c1035t.addAll(uzcVar);
                f0d.m11437d(obj, j, c1035t);
                list = c1035t;
            } else if ((list4 instanceof hvc) && (list4 instanceof mpc)) {
                mpc mpcVar = (mpc) list4;
                if (!mpcVar.zza()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    mpc mpcVarMo5748a = mpcVar.mo5748a(list4.size() + size);
                    f0d.m11437d(obj, j, mpcVarMo5748a);
                    list2 = mpcVarMo5748a;
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
        f0d.m11437d(obj, j, list3);
    }

    @Override // p000.sqc
    /* JADX INFO: renamed from: b */
    public final void mo9867b(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) f0d.m11445l(obj, j);
        if (list instanceof yqc) {
            objUnmodifiableList = ((yqc) list).mo5749b();
        } else {
            if (f34436c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof hvc) && (list instanceof mpc)) {
                mpc mpcVar = (mpc) list;
                if (mpcVar.zza()) {
                    mpcVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        f0d.m11437d(obj, j, objUnmodifiableList);
    }
}
