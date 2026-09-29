package p000;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class mj8 {

    /* JADX INFO: renamed from: a */
    public final C3104i9 f51400a;

    /* JADX INFO: renamed from: b */
    public final or3 f51401b;

    /* JADX INFO: renamed from: c */
    public final boolean f51402c;

    /* JADX INFO: renamed from: d */
    public final List f51403d;

    /* JADX INFO: renamed from: e */
    public int f51404e;

    /* JADX INFO: renamed from: f */
    public List f51405f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f51406g;

    public mj8(C3104i9 c3104i9, or3 or3Var, i18 i18Var, boolean z) {
        List listM15120k;
        or3Var.getClass();
        this.f51400a = c3104i9;
        this.f51401b = or3Var;
        this.f51402c = z;
        EmptyList emptyList = EmptyList.f47638a;
        this.f51403d = emptyList;
        this.f51405f = emptyList;
        this.f51406g = new ArrayList();
        ex3 ex3Var = c3104i9.f43720h;
        ex3Var.getClass();
        URI uriM11383i = ex3Var.m11383i();
        if (uriM11383i.getHost() == null) {
            listM15120k = kcb.m15120k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = c3104i9.f43719g.select(uriM11383i);
            List<Proxy> list = listSelect;
            listM15120k = (list == null || list.isEmpty()) ? kcb.m15120k(new Proxy[]{Proxy.NO_PROXY}) : kcb.m15119j(listSelect);
        }
        this.f51403d = listM15120k;
        this.f51404e = 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16858a() {
        return this.f51404e < this.f51403d.size() || !this.f51406g.isEmpty();
    }
}
