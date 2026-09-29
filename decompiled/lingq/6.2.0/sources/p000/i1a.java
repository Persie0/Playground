package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1a {

    /* JADX INFO: renamed from: a */
    public static final Logger f43355a = Logger.getLogger(i1a.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f43356b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static boolean m13628a() {
        return f43356b.get();
    }
}
