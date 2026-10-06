package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrl {

    /* JADX INFO: renamed from: a */
    public final Object f29315a;

    /* JADX INFO: renamed from: b */
    public final Object f29316b;

    /* JADX INFO: renamed from: c */
    public final Object f29317c;

    /* JADX INFO: renamed from: d */
    public final Object f29318d;

    /* JADX INFO: renamed from: e */
    public final Object f29319e;

    /* JADX INFO: renamed from: f */
    public Object f29320f;

    public hrl(grk grkVar, Executor executor, gro groVar, fct fctVar, kbz kbzVar) {
        this.f29317c = grkVar;
        this.f29318d = executor;
        this.f29319e = groVar;
        this.f29316b = fctVar;
        this.f29315a = kbzVar;
    }

    public hrl(hst hstVar, Context context, DisplayMetrics displayMetrics, kpb kpbVar) {
        this.f29320f = null;
        this.f29315a = hstVar;
        this.f29316b = context;
        this.f29317c = displayMetrics;
        this.f29318d = kpbVar;
        this.f29319e = new bgv();
    }

    /* JADX INFO: renamed from: a */
    public final void m10655a() {
        jvd.m13538a();
        ((hst) this.f29315a).m10708g();
        ((bgv) this.f29319e).m2440g();
    }
}
