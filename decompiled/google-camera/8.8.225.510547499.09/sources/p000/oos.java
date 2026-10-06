package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oos implements Iterable {

    /* JADX INFO: renamed from: a */
    public final int f46357a;

    /* JADX INFO: renamed from: b */
    public final int f46358b;

    /* JADX INFO: renamed from: c */
    public final int f46359c = 1;

    public oos(int i, int i2) {
        this.f46357a = i;
        this.f46358b = i2;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final okz iterator() {
        return new okz(this.f46357a, this.f46358b);
    }

    /* JADX INFO: renamed from: b */
    public boolean mo18816b() {
        return this.f46357a > this.f46358b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof oos)) {
            return false;
        }
        if (mo18816b() && ((oos) obj).mo18816b()) {
            return true;
        }
        oos oosVar = (oos) obj;
        if (this.f46357a != oosVar.f46357a || this.f46358b != oosVar.f46358b) {
            return false;
        }
        int i = oosVar.f46359c;
        return true;
    }

    public int hashCode() {
        if (mo18816b()) {
            return -1;
        }
        return (((this.f46357a * 31) + this.f46358b) * 31) + 1;
    }

    public String toString() {
        return this.f46357a + ".." + this.f46358b + " step 1";
    }
}
