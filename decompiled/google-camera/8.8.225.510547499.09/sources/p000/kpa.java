package p000;

import android.os.Build;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpa {

    /* JADX INFO: renamed from: g */
    private static final Pattern f36757g = Pattern.compile("^[A-Z][A-Z0-9]{3}\\.\\d{6}\\.\\d{3}(\\..*)?$");

    /* JADX INFO: renamed from: a */
    public final boolean f36758a = true;

    /* JADX INFO: renamed from: b */
    public final boolean f36759b = true;

    /* JADX INFO: renamed from: c */
    public final boolean f36760c = true;

    /* JADX INFO: renamed from: d */
    public final boolean f36761d = true;

    /* JADX INFO: renamed from: e */
    public final boolean f36762e = true;

    /* JADX INFO: renamed from: f */
    public final boolean f36763f = true;

    private kpa(int i, String str) {
        if ("MASTER".equals(str) || i > 33 || !f36757g.matcher(str).find()) {
            return;
        }
        str.charAt(0);
    }

    /* JADX INFO: renamed from: a */
    public static kpa m14659a() {
        Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        String str = Build.ID;
        numValueOf.intValue();
        int iIntValue = numValueOf.intValue();
        if (str == null) {
            str = "AAA01";
        }
        return new kpa(iIntValue, str);
    }
}
