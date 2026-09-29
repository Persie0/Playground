package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t77 extends AbstractC3669v1 implements g14 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61941a;

    /* JADX INFO: renamed from: b */
    public final m77 f61942b;

    public /* synthetic */ t77(m77 m77Var, int i) {
        this.f61941a = i;
        this.f61942b = m77Var;
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f61941a;
        m77 m77Var = this.f61942b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = m77Var.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && m77Var.containsKey(entry.getKey());
            default:
                return m77Var.containsKey(obj);
        }
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        int i = this.f61941a;
        m77 m77Var = this.f61942b;
        switch (i) {
            case 0:
                m77Var.getClass();
                break;
            default:
                m77Var.getClass();
                break;
        }
        return m77Var.f50734b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f61941a) {
            case 0:
                yba ybaVar = this.f61942b.f50733a;
                zba[] zbaVarArr = new zba[8];
                for (int i = 0; i < 8; i++) {
                    zbaVarArr[i] = new aca(0);
                }
                return new u77(ybaVar, zbaVarArr);
            default:
                yba ybaVar2 = this.f61942b.f50733a;
                zba[] zbaVarArr2 = new zba[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    zbaVarArr2[i2] = new aca(1);
                }
                return new u77(ybaVar2, zbaVarArr2);
        }
    }
}
