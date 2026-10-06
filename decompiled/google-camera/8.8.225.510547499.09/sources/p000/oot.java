package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oot extends oos {

    /* JADX INFO: renamed from: d */
    public static final oot f46360d = new oot(1, 0);

    public oot(int i, int i2) {
        super(i, i2);
    }

    @Override // p000.oos
    /* JADX INFO: renamed from: b */
    public final boolean mo18816b() {
        return this.f46357a > this.f46358b;
    }

    @Override // p000.oos
    public final boolean equals(Object obj) {
        if (!(obj instanceof oot)) {
            return false;
        }
        if (mo18816b() && ((oot) obj).mo18816b()) {
            return true;
        }
        oot ootVar = (oot) obj;
        return this.f46357a == ootVar.f46357a && this.f46358b == ootVar.f46358b;
    }

    @Override // p000.oos
    public final int hashCode() {
        if (mo18816b()) {
            return -1;
        }
        return (this.f46357a * 31) + this.f46358b;
    }

    @Override // p000.oos
    public final String toString() {
        return this.f46357a + ".." + this.f46358b;
    }
}
