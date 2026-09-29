package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: uw */
/* JADX INFO: loaded from: classes.dex */
public final class C3663uw {

    /* JADX INFO: renamed from: h */
    public static final ExecutorC3760xi f64448h = new ExecutorC3760xi(1);

    /* JADX INFO: renamed from: a */
    public final qn3 f64449a;

    /* JADX INFO: renamed from: b */
    public final b64 f64450b;

    /* JADX INFO: renamed from: e */
    public List f64453e;

    /* JADX INFO: renamed from: g */
    public int f64455g;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f64452d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public List f64454f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public final ExecutorC3760xi f64451c = f64448h;

    public C3663uw(qn3 qn3Var, b64 b64Var) {
        this.f64449a = qn3Var;
        this.f64450b = b64Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m22959a() {
        Iterator it = this.f64452d.iterator();
        while (it.hasNext()) {
            se5 se5Var = ((re5) it.next()).f59160a;
        }
    }
}
