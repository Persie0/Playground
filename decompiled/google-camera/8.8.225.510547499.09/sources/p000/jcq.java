package p000;

import android.content.Context;
import java.nio.charset.Charset;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcq implements jce {

    /* JADX INFO: renamed from: a */
    public static final Charset f33733a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final lpt f33734b;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f33735c;

    /* JADX INFO: renamed from: d */
    static Boolean f33736d;

    /* JADX INFO: renamed from: e */
    static Long f33737e;

    /* JADX INFO: renamed from: f */
    public final Context f33738f;

    static {
        lpt lptVar = new lpt(lph.m15821a("com.google.android.gms.clearcut.public"));
        if (lptVar.f38909d) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        lpt lptVar2 = new lpt(lptVar.f38906a, "gms:playlog:service:samplingrules_", lptVar.f38908c, false, lptVar.f38910e, lptVar.f38911f);
        f33734b = new lpt(lptVar2.f38906a, lptVar2.f38907b, "LogSamplingRulesV2__", lptVar2.f38909d, lptVar2.f38910e, lptVar2.f38911f);
        f33735c = new ConcurrentHashMap();
        f33736d = null;
        f33737e = null;
    }

    public jcq(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f33738f = applicationContext;
        if (applicationContext != null) {
            lpv.m15843h(applicationContext);
        }
    }
}
