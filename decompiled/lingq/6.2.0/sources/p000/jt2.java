package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jt2 implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46102a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f46102a) {
            case 0:
                str.getClass();
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1))).m15427f(str);
            default:
                str.getClass();
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1))).m15427f(str);
        }
    }
}
