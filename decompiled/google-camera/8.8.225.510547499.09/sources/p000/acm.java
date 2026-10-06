package p000;

import android.content.res.Resources;
import android.media.MediaFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acm {
    /* JADX INFO: renamed from: a */
    public static void m202a(Resources.Theme theme) {
        theme.rebase();
    }

    /* JADX INFO: renamed from: b */
    public static Integer m203b(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m204c(MediaFormat mediaFormat) {
        return "audio".equals(amq.m965a(mediaFormat.getString("mime")));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m205d(MediaFormat mediaFormat) {
        return "video".equals(amq.m965a(mediaFormat.getString("mime")));
    }
}
