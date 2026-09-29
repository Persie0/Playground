package p225kk;

import android.content.Context;
import android.content.SharedPreferences;
import com.kochava.core.BuildConfig;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import tk.C9312p;

/* JADX INFO: renamed from: kk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6704a {

    /* JADX INFO: renamed from: a */
    public final C4955q f37890a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f37891b;

    public C6704a(Context context, C4955q c4955q) {
        this.f37890a = c4955q;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.linguist_settings_utils", 0);
        C5207g.m11110e(sharedPreferences, "context.getSharedPrefere…ENCES_NAME, MODE_PRIVATE)");
        this.f37891b = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final String m13299a() {
        String string = this.f37891b.getString("analytics_test_23_05_08", "");
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: b */
    public final TooltipStep m13300b() {
        C4955q c4955q = this.f37890a;
        AbstractC4949k abstractC4949kM10563a = c4955q.m10563a(TooltipStep.class);
        AbstractC4949k abstractC4949kM10563a2 = c4955q.m10563a(TooltipStep.class);
        TooltipStep tooltipStep = TooltipStep.Start;
        String string = this.f37891b.getString("tooltips_current_step_7", abstractC4949kM10563a2.m10535e(tooltipStep));
        if (string == null) {
            string = c4955q.m10563a(TooltipStep.class).m10535e(tooltipStep);
        }
        TooltipStep tooltipStep2 = (TooltipStep) abstractC4949kM10563a.m10532b(string);
        return tooltipStep2 == null ? tooltipStep : tooltipStep2;
    }

    /* JADX INFO: renamed from: c */
    public final int m13301c() {
        return this.f37891b.getInt("times_rate_shown2", 0);
    }

    /* JADX INFO: renamed from: d */
    public final List<TooltipStep> m13302d() {
        AbstractC4949k abstractC4949kM10564b = this.f37890a.m10564b(C9312p.m17659d(List.class, TooltipStep.class));
        SharedPreferences sharedPreferences = this.f37891b;
        String str = BuildConfig.SDK_PERMISSIONS;
        String string = sharedPreferences.getString("tooltips_steps_7", str);
        if (string != null) {
            str = string;
        }
        List<TooltipStep> list = (List) abstractC4949kM10564b.m10532b(str);
        if (list == null) {
            list = EmptyList.f38032a;
        }
        return list;
    }

    /* JADX INFO: renamed from: e */
    public final void m13303e(String str) {
        C5207g.m11111f(str, "value");
        this.f37891b.edit().putString("analytics_test_23_05_08", str).apply();
    }

    /* JADX INFO: renamed from: f */
    public final void m13304f(int i10) {
        this.f37891b.edit().putInt("currentCourse", i10).apply();
    }

    /* JADX INFO: renamed from: g */
    public final void m13305g(String str) {
        this.f37891b.edit().putString("currentCourseTitle", str).apply();
    }

    /* JADX INFO: renamed from: h */
    public final void m13306h(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f37891b.edit().putString("tooltips_current_step_7", this.f37890a.m10563a(TooltipStep.class).m10535e(tooltipStep)).apply();
    }

    /* JADX INFO: renamed from: i */
    public final void m13307i(int i10) {
        this.f37891b.edit().putInt("currentTrack", i10).apply();
    }

    /* JADX INFO: renamed from: j */
    public final void m13308j(String str) {
        C5207g.m11111f(str, "value");
        this.f37891b.edit().putString("deeplinkURL", str).apply();
    }

    /* JADX INFO: renamed from: k */
    public final void m13309k(int i10) {
        this.f37891b.edit().putInt("lessonTrack", i10).apply();
    }

    /* JADX INFO: renamed from: l */
    public final void m13310l(String str) {
        this.f37891b.edit().putString("registerData2", str).apply();
    }

    /* JADX INFO: renamed from: m */
    public final void m13311m(Set<String> set) {
        C5207g.m11111f(set, "value");
        this.f37891b.edit().putStringSet("termsStudyReview", set).apply();
    }

    /* JADX INFO: renamed from: n */
    public final void m13312n(List<? extends TooltipStep> list) {
        C5207g.m11111f(list, "steps");
        this.f37891b.edit().putString("tooltips_steps_7", this.f37890a.m10564b(C9312p.m17659d(List.class, TooltipStep.class)).m10535e(list)).apply();
    }
}
