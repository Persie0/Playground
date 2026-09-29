package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d13 extends vc3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f34827b = 1;

    /* JADX INFO: renamed from: c */
    public boolean f34828c;

    /* JADX INFO: renamed from: d */
    public final vi3 f34829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d13(t89 t89Var, vi3 vi3Var) {
        super(t89Var);
        t89Var.getClass();
        this.f34829d = vi3Var;
    }

    @Override // p000.vc3, p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) throws Exception {
        int i = this.f34827b;
        vi3 vi3Var = this.f34829d;
        t89 t89Var = this.f65181a;
        switch (i) {
            case 0:
                if (this.f34828c) {
                    aj0Var.skip(j);
                } else {
                    try {
                        t89Var.mo471X(aj0Var, j);
                    } catch (IOException e) {
                        this.f34828c = true;
                        vi3Var.invoke(e);
                        return;
                    }
                }
                break;
            default:
                if (this.f34828c) {
                    aj0Var.skip(j);
                } else {
                    try {
                        t89Var.mo471X(aj0Var, j);
                    } catch (IOException e2) {
                        this.f34828c = true;
                        ((C0011a9) vi3Var).invoke(e2);
                    }
                }
                break;
        }
    }

    @Override // p000.vc3, p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Exception {
        switch (this.f34827b) {
            case 0:
                try {
                    super.close();
                } catch (IOException e) {
                    this.f34828c = true;
                    this.f34829d.invoke(e);
                }
                break;
            default:
                try {
                    super.close();
                } catch (IOException e2) {
                    this.f34828c = true;
                    ((C0011a9) this.f34829d).invoke(e2);
                    return;
                }
                break;
        }
    }

    @Override // p000.vc3, p000.t89, java.io.Flushable
    public final void flush() throws Exception {
        switch (this.f34827b) {
            case 0:
                if (!this.f34828c) {
                    try {
                        super.flush();
                    } catch (IOException e) {
                        this.f34828c = true;
                        this.f34829d.invoke(e);
                    }
                    break;
                }
                break;
            default:
                try {
                    super.flush();
                } catch (IOException e2) {
                    this.f34828c = true;
                    ((C0011a9) this.f34829d).invoke(e2);
                    return;
                }
                break;
        }
    }

    public d13(t89 t89Var, C0011a9 c0011a9) {
        super(t89Var);
        this.f34829d = c0011a9;
    }
}
