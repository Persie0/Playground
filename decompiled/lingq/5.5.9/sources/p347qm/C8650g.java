package p347qm;

import dm.C5207g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6899b;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import mn.C7647d;
import p385sf.C9000b;
import tl.C9327o;
import tl.C9338z;

/* JADX INFO: renamed from: qm.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C8650g {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f46219a = C9338z.m17690M0(C6899b.m13776d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* JADX INFO: renamed from: b */
    public static final LinkedHashSet f46220b;

    /* JADX INFO: renamed from: c */
    public static final LinkedHashSet f46221c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f46222d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashSet f46223e;

    /* JADX INFO: renamed from: f */
    public static final LinkedHashSet f46224f;

    static {
        List<JvmPrimitiveType> listM17252r = C9000b.m17252r(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listM17252r) {
            String strM15235f = jvmPrimitiveType.getWrapperFqName().m15218f().m15235f();
            C5207g.m11110e(strM15235f, "it.wrapperFqName.shortName().asString()");
            C9327o.m17684D(C6899b.m13775c(strM15235f, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()), linkedHashSet);
        }
        f46220b = C9338z.m17691N0(C9338z.m17691N0(C9338z.m17691N0(C9338z.m17691N0(C9338z.m17691N0(C9338z.m17691N0(linkedHashSet, C6899b.m13776d("List", "sort(Ljava/util/Comparator;)V")), C6899b.m13775c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C6899b.m13775c("Double", "isInfinite()Z", "isNaN()Z")), C6899b.m13775c("Float", "isInfinite()Z", "isNaN()Z")), C6899b.m13775c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C6899b.m13775c("CharSequence", "isEmpty()Z"));
        f46221c = C9338z.m17691N0(C9338z.m17691N0(C9338z.m17691N0(C9338z.m17691N0(C9338z.m17691N0(C9338z.m17691N0(C6899b.m13775c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C6899b.m13776d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C6899b.m13775c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C6899b.m13775c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C6899b.m13776d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C6899b.m13776d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), C6899b.m13776d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f46222d = C9338z.m17691N0(C9338z.m17691N0(C6899b.m13776d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C6899b.m13776d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), C6899b.m13776d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List listM17252r2 = C9000b.m17252r(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listM17252r2.iterator();
        while (it.hasNext()) {
            String strM15235f2 = ((JvmPrimitiveType) it.next()).getWrapperFqName().m15218f().m15235f();
            C5207g.m11110e(strM15235f2, "it.wrapperFqName.shortName().asString()");
            String[] strArrM13773a = C6899b.m13773a("Ljava/lang/String;");
            C9327o.m17684D(C6899b.m13775c(strM15235f2, (String[]) Arrays.copyOf(strArrM13773a, strArrM13773a.length)), linkedHashSet2);
        }
        String[] strArrM13773a2 = C6899b.m13773a("D");
        LinkedHashSet linkedHashSetM17691N0 = C9338z.m17691N0(linkedHashSet2, C6899b.m13775c("Float", (String[]) Arrays.copyOf(strArrM13773a2, strArrM13773a2.length)));
        String[] strArrM13773a3 = C6899b.m13773a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f46223e = C9338z.m17691N0(linkedHashSetM17691N0, C6899b.m13775c("String", (String[]) Arrays.copyOf(strArrM13773a3, strArrM13773a3.length)));
        String[] strArrM13773a4 = C6899b.m13773a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f46224f = C6899b.m13775c("Throwable", (String[]) Arrays.copyOf(strArrM13773a4, strArrM13773a4.length));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16870a(C7647d c7647d) {
        if (C5207g.m11106a(c7647d, C6797e.a.f38384g)) {
            return true;
        }
        return C6797e.a.f38380c0.get(c7647d) != null;
    }
}
