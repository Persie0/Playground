package p000;

import android.net.Uri;
import android.os.StrictMode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yxc implements on9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f70625b;

    public /* synthetic */ yxc(Object obj, int i) {
        this.f70624a = i;
        this.f70625b = obj;
    }

    @Override // p000.on9
    public final Object get() {
        int i = this.f70624a;
        Object obj = this.f70625b;
        switch (i) {
            case 0:
                Object obj2 = C0962f.f11840j;
                return new dgd((ArrayList) obj);
            default:
                final ved vedVar = (ved) obj;
                c26 c26Var = (c26) vedVar.f65290c.get();
                c26Var.getClass();
                d2d d2dVar = (d2d) vedVar.f65289b.get();
                d2dVar.getClass();
                ltc ltcVar = d2dVar.f34881a;
                i44 i44VarM13651b = i44.m13651b();
                i44VarM13651b.f43482c = new gw9(ltcVar, 13);
                i44VarM13651b.f43483d = new Feature[]{AbstractC3423or.f54772j};
                i44VarM13651b.f43480a = false;
                C3555s c3555sM9998b = d2d.m9998b(ltcVar.m17569c(0, i44VarM13651b.m13652a()));
                ujb ujbVar = ujb.f63994d;
                int i2 = AbstractRunnableC3630u.f63155l;
                C3593t c3593t = new C3593t(c3555sM9998b, zzmk.class, ujbVar);
                c3555sM9998b.mo52a(c3593t, AbstractC1120j.m6405b(c26Var, c3593t));
                C3817z1 c3817z1M6402f = AbstractC1118h.m6402f(c3593t, new gj3() { // from class: jed
                    @Override // p000.gj3
                    public final /* synthetic */ Object apply(Object obj3) {
                        ved vedVar2 = vedVar;
                        g5d g5dVar = (g5d) obj3;
                        cdb cdbVar = new cdb(20, false);
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                        try {
                            try {
                                synchronized (ved.f65286j) {
                                    dgd dgdVar = (dgd) vedVar2.f65291d.get();
                                    Uri uri = vedVar2.f65294g;
                                    cdb cdbVarM4554j = cdb.m4554j(g5dVar.m12377s());
                                    cdbVarM4554j.m4564m(cdbVar);
                                    dgdVar.m10371a(uri, cdbVarM4554j);
                                    vedVar2.f65295h = g5dVar.m12377s();
                                }
                                synchronized (ved.f65287k) {
                                    dgd dgdVar2 = (dgd) vedVar2.f65291d.get();
                                    Uri uri2 = vedVar2.f65296i;
                                    cdb cdbVarM4554j2 = cdb.m4554j(g5dVar.m12378t());
                                    cdbVarM4554j2.m4564m(cdbVar);
                                    dgdVar2.m10371a(uri2, cdbVarM4554j2);
                                    g5dVar.m12378t();
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                return null;
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    }
                }, c26Var);
                c3817z1M6402f.mo52a(new RunnableC3795yg(c3817z1M6402f, 14), c26Var);
                return c3817z1M6402f;
        }
    }
}
