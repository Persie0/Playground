package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mtw extends mvc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mtx f41609a;

    public mtw(mtx mtxVar) {
        this.f41609a = mtxVar;
    }

    @Override // p000.mvc
    /* JADX INFO: renamed from: c */
    public final naf mo3817b() {
        return this.f41609a;
    }

    @Override // p000.mvc
    /* JADX INFO: renamed from: e */
    public final Iterator mo16927e() {
        return this.f41609a.mo16933o();
    }

    @Override // p000.mvc, p000.mvl, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return mkv.m16556u(this.f41609a.mo16932n());
    }
}
