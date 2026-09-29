package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6905e extends C6901a.a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6901a.d f38933b;

    public C6905e(C6901a.d dVar) {
        this.f38933b = dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.C6901a.a
    /* JADX INFO: renamed from: f */
    public final void mo13779f(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
        }
        C6901a.this.f38921d = strArr;
    }
}
