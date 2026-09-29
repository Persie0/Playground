package p000;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n89 extends z0a {

    /* JADX INFO: renamed from: g */
    public static final Object f52491g = new Object();

    /* JADX INFO: renamed from: b */
    public final long f52492b;

    /* JADX INFO: renamed from: c */
    public final long f52493c;

    /* JADX INFO: renamed from: d */
    public final boolean f52494d;

    /* JADX INFO: renamed from: e */
    public final pu5 f52495e;

    /* JADX INFO: renamed from: f */
    public final lu5 f52496f;

    static {
        e41 e41Var = new e41(13);
        ImmutableList.m6289v();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListM6289v = ImmutableList.m6289v();
        nu5 nu5Var = nu5.f53257a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new mu5(uri, immutableListM6289v);
        }
        e41Var.m10839e();
        tu5 tu5Var = tu5.f62885B;
    }

    public n89(long j, boolean z, boolean z2, pu5 pu5Var) {
        lu5 lu5Var = z2 ? pu5Var.f56812c : null;
        this.f52492b = j;
        this.f52493c = j;
        this.f52494d = z;
        pu5Var.getClass();
        this.f52495e = pu5Var;
        this.f52496f = lu5Var;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: b */
    public final int mo17285b(Object obj) {
        return f52491g != obj ? -1 : 0;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: f */
    public final x0a mo16393f(int i, x0a x0aVar, boolean z) {
        bna.m3973s(i, 1);
        Object obj = z ? f52491g : null;
        x0aVar.getClass();
        C3175k8 c3175k8 = C3175k8.f46839c;
        x0aVar.f67599a = null;
        x0aVar.f67600b = obj;
        x0aVar.f67601c = 0;
        x0aVar.f67602d = this.f52492b;
        x0aVar.f67603e = 0L;
        x0aVar.f67605g = c3175k8;
        x0aVar.f67604f = false;
        return x0aVar;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: h */
    public final int mo17286h() {
        return 1;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: l */
    public final Object mo17287l(int i) {
        bna.m3973s(i, 1);
        return f52491g;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: m */
    public final y0a mo39m(int i, y0a y0aVar, long j) {
        bna.m3973s(i, 1);
        Object obj = y0a.f69062o;
        y0aVar.m24825b(this.f52495e, this.f52494d, false, this.f52496f, 0L, this.f52493c);
        return y0aVar;
    }

    @Override // p000.z0a
    /* JADX INFO: renamed from: o */
    public final int mo17288o() {
        return 1;
    }
}
