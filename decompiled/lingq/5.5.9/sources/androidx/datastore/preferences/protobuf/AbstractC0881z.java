package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0881z {

    /* JADX INFO: renamed from: a */
    public static final a f5950a = new a();

    /* JADX INFO: renamed from: b */
    public static final b f5951b = new b();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static final class a extends AbstractC0881z {

        /* JADX INFO: renamed from: c */
        public static final Class<?> f5952c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX INFO: renamed from: d */
        public static List m3499d(int i10, long j10, Object obj) {
            List list;
            List listMo3165E;
            List listMo3165E2 = (List) C0841f1.m3228n(j10, obj);
            if (listMo3165E2.isEmpty()) {
                if (listMo3165E2 instanceof InterfaceC0879y) {
                    listMo3165E = new C0877x(i10);
                } else {
                    listMo3165E = ((listMo3165E2 instanceof InterfaceC0866r0) && (listMo3165E2 instanceof C0871u.c)) ? ((C0871u.c) listMo3165E2).mo3165E(i10) : new ArrayList(i10);
                }
                C0841f1.m3235u(j10, obj, listMo3165E);
                return listMo3165E;
            }
            if (f5952c.isAssignableFrom(listMo3165E2.getClass())) {
                ArrayList arrayList = new ArrayList(listMo3165E2.size() + i10);
                arrayList.addAll(listMo3165E2);
                C0841f1.m3235u(j10, obj, arrayList);
                list = arrayList;
            } else {
                if (!(listMo3165E2 instanceof C0838e1)) {
                    if ((listMo3165E2 instanceof InterfaceC0866r0) && (listMo3165E2 instanceof C0871u.c)) {
                        C0871u.c cVar = (C0871u.c) listMo3165E2;
                        if (!cVar.mo3193j0()) {
                            listMo3165E2 = cVar.mo3165E(listMo3165E2.size() + i10);
                            C0841f1.m3235u(j10, obj, listMo3165E2);
                        }
                    }
                    return listMo3165E2;
                }
                C0877x c0877x = new C0877x(listMo3165E2.size() + i10);
                c0877x.addAll((C0838e1) listMo3165E2);
                C0841f1.m3235u(j10, obj, c0877x);
                list = c0877x;
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0881z
        /* JADX INFO: renamed from: a */
        public final void mo3496a(long j10, Object obj) {
            Object objUnmodifiableList;
            List list = (List) C0841f1.m3228n(j10, obj);
            if (list instanceof InterfaceC0879y) {
                objUnmodifiableList = ((InterfaceC0879y) list).mo3214n();
            } else {
                if (f5952c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC0866r0) && (list instanceof C0871u.c)) {
                    C0871u.c cVar = (C0871u.c) list;
                    if (cVar.mo3193j0()) {
                        cVar.mo3194z();
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            C0841f1.m3235u(j10, obj, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0881z
        /* JADX INFO: renamed from: b */
        public final void mo3497b(long j10, Object obj, Object obj2) {
            List list = (List) C0841f1.m3228n(j10, obj2);
            List listM3499d = m3499d(list.size(), j10, obj);
            int size = listM3499d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listM3499d.addAll(list);
            }
            if (size > 0) {
                list = listM3499d;
            }
            C0841f1.m3235u(j10, obj, list);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0881z
        /* JADX INFO: renamed from: c */
        public final List mo3498c(long j10, Object obj) {
            return m3499d(10, j10, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$b */
    public static final class b extends AbstractC0881z {
        @Override // androidx.datastore.preferences.protobuf.AbstractC0881z
        /* JADX INFO: renamed from: a */
        public final void mo3496a(long j10, Object obj) {
            ((C0871u.c) C0841f1.m3228n(j10, obj)).mo3194z();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0881z
        /* JADX INFO: renamed from: b */
        public final void mo3497b(long j10, Object obj, Object obj2) {
            C0871u.c cVarMo3165E = (C0871u.c) C0841f1.m3228n(j10, obj);
            C0871u.c cVar = (C0871u.c) C0841f1.m3228n(j10, obj2);
            int size = cVarMo3165E.size();
            int size2 = cVar.size();
            if (size > 0 && size2 > 0) {
                if (!cVarMo3165E.mo3193j0()) {
                    cVarMo3165E = cVarMo3165E.mo3165E(size2 + size);
                }
                cVarMo3165E.addAll(cVar);
            }
            if (size > 0) {
                cVar = cVarMo3165E;
            }
            C0841f1.m3235u(j10, obj, cVar);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0881z
        /* JADX INFO: renamed from: c */
        public final List mo3498c(long j10, Object obj) {
            C0871u.c cVar = (C0871u.c) C0841f1.m3228n(j10, obj);
            if (cVar.mo3193j0()) {
                return cVar;
            }
            int size = cVar.size();
            C0871u.c cVarMo3165E = cVar.mo3165E(size == 0 ? 10 : size * 2);
            C0841f1.m3235u(j10, obj, cVarMo3165E);
            return cVarMo3165E;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3496a(long j10, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void mo3497b(long j10, Object obj, Object obj2);

    /* JADX INFO: renamed from: c */
    public abstract List mo3498c(long j10, Object obj);
}
