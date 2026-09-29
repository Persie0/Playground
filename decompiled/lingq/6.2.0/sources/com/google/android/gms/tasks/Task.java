package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p000.bm1;
import p000.fn9;
import p000.js6;
import p000.sr6;
import p000.tld;
import p000.tr6;
import p000.yr6;

/* JADX INFO: loaded from: classes.dex */
public abstract class Task<TResult> {
    /* JADX INFO: renamed from: a */
    public void mo5959a(Executor executor, sr6 sr6Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* JADX INFO: renamed from: b */
    public void mo5960b(Executor executor, tr6 tr6Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* JADX INFO: renamed from: c */
    public abstract tld mo5961c(yr6 yr6Var);

    /* JADX INFO: renamed from: d */
    public abstract tld mo5962d(Executor executor, yr6 yr6Var);

    /* JADX INFO: renamed from: e */
    public abstract tld mo5963e(Executor executor, js6 js6Var);

    /* JADX INFO: renamed from: f */
    public Task mo5964f(Executor executor, bm1 bm1Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* JADX INFO: renamed from: g */
    public Task mo5965g(Executor executor, bm1 bm1Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* JADX INFO: renamed from: h */
    public abstract Exception mo5966h();

    /* JADX INFO: renamed from: i */
    public abstract Object mo5967i();

    /* JADX INFO: renamed from: j */
    public abstract Object mo5968j();

    /* JADX INFO: renamed from: k */
    public abstract boolean mo5969k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo5970l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo5971m();

    /* JADX INFO: renamed from: n */
    public Task mo5972n(Executor executor, fn9 fn9Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
