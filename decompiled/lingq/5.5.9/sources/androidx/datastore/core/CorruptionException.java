package androidx.datastore.core;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Landroidx/datastore/core/CorruptionException;", "Ljava/io/IOException;", "datastore-core"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class CorruptionException extends IOException {
    public CorruptionException(InvalidProtocolBufferException invalidProtocolBufferException) {
        super("Unable to parse preferences proto.", invalidProtocolBufferException);
    }

    public CorruptionException(String str) {
        super(str, null);
    }
}
