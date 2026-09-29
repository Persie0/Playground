package p000;

import androidx.lifecycle.Lifecycle$Event;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public interface hx9 extends oz6, Closeable, tb5 {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @ds6(Lifecycle$Event.ON_DESTROY)
    void close();
}
