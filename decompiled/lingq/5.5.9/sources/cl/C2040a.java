package cl;

import al.C0122i;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2core.Reason;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import p463wk.InterfaceC9962e;
import sl.C9072e;

/* JADX INFO: renamed from: cl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2040a {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f10489a;

    /* JADX INFO: renamed from: b */
    public volatile List<? extends Download> f10490b;

    /* JADX INFO: renamed from: cl.a$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f10492b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Reason f10493c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Download f10494d;

        public a(List list, Reason reason, Download download) {
            this.f10492b = list;
            this.f10493c = reason;
            this.f10494d = download;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C2040a.this.f10489a) {
                try {
                    Iterator it = C2040a.this.f10489a.iterator();
                    while (true) {
                        while (true) {
                            if (it.hasNext()) {
                                InterfaceC9962e interfaceC9962e = (InterfaceC9962e) it.next();
                                interfaceC9962e.mo11833b((Download) this.f10492b, this.f10493c);
                                if (this.f10494d != null) {
                                    interfaceC9962e.m18544a();
                                }
                            } else {
                                C9072e c9072e = C9072e.f47360a;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C2040a(String str) {
        C5207g.m11112g(str, "namespace");
        this.f10489a = new LinkedHashSet();
        EmptyList emptyList = EmptyList.f38032a;
    }

    /* JADX INFO: renamed from: a */
    public final void m6210a(List<? extends Download> list, Download download, Reason reason) {
        C5207g.m11112g(list, "downloads");
        C5207g.m11112g(reason, "reason");
        this.f10490b = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Download) next).mo10588m() == Status.QUEUED) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list.iterator();
        loop1: while (true) {
            while (true) {
                if (!it2.hasNext()) {
                    break loop1;
                }
                Object next2 = it2.next();
                if (((Download) next2).mo10588m() == Status.ADDED) {
                    arrayList2.add(next2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((Download) obj).mo10588m() == Status.PAUSED) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (((Download) obj2).mo10588m() == Status.DOWNLOADING) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list) {
            if (((Download) obj3).mo10588m() == Status.COMPLETED) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator<T> it3 = list.iterator();
        loop6: while (true) {
            while (true) {
                if (!it3.hasNext()) {
                    break loop6;
                }
                Object next3 = it3.next();
                if (((Download) next3).mo10588m() == Status.CANCELLED) {
                    arrayList6.add(next3);
                }
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : list) {
            if (((Download) obj4).mo10588m() == Status.FAILED) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : list) {
            if (((Download) obj5).mo10588m() == Status.DELETED) {
                arrayList8.add(obj5);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator<T> it4 = list.iterator();
        loop10: while (true) {
            while (true) {
                if (!it4.hasNext()) {
                    break loop10;
                }
                Object next4 = it4.next();
                if (((Download) next4).mo10588m() == Status.REMOVED) {
                    arrayList9.add(next4);
                }
            }
        }
        if (reason != Reason.DOWNLOAD_BLOCK_UPDATED) {
            Object obj6 = C0122i.f302a;
            C0122i.f304c.post(new a(list, reason, download));
        }
    }
}
