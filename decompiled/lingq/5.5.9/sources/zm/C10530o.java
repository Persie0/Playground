package zm;

import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import mn.C7646c;
import sl.C9069b;

/* JADX INFO: renamed from: zm.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C10530o {

    /* JADX INFO: renamed from: a */
    public static final C7646c f52524a;

    /* JADX INFO: renamed from: b */
    public static final NullabilityAnnotationStatesImpl f52525b;

    /* JADX INFO: renamed from: c */
    public static final C10531p f52526c;

    static {
        C7646c c7646c = new C7646c("org.jspecify.nullness");
        f52524a = c7646c;
        C7646c c7646c2 = new C7646c("org.checkerframework.checker.nullness.compatqual");
        C7646c c7646c3 = new C7646c("org.jetbrains.annotations");
        C10531p c10531p = C10531p.f52527d;
        C7646c c7646c4 = new C7646c("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        C9069b c9069b = new C9069b(8, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f52525b = new NullabilityAnnotationStatesImpl(C6753d.m13462O0(new Pair(c7646c3, c10531p), new Pair(new C7646c("androidx.annotation"), c10531p), new Pair(new C7646c("android.support.annotation"), c10531p), new Pair(new C7646c("android.annotation"), c10531p), new Pair(new C7646c("com.android.annotations"), c10531p), new Pair(new C7646c("org.eclipse.jdt.annotation"), c10531p), new Pair(new C7646c("org.checkerframework.checker.nullness.qual"), c10531p), new Pair(c7646c2, c10531p), new Pair(new C7646c("javax.annotation"), c10531p), new Pair(new C7646c("edu.umd.cs.findbugs.annotations"), c10531p), new Pair(new C7646c("io.reactivex.annotations"), c10531p), new Pair(c7646c4, new C10531p(reportLevel, 4)), new Pair(new C7646c("androidx.annotation.RecentlyNonNull"), new C10531p(reportLevel, 4)), new Pair(new C7646c("lombok"), c10531p), new Pair(c7646c, new C10531p(reportLevel, c9069b, reportLevel2)), new Pair(new C7646c("io.reactivex.rxjava3.annotations"), new C10531p(reportLevel, new C9069b(8, 0), reportLevel2))));
        f52526c = new C10531p(reportLevel, 4);
    }
}
