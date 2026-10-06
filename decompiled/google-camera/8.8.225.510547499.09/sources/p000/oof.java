package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oof extends onw implements omx, oou {
    public oof() {
        Object obj = onw.f46331a;
        throw null;
    }

    @Override // p000.omx
    /* JADX INFO: renamed from: a */
    public final Object mo2077a() {
        return mo18761g();
    }

    @Override // p000.onw
    /* JADX INFO: renamed from: e */
    protected final void mo18729e() {
        int i = ooj.f46352a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oof) {
            oof oofVar = (oof) obj;
            if (m18727c().equals(oofVar.m18727c()) && this.f46333c.equals(oofVar.f46333c) && this.f46334d.equals(oofVar.f46334d) && ooc.m18737c(this.f46332b, oofVar.f46332b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final ooy m18760f() {
        oou oouVarM18726b = m18726b();
        if (oouVarM18726b != this) {
            return ((oof) oouVarM18726b).m18760f();
        }
        throw new omw();
    }

    /* JADX INFO: renamed from: g */
    public Object mo18761g() {
        return m18760f().mo18728d();
    }

    public final int hashCode() {
        return (((m18727c().hashCode() * 31) + this.f46333c.hashCode()) * 31) + this.f46334d.hashCode();
    }

    public final String toString() {
        oou oouVarM18726b = m18726b();
        if (oouVarM18726b != this) {
            return oouVarM18726b.toString();
        }
        return "property " + this.f46333c + " (Kotlin reflection is not available)";
    }

    public oof(Object obj, Class cls) {
        super(obj, cls, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }
}
