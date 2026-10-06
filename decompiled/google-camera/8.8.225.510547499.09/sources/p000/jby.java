package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jby {

    /* JADX INFO: renamed from: a */
    public static volatile int f33680a = -1;

    /* JADX INFO: renamed from: b */
    public static final String[] f33681b = new String[0];

    /* JADX INFO: renamed from: i */
    @Deprecated
    public static final ihk f33682i;

    /* JADX INFO: renamed from: j */
    private static final jeu f33683j;

    /* JADX INFO: renamed from: c */
    public final jce f33684c;

    /* JADX INFO: renamed from: d */
    public final Context f33685d;

    /* JADX INFO: renamed from: e */
    protected final jcc f33686e;

    /* JADX INFO: renamed from: f */
    protected final String f33687f;

    /* JADX INFO: renamed from: g */
    public final String f33688g;

    /* JADX INFO: renamed from: h */
    public final EnumSet f33689h;

    static {
        jbw jbwVar = new jbw();
        f33683j = jbwVar;
        f33682i = new ihk("ClearcutLogger.API", jbwVar, (byte[]) null);
    }

    protected jby(Context context, String str, EnumSet enumSet) {
        if (!enumSet.contains(jcg.ACCOUNT_NAME)) {
            jib.m13197b(true, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        m12879b(enumSet);
        this.f33685d = context.getApplicationContext();
        this.f33688g = context.getPackageName();
        this.f33687f = str;
        this.f33689h = enumSet;
        this.f33686e = new jcl(context);
        this.f33684c = new jcq(context);
    }

    /* JADX INFO: renamed from: a */
    static final String m12878a(Iterable iterable) {
        return lyz.m16212h(", ").m16215d(iterable);
    }

    /* JADX INFO: renamed from: b */
    public static final void m12879b(EnumSet enumSet) {
        if (!enumSet.equals(jcg.f33722g) && !enumSet.equals(jcg.f33720e) && !enumSet.equals(jcg.f33721f)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int[] m12880d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12881c() {
        return this.f33689h.equals(jcg.f33721f);
    }
}
