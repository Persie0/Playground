package p000;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qt2 implements um9, ap7 {

    /* JADX INFO: renamed from: a */
    public final HashMap f58181a = new HashMap();

    /* JADX INFO: renamed from: b */
    public ArrayDeque f58182b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final Executor f58183c;

    public qt2(Executor executor) {
        this.f58183c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m20144a(Executor executor, vt2 vt2Var) {
        try {
            executor.getClass();
            if (!this.f58181a.containsKey(vz1.class)) {
                this.f58181a.put(vz1.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f58181a.get(vz1.class)).put(vt2Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
