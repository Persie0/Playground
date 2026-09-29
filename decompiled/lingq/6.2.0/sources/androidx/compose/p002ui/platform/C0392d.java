package androidx.compose.p002ui.platform;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p002ui.R$string;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0425e;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import androidx.lifecycle.Lifecycle$State;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import p000.AbstractC3122is;
import p000.AbstractC3284l3;
import p000.AbstractC3423or;
import p000.AbstractC3466pn;
import p000.AbstractC3521r3;
import p000.AbstractC3584sr;
import p000.C0019ah;
import p000.C0797b4;
import p000.C3024g3;
import p000.C3321m3;
import p000.C3358n3;
import p000.C3378nn;
import p000.C3386nv;
import p000.C3395o3;
import p000.C3419on;
import p000.C3446p3;
import p000.C3671v3;
import p000.aq4;
import p000.b64;
import p000.bc3;
import p000.bq1;
import p000.ch5;
import p000.d0d;
import p000.d32;
import p000.d66;
import p000.d84;
import p000.dl3;
import p000.e28;
import p000.e71;
import p000.ee5;
import p000.fa4;
import p000.fb2;
import p000.fe5;
import p000.fx1;
import p000.gm5;
import p000.gq6;
import p000.h0d;
import p000.h41;
import p000.he9;
import p000.ho2;
import p000.hp6;
import p000.i54;
import p000.ipa;
import p000.kv8;
import p000.le1;
import p000.lja;
import p000.m58;
import p000.mn8;
import p000.mzc;
import p000.n66;
import p000.omd;
import p000.pe9;
import p000.pvc;
import p000.qn3;
import p000.qzc;
import p000.r56;
import p000.rt9;
import p000.rv8;
import p000.rw9;
import p000.s56;
import p000.sq5;
import p000.ss5;
import p000.szc;
import p000.tm7;
import p000.u91;
import p000.uh8;
import p000.ui3;
import p000.ux5;
import p000.vi3;
import p000.wa3;
import p000.wb3;
import p000.wfb;
import p000.wq1;
import p000.xa3;
import p000.xb3;
import p000.xfa;
import p000.xi3;
import p000.xv9;
import p000.xwc;
import p000.ya3;
import p000.yv9;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0392d extends qn3 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0393e f4722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0392d(ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e) {
        super(5);
        this.f4722g = viewOnAttachStateChangeListenerC0393e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x023c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:213:0x0401  */
    /* JADX WARN: Code duplicated, block: B:214:0x0403  */
    /* JADX WARN: Code duplicated, block: B:217:0x0408  */
    /* JADX WARN: Code duplicated, block: B:218:0x040a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0410  */
    /* JADX WARN: Code duplicated, block: B:222:0x0412  */
    /* JADX WARN: Code duplicated, block: B:225:0x0418  */
    /* JADX WARN: Code duplicated, block: B:226:0x041a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0420  */
    /* JADX WARN: Code duplicated, block: B:230:0x0422  */
    /* JADX WARN: Code duplicated, block: B:233:0x0428  */
    /* JADX WARN: Code duplicated, block: B:234:0x042a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0436  */
    /* JADX WARN: Code duplicated, block: B:248:0x0442  */
    /* JADX WARN: Code duplicated, block: B:251:0x0447  */
    /* JADX WARN: Code duplicated, block: B:253:0x0459  */
    /* JADX WARN: Code duplicated, block: B:255:0x045d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0465  */
    /* JADX WARN: Code duplicated, block: B:258:0x0467  */
    /* JADX WARN: Code duplicated, block: B:262:0x046d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0472  */
    /* JADX WARN: Code duplicated, block: B:267:0x047a  */
    /* JADX WARN: Code duplicated, block: B:269:0x0480  */
    /* JADX WARN: Code duplicated, block: B:272:0x0487  */
    /* JADX WARN: Code duplicated, block: B:274:0x0499  */
    /* JADX WARN: Code duplicated, block: B:276:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:281:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:285:0x04de  */
    /* JADX WARN: Code duplicated, block: B:287:0x04ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:322:0x056a  */
    /* JADX WARN: Code duplicated, block: B:325:0x0577 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x057b  */
    /* JADX WARN: Code duplicated, block: B:328:0x0580  */
    /* JADX WARN: Code duplicated, block: B:330:0x0589 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:331:0x058b  */
    /* JADX WARN: Code duplicated, block: B:334:0x0590  */
    /* JADX WARN: Code duplicated, block: B:337:0x0597  */
    /* JADX WARN: Code duplicated, block: B:339:0x059f  */
    /* JADX WARN: Code duplicated, block: B:346:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:348:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:349:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:351:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:401:0x06a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:404:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:405:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:409:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:411:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:414:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:419:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:432:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:434:0x0704  */
    /* JADX WARN: Code duplicated, block: B:441:0x0716  */
    /* JADX WARN: Code duplicated, block: B:442:0x0720  */
    /* JADX WARN: Code duplicated, block: B:447:0x0759  */
    /* JADX WARN: Code duplicated, block: B:449:0x075f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:450:0x0761  */
    /* JADX WARN: Code duplicated, block: B:451:0x0763  */
    /* JADX WARN: Code duplicated, block: B:454:0x076a  */
    /* JADX WARN: Code duplicated, block: B:455:0x076f  */
    /* JADX WARN: Code duplicated, block: B:458:0x0777  */
    /* JADX WARN: Code duplicated, block: B:460:0x0781  */
    /* JADX WARN: Code duplicated, block: B:472:0x07a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:473:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:474:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:477:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:478:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:481:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:483:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:485:0x07d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:487:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0194, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0057, please report this as an issue */
    @Override // p000.qn3
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1757C(int i, int i2, Bundle bundle) {
        C0423c c0423c;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        Integer num;
        String strM1766t;
        String strM1766t2;
        AbstractC3284l3 abstractC3284l3;
        int iM1790q;
        int[] iArrMo15766k;
        int i5;
        int i6;
        int iM1791r;
        int i7;
        int i8;
        int length;
        C3321m3 c3321m3M17162b;
        C3321m3 c3321m3M12996b;
        rw9 rw9VarM24732E;
        C3395o3 c3395o3M21803b;
        C3358n3 c3358n3M20225b;
        C3446p3 c3446p3M9966b;
        ui3 ui3Var;
        ui3 ui3Var2;
        ui3 ui3Var3;
        ui3 ui3Var4;
        ui3 ui3Var5;
        ui3 ui3Var6;
        ui3 ui3Var7;
        ui3 ui3Var8;
        ui3 ui3Var9;
        vi3 vi3Var;
        long jMo1671R;
        long jFloatToRawIntBits;
        C3024g3 c3024g3;
        vi3 vi3Var2;
        ui3 ui3Var10;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        tm7 tm7Var;
        C3024g3 c3024g4;
        h41 h41Var;
        float f;
        float f2;
        float f3;
        int i9;
        float f4;
        float f5;
        float f6;
        vi3 vi3Var3;
        long jM10804e;
        C3024g3 c3024g5;
        Float f7;
        C3024g3 c3024g6;
        xi3 xi3Var;
        mn8 mn8Var;
        mn8 mn8Var2;
        float fIntBitsToFloat;
        C0427g c0427g;
        C3024g3 c3024g7;
        ui3 ui3Var11;
        ui3 ui3Var12;
        vi3 vi3Var4;
        ui3 ui3Var13;
        ui3 ui3Var14;
        ui3 ui3Var15;
        ui3 ui3Var16;
        CharSequence charSequence;
        List list;
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = this.f4722g;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC0393e.f4752g;
        Float fValueOf = Float.valueOf(0.0f);
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = viewOnAttachStateChangeListenerC0393e.f4746d;
        rv8 rv8Var = (rv8) viewOnAttachStateChangeListenerC0393e.m1792s().m10152b(i);
        if (rv8Var != null && (c0423c = rv8Var.f59881a) != null) {
            C0357g c0357g = c0423c.f4973c;
            int i10 = c0423c.f4976f;
            kv8 kv8Var = c0423c.f4974d;
            Object objM1838a = AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5008o);
            n66 n66Var = kv8Var.f48471a;
            Boolean bool = Boolean.TRUE;
            if (!fa4.m11650l(objM1838a, bool)) {
                if (i2 != 64) {
                    if (accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = viewOnAttachStateChangeListenerC0393e.f4758k) == i) {
                        return false;
                    }
                    if (i3 != Integer.MIN_VALUE) {
                        ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, i3, 65536, null, 12);
                    }
                    viewOnAttachStateChangeListenerC0393e.f4758k = i;
                    viewTreeObserverOnGlobalLayoutListenerC0391c.invalidate();
                    ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, i, 32768, null, 12);
                    return true;
                }
                if (i2 != 128) {
                    if (viewOnAttachStateChangeListenerC0393e.f4758k == i) {
                        return false;
                    }
                    viewOnAttachStateChangeListenerC0393e.f4758k = Integer.MIN_VALUE;
                    viewOnAttachStateChangeListenerC0393e.f4724H = null;
                    viewTreeObserverOnGlobalLayoutListenerC0391c.invalidate();
                    ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, i, 65536, null, 12);
                    return true;
                }
                if (i2 != 256 || i2 == 512) {
                    if (bundle != null) {
                        i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                        z = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                        if (i2 == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        num = viewOnAttachStateChangeListenerC0393e.f4732P;
                        if (num != null || i10 != num.intValue()) {
                            viewOnAttachStateChangeListenerC0393e.f4731O = -1;
                            viewOnAttachStateChangeListenerC0393e.f4732P = Integer.valueOf(i10);
                        }
                        strM1766t = ViewOnAttachStateChangeListenerC0393e.m1766t(c0423c);
                        if (strM1766t != null && strM1766t.length() != 0) {
                            strM1766t2 = ViewOnAttachStateChangeListenerC0393e.m1766t(c0423c);
                            if (strM1766t2 != null || strM1766t2.length() == 0) {
                                abstractC3284l3 = null;
                            } else if (i4 == 1) {
                                c3321m3M17162b = mzc.m17162b(viewTreeObserverOnGlobalLayoutListenerC0391c.getContext().getResources().getConfiguration().locale);
                                c3321m3M17162b.mo15764i(strM1766t2);
                            } else if (i4 == 2) {
                                c3321m3M12996b = h0d.m12996b(viewTreeObserverOnGlobalLayoutListenerC0391c.getContext().getResources().getConfiguration().locale);
                                c3321m3M12996b.mo15764i(strM1766t2);
                            } else if (i4 == 4) {
                                if (n66Var.m17251c(AbstractC0421a.f4945a) || (rw9VarM24732E = xwc.m24732E(kv8Var)) == null) {
                                    abstractC3284l3 = null;
                                } else if (i4 == 4) {
                                    C3358n3 c3358n3 = C3358n3.f52247d;
                                    c3358n3M20225b = qzc.m20225b();
                                    c3358n3M20225b.m17198n(strM1766t2, rw9VarM24732E);
                                } else {
                                    C3395o3 c3395o3 = C3395o3.f53748e;
                                    c3395o3M21803b = szc.m21803b();
                                    c3395o3M21803b.m17773n(strM1766t2, rw9VarM24732E, c0423c);
                                }
                            } else if (i4 == 8) {
                                c3446p3M9966b = d0d.m9966b();
                                c3446p3M9966b.mo15764i(strM1766t2);
                            } else if (i4 != 16) {
                                abstractC3284l3 = null;
                            } else if (n66Var.m17251c(AbstractC0421a.f4945a)) {
                                abstractC3284l3 = null;
                            } else if (i4 == 4) {
                                C3358n3 c3358n4 = C3358n3.f52247d;
                                c3358n3M20225b = qzc.m20225b();
                                c3358n3M20225b.m17198n(strM1766t2, rw9VarM24732E);
                            } else {
                                C3395o3 c3395o4 = C3395o3.f53748e;
                                c3395o3M21803b = szc.m21803b();
                                c3395o3M21803b.m17773n(strM1766t2, rw9VarM24732E, c0423c);
                            }
                            if (abstractC3284l3 != null) {
                                abstractC3284l3 = c3321m3M17162b;
                                abstractC3284l3 = c3321m3M12996b;
                                abstractC3284l3 = c3395o3M21803b;
                                abstractC3284l3 = c3358n3M20225b;
                                iM1790q = viewOnAttachStateChangeListenerC0393e.m1790q(c0423c);
                                if (iM1790q == -1) {
                                    if (z2) {
                                        length = 0;
                                    } else {
                                        length = strM1766t.length();
                                    }
                                    iM1790q = length;
                                }
                                if (z2) {
                                    iArrMo15766k = abstractC3284l3.mo15760e(iM1790q);
                                } else {
                                    iArrMo15766k = abstractC3284l3.mo15766k(iM1790q);
                                }
                                if (iArrMo15766k != null) {
                                    i5 = iArrMo15766k[0];
                                    i6 = iArrMo15766k[1];
                                    if (z || n66Var.m17251c(AbstractC0424d.f4994a) || !n66Var.m17251c(AbstractC0424d.f4983G)) {
                                        if (z2) {
                                            iM1791r = i6;
                                        } else {
                                            iM1791r = i5;
                                        }
                                        i7 = iM1791r;
                                    } else {
                                        iM1791r = viewOnAttachStateChangeListenerC0393e.m1791r(c0423c);
                                        if (iM1791r == -1) {
                                            iM1791r = z2 ? i5 : i6;
                                        }
                                        i7 = z2 ? i6 : i5;
                                    }
                                    if (z2) {
                                        i8 = 256;
                                    } else {
                                        i8 = 512;
                                    }
                                    viewOnAttachStateChangeListenerC0393e.f4736T = new C0019ah(c0423c, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                    viewOnAttachStateChangeListenerC0393e.m1779K(c0423c, iM1791r, i7, true);
                                    return true;
                                }
                            }
                        }
                    }
                } else if (i2 == 16384) {
                    C3024g3 c3024g8 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4961q);
                    if (c3024g8 != null && (ui3Var = (ui3) c3024g8.f40091b) != null) {
                        return ((Boolean) ui3Var.mo0a()).booleanValue();
                    }
                } else {
                    if (i2 == 131072) {
                        boolean zM1779K = viewOnAttachStateChangeListenerC0393e.m1779K(c0423c, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                        if (zM1779K) {
                            ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, viewOnAttachStateChangeListenerC0393e.m1770A(i10), 0, null, 12);
                        }
                        return zM1779K;
                    }
                    if (AbstractC3584sr.m21637o(c0423c)) {
                        if (i2 == 1) {
                            if (viewTreeObserverOnGlobalLayoutListenerC0391c.isInTouchMode()) {
                                viewTreeObserverOnGlobalLayoutListenerC0391c.requestFocusFromTouch();
                            }
                            C3024g3 c3024g9 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4967w);
                            if (c3024g9 != null && (ui3Var2 = (ui3) c3024g9.f40091b) != null) {
                                return ((Boolean) ui3Var2.mo0a()).booleanValue();
                            }
                        } else if (i2 != 2) {
                            switch (i2) {
                                case 16:
                                    C3024g3 c3024g10 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4946b);
                                    Boolean bool2 = (c3024g10 == null || (ui3Var3 = (ui3) c3024g10.f40091b) == null) ? null : (Boolean) ui3Var3.mo0a();
                                    ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, i, 1, null, 12);
                                    if (bool2 != null) {
                                        return bool2.booleanValue();
                                    }
                                    break;
                                case 32:
                                    C3024g3 c3024g11 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4947c);
                                    if (c3024g11 != null && (ui3Var4 = (ui3) c3024g11.f40091b) != null) {
                                        return ((Boolean) ui3Var4.mo0a()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    if (i2 == 4096) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (i2 == 8192) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (i2 == 16908345) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i2 == 16908347) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (i2 == 16908344) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (i2 == 16908346) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (!z5 || z6 || z3 || z4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (!z7 || z8 || z3 || z4) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z3 || z4) {
                                        tm7Var = (tm7) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4996c);
                                        c3024g4 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4953i);
                                        if (tm7Var != null) {
                                            h41Var = tm7Var.f62532b;
                                            if (c3024g4 != null) {
                                                f = h41Var.f41766b;
                                                f2 = h41Var.f41765a;
                                                if (f < f2) {
                                                    f3 = f2;
                                                } else {
                                                    f3 = f;
                                                }
                                                if (f2 <= f) {
                                                    f = f2;
                                                }
                                                i9 = tm7Var.f62533c;
                                                if (i9 > 0) {
                                                    f4 = f3 - f;
                                                    f5 = i9 + 1;
                                                } else {
                                                    f4 = f3 - f;
                                                    f5 = 20.0f;
                                                }
                                                f6 = f4 / f5;
                                                if (z4) {
                                                    f6 = -f6;
                                                }
                                                vi3Var3 = (vi3) c3024g4.f40091b;
                                                if (vi3Var3 != null) {
                                                    return ((Boolean) vi3Var3.invoke(Float.valueOf(tm7Var.f62531a + f6))).booleanValue();
                                                }
                                            } else {
                                                jM10804e = bq1.m4049Y((C0353c) c0357g.f4335a0.f46676d).m10804e();
                                                ArrayList arrayList = new ArrayList();
                                                c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4944C);
                                                if (c3024g5 == null && (vi3Var4 = (vi3) c3024g5.f40091b) != null && ((Boolean) vi3Var4.invoke(arrayList)).booleanValue()) {
                                                    f7 = (Float) arrayList.get(0);
                                                } else {
                                                    f7 = null;
                                                }
                                                c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4948d);
                                                if (c3024g6 != null) {
                                                    xi3Var = c3024g6.f40091b;
                                                    mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5015v);
                                                    if (mn8Var == null && z9) {
                                                        float fFloatValue = f7 != null ? f7.floatValue() : Float.intBitsToFloat((int) (jM10804e >> 32));
                                                        if (z5 || z4) {
                                                            fFloatValue = -fFloatValue;
                                                        }
                                                        if (mn8Var.f51590c) {
                                                            fFloatValue = -fFloatValue;
                                                        }
                                                        if (c0357g.f4328U == LayoutDirection.Rtl && (z5 || z6)) {
                                                            fFloatValue = -fFloatValue;
                                                        }
                                                        if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var, fFloatValue)) {
                                                            C0427g c0427g2 = AbstractC0421a.f4970z;
                                                            if (n66Var.m17251c(c0427g2) || n66Var.m17251c(AbstractC0421a.f4943B)) {
                                                                C3024g3 c3024g12 = fFloatValue > 0.0f ? (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4943B) : (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g2);
                                                                if (c3024g12 != null && (ui3Var12 = (ui3) c3024g12.f40091b) != null) {
                                                                    return ((Boolean) ui3Var12.mo0a()).booleanValue();
                                                                }
                                                            } else {
                                                                zi3 zi3Var = (zi3) xi3Var;
                                                                if (zi3Var != null) {
                                                                    return ((Boolean) zi3Var.invoke(Float.valueOf(fFloatValue), fValueOf)).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        xi3Var = xi3Var;
                                                        z10 = z10;
                                                    }
                                                    mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                    if (mn8Var2 != null && z10) {
                                                        if (f7 != null) {
                                                            fIntBitsToFloat = f7.floatValue();
                                                        } else {
                                                            fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                        }
                                                        if (z7 || z4) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (mn8Var2.f51590c) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                            c0427g = AbstractC0421a.f4969y;
                                                            if (!n66Var.m17251c(c0427g) || n66Var.m17251c(AbstractC0421a.f4942A)) {
                                                                if (fIntBitsToFloat > 0.0f) {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                } else {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                }
                                                                if (c3024g7 != null && (ui3Var11 = (ui3) c3024g7.f40091b) != null) {
                                                                    return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                }
                                                            } else {
                                                                zi3 zi3Var2 = (zi3) xi3Var;
                                                                if (zi3Var2 != null) {
                                                                    return ((Boolean) zi3Var2.invoke(fValueOf, Float.valueOf(fIntBitsToFloat))).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            jM10804e = bq1.m4049Y((C0353c) c0357g.f4335a0.f46676d).m10804e();
                                            ArrayList arrayList2 = new ArrayList();
                                            c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4944C);
                                            if (c3024g5 == null) {
                                                f7 = null;
                                            } else {
                                                f7 = null;
                                            }
                                            c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4948d);
                                            if (c3024g6 != null) {
                                                xi3Var = c3024g6.f40091b;
                                                mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5015v);
                                                if (mn8Var == null) {
                                                    xi3Var = xi3Var;
                                                    z10 = z10;
                                                    mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                    if (mn8Var2 != null) {
                                                        if (f7 != null) {
                                                            fIntBitsToFloat = f7.floatValue();
                                                        } else {
                                                            fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                        }
                                                        if (z7) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        } else {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (mn8Var2.f51590c) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                            c0427g = AbstractC0421a.f4969y;
                                                            if (n66Var.m17251c(c0427g)) {
                                                                if (fIntBitsToFloat > 0.0f) {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                } else {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                }
                                                                if (c3024g7 != null) {
                                                                    return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                }
                                                            } else {
                                                                if (fIntBitsToFloat > 0.0f) {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                } else {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                }
                                                                if (c3024g7 != null) {
                                                                    return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    xi3Var = xi3Var;
                                                    z10 = z10;
                                                    mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                    if (mn8Var2 != null) {
                                                        if (f7 != null) {
                                                            fIntBitsToFloat = f7.floatValue();
                                                        } else {
                                                            fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                        }
                                                        if (z7) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        } else {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (mn8Var2.f51590c) {
                                                            fIntBitsToFloat = -fIntBitsToFloat;
                                                        }
                                                        if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                            c0427g = AbstractC0421a.f4969y;
                                                            if (n66Var.m17251c(c0427g)) {
                                                                if (fIntBitsToFloat > 0.0f) {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                } else {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                }
                                                                if (c3024g7 != null) {
                                                                    return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                }
                                                            } else {
                                                                if (fIntBitsToFloat > 0.0f) {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                } else {
                                                                    c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                }
                                                                if (c3024g7 != null) {
                                                                    return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        jM10804e = bq1.m4049Y((C0353c) c0357g.f4335a0.f46676d).m10804e();
                                        ArrayList arrayList3 = new ArrayList();
                                        c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4944C);
                                        if (c3024g5 == null) {
                                            f7 = null;
                                        } else {
                                            f7 = null;
                                        }
                                        c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4948d);
                                        if (c3024g6 != null) {
                                            xi3Var = c3024g6.f40091b;
                                            mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5015v);
                                            if (mn8Var == null) {
                                                xi3Var = xi3Var;
                                                z10 = z10;
                                                mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                if (mn8Var2 != null) {
                                                    if (f7 != null) {
                                                        fIntBitsToFloat = f7.floatValue();
                                                    } else {
                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                    }
                                                    if (z7) {
                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                    } else {
                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                    }
                                                    if (mn8Var2.f51590c) {
                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                    }
                                                    if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                        c0427g = AbstractC0421a.f4969y;
                                                        if (n66Var.m17251c(c0427g)) {
                                                            if (fIntBitsToFloat > 0.0f) {
                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                            } else {
                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                            }
                                                            if (c3024g7 != null) {
                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                            }
                                                        } else {
                                                            if (fIntBitsToFloat > 0.0f) {
                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                            } else {
                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                            }
                                                            if (c3024g7 != null) {
                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                xi3Var = xi3Var;
                                                z10 = z10;
                                                mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                if (mn8Var2 != null) {
                                                    if (f7 != null) {
                                                        fIntBitsToFloat = f7.floatValue();
                                                    } else {
                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                    }
                                                    if (z7) {
                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                    } else {
                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                    }
                                                    if (mn8Var2.f51590c) {
                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                    }
                                                    if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                        c0427g = AbstractC0421a.f4969y;
                                                        if (n66Var.m17251c(c0427g)) {
                                                            if (fIntBitsToFloat > 0.0f) {
                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                            } else {
                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                            }
                                                            if (c3024g7 != null) {
                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                            }
                                                        } else {
                                                            if (fIntBitsToFloat > 0.0f) {
                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                            } else {
                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                            }
                                                            if (c3024g7 != null) {
                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    C3024g3 c3024g13 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4963s);
                                    if (c3024g13 != null && (ui3Var5 = (ui3) c3024g13.f40091b) != null) {
                                        return ((Boolean) ui3Var5.mo0a()).booleanValue();
                                    }
                                    break;
                                case 65536:
                                    C3024g3 c3024g14 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4962r);
                                    if (c3024g14 != null && (ui3Var6 = (ui3) c3024g14.f40091b) != null) {
                                        return ((Boolean) ui3Var6.mo0a()).booleanValue();
                                    }
                                    break;
                                case 262144:
                                    C3024g3 c3024g15 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4964t);
                                    if (c3024g15 != null && (ui3Var7 = (ui3) c3024g15.f40091b) != null) {
                                        return ((Boolean) ui3Var7.mo0a()).booleanValue();
                                    }
                                    break;
                                case 524288:
                                    C3024g3 c3024g16 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4965u);
                                    if (c3024g16 != null && (ui3Var8 = (ui3) c3024g16.f40091b) != null) {
                                        return ((Boolean) ui3Var8.mo0a()).booleanValue();
                                    }
                                    break;
                                case 1048576:
                                    C3024g3 c3024g17 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4966v);
                                    if (c3024g17 != null && (ui3Var9 = (ui3) c3024g17.f40091b) != null) {
                                        return ((Boolean) ui3Var9.mo0a()).booleanValue();
                                    }
                                    break;
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    C3024g3 c3024g18 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4955k);
                                    if (c3024g18 != null && (vi3Var = (vi3) c3024g18.f40091b) != null) {
                                        if (string == null) {
                                            string = "";
                                        }
                                        return ((Boolean) vi3Var.invoke(new C3419on(string))).booleanValue();
                                    }
                                    break;
                                case R.id.accessibilityActionShowOnScreen:
                                    C0423c c0423cM1850l = c0423c.m1850l();
                                    if (c0423cM1850l != null) {
                                        C3024g3 c3024g19 = (C3024g3) AbstractC0422b.m1838a(c0423cM1850l.f4974d, AbstractC0421a.f4948d);
                                        while (c3024g19 == null && c0423cM1850l != null) {
                                            c0423cM1850l = c0423cM1850l.m1850l();
                                            c3024g19 = c0423cM1850l != null ? (C3024g3) AbstractC0422b.m1838a(c0423cM1850l.f4974d, AbstractC0421a.f4948d) : null;
                                        }
                                        if (c0423cM1850l == null) {
                                            e28 e28VarM1846g = c0423c.m1846g();
                                            return viewTreeObserverOnGlobalLayoutListenerC0391c.requestRectangleOnScreen(new Rect((int) Math.floor(e28VarM1846g.f36620a), (int) Math.floor(e28VarM1846g.f36621b), ss5.m21693T((float) Math.ceil(e28VarM1846g.f36622c)), ss5.m21693T((float) Math.ceil(e28VarM1846g.f36623d))));
                                        }
                                        long jM12824e = 0;
                                        boolean z11 = false;
                                        while (c0423cM1850l != null) {
                                            C0357g c0357g2 = c0423cM1850l.f4973c;
                                            kv8 kv8Var2 = c0423cM1850l.f4974d;
                                            C3024g3 c3024g20 = (C3024g3) AbstractC0422b.m1838a(kv8Var2, AbstractC0421a.f4948d);
                                            if (c3024g20 != null) {
                                                e28 e28VarM4049Y = bq1.m4049Y((C0353c) c0357g2.f4335a0.f46676d);
                                                aq4 aq4VarMo1662D = ((C0353c) c0357g2.f4335a0.f46676d).mo1662D();
                                                e28 e28VarM10810k = e28VarM4049Y.m10810k(aq4VarMo1662D != null ? ((AbstractC0362l) aq4VarMo1662D).mo1671R(0L) : 0L);
                                                AbstractC0362l abstractC0362lM1843d = c0423c.m1843d();
                                                if (abstractC0362lM1843d == null) {
                                                    jMo1671R = 0;
                                                } else {
                                                    if (!abstractC0362lM1843d.mo1543f1().f34836I) {
                                                        abstractC0362lM1843d = null;
                                                    }
                                                    if (abstractC0362lM1843d != null) {
                                                        jMo1671R = abstractC0362lM1843d.mo1671R(0L);
                                                    } else {
                                                        jMo1671R = 0;
                                                    }
                                                }
                                                long jM12825f = gq6.m12825f(jMo1671R, jM12824e);
                                                AbstractC0362l abstractC0362lM1843d2 = c0423c.m1843d();
                                                e28 e28VarM23907b = wfb.m23907b(jM12825f, omd.m18152h0(abstractC0362lM1843d2 != null ? abstractC0362lM1843d2.f49303c : 0L));
                                                float f8 = e28VarM23907b.f36620a - e28VarM10810k.f36620a;
                                                float f9 = e28VarM23907b.f36622c - e28VarM10810k.f36622c;
                                                if (Math.signum(f8) != Math.signum(f9)) {
                                                    f8 = 0.0f;
                                                } else if (Math.abs(f8) >= Math.abs(f9)) {
                                                    f8 = f9;
                                                }
                                                float f10 = e28VarM23907b.f36621b - e28VarM10810k.f36621b;
                                                float f11 = e28VarM23907b.f36623d - e28VarM10810k.f36623d;
                                                if (Math.signum(f10) != Math.signum(f11)) {
                                                    f10 = 0.0f;
                                                } else if (Math.abs(f10) >= Math.abs(f11)) {
                                                    f10 = f11;
                                                }
                                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                                                if (gq6.m12821b(jFloatToRawIntBits2, 0L)) {
                                                    jFloatToRawIntBits = jFloatToRawIntBits2;
                                                } else {
                                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
                                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                                                    mn8 mn8Var3 = (mn8) AbstractC0422b.m1838a(kv8Var2, AbstractC0424d.f5015v);
                                                    if (mn8Var3 != null && mn8Var3.f51590c) {
                                                        fIntBitsToFloat2 = -fIntBitsToFloat2;
                                                    }
                                                    if (c0357g.f4328U == LayoutDirection.Rtl) {
                                                        fIntBitsToFloat2 = -fIntBitsToFloat2;
                                                    }
                                                    mn8 mn8Var4 = (mn8) AbstractC0422b.m1838a(kv8Var2, AbstractC0424d.f5016w);
                                                    if (mn8Var4 != null && mn8Var4.f51590c) {
                                                        fIntBitsToFloat3 = -fIntBitsToFloat3;
                                                    }
                                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                                                }
                                                zi3 zi3Var3 = (zi3) c3024g20.f40091b;
                                                z11 = (zi3Var3 != null && ((Boolean) zi3Var3.invoke(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))))).booleanValue()) || z11;
                                                jM12824e = gq6.m12824e(jM12824e, jFloatToRawIntBits2);
                                            }
                                            c0423cM1850l = c0423cM1850l.m1850l();
                                            c0423c = c0423c;
                                        }
                                        return z11;
                                    }
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && (c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4953i)) != null && (vi3Var2 = (vi3) c3024g3.f40091b) != null) {
                                        return ((Boolean) vi3Var2.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                    }
                                    break;
                                case R.id.accessibilityActionImeEnter:
                                    C3024g3 c3024g21 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4960p);
                                    if (c3024g21 != null && (ui3Var10 = (ui3) c3024g21.f40091b) != null) {
                                        return ((Boolean) ui3Var10.mo0a()).booleanValue();
                                    }
                                    break;
                                default:
                                    switch (i2) {
                                        case R.id.accessibilityActionScrollUp:
                                        case R.id.accessibilityActionScrollLeft:
                                        case R.id.accessibilityActionScrollDown:
                                        case R.id.accessibilityActionScrollRight:
                                            if (i2 == 4096) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (i2 == 8192) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (i2 == 16908345) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (i2 == 16908347) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            if (i2 == 16908344) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (i2 == 16908346) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            if (z5) {
                                                z9 = true;
                                            } else {
                                                z9 = true;
                                            }
                                            if (z7) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (z3) {
                                                tm7Var = (tm7) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4996c);
                                                c3024g4 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4953i);
                                                if (tm7Var != null) {
                                                    h41Var = tm7Var.f62532b;
                                                    if (c3024g4 != null) {
                                                        f = h41Var.f41766b;
                                                        f2 = h41Var.f41765a;
                                                        if (f < f2) {
                                                            f3 = f2;
                                                        } else {
                                                            f3 = f;
                                                        }
                                                        if (f2 <= f) {
                                                            f = f2;
                                                        }
                                                        i9 = tm7Var.f62533c;
                                                        if (i9 > 0) {
                                                            f4 = f3 - f;
                                                            f5 = i9 + 1;
                                                        } else {
                                                            f4 = f3 - f;
                                                            f5 = 20.0f;
                                                        }
                                                        f6 = f4 / f5;
                                                        if (z4) {
                                                            f6 = -f6;
                                                        }
                                                        vi3Var3 = (vi3) c3024g4.f40091b;
                                                        if (vi3Var3 != null) {
                                                            return ((Boolean) vi3Var3.invoke(Float.valueOf(tm7Var.f62531a + f6))).booleanValue();
                                                        }
                                                    } else {
                                                        jM10804e = bq1.m4049Y((C0353c) c0357g.f4335a0.f46676d).m10804e();
                                                        ArrayList arrayList4 = new ArrayList();
                                                        c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4944C);
                                                        if (c3024g5 == null) {
                                                            f7 = null;
                                                        } else {
                                                            f7 = null;
                                                        }
                                                        c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4948d);
                                                        if (c3024g6 != null) {
                                                            xi3Var = c3024g6.f40091b;
                                                            mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5015v);
                                                            if (mn8Var == null) {
                                                                xi3Var = xi3Var;
                                                                z10 = z10;
                                                                mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                                if (mn8Var2 != null) {
                                                                    if (f7 != null) {
                                                                        fIntBitsToFloat = f7.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                                    }
                                                                    if (z7) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    } else {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (mn8Var2.f51590c) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                                        c0427g = AbstractC0421a.f4969y;
                                                                        if (n66Var.m17251c(c0427g)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                            } else {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                            }
                                                                            if (c3024g7 != null) {
                                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                            } else {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                            }
                                                                            if (c3024g7 != null) {
                                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                xi3Var = xi3Var;
                                                                z10 = z10;
                                                                mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                                if (mn8Var2 != null) {
                                                                    if (f7 != null) {
                                                                        fIntBitsToFloat = f7.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                                    }
                                                                    if (z7) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    } else {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (mn8Var2.f51590c) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                                        c0427g = AbstractC0421a.f4969y;
                                                                        if (n66Var.m17251c(c0427g)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                            } else {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                            }
                                                                            if (c3024g7 != null) {
                                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                            } else {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                            }
                                                                            if (c3024g7 != null) {
                                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    jM10804e = bq1.m4049Y((C0353c) c0357g.f4335a0.f46676d).m10804e();
                                                    ArrayList arrayList5 = new ArrayList();
                                                    c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4944C);
                                                    if (c3024g5 == null) {
                                                        f7 = null;
                                                    } else {
                                                        f7 = null;
                                                    }
                                                    c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4948d);
                                                    if (c3024g6 != null) {
                                                        xi3Var = c3024g6.f40091b;
                                                        mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5015v);
                                                        if (mn8Var == null) {
                                                            xi3Var = xi3Var;
                                                            z10 = z10;
                                                            mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                            if (mn8Var2 != null) {
                                                                if (f7 != null) {
                                                                    fIntBitsToFloat = f7.floatValue();
                                                                } else {
                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                                }
                                                                if (z7) {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                } else {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                }
                                                                if (mn8Var2.f51590c) {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                }
                                                                if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                                    c0427g = AbstractC0421a.f4969y;
                                                                    if (n66Var.m17251c(c0427g)) {
                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                        } else {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                        }
                                                                        if (c3024g7 != null) {
                                                                            return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                        }
                                                                    } else {
                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                        } else {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                        }
                                                                        if (c3024g7 != null) {
                                                                            return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            xi3Var = xi3Var;
                                                            z10 = z10;
                                                            mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                            if (mn8Var2 != null) {
                                                                if (f7 != null) {
                                                                    fIntBitsToFloat = f7.floatValue();
                                                                } else {
                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                                }
                                                                if (z7) {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                } else {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                }
                                                                if (mn8Var2.f51590c) {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                }
                                                                if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                                    c0427g = AbstractC0421a.f4969y;
                                                                    if (n66Var.m17251c(c0427g)) {
                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                        } else {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                        }
                                                                        if (c3024g7 != null) {
                                                                            return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                        }
                                                                    } else {
                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                        } else {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                        }
                                                                        if (c3024g7 != null) {
                                                                            return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                tm7Var = (tm7) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4996c);
                                                c3024g4 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4953i);
                                                if (tm7Var != null) {
                                                    h41Var = tm7Var.f62532b;
                                                    if (c3024g4 != null) {
                                                        f = h41Var.f41766b;
                                                        f2 = h41Var.f41765a;
                                                        if (f < f2) {
                                                            f3 = f2;
                                                        } else {
                                                            f3 = f;
                                                        }
                                                        if (f2 <= f) {
                                                            f = f2;
                                                        }
                                                        i9 = tm7Var.f62533c;
                                                        if (i9 > 0) {
                                                            f4 = f3 - f;
                                                            f5 = i9 + 1;
                                                        } else {
                                                            f4 = f3 - f;
                                                            f5 = 20.0f;
                                                        }
                                                        f6 = f4 / f5;
                                                        if (z4) {
                                                            f6 = -f6;
                                                        }
                                                        vi3Var3 = (vi3) c3024g4.f40091b;
                                                        if (vi3Var3 != null) {
                                                            return ((Boolean) vi3Var3.invoke(Float.valueOf(tm7Var.f62531a + f6))).booleanValue();
                                                        }
                                                    } else {
                                                        jM10804e = bq1.m4049Y((C0353c) c0357g.f4335a0.f46676d).m10804e();
                                                        ArrayList arrayList6 = new ArrayList();
                                                        c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4944C);
                                                        if (c3024g5 == null) {
                                                            f7 = null;
                                                        } else {
                                                            f7 = null;
                                                        }
                                                        c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4948d);
                                                        if (c3024g6 != null) {
                                                            xi3Var = c3024g6.f40091b;
                                                            mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5015v);
                                                            if (mn8Var == null) {
                                                                xi3Var = xi3Var;
                                                                z10 = z10;
                                                                mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                                if (mn8Var2 != null) {
                                                                    if (f7 != null) {
                                                                        fIntBitsToFloat = f7.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                                    }
                                                                    if (z7) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    } else {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (mn8Var2.f51590c) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                                        c0427g = AbstractC0421a.f4969y;
                                                                        if (n66Var.m17251c(c0427g)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                            } else {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                            }
                                                                            if (c3024g7 != null) {
                                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                            } else {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                            }
                                                                            if (c3024g7 != null) {
                                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                xi3Var = xi3Var;
                                                                z10 = z10;
                                                                mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                                if (mn8Var2 != null) {
                                                                    if (f7 != null) {
                                                                        fIntBitsToFloat = f7.floatValue();
                                                                    } else {
                                                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                                    }
                                                                    if (z7) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    } else {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (mn8Var2.f51590c) {
                                                                        fIntBitsToFloat = -fIntBitsToFloat;
                                                                    }
                                                                    if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                                        c0427g = AbstractC0421a.f4969y;
                                                                        if (n66Var.m17251c(c0427g)) {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                            } else {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                            }
                                                                            if (c3024g7 != null) {
                                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                            }
                                                                        } else {
                                                                            if (fIntBitsToFloat > 0.0f) {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                            } else {
                                                                                c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                            }
                                                                            if (c3024g7 != null) {
                                                                                return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    jM10804e = bq1.m4049Y((C0353c) c0357g.f4335a0.f46676d).m10804e();
                                                    ArrayList arrayList7 = new ArrayList();
                                                    c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4944C);
                                                    if (c3024g5 == null) {
                                                        f7 = null;
                                                    } else {
                                                        f7 = null;
                                                    }
                                                    c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4948d);
                                                    if (c3024g6 != null) {
                                                        xi3Var = c3024g6.f40091b;
                                                        mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5015v);
                                                        if (mn8Var == null) {
                                                            xi3Var = xi3Var;
                                                            z10 = z10;
                                                            mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                            if (mn8Var2 != null) {
                                                                if (f7 != null) {
                                                                    fIntBitsToFloat = f7.floatValue();
                                                                } else {
                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                                }
                                                                if (z7) {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                } else {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                }
                                                                if (mn8Var2.f51590c) {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                }
                                                                if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                                    c0427g = AbstractC0421a.f4969y;
                                                                    if (n66Var.m17251c(c0427g)) {
                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                        } else {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                        }
                                                                        if (c3024g7 != null) {
                                                                            return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                        }
                                                                    } else {
                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                        } else {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                        }
                                                                        if (c3024g7 != null) {
                                                                            return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            xi3Var = xi3Var;
                                                            z10 = z10;
                                                            mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5016w);
                                                            if (mn8Var2 != null) {
                                                                if (f7 != null) {
                                                                    fIntBitsToFloat = f7.floatValue();
                                                                } else {
                                                                    fIntBitsToFloat = Float.intBitsToFloat((int) (jM10804e & 4294967295L));
                                                                }
                                                                if (z7) {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                } else {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                }
                                                                if (mn8Var2.f51590c) {
                                                                    fIntBitsToFloat = -fIntBitsToFloat;
                                                                }
                                                                if (ViewOnAttachStateChangeListenerC0393e.m1767x(mn8Var2, fIntBitsToFloat)) {
                                                                    c0427g = AbstractC0421a.f4969y;
                                                                    if (n66Var.m17251c(c0427g)) {
                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                        } else {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                        }
                                                                        if (c3024g7 != null) {
                                                                            return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                        }
                                                                    } else {
                                                                        if (fIntBitsToFloat > 0.0f) {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                                        } else {
                                                                            c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var, c0427g);
                                                                        }
                                                                        if (c3024g7 != null) {
                                                                            return ((Boolean) ui3Var11.mo0a()).booleanValue();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            switch (i2) {
                                                case R.id.accessibilityActionPageUp:
                                                    C3024g3 c3024g22 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4969y);
                                                    if (c3024g22 != null && (ui3Var13 = (ui3) c3024g22.f40091b) != null) {
                                                        return ((Boolean) ui3Var13.mo0a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageDown:
                                                    C3024g3 c3024g23 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4942A);
                                                    if (c3024g23 != null && (ui3Var14 = (ui3) c3024g23.f40091b) != null) {
                                                        return ((Boolean) ui3Var14.mo0a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageLeft:
                                                    C3024g3 c3024g24 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4970z);
                                                    if (c3024g24 != null && (ui3Var15 = (ui3) c3024g24.f40091b) != null) {
                                                        return ((Boolean) ui3Var15.mo0a()).booleanValue();
                                                    }
                                                    break;
                                                case R.id.accessibilityActionPageRight:
                                                    C3024g3 c3024g25 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4943B);
                                                    if (c3024g25 != null && (ui3Var16 = (ui3) c3024g25.f40091b) != null) {
                                                        return ((Boolean) ui3Var16.mo0a()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    pe9 pe9Var = (pe9) viewOnAttachStateChangeListenerC0393e.f4729M.m19078b(i);
                                                    if (pe9Var != null && (charSequence = (CharSequence) pe9Var.m19078b(i2)) != null && (list = (List) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4968x)) != null) {
                                                        int size = list.size();
                                                        for (int i11 = 0; i11 < size; i11++) {
                                                            fx1 fx1Var = (fx1) list.get(i11);
                                                            if (fx1Var.f39843a.equals(charSequence)) {
                                                                return ((Boolean) fx1Var.f39844b.mo0a()).booleanValue();
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else if (fa4.m11650l(AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5005l), bool)) {
                            ((C0301c) viewTreeObserverOnGlobalLayoutListenerC0391c.getFocusOwner()).m1358d(8, false, true);
                            return true;
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 34 ? AbstractC3521r3.m20273e(accessibilityManager) : true) {
                if (i2 != 64) {
                    if (accessibilityManager.isEnabled()) {
                    }
                    return false;
                }
                if (i2 != 128) {
                    if (viewOnAttachStateChangeListenerC0393e.f4758k == i) {
                        return false;
                    }
                    viewOnAttachStateChangeListenerC0393e.f4758k = Integer.MIN_VALUE;
                    viewOnAttachStateChangeListenerC0393e.f4724H = null;
                    viewTreeObserverOnGlobalLayoutListenerC0391c.invalidate();
                    ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, i, 65536, null, 12);
                    return true;
                }
                if (i2 != 256) {
                    if (bundle != null) {
                        i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                        z = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                        if (i2 == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        num = viewOnAttachStateChangeListenerC0393e.f4732P;
                        if (num != null) {
                            viewOnAttachStateChangeListenerC0393e.f4731O = -1;
                            viewOnAttachStateChangeListenerC0393e.f4732P = Integer.valueOf(i10);
                        } else {
                            viewOnAttachStateChangeListenerC0393e.f4731O = -1;
                            viewOnAttachStateChangeListenerC0393e.f4732P = Integer.valueOf(i10);
                        }
                        strM1766t = ViewOnAttachStateChangeListenerC0393e.m1766t(c0423c);
                        if (strM1766t != null) {
                            strM1766t2 = ViewOnAttachStateChangeListenerC0393e.m1766t(c0423c);
                            if (strM1766t2 != null) {
                                abstractC3284l3 = null;
                            } else {
                                abstractC3284l3 = null;
                            }
                            if (abstractC3284l3 != null) {
                                abstractC3284l3 = c3321m3M17162b;
                                abstractC3284l3 = c3321m3M12996b;
                                abstractC3284l3 = c3395o3M21803b;
                                abstractC3284l3 = c3358n3M20225b;
                                iM1790q = viewOnAttachStateChangeListenerC0393e.m1790q(c0423c);
                                if (iM1790q == -1) {
                                    if (z2) {
                                        length = 0;
                                    } else {
                                        length = strM1766t.length();
                                    }
                                    iM1790q = length;
                                }
                                if (z2) {
                                    iArrMo15766k = abstractC3284l3.mo15760e(iM1790q);
                                } else {
                                    iArrMo15766k = abstractC3284l3.mo15766k(iM1790q);
                                }
                                if (iArrMo15766k != null) {
                                    i5 = iArrMo15766k[0];
                                    i6 = iArrMo15766k[1];
                                    if (z) {
                                        if (z2) {
                                            iM1791r = i6;
                                        } else {
                                            iM1791r = i5;
                                        }
                                        i7 = iM1791r;
                                    } else {
                                        if (z2) {
                                            iM1791r = i6;
                                        } else {
                                            iM1791r = i5;
                                        }
                                        i7 = iM1791r;
                                    }
                                    if (z2) {
                                        i8 = 256;
                                    } else {
                                        i8 = 512;
                                    }
                                    viewOnAttachStateChangeListenerC0393e.f4736T = new C0019ah(c0423c, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                    viewOnAttachStateChangeListenerC0393e.m1779K(c0423c, iM1791r, i7, true);
                                    return true;
                                }
                            }
                        }
                    }
                } else if (bundle != null) {
                    i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                    z = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                    if (i2 == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    num = viewOnAttachStateChangeListenerC0393e.f4732P;
                    if (num != null) {
                        viewOnAttachStateChangeListenerC0393e.f4731O = -1;
                        viewOnAttachStateChangeListenerC0393e.f4732P = Integer.valueOf(i10);
                    } else {
                        viewOnAttachStateChangeListenerC0393e.f4731O = -1;
                        viewOnAttachStateChangeListenerC0393e.f4732P = Integer.valueOf(i10);
                    }
                    strM1766t = ViewOnAttachStateChangeListenerC0393e.m1766t(c0423c);
                    if (strM1766t != null) {
                        strM1766t2 = ViewOnAttachStateChangeListenerC0393e.m1766t(c0423c);
                        if (strM1766t2 != null) {
                            abstractC3284l3 = null;
                        } else {
                            abstractC3284l3 = null;
                        }
                        if (abstractC3284l3 != null) {
                            abstractC3284l3 = c3321m3M17162b;
                            abstractC3284l3 = c3321m3M12996b;
                            abstractC3284l3 = c3395o3M21803b;
                            abstractC3284l3 = c3358n3M20225b;
                            iM1790q = viewOnAttachStateChangeListenerC0393e.m1790q(c0423c);
                            if (iM1790q == -1) {
                                if (z2) {
                                    length = 0;
                                } else {
                                    length = strM1766t.length();
                                }
                                iM1790q = length;
                            }
                            if (z2) {
                                iArrMo15766k = abstractC3284l3.mo15760e(iM1790q);
                            } else {
                                iArrMo15766k = abstractC3284l3.mo15766k(iM1790q);
                            }
                            if (iArrMo15766k != null) {
                                i5 = iArrMo15766k[0];
                                i6 = iArrMo15766k[1];
                                if (z) {
                                    if (z2) {
                                        iM1791r = i6;
                                    } else {
                                        iM1791r = i5;
                                    }
                                    i7 = iM1791r;
                                } else {
                                    if (z2) {
                                        iM1791r = i6;
                                    } else {
                                        iM1791r = i5;
                                    }
                                    i7 = iM1791r;
                                }
                                if (z2) {
                                    i8 = 256;
                                } else {
                                    i8 = 512;
                                }
                                viewOnAttachStateChangeListenerC0393e.f4736T = new C0019ah(c0423c, i8, i4, i5, i6, SystemClock.uptimeMillis());
                                viewOnAttachStateChangeListenerC0393e.m1779K(c0423c, iM1791r, i7, true);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        abstractC3284l3 = c3321m3M17162b;
        abstractC3284l3 = c3321m3M12996b;
        abstractC3284l3 = c3395o3M21803b;
        abstractC3284l3 = c3358n3M20225b;
        abstractC3284l3 = c3446p3M9966b;
        return false;
    }

    @Override // p000.qn3
    /* JADX INFO: renamed from: i */
    public final void mo1758i(int i, C0797b4 c0797b4, String str, Bundle bundle) {
        this.f4722g.m1783j(i, c0797b4, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0228  */
    /* JADX WARN: Code duplicated, block: B:108:0x0237  */
    /* JADX WARN: Code duplicated, block: B:110:0x0256  */
    /* JADX WARN: Code duplicated, block: B:112:0x025f  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:143:0x0300  */
    /* JADX WARN: Code duplicated, block: B:144:0x0302  */
    /* JADX WARN: Code duplicated, block: B:146:0x0306  */
    /* JADX WARN: Code duplicated, block: B:147:0x0309  */
    /* JADX WARN: Code duplicated, block: B:150:0x032c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0332  */
    /* JADX WARN: Code duplicated, block: B:155:0x033e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0348  */
    /* JADX WARN: Code duplicated, block: B:160:0x035f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0392  */
    /* JADX WARN: Code duplicated, block: B:166:0x039d  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:177:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:179:0x03eb A[LOOP:3: B:176:0x03d7->B:179:0x03eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0409  */
    /* JADX WARN: Code duplicated, block: B:187:0x041c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0444  */
    /* JADX WARN: Code duplicated, block: B:197:0x045c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0482  */
    /* JADX WARN: Code duplicated, block: B:203:0x0490  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:215:0x04de  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:221:0x0508  */
    /* JADX WARN: Code duplicated, block: B:223:0x0520  */
    /* JADX WARN: Code duplicated, block: B:226:0x053f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0543  */
    /* JADX WARN: Code duplicated, block: B:229:0x0548  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:231:0x054c  */
    /* JADX WARN: Code duplicated, block: B:234:0x055a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0560  */
    /* JADX WARN: Code duplicated, block: B:237:0x0564  */
    /* JADX WARN: Code duplicated, block: B:239:0x056b  */
    /* JADX WARN: Code duplicated, block: B:241:0x0573  */
    /* JADX WARN: Code duplicated, block: B:246:0x0584  */
    /* JADX WARN: Code duplicated, block: B:248:0x058e  */
    /* JADX WARN: Code duplicated, block: B:249:0x0595  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:253:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:255:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:258:0x05bd A[LOOP:7: B:254:0x05a4->B:258:0x05bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:261:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:264:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:270:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:272:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:273:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:276:0x061f  */
    /* JADX WARN: Code duplicated, block: B:277:0x0624  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:280:0x063e  */
    /* JADX WARN: Code duplicated, block: B:282:0x0651  */
    /* JADX WARN: Code duplicated, block: B:283:0x065b  */
    /* JADX WARN: Code duplicated, block: B:284:0x0663  */
    /* JADX WARN: Code duplicated, block: B:287:0x0675  */
    /* JADX WARN: Code duplicated, block: B:288:0x067d  */
    /* JADX WARN: Code duplicated, block: B:291:0x0688  */
    /* JADX WARN: Code duplicated, block: B:294:0x0696  */
    /* JADX WARN: Code duplicated, block: B:296:0x069a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:302:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:319:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:327:0x0701  */
    /* JADX WARN: Code duplicated, block: B:329:0x070b  */
    /* JADX WARN: Code duplicated, block: B:332:0x0721  */
    /* JADX WARN: Code duplicated, block: B:335:0x0733  */
    /* JADX WARN: Code duplicated, block: B:337:0x073d  */
    /* JADX WARN: Code duplicated, block: B:340:0x0753  */
    /* JADX WARN: Code duplicated, block: B:343:0x076a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:350:0x0796  */
    /* JADX WARN: Code duplicated, block: B:351:0x079d  */
    /* JADX WARN: Code duplicated, block: B:353:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:368:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:384:0x083a  */
    /* JADX WARN: Code duplicated, block: B:395:0x086f  */
    /* JADX WARN: Code duplicated, block: B:398:0x087c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:401:0x089d  */
    /* JADX WARN: Code duplicated, block: B:403:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:404:0x08af  */
    /* JADX WARN: Code duplicated, block: B:407:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:414:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:417:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:420:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:423:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:431:0x091e  */
    /* JADX WARN: Code duplicated, block: B:446:0x095a  */
    /* JADX WARN: Code duplicated, block: B:448:0x096f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:450:0x0985  */
    /* JADX WARN: Code duplicated, block: B:452:0x0996  */
    /* JADX WARN: Code duplicated, block: B:456:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:458:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:459:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:462:0x09af  */
    /* JADX WARN: Code duplicated, block: B:465:0x09be  */
    /* JADX WARN: Code duplicated, block: B:467:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:482:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:510:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:512:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:515:0x0aab  */
    /* JADX WARN: Code duplicated, block: B:518:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:520:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:523:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:526:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:529:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:531:0x0b23  */
    /* JADX WARN: Code duplicated, block: B:533:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:536:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:538:0x0b52 A[LOOP:9: B:537:0x0b50->B:538:0x0b52, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:541:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:543:0x0b7f  */
    /* JADX WARN: Code duplicated, block: B:545:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:547:0x0ba8  */
    /* JADX WARN: Code duplicated, block: B:550:0x0baf A[LOOP:11: B:546:0x0ba6->B:550:0x0baf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:553:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:557:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:561:0x0bf6 A[LOOP:12: B:560:0x0bf4->B:561:0x0bf6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:562:0x0c1d  */
    /* JADX WARN: Code duplicated, block: B:564:0x0c27 A[LOOP:13: B:563:0x0c25->B:564:0x0c27, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:566:0x0c57  */
    /* JADX WARN: Code duplicated, block: B:569:0x0c7b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:571:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:572:0x0c8b  */
    /* JADX WARN: Code duplicated, block: B:574:0x0c97  */
    /* JADX WARN: Code duplicated, block: B:582:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:593:0x0cd6  */
    /* JADX WARN: Code duplicated, block: B:594:0x021a A[EDGE_INSN: B:594:0x021a->B:102:0x021a BREAK  A[LOOP:0: B:82:0x01ad->B:101:0x0213], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x036d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0466 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:622:0x0998 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0998 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0bc7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x0bb4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0bb5 A[EDGE_INSN: B:630:0x0bb5->B:552:0x0bb5 BREAK  A[LOOP:11: B:546:0x0ba6->B:550:0x0baf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:67:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0194  */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0206  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:593:0x0cd6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r4v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.util.ArrayList] */
    @Override // p000.qn3
    /* JADX INFO: renamed from: l */
    public final C0797b4 mo1759l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        C0797b4 c0797b4;
        int i2;
        Bundle extras;
        int i3;
        C0423c c0423cM1850l;
        Integer numValueOf;
        int iIntValue;
        s56 s56Var;
        r56 r56Var;
        pe9 pe9Var;
        Resources resources;
        kv8 kv8Var;
        n66 n66Var;
        uh8 uh8Var;
        s56 s56Var2;
        pe9 pe9Var2;
        boolean zM20273e;
        List listM1839j;
        int size;
        boolean z;
        int i4;
        int i5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        C3419on c3419onM21597H;
        C0423c c0423c;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        uh8 uh8Var2;
        kv8 kv8Var2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        Resources resources2;
        SpannableString spannableString;
        C0427g c0427g;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        AccessibilityNodeInfo accessibilityNodeInfo5;
        kv8 kv8Var3;
        C0423c c0423c2;
        ToggleableState toggleableState;
        Boolean bool;
        uh8 uh8Var3;
        int i6;
        List list;
        String str;
        String str2;
        int i7;
        Boolean bool2;
        Integer num;
        int iIntValue2;
        C0427g c0427g2;
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e;
        boolean z2;
        int i8;
        C0423c c0423cM1850l2;
        ch5 ch5Var;
        C3024g3 c3024g3;
        C3024g3 c3024g4;
        C3024g3 c3024g5;
        String strM1766t;
        C0357g c0357g;
        ArrayList arrayList;
        CharSequence charSequenceM3276g;
        tm7 tm7Var;
        mn8 mn8Var;
        mn8 mn8Var2;
        int iM20409d;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c;
        Bundle bundle;
        int iM20409d2;
        String str3;
        C0797b4 c0797b5;
        AbstractC0442b abstractC0442bM24761d0;
        AbstractC0442b abstractC0442bM24761d1;
        C3024g3 c3024g6;
        C3024g3 c3024g7;
        C3024g3 c3024g8;
        C0427g c0427g3;
        List list2;
        s56 s56Var3;
        pe9 pe9Var3;
        d66 d66VarM13421a;
        pe9 pe9Var4;
        int size2;
        int i9;
        d66 d66Var;
        s56 s56Var4;
        int[] iArr;
        int i10;
        int i11;
        ArrayList arrayList2;
        int size3;
        int i12;
        int size4;
        int i13;
        fx1 fx1Var;
        String strM12243a;
        int iM10125d;
        int i14;
        int[] iArr2;
        int i15;
        int i16;
        int i17;
        C3671v3 c3671v3;
        C3671v3 c3671v4;
        C0423c c0423cM1850l3;
        e71 e71Var;
        ArrayList arrayList3;
        List listM1839j2;
        int size5;
        int i18;
        int i19;
        boolean zM14094h;
        int i20;
        Object objM17255g;
        C0423c c0423c3;
        C3024g3 c3024g9;
        float f;
        h41 h41Var;
        C0427g c0427g4;
        float f2;
        float f3;
        float f4;
        C3024g3 c3024g10;
        C3024g3 c3024g11;
        C3024g3 c3024g12;
        C3024g3 c3024g13;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z3;
        boolean z4;
        int i21;
        int iM20409d3;
        C0423c c0423cM1850l4;
        boolean zBooleanValue;
        kv8 kv8Var4;
        C0427g c0427g5;
        boolean zBooleanValue2;
        wa3 fontFamilyResolver;
        fb2 density;
        sq5 sq5Var;
        SpannableString spannableString2;
        List list3;
        ArrayList arrayList4;
        SpannableString spannableString3;
        ?? arrayList5;
        ?? arrayList6;
        int size6;
        int i22;
        int size7;
        int i23;
        List listM18171a;
        int size8;
        int i24;
        C3378nn c3378nn;
        int i25;
        Object obj;
        int i26;
        fe5 fe5Var;
        WeakHashMap weakHashMap;
        Object le1Var;
        lja ljaVar;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size9;
        int i27;
        C3378nn c3378nn2;
        ipa ipaVar;
        int i28;
        int i29;
        int size10;
        int i30;
        C3378nn c3378nn3;
        int size11;
        int i31;
        int i32;
        int i33;
        he9 he9VarM13209a;
        yv9 yv9Var;
        rt9 rt9Var;
        xa3 xa3Var;
        wb3 wb3Var;
        SpannableString spannableString4;
        bc3 bc3Var;
        int i34;
        boolean z5;
        boolean z6;
        int i35;
        int i36;
        int i37;
        long j;
        int i38;
        xb3 xb3Var;
        int i39;
        C0423c c0423c4;
        d84 d84VarM1792s;
        int i40;
        AbstractC0442b abstractC0442b;
        rv8 rv8Var;
        boolean zM11650l;
        C0423c c0423c5;
        int i41;
        int i42;
        String strM24763e0;
        Object parentForAccessibility;
        View view;
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e2 = this.f4722g;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC0393e2.f4752g;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2 = viewOnAttachStateChangeListenerC0393e2.f4746d;
        if (viewTreeObserverOnGlobalLayoutListenerC0391c2.getComposeViewContext().f4788c.mo256K().mo21327q() == Lifecycle$State.DESTROYED) {
            if (accessibilityManager.isEnabled()) {
                c0797b5 = null;
            } else {
                c0797b5 = new C0797b4(AccessibilityNodeInfo.obtain());
            }
            viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
            i7 = i;
        } else {
            rv8 rv8Var2 = (rv8) viewOnAttachStateChangeListenerC0393e2.m1792s().m10152b(i);
            if (rv8Var2 == null) {
                if (accessibilityManager.isEnabled()) {
                    c0797b5 = null;
                } else {
                    c0797b5 = new C0797b4(AccessibilityNodeInfo.obtain());
                }
                viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
                i7 = i;
            } else {
                C0423c c0423c6 = rv8Var2.f59881a;
                kv8 kv8VarM1849k = c0423c6.m1849k();
                C0357g c0357g2 = c0423c6.f4973c;
                boolean zM11650l2 = fa4.m11650l(AbstractC0422b.m1838a(kv8VarM1849k, AbstractC0424d.f5008o), Boolean.TRUE);
                if (!zM11650l2) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    c0797b4 = new C0797b4(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        AbstractC3521r3.m20274f(accessibilityNodeInfoObtain, zM11650l2);
                    } else {
                        extras = accessibilityNodeInfoObtain.getExtras();
                        if (extras != null) {
                            int i43 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65);
                            if (zM11650l2) {
                                i3 = 64;
                            } else {
                                i3 = 0;
                            }
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i43 | i3);
                        }
                    }
                    if (i == -1) {
                        parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC0391c2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        c0797b4.f7901b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        c0423cM1850l = c0423c6.m1850l();
                        if (c0423cM1850l != null) {
                            numValueOf = Integer.valueOf(c0423cM1850l.f4976f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            i54.m13664c("semanticsNode " + i + " has null parent");
                            C3386nv.m17631r();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC0391c2.getSemanticsOwner().m21750a().f4976f) {
                            iIntValue = -1;
                        }
                        c0797b4.f7901b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(viewTreeObserverOnGlobalLayoutListenerC0391c2, iIntValue);
                    }
                    c0797b4.f7902c = i;
                    accessibilityNodeInfoObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0391c2, i);
                    c0797b4.m3278i(viewOnAttachStateChangeListenerC0393e2.m1784k(rv8Var2));
                    s56Var = ViewOnAttachStateChangeListenerC0393e.f4723i0;
                    r56Var = viewOnAttachStateChangeListenerC0393e2.f4749e0;
                    pe9Var = viewOnAttachStateChangeListenerC0393e2.f4730N;
                    resources = viewTreeObserverOnGlobalLayoutListenerC0391c2.getContext().getResources();
                    c0797b4.m3279j("android.view.View");
                    kv8Var = c0423c6.f4974d;
                    n66Var = kv8Var.f48471a;
                    if (n66Var.m17251c(AbstractC0424d.f4983G)) {
                        c0797b4.m3279j("android.widget.EditText");
                    }
                    if (n66Var.m17251c(AbstractC0424d.f4979C)) {
                        c0797b4.m3279j("android.widget.TextView");
                    }
                    uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5019z);
                    if (uh8Var != null) {
                        i41 = uh8Var.f63934a;
                        if (c0423c6.m1852n()) {
                            pe9Var2 = pe9Var;
                            i42 = 4;
                            s56Var2 = s56Var;
                            if (C0423c.m1839j(4, c0423c6).isEmpty()) {
                            }
                        } else {
                            pe9Var2 = pe9Var;
                            i42 = 4;
                            s56Var2 = s56Var;
                        }
                        if (i41 == i42) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R$string.tab));
                        } else if (i41 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R$string.switch_role));
                        } else {
                            strM24763e0 = xwc.m24763e0(i41);
                            if (i41 == 5 || c0423c6.m1854p() || kv8Var.f48473c) {
                                c0797b4.m3279j(strM24763e0);
                            }
                        }
                    } else {
                        s56Var2 = s56Var;
                        pe9Var2 = pe9Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0391c2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(xwc.m24736I(c0423c6));
                    if (i2 >= 34) {
                        zM20273e = AbstractC3521r3.m20273e(accessibilityManager);
                    } else {
                        zM20273e = true;
                    }
                    listM1839j = C0423c.m1839j(4, c0423c6);
                    size = listM1839j.size();
                    z = zM20273e;
                    i4 = 0;
                    i5 = 0;
                    while (true) {
                        accessibilityNodeInfo = c0797b4.f7900a;
                        if (i5 < size) {
                            break;
                        }
                        List list4 = listM1839j;
                        c0423c4 = (C0423c) listM1839j.get(i5);
                        int i44 = size;
                        d84VarM1792s = viewOnAttachStateChangeListenerC0393e2.m1792s();
                        int i45 = i5;
                        i40 = c0423c4.f4976f;
                        if (d84VarM1792s.m10151a(i40)) {
                            abstractC0442b = viewTreeObserverOnGlobalLayoutListenerC0391c2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c0423c4.f4973c);
                            if (i40 != -1) {
                                if (abstractC0442b != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC0442b);
                                } else {
                                    rv8Var = (rv8) viewOnAttachStateChangeListenerC0393e2.m1792s().m10152b(i40);
                                    if (rv8Var != null || (c0423c5 = rv8Var.f59881a) == null) {
                                        zM11650l = false;
                                    } else {
                                        zM11650l = fa4.m11650l(AbstractC0422b.m1838a(c0423c5.m1849k(), AbstractC0424d.f5008o), Boolean.TRUE);
                                    }
                                    if (z || !zM11650l) {
                                        accessibilityNodeInfo.addChild(viewTreeObserverOnGlobalLayoutListenerC0391c2, i40);
                                    }
                                }
                                r56Var.m20411f(i40, i4);
                                i4++;
                            }
                        }
                        i5 = i45 + 1;
                        size = i44;
                        listM1839j = list4;
                    }
                    if (i == viewOnAttachStateChangeListenerC0393e2.f4758k) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c0797b4.m3272b(C3671v3.f64757g);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c0797b4.m3272b(C3671v3.f64756f);
                    }
                    c3419onM21597H = AbstractC3584sr.m21597H(c0423c6);
                    if (c3419onM21597H != null) {
                        fontFamilyResolver = viewTreeObserverOnGlobalLayoutListenerC0391c2.getFontFamilyResolver();
                        density = viewTreeObserverOnGlobalLayoutListenerC0391c2.getDensity();
                        sq5Var = viewOnAttachStateChangeListenerC0393e2.f4743a0;
                        String str4 = c3419onM21597H.f54604b;
                        list3 = c3419onM21597H.f54603a;
                        spannableString2 = new SpannableString(str4);
                        arrayList4 = c3419onM21597H.f54605c;
                        if (arrayList4 != null) {
                            size11 = arrayList4.size();
                            i31 = 0;
                            while (i31 < size11) {
                                int i46 = size11;
                                C3378nn c3378nn4 = (C3378nn) arrayList4.get(i31);
                                int i47 = i31;
                                he9 he9Var = (he9) c3378nn4.f52979a;
                                ArrayList arrayList7 = arrayList4;
                                i32 = c3378nn4.f52980b;
                                i33 = c3378nn4.f52981c;
                                uh8 uh8Var4 = uh8Var;
                                he9VarM13209a = he9.m13209a(he9Var, null, 65503);
                                xv9 xv9Var = he9VarM13209a.f42264a;
                                yv9Var = he9VarM13209a.f42273j;
                                rt9Var = he9VarM13209a.f42276m;
                                C0423c c0423c7 = c0423c6;
                                xa3Var = he9VarM13209a.f42269f;
                                Resources resources3 = resources;
                                wb3Var = he9VarM13209a.f42267d;
                                kv8 kv8Var5 = kv8Var;
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfoObtain;
                                pvc.m19498F(spannableString2, xv9Var.mo24173a(), i32, i33);
                                spannableString4 = spannableString2;
                                pvc.m19499G(spannableString4, he9VarM13209a.f42265b, density, i32, i33);
                                bc3Var = he9VarM13209a.f42266c;
                                if (bc3Var == null || wb3Var != null) {
                                    if (bc3Var == null) {
                                        bc3Var = bc3.f8321g;
                                    }
                                    if (wb3Var != null) {
                                        i34 = wb3Var.f66583a;
                                    } else {
                                        i34 = 0;
                                    }
                                    if (bc3Var.compareTo(bc3.f8318d) >= 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i34 == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!z6 && z5) {
                                        i35 = 3;
                                    } else if (z5) {
                                        i35 = 1;
                                    } else if (z6) {
                                        i35 = 2;
                                    } else {
                                        i35 = 0;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(i35);
                                    i36 = 33;
                                    spannableString4.setSpan(styleSpan, i32, i33, 33);
                                } else {
                                    i36 = 33;
                                }
                                if (xa3Var == null) {
                                    i37 = i36;
                                } else if (xa3Var instanceof dl3) {
                                    spannableString4.setSpan(new TypefaceSpan("sans-serif"), i32, i33, i36);
                                    i37 = i36;
                                } else {
                                    xb3Var = he9VarM13209a.f42268e;
                                    if (xb3Var != null) {
                                        i39 = xb3Var.f68021a;
                                    } else {
                                        i39 = 65535;
                                    }
                                    Object value = ((ya3) fontFamilyResolver).m25018b(xa3Var, bc3.f8321g, 0, i39).getValue();
                                    value.getClass();
                                    TypefaceSpan typefaceSpan = new TypefaceSpan((Typeface) value);
                                    i37 = 33;
                                    spannableString4.setSpan(typefaceSpan, i32, i33, 33);
                                }
                                if (rt9Var != null) {
                                    i38 = rt9Var.f59804a;
                                    if ((i38 | 1) == i38) {
                                        spannableString4.setSpan(new UnderlineSpan(), i32, i33, i37);
                                    }
                                    if ((i38 | 2) == i38) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i32, i33, i37);
                                    }
                                }
                                if (yv9Var != null) {
                                    spannableString4.setSpan(new ScaleXSpan(yv9Var.f70560a), i32, i33, i37);
                                }
                                pvc.m19500H(spannableString4, he9VarM13209a.f42274k, i32, i33);
                                j = he9VarM13209a.f42275l;
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(d32.m10042h0(j)), i32, i33, 33);
                                }
                                i31 = i47 + 1;
                                spannableString2 = spannableString4;
                                accessibilityNodeInfo = accessibilityNodeInfo;
                                size11 = i46;
                                arrayList4 = arrayList7;
                                uh8Var = uh8Var4;
                                c0423c6 = c0423c7;
                                resources = resources3;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo6;
                                kv8Var = kv8Var5;
                            }
                        }
                        spannableString3 = spannableString2;
                        c0423c = c0423c6;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        uh8Var2 = uh8Var;
                        kv8Var2 = kv8Var;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        resources2 = resources;
                        int length = str4.length();
                        arrayList5 = EmptyList.f47638a;
                        if (list3 != null) {
                            arrayList6 = new ArrayList(list3.size());
                            size10 = list3.size();
                            while (i30 < size10) {
                                Object obj2 = list3.get(i30);
                                c3378nn3 = (C3378nn) obj2;
                                if (!(c3378nn3.f52979a instanceof ipa) && AbstractC3466pn.m19404b(0, length, c3378nn3.f52980b, c3378nn3.f52981c)) {
                                    arrayList6.add(obj2);
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size6 = ((Collection) arrayList6).size();
                        while (i22 < size6) {
                            C3378nn c3378nn5 = (C3378nn) arrayList6.get(i22);
                            ipaVar = (ipa) c3378nn5.f52979a;
                            i28 = c3378nn5.f52980b;
                            i29 = c3378nn5.f52981c;
                            if (ipaVar instanceof ipa) {
                                gm5.m12750e();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(ipaVar.f44410a).build(), i28, i29, 33);
                        }
                        int length2 = str4.length();
                        if (list3 != null) {
                            arrayList5 = new ArrayList(list3.size());
                            size9 = list3.size();
                            while (i27 < size9) {
                                Object obj3 = list3.get(i27);
                                c3378nn2 = (C3378nn) obj3;
                                if (!(c3378nn2.f52979a instanceof lja) && AbstractC3466pn.m19404b(0, length2, c3378nn2.f52980b, c3378nn2.f52981c)) {
                                    arrayList5.add(obj3);
                                }
                            }
                        }
                        size7 = ((Collection) arrayList5).size();
                        while (i23 < size7) {
                            C3378nn c3378nn6 = (C3378nn) arrayList5.get(i23);
                            ljaVar = (lja) c3378nn6.f52979a;
                            int i48 = c3378nn6.f52980b;
                            int i49 = c3378nn6.f52981c;
                            weakHashMap2 = (WeakHashMap) sq5Var.f61248b;
                            uRLSpan = weakHashMap2.get(ljaVar);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(ljaVar.f49749a);
                                weakHashMap2.put(ljaVar, uRLSpan);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan, i48, i49, 33);
                        }
                        listM18171a = c3419onM21597H.m18171a(str4.length());
                        size8 = listM18171a.size();
                        while (i24 < size8) {
                            c3378nn = (C3378nn) listM18171a.get(i24);
                            i25 = c3378nn.f52980b;
                            obj = c3378nn.f52979a;
                            i26 = c3378nn.f52981c;
                            if (i25 != i26) {
                                fe5Var = (fe5) obj;
                                if ((fe5Var instanceof ee5) || ((ee5) fe5Var).f37110c != null) {
                                    weakHashMap = (WeakHashMap) sq5Var.f61250d;
                                    le1Var = weakHashMap.get(c3378nn);
                                    if (le1Var == null) {
                                        le1Var = new le1(fe5Var);
                                        weakHashMap.put(c3378nn, le1Var);
                                    }
                                    spannableString3.setSpan((ClickableSpan) le1Var, i25, i26, 33);
                                } else {
                                    obj.getClass();
                                    ee5 ee5Var = (ee5) obj;
                                    C3378nn c3378nn7 = new C3378nn(ee5Var, i25, i26);
                                    WeakHashMap weakHashMap3 = (WeakHashMap) sq5Var.f61249c;
                                    Object uRLSpan2 = weakHashMap3.get(c3378nn7);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(ee5Var.f37108a);
                                        weakHashMap3.put(c3378nn7, uRLSpan2);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan2, i25, i26, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) ViewOnAttachStateChangeListenerC0393e.m1765P(spannableString3);
                    } else {
                        c0423c = c0423c6;
                        r56Var = r56Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        uh8Var2 = uh8Var;
                        kv8Var2 = kv8Var;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        resources2 = resources;
                        spannableString = null;
                    }
                    c0797b4.m3284o(spannableString);
                    c0427g = AbstractC0424d.f4989M;
                    if (n66Var.m17251c(c0427g)) {
                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                        accessibilityNodeInfo5.setContentInvalid(true);
                        kv8Var3 = kv8Var2;
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setError((CharSequence) AbstractC0422b.m1838a(kv8Var3, c0427g));
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                        kv8Var3 = kv8Var2;
                    }
                    c0423c2 = c0423c;
                    Resources resources4 = resources2;
                    c0797b4.m3283n(AbstractC3584sr.m21596G(c0423c2, resources4));
                    accessibilityNodeInfo4.setCheckable(AbstractC3584sr.m21595F(c0423c2));
                    toggleableState = (ToggleableState) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4987K);
                    if (toggleableState != null) {
                        if (toggleableState == ToggleableState.On) {
                            accessibilityNodeInfo4.setChecked(true);
                        } else if (toggleableState == ToggleableState.Off) {
                            accessibilityNodeInfo4.setChecked(false);
                        }
                    }
                    bool = (Boolean) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4986J);
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (uh8Var2 == null) {
                            uh8Var3 = uh8Var2;
                            i6 = 4;
                        } else {
                            uh8Var3 = uh8Var2;
                            i6 = 4;
                            if (uh8Var3.f63934a == 4) {
                                accessibilityNodeInfo5.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                    } else {
                        uh8Var3 = uh8Var2;
                        i6 = 4;
                    }
                    if (kv8Var3.f48473c || C0423c.m1839j(i6, c0423c2).isEmpty()) {
                        list = (List) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4994a);
                        if (list != null) {
                            str = (String) u91.m22591I0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    }
                    str2 = (String) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4977A);
                    if (str2 != null) {
                        c0423cM1850l4 = c0423c2;
                        while (true) {
                            if (c0423cM1850l4 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            kv8Var4 = c0423cM1850l4.f4974d;
                            c0427g5 = AbstractC0425e.f5020a;
                            if (kv8Var4.f48471a.m17251c(c0427g5)) {
                                zBooleanValue = ((Boolean) kv8Var4.m15706g(c0427g5)).booleanValue();
                                break;
                            }
                            c0423cM1850l4 = c0423cM1850l4.m1850l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                        }
                    }
                    if (((xfa) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5001h)) != null) {
                        accessibilityNodeInfo4.setHeading(true);
                    }
                    if (((xfa) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5002i)) != null) {
                        accessibilityNodeInfo5.setTextEntryKey(true);
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iM20409d3 = r56Var.m20409d(c0423c2.f4976f);
                        if (iM20409d3 != -1) {
                            accessibilityNodeInfo5.setDrawingOrder(iM20409d3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo5.setPassword(n66Var.m17251c(AbstractC0424d.f4988L));
                    Object objM1838a = AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4991O);
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo5.setEditable(fa4.m11650l(objM1838a, bool2));
                    num = (Integer) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4992P);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo4.setEnabled(AbstractC3584sr.m21637o(c0423c2));
                    c0427g2 = AbstractC0424d.f5005l;
                    accessibilityNodeInfo4.setFocusable(n66Var.m17251c(c0427g2));
                    if (accessibilityNodeInfo5.isFocusable()) {
                        accessibilityNodeInfo4.setFocused(((Boolean) kv8Var3.m15706g(c0427g2)).booleanValue());
                        if (accessibilityNodeInfo5.isFocused()) {
                            i8 = 2;
                            c0797b4.m3271a(2);
                            viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
                            viewOnAttachStateChangeListenerC0393e.f4759l = i7;
                            z2 = true;
                        } else {
                            viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
                            z2 = true;
                            i8 = 2;
                            c0797b4.m3271a(1);
                        }
                    } else {
                        viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
                        z2 = true;
                        i8 = 2;
                    }
                    accessibilityNodeInfo4.setVisibleToUser(xwc.m24735H(c0423c2) ^ z2);
                    if (c0423c2.m1852n()) {
                        c0423cM1850l2 = c0423c2.m1850l();
                        c0423cM1850l2.getClass();
                    } else {
                        c0423cM1850l2 = c0423c2;
                    }
                    if (c0423cM1850l2.m1851m().m10807h()) {
                        accessibilityNodeInfo4.setVisibleToUser(false);
                    }
                    ch5Var = (ch5) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5004k);
                    if (ch5Var != null) {
                        i21 = ch5Var.f10091a;
                        if (i21 != 0 || i21 != 1) {
                            i8 = 1;
                        }
                        accessibilityNodeInfo5.setLiveRegion(i8);
                    }
                    accessibilityNodeInfo4.setClickable(false);
                    c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4946b);
                    if (c3024g3 != null) {
                        boolean zM11650l3 = fa4.m11650l(AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4986J), bool2);
                        z3 = (uh8Var3 == null && uh8Var3.f63934a == 4) || (uh8Var3 != null && uh8Var3.f63934a == 3);
                        if (z3 || (z3 && !zM11650l3)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        accessibilityNodeInfo4.setClickable(z4);
                        if (AbstractC3584sr.m21637o(c0423c2) && accessibilityNodeInfo5.isClickable()) {
                            c0797b4.m3272b(new C3671v3(16, c3024g3.f40090a));
                        }
                    }
                    accessibilityNodeInfo4.setLongClickable(false);
                    c3024g4 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4947c);
                    if (c3024g4 != null) {
                        accessibilityNodeInfo4.setLongClickable(true);
                        if (AbstractC3584sr.m21637o(c0423c2)) {
                            c0797b4.m3272b(new C3671v3(32, c3024g4.f40090a));
                        }
                    }
                    c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4961q);
                    if (c3024g5 != null) {
                        c0797b4.m3272b(new C3671v3(16384, c3024g5.f40090a));
                    }
                    if (AbstractC3584sr.m21637o(c0423c2)) {
                        c3024g10 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4955k);
                        if (c3024g10 != null) {
                            c0797b4.m3272b(new C3671v3(2097152, c3024g10.f40090a));
                        }
                        c3024g11 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4960p);
                        if (c3024g11 != null) {
                            c0797b4.m3272b(new C3671v3(R.id.accessibilityActionImeEnter, c3024g11.f40090a));
                        }
                        c3024g12 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4962r);
                        if (c3024g12 != null) {
                            c0797b4.m3272b(new C3671v3(65536, c3024g12.f40090a));
                        }
                        c3024g13 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4963s);
                        if (c3024g13 != null && accessibilityNodeInfo5.isFocused()) {
                            primaryClipDescription = ((b64) viewTreeObserverOnGlobalLayoutListenerC0391c2.getClipboardManager()).m3360m().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                c0797b4.m3272b(new C3671v3(32768, c3024g13.f40090a));
                            }
                        }
                    }
                    strM1766t = ViewOnAttachStateChangeListenerC0393e.m1766t(c0423c2);
                    if (strM1766t != null || strM1766t.length() == 0) {
                        c0357g = c0357g2;
                    } else {
                        accessibilityNodeInfo5.setTextSelection(viewOnAttachStateChangeListenerC0393e.m1791r(c0423c2), viewOnAttachStateChangeListenerC0393e.m1790q(c0423c2));
                        C3024g3 c3024g14 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4954j);
                        c0797b4.m3272b(new C3671v3(131072, c3024g14 != null ? c3024g14.f40090a : null));
                        c0797b4.m3271a(256);
                        c0797b4.m3271a(512);
                        accessibilityNodeInfo4.setMovementGranularities(11);
                        List list5 = (List) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4994a);
                        if ((list5 == null || list5.isEmpty()) && n66Var.m17251c(AbstractC0421a.f4945a) && (!n66Var.m17251c(AbstractC0424d.f4983G) || fa4.m11650l(AbstractC0422b.m1838a(kv8Var3, c0427g2), bool2))) {
                            c0357g = c0357g2;
                            C0357g c0357gM21594E = AbstractC3584sr.m21594E(c0357g, C0375x93be146e.f4503b);
                            if (c0357gM21594E == null) {
                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                            } else {
                                kv8 kv8VarM1613z = c0357gM21594E.m1613z();
                                if (kv8VarM1613z != null ? fa4.m11650l(AbstractC0422b.m1838a(kv8VarM1613z, c0427g2), bool2) : false) {
                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo5.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            c0357g = c0357g2;
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceM3276g = c0797b4.m3276g();
                    if (charSequenceM3276g != null && charSequenceM3276g.length() != 0 && n66Var.m17251c(AbstractC0421a.f4945a)) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (n66Var.m17251c(AbstractC0424d.f4977A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (n66Var.m17251c(AbstractC0424d.f4993Q)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                    tm7Var = (tm7) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4996c);
                    if (tm7Var != null) {
                        f = tm7Var.f62531a;
                        h41Var = tm7Var.f62532b;
                        c0427g4 = AbstractC0421a.f4953i;
                        if (n66Var.m17251c(c0427g4)) {
                            c0797b4.m3279j("android.widget.SeekBar");
                        } else {
                            c0797b4.m3279j("android.widget.ProgressBar");
                        }
                        if (tm7Var != tm7.f62530d) {
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, h41Var.f41765a, h41Var.f41766b, f));
                        }
                        if (n66Var.m17251c(c0427g4) && AbstractC3584sr.m21637o(c0423c2)) {
                            f2 = h41Var.f41766b;
                            f3 = h41Var.f41765a;
                            if (f2 < f3) {
                                f2 = f3;
                            }
                            if (f < f2) {
                                c0797b4.m3272b(C3671v3.f64758h);
                            }
                            f4 = h41Var.f41766b;
                            if (f3 > f4) {
                                f3 = f4;
                            }
                            if (f > f3) {
                                c0797b4.m3272b(C3671v3.f64759i);
                            }
                        }
                    }
                    if (AbstractC3584sr.m21637o(c0423c2) && (c3024g9 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4953i)) != null) {
                        c0797b4.m3272b(new C3671v3(R.id.accessibilityActionSetProgress, c3024g9.f40090a));
                    }
                    AbstractC3122is.m14082A(c0797b4, c0423c2);
                    if (AbstractC0422b.m1838a(c0423c2.m1849k(), AbstractC0424d.f5000g) == null) {
                        c0423cM1850l3 = c0423c2.m1850l();
                        if (c0423cM1850l3 != null && AbstractC0422b.m1838a(c0423cM1850l3.m1849k(), AbstractC0424d.f4998e) != null && ((e71Var = (e71) AbstractC0422b.m1838a(c0423cM1850l3.m1849k(), AbstractC0424d.f4999f)) == null || (e71Var.f36791a >= 0 && e71Var.f36792b >= 0))) {
                            if (c0423c2.m1849k().f48471a.m17251c(AbstractC0424d.f4986J)) {
                                arrayList3 = new ArrayList();
                                listM1839j2 = C0423c.m1839j(4, c0423cM1850l3);
                                size5 = listM1839j2.size();
                                i18 = 0;
                                i19 = 0;
                                while (i18 < size5) {
                                    c0423c3 = (C0423c) listM1839j2.get(i18);
                                    List list6 = listM1839j2;
                                    if (c0423c3.m1849k().f48471a.m17251c(AbstractC0424d.f4986J)) {
                                        arrayList3.add(c0423c3);
                                        if (c0423c3.f4973c.m1612y() < c0423c2.f4973c.m1612y()) {
                                            i19++;
                                        }
                                    }
                                    i18++;
                                    listM1839j2 = list6;
                                }
                                if (!arrayList3.isEmpty()) {
                                    zM14094h = AbstractC3122is.m14094h(arrayList3);
                                    if (zM14094h) {
                                        i20 = 0;
                                    } else {
                                        i20 = i19;
                                    }
                                    if (!zM14094h) {
                                        i19 = 0;
                                    }
                                    objM17255g = c0423c2.m1849k().f48471a.m17255g(AbstractC0424d.f4986J);
                                    if (objM17255g == null) {
                                        objM17255g = Boolean.FALSE;
                                    }
                                    c0797b4.m3281l(m58.m16638l(((Boolean) objM17255g).booleanValue(), i20, 1, i19, 1));
                                }
                            }
                        }
                    } else {
                        ho2.m13383c();
                    }
                    mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5015v);
                    C3024g3 c3024g15 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4948d);
                    if (mn8Var != null && c3024g15 != null) {
                        if (AbstractC0422b.m1838a(c0423c2.m1849k(), AbstractC0424d.f4999f) == null && AbstractC0422b.m1838a(c0423c2.m1849k(), AbstractC0424d.f4998e) == null) {
                            c0797b4.m3279j("android.widget.HorizontalScrollView");
                        }
                        if (((Number) mn8Var.f51589b.mo0a()).floatValue() > 0.0f) {
                            c0797b4.m3282m(true);
                        }
                        if (AbstractC3584sr.m21637o(c0423c2)) {
                            if (ViewOnAttachStateChangeListenerC0393e.m1769z(mn8Var)) {
                                c0797b4.m3272b(C3671v3.f64758h);
                                if (c0357g.f4328U == LayoutDirection.Rtl) {
                                    c3671v4 = C3671v3.f64764n;
                                } else {
                                    c3671v4 = C3671v3.f64766p;
                                }
                                c0797b4.m3272b(c3671v4);
                            }
                            if (ViewOnAttachStateChangeListenerC0393e.m1768y(mn8Var)) {
                                c0797b4.m3272b(C3671v3.f64759i);
                                if (c0357g.f4328U == LayoutDirection.Rtl) {
                                    c3671v3 = C3671v3.f64766p;
                                } else {
                                    c3671v3 = C3671v3.f64764n;
                                }
                                c0797b4.m3272b(c3671v3);
                            }
                        }
                    }
                    mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5016w);
                    if (mn8Var2 != null && c3024g15 != null) {
                        if (AbstractC0422b.m1838a(c0423c2.m1849k(), AbstractC0424d.f4999f) == null && AbstractC0422b.m1838a(c0423c2.m1849k(), AbstractC0424d.f4998e) == null) {
                            c0797b4.m3279j("android.widget.ScrollView");
                        }
                        if (((Number) mn8Var2.f51589b.mo0a()).floatValue() > 0.0f) {
                            c0797b4.m3282m(true);
                        }
                        if (AbstractC3584sr.m21637o(c0423c2)) {
                            if (ViewOnAttachStateChangeListenerC0393e.m1769z(mn8Var2)) {
                                c0797b4.m3272b(C3671v3.f64758h);
                                c0797b4.m3272b(C3671v3.f64765o);
                            }
                            if (ViewOnAttachStateChangeListenerC0393e.m1768y(mn8Var2)) {
                                c0797b4.m3272b(C3671v3.f64759i);
                                c0797b4.m3272b(C3671v3.f64763m);
                            }
                        }
                    }
                    AbstractC3423or.m18258i(c0797b4, c0423c2);
                    accessibilityNodeInfo4.setPaneTitle((CharSequence) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4997d));
                    if (AbstractC3584sr.m21637o(c0423c2)) {
                        c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4964t);
                        if (c3024g6 != null) {
                            c0797b4.m3272b(new C3671v3(262144, c3024g6.f40090a));
                        }
                        c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4965u);
                        if (c3024g7 != null) {
                            c0797b4.m3272b(new C3671v3(524288, c3024g7.f40090a));
                        }
                        c3024g8 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4966v);
                        if (c3024g8 != null) {
                            c0797b4.m3272b(new C3671v3(1048576, c3024g8.f40090a));
                        }
                        c0427g3 = AbstractC0421a.f4968x;
                        if (n66Var.m17251c(c0427g3)) {
                            list2 = (List) kv8Var3.m15706g(c0427g3);
                            s56Var3 = s56Var2;
                            if (list2.size() < s56Var3.f60382b) {
                                C3386nv.m17633t(wq1.m24123s(new StringBuilder("Can't have more than "), s56Var3.f60382b, " custom actions for one widget"));
                                return null;
                            }
                            pe9Var3 = new pe9(0);
                            d66VarM13421a = hp6.m13421a();
                            pe9Var4 = pe9Var2;
                            if (pe9Var4.f56013a) {
                                AbstractC3122is.m14091e(pe9Var4);
                            }
                            if (AbstractC3423or.m18260j(pe9Var4.f56016d, i7, pe9Var4.f56014b) >= 0) {
                                d66Var = (d66) pe9Var4.m19078b(i7);
                                s56Var4 = new s56();
                                iArr = s56Var3.f60381a;
                                i10 = s56Var3.f60382b;
                                while (i11 < i10) {
                                    s56Var4.m21101a(iArr[i11]);
                                }
                                arrayList2 = new ArrayList();
                                size3 = list2.size();
                                i12 = 0;
                                while (i12 < size3) {
                                    fx1Var = (fx1) list2.get(i12);
                                    d66Var.getClass();
                                    int i50 = size3;
                                    if (d66Var.m10125d(fx1Var.m12243a()) >= 0) {
                                        strM12243a = fx1Var.m12243a();
                                        iM10125d = d66Var.m10125d(strM12243a);
                                        if (iM10125d >= 0) {
                                            throw new NoSuchElementException("There is no key " + ((Object) strM12243a) + " in the map");
                                        }
                                        i14 = d66Var.f35036c[iM10125d];
                                        pe9Var3.m19080d(i14, fx1Var.m12243a());
                                        d66VarM13421a.m10128g(i14, fx1Var.m12243a());
                                        iArr2 = s56Var4.f60381a;
                                        i15 = s56Var4.f60382b;
                                        i16 = 0;
                                        while (true) {
                                            if (i16 < i15) {
                                                i16 = -1;
                                                break;
                                            }
                                            i17 = i15;
                                            if (i14 == iArr2[i16]) {
                                                break;
                                            }
                                            i16++;
                                            i15 = i17;
                                        }
                                        if (i16 >= 0) {
                                            s56Var4.m21105e(i16);
                                        }
                                        c0797b4.m3272b(new C3671v3(i14, fx1Var.m12243a()));
                                    } else {
                                        arrayList2.add(fx1Var);
                                    }
                                    i12++;
                                    size3 = i50;
                                    d66Var = d66Var;
                                }
                                size4 = arrayList2.size();
                                while (i13 < size4) {
                                    fx1 fx1Var2 = (fx1) arrayList2.get(i13);
                                    int iM21103c = s56Var4.m21103c(i13);
                                    pe9Var3.m19080d(iM21103c, fx1Var2.m12243a());
                                    d66VarM13421a.m10128g(iM21103c, fx1Var2.m12243a());
                                    c0797b4.m3272b(new C3671v3(iM21103c, fx1Var2.m12243a()));
                                }
                            } else {
                                size2 = list2.size();
                                while (i9 < size2) {
                                    fx1 fx1Var3 = (fx1) list2.get(i9);
                                    int iM21103c2 = s56Var3.m21103c(i9);
                                    pe9Var3.m19080d(iM21103c2, fx1Var3.m12243a());
                                    d66VarM13421a.m10128g(iM21103c2, fx1Var3.m12243a());
                                    c0797b4.m3272b(new C3671v3(iM21103c2, fx1Var3.m12243a()));
                                }
                            }
                            viewOnAttachStateChangeListenerC0393e.f4729M.m19080d(i7, pe9Var3);
                            pe9Var4.m19080d(i7, d66VarM13421a);
                        }
                    }
                    accessibilityNodeInfo4.setScreenReaderFocusable(AbstractC3584sr.m21638p(c0423c2, resources4));
                    iM20409d = viewOnAttachStateChangeListenerC0393e.f4739W.m20409d(i7);
                    if (iM20409d != -1) {
                        abstractC0442bM24761d1 = xwc.m24761d0(viewTreeObserverOnGlobalLayoutListenerC0391c2.getAndroidViewsHandler$ui(), iM20409d);
                        if (abstractC0442bM24761d1 != null) {
                            accessibilityNodeInfo4.setTraversalBefore(abstractC0442bM24761d1);
                            viewTreeObserverOnGlobalLayoutListenerC0391c = viewTreeObserverOnGlobalLayoutListenerC0391c2;
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC0391c = viewTreeObserverOnGlobalLayoutListenerC0391c2;
                            accessibilityNodeInfo4.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0391c, iM20409d);
                        }
                        bundle = null;
                        viewOnAttachStateChangeListenerC0393e.m1783j(i7, c0797b4, viewOnAttachStateChangeListenerC0393e.f4741Y, null);
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC0391c = viewTreeObserverOnGlobalLayoutListenerC0391c2;
                        bundle = null;
                    }
                    iM20409d2 = viewOnAttachStateChangeListenerC0393e.f4740X.m20409d(i7);
                    if (iM20409d2 != -1 && (abstractC0442bM24761d0 = xwc.m24761d0(viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui(), iM20409d2)) != null) {
                        accessibilityNodeInfo4.setTraversalAfter(abstractC0442bM24761d0);
                        viewOnAttachStateChangeListenerC0393e.m1783j(i7, c0797b4, viewOnAttachStateChangeListenerC0393e.f4742Z, bundle);
                    }
                    str3 = (String) AbstractC0422b.m1838a(c0423c2.f4974d, AbstractC0425e.f5021b);
                    if (str3 != null) {
                        c0797b4.m3279j(str3);
                    }
                    c0797b5 = c0797b4;
                } else if (Build.VERSION.SDK_INT >= 34 ? AbstractC3521r3.m20273e(accessibilityManager) : true) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    c0797b4 = new C0797b4(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        AbstractC3521r3.m20274f(accessibilityNodeInfoObtain, zM11650l2);
                    } else {
                        extras = accessibilityNodeInfoObtain.getExtras();
                        if (extras != null) {
                            int i410 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65);
                            if (zM11650l2) {
                                i3 = 64;
                            } else {
                                i3 = 0;
                            }
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i410 | i3);
                        }
                    }
                    if (i == -1) {
                        parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC0391c2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        c0797b4.f7901b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        c0423cM1850l = c0423c6.m1850l();
                        if (c0423cM1850l != null) {
                            numValueOf = Integer.valueOf(c0423cM1850l.f4976f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            i54.m13664c("semanticsNode " + i + " has null parent");
                            C3386nv.m17631r();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC0391c2.getSemanticsOwner().m21750a().f4976f) {
                            iIntValue = -1;
                        }
                        c0797b4.f7901b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(viewTreeObserverOnGlobalLayoutListenerC0391c2, iIntValue);
                    }
                    c0797b4.f7902c = i;
                    accessibilityNodeInfoObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0391c2, i);
                    c0797b4.m3278i(viewOnAttachStateChangeListenerC0393e2.m1784k(rv8Var2));
                    s56Var = ViewOnAttachStateChangeListenerC0393e.f4723i0;
                    r56Var = viewOnAttachStateChangeListenerC0393e2.f4749e0;
                    pe9Var = viewOnAttachStateChangeListenerC0393e2.f4730N;
                    resources = viewTreeObserverOnGlobalLayoutListenerC0391c2.getContext().getResources();
                    c0797b4.m3279j("android.view.View");
                    kv8Var = c0423c6.f4974d;
                    n66Var = kv8Var.f48471a;
                    if (n66Var.m17251c(AbstractC0424d.f4983G)) {
                        c0797b4.m3279j("android.widget.EditText");
                    }
                    if (n66Var.m17251c(AbstractC0424d.f4979C)) {
                        c0797b4.m3279j("android.widget.TextView");
                    }
                    uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5019z);
                    if (uh8Var != null) {
                        i41 = uh8Var.f63934a;
                        if (c0423c6.m1852n()) {
                            pe9Var2 = pe9Var;
                            i42 = 4;
                            s56Var2 = s56Var;
                        } else {
                            pe9Var2 = pe9Var;
                            i42 = 4;
                            s56Var2 = s56Var;
                            if (C0423c.m1839j(4, c0423c6).isEmpty()) {
                            }
                        }
                        if (i41 == i42) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R$string.tab));
                        } else if (i41 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R$string.switch_role));
                        } else {
                            strM24763e0 = xwc.m24763e0(i41);
                            if (i41 == 5) {
                                c0797b4.m3279j(strM24763e0);
                            } else {
                                c0797b4.m3279j(strM24763e0);
                            }
                        }
                    } else {
                        s56Var2 = s56Var;
                        pe9Var2 = pe9Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0391c2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(xwc.m24736I(c0423c6));
                    if (i2 >= 34) {
                        zM20273e = AbstractC3521r3.m20273e(accessibilityManager);
                    } else {
                        zM20273e = true;
                    }
                    listM1839j = C0423c.m1839j(4, c0423c6);
                    size = listM1839j.size();
                    z = zM20273e;
                    i4 = 0;
                    i5 = 0;
                    while (true) {
                        accessibilityNodeInfo = c0797b4.f7900a;
                        if (i5 < size) {
                            break;
                            break;
                        }
                        List list7 = listM1839j;
                        c0423c4 = (C0423c) listM1839j.get(i5);
                        int i411 = size;
                        d84VarM1792s = viewOnAttachStateChangeListenerC0393e2.m1792s();
                        int i412 = i5;
                        i40 = c0423c4.f4976f;
                        if (d84VarM1792s.m10151a(i40)) {
                            abstractC0442b = viewTreeObserverOnGlobalLayoutListenerC0391c2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c0423c4.f4973c);
                            if (i40 != -1) {
                                if (abstractC0442b != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC0442b);
                                } else {
                                    rv8Var = (rv8) viewOnAttachStateChangeListenerC0393e2.m1792s().m10152b(i40);
                                    if (rv8Var != null) {
                                        zM11650l = false;
                                    } else {
                                        zM11650l = false;
                                    }
                                    if (z) {
                                        accessibilityNodeInfo.addChild(viewTreeObserverOnGlobalLayoutListenerC0391c2, i40);
                                    } else {
                                        accessibilityNodeInfo.addChild(viewTreeObserverOnGlobalLayoutListenerC0391c2, i40);
                                    }
                                }
                                r56Var.m20411f(i40, i4);
                                i4++;
                            }
                        }
                        i5 = i412 + 1;
                        size = i411;
                        listM1839j = list7;
                    }
                    if (i == viewOnAttachStateChangeListenerC0393e2.f4758k) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c0797b4.m3272b(C3671v3.f64757g);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c0797b4.m3272b(C3671v3.f64756f);
                    }
                    c3419onM21597H = AbstractC3584sr.m21597H(c0423c6);
                    if (c3419onM21597H != null) {
                        fontFamilyResolver = viewTreeObserverOnGlobalLayoutListenerC0391c2.getFontFamilyResolver();
                        density = viewTreeObserverOnGlobalLayoutListenerC0391c2.getDensity();
                        sq5Var = viewOnAttachStateChangeListenerC0393e2.f4743a0;
                        String str5 = c3419onM21597H.f54604b;
                        list3 = c3419onM21597H.f54603a;
                        spannableString2 = new SpannableString(str5);
                        arrayList4 = c3419onM21597H.f54605c;
                        if (arrayList4 != null) {
                            size11 = arrayList4.size();
                            i31 = 0;
                            while (i31 < size11) {
                                int i413 = size11;
                                C3378nn c3378nn8 = (C3378nn) arrayList4.get(i31);
                                int i414 = i31;
                                he9 he9Var2 = (he9) c3378nn8.f52979a;
                                ArrayList arrayList8 = arrayList4;
                                i32 = c3378nn8.f52980b;
                                i33 = c3378nn8.f52981c;
                                uh8 uh8Var5 = uh8Var;
                                he9VarM13209a = he9.m13209a(he9Var2, null, 65503);
                                xv9 xv9Var2 = he9VarM13209a.f42264a;
                                yv9Var = he9VarM13209a.f42273j;
                                rt9Var = he9VarM13209a.f42276m;
                                C0423c c0423c8 = c0423c6;
                                xa3Var = he9VarM13209a.f42269f;
                                Resources resources5 = resources;
                                wb3Var = he9VarM13209a.f42267d;
                                kv8 kv8Var6 = kv8Var;
                                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfoObtain;
                                pvc.m19498F(spannableString2, xv9Var2.mo24173a(), i32, i33);
                                spannableString4 = spannableString2;
                                pvc.m19499G(spannableString4, he9VarM13209a.f42265b, density, i32, i33);
                                bc3Var = he9VarM13209a.f42266c;
                                if (bc3Var == null) {
                                    if (bc3Var == null) {
                                        bc3Var = bc3.f8321g;
                                    }
                                    if (wb3Var != null) {
                                        i34 = wb3Var.f66583a;
                                    } else {
                                        i34 = 0;
                                    }
                                    if (bc3Var.compareTo(bc3.f8318d) >= 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i34 == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!z6) {
                                        if (z5) {
                                            i35 = 1;
                                        } else if (z6) {
                                            i35 = 2;
                                        } else {
                                            i35 = 0;
                                        }
                                    } else if (z5) {
                                        i35 = 1;
                                    } else if (z6) {
                                        i35 = 2;
                                    } else {
                                        i35 = 0;
                                    }
                                    StyleSpan styleSpan2 = new StyleSpan(i35);
                                    i36 = 33;
                                    spannableString4.setSpan(styleSpan2, i32, i33, 33);
                                } else {
                                    if (bc3Var == null) {
                                        bc3Var = bc3.f8321g;
                                    }
                                    if (wb3Var != null) {
                                        i34 = wb3Var.f66583a;
                                    } else {
                                        i34 = 0;
                                    }
                                    if (bc3Var.compareTo(bc3.f8318d) >= 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i34 == 1) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!z6) {
                                        if (z5) {
                                            i35 = 1;
                                        } else if (z6) {
                                            i35 = 2;
                                        } else {
                                            i35 = 0;
                                        }
                                    } else if (z5) {
                                        i35 = 1;
                                    } else if (z6) {
                                        i35 = 2;
                                    } else {
                                        i35 = 0;
                                    }
                                    StyleSpan styleSpan3 = new StyleSpan(i35);
                                    i36 = 33;
                                    spannableString4.setSpan(styleSpan3, i32, i33, 33);
                                }
                                if (xa3Var == null) {
                                    i37 = i36;
                                } else if (xa3Var instanceof dl3) {
                                    spannableString4.setSpan(new TypefaceSpan("sans-serif"), i32, i33, i36);
                                    i37 = i36;
                                } else {
                                    xb3Var = he9VarM13209a.f42268e;
                                    if (xb3Var != null) {
                                        i39 = xb3Var.f68021a;
                                    } else {
                                        i39 = 65535;
                                    }
                                    Object value2 = ((ya3) fontFamilyResolver).m25018b(xa3Var, bc3.f8321g, 0, i39).getValue();
                                    value2.getClass();
                                    TypefaceSpan typefaceSpan2 = new TypefaceSpan((Typeface) value2);
                                    i37 = 33;
                                    spannableString4.setSpan(typefaceSpan2, i32, i33, 33);
                                }
                                if (rt9Var != null) {
                                    i38 = rt9Var.f59804a;
                                    if ((i38 | 1) == i38) {
                                        spannableString4.setSpan(new UnderlineSpan(), i32, i33, i37);
                                    }
                                    if ((i38 | 2) == i38) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i32, i33, i37);
                                    }
                                }
                                if (yv9Var != null) {
                                    spannableString4.setSpan(new ScaleXSpan(yv9Var.f70560a), i32, i33, i37);
                                }
                                pvc.m19500H(spannableString4, he9VarM13209a.f42274k, i32, i33);
                                j = he9VarM13209a.f42275l;
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(d32.m10042h0(j)), i32, i33, 33);
                                }
                                i31 = i414 + 1;
                                spannableString2 = spannableString4;
                                accessibilityNodeInfo = accessibilityNodeInfo;
                                size11 = i413;
                                arrayList4 = arrayList8;
                                uh8Var = uh8Var5;
                                c0423c6 = c0423c8;
                                resources = resources5;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo7;
                                kv8Var = kv8Var6;
                            }
                        }
                        spannableString3 = spannableString2;
                        c0423c = c0423c6;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        uh8Var2 = uh8Var;
                        kv8Var2 = kv8Var;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        resources2 = resources;
                        int length3 = str5.length();
                        arrayList5 = EmptyList.f47638a;
                        if (list3 != null) {
                            arrayList6 = new ArrayList(list3.size());
                            size10 = list3.size();
                            for (i30 = 0; i30 < size10; i30++) {
                                Object obj4 = list3.get(i30);
                                c3378nn3 = (C3378nn) obj4;
                                if (!(c3378nn3.f52979a instanceof ipa)) {
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size6 = ((Collection) arrayList6).size();
                        for (i22 = 0; i22 < size6; i22++) {
                            C3378nn c3378nn9 = (C3378nn) arrayList6.get(i22);
                            ipaVar = (ipa) c3378nn9.f52979a;
                            i28 = c3378nn9.f52980b;
                            i29 = c3378nn9.f52981c;
                            if (ipaVar instanceof ipa) {
                                gm5.m12750e();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(ipaVar.f44410a).build(), i28, i29, 33);
                        }
                        int length4 = str5.length();
                        if (list3 != null) {
                            arrayList5 = new ArrayList(list3.size());
                            size9 = list3.size();
                            for (i27 = 0; i27 < size9; i27++) {
                                Object obj5 = list3.get(i27);
                                c3378nn2 = (C3378nn) obj5;
                                if (!(c3378nn2.f52979a instanceof lja)) {
                                }
                            }
                        }
                        size7 = ((Collection) arrayList5).size();
                        for (i23 = 0; i23 < size7; i23++) {
                            C3378nn c3378nn10 = (C3378nn) arrayList5.get(i23);
                            ljaVar = (lja) c3378nn10.f52979a;
                            int i415 = c3378nn10.f52980b;
                            int i416 = c3378nn10.f52981c;
                            weakHashMap2 = (WeakHashMap) sq5Var.f61248b;
                            uRLSpan = weakHashMap2.get(ljaVar);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(ljaVar.f49749a);
                                weakHashMap2.put(ljaVar, uRLSpan);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan, i415, i416, 33);
                        }
                        listM18171a = c3419onM21597H.m18171a(str5.length());
                        size8 = listM18171a.size();
                        for (i24 = 0; i24 < size8; i24++) {
                            c3378nn = (C3378nn) listM18171a.get(i24);
                            i25 = c3378nn.f52980b;
                            obj = c3378nn.f52979a;
                            i26 = c3378nn.f52981c;
                            if (i25 != i26) {
                                fe5Var = (fe5) obj;
                                if (fe5Var instanceof ee5) {
                                    weakHashMap = (WeakHashMap) sq5Var.f61250d;
                                    le1Var = weakHashMap.get(c3378nn);
                                    if (le1Var == null) {
                                        le1Var = new le1(fe5Var);
                                        weakHashMap.put(c3378nn, le1Var);
                                    }
                                    spannableString3.setSpan((ClickableSpan) le1Var, i25, i26, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) sq5Var.f61250d;
                                    le1Var = weakHashMap.get(c3378nn);
                                    if (le1Var == null) {
                                        le1Var = new le1(fe5Var);
                                        weakHashMap.put(c3378nn, le1Var);
                                    }
                                    spannableString3.setSpan((ClickableSpan) le1Var, i25, i26, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) ViewOnAttachStateChangeListenerC0393e.m1765P(spannableString3);
                    } else {
                        c0423c = c0423c6;
                        r56Var = r56Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        uh8Var2 = uh8Var;
                        kv8Var2 = kv8Var;
                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                        resources2 = resources;
                        spannableString = null;
                    }
                    c0797b4.m3284o(spannableString);
                    c0427g = AbstractC0424d.f4989M;
                    if (n66Var.m17251c(c0427g)) {
                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                        accessibilityNodeInfo5.setContentInvalid(true);
                        kv8Var3 = kv8Var2;
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setError((CharSequence) AbstractC0422b.m1838a(kv8Var3, c0427g));
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo5 = accessibilityNodeInfo3;
                        kv8Var3 = kv8Var2;
                    }
                    c0423c2 = c0423c;
                    Resources resources6 = resources2;
                    c0797b4.m3283n(AbstractC3584sr.m21596G(c0423c2, resources6));
                    accessibilityNodeInfo4.setCheckable(AbstractC3584sr.m21595F(c0423c2));
                    toggleableState = (ToggleableState) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4987K);
                    if (toggleableState != null) {
                        if (toggleableState == ToggleableState.On) {
                            accessibilityNodeInfo4.setChecked(true);
                        } else if (toggleableState == ToggleableState.Off) {
                            accessibilityNodeInfo4.setChecked(false);
                        }
                    }
                    bool = (Boolean) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4986J);
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (uh8Var2 == null) {
                            uh8Var3 = uh8Var2;
                            i6 = 4;
                        } else {
                            uh8Var3 = uh8Var2;
                            i6 = 4;
                            if (uh8Var3.f63934a == 4) {
                                accessibilityNodeInfo5.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                    } else {
                        uh8Var3 = uh8Var2;
                        i6 = 4;
                    }
                    if (kv8Var3.f48473c) {
                        list = (List) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4994a);
                        if (list != null) {
                            str = (String) u91.m22591I0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    } else {
                        list = (List) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4994a);
                        if (list != null) {
                            str = (String) u91.m22591I0(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    }
                    str2 = (String) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4977A);
                    if (str2 != null) {
                        c0423cM1850l4 = c0423c2;
                        while (true) {
                            if (c0423cM1850l4 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            kv8Var4 = c0423cM1850l4.f4974d;
                            c0427g5 = AbstractC0425e.f5020a;
                            if (kv8Var4.f48471a.m17251c(c0427g5)) {
                                zBooleanValue = ((Boolean) kv8Var4.m15706g(c0427g5)).booleanValue();
                                break;
                            }
                            c0423cM1850l4 = c0423cM1850l4.m1850l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo5.setViewIdResourceName(str2);
                        }
                    }
                    if (((xfa) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5001h)) != null) {
                        accessibilityNodeInfo4.setHeading(true);
                    }
                    if (((xfa) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5002i)) != null) {
                        accessibilityNodeInfo5.setTextEntryKey(true);
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iM20409d3 = r56Var.m20409d(c0423c2.f4976f);
                        if (iM20409d3 != -1) {
                            accessibilityNodeInfo5.setDrawingOrder(iM20409d3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo5.setPassword(n66Var.m17251c(AbstractC0424d.f4988L));
                    Object objM1838a2 = AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4991O);
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo5.setEditable(fa4.m11650l(objM1838a2, bool2));
                    num = (Integer) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4992P);
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo4.setEnabled(AbstractC3584sr.m21637o(c0423c2));
                    c0427g2 = AbstractC0424d.f5005l;
                    accessibilityNodeInfo4.setFocusable(n66Var.m17251c(c0427g2));
                    if (accessibilityNodeInfo5.isFocusable()) {
                        accessibilityNodeInfo4.setFocused(((Boolean) kv8Var3.m15706g(c0427g2)).booleanValue());
                        if (accessibilityNodeInfo5.isFocused()) {
                            i8 = 2;
                            c0797b4.m3271a(2);
                            viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
                            viewOnAttachStateChangeListenerC0393e.f4759l = i7;
                            z2 = true;
                        } else {
                            viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
                            z2 = true;
                            i8 = 2;
                            c0797b4.m3271a(1);
                        }
                    } else {
                        viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
                        z2 = true;
                        i8 = 2;
                    }
                    accessibilityNodeInfo4.setVisibleToUser(xwc.m24735H(c0423c2) ^ z2);
                    if (c0423c2.m1852n()) {
                        c0423cM1850l2 = c0423c2.m1850l();
                        c0423cM1850l2.getClass();
                    } else {
                        c0423cM1850l2 = c0423c2;
                    }
                    if (c0423cM1850l2.m1851m().m10807h()) {
                        accessibilityNodeInfo4.setVisibleToUser(false);
                    }
                    ch5Var = (ch5) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5004k);
                    if (ch5Var != null) {
                        i21 = ch5Var.f10091a;
                        if (i21 != 0) {
                            i8 = 1;
                        } else {
                            i8 = 1;
                        }
                        accessibilityNodeInfo5.setLiveRegion(i8);
                    }
                    accessibilityNodeInfo4.setClickable(false);
                    c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4946b);
                    if (c3024g3 != null) {
                        boolean zM11650l4 = fa4.m11650l(AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4986J), bool2);
                        if (uh8Var3 == null) {
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        accessibilityNodeInfo4.setClickable(z4);
                        if (AbstractC3584sr.m21637o(c0423c2)) {
                            c0797b4.m3272b(new C3671v3(16, c3024g3.f40090a));
                        }
                    }
                    accessibilityNodeInfo4.setLongClickable(false);
                    c3024g4 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4947c);
                    if (c3024g4 != null) {
                        accessibilityNodeInfo4.setLongClickable(true);
                        if (AbstractC3584sr.m21637o(c0423c2)) {
                            c0797b4.m3272b(new C3671v3(32, c3024g4.f40090a));
                        }
                    }
                    c3024g5 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4961q);
                    if (c3024g5 != null) {
                        c0797b4.m3272b(new C3671v3(16384, c3024g5.f40090a));
                    }
                    if (AbstractC3584sr.m21637o(c0423c2)) {
                        c3024g10 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4955k);
                        if (c3024g10 != null) {
                            c0797b4.m3272b(new C3671v3(2097152, c3024g10.f40090a));
                        }
                        c3024g11 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4960p);
                        if (c3024g11 != null) {
                            c0797b4.m3272b(new C3671v3(R.id.accessibilityActionImeEnter, c3024g11.f40090a));
                        }
                        c3024g12 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4962r);
                        if (c3024g12 != null) {
                            c0797b4.m3272b(new C3671v3(65536, c3024g12.f40090a));
                        }
                        c3024g13 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4963s);
                        if (c3024g13 != null) {
                            primaryClipDescription = ((b64) viewTreeObserverOnGlobalLayoutListenerC0391c2.getClipboardManager()).m3360m().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                c0797b4.m3272b(new C3671v3(32768, c3024g13.f40090a));
                            }
                        }
                    }
                    strM1766t = ViewOnAttachStateChangeListenerC0393e.m1766t(c0423c2);
                    if (strM1766t != null) {
                        c0357g = c0357g2;
                    } else {
                        c0357g = c0357g2;
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceM3276g = c0797b4.m3276g();
                    if (charSequenceM3276g != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (n66Var.m17251c(AbstractC0424d.f4977A)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (n66Var.m17251c(AbstractC0424d.f4993Q)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo5.setAvailableExtraData(arrayList);
                    tm7Var = (tm7) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4996c);
                    if (tm7Var != null) {
                        f = tm7Var.f62531a;
                        h41Var = tm7Var.f62532b;
                        c0427g4 = AbstractC0421a.f4953i;
                        if (n66Var.m17251c(c0427g4)) {
                            c0797b4.m3279j("android.widget.SeekBar");
                        } else {
                            c0797b4.m3279j("android.widget.ProgressBar");
                        }
                        if (tm7Var != tm7.f62530d) {
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, h41Var.f41765a, h41Var.f41766b, f));
                        }
                        if (n66Var.m17251c(c0427g4)) {
                            f2 = h41Var.f41766b;
                            f3 = h41Var.f41765a;
                            if (f2 < f3) {
                                f2 = f3;
                            }
                            if (f < f2) {
                                c0797b4.m3272b(C3671v3.f64758h);
                            }
                            f4 = h41Var.f41766b;
                            if (f3 > f4) {
                                f3 = f4;
                            }
                            if (f > f3) {
                                c0797b4.m3272b(C3671v3.f64759i);
                            }
                        }
                    }
                    if (AbstractC3584sr.m21637o(c0423c2)) {
                        c0797b4.m3272b(new C3671v3(R.id.accessibilityActionSetProgress, c3024g9.f40090a));
                    }
                    AbstractC3122is.m14082A(c0797b4, c0423c2);
                    if (AbstractC0422b.m1838a(c0423c2.m1849k(), AbstractC0424d.f5000g) == null) {
                        c0423cM1850l3 = c0423c2.m1850l();
                        if (c0423cM1850l3 != null) {
                            if (c0423c2.m1849k().f48471a.m17251c(AbstractC0424d.f4986J)) {
                                arrayList3 = new ArrayList();
                                listM1839j2 = C0423c.m1839j(4, c0423cM1850l3);
                                size5 = listM1839j2.size();
                                i18 = 0;
                                i19 = 0;
                                while (i18 < size5) {
                                    c0423c3 = (C0423c) listM1839j2.get(i18);
                                    List list8 = listM1839j2;
                                    if (c0423c3.m1849k().f48471a.m17251c(AbstractC0424d.f4986J)) {
                                        arrayList3.add(c0423c3);
                                        if (c0423c3.f4973c.m1612y() < c0423c2.f4973c.m1612y()) {
                                            i19++;
                                        }
                                    }
                                    i18++;
                                    listM1839j2 = list8;
                                }
                                if (!arrayList3.isEmpty()) {
                                    zM14094h = AbstractC3122is.m14094h(arrayList3);
                                    if (zM14094h) {
                                        i20 = 0;
                                    } else {
                                        i20 = i19;
                                    }
                                    if (!zM14094h) {
                                        i19 = 0;
                                    }
                                    objM17255g = c0423c2.m1849k().f48471a.m17255g(AbstractC0424d.f4986J);
                                    if (objM17255g == null) {
                                        objM17255g = Boolean.FALSE;
                                    }
                                    c0797b4.m3281l(m58.m16638l(((Boolean) objM17255g).booleanValue(), i20, 1, i19, 1));
                                }
                            }
                        }
                    } else {
                        ho2.m13383c();
                    }
                    mn8Var = (mn8) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5015v);
                    C3024g3 c3024g16 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4948d);
                    if (mn8Var != null) {
                        if (AbstractC0422b.m1838a(c0423c2.m1849k(), AbstractC0424d.f4999f) == null) {
                            c0797b4.m3279j("android.widget.HorizontalScrollView");
                        }
                        if (((Number) mn8Var.f51589b.mo0a()).floatValue() > 0.0f) {
                            c0797b4.m3282m(true);
                        }
                        if (AbstractC3584sr.m21637o(c0423c2)) {
                            if (ViewOnAttachStateChangeListenerC0393e.m1769z(mn8Var)) {
                                c0797b4.m3272b(C3671v3.f64758h);
                                if (c0357g.f4328U == LayoutDirection.Rtl) {
                                    c3671v4 = C3671v3.f64764n;
                                } else {
                                    c3671v4 = C3671v3.f64766p;
                                }
                                c0797b4.m3272b(c3671v4);
                            }
                            if (ViewOnAttachStateChangeListenerC0393e.m1768y(mn8Var)) {
                                c0797b4.m3272b(C3671v3.f64759i);
                                if (c0357g.f4328U == LayoutDirection.Rtl) {
                                    c3671v3 = C3671v3.f64766p;
                                } else {
                                    c3671v3 = C3671v3.f64764n;
                                }
                                c0797b4.m3272b(c3671v3);
                            }
                        }
                    }
                    mn8Var2 = (mn8) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f5016w);
                    if (mn8Var2 != null) {
                        if (AbstractC0422b.m1838a(c0423c2.m1849k(), AbstractC0424d.f4999f) == null) {
                            c0797b4.m3279j("android.widget.ScrollView");
                        }
                        if (((Number) mn8Var2.f51589b.mo0a()).floatValue() > 0.0f) {
                            c0797b4.m3282m(true);
                        }
                        if (AbstractC3584sr.m21637o(c0423c2)) {
                            if (ViewOnAttachStateChangeListenerC0393e.m1769z(mn8Var2)) {
                                c0797b4.m3272b(C3671v3.f64758h);
                                c0797b4.m3272b(C3671v3.f64765o);
                            }
                            if (ViewOnAttachStateChangeListenerC0393e.m1768y(mn8Var2)) {
                                c0797b4.m3272b(C3671v3.f64759i);
                                c0797b4.m3272b(C3671v3.f64763m);
                            }
                        }
                    }
                    AbstractC3423or.m18258i(c0797b4, c0423c2);
                    accessibilityNodeInfo4.setPaneTitle((CharSequence) AbstractC0422b.m1838a(kv8Var3, AbstractC0424d.f4997d));
                    if (AbstractC3584sr.m21637o(c0423c2)) {
                        c3024g6 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4964t);
                        if (c3024g6 != null) {
                            c0797b4.m3272b(new C3671v3(262144, c3024g6.f40090a));
                        }
                        c3024g7 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4965u);
                        if (c3024g7 != null) {
                            c0797b4.m3272b(new C3671v3(524288, c3024g7.f40090a));
                        }
                        c3024g8 = (C3024g3) AbstractC0422b.m1838a(kv8Var3, AbstractC0421a.f4966v);
                        if (c3024g8 != null) {
                            c0797b4.m3272b(new C3671v3(1048576, c3024g8.f40090a));
                        }
                        c0427g3 = AbstractC0421a.f4968x;
                        if (n66Var.m17251c(c0427g3)) {
                            list2 = (List) kv8Var3.m15706g(c0427g3);
                            s56Var3 = s56Var2;
                            if (list2.size() < s56Var3.f60382b) {
                                C3386nv.m17633t(wq1.m24123s(new StringBuilder("Can't have more than "), s56Var3.f60382b, " custom actions for one widget"));
                                return null;
                            }
                            pe9Var3 = new pe9(0);
                            d66VarM13421a = hp6.m13421a();
                            pe9Var4 = pe9Var2;
                            if (pe9Var4.f56013a) {
                                AbstractC3122is.m14091e(pe9Var4);
                            }
                            if (AbstractC3423or.m18260j(pe9Var4.f56016d, i7, pe9Var4.f56014b) >= 0) {
                                d66Var = (d66) pe9Var4.m19078b(i7);
                                s56Var4 = new s56();
                                iArr = s56Var3.f60381a;
                                i10 = s56Var3.f60382b;
                                for (i11 = 0; i11 < i10; i11++) {
                                    s56Var4.m21101a(iArr[i11]);
                                }
                                arrayList2 = new ArrayList();
                                size3 = list2.size();
                                i12 = 0;
                                while (i12 < size3) {
                                    fx1Var = (fx1) list2.get(i12);
                                    d66Var.getClass();
                                    int i51 = size3;
                                    if (d66Var.m10125d(fx1Var.m12243a()) >= 0) {
                                        strM12243a = fx1Var.m12243a();
                                        iM10125d = d66Var.m10125d(strM12243a);
                                        if (iM10125d >= 0) {
                                            throw new NoSuchElementException("There is no key " + ((Object) strM12243a) + " in the map");
                                        }
                                        i14 = d66Var.f35036c[iM10125d];
                                        pe9Var3.m19080d(i14, fx1Var.m12243a());
                                        d66VarM13421a.m10128g(i14, fx1Var.m12243a());
                                        iArr2 = s56Var4.f60381a;
                                        i15 = s56Var4.f60382b;
                                        i16 = 0;
                                        while (true) {
                                            if (i16 < i15) {
                                                i16 = -1;
                                                break;
                                            }
                                            i17 = i15;
                                            if (i14 == iArr2[i16]) {
                                                break;
                                                break;
                                            }
                                            i16++;
                                            i15 = i17;
                                        }
                                        if (i16 >= 0) {
                                            s56Var4.m21105e(i16);
                                        }
                                        c0797b4.m3272b(new C3671v3(i14, fx1Var.m12243a()));
                                    } else {
                                        arrayList2.add(fx1Var);
                                    }
                                    i12++;
                                    size3 = i51;
                                    d66Var = d66Var;
                                }
                                size4 = arrayList2.size();
                                for (i13 = 0; i13 < size4; i13++) {
                                    fx1 fx1Var4 = (fx1) arrayList2.get(i13);
                                    int iM21103c3 = s56Var4.m21103c(i13);
                                    pe9Var3.m19080d(iM21103c3, fx1Var4.m12243a());
                                    d66VarM13421a.m10128g(iM21103c3, fx1Var4.m12243a());
                                    c0797b4.m3272b(new C3671v3(iM21103c3, fx1Var4.m12243a()));
                                }
                            } else {
                                size2 = list2.size();
                                for (i9 = 0; i9 < size2; i9++) {
                                    fx1 fx1Var5 = (fx1) list2.get(i9);
                                    int iM21103c4 = s56Var3.m21103c(i9);
                                    pe9Var3.m19080d(iM21103c4, fx1Var5.m12243a());
                                    d66VarM13421a.m10128g(iM21103c4, fx1Var5.m12243a());
                                    c0797b4.m3272b(new C3671v3(iM21103c4, fx1Var5.m12243a()));
                                }
                            }
                            viewOnAttachStateChangeListenerC0393e.f4729M.m19080d(i7, pe9Var3);
                            pe9Var4.m19080d(i7, d66VarM13421a);
                        }
                    }
                    accessibilityNodeInfo4.setScreenReaderFocusable(AbstractC3584sr.m21638p(c0423c2, resources6));
                    iM20409d = viewOnAttachStateChangeListenerC0393e.f4739W.m20409d(i7);
                    if (iM20409d != -1) {
                        abstractC0442bM24761d1 = xwc.m24761d0(viewTreeObserverOnGlobalLayoutListenerC0391c2.getAndroidViewsHandler$ui(), iM20409d);
                        if (abstractC0442bM24761d1 != null) {
                            accessibilityNodeInfo4.setTraversalBefore(abstractC0442bM24761d1);
                            viewTreeObserverOnGlobalLayoutListenerC0391c = viewTreeObserverOnGlobalLayoutListenerC0391c2;
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC0391c = viewTreeObserverOnGlobalLayoutListenerC0391c2;
                            accessibilityNodeInfo4.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0391c, iM20409d);
                        }
                        bundle = null;
                        viewOnAttachStateChangeListenerC0393e.m1783j(i7, c0797b4, viewOnAttachStateChangeListenerC0393e.f4741Y, null);
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC0391c = viewTreeObserverOnGlobalLayoutListenerC0391c2;
                        bundle = null;
                    }
                    iM20409d2 = viewOnAttachStateChangeListenerC0393e.f4740X.m20409d(i7);
                    if (iM20409d2 != -1) {
                        accessibilityNodeInfo4.setTraversalAfter(abstractC0442bM24761d0);
                        viewOnAttachStateChangeListenerC0393e.m1783j(i7, c0797b4, viewOnAttachStateChangeListenerC0393e.f4742Z, bundle);
                    }
                    str3 = (String) AbstractC0422b.m1838a(c0423c2.f4974d, AbstractC0425e.f5021b);
                    if (str3 != null) {
                        c0797b4.m3279j(str3);
                    }
                    c0797b5 = c0797b4;
                } else {
                    viewOnAttachStateChangeListenerC0393e = viewOnAttachStateChangeListenerC0393e2;
                    i7 = i;
                    c0797b5 = null;
                }
            }
        }
        if (viewOnAttachStateChangeListenerC0393e.f4726J) {
            if (i7 == viewOnAttachStateChangeListenerC0393e.f4758k) {
                viewOnAttachStateChangeListenerC0393e.f4724H = c0797b5;
            }
            if (i7 == viewOnAttachStateChangeListenerC0393e.f4759l) {
                viewOnAttachStateChangeListenerC0393e.f4725I = c0797b5;
            }
        }
        return c0797b5;
    }

    @Override // p000.qn3
    /* JADX INFO: renamed from: o */
    public final C0797b4 mo1760o(int i) {
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = this.f4722g;
        if (i != 1) {
            if (i == 2) {
                return mo1759l(viewOnAttachStateChangeListenerC0393e.f4758k);
            }
            C3386nv.m17626m(ux5.m22988k(i, "Unknown focus type: "));
            return null;
        }
        int i2 = viewOnAttachStateChangeListenerC0393e.f4759l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1759l(i2);
    }
}
