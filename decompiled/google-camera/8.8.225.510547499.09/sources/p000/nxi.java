package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum nxi {
    DOUBLE(0, 1, nyd.DOUBLE),
    FLOAT(1, 1, nyd.FLOAT),
    INT64(2, 1, nyd.LONG),
    UINT64(3, 1, nyd.LONG),
    INT32(4, 1, nyd.INT),
    FIXED64(5, 1, nyd.LONG),
    FIXED32(6, 1, nyd.INT),
    BOOL(7, 1, nyd.BOOLEAN),
    STRING(8, 1, nyd.STRING),
    MESSAGE(9, 1, nyd.MESSAGE),
    BYTES(10, 1, nyd.BYTE_STRING),
    UINT32(11, 1, nyd.INT),
    ENUM(12, 1, nyd.ENUM),
    SFIXED32(13, 1, nyd.INT),
    f44955o(14, 1, nyd.LONG),
    SINT32(15, 1, nyd.INT),
    SINT64(16, 1, nyd.LONG),
    GROUP(17, 1, nyd.MESSAGE),
    DOUBLE_LIST(18, 2, nyd.DOUBLE),
    FLOAT_LIST(19, 2, nyd.FLOAT),
    INT64_LIST(20, 2, nyd.LONG),
    UINT64_LIST(21, 2, nyd.LONG),
    INT32_LIST(22, 2, nyd.INT),
    FIXED64_LIST(23, 2, nyd.LONG),
    FIXED32_LIST(24, 2, nyd.INT),
    BOOL_LIST(25, 2, nyd.BOOLEAN),
    STRING_LIST(26, 2, nyd.STRING),
    MESSAGE_LIST(27, 2, nyd.MESSAGE),
    BYTES_LIST(28, 2, nyd.BYTE_STRING),
    UINT32_LIST(29, 2, nyd.INT),
    ENUM_LIST(30, 2, nyd.ENUM),
    SFIXED32_LIST(31, 2, nyd.INT),
    f44920G(32, 2, nyd.LONG),
    SINT32_LIST(33, 2, nyd.INT),
    SINT64_LIST(34, 2, nyd.LONG),
    DOUBLE_LIST_PACKED(35, 3, nyd.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, nyd.FLOAT),
    INT64_LIST_PACKED(37, 3, nyd.LONG),
    UINT64_LIST_PACKED(38, 3, nyd.LONG),
    INT32_LIST_PACKED(39, 3, nyd.INT),
    FIXED64_LIST_PACKED(40, 3, nyd.LONG),
    FIXED32_LIST_PACKED(41, 3, nyd.INT),
    BOOL_LIST_PACKED(42, 3, nyd.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, nyd.INT),
    ENUM_LIST_PACKED(44, 3, nyd.ENUM),
    SFIXED32_LIST_PACKED(45, 3, nyd.INT),
    SFIXED64_LIST_PACKED(46, 3, nyd.LONG),
    SINT32_LIST_PACKED(47, 3, nyd.INT),
    SINT64_LIST_PACKED(48, 3, nyd.LONG),
    GROUP_LIST(49, 2, nyd.MESSAGE),
    MAP(50, 4, nyd.VOID);


    /* JADX INFO: renamed from: aa */
    private static final nxi[] f44940aa;

    /* JADX INFO: renamed from: Z */
    public final int f44967Z;

    static {
        nxi[] nxiVarArrValues = values();
        f44940aa = new nxi[nxiVarArrValues.length];
        for (nxi nxiVar : nxiVarArrValues) {
            f44940aa[nxiVar.f44967Z] = nxiVar;
        }
    }

    nxi(int i, int i2, nyd nydVar) {
        this.f44967Z = i;
        nyd nydVar2 = nyd.VOID;
        switch (i2 - 1) {
            case 1:
            case 3:
                Class cls = nydVar.f45015k;
                break;
        }
        if (i2 == 1) {
            nydVar.ordinal();
        }
    }
}
