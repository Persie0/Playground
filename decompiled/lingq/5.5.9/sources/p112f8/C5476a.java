package p112f8;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import kotlin.text.Regex;
import p339qe.C8596a;

/* JADX INFO: renamed from: f8.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5476a implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34064a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f34064a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11110e(str, "name");
                return new Regex(C0166e.m770q(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3, "^(%s|%s|%s)[0-9]+.json$", "java.lang.String.format(format, *args)")).m14271b(str);
            default:
                Charset charset = C8596a.f46067d;
                return str.startsWith("event");
        }
    }
}
