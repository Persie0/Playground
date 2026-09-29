package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.ExportType;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.sequences.AbstractC3204c;
import kotlin.text.Regex;

/* JADX INFO: renamed from: kh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3184kh {

    /* JADX INFO: renamed from: b */
    public static final dc0 f47260b = new dc0(-1.0f);

    /* JADX INFO: renamed from: c */
    public static final dc0 f47261c = new dc0(1.0f);

    /* JADX INFO: renamed from: d */
    public static final cc0 f47262d = new cc0(-1.0f);

    /* JADX INFO: renamed from: e */
    public static final cc0 f47263e = new cc0(1.0f);

    /* JADX INFO: renamed from: f */
    public static final C0842cc f47264f = new C0842cc("CLOSED", 5);

    /* JADX INFO: renamed from: g */
    public static final i4b f47265g = new i4b(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: h */
    public static final i4b f47266h = new i4b(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: i */
    public static final i4b f47267i = new i4b(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: j */
    public static final i4b f47268j = new i4b(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: k */
    public static final float[] f47269k = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: l */
    public static final long[] f47270l = new long[0];

    /* JADX INFO: renamed from: m */
    public static final String[] f47271m = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: n */
    public static final String[] f47272n = {"ad_impression"};

    /* JADX INFO: renamed from: o */
    public static final String[] f47273o = {"ad_impression", "in_app_purchase"};

    /* JADX INFO: renamed from: p */
    public static final String[] f47274p = {"ad_impression"};

    /* JADX INFO: renamed from: q */
    public static final String[] f47275q = {"ad_impression", "in_app_purchase"};

    /* JADX INFO: renamed from: r */
    public static final String[] f47276r = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* JADX INFO: renamed from: s */
    public static final String[] f47277s = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f47278t = 0;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f47279u = 0;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ int f47280v = 0;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f47281w = 0;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f47282x = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47283a;

    public /* synthetic */ AbstractC3184kh(int i) {
        this.f47283a = i;
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m15194A(String str) {
        str.getClass();
        return str.equals(LanguageLearn.Arabic.getCode()) || str.equals(LanguageLearn.Hebrew.getCode()) || str.equals(LanguageLearn.Farsi.getCode()) || str.equals(LanguageLearn.Urdu.getCode());
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m15195B(String str) {
        str.getClass();
        return str.equals(LanguageLearn.Afrikaans.getCode()) || str.equals(LanguageLearn.Catalan.getCode()) || str.equals(LanguageLearn.ChineseTraditional.getCode()) || str.equals(LanguageLearn.Croatian.getCode()) || str.equals(LanguageLearn.Czech.getCode()) || str.equals(LanguageLearn.Mandarin.getCode()) || str.equals(LanguageLearn.Danish.getCode()) || str.equals(LanguageLearn.Dutch.getCode()) || str.equals(LanguageLearn.English.getCode()) || str.equals(LanguageLearn.Esperanto.getCode()) || str.equals(LanguageLearn.Finnish.getCode()) || str.equals(LanguageLearn.French.getCode()) || str.equals(LanguageLearn.German.getCode()) || str.equals(LanguageLearn.Hungarian.getCode()) || str.equals(LanguageLearn.Icelandic.getCode()) || str.equals(LanguageLearn.Indonesian.getCode()) || str.equals(LanguageLearn.Italian.getCode()) || str.equals(LanguageLearn.Japanese.getCode()) || str.equals(LanguageLearn.Korean.getCode()) || str.equals(LanguageLearn.Latin.getCode()) || str.equals(LanguageLearn.Malay.getCode()) || str.equals(LanguageLearn.Norwegian.getCode()) || str.equals(LanguageLearn.Polish.getCode()) || str.equals(LanguageLearn.Portuguese.getCode()) || str.equals(LanguageLearn.Romanian.getCode()) || str.equals(LanguageLearn.Slovak.getCode()) || str.equals(LanguageLearn.Slovenian.getCode()) || str.equals(LanguageLearn.Spanish.getCode()) || str.equals(LanguageLearn.Swahili.getCode()) || str.equals(LanguageLearn.Swedish.getCode()) || str.equals(LanguageLearn.Tagalog.getCode()) || str.equals(LanguageLearn.Turkish.getCode()) || str.equals(LanguageLearn.Vietnamese.getCode()) || str.equals(LanguageLearn.Thai.getCode()) || str.equals(LanguageLearn.Urdu.getCode());
    }

    /* JADX INFO: renamed from: C */
    public static final String m15196C(String str, String str2) {
        String languageTag = Locale.forLanguageTag(str + "-" + str2).toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m15197D(int i, r86 r86Var) {
        r86Var.getClass();
        int i2 = r86.f58879f;
        Iterator it = AbstractC3204c.m15418n0(r86Var, new tf4(25)).iterator();
        while (it.hasNext()) {
            if (((r86) it.next()).f58881b.f57368b == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static e16 m15198E(vi3 vi3Var) {
        return new ms6(vi3Var);
    }

    /* JADX INFO: renamed from: F */
    public static void m15199F(HashMap map) {
        String[] strArr;
        ConcurrentHashMap concurrentHashMap = vja.f65513e;
        vja vjaVar = vja.f65509a;
        if (lp1.f49971a.contains(vja.class)) {
            return;
        }
        try {
            if (!vja.f65511c.get()) {
                vjaVar.m23352b();
            }
            Iterator it = map.entrySet().iterator();
            while (true) {
                int i = 1;
                if (!it.hasNext()) {
                    String strM3962m0 = bna.m3962m0(concurrentHashMap);
                    if (lp1.f49971a.contains(vjaVar)) {
                        return;
                    }
                    try {
                        sy2.m21768c().execute(new s41(strM3962m0, i));
                        return;
                    } catch (Throwable th) {
                        lp1.m16420a(vjaVar, th);
                        return;
                    }
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                int length = str2.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = fa4.m11651m(str2.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                String strM3978u0 = bna.m3978u0(vjaVar.m23353c(str, str2.subSequence(i2, length + 1).toString()));
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (strArr = (String[]) new Regex(",").m15429h(str3).toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3194a.m15363P(objArrCopyOf.length));
                    AbstractC3550rv.m20848p0(objArrCopyOf, linkedHashSet);
                    if (linkedHashSet.contains(strM3978u0)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(strM3978u0);
                    } else if (strArr.length < 5) {
                        sb.append(str3);
                        sb.append(",");
                        sb.append(strM3978u0);
                    } else {
                        while (i < 5) {
                            sb.append(strArr[i]);
                            sb.append(",");
                            i++;
                        }
                        sb.append(strM3978u0);
                        linkedHashSet.remove(strArr[0]);
                    }
                    concurrentHashMap.put(str, sb.toString());
                } else {
                    concurrentHashMap.put(str, strM3978u0);
                }
            }
        } catch (Throwable th2) {
            lp1.m16420a(vja.class, th2);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m15200G(View view, fs5 fs5Var) {
        bp2 bp2Var = fs5Var.f39578b.f36161b;
        if (bp2Var == null || !bp2Var.f8784a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        ds5 ds5Var = fs5Var.f39578b;
        if (ds5Var.f36172m != elevation) {
            ds5Var.f36172m = elevation;
            fs5Var.m12057E();
        }
    }

    /* JADX INFO: renamed from: I */
    public static final FeedTopic m15201I(String str) {
        str.getClass();
        for (FeedTopic feedTopic : FeedTopic.values()) {
            if (m15203K(feedTopic).equals(str)) {
                return feedTopic;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static final void m15202J(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            l54.m15814a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        l54.m15814a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    /* JADX INFO: renamed from: K */
    public static final String m15203K(FeedTopic feedTopic) {
        feedTopic.getClass();
        String lowerCase = feedTopic.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (feedTopic == FeedTopic.SelfHelp) {
            return "self_help";
        }
        return feedTopic == FeedTopic.Songs ? "song" : lowerCase;
    }

    /* JADX INFO: renamed from: L */
    public static final void m15204L(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            C3386nv.m17626m("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* JADX INFO: renamed from: M */
    public static final byte[] m15205M(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            C3386nv.m17626m("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: N */
    public static final byte[] m15206N(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m15205M(bArr, 0, bArr2, 0, bArr.length);
        }
        C3386nv.m17626m("The lengths of x and y should match.");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final void m15207a(e16 e16Var, z85 z85Var, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        vi3 vi3Var2;
        int i4;
        e16 e16Var3;
        vi3 vi3Var3;
        vi3 vi3Var4;
        int i5;
        b16 b16Var;
        boolean z;
        z85 z85Var2;
        vi3 vi3Var5;
        String strM23620a0;
        z85Var.getClass();
        String str = z85Var.f71078g;
        String str2 = z85Var.f71080i;
        boolean z2 = z85Var.f71082k;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(146101792);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i3 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i;
        }
        int i7 = i3 | (tj3Var.m22120g(z85Var) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i7 | 384;
            vi3Var2 = vi3Var;
        } else {
            vi3Var2 = vi3Var;
            i4 = i7 | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            i4 |= tj3Var.m22124i(ui3Var) ? 2048 : 1024;
        }
        int i9 = i4;
        if (tj3Var.m22099R(i9 & 1, (i4 & 1171) != 1170)) {
            b16 b16Var2 = b16.f7762a;
            e16 e16Var4 = i6 != 0 ? b16Var2 : e16Var2;
            p84 p84Var = we1.f66679a;
            if (i8 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new tf4(12);
                    tj3Var.m22131l0(objM22097O);
                }
                vi3Var4 = (vi3) objM22097O;
            } else {
                vi3Var4 = vi3Var2;
            }
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var2);
            se1.f60731q.getClass();
            vi3 vi3Var6 = vi3Var4;
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var7 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var7);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            ge9.m12515a(tj3Var).getClass();
            e16 e16Var5 = e16Var4;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, pb1.m19045o(c99.m4429v(c99.m4426s(e16Var4, 227.0f)), p58.m18901i(tj3Var).f64858d), 15);
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new tf4(13);
                tj3Var.m22131l0(objM22097O3);
            }
            e16 e16VarM17643c = nv8.m17643c(e16VarM815b, false, (vi3) objM22097O3);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM17643c);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var7);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
            ge9.m12515a(tj3Var).getClass();
            r46.m20381f(c99.m4414g(e16VarM4412e, 140.0f), null, null, null, ci8.m4703P(-915623566, new rm0(z85Var, 7), tj3Var), tj3Var, 24576, 14);
            if (z85Var.f71081j > 0.0f) {
                tj3Var.m22111b0(819737064);
                thb.m22044c(tj3Var, c99.m4414g(b16Var2, ge9.m12515a(tj3Var).f38955d));
                boolean z3 = (i9 & 112) == 32;
                Object objM22097O4 = tj3Var.m22097O();
                if (z3 || objM22097O4 == p84Var) {
                    objM22097O4 = new C3757xf(z85Var, 20);
                    tj3Var.m22131l0(objM22097O4);
                }
                i5 = i9;
                b16Var = b16Var2;
                z = false;
                dn7.m10494c((ui3) objM22097O4, pb1.m19045o(c99.m4414g(c99.m4412e(b16Var2, 1.0f), 6.0f), p58.m18901i(tj3Var).f64858d), 0L, 0L, 0, 0.0f, null, tj3Var, 0, 124);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                i5 = i9;
                b16Var = b16Var2;
                z = false;
                tj3Var.m22111b0(820104166);
                tj3Var.m22139q(false);
            }
            e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f);
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var, 54);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM22984g);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var7);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            tj3 tj3Var2 = tj3Var;
            lw9.m16554b(str, AbstractC3584sr.m21611X(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 11), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var).f71405i, tj3Var2, 0, 24960, 110588);
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, z);
            int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m4 = tj3Var2.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarM4430w);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d2);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var3, tj3Var2, vi3Var7);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c4);
            Object objM22097O5 = tj3Var2.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = new kb0(8, t66Var);
                tj3Var2.m22131l0(objM22097O5);
            }
            b16 b16Var3 = b16Var;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var3, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38954c, 0.0f, 11);
            vf0 vf0VarM4714a = ci8.m4714a(1.0f, p58.m18900f(tj3Var2).f55816A);
            omd.m18141c((ui3) objM22097O5, c99.m4422o(r46.m20388n(e16VarM21611X, vf0VarM4714a.f65300a, vf0VarM4714a.f65301b, ui8.f63972a), 24.0f), false, null, null, bna.f8737j, tj3Var2, 1572870, 60);
            if (((Boolean) r58.getValue()).booleanValue()) {
                tj3Var2.m22111b0(-1429398464);
                Object objM22097O6 = tj3Var2.m22097O();
                if (objM22097O6 == p84Var) {
                    objM22097O6 = new kb0(9, r58);
                    tj3Var2.m22131l0(objM22097O6);
                }
                ui3 ui3Var3 = (ui3) objM22097O6;
                boolean z4 = z85Var.f71085n;
                boolean z5 = z85Var.f71083l;
                d05 d05Var = new d05(z4, z5, z85Var.f71084m, z5, false, z85Var.f71087p, z85Var.f71088q, z85Var.f71089r, z85Var.f71090s);
                boolean z6 = (i5 & 896) == 256;
                Object objM22097O7 = tj3Var2.m22097O();
                if (z6 || objM22097O7 == p84Var) {
                    vi3Var5 = vi3Var6;
                    objM22097O7 = new c85(vi3Var5, r58, 1);
                    tj3Var2.m22131l0(objM22097O7);
                } else {
                    vi3Var5 = vi3Var6;
                }
                z85Var2 = z85Var;
                rid.m20672a(str, ui3Var3, d05Var, (vi3) objM22097O7, tj3Var2, 48);
                tj3Var2.m22139q(false);
            } else {
                z85Var2 = z85Var;
                vi3Var5 = vi3Var6;
                tj3Var2.m22111b0(-1428418244);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(true);
            tj3Var2.m22139q(true);
            thb.m22044c(tj3Var2, c99.m4414g(b16Var3, ge9.m12515a(tj3Var2).f38954c));
            C3549ru c3549ru = eh0.f37236b;
            sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 48);
            int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m5 = tj3Var2.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, b16Var3);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var3, tj3Var2, vi3Var7);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c5);
            vi3 vi3Var8 = vi3Var5;
            lw9.m16554b(z85Var2.f71079h, null, p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var2).f71407k, tj3Var2, 0, 24960, 110586);
            tj3Var2.m22139q(true);
            thb.m22044c(tj3Var2, c99.m4414g(b16Var3, ge9.m12515a(tj3Var2).f38954c));
            sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 48);
            int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m6 = tj3Var2.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, b16Var3);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a3);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var3, tj3Var2, vi3Var7);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c6);
            if (z2) {
                tj3Var2.m22111b0(-1630285671);
                ty3.m22351a(qad.m19843e(), vz1.m23620a0(tj3Var2, R$string.ui_video), wq1.m24108d(tj3Var2, b16Var3, 16.0f), p58.m18900f(tj3Var2).f55875s, tj3Var2, 0, 0);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1629915004);
                ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_headphones_s, tj3Var2, 0), vz1.m23620a0(tj3Var2, R$string.ui_audio_duration), wq1.m24108d(tj3Var2, b16Var3, 16.0f), 0L, tj3Var2, 8, 8);
                tj3Var2.m22139q(false);
            }
            thb.m22044c(tj3Var2, c99.m4426s(b16Var3, ge9.m12515a(tj3Var2).f38955d));
            if (z2) {
                tj3Var2.m22111b0(-1629447369);
                strM23620a0 = vk9.m23391n0(str2) ? vz1.m23620a0(tj3Var2, R$string.ui_video) : str2;
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1629328081);
                tj3Var2.m22139q(false);
                strM23620a0 = vk9.m23391n0(str2) ? "--:-- min" : str2;
            }
            String str3 = strM23620a0;
            vx9 vx9Var = p58.m18902j(tj3Var2).f71407k;
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            lw9.m16554b(str3, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), p58.m18900f(tj3Var2).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var2, 0, 0, 131064);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, c99.m4414g(b16Var3, ge9.m12515a(tj3Var).f38952a));
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16Var3 = e16Var5;
            vi3Var3 = vi3Var8;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            vi3Var3 = vi3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tz3(e16Var3, z85Var, vi3Var3, ui3Var, i, i2, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15208b(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15209c(int i, KeyEvent keyEvent) {
        return dhd.m10398b(chd.m4667a(keyEvent)) == i;
    }

    /* JADX INFO: renamed from: d */
    public static final void m15210d(at9 at9Var, Context context, final boolean z, final String str, final long j) {
        if (cx9.m9921c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) vz1.f66109c.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        h66 h66Var = at9Var.f7472a;
        h66 h66Var2 = at9Var.f7472a;
        mt9 mt9Var = mt9.f51831b;
        h66Var.m13090g(mt9Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            h66Var2.m13090g(new jt9(0, new vi3() { // from class: fl7
                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    vz1.f66110d.mo1291i(context2, resolveInfo, Boolean.valueOf(z), str, new cx9(j));
                    ((nt9) obj).close();
                    return xfa.f68157a;
                }
            }, new el7(i), resolveInfo.loadLabel(packageManager).toString()));
            i++;
            context2 = context;
        }
        h66Var2.m13090g(mt9Var);
    }

    /* JADX INFO: renamed from: e */
    public static final e16 m15211e(e16 e16Var, Orientation orientation) {
        Orientation orientation2 = Orientation.Vertical;
        b16 b16Var = b16.f7762a;
        return e16Var.mo3161g(orientation == orientation2 ? pb1.m19045o(b16Var, mv3.f51881c) : pb1.m19045o(b16Var, mv3.f51880b));
    }

    /* JADX INFO: renamed from: f */
    public static final int m15212f(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i - 1;
        return ss5.m21693T((f3 * (i4 <= 1 ? i4 : 1)) + (f2 * i3) + f);
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m15213g(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                v63.m23147y("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m15214h(e28 e28Var, float f, float f2) {
        float f3 = e28Var.f36620a;
        if (f > e28Var.f36622c || f3 > f) {
            return false;
        }
        return f2 <= e28Var.f36623d && e28Var.f36621b <= f2;
    }

    /* JADX INFO: renamed from: i */
    public static final void m15215i(int i, int i2) {
        if (i <= i2) {
            return;
        }
        v63.m23143u(ux5.m22987j(i, i2, "toIndex (", ") is greater than size (", ")."));
    }

    /* JADX INFO: renamed from: j */
    public static i9d m15216j(int i) {
        if (i != 0 && i == 1) {
            return new tx1();
        }
        return new vi8();
    }

    /* JADX INFO: renamed from: k */
    public static final float m15217k(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: renamed from: l */
    public static final String m15218l(ExportType exportType) {
        exportType.getClass();
        int i = ri2.f59349b[exportType.ordinal()];
        if (i == 1) {
            return "lingq.csv";
        }
        if (i == 2) {
            return "lingq.apkg";
        }
        gm5.m12750e();
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final Object m15219m(au8 au8Var, long j, zi3 zi3Var) {
        while (true) {
            if (au8Var.f7522e >= j && !au8Var.mo3060g()) {
                return au8Var;
            }
            Object objM12575e = au8Var.m12575e();
            C0842cc c0842cc = f47264f;
            if (objM12575e == c0842cc) {
                return c0842cc;
            }
            au8 au8Var2 = (au8) ((gg1) objM12575e);
            if (au8Var2 == null) {
                au8Var2 = (au8) zi3Var.invoke(Long.valueOf(au8Var.f7522e + 1), au8Var);
                if (au8Var.m12579j(au8Var2)) {
                    if (au8Var.mo3060g()) {
                        au8Var.m12578i();
                    }
                }
            }
            au8Var = au8Var2;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Rect m15220n(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, iNextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    /* JADX INFO: renamed from: o */
    public static final Pair m15221o(Map map) {
        LearningLevel learningLevel = LearningLevel.Beginner1;
        LearningLevel learningLevel2 = LearningLevel.Advanced2;
        while (true) {
            Object obj = map.get(learningLevel);
            Boolean bool = Boolean.FALSE;
            if (!fa4.m11650l(obj, bool) && !fa4.m11650l(map.get(learningLevel2), bool)) {
                return new Pair(learningLevel, learningLevel2);
            }
            if (fa4.m11650l(map.get(learningLevel), bool)) {
                learningLevel = ((LearningLevel[]) LearningLevel.getEntries().toArray(new LearningLevel[0]))[learningLevel.ordinal() + 1];
            }
            if (fa4.m11650l(map.get(learningLevel2), bool)) {
                learningLevel2 = ((LearningLevel[]) LearningLevel.getEntries().toArray(new LearningLevel[0]))[learningLevel2.ordinal() - 1];
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m15222p() {
        try {
            if (ViewTreeObserverOnGlobalLayoutListenerC0391c.f4635b1 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0391c.f4635b1 = Class.forName("android.os.SystemProperties");
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC0391c.f4636c1 == null) {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4635b1;
                ViewTreeObserverOnGlobalLayoutListenerC0391c.f4636c1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4636c1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return fa4.m11650l(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final String m15223q(String str) {
        Object obj;
        Object next;
        String strName;
        str.getClass();
        Iterator<E> it = LanguageLearn.getEntries().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((LanguageLearn) next).getCode(), str));
        LanguageLearn languageLearn = (LanguageLearn) next;
        if (languageLearn == null || (strName = languageLearn.name()) == null) {
            for (Object obj2 : LanguageLearn.getEntries()) {
                if (fa4.m11650l(((LanguageLearn) obj2).getCode(), str)) {
                    obj = obj2;
                    break;
                }
            }
            LanguageLearn languageLearn2 = (LanguageLearn) obj;
            strName = languageLearn2 != null ? languageLearn2.name() : "";
        }
        return cl9.m4839V(strName, "ChineseTraditional", "Chinese (Traditional)");
    }

    /* JADX INFO: renamed from: r */
    public static String m15224r(String str, String str2) {
        return wq1.m24119o("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    /* JADX INFO: renamed from: s */
    public static final pj8 m15225s(ct5 ct5Var) {
        Object objMo1509A = ct5Var.mo1509A();
        if (objMo1509A instanceof pj8) {
            return (pj8) objMo1509A;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final String m15226t(String str) {
        str.getClass();
        if (str.equals(LanguageLearn.Afrikaans.getCode())) {
            return m15196C("af", "ZA");
        }
        if (str.equals(LanguageLearn.Arabic.getCode())) {
            return m15196C("ar", "AE");
        }
        if (str.equals(LanguageLearn.Armenian.getCode())) {
            return m15196C("hy", "AM");
        }
        if (str.equals(LanguageLearn.Bulgarian.getCode())) {
            return m15196C("bg", "BG");
        }
        if (str.equals(LanguageLearn.Cantonese.getCode())) {
            return "yue-Hant-HK";
        }
        if (str.equals(LanguageLearn.Catalan.getCode())) {
            return m15196C("ca", "ES");
        }
        if (str.equals(LanguageLearn.ChineseTraditional.getCode())) {
            return "cmn-Hant-TW";
        }
        if (str.equals(LanguageLearn.Croatian.getCode())) {
            return m15196C("hr", "HR");
        }
        if (str.equals(LanguageLearn.Czech.getCode())) {
            return m15196C("cs", "CV");
        }
        if (str.equals(LanguageLearn.Danish.getCode())) {
            return m15196C("da", "DK");
        }
        if (str.equals(LanguageLearn.Dutch.getCode())) {
            return m15196C("nl", "NL");
        }
        if (str.equals(LanguageLearn.English.getCode())) {
            String languageTag = Locale.US.toLanguageTag();
            languageTag.getClass();
            return languageTag;
        }
        if (str.equals(LanguageLearn.Farsi.getCode())) {
            return m15196C("fa", "IR");
        }
        if (str.equals(LanguageLearn.Finnish.getCode())) {
            return m15196C("fi", "FI");
        }
        if (str.equals(LanguageLearn.French.getCode())) {
            return m15196C("fr", "FR");
        }
        if (str.equals(LanguageLearn.Georgian.getCode())) {
            return m15196C("ka", "GE");
        }
        if (str.equals(LanguageLearn.German.getCode())) {
            return m15196C("de", "DE");
        }
        if (str.equals(LanguageLearn.Greek.getCode())) {
            return m15196C("el", "GR");
        }
        if (str.equals(LanguageLearn.Gujarati.getCode())) {
            return m15196C("gu", "IN");
        }
        if (str.equals(LanguageLearn.Hebrew.getCode())) {
            return m15196C("he", "IL");
        }
        if (str.equals(LanguageLearn.Hindi.getCode())) {
            return m15196C("hi", "IN");
        }
        if (str.equals(LanguageLearn.Hungarian.getCode())) {
            return m15196C("hu", "HU");
        }
        if (str.equals(LanguageLearn.Icelandic.getCode())) {
            return m15196C("is", "IS");
        }
        if (str.equals(LanguageLearn.Indonesian.getCode())) {
            return m15196C("id", "ID");
        }
        if (str.equals(LanguageLearn.Italian.getCode())) {
            return m15196C("it", "IT");
        }
        if (str.equals(LanguageLearn.Japanese.getCode())) {
            return m15196C("ja", "JP");
        }
        if (str.equals(LanguageLearn.Khmer.getCode())) {
            return m15196C("km", "KH");
        }
        if (str.equals(LanguageLearn.Korean.getCode())) {
            return m15196C("ko", "KR");
        }
        if (str.equals(LanguageLearn.Malay.getCode())) {
            return m15196C("ms", "MY");
        }
        if (str.equals(LanguageLearn.Mandarin.getCode())) {
            return "cmn-hans-vn";
        }
        if (str.equals(LanguageLearn.Norwegian.getCode())) {
            return m15196C("nb", "NO");
        }
        if (str.equals(LanguageLearn.Polish.getCode())) {
            return m15196C("pl", "PL");
        }
        if (str.equals(LanguageLearn.Portuguese.getCode())) {
            return m15196C("pt", "BR");
        }
        if (str.equals(LanguageLearn.Romanian.getCode())) {
            return m15196C("ro", "RO");
        }
        if (str.equals(LanguageLearn.Russian.getCode())) {
            return m15196C("ru", "RU");
        }
        if (str.equals(LanguageLearn.Serbian.getCode())) {
            return m15196C("sr", "RS");
        }
        if (str.equals(LanguageLearn.Slovak.getCode())) {
            return m15196C("sk", "SK");
        }
        if (str.equals(LanguageLearn.Slovenian.getCode())) {
            return m15196C("sl", "SL");
        }
        if (str.equals(LanguageLearn.Spanish.getCode())) {
            return m15196C("es", "ES");
        }
        if (str.equals(LanguageLearn.Swahili.getCode())) {
            return m15196C("sw", "KE");
        }
        if (str.equals(LanguageLearn.Swedish.getCode())) {
            return m15196C("sv", "SE");
        }
        if (str.equals(LanguageLearn.Turkish.getCode())) {
            return m15196C("tr", "TR");
        }
        if (str.equals(LanguageLearn.Ukrainian.getCode())) {
            return m15196C("uk", "UA");
        }
        if (str.equals(LanguageLearn.Vietnamese.getCode())) {
            return m15196C("vi", "VN");
        }
        if (str.equals(LanguageLearn.Punjabi.getCode())) {
            return m15196C("pa", "IN");
        }
        if (str.equals(LanguageLearn.Irish.getCode())) {
            return m15196C("ga", "IE");
        }
        if (str.equals(LanguageLearn.Thai.getCode())) {
            return m15196C("th", "TH");
        }
        return str.equals(LanguageLearn.Urdu.getCode()) ? m15196C("ur", "PK") : "";
    }

    /* JADX INFO: renamed from: v */
    public static final float m15227v(pj8 pj8Var) {
        if (pj8Var != null) {
            return pj8Var.f56321a;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m15228w(String str) {
        str.getClass();
        return str.equals(LanguageLearn.Esperanto.getCode()) || str.equals(LanguageLearn.Gujarati.getCode()) || str.equals(LanguageLearn.Georgian.getCode()) || str.equals(LanguageLearn.Irish.getCode()) || str.equals(LanguageLearn.Khmer.getCode()) || str.equals(LanguageLearn.Latin.getCode()) || str.equals(LanguageLearn.Punjabi.getCode());
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m15229x(String str) {
        str.getClass();
        return str.equals(LanguageLearn.Japanese.getCode()) || str.equals(LanguageLearn.Mandarin.getCode()) || str.equals(LanguageLearn.ChineseTraditional.getCode()) || str.equals(LanguageLearn.Cantonese.getCode());
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m15230y(String str) {
        str.getClass();
        return str.equals(LanguageLearn.Korean.getCode()) || str.equals(LanguageLearn.Ukrainian.getCode()) || str.equals(LanguageLearn.Greek.getCode()) || str.equals(LanguageLearn.Russian.getCode()) || str.equals(LanguageLearn.Serbian.getCode()) || str.equals(LanguageLearn.Armenian.getCode()) || str.equals(LanguageLearn.Bulgarian.getCode()) || str.equals(LanguageLearn.Thai.getCode()) || m15194A(str);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m15231z(String str) {
        str.getClass();
        return str.equals(LanguageLearn.Japanese.getCode()) || str.equals(LanguageLearn.Mandarin.getCode()) || str.equals(LanguageLearn.ChineseTraditional.getCode()) || str.equals(LanguageLearn.Cantonese.getCode()) || m15230y(str);
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo11327H(Object obj, float f);

    public int hashCode() {
        switch (this.f47283a) {
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f47283a) {
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                String strM25414c = y38.m24933a(getClass()).m25414c();
                strM25414c.getClass();
                return strM25414c;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract float mo11328u(Object obj);
}
