package p467wo;

import dm.C5207g;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p290o6.C7967l0;
import p385sf.C9000b;
import so.AbstractC9093k;
import so.C9082a;
import so.C9083a0;
import so.C9096n;
import so.InterfaceC9086d;
import to.C9347b;

/* JADX INFO: renamed from: wo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9992g {

    /* JADX INFO: renamed from: a */
    public final C9082a f50797a;

    /* JADX INFO: renamed from: b */
    public final C7967l0 f50798b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9086d f50799c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9093k f50800d;

    /* JADX INFO: renamed from: e */
    public List<? extends Proxy> f50801e;

    /* JADX INFO: renamed from: f */
    public int f50802f;

    /* JADX INFO: renamed from: g */
    public List<? extends InetSocketAddress> f50803g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f50804h;

    /* JADX INFO: renamed from: wo.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C9083a0> f50805a;

        /* JADX INFO: renamed from: b */
        public int f50806b;

        public a(ArrayList arrayList) {
            this.f50805a = arrayList;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m18581a() {
            return this.f50806b < this.f50805a.size();
        }
    }

    public C9992g(C9082a c9082a, C7967l0 c7967l0, C9990e c9990e, AbstractC9093k abstractC9093k) {
        List<? extends Proxy> listM17717x;
        C5207g.m11111f(c9082a, "address");
        C5207g.m11111f(c7967l0, "routeDatabase");
        C5207g.m11111f(c9990e, "call");
        C5207g.m11111f(abstractC9093k, "eventListener");
        this.f50797a = c9082a;
        this.f50798b = c7967l0;
        this.f50799c = c9990e;
        this.f50800d = abstractC9093k;
        EmptyList emptyList = EmptyList.f38032a;
        this.f50801e = emptyList;
        this.f50803g = emptyList;
        this.f50804h = new ArrayList();
        C9096n c9096n = c9082a.f47378i;
        C5207g.m11111f(c9096n, "url");
        Proxy proxy = c9082a.f47376g;
        if (proxy != null) {
            listM17717x = C9000b.m17251q(proxy);
        } else {
            URI uriM17327h = c9096n.m17327h();
            if (uriM17327h.getHost() == null) {
                listM17717x = C9347b.m17705l(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = c9082a.f47377h.select(uriM17327h);
                if (listSelect == null || listSelect.isEmpty()) {
                    listM17717x = C9347b.m17705l(Proxy.NO_PROXY);
                } else {
                    C5207g.m11110e(listSelect, "proxiesOrNull");
                    listM17717x = C9347b.m17717x(listSelect);
                }
            }
        }
        this.f50801e = listM17717x;
        this.f50802f = 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18580a() {
        if (!(this.f50802f < this.f50801e.size()) && !(!this.f50804h.isEmpty())) {
            return false;
        }
        return true;
    }
}
