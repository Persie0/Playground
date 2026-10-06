package p000;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsb implements kba {

    /* JADX INFO: renamed from: a */
    private final Object f26207a = new Object();

    /* JADX INFO: renamed from: b */
    private final gsc f26208b;

    /* JADX INFO: renamed from: c */
    private Object f26209c;

    /* JADX INFO: renamed from: d */
    private Object f26210d;

    public gsb(gsc gscVar, Object obj, Object obj2) {
        this.f26208b = gscVar;
        this.f26209c = obj;
        this.f26210d = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m9698a() {
        Object obj;
        synchronized (this.f26207a) {
            obj = this.f26210d;
        }
        return obj;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        Queue linkedList;
        Object objRemoveLast;
        synchronized (this.f26207a) {
            Object obj = this.f26210d;
            if (obj != null) {
                gsc gscVar = this.f26208b;
                Object obj2 = this.f26209c;
                synchronized (gscVar.f26212b) {
                    grz grzVar = gscVar.f26211a;
                    Object objMo9691b = gscVar.mo9691b(obj);
                    obj2.getClass();
                    synchronized (grzVar.f26197a) {
                        ((LinkedList) grzVar.f26199c).push(obj2);
                        if (((HashMap) grzVar.f26200d).containsKey(obj2)) {
                            linkedList = (Queue) ((HashMap) grzVar.f26200d).get(obj2);
                        } else {
                            linkedList = new LinkedList();
                            ((HashMap) grzVar.f26200d).put(obj2, linkedList);
                        }
                        linkedList.add(objMo9691b);
                        int i = grzVar.f26198b;
                        grz.m9692a();
                        grzVar.f26198b = i + 1;
                        while (grzVar.f26198b > 2 && !((LinkedList) grzVar.f26199c).isEmpty() && (objRemoveLast = ((LinkedList) grzVar.f26199c).removeLast()) != null) {
                            Queue queue = (Queue) ((HashMap) grzVar.f26200d).get(objRemoveLast);
                            queue.getClass();
                            queue.remove();
                            if (queue.isEmpty()) {
                                ((HashMap) grzVar.f26200d).remove(objRemoveLast);
                            }
                            int i2 = grzVar.f26198b;
                            grz.m9692a();
                            grzVar.f26198b = i2 - 1;
                        }
                        if (grzVar.f26198b < 0 || (((LinkedList) grzVar.f26199c).isEmpty() && grzVar.f26198b != 0)) {
                            throw new IllegalStateException("LruPool.sizeOf() is reporting inconsistent results!");
                        }
                    }
                }
                this.f26210d = null;
                this.f26209c = null;
            }
        }
    }
}
