package p000;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class a79 implements q4b {

    /* JADX INFO: renamed from: c */
    public static volatile a79 f326c;

    /* JADX INFO: renamed from: d */
    public static final ReentrantLock f327d = new ReentrantLock();

    /* JADX INFO: renamed from: a */
    public final kx2 f328a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f329b = new CopyOnWriteArrayList();

    public a79(y69 y69Var) {
        this.f328a = y69Var;
        if (y69Var != null) {
            y69Var.m24962d(new vqb(this, 29));
        }
    }

    @Override // p000.q4b
    /* JADX INFO: renamed from: a */
    public final void mo162a(gd3 gd3Var) {
        synchronized (f327d) {
            try {
                if (this.f328a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f329b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    z69 z69Var = (z69) it.next();
                    if (z69Var.f70991b == gd3Var) {
                        arrayList.add(z69Var);
                    }
                }
                this.f329b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((z69) it2.next()).f70990a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f329b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((z69) it3.next()).f70990a.equals(activity)) {
                                }
                            }
                        }
                    }
                    kx2 kx2Var = this.f328a;
                    if (kx2Var != null) {
                        ((y69) kx2Var).m24960b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.q4b
    /* JADX INFO: renamed from: b */
    public final void mo163b(Context context, ExecutorC3014fu executorC3014fu, gd3 gd3Var) {
        Object next;
        WindowManager.LayoutParams attributes;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        EmptyList emptyList = EmptyList.f47638a;
        if (activity == null) {
            gd3Var.accept(new q6b(emptyList));
            return;
        }
        ReentrantLock reentrantLock = f327d;
        reentrantLock.lock();
        try {
            kx2 kx2Var = this.f328a;
            if (kx2Var == null) {
                gd3Var.accept(new q6b(emptyList));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f329b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (((z69) it.next()).f70990a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            z69 z69Var = new z69(activity, executorC3014fu, gd3Var);
            copyOnWriteArrayList.add(z69Var);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!activity.equals(((z69) next).f70990a));
                z69 z69Var2 = (z69) next;
                q6b q6bVar = z69Var2 != null ? z69Var2.f70992c : null;
                if (q6bVar != null) {
                    z69Var.f70992c = q6bVar;
                    z69Var.f70991b.accept(q6bVar);
                }
            } else {
                y69 y69Var = (y69) kx2Var;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    y69Var.m24961c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new x69(y69Var, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
