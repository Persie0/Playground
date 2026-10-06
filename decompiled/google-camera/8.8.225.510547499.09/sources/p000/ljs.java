package p000;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljs {

    /* JADX INFO: renamed from: a */
    public final msi f38420a;

    /* JADX INFO: renamed from: b */
    public final msi f38421b;

    /* JADX INFO: renamed from: c */
    public final Executor f38422c;

    /* JADX INFO: renamed from: d */
    public final oju f38423d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f38424e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: f */
    public final long f38425f = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: g */
    public final mbl f38426g;

    public ljs(msi msiVar, msi msiVar2, Executor executor, ohb ohbVar, ljf ljfVar, oju ojuVar) {
        this.f38420a = msiVar;
        this.f38421b = msiVar2;
        this.f38422c = executor;
        this.f38426g = ljfVar.m15526b(executor, ohbVar, null);
        this.f38423d = ojuVar;
    }
}
