package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wdd {

    /* JADX INFO: renamed from: a */
    public static p04 f66674a;

    /* JADX INFO: renamed from: a */
    public static final p04 m23854a() {
        p04 p04Var = f66674a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.FormatSize", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(9.0f, 5.5f);
        f57VarM17730e.m11548c(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        f57VarM17730e.m11549d(14.0f);
        f57VarM17730e.m11557l(10.5f);
        f57VarM17730e.m11548c(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        f57VarM17730e.m11555j(1.5f, -0.67f, 1.5f, -1.5f);
        f57VarM17730e.m11556k(7.0f);
        f57VarM17730e.m11550e(3.5f);
        f57VarM17730e.m11548c(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        f57VarM17730e.m11554i(21.33f, 4.0f, 20.5f, 4.0f);
        f57VarM17730e.m11550e(-10.0f);
        f57VarM17730e.m11547b(9.67f, 4.0f, 9.0f, 4.67f, 9.0f, 5.5f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(4.5f, 12.0f);
        f57VarM17730e.m11549d(6.0f);
        f57VarM17730e.m11557l(5.5f);
        f57VarM17730e.m11548c(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        f57VarM17730e.m11554i(9.0f, 18.33f, 9.0f, 17.5f);
        f57VarM17730e.m11556k(12.0f);
        f57VarM17730e.m11550e(1.5f);
        f57VarM17730e.m11548c(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        f57VarM17730e.m11554i(11.33f, 9.0f, 10.5f, 9.0f);
        f57VarM17730e.m11550e(-6.0f);
        f57VarM17730e.m11547b(3.67f, 9.0f, 3.0f, 9.67f, 3.0f, 10.5f);
        f57VarM17730e.m11554i(3.67f, 12.0f, 4.5f, 12.0f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f66674a = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m23855b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, m6d m6dVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(m6dVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(m6dVar) != obj && atomicReferenceFieldUpdater.get(m6dVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
