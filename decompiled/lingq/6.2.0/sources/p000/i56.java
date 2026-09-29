package p000;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class i56 implements lk1, Consumer2 {

    /* JADX INFO: renamed from: a */
    public final Context f43542a;

    /* JADX INFO: renamed from: c */
    public q6b f43544c;

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f43543b = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f43545d = new LinkedHashSet();

    public i56(Context context) {
        this.f43542a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m13666a(gd3 gd3Var) {
        ReentrantLock reentrantLock = this.f43543b;
        reentrantLock.lock();
        try {
            q6b q6bVar = this.f43544c;
            if (q6bVar != null) {
                gd3Var.accept(q6bVar);
            }
            this.f43545d.add(gd3Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.lk1
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f43543b;
        reentrantLock.lock();
        try {
            q6b q6bVarM10744c = dy2.m10744c(this.f43542a, windowLayoutInfo);
            this.f43544c = q6bVarM10744c;
            Iterator it = this.f43545d.iterator();
            while (it.hasNext()) {
                ((lk1) it.next()).accept(q6bVarM10744c);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
