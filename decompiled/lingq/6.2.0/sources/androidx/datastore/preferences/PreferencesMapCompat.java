package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesMapCompat {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(y52 y52Var) {
            this();
        }

        public final PreferencesProto.PreferenceMap readFrom(InputStream inputStream) throws IOException {
            inputStream.getClass();
            try {
                PreferencesProto.PreferenceMap from = PreferencesProto.PreferenceMap.parseFrom(inputStream);
                from.getClass();
                return from;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }

        private Companion() {
        }
    }
}
