package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import cm.InterfaceC2052l;
import dm.C5207g;
import hn.C6083c;
import hn.C6087g;
import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a */
    public static final C6083c f38840a = new C6083c(NullabilityQualifier.NULLABLE, false);

    /* JADX INFO: renamed from: b */
    public static final C6083c f38841b;

    /* JADX INFO: renamed from: c */
    public static final C6083c f38842c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f38843d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f38841b = new C6083c(nullabilityQualifier, false);
        f38842c = new C6083c(nullabilityQualifier, true);
        final String strConcat = "java/lang/".concat("Object");
        final String strConcat2 = "java/util/function/".concat("Predicate");
        final String strConcat3 = "java/util/function/".concat("Function");
        final String strConcat4 = "java/util/function/".concat("Consumer");
        final String strConcat5 = "java/util/function/".concat("BiFunction");
        final String strConcat6 = "java/util/function/".concat("BiConsumer");
        final String strConcat7 = "java/util/function/".concat("UnaryOperator");
        final String strConcat8 = "java/util/".concat("stream/Stream");
        final String strConcat9 = "java/util/".concat("Optional");
        C6087g c6087g = new C6087g();
        new C6087g.a(c6087g, "java/util/".concat("Iterator")).m12519a("forEachRemaining", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                c10636a2.m12520a(strConcat4, c6083c, c6083c);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, "java/lang/".concat("Iterable")).m12519a("spliterator", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$2$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                String strConcat10 = "java/util/".concat("Spliterator");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                c10636a2.m12521b(strConcat10, c6083c, c6083c);
                return C9072e.f47360a;
            }
        });
        C6087g.a aVar = new C6087g.a(c6087g, "java/util/".concat("Collection"));
        aVar.m12519a("removeIf", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                c10636a2.m12520a(strConcat2, c6083c, c6083c);
                c10636a2.m12522c(JvmPrimitiveType.BOOLEAN);
                return C9072e.f47360a;
            }
        });
        aVar.m12519a("stream", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                c10636a2.m12521b(strConcat8, c6083c, c6083c);
                return C9072e.f47360a;
            }
        });
        aVar.m12519a("parallelStream", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                c10636a2.m12521b(strConcat8, c6083c, c6083c);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, "java/util/".concat("List")).m12519a("replaceAll", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                c10636a2.m12520a(strConcat7, c6083c, c6083c);
                return C9072e.f47360a;
            }
        });
        C6087g.a aVar2 = new C6087g.a(c6087g, "java/util/".concat("Map"));
        aVar2.m12519a("forEach", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                c10636a2.m12520a(strConcat6, c6083c, c6083c, c6083c);
                return C9072e.f47360a;
            }
        });
        aVar2.m12519a("putIfAbsent", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12521b(str, PredefinedEnhancementInfoKt.f38840a);
                return C9072e.f47360a;
            }
        });
        aVar2.m12519a("replace", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12521b(str, PredefinedEnhancementInfoKt.f38840a);
                return C9072e.f47360a;
            }
        });
        aVar2.m12519a("replace", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12522c(JvmPrimitiveType.BOOLEAN);
                return C9072e.f47360a;
            }
        });
        aVar2.m12519a("replaceAll", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                c10636a2.m12520a(strConcat5, c6083c, c6083c, c6083c, c6083c);
                return C9072e.f47360a;
            }
        });
        aVar2.m12519a("compute", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                C6083c c6083c2 = PredefinedEnhancementInfoKt.f38840a;
                c10636a2.m12520a(strConcat5, c6083c, c6083c, c6083c2, c6083c2);
                c10636a2.m12521b(str, c6083c2);
                return C9072e.f47360a;
            }
        });
        aVar2.m12519a("computeIfAbsent", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12520a(strConcat3, c6083c, c6083c, c6083c);
                c10636a2.m12521b(str, c6083c);
                return C9072e.f47360a;
            }
        });
        aVar2.m12519a("computeIfPresent", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                C6083c c6083c2 = PredefinedEnhancementInfoKt.f38840a;
                c10636a2.m12520a(strConcat5, c6083c, c6083c, PredefinedEnhancementInfoKt.f38842c, c6083c2);
                c10636a2.m12521b(str, c6083c2);
                return C9072e.f47360a;
            }
        });
        aVar2.m12519a("merge", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                C6083c c6083c2 = PredefinedEnhancementInfoKt.f38842c;
                c10636a2.m12520a(str, c6083c2);
                C6083c c6083c3 = PredefinedEnhancementInfoKt.f38840a;
                c10636a2.m12520a(strConcat5, c6083c, c6083c2, c6083c2, c6083c3);
                c10636a2.m12521b(str, c6083c3);
                return C9072e.f47360a;
            }
        });
        C6087g.a aVar3 = new C6087g.a(c6087g, strConcat9);
        aVar3.m12519a("empty", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                c10636a2.m12521b(strConcat9, PredefinedEnhancementInfoKt.f38841b, PredefinedEnhancementInfoKt.f38842c);
                return C9072e.f47360a;
            }
        });
        aVar3.m12519a("of", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38842c;
                c10636a2.m12520a(strConcat, c6083c);
                c10636a2.m12521b(strConcat9, PredefinedEnhancementInfoKt.f38841b, c6083c);
                return C9072e.f47360a;
            }
        });
        aVar3.m12519a("ofNullable", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                c10636a2.m12520a(strConcat, PredefinedEnhancementInfoKt.f38840a);
                c10636a2.m12521b(strConcat9, PredefinedEnhancementInfoKt.f38841b, PredefinedEnhancementInfoKt.f38842c);
                return C9072e.f47360a;
            }
        });
        aVar3.m12519a("get", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                c10636a2.m12521b(strConcat, PredefinedEnhancementInfoKt.f38842c);
                return C9072e.f47360a;
            }
        });
        aVar3.m12519a("ifPresent", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                c10636a2.m12520a(strConcat4, PredefinedEnhancementInfoKt.f38841b, PredefinedEnhancementInfoKt.f38842c);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, "java/lang/".concat("ref/Reference")).m12519a("get", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$7$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                c10636a2.m12521b(strConcat, PredefinedEnhancementInfoKt.f38840a);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, strConcat2).m12519a("test", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$8$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                c10636a2.m12520a(strConcat, PredefinedEnhancementInfoKt.f38841b);
                c10636a2.m12522c(JvmPrimitiveType.BOOLEAN);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, "java/util/function/".concat("BiPredicate")).m12519a("test", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$9$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12522c(JvmPrimitiveType.BOOLEAN);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, strConcat4).m12519a("accept", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$10$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                c10636a2.m12520a(strConcat, PredefinedEnhancementInfoKt.f38841b);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, strConcat6).m12519a("accept", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$11$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12520a(str, c6083c);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, strConcat3).m12519a("apply", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$12$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12521b(str, c6083c);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, strConcat5).m12519a("apply", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$13$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                C6083c c6083c = PredefinedEnhancementInfoKt.f38841b;
                String str = strConcat;
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12520a(str, c6083c);
                c10636a2.m12521b(str, c6083c);
                return C9072e.f47360a;
            }
        });
        new C6087g.a(c6087g, "java/util/function/".concat("Supplier")).m12519a("get", new InterfaceC2052l<C6087g.a.C10636a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$14$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C6087g.a.C10636a c10636a) {
                C6087g.a.C10636a c10636a2 = c10636a;
                C5207g.m11111f(c10636a2, "$this$function");
                c10636a2.m12521b(strConcat, PredefinedEnhancementInfoKt.f38841b);
                return C9072e.f47360a;
            }
        });
        f38843d = c6087g.f35829a;
    }
}
