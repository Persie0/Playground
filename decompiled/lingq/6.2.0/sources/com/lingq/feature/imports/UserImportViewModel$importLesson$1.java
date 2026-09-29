package com.lingq.feature.imports;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$ImportSource;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.aj3;
import p000.bt2;
import p000.c32;
import p000.c83;
import p000.ct2;
import p000.d65;
import p000.e83;
import p000.fa4;
import p000.i88;
import p000.ika;
import p000.kk8;
import p000.l83;
import p000.m83;
import p000.m88;
import p000.ob1;
import p000.qm7;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$importLesson$1", m4291f = "UserImportViewModel.kt", m4292l = {210, 281}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportViewModel$importLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26101a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2109f f26102b;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportViewModel$importLesson$1$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$importLesson$1$1", m4291f = "UserImportViewModel.kt", m4292l = {218, 228, 238, 216}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21001 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public e83 f26103a;

        /* JADX INFO: renamed from: b */
        public int f26104b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f26105c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ika f26106d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C2109f f26107e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21001(ika ikaVar, C2109f c2109f, Continuation continuation) {
            super(2, continuation);
            this.f26106d = ikaVar;
            this.f26107e = c2109f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21001 c21001 = new C21001(this.f26106d, this.f26107e, continuation);
            c21001.f26105c = obj;
            return c21001;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21001) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:37:0x00da  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:45:0x0107  */
        /* JADX WARN: Code duplicated, block: B:50:0x0122  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        
            if (r0 == r11) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
        
            if (r0 == r11) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0155, code lost:
        
            if (r0 == r11) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0164, code lost:
        
            if (r10.emit(r0, r8) == r11) goto L56;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ika ikaVar;
            Object next;
            LearningLevel learningLevel;
            Object objM7248F;
            String str;
            byte[] bArr;
            List list;
            Object objM7249G;
            Object objM7250H;
            Lesson lesson;
            C21001 c21001 = this;
            e83 e83Var = (e83) c21001.f26105c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = c21001.f26104b;
            if (i != 0) {
                if (i == 1) {
                    e83Var = c21001.f26103a;
                    AbstractC3193b.m15359b(obj);
                    objM7250H = obj;
                    lesson = (Lesson) objM7250H;
                } else if (i == 2) {
                    e83Var = c21001.f26103a;
                    AbstractC3193b.m15359b(obj);
                    objM7249G = obj;
                    lesson = (Lesson) objM7249G;
                } else if (i == 3) {
                    e83Var = c21001.f26103a;
                    AbstractC3193b.m15359b(obj);
                    objM7248F = obj;
                    c21001 = c21001;
                    lesson = (Lesson) objM7248F;
                } else {
                    if (i != 4) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            Iterator<E> it = LearningLevel.getEntries().iterator();
            do {
                boolean zHasNext = it.hasNext();
                ikaVar = c21001.f26106d;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fa4.m11650l(((LearningLevel) next).getServerName(), ikaVar.f44240d));
            LearningLevel learningLevel2 = (LearningLevel) next;
            if (learningLevel2 == null) {
                learningLevel2 = LearningLevel.Beginner1;
            }
            boolean zM11650l = fa4.m11650l(ikaVar.f44241e, "URL");
            C2109f c2109f = c21001.f26107e;
            if (zM11650l) {
                String str2 = ikaVar.f44242f;
                str2.getClass();
                if (new Regex("^https?://(?:www\\.)?(?:[a-z]+\\.)*(?:youtube\\.com|youtu\\.be)/", RegexOption.IGNORE_CASE).m15423a(str2)) {
                    d65 d65Var = c2109f.f26174f;
                    String str3 = ikaVar.f44237a;
                    String str4 = ikaVar.f44239c;
                    String str5 = ikaVar.f44242f;
                    LearningLevel learningLevel3 = learningLevel2;
                    String strM17131l0 = AbstractC3352my.m17131l0(str5);
                    int i2 = Integer.parseInt(learningLevel3.getServerName());
                    String str6 = ikaVar.f44238b;
                    List list2 = ikaVar.f44245i;
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    Integer num = new Integer(i2);
                    c21001.f26105c = null;
                    c21001.f26103a = e83Var;
                    c21001.f26104b = 1;
                    objM7250H = ((C1295k) d65Var).m7250H(str3, str4, str5, strM17131l0, str6, num, list2, c21001);
                } else {
                    learningLevel = learningLevel2;
                    if (fa4.m11650l(ikaVar.f44241e, "File")) {
                        d65 d65Var2 = c2109f.f26174f;
                        String str7 = ikaVar.f44237a;
                        String str8 = ikaVar.f44238b;
                        String str9 = ikaVar.f44239c;
                        str = ikaVar.f44244h;
                        if (str == null) {
                            str = "";
                        }
                        bArr = (byte[]) c2109f.f26187s.getValue();
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        int i3 = Integer.parseInt(learningLevel.getServerName());
                        list = ikaVar.f44245i;
                        if (list.isEmpty()) {
                            list = null;
                        }
                        c21001.f26105c = null;
                        c21001.f26103a = e83Var;
                        c21001.f26104b = 2;
                        objM7249G = ((C1295k) d65Var2).m7249G(str7, str8, str, str9, bArr, i3, list, c21001);
                    } else {
                        d65 d65Var3 = c2109f.f26174f;
                        String str10 = ikaVar.f44237a;
                        String str11 = ikaVar.f44238b;
                        String str12 = ikaVar.f44242f;
                        String str13 = ikaVar.f44239c;
                        boolean zM11650l2 = fa4.m11650l(ikaVar.f44241e, "URL");
                        int i4 = Integer.parseInt(learningLevel.getServerName());
                        String str14 = ikaVar.f44243g;
                        List list3 = ikaVar.f44245i;
                        c21001.f26105c = null;
                        c21001.f26103a = e83Var;
                        c21001.f26104b = 3;
                        objM7248F = ((C1295k) d65Var3).m7248F(str10, str11, str12, str13, zM11650l2, i4, str14, list3, c21001);
                    }
                }
            } else {
                learningLevel = learningLevel2;
                if (fa4.m11650l(ikaVar.f44241e, "File")) {
                    d65 d65Var4 = c2109f.f26174f;
                    String str15 = ikaVar.f44237a;
                    String str16 = ikaVar.f44238b;
                    String str17 = ikaVar.f44239c;
                    str = ikaVar.f44244h;
                    if (str == null) {
                        str = "";
                    }
                    bArr = (byte[]) c2109f.f26187s.getValue();
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    int i5 = Integer.parseInt(learningLevel.getServerName());
                    list = ikaVar.f44245i;
                    if (list.isEmpty()) {
                        list = null;
                    }
                    c21001.f26105c = null;
                    c21001.f26103a = e83Var;
                    c21001.f26104b = 2;
                    objM7249G = ((C1295k) d65Var4).m7249G(str15, str16, str, str17, bArr, i5, list, c21001);
                } else {
                    d65 d65Var5 = c2109f.f26174f;
                    String str18 = ikaVar.f44237a;
                    String str19 = ikaVar.f44238b;
                    String str110 = ikaVar.f44242f;
                    String str111 = ikaVar.f44239c;
                    boolean zM11650l3 = fa4.m11650l(ikaVar.f44241e, "URL");
                    int i6 = Integer.parseInt(learningLevel.getServerName());
                    String str112 = ikaVar.f44243g;
                    List list4 = ikaVar.f44245i;
                    c21001.f26105c = null;
                    c21001.f26103a = e83Var;
                    c21001.f26104b = 3;
                    objM7248F = ((C1295k) d65Var5).m7248F(str18, str19, str110, str111, zM11650l3, i6, str112, list4, c21001);
                }
            }
            c21001 = c21001;
            return coroutineSingletons;
            c21001.f26105c = null;
            c21001.f26103a = null;
            c21001.f26104b = 4;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportViewModel$importLesson$1$2 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$importLesson$1$2", m4291f = "UserImportViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21012 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2109f f26108a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21012(C2109f c2109f, Continuation continuation) {
            super(2, continuation);
            this.f26108a = c2109f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21012(this.f26108a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21012 c21012 = (C21012) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21012.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f26108a.f26184p;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportViewModel$importLesson$1$3 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$importLesson$1$3", m4291f = "UserImportViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21023 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Throwable f26109a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2109f f26110b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21023(C2109f c2109f, Continuation continuation) {
            super(3, continuation);
            this.f26110b = c2109f;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C21023 c21023 = new C21023(this.f26110b, (Continuation) obj3);
            c21023.f26109a = (Throwable) obj2;
            xfa xfaVar = xfa.f68157a;
            c21023.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            String strM16682n;
            Object value2;
            Object value3;
            Object value4;
            m88 m88Var;
            Throwable th = this.f26109a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2109f c2109f = this.f26110b;
            C3244l c3244l = c2109f.f26184p;
            C3244l c3244l2 = c2109f.f26185q;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            if (th instanceof HttpException) {
                ob1 ob1Var = c2109f.f26177i;
                i88 i88Var = ((HttpException) th).f59170b;
                if (i88Var == null || (m88Var = i88Var.f43691c) == null || (strM16682n = m88Var.m16682n()) == null) {
                    strM16682n = "";
                }
                ob1Var.getClass();
                String strM17887e = ob1.m17887e(strM16682n);
                Integer num = i88Var != null ? new Integer(i88Var.f43689a.f45204d) : null;
                if (num != null && num.intValue() == 400) {
                    do {
                        value4 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value4, new bt2(strM17887e == null ? "This video does not have any captions. Please try with a different video." : strM17887e)));
                } else if (num != null && num.intValue() == 413) {
                    do {
                        value3 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value3, new bt2(strM17887e == null ? "File must be less than 200MB in size." : strM17887e)));
                } else {
                    do {
                        value2 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value2, null));
                }
            } else if (th instanceof IOException) {
                do {
                    value = c3244l2.getValue();
                } while (!c3244l2.m15570h(value, ct2.f34512a));
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportViewModel$importLesson$1$4 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$importLesson$1$4", m4291f = "UserImportViewModel.kt", m4292l = {283, 285, 287}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21034 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public C2109f f26111a;

        /* JADX INFO: renamed from: b */
        public ika f26112b;

        /* JADX INFO: renamed from: c */
        public Lesson f26113c;

        /* JADX INFO: renamed from: d */
        public int f26114d;

        /* JADX INFO: renamed from: e */
        public int f26115e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f26116f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C2109f f26117g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ika f26118h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21034(ika ikaVar, C2109f c2109f, Continuation continuation) {
            super(2, continuation);
            this.f26117g = c2109f;
            this.f26118h = ikaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21034 c21034 = new C21034(this.f26118h, this.f26117g, continuation);
            c21034.f26116f = obj;
            return c21034;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21034) create((Lesson) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0096  */
        /* JADX WARN: Code duplicated, block: B:35:0x00f6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2109f c2109f;
            ika ikaVar;
            int i;
            Lesson lesson;
            int i2;
            Lesson lesson2;
            ika ikaVar2;
            C2109f c2109f2;
            Lesson lesson3;
            C2109f c2109f3;
            String value;
            Lesson lesson4 = (Lesson) this.f26116f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.f26115e;
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                if (lesson4 != null) {
                    c2109f = this.f26117g;
                    qm7 qm7Var = ((C1369b) c2109f.f26175g).f18481n;
                    this.f26116f = lesson4;
                    this.f26111a = c2109f;
                    ikaVar = this.f26118h;
                    this.f26112b = ikaVar;
                    this.f26113c = lesson4;
                    i = 0;
                    this.f26114d = 0;
                    this.f26115e = 1;
                    obj = AbstractC3224d.m15541t(qm7Var, this);
                    if (obj != coroutineSingletons) {
                        lesson = lesson4;
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            }
            if (i3 == 1) {
                i = this.f26114d;
                lesson = this.f26113c;
                ikaVar = this.f26112b;
                c2109f = this.f26111a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i3 == 2) {
                    int i4 = this.f26114d;
                    lesson2 = this.f26113c;
                    ika ikaVar3 = this.f26112b;
                    c2109f2 = this.f26111a;
                    AbstractC3193b.m15359b(obj);
                    i2 = i4;
                    ikaVar2 = ikaVar3;
                    this.f26116f = lesson4;
                    this.f26111a = c2109f2;
                    this.f26112b = ikaVar2;
                    this.f26113c = lesson2;
                    this.f26114d = i2;
                    this.f26115e = 3;
                    if (C2109f.m9015V2(c2109f2, ikaVar2, this) != coroutineSingletons) {
                        lesson3 = lesson2;
                        c2109f3 = c2109f2;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lesson3 = this.f26113c;
                ikaVar2 = this.f26112b;
                c2109f3 = this.f26111a;
                AbstractC3193b.m15359b(obj);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("Lesson ID", lesson4.f19142a);
            bundle.putString("Lesson name", lesson4.f19143b);
            bundle.putString("Lesson language", AbstractC3184kh.m15223q(ikaVar2.f44237a));
            bundle.putString("Lesson level", lesson4.f19159r);
            if (vk9.m23391n0(c2109f3.f26181m.f56384c) || !vk9.m23391n0(c2109f3.f26181m.f56383b)) {
                value = LqAnalyticsValues$ImportSource.Extension.getValue();
            } else {
                value = fa4.m11650l(ikaVar2.f44241e, "Scan") ? LqAnalyticsValues$ImportSource.Ocr.getValue() : LqAnalyticsValues$ImportSource.Lesson.getValue();
            }
            bundle.putString("Import Method", value);
            ((C1240a) c2109f3.f26178j).m7025f("Lesson imported", bundle);
            c2109f3.f26182n.m15571i(lesson3);
            return xfa.f68157a;
            ProfileAccount profileAccount = (ProfileAccount) obj;
            profileAccount.f19687k++;
            this.f26116f = lesson4;
            this.f26111a = c2109f;
            this.f26112b = ikaVar;
            this.f26113c = lesson;
            this.f26114d = i;
            this.f26115e = 2;
            if (c2109f.f26171c.mo4591h0(profileAccount, this) != coroutineSingletons) {
                i2 = i;
                lesson2 = lesson;
                ikaVar2 = ikaVar;
                c2109f2 = c2109f;
                this.f26116f = lesson4;
                this.f26111a = c2109f2;
                this.f26112b = ikaVar2;
                this.f26113c = lesson2;
                this.f26114d = i2;
                this.f26115e = 3;
                if (C2109f.m9015V2(c2109f2, ikaVar2, this) != coroutineSingletons) {
                    lesson3 = lesson2;
                    c2109f3 = c2109f2;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("Lesson ID", lesson4.f19142a);
                    bundle2.putString("Lesson name", lesson4.f19143b);
                    bundle2.putString("Lesson language", AbstractC3184kh.m15223q(ikaVar2.f44237a));
                    bundle2.putString("Lesson level", lesson4.f19159r);
                    if (vk9.m23391n0(c2109f3.f26181m.f56384c)) {
                        value = LqAnalyticsValues$ImportSource.Extension.getValue();
                    } else {
                        value = LqAnalyticsValues$ImportSource.Extension.getValue();
                    }
                    bundle2.putString("Import Method", value);
                    ((C1240a) c2109f3.f26178j).m7025f("Lesson imported", bundle2);
                    c2109f3.f26182n.m15571i(lesson3);
                    return xfa.f68157a;
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$importLesson$1(C2109f c2109f, Continuation continuation) {
        super(2, continuation);
        this.f26102b = c2109f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportViewModel$importLesson$1(this.f26102b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportViewModel$importLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r6, r9, r8) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26101a;
        C2109f c2109f = this.f26102b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarMo4583O1 = c2109f.f26171c.mo4583O1();
            this.f26101a = 1;
            obj = AbstractC3224d.m15541t(c83VarMo4583O1, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        ProfileAccount profileAccount = (ProfileAccount) obj;
        ika ikaVar = (ika) c2109f.f26170b.mo9014u2().getValue();
        if (c2109f.f26171c.mo4598w2() || profileAccount.f19687k < 5) {
            l83 l83Var = new l83(new m83(new kk8(new C21001(ikaVar, c2109f, null)), new C21012(c2109f, null)), new C21023(c2109f, null), 1);
            C21034 c21034 = new C21034(ikaVar, c2109f, null);
            this.f26101a = 2;
        } else {
            c2109f.mo3737M1(UpgradeReason.LIMIT_IMPORTS);
        }
        return xfa.f68157a;
    }
}
