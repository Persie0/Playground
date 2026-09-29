package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class vg5 {

    /* JADX INFO: renamed from: a */
    public final Thread f65345a;

    /* JADX INFO: renamed from: b */
    public final qp9 f65346b;

    /* JADX INFO: renamed from: c */
    public final tg5 f65347c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f65348d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f65349e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f65350f;

    /* JADX INFO: renamed from: g */
    public final Object f65351g;

    /* JADX INFO: renamed from: h */
    public boolean f65352h;

    /* JADX INFO: renamed from: i */
    public final boolean f65353i;

    public vg5(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, mp9 mp9Var, tg5 tg5Var, boolean z) {
        this.f65345a = thread;
        this.f65348d = copyOnWriteArraySet;
        this.f65347c = tg5Var;
        this.f65351g = new Object();
        this.f65349e = new ArrayDeque();
        this.f65350f = new ArrayDeque();
        if (looper == null || mp9Var == null || tg5Var == null) {
            this.f65346b = null;
        } else {
            this.f65346b = mp9Var.m16990a(looper, new rg5(this, 0));
        }
        this.f65353i = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m23268a(Object obj) {
        obj.getClass();
        synchronized (this.f65351g) {
            try {
                if (this.f65352h) {
                    return;
                }
                this.f65348d.add(new ug5(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m23269b() {
        if (this.f65353i) {
            bna.m3987z(Thread.currentThread() == this.f65345a);
        }
        ArrayDeque arrayDeque = this.f65350f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.f65347c != null) {
            qp9 qp9Var = this.f65346b;
            qp9Var.getClass();
            Handler handler = qp9Var.f58033a;
            if (!handler.hasMessages(1)) {
                pp9 pp9VarM20096b = qp9.m20096b();
                Message messageObtainMessage = handler.obtainMessage(1);
                pp9VarM20096b.f56637a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                pp9VarM20096b.m19439a();
            }
        }
        ArrayDeque arrayDeque2 = this.f65349e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23270c(int i, sg5 sg5Var) {
        int i2 = 1;
        if (this.f65353i) {
            bna.m3987z(Thread.currentThread() == this.f65345a);
        }
        this.f65350f.add(new yc2(new CopyOnWriteArraySet(this.f65348d), i, i2, sg5Var));
    }

    /* JADX INFO: renamed from: d */
    public final void m23271d(int i, sg5 sg5Var) {
        m23270c(i, sg5Var);
        m23269b();
    }

    public vg5(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
