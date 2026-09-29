package ao;

import dm.C5207g;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import mn.C7646c;
import mo.C7661i;
import p207jn.C6528b;
import p517yn.C10419a;

/* JADX INFO: renamed from: ao.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1269a extends C10419a {

    /* JADX INFO: renamed from: m */
    public static final C1269a f7952m = new C1269a();

    public C1269a() {
        C6993d c6993d = new C6993d();
        C6528b.m13108a(c6993d);
        GeneratedMessageLite.C6985e<ProtoBuf$Package, Integer> c6985e = C6528b.f37172a;
        C5207g.m11110e(c6985e, "packageFqName");
        GeneratedMessageLite.C6985e<ProtoBuf$Constructor, List<ProtoBuf$Annotation>> c6985e2 = C6528b.f37174c;
        C5207g.m11110e(c6985e2, "constructorAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$Class, List<ProtoBuf$Annotation>> c6985e3 = C6528b.f37173b;
        C5207g.m11110e(c6985e3, "classAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$Function, List<ProtoBuf$Annotation>> c6985e4 = C6528b.f37175d;
        C5207g.m11110e(c6985e4, "functionAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$Property, List<ProtoBuf$Annotation>> c6985e5 = C6528b.f37176e;
        C5207g.m11110e(c6985e5, "propertyAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$Property, List<ProtoBuf$Annotation>> c6985e6 = C6528b.f37177f;
        C5207g.m11110e(c6985e6, "propertyGetterAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$Property, List<ProtoBuf$Annotation>> c6985e7 = C6528b.f37178g;
        C5207g.m11110e(c6985e7, "propertySetterAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$EnumEntry, List<ProtoBuf$Annotation>> c6985e8 = C6528b.f37180i;
        C5207g.m11110e(c6985e8, "enumEntryAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$Property, ProtoBuf$Annotation.Argument.Value> c6985e9 = C6528b.f37179h;
        C5207g.m11110e(c6985e9, "compileTimeValue");
        GeneratedMessageLite.C6985e<ProtoBuf$ValueParameter, List<ProtoBuf$Annotation>> c6985e10 = C6528b.f37181j;
        C5207g.m11110e(c6985e10, "parameterAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$Type, List<ProtoBuf$Annotation>> c6985e11 = C6528b.f37182k;
        C5207g.m11110e(c6985e11, "typeAnnotation");
        GeneratedMessageLite.C6985e<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> c6985e12 = C6528b.f37183l;
        C5207g.m11110e(c6985e12, "typeParameterAnnotation");
        super(c6993d, c6985e, c6985e2, c6985e3, c6985e4, c6985e5, c6985e6, c6985e7, c6985e8, c6985e9, c6985e10, c6985e11, c6985e12);
    }

    /* JADX INFO: renamed from: a */
    public static String m4769a(C7646c c7646c) {
        String strM15235f;
        C5207g.m11111f(c7646c, "fqName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C7661i.m15253S2(c7646c.m15214b(), '.', '/'));
        sb2.append('/');
        if (c7646c.m15216d()) {
            strM15235f = "default-package";
        } else {
            strM15235f = c7646c.m15218f().m15235f();
            C5207g.m11110e(strM15235f, "fqName.shortName().asString()");
        }
        sb2.append(strM15235f.concat(".kotlin_builtins"));
        return sb2.toString();
    }
}
