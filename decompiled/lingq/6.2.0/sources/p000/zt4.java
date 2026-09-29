package p000;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.foundation.R$id;
import androidx.compose.p002ui.layout.AbstractC0337d;
import androidx.compose.p002ui.layout.C0345l;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.R$string;
import com.lingq.core.achievements.AbstractC1234a;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import com.lingq.p020ui.C2889e;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import p000.af6;
import p000.h24;
import p000.lda;
import p000.qe6;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zt4 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f72146b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f72147c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f72148d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f72149e;

    public /* synthetic */ zt4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f72145a = i;
        this.f72146b = obj;
        this.f72147c = obj2;
        this.f72148d = obj3;
        this.f72149e = obj4;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e16 e16VarMo3161g;
        String strM23620a0;
        int i = this.f72145a;
        xfa xfaVar = xfa.f68157a;
        final int i2 = 8;
        p84 p84Var = we1.f66679a;
        Object obj4 = this.f72149e;
        Object obj5 = this.f72148d;
        Object obj6 = this.f72147c;
        Object obj7 = this.f72146b;
        final int i3 = 0;
        switch (i) {
            case 0:
                lu4 lu4Var = (lu4) obj7;
                e16 e16Var = (e16) obj6;
                bu4 bu4Var = (bu4) obj5;
                t66 t66Var = (t66) obj4;
                fl8 fl8Var = (fl8) obj;
                ((Integer) obj3).getClass();
                tj3 tj3Var = (tj3) ((ye1) obj2);
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new xt4(fl8Var, new kb0(3, t66Var));
                    tj3Var.m22131l0(objM22097O);
                }
                xt4 xt4Var = (xt4) objM22097O;
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    bl2 bl2Var = new bl2();
                    bl2Var.f8655a = xt4Var;
                    d66 d66Var = hp6.f42737a;
                    bl2Var.f8656b = new d66();
                    objM22097O2 = new C0345l(bl2Var);
                    tj3Var.m22131l0(objM22097O2);
                }
                C0345l c0345l = (C0345l) objM22097O2;
                if (lu4Var != null) {
                    tj3Var.m22111b0(1743490539);
                    tj3Var.m22111b0(887527095);
                    Object obj8 = hj7.f42493a;
                    if (obj8 != null) {
                        tj3Var.m22111b0(1345554384);
                    } else {
                        tj3Var.m22111b0(1345603457);
                        View view = (View) tj3Var.m22128k(AbstractC0394f.f4765f);
                        boolean zM22120g = tj3Var.m22120g(view);
                        Object objM22097O3 = tj3Var.m22097O();
                        if (zM22120g || objM22097O3 == p84Var) {
                            Object tag = view.getTag(R$id.compose_prefetch_scheduler);
                            fj7 fj7Var = tag instanceof fj7 ? (fj7) tag : null;
                            if (fj7Var == null) {
                                ViewOnAttachStateChangeListenerC0813bk viewOnAttachStateChangeListenerC0813bk = new ViewOnAttachStateChangeListenerC0813bk(view);
                                view.setTag(R$id.compose_prefetch_scheduler, viewOnAttachStateChangeListenerC0813bk);
                                objM22097O3 = viewOnAttachStateChangeListenerC0813bk;
                            } else {
                                objM22097O3 = fj7Var;
                            }
                            tj3Var.m22131l0(objM22097O3);
                        }
                        obj8 = (fj7) objM22097O3;
                    }
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(false);
                    Object[] objArr = {lu4Var, xt4Var, c0345l, obj8};
                    boolean zM22120g2 = tj3Var.m22120g(lu4Var) | tj3Var.m22124i(xt4Var) | tj3Var.m22124i(c0345l) | tj3Var.m22124i(obj8);
                    Object objM22097O4 = tj3Var.m22097O();
                    if (zM22120g2 || objM22097O4 == p84Var) {
                        C3615tl c3615tl = new C3615tl(lu4Var, xt4Var, c0345l, obj8, 5);
                        tj3Var.m22131l0(c3615tl);
                        objM22097O4 = c3615tl;
                    }
                    d32.m10045j(objArr, (vi3) objM22097O4, tj3Var);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1744076749);
                    tj3Var.m22139q(false);
                }
                int i4 = mu4.f51851a;
                if (lu4Var != null && (e16VarMo3161g = e16Var.mo3161g(new rba(lu4Var))) != null) {
                    e16Var = e16VarMo3161g;
                }
                boolean zM22120g3 = tj3Var.m22120g(xt4Var) | tj3Var.m22120g(bu4Var);
                Object objM22097O5 = tj3Var.m22097O();
                if (zM22120g3 || objM22097O5 == p84Var) {
                    objM22097O5 = new C3794yf(11, xt4Var, bu4Var);
                    tj3Var.m22131l0(objM22097O5);
                }
                AbstractC0337d.m1487b(c0345l, e16Var, (zi3) objM22097O5, tj3Var, 8);
                return xfaVar;
            default:
                final h24 h24Var = (h24) obj7;
                final C2889e c2889e = (C2889e) obj6;
                Context context = (Context) obj5;
                hm5 hm5Var = (hm5) obj4;
                ye1 ye1Var = (ye1) obj2;
                ((Integer) obj3).getClass();
                C3549ru c3549ru = eh0.f37237c;
                ((InterfaceC0067f) obj).getClass();
                if (h24Var == null) {
                    tj3 tj3Var2 = (tj3) ye1Var;
                    tj3Var2.m22111b0(1086910992);
                    tj3Var2.m22139q(false);
                } else {
                    List list = h24Var.f41698d;
                    InAppNotificationType inAppNotificationType = h24Var.f41695a;
                    Object obj9 = h24Var.f41699e;
                    tj3 tj3Var3 = (tj3) ye1Var;
                    tj3Var3.m22111b0(1086910993);
                    int i5 = bn6.f8716a[inAppNotificationType.ordinal()];
                    final int i6 = 10;
                    final int i7 = 1;
                    String strM23620a1 = "";
                    EmptyList emptyList = EmptyList.f47638a;
                    switch (i5) {
                        case 1:
                            tj3Var3.m22111b0(-2098349462);
                            String str = h24Var.f41696b;
                            strM23620a1 = str != null ? str : "";
                            List list2 = list == null ? emptyList : list;
                            C3549ru c3549ru2 = eh0.f37236b;
                            boolean zM22124i = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O6 = tj3Var3.m22097O();
                            if (zM22124i || objM22097O6 == p84Var) {
                                objM22097O6 = new vi3() { // from class: com.lingq.ui.f
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj10) {
                                        int i8 = i7;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        InAppNotificationAction inAppNotificationAction = (InAppNotificationAction) obj10;
                                        switch (i8) {
                                            case 0:
                                                inAppNotificationAction.getClass();
                                                c2889e2.getClass();
                                                wfb.m23926u(lda.m16103C(c2889e2), c2889e2.f34219u, null, new MainViewModel$seenWordsKnownNotification$1(c2889e2, null), 2);
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                inAppNotificationAction.getClass();
                                                c2889e2.mo7005P1(h24Var2);
                                                Object obj11 = h24Var2.f41699e;
                                                String str2 = obj11 instanceof String ? (String) obj11 : null;
                                                if (str2 != null) {
                                                    wfb.m23926u(lda.m16103C(c2889e2), c2889e2.f34219u, null, new MainViewModel$setIgnoreTimestamp$1(c2889e2, str2, inAppNotificationAction == InAppNotificationAction.Yes, null), 2);
                                                }
                                                if (inAppNotificationAction == InAppNotificationAction.AdjustSettings) {
                                                    c2889e2.f34205g.mo8243R1(new qe6(af6.f585a));
                                                }
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O6);
                            }
                            vi3 vi3Var = (vi3) objM22097O6;
                            boolean zM22124i2 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O7 = tj3Var3.m22097O();
                            if (zM22124i2 || objM22097O7 == p84Var) {
                                objM22097O7 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i8 = i7;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i8) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O7);
                            }
                            r7d.m20437a(null, strM23620a1, "", list2, c3549ru2, vi3Var, (ui3) objM22097O7, tj3Var3, 24960);
                            tj3Var3.m22139q(false);
                            break;
                        case 2:
                        case 3:
                            tj3Var3.m22111b0(-2096917913);
                            InAppNotificationType inAppNotificationType2 = InAppNotificationType.ReSplitInProgress;
                            if (inAppNotificationType == inAppNotificationType2) {
                                tj3Var3.m22111b0(-2096799152);
                                strM23620a0 = vz1.m23620a0(tj3Var3, R$string.lesson_resplitting);
                                tj3Var3.m22139q(false);
                            } else {
                                tj3Var3.m22111b0(-2096694775);
                                strM23620a0 = vz1.m23620a0(tj3Var3, R$string.lesson_resplitting_failed);
                                tj3Var3.m22139q(false);
                            }
                            String str2 = strM23620a0;
                            if (inAppNotificationType == inAppNotificationType2) {
                                tj3Var3.m22111b0(-2096483541);
                                strM23620a1 = vz1.m23620a0(tj3Var3, R$string.lesson_spliting_message);
                                tj3Var3.m22139q(false);
                            } else {
                                tj3Var3.m22111b0(-2096375847);
                                tj3Var3.m22139q(false);
                            }
                            String str3 = strM23620a1;
                            List listM23604J = vz1.m23604J(InAppNotificationAction.Close);
                            boolean zM22124i3 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O8 = tj3Var3.m22097O();
                            if (zM22124i3 || objM22097O8 == p84Var) {
                                objM22097O8 = new vi3() { // from class: zm6
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj10) {
                                        int i8 = i3;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        InAppNotificationAction inAppNotificationAction = (InAppNotificationAction) obj10;
                                        switch (i8) {
                                            case 0:
                                                inAppNotificationAction.getClass();
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                inAppNotificationAction.getClass();
                                                c2889e2.mo7005P1(h24Var2);
                                                if (inAppNotificationAction == InAppNotificationAction.Reload) {
                                                    c2889e2.f34204f.mo7001A1(inAppNotificationAction);
                                                }
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O8);
                            }
                            vi3 vi3Var2 = (vi3) objM22097O8;
                            boolean zM22124i4 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O9 = tj3Var3.m22097O();
                            if (zM22124i4 || objM22097O9 == p84Var) {
                                final int i8 = 2;
                                objM22097O9 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i9 = i8;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i9) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O9);
                            }
                            r7d.m20437a(null, str2, str3, listM23604J, c3549ru, vi3Var2, (ui3) objM22097O9, tj3Var3, 27648);
                            tj3Var3.m22139q(false);
                            break;
                        case 4:
                            tj3Var3.m22111b0(-2095770169);
                            String strM23620a2 = vz1.m23620a0(tj3Var3, R$string.lesson_resplitting_completed);
                            List listM23605K = vz1.m23605K(InAppNotificationAction.Close, InAppNotificationAction.Reload);
                            boolean zM22124i5 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O10 = tj3Var3.m22097O();
                            if (zM22124i5 || objM22097O10 == p84Var) {
                                objM22097O10 = new vi3() { // from class: zm6
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj10) {
                                        int i9 = i7;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        InAppNotificationAction inAppNotificationAction = (InAppNotificationAction) obj10;
                                        switch (i9) {
                                            case 0:
                                                inAppNotificationAction.getClass();
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                inAppNotificationAction.getClass();
                                                c2889e2.mo7005P1(h24Var2);
                                                if (inAppNotificationAction == InAppNotificationAction.Reload) {
                                                    c2889e2.f34204f.mo7001A1(inAppNotificationAction);
                                                }
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O10);
                            }
                            vi3 vi3Var3 = (vi3) objM22097O10;
                            boolean zM22124i6 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O11 = tj3Var3.m22097O();
                            if (zM22124i6 || objM22097O11 == p84Var) {
                                final int i9 = 3;
                                objM22097O11 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i10 = i9;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i10) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O11);
                            }
                            r7d.m20437a(null, strM23620a2, "", listM23605K, c3549ru, vi3Var3, (ui3) objM22097O11, tj3Var3, 28032);
                            tj3Var3.m22139q(false);
                            break;
                        case 5:
                            tj3Var3.m22111b0(-2094801605);
                            obj9.getClass();
                            int iIntValue = ((Integer) obj9).intValue();
                            boolean zM22124i7 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O12 = tj3Var3.m22097O();
                            if (zM22124i7 || objM22097O12 == p84Var) {
                                final int i10 = 4;
                                objM22097O12 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i11 = i10;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i11) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O12);
                            }
                            t4d.m21843d(iIntValue, 0, tj3Var3, (ui3) objM22097O12, null);
                            tj3Var3.m22139q(false);
                            break;
                        case 6:
                            tj3Var3.m22111b0(-2094510701);
                            obj9.getClass();
                            String str4 = String.format(Locale.getDefault(), vz1.m23620a0(tj3Var3, R$string.known_words_moved_title), Arrays.copyOf(new Object[]{(Integer) obj9}, 1));
                            String strM23620a3 = vz1.m23620a0(tj3Var3, R$string.known_words_moved_message);
                            List list3 = list == null ? emptyList : list;
                            boolean zM22124i8 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O13 = tj3Var3.m22097O();
                            if (zM22124i8 || objM22097O13 == p84Var) {
                                objM22097O13 = new vi3() { // from class: com.lingq.ui.f
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj10) {
                                        int i11 = i3;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        InAppNotificationAction inAppNotificationAction = (InAppNotificationAction) obj10;
                                        switch (i11) {
                                            case 0:
                                                inAppNotificationAction.getClass();
                                                c2889e2.getClass();
                                                wfb.m23926u(lda.m16103C(c2889e2), c2889e2.f34219u, null, new MainViewModel$seenWordsKnownNotification$1(c2889e2, null), 2);
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                inAppNotificationAction.getClass();
                                                c2889e2.mo7005P1(h24Var2);
                                                Object obj11 = h24Var2.f41699e;
                                                String str5 = obj11 instanceof String ? (String) obj11 : null;
                                                if (str5 != null) {
                                                    wfb.m23926u(lda.m16103C(c2889e2), c2889e2.f34219u, null, new MainViewModel$setIgnoreTimestamp$1(c2889e2, str5, inAppNotificationAction == InAppNotificationAction.Yes, null), 2);
                                                }
                                                if (inAppNotificationAction == InAppNotificationAction.AdjustSettings) {
                                                    c2889e2.f34205g.mo8243R1(new qe6(af6.f585a));
                                                }
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O13);
                            }
                            vi3 vi3Var4 = (vi3) objM22097O13;
                            boolean zM22124i9 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O14 = tj3Var3.m22097O();
                            if (zM22124i9 || objM22097O14 == p84Var) {
                                final int i11 = 5;
                                objM22097O14 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i12 = i11;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i12) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O14);
                            }
                            r7d.m20437a(null, str4, strM23620a3, list3, c3549ru, vi3Var4, (ui3) objM22097O14, tj3Var3, 24576);
                            tj3Var3.m22139q(false);
                            break;
                        case 7:
                        case 8:
                            tj3Var3.m22111b0(-2093449199);
                            obj9.getClass();
                            ty1 ty1Var = (ty1) obj9;
                            boolean zM22124i10 = tj3Var3.m22124i(context) | tj3Var3.m22124i(ty1Var) | tj3Var3.m22124i(c2889e);
                            Object objM22097O15 = tj3Var3.m22097O();
                            if (zM22124i10 || objM22097O15 == p84Var) {
                                objM22097O15 = new C3485q5(context, ty1Var, c2889e, 28);
                                tj3Var3.m22131l0(objM22097O15);
                            }
                            vi3 vi3Var5 = (vi3) objM22097O15;
                            boolean zM22124i11 = tj3Var3.m22124i(hm5Var);
                            Object objM22097O16 = tj3Var3.m22097O();
                            if (zM22124i11 || objM22097O16 == p84Var) {
                                objM22097O16 = new hz4(hm5Var, 10);
                                tj3Var3.m22131l0(objM22097O16);
                            }
                            ui3 ui3Var = (ui3) objM22097O16;
                            boolean zM22124i12 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O17 = tj3Var3.m22097O();
                            if (zM22124i12 || objM22097O17 == p84Var) {
                                final int i12 = 6;
                                objM22097O17 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i13 = i12;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i13) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O17);
                            }
                            ui3 ui3Var2 = (ui3) objM22097O17;
                            boolean zM22124i13 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O18 = tj3Var3.m22097O();
                            if (zM22124i13 || objM22097O18 == p84Var) {
                                final int i13 = 7;
                                objM22097O18 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i14 = i13;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i14) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O18);
                            }
                            AbstractC1234a.m6998a(null, ty1Var, vi3Var5, ui3Var, ui3Var2, (ui3) objM22097O18, tj3Var3, 0);
                            tj3Var3.m22139q(false);
                            break;
                        case 9:
                            tj3Var3.m22111b0(-2091894797);
                            obj9.getClass();
                            Milestone milestone = (Milestone) obj9;
                            boolean zM22124i14 = tj3Var3.m22124i(context) | tj3Var3.m22124i(milestone);
                            Object objM22097O19 = tj3Var3.m22097O();
                            if (zM22124i14 || objM22097O19 == p84Var) {
                                objM22097O19 = new an6(i3, context, milestone);
                                tj3Var3.m22131l0(objM22097O19);
                            }
                            vi3 vi3Var6 = (vi3) objM22097O19;
                            boolean zM22124i15 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O20 = tj3Var3.m22097O();
                            if (zM22124i15 || objM22097O20 == p84Var) {
                                objM22097O20 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i14 = i2;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i14) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O20);
                            }
                            ui3 ui3Var3 = (ui3) objM22097O20;
                            boolean zM22124i16 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O21 = tj3Var3.m22097O();
                            if (zM22124i16 || objM22097O21 == p84Var) {
                                final int i14 = 9;
                                objM22097O21 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i15 = i14;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i15) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O21);
                            }
                            AbstractC1234a.m7000c(null, milestone, vi3Var6, ui3Var3, (ui3) objM22097O21, tj3Var3, 0);
                            tj3Var3.m22139q(false);
                            break;
                        case 10:
                            tj3Var3.m22111b0(-2091068585);
                            obj9.getClass();
                            fm7 fm7Var = (fm7) obj9;
                            boolean zM22124i17 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O22 = tj3Var3.m22097O();
                            if (zM22124i17 || objM22097O22 == p84Var) {
                                objM22097O22 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i15 = i6;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i15) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O22);
                            }
                            ui3 ui3Var4 = (ui3) objM22097O22;
                            boolean zM22124i18 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var);
                            Object objM22097O23 = tj3Var3.m22097O();
                            if (zM22124i18 || objM22097O23 == p84Var) {
                                objM22097O23 = new ui3() { // from class: ym6
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i15 = i3;
                                        xfa xfaVar2 = xfa.f68157a;
                                        h24 h24Var2 = h24Var;
                                        C2889e c2889e2 = c2889e;
                                        switch (i15) {
                                            case 0:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 1:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 2:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 3:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 4:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 5:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 6:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 7:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            case 8:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                            case 9:
                                                c2889e2.mo7005P1(h24Var2);
                                                break;
                                            default:
                                                c2889e2.mo7014i0(h24Var2);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O23);
                            }
                            ui3 ui3Var5 = (ui3) objM22097O23;
                            boolean zM22124i19 = tj3Var3.m22124i(c2889e) | tj3Var3.m22124i(h24Var) | tj3Var3.m22124i(context);
                            Object objM22097O24 = tj3Var3.m22097O();
                            if (zM22124i19 || objM22097O24 == p84Var) {
                                objM22097O24 = new C3485q5(c2889e, h24Var, context, 27);
                                tj3Var3.m22131l0(objM22097O24);
                            }
                            ghc.m12667a(null, fm7Var, ui3Var4, ui3Var5, (vi3) objM22097O24, tj3Var3, 0);
                            tj3Var3.m22139q(false);
                            break;
                        default:
                            throw ux5.m23001x(tj3Var3, 347957762, false);
                    }
                    tj3Var3.m22139q(false);
                }
                return xfaVar;
        }
    }
}
