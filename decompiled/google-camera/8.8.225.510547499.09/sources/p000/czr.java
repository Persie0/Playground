package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czr {

    /* JADX INFO: renamed from: d */
    private final jwn f10138d;

    /* JADX INFO: renamed from: c */
    private boolean f10137c = false;

    /* JADX INFO: renamed from: a */
    public final List f10135a = new ArrayList();

    /* JADX INFO: renamed from: e */
    private boolean f10139e = false;

    /* JADX INFO: renamed from: b */
    kba f10136b = null;

    public czr(jwn jwnVar) {
        this.f10138d = jwnVar;
        jwnVar.mo3830a(new czq(this, 0), not.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized kba m5743a(czp czpVar) {
        this.f10135a.add(czpVar);
        m5742e();
        return new cic(this, czpVar, 8);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5744b() {
        this.f10139e = true;
        m5742e();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5745c(boolean z) {
        this.f10137c = z;
        m5742e();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5746d() {
        m5742e();
    }

    /* JADX INFO: renamed from: e */
    private final void m5742e() {
        if (!this.f10137c) {
            this.f10139e = false;
        } else if (!((Boolean) this.f10138d.mo3831be()).booleanValue() && !this.f10139e) {
            if (this.f10136b != null || this.f10135a.isEmpty()) {
                return;
            }
            this.f10136b = ((czp) mkv.m16515W(this.f10135a)).m5740a();
            return;
        }
        kba kbaVar = this.f10136b;
        if (kbaVar != null) {
            kbaVar.close();
            this.f10136b = null;
        }
    }
}
