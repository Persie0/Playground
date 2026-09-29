package com.lingq.core.domain.chat;

import com.lingq.core.domain.model.chat.ChatHistory;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.chat.GetChatTokensUseCase$invoke$2", m4291f = "GetChatTokensUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetChatTokensUseCase$invoke$2 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ChatHistory f18607a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f18608b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f18609c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f18610d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1373a f18611e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f18612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatTokensUseCase$invoke$2(C1373a c1373a, String str, Continuation continuation) {
        super(5, continuation);
        this.f18611e = c1373a;
        this.f18612f = str;
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        GetChatTokensUseCase$invoke$2 getChatTokensUseCase$invoke$2 = new GetChatTokensUseCase$invoke$2(this.f18611e, this.f18612f, (Continuation) obj5);
        getChatTokensUseCase$invoke$2.f18607a = (ChatHistory) obj;
        getChatTokensUseCase$invoke$2.f18608b = (List) obj2;
        getChatTokensUseCase$invoke$2.f18609c = zBooleanValue;
        getChatTokensUseCase$invoke$2.f18610d = (String) obj4;
        return getChatTokensUseCase$invoke$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0225  */
    /* JADX WARN: Code duplicated, block: B:106:0x0232 A[PHI: r18 r40
      0x0232: PHI (r18v12 java.util.List) = (r18v10 java.util.List), (r18v13 java.util.List) binds: [B:104:0x022f, B:94:0x020c] A[DONT_GENERATE, DONT_INLINE]
      0x0232: PHI (r40v10 boolean) = (r40v8 boolean), (r40v11 boolean) binds: [B:104:0x022f, B:94:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0234  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:113:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x024d  */
    /* JADX WARN: Code duplicated, block: B:120:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0275  */
    /* JADX WARN: Code duplicated, block: B:134:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x028d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0292  */
    /* JADX WARN: Code duplicated, block: B:142:0x0296  */
    /* JADX WARN: Code duplicated, block: B:143:0x029b  */
    /* JADX WARN: Code duplicated, block: B:145:0x029f  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:163:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:172:0x031d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0327  */
    /* JADX WARN: Code duplicated, block: B:175:0x0361  */
    /* JADX WARN: Code duplicated, block: B:178:0x0374  */
    /* JADX WARN: Code duplicated, block: B:201:0x0405 A[LOOP:6: B:200:0x0403->B:201:0x0405, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cb A[ADDED_TO_REGION, FALL_THROUGH, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f6 A[PHI: r1 r18 r40
      0x01f6: PHI (r1v35 java.lang.String) = 
      (r1v17 java.lang.String)
      (r1v20 java.lang.String)
      (r1v23 java.lang.String)
      (r1v26 java.lang.String)
      (r1v31 java.lang.String)
      (r1v32 java.lang.String)
      (r1v40 java.lang.String)
      (r1v41 java.lang.String)
     binds: [B:136:0x0287, B:129:0x0272, B:122:0x025e, B:115:0x024a, B:101:0x0222, B:108:0x0236, B:89:0x01f3, B:88:0x01ea] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r18v14 java.util.List) = 
      (r18v6 java.util.List)
      (r18v7 java.util.List)
      (r18v8 java.util.List)
      (r18v9 java.util.List)
      (r18v11 java.util.List)
      (r18v12 java.util.List)
      (r18v16 java.util.List)
      (r18v16 java.util.List)
     binds: [B:136:0x0287, B:129:0x0272, B:122:0x025e, B:115:0x024a, B:101:0x0222, B:108:0x0236, B:89:0x01f3, B:88:0x01ea] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r40v12 boolean) = 
      (r40v4 boolean)
      (r40v5 boolean)
      (r40v6 boolean)
      (r40v7 boolean)
      (r40v9 boolean)
      (r40v10 boolean)
      (r40v14 boolean)
      (r40v15 boolean)
     binds: [B:136:0x0287, B:129:0x0272, B:122:0x025e, B:115:0x024a, B:101:0x0222, B:108:0x0236, B:89:0x01f3, B:88:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x01fe A[PHI: r18 r40
      0x01fe: PHI (r18v18 java.util.List) = 
      (r18v6 java.util.List)
      (r18v6 java.util.List)
      (r18v6 java.util.List)
      (r18v7 java.util.List)
      (r18v7 java.util.List)
      (r18v7 java.util.List)
      (r18v8 java.util.List)
      (r18v8 java.util.List)
      (r18v8 java.util.List)
      (r18v9 java.util.List)
      (r18v9 java.util.List)
      (r18v9 java.util.List)
      (r18v10 java.util.List)
      (r18v11 java.util.List)
      (r18v11 java.util.List)
      (r18v11 java.util.List)
      (r18v12 java.util.List)
      (r18v12 java.util.List)
      (r18v13 java.util.List)
      (r18v15 java.util.List)
      (r18v19 java.util.List)
     binds: [B:132:0x027f, B:134:0x0283, B:136:0x0287, B:125:0x026b, B:127:0x026e, B:129:0x0272, B:118:0x0257, B:120:0x025a, B:122:0x025e, B:111:0x0243, B:113:0x0246, B:115:0x024a, B:104:0x022f, B:97:0x021a, B:99:0x021e, B:101:0x0222, B:106:0x0232, B:108:0x0236, B:94:0x020c, B:91:0x01fa, B:78:0x01cb] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r40v17 boolean) = 
      (r40v4 boolean)
      (r40v4 boolean)
      (r40v4 boolean)
      (r40v5 boolean)
      (r40v5 boolean)
      (r40v5 boolean)
      (r40v6 boolean)
      (r40v6 boolean)
      (r40v6 boolean)
      (r40v7 boolean)
      (r40v7 boolean)
      (r40v7 boolean)
      (r40v8 boolean)
      (r40v9 boolean)
      (r40v9 boolean)
      (r40v9 boolean)
      (r40v10 boolean)
      (r40v10 boolean)
      (r40v11 boolean)
      (r40v13 boolean)
      (r40v18 boolean)
     binds: [B:132:0x027f, B:134:0x0283, B:136:0x0287, B:125:0x026b, B:127:0x026e, B:129:0x0272, B:118:0x0257, B:120:0x025a, B:122:0x025e, B:111:0x0243, B:113:0x0246, B:115:0x024a, B:104:0x022f, B:97:0x021a, B:99:0x021e, B:101:0x0222, B:106:0x0232, B:108:0x0236, B:94:0x020c, B:91:0x01fa, B:78:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x0210  */
    /* JADX WARN: Code duplicated, block: B:99:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x01c8. Please report as an issue. */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v14 java.lang.Object, still in use, count: 2, list:
          (r9v14 java.lang.Object) from 0x03e2: PHI (r9 I:??) = (r9v10 java.lang.Object), (r9v14 java.lang.Object) binds: [B:192:0x03e1, B:270:0x03e2] A[DONT_GENERATE, DONT_INLINE]
          (r9v14 java.lang.Object) from 0x03d5: CHECK_CAST (o54) (r9v14 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.domain.chat.GetChatTokensUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
