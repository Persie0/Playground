package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqa extends oqg {

    /* JADX INFO: renamed from: a */
    public final opk f46413a;

    public oqa(ols olsVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + olsVar + " was cancelled normally");
        }
        super(th, z);
        this.f46413a = ook.m18793g(false);
    }
}
