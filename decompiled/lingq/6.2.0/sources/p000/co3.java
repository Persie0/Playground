package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class co3 extends f90 {

    /* JADX INFO: renamed from: z */
    public final Set f10347z;

    /* JADX WARN: Illegal instructions before constructor call */
    public co3(Context context, Looper looper, int i, co7 co7Var, qo3 qo3Var, ro3 ro3Var, int i2) {
        obd obdVarM17903a = obd.m17903a(context);
        oo3 oo3Var = oo3.f54649e;
        lda.m16130p(qo3Var);
        lda.m16130p(ro3Var);
        super(context, looper, obdVarM17903a, oo3Var, i, new nr9(qo3Var), new gw9(ro3Var, 6), (String) co7Var.f10362e);
        Set set = (Set) co7Var.f10361d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                C3386nv.m17633t("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.f10347z = set;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: e */
    public final Account mo4916e() {
        return null;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: g */
    public final Executor mo4917g() {
        return null;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: k */
    public final Set mo4918k() {
        return this.f10347z;
    }
}
