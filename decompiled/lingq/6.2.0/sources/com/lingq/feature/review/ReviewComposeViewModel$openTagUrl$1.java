package com.lingq.feature.review;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.feature.review.state.C2761a;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.c32;
import p000.cl9;
import p000.cma;
import p000.fa4;
import p000.un1;
import p000.ux5;
import p000.vk9;
import p000.wd8;
import p000.wq1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewComposeViewModel$openTagUrl$1", m4291f = "ReviewComposeViewModel.kt", m4292l = {603}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewComposeViewModel$openTagUrl$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31715a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2751b f31716b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewComposeViewModel$openTagUrl$1(C2751b c2751b, String str, Continuation continuation) {
        super(2, continuation);
        this.f31716b = c2751b;
        this.f31717c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewComposeViewModel$openTagUrl$1(this.f31716b, this.f31717c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewComposeViewModel$openTagUrl$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Language language;
        String strM17738m;
        String str2;
        String strM17084C;
        Language language2;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31715a;
        C2751b c2751b = this.f31716b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2761a c2761a = c2751b.f32397e;
            LessonCard lessonCardM9624h = c2761a.m9624h();
            String str4 = lessonCardM9624h != null ? lessonCardM9624h.f19178a : null;
            if (str4 == null) {
                str4 = "";
            }
            this.f31715a = 1;
            obj = c2761a.f32709f.m9599f(c2761a.f32704a.mo4589b2(), str4, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        List list = (List) obj;
        cma cmaVar = c2751b.f32394b;
        cma cmaVar2 = c2751b.f32394b;
        boolean zM11650l = fa4.m11650l(cmaVar.mo4589b2(), LanguageLearn.Japanese.getCode());
        xfa xfaVar = xfa.f68157a;
        String str5 = this.f31717c;
        if (zM11650l) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (cl9.m4834Q((String) it.next(), str5, true)) {
                        if (!AbstractC3352my.m17096O(str5, cmaVar2.mo4589b2())) {
                            str = "en";
                            if (fa4.m11650l(cmaVar2.mo4589b2(), LanguageLearn.Japanese.getCode())) {
                                strM17084C = AbstractC3352my.m17084C(str5);
                                if (vk9.m23391n0(strM17084C)) {
                                    strM17738m = AbstractC3393o1.m17734i("https://cooljugator.com/ja/", URLEncoder.encode(str5, "utf-8"));
                                } else {
                                    language2 = (Language) cmaVar2.mo4572B0().getValue();
                                    if (language2 != null) {
                                        str = str3;
                                    }
                                    strM17738m = wq1.m24119o("https://www.lingq.com/", str, "/grammar-resource/japanese/", strM17084C);
                                }
                            } else {
                                language = (Language) cmaVar2.mo4572B0().getValue();
                                if (language != null) {
                                    str = str2;
                                }
                                strM17738m = AbstractC3393o1.m17738m(ux5.m23000w("https://www.lingq.com/", str, "/grammar-resource/", cmaVar2.mo4589b2(), "/tag/"), str5, "/");
                            }
                            c2751b.m9567Y2(new wd8(strM17738m));
                            break;
                        }
                        break;
                    }
                }
            }
        } else {
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (cl9.m4834Q((String) it2.next(), str5, true)) {
                        str = "en";
                        if (fa4.m11650l(cmaVar2.mo4589b2(), LanguageLearn.Japanese.getCode())) {
                            strM17084C = AbstractC3352my.m17084C(str5);
                            if (vk9.m23391n0(strM17084C)) {
                                language2 = (Language) cmaVar2.mo4572B0().getValue();
                                if (language2 != null && (str3 = language2.f19032i) != null) {
                                    str = str3;
                                }
                                strM17738m = wq1.m24119o("https://www.lingq.com/", str, "/grammar-resource/japanese/", strM17084C);
                            } else {
                                strM17738m = AbstractC3393o1.m17734i("https://cooljugator.com/ja/", URLEncoder.encode(str5, "utf-8"));
                            }
                        } else {
                            language = (Language) cmaVar2.mo4572B0().getValue();
                            if (language != null && (str2 = language.f19032i) != null) {
                                str = str2;
                            }
                            strM17738m = AbstractC3393o1.m17738m(ux5.m23000w("https://www.lingq.com/", str, "/grammar-resource/", cmaVar2.mo4589b2(), "/tag/"), str5, "/");
                        }
                        c2751b.m9567Y2(new wd8(strM17738m));
                        break;
                    }
                }
            }
        }
        return xfaVar;
    }
}
