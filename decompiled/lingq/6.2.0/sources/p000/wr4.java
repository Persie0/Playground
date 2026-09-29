package p000;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.glance.appwidget.protobuf.AbstractC0673g;
import androidx.glance.appwidget.protobuf.C0672f;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class wr4 implements Serializer {

    /* JADX INFO: renamed from: a */
    public static final wr4 f67204a = new wr4();

    /* JADX INFO: renamed from: b */
    public static final rr4 f67205b;

    static {
        rr4 rr4VarM20763q = rr4.m20763q();
        rr4VarM20763q.getClass();
        f67205b = rr4VarM20763q;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return f67205b;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            return rr4.m20764t(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        rr4 rr4Var = (rr4) obj;
        rr4Var.getClass();
        int iMo2278b = rr4Var.mo2278b(null);
        Logger logger = AbstractC0673g.f6073b;
        if (iMo2278b > 4096) {
            iMo2278b = 4096;
        }
        C0672f c0672f = new C0672f(outputStream, iMo2278b);
        rr4Var.m2388m(c0672f);
        if (c0672f.f6071f > 0) {
            c0672f.m2366E();
        }
        return xfa.f68157a;
    }
}
