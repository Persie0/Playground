package com.tonyodev.fetch2core;

import android.os.Handler;
import android.os.HandlerThread;
import cm.InterfaceC2041a;
import dm.C5207g;
import kotlin.TypeCastException;
import p289o5.RunnableC7930j;
import sl.C9072e;

/* JADX INFO: renamed from: com.tonyodev.fetch2core.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4984a {

    /* JADX INFO: renamed from: a */
    public final Object f32544a;

    /* JADX INFO: renamed from: b */
    public boolean f32545b;

    /* JADX INFO: renamed from: c */
    public int f32546c;

    /* JADX INFO: renamed from: d */
    public final Handler f32547d;

    /* JADX INFO: renamed from: e */
    public final String f32548e;

    public C4984a(Handler handler, String str) {
        C5207g.m11112g(str, "namespace");
        this.f32548e = str;
        this.f32544a = new Object();
        this.f32547d = handler == null ? new InterfaceC2041a<Handler>() { // from class: com.tonyodev.fetch2core.HandlerWrapper$handler$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Handler mo807E() {
                HandlerThread handlerThread = new HandlerThread(this.f32542b.f32548e);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        }.mo807E() : handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m10686a() {
        synchronized (this.f32544a) {
            if (!this.f32545b) {
                this.f32545b = true;
                try {
                    this.f32547d.removeCallbacksAndMessages(null);
                    this.f32547d.getLooper().quit();
                } catch (Exception unused) {
                }
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m10687b(InterfaceC2041a<C9072e> interfaceC2041a) {
        synchronized (this.f32544a) {
            if (!this.f32545b) {
                this.f32547d.post(new RunnableC7930j(8, interfaceC2041a));
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C4984a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(C5207g.m11106a(this.f32548e, ((C4984a) obj).f32548e) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.HandlerWrapper");
    }

    public final int hashCode() {
        return this.f32548e.hashCode();
    }
}
