package p000;

import android.content.DialogInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class csq implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9374a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f9375b;

    public /* synthetic */ csq(cee ceeVar, int i) {
        this.f9375b = i;
        this.f9374a = ceeVar;
    }

    public /* synthetic */ csq(csr csrVar, int i) {
        this.f9375b = i;
        this.f9374a = csrVar;
    }

    public /* synthetic */ csq(hpu hpuVar, int i) {
        this.f9375b = i;
        this.f9374a = hpuVar;
    }

    public /* synthetic */ csq(hst hstVar, int i) {
        this.f9375b = i;
        this.f9374a = hstVar;
    }

    public /* synthetic */ csq(hsw hswVar, int i) {
        this.f9375b = i;
        this.f9374a = hswVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9375b) {
            case 0:
                ((csr) this.f9374a).f9380e = null;
                break;
            case 1:
                cee ceeVar = (cee) this.f9374a;
                if (dialogInterface == ceeVar.f5422g) {
                    ceeVar.f5422g = null;
                }
                break;
            case 2:
                ((hpu) this.f9374a).f29005k = null;
                break;
            case 3:
                hst hstVar = (hst) this.f9374a;
                hstVar.m10709h();
                hstVar.m10711j(5);
                break;
            default:
                ((hsw) this.f9374a).f29467h = null;
                break;
        }
    }
}
