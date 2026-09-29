package p000;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v11 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f64686a;

    public v11(int i) {
        switch (i) {
            case 1:
                this.f64686a = new LinkedHashMap();
                break;
            default:
                this.f64686a = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m23038b(int i, String str, int i2) {
        return i + '-' + i2 + '-' + str;
    }

    /* JADX INFO: renamed from: a */
    public void m23039a(u11 u11Var) {
        long[] jArr = u11Var.f63238e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f64686a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(u11Var.f63238e[0]), u11Var);
        }
    }
}
