package p112f8;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import kotlin.text.Regex;
import p339qe.C8596a;

/* JADX INFO: renamed from: f8.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5477b implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34065a;

    public /* synthetic */ C5477b(int i10) {
        this.f34065a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean z10 = false;
        switch (this.f34065a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11110e(str, "name");
                return new Regex(C0166e.m770q(new Object[]{"analysis_log_"}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).m14271b(str);
            default:
                Charset charset = C8596a.f46067d;
                if (str.startsWith("event") && !str.endsWith("_")) {
                    z10 = true;
                }
                return z10;
        }
    }
}
