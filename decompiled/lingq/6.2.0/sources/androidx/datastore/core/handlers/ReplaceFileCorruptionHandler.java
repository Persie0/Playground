package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final vi3 produceNewData;

    public ReplaceFileCorruptionHandler(vi3 vi3Var) {
        vi3Var.getClass();
        this.produceNewData = vi3Var;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, Continuation<? super T> continuation) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
