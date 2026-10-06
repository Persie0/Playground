package p000;

import android.content.Context;
import android.view.View;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afk {
    /* JADX INFO: renamed from: a */
    public static int m509a(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: b */
    static int m510b(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: c */
    static View m511c(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* JADX INFO: renamed from: d */
    static void m512d(View view, Collection collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* JADX INFO: renamed from: e */
    static void m513e(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: f */
    static void m514f(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* JADX INFO: renamed from: g */
    public static void m515g(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* JADX INFO: renamed from: h */
    static void m516h(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* JADX INFO: renamed from: i */
    static void m517i(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* JADX INFO: renamed from: j */
    static void m518j(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: k */
    static boolean m519k(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: l */
    static boolean m520l(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: m */
    static boolean m521m(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: n */
    static boolean m522n(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: o */
    static boolean m523o(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: p */
    public static final aqr m524p(Context context, String str, aqq aqqVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException(PMZiHihxLGEy.pytSXSumGqnx);
        }
        return new aqr(context, str, aqqVar, z, z2);
    }
}
