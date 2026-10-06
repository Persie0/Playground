package p000;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axl {

    /* JADX INFO: renamed from: a */
    public final Activity f2660a;

    /* JADX INFO: renamed from: b */
    public final aea f2661b;

    /* JADX INFO: renamed from: c */
    public awx f2662c;

    /* JADX INFO: renamed from: d */
    private final Executor f2663d;

    public axl(Activity activity, Executor executor, aea aeaVar) {
        this.f2660a = activity;
        this.f2663d = executor;
        this.f2661b = aeaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m2086a(awx awxVar) {
        this.f2662c = awxVar;
        this.f2663d.execute(new RunnableC0058bd(this, awxVar, 15));
    }
}
