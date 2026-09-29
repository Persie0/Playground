package com.lingq.core.domain.token;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.token.TokenCwt;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3513qw;
import p000.bq1;
import p000.c83;
import p000.ck6;
import p000.d65;
import p000.fm3;
import p000.h05;
import p000.hd7;
import p000.p33;
import p000.q05;
import p000.sm3;
import p000.v3a;
import p000.vk9;
import p000.w3a;
import p000.wz0;

/* JADX INFO: renamed from: com.lingq.core.domain.token.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1535c {

    /* JADX INFO: renamed from: a */
    public final fm3 f20098a;

    /* JADX INFO: renamed from: b */
    public final p33 f20099b;

    /* JADX INFO: renamed from: c */
    public final ck6 f20100c;

    public C1535c(fm3 fm3Var, p33 p33Var, ck6 ck6Var) {
        this.f20098a = fm3Var;
        this.f20099b = p33Var;
        this.f20100c = ck6Var;
    }

    /* JADX INFO: renamed from: a */
    public final c83 m8214a(int i, String str) {
        str.getClass();
        p33 p33Var = this.f20099b;
        C1306v c1306v = (C1306v) ((w3a) p33Var.f55514c);
        c1306v.getClass();
        v3a v3aVar = c1306v.f16559a;
        v3aVar.getClass();
        C3513qw c3513qw = new C3513qw(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(v3aVar.f64796a, true, new String[]{"TokenCwtEntity"}, new hd7(i, str, 3))), 10);
        C1295k c1295k = (C1295k) ((d65) p33Var.f55513b);
        c1295k.getClass();
        q05 q05Var = (q05) c1295k.f16498b;
        return AbstractC3224d.m15536o(new C3228h(c3513qw, AbstractC3224d.m15536o(new wz0(14, AbstractC3584sr.m21590A(q05Var.f57071K, true, new String[]{"LessonSentenceEntity"}, new h05(i, q05Var, 2)), str)), new GetCwtUseCase$forLesson$2(3, null)));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ec -> B:47:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0107 -> B:40:0x0115). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m8215b(java.lang.String r18, java.lang.String r19, int r20, java.util.ArrayList r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.domain.token.C1535c.m8215b(java.lang.String, java.lang.String, int, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if (r2 == r3) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String, sm3] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8216c(String str, String str2, int i, String str3, sm3 sm3Var, ContinuationImpl continuationImpl) throws Throwable {
        GetOrFetchCwtsForTokensUseCase$resolveCwt$1 getOrFetchCwtsForTokensUseCase$resolveCwt$1;
        int i2;
        String str4;
        Object obj;
        String str5;
        String str6;
        sm3 sm3Var2;
        int i3;
        int i4;
        ?? r13;
        String str7;
        String str8;
        String str9;
        sm3 sm3Var3;
        String str10;
        ?? r14;
        String str11;
        if (continuationImpl instanceof GetOrFetchCwtsForTokensUseCase$resolveCwt$1) {
            getOrFetchCwtsForTokensUseCase$resolveCwt$1 = (GetOrFetchCwtsForTokensUseCase$resolveCwt$1) continuationImpl;
            int i5 = getOrFetchCwtsForTokensUseCase$resolveCwt$1.f20045h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                getOrFetchCwtsForTokensUseCase$resolveCwt$1.f20045h = i5 - Integer.MIN_VALUE;
            } else {
                getOrFetchCwtsForTokensUseCase$resolveCwt$1 = new GetOrFetchCwtsForTokensUseCase$resolveCwt$1(this, continuationImpl);
            }
        } else {
            getOrFetchCwtsForTokensUseCase$resolveCwt$1 = new GetOrFetchCwtsForTokensUseCase$resolveCwt$1(this, continuationImpl);
        }
        GetOrFetchCwtsForTokensUseCase$resolveCwt$1 getOrFetchCwtsForTokensUseCase$resolveCwt$2 = getOrFetchCwtsForTokensUseCase$resolveCwt$1;
        Object objM15541t = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20043f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20045h;
        p33 p33Var = this.f20099b;
        if (i6 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            i2 = i;
            c83 c83VarM18872P = p33Var.m18872P(i2, sm3Var.f61021b, sm3Var.f61022c, str, str2, str3);
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20038a = str;
            str4 = str2;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20039b = str4;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20040c = str3;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20041d = sm3Var;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20042e = i2;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20045h = 1;
            Object objM15541t2 = AbstractC3224d.m15541t(c83VarM18872P, getOrFetchCwtsForTokensUseCase$resolveCwt$2);
            if (objM15541t2 != coroutineSingletons) {
                obj = objM15541t2;
                str5 = str3;
                str6 = str;
                sm3Var2 = sm3Var;
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            int i7 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20042e;
            sm3 sm3Var4 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20041d;
            String str12 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20040c;
            str4 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20039b;
            str6 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20038a;
            AbstractC3193b.m15359b(objM15541t);
            i2 = i7;
            sm3Var2 = sm3Var4;
            obj = objM15541t;
            str5 = str12;
        } else if (i6 == 2) {
            int i8 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20042e;
            sm3Var3 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20041d;
            str7 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20040c;
            String str13 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20039b;
            str8 = getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20038a;
            AbstractC3193b.m15359b(objM15541t);
            str9 = str13;
            r13 = 0;
            i4 = i8;
            i3 = 3;
            c83 c83VarM18872P2 = p33Var.m18872P(i4, sm3Var3.f61021b, sm3Var3.f61022c, str8, str9, str7);
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20038a = r13;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20039b = r13;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20040c = r13;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20041d = r13;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20042e = i4;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20045h = i3;
            objM15541t = AbstractC3224d.m15541t(c83VarM18872P2, getOrFetchCwtsForTokensUseCase$resolveCwt$2);
            r14 = r13;
        } else {
            if (i6 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
            r14 = 0;
        }
        TokenCwt tokenCwt = (TokenCwt) objM15541t;
        return (tokenCwt == null || (str11 = tokenCwt.f19587e) == null || vk9.m23391n0(str11)) ? r14 : str11;
        String str14 = str4;
        TokenCwt tokenCwt2 = (TokenCwt) obj;
        if (tokenCwt2 != null && (str10 = tokenCwt2.f19587e) != null) {
            if (vk9.m23391n0(str10)) {
                str10 = null;
            }
            if (str10 != null) {
                return str10;
            }
        }
        int i9 = sm3Var2.f61021b;
        int i10 = sm3Var2.f61022c;
        getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20038a = str6;
        getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20039b = str14;
        getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20040c = str5;
        getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20041d = sm3Var2;
        getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20042e = i2;
        getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20045h = 2;
        bq1.m4062m0(str5, str6);
        String str15 = str6;
        i3 = 3;
        i4 = i2;
        r13 = 0;
        if (((C1306v) ((w3a) this.f20100c.f10194b)).m7379e(str15, i4, i9, i10, false, 0, getOrFetchCwtsForTokensUseCase$resolveCwt$2) != coroutineSingletons) {
            str7 = str5;
            str8 = str15;
            str9 = str14;
            sm3Var3 = sm3Var2;
            c83 c83VarM18872P3 = p33Var.m18872P(i4, sm3Var3.f61021b, sm3Var3.f61022c, str8, str9, str7);
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20038a = r13;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20039b = r13;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20040c = r13;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20041d = r13;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20042e = i4;
            getOrFetchCwtsForTokensUseCase$resolveCwt$2.f20045h = i3;
            objM15541t = AbstractC3224d.m15541t(c83VarM18872P3, getOrFetchCwtsForTokensUseCase$resolveCwt$2);
            r14 = r13;
        }
        return coroutineSingletons;
    }
}
