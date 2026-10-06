package p000;

/* JADX INFO: renamed from: uv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager$requestLoop$2", m18657c = "VirtualCameraManager.kt", m18658d = "invokeSuspend", m18659e = {98, 109, 129, 174, 183, 195})
final class C1052uv extends oml implements onm {

    /* JADX INFO: renamed from: a */
    Object f47776a;

    /* JADX INFO: renamed from: b */
    Object f47777b;

    /* JADX INFO: renamed from: c */
    int f47778c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ drj f47779d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ Object f47780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052uv(drj drjVar, ols olsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(2, olsVar);
        this.f47779d = drjVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((C1052uv) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[LOOP:1: B:33:0x00eb->B:140:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, uk] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v61, types: [drj] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x02e2 -> B:11:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e0 -> B:12:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x016b -> B:12:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0193 -> B:12:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0211 -> B:12:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final java.lang.Object mo561b(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1052uv.mo561b(java.lang.Object):java.lang.Object");
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        C1052uv c1052uv = new C1052uv(this.f47779d, olsVar, null, null, null);
        c1052uv.f47780e = obj;
        return c1052uv;
    }
}
