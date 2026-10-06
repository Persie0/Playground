package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvn implements bra, bqz {

    /* JADX INFO: renamed from: a */
    private final List f4539a;

    /* JADX INFO: renamed from: b */
    private final aed f4540b;

    /* JADX INFO: renamed from: c */
    private int f4541c;

    /* JADX INFO: renamed from: d */
    private bpe f4542d;

    /* JADX INFO: renamed from: e */
    private bqz f4543e;

    /* JADX INFO: renamed from: f */
    private List f4544f;

    /* JADX INFO: renamed from: g */
    private boolean f4545g;

    public bvn(List list, aed aedVar) {
        this.f4540b = aedVar;
        bzq.m3276p(list);
        this.f4539a = list;
        this.f4541c = 0;
    }

    /* JADX INFO: renamed from: h */
    private final void m3098h() {
        if (this.f4545g) {
            return;
        }
        if (this.f4541c < this.f4539a.size() - 1) {
            this.f4541c++;
            mo2941f(this.f4542d, this.f4543e);
        } else {
            bzq.m3278r(this.f4544f);
            this.f4543e.mo2946e(new bsv("Fetch failed", new ArrayList(this.f4544f)));
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return ((bra) this.f4539a.get(0)).mo2934a();
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
        this.f4545g = true;
        Iterator it = this.f4539a.iterator();
        while (it.hasNext()) {
            ((bra) it.next()).mo2937aY();
        }
    }

    @Override // p000.bqz
    /* JADX INFO: renamed from: b */
    public final void mo2945b(Object obj) {
        if (obj != null) {
            this.f4543e.mo2945b(obj);
        } else {
            m3098h();
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        List list = this.f4544f;
        if (list != null) {
            this.f4540b.mo321b(list);
        }
        this.f4544f = null;
        Iterator it = this.f4539a.iterator();
        while (it.hasNext()) {
            ((bra) it.next()).mo2939d();
        }
    }

    @Override // p000.bqz
    /* JADX INFO: renamed from: e */
    public final void mo2946e(Exception exc) {
        List list = this.f4544f;
        bzq.m3278r(list);
        list.add(exc);
        m3098h();
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) {
        this.f4542d = bpeVar;
        this.f4543e = bqzVar;
        this.f4544f = (List) this.f4540b.mo320a();
        ((bra) this.f4539a.get(this.f4541c)).mo2941f(bpeVar, this);
        if (this.f4545g) {
            mo2937aY();
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        return ((bra) this.f4539a.get(0)).mo2942g();
    }
}
