package p000;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.area.WindowAreaComponent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eno {

    /* JADX INFO: renamed from: a */
    public final jvd f14777a;

    /* JADX INFO: renamed from: b */
    public final jww f14778b;

    /* JADX INFO: renamed from: c */
    public final awk f14779c;

    /* JADX INFO: renamed from: d */
    public boolean f14780d = false;

    /* JADX INFO: renamed from: e */
    public avp f14781e;

    public eno(jvd jvdVar, jww jwwVar) {
        WindowAreaComponent windowAreaComponent;
        this.f14777a = jvdVar;
        this.f14778b = jwwVar;
        int i = avq.f2543a;
        try {
            windowAreaComponent = WindowExtensionsProvider.getWindowExtensions().getWindowAreaComponent();
        } catch (Throwable th) {
            windowAreaComponent = null;
        }
        this.f14779c = new awk(windowAreaComponent == null ? new avo() : new avw(windowAreaComponent));
    }

    /* JADX INFO: renamed from: a */
    final void m7566a() {
        avp avpVar = this.f14781e;
        if (avpVar != null) {
            avpVar.m2063a();
        }
    }
}
