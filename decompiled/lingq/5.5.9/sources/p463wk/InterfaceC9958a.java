package p463wk;

import al.C0122i;
import al.C0125l;
import android.content.Context;
import android.os.Handler;
import com.tonyodev.fetch2.Request;
import com.tonyodev.fetch2.database.FetchDatabaseManagerImpl;
import com.tonyodev.fetch2.fetch.FetchImpl;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import com.tonyodev.fetch2core.C4984a;
import ge.C5789m;
import java.util.LinkedHashMap;
import p041c5.C1702c;
import p122fl.C5578a;
import p122fl.C5579b;
import p122fl.InterfaceC5581d;
import p122fl.InterfaceC5585h;
import p170i5.C6195n;
import p388t1.C9181g;
import p489xk.C10221i;
import p489xk.InterfaceC10219g;
import p514yk.AbstractC10409a;
import p514yk.C10410b;
import p514yk.C10411c;
import p514yk.C10412d;
import p514yk.C10413e;
import sl.C9072e;

/* JADX INFO: renamed from: wk.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9958a {

    /* JADX INFO: renamed from: wk.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static FetchImpl m18534a(C9959b c9959b) {
            C0122i.b bVar;
            synchronized (C0122i.f302a) {
                LinkedHashMap linkedHashMap = C0122i.f303b;
                C0122i.a aVar = (C0122i.a) linkedHashMap.get(c9959b.f50656b);
                if (aVar != null) {
                    bVar = new C0122i.b(c9959b, aVar.f305a, aVar.f306b, aVar.f307c, aVar.f308d, aVar.f309e, aVar.f310f, aVar.f311g);
                } else {
                    C4984a c4984a = new C4984a(c9959b.f50671q, c9959b.f50656b);
                    C0125l c0125l = new C0125l(c9959b.f50656b);
                    InterfaceC10219g fetchDatabaseManagerImpl = c9959b.f50670p;
                    if (fetchDatabaseManagerImpl == null) {
                        Context context = c9959b.f50655a;
                        fetchDatabaseManagerImpl = new FetchDatabaseManagerImpl(context, c9959b.f50656b, c9959b.f50662h, new AbstractC10409a[]{new C10412d(), new C10411c(1), new C10410b(1), new C10411c(0), new C10410b(0), new C10413e()}, c0125l, c9959b.f50667m, new C5578a(context, C5579b.m11819k(context)));
                    }
                    C10221i c10221i = new C10221i(fetchDatabaseManagerImpl);
                    C1702c c1702c = new C1702c(c10221i);
                    C9181g c9181g = new C9181g(c9959b.f50656b);
                    C6195n c6195n = new C6195n(c9959b.f50656b, c1702c);
                    String str = c9959b.f50656b;
                    Handler handler = C0122i.f304c;
                    ListenerCoordinator listenerCoordinator = new ListenerCoordinator(str, c6195n, c1702c, handler);
                    C0122i.b bVar2 = new C0122i.b(c9959b, c4984a, c10221i, c1702c, c6195n, handler, c9181g, listenerCoordinator);
                    linkedHashMap.put(c9959b.f50656b, new C0122i.a(c4984a, c10221i, c1702c, c6195n, handler, c9181g, listenerCoordinator, bVar2.f313a));
                    bVar = bVar2;
                }
                C4984a c4984a2 = bVar.f316d;
                synchronized (c4984a2.f32544a) {
                    if (!c4984a2.f32545b) {
                        c4984a2.f32546c++;
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
            C9959b c9959b2 = bVar.f315c;
            return new FetchImpl(c9959b2.f50656b, c9959b2, bVar.f316d, bVar.f318f, bVar.f314b, c9959b2.f50662h, bVar.f319g, bVar.f317e);
        }
    }

    /* JADX INFO: renamed from: a */
    FetchImpl mo10651a(int i10, InterfaceC5581d... interfaceC5581dArr);

    /* JADX INFO: renamed from: b */
    FetchImpl mo10652b(Request request, C5789m c5789m, InterfaceC5585h interfaceC5585h);

    /* JADX INFO: renamed from: c */
    FetchImpl mo10653c();

    /* JADX INFO: renamed from: h */
    FetchImpl mo10654h(int i10, InterfaceC5581d... interfaceC5581dArr);
}
