package p000;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class vy8 implements Serializer {

    /* JADX INFO: renamed from: a */
    public final dz8 f66102a;

    public vy8(dz8 dz8Var) {
        dz8Var.getClass();
        this.f66102a = dz8Var;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return new uy8(this.f66102a.m10759a(null), null, null);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            cf4 cf4Var = df4.f35559d;
            String str = new String(pb1.m19026N(inputStream), yu0.f70463a);
            cf4Var.getClass();
            return (uy8) cf4Var.m10321a(str, uy8.Companion.serializer());
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session data", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        byte[] bytes = df4.f35559d.m10322b(uy8.Companion.serializer(), (uy8) obj).getBytes(yu0.f70463a);
        bytes.getClass();
        outputStream.write(bytes);
        return xfa.f68157a;
    }
}
