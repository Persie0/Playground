package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class uea {

    /* JADX INFO: renamed from: a */
    public static String[] f63814a;

    /* JADX INFO: renamed from: a */
    public static final long m22716a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22717b(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m22718c(int i, bnd bndVar, StringBuilder sb) {
        if (i - 1 != 0 || bndVar == bnd.f8756a) {
            return false;
        }
        sb.append(bndVar.mo623a());
        sb.append('.');
        sb.append(bndVar.mo624b());
        sb.append(':');
        sb.append(bndVar.mo625c());
        return true;
    }
}
