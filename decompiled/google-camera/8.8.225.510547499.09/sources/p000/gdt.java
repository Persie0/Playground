package p000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdt implements kba {

    /* JADX INFO: renamed from: a */
    public final jwz f24337a;

    /* JADX INFO: renamed from: d */
    public final jwy f24340d;

    /* JADX INFO: renamed from: e */
    public int f24341e;

    /* JADX INFO: renamed from: b */
    public final Object f24338b = new ReentrantLock(true);

    /* JADX INFO: renamed from: c */
    public final LinkedList f24339c = new LinkedList();

    /* JADX INFO: renamed from: f */
    public boolean f24342f = false;

    public gdt(int i) {
        this.f24341e = i;
        jwy jwyVar = new jwy(Integer.valueOf(i));
        this.f24340d = jwyVar;
        this.f24337a = new jwz(jwyVar);
    }

    /* JADX INFO: renamed from: a */
    public final int m9081a() {
        if (this.f24342f || !this.f24339c.isEmpty()) {
            return 0;
        }
        return this.f24341e;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f24338b) {
            if (this.f24342f) {
                return;
            }
            this.f24342f = true;
            for (nax naxVar : this.f24339c) {
                naxVar.f41919a = new gdx("FiniteTicketPool closing.");
                arrayList.add(naxVar);
            }
            this.f24340d.f34974a = Integer.valueOf(m9081a());
            if (arrayList.size() > 0) {
                throw null;
            }
            this.f24340d.m13646c();
        }
    }
}
