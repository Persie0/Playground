package com.lingq.core.data.repository;

import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.network.api.result.ResultLesson;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl$storeLessonData$2", m4291f = "LessonRepositoryImpl.kt", m4292l = {381, 383, 386, 403, 411, 415, 422, 431, 439, 442, 445, 449}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonRepositoryImpl$storeLessonData$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ String f15498H;

    /* JADX INFO: renamed from: a */
    public LessonEntity f15499a;

    /* JADX INFO: renamed from: b */
    public Locale f15500b;

    /* JADX INFO: renamed from: c */
    public List f15501c;

    /* JADX INFO: renamed from: d */
    public List f15502d;

    /* JADX INFO: renamed from: e */
    public C1295k f15503e;

    /* JADX INFO: renamed from: f */
    public Iterator f15504f;

    /* JADX INFO: renamed from: g */
    public int f15505g;

    /* JADX INFO: renamed from: h */
    public int f15506h;

    /* JADX INFO: renamed from: i */
    public int f15507i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ResultLesson f15508j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1295k f15509k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f15510l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$storeLessonData$2(ResultLesson resultLesson, C1295k c1295k, int i, String str, Continuation continuation) {
        super(1, continuation);
        this.f15508j = resultLesson;
        this.f15509k = c1295k;
        this.f15510l = i;
        this.f15498H = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonRepositoryImpl$storeLessonData$2(this.f15508j, this.f15509k, this.f15510l, this.f15498H, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonRepositoryImpl$storeLessonData$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0316  */
    /* JADX WARN: Code duplicated, block: B:104:0x0330  */
    /* JADX WARN: Code duplicated, block: B:106:0x0344  */
    /* JADX WARN: Code duplicated, block: B:109:0x034e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0358  */
    /* JADX WARN: Code duplicated, block: B:115:0x0371 A[LOOP:4: B:110:0x0352->B:115:0x0371, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x036a A[EDGE_INSN: B:169:0x036a->B:114:0x036a BREAK  A[LOOP:4: B:110:0x0352->B:115:0x0371], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0292  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e5 A[LOOP:2: B:94:0x02df->B:96:0x02e5, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o7b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [un0] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Locale] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v42, types: [com.lingq.core.data.repository.k, java.util.Iterator, java.util.List, java.util.Locale] */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44, types: [com.lingq.core.data.repository.k, java.util.Iterator, java.util.List, java.util.Locale] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x03a2 -> B:12:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.LessonRepositoryImpl$storeLessonData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
