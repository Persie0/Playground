package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mol {

    /* JADX INFO: renamed from: a */
    private final C1117xf f41194a;

    /* JADX INFO: renamed from: b */
    public boolean f41195b = false;

    public mol(C1117xf c1117xf) {
        this.f41194a = c1117xf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (mol molVar = this; molVar != null; molVar = null) {
            for (int i = 0; i < molVar.f41194a.f48004d; i++) {
                sb.append(this.f41194a.m19560g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
