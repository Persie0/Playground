package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.C6995f;

/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$Visibility implements C6995f.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    private static C6995f.b<ProtoBuf$Visibility> internalValueMap = new C6995f.b<ProtoBuf$Visibility>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
        /* JADX INFO: renamed from: a */
        public final C6995f.a mo13786a(int i10) {
            return ProtoBuf$Visibility.valueOf(i10);
        }
    };
    private final int value;

    ProtoBuf$Visibility(int i10, int i11) {
        this.value = i11;
    }

    public static ProtoBuf$Visibility valueOf(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
    public final int getNumber() {
        return this.value;
    }
}
