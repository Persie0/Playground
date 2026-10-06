package p000;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gsc implements gsa {

    /* JADX INFO: renamed from: a */
    public final grz f26211a;

    /* JADX INFO: renamed from: b */
    public final Object f26212b;

    public gsc() {
        lku.m15669w(true);
        this.f26212b = new Object();
        this.f26211a = new grz();
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo9690a(Object obj);

    /* JADX INFO: renamed from: b */
    protected Object mo9691b(Object obj) {
        throw null;
    }

    @Override // p000.gsa
    /* JADX INFO: renamed from: c */
    public final gsb mo9697c(Object obj) {
        Object objMo9690a;
        synchronized (this.f26212b) {
            grz grzVar = this.f26211a;
            synchronized (grzVar.f26197a) {
                if (((LinkedList) grzVar.f26199c).removeLastOccurrence(obj)) {
                    Queue queue = (Queue) ((HashMap) grzVar.f26200d).get(obj);
                    queue.getClass();
                    objMo9690a = queue.remove();
                    int i = grzVar.f26198b;
                    grz.m9692a();
                    grzVar.f26198b = i - 1;
                } else {
                    objMo9690a = null;
                }
            }
        }
        if (objMo9690a == null) {
            objMo9690a = mo9690a(obj);
        }
        return new gsb(this, obj, objMo9690a);
    }
}
