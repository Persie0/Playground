package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0859o extends AbstractC0857n<GeneratedMessageLite.C0814d> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5913a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f5913a = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5913a[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5913a[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5913a[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5913a[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5913a[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5913a[WireFormat$FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5913a[WireFormat$FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5913a[WireFormat$FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5913a[WireFormat$FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5913a[WireFormat$FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5913a[WireFormat$FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5913a[WireFormat$FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5913a[WireFormat$FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5913a[WireFormat$FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5913a[WireFormat$FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5913a[WireFormat$FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f5913a[WireFormat$FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: a */
    public final void mo3408a(Map.Entry entry) {
        ((GeneratedMessageLite.C0814d) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: b */
    public final GeneratedMessageLite.C0815e mo3409b(C0855m c0855m, InterfaceC0848i0 interfaceC0848i0, int i10) {
        c0855m.getClass();
        return c0855m.f5906a.get(new C0855m.a(i10, interfaceC0848i0));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: c */
    public final C0863q<GeneratedMessageLite.C0814d> mo3410c(Object obj) {
        return ((GeneratedMessageLite.AbstractC0813c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: d */
    public final C0863q<GeneratedMessageLite.C0814d> mo3411d(Object obj) {
        GeneratedMessageLite.AbstractC0813c abstractC0813c = (GeneratedMessageLite.AbstractC0813c) obj;
        C0863q<GeneratedMessageLite.C0814d> c0863q = abstractC0813c.extensions;
        if (c0863q.f5920b) {
            abstractC0813c.extensions = c0863q.clone();
        }
        return abstractC0813c.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: e */
    public final boolean mo3412e(InterfaceC0848i0 interfaceC0848i0) {
        return interfaceC0848i0 instanceof GeneratedMessageLite.AbstractC0813c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: f */
    public final void mo3413f(Object obj) {
        C0863q<GeneratedMessageLite.C0814d> c0863q = ((GeneratedMessageLite.AbstractC0813c) obj).extensions;
        if (c0863q.f5920b) {
            return;
        }
        c0863q.f5919a.mo3495g();
        c0863q.f5920b = true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: g */
    public final Object mo3414g(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: h */
    public final void mo3415h(Object obj) throws IOException {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: i */
    public final void mo3416i(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0857n
    /* JADX INFO: renamed from: j */
    public final void mo3417j(Map.Entry entry) throws IOException {
        ((GeneratedMessageLite.C0814d) entry.getKey()).getClass();
        int[] iArr = a.f5913a;
        throw null;
    }
}
