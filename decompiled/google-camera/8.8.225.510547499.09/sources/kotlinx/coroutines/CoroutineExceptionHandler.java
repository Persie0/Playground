package kotlinx.coroutines;

import p000.olt;
import p000.olv;
import p000.oly;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface CoroutineExceptionHandler extends olv {

    /* JADX INFO: renamed from: a */
    public static final olt f36712a = olt.f46269b;

    void handleException(oly olyVar, Throwable th);
}
