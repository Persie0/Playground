package p189j3;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.AbstractC0845h;
import androidx.datastore.preferences.protobuf.C0831c0;
import androidx.datastore.preferences.protobuf.C0855m;
import androidx.datastore.preferences.protobuf.C0872u0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InterfaceC0850j0;
import androidx.datastore.preferences.protobuf.InterfaceC0864q0;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: j3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6406b extends GeneratedMessageLite<C6406b, a> implements InterfaceC0850j0 {
    private static final C6406b DEFAULT_INSTANCE;
    private static volatile InterfaceC0864q0<C6406b> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.f5814b;

    /* JADX INFO: renamed from: j3.b$a */
    public static final class a extends GeneratedMessageLite.AbstractC0811a<C6406b, a> implements InterfaceC0850j0 {
        public a() {
            super(C6406b.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: j3.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C0831c0<String, PreferencesProto$Value> f36870a = new C0831c0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, PreferencesProto$Value.m3031y());
    }

    static {
        C6406b c6406b = new C6406b();
        DEFAULT_INSTANCE = c6406b;
        GeneratedMessageLite.m3126o(C6406b.class, c6406b);
    }

    /* JADX INFO: renamed from: q */
    public static MapFieldLite m13031q(C6406b c6406b) {
        MapFieldLite<String, PreferencesProto$Value> mapFieldLite = c6406b.preferences_;
        if (!mapFieldLite.f5815a) {
            c6406b.preferences_ = mapFieldLite.m3151d();
        }
        return c6406b.preferences_;
    }

    /* JADX INFO: renamed from: s */
    public static a m13032s() {
        C6406b c6406b = DEFAULT_INSTANCE;
        c6406b.getClass();
        return (a) ((GeneratedMessageLite.AbstractC0811a) c6406b.mo3038k(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    /* JADX INFO: renamed from: t */
    public static C6406b m13033t(FileInputStream fileInputStream) throws IOException {
        GeneratedMessageLite generatedMessageLiteM3125n = GeneratedMessageLite.m3125n(DEFAULT_INSTANCE, new AbstractC0845h.b(fileInputStream), C0855m.m3406a());
        if (generatedMessageLiteM3125n.mo3128b()) {
            return (C6406b) generatedMessageLiteM3125n;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: k */
    public final Object mo3038k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C6405a.f36869a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6406b();
            case 2:
                return new a();
            case 3:
                return new C0872u0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f36870a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0864q0<C6406b> c0812b = PARSER;
                if (c0812b == null) {
                    synchronized (C6406b.class) {
                        c0812b = PARSER;
                        if (c0812b == null) {
                            c0812b = new GeneratedMessageLite.C0812b<>(DEFAULT_INSTANCE);
                            PARSER = c0812b;
                        }
                        break;
                    }
                }
                return c0812b;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: r */
    public final Map<String, PreferencesProto$Value> m13034r() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
