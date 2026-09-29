package p067d8;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* JADX INFO: renamed from: d8.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5085y implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33014a;

    public /* synthetic */ C5085y(int i10) {
        this.f33014a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f33014a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return Pattern.matches("cpu[0-9]+", str);
            case 1:
                C5207g.m11110e(str, "name");
                return new Regex(C0166e.m770q(new Object[]{"anr_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).m14271b(str);
            case 2:
                C5207g.m11110e(str, "name");
                return new Regex(C0166e.m770q(new Object[]{"error_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).m14271b(str);
            default:
                return str.startsWith(".ae");
        }
    }
}
