package p000;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class cr5 extends AbstractC3778y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34408a;

    /* JADX INFO: renamed from: b */
    public final Object f34409b;

    public /* synthetic */ cr5(Object obj, int i) {
        this.f34408a = i;
        this.f34409b = obj;
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f34408a) {
            case 0:
                if (obj == null ? true : obj instanceof uq5) {
                    return super.contains((uq5) obj);
                }
                return false;
            default:
                return ((m77) this.f34409b).containsValue(obj);
        }
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        int i = this.f34408a;
        Object obj = this.f34409b;
        switch (i) {
            case 0:
                return ((dr5) obj).f36077a.groupCount() + 1;
            default:
                m77 m77Var = (m77) obj;
                m77Var.getClass();
                return m77Var.f50734b;
        }
    }

    /* JADX INFO: renamed from: f */
    public uq5 m9865f(int i) {
        Matcher matcher = ((dr5) this.f34409b).f36077a;
        i84 i84VarM15922M = l70.m15922M(matcher.start(i), matcher.end(i));
        if (i84VarM15922M.f40379a < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new uq5(strGroup, i84VarM15922M);
    }

    @Override // p000.AbstractC3778y, java.util.Collection
    public boolean isEmpty() {
        switch (this.f34408a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f34408a) {
            case 0:
                return new p9a(new bl3(new z91(vz1.m23601G(this), 0), new fy4(this, 10), 1));
            default:
                yba ybaVar = ((m77) this.f34409b).f50733a;
                zba[] zbaVarArr = new zba[8];
                for (int i = 0; i < 8; i++) {
                    zbaVarArr[i] = new aca(2);
                }
                return new u77(ybaVar, zbaVarArr);
        }
    }
}
