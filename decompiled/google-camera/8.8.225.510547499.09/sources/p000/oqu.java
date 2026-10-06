package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqu {

    /* JADX INFO: renamed from: a */
    public static final boolean f46432a;

    /* JADX INFO: renamed from: b */
    public static final boolean f46433b;

    /* JADX INFO: renamed from: c */
    public static final AtomicLong f46434c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r0.equals("off") != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r0.equals("on") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r0.equals("") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0.equals(com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA.AzMempkuq) != false) goto L12;
     */
    static {
        boolean z;
        String strM19163a = oya.m19163a("kotlinx.coroutines.debug");
        if (strM19163a != null) {
            switch (strM19163a.hashCode()) {
                case 0:
                    break;
                case 3551:
                    break;
                case 109935:
                    break;
                case 3005871:
                    break;
                default:
                    throw new IllegalStateException("System property 'kotlinx.coroutines.debug' has unrecognized value '" + strM19163a + "'");
            }
        } else {
            z = false;
        }
        f46432a = z;
        f46433b = z && lku.m15639ah("kotlinx.coroutines.stacktrace.recovery", true);
        f46434c = new AtomicLong(0L);
    }
}
