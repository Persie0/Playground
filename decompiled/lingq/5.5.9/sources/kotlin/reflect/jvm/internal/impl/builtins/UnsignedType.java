package kotlin.reflect.jvm.internal.impl.builtins;

import dm.C5207g;
import mn.C7645b;
import mn.C7648e;

/* JADX INFO: loaded from: classes2.dex */
public enum UnsignedType {
    UBYTE(C7645b.m15201e("kotlin/UByte")),
    USHORT(C7645b.m15201e("kotlin/UShort")),
    UINT(C7645b.m15201e("kotlin/UInt")),
    ULONG(C7645b.m15201e("kotlin/ULong"));

    private final C7645b arrayClassId;
    private final C7645b classId;
    private final C7648e typeName;

    UnsignedType(C7645b c7645b) {
        this.classId = c7645b;
        C7648e c7648eM15210j = c7645b.m15210j();
        C5207g.m11110e(c7648eM15210j, "classId.shortClassName");
        this.typeName = c7648eM15210j;
        this.arrayClassId = new C7645b(c7645b.m15208h(), C7648e.m15232l(c7648eM15210j.m15235f() + "Array"));
    }

    public final C7645b getArrayClassId() {
        return this.arrayClassId;
    }

    public final C7645b getClassId() {
        return this.classId;
    }

    public final C7648e getTypeName() {
        return this.typeName;
    }
}
