package p000;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dit {

    /* JADX INFO: renamed from: a */
    private static final Pattern f11710a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    static {
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6198a(String str) {
        return f11710a.matcher(str).matches();
    }
}
