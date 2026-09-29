package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6904d extends C6901a.a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6901a.c f38932b;

    public C6904d(C6901a.c cVar) {
        this.f38932b = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.C6901a.a
    /* JADX INFO: renamed from: f */
    public final void mo13779f(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
        }
        C6901a.this.f38925h = strArr;
    }
}
