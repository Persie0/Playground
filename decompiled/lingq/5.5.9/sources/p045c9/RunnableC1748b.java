package p045c9;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;
import p068d9.InterfaceC5090d;
import p090e9.InterfaceC5385a;
import p402u0.C9369l;
import p452w8.AbstractC9838s;
import p452w8.C9829j;

/* JADX INFO: renamed from: c9.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1748b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1753g f9613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC9838s f9614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9615c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Runnable f9616d;

    public /* synthetic */ RunnableC1748b(C1753g c1753g, C9829j c9829j, int i10, Runnable runnable) {
        this.f9613a = c1753g;
        this.f9614b = c9829j;
        this.f9615c = i10;
        this.f9616d = runnable;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC9838s abstractC9838s = this.f9614b;
        int i10 = this.f9615c;
        Runnable runnable = this.f9616d;
        C1753g c1753g = this.f9613a;
        InterfaceC5385a interfaceC5385a = c1753g.f9635f;
        try {
            try {
                InterfaceC5090d interfaceC5090d = c1753g.f9632c;
                Objects.requireNonNull(interfaceC5090d);
                interfaceC5385a.mo10870q(new C9369l(4, interfaceC5090d));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) c1753g.f9630a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    c1753g.m5486a(abstractC9838s, i10);
                } else {
                    interfaceC5385a.mo10870q(new C1749c(c1753g, i10, abstractC9838s));
                }
            } catch (SynchronizationException unused) {
                c1753g.f9633d.mo5483a(abstractC9838s, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
