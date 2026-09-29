package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.Status;
import gb.AbstractC5738b;
import gb.InterfaceC5739c;
import gb.InterfaceC5740d;
import gb.InterfaceC5741e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p152hb.C5982j1;
import p152hb.C6020w0;
import p152hb.C6021w1;
import p152hb.C6024x1;
import p176ib.C6272i;
import p412ub.HandlerC9517f;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends InterfaceC5740d> extends AbstractC5738b<R> {

    /* JADX INFO: renamed from: l */
    public static final C6021w1 f13901l = new C6021w1();

    /* JADX INFO: renamed from: b */
    public final WeakReference<AbstractC2544c> f13903b;

    /* JADX INFO: renamed from: f */
    public R f13907f;

    /* JADX INFO: renamed from: g */
    public Status f13908g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f13909h;

    /* JADX INFO: renamed from: i */
    public boolean f13910i;

    /* JADX INFO: renamed from: j */
    public boolean f13911j;

    @KeepName
    private C6024x1 mResultGuardian;

    /* JADX INFO: renamed from: a */
    public final Object f13902a = new Object();

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f13904c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public final ArrayList<AbstractC5738b.a> f13905d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public final AtomicReference<C5982j1> f13906e = new AtomicReference<>();

    /* JADX INFO: renamed from: k */
    public boolean f13912k = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class HandlerC2545a<R extends InterfaceC5740d> extends HandlerC9517f {
        public HandlerC2545a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                InterfaceC5741e interfaceC5741e = (InterfaceC5741e) pair.first;
                InterfaceC5740d interfaceC5740d = (InterfaceC5740d) pair.second;
                try {
                    interfaceC5741e.m12095a(interfaceC5740d);
                    return;
                } catch (RuntimeException e10) {
                    BasePendingResult.m7561j(interfaceC5740d);
                    throw e10;
                }
            }
            if (i10 == 2) {
                ((BasePendingResult) message.obj).m7565d(Status.f13876i);
                return;
            }
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i10);
            Log.wtf("BasePendingResult", sb2.toString(), new Exception());
        }
    }

    @Deprecated
    public BasePendingResult() {
        new HandlerC2545a(Looper.getMainLooper());
        this.f13903b = new WeakReference<>(null);
    }

    public BasePendingResult(C6020w0 c6020w0) {
        new HandlerC2545a(c6020w0 != null ? c6020w0.f35620c.f13892f : Looper.getMainLooper());
        this.f13903b = new WeakReference<>(c6020w0);
    }

    /* JADX INFO: renamed from: j */
    public static void m7561j(InterfaceC5740d interfaceC5740d) {
        if (interfaceC5740d instanceof InterfaceC5739c) {
            try {
                ((InterfaceC5739c) interfaceC5740d).release();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC5740d)), e10);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m7562a(AbstractC5738b.a aVar) {
        synchronized (this.f13902a) {
            if (m7566e()) {
                aVar.mo12094a(this.f13908g);
            } else {
                this.f13905d.add(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7563b() {
        synchronized (this.f13902a) {
            if (this.f13910i || this.f13909h) {
                return;
            }
            m7561j(this.f13907f);
            this.f13910i = true;
            m7569h(mo7564c(Status.f13877j));
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract R mo7564c(Status status);

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final void m7565d(Status status) {
        synchronized (this.f13902a) {
            if (!m7566e()) {
                m7567f(mo7564c(status));
                this.f13911j = true;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7566e() {
        return this.f13904c.getCount() == 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m7567f(R r10) {
        synchronized (this.f13902a) {
            if (this.f13911j || this.f13910i) {
                m7561j(r10);
                return;
            }
            m7566e();
            C6272i.m12917k("Results have already been set", !m7566e());
            C6272i.m12917k("Result has already been consumed", !this.f13909h);
            m7569h(r10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final R m7568g() {
        R r10;
        synchronized (this.f13902a) {
            try {
                C6272i.m12917k("Result has already been consumed.", !this.f13909h);
                C6272i.m12917k("Result is not ready.", m7566e());
                r10 = this.f13907f;
                this.f13907f = null;
                this.f13909h = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C5982j1 andSet = this.f13906e.getAndSet(null);
        if (andSet != null) {
            andSet.f35520a.f35523a.remove(this);
        }
        C6272i.m12915i(r10);
        return r10;
    }

    /* JADX INFO: renamed from: h */
    public final void m7569h(R r10) {
        this.f13907f = r10;
        this.f13908g = r10.mo5489m();
        this.f13904c.countDown();
        if (!this.f13910i && (this.f13907f instanceof InterfaceC5739c)) {
            this.mResultGuardian = new C6024x1(this);
        }
        ArrayList<AbstractC5738b.a> arrayList = this.f13905d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).mo12094a(this.f13908g);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: i */
    public final void m7570i() {
        this.f13912k = this.f13912k || f13901l.get().booleanValue();
    }
}
