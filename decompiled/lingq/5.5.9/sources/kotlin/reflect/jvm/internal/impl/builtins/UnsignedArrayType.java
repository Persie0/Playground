package kotlin.reflect.jvm.internal.impl.builtins;

import dm.C5207g;
import mn.C7645b;
import mn.C7648e;

/* JADX INFO: loaded from: classes2.dex */
public enum UnsignedArrayType {
    UBYTEARRAY(C7645b.m15201e("kotlin/UByteArray")),
    USHORTARRAY(C7645b.m15201e("kotlin/UShortArray")),
    UINTARRAY(C7645b.m15201e("kotlin/UIntArray")),
    ULONGARRAY(C7645b.m15201e("kotlin/ULongArray"));

    private final C7645b classId;
    private final C7648e typeName;

    UnsignedArrayType(C7645b c7645b) {
        this.classId = c7645b;
        C7648e c7648eM15210j = c7645b.m15210j();
        C5207g.m11110e(c7648eM15210j, "classId.shortClassName");
        this.typeName = c7648eM15210j;
    }

    public final C7648e getTypeName() {
        return this.typeName;
    }
}
