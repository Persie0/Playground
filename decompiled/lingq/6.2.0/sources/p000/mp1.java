package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp1 implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51684a;

    public /* synthetic */ mp1(int i) {
        this.f51684a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f51684a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            case 3:
                return str.startsWith("event") && !str.endsWith("_");
            case 4:
                str.getClass();
                return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3))).m15427f(str);
            case 5:
                str.getClass();
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1))).m15427f(str);
            default:
                return Pattern.matches("cpu[0-9]+", str);
        }
    }
}
