package hn;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import mn.C7646c;
import zm.C10534s;

/* JADX INFO: renamed from: hn.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C6090j {

    /* JADX INFO: renamed from: a */
    public static final C6082b f35841a;

    /* JADX INFO: renamed from: b */
    public static final C6082b f35842b;

    /* JADX INFO: renamed from: hn.j$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35843a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            iArr[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            iArr[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            f35843a = iArr;
        }
    }

    static {
        C7646c c7646c = C10534s.f52549p;
        C5207g.m11110e(c7646c, "ENHANCED_NULLABILITY_ANNOTATION");
        f35841a = new C6082b(c7646c);
        C7646c c7646c2 = C10534s.f52550q;
        C5207g.m11110e(c7646c2, "ENHANCED_MUTABILITY_ANNOTATION");
        f35842b = new C6082b(c7646c2);
    }
}
