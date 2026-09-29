package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bo9 extends do9 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8773d = 1;

    /* JADX INFO: renamed from: e */
    public final AutoCloseable f8774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo9(xg3 xg3Var, String str) {
        super(xg3Var, str);
        xg3Var.getClass();
        str.getClass();
        this.f8774e = xg3Var.m24496c(str);
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: C */
    public final void mo2874C(int i, String str) {
        int i2 = this.f8773d;
        AutoCloseable autoCloseable = this.f8774e;
        switch (i2) {
            case 0:
                str.getClass();
                ((co9) autoCloseable).mo2874C(i, str);
                break;
            default:
                str.getClass();
                m10551a();
                ((ch3) autoCloseable).mo3716t(i, str);
                break;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: L */
    public final String mo2875L(int i) {
        switch (this.f8773d) {
            case 0:
                return ((co9) this.f8774e).mo2875L(i);
            default:
                m10551a();
                AbstractC3695vr.m23485C(21, "no row");
                throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: a0 */
    public final boolean mo2876a0() {
        int i = this.f8773d;
        AutoCloseable autoCloseable = this.f8774e;
        switch (i) {
            case 0:
                co9 co9Var = (co9) autoCloseable;
                boolean zMo2876a0 = co9Var.mo2876a0();
                boolean zEqualsIgnoreCase = co9Var.mo2875L(0).equalsIgnoreCase("wal");
                xg3 xg3Var = this.f35967a;
                if (zEqualsIgnoreCase) {
                    xg3Var.f68178a.enableWriteAheadLogging();
                } else {
                    xg3Var.f68178a.disableWriteAheadLogging();
                }
                return zMo2876a0;
            default:
                m10551a();
                ((ch3) autoCloseable).f10085b.execute();
                return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f8773d;
        AutoCloseable autoCloseable = this.f8774e;
        switch (i) {
            case 0:
                ((co9) autoCloseable).close();
                break;
            default:
                ((ch3) autoCloseable).close();
                this.f35969c = true;
                break;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: g */
    public final void mo2877g(int i, double d) {
        int i2 = this.f8773d;
        AutoCloseable autoCloseable = this.f8774e;
        switch (i2) {
            case 0:
                ((co9) autoCloseable).mo2877g(i, d);
                break;
            default:
                m10551a();
                ((ch3) autoCloseable).mo3711g(i, d);
                break;
        }
    }

    @Override // p000.ik8
    public final byte[] getBlob(int i) {
        switch (this.f8773d) {
            case 0:
                return ((co9) this.f8774e).getBlob(i);
            default:
                m10551a();
                AbstractC3695vr.m23485C(21, "no row");
                throw null;
        }
    }

    @Override // p000.ik8
    public boolean getBoolean() {
        switch (this.f8773d) {
            case 0:
                return ((co9) this.f8774e).getBoolean();
            default:
                return super.getBoolean();
        }
    }

    @Override // p000.ik8
    public final int getColumnCount() {
        switch (this.f8773d) {
            case 0:
                return ((co9) this.f8774e).getColumnCount();
            default:
                m10551a();
                return 0;
        }
    }

    @Override // p000.ik8
    public final String getColumnName(int i) {
        switch (this.f8773d) {
            case 0:
                return ((co9) this.f8774e).getColumnName(i);
            default:
                m10551a();
                AbstractC3695vr.m23485C(21, "no row");
                throw null;
        }
    }

    @Override // p000.ik8
    public final double getDouble(int i) {
        switch (this.f8773d) {
            case 0:
                return ((co9) this.f8774e).getDouble(i);
            default:
                m10551a();
                AbstractC3695vr.m23485C(21, "no row");
                throw null;
        }
    }

    @Override // p000.ik8
    public final long getLong(int i) {
        switch (this.f8773d) {
            case 0:
                return ((co9) this.f8774e).getLong(i);
            default:
                m10551a();
                AbstractC3695vr.m23485C(21, "no row");
                throw null;
        }
    }

    @Override // p000.ik8
    public final boolean isNull(int i) {
        switch (this.f8773d) {
            case 0:
                return ((co9) this.f8774e).isNull(i);
            default:
                m10551a();
                AbstractC3695vr.m23485C(21, "no row");
                throw null;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: j */
    public final void mo2878j(int i, long j) {
        int i2 = this.f8773d;
        AutoCloseable autoCloseable = this.f8774e;
        switch (i2) {
            case 0:
                ((co9) autoCloseable).mo2878j(i, j);
                break;
            default:
                m10551a();
                ((ch3) autoCloseable).mo3712j(i, j);
                break;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: k */
    public final void mo2879k(int i, byte[] bArr) {
        int i2 = this.f8773d;
        AutoCloseable autoCloseable = this.f8774e;
        switch (i2) {
            case 0:
                ((co9) autoCloseable).mo2879k(i, bArr);
                break;
            default:
                m10551a();
                ((ch3) autoCloseable).mo3713k(i, bArr);
                break;
        }
    }

    @Override // p000.ik8
    /* JADX INFO: renamed from: m */
    public final void mo2880m(int i) {
        int i2 = this.f8773d;
        AutoCloseable autoCloseable = this.f8774e;
        switch (i2) {
            case 0:
                ((co9) autoCloseable).mo2880m(i);
                break;
            default:
                m10551a();
                ((ch3) autoCloseable).mo3714m(i);
                break;
        }
    }

    @Override // p000.do9, p000.ik8
    /* JADX INFO: renamed from: o */
    public final void mo3998o() {
        int i = this.f8773d;
        AutoCloseable autoCloseable = this.f8774e;
        switch (i) {
            case 0:
                ((co9) autoCloseable).mo3998o();
                break;
            default:
                m10551a();
                ((ch3) autoCloseable).mo3715o();
                break;
        }
    }

    @Override // p000.do9, p000.ik8
    public void reset() {
        switch (this.f8773d) {
            case 0:
                ((co9) this.f8774e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo9(xg3 xg3Var, String str, co9 co9Var) {
        super(xg3Var, str);
        xg3Var.getClass();
        str.getClass();
        this.f8774e = co9Var;
    }
}
