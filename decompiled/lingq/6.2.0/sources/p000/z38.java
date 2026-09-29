package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z38 {
    /* JADX INFO: renamed from: a */
    public static String m25425a(ij3 ij3Var) {
        String string = ij3Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
