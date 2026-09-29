package in;

import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5206f;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.C7076b;
import p003a2.C0009a;

/* JADX INFO: renamed from: in.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C6365i {

    /* JADX INFO: renamed from: a */
    public static final C6365i f36754a = new C6365i();

    /* JADX INFO: renamed from: in.i$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36755a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
            iArr[PrimitiveType.INT.ordinal()] = 5;
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            iArr[PrimitiveType.LONG.ordinal()] = 7;
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            f36755a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6364h m12991a(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        AbstractC6364h bVar;
        C5207g.m11111f(str, "representation");
        char cCharAt = str.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i10];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (jvmPrimitiveType != null) {
            return new AbstractC6364h.c(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new AbstractC6364h.c(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
            bVar = new AbstractC6364h.a(m12991a(strSubstring));
        } else {
            if (cCharAt == 'L' && str.length() > 0) {
                C5206f.m10985F0(str.charAt(C7076b.m14281a3(str)), ';', false);
            }
            String strSubstring2 = str.substring(1, str.length() - 1);
            C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            bVar = new AbstractC6364h.b(strSubstring2);
        }
        return bVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static String m12992e(AbstractC6364h abstractC6364h) {
        String desc;
        C5207g.m11111f(abstractC6364h, "type");
        if (abstractC6364h instanceof AbstractC6364h.a) {
            return "[" + m12992e(((AbstractC6364h.a) abstractC6364h).f36751i);
        }
        if (!(abstractC6364h instanceof AbstractC6364h.c)) {
            if (abstractC6364h instanceof AbstractC6364h.b) {
                return C0009a.m22j(new StringBuilder("L"), ((AbstractC6364h.b) abstractC6364h).f36752i, ';');
            }
            throw new NoWhenBranchMatchedException();
        }
        JvmPrimitiveType jvmPrimitiveType = ((AbstractC6364h.c) abstractC6364h).f36753i;
        if (jvmPrimitiveType != null && (desc = jvmPrimitiveType.getDesc()) != null) {
            return desc;
        }
        return "V";
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC6364h.b m12993b(String str) {
        C5207g.m11111f(str, "internalName");
        return new AbstractC6364h.b(str);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final AbstractC6364h.c m12994c(PrimitiveType primitiveType) {
        switch (a.f36755a[primitiveType.ordinal()]) {
            case 1:
                return AbstractC6364h.f36743a;
            case 2:
                return AbstractC6364h.f36744b;
            case 3:
                return AbstractC6364h.f36745c;
            case 4:
                return AbstractC6364h.f36746d;
            case 5:
                return AbstractC6364h.f36747e;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC6364h.f36748f;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC6364h.f36749g;
            case 8:
                return AbstractC6364h.f36750h;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC6364h.b m12995d() {
        return new AbstractC6364h.b("java/lang/Class");
    }

    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ String m12996f(Object obj) {
        return m12992e((AbstractC6364h) obj);
    }
}
