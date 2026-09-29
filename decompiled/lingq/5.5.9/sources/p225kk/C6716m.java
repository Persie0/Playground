package p225kk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.lingq.p055ui.onboarding.WebActivity;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kh.ApplicationC6674a;
import kotlin.text.C7076b;
import p024b3.C1299f;
import p096ei.C5408a;
import p254m2.C7472a;
import p260m8.C7499b;
import p266n.C7667d;
import p385sf.C9000b;

/* JADX INFO: renamed from: kk.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6716m {

    /* JADX INFO: renamed from: a */
    public static final List<Integer> f37937a = C9000b.m17252r(12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35);

    /* JADX INFO: renamed from: b */
    public static final List<Double> f37938b = C9000b.m17252r(Double.valueOf(0.5d), Double.valueOf(0.65d), Double.valueOf(0.85d), Double.valueOf(1.0d), Double.valueOf(1.25d), Double.valueOf(1.5d), Double.valueOf(1.75d), Double.valueOf(2.0d), Double.valueOf(2.25d), Double.valueOf(2.5d), Double.valueOf(2.75d), Double.valueOf(3.0d));

    /* JADX INFO: renamed from: kk.m$a */
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f37939a;

        public a(Context context) {
            this.f37939a = context;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            C5207g.m11111f(view, "widget");
            view.invalidate();
            List<Integer> list = C6716m.f37937a;
            C6716m.m13328m(this.f37939a, "https://www.lingq.com/terms/", Integer.valueOf(R.string.welcome_by_using_lingq_substring_terms_of_service));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            C5207g.m11111f(textPaint, "ds");
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: kk.m$b */
    public static final class b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f37940a;

        public b(Context context) {
            this.f37940a = context;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            C5207g.m11111f(view, "widget");
            view.invalidate();
            List<Integer> list = C6716m.f37937a;
            C6716m.m13328m(this.f37940a, "https://www.lingq.com/privacy/", Integer.valueOf(R.string.welcome_by_using_lingq_substring_privacy_policy));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            C5207g.m11111f(textPaint, "ds");
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m13316a(int i10) {
        Resources resources;
        float f3 = i10;
        ApplicationC6674a applicationC6674a = ApplicationC6674a.f37760e;
        return TypedValue.applyDimension(1, f3, (applicationC6674a == null || (resources = applicationC6674a.getResources()) == null) ? null : resources.getDisplayMetrics());
    }

    /* JADX INFO: renamed from: b */
    public static String m13317b(long j10) {
        if (j10 == 0) {
            return "";
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j10);
        long j11 = 60;
        long j12 = (seconds % ((long) 3600)) / j11;
        long j13 = seconds % j11;
        if (timeUnit.toHours(j10) != 0) {
            return m13318c(j10);
        }
        return C0141b.m613i(new Object[]{Long.valueOf(j12), Long.valueOf(j13)}, 2, Locale.getDefault(), "%02d:%02d min", "format(locale, format, *args)");
    }

    /* JADX INFO: renamed from: c */
    public static String m13318c(long j10) {
        if (j10 == 0) {
            return "";
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j10);
        long j11 = 3600;
        long j12 = 60;
        return C0141b.m613i(new Object[]{Long.valueOf(seconds / j11), Long.valueOf((seconds % j11) / j12), Long.valueOf(seconds % j12)}, 3, Locale.getDefault(), "%02d:%02d:%02d", "format(locale, format, *args)");
    }

    /* JADX INFO: renamed from: d */
    public static String m13319d(int i10, Context context) {
        C5207g.m11108c(context);
        String string = context.getString(i10);
        C5207g.m11110e(string, "context!!.getString(resId)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX INFO: renamed from: e */
    public static String m13320e(int i10, Fragment fragment) {
        boolean z10;
        if (fragment != null && fragment.m3582e() != null) {
            ActivityC0979t activityC0979tM3582e = fragment.m3582e();
            if (activityC0979tM3582e != null) {
                z10 = true;
                if (!activityC0979tM3582e.isFinishing()) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && fragment.m3557B() && fragment.m3604y()) {
                String strM3600t = fragment.m3600t(i10);
                C5207g.m11110e(strM3600t, "{\n            fragment.getString(resId)\n        }");
                return strM3600t;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f */
    public static void m13321f(Context context, View view) {
        C5207g.m11111f(view, "view");
        if (context != null) {
            Object systemService = context.getSystemService("input_method");
            C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static SpannableStringBuilder m13322g(String str, String... strArr) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(strArr, "params");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (strArr.length == 0) {
            return spannableStringBuilder;
        }
        for (String str2 : strArr) {
            StyleSpan styleSpan = new StyleSpan(1);
            int iM14285e3 = C7076b.m14285e3(str, str2, 0, false, 6);
            int length = str2.length() + iM14285e3;
            if (iM14285e3 > 0 && iM14285e3 < spannableStringBuilder.length() && length > 0 && length < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(styleSpan, iM14285e3, length, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: h */
    public static void m13323h(Context context, int i10, ImageButton imageButton) {
        if (i10 == CardStatus.Ignored.getValue()) {
            Object obj = C7472a.f41322a;
            imageButton.setImageDrawable(C7472a.c.m14849b(context, R.drawable.ic_trash));
        } else if (i10 == CardStatus.Known.getValue()) {
            Object obj2 = C7472a.f41322a;
            imageButton.setImageDrawable(C7472a.c.m14849b(context, R.drawable.ic_check_thick));
        }
        C1299f.m4817c(imageButton, ColorStateList.valueOf(m13333r(R.attr.primaryTextColor, context)));
    }

    /* JADX INFO: renamed from: i */
    public static void m13324i(TextView textView, int i10) {
        if (i10 == CardStatus.New.getValue()) {
            textView.setText("1");
            return;
        }
        if (i10 == CardStatus.Recognized.getValue()) {
            textView.setText("2");
        } else if (i10 == CardStatus.Familiar.getValue()) {
            textView.setText("3");
        } else if (i10 == CardStatus.Learned.getValue()) {
            textView.setText("4");
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m13325j(ImageView imageView, int i10) {
        if (i10 != 0) {
            ComponentCallbacks2C2080b.m6238e(imageView.getContext()).m6258n(Integer.valueOf(i10)).m12716c().m6245E(imageView);
        } else {
            ComponentCallbacks2C2080b.m6238e(imageView.getContext()).m6258n(Integer.valueOf(R.drawable.ic_none)).m12716c().m6245E(imageView);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m13326k(ImageView imageView, String str, float f3) {
        if (str == null || imageView == null) {
            return;
        }
        String str2 = "zh_t";
        if (C5207g.m11106a(str, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
            str = "zh_t";
        }
        if (!C5207g.m11106a(str, "zh-tw")) {
            str2 = str;
        }
        if (C5207g.m11106a(str2, "zh-cn")) {
            str2 = "zh";
        }
        int identifier = imageView.getContext().getResources().getIdentifier("ic_flag_".concat(str2), "drawable", imageView.getContext().getPackageName());
        if (identifier != 0) {
            C4924a.m10436O(imageView, Integer.valueOf(identifier), f3, null, 12);
        } else {
            ComponentCallbacks2C2080b.m6238e(imageView.getContext()).m6258n(Integer.valueOf(R.drawable.ic_none)).m12716c().m6245E(imageView);
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m13327l(String str) {
        C5207g.m11111f(str, "language");
        return !C7499b.m14921S(C5408a.m11569b(LanguageLearn.Arabic), C5408a.m11569b(LanguageLearn.Belarusian), C5408a.m11570c(LanguageLearnBeta.Bulgarian), C5408a.m11570c(LanguageLearnBeta.Catalan), C5408a.m11570c(LanguageLearnBeta.Croatian), C5408a.m11570c(LanguageLearnBeta.Czech), C5408a.m11570c(LanguageLearnBeta.Danish), C5408a.m11569b(LanguageLearn.Esperanto), C5408a.m11570c(LanguageLearnBeta.Finnish), C5408a.m11570c(LanguageLearnBeta.Hebrew), C5408a.m11570c(LanguageLearnBeta.Hungarian), C5408a.m11570c(LanguageLearnBeta.Indonesian), C5408a.m11569b(LanguageLearn.Latin), C5408a.m11570c(LanguageLearnBeta.Malay), C5408a.m11570c(LanguageLearnBeta.Norwegian), C5408a.m11570c(LanguageLearnBeta.Farsi), C5408a.m11570c(LanguageLearnBeta.Serbian), C5408a.m11570c(LanguageLearnBeta.Slovak), C5408a.m11570c(LanguageLearnBeta.Turkish), C5408a.m11569b(LanguageLearn.Greek), C5408a.m11570c(LanguageLearnBeta.Gujarati)).contains(str);
    }

    /* JADX INFO: renamed from: m */
    public static void m13328m(Context context, String str, Integer num) {
        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
        intent.putExtra("url", str);
        if (num != null) {
            num.intValue();
            intent.putExtra("title", m13319d(num.intValue(), context));
        }
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: n */
    public static void m13329n(Context context, String str, Integer num, NavController navController) {
        C5207g.m11111f(str, "url");
        try {
            if (C7076b.m14278X2(str, "lingq.com", false)) {
                if (navController == null) {
                    m13328m(context, str, num);
                    return;
                }
                String strM13319d = num == null ? null : m13319d(num.intValue(), context);
                NavDestination navDestinationM3986g = navController.m3986g();
                if (navDestinationM3986g == null || navDestinationM3986g.m4016i(R.id.actionToWeb) == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("url", str);
                bundle.putString("title", strM13319d);
                navController.m3992m(R.id.actionToWeb, bundle, null);
                return;
            }
            C7667d.b bVar = new C7667d.b();
            Object obj = C7472a.f41322a;
            Integer numValueOf = Integer.valueOf(C7472a.d.m14851a(context, R.color.indigo_dark) | (-16777216));
            Bundle bundle2 = new Bundle();
            if (numValueOf != null) {
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", numValueOf.intValue());
            }
            bVar.f42142c = bundle2;
            bVar.m15266b();
            bVar.f42140a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            Intent intent = bVar.m15265a().f42139a;
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            C5207g.m11110e(listQueryIntentActivities, "context.packageManager.q…      0\n                )");
            if (!(!listQueryIntentActivities.isEmpty())) {
                m13328m(context, str, num);
            } else {
                intent.setData(Uri.parse(str));
                C7472a.a.m14844b(context, intent, null);
            }
        } catch (ActivityNotFoundException unused) {
            m13328m(context, str, num);
        } catch (IllegalArgumentException unused2) {
            m13328m(context, str, num);
        } catch (Exception unused3) {
            Toast.makeText(context, "No browser installed.", 1).show();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13330o(Context context, String str, NavController navController, int i10) {
        if ((i10 & 8) != 0) {
            navController = null;
        }
        m13329n(context, str, null, navController);
    }

    /* JADX INFO: renamed from: p */
    public static float m13331p(int i10) {
        Resources resources;
        float f3 = i10;
        ApplicationC6674a applicationC6674a = ApplicationC6674a.f37760e;
        return TypedValue.applyDimension(2, f3, (applicationC6674a == null || (resources = applicationC6674a.getResources()) == null) ? null : resources.getDisplayMetrics());
    }

    /* JADX INFO: renamed from: q */
    public static SpannableString m13332q(Context context, String str) {
        StyleSpan styleSpan = new StyleSpan(1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        int iM14285e3 = C7076b.m14285e3(str, m13319d(R.string.welcome_by_using_lingq_substring_privacy_policy, context), 0, false, 6);
        int length = m13319d(R.string.welcome_by_using_lingq_substring_privacy_policy, context).length() + iM14285e3;
        int iM14285e4 = C7076b.m14285e3(str, m13319d(R.string.welcome_by_using_lingq_substring_terms_of_service, context), 0, false, 6);
        int length2 = m13319d(R.string.welcome_by_using_lingq_substring_terms_of_service, context).length() + iM14285e4;
        if (iM14285e4 >= 0 && iM14285e4 <= spannableStringBuilder.length() && length2 >= 0 && length2 <= spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(styleSpan, iM14285e4, length2, 33);
            spannableStringBuilder.setSpan(new a(context), iM14285e4, length2, 33);
        }
        StyleSpan styleSpan2 = new StyleSpan(1);
        if (iM14285e3 >= 0 && iM14285e3 <= spannableStringBuilder.length() && length >= 0 && length <= spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(styleSpan2, iM14285e3, length, 33);
            spannableStringBuilder.setSpan(new b(context), iM14285e3, length, 33);
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder);
        C5207g.m11110e(spannableStringValueOf, "valueOf(s)");
        return spannableStringValueOf;
    }

    /* JADX INFO: renamed from: r */
    public static int m13333r(int i10, Context context) {
        C5207g.m11111f(context, "<this>");
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        if (theme != null) {
            theme.resolveAttribute(i10, typedValue, true);
        }
        return typedValue.data;
    }
}
