package p000;

import android.content.Context;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lha {

    /* JADX INFO: renamed from: a */
    public volatile boolean f38250a;

    /* JADX INFO: renamed from: b */
    final Object f38251b;

    public lha() {
        this.f38251b = new ArrayList();
    }

    public lha(Context context) {
        this.f38251b = context;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m15329a() {
        if (!this.f38250a) {
            this.f38250a = true;
            synchronized (this.f38251b) {
                Iterator it = this.f38251b.iterator();
                while (it.hasNext()) {
                    try {
                        ((lhb) it.next()).m15331a();
                    } catch (RuntimeException e) {
                    }
                }
                this.f38251b.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15330b() {
        if (!this.f38250a) {
            Trace.beginSection("CXCP#checkCameraPermission");
            if (C0993sq.m19406a((Context) this.f38251b, "android.permission.CAMERA") == 0) {
                this.f38250a = true;
            }
            Trace.endSection();
        }
        return this.f38250a;
    }
}
