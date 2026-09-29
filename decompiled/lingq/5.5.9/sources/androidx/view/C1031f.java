package androidx.view;

import java.util.ArrayDeque;
import java.util.Queue;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1031f {

    /* JADX INFO: renamed from: a */
    public boolean f6643a;

    /* JADX INFO: renamed from: b */
    public boolean f6644b;

    /* JADX INFO: renamed from: c */
    public boolean f6645c;

    /* JADX INFO: renamed from: d */
    public final Object f6646d;

    public C1031f() {
        this.f6643a = true;
        this.f6646d = new ArrayDeque();
    }

    public C1031f(InterfaceC10488f interfaceC10488f, boolean z10, boolean z11, boolean z12) {
        this.f6646d = interfaceC10488f;
        this.f6643a = z10;
        this.f6644b = z11;
        this.f6645c = z12;
    }

    /* JADX INFO: renamed from: a */
    public final void m3935a() {
        Object obj = this.f6646d;
        if (this.f6645c) {
            return;
        }
        try {
            this.f6645c = true;
            loop0: while (true) {
                while (true) {
                    if (!(!((Queue) obj).isEmpty())) {
                        break loop0;
                    }
                    if (!(this.f6644b || !this.f6643a)) {
                        break loop0;
                    }
                    Runnable runnable = (Runnable) ((Queue) obj).poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        } finally {
            this.f6645c = false;
        }
    }
}
