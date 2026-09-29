package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k84 {

    /* JADX INFO: renamed from: a */
    public int f46854a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f46854a);
        sb.append(")@");
        int iHashCode = hashCode();
        ci8.m4727l(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }
}
