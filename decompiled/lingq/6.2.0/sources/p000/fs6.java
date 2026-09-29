package p000;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.ImageView;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.LayoutNode$LayoutState;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.core.splashscreen.R$attr;
import androidx.lifecycle.Lifecycle$State;
import coil.memory.MemoryCache$Key;
import coil.request.CachePolicy;
import coil.request.NullRequestDataException;
import coil.size.Scale;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.platform.Plugin$Type;
import com.amplitude.core.platform.plugins.C0910a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import com.lingq.feature.onboarding.p014v2.OnboardingYesNoQuestion;
import com.lingq.p020ui.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fs6 implements tm0, hz6, hc9, zp7, gl9, yl8, fn9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39589a;

    /* JADX INFO: renamed from: b */
    public Object f39590b;

    /* JADX INFO: renamed from: c */
    public Object f39591c;

    public fs6(int i) {
        this.f39589a = i;
        int i2 = 16;
        switch (i) {
            case 9:
                this.f39590b = new HashMap();
                this.f39591c = new HashMap();
                break;
            case 15:
                this.f39590b = new LinkedHashMap();
                this.f39591c = new LinkedHashMap();
                break;
            case 16:
                break;
            case 28:
                this.f39590b = AbstractC3194a.m15365R(new Pair(Plugin$Type.Before, new yv5()), new Pair(Plugin$Type.Enrichment, new yv5()), new Pair(Plugin$Type.Destination, new yv5()), new Pair(Plugin$Type.Utility, new yv5()));
                break;
            case 29:
                this.f39590b = new s46(i2);
                this.f39591c = new ab9(16);
                break;
            default:
                this.f39590b = new x66(new C0357g[16]);
                break;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m12083B(e04 e04Var, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (!e04Var.f36512k) {
                return false;
            }
            lr9 lr9Var = e04Var.f36504c;
            if (lr9Var instanceof t04) {
                ImageView imageView = ((t04) lr9Var).f61703b;
                if (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static String m12084C(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (String) u91.m22589G0(arrayList);
        }
        return u91.m22596N0(u91.m22585C0(arrayList), ", ", null, null, null, 62) + " and " + u91.m22597O0(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static final void m12085l(ArrayList arrayList, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        arrayList.add(new ww6(str, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d16] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: q */
    public static void m12086q(C0357g c0357g) {
        if (c0357g.f4355k0 > 0) {
            if (c0357g.f4337b0.f58058d == LayoutNode$LayoutState.Idle && !c0357g.m1604q() && !c0357g.m1605r() && !c0357g.f4357l0 && c0357g.m1570M()) {
                d16 d16Var = (d16) c0357g.f4335a0.f46679g;
                if ((d16Var.f34840d & 256) != 0) {
                    while (d16Var != null) {
                        if ((d16Var.f34839c & 256) != 0) {
                            ?? M21992f = d16Var;
                            ?? x66Var = 0;
                            while (M21992f != 0) {
                                if (M21992f instanceof un3) {
                                    un3 un3Var = (un3) M21992f;
                                    un3Var.mo953J0(te1.m21976I(un3Var, 256));
                                } else if ((M21992f.f34839c & 256) != 0 && (M21992f instanceof fa2)) {
                                    d16 d16Var2 = ((fa2) M21992f).f38701K;
                                    int i = 0;
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                    while (d16Var2 != null) {
                                        if ((d16Var2.f34839c & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                x66Var = x66Var;
                                                M21992f = d16Var2;
                                            } else {
                                                if (x66Var == 0) {
                                                    x66Var = new x66(new d16[16]);
                                                }
                                                if (M21992f != 0) {
                                                    x66Var.m24305c(M21992f);
                                                    M21992f = 0;
                                                }
                                                x66Var.m24305c(d16Var2);
                                            }
                                        }
                                        d16Var2 = d16Var2.f34842f;
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M21992f = te1.m21992f(x66Var);
                            }
                        }
                        if ((d16Var.f34840d & 256) == 0) {
                            break;
                        } else {
                            d16Var = d16Var.f34842f;
                        }
                    }
                }
            }
            c0357g.f4353j0 = false;
            x66 x66VarM1559B = c0357g.m1559B();
            Object[] objArr = x66VarM1559B.f67830a;
            int i2 = x66VarM1559B.f67832c;
            for (int i3 = 0; i3 < i2; i3++) {
                m12086q((C0357g) objArr[i3]);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static kt2 m12087r(e04 e04Var, Throwable th) {
        if (th instanceof NullRequestDataException) {
            e04Var.getClass();
            s72 s72Var = e04Var.f36501A;
            s72Var.getClass();
            s72 s72Var2 = AbstractC2983f.f38126a;
            s72Var.getClass();
        } else {
            e04Var.f36501A.getClass();
            s72 s72Var3 = AbstractC2983f.f38126a;
        }
        return new kt2(null, e04Var, th);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01db  */
    /* JADX WARN: Code duplicated, block: B:109:0x01de  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:120:0x0200  */
    /* JADX WARN: Code duplicated, block: B:125:0x0225  */
    /* JADX WARN: Code duplicated, block: B:127:0x0231  */
    /* JADX WARN: Code duplicated, block: B:128:0x023a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0265  */
    /* JADX WARN: Code duplicated, block: B:140:0x0278  */
    /* JADX WARN: Code duplicated, block: B:141:0x027a  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:155:0x02df  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x0303  */
    /* JADX WARN: Code duplicated, block: B:168:0x0306  */
    /* JADX WARN: Code duplicated, block: B:170:0x030e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0310  */
    /* JADX WARN: Code duplicated, block: B:176:0x0330  */
    /* JADX WARN: Code duplicated, block: B:179:0x0339  */
    /* JADX WARN: Code duplicated, block: B:180:0x033c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0345  */
    /* JADX WARN: Code duplicated, block: B:184:0x0348  */
    /* JADX WARN: Code duplicated, block: B:187:0x0351  */
    /* JADX WARN: Code duplicated, block: B:188:0x0354  */
    /* JADX WARN: Code duplicated, block: B:191:0x035b  */
    /* JADX WARN: Code duplicated, block: B:192:0x035e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0367  */
    /* JADX WARN: Code duplicated, block: B:196:0x036a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0372  */
    /* JADX WARN: Code duplicated, block: B:199:0x0374  */
    /* JADX WARN: Code duplicated, block: B:204:0x0394  */
    /* JADX WARN: Code duplicated, block: B:207:0x039d  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:211:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:215:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:219:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:220:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:222:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:223:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:227:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:235:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:238:0x0408  */
    /* JADX WARN: Code duplicated, block: B:239:0x040b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0414  */
    /* JADX WARN: Code duplicated, block: B:243:0x0417  */
    /* JADX WARN: Code duplicated, block: B:246:0x0420  */
    /* JADX WARN: Code duplicated, block: B:247:0x0423  */
    /* JADX WARN: Code duplicated, block: B:250:0x042c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0443  */
    /* JADX WARN: Code duplicated, block: B:262:0x046e  */
    /* JADX WARN: Code duplicated, block: B:263:0x047b  */
    /* JADX WARN: Code duplicated, block: B:266:0x0488  */
    /* JADX WARN: Code duplicated, block: B:267:0x048d  */
    /* JADX WARN: Code duplicated, block: B:271:0x049f  */
    /* JADX WARN: Code duplicated, block: B:273:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:275:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    /* JADX WARN: Code duplicated, block: B:73:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0178  */
    /* JADX WARN: Code duplicated, block: B:84:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x0184  */
    /* JADX WARN: Code duplicated, block: B:88:0x018d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0190  */
    /* JADX WARN: Code duplicated, block: B:92:0x0199  */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:141:0x027a, please report this as an issue */
    /* JADX INFO: renamed from: A */
    public Object m12088A(String str, OnboardingSelections onboardingSelections, SuspendLambda suspendLambda) {
        String string;
        int i;
        String string2;
        int i2;
        ArrayList arrayList;
        Iterator it;
        String string3;
        int i3;
        String string4;
        int i4;
        ArrayList arrayList2;
        Iterator it2;
        int i5;
        Iterator<E> it3;
        Object next;
        DailyGoal dailyGoal;
        String str2;
        String str3;
        String string5;
        int i6;
        String string6;
        int i7;
        String string7;
        int i8;
        String str4;
        Boolean bool;
        boolean zBooleanValue;
        tab tabVar;
        String string8;
        int iM21923b;
        int i9;
        FeedTopic feedTopicM15201I;
        String string9;
        String string10;
        int i10;
        int length = str.length();
        xfa xfaVar = xfa.f68157a;
        if (length == 0) {
            return new xm5(xfaVar);
        }
        Context context = (Context) this.f39590b;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        Locale locale = Locale.ENGLISH;
        configuration.setLocale(locale);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        contextCreateConfigurationContext.getClass();
        locale.getClass();
        String strM17092K = AbstractC3352my.m17092K(contextCreateConfigurationContext, str, locale);
        ArrayList arrayList3 = new ArrayList();
        String string11 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_motivation_title_dynamic, strM17092K);
        string11.getClass();
        String string12 = null;
        switch (onboardingSelections.f27291c) {
            case "travel":
                i = R$string.onboarding_v2_motivation_travel;
                string = contextCreateConfigurationContext.getString(i);
                break;
            case "career/studies":
                i = R$string.onboarding_v2_motivation_career;
                string = contextCreateConfigurationContext.getString(i);
                break;
            case "brain":
                i = R$string.onboarding_v2_motivation_brain;
                string = contextCreateConfigurationContext.getString(i);
                break;
            case "other":
                i = R$string.onboarding_v2_motivation_other;
                string = contextCreateConfigurationContext.getString(i);
                break;
            case "friends/family":
                i = R$string.onboarding_v2_motivation_family;
                string = contextCreateConfigurationContext.getString(i);
                break;
            case "culture":
                i = R$string.onboarding_v2_motivation_culture;
                string = contextCreateConfigurationContext.getString(i);
                break;
            default:
                string = null;
                break;
        }
        m12085l(arrayList3, string11, string);
        String string13 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_level_title);
        string13.getClass();
        String str5 = onboardingSelections.f27292d;
        if (fa4.m11650l(str5, LearningLevel.Beginner1.getServerName())) {
            i2 = com.lingq.core.p012ui.R$string.levels_beginner;
        } else {
            if (!fa4.m11650l(str5, LearningLevel.Intermediate1.getServerName())) {
                if (fa4.m11650l(str5, LearningLevel.Advanced1.getServerName())) {
                    i2 = com.lingq.core.p012ui.R$string.levels_advanced;
                } else {
                    string2 = null;
                }
                m12085l(arrayList3, string13, string2);
                String string14 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_skills_title);
                string14.getClass();
                Set set = onboardingSelections.f27293e;
                arrayList = new ArrayList();
                it = set.iterator();
                while (it.hasNext()) {
                    switch ((String) it.next()) {
                        case "speaking":
                            i10 = R$string.onboarding_v2_skills_speaking;
                            string10 = contextCreateConfigurationContext.getString(i10);
                            break;
                        case "listening":
                            i10 = R$string.onboarding_v2_skills_listening;
                            string10 = contextCreateConfigurationContext.getString(i10);
                            break;
                        case "vocabulary":
                            i10 = R$string.onboarding_v2_skills_vocabulary;
                            string10 = contextCreateConfigurationContext.getString(i10);
                            break;
                        case "grammar":
                            i10 = R$string.onboarding_v2_skills_grammar;
                            string10 = contextCreateConfigurationContext.getString(i10);
                            break;
                        case "reading":
                            i10 = R$string.onboarding_v2_skills_reading;
                            string10 = contextCreateConfigurationContext.getString(i10);
                            break;
                        case "writing":
                            i10 = R$string.onboarding_v2_skills_writing;
                            string10 = contextCreateConfigurationContext.getString(i10);
                            break;
                        default:
                            string10 = null;
                            break;
                    }
                    if (string10 != null) {
                        arrayList.add(string10);
                    }
                }
                m12085l(arrayList3, string14, m12084C(arrayList));
                String string15 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_speaking_title_dynamic, strM17092K);
                string15.getClass();
                switch (onboardingSelections.f27294f) {
                    case "steady":
                        i3 = R$string.onboarding_v2_speaking_steady;
                        string3 = contextCreateConfigurationContext.getString(i3);
                        break;
                    case "uneasy":
                        i3 = R$string.onboarding_v2_speaking_uneasy;
                        string3 = contextCreateConfigurationContext.getString(i3);
                        break;
                    case "confident":
                        i3 = R$string.onboarding_v2_speaking_confident;
                        string3 = contextCreateConfigurationContext.getString(i3);
                        break;
                    case "stressed":
                        i3 = R$string.onboarding_v2_speaking_stressed;
                        string3 = contextCreateConfigurationContext.getString(i3);
                        break;
                    default:
                        string3 = null;
                        break;
                }
                m12085l(arrayList3, string15, string3);
                String string16 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_method_title_dynamic, strM17092K);
                string16.getClass();
                switch (onboardingSelections.f27297i) {
                    case "guided":
                        i4 = R$string.onboarding_v2_method_guided;
                        string4 = contextCreateConfigurationContext.getString(i4);
                        break;
                    case "unsure":
                        i4 = R$string.onboarding_v2_method_unsure;
                        string4 = contextCreateConfigurationContext.getString(i4);
                        break;
                    case "immersive":
                        i4 = R$string.onboarding_v2_method_immersive;
                        string4 = contextCreateConfigurationContext.getString(i4);
                        break;
                    case "interactive":
                        i4 = R$string.onboarding_v2_method_interactive;
                        string4 = contextCreateConfigurationContext.getString(i4);
                        break;
                    case "self-directed":
                        i4 = R$string.onboarding_v2_method_self_directed;
                        string4 = contextCreateConfigurationContext.getString(i4);
                        break;
                    default:
                        string4 = null;
                        break;
                }
                m12085l(arrayList3, string16, string4);
                String string17 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_topics_title);
                string17.getClass();
                Set set2 = onboardingSelections.f27295g;
                arrayList2 = new ArrayList();
                it2 = set2.iterator();
                while (it2.hasNext()) {
                    feedTopicM15201I = AbstractC3184kh.m15201I((String) it2.next());
                    if (feedTopicM15201I != null) {
                        string9 = contextCreateConfigurationContext.getString(fbd.m11760j(feedTopicM15201I));
                    } else {
                        string9 = null;
                    }
                    if (string9 != null) {
                        arrayList2.add(string9);
                    }
                }
                m12085l(arrayList3, string17, m12084C(arrayList2));
                String string18 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_time_title_dynamic, strM17092K);
                string18.getClass();
                i5 = onboardingSelections.f27298j;
                it3 = DailyGoal.getEntries().iterator();
                do {
                    if (it3.hasNext()) {
                        next = it3.next();
                    } else {
                        next = null;
                    }
                    dailyGoal = (DailyGoal) next;
                    if (dailyGoal == null) {
                        str2 = null;
                    } else {
                        str2 = contextCreateConfigurationContext.getString(dailyGoal.getDesc()) + " (about " + dailyGoal.getMins() + " minutes a day)";
                    }
                    m12085l(arrayList3, string18, str2);
                    String string19 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_name_title);
                    string19.getClass();
                    str3 = onboardingSelections.f27300l;
                    if (vk9.m23391n0(str3)) {
                        str3 = null;
                    }
                    m12085l(arrayList3, string19, str3);
                    String string20 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_age_title);
                    string20.getClass();
                    switch (onboardingSelections.f27299k) {
                        case "45+":
                            i6 = R$string.onboarding_v2_age_45_plus;
                            string5 = contextCreateConfigurationContext.getString(i6);
                            break;
                        case ">18":
                            i6 = R$string.onboarding_v2_age_under_18;
                            string5 = contextCreateConfigurationContext.getString(i6);
                            break;
                        case "18-24":
                            i6 = R$string.onboarding_v2_age_18_24;
                            string5 = contextCreateConfigurationContext.getString(i6);
                            break;
                        case "25-34":
                            i6 = R$string.onboarding_v2_age_25_34;
                            string5 = contextCreateConfigurationContext.getString(i6);
                            break;
                        case "35-44":
                            i6 = R$string.onboarding_v2_age_35_44;
                            string5 = contextCreateConfigurationContext.getString(i6);
                            break;
                        case "prefer not to answer":
                            i6 = R$string.onboarding_v2_age_prefer_not_to_answer;
                            string5 = contextCreateConfigurationContext.getString(i6);
                            break;
                        default:
                            string5 = null;
                            break;
                    }
                    m12085l(arrayList3, string20, string5);
                    String string21 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_life_event_title, strM17092K);
                    string21.getClass();
                    switch (onboardingSelections.f27301m) {
                        case "just ready":
                            i7 = R$string.onboarding_v2_life_event_just_ready;
                            string6 = contextCreateConfigurationContext.getString(i7);
                            break;
                        case "trip":
                            i7 = R$string.onboarding_v2_life_event_trip;
                            string6 = contextCreateConfigurationContext.getString(i7);
                            break;
                        case "other":
                            i7 = R$string.onboarding_v2_life_event_other;
                            string6 = contextCreateConfigurationContext.getString(i7);
                            break;
                        case "new relationship":
                            i7 = R$string.onboarding_v2_life_event_new_relationship;
                            string6 = contextCreateConfigurationContext.getString(i7);
                            break;
                        case "moving/studying abroad":
                            i7 = R$string.onboarding_v2_life_event_moving_studying_abroad;
                            string6 = contextCreateConfigurationContext.getString(i7);
                            break;
                        case "new job":
                            i7 = R$string.onboarding_v2_life_event_new_job;
                            string6 = contextCreateConfigurationContext.getString(i7);
                            break;
                        default:
                            string6 = null;
                            break;
                    }
                    m12085l(arrayList3, string21, string6);
                    String string22 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_where_title, strM17092K);
                    string22.getClass();
                    switch (onboardingSelections.f27302n) {
                        case "watching/reading":
                            i8 = R$string.onboarding_v2_where_watching;
                            string7 = contextCreateConfigurationContext.getString(i8);
                            break;
                        case "online":
                            i8 = R$string.onboarding_v2_where_online;
                            string7 = contextCreateConfigurationContext.getString(i8);
                            break;
                        case "everyday conversations":
                            i8 = R$string.onboarding_v2_where_everyday_conversations;
                            string7 = contextCreateConfigurationContext.getString(i8);
                            break;
                        case "school":
                            i8 = R$string.onboarding_v2_where_school;
                            string7 = contextCreateConfigurationContext.getString(i8);
                            break;
                        case "travel":
                            i8 = R$string.onboarding_v2_where_travel;
                            string7 = contextCreateConfigurationContext.getString(i8);
                            break;
                        case "work":
                            i8 = R$string.onboarding_v2_where_work;
                            string7 = contextCreateConfigurationContext.getString(i8);
                            break;
                        case "not sure":
                            i8 = R$string.onboarding_v2_where_not_sure;
                            string7 = contextCreateConfigurationContext.getString(i8);
                            break;
                        default:
                            string7 = null;
                            break;
                    }
                    m12085l(arrayList3, string22, string7);
                    String string23 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_familiarity_title);
                    string23.getClass();
                    str4 = onboardingSelections.f27304p;
                    switch (str4.hashCode()) {
                        case -977687209:
                            if (str4.equals("watched/read")) {
                                i9 = R$string.onboarding_v2_familiarity_watched_read;
                                string12 = contextCreateConfigurationContext.getString(i9);
                            }
                            break;
                        case 3599293:
                            if (str4.equals("used")) {
                                i9 = R$string.onboarding_v2_familiarity_used;
                                string12 = contextCreateConfigurationContext.getString(i9);
                            }
                            break;
                        case 99151926:
                            if (str4.equals("heard")) {
                                i9 = R$string.onboarding_v2_familiarity_heard;
                                string12 = contextCreateConfigurationContext.getString(i9);
                            }
                            break;
                        case 104712844:
                            if (str4.equals("never")) {
                                i9 = R$string.onboarding_v2_familiarity_never;
                                string12 = contextCreateConfigurationContext.getString(i9);
                            }
                            break;
                    }
                    m12085l(arrayList3, string23, string12);
                    for (OnboardingYesNoQuestion onboardingYesNoQuestion : OnboardingYesNoQuestion.getEntries()) {
                        bool = (Boolean) onboardingSelections.f27303o.get(onboardingYesNoQuestion.getSlug());
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                            tabVar = (tab) qt8.f58191a.get(onboardingYesNoQuestion);
                            if (tabVar != null) {
                                if (tabVar.m21922a()) {
                                    string8 = contextCreateConfigurationContext.getString(tabVar.m21924c(), strM17092K);
                                } else {
                                    string8 = contextCreateConfigurationContext.getString(tabVar.m21924c());
                                }
                                string8.getClass();
                                if (zBooleanValue) {
                                    iM21923b = tabVar.m21925d();
                                } else {
                                    iM21923b = tabVar.m21923b();
                                }
                                m12085l(arrayList3, string8, contextCreateConfigurationContext.getString(iM21923b));
                            }
                        }
                    }
                    return arrayList3.isEmpty() ? new xm5(xfaVar) : ((C1289e) ((zw0) this.f39591c)).m7170t(str, arrayList3, suspendLambda);
                } while (((DailyGoal) next).getMins() != i5);
                dailyGoal = (DailyGoal) next;
                if (dailyGoal == null) {
                    str2 = null;
                } else {
                    str2 = contextCreateConfigurationContext.getString(dailyGoal.getDesc()) + " (about " + dailyGoal.getMins() + " minutes a day)";
                }
                m12085l(arrayList3, string18, str2);
                String string110 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_name_title);
                string110.getClass();
                str3 = onboardingSelections.f27300l;
                if (vk9.m23391n0(str3)) {
                    str3 = null;
                }
                m12085l(arrayList3, string110, str3);
                String string24 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_age_title);
                string24.getClass();
                switch (onboardingSelections.f27299k) {
                    case 51658:
                        if (r5.equals("45+")) {
                            i6 = R$string.onboarding_v2_age_45_plus;
                            string5 = contextCreateConfigurationContext.getString(i6);
                        }
                        break;
                    case 61157:
                        if (r5.equals(">18")) {
                            i6 = R$string.onboarding_v2_age_under_18;
                            string5 = contextCreateConfigurationContext.getString(i6);
                        }
                        break;
                    case 46965672:
                        if (r5.equals("18-24")) {
                            i6 = R$string.onboarding_v2_age_18_24;
                            string5 = contextCreateConfigurationContext.getString(i6);
                        }
                        break;
                    case 47799851:
                        if (r5.equals("25-34")) {
                            i6 = R$string.onboarding_v2_age_25_34;
                            string5 = contextCreateConfigurationContext.getString(i6);
                        }
                        break;
                    case 48723403:
                        if (r5.equals("35-44")) {
                            i6 = R$string.onboarding_v2_age_35_44;
                            string5 = contextCreateConfigurationContext.getString(i6);
                        }
                        break;
                    case 826152422:
                        if (r5.equals("prefer not to answer")) {
                            i6 = R$string.onboarding_v2_age_prefer_not_to_answer;
                            string5 = contextCreateConfigurationContext.getString(i6);
                        }
                        break;
                    default:
                        string5 = null;
                        break;
                }
                m12085l(arrayList3, string24, string5);
                String string25 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_life_event_title, strM17092K);
                string25.getClass();
                switch (onboardingSelections.f27301m) {
                    case -918912657:
                        if (r5.equals("just ready")) {
                            i7 = R$string.onboarding_v2_life_event_just_ready;
                            string6 = contextCreateConfigurationContext.getString(i7);
                        }
                        break;
                    case 3568677:
                        if (r5.equals("trip")) {
                            i7 = R$string.onboarding_v2_life_event_trip;
                            string6 = contextCreateConfigurationContext.getString(i7);
                        }
                        break;
                    case 106069776:
                        if (r5.equals("other")) {
                            i7 = R$string.onboarding_v2_life_event_other;
                            string6 = contextCreateConfigurationContext.getString(i7);
                        }
                        break;
                    case 521945272:
                        if (r5.equals("new relationship")) {
                            i7 = R$string.onboarding_v2_life_event_new_relationship;
                            string6 = contextCreateConfigurationContext.getString(i7);
                        }
                        break;
                    case 1174687623:
                        if (r5.equals("moving/studying abroad")) {
                            i7 = R$string.onboarding_v2_life_event_moving_studying_abroad;
                            string6 = contextCreateConfigurationContext.getString(i7);
                        }
                        break;
                    case 1843659069:
                        if (r5.equals("new job")) {
                            i7 = R$string.onboarding_v2_life_event_new_job;
                            string6 = contextCreateConfigurationContext.getString(i7);
                        }
                        break;
                    default:
                        string6 = null;
                        break;
                }
                m12085l(arrayList3, string25, string6);
                String string26 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_where_title, strM17092K);
                string26.getClass();
                switch (onboardingSelections.f27302n) {
                    case -1612114640:
                        if (r5.equals("watching/reading")) {
                            i8 = R$string.onboarding_v2_where_watching;
                            string7 = contextCreateConfigurationContext.getString(i8);
                        }
                        break;
                    case -1012222381:
                        if (r5.equals("online")) {
                            i8 = R$string.onboarding_v2_where_online;
                            string7 = contextCreateConfigurationContext.getString(i8);
                        }
                        break;
                    case -912477935:
                        if (!r5.equals("everyday conversations")) {
                            i8 = R$string.onboarding_v2_where_everyday_conversations;
                            string7 = contextCreateConfigurationContext.getString(i8);
                        }
                        break;
                    case -907977868:
                        if (r5.equals("school")) {
                            i8 = R$string.onboarding_v2_where_school;
                            string7 = contextCreateConfigurationContext.getString(i8);
                        }
                        break;
                    case -865698022:
                        if (r5.equals("travel")) {
                            i8 = R$string.onboarding_v2_where_travel;
                            string7 = contextCreateConfigurationContext.getString(i8);
                        }
                        break;
                    case 3655441:
                        if (r5.equals("work")) {
                            i8 = R$string.onboarding_v2_where_work;
                            string7 = contextCreateConfigurationContext.getString(i8);
                        }
                        break;
                    case 1518345538:
                        if (r5.equals("not sure")) {
                            i8 = R$string.onboarding_v2_where_not_sure;
                            string7 = contextCreateConfigurationContext.getString(i8);
                        }
                        break;
                    default:
                        string7 = null;
                        break;
                }
                m12085l(arrayList3, string26, string7);
                String string27 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_familiarity_title);
                string27.getClass();
                str4 = onboardingSelections.f27304p;
                switch (str4.hashCode()) {
                    case -977687209:
                        if (str4.equals("watched/read")) {
                            i9 = R$string.onboarding_v2_familiarity_watched_read;
                            string12 = contextCreateConfigurationContext.getString(i9);
                        }
                        break;
                    case 3599293:
                        if (str4.equals("used")) {
                            i9 = R$string.onboarding_v2_familiarity_used;
                            string12 = contextCreateConfigurationContext.getString(i9);
                        }
                        break;
                    case 99151926:
                        if (str4.equals("heard")) {
                            i9 = R$string.onboarding_v2_familiarity_heard;
                            string12 = contextCreateConfigurationContext.getString(i9);
                        }
                        break;
                    case 104712844:
                        if (str4.equals("never")) {
                            i9 = R$string.onboarding_v2_familiarity_never;
                            string12 = contextCreateConfigurationContext.getString(i9);
                        }
                        break;
                }
                m12085l(arrayList3, string27, string12);
                while (r4.hasNext()) {
                    bool = (Boolean) onboardingSelections.f27303o.get(onboardingYesNoQuestion.getSlug());
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                        tabVar = (tab) qt8.f58191a.get(onboardingYesNoQuestion);
                        if (tabVar != null) {
                            if (tabVar.m21922a()) {
                                string8 = contextCreateConfigurationContext.getString(tabVar.m21924c(), strM17092K);
                            } else {
                                string8 = contextCreateConfigurationContext.getString(tabVar.m21924c());
                            }
                            string8.getClass();
                            if (zBooleanValue) {
                                iM21923b = tabVar.m21925d();
                            } else {
                                iM21923b = tabVar.m21923b();
                            }
                            m12085l(arrayList3, string8, contextCreateConfigurationContext.getString(iM21923b));
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                }
            }
            i2 = com.lingq.core.p012ui.R$string.levels_intermediate;
        }
        string2 = contextCreateConfigurationContext.getString(i2);
        m12085l(arrayList3, string13, string2);
        String string111 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_skills_title);
        string111.getClass();
        Set set3 = onboardingSelections.f27293e;
        arrayList = new ArrayList();
        it = set3.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -2134659376:
                    if (r10.equals("speaking")) {
                        i10 = R$string.onboarding_v2_skills_speaking;
                        string10 = contextCreateConfigurationContext.getString(i10);
                    }
                    break;
                case -1218715461:
                    if (r10.equals("listening")) {
                        i10 = R$string.onboarding_v2_skills_listening;
                        string10 = contextCreateConfigurationContext.getString(i10);
                    }
                    break;
                case -927641370:
                    if (r10.equals("vocabulary")) {
                        i10 = R$string.onboarding_v2_skills_vocabulary;
                        string10 = contextCreateConfigurationContext.getString(i10);
                    }
                    break;
                case 280258471:
                    if (r10.equals("grammar")) {
                        i10 = R$string.onboarding_v2_skills_grammar;
                        string10 = contextCreateConfigurationContext.getString(i10);
                    }
                    break;
                case 1080413836:
                    if (r10.equals("reading")) {
                        i10 = R$string.onboarding_v2_skills_reading;
                        string10 = contextCreateConfigurationContext.getString(i10);
                    }
                    break;
                case 1603008732:
                    if (r10.equals("writing")) {
                        i10 = R$string.onboarding_v2_skills_writing;
                        string10 = contextCreateConfigurationContext.getString(i10);
                    }
                    break;
                default:
                    string10 = null;
                    break;
            }
            if (string10 != null) {
                arrayList.add(string10);
            }
        }
        m12085l(arrayList3, string111, m12084C(arrayList));
        String string112 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_speaking_title_dynamic, strM17092K);
        string112.getClass();
        switch (onboardingSelections.f27294f) {
            case -892381166:
                if (r5.equals("steady")) {
                    i3 = R$string.onboarding_v2_speaking_steady;
                    string3 = contextCreateConfigurationContext.getString(i3);
                }
                break;
            case -840663525:
                if (r5.equals("uneasy")) {
                    i3 = R$string.onboarding_v2_speaking_uneasy;
                    string3 = contextCreateConfigurationContext.getString(i3);
                }
                break;
            case -804533940:
                if (r5.equals("confident")) {
                    i3 = R$string.onboarding_v2_speaking_confident;
                    string3 = contextCreateConfigurationContext.getString(i3);
                }
                break;
            case 1791476051:
                if (r5.equals("stressed")) {
                    i3 = R$string.onboarding_v2_speaking_stressed;
                    string3 = contextCreateConfigurationContext.getString(i3);
                }
                break;
            default:
                string3 = null;
                break;
        }
        m12085l(arrayList3, string112, string3);
        String string113 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_method_title_dynamic, strM17092K);
        string113.getClass();
        switch (onboardingSelections.f27297i) {
            case -1234885400:
                if (r5.equals("guided")) {
                    i4 = R$string.onboarding_v2_method_guided;
                    string4 = contextCreateConfigurationContext.getString(i4);
                }
                break;
            case -840227282:
                if (r5.equals("unsure")) {
                    i4 = R$string.onboarding_v2_method_unsure;
                    string4 = contextCreateConfigurationContext.getString(i4);
                }
                break;
            case 1137617595:
                if (r5.equals("immersive")) {
                    i4 = R$string.onboarding_v2_method_immersive;
                    string4 = contextCreateConfigurationContext.getString(i4);
                }
                break;
            case 1844104930:
                if (r5.equals("interactive")) {
                    i4 = R$string.onboarding_v2_method_interactive;
                    string4 = contextCreateConfigurationContext.getString(i4);
                }
                break;
            case 1919056809:
                if (r5.equals("self-directed")) {
                    i4 = R$string.onboarding_v2_method_self_directed;
                    string4 = contextCreateConfigurationContext.getString(i4);
                }
                break;
            default:
                string4 = null;
                break;
        }
        m12085l(arrayList3, string113, string4);
        String string114 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_topics_title);
        string114.getClass();
        Set set4 = onboardingSelections.f27295g;
        arrayList2 = new ArrayList();
        it2 = set4.iterator();
        while (it2.hasNext()) {
            feedTopicM15201I = AbstractC3184kh.m15201I((String) it2.next());
            if (feedTopicM15201I != null) {
                string9 = contextCreateConfigurationContext.getString(fbd.m11760j(feedTopicM15201I));
            } else {
                string9 = null;
            }
            if (string9 != null) {
                arrayList2.add(string9);
            }
        }
        m12085l(arrayList3, string114, m12084C(arrayList2));
        String string115 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_time_title_dynamic, strM17092K);
        string115.getClass();
        i5 = onboardingSelections.f27298j;
        it3 = DailyGoal.getEntries().iterator();
        do {
            if (it3.hasNext()) {
                next = it3.next();
            } else {
                next = null;
            }
            dailyGoal = (DailyGoal) next;
            if (dailyGoal == null) {
                str2 = null;
            } else {
                str2 = contextCreateConfigurationContext.getString(dailyGoal.getDesc()) + " (about " + dailyGoal.getMins() + " minutes a day)";
            }
            m12085l(arrayList3, string115, str2);
            String string116 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_name_title);
            string116.getClass();
            str3 = onboardingSelections.f27300l;
            if (vk9.m23391n0(str3)) {
                str3 = null;
            }
            m12085l(arrayList3, string116, str3);
            String string28 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_age_title);
            string28.getClass();
            switch (onboardingSelections.f27299k) {
                case 51658:
                    if (r5.equals("45+")) {
                        i6 = R$string.onboarding_v2_age_45_plus;
                        string5 = contextCreateConfigurationContext.getString(i6);
                    }
                    break;
                case 61157:
                    if (r5.equals(">18")) {
                        i6 = R$string.onboarding_v2_age_under_18;
                        string5 = contextCreateConfigurationContext.getString(i6);
                    }
                    break;
                case 46965672:
                    if (r5.equals("18-24")) {
                        i6 = R$string.onboarding_v2_age_18_24;
                        string5 = contextCreateConfigurationContext.getString(i6);
                    }
                    break;
                case 47799851:
                    if (r5.equals("25-34")) {
                        i6 = R$string.onboarding_v2_age_25_34;
                        string5 = contextCreateConfigurationContext.getString(i6);
                    }
                    break;
                case 48723403:
                    if (r5.equals("35-44")) {
                        i6 = R$string.onboarding_v2_age_35_44;
                        string5 = contextCreateConfigurationContext.getString(i6);
                    }
                    break;
                case 826152422:
                    if (r5.equals("prefer not to answer")) {
                        i6 = R$string.onboarding_v2_age_prefer_not_to_answer;
                        string5 = contextCreateConfigurationContext.getString(i6);
                    }
                    break;
                default:
                    string5 = null;
                    break;
            }
            m12085l(arrayList3, string28, string5);
            String string29 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_life_event_title, strM17092K);
            string29.getClass();
            switch (onboardingSelections.f27301m) {
                case -918912657:
                    if (r5.equals("just ready")) {
                        i7 = R$string.onboarding_v2_life_event_just_ready;
                        string6 = contextCreateConfigurationContext.getString(i7);
                    }
                    break;
                case 3568677:
                    if (r5.equals("trip")) {
                        i7 = R$string.onboarding_v2_life_event_trip;
                        string6 = contextCreateConfigurationContext.getString(i7);
                    }
                    break;
                case 106069776:
                    if (r5.equals("other")) {
                        i7 = R$string.onboarding_v2_life_event_other;
                        string6 = contextCreateConfigurationContext.getString(i7);
                    }
                    break;
                case 521945272:
                    if (r5.equals("new relationship")) {
                        i7 = R$string.onboarding_v2_life_event_new_relationship;
                        string6 = contextCreateConfigurationContext.getString(i7);
                    }
                    break;
                case 1174687623:
                    if (r5.equals("moving/studying abroad")) {
                        i7 = R$string.onboarding_v2_life_event_moving_studying_abroad;
                        string6 = contextCreateConfigurationContext.getString(i7);
                    }
                    break;
                case 1843659069:
                    if (r5.equals("new job")) {
                        i7 = R$string.onboarding_v2_life_event_new_job;
                        string6 = contextCreateConfigurationContext.getString(i7);
                    }
                    break;
                default:
                    string6 = null;
                    break;
            }
            m12085l(arrayList3, string29, string6);
            String string210 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_where_title, strM17092K);
            string210.getClass();
            switch (onboardingSelections.f27302n) {
                case -1612114640:
                    if (r5.equals("watching/reading")) {
                        i8 = R$string.onboarding_v2_where_watching;
                        string7 = contextCreateConfigurationContext.getString(i8);
                    }
                    break;
                case -1012222381:
                    if (r5.equals("online")) {
                        i8 = R$string.onboarding_v2_where_online;
                        string7 = contextCreateConfigurationContext.getString(i8);
                    }
                    break;
                case -912477935:
                    if (!r5.equals("everyday conversations")) {
                        i8 = R$string.onboarding_v2_where_everyday_conversations;
                        string7 = contextCreateConfigurationContext.getString(i8);
                    }
                    break;
                case -907977868:
                    if (r5.equals("school")) {
                        i8 = R$string.onboarding_v2_where_school;
                        string7 = contextCreateConfigurationContext.getString(i8);
                    }
                    break;
                case -865698022:
                    if (r5.equals("travel")) {
                        i8 = R$string.onboarding_v2_where_travel;
                        string7 = contextCreateConfigurationContext.getString(i8);
                    }
                    break;
                case 3655441:
                    if (r5.equals("work")) {
                        i8 = R$string.onboarding_v2_where_work;
                        string7 = contextCreateConfigurationContext.getString(i8);
                    }
                    break;
                case 1518345538:
                    if (r5.equals("not sure")) {
                        i8 = R$string.onboarding_v2_where_not_sure;
                        string7 = contextCreateConfigurationContext.getString(i8);
                    }
                    break;
                default:
                    string7 = null;
                    break;
            }
            m12085l(arrayList3, string210, string7);
            String string211 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_familiarity_title);
            string211.getClass();
            str4 = onboardingSelections.f27304p;
            switch (str4.hashCode()) {
                case -977687209:
                    if (str4.equals("watched/read")) {
                        i9 = R$string.onboarding_v2_familiarity_watched_read;
                        string12 = contextCreateConfigurationContext.getString(i9);
                    }
                    break;
                case 3599293:
                    if (str4.equals("used")) {
                        i9 = R$string.onboarding_v2_familiarity_used;
                        string12 = contextCreateConfigurationContext.getString(i9);
                    }
                    break;
                case 99151926:
                    if (str4.equals("heard")) {
                        i9 = R$string.onboarding_v2_familiarity_heard;
                        string12 = contextCreateConfigurationContext.getString(i9);
                    }
                    break;
                case 104712844:
                    if (str4.equals("never")) {
                        i9 = R$string.onboarding_v2_familiarity_never;
                        string12 = contextCreateConfigurationContext.getString(i9);
                    }
                    break;
            }
            m12085l(arrayList3, string211, string12);
            while (r4.hasNext()) {
                bool = (Boolean) onboardingSelections.f27303o.get(onboardingYesNoQuestion.getSlug());
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                    tabVar = (tab) qt8.f58191a.get(onboardingYesNoQuestion);
                    if (tabVar != null) {
                        if (tabVar.m21922a()) {
                            string8 = contextCreateConfigurationContext.getString(tabVar.m21924c(), strM17092K);
                        } else {
                            string8 = contextCreateConfigurationContext.getString(tabVar.m21924c());
                        }
                        string8.getClass();
                        if (zBooleanValue) {
                            iM21923b = tabVar.m21925d();
                        } else {
                            iM21923b = tabVar.m21923b();
                        }
                        m12085l(arrayList3, string8, contextCreateConfigurationContext.getString(iM21923b));
                    }
                }
            }
            if (arrayList3.isEmpty()) {
            }
        } while (((DailyGoal) next).getMins() != i5);
        dailyGoal = (DailyGoal) next;
        if (dailyGoal == null) {
            str2 = null;
        } else {
            str2 = contextCreateConfigurationContext.getString(dailyGoal.getDesc()) + " (about " + dailyGoal.getMins() + " minutes a day)";
        }
        m12085l(arrayList3, string115, str2);
        String string117 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_name_title);
        string117.getClass();
        str3 = onboardingSelections.f27300l;
        if (vk9.m23391n0(str3)) {
            str3 = null;
        }
        m12085l(arrayList3, string117, str3);
        String string212 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_age_title);
        string212.getClass();
        switch (onboardingSelections.f27299k) {
            case 51658:
                if (r5.equals("45+")) {
                    i6 = R$string.onboarding_v2_age_45_plus;
                    string5 = contextCreateConfigurationContext.getString(i6);
                }
                break;
            case 61157:
                if (r5.equals(">18")) {
                    i6 = R$string.onboarding_v2_age_under_18;
                    string5 = contextCreateConfigurationContext.getString(i6);
                }
                break;
            case 46965672:
                if (r5.equals("18-24")) {
                    i6 = R$string.onboarding_v2_age_18_24;
                    string5 = contextCreateConfigurationContext.getString(i6);
                }
                break;
            case 47799851:
                if (r5.equals("25-34")) {
                    i6 = R$string.onboarding_v2_age_25_34;
                    string5 = contextCreateConfigurationContext.getString(i6);
                }
                break;
            case 48723403:
                if (r5.equals("35-44")) {
                    i6 = R$string.onboarding_v2_age_35_44;
                    string5 = contextCreateConfigurationContext.getString(i6);
                }
                break;
            case 826152422:
                if (r5.equals("prefer not to answer")) {
                    i6 = R$string.onboarding_v2_age_prefer_not_to_answer;
                    string5 = contextCreateConfigurationContext.getString(i6);
                }
                break;
            default:
                string5 = null;
                break;
        }
        m12085l(arrayList3, string212, string5);
        String string213 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_life_event_title, strM17092K);
        string213.getClass();
        switch (onboardingSelections.f27301m) {
            case -918912657:
                if (r5.equals("just ready")) {
                    i7 = R$string.onboarding_v2_life_event_just_ready;
                    string6 = contextCreateConfigurationContext.getString(i7);
                }
                break;
            case 3568677:
                if (r5.equals("trip")) {
                    i7 = R$string.onboarding_v2_life_event_trip;
                    string6 = contextCreateConfigurationContext.getString(i7);
                }
                break;
            case 106069776:
                if (r5.equals("other")) {
                    i7 = R$string.onboarding_v2_life_event_other;
                    string6 = contextCreateConfigurationContext.getString(i7);
                }
                break;
            case 521945272:
                if (r5.equals("new relationship")) {
                    i7 = R$string.onboarding_v2_life_event_new_relationship;
                    string6 = contextCreateConfigurationContext.getString(i7);
                }
                break;
            case 1174687623:
                if (r5.equals("moving/studying abroad")) {
                    i7 = R$string.onboarding_v2_life_event_moving_studying_abroad;
                    string6 = contextCreateConfigurationContext.getString(i7);
                }
                break;
            case 1843659069:
                if (r5.equals("new job")) {
                    i7 = R$string.onboarding_v2_life_event_new_job;
                    string6 = contextCreateConfigurationContext.getString(i7);
                }
                break;
            default:
                string6 = null;
                break;
        }
        m12085l(arrayList3, string213, string6);
        String string214 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_where_title, strM17092K);
        string214.getClass();
        switch (onboardingSelections.f27302n) {
            case -1612114640:
                if (r5.equals("watching/reading")) {
                    i8 = R$string.onboarding_v2_where_watching;
                    string7 = contextCreateConfigurationContext.getString(i8);
                }
                break;
            case -1012222381:
                if (r5.equals("online")) {
                    i8 = R$string.onboarding_v2_where_online;
                    string7 = contextCreateConfigurationContext.getString(i8);
                }
                break;
            case -912477935:
                if (!r5.equals("everyday conversations")) {
                    i8 = R$string.onboarding_v2_where_everyday_conversations;
                    string7 = contextCreateConfigurationContext.getString(i8);
                }
                break;
            case -907977868:
                if (r5.equals("school")) {
                    i8 = R$string.onboarding_v2_where_school;
                    string7 = contextCreateConfigurationContext.getString(i8);
                }
                break;
            case -865698022:
                if (r5.equals("travel")) {
                    i8 = R$string.onboarding_v2_where_travel;
                    string7 = contextCreateConfigurationContext.getString(i8);
                }
                break;
            case 3655441:
                if (r5.equals("work")) {
                    i8 = R$string.onboarding_v2_where_work;
                    string7 = contextCreateConfigurationContext.getString(i8);
                }
                break;
            case 1518345538:
                if (r5.equals("not sure")) {
                    i8 = R$string.onboarding_v2_where_not_sure;
                    string7 = contextCreateConfigurationContext.getString(i8);
                }
                break;
            default:
                string7 = null;
                break;
        }
        m12085l(arrayList3, string214, string7);
        String string215 = contextCreateConfigurationContext.getString(R$string.onboarding_v2_familiarity_title);
        string215.getClass();
        str4 = onboardingSelections.f27304p;
        switch (str4.hashCode()) {
            case -977687209:
                if (str4.equals("watched/read")) {
                    i9 = R$string.onboarding_v2_familiarity_watched_read;
                    string12 = contextCreateConfigurationContext.getString(i9);
                }
                break;
            case 3599293:
                if (str4.equals("used")) {
                    i9 = R$string.onboarding_v2_familiarity_used;
                    string12 = contextCreateConfigurationContext.getString(i9);
                }
                break;
            case 99151926:
                if (str4.equals("heard")) {
                    i9 = R$string.onboarding_v2_familiarity_heard;
                    string12 = contextCreateConfigurationContext.getString(i9);
                }
                break;
            case 104712844:
                if (str4.equals("never")) {
                    i9 = R$string.onboarding_v2_familiarity_never;
                    string12 = contextCreateConfigurationContext.getString(i9);
                }
                break;
        }
        m12085l(arrayList3, string215, string12);
        while (r4.hasNext()) {
            bool = (Boolean) onboardingSelections.f27303o.get(onboardingYesNoQuestion.getSlug());
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
                tabVar = (tab) qt8.f58191a.get(onboardingYesNoQuestion);
                if (tabVar != null) {
                    if (tabVar.m21922a()) {
                        string8 = contextCreateConfigurationContext.getString(tabVar.m21924c(), strM17092K);
                    } else {
                        string8 = contextCreateConfigurationContext.getString(tabVar.m21924c());
                    }
                    string8.getClass();
                    if (zBooleanValue) {
                        iM21923b = tabVar.m21925d();
                    } else {
                        iM21923b = tabVar.m21923b();
                    }
                    m12085l(arrayList3, string8, contextCreateConfigurationContext.getString(iM21923b));
                }
            }
        }
        if (arrayList3.isEmpty()) {
        }
    }

    /* JADX INFO: renamed from: D */
    public void m12089D(View view, int i, boolean z) {
        m12115v().notifyViewVisibilityChanged(view, i, z);
    }

    /* JADX INFO: renamed from: E */
    public sz6 m12090E(e04 e04Var, w89 w89Var) {
        List list = e04Var.f36507f;
        Bitmap.Config config = e04Var.f36505d;
        if ((!list.isEmpty() && !AbstractC3550rv.m20823Q(AbstractC3057h.f41581a, config)) || (config == Bitmap.Config.HARDWARE && !m12083B(e04Var, config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        pvc pvcVar = w89Var.f66531a;
        ng2 ng2Var = ng2.f52701n;
        return new sz6(e04Var.f36502a, config, null, w89Var, (pvcVar.equals(ng2Var) || w89Var.f66532b.equals(ng2Var)) ? Scale.FIT : e04Var.f36524w, AbstractC2983f.m11406a(e04Var), e04Var.f36513l && e04Var.f36507f.isEmpty() && config != Bitmap.Config.ALPHA_8, e04Var.f36514m, null, e04Var.f36509h, e04Var.f36510i, e04Var.f36525x, e04Var.f36515n, e04Var.f36516o, e04Var.f36517p);
    }

    /* JADX INFO: renamed from: F */
    public void m12091F(Bundle bundle) {
        lb4 lb4Var = (lb4) this.f39590b;
        vl8 vl8Var = (vl8) lb4Var.f49398d;
        if (!lb4Var.f49395a) {
            lb4Var.m16060a();
        }
        if (vl8Var.mo256K().mo21327q().isAtLeast(Lifecycle$State.STARTED)) {
            ij6.m13951i(vl8Var.mo256K().mo21327q(), "performRestore cannot be called when owner is ");
            return;
        }
        if (lb4Var.f49396b) {
            C3386nv.m17633t("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                syc.m21782a("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        lb4Var.f49402h = bundle2;
        lb4Var.f49396b = true;
    }

    /* JADX INFO: renamed from: G */
    public void m12092G(Bundle bundle) {
        lb4 lb4Var = (lb4) this.f39590b;
        Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = (Bundle) lb4Var.f49402h;
        if (bundle2 != null) {
            bundleM18160p.putAll(bundle2);
        }
        synchronized (((u06) lb4Var.f49400f)) {
            for (Map.Entry entry : ((LinkedHashMap) lb4Var.f49401g).entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleMo4018a = ((ul8) entry.getValue()).mo4018a();
                str.getClass();
                bundleM18160p.putBundle(str, bundleMo4018a);
            }
        }
        if (bundleM18160p.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM18160p);
    }

    /* JADX INFO: renamed from: H */
    public c50 m12093H() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m12114u());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", persistedInstallation$RegistrationStatus.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = c50.f9501h;
        b50 b50Var = new b50();
        b50Var.f7950f = 0L;
        b50Var.f7952h = (byte) (b50Var.f7952h | 2);
        b50Var.m3299b(persistedInstallation$RegistrationStatus);
        b50Var.f7949e = 0L;
        b50Var.f7952h = (byte) (b50Var.f7952h | 1);
        b50Var.f7945a = strOptString;
        b50Var.m3299b(PersistedInstallation$RegistrationStatus.values()[iOptInt]);
        b50Var.f7947c = strOptString2;
        b50Var.f7948d = strOptString3;
        b50Var.f7950f = jOptLong;
        byte b = (byte) (b50Var.f7952h | 2);
        b50Var.f7949e = jOptLong2;
        b50Var.f7952h = (byte) (b | 1);
        b50Var.f7951g = strOptString4;
        return b50Var.m3298a();
    }

    /* JADX INFO: renamed from: I */
    public void m12094I(String str, ul8 ul8Var) {
        ul8Var.getClass();
        lb4 lb4Var = (lb4) this.f39590b;
        synchronized (((u06) lb4Var.f49400f)) {
            if (((LinkedHashMap) lb4Var.f49401g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) lb4Var.f49401g).put(str, ul8Var);
        }
    }

    /* JADX INFO: renamed from: J */
    public zg9 m12095J(a8b a8bVar) {
        zg9 zg9Var;
        synchronized (this.f39591c) {
            zg9Var = (zg9) ((d54) this.f39590b).f35011a.remove(a8bVar);
        }
        return zg9Var;
    }

    /* JADX INFO: renamed from: K */
    public void m12096K() {
        if (!((lb4) this.f39590b).f49397c) {
            C3386nv.m17633t("Can not perform this action after onSaveInstanceState");
            return;
        }
        C0819bp c0819bp = (C0819bp) this.f39591c;
        if (c0819bp == null) {
            c0819bp = new C0819bp(this);
        }
        this.f39591c = c0819bp;
        try {
            xw4.class.getDeclaredConstructor(null);
            C0819bp c0819bp2 = (C0819bp) this.f39591c;
            if (c0819bp2 != null) {
                ((LinkedHashSet) c0819bp2.f8780b).add(xw4.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + xw4.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo12097L(ro5 ro5Var) {
        this.f39591c = ro5Var;
        View viewFindViewById = ((MainActivity) this.f39590b).findViewById(R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new hf9(this, viewFindViewById));
    }

    /* JADX INFO: renamed from: M */
    public zg9 m12098M(a8b a8bVar) {
        zg9 zg9VarM10102e;
        synchronized (this.f39591c) {
            zg9VarM10102e = ((d54) this.f39590b).m10102e(a8bVar);
        }
        return zg9VarM10102e;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX INFO: renamed from: N */
    public sz6 m12099N(sz6 sz6Var) {
        boolean z;
        boolean z2;
        Bitmap.Config config = sz6Var.f61660b;
        CachePolicy cachePolicy = sz6Var.f61673o;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        if (cachePolicy.getReadEnabled()) {
            lp9 lp9Var = (lp9) this.f39591c;
            synchronized (lp9Var) {
                lp9Var.m16427a();
                z2 = lp9Var.f49989e;
            }
            if (z2) {
                z = false;
            } else {
                cachePolicy = CachePolicy.DISABLED;
                z = true;
            }
        } else {
            z = false;
        }
        return z ? new sz6(sz6Var.f61659a, config, sz6Var.f61661c, sz6Var.f61662d, sz6Var.f61663e, sz6Var.f61664f, sz6Var.f61665g, sz6Var.f61666h, sz6Var.f61667i, sz6Var.f61668j, sz6Var.f61669k, sz6Var.f61670l, sz6Var.f61671m, sz6Var.f61672n, cachePolicy) : sz6Var;
    }

    @Override // p000.gl9
    /* JADX INFO: renamed from: a */
    public void mo12100a(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        int i;
        int iM14104r = AbstractC3122is.m14104r(bitmap);
        s18 s18Var = (s18) this.f39591c;
        synchronized (((p84) s18Var.f474g)) {
            i = s18Var.f469b;
        }
        s18 s18Var2 = (s18) this.f39591c;
        if (iM14104r <= i) {
            s18Var2.m240f(memoryCache$Key, new r18(bitmap, map, iM14104r));
        } else {
            s18Var2.m241g(memoryCache$Key);
            ((C3126ix) this.f39590b).m14177m(memoryCache$Key, bitmap, map, iM14104r);
        }
    }

    @Override // p000.zp7
    /* JADX INFO: renamed from: b */
    public void mo12101b(yp7 yp7Var, int i) throws IOException {
        int[] iArr = (int[]) this.f39591c;
        try {
            yp7Var.read((byte[]) this.f39590b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            yp7Var.close();
        }
    }

    @Override // p000.yl8
    /* JADX INFO: renamed from: c */
    public Object mo4857c(Object obj) {
        return ((vi3) this.f39591c).invoke(obj);
    }

    @Override // p000.tm0
    public void cancel() {
        if (((AtomicInt) this.f39591c).compareAndSet(1, 1)) {
            return;
        }
        ((r60) this.f39590b).mo0a();
    }

    @Override // p000.hc9
    /* JADX INFO: renamed from: d */
    public float mo12102d(float f, float f2) {
        AbstractC0150d abstractC0150d = (AbstractC0150d) this.f39590b;
        int iM1040o = abstractC0150d.m1040o();
        t66 t66Var = abstractC0150d.f2683m;
        int i = ((n27) ((xc9) t66Var).getValue()).f52221c + iM1040o;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = abstractC0150d.f2675e;
        if (f < 0.0f) {
            i2++;
        }
        int iM15945h = l70.m15945h(((int) (f2 / i)) + i2, 0, abstractC0150d.mo1039n());
        abstractC0150d.m1040o();
        int i3 = ((n27) ((xc9) t66Var).getValue()).f52221c;
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((l70.m15945h(l70.m15945h(iM15945h, i4, (int) j3), 0, abstractC0150d.mo1039n()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        if (i5 == 0) {
            return i5;
        }
        return Math.signum(f) * i5;
    }

    @Override // p000.hc9
    /* JADX INFO: renamed from: e */
    public float mo12103e(float f) {
        AbstractC0150d abstractC0150d = (AbstractC0150d) this.f39590b;
        gz8 gz8Var = abstractC0150d.m1038m().f52233o;
        List list = abstractC0150d.m1038m().f52219a;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            lt5 lt5Var = (lt5) list.get(i);
            pvc.m19522r(abstractC0150d.m1038m());
            int i2 = abstractC0150d.m1038m().f52224f;
            int i3 = abstractC0150d.m1038m().f52222d;
            int i4 = abstractC0150d.m1038m().f52220b;
            int i5 = lt5Var.f50111l;
            abstractC0150d.mo1039n();
            gz8Var.getClass();
            float f4 = i5 - 0.0f;
            if (f4 <= 0.0f && f4 > f2) {
                f2 = f4;
            }
            if (f4 >= 0.0f && f4 < f3) {
                f3 = f4;
            }
        }
        if (f2 == Float.NEGATIVE_INFINITY) {
            f2 = f3;
        }
        if (f3 == Float.POSITIVE_INFINITY) {
            f3 = f2;
        }
        if (!abstractC0150d.mo975d()) {
            if (pb1.m19022J(abstractC0150d, f)) {
                f2 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
        }
        if (!abstractC0150d.mo974b()) {
            f2 = 0.0f;
            if (!pb1.m19022J(abstractC0150d, f)) {
                f3 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f3);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) ((ia5) this.f39591c).invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            l54.m15816c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    @Override // p000.yl8
    /* JADX INFO: renamed from: f */
    public Object mo4858f(el8 el8Var, Object obj) {
        return ((zi3) this.f39590b).invoke(el8Var, obj);
    }

    @Override // p000.hz6
    /* JADX INFO: renamed from: g */
    public List mo12104g(Integer num) {
        List listMo12104g = ((hz6) this.f39590b).mo12104g(null);
        fb9 fb9Var = (fb9) this.f39591c;
        int i = fb9Var.f38821v;
        if (i < 0) {
            return listMo12104g;
        }
        return u91.m22603U0(listMo12104g, lda.m16123i(fb9Var, num, i, Integer.valueOf(fb9Var.m11710E(fb9Var.f38801b, i))));
    }

    @Override // p000.hz6
    /* JADX INFO: renamed from: h */
    public boolean mo12105h() {
        return ((hz6) this.f39590b).mo12105h();
    }

    @Override // p000.gl9
    /* JADX INFO: renamed from: i */
    public bw5 mo12106i(MemoryCache$Key memoryCache$Key) {
        r18 r18Var = (r18) ((s18) this.f39591c).m238d(memoryCache$Key);
        if (r18Var != null) {
            return new bw5(r18Var.f58493a, r18Var.f58494b);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public b90 m12107j(Plugin$Type plugin$Type, b90 b90Var) {
        plugin$Type.getClass();
        yv5 yv5Var = (yv5) ((Map) this.f39590b).get(plugin$Type);
        if (b90Var == null) {
            return b90Var;
        }
        if (yv5Var == null) {
            return null;
        }
        for (zf7 zf7Var : yv5Var.f70552a) {
            if (b90Var != null) {
                boolean z = zf7Var instanceof C0910a;
                if (z) {
                    try {
                        C0910a c0910a = (C0910a) zf7Var;
                        fs6 fs6Var = c0910a.f11155b;
                        if (c0910a.f11157d) {
                            b90 b90VarM12107j = fs6Var.m12107j(Plugin$Type.Enrichment, fs6Var.m12107j(Plugin$Type.Before, b90Var));
                            if (b90VarM12107j != null) {
                                if (b90VarM12107j instanceof fz3) {
                                    c0910a.m5144c((fz3) b90VarM12107j);
                                } else {
                                    c0910a.m5144c(b90VarM12107j);
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    b90Var = z ? null : zf7Var.mo5143b(b90Var);
                }
            }
        }
        return b90Var;
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) throws Throwable {
        FileWriter fileWriter;
        C1150a c1150a = (C1150a) this.f39591c;
        JSONObject jSONObject = (JSONObject) ((C1149a) this.f39590b).f13670c.f34397a.submit(new ng1(this, 3)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            i09 i09VarM18298K = c1150a.f13673c.m18298K(jSONObject);
            qn3 qn3Var = c1150a.f13675e;
            long j = i09VarM18298K.f43296c;
            qn3Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) qn3Var.f57974a);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    pb1.m19047q(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                pb1.m19047q(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            pb1.m19047q(fileWriter, "Failed to close settings writer.");
            C1150a.m6682d("Loaded settings: ", jSONObject);
            String str = c1150a.f13672b.f60215f;
            SharedPreferences.Editor editorEdit = c1150a.f13671a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            c1150a.f13678h.set(i09VarM18298K);
            ((wr9) c1150a.f13679i.get()).m24140d(i09VarM18298K);
        }
        return Tasks.m5975c(null);
    }

    /* JADX INFO: renamed from: m */
    public Bundle m12108m(String str) {
        Bundle bundle;
        lb4 lb4Var = (lb4) this.f39590b;
        if (!lb4Var.f49396b) {
            C3386nv.m17633t("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = (Bundle) lb4Var.f49402h;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                syc.m21782a(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            lb4Var.f49402h = null;
        }
        return bundle;
    }

    @Override // p000.gl9
    /* JADX INFO: renamed from: n */
    public void mo12109n(int i) {
        int i2;
        s18 s18Var = (s18) this.f39591c;
        if (i >= 40) {
            s18Var.m244j(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        synchronized (((p84) s18Var.f474g)) {
            i2 = s18Var.f470c;
        }
        s18Var.m244j(i2 / 2);
    }

    /* JADX INFO: renamed from: o */
    public boolean m12110o(a8b a8bVar) {
        boolean zContainsKey;
        synchronized (this.f39591c) {
            zContainsKey = ((d54) this.f39590b).f35011a.containsKey(a8bVar);
        }
        return zContainsKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public void m12111p() {
        Object[] objArr;
        x66 x66Var = (x66) this.f39590b;
        Arrays.sort(x66Var.f67830a, 0, x66Var.f67832c, es6.f37775b);
        int i = x66Var.f67832c;
        C0357g[] c0357gArr = (C0357g[]) this.f39591c;
        if (c0357gArr == null || c0357gArr.length < i) {
            objArr = c0357gArr;
            objArr = new C0357g[Math.max(16, i)];
        }
        objArr = c0357gArr;
        this.f39591c = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = x66Var.f67830a[i2];
        }
        x66Var.m24310h();
        while (true) {
            i--;
            if (-1 >= i) {
                this.f39591c = objArr;
                return;
            }
            C0357g c0357g = objArr[i];
            c0357g.getClass();
            if (c0357g.f4353j0) {
                m12086q(c0357g);
            }
            objArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public h50 m12112s(sg1 sg1Var) throws FirebaseRemoteConfigClientException {
        String string;
        JSONArray jSONArray = sg1Var.f60811g;
        long j = sg1Var.f60810f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                sg1 sg1VarM19941c = ((qg1) this.f39590b).m19941c();
                String string3 = null;
                if (sg1VarM19941c == null) {
                    string = null;
                } else {
                    try {
                        string = sg1VarM19941c.f60806b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    sg1 sg1VarM19941c2 = ((qg1) this.f39591c).m19941c();
                    if (sg1VarM19941c2 != null) {
                        try {
                            string3 = sg1VarM19941c2.f60806b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                e50 e50VarM23287a = vh8.m23287a();
                e50VarM23287a.m10852d(string2);
                e50VarM23287a.m10854f(jSONObject.getString("variantId"));
                e50VarM23287a.m10850b(strOptString);
                e50VarM23287a.m10851c(string);
                e50VarM23287a.m10853e(j);
                hashSet.add(e50VarM23287a.m10849a());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new h50(hashSet);
    }

    /* JADX INFO: renamed from: t */
    public AbstractC0903a m12113t() {
        AbstractC0903a abstractC0903a = (AbstractC0903a) this.f39591c;
        if (abstractC0903a != null) {
            return abstractC0903a;
        }
        fa4.m11636J("amplitude");
        throw null;
    }

    public String toString() {
        switch (this.f39589a) {
            case 10:
                String strM24121q = "[ ";
                if (((rd9) this.f39590b) != null) {
                    for (int i = 0; i < 9; i++) {
                        strM24121q = wq1.m24121q(ux5.m22997t(strM24121q), ((rd9) this.f39590b).f59133h[i], " ");
                    }
                }
                StringBuilder sbM22999v = ux5.m22999v(strM24121q, "] ");
                sbM22999v.append((rd9) this.f39590b);
                return sbM22999v.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public File m12114u() {
        if (((File) this.f39590b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f39590b) == null) {
                        String str = "PersistedInstallation." + ((q43) this.f39591c).m19646d() + ".json";
                        q43 q43Var = (q43) this.f39591c;
                        q43Var.m19644a();
                        File file = new File(q43Var.f57252a.getNoBackupFilesDir(), str);
                        this.f39590b = file;
                        if (file.exists()) {
                            return (File) this.f39590b;
                        }
                        q43 q43Var2 = (q43) this.f39591c;
                        q43Var2.m19644a();
                        File file2 = new File(q43Var2.f57252a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f39590b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f39590b;
    }

    /* JADX INFO: renamed from: v */
    public AutofillManager m12115v() {
        AutofillManager autofillManager = (AutofillManager) this.f39591c;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.f39590b).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.f39591c = autofillManager2;
            return autofillManager2;
        }
        C3386nv.m17633t("Could not locate AutofillManager from context");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public ul8 m12116w(String str) {
        ul8 ul8Var;
        lb4 lb4Var = (lb4) this.f39590b;
        synchronized (((u06) lb4Var.f49400f)) {
            Iterator it = ((LinkedHashMap) lb4Var.f49401g).entrySet().iterator();
            do {
                ul8Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                ul8 ul8Var2 = (ul8) entry.getValue();
                if (fa4.m11650l(str2, str)) {
                    ul8Var = ul8Var2;
                }
            } while (ul8Var == null);
        }
        return ul8Var;
    }

    /* JADX INFO: renamed from: x */
    public String m12117x(String str) {
        String str2 = (String) this.f39591c;
        Resources resources = (Resources) this.f39590b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX INFO: renamed from: y */
    public void m12118y(c50 c50Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c50Var.f9502a);
            jSONObject.put("Status", c50Var.f9503b.ordinal());
            jSONObject.put("AuthToken", c50Var.f9504c);
            jSONObject.put("RefreshToken", c50Var.f9505d);
            jSONObject.put("TokenCreationEpochInSecs", c50Var.f9507f);
            jSONObject.put("ExpiresInSecs", c50Var.f9506e);
            jSONObject.put("FisError", c50Var.f9508g);
            q43 q43Var = (q43) this.f39591c;
            q43Var.m19644a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", q43Var.f57252a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m12114u())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo12119z() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.f39590b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(R$attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R$attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            bna.m3932U(mainActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R$attr.splashScreenIconSize, typedValue, true);
        if (!theme.resolveAttribute(R$attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        mainActivity.setTheme(i);
    }

    public /* synthetic */ fs6(Object obj, int i) {
        this.f39589a = i;
        this.f39591c = obj;
    }

    public /* synthetic */ fs6(Object obj, boolean z, int i) {
        this.f39589a = i;
        this.f39590b = obj;
    }

    public fs6(Context context) {
        this.f39589a = 26;
        lda.m16130p(context);
        Resources resources = context.getResources();
        this.f39590b = resources;
        this.f39591c = resources.getResourcePackageName(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
    }

    public fs6(C3509qs c3509qs, hm5 hm5Var) {
        this.f39589a = 24;
        hm5Var.getClass();
        c3509qs.getClass();
        this.f39590b = hm5Var;
        this.f39591c = c3509qs;
    }

    public fs6(C3509qs c3509qs, df4 df4Var) {
        this.f39589a = 1;
        c3509qs.getClass();
        df4Var.getClass();
        this.f39590b = c3509qs;
        this.f39591c = df4Var;
    }

    public fs6(lb4 lb4Var) {
        this.f39589a = 18;
        this.f39590b = lb4Var;
        this.f39591c = new fs6((Object) lb4Var, false, 17);
    }

    public /* synthetic */ fs6(int i, Object obj, Object obj2) {
        this.f39589a = i;
        this.f39590b = obj;
        this.f39591c = obj2;
    }

    public fs6(Context context, zw0 zw0Var) {
        this.f39589a = 20;
        zw0Var.getClass();
        this.f39590b = context;
        this.f39591c = zw0Var;
    }

    public fs6(AbstractC0150d abstractC0150d, ia5 ia5Var, p27 p27Var) {
        this.f39589a = 4;
        this.f39590b = abstractC0150d;
        this.f39591c = ia5Var;
    }

    public fs6(r60 r60Var) {
        this.f39589a = 2;
        this.f39590b = r60Var;
        this.f39591c = new AtomicInt(0);
    }

    public fs6(ExecutorService executorService) {
        this.f39589a = 13;
        this.f39591c = new C3275kv(0);
        this.f39590b = executorService;
    }

    public fs6(Context context, String str, String str2) {
        this.f39589a = 22;
        if (str != null) {
            this.f39591c = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f39590b = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f39590b = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        C3386nv.m17626m("keysetName cannot be null");
        throw null;
    }

    public fs6(fk7 fk7Var) {
        this.f39589a = 9;
        this.f39590b = new HashMap(fk7Var.f39225a);
        this.f39591c = new HashMap(fk7Var.f39226b);
    }

    public fs6(uo7 uo7Var) {
        this.f39589a = 6;
        this.f39591c = Collections.synchronizedMap(new HashMap());
        this.f39590b = uo7Var;
    }

    public fs6(int i, C3126ix c3126ix) {
        this.f39589a = 12;
        this.f39590b = c3126ix;
        this.f39591c = new s18(i, this);
    }

    public fs6(d54 d54Var) {
        this.f39589a = 27;
        this.f39590b = d54Var;
        this.f39591c = new Object();
    }

    public fs6(C1150a c1150a, C1149a c1149a) {
        this.f39589a = 21;
        this.f39591c = c1150a;
        this.f39590b = c1149a;
    }

    public fs6(MainActivity mainActivity) {
        this.f39589a = 25;
        this.f39590b = mainActivity;
        this.f39591c = new ij6(29);
    }
}
