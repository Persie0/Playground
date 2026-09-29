package hn;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: hn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6083c {

    /* JADX INFO: renamed from: e */
    public static final C6083c f35819e = new C6083c(null, false);

    /* JADX INFO: renamed from: a */
    public final NullabilityQualifier f35820a;

    /* JADX INFO: renamed from: b */
    public final MutabilityQualifier f35821b;

    /* JADX INFO: renamed from: c */
    public final boolean f35822c;

    /* JADX INFO: renamed from: d */
    public final boolean f35823d;

    public C6083c(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11) {
        this.f35820a = nullabilityQualifier;
        this.f35821b = mutabilityQualifier;
        this.f35822c = z10;
        this.f35823d = z11;
    }

    public /* synthetic */ C6083c(NullabilityQualifier nullabilityQualifier, boolean z10) {
        this(nullabilityQualifier, null, z10, false);
    }
}
