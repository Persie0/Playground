package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p260m8.C7499b;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7153c<T> extends AbstractC7163m {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40416a = AtomicReferenceFieldUpdater.newUpdater(AbstractC7153c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C7499b.f41430e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC7163m
    /* JADX INFO: renamed from: a */
    public final AbstractC7153c<?> mo14427a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC7163m
    /* JADX INFO: renamed from: c */
    public final Object mo14428c(Object obj) {
        Object objM14436e = this._consensus;
        if (objM14436e == C7499b.f41430e) {
            objM14436e = m14436e(mo14357i(obj));
        }
        mo14426d(obj, objM14436e);
        return objM14436e;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo14426d(T t10, Object obj);

    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX INFO: renamed from: e */
    public final Object m14436e(Object obj) {
        boolean z10;
        Object obj2 = this._consensus;
        C7168r c7168r = C7499b.f41430e;
        if (obj2 != c7168r) {
            return obj2;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40416a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c7168r, obj)) {
            if (atomicReferenceFieldUpdater.get(this) != c7168r) {
                z10 = false;
                if (z10) {
                    return obj;
                }
                return this._consensus;
            }
        }
        z10 = true;
        if (z10) {
            return obj;
        }
        return this._consensus;
    }

    /* JADX INFO: renamed from: f */
    public final Object m14437f() {
        return this._consensus;
    }

    /* JADX INFO: renamed from: g */
    public long mo14438g() {
        return 0L;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14439h() {
        return this._consensus != C7499b.f41430e;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo14357i(T t10);
}
