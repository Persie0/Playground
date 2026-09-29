package al;

import android.os.Handler;
import android.os.Looper;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import com.tonyodev.fetch2core.C4984a;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import p033bl.C1614e;
import p041c5.C1702c;
import p077dl.C5200a;
import p170i5.C6195n;
import p290o6.C7967l0;
import p349qo.C8656b;
import p388t1.C9181g;
import p463wk.C9959b;
import p489xk.C10221i;
import p489xk.InterfaceC10219g;
import p539zk.C10512b;
import sl.C9072e;

/* JADX INFO: renamed from: al.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0122i {

    /* JADX INFO: renamed from: a */
    public static final Object f302a = new Object();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f303b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public static final Handler f304c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: al.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C4984a f305a;

        /* JADX INFO: renamed from: b */
        public final C10221i f306b;

        /* JADX INFO: renamed from: c */
        public final C1702c f307c;

        /* JADX INFO: renamed from: d */
        public final C6195n f308d;

        /* JADX INFO: renamed from: e */
        public final Handler f309e;

        /* JADX INFO: renamed from: f */
        public final C9181g f310f;

        /* JADX INFO: renamed from: g */
        public final ListenerCoordinator f311g;

        /* JADX INFO: renamed from: h */
        public final C5200a f312h;

        public a(C4984a c4984a, C10221i c10221i, C1702c c1702c, C6195n c6195n, Handler handler, C9181g c9181g, ListenerCoordinator listenerCoordinator, C5200a c5200a) {
            C5207g.m11112g(handler, "uiHandler");
            C5207g.m11112g(c5200a, "networkInfoProvider");
            this.f305a = c4984a;
            this.f306b = c10221i;
            this.f307c = c1702c;
            this.f308d = c6195n;
            this.f309e = handler;
            this.f310f = c9181g;
            this.f311g = listenerCoordinator;
            this.f312h = c5200a;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C5207g.m11106a(this.f305a, aVar.f305a) && C5207g.m11106a(this.f306b, aVar.f306b) && C5207g.m11106a(this.f307c, aVar.f307c) && C5207g.m11106a(this.f308d, aVar.f308d) && C5207g.m11106a(this.f309e, aVar.f309e) && C5207g.m11106a(this.f310f, aVar.f310f) && C5207g.m11106a(this.f311g, aVar.f311g) && C5207g.m11106a(this.f312h, aVar.f312h)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            C4984a c4984a = this.f305a;
            int iHashCode = (c4984a != null ? c4984a.hashCode() : 0) * 31;
            C10221i c10221i = this.f306b;
            int iHashCode2 = (iHashCode + (c10221i != null ? c10221i.hashCode() : 0)) * 31;
            C1702c c1702c = this.f307c;
            int iHashCode3 = (iHashCode2 + (c1702c != null ? c1702c.hashCode() : 0)) * 31;
            C6195n c6195n = this.f308d;
            int iHashCode4 = (iHashCode3 + (c6195n != null ? c6195n.hashCode() : 0)) * 31;
            Handler handler = this.f309e;
            int iHashCode5 = (iHashCode4 + (handler != null ? handler.hashCode() : 0)) * 31;
            C9181g c9181g = this.f310f;
            int iHashCode6 = (iHashCode5 + (c9181g != null ? c9181g.hashCode() : 0)) * 31;
            ListenerCoordinator listenerCoordinator = this.f311g;
            int iHashCode7 = (iHashCode6 + (listenerCoordinator != null ? listenerCoordinator.hashCode() : 0)) * 31;
            C5200a c5200a = this.f312h;
            return iHashCode7 + (c5200a != null ? c5200a.hashCode() : 0);
        }

        public final String toString() {
            return "Holder(handlerWrapper=" + this.f305a + ", fetchDatabaseManagerWrapper=" + this.f306b + ", downloadProvider=" + this.f307c + ", groupInfoProvider=" + this.f308d + ", uiHandler=" + this.f309e + ", downloadManagerCoordinator=" + this.f310f + ", listenerCoordinator=" + this.f311g + ", networkInfoProvider=" + this.f312h + ")";
        }
    }

    /* JADX INFO: renamed from: al.i$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C5200a f313a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0114a f314b;

        /* JADX INFO: renamed from: c */
        public final C9959b f315c;

        /* JADX INFO: renamed from: d */
        public final C4984a f316d;

        /* JADX INFO: renamed from: e */
        public final C10221i f317e;

        /* JADX INFO: renamed from: f */
        public final Handler f318f;

        /* JADX INFO: renamed from: g */
        public final ListenerCoordinator f319g;

        /* JADX INFO: renamed from: al.i$b$a */
        public static final class a implements InterfaceC10219g.a<DownloadInfo> {
            public a() {
            }

            @Override // p489xk.InterfaceC10219g.a
            /* JADX INFO: renamed from: a */
            public final void mo522a(DownloadInfo downloadInfo) {
                C8656b.m16909q(b.this.f315c.f50668n.mo11808f(C8656b.m16916x(downloadInfo, "GET")), downloadInfo.f32331a);
            }
        }

        public b(C9959b c9959b, C4984a c4984a, C10221i c10221i, C1702c c1702c, C6195n c6195n, Handler handler, C9181g c9181g, ListenerCoordinator listenerCoordinator) {
            C5207g.m11112g(c4984a, "handlerWrapper");
            C5207g.m11112g(c10221i, "fetchDatabaseManagerWrapper");
            C5207g.m11112g(c1702c, "downloadProvider");
            C5207g.m11112g(c6195n, "groupInfoProvider");
            C5207g.m11112g(handler, "uiHandler");
            C5207g.m11112g(c9181g, "downloadManagerCoordinator");
            C5207g.m11112g(listenerCoordinator, "listenerCoordinator");
            this.f315c = c9959b;
            this.f316d = c4984a;
            this.f317e = c10221i;
            this.f318f = handler;
            this.f319g = listenerCoordinator;
            C7967l0 c7967l0 = new C7967l0(c10221i);
            C5200a c5200a = new C5200a(c9959b.f50655a, c9959b.f50673s);
            this.f313a = c5200a;
            C10512b c10512b = new C10512b(c9959b.f50660f, c9959b.f50657c, c9959b.f50658d, c9959b.f50662h, c5200a, c9959b.f50664j, c7967l0, c9181g, listenerCoordinator, c9959b.f50665k, c9959b.f50666l, c9959b.f50668n, c9959b.f50655a, c9959b.f50656b, c6195n, c9959b.f50676v, c9959b.f50677w);
            C1614e c1614e = new C1614e(c4984a, c1702c, c10512b, c5200a, c9959b.f50662h, listenerCoordinator, c9959b.f50657c, c9959b.f50655a, c9959b.f50656b, c9959b.f50672r);
            c1614e.m5272q(c9959b.f50661g);
            InterfaceC0114a interfaceC0114a = c9959b.f50678x;
            this.f314b = interfaceC0114a == null ? new C0116c(c9959b.f50656b, c10221i, c10512b, c1614e, c9959b.f50662h, c9959b.f50663i, c9959b.f50660f, c9959b.f50665k, listenerCoordinator, handler, c9959b.f50668n, c9959b.f50669o, c6195n, c9959b.f50672r, c9959b.f50675u) : interfaceC0114a;
            c10221i.mo10619b0(new a());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static void m521a(String str) {
        int i10;
        C5207g.m11112g(str, "namespace");
        synchronized (f302a) {
            LinkedHashMap linkedHashMap = f303b;
            a aVar = (a) linkedHashMap.get(str);
            if (aVar != null) {
                C4984a c4984a = aVar.f305a;
                synchronized (c4984a.f32544a) {
                    if (!c4984a.f32545b) {
                        int i11 = c4984a.f32546c;
                        if (i11 != 0) {
                            c4984a.f32546c = i11 - 1;
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
                C4984a c4984a2 = aVar.f305a;
                synchronized (c4984a2.f32544a) {
                    try {
                        i10 = !c4984a2.f32545b ? c4984a2.f32546c : 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i10 == 0) {
                    aVar.f305a.m10686a();
                    aVar.f311g.m10655a();
                    C6195n c6195n = aVar.f308d;
                    synchronized (c6195n.f36056a) {
                        ((Map) c6195n.f36057b).clear();
                        C9072e c9072e2 = C9072e.f47360a;
                    }
                    aVar.f306b.close();
                    aVar.f310f.m17512a();
                    aVar.f312h.m10972c();
                    linkedHashMap.remove(str);
                }
            }
            C9072e c9072e3 = C9072e.f47360a;
        }
    }
}
