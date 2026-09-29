package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import p000.ExecutorC3014fu;
import p000.gd3;
import p000.nk1;
import p000.qn3;
import p000.y38;
import p000.yx2;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.a */
/* JADX INFO: loaded from: classes.dex */
public class C0770a extends yx2 {

    /* JADX INFO: renamed from: a */
    public final WindowLayoutComponent f7142a;

    /* JADX INFO: renamed from: b */
    public final qn3 f7143b;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f7144c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f7145d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f7146e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f7147f = new LinkedHashMap();

    public C0770a(WindowLayoutComponent windowLayoutComponent, qn3 qn3Var) {
        this.f7142a = windowLayoutComponent;
        this.f7143b = qn3Var;
    }

    @Override // p000.yx2, p000.q4b
    /* JADX INFO: renamed from: a */
    public void mo162a(gd3 gd3Var) {
        LinkedHashMap linkedHashMap = this.f7145d;
        LinkedHashMap linkedHashMap2 = this.f7146e;
        ReentrantLock reentrantLock = this.f7144c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(gd3Var);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.m2898c(gd3Var);
            linkedHashMap2.remove(gd3Var);
            if (multicastConsumer.m2897b()) {
                linkedHashMap.remove(context);
                nk1 nk1Var = (nk1) this.f7147f.remove(multicastConsumer);
                if (nk1Var != null) {
                    nk1Var.m17478a();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.yx2, p000.q4b
    /* JADX INFO: renamed from: b */
    public void mo163b(Context context, ExecutorC3014fu executorC3014fu, gd3 gd3Var) {
        LinkedHashMap linkedHashMap = this.f7145d;
        ReentrantLock reentrantLock = this.f7144c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7146e;
            if (multicastConsumer != null) {
                multicastConsumer.m2896a(gd3Var);
                linkedHashMap2.put(gd3Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(gd3Var, context);
                multicastConsumer2.m2896a(gd3Var);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(EmptyList.f47638a));
                } else {
                    this.f7147f.put(multicastConsumer2, this.f7143b.m20071m(this.f7142a, y38.m24933a(WindowLayoutInfo.class), (Activity) context, new C0769xa108efe7(multicastConsumer2)));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
