package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p000.cd4;
import p000.d1a;

/* JADX INFO: loaded from: classes.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient cd4 f47759a;

    public TimeoutCancellationException(String str, d1a d1aVar) {
        super(str);
        this.f47759a = d1aVar;
    }
}
