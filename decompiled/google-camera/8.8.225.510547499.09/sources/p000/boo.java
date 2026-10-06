package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class boo {

    /* JADX INFO: renamed from: a */
    final String f4021a;

    public boo(String str) {
        int length = str.length() - 14;
        if (length > 0) {
            bop.m2814c(bop.f4022a, "Tag " + str + " is " + length + " chars longer than limit.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CAM2PORT_");
        sb.append(length > 0 ? str.substring(0, 14) : str);
        this.f4021a = sb.toString();
    }

    public final String toString() {
        return this.f4021a;
    }
}
