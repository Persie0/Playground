package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.C6995f;

/* JADX INFO: loaded from: classes2.dex */
public enum ProtoBuf$MemberKind implements C6995f.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    private static C6995f.b<ProtoBuf$MemberKind> internalValueMap = new C6995f.b<ProtoBuf$MemberKind>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
        /* JADX INFO: renamed from: a */
        public final C6995f.a mo13786a(int i10) {
            return ProtoBuf$MemberKind.valueOf(i10);
        }
    };
    private final int value;

    ProtoBuf$MemberKind(int i10, int i11) {
        this.value = i11;
    }

    public static ProtoBuf$MemberKind valueOf(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
    public final int getNumber() {
        return this.value;
    }
}
