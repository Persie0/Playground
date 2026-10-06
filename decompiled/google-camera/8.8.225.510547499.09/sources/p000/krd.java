package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum krd {
    DNG("image/x-adobe-dng", "dng"),
    GIF("image/gif", "gif"),
    JPEG("image/jpeg", "jpg"),
    PHOTOSPHERE("application/vnd.google.panorama360+jpg", "jpg"),
    MPEG4("video/mp4", "mp4"),
    THREE_GPP("video/3gpp", "3gp"),
    WEBM("video/webm", "webm"),
    OTHER;


    /* JADX INFO: renamed from: k */
    private static final Map f37017k;

    /* JADX INFO: renamed from: l */
    private static final Set f37018l;

    /* JADX INFO: renamed from: m */
    private static final Set f37019m;

    /* JADX INFO: renamed from: i */
    public final String f37021i;

    /* JADX INFO: renamed from: j */
    public final String f37022j;

    static {
        mwt mwtVar = new mwt();
        for (krd krdVar : values()) {
            mwtVar.mo17110e(krdVar.f37021i, krdVar);
        }
        f37017k = mwtVar.mo17059b();
        f37018l = mxk.m17139K(DNG, GIF, JPEG, PHOTOSPHERE);
        f37019m = mxk.m17137I(MPEG4, THREE_GPP);
    }

    krd() {
        this.f37021i = "";
        this.f37022j = "";
    }

    /* JADX INFO: renamed from: a */
    public static krd m14742a(String str) {
        Map map = f37017k;
        return !map.containsKey(str) ? OTHER : (krd) map.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14743b() {
        return f37018l.contains(this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14744c() {
        return f37019m.contains(this);
    }

    krd(String str, String str2) {
        this.f37021i = str;
        this.f37022j = str2;
    }
}
