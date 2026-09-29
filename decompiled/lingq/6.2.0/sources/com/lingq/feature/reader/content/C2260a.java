package com.lingq.feature.reader.content;

import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.common.network.C1262a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.lesson.C1382d;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.domain.model.lesson.LessonMetadata;
import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.domain.model.lesson.LessonSentencesTranslation;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import com.lingq.feature.reader.content.domain.C2262a;
import com.lingq.feature.reader.progress.domain.C2473c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3540rl;
import p000.c18;
import p000.c83;
import p000.cc4;
import p000.cl9;
import p000.e25;
import p000.em3;
import p000.g25;
import p000.gm5;
import p000.gna;
import p000.h25;
import p000.hl7;
import p000.j25;
import p000.jj2;
import p000.l70;
import p000.m83;
import p000.n23;
import p000.nl3;
import p000.o23;
import p000.ox7;
import p000.pg9;
import p000.pk9;
import p000.qe5;
import p000.u91;
import p000.um5;
import p000.un1;
import p000.ux5;
import p000.vj6;
import p000.vma;
import p000.vqb;
import p000.wfb;
import p000.x45;
import p000.x65;
import p000.xfa;
import p000.xi9;
import p000.xz7;
import p000.y15;
import p000.ym5;
import p000.yz4;
import p000.zz4;

/* JADX INFO: renamed from: com.lingq.feature.reader.content.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2260a {

    /* JADX INFO: renamed from: a */
    public final n23 f27935a;

    /* JADX INFO: renamed from: b */
    public final o23 f27936b;

    /* JADX INFO: renamed from: c */
    public final C1262a f27937c;

    /* JADX INFO: renamed from: d */
    public final n23 f27938d;

    /* JADX INFO: renamed from: e */
    public final vj6 f27939e;

    /* JADX INFO: renamed from: f */
    public final C2262a f27940f;

    /* JADX INFO: renamed from: g */
    public final nl3 f27941g;

    /* JADX INFO: renamed from: h */
    public final em3 f27942h;

    /* JADX INFO: renamed from: i */
    public final n23 f27943i;

    /* JADX INFO: renamed from: j */
    public final cc4 f27944j;

    /* JADX INFO: renamed from: k */
    public final vqb f27945k;

    /* JADX INFO: renamed from: l */
    public final C1382d f27946l;

    /* JADX INFO: renamed from: m */
    public final C2473c f27947m;

    /* JADX INFO: renamed from: n */
    public final un1 f27948n;

    /* JADX INFO: renamed from: o */
    public final C3244l f27949o;

    /* JADX INFO: renamed from: p */
    public int f27950p;

    /* JADX INFO: renamed from: q */
    public pg9 f27951q;

    /* JADX INFO: renamed from: r */
    public pg9 f27952r;

    /* JADX INFO: renamed from: s */
    public pg9 f27953s;

    /* JADX INFO: renamed from: t */
    public List f27954t;

    /* JADX INFO: renamed from: u */
    public boolean f27955u;

    /* JADX INFO: renamed from: v */
    public long f27956v;

    /* JADX INFO: renamed from: w */
    public final c18 f27957w;

    public C2260a(n23 n23Var, o23 o23Var, C1262a c1262a, n23 n23Var2, vj6 vj6Var, C2262a c2262a, nl3 nl3Var, em3 em3Var, n23 n23Var3, cc4 cc4Var, vqb vqbVar, C1382d c1382d, C2473c c2473c, gna gnaVar, un1 un1Var) {
        un1Var.getClass();
        this.f27935a = n23Var;
        this.f27936b = o23Var;
        this.f27937c = c1262a;
        this.f27938d = n23Var2;
        this.f27939e = vj6Var;
        this.f27940f = c2262a;
        this.f27941g = nl3Var;
        this.f27942h = em3Var;
        this.f27943i = n23Var3;
        this.f27944j = cc4Var;
        this.f27945k = vqbVar;
        this.f27946l = c1382d;
        this.f27947m = c2473c;
        this.f27948n = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new yz4());
        this.f27949o = c3244lM17114d;
        this.f27956v = 0L;
        this.f27957w = AbstractC3224d.m15520B(c3244lM17114d, un1Var, xi9.f68262a, new yz4());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: a */
    public static final Object m9248a(C2260a c2260a, String str, int i, ContinuationImpl continuationImpl) throws Throwable {
        LessonContentStateHolder$refreshLessonForLipp$1 lessonContentStateHolder$refreshLessonForLipp$1;
        Object value;
        String str2 = str;
        int i2 = i;
        un1 un1Var = c2260a.f27948n;
        C2262a c2262a = c2260a.f27940f;
        if (continuationImpl instanceof LessonContentStateHolder$refreshLessonForLipp$1) {
            lessonContentStateHolder$refreshLessonForLipp$1 = (LessonContentStateHolder$refreshLessonForLipp$1) continuationImpl;
            int i3 = lessonContentStateHolder$refreshLessonForLipp$1.f27905e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lessonContentStateHolder$refreshLessonForLipp$1.f27905e = i3 - Integer.MIN_VALUE;
            } else {
                lessonContentStateHolder$refreshLessonForLipp$1 = new LessonContentStateHolder$refreshLessonForLipp$1(c2260a, continuationImpl);
            }
        } else {
            lessonContentStateHolder$refreshLessonForLipp$1 = new LessonContentStateHolder$refreshLessonForLipp$1(c2260a, continuationImpl);
        }
        Object objM7302v = lessonContentStateHolder$refreshLessonForLipp$1.f27903c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lessonContentStateHolder$refreshLessonForLipp$1.f27905e;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM7302v);
            n23 n23Var = c2260a.f27935a;
            lessonContentStateHolder$refreshLessonForLipp$1.f27901a = str2;
            lessonContentStateHolder$refreshLessonForLipp$1.f27902b = i2;
            lessonContentStateHolder$refreshLessonForLipp$1.f27905e = 1;
            objM7302v = ((C1295k) n23Var.f52215a).m7302v(str2, i2, true, lessonContentStateHolder$refreshLessonForLipp$1);
            if (objM7302v == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = lessonContentStateHolder$refreshLessonForLipp$1.f27902b;
            String str3 = lessonContentStateHolder$refreshLessonForLipp$1.f27901a;
            AbstractC3193b.m15359b(objM7302v);
            i2 = i5;
            str2 = str3;
        }
        ym5 ym5Var = (ym5) objM7302v;
        x45 x45Var = (x45) pk9.m19381x(ym5Var);
        if (x45Var != null) {
            c2262a.m9257b(x45Var.f67755b);
            LessonSentencesTranslation lessonSentencesTranslation = x45Var.f67754a.f19151j;
            C3244l c3244l = c2260a.f27949o;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, x45Var.f67754a, x45Var.f67755b, null, null, x45Var.f67756c, null, false, null, false, false, null, new qe5(0.0f, false), null, 0, 0, false, null, null, false, false, null, 0, false, 8386284)));
            AbstractC3224d.m15545x(new m83(new C3540rl(c2262a.m9256a(), 5), new LessonContentStateHolder$refreshLessonForLipp$3(c2260a, null), 2), un1Var);
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(c2260a.f27941g.m17484a(str2)), new LessonContentStateHolder$refreshLessonForLipp$4(c2260a, null), 2), un1Var);
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(((C1368a) c2260a.f27942h.f37455a).f18387Y0), new LessonContentStateHolder$refreshLessonForLipp$5(c2260a, null), 2), un1Var);
            wfb.m23926u(un1Var, null, null, new LessonContentStateHolder$refreshLessonForLipp$6(c2260a, str2, i2, null), 3);
        } else if (ym5Var instanceof um5) {
            c2260a.m9250c((j25) pk9.m19373k(ym5Var), str2, i2);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9249b(List list, LessonBookmark lessonBookmark) {
        int iM15945h;
        Object next;
        LessonBookmark lessonBookmark2 = lessonBookmark;
        C3244l c3244l = this.f27949o;
        int i = ((yz4) c3244l.getValue()).f70680n;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (lessonBookmark2 == null || list.isEmpty()) {
            iM15945h = l70.m15945h(i, 0, size);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u91.m22630w0(((ox7) it.next()).f55132e, arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                int i2 = ((xz7) next).f69009f;
                Integer num = lessonBookmark2.f19169b;
                if (num != null && i2 == num.intValue()) {
                    break;
                }
            }
            xz7 xz7Var = (xz7) next;
            iM15945h = xz7Var != null ? xz7Var.f69016m : l70.m15945h(i, 0, size);
        }
        int i3 = iM15945h;
        while (true) {
            Object value = c3244l.getValue();
            if (c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, list, lessonBookmark2, null, false, null, false, false, null, null, null, i3, 0, true, null, null, false, false, null, 0, false, 8347623))) {
                return;
            } else {
                lessonBookmark2 = lessonBookmark;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9250c(j25 j25Var, String str, int i) {
        Object value;
        Object value2;
        Object value3;
        boolean z = j25Var instanceof e25;
        C3244l c3244l = this.f27949o;
        if (z) {
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, yz4.m25387a((yz4) value3, null, null, null, null, null, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388351)));
            return;
        }
        if (!(j25Var instanceof h25)) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, false, false, j25Var == null ? g25.f40076a : j25Var, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8387327)));
            return;
        }
        LessonProcessingStatus lessonProcessingStatus = ((h25) j25Var).f41700a;
        switch (zz4.f72421a[lessonProcessingStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                wfb.m23926u(this.f27948n, null, null, new LessonContentStateHolder$startLippProgressAndRefresh$1(this, str, i, null), 3);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                gm5.m12750e();
                return;
        }
        do {
            value2 = c3244l.getValue();
        } while (!c3244l.m15570h(value2, yz4.m25387a((yz4) value2, null, null, null, null, null, null, false, null, false, false, null, null, new hl7(lessonProcessingStatus, 4), 0, 0, false, null, null, false, false, null, 0, false, 8384255)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r7.f27946l.m7993b(r8, r9, r0) == r1) goto L27;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9251d(int i, ReaderBookmarkMode readerBookmarkMode, ContinuationImpl continuationImpl) throws Throwable {
        LessonContentStateHolder$handleModeResume$1 lessonContentStateHolder$handleModeResume$1;
        if (continuationImpl instanceof LessonContentStateHolder$handleModeResume$1) {
            lessonContentStateHolder$handleModeResume$1 = (LessonContentStateHolder$handleModeResume$1) continuationImpl;
            int i2 = lessonContentStateHolder$handleModeResume$1.f27867e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonContentStateHolder$handleModeResume$1.f27867e = i2 - Integer.MIN_VALUE;
            } else {
                lessonContentStateHolder$handleModeResume$1 = new LessonContentStateHolder$handleModeResume$1(this, continuationImpl);
            }
        } else {
            lessonContentStateHolder$handleModeResume$1 = new LessonContentStateHolder$handleModeResume$1(this, continuationImpl);
        }
        Object objM15541t = lessonContentStateHolder$handleModeResume$1.f27865c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonContentStateHolder$handleModeResume$1.f27867e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83VarM15536o = AbstractC3224d.m15536o(new jj2(((C1371d) ((vma) this.f27945k.f65802b)).f18584u, i, 3));
            lessonContentStateHolder$handleModeResume$1.f27864b = readerBookmarkMode;
            lessonContentStateHolder$handleModeResume$1.f27863a = i;
            lessonContentStateHolder$handleModeResume$1.f27867e = 1;
            objM15541t = AbstractC3224d.m15541t(c83VarM15536o, lessonContentStateHolder$handleModeResume$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = lessonContentStateHolder$handleModeResume$1.f27863a;
            readerBookmarkMode = lessonContentStateHolder$handleModeResume$1.f27864b;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        ReaderBookmarkMode readerBookmarkMode2 = (ReaderBookmarkMode) objM15541t;
        if (readerBookmarkMode2 != null && readerBookmarkMode2 != readerBookmarkMode) {
            C3244l c3244l = this.f27949o;
            List list = ((yz4) c3244l.getValue()).f70670d;
            if (!list.isEmpty()) {
                m9249b(list, ((yz4) c3244l.getValue()).f70671e);
            }
        }
        lessonContentStateHolder$handleModeResume$1.f27864b = null;
        lessonContentStateHolder$handleModeResume$1.f27863a = i;
        lessonContentStateHolder$handleModeResume$1.f27867e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0134  */
    /* JADX WARN: Code duplicated, block: B:40:0x014a  */
    /* JADX WARN: Code duplicated, block: B:41:0x014d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x016e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x019d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x0218  */
    /* JADX WARN: Code duplicated, block: B:64:0x0228  */
    /* JADX WARN: Code duplicated, block: B:67:0x022d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0247  */
    /* JADX WARN: Code duplicated, block: B:74:0x0253  */
    /* JADX WARN: Code duplicated, block: B:77:0x026d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0272  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0276  */
    /* JADX WARN: Code duplicated, block: B:82:0x0289  */
    /* JADX WARN: Code duplicated, block: B:85:0x02f1 A[LOOP:0: B:57:0x01b5->B:85:0x02f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0309 A[LOOP:1: B:30:0x00c5->B:90:0x0309, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0200 A[EDGE_INSN: B:91:0x0200->B:59:0x0200 BREAK  A[LOOP:0: B:57:0x01b5->B:85:0x02f1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x010a A[EDGE_INSN: B:92:0x010a->B:32:0x010a BREAK  A[LOOP:1: B:30:0x00c5->B:90:0x0309], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final Object m9252e(String str, String str2, int i, boolean z, boolean z2, boolean z3, ContinuationImpl continuationImpl) throws Throwable {
        LessonContentStateHolder$loadLesson$1 lessonContentStateHolder$loadLesson$1;
        int i2;
        boolean z4;
        String str3;
        boolean z5;
        String str4;
        boolean z6;
        boolean z7;
        String str5;
        boolean z8;
        int i3;
        boolean z9;
        Object value;
        boolean z10;
        String str6;
        boolean z11;
        pg9 pg9Var;
        pg9 pg9Var2;
        ReaderBookmarkMode readerBookmarkMode;
        pg9 pg9Var3;
        Object objM7302v;
        int i4;
        boolean z12;
        Object obj;
        boolean z13;
        String str7;
        ym5 ym5Var;
        x45 x45Var;
        Object value2;
        xfa xfaVar;
        Boolean bool;
        Object objM7270b0;
        x45 x45Var2;
        String str8;
        boolean z14;
        LessonMetadata lessonMetadata;
        String str9;
        String str10;
        boolean z15 = z2;
        if (continuationImpl instanceof LessonContentStateHolder$loadLesson$1) {
            lessonContentStateHolder$loadLesson$1 = (LessonContentStateHolder$loadLesson$1) continuationImpl;
            int i5 = lessonContentStateHolder$loadLesson$1.f27878k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lessonContentStateHolder$loadLesson$1.f27878k = i5 - Integer.MIN_VALUE;
            } else {
                lessonContentStateHolder$loadLesson$1 = new LessonContentStateHolder$loadLesson$1(this, continuationImpl);
            }
        } else {
            lessonContentStateHolder$loadLesson$1 = new LessonContentStateHolder$loadLesson$1(this, continuationImpl);
        }
        Object obj2 = lessonContentStateHolder$loadLesson$1.f27876i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = lessonContentStateHolder$loadLesson$1.f27878k;
        xfa xfaVar2 = xfa.f68157a;
        C3244l c3244l = this.f27949o;
        un1 un1Var = this.f27948n;
        C2262a c2262a = this.f27940f;
        if (i6 != 0) {
            if (i6 == 1) {
                z4 = lessonContentStateHolder$loadLesson$1.f27875h;
                z15 = lessonContentStateHolder$loadLesson$1.f27874g;
                z5 = lessonContentStateHolder$loadLesson$1.f27873f;
                i2 = lessonContentStateHolder$loadLesson$1.f27871d;
                str3 = lessonContentStateHolder$loadLesson$1.f27869b;
                str4 = lessonContentStateHolder$loadLesson$1.f27868a;
                AbstractC3193b.m15359b(obj2);
            } else {
                if (i6 == 2) {
                    i4 = lessonContentStateHolder$loadLesson$1.f27872e;
                    boolean z16 = lessonContentStateHolder$loadLesson$1.f27875h;
                    boolean z17 = lessonContentStateHolder$loadLesson$1.f27874g;
                    boolean z18 = lessonContentStateHolder$loadLesson$1.f27873f;
                    i3 = lessonContentStateHolder$loadLesson$1.f27871d;
                    String str11 = lessonContentStateHolder$loadLesson$1.f27868a;
                    AbstractC3193b.m15359b(obj2);
                    z11 = z18;
                    z12 = z17;
                    obj = obj2;
                    z13 = z16;
                    str7 = str11;
                    ym5Var = (ym5) obj;
                    x45Var = (x45) pk9.m19381x(ym5Var);
                    if (x45Var == null) {
                        if (ym5Var instanceof um5) {
                            m9250c((j25) pk9.m19373k(ym5Var), str7, i3);
                        }
                        return xfaVar2;
                    }
                    Lesson lesson = x45Var.f67754a;
                    c2262a.m9257b(x45Var.f67755b);
                    LessonSentencesTranslation lessonSentencesTranslation = lesson.f19151j;
                    while (true) {
                        value2 = c3244l.getValue();
                        xfaVar = xfaVar2;
                        if (c3244l.m15570h(value2, yz4.m25387a((yz4) value2, x45Var.f67754a, x45Var.f67755b, null, null, x45Var.f67756c, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388332))) {
                            break;
                        }
                        xfaVar2 = xfaVar;
                    }
                    bool = lesson.f19161t;
                    lessonContentStateHolder$loadLesson$1.f27868a = str7;
                    lessonContentStateHolder$loadLesson$1.f27869b = null;
                    lessonContentStateHolder$loadLesson$1.f27870c = x45Var;
                    lessonContentStateHolder$loadLesson$1.f27871d = i3;
                    lessonContentStateHolder$loadLesson$1.f27873f = z11;
                    lessonContentStateHolder$loadLesson$1.f27874g = z12;
                    lessonContentStateHolder$loadLesson$1.f27875h = z13;
                    lessonContentStateHolder$loadLesson$1.f27872e = i4;
                    lessonContentStateHolder$loadLesson$1.f27878k = 3;
                    if (bool == null || (objM7270b0 = ((C1295k) this.f27938d.f52215a).m7270b0(i3, true, lessonContentStateHolder$loadLesson$1)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM7270b0 = xfaVar;
                    }
                    if (objM7270b0 != coroutineSingletons) {
                        x45Var2 = x45Var;
                    }
                    return coroutineSingletons;
                }
                if (i6 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x45Var2 = lessonContentStateHolder$loadLesson$1.f27870c;
                str7 = lessonContentStateHolder$loadLesson$1.f27868a;
                AbstractC3193b.m15359b(obj2);
                xfaVar = xfaVar2;
            }
            Lesson lesson2 = x45Var2.f67754a;
            y15 y15Var = (y15) this.f27939e.f65506b;
            str7.getClass();
            lesson2.getClass();
            str8 = lesson2.f19140J;
            if (!cl9.m4834Q(str8, "private", true) || cl9.m4834Q(str8, "D", true)) {
                z14 = true;
            } else {
                z14 = false;
            }
            String strM15223q = AbstractC3184kh.m15223q(str7);
            int i7 = lesson2.f19142a;
            String str12 = lesson2.f19143b;
            String str13 = lesson2.f19159r;
            List list = lesson2.f19133C;
            String str14 = lesson2.f19164w;
            String str15 = lesson2.f19150i;
            int i8 = lesson2.f19149h;
            lessonMetadata = lesson2.f19139I;
            if (lessonMetadata != null) {
                str9 = lessonMetadata.f19235b;
            } else {
                str9 = null;
            }
            if (lessonMetadata != null) {
                str10 = lessonMetadata.f19234a;
            } else {
                str10 = null;
            }
            y15Var.mo48n1(str7, new x65(strM15223q, i7, str12, str13, list, str14, str15, i8, str9, str10, z14));
            y15Var.mo49u1(LessonEngagedDataType.AudioDuration, Integer.valueOf(lesson2.f19148g));
            y15Var.mo47b(new DateTime());
            AbstractC3224d.m15545x(new m83(new C3540rl(c2262a.m9256a(), 5), new LessonContentStateHolder$loadLesson$6(this, null), 2), un1Var);
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(this.f27941g.m17484a(str7)), new LessonContentStateHolder$loadLesson$7(this, null), 2), un1Var);
            AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(((C1368a) this.f27942h.f37455a).f18387Y0), new LessonContentStateHolder$loadLesson$8(this, null), 2), un1Var);
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj2);
        this.f27950p = i;
        if (z15) {
            lessonContentStateHolder$loadLesson$1.f27868a = str;
            lessonContentStateHolder$loadLesson$1.f27869b = str2;
            lessonContentStateHolder$loadLesson$1.f27871d = i;
            lessonContentStateHolder$loadLesson$1.f27873f = z;
            lessonContentStateHolder$loadLesson$1.f27874g = z15;
            lessonContentStateHolder$loadLesson$1.f27875h = z3;
            lessonContentStateHolder$loadLesson$1.f27878k = 1;
            Object objM7045a = this.f27937c.m7045a(lessonContentStateHolder$loadLesson$1);
            if (objM7045a != coroutineSingletons) {
                i2 = i;
                z4 = z3;
                str3 = str2;
                z5 = z;
                str4 = str;
                obj2 = objM7045a;
            }
        } else {
            i2 = i;
            z4 = z3;
            str3 = str2;
            z5 = z;
            str4 = str;
            z7 = z5;
            str5 = str4;
            z8 = z15;
            i3 = i2;
            z9 = z4;
            while (true) {
                value = c3244l.getValue();
                z10 = z6;
                str6 = str5;
                z11 = z7;
                if (c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, z6, false, null, null, null, 0, 0, false, null, str5, AbstractC3184kh.m15194A(str5), z7, null, 0, false, 7469823))) {
                    break;
                }
                z6 = z10 ? 1 : 0;
                z7 = z11;
                str5 = str6;
            }
            pg9Var = this.f27951q;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            str3.getClass();
            this.f27951q = AbstractC3224d.m15545x(new m83(((C1295k) this.f27943i.f52215a).m7259Q(i3, str3), new LessonContentStateHolder$loadLesson$3(this, null), 2), un1Var);
            pg9Var2 = this.f27952r;
            if (pg9Var2 != null) {
                pg9Var2.mo4537a(null);
            }
            this.f27955u = false;
            this.f27954t = null;
            this.f27952r = wfb.m23926u(un1Var, null, null, new LessonContentStateHolder$startBookmarkObserver$1(this, i3, null), 3);
            if (z11) {
                readerBookmarkMode = ReaderBookmarkMode.Sentence;
            } else {
                readerBookmarkMode = ReaderBookmarkMode.Page;
            }
            pg9Var3 = this.f27953s;
            if (pg9Var3 != null) {
                pg9Var3.mo4537a(null);
            }
            this.f27953s = wfb.m23926u(un1Var, null, null, new LessonContentStateHolder$startStoredReaderModeObserver$1(this, i3, readerBookmarkMode, null), 3);
            C3244l c3244l2 = c2262a.f27984e;
            c3244l2.getClass();
            c3244l2.m15572j(null, str6);
            if (z9) {
                ux5.m22977D(z11, c2262a.f27983d, null);
            }
            if (z10) {
                wfb.m23926u(un1Var, null, null, new LessonContentStateHolder$loadLesson$4(this, str6, i3, null), 3);
            }
            lessonContentStateHolder$loadLesson$1.f27868a = str6;
            lessonContentStateHolder$loadLesson$1.f27869b = null;
            lessonContentStateHolder$loadLesson$1.f27871d = i3;
            lessonContentStateHolder$loadLesson$1.f27873f = z11;
            lessonContentStateHolder$loadLesson$1.f27874g = z8;
            lessonContentStateHolder$loadLesson$1.f27875h = z9;
            lessonContentStateHolder$loadLesson$1.f27872e = z10 ? 1 : 0;
            lessonContentStateHolder$loadLesson$1.f27878k = 2;
            objM7302v = ((C1295k) this.f27935a.f52215a).m7302v(str6, i3, z10, lessonContentStateHolder$loadLesson$1);
            if (objM7302v != coroutineSingletons) {
                i4 = z10 ? 1 : 0;
                z12 = z8;
                obj = objM7302v;
                z13 = z9;
                str7 = str6;
                ym5Var = (ym5) obj;
                x45Var = (x45) pk9.m19381x(ym5Var);
                if (x45Var == null) {
                    if (ym5Var instanceof um5) {
                        m9250c((j25) pk9.m19373k(ym5Var), str7, i3);
                    }
                    return xfaVar2;
                }
                Lesson lesson3 = x45Var.f67754a;
                c2262a.m9257b(x45Var.f67755b);
                LessonSentencesTranslation lessonSentencesTranslation2 = lesson3.f19151j;
                while (true) {
                    value2 = c3244l.getValue();
                    xfaVar = xfaVar2;
                    if (c3244l.m15570h(value2, yz4.m25387a((yz4) value2, x45Var.f67754a, x45Var.f67755b, null, null, x45Var.f67756c, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388332))) {
                        break;
                        break;
                    }
                    xfaVar2 = xfaVar;
                }
                bool = lesson3.f19161t;
                lessonContentStateHolder$loadLesson$1.f27868a = str7;
                lessonContentStateHolder$loadLesson$1.f27869b = null;
                lessonContentStateHolder$loadLesson$1.f27870c = x45Var;
                lessonContentStateHolder$loadLesson$1.f27871d = i3;
                lessonContentStateHolder$loadLesson$1.f27873f = z11;
                lessonContentStateHolder$loadLesson$1.f27874g = z12;
                lessonContentStateHolder$loadLesson$1.f27875h = z13;
                lessonContentStateHolder$loadLesson$1.f27872e = i4;
                lessonContentStateHolder$loadLesson$1.f27878k = 3;
                if (bool == null) {
                    objM7270b0 = xfaVar;
                } else {
                    objM7270b0 = xfaVar;
                }
                if (objM7270b0 != coroutineSingletons) {
                    x45Var2 = x45Var;
                    Lesson lesson4 = x45Var2.f67754a;
                    y15 y15Var2 = (y15) this.f27939e.f65506b;
                    str7.getClass();
                    lesson4.getClass();
                    str8 = lesson4.f19140J;
                    if (cl9.m4834Q(str8, "private", true)) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    String strM15223q2 = AbstractC3184kh.m15223q(str7);
                    int i9 = lesson4.f19142a;
                    String str16 = lesson4.f19143b;
                    String str17 = lesson4.f19159r;
                    List list2 = lesson4.f19133C;
                    String str18 = lesson4.f19164w;
                    String str19 = lesson4.f19150i;
                    int i10 = lesson4.f19149h;
                    lessonMetadata = lesson4.f19139I;
                    if (lessonMetadata != null) {
                        str9 = lessonMetadata.f19235b;
                    } else {
                        str9 = null;
                    }
                    if (lessonMetadata != null) {
                        str10 = lessonMetadata.f19234a;
                    } else {
                        str10 = null;
                    }
                    y15Var2.mo48n1(str7, new x65(strM15223q2, i9, str16, str17, list2, str18, str19, i10, str9, str10, z14));
                    y15Var2.mo49u1(LessonEngagedDataType.AudioDuration, Integer.valueOf(lesson4.f19148g));
                    y15Var2.mo47b(new DateTime());
                    AbstractC3224d.m15545x(new m83(new C3540rl(c2262a.m9256a(), 5), new LessonContentStateHolder$loadLesson$6(this, null), 2), un1Var);
                    AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(this.f27941g.m17484a(str7)), new LessonContentStateHolder$loadLesson$7(this, null), 2), un1Var);
                    AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(((C1368a) this.f27942h.f37455a).f18387Y0), new LessonContentStateHolder$loadLesson$8(this, null), 2), un1Var);
                    return xfaVar;
                }
            }
        }
        return coroutineSingletons;
        z6 = ((Boolean) obj2).booleanValue();
        z7 = z5;
        str5 = str4;
        z8 = z15;
        i3 = i2;
        z9 = z4;
        while (true) {
            value = c3244l.getValue();
            z10 = z6;
            str6 = str5;
            z11 = z7;
            if (c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, z6, false, null, null, null, 0, 0, false, null, str5, AbstractC3184kh.m15194A(str5), z7, null, 0, false, 7469823))) {
                break;
                break;
            }
            z6 = z10 ? 1 : 0;
            z7 = z11;
            str5 = str6;
        }
        pg9Var = this.f27951q;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        str3.getClass();
        this.f27951q = AbstractC3224d.m15545x(new m83(((C1295k) this.f27943i.f52215a).m7259Q(i3, str3), new LessonContentStateHolder$loadLesson$3(this, null), 2), un1Var);
        pg9Var2 = this.f27952r;
        if (pg9Var2 != null) {
            pg9Var2.mo4537a(null);
        }
        this.f27955u = false;
        this.f27954t = null;
        this.f27952r = wfb.m23926u(un1Var, null, null, new LessonContentStateHolder$startBookmarkObserver$1(this, i3, null), 3);
        if (z11) {
            readerBookmarkMode = ReaderBookmarkMode.Sentence;
        } else {
            readerBookmarkMode = ReaderBookmarkMode.Page;
        }
        pg9Var3 = this.f27953s;
        if (pg9Var3 != null) {
            pg9Var3.mo4537a(null);
        }
        this.f27953s = wfb.m23926u(un1Var, null, null, new LessonContentStateHolder$startStoredReaderModeObserver$1(this, i3, readerBookmarkMode, null), 3);
        C3244l c3244l3 = c2262a.f27984e;
        c3244l3.getClass();
        c3244l3.m15572j(null, str6);
        if (z9) {
            ux5.m22977D(z11, c2262a.f27983d, null);
        }
        if (z10) {
            wfb.m23926u(un1Var, null, null, new LessonContentStateHolder$loadLesson$4(this, str6, i3, null), 3);
        }
        lessonContentStateHolder$loadLesson$1.f27868a = str6;
        lessonContentStateHolder$loadLesson$1.f27869b = null;
        lessonContentStateHolder$loadLesson$1.f27871d = i3;
        lessonContentStateHolder$loadLesson$1.f27873f = z11;
        lessonContentStateHolder$loadLesson$1.f27874g = z8;
        lessonContentStateHolder$loadLesson$1.f27875h = z9;
        lessonContentStateHolder$loadLesson$1.f27872e = z10 ? 1 : 0;
        lessonContentStateHolder$loadLesson$1.f27878k = 2;
        objM7302v = ((C1295k) this.f27935a.f52215a).m7302v(str6, i3, z10, lessonContentStateHolder$loadLesson$1);
        if (objM7302v != coroutineSingletons) {
            i4 = z10 ? 1 : 0;
            z12 = z8;
            obj = objM7302v;
            z13 = z9;
            str7 = str6;
            ym5Var = (ym5) obj;
            x45Var = (x45) pk9.m19381x(ym5Var);
            if (x45Var == null) {
                if (ym5Var instanceof um5) {
                    m9250c((j25) pk9.m19373k(ym5Var), str7, i3);
                }
                return xfaVar2;
            }
            Lesson lesson5 = x45Var.f67754a;
            c2262a.m9257b(x45Var.f67755b);
            LessonSentencesTranslation lessonSentencesTranslation3 = lesson5.f19151j;
            while (true) {
                value2 = c3244l.getValue();
                xfaVar = xfaVar2;
                if (c3244l.m15570h(value2, yz4.m25387a((yz4) value2, x45Var.f67754a, x45Var.f67755b, null, null, x45Var.f67756c, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388332))) {
                    break;
                    break;
                }
                xfaVar2 = xfaVar;
            }
            bool = lesson5.f19161t;
            lessonContentStateHolder$loadLesson$1.f27868a = str7;
            lessonContentStateHolder$loadLesson$1.f27869b = null;
            lessonContentStateHolder$loadLesson$1.f27870c = x45Var;
            lessonContentStateHolder$loadLesson$1.f27871d = i3;
            lessonContentStateHolder$loadLesson$1.f27873f = z11;
            lessonContentStateHolder$loadLesson$1.f27874g = z12;
            lessonContentStateHolder$loadLesson$1.f27875h = z13;
            lessonContentStateHolder$loadLesson$1.f27872e = i4;
            lessonContentStateHolder$loadLesson$1.f27878k = 3;
            if (bool == null) {
                objM7270b0 = xfaVar;
            } else {
                objM7270b0 = xfaVar;
            }
            if (objM7270b0 != coroutineSingletons) {
                x45Var2 = x45Var;
                Lesson lesson6 = x45Var2.f67754a;
                y15 y15Var3 = (y15) this.f27939e.f65506b;
                str7.getClass();
                lesson6.getClass();
                str8 = lesson6.f19140J;
                if (cl9.m4834Q(str8, "private", true)) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                String strM15223q3 = AbstractC3184kh.m15223q(str7);
                int i11 = lesson6.f19142a;
                String str110 = lesson6.f19143b;
                String str111 = lesson6.f19159r;
                List list3 = lesson6.f19133C;
                String str112 = lesson6.f19164w;
                String str113 = lesson6.f19150i;
                int i12 = lesson6.f19149h;
                lessonMetadata = lesson6.f19139I;
                if (lessonMetadata != null) {
                    str9 = lessonMetadata.f19235b;
                } else {
                    str9 = null;
                }
                if (lessonMetadata != null) {
                    str10 = lessonMetadata.f19234a;
                } else {
                    str10 = null;
                }
                y15Var3.mo48n1(str7, new x65(strM15223q3, i11, str110, str111, list3, str112, str113, i12, str9, str10, z14));
                y15Var3.mo49u1(LessonEngagedDataType.AudioDuration, Integer.valueOf(lesson6.f19148g));
                y15Var3.mo47b(new DateTime());
                AbstractC3224d.m15545x(new m83(new C3540rl(c2262a.m9256a(), 5), new LessonContentStateHolder$loadLesson$6(this, null), 2), un1Var);
                AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(this.f27941g.m17484a(str7)), new LessonContentStateHolder$loadLesson$7(this, null), 2), un1Var);
                AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(((C1368a) this.f27942h.f37455a).f18387Y0), new LessonContentStateHolder$loadLesson$8(this, null), 2), un1Var);
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f */
    public final Object m9253f(int i, ContinuationImpl continuationImpl) throws Throwable {
        LessonContentStateHolder$persistBookmarkLocally$1 lessonContentStateHolder$persistBookmarkLocally$1;
        C2260a c2260a = this;
        if (continuationImpl instanceof LessonContentStateHolder$persistBookmarkLocally$1) {
            lessonContentStateHolder$persistBookmarkLocally$1 = (LessonContentStateHolder$persistBookmarkLocally$1) continuationImpl;
            int i2 = lessonContentStateHolder$persistBookmarkLocally$1.f27893c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonContentStateHolder$persistBookmarkLocally$1.f27893c = i2 - Integer.MIN_VALUE;
            } else {
                lessonContentStateHolder$persistBookmarkLocally$1 = new LessonContentStateHolder$persistBookmarkLocally$1(c2260a, continuationImpl);
            }
        } else {
            lessonContentStateHolder$persistBookmarkLocally$1 = new LessonContentStateHolder$persistBookmarkLocally$1(c2260a, continuationImpl);
        }
        Object objM9381a = lessonContentStateHolder$persistBookmarkLocally$1.f27891a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonContentStateHolder$persistBookmarkLocally$1.f27893c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM9381a);
            int i4 = c2260a.f27950p;
            lessonContentStateHolder$persistBookmarkLocally$1.f27893c = 1;
            objM9381a = c2260a.f27947m.m9381a(i4, i, lessonContentStateHolder$persistBookmarkLocally$1);
            if (objM9381a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM9381a);
        }
        LessonBookmark lessonBookmark = (LessonBookmark) objM9381a;
        while (true) {
            C3244l c3244l = c2260a.f27949o;
            Object value = c3244l.getValue();
            if (c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, lessonBookmark, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388591))) {
                return xfa.f68157a;
            }
            c2260a = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: g */
    public final Object m9254g(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LessonContentStateHolder$refreshLesson$1 lessonContentStateHolder$refreshLesson$1;
        Object value;
        Object value2;
        Object value3;
        if (continuationImpl instanceof LessonContentStateHolder$refreshLesson$1) {
            lessonContentStateHolder$refreshLesson$1 = (LessonContentStateHolder$refreshLesson$1) continuationImpl;
            int i2 = lessonContentStateHolder$refreshLesson$1.f27896c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lessonContentStateHolder$refreshLesson$1.f27896c = i2 - Integer.MIN_VALUE;
            } else {
                lessonContentStateHolder$refreshLesson$1 = new LessonContentStateHolder$refreshLesson$1(this, continuationImpl);
            }
        } else {
            lessonContentStateHolder$refreshLesson$1 = new LessonContentStateHolder$refreshLesson$1(this, continuationImpl);
        }
        Object objM7302v = lessonContentStateHolder$refreshLesson$1.f27894a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lessonContentStateHolder$refreshLesson$1.f27896c;
        C3244l c3244l = this.f27949o;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7302v);
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, false, true, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388095)));
            wfb.m23926u(this.f27948n, null, null, new LessonContentStateHolder$refreshLesson$3(this, str, i, null), 3);
            lessonContentStateHolder$refreshLesson$1.f27896c = 1;
            objM7302v = ((C1295k) this.f27935a.f52215a).m7302v(str, i, true, lessonContentStateHolder$refreshLesson$1);
            if (objM7302v == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7302v);
        }
        x45 x45Var = (x45) pk9.m19381x((ym5) objM7302v);
        if (x45Var != null) {
            this.f27940f.m9257b(x45Var.f67755b);
            LessonSentencesTranslation lessonSentencesTranslation = x45Var.f67754a.f19151j;
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, yz4.m25387a((yz4) value3, x45Var.f67754a, x45Var.f67755b, null, null, null, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388092)));
        } else {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, yz4.m25387a((yz4) value2, null, null, null, null, null, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 8388095)));
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: h */
    public final void m9255h(int i) {
        C3244l c3244l;
        Object value;
        yz4 yz4VarM25387a;
        do {
            c3244l = this.f27949o;
            value = c3244l.getValue();
            yz4VarM25387a = (yz4) value;
            if (yz4VarM25387a.f70680n != i) {
                yz4VarM25387a = yz4.m25387a(yz4VarM25387a, null, null, null, null, null, null, false, null, false, false, null, null, null, i, 0, false, null, null, false, false, null, 0, false, 8380415);
            }
        } while (!c3244l.m15570h(value, yz4VarM25387a));
    }
}
