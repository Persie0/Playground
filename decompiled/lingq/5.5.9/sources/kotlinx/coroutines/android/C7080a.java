package kotlinx.coroutines.android;

import ae.C0062b;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.scheduling.C7178b;
import no.AbstractC7821c1;
import no.C7827e1;
import no.C7832g0;
import no.C7843k;
import no.InterfaceC7838i0;
import p307oo.AbstractC8101e;
import p307oo.RunnableC8100d;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.android.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7080a extends AbstractC8101e {
    private volatile C7080a _immediate;

    /* JADX INFO: renamed from: c */
    public final Handler f40003c;

    /* JADX INFO: renamed from: d */
    public final String f40004d;

    /* JADX INFO: renamed from: e */
    public final boolean f40005e;

    /* JADX INFO: renamed from: f */
    public final C7080a f40006f;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7080a() {
        throw null;
    }

    public C7080a(Handler handler) {
        this(handler, null, false);
    }

    public C7080a(Handler handler, String str, boolean z10) {
        this.f40003c = handler;
        this.f40004d = str;
        this.f40005e = z10;
        this._immediate = z10 ? this : null;
        C7080a c7080a = this._immediate;
        if (c7080a == null) {
            c7080a = new C7080a(handler, str, true);
            this._immediate = c7080a;
        }
        this.f40006f = c7080a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: B1 */
    public final boolean mo3964B1(CoroutineContext coroutineContext) {
        return (this.f40005e && C5207g.m11106a(Looper.myLooper(), this.f40003c.getLooper())) ? false : true;
    }

    @Override // no.AbstractC7821c1
    /* JADX INFO: renamed from: C1 */
    public final AbstractC7821c1 mo14316C1() {
        return this.f40006f;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m14317D1(CoroutineContext coroutineContext, Runnable runnable) {
        C0062b.m330a0(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C7832g0.f42931b.mo2307z1(coroutineContext, runnable);
    }

    @Override // p307oo.AbstractC8101e, no.InterfaceC7820c0
    /* JADX INFO: renamed from: G0 */
    public final InterfaceC7838i0 mo14318G0(long j10, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f40003c.postDelayed(runnable, j10)) {
            return new InterfaceC7838i0() { // from class: oo.c
                @Override // no.InterfaceC7838i0
                /* JADX INFO: renamed from: a */
                public final void mo14330a() {
                    this.f43920a.f40003c.removeCallbacks(runnable);
                }
            };
        }
        m14317D1(coroutineContext, runnable);
        return C7827e1.f42925a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7080a) && ((C7080a) obj).f40003c == this.f40003c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f40003c);
    }

    @Override // no.InterfaceC7820c0
    /* JADX INFO: renamed from: q */
    public final void mo14319q(long j10, C7843k c7843k) {
        final RunnableC8100d runnableC8100d = new RunnableC8100d(c7843k, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f40003c.postDelayed(runnableC8100d, j10)) {
            c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Throwable th2) {
                    this.f40001b.f40003c.removeCallbacks(runnableC8100d);
                    return C9072e.f47360a;
                }
            });
        } else {
            m14317D1(c7843k.f42940e, runnableC8100d);
        }
    }

    @Override // no.AbstractC7821c1, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        AbstractC7821c1 abstractC7821c1Mo14316C1;
        String str;
        C7178b c7178b = C7832g0.f42930a;
        AbstractC7821c1 abstractC7821c1 = C7162l.f40438a;
        if (this == abstractC7821c1) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC7821c1Mo14316C1 = abstractC7821c1.mo14316C1();
            } catch (UnsupportedOperationException unused) {
                abstractC7821c1Mo14316C1 = null;
            }
            str = this == abstractC7821c1Mo14316C1 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f40004d;
        if (string == null) {
            string = this.f40003c.toString();
        }
        return this.f40005e ? C0166e.m765k(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: z1 */
    public final void mo2307z1(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f40003c.post(runnable)) {
            return;
        }
        m14317D1(coroutineContext, runnable);
    }
}
