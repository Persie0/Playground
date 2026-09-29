package p000;

import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.sqlite.driver.C0763a;
import com.android.billingclient.api.Purchase;
import com.iterable.iterableapi.C1210f;
import com.iterable.iterableapi.C1212h;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LanguageLevels;
import com.lingq.core.analytics.data.LqAnalyticsValues$OnboardingSurveyQuestion;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.feature.onboarding.p014v2.OnboardingPage;
import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import com.lingq.feature.onboarding.p014v2.OnboardingYesNoQuestion;
import com.lingq.p020ui.C2889e;
import com.lingq.p020ui.MainActivity;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class cc4 implements ub4, am0, m98, xl0, bm7, psa, eg7, ck8 {

    /* JADX INFO: renamed from: a */
    public Object f9881a;

    public cc4(int i) {
        switch (i) {
            case 14:
                this.f9881a = new s46(14);
                break;
            case 15:
                this.f9881a = new xe1();
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                this.f9881a = new Region();
                break;
            default:
                ip5 ip5Var = new ip5();
                this.f9881a = ip5Var;
                if (!ip5Var.f44396b) {
                    if (ip5Var.f44397c) {
                        ii7.m13939a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ip5Var.m14063a();
                    ip5Var.f44397c = true;
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m4504A(LqAnalyticsValues$OnboardingSurveyQuestion lqAnalyticsValues$OnboardingSurveyQuestion, OnboardingYesNoQuestion onboardingYesNoQuestion, OnboardingSelections onboardingSelections) {
        Boolean bool = (Boolean) onboardingSelections.f27303o.get(onboardingYesNoQuestion.getSlug());
        if (bool != null) {
            m4524z(lqAnalyticsValues$OnboardingSurveyQuestion, bool.booleanValue() ? "yes" : "no");
        }
    }

    /* JADX INFO: renamed from: B */
    public void m4505B(j84 j84Var) {
        ((Region) this.f9881a).set(j84Var.f45185a, j84Var.f45186b, j84Var.f45187c, j84Var.f45188d);
    }

    @Override // p000.ub4
    /* JADX INFO: renamed from: a */
    public void mo4506a(String str) {
        C1210f c1210f = (C1210f) this.f9881a;
        if (str == null || str.isEmpty()) {
            c1210f.m6916h();
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("inAppMessages");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    C1212h c1212hM6921d = C1212h.m6921d(jSONArrayOptJSONArray.optJSONObject(i), null);
                    if (c1212hM6921d != null) {
                        arrayList.add(c1212hM6921d);
                    }
                }
                C1210f.m6911c(c1210f, arrayList);
                c1210f.f14022i = System.currentTimeMillis();
            }
        } catch (JSONException e) {
            eh0.m11135p("IterableInAppManager", e.toString());
        }
    }

    @Override // p000.eg7
    /* JADX INFO: renamed from: b */
    public long mo505b(float f, float f2) {
        long jM22287b = ts5.m22287b((float[]) this.f9881a, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        return i73.m13710a(Float.intBitsToFloat((int) (jM22287b >> 32)), Float.intBitsToFloat((int) (jM22287b & 4294967295L)));
    }

    /* JADX INFO: renamed from: c */
    public void m4507c(int i, boolean z) {
        xe1 xe1Var = (xe1) this.f9881a;
        if (z) {
            xe1Var.m24468a(i);
        } else {
            xe1Var.getClass();
        }
    }

    /* JADX INFO: renamed from: d */
    public fn1 m4508d(fn1 fn1Var) {
        return fn1Var instanceof p48 ? fn1Var : new C3176k9(-((fs5) this.f9881a).m12068l(), fn1Var);
    }

    /* JADX INFO: renamed from: e */
    public String m4509e(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            of4 of4Var = (of4) this.f9881a;
            pg4 pg4Var = new pg4(stringWriter, of4Var.f54269a, of4Var.f54270b, of4Var.f54271c, of4Var.f54272d);
            pg4Var.m19126h(obj);
            pg4Var.m19128j();
            pg4Var.f56126b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: f */
    public int mo4510f(View view) {
        return y28.m24873A(view) - ((ViewGroup.MarginLayoutParams) ((z28) view.getLayoutParams())).leftMargin;
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: g */
    public Type mo3354g() {
        return (Type) this.f9881a;
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: h */
    public Object mo3355h(br6 br6Var) {
        return new ok6(br6Var, (Type) this.f9881a);
    }

    @Override // p000.bm7
    /* JADX INFO: renamed from: i */
    public void mo3877i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.bm7
    /* JADX INFO: renamed from: j */
    public void mo3878j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f9881a).setResultCode(i);
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: k */
    public int mo4511k() {
        return ((y28) this.f9881a).m24891H();
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: l */
    public void mo553l(ul0 ul0Var, i88 i88Var) {
        sm0 sm0Var = (sm0) this.f9881a;
        if (!i88Var.f43689a.f45200L) {
            sm0Var.resumeWith(new Result.Failure(new HttpException(i88Var)));
            return;
        }
        Object obj = i88Var.f43690b;
        if (obj != null) {
            sm0Var.resumeWith(obj);
            return;
        }
        co7 co7VarMo4147Z = ul0Var.mo4147Z();
        co7VarMo4147Z.getClass();
        z21 z21VarM24933a = y38.m24933a(sa4.class);
        Class cls = z21VarM24933a.f70781a;
        cls.getClass();
        Object objCast = cls.cast(((pk9) co7VarMo4147Z.f10363f).mo16143n(z21VarM24933a));
        objCast.getClass();
        sa4 sa4Var = (sa4) objCast;
        sm0Var.resumeWith(new Result.Failure(new KotlinNullPointerException("Response from " + sa4Var.f60584a.getName() + '.' + sa4Var.f60586c.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // p000.ck8
    /* JADX INFO: renamed from: m */
    public bk8 mo4512m(String str) {
        str.getClass();
        yn9 yn9Var = (yn9) this.f9881a;
        String databaseName = yn9Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                C3386nv.m17624j(wq1.m24118n("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !vk9.m23369E0('/', databaseName, databaseName).equals(vk9.m23369E0('/', str, str))) {
            ij6.m13956n("This driver is configured to open a database named '", yn9Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new C0763a(yn9Var.mo397I());
    }

    /* JADX INFO: renamed from: n */
    public c83 m4513n(int i) {
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((q05) ((C1295k) ((d65) this.f9881a)).f16498b).f57071K, false, new String[]{"LessonBookmarkEntity"}, new mv0(i, 9)));
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: o */
    public int mo4514o() {
        y28 y28Var = (y28) this.f9881a;
        return y28Var.f69184n - y28Var.m24893I();
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: p */
    public void mo554p(ul0 ul0Var, Throwable th) {
        ((sm0) this.f9881a).resumeWith(new Result.Failure(th));
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: q */
    public View mo4515q(int i) {
        return ((y28) this.f9881a).m24904u(i);
    }

    @Override // p000.ck8
    /* JADX INFO: renamed from: r */
    public boolean mo4516r() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m4517s(int i) {
        if (i < 0) {
            return false;
        }
        C3047gq c3047gq = (C3047gq) this.f9881a;
        if (i >= c3047gq.f41171b) {
            return false;
        }
        x94 x94VarM12804h = c3047gq.m12804h(i);
        vi3 vi3Var = ((sv4) x94VarM12804h.f67974c).f61483c;
        return vi3Var != null && vi3Var.invoke(Integer.valueOf(i - x94VarM12804h.f67972a)) == e41.f36683h;
    }

    @Override // p000.psa
    /* JADX INFO: renamed from: t */
    public int mo4518t(View view) {
        return y28.m24876D(view) + ((ViewGroup.MarginLayoutParams) ((z28) view.getLayoutParams())).rightMargin;
    }

    /* JADX INFO: renamed from: u */
    public void m4519u(Exception exc) {
        ss5.m21724v("MediaCodecAudioRenderer", "Audio sink error", exc);
        C3165jz c3165jz = ((tt5) this.f9881a).f62846d1;
        Handler handler = c3165jz.f46413a;
        if (handler != null) {
            handler.post(new RunnableC2908cz(c3165jz, exc, 1));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m4520v(List list) {
        MainActivity mainActivity = (MainActivity) this.f9881a;
        list.getClass();
        if (list.isEmpty()) {
            int i = MainActivity.f33994m0;
            mainActivity.m9802q().mo8567c0(null);
            return;
        }
        Purchase purchase = (Purchase) list.get(0);
        if (purchase.f11296c.optInt("purchaseState", 1) != 4 && !purchase.f11296c.optBoolean("acknowledged", true)) {
            int i2 = MainActivity.f33994m0;
            C2889e c2889eM9802q = mainActivity.m9802q();
            c2889eM9802q.f34201c.mo8573o(purchase, q4d.m19655a(purchase));
        }
        int i3 = MainActivity.f33994m0;
        mainActivity.m9802q().mo8567c0(purchase);
    }

    /* JADX INFO: renamed from: w */
    public void m4521w(List list) {
        MainActivity mainActivity = (MainActivity) this.f9881a;
        list.getClass();
        if (list.isEmpty()) {
            int i = MainActivity.f33994m0;
            mainActivity.m9802q().mo8567c0(null);
            return;
        }
        Purchase purchase = (Purchase) u91.m22589G0(list);
        int i2 = MainActivity.f33994m0;
        mainActivity.m9802q().mo8567c0(purchase);
        if (purchase.f11296c.optInt("purchaseState", 1) == 4 || !purchase.f11296c.optBoolean("acknowledged", true)) {
            m4520v(list);
            return;
        }
        C2889e c2889eM9802q = mainActivity.m9802q();
        String strM5177b = purchase.m5177b();
        strM5177b.getClass();
        c2889eM9802q.getClass();
        c2889eM9802q.f34201c.mo8560R0(strM5177b);
    }

    /* JADX INFO: renamed from: x */
    public void m4522x(LqAnalyticsValues$OnboardingSurveyQuestion lqAnalyticsValues$OnboardingSurveyQuestion, String str) {
        if (str.length() > 0) {
            m4524z(lqAnalyticsValues$OnboardingSurveyQuestion, str);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m4523y(OnboardingPage onboardingPage, OnboardingSelections onboardingSelections) {
        String value;
        onboardingPage.getClass();
        onboardingSelections.getClass();
        String str = onboardingSelections.f27289a;
        String str2 = onboardingSelections.f27292d;
        Set set = onboardingSelections.f27295g;
        String str3 = onboardingSelections.f27290b;
        Set set2 = onboardingSelections.f27293e;
        int[] iArr = a28.f128a;
        int i = iArr[onboardingPage.ordinal()];
        if (i == 1) {
            m4522x(LqAnalyticsValues$OnboardingSurveyQuestion.Motivation, onboardingSelections.f27291c);
        } else if (i != 2) {
            if (i == 3) {
                m4522x(LqAnalyticsValues$OnboardingSurveyQuestion.Confidence, onboardingSelections.f27294f);
            } else if (i == 4) {
                m4522x(LqAnalyticsValues$OnboardingSurveyQuestion.LearningStyle, onboardingSelections.f27297i);
            }
        } else if (!set2.isEmpty()) {
            m4524z(LqAnalyticsValues$OnboardingSurveyQuestion.SkillsDesired, u91.m22596N0(set2, ",", null, null, null, 62));
        }
        switch (iArr[onboardingPage.ordinal()]) {
            case 5:
                m4522x(LqAnalyticsValues$OnboardingSurveyQuestion.Age, onboardingSelections.f27299k);
                break;
            case 6:
                m4524z(LqAnalyticsValues$OnboardingSurveyQuestion.Name, null);
                break;
            case 7:
                m4522x(LqAnalyticsValues$OnboardingSurveyQuestion.LifeEvent, onboardingSelections.f27301m);
                break;
            case 8:
                m4522x(LqAnalyticsValues$OnboardingSurveyQuestion.Where, onboardingSelections.f27302n);
                break;
            case 9:
                m4522x(LqAnalyticsValues$OnboardingSurveyQuestion.Familiarity, onboardingSelections.f27304p);
                break;
            case 10:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.FirstTime, OnboardingYesNoQuestion.FirstTime, onboardingSelections);
                break;
            case 11:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.KnowAFewWords, OnboardingYesNoQuestion.KnowAFewWords, onboardingSelections);
                break;
            case 12:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.TriedReadingListening, OnboardingYesNoQuestion.TriedReadingListening, onboardingSelections);
                break;
            case 13:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.UnderstandSimpleConversations, OnboardingYesNoQuestion.UnderstandSimpleConversations, onboardingSelections);
                break;
            case 14:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.ConversationsFamiliarTopics, OnboardingYesNoQuestion.ConversationsFamiliarTopics, onboardingSelections);
                break;
            case 15:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.UnderstandArticlesMainIdea, OnboardingYesNoQuestion.UnderstandArticlesMainIdea, onboardingSelections);
                break;
            case 16:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.FollowNativeSpeakers, OnboardingYesNoQuestion.FollowNativeSpeakers, onboardingSelections);
                break;
            case 17:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.ShowsSlangAccentsChallenge, OnboardingYesNoQuestion.ShowsSlangAccentsChallenge, onboardingSelections);
                break;
            case 18:
                m4504A(LqAnalyticsValues$OnboardingSurveyQuestion.UnderstandComplexArticles, OnboardingYesNoQuestion.UnderstandComplexArticles, onboardingSelections);
                break;
        }
        hm5 hm5Var = (hm5) this.f9881a;
        switch (iArr[onboardingPage.ordinal()]) {
            case 19:
                ((C1240a) hm5Var).m7025f("registration signup started", null);
                break;
            case 20:
                if (str.length() > 0) {
                    ((C1240a) hm5Var).m7025f("registration language selected", g9a.m12429f("Registration language", str));
                }
                break;
            case 21:
                if (str2.length() > 0) {
                    Bundle bundle = new Bundle();
                    if (str2.equals(LearningLevel.Beginner1.getServerName())) {
                        value = LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                    } else if (str2.equals(LearningLevel.Intermediate1.getServerName())) {
                        value = LqAnalyticsValues$LanguageLevels.Intermediate1.getValue();
                    } else {
                        value = str2.equals(LearningLevel.Advanced1.getServerName()) ? LqAnalyticsValues$LanguageLevels.Advanced1.getValue() : LqAnalyticsValues$LanguageLevels.Beginner1.getValue();
                    }
                    bundle.putString("Registration level", value);
                    ((C1240a) hm5Var).m7025f("registration level selected", bundle);
                }
                break;
            case 22:
                if (!set.isEmpty()) {
                    Bundle bundle2 = new Bundle();
                    FeedTopic.Companion.getClass();
                    bundle2.putStringArray("Registration topics", (String[]) q13.m19597a(set).toArray(new String[0]));
                    ((C1240a) hm5Var).m7025f("registration topics selected", bundle2);
                }
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                String str4 = cx6.f34684c;
                if (str4.length() > 0) {
                    Bundle bundle3 = new Bundle();
                    int i2 = 50;
                    switch (str4.hashCode()) {
                        case -1367558293:
                            str4.equals("casual");
                            break;
                        case -1183796438:
                            if (str4.equals("insane")) {
                                i2 = 400;
                            }
                            break;
                        case -892381166:
                            if (str4.equals("steady")) {
                                i2 = 100;
                            }
                            break;
                        case 1958059306:
                            if (str4.equals("intense")) {
                                i2 = 200;
                            }
                            break;
                    }
                    bundle3.putInt("Registration daily goal", i2);
                    ((C1240a) hm5Var).m7025f("registration daily goal selected", bundle3);
                }
                break;
            case 24:
                if (str3.length() > 0) {
                    ((C1240a) hm5Var).m7025f("registration dictionary language selected", g9a.m12429f("dictionary language", str3));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m4524z(LqAnalyticsValues$OnboardingSurveyQuestion lqAnalyticsValues$OnboardingSurveyQuestion, String str) {
        lqAnalyticsValues$OnboardingSurveyQuestion.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("survey question", lqAnalyticsValues$OnboardingSurveyQuestion.getValue());
        if (str != null) {
            bundle.putString("response", str);
        }
        ((C1240a) ((hm5) this.f9881a)).m7025f("onboarding survey answered", bundle);
    }

    public cc4(d65 d65Var) {
        d65Var.getClass();
        this.f9881a = d65Var;
    }

    public cc4(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            od9 od9Var = new od9(view);
            od9Var.f54228b = view;
            this.f9881a = od9Var;
            return;
        }
        this.f9881a = new or3(view);
    }

    public cc4(WindowInsetsController windowInsetsController) {
        od9 od9Var = new od9(null);
        od9Var.f54229c = windowInsetsController;
        this.f9881a = od9Var;
    }

    public /* synthetic */ cc4(Object obj) {
        this.f9881a = obj;
    }
}
