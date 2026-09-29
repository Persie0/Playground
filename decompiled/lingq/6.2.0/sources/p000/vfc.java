package p000;

import com.google.android.gms.internal.play_billing.AbstractC0998i;
import com.google.android.gms.internal.play_billing.AbstractC1003n;
import com.google.android.gms.internal.play_billing.C1001l;
import com.google.android.gms.internal.play_billing.C1002m;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vfc {

    /* JADX INFO: renamed from: c */
    public static final vfc f65328c = new vfc();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f65330b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final m58 f65329a = new m58(3);

    /* JADX INFO: renamed from: a */
    public final lgc m23265a(Class cls) {
        lgc lgcVarM5578j;
        Charset charset = m9c.f50823a;
        if (cls == null) {
            C3386nv.m17635v("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f65330b;
        lgc lgcVar = (lgc) concurrentHashMap.get(cls);
        if (lgcVar != null) {
            return lgcVar;
        }
        m58 m58Var = this.f65329a;
        m58Var.getClass();
        e41 e41Var = AbstractC1003n.f12199a;
        if (!AbstractC0998i.class.isAssignableFrom(cls)) {
            int i = w1c.f66234a;
        }
        fgc fgcVarMo12668a = ((gw9) m58Var.f50618b).mo12668a(cls);
        if ((fgcVarMo12668a.f39095d & 2) == 2) {
            int i2 = w1c.f66234a;
            e41 e41Var2 = AbstractC1003n.f12199a;
            s46 s46Var = q6c.f57331a;
            lgcVarM5578j = C1002m.m5578j(e41Var2, fgcVarMo12668a.f39092a);
        } else {
            int i3 = w1c.f66234a;
            int i4 = pfc.f56077a;
            int i5 = ibc.f43911a;
            e41 e41Var3 = AbstractC1003n.f12199a;
            s46 s46Var2 = fgcVarMo12668a.m11830a() + (-1) != 1 ? q6c.f57331a : null;
            int i6 = ndc.f52628a;
            lgcVarM5578j = C1001l.m5549u(fgcVarMo12668a, e41Var3, s46Var2);
        }
        lgc lgcVar2 = (lgc) concurrentHashMap.putIfAbsent(cls, lgcVarM5578j);
        return lgcVar2 != null ? lgcVar2 : lgcVarM5578j;
    }
}
