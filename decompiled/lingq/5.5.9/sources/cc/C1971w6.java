package cc;

import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC2737l0;
import p290o6.C7968m;

/* JADX INFO: renamed from: cc.w6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1971w6 extends AbstractC1914q3 {

    /* JADX INFO: renamed from: c */
    public HandlerC2737l0 f10277c;

    /* JADX INFO: renamed from: d */
    public final C1962v6 f10278d;

    /* JADX INFO: renamed from: e */
    public final C1953u6 f10279e;

    /* JADX INFO: renamed from: f */
    public final C7968m f10280f;

    public C1971w6(C1897o4 c1897o4) {
        super(c1897o4);
        this.f10278d = new C1962v6(this);
        this.f10279e = new C1953u6(this);
        this.f10280f = new C7968m(this);
    }

    @Override // cc.AbstractC1914q3
    /* JADX INFO: renamed from: k */
    public final boolean mo5519k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m5908l() {
        mo5748g();
        if (this.f10277c == null) {
            this.f10277c = new HandlerC2737l0(Looper.getMainLooper());
        }
    }
}
