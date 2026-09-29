package com.lingq.feature.review.state;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.lesson.LessonFurigana;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenFurigana;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.review.R$string;
import com.lingq.feature.review.domain.C2755a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.C3139j9;
import p000.C3386nv;
import p000.bd8;
import p000.c83;
import p000.cd8;
import p000.cma;
import p000.eh9;
import p000.fa4;
import p000.fa8;
import p000.fg8;
import p000.ge8;
import p000.ie8;
import p000.ig8;
import p000.lb8;
import p000.mb8;
import p000.n23;
import p000.o23;
import p000.qj2;
import p000.rm3;
import p000.se9;
import p000.ug8;
import p000.vi7;
import p000.vk9;
import p000.wa8;
import p000.xe9;
import p000.xfa;
import p000.xz7;
import p000.y02;
import p000.yc8;
import p000.zc8;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.lingq.feature.review.state.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2763c implements cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f32727a;

    /* JADX INFO: renamed from: b */
    public final qj2 f32728b;

    /* JADX INFO: renamed from: c */
    public final o23 f32729c;

    /* JADX INFO: renamed from: d */
    public final C3139j9 f32730d;

    /* JADX INFO: renamed from: e */
    public final n23 f32731e;

    /* JADX INFO: renamed from: f */
    public final rm3 f32732f;

    /* JADX INFO: renamed from: g */
    public final C2755a f32733g;

    /* JADX INFO: renamed from: h */
    public LessonTranslationSentence f32734h;

    /* JADX INFO: renamed from: i */
    public String f32735i;

    /* JADX INFO: renamed from: j */
    public String f32736j;

    /* JADX INFO: renamed from: k */
    public List f32737k;

    /* JADX INFO: renamed from: l */
    public xe9 f32738l;

    /* JADX INFO: renamed from: m */
    public Long f32739m;

    /* JADX INFO: renamed from: n */
    public String f32740n;

    /* JADX INFO: renamed from: o */
    public int f32741o;

    public C2763c(qj2 qj2Var, o23 o23Var, C3139j9 c3139j9, n23 n23Var, rm3 rm3Var, C2755a c2755a, cma cmaVar) {
        cmaVar.getClass();
        this.f32727a = cmaVar;
        this.f32728b = qj2Var;
        this.f32729c = o23Var;
        this.f32730d = c3139j9;
        this.f32731e = n23Var;
        this.f32732f = rm3Var;
        this.f32733g = c2755a;
        this.f32735i = "";
        this.f32736j = "";
        this.f32737k = EmptyList.f47638a;
        this.f32738l = new xe9();
        this.f32740n = "";
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32727a.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32727a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32727a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32727a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32727a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32727a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32727a.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32727a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32727a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32727a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32727a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32727a.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32727a.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32727a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32727a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32727a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32727a.mo4587X();
    }

    /* JADX INFO: renamed from: a */
    public final ge8 m9635a() {
        xe9 xe9Var = this.f32738l;
        cma cmaVar = this.f32727a;
        return new ge8(new yc8(new fg8(xe9Var, AbstractC3184kh.m15194A(cmaVar.mo4589b2()), AbstractC3184kh.m15226t(cmaVar.mo4589b2()))), new cd8(new bd8(R$string.activities_skip_activity, fa8.f38724a, 12), (bd8) null, (ie8) null, 14));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32727a.mo4588a0();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9636b(int i, int i2, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSentenceContentStateHolder$loadSentenceTranslation$1 reviewSentenceContentStateHolder$loadSentenceTranslation$1;
        int i3;
        if (continuationImpl instanceof ReviewSentenceContentStateHolder$loadSentenceTranslation$1) {
            reviewSentenceContentStateHolder$loadSentenceTranslation$1 = (ReviewSentenceContentStateHolder$loadSentenceTranslation$1) continuationImpl;
            int i4 = reviewSentenceContentStateHolder$loadSentenceTranslation$1.f32623e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                reviewSentenceContentStateHolder$loadSentenceTranslation$1.f32623e = i4 - Integer.MIN_VALUE;
            } else {
                reviewSentenceContentStateHolder$loadSentenceTranslation$1 = new ReviewSentenceContentStateHolder$loadSentenceTranslation$1(this, continuationImpl);
            }
        } else {
            reviewSentenceContentStateHolder$loadSentenceTranslation$1 = new ReviewSentenceContentStateHolder$loadSentenceTranslation$1(this, continuationImpl);
        }
        ReviewSentenceContentStateHolder$loadSentenceTranslation$1 reviewSentenceContentStateHolder$loadSentenceTranslation$2 = reviewSentenceContentStateHolder$loadSentenceTranslation$1;
        Object objM15541t = reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32621c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32623e;
        C3139j9 c3139j9 = this.f32730d;
        cma cmaVar = this.f32727a;
        try {
            if (i5 == 0) {
                AbstractC3193b.m15359b(objM15541t);
                c83 c83VarM14346a = c3139j9.m14346a(i2, cmaVar.mo4580K1(), i);
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32619a = i;
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32620b = i2;
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32623e = 1;
                objM15541t = AbstractC3224d.m15541t(c83VarM14346a, reviewSentenceContentStateHolder$loadSentenceTranslation$2);
                if (objM15541t != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i5 == 1) {
                i2 = reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32620b;
                i = reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32619a;
                AbstractC3193b.m15359b(objM15541t);
            } else if (i5 == 2) {
                i3 = reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32620b;
                i = reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32619a;
                AbstractC3193b.m15359b(objM15541t);
                c83 c83VarM14346a2 = c3139j9.m14346a(i3, cmaVar.mo4580K1(), i);
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32619a = i;
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32620b = i3;
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32623e = 3;
                objM15541t = AbstractC3224d.m15541t(c83VarM14346a2, reviewSentenceContentStateHolder$loadSentenceTranslation$2);
            } else {
                if (i5 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM15541t);
            }
            String str = (String) objM15541t;
            return str == null ? "" : str;
            String str2 = (String) objM15541t;
            if (str2 != null && !vk9.m23391n0(str2)) {
                return str2;
            }
            n23 n23Var = this.f32731e;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32619a = i;
            reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32620b = i2;
            reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32623e = 2;
            int i6 = i2;
            Object objM7306z = ((C1295k) n23Var.f52215a).m7306z(i6, i - 1, strMo4589b2, strMo4580K1, reviewSentenceContentStateHolder$loadSentenceTranslation$2);
            if (objM7306z != coroutineSingletons) {
                objM7306z = xfa.f68157a;
            }
            if (objM7306z != coroutineSingletons) {
                i3 = i6;
                c83 c83VarM14346a3 = c3139j9.m14346a(i3, cmaVar.mo4580K1(), i);
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32619a = i;
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32620b = i3;
                reviewSentenceContentStateHolder$loadSentenceTranslation$2.f32623e = 3;
                objM15541t = AbstractC3224d.m15541t(c83VarM14346a3, reviewSentenceContentStateHolder$loadSentenceTranslation$2);
            }
            return coroutineSingletons;
        } catch (HttpException unused) {
            return "Unable to translate sentence. Please try again later.";
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32727a.mo4589b2();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x0196  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: c */
    public final Object m9637c(lb8 lb8Var, int i, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSentenceContentStateHolder$renderSpeakingActivity$1 reviewSentenceContentStateHolder$renderSpeakingActivity$1;
        boolean z2;
        C2763c c2763c;
        lb8 lb8Var2;
        boolean z3;
        LessonSentence lessonSentence;
        List list;
        int i2;
        ArrayList arrayList;
        StringBuilder sb;
        StringBuilder sb2;
        Iterator it;
        int i3;
        int i4;
        LessonTextToken lessonTextToken;
        String str;
        int i5;
        String str2;
        LessonTransliteration lessonTransliteration;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        LessonFurigana lessonFurigana;
        LessonFurigana lessonFurigana2;
        lb8 lb8Var3 = lb8Var;
        int i6 = i;
        if (continuationImpl instanceof ReviewSentenceContentStateHolder$renderSpeakingActivity$1) {
            reviewSentenceContentStateHolder$renderSpeakingActivity$1 = (ReviewSentenceContentStateHolder$renderSpeakingActivity$1) continuationImpl;
            int i7 = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32630g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32630g = i7 - Integer.MIN_VALUE;
            } else {
                reviewSentenceContentStateHolder$renderSpeakingActivity$1 = new ReviewSentenceContentStateHolder$renderSpeakingActivity$1(this, continuationImpl);
            }
        } else {
            reviewSentenceContentStateHolder$renderSpeakingActivity$1 = new ReviewSentenceContentStateHolder$renderSpeakingActivity$1(this, continuationImpl);
        }
        Object objM15541t = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32628e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32630g;
        if (i8 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83VarM7253K = ((C1295k) this.f32728b.f57848a).m7253K(i6, lb8Var3.f49415a - 1);
            reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32624a = lb8Var3;
            reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32625b = this;
            reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32626c = i6;
            z2 = z;
            reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32627d = z2;
            reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32630g = 1;
            objM15541t = AbstractC3224d.m15541t(c83VarM7253K, reviewSentenceContentStateHolder$renderSpeakingActivity$1);
            if (objM15541t != coroutineSingletons) {
                c2763c = this;
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            boolean z4 = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32627d;
            i6 = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32626c;
            C2763c c2763c2 = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32625b;
            lb8 lb8Var4 = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32624a;
            AbstractC3193b.m15359b(objM15541t);
            z2 = z4;
            lb8Var3 = lb8Var4;
            c2763c = c2763c2;
        } else {
            if (i8 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32627d;
            lb8Var2 = reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32624a;
            AbstractC3193b.m15359b(objM15541t);
            z3 = z5;
        }
        lessonSentence = (LessonSentence) objM15541t;
        if (lessonSentence != null) {
            list = lessonSentence.f19253a;
        } else {
            list = null;
        }
        if (list == null) {
            list = EmptyList.f47638a;
        }
        i2 = lb8Var2.f49415a;
        arrayList = new ArrayList();
        sb = new StringBuilder();
        sb2 = new StringBuilder();
        it = list.iterator();
        i3 = 0;
        i4 = 0;
        while (it.hasNext()) {
            lessonTextToken = (LessonTextToken) it.next();
            str = lessonTextToken.f19277a;
            if (str == null) {
                i5 = i2;
                int length = str.length() + i3;
                sb.append(lessonTextToken.f19277a);
                i3 = length;
            } else if (lessonTextToken.f19278b != null) {
                i3++;
                i4++;
                sb.append(" ");
                sb2.append(" ");
                i5 = i2;
            } else {
                str2 = lessonTextToken.f19286j;
                if (str2 == null) {
                    str2 = "";
                }
                String str12 = str2;
                int length2 = str12.length() + i3;
                int length3 = str12.length() + i4;
                int i9 = lessonTextToken.f19283g;
                int i10 = lessonTextToken.f19284h;
                lessonTransliteration = lessonTextToken.f19282f;
                if (lessonTransliteration != null) {
                    str3 = lessonTransliteration.f19300b;
                } else {
                    str3 = null;
                }
                if (lessonTransliteration != null) {
                    str4 = lessonTransliteration.f19299a;
                } else {
                    str4 = null;
                }
                if (lessonTransliteration != null) {
                    str5 = lessonTransliteration.f19301c;
                } else {
                    str5 = null;
                }
                if (lessonTransliteration != null) {
                    str6 = lessonTransliteration.f19302d;
                } else {
                    str6 = null;
                }
                if (lessonTransliteration != null) {
                    str7 = lessonTransliteration.f19303e;
                } else {
                    str7 = null;
                }
                if (lessonTransliteration != null) {
                    str8 = lessonTransliteration.f19304f;
                } else {
                    str8 = null;
                }
                int i11 = i2;
                if (lessonTransliteration != null || (lessonFurigana2 = lessonTransliteration.f19305g) == null) {
                    str9 = null;
                } else {
                    str9 = lessonFurigana2.f19229a;
                }
                if (lessonTransliteration != null || (lessonFurigana = lessonTransliteration.f19305g) == null) {
                    str10 = null;
                } else {
                    str10 = lessonFurigana.f19230b;
                }
                TokenFurigana tokenFurigana = new TokenFurigana(str9, str10);
                if (lessonTransliteration != null) {
                    str11 = lessonTransliteration.f19306h;
                } else {
                    str11 = null;
                }
                i5 = i11;
                arrayList.add(new xz7(i3, length2, i4, length3, str12, i9, i5, i10, "", new TokenTransliteration(str4, str3, str5, str6, str7, str8, tokenFurigana, str11), TextTokenType.WORD, lessonTextToken.f19289m, (Map) null, (String) null, (String) null, (String) null, 258048));
                int length4 = str12.length() + i3;
                int length5 = str12.length() + i4;
                sb.append(str12);
                sb2.append(str12);
                i3 = length4;
                i4 = length5;
            }
            it = it;
            i2 = i5;
        }
        this.f32735i = sb.toString();
        this.f32736j = sb2.toString();
        this.f32738l = xe9.m24478a(this.f32738l, z3, 0, this.f32735i, null, null, null, arrayList, 58);
        this.f32739m = new Long(y02.m24805c());
        return m9635a();
        c2763c.f32734h = (LessonTranslationSentence) objM15541t;
        int i12 = lb8Var3.f49415a;
        reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32624a = lb8Var3;
        reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32625b = null;
        reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32626c = i6;
        reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32627d = z2;
        reviewSentenceContentStateHolder$renderSpeakingActivity$1.f32630g = 2;
        objM15541t = ((C1295k) this.f32729c.f53649a).m7298r(i6, i12, reviewSentenceContentStateHolder$renderSpeakingActivity$1);
        if (objM15541t != coroutineSingletons) {
            lb8Var2 = lb8Var3;
            z3 = z2;
            lessonSentence = (LessonSentence) objM15541t;
            if (lessonSentence != null) {
                list = lessonSentence.f19253a;
            } else {
                list = null;
            }
            if (list == null) {
                list = EmptyList.f47638a;
            }
            i2 = lb8Var2.f49415a;
            arrayList = new ArrayList();
            sb = new StringBuilder();
            sb2 = new StringBuilder();
            it = list.iterator();
            i3 = 0;
            i4 = 0;
            while (it.hasNext()) {
                lessonTextToken = (LessonTextToken) it.next();
                str = lessonTextToken.f19277a;
                if (str == null) {
                    i5 = i2;
                    int length6 = str.length() + i3;
                    sb.append(lessonTextToken.f19277a);
                    i3 = length6;
                } else if (lessonTextToken.f19278b != null) {
                    i3++;
                    i4++;
                    sb.append(" ");
                    sb2.append(" ");
                    i5 = i2;
                } else {
                    str2 = lessonTextToken.f19286j;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str13 = str2;
                    int length7 = str13.length() + i3;
                    int length8 = str13.length() + i4;
                    int i13 = lessonTextToken.f19283g;
                    int i14 = lessonTextToken.f19284h;
                    lessonTransliteration = lessonTextToken.f19282f;
                    if (lessonTransliteration != null) {
                        str3 = lessonTransliteration.f19300b;
                    } else {
                        str3 = null;
                    }
                    if (lessonTransliteration != null) {
                        str4 = lessonTransliteration.f19299a;
                    } else {
                        str4 = null;
                    }
                    if (lessonTransliteration != null) {
                        str5 = lessonTransliteration.f19301c;
                    } else {
                        str5 = null;
                    }
                    if (lessonTransliteration != null) {
                        str6 = lessonTransliteration.f19302d;
                    } else {
                        str6 = null;
                    }
                    if (lessonTransliteration != null) {
                        str7 = lessonTransliteration.f19303e;
                    } else {
                        str7 = null;
                    }
                    if (lessonTransliteration != null) {
                        str8 = lessonTransliteration.f19304f;
                    } else {
                        str8 = null;
                    }
                    int i15 = i2;
                    if (lessonTransliteration != null) {
                        str9 = null;
                    } else {
                        str9 = null;
                    }
                    if (lessonTransliteration != null) {
                        str10 = null;
                    } else {
                        str10 = null;
                    }
                    TokenFurigana tokenFurigana2 = new TokenFurigana(str9, str10);
                    if (lessonTransliteration != null) {
                        str11 = lessonTransliteration.f19306h;
                    } else {
                        str11 = null;
                    }
                    i5 = i15;
                    arrayList.add(new xz7(i3, length7, i4, length8, str13, i13, i5, i14, "", new TokenTransliteration(str4, str3, str5, str6, str7, str8, tokenFurigana2, str11), TextTokenType.WORD, lessonTextToken.f19289m, (Map) null, (String) null, (String) null, (String) null, 258048));
                    int length9 = str13.length() + i3;
                    int length10 = str13.length() + i4;
                    sb.append(str13);
                    sb2.append(str13);
                    i3 = length9;
                    i4 = length10;
                }
                it = it;
                i2 = i5;
            }
            this.f32735i = sb.toString();
            this.f32736j = sb2.toString();
            this.f32738l = xe9.m24478a(this.f32738l, z3, 0, this.f32735i, null, null, null, arrayList, 58);
            this.f32739m = new Long(y02.m24805c());
            return m9635a();
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r3 == r5) goto L22;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9638d(mb8 mb8Var, int i, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSentenceContentStateHolder$renderUnscrambleActivity$1 reviewSentenceContentStateHolder$renderUnscrambleActivity$1;
        Object obj;
        C2763c c2763c;
        mb8 mb8Var2 = mb8Var;
        int i2 = i;
        if (continuationImpl instanceof ReviewSentenceContentStateHolder$renderUnscrambleActivity$1) {
            reviewSentenceContentStateHolder$renderUnscrambleActivity$1 = (ReviewSentenceContentStateHolder$renderUnscrambleActivity$1) continuationImpl;
            int i3 = reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32636f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32636f = i3 - Integer.MIN_VALUE;
            } else {
                reviewSentenceContentStateHolder$renderUnscrambleActivity$1 = new ReviewSentenceContentStateHolder$renderUnscrambleActivity$1(this, continuationImpl);
            }
        } else {
            reviewSentenceContentStateHolder$renderUnscrambleActivity$1 = new ReviewSentenceContentStateHolder$renderUnscrambleActivity$1(this, continuationImpl);
        }
        Object objM9636b = reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32634d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32636f;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM9636b);
            c83 c83VarM7253K = ((C1295k) this.f32728b.f57848a).m7253K(i2, mb8Var2.f50881a - 1);
            reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32631a = mb8Var2;
            reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32632b = this;
            reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32633c = i2;
            reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32636f = 1;
            Object objM15541t = AbstractC3224d.m15541t(c83VarM7253K, reviewSentenceContentStateHolder$renderUnscrambleActivity$1);
            if (objM15541t != coroutineSingletons) {
                obj = objM15541t;
                c2763c = this;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            int i5 = reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32633c;
            C2763c c2763c2 = reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32632b;
            mb8 mb8Var3 = reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32631a;
            AbstractC3193b.m15359b(objM9636b);
            i2 = i5;
            mb8Var2 = mb8Var3;
            obj = objM9636b;
            c2763c = c2763c2;
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM9636b);
        }
        String str = (String) objM9636b;
        LessonTranslationSentence lessonTranslationSentence = this.f32734h;
        String str2 = lessonTranslationSentence != null ? lessonTranslationSentence.f19296e : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f32740n;
        return new ge8(new zc8(new ug8(this.f32741o, str2, str, str3, !vk9.m23391n0(str3), AbstractC3184kh.m15194A(this.f32727a.mo4589b2()))), new cd8(new bd8(R$string.activities_skip_activity, fa8.f38724a, 12), new bd8(R$string.activities_submit_answer, wa8.f66566a, !vk9.m23391n0(this.f32740n), true), (ie8) null, 10));
        c2763c.f32734h = (LessonTranslationSentence) obj;
        int i6 = mb8Var2.f50881a;
        reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32631a = null;
        reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32632b = null;
        reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32633c = i2;
        reviewSentenceContentStateHolder$renderUnscrambleActivity$1.f32636f = 2;
        objM9636b = m9636b(i6, i2, reviewSentenceContentStateHolder$renderUnscrambleActivity$1);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32727a.mo4590d0();
    }

    /* JADX INFO: renamed from: e */
    public final void m9639e() {
        this.f32734h = null;
        this.f32735i = "";
        this.f32736j = "";
        this.f32737k = EmptyList.f47638a;
        this.f32738l = new xe9();
        this.f32739m = null;
        this.f32740n = "";
        this.f32741o++;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m9640f(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1 reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1;
        if (continuationImpl instanceof ReviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1) {
            reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1 = (ReviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1) continuationImpl;
            int i = reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1.f32639c;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1.f32639c = i - Integer.MIN_VALUE;
            } else {
                reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1 = new ReviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1(this, continuationImpl);
            }
        } else {
            reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1 = new ReviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1(this, continuationImpl);
        }
        Object objM15541t = reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1.f32637a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1.f32639c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            if (z) {
                reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1.f32639c = 1;
                objM15541t = AbstractC3224d.m15541t(((C1370c) ((ig8) this.f32733g.f32467a)).f18552s0, reviewSentenceContentStateHolder$shouldAutoPlaySpeaking$1);
                if (objM15541t == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM15541t);
        boolean z2 = fa4.m11650l(((Map) objM15541t).get("Speaking"), Boolean.TRUE);
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public final Object m9641g(int i, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSentenceContentStateHolder$speakSentenceParams$1 reviewSentenceContentStateHolder$speakSentenceParams$1;
        LessonTranslationSentence lessonTranslationSentence;
        double d;
        double d2;
        int i2;
        if (continuationImpl instanceof ReviewSentenceContentStateHolder$speakSentenceParams$1) {
            reviewSentenceContentStateHolder$speakSentenceParams$1 = (ReviewSentenceContentStateHolder$speakSentenceParams$1) continuationImpl;
            int i3 = reviewSentenceContentStateHolder$speakSentenceParams$1.f32646g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                reviewSentenceContentStateHolder$speakSentenceParams$1.f32646g = i3 - Integer.MIN_VALUE;
            } else {
                reviewSentenceContentStateHolder$speakSentenceParams$1 = new ReviewSentenceContentStateHolder$speakSentenceParams$1(this, continuationImpl);
            }
        } else {
            reviewSentenceContentStateHolder$speakSentenceParams$1 = new ReviewSentenceContentStateHolder$speakSentenceParams$1(this, continuationImpl);
        }
        Object obj = reviewSentenceContentStateHolder$speakSentenceParams$1.f32644e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = reviewSentenceContentStateHolder$speakSentenceParams$1.f32646g;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            LessonTranslationSentence lessonTranslationSentence2 = this.f32734h;
            if (lessonTranslationSentence2 == null) {
                return null;
            }
            Double d3 = lessonTranslationSentence2.f19294c;
            double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
            Double d4 = lessonTranslationSentence2.f19295d;
            double dDoubleValue2 = d4 != null ? d4.doubleValue() : 0.0d;
            vi7 vi7Var = ((C1368a) this.f32732f.f59534a).f18371Q0;
            reviewSentenceContentStateHolder$speakSentenceParams$1.f32641b = lessonTranslationSentence2;
            reviewSentenceContentStateHolder$speakSentenceParams$1.f32640a = i;
            reviewSentenceContentStateHolder$speakSentenceParams$1.f32642c = dDoubleValue;
            reviewSentenceContentStateHolder$speakSentenceParams$1.f32643d = dDoubleValue2;
            reviewSentenceContentStateHolder$speakSentenceParams$1.f32646g = 1;
            Object objM15541t = AbstractC3224d.m15541t(vi7Var, reviewSentenceContentStateHolder$speakSentenceParams$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonTranslationSentence = lessonTranslationSentence2;
            d = dDoubleValue;
            d2 = dDoubleValue2;
            i2 = i;
            obj = objM15541t;
        } else {
            if (i4 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = reviewSentenceContentStateHolder$speakSentenceParams$1.f32643d;
            double d6 = reviewSentenceContentStateHolder$speakSentenceParams$1.f32642c;
            int i5 = reviewSentenceContentStateHolder$speakSentenceParams$1.f32640a;
            lessonTranslationSentence = reviewSentenceContentStateHolder$speakSentenceParams$1.f32641b;
            AbstractC3193b.m15359b(obj);
            i2 = i5;
            d2 = d5;
            d = d6;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = lessonTranslationSentence.f19296e;
        if (str == null) {
            str = "";
        }
        return new se9(d, d2, i2, str, zBooleanValue && ((int) d2) != 0);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32727a.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32727a.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32727a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32727a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32727a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32727a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32727a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32727a.mo4598w2();
    }
}
