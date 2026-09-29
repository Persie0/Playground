package p000;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class s82 extends lda {

    /* JADX INFO: renamed from: s */
    public final Object f60504s = new Object();

    /* JADX INFO: renamed from: t */
    public final ExecutorService f60505t = Executors.newFixedThreadPool(4, new r82());

    /* JADX INFO: renamed from: u */
    public volatile Handler f60506u;
}
