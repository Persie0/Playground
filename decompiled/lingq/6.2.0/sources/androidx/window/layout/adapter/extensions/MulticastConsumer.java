package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import p000.dy2;
import p000.gd3;
import p000.lk1;
import p000.q6b;

/* JADX INFO: loaded from: classes2.dex */
public final class MulticastConsumer implements lk1 {

    /* JADX INFO: renamed from: a */
    public final Context f7138a;

    /* JADX INFO: renamed from: c */
    public q6b f7140c;

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f7139b = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f7141d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.f7138a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m2896a(gd3 gd3Var) {
        ReentrantLock reentrantLock = this.f7139b;
        reentrantLock.lock();
        try {
            q6b q6bVar = this.f7140c;
            if (q6bVar != null) {
                gd3Var.accept(q6bVar);
            }
            this.f7141d.add(gd3Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.lk1
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f7139b;
        reentrantLock.lock();
        try {
            q6b q6bVarM10744c = dy2.m10744c(this.f7138a, windowLayoutInfo);
            this.f7140c = q6bVarM10744c;
            Iterator it = this.f7141d.iterator();
            while (it.hasNext()) {
                ((lk1) it.next()).accept(q6bVarM10744c);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2897b() {
        return this.f7141d.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final void m2898c(lk1 lk1Var) {
        ReentrantLock reentrantLock = this.f7139b;
        reentrantLock.lock();
        try {
            this.f7141d.remove(lk1Var);
        } finally {
            reentrantLock.unlock();
        }
    }
}
