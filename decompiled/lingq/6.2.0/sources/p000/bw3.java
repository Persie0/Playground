package p000;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class bw3 extends zv3 {

    /* JADX INFO: renamed from: e */
    public long f9087e;

    /* JADX INFO: renamed from: f */
    public boolean f9088f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ fw3 f9089g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw3(fw3 fw3Var, ex3 ex3Var) {
        super(fw3Var, ex3Var);
        ex3Var.getClass();
        this.f9089g = fw3Var;
        this.f9087e = -1L;
        this.f9088f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r18.f9088f == false) goto L48;
     */
    @Override // p000.zv3, p000.yd9
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo459F(aj0 aj0Var, long j) throws IOException {
        long j2;
        fw3 fw3Var = this.f9089g;
        C3309ls c3309ls = fw3Var.f39782c;
        aj0Var.getClass();
        long j3 = 0;
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f72255c) {
            C3386nv.m17633t("closed");
            return 0L;
        }
        if (this.f9088f) {
            long j4 = this.f9087e;
            if (j4 == 0 || j4 == -1) {
                if (j4 != -1) {
                    ((e18) c3309ls.f50065c).mo457D(Long.MAX_VALUE);
                }
                try {
                    e18 e18Var = (e18) c3309ls.f50065c;
                    aj0 aj0Var2 = e18Var.f36575b;
                    e18Var.mo475b0(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        j2 = j3;
                        if (!e18Var.mo464P(i2)) {
                            break;
                        }
                        byte bM494q = aj0Var2.m494q(i);
                        if ((bM494q >= 48 && bM494q <= 57) || ((bM494q >= 97 && bM494q <= 102) || (bM494q >= 65 && bM494q <= 70))) {
                            i = i2;
                            j3 = j2;
                        }
                        if (i != 0) {
                            break;
                        }
                        ci8.m4727l(16);
                        String string = Integer.toString(bM494q, 16);
                        string.getClass();
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                    }
                    this.f9087e = aj0Var2.m467T();
                    String string2 = vk9.m23376L0(((e18) c3309ls.f50065c).mo457D(Long.MAX_VALUE)).toString();
                    if (this.f9087e < j2 || (string2.length() > 0 && !cl9.m4842Y(string2, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f9087e + string2 + '\"');
                    }
                    if (this.f9087e == j2) {
                        this.f9088f = false;
                        m25809a(fw3Var.f39784e.m20758r());
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo459F = super.mo459F(aj0Var, Math.min(j, this.f9087e));
            if (jMo459F != -1) {
                this.f9087e -= jMo459F;
                return jMo459F;
            }
            fw3Var.f39781b.mo11847e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m25809a(fw3.f39779f);
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM15116g;
        if (this.f72255c) {
            return;
        }
        if (this.f9088f) {
            TimeZone timeZone = kcb.f47051a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zM15116g = kcb.m15116g(this, 100);
            } catch (IOException unused) {
                zM15116g = false;
            }
            if (!zM15116g) {
                this.f9089g.f39781b.mo11847e();
                m25809a(fw3.f39779f);
            }
        }
        this.f72255c = true;
    }
}
