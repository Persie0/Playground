package p024b3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5212l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import p426v2.C9630d;

/* JADX INFO: renamed from: b3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1304k {

    /* JADX INFO: renamed from: b3.k$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m4833a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* JADX INFO: renamed from: b */
        public static int m4834b(TextView textView) {
            return textView.getMaxLines();
        }

        /* JADX INFO: renamed from: c */
        public static int m4835c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* JADX INFO: renamed from: b3.k$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Drawable[] m4836a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* JADX INFO: renamed from: b */
        public static int m4837b(View view) {
            return view.getLayoutDirection();
        }

        /* JADX INFO: renamed from: c */
        public static int m4838c(View view) {
            return view.getTextDirection();
        }

        /* JADX INFO: renamed from: d */
        public static Locale m4839d(TextView textView) {
            return textView.getTextLocale();
        }

        /* JADX INFO: renamed from: e */
        public static void m4840e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* JADX INFO: renamed from: f */
        public static void m4841f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: g */
        public static void m4842g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* JADX INFO: renamed from: h */
        public static void m4843h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* JADX INFO: renamed from: b3.k$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static int m4844a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* JADX INFO: renamed from: b */
        public static ColorStateList m4845b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* JADX INFO: renamed from: c */
        public static PorterDuff.Mode m4846c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* JADX INFO: renamed from: d */
        public static int m4847d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* JADX INFO: renamed from: e */
        public static void m4848e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        /* JADX INFO: renamed from: f */
        public static void m4849f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* JADX INFO: renamed from: g */
        public static void m4850g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* JADX INFO: renamed from: h */
        public static void m4851h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* JADX INFO: renamed from: b3.k$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static DecimalFormatSymbols m4852a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: renamed from: b3.k$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static int m4853a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        /* JADX INFO: renamed from: b */
        public static int m4854b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        /* JADX INFO: renamed from: c */
        public static int m4855c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* JADX INFO: renamed from: d */
        public static int[] m4856d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        /* JADX INFO: renamed from: e */
        public static int m4857e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        /* JADX INFO: renamed from: f */
        public static void m4858f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: g */
        public static void m4859g(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        /* JADX INFO: renamed from: h */
        public static void m4860h(TextView textView, int i10) {
            textView.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX INFO: renamed from: b3.k$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static String[] m4861a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* JADX INFO: renamed from: b */
        public static PrecomputedText.Params m4862b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* JADX INFO: renamed from: c */
        public static void m4863c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: renamed from: b3.k$g */
    public static class g implements ActionMode.Callback {

        /* JADX INFO: renamed from: a */
        public final ActionMode.Callback f8037a;

        /* JADX INFO: renamed from: b */
        public final TextView f8038b;

        /* JADX INFO: renamed from: c */
        public Class<?> f8039c;

        /* JADX INFO: renamed from: d */
        public Method f8040d;

        /* JADX INFO: renamed from: e */
        public boolean f8041e;

        /* JADX INFO: renamed from: f */
        public boolean f8042f = false;

        public g(ActionMode.Callback callback, TextView textView) {
            this.f8037a = callback;
            this.f8038b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f8037a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f8037a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f8037a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            boolean z10;
            String str;
            TextView textView = this.f8038b;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f8042f) {
                this.f8042f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f8039c = cls;
                    this.f8040d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f8041e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f8039c = null;
                    this.f8040d = null;
                    this.f8041e = false;
                }
            }
            try {
                Method declaredMethod = (this.f8041e && this.f8039c.isInstance(menu)) ? this.f8040d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            z10 = true;
                        } else {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i10);
                    MenuItem menuItemAdd = menu.add(0, 0, i10 + 100, resolveInfo2.loadLabel(packageManager));
                    Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f8037a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C9630d.a m4826a(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new C9630d.a(f.m4862b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iM4844a = c.m4844a(textView);
        int iM4847d = c.m4847d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z10 = true;
            if (i10 < 28 || (textView.getInputType() & 15) != 3) {
                if (b.m4837b(textView) != 1) {
                    z10 = false;
                }
                switch (b.m4838c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        textDirectionHeuristic = !z10 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(f.m4861a(d.m4852a(b.m4839d(textView)))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C9630d.a(textPaint, textDirectionHeuristic, iM4844a, iM4847d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m4827b(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.m4860h(textView, i10);
        } else if (textView instanceof InterfaceC1295b) {
            ((InterfaceC1295b) textView).setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4828c(TextView textView, int i10) {
        C5212l.m11131B(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            f.m4863c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.m4833a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4829d(TextView textView, int i10) {
        C5212l.m11131B(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.m4833a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static void m4830e(TextView textView, C9630d c9630d) {
        if (Build.VERSION.SDK_INT >= 29) {
            c9630d.getClass();
            textView.setText((CharSequence) null);
        } else {
            C9630d.a aVarM4826a = m4826a(textView);
            c9630d.getClass();
            aVarM4826a.m18105a(null);
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ActionMode.Callback m4831f(ActionMode.Callback callback) {
        ActionMode.Callback callback2 = callback;
        if (callback2 instanceof g) {
            callback2 = ((g) callback2).f8037a;
        }
        return callback2;
    }

    /* JADX INFO: renamed from: g */
    public static ActionMode.Callback m4832g(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof g) || callback == null) ? callback : new g(callback, textView);
    }
}
