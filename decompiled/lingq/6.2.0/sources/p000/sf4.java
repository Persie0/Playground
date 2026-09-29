package p000;

import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.AbstractC3264d;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sf4 {

    /* JADX INFO: renamed from: a */
    public static final e54 f60791a = r46.m20379d("kotlinx.serialization.json.JsonUnquotedLiteral", sk9.f60959a);

    /* JADX INFO: renamed from: a */
    public static final AbstractC3264d m21334a(Integer num) {
        return new zf4(num, false);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC3264d m21335b(String str) {
        return str == null ? JsonNull.INSTANCE : new zf4(str, true);
    }

    /* JADX INFO: renamed from: c */
    public static final void m21336c(AbstractC3262b abstractC3262b, String str) {
        throw new IllegalArgumentException("Element " + y38.m24933a(abstractC3262b.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: d */
    public static final String m21337d(AbstractC3264d abstractC3264d) {
        abstractC3264d.getClass();
        if (abstractC3264d instanceof JsonNull) {
            return null;
        }
        return abstractC3264d.mo15621d();
    }

    /* JADX INFO: renamed from: e */
    public static final Integer m21338e(AbstractC3264d abstractC3264d) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(m21340g(abstractC3264d));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC3264d m21339f(AbstractC3262b abstractC3262b) {
        AbstractC3264d abstractC3264d = abstractC3262b instanceof AbstractC3264d ? (AbstractC3264d) abstractC3262b : null;
        if (abstractC3264d != null) {
            return abstractC3264d;
        }
        m21336c(abstractC3262b, "JsonPrimitive");
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static final long m21340g(AbstractC3264d abstractC3264d) {
        C3488q8 c3488q8M21988b = te1.m21988b(df4.f35559d, abstractC3264d.mo15621d());
        String str = (String) c3488q8M21988b.f57373g;
        long jM19742j = c3488q8M21988b.m19742j();
        if (c3488q8M21988b.m19739g() == 10) {
            return jM19742j;
        }
        int i = c3488q8M21988b.f57368b;
        int i2 = i > 0 ? i - 1 : i;
        C3488q8.m19714s(c3488q8M21988b, wq1.m24118n("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
