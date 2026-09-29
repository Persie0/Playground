package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.lingq.core.common.util.LqAnalyticsVariant;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* JADX INFO: renamed from: qs */
/* JADX INFO: loaded from: classes.dex */
public final class C3509qs {
    public static final C3471ps Companion = new C3471ps();

    /* JADX INFO: renamed from: a */
    public final df4 f58117a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f58118b;

    public C3509qs(Context context, df4 df4Var) {
        this.f58117a = df4Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.linguist_settings_utils", 0);
        sharedPreferences.getClass();
        this.f58118b = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final List m20127a() {
        String string = this.f58118b.getString("tooltips_steps_7", "[]");
        return (List) this.f58117a.m10321a(string != null ? string : "[]", new C2978ev(new zs2("com.lingq.core.domain.model.onboarding.TooltipStep", TooltipStep.values())));
    }

    /* JADX INFO: renamed from: b */
    public final List m20128b() {
        Set<String> stringSet = this.f58118b.getStringSet("trackRemovedEmbeddedMessages", EmptySet.f47640a);
        return stringSet != null ? u91.m22622n1(stringSet) : EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: c */
    public final int m20129c() {
        return this.f58118b.getInt("tutorial_lingqs", 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m20130d() {
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putInt("currentCourse", 0);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m20131e() {
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putString("currentCourseTitle", "");
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: f */
    public final void m20132f(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putString("tooltips_current_step_7", this.f58117a.m10322b(new zs2("com.lingq.core.domain.model.onboarding.TooltipStep", TooltipStep.values()), tooltipStep));
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: g */
    public final void m20133g() {
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putInt("currentTrack", 0);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: h */
    public final void m20134h(String str) {
        str.getClass();
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putString("deeplinkURL", str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: i */
    public final void m20135i() {
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putInt("lessonTrack", 0);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: j */
    public final void m20136j(int i) {
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putInt("lessonsCompleted", i);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: k */
    public final void m20137k(LqAnalyticsVariant lqAnalyticsVariant) {
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putString("onboarding_trial_promotion_variant", this.f58117a.m10322b(thb.m22059r(LqAnalyticsVariant.Companion.serializer()), lqAnalyticsVariant));
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: l */
    public final void m20138l(String str) {
        str.getClass();
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putString("registerData2", str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: m */
    public final void m20139m(List list) {
        SharedPreferences.Editor editorEdit = this.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putString("tooltips_steps_7", this.f58117a.m10322b(new C2978ev(new zs2("com.lingq.core.domain.model.onboarding.TooltipStep", TooltipStep.values())), list));
        editorEdit.apply();
    }
}
