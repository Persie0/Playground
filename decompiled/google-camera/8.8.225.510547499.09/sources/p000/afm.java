package p000;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class afm {
    /* JADX INFO: renamed from: a */
    static CharSequence m525a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: b */
    static Object m526b(View view, int i) {
        return view.requireViewById(i);
    }

    /* JADX INFO: renamed from: c */
    static void m527c(View view, final afp afpVar) {
        C1117xf c1117xf = (C1117xf) view.getTag(C0100R.id.tag_unhandled_key_listeners);
        if (c1117xf == null) {
            c1117xf = new C1117xf();
            view.setTag(C0100R.id.tag_unhandled_key_listeners, c1117xf);
        }
        afpVar.getClass();
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: afl
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return afpVar.m540a();
            }
        };
        c1117xf.put(afpVar, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: d */
    static void m528d(View view, afp afpVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1117xf c1117xf = (C1117xf) view.getTag(C0100R.id.tag_unhandled_key_listeners);
        if (c1117xf == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1117xf.get(afpVar)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: e */
    static void m529e(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: f */
    static void m530f(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: g */
    static void m531g(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: renamed from: h */
    static boolean m532h(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: i */
    static boolean m533i(View view) {
        return view.isScreenReaderFocusable();
    }
}
