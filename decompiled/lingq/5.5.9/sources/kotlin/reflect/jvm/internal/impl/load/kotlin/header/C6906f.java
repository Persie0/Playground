package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6906f extends C6901a.a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6901a.d f38934b;

    public C6906f(C6901a.d dVar) {
        this.f38934b = dVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.C6901a.a
    /* JADX INFO: renamed from: f */
    public final void mo13779f(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
        }
        C6901a.this.f38922e = strArr;
    }
}
