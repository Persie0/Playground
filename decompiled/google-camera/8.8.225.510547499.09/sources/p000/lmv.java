package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmv {

    /* JADX INFO: renamed from: a */
    public byte f38710a;

    /* JADX INFO: renamed from: b */
    public int f38711b;

    /* JADX INFO: renamed from: c */
    public Object f38712c;

    public lmv() {
    }

    public lmv(byte[] bArr) {
        this.f38712c = mqu.f41450a;
    }

    /* JADX INFO: renamed from: a */
    public final lmw m15736a() {
        int i;
        if (this.f38710a == 1 && (i = this.f38711b) != 0) {
            return new lmw(i, (mrm) this.f38712c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38711b == 0) {
            sb.append(" enablement");
        }
        if (this.f38710a == 0) {
            sb.append(" manualCapture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m15737b(boolean z) {
        this.f38711b = true != z ? 2 : 3;
    }

    /* JADX INFO: renamed from: c */
    public final ibz m15738c() {
        Object obj;
        if (this.f38710a == 1 && (obj = this.f38712c) != null) {
            return new ibz((Rect) obj, this.f38711b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38712c == null) {
            sb.append(" rect");
        }
        if (this.f38710a == 0) {
            sb.append(" radius");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: d */
    public final void m15739d(int i) {
        this.f38711b = i;
        this.f38710a = (byte) 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m15740e(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null rect");
        }
        this.f38712c = rect;
    }

    /* JADX INFO: renamed from: f */
    public final dgr m15741f() {
        Object obj;
        if (this.f38710a == 1 && (obj = this.f38712c) != null) {
            return new dgr(this.f38711b, (hev) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38710a == 0) {
            sb.append(" successiveSamplesRequired");
        }
        if (this.f38712c == null) {
            sb.append(" suggestion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ctp, java.lang.Object] */
    /* JADX INFO: renamed from: g */
    public final ctg m15742g() {
        ?? r0;
        if (this.f38710a == 1 && (r0 = this.f38712c) != 0) {
            return new ctg(r0, this.f38711b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38712c == null) {
            sb.append(" outputVideo");
        }
        if (this.f38710a == 0) {
            sb.append(" pendingVideoId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: h */
    public final void m15743h(ctp ctpVar) {
        if (ctpVar == null) {
            throw new NullPointerException("Null outputVideo");
        }
        this.f38712c = ctpVar;
    }

    /* JADX INFO: renamed from: i */
    public final void m15744i(int i) {
        this.f38711b = i;
        this.f38710a = (byte) 1;
    }
}
