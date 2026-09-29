package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import mn.C7646c;

/* JADX INFO: loaded from: classes2.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");

    private final String desc;
    private final String name;
    private final PrimitiveType primitiveType;
    private final C7646c wrapperFqName;
    private static final Set<C7646c> WRAPPERS_CLASS_NAMES = new HashSet();
    private static final Map<String, JvmPrimitiveType> TYPE_BY_NAME = new HashMap();
    private static final Map<PrimitiveType, JvmPrimitiveType> TYPE_BY_PRIMITIVE_TYPE = new EnumMap(PrimitiveType.class);
    private static final Map<String, JvmPrimitiveType> TYPE_BY_DESC = new HashMap();

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private static /* synthetic */ void $$$reportNull$$$0(int i10) {
        String str;
        int i11;
        Object[] objArr;
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 == 2 && i10 != 4) {
                switch (i10) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        i11 = 2;
                        break;
                    default:
                        i11 = 3;
                        break;
                }
            }
            objArr = new Object[i11];
            switch (i10) {
                case 1:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 10:
                case 11:
                case 12:
                case 13:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
                case 3:
                    objArr[0] = "type";
                    break;
                case 5:
                case 8:
                    objArr[0] = "desc";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[0] = "primitiveType";
                    break;
                case 9:
                    objArr[0] = "wrapperClassName";
                    break;
                default:
                    objArr[0] = "className";
                    break;
            }
            if (i10 == 2 && i10 != 4) {
                switch (i10) {
                    case 10:
                        objArr[1] = "getPrimitiveType";
                        break;
                    case 11:
                        objArr[1] = "getJavaKeywordName";
                        break;
                    case 12:
                        objArr[1] = "getDesc";
                        break;
                    case 13:
                        objArr[1] = "getWrapperFqName";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                        break;
                }
            } else {
                objArr[1] = "get";
            }
            switch (i10) {
                case 1:
                case 3:
                    objArr[2] = "get";
                    break;
                case 2:
                case 4:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                case 5:
                    objArr[2] = "getByDesc";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 9:
                    objArr[2] = "<init>";
                    break;
                default:
                    objArr[2] = "isWrapperClassName";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2 && i10 != 4) {
                switch (i10) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }
        str = "@NotNull method %s.%s must not return null";
        i11 = i10 == 2 ? 2 : 2;
        objArr = new Object[i11];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = "type";
                break;
            case 5:
            case 8:
                objArr[0] = "desc";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "className";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "get";
        } else {
            objArr[1] = "get";
        }
        switch (i10) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        String str3 = String.format(str, objArr);
        if (i10 == 2) {
        }
        throw new IllegalStateException(str3);
    }

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            WRAPPERS_CLASS_NAMES.add(jvmPrimitiveType.getWrapperFqName());
            TYPE_BY_NAME.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            TYPE_BY_PRIMITIVE_TYPE.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            TYPE_BY_DESC.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, String str2, String str3) {
        if (primitiveType == null) {
            $$$reportNull$$$0(6);
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        if (str2 == null) {
            $$$reportNull$$$0(8);
        }
        if (str3 == null) {
            $$$reportNull$$$0(9);
        }
        this.primitiveType = primitiveType;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new C7646c(str3);
    }

    public static JvmPrimitiveType get(String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        JvmPrimitiveType jvmPrimitiveType = TYPE_BY_NAME.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError(C0204c.m852k("Non-primitive type name passed: ", str));
    }

    public static JvmPrimitiveType get(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(3);
        }
        JvmPrimitiveType jvmPrimitiveType = TYPE_BY_PRIMITIVE_TYPE.get(primitiveType);
        if (jvmPrimitiveType == null) {
            $$$reportNull$$$0(4);
        }
        return jvmPrimitiveType;
    }

    public String getDesc() {
        String str = this.desc;
        if (str == null) {
            $$$reportNull$$$0(12);
        }
        return str;
    }

    public String getJavaKeywordName() {
        String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        return str;
    }

    public PrimitiveType getPrimitiveType() {
        PrimitiveType primitiveType = this.primitiveType;
        if (primitiveType == null) {
            $$$reportNull$$$0(10);
        }
        return primitiveType;
    }

    public C7646c getWrapperFqName() {
        C7646c c7646c = this.wrapperFqName;
        if (c7646c == null) {
            $$$reportNull$$$0(13);
        }
        return c7646c;
    }
}
