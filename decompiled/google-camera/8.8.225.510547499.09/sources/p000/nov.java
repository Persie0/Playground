package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nov {

    /* JADX INFO: renamed from: c */
    private static final Logger f43995c = Logger.getLogger(nov.class.getName());

    /* JADX INFO: renamed from: a */
    public boolean f43996a;

    /* JADX INFO: renamed from: b */
    public AmbientDelegate f43997b;

    /* JADX INFO: renamed from: a */
    public static void m17577a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f43995c.logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (Throwable) e);
        }
    }
}
