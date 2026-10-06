package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gri implements grh {

    /* JADX INFO: renamed from: a */
    public final List f26136a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final HashMap f26137b = new HashMap();

    /* JADX INFO: renamed from: e */
    private final List m9668e(long j) {
        ArrayList arrayList = new ArrayList();
        for (grh grhVar : this.f26136a) {
            if (this.f26137b.get(grhVar) == null || ((Long) this.f26137b.get(grhVar)).longValue() == j) {
                arrayList.add(grhVar);
            }
        }
        return arrayList;
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: a */
    public final void mo8956a(gru gruVar, gyu gyuVar) {
        List listM9668e;
        synchronized (this.f26136a) {
            listM9668e = m9668e(gruVar.f26182a);
        }
        Iterator it = listM9668e.iterator();
        while (it.hasNext()) {
            ((grh) it.next()).mo8956a(gruVar, gyuVar);
        }
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: b */
    public final void mo8957b(gru gruVar) {
        List listM9668e;
        synchronized (this.f26136a) {
            listM9668e = m9668e(gruVar.f26182a);
        }
        Iterator it = listM9668e.iterator();
        while (it.hasNext()) {
            ((grh) it.next()).mo8957b(gruVar);
        }
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: c */
    public final void mo8958c(gru gruVar, gsv gsvVar) {
        List listM9668e;
        synchronized (this.f26136a) {
            listM9668e = m9668e(gruVar.f26182a);
        }
        Iterator it = listM9668e.iterator();
        while (it.hasNext()) {
            ((grh) it.next()).mo8958c(gruVar, gsvVar);
        }
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: d */
    public final void mo8959d(gru gruVar, bkn bknVar) {
        List listM9668e;
        synchronized (this.f26136a) {
            listM9668e = m9668e(gruVar.f26182a);
        }
        Iterator it = listM9668e.iterator();
        while (it.hasNext()) {
            ((grh) it.next()).mo8959d(gruVar, bknVar);
        }
    }
}
