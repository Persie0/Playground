package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p000.C3490qa;
import p000.lda;
import p000.q88;
import p000.t90;
import p000.vcb;
import p000.zdb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePendingResult<R extends q88> {

    /* JADX INFO: renamed from: j */
    public static final C3490qa f11667j = new C3490qa(8);

    /* JADX INFO: renamed from: e */
    public q88 f11672e;

    /* JADX INFO: renamed from: f */
    public Status f11673f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f11674g;

    /* JADX INFO: renamed from: h */
    public boolean f11675h;

    /* JADX INFO: renamed from: a */
    public final Object f11668a = new Object();

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f11669b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public final ArrayList f11670c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f11671d = new AtomicReference();

    /* JADX INFO: renamed from: i */
    public boolean f11676i = false;

    public BasePendingResult(vcb vcbVar) {
        new t90(vcbVar != null ? vcbVar.f65201a.f53051g : Looper.getMainLooper(), 0);
        new WeakReference(vcbVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m5283a(zdb zdbVar) {
        synchronized (this.f11668a) {
            try {
                if (m5285d()) {
                    zdbVar.m25561a(this.f11673f);
                } else {
                    this.f11670c.add(zdbVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract q88 mo4601b(Status status);

    /* JADX INFO: renamed from: c */
    public final void m5284c(Status status) {
        synchronized (this.f11668a) {
            try {
                if (!m5285d()) {
                    m5286e(mo4601b(status));
                    this.f11675h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5285d() {
        return this.f11669b.getCount() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m5286e(q88 q88Var) {
        synchronized (this.f11668a) {
            try {
                if (this.f11675h) {
                    return;
                }
                m5285d();
                lda.m16132r("Results have already been set", !m5285d());
                lda.m16132r("Result has already been consumed", !this.f11674g);
                this.f11672e = q88Var;
                this.f11673f = q88Var.mo5281n();
                this.f11669b.countDown();
                ArrayList arrayList = this.f11670c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((zdb) arrayList.get(i)).m25561a(this.f11673f);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5287f() {
        boolean z = true;
        if (!this.f11676i && !((Boolean) f11667j.get()).booleanValue()) {
            z = false;
        }
        this.f11676i = z;
    }
}
