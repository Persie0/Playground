package zm;

import hn.C6085e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import mn.C7646c;
import p260m8.C7499b;
import p385sf.C9000b;

/* JADX INFO: renamed from: zm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10516a {

    /* JADX INFO: renamed from: a */
    public static final C7646c f52497a = new C7646c("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: b */
    public static final C7646c f52498b = new C7646c("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: c */
    public static final C7646c f52499c = new C7646c("javax.annotation.meta.TypeQualifierDefault");

    /* JADX INFO: renamed from: d */
    public static final C7646c f52500d = new C7646c("kotlin.annotations.jvm.UnderMigration");

    /* JADX INFO: renamed from: e */
    public static final List<AnnotationQualifierApplicabilityType> f52501e;

    /* JADX INFO: renamed from: f */
    public static final Map<C7646c, C10526k> f52502f;

    /* JADX INFO: renamed from: g */
    public static final LinkedHashMap f52503g;

    /* JADX INFO: renamed from: h */
    public static final Set<C7646c> f52504h;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> listM17252r = C9000b.m17252r(AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f52501e = listM17252r;
        C7646c c7646c = C10535t.f52553c;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<C7646c, C10526k> mapM14943h0 = C7499b.m14943h0(new Pair(c7646c, new C10526k(new C6085e(nullabilityQualifier, false), listM17252r, false)));
        f52502f = mapM14943h0;
        f52503g = C6753d.m13463P0(C6753d.m13462O0(new Pair(new C7646c("javax.annotation.ParametersAreNullableByDefault"), new C10526k(new C6085e(NullabilityQualifier.NULLABLE, false), C9000b.m17251q(annotationQualifierApplicabilityType))), new Pair(new C7646c("javax.annotation.ParametersAreNonnullByDefault"), new C10526k(new C6085e(nullabilityQualifier, false), C9000b.m17251q(annotationQualifierApplicabilityType)))), mapM14943h0);
        f52504h = C7499b.m14973x0(C10535t.f52555e, C10535t.f52556f);
    }
}
