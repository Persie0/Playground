package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oob extends onw implements ooa, oox {

    /* JADX INFO: renamed from: e */
    private final int f46345e;

    /* JADX INFO: renamed from: f */
    private final int f46346f;

    public oob(Class cls) {
        super(f46331a, cls, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", false);
        this.f46345e = 3;
        this.f46346f = 0;
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
        if (!(obj instanceof oob)) {
            if (obj instanceof oox) {
                return obj.equals(m18726b());
            }
            return false;
        }
        oob oobVar = (oob) obj;
        if (this.f46333c.equals(oobVar.f46333c) && this.f46334d.equals(oobVar.f46334d)) {
            int i = oobVar.f46346f;
            int i2 = oobVar.f46345e;
            if (ooc.m18737c(this.f46332b, oobVar.f46332b) && ooc.m18737c(m18727c(), oobVar.m18727c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        m18727c();
        return (((m18727c().hashCode() * 31) + this.f46333c.hashCode()) * 31) + this.f46334d.hashCode();
    }

    @Override // p000.ooa
    /* JADX INFO: renamed from: i */
    public final int mo18660i() {
        return 3;
    }

    public final String toString() {
        oou oouVarM18726b = m18726b();
        if (oouVarM18726b != this) {
            return oouVarM18726b.toString();
        }
        if ("<init>".equals(this.f46333c)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.f46333c + " (Kotlin reflection is not available)";
    }
}
