package p262mb;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: mb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7532e {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* JADX INFO: renamed from: a */
    public static boolean m15044a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
