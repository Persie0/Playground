package kotlinx.coroutines.flow;

import dm.C5206f;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.C7168r;
import no.C7843k;
import p349qo.AbstractC8655a;
import p349qo.AbstractC8657c;
import p349qo.C8658d;
import p349qo.InterfaceC8661g;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class StateFlowImpl<T> extends AbstractC8655a<C7143x> implements InterfaceC7133n<T>, InterfaceC7116c, InterfaceC8661g<T> {
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: e */
    public int f40264e;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009a A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:14:0x003d, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e1, B:58:0x00f9, B:64:0x010b, B:65:0x0110, B:68:0x0119, B:61:0x0103, B:44:0x00ae, B:48:0x00b5, B:19:0x0053, B:22:0x005e, B:33:0x0086), top: B:78:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:14:0x003d, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e1, B:58:0x00f9, B:64:0x010b, B:65:0x0110, B:68:0x0119, B:61:0x0103, B:44:0x00ae, B:48:0x00b5, B:19:0x0053, B:22:0x005e, B:33:0x0086), top: B:78:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:14:0x003d, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e1, B:58:0x00f9, B:64:0x010b, B:65:0x0110, B:68:0x0119, B:61:0x0103, B:44:0x00ae, B:48:0x00b5, B:19:0x0053, B:22:0x005e, B:33:0x0086), top: B:78:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:14:0x003d, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e1, B:58:0x00f9, B:64:0x010b, B:65:0x0110, B:68:0x0119, B:61:0x0103, B:44:0x00ae, B:48:0x00b5, B:19:0x0053, B:22:0x005e, B:33:0x0086), top: B:78:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0103 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:14:0x003d, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e1, B:58:0x00f9, B:64:0x010b, B:65:0x0110, B:68:0x0119, B:61:0x0103, B:44:0x00ae, B:48:0x00b5, B:19:0x0053, B:22:0x005e, B:33:0x0086), top: B:78:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x010b A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:14:0x003d, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e1, B:58:0x00f9, B:64:0x010b, B:65:0x0110, B:68:0x0119, B:61:0x0103, B:44:0x00ae, B:48:0x00b5, B:19:0x0053, B:22:0x005e, B:33:0x0086), top: B:78:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:14:0x003d, B:34:0x0096, B:36:0x009a, B:39:0x00a1, B:40:0x00a5, B:42:0x00a8, B:52:0x00c9, B:57:0x00e1, B:58:0x00f9, B:64:0x010b, B:65:0x0110, B:68:0x0119, B:61:0x0103, B:44:0x00ae, B:48:0x00b5, B:19:0x0053, B:22:0x005e, B:33:0x0086), top: B:78:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:42:0x00a8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final java.lang.Object mo9539a(kotlinx.coroutines.flow.InterfaceC7117d<? super T> r18, p464wl.InterfaceC9968c<?> r19) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.mo9539a(kotlinx.coroutines.flow.d, wl.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0021  */
    /* JADX WARN: Code duplicated, block: B:21:0x0027  */
    @Override // p349qo.InterfaceC8661g
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<T> mo14365b(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        if (!(i10 >= 0 && i10 < 2) && i10 != -2) {
            if (i10 != 0) {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                }
            } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            }
            return new C8658d(i10, coroutineContext, bufferOverflow, this);
        }
        if (bufferOverflow != BufferOverflow.DROP_OLDEST) {
            if (i10 != 0 || i10 == -3) {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                }
            }
            return new C8658d(i10, coroutineContext, bufferOverflow, this);
        }
        return this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7133n
    /* JADX INFO: renamed from: c */
    public final boolean mo14366c(T t10, T t11) {
        C7168r c7168r = C5206f.f33272g;
        if (t10 == null) {
            t10 = (T) c7168r;
        }
        if (t11 == null) {
            t11 = (T) c7168r;
        }
        return m14369h(t10, t11);
    }

    @Override // p349qo.AbstractC8655a
    /* JADX INFO: renamed from: e */
    public final AbstractC8657c mo14367e() {
        return new C7143x();
    }

    @Override // p349qo.AbstractC8655a
    /* JADX INFO: renamed from: f */
    public final AbstractC8657c[] mo14368f() {
        return new C7143x[2];
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7133n, kotlinx.coroutines.flow.InterfaceC7142w
    public final T getValue() {
        C7168r c7168r = C5206f.f33272g;
        T t10 = (T) this._state;
        if (t10 == c7168r) {
            t10 = null;
        }
        return t10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m14369h(Object obj, Object obj2) {
        int i10;
        Object obj3;
        C7168r c7168r;
        boolean z10;
        boolean z11;
        synchronized (this) {
            try {
                Object obj4 = this._state;
                if (obj != null && !C5207g.m11106a(obj4, obj)) {
                    return false;
                }
                if (C5207g.m11106a(obj4, obj2)) {
                    return true;
                }
                this._state = obj2;
                int i11 = this.f40264e;
                if ((i11 & 1) != 0) {
                    this.f40264e = i11 + 2;
                    return true;
                }
                int i12 = i11 + 1;
                this.f40264e = i12;
                Object obj5 = this.f46232a;
                C9072e c9072e = C9072e.f47360a;
                while (true) {
                    C7143x[] c7143xArr = (C7143x[]) obj5;
                    if (c7143xArr != null) {
                        for (C7143x c7143x : c7143xArr) {
                            if (c7143x != null) {
                                while (true) {
                                    Object obj6 = c7143x._state;
                                    if (obj6 == null || obj6 == (c7168r = C7120g.f40284b)) {
                                        break;
                                        break;
                                    }
                                    C7168r c7168r2 = C7120g.f40283a;
                                    if (obj6 != c7168r2) {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7143x.f40389a;
                                        while (true) {
                                            if (atomicReferenceFieldUpdater.compareAndSet(c7143x, obj6, c7168r2)) {
                                                z11 = true;
                                                break;
                                            }
                                            if (atomicReferenceFieldUpdater.get(c7143x) != obj6) {
                                                z11 = false;
                                                break;
                                            }
                                        }
                                        if (z11) {
                                            ((C7843k) obj6).mo2031y(C9072e.f47360a);
                                            break;
                                        }
                                    } else {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C7143x.f40389a;
                                        while (true) {
                                            if (atomicReferenceFieldUpdater2.compareAndSet(c7143x, obj6, c7168r)) {
                                                z10 = true;
                                                break;
                                            }
                                            if (atomicReferenceFieldUpdater2.get(c7143x) != obj6) {
                                                z10 = false;
                                                break;
                                            }
                                        }
                                        if (z10) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        try {
                            i10 = this.f40264e;
                            if (i10 == i12) {
                                this.f40264e = i12 + 1;
                                return true;
                            }
                            obj3 = this.f46232a;
                            C9072e c9072e2 = C9072e.f47360a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    obj5 = obj3;
                    i12 = i10;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7132m
    /* JADX INFO: renamed from: j */
    public final void mo14370j() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7132m
    /* JADX INFO: renamed from: k */
    public final boolean mo14371k(T t10) {
        setValue(t10);
        return true;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        setValue(t10);
        return C9072e.f47360a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7133n
    public final void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) C5206f.f33272g;
        }
        m14369h(null, t10);
    }
}
