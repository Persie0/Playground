package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fja implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n16 f39209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q50 f39210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f39211c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Runnable f39212d;

    public /* synthetic */ fja(n16 n16Var, q50 q50Var, int i, Runnable runnable) {
        this.f39209a = n16Var;
        this.f39210b = q50Var;
        this.f39211c = i;
        this.f39212d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q50 q50Var = this.f39210b;
        int i = this.f39211c;
        Runnable runnable = this.f39212d;
        n16 n16Var = this.f39209a;
        hk8 hk8Var = (hk8) n16Var.f52178f;
        try {
            hk8 hk8Var2 = (hk8) n16Var.f52175c;
            Objects.requireNonNull(hk8Var2);
            hk8Var.m13317p(new dw6(hk8Var2, 17));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) n16Var.f52173a).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                hk8Var.m13317p(new bw2(n16Var, q50Var, i));
            } else {
                n16Var.m17169b(q50Var, i);
            }
        } catch (SynchronizationException unused) {
            ((C3309ls) n16Var.f52176d).m16493M(q50Var, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
