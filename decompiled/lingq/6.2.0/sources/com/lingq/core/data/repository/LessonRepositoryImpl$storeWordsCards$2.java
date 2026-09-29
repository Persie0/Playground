package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultLessonWordsCards;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl$storeWordsCards$2", m4291f = "LessonRepositoryImpl.kt", m4292l = {533, 534, 546, 554, 558, 565, 574, 582}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonRepositoryImpl$storeWordsCards$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public Locale f15516a;

    /* JADX INFO: renamed from: b */
    public List f15517b;

    /* JADX INFO: renamed from: c */
    public List f15518c;

    /* JADX INFO: renamed from: d */
    public C1295k f15519d;

    /* JADX INFO: renamed from: e */
    public Iterator f15520e;

    /* JADX INFO: renamed from: f */
    public int f15521f;

    /* JADX INFO: renamed from: g */
    public int f15522g;

    /* JADX INFO: renamed from: h */
    public int f15523h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1295k f15524i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f15525j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f15526k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ResultLessonWordsCards f15527l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$storeWordsCards$2(C1295k c1295k, int i, String str, ResultLessonWordsCards resultLessonWordsCards, Continuation continuation) {
        super(1, continuation);
        this.f15524i = c1295k;
        this.f15525j = i;
        this.f15526k = str;
        this.f15527l = resultLessonWordsCards;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonRepositoryImpl$storeWordsCards$2(this.f15524i, this.f15525j, this.f15526k, this.f15527l, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonRepositoryImpl$storeWordsCards$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x026a A[EDGE_INSN: B:122:0x026a->B:92:0x026a BREAK  A[LOOP:4: B:88:0x0252->B:93:0x026e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ed A[LOOP:2: B:72:0x01e7->B:74:0x01ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0234  */
    /* JADX WARN: Code duplicated, block: B:84:0x0244  */
    /* JADX WARN: Code duplicated, block: B:87:0x024e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0258  */
    /* JADX WARN: Code duplicated, block: B:93:0x026e A[LOOP:4: B:88:0x0252->B:93:0x026e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0299  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v15, types: [un0] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0299 -> B:99:0x029f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.LessonRepositoryImpl$storeWordsCards$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
