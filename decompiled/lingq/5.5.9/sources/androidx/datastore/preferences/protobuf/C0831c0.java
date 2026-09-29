package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0831c0<K, V> {

    /* JADX INFO: renamed from: a */
    public final a<K, V> f5823a;

    /* JADX INFO: renamed from: b */
    public final K f5824b = "";

    /* JADX INFO: renamed from: c */
    public final V f5825c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0$a */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final WireFormat$FieldType f5826a;

        /* JADX INFO: renamed from: b */
        public final K f5827b = "";

        /* JADX INFO: renamed from: c */
        public final WireFormat$FieldType f5828c;

        /* JADX INFO: renamed from: d */
        public final V f5829d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
            this.f5826a = wireFormat$FieldType;
            this.f5828c = wireFormat$FieldType2;
            this.f5829d = preferencesProto$Value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0831c0(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, PreferencesProto$Value preferencesProto$Value) {
        this.f5823a = new a<>(wireFormat$FieldType, wireFormat$FieldType2, preferencesProto$Value);
        this.f5825c = preferencesProto$Value;
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> int m3195a(a<K, V> aVar, K k10, V v10) {
        return C0863q.m3419b(aVar.f5828c, 2, v10) + C0863q.m3419b(aVar.f5826a, 1, k10);
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> void m3196b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k10, V v10) throws IOException {
        C0863q.m3425o(codedOutputStream, aVar.f5826a, 1, k10);
        C0863q.m3425o(codedOutputStream, aVar.f5828c, 2, v10);
    }
}
