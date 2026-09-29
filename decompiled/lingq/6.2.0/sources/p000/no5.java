package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class no5 implements jk7 {

    /* JADX INFO: renamed from: a */
    public static final Logger f53057a = Logger.getLogger(no5.class.getName());

    /* JADX INFO: renamed from: b */
    public static final byte[] f53058b = {0};

    /* JADX INFO: renamed from: c */
    public static final no5 f53059c = new no5();

    @Override // p000.jk7
    /* JADX INFO: renamed from: a */
    public final Class mo3177a() {
        return jo5.class;
    }

    @Override // p000.jk7
    /* JADX INFO: renamed from: b */
    public final Object mo3178b(sq5 sq5Var) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) sq5Var.f61248b).values().iterator();
        while (it.hasNext()) {
            for (hk7 hk7Var : (List) it.next()) {
                lda ldaVar = hk7Var.f42541h;
                if (ldaVar instanceof lo5) {
                    lo5 lo5Var = (lo5) ldaVar;
                    byte[] bArr = hk7Var.f42536c;
                    yk0 yk0VarM25164a = yk0.m25164a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!yk0VarM25164a.equals(lo5Var.mo12864O())) {
                        StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                        sb.append(lo5Var.mo12865P());
                        yk0 yk0VarMo12864O = lo5Var.mo12864O();
                        sb.append(" has wrong output prefix (");
                        sb.append(yk0VarMo12864O);
                        sb.append(") instead of (");
                        sb.append(yk0VarM25164a);
                        sb.append(")");
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            }
        }
        return new mo5(sq5Var);
    }

    @Override // p000.jk7
    /* JADX INFO: renamed from: c */
    public final Class mo3179c() {
        return jo5.class;
    }
}
