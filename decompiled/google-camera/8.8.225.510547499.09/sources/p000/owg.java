package p000;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class owg implements our {

    /* JADX INFO: renamed from: a */
    public final oly f46712a;

    /* JADX INFO: renamed from: b */
    public final int f46713b;

    public owg(oly olyVar, int i) {
        this.f46712a = olyVar;
        this.f46713b = i;
        boolean z = oqu.f46432a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m19113d(owg owgVar, ous ousVar, ols olsVar) throws Throwable {
        Object objM18924e = oqv.m18924e(new owe(ousVar, owgVar, null), olsVar);
        return objM18924e == oma.COROUTINE_SUSPENDED ? objM18924e : oki.f46196a;
    }

    /* JADX INFO: renamed from: b */
    protected abstract Object mo19080b(oub oubVar, ols olsVar);

    @Override // p000.our
    /* JADX INFO: renamed from: da */
    public Object mo16104da(ous ousVar, ols olsVar) {
        return m19113d(this, ousVar, olsVar);
    }

    public String toString() throws IOException {
        ArrayList arrayList = new ArrayList(4);
        oly olyVar = this.f46712a;
        if (olyVar != olz.f46282a) {
            StringBuilder sb = new StringBuilder();
            sb.append("context=");
            sb.append(olyVar);
            arrayList.add("context=".concat(olyVar.toString()));
        }
        if (this.f46713b != -3) {
            arrayList.add("capacity=-2");
        }
        return oqv.m18920a(this) + "[" + omn.m18680T(arrayList, ", ", null, null, null, 62) + "]";
    }
}
