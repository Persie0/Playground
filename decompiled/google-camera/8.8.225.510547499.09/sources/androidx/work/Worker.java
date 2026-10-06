package androidx.work;

import android.content.Context;
import p000.C0139dr;
import p000.ayb;
import p000.baa;
import p000.bev;
import p000.nps;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ayb {

    /* JADX INFO: renamed from: a */
    public bev f1795a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // p000.ayb
    /* JADX INFO: renamed from: a */
    public final nps mo1695a() {
        this.f1795a = bev.m2275g();
        m2097g().execute(new baa(this, 1));
        return this.f1795a;
    }

    /* JADX INFO: renamed from: b */
    public abstract C0139dr mo1698b();
}
