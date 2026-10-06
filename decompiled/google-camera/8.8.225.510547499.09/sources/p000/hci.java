package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hci {

    /* JADX INFO: renamed from: a */
    public heo f27239a;

    /* JADX INFO: renamed from: b */
    private boolean f27240b;

    /* JADX INFO: renamed from: c */
    private boolean f27241c;

    /* JADX INFO: renamed from: d */
    private boolean f27242d;

    /* JADX INFO: renamed from: e */
    private boolean f27243e;

    /* JADX INFO: renamed from: f */
    private byte f27244f;

    /* JADX INFO: renamed from: g */
    private int f27245g;

    /* JADX INFO: renamed from: a */
    public final hcj m10105a() {
        heo heoVar;
        int i;
        if (this.f27244f == 15 && (heoVar = this.f27239a) != null && (i = this.f27245g) != 0) {
            return new hcj(heoVar, i, this.f27240b, this.f27241c, this.f27242d, this.f27243e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f27239a == null) {
            sb.append(" entry");
        }
        if (this.f27245g == 0) {
            sb.append(" zoomUiMode");
        }
        if ((this.f27244f & 1) == 0) {
            sb.append(" isLayoutUpdate");
        }
        if ((this.f27244f & 2) == 0) {
            sb.append(JrxsYuVZZqnFC.sZduJaaTRdCmg);
        }
        if ((this.f27244f & 4) == 0) {
            sb.append(" isVideoControlUiVisible");
        }
        if ((this.f27244f & 8) == 0) {
            sb.append(" isZoomToggleEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10106b(boolean z) {
        this.f27240b = z;
        this.f27244f = (byte) (this.f27244f | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m10107c(boolean z) {
        this.f27242d = z;
        this.f27244f = (byte) (this.f27244f | 4);
    }

    /* JADX INFO: renamed from: d */
    public final void m10108d(boolean z) {
        this.f27241c = z;
        this.f27244f = (byte) (this.f27244f | 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m10109e(boolean z) {
        this.f27243e = z;
        this.f27244f = (byte) (this.f27244f | 8);
    }

    /* JADX INFO: renamed from: f */
    public final void m10110f(int i) {
        if (i == 0) {
            throw new NullPointerException("Null zoomUiMode");
        }
        this.f27245g = i;
    }
}
