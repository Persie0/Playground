package p000;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class jc3 extends z68 {

    /* JADX INFO: renamed from: d */
    public static final xv5 f45397d;

    /* JADX INFO: renamed from: b */
    public final List f45398b;

    /* JADX INFO: renamed from: c */
    public final List f45399c;

    static {
        Regex regex = xv5.f68845e;
        f45397d = AbstractC3122is.m14103q("application/x-www-form-urlencoded");
    }

    public jc3(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.f45398b = kcb.m15119j(arrayList);
        this.f45399c = kcb.m15119j(arrayList2);
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: a */
    public final long mo159a() {
        return m14389e(null, true);
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: b */
    public final xv5 mo160b() {
        return f45397d;
    }

    @Override // p000.z68
    /* JADX INFO: renamed from: d */
    public final void mo161d(gj0 gj0Var) throws EOFException {
        m14389e(gj0Var, false);
    }

    /* JADX INFO: renamed from: e */
    public final long m14389e(gj0 gj0Var, boolean z) throws EOFException {
        aj0 aj0VarMo482h;
        if (z) {
            aj0VarMo482h = new aj0();
        } else {
            gj0Var.getClass();
            aj0VarMo482h = gj0Var.mo482h();
        }
        List list = this.f45398b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                aj0VarMo482h.m487k0(38);
            }
            aj0VarMo482h.m495q0((String) list.get(i));
            aj0VarMo482h.m487k0(61);
            aj0VarMo482h.m495q0((String) this.f45399c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = aj0VarMo482h.f723b;
        aj0VarMo482h.m473a();
        return j;
    }
}
