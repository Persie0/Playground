package hn;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6899b;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p260m8.C7499b;
import sl.C9072e;
import tl.C9325m;
import tl.C9331s;
import tl.C9332t;
import tl.C9333u;

/* JADX INFO: renamed from: hn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6087g {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f35829a = new LinkedHashMap();

    /* JADX INFO: renamed from: hn.g$a */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final String f35830a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6087g f35831b;

        /* JADX INFO: renamed from: hn.g$a$a, reason: collision with other inner class name */
        public final class C10636a {

            /* JADX INFO: renamed from: a */
            public final String f35832a;

            /* JADX INFO: renamed from: b */
            public final ArrayList f35833b = new ArrayList();

            /* JADX INFO: renamed from: c */
            public Pair<String, C6089i> f35834c = new Pair<>("V", null);

            public C10636a(a aVar, String str) {
                this.f35832a = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public final void m12520a(String str, C6083c... c6083cArr) {
                C6089i c6089i;
                C5207g.m11111f(str, "type");
                ArrayList arrayList = this.f35833b;
                if (c6083cArr.length == 0) {
                    c6089i = null;
                } else {
                    C9332t c9332tM13394z0 = C6744b.m13394z0(c6083cArr);
                    int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(c9332tM13394z0, 10));
                    if (iM14941g0 < 16) {
                        iM14941g0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
                    Iterator it = c9332tM13394z0.iterator();
                    while (true) {
                        C9333u c9333u = (C9333u) it;
                        if (!c9333u.hasNext()) {
                            break;
                        }
                        C9331s c9331s = (C9331s) c9333u.next();
                        linkedHashMap.put(Integer.valueOf(c9331s.f48066a), (C6083c) c9331s.f48067b);
                    }
                    c6089i = new C6089i(linkedHashMap);
                }
                arrayList.add(new Pair(str, c6089i));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: b */
            public final void m12521b(String str, C6083c... c6083cArr) {
                C5207g.m11111f(str, "type");
                C9332t c9332tM13394z0 = C6744b.m13394z0(c6083cArr);
                int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(c9332tM13394z0, 10));
                if (iM14941g0 < 16) {
                    iM14941g0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
                Iterator it = c9332tM13394z0.iterator();
                while (true) {
                    C9333u c9333u = (C9333u) it;
                    if (!c9333u.hasNext()) {
                        this.f35834c = new Pair<>(str, new C6089i(linkedHashMap));
                        return;
                    } else {
                        C9331s c9331s = (C9331s) c9333u.next();
                        linkedHashMap.put(Integer.valueOf(c9331s.f48066a), (C6083c) c9331s.f48067b);
                    }
                }
            }

            /* JADX INFO: renamed from: c */
            public final void m12522c(JvmPrimitiveType jvmPrimitiveType) {
                C5207g.m11111f(jvmPrimitiveType, "type");
                String desc = jvmPrimitiveType.getDesc();
                C5207g.m11110e(desc, "type.desc");
                this.f35834c = new Pair<>(desc, null);
            }
        }

        public a(C6087g c6087g, String str) {
            C5207g.m11111f(str, "className");
            this.f35831b = c6087g;
            this.f35830a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m12519a(String str, InterfaceC2052l<? super C10636a, C9072e> interfaceC2052l) {
            LinkedHashMap linkedHashMap = this.f35831b.f35829a;
            C10636a c10636a = new C10636a(this, str);
            interfaceC2052l.mo528n(c10636a);
            ArrayList arrayList = c10636a.f35833b;
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) it.next()).f38012a);
            }
            String strM13778f = C6899b.m13778f(this.f35830a, C6899b.m13777e(c10636a.f35832a, c10636a.f35834c.f38012a, arrayList2));
            C6089i c6089i = c10636a.f35834c.f38013b;
            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((C6089i) ((Pair) it2.next()).f38013b);
            }
            linkedHashMap.put(strM13778f, new C6086f(c6089i, arrayList3));
        }
    }
}
