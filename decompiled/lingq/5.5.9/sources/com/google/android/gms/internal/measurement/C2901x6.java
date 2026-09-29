package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2901x6 extends AbstractC2927z6 {

    /* JADX INFO: renamed from: c */
    public static final Class f14507c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.google.android.gms.internal.measurement.AbstractC2927z6
    /* JADX INFO: renamed from: a */
    public final void mo8429a(long j10, Object obj) {
        List listUnmodifiableList;
        List list = (List) C2812q8.m8222j(j10, obj);
        if (list instanceof InterfaceC2888w6) {
            listUnmodifiableList = ((InterfaceC2888w6) list).mo8051b();
        } else {
            if (f14507c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC2824r7) && (list instanceof InterfaceC2836s6)) {
                InterfaceC2836s6 interfaceC2836s6 = (InterfaceC2836s6) list;
                if (interfaceC2836s6.mo8078d()) {
                    interfaceC2836s6.mo8077c();
                }
                return;
            }
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        C2812q8.m8230r(j10, obj, listUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2927z6
    /* JADX INFO: renamed from: b */
    public final void mo8430b(long j10, Object obj, Object obj2) {
        List list;
        List list2;
        List list3;
        List listMo7645r;
        List list4 = (List) C2812q8.m8222j(j10, obj2);
        int size = list4.size();
        List list5 = (List) C2812q8.m8222j(j10, obj);
        if (list5.isEmpty()) {
            if (list5 instanceof InterfaceC2888w6) {
                listMo7645r = new C2875v6(size);
            } else {
                listMo7645r = ((list5 instanceof InterfaceC2824r7) && (list5 instanceof InterfaceC2836s6)) ? ((InterfaceC2836s6) list5).mo7645r(size) : new ArrayList(size);
            }
            C2812q8.m8230r(j10, obj, listMo7645r);
            list3 = listMo7645r;
        } else {
            if (f14507c.isAssignableFrom(list5.getClass())) {
                ArrayList arrayList = new ArrayList(list5.size() + size);
                arrayList.addAll(list5);
                C2812q8.m8230r(j10, obj, arrayList);
                list2 = arrayList;
            } else if (list5 instanceof C2745l8) {
                C2875v6 c2875v6 = new C2875v6(list5.size() + size);
                c2875v6.addAll(c2875v6.size(), (C2745l8) list5);
                C2812q8.m8230r(j10, obj, c2875v6);
                list2 = c2875v6;
            } else {
                if ((list5 instanceof InterfaceC2824r7) && (list5 instanceof InterfaceC2836s6)) {
                    InterfaceC2836s6 interfaceC2836s6 = (InterfaceC2836s6) list5;
                    if (!interfaceC2836s6.mo8078d()) {
                        list = list5;
                        list = list5;
                        list = list5;
                        InterfaceC2836s6 interfaceC2836s6Mo7645r = interfaceC2836s6.mo7645r(list5.size() + size);
                        C2812q8.m8230r(j10, obj, interfaceC2836s6Mo7645r);
                        list = interfaceC2836s6Mo7645r;
                    }
                }
                list = list5;
                list = list5;
                list = list5;
                list = list5;
                list = list5;
                list = list5;
                list3 = list;
            }
            list3 = list2;
        }
        int size2 = list3.size();
        int size3 = list4.size();
        if (size2 > 0 && size3 > 0) {
            list3.addAll(list4);
        }
        if (size2 > 0) {
            list4 = list3;
        }
        C2812q8.m8230r(j10, obj, list4);
    }
}
