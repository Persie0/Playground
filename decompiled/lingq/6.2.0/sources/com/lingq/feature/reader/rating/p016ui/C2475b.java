package com.lingq.feature.reader.rating.p016ui;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.onboarding.RatingController;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.ar7;
import p000.br7;
import p000.c18;
import p000.eh9;
import p000.g9a;
import p000.gm5;
import p000.hm5;
import p000.un1;
import p000.vma;
import p000.wfb;
import p000.xfa;
import p000.y02;
import p000.yma;
import p000.yq7;

/* JADX INFO: renamed from: com.lingq.feature.reader.rating.ui.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2475b implements ar7 {

    /* JADX INFO: renamed from: a */
    public final vma f29933a;

    /* JADX INFO: renamed from: b */
    public final hm5 f29934b;

    /* JADX INFO: renamed from: c */
    public final un1 f29935c;

    /* JADX INFO: renamed from: d */
    public final C3244l f29936d;

    /* JADX INFO: renamed from: e */
    public final c18 f29937e;

    public C2475b(vma vmaVar, hm5 hm5Var, un1 un1Var) {
        vmaVar.getClass();
        hm5Var.getClass();
        un1Var.getClass();
        this.f29933a = vmaVar;
        this.f29934b = hm5Var;
        this.f29935c = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new yq7(false, true, false, false));
        this.f29936d = c3244lM17114d;
        this.f29937e = AbstractC3224d.m15524c(c3244lM17114d);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: B2 */
    public final void mo3004B2() {
        ((C1240a) this.f29934b).m7025f("rating submitted", g9a.m12429f("rating", "yes"));
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: C */
    public final void mo3005C() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f29936d;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yq7.m25286a((yq7) value, false, false, false, false, 14)));
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: D2 */
    public final void mo3006D2(String str) {
        C3244l c3244l;
        Object value;
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("feedback", str);
        ((C1240a) this.f29934b).m7025f("feedback submitted", bundle);
        do {
            c3244l = this.f29936d;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yq7.m25286a((yq7) value, false, false, false, false, 14)));
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: G2 */
    public final void mo3007G2(boolean z) {
        while (true) {
            C3244l c3244l = this.f29936d;
            Object value = c3244l.getValue();
            boolean z2 = z;
            if (c3244l.m15570h(value, yq7.m25286a((yq7) value, false, false, true, z2, 2))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: J2 */
    public final void mo3008J2() {
        ((C1240a) this.f29934b).m7025f("love dialog displayed", null);
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: L1 */
    public final void mo3009L1() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f29936d;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yq7.m25286a((yq7) value, false, false, false, false, 11)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r3).m7968h(r12, r0) == r1) goto L25;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9387a(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        RatingsPopupDelegateImpl$showRatingsPopup$1 ratingsPopupDelegateImpl$showRatingsPopup$1;
        C3244l c3244l;
        Object value;
        if (continuationImpl instanceof RatingsPopupDelegateImpl$showRatingsPopup$1) {
            ratingsPopupDelegateImpl$showRatingsPopup$1 = (RatingsPopupDelegateImpl$showRatingsPopup$1) continuationImpl;
            int i = ratingsPopupDelegateImpl$showRatingsPopup$1.f29926d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ratingsPopupDelegateImpl$showRatingsPopup$1.f29926d = i - Integer.MIN_VALUE;
            } else {
                ratingsPopupDelegateImpl$showRatingsPopup$1 = new RatingsPopupDelegateImpl$showRatingsPopup$1(this, continuationImpl);
            }
        } else {
            ratingsPopupDelegateImpl$showRatingsPopup$1 = new RatingsPopupDelegateImpl$showRatingsPopup$1(this, continuationImpl);
        }
        Object objM15541t = ratingsPopupDelegateImpl$showRatingsPopup$1.f29924b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ratingsPopupDelegateImpl$showRatingsPopup$1.f29926d;
        vma vmaVar = this.f29933a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            yma ymaVar = ((C1371d) vmaVar).f18563C;
            ratingsPopupDelegateImpl$showRatingsPopup$1.f29923a = z;
            ratingsPopupDelegateImpl$showRatingsPopup$1.f29926d = 1;
            objM15541t = AbstractC3224d.m15541t(ymaVar, ratingsPopupDelegateImpl$showRatingsPopup$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z = ratingsPopupDelegateImpl$showRatingsPopup$1.f29923a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ratingsPopupDelegateImpl$showRatingsPopup$1.f29923a;
            AbstractC3193b.m15359b(objM15541t);
        }
        boolean z2 = z;
        do {
            c3244l = this.f29936d;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yq7.m25286a((yq7) value, true, z2, false, false, 12)));
        return xfa.f68157a;
        RatingController ratingController = (RatingController) objM15541t;
        if (ratingController.m8108b() == 0) {
            ratingController.m8113g(y02.m24805c());
        }
        ratingController.m8114h(y02.m24805c());
        ratingController.m8112f(ratingController.m8107a() + 1);
        ratingsPopupDelegateImpl$showRatingsPopup$1.f29923a = z;
        ratingsPopupDelegateImpl$showRatingsPopup$1.f29926d = 2;
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: a2 */
    public final eh9 mo3010a2() {
        return this.f29937e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.ar7
    /* JADX INFO: renamed from: e1 */
    public final Object mo3011e1(boolean z, Continuation continuation) throws Throwable {
        RatingsPopupDelegateImpl$lessonCompleted$1 ratingsPopupDelegateImpl$lessonCompleted$1;
        if (continuation instanceof RatingsPopupDelegateImpl$lessonCompleted$1) {
            ratingsPopupDelegateImpl$lessonCompleted$1 = (RatingsPopupDelegateImpl$lessonCompleted$1) continuation;
            int i = ratingsPopupDelegateImpl$lessonCompleted$1.f29922d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ratingsPopupDelegateImpl$lessonCompleted$1.f29922d = i - Integer.MIN_VALUE;
            } else {
                ratingsPopupDelegateImpl$lessonCompleted$1 = new RatingsPopupDelegateImpl$lessonCompleted$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ratingsPopupDelegateImpl$lessonCompleted$1 = new RatingsPopupDelegateImpl$lessonCompleted$1(this, (ContinuationImpl) continuation);
        }
        Object objM15541t = ratingsPopupDelegateImpl$lessonCompleted$1.f29920b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ratingsPopupDelegateImpl$lessonCompleted$1.f29922d;
        xfa xfaVar = xfa.f68157a;
        vma vmaVar = this.f29933a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            yma ymaVar = ((C1371d) vmaVar).f18563C;
            ratingsPopupDelegateImpl$lessonCompleted$1.f29919a = z;
            ratingsPopupDelegateImpl$lessonCompleted$1.f29922d = 1;
            objM15541t = AbstractC3224d.m15541t(ymaVar, ratingsPopupDelegateImpl$lessonCompleted$1);
            if (objM15541t != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = ratingsPopupDelegateImpl$lessonCompleted$1.f29919a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM15541t);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ratingsPopupDelegateImpl$lessonCompleted$1.f29919a;
            AbstractC3193b.m15359b(objM15541t);
        }
        if (z) {
            ratingsPopupDelegateImpl$lessonCompleted$1.f29919a = z;
            ratingsPopupDelegateImpl$lessonCompleted$1.f29922d = 3;
            if (mo3012w1(ratingsPopupDelegateImpl$lessonCompleted$1) == obj) {
                return obj;
            }
        }
        return xfaVar;
        RatingController ratingController = (RatingController) objM15541t;
        ratingController.m8115i(ratingController.m8111e() + 1);
        ratingsPopupDelegateImpl$lessonCompleted$1.f29919a = z;
        ratingsPopupDelegateImpl$lessonCompleted$1.f29922d = 2;
        if (((C1371d) vmaVar).m7968h(ratingController, ratingsPopupDelegateImpl$lessonCompleted$1) != obj) {
            if (z) {
                ratingsPopupDelegateImpl$lessonCompleted$1.f29919a = z;
                ratingsPopupDelegateImpl$lessonCompleted$1.f29922d = 3;
                if (mo3012w1(ratingsPopupDelegateImpl$lessonCompleted$1) == obj) {
                }
            }
            return xfaVar;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.ar7
    /* JADX INFO: renamed from: w1 */
    public final Object mo3012w1(Continuation continuation) throws Throwable {
        RatingsPopupDelegateImpl$tryToShowRatingsPopup$1 ratingsPopupDelegateImpl$tryToShowRatingsPopup$1;
        RatingController ratingController;
        if (continuation instanceof RatingsPopupDelegateImpl$tryToShowRatingsPopup$1) {
            ratingsPopupDelegateImpl$tryToShowRatingsPopup$1 = (RatingsPopupDelegateImpl$tryToShowRatingsPopup$1) continuation;
            int i = ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c = i - Integer.MIN_VALUE;
            } else {
                ratingsPopupDelegateImpl$tryToShowRatingsPopup$1 = new RatingsPopupDelegateImpl$tryToShowRatingsPopup$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ratingsPopupDelegateImpl$tryToShowRatingsPopup$1 = new RatingsPopupDelegateImpl$tryToShowRatingsPopup$1(this, (ContinuationImpl) continuation);
        }
        Object objM15541t = ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29930a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c;
        vma vmaVar = this.f29933a;
        xfa xfaVar = xfa.f68157a;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(objM15541t);
                yma ymaVar = ((C1371d) vmaVar).f18563C;
                ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c = 1;
                objM15541t = AbstractC3224d.m15541t(ymaVar, ratingsPopupDelegateImpl$tryToShowRatingsPopup$1);
                if (objM15541t != obj) {
                    ratingController = (RatingController) objM15541t;
                    if (y02.m24806d(ratingController.m8108b()) < 366 && !ratingController.m8110d()) {
                        RatingController ratingController2 = new RatingController();
                        ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c = 2;
                        if (((C1371d) vmaVar).m7968h(ratingController2, ratingsPopupDelegateImpl$tryToShowRatingsPopup$1) != obj) {
                            return xfaVar;
                        }
                    } else {
                        if (ratingController.m8111e() == 1 || ratingController.m8107a() != 0) {
                            if (!ratingController.m8110d()) {
                                if (y02.m24806d(ratingController.m8108b()) < 7 && ratingController.m8107a() == 1 && ratingController.m8111e() >= 5) {
                                    ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c = 4;
                                    if (m9387a(false, ratingsPopupDelegateImpl$tryToShowRatingsPopup$1) == obj) {
                                    }
                                } else if (y02.m24806d(ratingController.m8109c()) < 7 && ratingController.m8107a() == 2 && ratingController.m8111e() >= 10) {
                                    ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c = 5;
                                    if (m9387a(false, ratingsPopupDelegateImpl$tryToShowRatingsPopup$1) == obj) {
                                    }
                                } else if (y02.m24806d(ratingController.m8109c()) >= 31) {
                                    ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c = 6;
                                    if (m9387a(false, ratingsPopupDelegateImpl$tryToShowRatingsPopup$1) == obj) {
                                    }
                                }
                            }
                            return xfaVar;
                        }
                        ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c = 3;
                        if (m9387a(true, ratingsPopupDelegateImpl$tryToShowRatingsPopup$1) != obj) {
                            return xfaVar;
                        }
                    }
                }
                return obj;
            case 1:
                AbstractC3193b.m15359b(objM15541t);
                ratingController = (RatingController) objM15541t;
                if (y02.m24806d(ratingController.m8108b()) < 366) {
                    break;
                }
                if (ratingController.m8111e() == 1) {
                    break;
                }
                if (!ratingController.m8110d()) {
                    if (y02.m24806d(ratingController.m8108b()) < 7) {
                    }
                    if (y02.m24806d(ratingController.m8109c()) < 7) {
                    }
                    if (y02.m24806d(ratingController.m8109c()) >= 31) {
                        ratingsPopupDelegateImpl$tryToShowRatingsPopup$1.f29932c = 6;
                        if (m9387a(false, ratingsPopupDelegateImpl$tryToShowRatingsPopup$1) == obj) {
                            return obj;
                        }
                    }
                    break;
                }
                return xfaVar;
            case 2:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 3:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 4:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 5:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            case 6:
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: z */
    public final void mo3013z(RatingContentType ratingContentType) {
        String str;
        String str2;
        C3244l c3244l;
        Object value;
        ratingContentType.getClass();
        int[] iArr = br7.f8898a;
        int i = iArr[ratingContentType.ordinal()];
        if (i == 1) {
            str = "love dialog submitted";
        } else if (i == 2) {
            str = "feedback submitted";
        } else {
            if (i != 3) {
                gm5.m12750e();
                return;
            }
            str = "rating submitted";
        }
        int i2 = iArr[ratingContentType.ordinal()];
        if (i2 == 1) {
            str2 = "love";
        } else if (i2 == 2) {
            str2 = "feedback";
        } else {
            if (i2 != 3) {
                gm5.m12750e();
                return;
            }
            str2 = "rating";
        }
        ((C1240a) this.f29934b).m7025f(str, g9a.m12429f(str2, "not now"));
        do {
            c3244l = this.f29936d;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, yq7.m25286a((yq7) value, false, false, false, false, 14)));
    }

    @Override // p000.ar7
    /* JADX INFO: renamed from: z2 */
    public final void mo3014z2(boolean z) {
        wfb.m23926u(this.f29935c, null, null, new RatingsPopupDelegateImpl$thumbSelected$1(this, z, null), 3);
        Bundle bundle = new Bundle();
        bundle.putString("love", z ? "yes" : "no");
        ((C1240a) this.f29934b).m7025f("love dialog submitted", bundle);
    }
}
