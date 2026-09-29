package p000;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.text.contextmenu.provider.C0175a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import com.lingq.core.domain.model.user.AccountTier;
import com.lingq.core.domain.model.user.AndroidDetails;
import com.lingq.core.domain.model.user.AppleDetails;
import com.lingq.core.domain.model.user.FreeTrialDetails;
import com.lingq.core.domain.model.user.Invoice;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import com.lingq.core.domain.model.user.Tier;
import com.lingq.core.network.api.result.ResultSubscriptionDetail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class l70 {

    /* JADX INFO: renamed from: a */
    public static ExecutorService f49230a;

    /* JADX INFO: renamed from: b */
    public static final C3549ru f49231b = new C3549ru(0);

    /* JADX INFO: renamed from: c */
    public static final C3549ru f49232c = new C3549ru(1);

    /* JADX INFO: renamed from: d */
    public static final C3549ru f49233d = new C3549ru(2);

    /* JADX INFO: renamed from: e */
    public static final ua0 f49234e = new ua0();

    /* JADX INFO: renamed from: f */
    public static final StackTraceElement[] f49235f = new StackTraceElement[0];

    /* JADX INFO: renamed from: g */
    public static final ck2 f49236g = new ck2();

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f49237h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f49238i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f49239j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f49240k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f49241l = 0;

    /* JADX INFO: renamed from: A */
    public static void m15910A(int i, ij1 ij1Var, vj1 vj1Var, boolean z) {
        float f = vj1Var.f65467e0;
        bj1 bj1Var = vj1Var.f65440I;
        int iM3760d = bj1Var.f8582f.m3760d();
        bj1 bj1Var2 = vj1Var.f65442K;
        int iM3760d2 = bj1Var2.f8582f.m3760d();
        int iM3761e = bj1Var.m3761e() + iM3760d;
        int iM3761e2 = iM3760d2 - bj1Var2.m3761e();
        if (iM3760d == iM3760d2) {
            f = 0.5f;
        } else {
            iM3760d = iM3761e;
            iM3760d2 = iM3761e2;
        }
        int iM23326r = vj1Var.m23326r();
        int i2 = (iM3760d2 - iM3760d) - iM23326r;
        if (iM3760d > iM3760d2) {
            i2 = (iM3760d - iM3760d2) - iM23326r;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iM3760d;
        int i4 = i3 + iM23326r;
        if (iM3760d > iM3760d2) {
            i4 = i3 - iM23326r;
        }
        vj1Var.m23308K(i3, i4);
        m15959v(i + 1, ij1Var, vj1Var, z);
    }

    /* JADX INFO: renamed from: B */
    public static void m15911B(int i, vj1 vj1Var, ij1 ij1Var, vj1 vj1Var2, boolean z) {
        float f = vj1Var2.f65467e0;
        bj1 bj1Var = vj1Var2.f65440I;
        int iM3761e = bj1Var.m3761e() + bj1Var.f8582f.m3760d();
        bj1 bj1Var2 = vj1Var2.f65442K;
        int iM3760d = bj1Var2.f8582f.m3760d() - bj1Var2.m3761e();
        if (iM3760d >= iM3761e) {
            int iM23326r = vj1Var2.m23326r();
            if (vj1Var2.f65473h0 != 8) {
                int i2 = vj1Var2.f65492r;
                if (i2 == 2) {
                    iM23326r = (int) (vj1Var2.f65467e0 * 0.5f * (vj1Var instanceof wj1 ? vj1Var.m23326r() : vj1Var.f65452U.m23326r()));
                } else if (i2 == 0) {
                    iM23326r = iM3760d - iM3761e;
                }
                iM23326r = Math.max(vj1Var2.f65497u, iM23326r);
                int i3 = vj1Var2.f65498v;
                if (i3 > 0) {
                    iM23326r = Math.min(i3, iM23326r);
                }
            }
            int i4 = iM3761e + ((int) ((f * ((iM3760d - iM3761e) - iM23326r)) + 0.5f));
            vj1Var2.m23308K(i4, iM23326r + i4);
            m15959v(i + 1, ij1Var, vj1Var2, z);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m15912C(int i, ij1 ij1Var, vj1 vj1Var) {
        float f = vj1Var.f65469f0;
        bj1 bj1Var = vj1Var.f65441J;
        int iM3760d = bj1Var.f8582f.m3760d();
        bj1 bj1Var2 = vj1Var.f65443L;
        int iM3760d2 = bj1Var2.f8582f.m3760d();
        int iM3761e = bj1Var.m3761e() + iM3760d;
        int iM3761e2 = iM3760d2 - bj1Var2.m3761e();
        if (iM3760d == iM3760d2) {
            f = 0.5f;
        } else {
            iM3760d = iM3761e;
            iM3760d2 = iM3761e2;
        }
        int iM23322l = vj1Var.m23322l();
        int i2 = (iM3760d2 - iM3760d) - iM23322l;
        if (iM3760d > iM3760d2) {
            i2 = (iM3760d - iM3760d2) - iM23322l;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iM3760d + i3;
        int i5 = i4 + iM23322l;
        if (iM3760d > iM3760d2) {
            i4 = iM3760d - i3;
            i5 = i4 - iM23322l;
        }
        vj1Var.m23309L(i4, i5);
        m15923N(i + 1, ij1Var, vj1Var);
    }

    /* JADX INFO: renamed from: D */
    public static void m15913D(int i, vj1 vj1Var, ij1 ij1Var, vj1 vj1Var2) {
        float f = vj1Var2.f65469f0;
        bj1 bj1Var = vj1Var2.f65441J;
        int iM3761e = bj1Var.m3761e() + bj1Var.f8582f.m3760d();
        bj1 bj1Var2 = vj1Var2.f65443L;
        int iM3760d = bj1Var2.f8582f.m3760d() - bj1Var2.m3761e();
        if (iM3760d >= iM3761e) {
            int iM23322l = vj1Var2.m23322l();
            if (vj1Var2.f65473h0 != 8) {
                int i2 = vj1Var2.f65494s;
                if (i2 == 2) {
                    iM23322l = (int) (f * 0.5f * (vj1Var instanceof wj1 ? vj1Var.m23322l() : vj1Var.f65452U.m23322l()));
                } else if (i2 == 0) {
                    iM23322l = iM3760d - iM3761e;
                }
                iM23322l = Math.max(vj1Var2.f65500x, iM23322l);
                int i3 = vj1Var2.f65501y;
                if (i3 > 0) {
                    iM23322l = Math.min(i3, iM23322l);
                }
            }
            int i4 = iM3761e + ((int) ((f * ((iM3760d - iM3761e) - iM23322l)) + 0.5f));
            vj1Var2.m23309L(i4, iM23322l + i4);
            m15923N(i + 1, ij1Var, vj1Var2);
        }
    }

    /* JADX INFO: renamed from: E */
    public static g84 m15914E(int i, i84 i84Var) {
        i84Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            ij6.m13964v(numValueOf, "Step must be positive, was: ");
            return null;
        }
        int i2 = i84Var.f40379a;
        int i3 = i84Var.f40380b;
        if (i84Var.f40381c <= 0) {
            i = -i;
        }
        return new g84(i2, i3, i);
    }

    /* JADX INFO: renamed from: F */
    public static final e16 m15915F(boolean z, boolean z2, ui3 ui3Var) {
        e16 km9Var = b16.f7762a;
        if (!z || !jm9.f45838a) {
            return km9Var;
        }
        if (z2) {
            km9Var = new km9(f49236g);
        }
        return km9Var.mo3161g(new hm9(ui3Var));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX INFO: renamed from: G */
    public static final Object m15916G(int i, Object obj, x78 x78Var, bc3 bc3Var, int i2) {
        boolean z;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = false;
        if ((i & 1) == 0 || fa4.m11650l(x78Var.f67901b, bc3Var)) {
            z = false;
        } else {
            bc3 bc3Var2 = bc3.f8316b;
            bc3 bc3Var3 = bc3.f8318d;
            if (bc3Var.compareTo(bc3Var3) < 0 || x78Var.f67901b.compareTo(bc3Var3) >= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z3 = ((i & 2) == 0 || i2 == x78Var.f67902c) ? false : true;
        if (!z3 && !z) {
            return obj;
        }
        int i3 = z ? bc3Var.f8327a : x78Var.f67901b.f8327a;
        if (!z3 ? x78Var.f67902c == 1 : i2 == 1) {
            z2 = true;
        }
        return Typeface.create((Typeface) obj, i3, z2);
    }

    /* JADX INFO: renamed from: H */
    public static final SubscriptionDetails m15917H(ResultSubscriptionDetail resultSubscriptionDetail) {
        resultSubscriptionDetail.getClass();
        Tier tier = resultSubscriptionDetail.f21544a;
        if (tier == null) {
            tier = new Tier();
        }
        Tier tier2 = tier;
        String str = resultSubscriptionDetail.f21545b;
        String str2 = resultSubscriptionDetail.f21546c;
        String str3 = resultSubscriptionDetail.f21547d;
        String str4 = resultSubscriptionDetail.f21548e;
        String str5 = resultSubscriptionDetail.f21549f;
        Boolean bool = resultSubscriptionDetail.f21550g;
        String str6 = resultSubscriptionDetail.f21551h;
        Invoice invoice = resultSubscriptionDetail.f21552i;
        FreeTrialDetails freeTrialDetails = resultSubscriptionDetail.f21553j;
        AppleDetails appleDetails = resultSubscriptionDetail.f21554k;
        AndroidDetails androidDetails = resultSubscriptionDetail.f21555l;
        Boolean bool2 = resultSubscriptionDetail.f21556m;
        Boolean bool3 = resultSubscriptionDetail.f21557n;
        Boolean bool4 = resultSubscriptionDetail.f21558o;
        Boolean bool5 = resultSubscriptionDetail.f21559p;
        Boolean bool6 = resultSubscriptionDetail.f21560q;
        AccountTier accountTier = resultSubscriptionDetail.f21561r;
        if (accountTier == null) {
            accountTier = new AccountTier();
        }
        return new SubscriptionDetails(tier2, accountTier, str, str2, str3, str4, str5, bool, str6, invoice, freeTrialDetails, appleDetails, androidDetails, bool2, bool3, bool4, bool5, bool6, resultSubscriptionDetail.f21562s, resultSubscriptionDetail.f21563t, resultSubscriptionDetail.f21564u, resultSubscriptionDetail.f21565v);
    }

    /* JADX INFO: renamed from: I */
    public static final List m15918I(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(u91.m22589G0(list));
        }
        return EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: J */
    public static final Map m15919J(Map map) {
        int size = map.size();
        if (size == 0) {
            return AbstractC3194a.m15360M();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) u91.m22588F0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: K */
    public static String m15920K(int i) {
        if (i == 1) {
            return "Clip";
        }
        if (i == 2) {
            return "Ellipsis";
        }
        if (i == 5) {
            return "MiddleEllipsis";
        }
        if (i == 3) {
            return "Visible";
        }
        return i == 4 ? "StartEllipsis" : "Invalid";
    }

    /* JADX INFO: renamed from: L */
    public static final CharSequence m15921L(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? vk9.m23374J0(charSequence, 4999) : vk9.m23374J0(charSequence, 5000);
    }

    /* JADX INFO: renamed from: M */
    public static i84 m15922M(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new i84(i, i2 - 1, 1);
        }
        i84 i84Var = i84.f43682d;
        return i84.f43682d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX INFO: renamed from: N */
    public static void m15923N(int i, ij1 ij1Var, vj1 vj1Var) {
        boolean z;
        bj1 bj1Var;
        bj1 bj1Var2;
        float f;
        bj1 bj1Var3;
        bj1 bj1Var4;
        if (vj1Var.f65484n) {
            return;
        }
        if (!(vj1Var instanceof wj1) && vj1Var.m23302A() && m15941d(vj1Var)) {
            wj1.m24003W(vj1Var, ij1Var, new ua0());
        }
        bj1 bj1VarMo12819j = vj1Var.mo12819j(ConstraintAnchor$Type.TOP);
        bj1 bj1VarMo12819j2 = vj1Var.mo12819j(ConstraintAnchor$Type.BOTTOM);
        int iM3760d = bj1VarMo12819j.m3760d();
        int iM3760d2 = bj1VarMo12819j2.m3760d();
        HashSet<bj1> hashSet = bj1VarMo12819j.f8577a;
        char c = 1;
        if (hashSet != null && bj1VarMo12819j.f8579c) {
            for (bj1 bj1Var5 : hashSet) {
                vj1 vj1Var2 = bj1Var5.f8580d;
                int i2 = i + 1;
                boolean zM15941d = m15941d(vj1Var2);
                bj1 bj1Var6 = vj1Var2.f65441J;
                bj1 bj1Var7 = vj1Var2.f65443L;
                if (vj1Var2.m23302A() && zM15941d) {
                    f = 0.0f;
                    wj1.m24003W(vj1Var2, ij1Var, new ua0());
                } else {
                    f = 0.0f;
                }
                char c2 = ((bj1Var5 == bj1Var6 && (bj1Var4 = bj1Var7.f8582f) != null && bj1Var4.f8579c) || (bj1Var5 == bj1Var7 && (bj1Var3 = bj1Var6.f8582f) != null && bj1Var3.f8579c)) ? c : (char) 0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = vj1Var2.f65451T[c];
                char c3 = c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || zM15941d) {
                    if (!vj1Var2.m23302A()) {
                        if (bj1Var5 == bj1Var6 && bj1Var7.f8582f == null) {
                            int iM3761e = bj1Var6.m3761e() + iM3760d;
                            vj1Var2.m23309L(iM3761e, vj1Var2.m23322l() + iM3761e);
                            m15923N(i2, ij1Var, vj1Var2);
                        } else if (bj1Var5 == bj1Var7 && bj1Var6.f8582f == null) {
                            int iM3761e2 = iM3760d - bj1Var7.m3761e();
                            vj1Var2.m23309L(iM3761e2 - vj1Var2.m23322l(), iM3761e2);
                            m15923N(i2, ij1Var, vj1Var2);
                        } else if (c2 != 0 && !vj1Var2.m23334z()) {
                            m15912C(i2, ij1Var, vj1Var2);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && vj1Var2.f65501y >= 0 && vj1Var2.f65500x >= 0 && ((vj1Var2.f65473h0 == 8 || (vj1Var2.f65494s == 0 && vj1Var2.f65455X == f)) && !vj1Var2.m23334z() && !vj1Var2.f65437F && c2 != 0 && !vj1Var2.m23334z())) {
                    m15913D(i2, vj1Var, ij1Var, vj1Var2);
                }
                c = c3;
            }
        }
        ?? r17 = c;
        if (vj1Var instanceof gq3) {
            return;
        }
        HashSet<bj1> hashSet2 = bj1VarMo12819j2.f8577a;
        if (hashSet2 != null && bj1VarMo12819j2.f8579c) {
            for (bj1 bj1Var8 : hashSet2) {
                vj1 vj1Var3 = bj1Var8.f8580d;
                int i3 = i + 1;
                boolean zM15941d2 = m15941d(vj1Var3);
                bj1 bj1Var9 = vj1Var3.f65441J;
                bj1 bj1Var10 = vj1Var3.f65443L;
                if (vj1Var3.m23302A() && zM15941d2) {
                    wj1.m24003W(vj1Var3, ij1Var, new ua0());
                }
                ?? r11 = ((bj1Var8 == bj1Var9 && (bj1Var2 = bj1Var10.f8582f) != null && bj1Var2.f8579c) || (bj1Var8 == bj1Var10 && (bj1Var = bj1Var9.f8582f) != null && bj1Var.f8579c)) ? r17 == true ? 1 : 0 : 0;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = vj1Var3.f65451T[r17 == true ? 1 : 0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour4 || zM15941d2) {
                    if (!vj1Var3.m23302A()) {
                        if (bj1Var8 == bj1Var9 && bj1Var10.f8582f == null) {
                            int iM3761e3 = bj1Var9.m3761e() + iM3760d2;
                            vj1Var3.m23309L(iM3761e3, vj1Var3.m23322l() + iM3761e3);
                            m15923N(i3, ij1Var, vj1Var3);
                        } else if (bj1Var8 == bj1Var10 && bj1Var9.f8582f == null) {
                            int iM3761e4 = iM3760d2 - bj1Var10.m3761e();
                            vj1Var3.m23309L(iM3761e4 - vj1Var3.m23322l(), iM3761e4);
                            m15923N(i3, ij1Var, vj1Var3);
                        } else if (r11 != 0 && !vj1Var3.m23334z()) {
                            m15912C(i3, ij1Var, vj1Var3);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && vj1Var3.f65501y >= 0 && vj1Var3.f65500x >= 0 && (vj1Var3.f65473h0 == 8 || (vj1Var3.f65494s == 0 && vj1Var3.f65455X == 0.0f))) {
                    if (!vj1Var3.m23334z() && !vj1Var3.f65437F && r11 != 0 && !vj1Var3.m23334z()) {
                        m15913D(i3, vj1Var, ij1Var, vj1Var3);
                    }
                }
            }
        }
        bj1 bj1VarMo12819j3 = vj1Var.mo12819j(ConstraintAnchor$Type.BASELINE);
        if (bj1VarMo12819j3.f8577a != null && bj1VarMo12819j3.f8579c) {
            int iM3760d3 = bj1VarMo12819j3.m3760d();
            for (bj1 bj1Var11 : bj1VarMo12819j3.f8577a) {
                vj1 vj1Var4 = bj1Var11.f8580d;
                int i4 = i + 1;
                boolean zM15941d3 = m15941d(vj1Var4);
                bj1 bj1Var12 = vj1Var4.f65444M;
                if (vj1Var4.m23302A() && zM15941d3) {
                    wj1.m24003W(vj1Var4, ij1Var, new ua0());
                }
                if (vj1Var4.f65451T[r17 == true ? 1 : 0] != ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT || zM15941d3) {
                    if (!vj1Var4.m23302A()) {
                        if (bj1Var11 == bj1Var12) {
                            int iM3761e5 = bj1Var11.m3761e() + iM3760d3;
                            if (vj1Var4.f65436E) {
                                int i5 = iM3761e5 - vj1Var4.f65461b0;
                                int i6 = vj1Var4.f65454W + i5;
                                vj1Var4.f65459a0 = i5;
                                vj1Var4.f65441J.m3768l(i5);
                                vj1Var4.f65443L.m3768l(i6);
                                bj1Var12.m3768l(iM3761e5);
                                z = r17 == true ? 1 : 0;
                                vj1Var4.f65480l = z;
                            } else {
                                z = r17 == true ? 1 : 0;
                            }
                            m15923N(i4, ij1Var, vj1Var4);
                        }
                        r17 = z;
                    }
                }
                z = r17 == true ? 1 : 0;
                r17 = z;
            }
        }
        vj1Var.f65484n = r17;
    }

    /* JADX INFO: renamed from: O */
    public static void m15924O(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeBundle(bundle);
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: P */
    public static void m15925P(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeByteArray(bArr);
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: Q */
    public static void m15926Q(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: R */
    public static void m15927R(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: S */
    public static void m15928S(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeIntArray(iArr);
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: T */
    public static void m15929T(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: U */
    public static void m15930U(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeString(str);
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: V */
    public static void m15931V(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeStringArray(strArr);
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: W */
    public static void m15932W(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeStringList(list);
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: X */
    public static void m15933X(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: Y */
    public static void m15934Y(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM15937a0 = m15937a0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m15939b0(parcel, iM15937a0);
    }

    /* JADX INFO: renamed from: Z */
    public static void m15935Z(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* JADX INFO: renamed from: a */
    public static final C3459pg m15936a(C3185ki c3185ki) {
        Canvas canvas = AbstractC3497qg.f57736a;
        C3459pg c3459pg = new C3459pg();
        c3459pg.f56079a = new Canvas(AbstractC3122is.m14093g(c3185ki));
        return c3459pg;
    }

    /* JADX INFO: renamed from: a0 */
    public static int m15937a0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: b */
    public static final void m15938b(e16 e16Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        C0282a c0282a2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(790527681);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1259i(null, s46.f60289d);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new kb0(13, t66Var);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var = (ui3) objM22097O2;
            qh7 qh7Var = u82.f63537a;
            C0175a c0175aM23631g = vz1.m23631g(ci8.f10118b, tj3Var, 6);
            e16Var2 = e16Var;
            c0282a2 = c0282a;
            pvc.m19508d(new a02[]{lt9.f50119b.mo1265a(d32.m10034d0(2, tj3Var, ui3Var)), lt9.f50118a.mo1265a(c0175aM23631g)}, ci8.m4703P(1070596993, new ns5(e16Var2, t66Var, c0282a2, c0175aM23631g, ui3Var), tj3Var), tj3Var, 56);
        } else {
            e16Var2 = e16Var;
            c0282a2 = c0282a;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new w87(e16Var2, c0282a2, i, i3);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m15939b0(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: c */
    public static final void m15940c(e16 e16Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(155925518);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean z = tj3Var.m22128k(lt9.f50118a) != null;
            boolean z2 = tj3Var.m22128k(lt9.f50119b) != null;
            if (z && z2) {
                tj3Var.m22111b0(-1977187922);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
                se1.f60731q.getClass();
                ui3 ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                c0282a.invoke(tj3Var, Integer.valueOf((i2 >> 3) & 14));
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else if (z) {
                tj3Var.m22111b0(-1976997706);
                d32.m10061u(e16Var, c0282a, tj3Var, i2 & 126);
                tj3Var.m22139q(false);
            } else if (z2) {
                tj3Var.m22111b0(-1976846922);
                u82.m22535d(e16Var, c0282a, tj3Var, i2 & 126);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1976716505);
                m15938b(e16Var, c0282a, tj3Var, i2 & 126);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new w87(e16Var, c0282a, i, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15941d(vj1 vj1Var) {
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var.f65451T;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget$DimensionBehaviourArr[0];
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviourArr[1];
        vj1 vj1Var2 = vj1Var.f65452U;
        wj1 wj1Var = vj1Var2 != null ? (wj1) vj1Var2 : null;
        if (wj1Var != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = wj1Var.f65451T[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        if (wj1Var != null) {
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = wj1Var.f65451T[1];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.FIXED;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.FIXED;
        boolean z = constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour9 || vj1Var.mo12813B() || constraintWidget$DimensionBehaviour3 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour3 == (constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) && vj1Var.f65492r == 0 && vj1Var.f65455X == 0.0f && vj1Var.m23329u(0)) || (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour2 && vj1Var.f65492r == 1 && vj1Var.m23330v(0, vj1Var.m23326r()));
        boolean z2 = constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour9 || vj1Var.mo12814C() || constraintWidget$DimensionBehaviour4 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || (constraintWidget$DimensionBehaviour4 == (constraintWidget$DimensionBehaviour = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) && vj1Var.f65494s == 0 && vj1Var.f65455X == 0.0f && vj1Var.m23329u(1)) || (constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour && vj1Var.f65494s == 1 && vj1Var.m23330v(1, vj1Var.m23322l()));
        return (vj1Var.f65455X > 0.0f && (z || z2)) || (z && z2);
    }

    /* JADX INFO: renamed from: e */
    public static final void m15942e(int i) {
        if (i >= 1) {
            return;
        }
        C3386nv.m17624j(ux5.m22988k(i, "Expected positive parallelism level, but got "));
    }

    /* JADX INFO: renamed from: f */
    public static double m15943f(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* JADX INFO: renamed from: g */
    public static float m15944g(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: h */
    public static int m15945h(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: i */
    public static int m15946i(int i, i84 i84Var) {
        int i2 = i84Var.f40380b;
        int i3 = i84Var.f40379a;
        if (i84Var.isEmpty()) {
            ij6.m13964v(i84Var, "Cannot coerce value to an empty range: ");
            return 0;
        }
        if (i < Integer.valueOf(i3).intValue()) {
            return Integer.valueOf(i3).intValue();
        }
        return i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
    }

    /* JADX INFO: renamed from: j */
    public static long m15947j(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sbM22996s = ux5.m22996s(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbM22996s.append(j2);
        sbM22996s.append('.');
        throw new IllegalArgumentException(sbM22996s.toString());
    }

    /* JADX INFO: renamed from: k */
    public static Comparable m15948k(Comparable comparable, h41 h41Var) {
        h41Var.getClass();
        float f = h41Var.f41766b;
        float f2 = h41Var.f41765a;
        if (h41Var.m13040a()) {
            ij6.m13964v(h41Var, "Cannot coerce value to an empty range: ");
            return null;
        }
        if (!h41Var.m13041b(comparable, Float.valueOf(f2)) || h41Var.m13041b(Float.valueOf(f2), comparable)) {
            return (!h41Var.m13041b(Float.valueOf(f), comparable) || h41Var.m13041b(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f);
        }
        return Float.valueOf(f2);
    }

    /* JADX INFO: renamed from: l */
    public static void m15949l(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("k");
                String strOptString2 = jSONObjectOptJSONObject.optString("v");
                strOptString.getClass();
                if (strOptString.length() != 0) {
                    CopyOnWriteArraySet copyOnWriteArraySetM19568a = py5.m19568a();
                    next.getClass();
                    List listM23365A0 = vk9.m23365A0(strOptString, new String[]{","}, 0, 6);
                    strOptString2.getClass();
                    copyOnWriteArraySetM19568a.add(new py5(next, strOptString2, listM23365A0));
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final long m15950m(long j, DurationUnit durationUnit) {
        long j2;
        durationUnit.getClass();
        int i = in2.f44301a[durationUnit.ordinal()];
        if (i == 1) {
            j2 = 86400000;
        } else if (i == 2) {
            j2 = 3600000;
        } else if (i == 3) {
            j2 = 60000;
        } else if (i == 4) {
            j2 = 1000;
        } else {
            if (i != 5) {
                C3386nv.m17632s(durationUnit, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 1;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    /* JADX INFO: renamed from: n */
    public static final on3 m15951n(on3 on3Var, float f) {
        return on3Var.mo16935d(new dn1(new ig2(f)));
    }

    /* JADX INFO: renamed from: o */
    public static final void m15952o(w46 w46Var, ym0 ym0Var, vi0 vi0Var, float f, l39 l39Var, rt9 rt9Var, ml2 ml2Var) {
        ArrayList arrayList = w46Var.f66383h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f37 f37Var = (f37) arrayList.get(i);
            f37Var.f38358a.m16244g(ym0Var, vi0Var, f, l39Var, rt9Var, ml2Var);
            ym0Var.mo17023o(0.0f, f37Var.f38358a.m16239b());
        }
    }

    /* JADX INFO: renamed from: p */
    public static final int m15953p(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: q */
    public static final int m15954q(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public static sb4 m15955r(JSONObject jSONObject) throws JSONException {
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        t33 t33Var;
        sc2 sc2Var;
        String str = "placementId";
        long j = jSONObject.getLong("placementId");
        JSONArray jSONArray = jSONObject.getJSONArray("embeddedMessages");
        jSONArray.getClass();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            jSONObject2.getClass();
            JSONObject jSONObject3 = jSONObject2.getJSONObject("metadata");
            jSONObject3.getClass();
            String string = jSONObject3.getString("messageId");
            string.getClass();
            up2 up2Var = new up2(string, jSONObject3.optLong(str), Integer.valueOf(jSONObject3.optInt("campaignId")), jSONObject3.optBoolean("isProof"));
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("elements");
            if (jSONObjectOptJSONObject == null) {
                jSONArray = jSONArray;
                str = str;
                i = length;
                i2 = i3;
                t33Var = null;
            } else {
                String str2 = "title";
                String strOptString = jSONObjectOptJSONObject.optString("title");
                String strOptString2 = jSONObjectOptJSONObject.optString("body");
                String strOptString3 = jSONObjectOptJSONObject.optString("mediaUrl");
                String strOptString4 = jSONObjectOptJSONObject.optString("mediaUrl");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("defaultAction");
                mp2 mp2VarM25542a = jSONObjectOptJSONObject2 != null ? zbd.m25542a(jSONObjectOptJSONObject2) : null;
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("buttons");
                ArrayList arrayList4 = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    int length2 = jSONArrayOptJSONArray.length() - 1;
                    if (length2 >= 0) {
                        int i4 = 0;
                        while (true) {
                            JSONObject jSONObject4 = jSONArrayOptJSONArray.getJSONObject(i4);
                            jSONObject4.getClass();
                            i = length;
                            String string2 = jSONObject4.getString("id");
                            string2.getClass();
                            i2 = i3;
                            String strOptString5 = jSONObject4.optString(str2);
                            strOptString5.getClass();
                            String str3 = str2;
                            JSONObject jSONObjectOptJSONObject3 = jSONObject4.optJSONObject("action");
                            if (jSONObjectOptJSONObject3 != null) {
                                String string3 = jSONObjectOptJSONObject3.getString("type");
                                string3.getClass();
                                String string4 = jSONObjectOptJSONObject3.getString("data");
                                string4.getClass();
                                sc2Var = new sc2(string3, string4);
                            } else {
                                sc2Var = null;
                            }
                            arrayList4.add(new lp2(string2, strOptString5, sc2Var));
                            if (i4 == length2) {
                                break;
                            }
                            i4++;
                            str2 = str3;
                            length = i;
                            i3 = i2;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        }
                    } else {
                        i = length;
                        i2 = i3;
                    }
                    arrayList = arrayList4;
                } else {
                    i = length;
                    i2 = i3;
                    arrayList = null;
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("text");
                ArrayList arrayList5 = new ArrayList();
                if (jSONArrayOptJSONArray2 != null) {
                    int length3 = jSONArrayOptJSONArray2.length() - 1;
                    if (length3 >= 0) {
                        int i5 = 0;
                        while (true) {
                            JSONObject jSONObject5 = jSONArrayOptJSONArray2.getJSONObject(i5);
                            jSONObject5.getClass();
                            arrayList5.add(acd.m269a(jSONObject5));
                            if (i5 == length3) {
                                break;
                            }
                            i5++;
                        }
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                t33Var = new t33(strOptString, strOptString2, strOptString3, strOptString4, mp2VarM25542a, arrayList, arrayList2);
            }
            arrayList3.add(new rb4(up2Var, t33Var, jSONObject2.optJSONObject("payload")));
            i3 = i2 + 1;
            jSONArray = jSONArray;
            str = str;
            length = i;
        }
        return new sb4(j, arrayList3);
    }

    /* JADX INFO: renamed from: s */
    public static synchronized Executor m15956s() {
        try {
            if (f49230a == null) {
                String str = uma.f64080a;
                f49230a = Executors.newSingleThreadExecutor(new dg1("ExoPlayer:BackgroundExecutor", 1));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f49230a;
    }

    /* JADX INFO: renamed from: t */
    public static final Object m15957t(ct5 ct5Var) {
        Object objMo1509A = ct5Var.mo1509A();
        fq4 fq4Var = objMo1509A instanceof fq4 ? (fq4) objMo1509A : null;
        if (fq4Var != null) {
            return fq4Var.f39454J;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static String m15958u(Activity activity) {
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
            activityInfo.getClass();
            CharSequence title = activity.getTitle();
            title.getClass();
            if (!vk9.m23391n0(title)) {
                return activity.getTitle().toString();
            }
            int i = activityInfo.labelRes;
            if (i != 0) {
                String string = activity.getString(i);
                string.getClass();
                return string;
            }
            CharSequence charSequence = activityInfo.nonLocalizedLabel;
            charSequence.getClass();
            if (!vk9.m23391n0(charSequence)) {
                return activityInfo.nonLocalizedLabel.toString();
            }
            String str = activityInfo.name;
            str.getClass();
            if (vk9.m23391n0(str)) {
                String localClassName = activity.getLocalClassName();
                localClassName.getClass();
                return localClassName;
            }
            String str2 = activityInfo.name;
            str2.getClass();
            return str2;
        } catch (Exception unused) {
            return activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m15959v(int i, ij1 ij1Var, vj1 vj1Var, boolean z) {
        bj1 bj1Var;
        bj1 bj1Var2;
        char c;
        bj1 bj1Var3;
        bj1 bj1Var4;
        if (vj1Var.f65482m) {
            return;
        }
        if (!(vj1Var instanceof wj1) && vj1Var.m23302A() && m15941d(vj1Var)) {
            wj1.m24003W(vj1Var, ij1Var, new ua0());
        }
        bj1 bj1VarMo12819j = vj1Var.mo12819j(ConstraintAnchor$Type.LEFT);
        bj1 bj1VarMo12819j2 = vj1Var.mo12819j(ConstraintAnchor$Type.RIGHT);
        int iM3760d = bj1VarMo12819j.m3760d();
        int iM3760d2 = bj1VarMo12819j2.m3760d();
        HashSet<bj1> hashSet = bj1VarMo12819j.f8577a;
        if (hashSet != null && bj1VarMo12819j.f8579c) {
            for (bj1 bj1Var5 : hashSet) {
                vj1 vj1Var2 = bj1Var5.f8580d;
                int i2 = i + 1;
                boolean zM15941d = m15941d(vj1Var2);
                bj1 bj1Var6 = vj1Var2.f65440I;
                bj1 bj1Var7 = vj1Var2.f65442K;
                if (vj1Var2.m23302A() && zM15941d) {
                    c = 0;
                    wj1.m24003W(vj1Var2, ij1Var, new ua0());
                } else {
                    c = 0;
                }
                char c2 = ((bj1Var5 == bj1Var6 && (bj1Var4 = bj1Var7.f8582f) != null && bj1Var4.f8579c) || (bj1Var5 == bj1Var7 && (bj1Var3 = bj1Var6.f8582f) != null && bj1Var3.f8579c)) ? (char) 1 : c;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = vj1Var2.f65451T[c];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour2 || zM15941d) {
                    if (!vj1Var2.m23302A()) {
                        if (bj1Var5 == bj1Var6 && bj1Var7.f8582f == null) {
                            int iM3761e = bj1Var6.m3761e() + iM3760d;
                            vj1Var2.m23308K(iM3761e, vj1Var2.m23326r() + iM3761e);
                            m15959v(i2, ij1Var, vj1Var2, z);
                        } else if (bj1Var5 == bj1Var7 && bj1Var6.f8582f == null) {
                            int iM3761e2 = iM3760d - bj1Var7.m3761e();
                            vj1Var2.m23308K(iM3761e2 - vj1Var2.m23326r(), iM3761e2);
                            m15959v(i2, ij1Var, vj1Var2, z);
                        } else if (c2 != 0 && !vj1Var2.m23333y()) {
                            m15910A(i2, ij1Var, vj1Var2, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 && vj1Var2.f65498v >= 0 && vj1Var2.f65497u >= 0 && (vj1Var2.f65473h0 == 8 || (vj1Var2.f65492r == 0 && vj1Var2.f65455X == 0.0f))) {
                    if (!vj1Var2.m23333y() && !vj1Var2.f65437F && c2 != 0 && !vj1Var2.m23333y()) {
                        m15911B(i2, vj1Var, ij1Var, vj1Var2, z);
                    }
                }
            }
        }
        if (vj1Var instanceof gq3) {
            return;
        }
        HashSet<bj1> hashSet2 = bj1VarMo12819j2.f8577a;
        if (hashSet2 != null && bj1VarMo12819j2.f8579c) {
            for (bj1 bj1Var8 : hashSet2) {
                vj1 vj1Var3 = bj1Var8.f8580d;
                int i3 = i + 1;
                boolean zM15941d2 = m15941d(vj1Var3);
                bj1 bj1Var9 = vj1Var3.f65440I;
                bj1 bj1Var10 = vj1Var3.f65442K;
                if (vj1Var3.m23302A() && zM15941d2) {
                    wj1.m24003W(vj1Var3, ij1Var, new ua0());
                }
                boolean z2 = (bj1Var8 == bj1Var9 && (bj1Var2 = bj1Var10.f8582f) != null && bj1Var2.f8579c) || (bj1Var8 == bj1Var10 && (bj1Var = bj1Var9.f8582f) != null && bj1Var.f8579c);
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = vj1Var3.f65451T[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour3 != constraintWidget$DimensionBehaviour4 || zM15941d2) {
                    if (!vj1Var3.m23302A()) {
                        if (bj1Var8 == bj1Var9 && bj1Var10.f8582f == null) {
                            int iM3761e3 = bj1Var9.m3761e() + iM3760d2;
                            vj1Var3.m23308K(iM3761e3, vj1Var3.m23326r() + iM3761e3);
                            m15959v(i3, ij1Var, vj1Var3, z);
                        } else if (bj1Var8 == bj1Var10 && bj1Var9.f8582f == null) {
                            int iM3761e4 = iM3760d2 - bj1Var10.m3761e();
                            vj1Var3.m23308K(iM3761e4 - vj1Var3.m23326r(), iM3761e4);
                            m15959v(i3, ij1Var, vj1Var3, z);
                        } else if (z2 && !vj1Var3.m23333y()) {
                            m15910A(i3, ij1Var, vj1Var3, z);
                        }
                    }
                } else if (constraintWidget$DimensionBehaviour3 == constraintWidget$DimensionBehaviour4 && vj1Var3.f65498v >= 0 && vj1Var3.f65497u >= 0) {
                    if (vj1Var3.f65473h0 == 8 || (vj1Var3.f65492r == 0 && vj1Var3.f65455X == 0.0f)) {
                        if (!vj1Var3.m23333y() && !vj1Var3.f65437F && z2 && !vj1Var3.m23333y()) {
                            m15911B(i3, vj1Var, ij1Var, vj1Var3, z);
                        }
                    }
                }
            }
        }
        vj1Var.f65482m = true;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m15960w(String str) {
        str.getClass();
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* JADX INFO: renamed from: x */
    public static final e16 m15961x(e16 e16Var, Object obj) {
        return e16Var.mo3161g(new eq4(obj));
    }

    /* JADX INFO: renamed from: y */
    public static final e16 m15962y(e16 e16Var) {
        e16Var.getClass();
        return e16Var.mo3161g(c99.m4428u(c99.m4430w(c99.m4412e(b16.f7762a, 1.0f), nj0.f52812g, 2), 0.0f, 600.0f, 1));
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m15963z(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }
}
