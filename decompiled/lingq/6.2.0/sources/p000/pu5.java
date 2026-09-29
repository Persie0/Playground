package p000;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pu5 {

    /* JADX INFO: renamed from: a */
    public final String f56810a;

    /* JADX INFO: renamed from: b */
    public final mu5 f56811b;

    /* JADX INFO: renamed from: c */
    public final lu5 f56812c;

    /* JADX INFO: renamed from: d */
    public final tu5 f56813d;

    /* JADX INFO: renamed from: e */
    public final ku5 f56814e;

    /* JADX INFO: renamed from: f */
    public final nu5 f56815f;

    static {
        e41 e41Var = new e41(13);
        ImmutableList.m6289v();
        List list = Collections.EMPTY_LIST;
        ImmutableList.m6289v();
        nu5 nu5Var = nu5.f53257a;
        e41Var.m10839e();
        tu5 tu5Var = tu5.f62885B;
        AbstractC3393o1.m17746u(0, 1, 2, 3, 4);
        uma.m22828w(5);
    }

    public pu5(String str, ku5 ku5Var, mu5 mu5Var, lu5 lu5Var, tu5 tu5Var, nu5 nu5Var) {
        this.f56810a = str;
        this.f56811b = mu5Var;
        this.f56812c = lu5Var;
        this.f56813d = tu5Var;
        this.f56814e = ku5Var;
        this.f56815f = nu5Var;
    }

    /* JADX INFO: renamed from: a */
    public static pu5 m19482a(Uri uri) {
        e41 e41Var = new e41(13);
        ImmutableList.m6289v();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListM6289v = ImmutableList.m6289v();
        return new pu5("", new ku5(e41Var), uri != null ? new mu5(uri, immutableListM6289v) : null, new lu5(), tu5.f62885B, nu5.f53257a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu5)) {
            return false;
        }
        pu5 pu5Var = (pu5) obj;
        return Objects.equals(this.f56810a, pu5Var.f56810a) && this.f56814e.equals(pu5Var.f56814e) && Objects.equals(this.f56811b, pu5Var.f56811b) && this.f56812c.equals(pu5Var.f56812c) && Objects.equals(this.f56813d, pu5Var.f56813d) && Objects.equals(this.f56815f, pu5Var.f56815f);
    }

    public final int hashCode() {
        int iHashCode = this.f56810a.hashCode() * 31;
        mu5 mu5Var = this.f56811b;
        int iHashCode2 = (this.f56813d.hashCode() + ((this.f56814e.hashCode() + ((this.f56812c.hashCode() + ((iHashCode + (mu5Var != null ? mu5Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f56815f.getClass();
        return iHashCode2;
    }
}
