package com.lingq.core.data.repository;

import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.database.entity.LessonBookmarkEntity;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.WordEntity;
import com.lingq.core.network.api.result.ResultCard;
import com.lingq.core.network.api.result.ResultCards;
import com.lingq.core.network.api.result.ResultLesson;
import com.lingq.core.network.api.result.ResultLessonBookmark;
import com.lingq.core.network.api.result.ResultSentence;
import com.lingq.core.network.api.result.ResultWord;
import com.lingq.core.network.api.result.ResultWords;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p000.C3386nv;
import p000.c32;
import p000.d98;
import p000.esc;
import p000.evc;
import p000.l75;
import p000.m75;
import p000.spc;
import p000.u91;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.y7d;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.SearchRepositoryImpl$networkLoadLesson$2", m4291f = "SearchRepositoryImpl.kt", m4292l = {111, 114, 131, 138, 146, 154, 157}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchRepositoryImpl$networkLoadLesson$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public Locale f16128a;

    /* JADX INFO: renamed from: b */
    public List f16129b;

    /* JADX INFO: renamed from: c */
    public List f16130c;

    /* JADX INFO: renamed from: d */
    public int f16131d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ResultLesson f16132e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1305u f16133f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f16134g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f16135h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkLoadLesson$2(ResultLesson resultLesson, C1305u c1305u, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f16132e = resultLesson;
        this.f16133f = c1305u;
        this.f16134g = str;
        this.f16135h = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchRepositoryImpl$networkLoadLesson$2(this.f16132e, this.f16133f, this.f16134g, this.f16135h, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchRepositoryImpl$networkLoadLesson$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100 A[PHI: r18
      0x0100: PHI (r18v6 java.lang.Throwable) = (r18v0 java.lang.Throwable), (r18v7 java.lang.Throwable) binds: [B:37:0x00fc, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0148  */
    /* JADX WARN: Code duplicated, block: B:53:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:66:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d6 A[LOOP:1: B:75:0x01d0->B:77:0x01d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fb A[PHI: r1
      0x01fb: PHI (r1v7 ??) = (r1v22 ??), (r1v23 ??) binds: [B:79:0x01f8, B:8:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212 A[LOOP:0: B:82:0x020c->B:84:0x0212, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0234 A[PHI: r5
      0x0234: PHI (r5v14 ??) = (r5v10 ??), (r5v15 ??) binds: [B:86:0x0231, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0238  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0249, code lost:
    
        if (r2.mo7489F0(r1, r20) == r3) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o7b] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [bq1, com.lingq.core.database.dao.h] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v7, types: [un0] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Locale] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.List, java.util.Locale] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$IntRef ref$IntRef;
        List list;
        ?? arrayList;
        Throwable th;
        Iterator it;
        ArrayList arrayList2;
        boolean z;
        int i;
        int i2;
        boolean z2;
        Locale localeForLanguageTag;
        ResultCards resultCards;
        ?? arrayList3;
        ?? r4;
        ?? r5;
        List list2;
        ResultWords resultWords;
        ?? arrayList4;
        ?? r1;
        ?? r2;
        List list3;
        String strM23629f;
        ?? r6;
        ArrayList arrayList5;
        Iterator it2;
        ?? r3;
        ArrayList arrayList6;
        Iterator it3;
        ?? r7;
        ResultLessonBookmark resultLessonBookmark;
        C1305u c1305u = this.f16133f;
        ?? r8 = c1305u.f16549c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.f16131d;
        String str = this.f16134g;
        ?? r9 = EmptyList.f47638a;
        int i4 = this.f16135h;
        boolean z3 = true;
        int i5 = 10;
        ResultLesson resultLesson = this.f16132e;
        Throwable th2 = null;
        switch (i3) {
            case 0:
                AbstractC3193b.m15359b(obj);
                LessonEntity lessonEntityM11330b = esc.m11330b(resultLesson);
                this.f16131d = 1;
                if (r8.mo4095v0(lessonEntityM11330b, this) != coroutineSingletons) {
                    ref$IntRef = new Ref$IntRef();
                    list = resultLesson.f21013x;
                    if (list != null) {
                        arrayList = new ArrayList();
                        it = list.iterator();
                        while (it.hasNext()) {
                            List list4 = ((d98) it.next()).f35220a;
                            z = z3;
                            arrayList2 = new ArrayList(v91.m23189q0(list4, i5));
                            i = 0;
                            for (Object obj2 : list4) {
                                i2 = i + 1;
                                if (i >= 0) {
                                    Throwable th3 = th2;
                                    vz1.m23628e0();
                                    throw th3;
                                }
                                ResultSentence resultSentence = (ResultSentence) obj2;
                                Throwable th4 = th2;
                                int i6 = ref$IntRef.f47716a + 1;
                                ref$IntRef.f47716a = i6;
                                if (i == 0) {
                                    z2 = z;
                                } else {
                                    z2 = false;
                                }
                                arrayList2.add(esc.m11331c(resultSentence, i4, i6, z2));
                                th2 = th4;
                                i = i2;
                            }
                            u91.m22630w0(arrayList2, arrayList);
                            z3 = z;
                            i5 = 10;
                        }
                    } else {
                        arrayList = r9;
                    }
                    th = th2;
                    this.f16131d = 2;
                    if (r8.mo7490G0(arrayList, this) != coroutineSingletons) {
                        localeForLanguageTag = Locale.forLanguageTag(str);
                        resultCards = resultLesson.f21010v;
                        if (resultCards != null || (list2 = resultCards.f20655a) == null) {
                            arrayList3 = th;
                        } else {
                            List<ResultCard> list5 = list2;
                            arrayList3 = new ArrayList(v91.m23189q0(list5, 10));
                            for (ResultCard resultCard : list5) {
                                String str2 = resultCard.f20620a;
                                localeForLanguageTag.getClass();
                                arrayList3.add(spc.m21534a(resultCard, vz1.m23629f(str, vz1.m23610P(str2, localeForLanguageTag)), y7d.m24985d(resultCard.f20620a)));
                            }
                        }
                        if (arrayList3 == 0) {
                            arrayList3 = r9;
                        }
                        r4 = c1305u.f16550d;
                        this.f16128a = localeForLanguageTag;
                        this.f16129b = (List) arrayList3;
                        this.f16131d = 3;
                        if (r4.mo4096w0(arrayList3, this) != coroutineSingletons) {
                            r5 = arrayList3;
                            resultWords = resultLesson.f21012w;
                            if (resultWords != null || (list3 = resultWords.f21735a) == null) {
                                arrayList4 = th;
                            } else {
                                List<ResultWord> list6 = list3;
                                arrayList4 = new ArrayList(v91.m23189q0(list6, 10));
                                for (ResultWord resultWord : list6) {
                                    String str3 = resultWord.f21725a;
                                    if (str3 != null) {
                                        localeForLanguageTag.getClass();
                                        strM23629f = vz1.m23629f(str, vz1.m23610P(str3, localeForLanguageTag));
                                    } else {
                                        strM23629f = "";
                                    }
                                    arrayList4.add(evc.m11366a(resultWord, strM23629f));
                                }
                            }
                            if (arrayList4 != 0) {
                                r9 = arrayList4;
                            }
                            r1 = c1305u.f16551e;
                            this.f16128a = th;
                            this.f16129b = (List) r5;
                            this.f16130c = (List) r9;
                            this.f16131d = 4;
                            if (r1.mo4096w0(r9, this) != coroutineSingletons) {
                                r2 = r9;
                                r6 = r5;
                                Iterable iterable = (Iterable) r6;
                                arrayList5 = new ArrayList(v91.m23189q0(iterable, 10));
                                it2 = iterable.iterator();
                                while (it2.hasNext()) {
                                    arrayList5.add(new l75(i4, ((CardEntity) it2.next()).f17055b));
                                }
                                this.f16128a = null;
                                this.f16129b = null;
                                this.f16130c = (List) r2;
                                this.f16131d = 5;
                                r3 = r2;
                                if (r8.mo7491H0(arrayList5, this) != coroutineSingletons) {
                                    Iterable iterable2 = (Iterable) r3;
                                    arrayList6 = new ArrayList(v91.m23189q0(iterable2, 10));
                                    it3 = iterable2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(new m75(i4, ((WordEntity) it3.next()).f17489a));
                                    }
                                    r7 = 0;
                                    this.f16128a = null;
                                    this.f16129b = null;
                                    this.f16130c = null;
                                    this.f16131d = 6;
                                    if (r8.mo7494K0(arrayList6, this) != coroutineSingletons) {
                                        resultLessonBookmark = resultLesson.f21014y;
                                        if (resultLessonBookmark == null) {
                                            return r7;
                                        }
                                        LessonBookmarkEntity lessonBookmarkEntityM11329a = esc.m11329a(resultLessonBookmark, i4);
                                        this.f16128a = r7;
                                        this.f16129b = r7;
                                        this.f16130c = r7;
                                        this.f16131d = 7;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(obj);
                ref$IntRef = new Ref$IntRef();
                list = resultLesson.f21013x;
                if (list != null) {
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        List list7 = ((d98) it.next()).f35220a;
                        z = z3;
                        arrayList2 = new ArrayList(v91.m23189q0(list7, i5));
                        i = 0;
                        while (r8.hasNext()) {
                            i2 = i + 1;
                            if (i >= 0) {
                                Throwable th5 = th2;
                                vz1.m23628e0();
                                throw th5;
                            }
                            ResultSentence resultSentence2 = (ResultSentence) obj2;
                            Throwable th6 = th2;
                            int i7 = ref$IntRef.f47716a + 1;
                            ref$IntRef.f47716a = i7;
                            if (i == 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            arrayList2.add(esc.m11331c(resultSentence2, i4, i7, z2));
                            th2 = th6;
                            i = i2;
                        }
                        u91.m22630w0(arrayList2, arrayList);
                        z3 = z;
                        i5 = 10;
                    }
                } else {
                    arrayList = r9;
                }
                th = th2;
                this.f16131d = 2;
                if (r8.mo7490G0(arrayList, this) != coroutineSingletons) {
                    localeForLanguageTag = Locale.forLanguageTag(str);
                    resultCards = resultLesson.f21010v;
                    if (resultCards != null) {
                        arrayList3 = th;
                    } else {
                        arrayList3 = th;
                    }
                    if (arrayList3 == 0) {
                        arrayList3 = r9;
                    }
                    r4 = c1305u.f16550d;
                    this.f16128a = localeForLanguageTag;
                    this.f16129b = (List) arrayList3;
                    this.f16131d = 3;
                    if (r4.mo4096w0(arrayList3, this) != coroutineSingletons) {
                        r5 = arrayList3;
                        resultWords = resultLesson.f21012w;
                        if (resultWords != null) {
                            arrayList4 = th;
                        } else {
                            arrayList4 = th;
                        }
                        if (arrayList4 != 0) {
                            r9 = arrayList4;
                        }
                        r1 = c1305u.f16551e;
                        this.f16128a = th;
                        this.f16129b = (List) r5;
                        this.f16130c = (List) r9;
                        this.f16131d = 4;
                        if (r1.mo4096w0(r9, this) != coroutineSingletons) {
                            r2 = r9;
                            r6 = r5;
                            Iterable iterable3 = (Iterable) r6;
                            arrayList5 = new ArrayList(v91.m23189q0(iterable3, 10));
                            it2 = iterable3.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(new l75(i4, ((CardEntity) it2.next()).f17055b));
                            }
                            this.f16128a = null;
                            this.f16129b = null;
                            this.f16130c = (List) r2;
                            this.f16131d = 5;
                            r3 = r2;
                            if (r8.mo7491H0(arrayList5, this) != coroutineSingletons) {
                                Iterable iterable4 = (Iterable) r3;
                                arrayList6 = new ArrayList(v91.m23189q0(iterable4, 10));
                                it3 = iterable4.iterator();
                                while (it3.hasNext()) {
                                    arrayList6.add(new m75(i4, ((WordEntity) it3.next()).f17489a));
                                }
                                r7 = 0;
                                this.f16128a = null;
                                this.f16129b = null;
                                this.f16130c = null;
                                this.f16131d = 6;
                                if (r8.mo7494K0(arrayList6, this) != coroutineSingletons) {
                                    resultLessonBookmark = resultLesson.f21014y;
                                    if (resultLessonBookmark == null) {
                                        return r7;
                                    }
                                    LessonBookmarkEntity lessonBookmarkEntityM11329a2 = esc.m11329a(resultLessonBookmark, i4);
                                    this.f16128a = r7;
                                    this.f16129b = r7;
                                    this.f16130c = r7;
                                    this.f16131d = 7;
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 2:
                AbstractC3193b.m15359b(obj);
                th = null;
                localeForLanguageTag = Locale.forLanguageTag(str);
                resultCards = resultLesson.f21010v;
                if (resultCards != null) {
                    arrayList3 = th;
                } else {
                    arrayList3 = th;
                }
                if (arrayList3 == 0) {
                    arrayList3 = r9;
                }
                r4 = c1305u.f16550d;
                this.f16128a = localeForLanguageTag;
                this.f16129b = (List) arrayList3;
                this.f16131d = 3;
                if (r4.mo4096w0(arrayList3, this) != coroutineSingletons) {
                    r5 = arrayList3;
                    resultWords = resultLesson.f21012w;
                    if (resultWords != null) {
                        arrayList4 = th;
                    } else {
                        arrayList4 = th;
                    }
                    if (arrayList4 != 0) {
                        r9 = arrayList4;
                    }
                    r1 = c1305u.f16551e;
                    this.f16128a = th;
                    this.f16129b = (List) r5;
                    this.f16130c = (List) r9;
                    this.f16131d = 4;
                    if (r1.mo4096w0(r9, this) != coroutineSingletons) {
                        r2 = r9;
                        r6 = r5;
                        Iterable iterable5 = (Iterable) r6;
                        arrayList5 = new ArrayList(v91.m23189q0(iterable5, 10));
                        it2 = iterable5.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(new l75(i4, ((CardEntity) it2.next()).f17055b));
                        }
                        this.f16128a = null;
                        this.f16129b = null;
                        this.f16130c = (List) r2;
                        this.f16131d = 5;
                        r3 = r2;
                        if (r8.mo7491H0(arrayList5, this) != coroutineSingletons) {
                            Iterable iterable6 = (Iterable) r3;
                            arrayList6 = new ArrayList(v91.m23189q0(iterable6, 10));
                            it3 = iterable6.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(new m75(i4, ((WordEntity) it3.next()).f17489a));
                            }
                            r7 = 0;
                            this.f16128a = null;
                            this.f16129b = null;
                            this.f16130c = null;
                            this.f16131d = 6;
                            if (r8.mo7494K0(arrayList6, this) != coroutineSingletons) {
                                resultLessonBookmark = resultLesson.f21014y;
                                if (resultLessonBookmark == null) {
                                    return r7;
                                }
                                LessonBookmarkEntity lessonBookmarkEntityM11329a3 = esc.m11329a(resultLessonBookmark, i4);
                                this.f16128a = r7;
                                this.f16129b = r7;
                                this.f16130c = r7;
                                this.f16131d = 7;
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 3:
                List list8 = this.f16129b;
                localeForLanguageTag = this.f16128a;
                AbstractC3193b.m15359b(obj);
                th = null;
                r5 = list8;
                resultWords = resultLesson.f21012w;
                if (resultWords != null) {
                    arrayList4 = th;
                } else {
                    arrayList4 = th;
                }
                if (arrayList4 != 0) {
                    r9 = arrayList4;
                }
                r1 = c1305u.f16551e;
                this.f16128a = th;
                this.f16129b = (List) r5;
                this.f16130c = (List) r9;
                this.f16131d = 4;
                if (r1.mo4096w0(r9, this) != coroutineSingletons) {
                    r2 = r9;
                    r6 = r5;
                    Iterable iterable7 = (Iterable) r6;
                    arrayList5 = new ArrayList(v91.m23189q0(iterable7, 10));
                    it2 = iterable7.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(new l75(i4, ((CardEntity) it2.next()).f17055b));
                    }
                    this.f16128a = null;
                    this.f16129b = null;
                    this.f16130c = (List) r2;
                    this.f16131d = 5;
                    r3 = r2;
                    if (r8.mo7491H0(arrayList5, this) != coroutineSingletons) {
                        Iterable iterable8 = (Iterable) r3;
                        arrayList6 = new ArrayList(v91.m23189q0(iterable8, 10));
                        it3 = iterable8.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(new m75(i4, ((WordEntity) it3.next()).f17489a));
                        }
                        r7 = 0;
                        this.f16128a = null;
                        this.f16129b = null;
                        this.f16130c = null;
                        this.f16131d = 6;
                        if (r8.mo7494K0(arrayList6, this) != coroutineSingletons) {
                            resultLessonBookmark = resultLesson.f21014y;
                            if (resultLessonBookmark == null) {
                                return r7;
                            }
                            LessonBookmarkEntity lessonBookmarkEntityM11329a4 = esc.m11329a(resultLessonBookmark, i4);
                            this.f16128a = r7;
                            this.f16129b = r7;
                            this.f16130c = r7;
                            this.f16131d = 7;
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 4:
                List list9 = this.f16130c;
                List list10 = this.f16129b;
                AbstractC3193b.m15359b(obj);
                r2 = list9;
                r6 = list10;
                Iterable iterable9 = (Iterable) r6;
                arrayList5 = new ArrayList(v91.m23189q0(iterable9, 10));
                it2 = iterable9.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new l75(i4, ((CardEntity) it2.next()).f17055b));
                }
                this.f16128a = null;
                this.f16129b = null;
                this.f16130c = (List) r2;
                this.f16131d = 5;
                r3 = r2;
                if (r8.mo7491H0(arrayList5, this) != coroutineSingletons) {
                    Iterable iterable10 = (Iterable) r3;
                    arrayList6 = new ArrayList(v91.m23189q0(iterable10, 10));
                    it3 = iterable10.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(new m75(i4, ((WordEntity) it3.next()).f17489a));
                    }
                    r7 = 0;
                    this.f16128a = null;
                    this.f16129b = null;
                    this.f16130c = null;
                    this.f16131d = 6;
                    if (r8.mo7494K0(arrayList6, this) != coroutineSingletons) {
                        resultLessonBookmark = resultLesson.f21014y;
                        if (resultLessonBookmark == null) {
                            return r7;
                        }
                        LessonBookmarkEntity lessonBookmarkEntityM11329a5 = esc.m11329a(resultLessonBookmark, i4);
                        this.f16128a = r7;
                        this.f16129b = r7;
                        this.f16130c = r7;
                        this.f16131d = 7;
                    }
                    break;
                }
                return coroutineSingletons;
            case 5:
                List list11 = this.f16130c;
                List list12 = this.f16129b;
                AbstractC3193b.m15359b(obj);
                r3 = list11;
                Iterable iterable11 = (Iterable) r3;
                arrayList6 = new ArrayList(v91.m23189q0(iterable11, 10));
                it3 = iterable11.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(new m75(i4, ((WordEntity) it3.next()).f17489a));
                }
                r7 = 0;
                this.f16128a = null;
                this.f16129b = null;
                this.f16130c = null;
                this.f16131d = 6;
                if (r8.mo7494K0(arrayList6, this) != coroutineSingletons) {
                    resultLessonBookmark = resultLesson.f21014y;
                    if (resultLessonBookmark == null) {
                        return r7;
                    }
                    LessonBookmarkEntity lessonBookmarkEntityM11329a6 = esc.m11329a(resultLessonBookmark, i4);
                    this.f16128a = r7;
                    this.f16129b = r7;
                    this.f16130c = r7;
                    this.f16131d = 7;
                    break;
                }
                return coroutineSingletons;
            case 6:
                List list13 = this.f16130c;
                List list14 = this.f16129b;
                AbstractC3193b.m15359b(obj);
                r7 = 0;
                resultLessonBookmark = resultLesson.f21014y;
                if (resultLessonBookmark == null) {
                    return r7;
                }
                LessonBookmarkEntity lessonBookmarkEntityM11329a7 = esc.m11329a(resultLessonBookmark, i4);
                this.f16128a = r7;
                this.f16129b = r7;
                this.f16130c = r7;
                this.f16131d = 7;
                break;
                break;
            case 7:
                List list15 = this.f16130c;
                List list16 = this.f16129b;
                AbstractC3193b.m15359b(obj);
                return xfa.f68157a;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
