package p000;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.C0770a;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class zx2 extends C0770a {

    /* JADX INFO: renamed from: g */
    public final ReentrantLock f72333g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f72334h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f72335i;

    public zx2(WindowLayoutComponent windowLayoutComponent, qn3 qn3Var) {
        super(windowLayoutComponent, qn3Var);
        this.f72333g = new ReentrantLock();
        this.f72334h = new LinkedHashMap();
        this.f72335i = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.C0770a, p000.yx2, p000.q4b
    /* JADX INFO: renamed from: a */
    public final void mo162a(gd3 gd3Var) {
        LinkedHashMap linkedHashMap = this.f72334h;
        LinkedHashMap linkedHashMap2 = this.f72335i;
        ReentrantLock reentrantLock = this.f72333g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(gd3Var);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            i56 i56Var = (i56) linkedHashMap.get(context);
            if (i56Var == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = i56Var.f43543b;
            reentrantLock2.lock();
            try {
                i56Var.f43545d.remove(gd3Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(gd3Var);
                if (i56Var.f43545d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f7142a.removeWindowLayoutInfoListener(i56Var);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.C0770a, p000.yx2, p000.q4b
    /* JADX INFO: renamed from: b */
    public final void mo163b(Context context, ExecutorC3014fu executorC3014fu, gd3 gd3Var) {
        LinkedHashMap linkedHashMap = this.f72334h;
        ReentrantLock reentrantLock = this.f72333g;
        reentrantLock.lock();
        try {
            i56 i56Var = (i56) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f72335i;
            if (i56Var != null) {
                i56Var.m13666a(gd3Var);
                linkedHashMap2.put(gd3Var, context);
            } else {
                i56 i56Var2 = new i56(context);
                linkedHashMap.put(context, i56Var2);
                linkedHashMap2.put(gd3Var, context);
                i56Var2.m13666a(gd3Var);
                this.f7142a.addWindowLayoutInfoListener(context, i56Var2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
