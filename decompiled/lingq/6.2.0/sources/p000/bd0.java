package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bd0 extends wc3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8357b = 0;

    /* JADX INFO: renamed from: c */
    public Object f8358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(zq6 zq6Var, hj0 hj0Var) {
        super(hj0Var);
        this.f8358c = zq6Var;
    }

    @Override // p000.wc3, p000.yd9
    /* JADX INFO: renamed from: F */
    public long mo459F(aj0 aj0Var, long j) throws Exception {
        switch (this.f8357b) {
            case 0:
                try {
                    return super.mo459F(aj0Var, j);
                } catch (Exception e) {
                    this.f8358c = e;
                    throw e;
                }
            case 1:
            default:
                return super.mo459F(aj0Var, j);
            case 2:
                try {
                    return super.mo459F(aj0Var, j);
                } catch (IOException e2) {
                    ((zq6) this.f8358c).f71975e = e2;
                    throw e2;
                }
        }
    }

    @Override // p000.wc3, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f8357b) {
            case 1:
                ((cl0) this.f8358c).f10218c.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public /* synthetic */ bd0(yd9 yd9Var) {
        super(yd9Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(yd9 yd9Var, cl0 cl0Var) {
        super(yd9Var);
        this.f8358c = cl0Var;
    }
}
