package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kcr extends Exception {

    /* JADX INFO: renamed from: a */
    public final kcl f35598a;

    /* JADX INFO: renamed from: b */
    public final kmg f35599b;

    /* JADX INFO: renamed from: c */
    public final boolean f35600c;

    public kcr(kmg kmgVar, kcl kclVar, boolean z) {
        String str = kmgVar.f36540a;
        String strM13983c = kclVar.m13983c();
        StringBuilder sb = new StringBuilder();
        sb.append("Camera ");
        sb.append(str);
        sb.append(" encountered a fatal error ");
        sb.append(true != z ? "before opening: " : "after open: ");
        sb.append(strM13983c);
        super(sb.toString());
        this.f35599b = kmgVar;
        this.f35598a = kclVar;
        this.f35600c = z;
    }
}
