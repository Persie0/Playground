package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6902b extends C6901a.a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6901a.b f38930b;

    public C6902b(C6901a.b bVar) {
        this.f38930b = bVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.C6901a.a
    /* JADX INFO: renamed from: f */
    public final void mo13779f(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
        }
        C6901a.this.f38921d = strArr;
    }
}
