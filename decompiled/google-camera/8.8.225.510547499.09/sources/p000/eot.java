package p000;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eot {

    /* JADX INFO: renamed from: g */
    private static final long f14924g;

    /* JADX INFO: renamed from: a */
    public final Object f14925a;

    /* JADX INFO: renamed from: b */
    public final ksa f14926b;

    /* JADX INFO: renamed from: c */
    public final long f14927c;

    /* JADX INFO: renamed from: d */
    public final eos f14928d;

    /* JADX INFO: renamed from: e */
    public long f14929e;

    /* JADX INFO: renamed from: f */
    public int f14930f;

    static {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        if (longPressTimeout <= 0) {
            longPressTimeout = 400;
        }
        f14924g = longPressTimeout * 1000000;
    }

    public eot(eos eosVar) {
        long j = f14924g;
        ksa ksaVar = new ksa();
        this.f14925a = new Object();
        this.f14930f = 1;
        eosVar.getClass();
        lku.m15669w(j > 0);
        this.f14928d = eosVar;
        this.f14927c = j;
        this.f14926b = ksaVar;
    }
}
